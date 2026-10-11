/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rt extends kl {
    int field_o;
    static String field_n;
    private int field_q;
    static String field_p;
    int field_l;
    private int field_m;

    final void a(int param0, int param1, int param2, int param3) {
        jaggl.OpenGL.glFramebufferTexture2DEXT(param0, param3, this.field_e, this.field_i, param1);
        this.field_q = param3;
        this.field_m = param0;
        if (param2 != 0) {
          this.a(true, true, 64);
        }
    }

    final static void a(boolean param0, String param1, String param2) {
        try {
          if (!param0) {
            String var4 = (String) null;
            rt.a(true, (String) null, (String) null);
          }
          rma.a(false, param1, param2, (byte) 100);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "rt.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0) {
        jaggl.OpenGL.glFramebufferTexture2DEXT(this.field_m, this.field_q, this.field_e, 0, 0);
        this.field_q = -1;
        this.field_m = -1;
        int var2 = -46 % ((param0 - 14) / 56);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, byte[] param5, int param6, int param7, int param8, boolean param9) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
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
        var19 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 == 0) {
            param0 = param7;
          }
          boolean decompiledFrameCompleted0 = true;
          if (param9) {
            var11_int = jj.a(param8, (byte) -72);
            var12 = param7 * var11_int;
            var13 = var11_int * param0;
            var14 = new byte[param2 * var12];
            var15 = 0;
            while (param2 > var15) {
              var16 = var15 * var12;
              var17 = (-var15 + param2 - 1) * var13 + param1;
              stackIn_17_0 = 0;
              if (var19 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              var18 = stackIn_17_0;
              while (var18 < var12) {
                var14[var16++] = param5[var17++];
                var18++;
              }
              var15++;
            }
            if (decompiledFrameCompleted0) {
              param5 = var14;
            }
          }
          if (decompiledFrameCompleted0) {
            this.field_h.a(true, (kl) (this));
            jaggl.OpenGL.glPixelStorei(3317, 1);
            stackIn_17_0 = ~param7;
          }
          if (stackIn_17_0 != ~param0) {
            jaggl.OpenGL.glPixelStorei(3314, param0);
          }
          jaggl.OpenGL.glTexSubImage2Dub(this.field_e, 0, param4, param3, param7, param2, param8, 5121, param5, param1);
          if (param6 != -24575) {
            return;
          }
          if (param0 != param7) {
            jaggl.OpenGL.glPixelStorei(3314, 0);
          }
          jaggl.OpenGL.glPixelStorei(3317, 4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_27_0 = var11;
          stackIn_27_1 = new StringBuilder().append("rt.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    public static void g(int param0) {
        if (param0 != -1) {
          field_n = (String) null;
          field_n = null;
          field_p = null;
          return;
        }
        field_n = null;
        field_p = null;
    }

    final void a(boolean param0, boolean param1, int param2) {
        if (param2 == ~this.field_e) {
          this.field_h.a(true, (kl) (this));
          jaggl.OpenGL.glTexParameteri(this.field_e, 10242, param1 ? 10497 : 33071);
          jaggl.OpenGL.glTexParameteri(this.field_e, 10243, param0 ? 10497 : 33071);
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        int var8 = this.field_h.field_I - param5 - param6;
        this.field_h.a(true, (kl) (this));
        jaggl.OpenGL.glCopyTexSubImage2D(this.field_e, 0, param3, this.field_o - param2 - param6, param0, var8, param1, param6);
        jaggl.OpenGL.glFlush();
        if (param4 < -62) {
          return;
        }
        this.field_l = -71;
    }

    rt(cka param0, int param1, int param2, int param3, int param4, boolean param5, int[] param6, int param7, int param8, boolean param9) {
        super(param0, param1, param2, param4 * param3, param5);
        int stackIn_13_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var11 = null;
        RuntimeException var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        var16 = TombRacer.field_G ? 1 : 0;
        this.field_q = -1;
        this.field_m = -1;
        try {
          boolean decompiledFrameCompleted0 = true;
          this.field_o = param4;
          this.field_l = param3;
          if (param9) {
            var17 = new int[param6.length];
            var11 = var17;
            var12 = 0;
            while (param4 > var12) {
              var13 = param3 * var12;
              var14 = (-1 + (-var12 + param4)) * param3;
              stackIn_13_0 = 0;
              if (var16 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              var15 = stackIn_13_0;
              while (param3 > var15) {
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
            this.field_h.a(true, (kl) (this));
            stackIn_13_0 = -34038;
          }
          boolean decompiledSharedTail0 = (stackIn_13_0 == ~this.field_e ||
            !(param5) ||
            param7 != 0 ||
            0 != param8);
          if (!decompiledSharedTail0) {
            wd.a(this.field_e, 32993, this.field_c, 81, param6, this.field_h.field_P, this.field_l, this.field_o);
            this.a(true, 4);
            decompiledSharedTail0 = (var16 != 0);
          }
          if (decompiledSharedTail0) {
            jaggl.OpenGL.glPixelStorei(3314, param7);
            jaggl.OpenGL.glTexImage2Di(this.field_e, 0, this.field_c, this.field_l, this.field_o, 0, 32993, this.field_h.field_P, param6, param8 * 4);
            jaggl.OpenGL.glPixelStorei(3314, 0);
            this.a(false, 4);
          }
          this.b(true, 3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11_ref = decompiledCaughtException;
          stackIn_23_0 = var11_ref;
          stackIn_23_1 = new StringBuilder().append("rt.<init>(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    rt(cka param0, int param1, int param2, int param3, int param4, boolean param5, float[] param6, int param7) {
        super(param0, param1, param2, param3 * param4, param5);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_q = -1;
        this.field_m = -1;
        try {
          this.field_l = param3;
          this.field_o = param4;
          this.field_h.a(true, (kl) (this));
          boolean decompiledSharedTail0 = (!(param5) ||
            this.field_e == 34037);
          if (!decompiledSharedTail0) {
            gw.a(param7, 92, param1, param2, param6, param3, param4);
            this.a(true, 4);
            decompiledSharedTail0 = (TombRacer.field_G);
          }
          if (decompiledSharedTail0) {
            jaggl.OpenGL.glTexImage2Df(this.field_e, 0, this.field_c, this.field_l, this.field_o, 0, param7, 5126, param6, 0);
            this.a(false, 4);
          }
          this.b(true, 3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("rt.<init>(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param7).append(')').toString());
        }
    }

    rt(cka param0, int param1, int param2, int param3, int param4, boolean param5, byte[] param6, int param7, boolean param8) {
        super(param0, param1, param2, param4 * param3, param5);
        int stackIn_13_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        byte[] var16 = null;
        var15 = TombRacer.field_G ? 1 : 0;
        this.field_q = -1;
        this.field_m = -1;
        try {
          boolean decompiledFrameCompleted0 = true;
          this.field_l = param3;
          this.field_o = param4;
          if (param8) {
            var16 = new byte[param6.length];
            var10 = var16;
            var11 = 0;
            while (var11 < param4) {
              var12 = var11 * param3;
              var13 = (-1 + (-var11 + param4)) * param3;
              stackIn_13_0 = 0;
              if (var15 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              var14 = stackIn_13_0;
              while (param3 > var14) {
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
            this.field_h.a(true, (kl) (this));
            jaggl.OpenGL.glPixelStorei(3317, 1);
            stackIn_13_0 = param5 ? 1 : 0;
          }
          boolean decompiledSharedTail0 = (stackIn_13_0 != 0 &&
            this.field_e != 34037);
          if (!decompiledSharedTail0) {
            jaggl.OpenGL.glTexImage2Dub(this.field_e, 0, this.field_c, this.field_l, this.field_o, 0, param7, 5121, param6, 0);
            this.a(false, 4);
            decompiledSharedTail0 = (var15 != 0);
          }
          if (decompiledSharedTail0) {
            ts.a((byte) 53, param6, param1, param3, param4, param7, param2);
            this.a(true, 4);
          }
          jaggl.OpenGL.glPixelStorei(3317, 4);
          this.b(true, 3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_21_0 = var10_ref;
          stackIn_21_1 = new StringBuilder().append("rt.<init>(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    rt(cka param0, int param1, int param2, int param3, int param4) {
        super(param0, param1, param2, param3 * param4, false);
        this.field_q = -1;
        this.field_m = -1;
        try {
          this.field_o = param4;
          this.field_l = param3;
          this.field_h.a(true, (kl) (this));
          jaggl.OpenGL.glTexImage2Dub(this.field_e, 0, this.field_c, param3, param4, 0, sja.b(this.field_c, 20934), 5121, (byte[]) null, 0);
          this.b(true, 3);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "rt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int[] param5, byte param6, boolean param7, int param8) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var10 = null;
        int var10_int = 0;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          if (0 == param1) {
            param1 = param3;
          }
          boolean decompiledFrameCompleted0 = true;
          if (param7) {
            var16 = new int[param3 * param2];
            var10 = var16;
            var11 = 0;
            while (param2 > var11) {
              var12 = var11 * param3;
              var13 = (-1 - var11 + param2) * param1 + param0;
              stackIn_17_0 = 0;
              if (var15 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              var14 = stackIn_17_0;
              while (param3 > var14) {
                var16[var12++] = param5[var13++];
                var14++;
              }
              var11++;
            }
            if (decompiledFrameCompleted0) {
              param5 = var10;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_17_0 = -72 / ((-66 - param6) / 44);
          }
          var10_int = stackIn_17_0;
          this.field_h.a(true, (kl) (this));
          if (param3 != param1) {
            jaggl.OpenGL.glPixelStorei(3314, param1);
          }
          jaggl.OpenGL.glTexSubImage2Di(this.field_e, 0, param4, -param2 + (-param8 + this.field_o), param3, param2, 32993, this.field_h.field_P, param5, param0);
          if (param3 == param1) {
            return;
          }
          jaggl.OpenGL.glPixelStorei(3314, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_24_0 = var10_ref;
          stackIn_24_1 = new StringBuilder().append("rt.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_n = "Unable to delete name - system busy";
        field_p = "Chat view has been scrolled up. Scroll down to chat.";
    }
}
