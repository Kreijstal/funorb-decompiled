/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends tfa implements gf {
    static fta field_m;
    static String field_k;
    private int field_l;
    private int field_n;

    final static String[] a(uia param0, byte param1) {
        vna var2 = null;
        RuntimeException var2_ref = null;
        String[] var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        uia stackIn_5_0 = null;
        String[] stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        uia stackOut_3_0 = null;
        uia stackOut_4_0 = null;
        String[] stackOut_11_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2 = new vna();
            stackOut_3_0 = (uia) param0;
            stackIn_5_0 = stackOut_3_0;
            L1: while (true) {
              L2: {
                if (stackIn_5_0.field_h >= param0.field_g.length) {
                  break L2;
                } else {
                  var3_int = w.a(param0, -58, var2);
                  if (!qqa.a(param0, mga.field_j, var3_int, true)) {
                    stackOut_4_0 = (uia) param0;
                    stackIn_5_0 = stackOut_4_0;
                    continue L1;
                  } else {
                    param0.field_h = param0.field_h + (mga.field_j.length - 1);
                    break L2;
                  }
                }
              }
              var3 = new String[var2.a((byte) -16)];
              var4 = 0;
              L3: while (true) {
                if (var3.length <= var4) {
                  stackOut_11_0 = (String[]) var3;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  var3[var4] = ((gka) (Object) var2.c(-103)).field_h;
                  var4++;
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2_ref;
            stackOut_13_1 = new StringBuilder().append("pe.K(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + 73 + ')');
        }
        return stackIn_12_0;
    }

    pe(kda param0, ft param1, una param2, int param3, int param4) {
        super(param0, 34037, param1, param2, param3 * param4, false);
        try {
            ((pe) this).field_l = param3;
            ((pe) this).field_n = param4;
            ((pe) this).field_j.a(true, (iva) this);
            jaggl.OpenGL.glTexImage2Dub(((pe) this).field_i, 0, ((pe) this).d(78), param3, param4, 0, waa.a(((pe) this).field_f, 1383), lr.a(((pe) this).field_a, 5126), (byte[]) null, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "pe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int a(boolean param0, int param1, String param2, int param3, String param4, String param5, byte param6) {
        goa var7 = null;
        RuntimeException var7_ref = null;
        goa var8 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var7 = new goa(param4);
            var8 = new goa(param2);
            stackOut_0_0 = fja.a(var8, param5, param0, param1, var7, 101, param3);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7_ref;
            stackOut_2_1 = new StringBuilder().append("pe.J(").append(param0).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param3).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param5 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + 53 + ')');
        }
        return stackIn_1_0;
    }

    public final void a(int param0, hs param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "pe.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int b(int param0) {
        if (param0 != -7070) {
            ((pe) this).a((byte) -45, true, false);
            return ((pe) this).field_l;
        }
        return ((pe) this).field_l;
    }

    pe(kda param0, ft param1, int param2, int param3, byte[] param4, int param5, int param6) {
        super(param0, 34037, param1, una.field_g, param2 * param3, false);
        try {
            ((pe) this).field_n = param3;
            ((pe) this).field_l = param2;
            ((pe) this).field_j.a(true, (iva) this);
            jaggl.OpenGL.glPixelStorei(3317, 1);
            jaggl.OpenGL.glPixelStorei(3314, param6);
            jaggl.OpenGL.glTexImage2Dub(((pe) this).field_i, 0, ((pe) this).d(125), param2, param3, 0, waa.a(((pe) this).field_f, 1383), 5121, param4, param5);
            jaggl.OpenGL.glPixelStorei(3314, 0);
            jaggl.OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "pe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    public final float a(int param0, float param1) {
        if (param0 <= 60) {
            return -1.0163322687149048f;
        }
        return param1;
    }

    pe(kda param0, int param1, int param2, int[] param3, int param4, int param5) {
        super(param0, 34037, gpa.field_a, una.field_g, param1 * param2, false);
        try {
            ((pe) this).field_l = param1;
            ((pe) this).field_n = param2;
            ((pe) this).field_j.a(true, (iva) this);
            jaggl.OpenGL.glPixelStorei(3314, param5);
            jaggl.OpenGL.glTexImage2Di(((pe) this).field_i, 0, 6408, ((pe) this).field_l, ((pe) this).field_n, 0, 32993, ((pe) this).field_j.field_od, param3, param4 * 4);
            jaggl.OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "pe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    public final int a(byte param0) {
        if (param0 > 0) {
            return -120;
        }
        return ((pe) this).field_n;
    }

    public final void b(byte param0) {
        if (param0 <= 32) {
            field_k = null;
            super.b((byte) 72);
            return;
        }
        super.b((byte) 72);
    }

    public final void a(byte param0, boolean param1, boolean param2) {
        if (param0 <= -60) {
            return;
        }
        boolean discarded$0 = ((pe) this).a(96);
    }

    public static void e(int param0) {
        field_m = null;
        field_k = null;
    }

    pe(kda param0, ft param1, int param2, int param3, float[] param4, int param5, int param6) {
        super(param0, 34037, param1, una.field_h, param2 * param3, false);
        try {
            ((pe) this).field_n = param3;
            ((pe) this).field_l = param2;
            ((pe) this).field_j.a(true, (iva) this);
            jaggl.OpenGL.glPixelStorei(3314, param6);
            jaggl.OpenGL.glTexImage2Df(((pe) this).field_i, 0, ((pe) this).d(75), param2, param3, 0, waa.a(((pe) this).field_f, 1383), 5126, param4, 4 * param5);
            jaggl.OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "pe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    public final boolean a(int param0) {
        if (param0 != -14634) {
            field_m = null;
            return false;
        }
        return false;
    }

    public final float a(float param0, byte param1) {
        if (param1 != -33) {
            return 1.619486927986145f;
        }
        return param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Enter name of player to add to list";
        field_m = new fta();
    }
}
