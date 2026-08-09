/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed extends cq implements qi {
    private int field_j;
    private int field_k;
    static int field_i;

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7) {
        RuntimeException runtimeException = null;
        int var9_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var9_int = -48 / ((-58 - param0) / 45);
            this.field_g.a((jj) (this), -9135);
            jaggl.OpenGL.glPixelStorei(3314, param3);
            jaggl.OpenGL.glTexSubImage2Di(this.field_e, 0, param2, param6, param4, param5, 32993, this.field_g.field_Bc, param7, param1);
            jaggl.OpenGL.glPixelStorei(3314, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ed.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, byte[] param5, hd param6, int param7, int param8) {
        RuntimeException runtimeException = null;
        int var10_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_g.a((jj) (this), -9135);
            jaggl.OpenGL.glPixelStorei(3317, 1);
            var10_int = 49 % ((param4 - 67) / 37);
            jaggl.OpenGL.glPixelStorei(3314, param8);
            jaggl.OpenGL.glTexSubImage2Dub(this.field_e, 0, param7, param0, param1, param3, gq.a(param6, -29824), 5121, param5, param2);
            jaggl.OpenGL.glPixelStorei(3314, 0);
            jaggl.OpenGL.glPixelStorei(3317, 4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ed.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param6 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), stackIn_10_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(float[] param0, byte param1, int param2, int param3, int param4, int param5, int param6, hd param7, int param8) {
        RuntimeException runtimeException = null;
        int var10_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_g.a((jj) (this), -9135);
            var10_int = 25 % ((param1 - -57) / 57);
            jaggl.OpenGL.glPixelStorei(3314, param5);
            jaggl.OpenGL.glTexSubImage2Df(this.field_e, 0, param3, param2, param8, param6, gq.a(param7, -29824), 5121, param0, param4);
            jaggl.OpenGL.glPixelStorei(3314, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ed.T(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), stackIn_10_2 + ',' + param8 + ')');
        }
    }

    ed(jc param0, hd param1, int param2, int param3, boolean param4, byte[] param5, int param6, int param7) {
        super(param0, 3553, param1, la.field_h, param2 * param3, param4);
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  this.field_j = param2;
                  this.field_k = param3;
                  this.field_g.a((jj) (this), -9135);
                  jaggl.OpenGL.glPixelStorei(3317, 1);
                  if (!param4) {
                    break L3;
                  } else {
                    if (param7 != 0) {
                      break L3;
                    } else {
                      if (param6 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                jaggl.OpenGL.glPixelStorei(3314, param7);
                jaggl.OpenGL.glTexImage2Dub(this.field_e, 0, this.a(false), param2, param3, 0, gq.a(this.field_h, -29824), 5121, param5, param6);
                jaggl.OpenGL.glPixelStorei(3314, 0);
                if (!AceOfSkies.field_G) {
                  break L1;
                } else {
                  break L2;
                }
              }
              this.a(this.field_e, param3, param5, param2, (byte) 107);
              break L1;
            }
            jaggl.OpenGL.glPixelStorei(3317, 4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var9 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var9);

            stackIn_16_1 = new StringBuilder().append("ed.<init>(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_17_0), stackIn_25_2 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public final int a(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 > 56) {
              stackIn_4_0 = this.field_j;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 92;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2), "ed.Q(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final void a(boolean param0, boolean param1, byte param2) {
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param2 == -127) {
                break L1;
              } else {
                this.field_k = 119;
                break L1;
              }
            }
            L2: {
              this.field_g.a((jj) (this), -9135);
              stackIn_6_0 = this.field_e;

              stackIn_6_1 = 10242;

              if (!param1) {
                stackIn_7_0 = stackIn_6_0;
                stackIn_7_1 = stackIn_6_1;
                stackIn_7_2 = 33071;
                break L2;
              } else {
                stackIn_7_0 = stackIn_6_0;
                stackIn_7_1 = stackIn_6_1;
                stackIn_7_2 = 10497;
                break L2;
              }
            }
            L3: {
              jaggl.OpenGL.glTexParameteri(stackIn_7_0, stackIn_7_1, stackIn_7_2);
              stackIn_10_0 = this.field_e;

              stackIn_10_1 = 10243;

              if (!param0) {
                stackIn_11_0 = stackIn_10_0;
                stackIn_11_1 = stackIn_10_1;
                stackIn_11_2 = 33071;
                break L3;
              } else {
                stackIn_11_0 = stackIn_10_0;
                stackIn_11_1 = stackIn_10_1;
                stackIn_11_2 = 10497;
                break L3;
              }
            }
            jaggl.OpenGL.glTexParameteri(stackIn_11_0, stackIn_11_1, stackIn_11_2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var4), "ed.O(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    ed(jc param0, hd param1, int param2, int param3, boolean param4, float[] param5, int param6, int param7) {
        super(param0, 3553, param1, la.field_i, param3 * param2, param4);
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  this.field_k = param3;
                  this.field_j = param2;
                  this.field_g.a((jj) (this), -9135);
                  if (param4) {
                    break L3;
                  } else {
                    if (param7 != 0) {
                      break L3;
                    } else {
                      if (0 == param6) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                jaggl.OpenGL.glPixelStorei(3314, param7);
                jaggl.OpenGL.glTexImage2Df(this.field_e, 0, this.a(false), param2, param3, 0, gq.a(this.field_h, -29824), 5126, param5, 4 * param6);
                jaggl.OpenGL.glPixelStorei(3314, 0);
                if (!AceOfSkies.field_G) {
                  break L1;
                } else {
                  break L2;
                }
              }
              this.a(param5, true, param2, param3, this.field_e);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var9 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var9);

            stackIn_15_1 = new StringBuilder().append("ed.<init>(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), stackIn_24_2 + ',' + param6 + ',' + param7 + ')');
        }
    }

    ed(jc param0, hd param1, la param2, int param3, int param4) {
        super(param0, 3553, param1, param2, param3 * param4, false);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_k = param4;
            this.field_j = param3;
            this.field_g.a((jj) (this), -9135);
            jaggl.OpenGL.glTexImage2Dub(this.field_e, 0, this.a(false), param3, param4, 0, gq.a(this.field_h, -29824), kk.a(this.field_c, (byte) -96), (byte[]) null, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("ed.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), stackIn_15_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void a(ke param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            super.a(param0, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ed.A(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public final float a(float param0, byte param1) {
        RuntimeException var3 = null;
        float stackIn_4_0 = 0.0f;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -32) {
                break L1;
              } else {
                this.field_k = -67;
                break L1;
              }
            }
            stackIn_4_0 = param0 / (float)this.field_k;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3), "ed.P(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    public final float a(int param0, float param1) {
        RuntimeException var3 = null;
        float stackIn_2_0 = 0.0f;
        float stackIn_4_0 = 0.0f;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 > 65) {
              stackIn_4_0 = param1 / (float)this.field_j;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -0.6172323226928711f;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3), "ed.N(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final void a(byte param0) {
        try {
            super.a(param0);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "ed.C(" + param0 + ')');
        }
    }

    final static void a(int param0, wu param1, byte param2, int param3, boolean param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_53_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        boolean stackOut_12_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = AceOfSkies.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = ek.a((byte) 103, (-param0 + param3) * 3);
                        var6 = param0 * 3;
                        pl.a(0);
                        if (param2 < -60) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ed.a(-54, (wu) null, (byte) -49, -81, true);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var7 = var5_int + -10;
                        if (-1 <= (param1.field_f ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param1.field_x == null) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        dt.b(8);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        gb.field_k = 0;
                        var8 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param1.field_K <= var8) {
                            statePc = 52;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9 = param1.field_I[var8];
                        var10 = param1.field_t[var8];
                        var11 = param1.field_m[var8];
                        stackOut_12_0 = param4;
                        stackIn_53_0 = stackOut_12_0 ? 1 : 0;
                        stackIn_13_0 = stackOut_12_0;
                        if (var19 != 0) {
                            statePc = 53;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var12 = qj.field_t[var9];
                        var13 = ro.field_t[var9];
                        var14 = -var12 + qj.field_t[var10];
                        var15 = qj.field_t[var11] - var12;
                        var16 = -var13 + ro.field_t[var10];
                        var17 = ro.field_t[var11] - var13;
                        if ((-(var16 * var15) + var14 * var17 ^ -1) > -1) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var19 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var12 = lp.field_d[var9];
                        if (var12 != -2147483648) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var19 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var13 = lp.field_d[var10];
                        if (var13 == -2147483648) {
                            statePc = 51;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var14 = lp.field_d[var11];
                        if (-2147483648 != var14) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var19 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var15 = -var6 + var13 + (var12 + var14);
                        stackIn_33_0 = -1;
                        stackIn_31_0 = stackIn_33_0;
                        stackIn_33_1 = gi.field_i.length;
                        stackIn_31_1 = stackIn_33_1;
                        if (var7 < 0) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_34_0 = stackIn_31_0;
                        stackIn_34_1 = stackIn_31_1;
                        stackIn_34_2 = var15 >> var7;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_34_0 = stackIn_33_0;
                        stackIn_34_1 = stackIn_33_1;
                        stackIn_34_2 = var15 << -var7;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var16 = stackIn_34_0 + (stackIn_34_1 - stackIn_34_2);
                        var17 = gi.field_i[var16];
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if ((var17 >> -1113938108 ^ -1) == -1) {
                            statePc = 43;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var16--;
                        stackIn_44_0 = 0;
                        stackIn_37_0 = stackIn_44_0;
                        stackIn_44_1 = var16;
                        stackIn_37_1 = stackIn_44_1;
                        if (var19 != 0) {
                            statePc = 44;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (stackIn_37_0 > stackIn_37_1) {
                            statePc = 41;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        System.err.println("Out of range!");
                        if (var19 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var17 = gi.field_i[var16];
                        if (var19 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_44_0 = var16 << -1433677884;
                        stackIn_44_1 = -var17;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var18 = stackIn_44_0 - stackIn_44_1;
                        jr.field_n[var18] = var8;
                        gi.field_i[var16] = var17 + 1;
                        if (0 >= param1.field_f) {
                            statePc = 50;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (null == param1.field_x) {
                            statePc = 50;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        dupTemp$0 = param1.field_x[var8];
                        hs.field_a[dupTemp$0] = hs.field_a[dupTemp$0] + 1;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        gb.field_k = gb.field_k + 1;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var8++;
                        if (var19 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackIn_53_0 = 0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (stackIn_53_0 >= param1.field_f) {
                            statePc = 71;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (null != param1.field_x) {
                            statePc = 59;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var8 = 0;
                        var9 = 0;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if ((hs.field_a.length ^ -1) >= (var9 ^ -1)) {
                            statePc = 71;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var10 = hs.field_a[var9];
                        hs.field_a[var9] = var8;
                        var8 = var8 + var10;
                        var9++;
                        if (var19 != 0) {
                            statePc = 71;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var19 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 66: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_69_0 = (RuntimeException) (var5);
                    stackIn_67_0 = stackIn_69_0;
                    stackIn_69_1 = new StringBuilder().append("ed.B(").append(param0).append(',');
                    stackIn_67_1 = stackIn_69_1;
                    if (param1 == null) {
                        statePc = 69;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    stackIn_70_0 = (RuntimeException) ((Object) stackIn_67_0);
                    stackIn_70_1 = (StringBuilder) ((Object) stackIn_67_1);
                    stackIn_70_2 = "{...}";
                    statePc = 70;
                    continue stateLoop;
                }
                case 69: {
                    stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
                    stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
                    stackIn_70_2 = "null";
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    throw pn.a((Throwable) ((Object) stackIn_70_0), stackIn_70_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 71: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final int b(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 2) {
                break L1;
              } else {
                ed.a(125, (wu) null, (byte) -44, -22, true);
                break L1;
              }
            }
            stackIn_4_0 = this.field_k;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2), "ed.M(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    ed(jc param0, int param1, int param2, boolean param3, int[] param4, int param5, int param6) {
        super(param0, 3553, lc.field_g, la.field_h, param1 * param2, param3);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  this.field_j = param1;
                  this.field_k = param2;
                  this.field_g.a((jj) (this), -9135);
                  if (!param3) {
                    break L3;
                  } else {
                    if (0 != param6) {
                      break L3;
                    } else {
                      if ((param5 ^ -1) == -1) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                jaggl.OpenGL.glPixelStorei(3314, param6);
                jaggl.OpenGL.glTexImage2Di(this.field_e, 0, 6408, this.field_j, this.field_k, 0, 32993, this.field_g.field_Bc, param4, 4 * param5);
                jaggl.OpenGL.glPixelStorei(3314, 0);
                if (!AceOfSkies.field_G) {
                  break L1;
                } else {
                  break L2;
                }
              }
              this.a((byte) -110, param2, param1, param4, this.field_e);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (runtimeException);

            stackIn_15_1 = new StringBuilder().append("ed.<init>(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), stackIn_20_2 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public final boolean c(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -104) {
                break L1;
              } else {
                this.field_j = 49;
                break L1;
              }
            }
            stackIn_4_0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2), "ed.L(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
    }

    static {
        field_i = 0;
    }
}
