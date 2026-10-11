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
        int stackIn_17_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
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
        var19 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param5 == 0) {
            param5 = param4;
          }
          boolean decompiledFrameCompleted0 = true;
          if (param7) {
            var11_int = pc.a(param2, (byte) -37);
            var12 = var11_int * param4;
            var13 = var11_int * param5;
            var14 = new byte[param9 * var12];
            var15 = 0;
            while (var15 < param9) {
              var16 = var15 * var12;
              var17 = var13 * (-var15 + (param9 - 1)) + param0;
              stackIn_17_0 = 0;
              if (var19 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              var18 = stackIn_17_0;
              while (var18 < var12) {
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
            this.field_d.a(82, (ht) (this));
            jaggl.OpenGL.glPixelStorei(3317, 1);
            stackIn_17_0 = ~param4;
          }
          if (stackIn_17_0 != ~param5) {
            jaggl.OpenGL.glPixelStorei(3314, param5);
          }
          jaggl.OpenGL.glTexSubImage2Dub(this.field_c, 0, param3, param6, param4, param9, param2, 5121, param1, param0);
          if (param5 != param4) {
            jaggl.OpenGL.glPixelStorei(3314, 0);
          }
          if (param8 >= -120) {
            return;
          }
          jaggl.OpenGL.glPixelStorei(3317, 4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_28_0 = var11;
          stackIn_28_1 = new StringBuilder().append("us.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    us(fr param0, int param1, int param2, int param3, int param4) {
        super(param0, param1, param2, param4 * param3, false);
        this.field_k = -1;
        this.field_n = -1;
        try {
          this.field_o = param4;
          this.field_l = param3;
          this.field_d.a(27, (ht) (this));
          jaggl.OpenGL.glTexImage2Dub(this.field_c, 0, this.field_a, param3, param4, 0, be.a(false, this.field_a), 5121, (byte[]) null, 0);
          this.a(true, 0);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "us.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = this.field_d.field_Ec - param4 - param1;
        this.field_d.a(97, (ht) (this));
        if (param0 >= 110) {
          jaggl.OpenGL.glCopyTexSubImage2D(this.field_c, 0, param2, -param4 - param3 + this.field_o, param5, var8, param6, param4);
          jaggl.OpenGL.glFlush();
          return;
        }
        this.field_o = 53;
        jaggl.OpenGL.glCopyTexSubImage2D(this.field_c, 0, param2, -param4 - param3 + this.field_o, param5, var8, param6, param4);
        jaggl.OpenGL.glFlush();
    }

    final void a(boolean param0, boolean param1, int param2) {
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_19_2 = 0;
        if (param2 == -27365) {
          if (this.field_c == 3553) {
            this.field_d.a(66, (ht) (this));
            stackIn_5_0 = this.field_c;
            stackIn_5_1 = 10242;
            stackIn_6_2 = (!param0) ? 33071 : 10497;
            jaggl.OpenGL.glTexParameteri(stackIn_5_0, stackIn_5_1, stackIn_6_2);
            stackIn_8_0 = this.field_c;
            stackIn_8_1 = 10243;
            stackIn_9_2 = (!param1) ? 33071 : 10497;
            jaggl.OpenGL.glTexParameteri(stackIn_8_0, stackIn_8_1, stackIn_9_2);
          }
        } else {
          this.a((byte) 11, 46, 71, -37, 98, -13, 14);
          if (this.field_c == 3553) {
            this.field_d.a(66, (ht) (this));
            stackIn_15_0 = this.field_c;
            stackIn_15_1 = 10242;
            stackIn_16_2 = (!param0) ? 33071 : 10497;
            jaggl.OpenGL.glTexParameteri(stackIn_15_0, stackIn_15_1, stackIn_16_2);
            stackIn_18_0 = this.field_c;
            stackIn_18_1 = 10243;
            stackIn_19_2 = (!param1) ? 33071 : 10497;
            jaggl.OpenGL.glTexParameteri(stackIn_18_0, stackIn_18_1, stackIn_19_2);
          }
        }
    }

    us(fr param0, int param1, int param2, int param3, int param4, boolean param5, float[] param6, int param7) {
        super(param0, param1, param2, param3 * param4, param5);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_k = -1;
        this.field_n = -1;
        try {
          this.field_l = param3;
          this.field_o = param4;
          this.field_d.a(106, (ht) (this));
          boolean decompiledSharedTail0 = (param5 &&
            this.field_c != 34037);
          if (!decompiledSharedTail0) {
            jaggl.OpenGL.glTexImage2Df(this.field_c, 0, this.field_a, this.field_l, this.field_o, 0, param7, 5126, param6, 0);
            this.a(true, false);
            decompiledSharedTail0 = (Sumoblitz.field_L);
          }
          if (decompiledSharedTail0) {
            dl.a(param3, param4, (byte) 11, param1, param2, param6, param7);
            this.a(true, true);
          }
          this.a(true, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("us.<init>(");
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
          throw qo.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param7).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_m = null;
        if (param0 != 28) {
          field_m = (String) null;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        jaggl.OpenGL.glFramebufferTexture2DEXT(param3, param1, this.field_c, this.field_j, param2);
        this.field_k = param3;
        if (param0 < -21) {
          this.field_n = param1;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, boolean param7, boolean param8) {
        int stackIn_19_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        var15 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (!param8) {
            this.a(11);
          }
          if (param6 == 0) {
            param6 = param1;
          }
          boolean decompiledFrameCompleted0 = true;
          if (param7) {
            var16 = new int[param1 * param0];
            var10 = var16;
            var11 = 0;
            while (param0 > var11) {
              var12 = param1 * var11;
              var13 = param4 + param6 * (param0 - (var11 + 1));
              stackIn_19_0 = 0;
              if (var15 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              var14 = stackIn_19_0;
              while (var14 < param1) {
                var16[var12++] = param3[var13++];
                var14++;
              }
              var11++;
            }
            if (decompiledFrameCompleted0) {
              param3 = var16;
            }
          }
          if (decompiledFrameCompleted0) {
            this.field_d.a(81, (ht) (this));
            stackIn_19_0 = param6;
          }
          if (stackIn_19_0 != param1) {
            jaggl.OpenGL.glPixelStorei(3314, param6);
          }
          jaggl.OpenGL.glTexSubImage2Di(this.field_c, 0, param5, -param0 + (this.field_o - param2), param1, param0, 32993, this.field_d.field_L, param3, param4);
          if (param1 == param6) {
            return;
          }
          jaggl.OpenGL.glPixelStorei(3314, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_27_0 = var10_ref;
          stackIn_27_1 = new StringBuilder().append("us.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    us(fr param0, int param1, int param2, int param3, int param4, boolean param5, byte[] param6, int param7, boolean param8) {
        super(param0, param1, param2, param3 * param4, param5);
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
        var15 = Sumoblitz.field_L ? 1 : 0;
        this.field_k = -1;
        this.field_n = -1;
        try {
          boolean decompiledFrameCompleted0 = true;
          this.field_l = param3;
          this.field_o = param4;
          if (param8) {
            var16 = new byte[param6.length];
            var10 = var16;
            var11 = 0;
            while (param4 > var11) {
              var12 = param3 * var11;
              var13 = param3 * (-1 + (-var11 + param4));
              stackIn_13_0 = 0;
              if (var15 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              var14 = stackIn_13_0;
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
            this.field_d.a(83, (ht) (this));
            jaggl.OpenGL.glPixelStorei(3317, 1);
            stackIn_13_0 = param5 ? 1 : 0;
          }
          boolean decompiledSharedTail0 = (stackIn_13_0 == 0 ||
            34037 == this.field_c);
          if (!decompiledSharedTail0) {
            vq.a(param1, 23143, param6, param3, param2, param4, param7);
            this.a(true, true);
            decompiledSharedTail0 = (var15 != 0);
          }
          if (decompiledSharedTail0) {
            jaggl.OpenGL.glTexImage2Dub(this.field_c, 0, this.field_a, this.field_l, this.field_o, 0, param7, 5121, param6, 0);
            this.a(true, false);
          }
          jaggl.OpenGL.glPixelStorei(3317, 4);
          this.a(true, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_21_0 = var10_ref;
          stackIn_21_1 = new StringBuilder().append("us.<init>(");
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
          throw qo.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    us(fr param0, int param1, int param2, int param3, int param4, boolean param5, int[] param6, int param7, int param8, boolean param9) {
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
        var16 = Sumoblitz.field_L ? 1 : 0;
        this.field_k = -1;
        this.field_n = -1;
        try {
          boolean decompiledFrameCompleted0 = true;
          this.field_l = param3;
          this.field_o = param4;
          if (param9) {
            var17 = new int[param6.length];
            var11 = var17;
            var12 = 0;
            while (param4 > var12) {
              var13 = var12 * param3;
              var14 = param3 * (-var12 + param4 - 1);
              stackIn_13_0 = 0;
              if (var16 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              var15 = stackIn_13_0;
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
            this.field_d.a(43, (ht) (this));
            stackIn_13_0 = this.field_c;
          }
          if (stackIn_13_0 != 34037 &&
            param5 &&
            param7 == 0 &&
            param8 == 0) {
            eu.a(-122, this.field_o, this.field_l, this.field_c, param6, this.field_a, this.field_d.field_L, 32993);
            this.a(true, true);
          }
          if (stackIn_13_0 == 34037 ||
            !param5 ||
            param7 != 0 ||
            param8 != 0 || var16 != 0) {
            jaggl.OpenGL.glPixelStorei(3314, param7);
            jaggl.OpenGL.glTexImage2Di(this.field_c, 0, this.field_a, this.field_l, this.field_o, 0, 32993, this.field_d.field_L, param6, 4 * param8);
            jaggl.OpenGL.glPixelStorei(3314, 0);
            this.a(true, false);
          }
          this.a(true, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11_ref = decompiledCaughtException;
          stackIn_23_0 = var11_ref;
          stackIn_23_1 = new StringBuilder().append("us.<init>(");
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
          throw qo.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    public final void a(int param0) {
        int var2 = 6 / ((44 - param0) / 58);
        jaggl.OpenGL.glFramebufferTexture2DEXT(this.field_k, this.field_n, this.field_c, 0, 0);
        this.field_k = -1;
        this.field_n = -1;
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
          java.net.URL var2 = null;
          int var2_int = 0;
          RuntimeException stackIn_7_0 = null;
          StringBuilder stackIn_7_1 = null;
          String stackIn_8_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
              param0.getAppletContext().showDocument(td.a((byte) 127, param0, var2), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            var2_int = 76 / ((0 - param1) / 39);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_7_0 = var2_ref2;
            stackIn_7_1 = new StringBuilder().append("us.I(");
            if (param0 == null) {
              stackIn_8_2 = "null";
            } else {
              stackIn_8_2 = "{...}";
            }
            throw qo.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_m = "Logging in...";
    }
}
