/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ubb extends kva implements eb {
    private int field_l;
    private int field_m;
    static phb field_j;
    static String field_k;

    ubb(jp param0, kb param1, int param2, int param3, boolean param4, float[] param5, int param6, int param7) {
        super(param0, 3553, param1, mj.field_d, param3 * param2, param4);
        RuntimeException var9 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_m = param3;
          this.field_l = param2;
          this.field_h.a((ura) (this), -111);
          if (!param4 &&
            param7 == 0 &&
            param6 == 0) {
            this.a(this.field_e, param5, param3, param2, (byte) -67);
            return;
          }
          jaggl.OpenGL.glPixelStorei(3314, param7);
          jaggl.OpenGL.glTexImage2Df(this.field_e, 0, this.e((byte) -31), param2, param3, 0, una.a(-29328, this.field_f), 5126, param5, 4 * param6);
          jaggl.OpenGL.glPixelStorei(3314, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_9_0 = var9;
          stackIn_9_1 = new StringBuilder().append("ubb.<init>(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, kb param8) {
        try {
          this.field_h.a((ura) (this), -116);
          jaggl.OpenGL.glPixelStorei(3317, 1);
          jaggl.OpenGL.glPixelStorei(param6, param0);
          jaggl.OpenGL.glTexSubImage2Dub(this.field_e, 0, param7, param5, param3, param2, una.a(param6 ^ -32382, param8), 5121, param1, param4);
          jaggl.OpenGL.glPixelStorei(3314, 0);
          jaggl.OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ubb.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    ubb(jp param0, kb param1, mj param2, int param3, int param4) {
        super(param0, 3553, param1, param2, param4 * param3, false);
        try {
          this.field_m = param4;
          this.field_l = param3;
          this.field_h.a((ura) (this), -118);
          jaggl.OpenGL.glTexImage2Dub(this.field_e, 0, this.e((byte) -31), param3, param4, 0, una.a(-29328, this.field_f), od.a(true, this.field_b), (byte[]) null, 0);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ubb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final float b(float param0, int param1) {
        if (param1 <= 58) {
          return 0.2576850950717926f;
        }
        return param0 / (float)this.field_m;
    }

    public final float a(float param0, int param1) {
        if (param1 == -1080) {
          return param0 / (float)this.field_l;
        }
        this.a(false, (byte) 127, false);
        return param0 / (float)this.field_l;
    }

    public final void a(tu param0, int param1) {
        try {
          super.a(param0, param1 ^ 0);
          if (param1 != -28798) {
            field_j = (phb) null;
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ubb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, byte param7) {
        try {
          this.field_h.a((ura) (this), -121);
          jaggl.OpenGL.glPixelStorei(3314, param4);
          jaggl.OpenGL.glTexSubImage2Di(this.field_e, 0, param6, param0, param2, param1, 32993, this.field_h.field_Nc, param5, param3);
          if (param7 >= -78) {
            this.field_m = 42;
          }
          jaggl.OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ubb.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(String param0, int param1) {
        RuntimeException var2 = null;
        String var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (nia.field_o) {
            System.out.print(param0);
          }
          if (param1 == 0) {
            return;
          }
          var3 = (String) null;
          ubb.a((String) null, 70);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ubb.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    ubb(jp param0, kb param1, int param2, int param3, boolean param4, byte[] param5, int param6, int param7) {
        super(param0, 3553, param1, mj.field_f, param3 * param2, param4);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_m = param3;
          this.field_l = param2;
          this.field_h.a((ura) (this), -110);
          jaggl.OpenGL.glPixelStorei(3317, 1);
          if (param4 &&
            param7 == 0 &&
            param6 == 0) {
            this.a(this.field_e, param3, param5, 0, param2);
          } else {
            jaggl.OpenGL.glPixelStorei(3314, param7);
            jaggl.OpenGL.glTexImage2Dub(this.field_e, 0, this.e((byte) -31), param2, param3, 0, una.a(-29328, this.field_f), 5121, param5, param6);
            jaggl.OpenGL.glPixelStorei(3314, 0);
          }
          jaggl.OpenGL.glPixelStorei(3317, 4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("ubb.<init>(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public final boolean a(int param0) {
        int var2 = 24 % ((-92 - param0) / 34);
        return true;
    }

    public final void a(boolean param0, byte param1, boolean param2) {
        this.field_h.a((ura) (this), -121);
        jaggl.OpenGL.glTexParameteri(this.field_e, 10242, param0 ? 10497 : 33071);
        if (param1 == -98) {
          jaggl.OpenGL.glTexParameteri(this.field_e, 10243, !param2 ? 33071 : 10497);
          return;
        }
        this.a((byte) 80);
        jaggl.OpenGL.glTexParameteri(this.field_e, 10243, !param2 ? 33071 : 10497);
    }

    ubb(jp param0, int param1, int param2, boolean param3, int[] param4, int param5, int param6) {
        super(param0, 3553, qua.field_d, mj.field_f, param2 * param1, param3);
        RuntimeException var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_m = param2;
          this.field_l = param1;
          this.field_h.a((ura) (this), -111);
          if (param3 &&
            param6 == 0 &&
            param5 == 0) {
            this.a((byte) 14, this.field_e, param2, param1, param4);
            return;
          }
          jaggl.OpenGL.glPixelStorei(3314, param6);
          jaggl.OpenGL.glTexImage2Di(this.field_e, 0, 6408, this.field_l, this.field_m, 0, 32993, this.field_h.field_Nc, param4, 4 * param5);
          jaggl.OpenGL.glPixelStorei(3314, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("ubb.<init>(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public final int b(byte param0) {
        if (param0 != 113) {
          this.a(-1.557132363319397f, 85);
          return this.field_l;
        }
        return this.field_l;
    }

    public final void b(int param0) {
        if (param0 != -27445) {
          this.field_m = 72;
          super.b(param0 ^ 0);
          return;
        }
        super.b(param0 ^ 0);
    }

    public static void f(byte param0) {
        field_k = null;
        if (param0 != 42) {
          return;
        }
        field_j = null;
    }

    public final int a(byte param0) {
        if (param0 >= -40) {
          field_k = (String) null;
          return this.field_m;
        }
        return this.field_m;
    }

    final void a(int param0, kb param1, byte param2, int param3, float[] param4, int param5, int param6, int param7, int param8) {
        try {
          this.field_h.a((ura) (this), -122);
          jaggl.OpenGL.glPixelStorei(3314, param3);
          jaggl.OpenGL.glTexSubImage2Df(this.field_e, 0, param6, param5, param7, param0, una.a(-29328, param1), 5121, param4, param8);
          if (param2 >= -35) {
            ubb.f((byte) -66);
          }
          jaggl.OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ubb.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_k = "Short arm";
    }
}
