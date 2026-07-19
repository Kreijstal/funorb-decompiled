/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn extends kva implements eb {
    static int field_m;
    private int field_j;
    private int field_l;
    static gl field_k;

    gn(jp param0, kb param1, int param2, int param3, float[] param4, int param5, int param6) {
        super(param0, 34037, param1, mj.field_d, param2 * param3, false);
        try {
            this.field_j = param3;
            this.field_l = param2;
            this.field_h.a((ura) (this), -108);
            jaggl.OpenGL.glPixelStorei(3314, param6);
            jaggl.OpenGL.glTexImage2Df(this.field_e, 0, this.e((byte) -31), param2, param3, 0, una.a(-29328, this.field_f), 5126, param4, 4 * param5);
            jaggl.OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "gn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    public final void a(tu param0, int param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "gn.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(boolean param0, byte param1, boolean param2) {
        if (param1 != -98) {
            field_k = (gl) null;
        }
    }

    public final void b(int param0) {
        super.b(param0);
    }

    gn(jp param0, int param1, int param2, int[] param3, int param4, int param5) {
        super(param0, 34037, qua.field_d, mj.field_f, param2 * param1, false);
        try {
            this.field_j = param2;
            this.field_l = param1;
            this.field_h.a((ura) (this), -112);
            jaggl.OpenGL.glPixelStorei(3314, param5);
            jaggl.OpenGL.glTexImage2Di(this.field_e, 0, 6408, this.field_l, this.field_j, 0, 32993, this.field_h.field_Nc, param3, param4 * 4);
            jaggl.OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "gn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    gn(jp param0, kb param1, int param2, int param3, byte[] param4, int param5, int param6) {
        super(param0, 34037, param1, mj.field_f, param3 * param2, false);
        try {
            this.field_l = param2;
            this.field_j = param3;
            this.field_h.a((ura) (this), -108);
            jaggl.OpenGL.glPixelStorei(3317, 1);
            jaggl.OpenGL.glPixelStorei(3314, param6);
            jaggl.OpenGL.glTexImage2Dub(this.field_e, 0, this.e((byte) -31), param2, param3, 0, una.a(-29328, this.field_f), 5121, param4, param5);
            jaggl.OpenGL.glPixelStorei(3314, 0);
            jaggl.OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "gn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    public final float a(float param0, int param1) {
        if (param1 != -1080) {
            this.field_j = -47;
            return param0;
        }
        return param0;
    }

    public static void e(int param0) {
        if (param0 <= 77) {
            return;
        }
        field_k = null;
    }

    public final boolean a(int param0) {
        int var2 = 32 % ((param0 - -92) / 34);
        return false;
    }

    final static ntb[] a(int param0, ij param1) {
        ksa[] var2 = null;
        RuntimeException var2_ref = null;
        ntb[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        ksa[] var6 = null;
        Object stackIn_3_0 = null;
        ntb[] stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ntb[] stackOut_7_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            if (param1 != null) {
              var6 = param1.f(param0 + -4872);
              var2 = var6;
              var3 = new ntb[var6.length];
              var4 = param0;
              L1: while (true) {
                if (var6.length <= var4) {
                  stackOut_7_0 = (ntb[]) (var3);
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3[var4] = (ntb) ((Object) var6[var4]);
                  var4++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var2_ref);
            stackOut_9_1 = new StringBuilder().append("gn.A(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ntb[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_8_0;
        }
    }

    public final void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, byte param7) {
        float discarded$2 = 0.0f;
        RuntimeException var9 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param7 < -78) {
                break L1;
              } else {
                discarded$2 = this.a(-1.5097984075546265f, 96);
                break L1;
              }
            }
            L2: {
              this.field_h.a((ura) (this), -121);
              if (param4 != 0) {
                break L2;
              } else {
                param4 = param2;
                break L2;
              }
            }
            L3: {
              if (param2 != param4) {
                jaggl.OpenGL.glPixelStorei(3314, param4);
                break L3;
              } else {
                break L3;
              }
            }
            jaggl.OpenGL.glTexSubImage2Di(this.field_e, 0, param6, param0, param2, param1, 32993, this.field_h.field_Nc, param5, param3);
            if (param2 == param4) {
              break L0;
            } else {
              jaggl.OpenGL.glPixelStorei(3314, 0);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var9 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var9);
            stackOut_10_1 = new StringBuilder().append("gn.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param5 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param6 + ',' + param7 + ')');
        }
    }

    gn(jp param0, kb param1, mj param2, int param3, int param4) {
        super(param0, 34037, param1, param2, param3 * param4, false);
        try {
            this.field_j = param4;
            this.field_l = param3;
            this.field_h.a((ura) (this), -109);
            jaggl.OpenGL.glTexImage2Dub(this.field_e, 0, this.e((byte) -31), param3, param4, 0, una.a(-29328, this.field_f), od.a(true, this.field_b), (byte[]) null, 0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "gn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final int b(byte param0) {
        if (param0 != 113) {
            this.field_l = -45;
            return this.field_l;
        }
        return this.field_l;
    }

    public final float b(float param0, int param1) {
        if (param1 <= 58) {
            this.field_l = 118;
            return param0;
        }
        return param0;
    }

    public final int a(byte param0) {
        if (param0 >= -40) {
            return 85;
        }
        return this.field_j;
    }

    static {
        field_k = new gl(4);
    }
}
