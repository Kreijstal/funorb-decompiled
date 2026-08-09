/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends bp implements ru {
    static boolean field_j;
    private int field_i;
    private int field_k;

    final void a(iw param0, int param1, byte param2, int param3, byte[] param4, int param5, int param6, int param7, int param8) {
        try {
            this.field_e.a((ed) (this), param2 ^ 43);
            jaggl.OpenGL.glPixelStorei(3317, 1);
            jaggl.OpenGL.glPixelStorei(3314, param8);
            jaggl.OpenGL.glTexSubImage2Dub(this.field_h, 0, param1, param7, param6, param5, te.a(param2 + -21416, param0), 5121, param4, param3);
            jaggl.OpenGL.glPixelStorei(3314, 0);
            if (param2 != 77) {
                field_j = true;
            }
            jaggl.OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "sa.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    public final void a(int param0) {
        super.a(param0);
    }

    public final float a(float param0, int param1) {
        if (param1 > -10) {
            this.field_k = 68;
            return param0 / (float)this.field_i;
        }
        return param0 / (float)this.field_i;
    }

    sa(on param0, iw param1, io param2, int param3, int param4) {
        super(param0, 3553, param1, param2, param4 * param3, false);
        try {
            this.field_i = param3;
            this.field_k = param4;
            this.field_e.a((ed) (this), 108);
            jaggl.OpenGL.glTexImage2Dub(this.field_h, 0, this.e(-67), param3, param4, 0, te.a(-21339, this.field_c), ws.a(this.field_g, (byte) 117), (byte[]) null, 0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "sa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final float b(float param0, int param1) {
        if (param1 != -19230) {
            this.field_i = -80;
            return param0 / (float)this.field_k;
        }
        return param0 / (float)this.field_k;
    }

    public final void a(boolean param0, boolean param1, boolean param2) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
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
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        if (!param2) {
          L0: {
            field_j = true;
            this.field_e.a((ed) (this), 91);
            stackIn_10_0 = this.field_h;

            stackIn_10_1 = 10242;

            if (!param1) {
              stackIn_11_0 = stackIn_10_0;
              stackIn_11_1 = stackIn_10_1;
              stackIn_11_2 = 33071;
              break L0;
            } else {
              stackIn_11_0 = stackIn_10_0;
              stackIn_11_1 = stackIn_10_1;
              stackIn_11_2 = 10497;
              break L0;
            }
          }
          L1: {
            jaggl.OpenGL.glTexParameteri(stackIn_11_0, stackIn_11_1, stackIn_11_2);
            stackIn_13_0 = this.field_h;

            stackIn_13_1 = 10243;

            if (param0) {
              stackIn_14_0 = stackIn_13_0;
              stackIn_14_1 = stackIn_13_1;
              stackIn_14_2 = 10497;
              break L1;
            } else {
              stackIn_14_0 = stackIn_13_0;
              stackIn_14_1 = stackIn_13_1;
              stackIn_14_2 = 33071;
              break L1;
            }
          }
          jaggl.OpenGL.glTexParameteri(stackIn_14_0, stackIn_14_1, stackIn_14_2);
          return;
        } else {
          L2: {
            this.field_e.a((ed) (this), 91);
            stackIn_3_0 = this.field_h;

            stackIn_3_1 = 10242;

            if (!param1) {
              stackIn_4_0 = stackIn_3_0;
              stackIn_4_1 = stackIn_3_1;
              stackIn_4_2 = 33071;
              break L2;
            } else {
              stackIn_4_0 = stackIn_3_0;
              stackIn_4_1 = stackIn_3_1;
              stackIn_4_2 = 10497;
              break L2;
            }
          }
          L3: {
            jaggl.OpenGL.glTexParameteri(stackIn_4_0, stackIn_4_1, stackIn_4_2);
            stackIn_6_0 = this.field_h;

            stackIn_6_1 = 10243;

            if (param0) {
              stackIn_7_0 = stackIn_6_0;
              stackIn_7_1 = stackIn_6_1;
              stackIn_7_2 = 10497;
              break L3;
            } else {
              stackIn_7_0 = stackIn_6_0;
              stackIn_7_1 = stackIn_6_1;
              stackIn_7_2 = 33071;
              break L3;
            }
          }
          jaggl.OpenGL.glTexParameteri(stackIn_7_0, stackIn_7_1, stackIn_7_2);
          return;
        }
    }

    sa(on param0, iw param1, int param2, int param3, boolean param4, float[] param5, int param6, int param7) {
        super(param0, 3553, param1, io.field_d, param2 * param3, param4);
        RuntimeException var9 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_i = param2;
            this.field_k = param3;
            this.field_e.a((ed) (this), 109);
            if (param4) {
              break L0;
            } else {
              if (param7 != 0) {
                break L0;
              } else {
                if (param6 == 0) {
                  this.a(this.field_h, param3, -117, param2, param5);
                  return;
                } else {
                  break L0;
                }
              }
            }
          }
          jaggl.OpenGL.glPixelStorei(3314, param7);
          jaggl.OpenGL.glTexImage2Df(this.field_h, 0, this.e(-8), param2, param3, 0, te.a(-21339, this.field_c), 5126, param5, 4 * param6);
          jaggl.OpenGL.glPixelStorei(3314, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var9);

            stackIn_9_1 = new StringBuilder().append("sa.<init>(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L1;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_16_2 + ',' + param6 + ',' + param7 + ')');
        }
    }

    sa(on param0, int param1, int param2, boolean param3, int[] param4, int param5, int param6) {
        super(param0, 3553, nl.field_p, io.field_g, param1 * param2, param3);
        RuntimeException var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_k = param2;
            this.field_i = param1;
            this.field_e.a((ed) (this), 125);
            if (!param3) {
              break L0;
            } else {
              if (-1 != (param6 ^ -1)) {
                break L0;
              } else {
                if (-1 != (param5 ^ -1)) {
                  break L0;
                } else {
                  this.a(param2, param1, param4, this.field_h, -1);
                  return;
                }
              }
            }
          }
          jaggl.OpenGL.glPixelStorei(3314, param6);
          jaggl.OpenGL.glTexImage2Di(this.field_h, 0, 6408, this.field_i, this.field_k, 0, 32993, this.field_e.field_Ec, param4, 4 * param5);
          jaggl.OpenGL.glPixelStorei(3314, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var8);

            stackIn_9_1 = new StringBuilder().append("sa.<init>(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L1;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public final boolean c(int param0) {
        if (param0 != -24722) {
            this.field_k = 91;
            return true;
        }
        return true;
    }

    public final int a(byte param0) {
        int var2 = -100 % ((param0 - -39) / 40);
        return this.field_k;
    }

    public final void a(ji param0, int param1) {
        try {
            if (param1 != 15149) {
                this.b(0.2777647376060486f, 21);
            }
            super.a(param0, param1 + 0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "sa.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4, int[] param5, int param6, int param7) {
        this.field_e.a((ed) (this), 123);
        jaggl.OpenGL.glPixelStorei(3314, param4);
        jaggl.OpenGL.glTexSubImage2Di(this.field_h, 0, param7, param6, param3, param0, 32993, this.field_e.field_Ec, param5, param2);
        if (param1) {
            return;
        }
        try {
            jaggl.OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "sa.U(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ')');
        }
    }

    sa(on param0, iw param1, int param2, int param3, boolean param4, byte[] param5, int param6, int param7) {
        super(param0, 3553, param1, io.field_g, param2 * param3, param4);
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        try {
          L0: {
            L1: {
              L2: {
                this.field_k = param3;
                this.field_i = param2;
                this.field_e.a((ed) (this), 109);
                jaggl.OpenGL.glPixelStorei(3317, 1);
                if (!param4) {
                  break L2;
                } else {
                  if (0 != param7) {
                    break L2;
                  } else {
                    if (0 == param6) {
                      this.a(param5, param2, this.field_h, param3, 81);
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              jaggl.OpenGL.glPixelStorei(3314, param7);
              jaggl.OpenGL.glTexImage2Dub(this.field_h, 0, this.e(104), param2, param3, 0, te.a(-21339, this.field_c), 5121, param5, param6);
              jaggl.OpenGL.glPixelStorei(3314, 0);
              break L1;
            }
            jaggl.OpenGL.glPixelStorei(3317, 4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var9 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var9);

            stackIn_10_1 = new StringBuilder().append("sa.<init>(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_17_2 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public final int b(int param0) {
        if (param0 != -16625) {
            return 83;
        }
        return this.field_i;
    }

    final void a(int param0, iw param1, int param2, int param3, int param4, int param5, int param6, float[] param7, int param8) {
        try {
            this.field_e.a((ed) (this), param4 + -14032);
            jaggl.OpenGL.glPixelStorei(3314, param8);
            jaggl.OpenGL.glTexSubImage2Df(this.field_h, 0, param0, param3, param6, param2, te.a(-21339, param1), 5121, param7, param5);
            jaggl.OpenGL.glPixelStorei(3314, 0);
            if (param4 != 14137) {
                field_j = false;
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "sa.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ')');
        }
    }

    static {
    }
}
