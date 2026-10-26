/*
 * Decompiled by CFR-JS 0.4.0.
 */
class nr extends rt {
    int field_m;
    private int field_l;
    private int field_n;
    int field_k;

    final void a(int param0, byte[] param1, int param2, boolean param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int stackIn_17_0 = 0;
        String stackIn_29_2 = null;
        int var19 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param7 == 0) {
            param7 = param9;
          }
          boolean decompiledFrameCompleted0 = true;
          if (param3) {
            int var11_int = rl.a(4, param8);
            int var12 = var11_int * param9;
            int var13 = var11_int * param7;
            byte[] var14 = new byte[var12 * param6];
            int var15 = 0;
            while (var15 < param6) {
              int var16 = var15 * var12;
              int var17 = param2 + (-1 + param6 - var15) * var13;
              stackIn_17_0 = 0;
              if (var19 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              int var18 = stackIn_17_0;
              while (var12 > var18) {
                var14[var16++] = param1[var17++];
                var18++;
              }
              var15++;
            }
            if (decompiledFrameCompleted0) {
              param1 = var14;
            }
          }
          if (decompiledFrameCompleted0) {
            this.field_j.a((rt) (this), 1);
            jaggl.OpenGL.glPixelStorei(3317, 1);
            stackIn_17_0 = ~param7;
          }
          if (stackIn_17_0 != ~param9) {
            jaggl.OpenGL.glPixelStorei(3314, param7);
          }
          jaggl.OpenGL.glTexSubImage2Dub(this.field_f, 0, param4, param0, param9, param6, param8, 5121, param1, param2);
          if (param7 != param9) {
            jaggl.OpenGL.glPixelStorei(3314, 0);
          }
          if (param5 != -34038) {
            return;
          }
          jaggl.OpenGL.glPixelStorei(3317, 4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var11 = decompiledCaughtException;
          RuntimeException stackIn_28_0 = var11;
          StringBuilder stackIn_28_1 = new StringBuilder().append("nr.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int[] param5, int param6, byte param7, int param8) {
        int stackIn_16_0 = 0;
        String stackIn_28_2 = null;
        int var15 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param8 == 0) {
            param8 = param0;
          }
          boolean decompiledFrameCompleted0 = true;
          if (param3) {
            int[] var16 = new int[param2 * param0];
            int[] var10 = var16;
            int var11 = 0;
            while (param2 > var11) {
              int var12 = var11 * param0;
              int var13 = param6 + (param2 + (-var11 - 1)) * param8;
              stackIn_16_0 = 0;
              if (var15 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              int var14 = stackIn_16_0;
              while (param0 > var14) {
                var16[var12++] = param5[var13++];
                var14++;
              }
              var11++;
            }
            if (decompiledFrameCompleted0) {
              param5 = var16;
            }
          }
          if (decompiledFrameCompleted0) {
            this.field_j.a((rt) (this), 1);
            stackIn_16_0 = ~param0;
          }
          if (stackIn_16_0 != ~param8) {
            jaggl.OpenGL.glPixelStorei(3314, param8);
          }
          jaggl.OpenGL.glTexSubImage2Di(this.field_f, 0, param4, -param2 + this.field_k - param1, param0, param2, 32993, this.field_j.field_tb, param5, param6);
          if (param8 != param0) {
            jaggl.OpenGL.glPixelStorei(3314, 0);
          }
          if (param7 == 0) {
            return;
          }
          this.field_n = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var10_ref = decompiledCaughtException;
          RuntimeException stackIn_27_0 = var10_ref;
          StringBuilder stackIn_27_1 = new StringBuilder().append("nr.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, boolean param2) {
        if (this.field_f == 3553) {
          this.field_j.a((rt) (this), 1);
          jaggl.OpenGL.glTexParameteri(this.field_f, 10242, !param2 ? 33071 : 10497);
          jaggl.OpenGL.glTexParameteri(this.field_f, 10243, !param0 ? 33071 : 10497);
        }
        if (param1 == 11779) {
          return;
        }
        this.field_k = 28;
    }

    final void a(int param0, int param1, int param2, int param3) {
        jaggl.OpenGL.glFramebufferTexture2DEXT(param3, param0, this.field_f, this.field_d, param2);
        this.field_l = param3;
        if (param1 == 0) {
          this.field_n = param0;
          return;
        }
        int[] var6 = (int[]) null;
        this.a(100, -69, 53, true, 65, (int[]) null, 57, (byte) -105, -113);
        this.field_n = param0;
    }

    nr(wl param0, int param1, int param2, int param3, int param4, boolean param5, int[] param6, int param7, int param8, boolean param9) {
        super(param0, param1, param2, param4 * param3, param5);
        int stackIn_13_0 = 0;
        String stackIn_24_2 = null;
        String stackIn_27_2 = null;
        int var16 = AceOfSkies.obfuscationControl ? 1 : 0;
        this.field_l = -1;
        this.field_n = -1;
        try {
          boolean decompiledFrameCompleted0 = true;
          this.field_k = param4;
          this.field_m = param3;
          if (param9) {
            int[] var17 = new int[param6.length];
            int[] var11 = var17;
            int var12 = 0;
            while (var12 < param4) {
              int var13 = var12 * param3;
              int var14 = (-1 + param4 - var12) * param3;
              stackIn_13_0 = 0;
              if (var16 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              int var15 = stackIn_13_0;
              while (var15 < param3) {
                var17[var13++] = param6[var14++];
                var15++;
              }
              var12++;
            }
            if (decompiledFrameCompleted0) {
              param6 = var17;
            }
          }
          if (decompiledFrameCompleted0) {
            this.field_j.a((rt) (this), 1);
            stackIn_13_0 = -34038;
          }
          boolean decompiledSharedTail0 = (stackIn_13_0 != ~this.field_f &&
            param5 &&
            param7 == 0 &&
            param8 == 0);
          if (!decompiledSharedTail0) {
            jaggl.OpenGL.glPixelStorei(3314, param7);
            jaggl.OpenGL.glTexImage2Di(this.field_f, 0, this.field_b, this.field_m, this.field_k, 0, 32993, this.field_j.field_tb, param6, 4 * param8);
            jaggl.OpenGL.glPixelStorei(3314, 0);
            this.a(false, false);
            decompiledSharedTail0 = (var16 != 0);
          }
          if (decompiledSharedTail0) {
            fg.a(this.field_m, this.field_k, this.field_f, 32993, 72, param6, this.field_j.field_tb, this.field_b);
            this.a(true, false);
          }
          this.a(true, -128);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var11_ref = decompiledCaughtException;
          RuntimeException stackIn_23_0 = var11_ref;
          StringBuilder stackIn_23_1 = new StringBuilder().append("nr.<init>(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          StringBuilder stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    public final void a(byte param0) {
        jaggl.OpenGL.glFramebufferTexture2DEXT(this.field_l, this.field_n, this.field_f, 0, 0);
        if (param0 == 11) {
          this.field_l = -1;
          this.field_n = -1;
          return;
        }
        this.a(false, 38, false);
        this.field_l = -1;
        this.field_n = -1;
    }

    nr(wl param0, int param1, int param2, int param3, int param4, boolean param5, byte[] param6, int param7, boolean param8) {
        super(param0, param1, param2, param4 * param3, param5);
        int stackIn_13_0 = 0;
        String stackIn_22_2 = null;
        String stackIn_25_2 = null;
        int var15 = AceOfSkies.obfuscationControl ? 1 : 0;
        this.field_l = -1;
        this.field_n = -1;
        try {
          boolean decompiledFrameCompleted0 = true;
          this.field_m = param3;
          this.field_k = param4;
          if (param8) {
            byte[] var16 = new byte[param6.length];
            byte[] var10 = var16;
            int var11 = 0;
            while (var11 < param4) {
              int var12 = var11 * param3;
              int var13 = param3 * (-var11 + (param4 - 1));
              stackIn_13_0 = 0;
              if (var15 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              int var14 = stackIn_13_0;
              while (var14 < param3) {
                var16[var12++] = param6[var13++];
                var14++;
              }
              var11++;
            }
            if (decompiledFrameCompleted0) {
              param6 = var16;
            }
          }
          if (decompiledFrameCompleted0) {
            this.field_j.a((rt) (this), 1);
            jaggl.OpenGL.glPixelStorei(3317, 1);
            stackIn_13_0 = param5 ? 1 : 0;
          }
          boolean decompiledSharedTail0 = (stackIn_13_0 != 0 &&
            this.field_f != 34037);
          if (!decompiledSharedTail0) {
            jaggl.OpenGL.glTexImage2Dub(this.field_f, 0, this.field_b, this.field_m, this.field_k, 0, param7, 5121, param6, 0);
            this.a(false, false);
            decompiledSharedTail0 = (var15 != 0);
          }
          if (decompiledSharedTail0) {
            pu.a((byte) -55, param7, param2, param6, param1, param4, param3);
            this.a(true, false);
          }
          jaggl.OpenGL.glPixelStorei(3317, 4);
          this.a(true, -128);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var10_ref = decompiledCaughtException;
          RuntimeException stackIn_21_0 = var10_ref;
          StringBuilder stackIn_21_1 = new StringBuilder().append("nr.<init>(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          StringBuilder stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param6 > 79) {
          int var8 = -param3 - param0 + this.field_j.field_bb;
          this.field_j.a((rt) (this), 1);
          jaggl.OpenGL.glCopyTexSubImage2D(this.field_f, 0, param4, this.field_k + (-param2 - param3), param1, var8, param5, param3);
          jaggl.OpenGL.glFlush();
          return;
        }
    }

    nr(wl param0, int param1, int param2, int param3, int param4, boolean param5, float[] param6, int param7) {
        super(param0, param1, param2, param3 * param4, param5);
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        this.field_l = -1;
        this.field_n = -1;
        try {
          this.field_m = param3;
          this.field_k = param4;
          this.field_j.a((rt) (this), 1);
          boolean decompiledSharedTail0 = (!(param5) ||
            34037 == this.field_f);
          if (!decompiledSharedTail0) {
            rq.a(param6, param1, param2, param4, param7, param3, -1);
            this.a(true, false);
            decompiledSharedTail0 = (AceOfSkies.obfuscationControl);
          }
          if (decompiledSharedTail0) {
            jaggl.OpenGL.glTexImage2Df(this.field_f, 0, this.field_b, this.field_m, this.field_k, 0, param7, 5126, param6, 0);
            this.a(false, false);
          }
          this.a(true, -128);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_9_0 = runtimeException;
          StringBuilder stackIn_9_1 = new StringBuilder().append("nr.<init>(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param7).append(')').toString());
        }
    }

    nr(wl param0, int param1, int param2, int param3, int param4) {
        super(param0, param1, param2, param4 * param3, false);
        this.field_l = -1;
        this.field_n = -1;
        try {
          this.field_k = param4;
          this.field_m = param3;
          this.field_j.a((rt) (this), 1);
          jaggl.OpenGL.glTexImage2Dub(this.field_f, 0, this.field_b, param3, param4, 0, ia.a(this.field_b, -16445), 5121, (byte[]) null, 0);
          this.a(true, -128);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "nr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int[] param0, boolean param1, byte[] param2, int param3, int param4) {
        String stackIn_18_2 = null;
        String stackIn_21_2 = null;
        int var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param1) {
            return;
          }
          int var5_int = 0;
          while (var5_int < gi.field_i.length) {
            param3 = gi.field_i[var5_int];
            if (var7 != 0) {
              return;
            }
            int var6 = var5_int << 4;
            while (true) {
              int incrementValue$0 = param3;
              param3--;
              if (0 != incrementValue$0) {
                int incrementValue$1 = var6;
                var6++;
                param4 = jr.field_n[incrementValue$1];
                byte dupTemp$2 = param2[param4];
                int dupTemp$3 = param0[dupTemp$2];
                param0[dupTemp$2] = dupTemp$3 + 1;
                jr.field_n[dupTemp$3] = param4;
                continue;
              }
              break;
            }
            var5_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var5;
          StringBuilder stackIn_17_1 = new StringBuilder().append("nr.G(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          StringBuilder stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
    }
}
