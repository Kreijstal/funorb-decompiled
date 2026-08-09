/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends tfa implements gf {
    static fta field_m;
    static String field_k;
    private int field_l;
    private int field_n;

    final static String[] a(uia param0, byte param1) {
        int var5 = 0;
        vna var6 = null;
        String[] stackIn_3_0 = null;
        uia stackIn_6_0 = null;
        String[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3_int = 0;
        String[] var3 = null;
        int var4 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var6 = new vna();
            if (param1 >= 32) {
              stackIn_6_0 = (uia) (param0);
              L1: while (true) {
                L2: {
                  if (stackIn_6_0.field_h >= param0.field_g.length) {
                    break L2;
                  } else {
                    var3_int = w.a(param0, -58, var6);
                    if (!qqa.a(param0, mga.field_j, var3_int, true)) {
                      stackIn_6_0 = (uia) (param0);
                      continue L1;
                    } else {
                      param0.field_h = param0.field_h + (mga.field_j.length - 1);
                      break L2;
                    }
                  }
                }
                var3 = new String[var6.a((byte) -16)];
                var4 = 0;
                L3: while (true) {
                  if (var3.length <= var4) {
                    stackIn_13_0 = (String[]) (var3);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3[var4] = ((gka) ((Object) var6.c(-103))).field_h;
                    var4++;
                    continue L3;
                  }
                }
              }
            } else {
              stackIn_3_0 = (String[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("pe.K(");

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
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_13_0;
        }
    }

    pe(kda param0, ft param1, una param2, int param3, int param4) {
        super(param0, 34037, param1, param2, param3 * param4, false);
        try {
            this.field_l = param3;
            this.field_n = param4;
            this.field_j.a(true, (iva) (this));
            jaggl.OpenGL.glTexImage2Dub(this.field_i, 0, this.d(78), param3, param4, 0, waa.a(this.field_f, 1383), lr.a(this.field_a, 5126), (byte[]) null, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int a(boolean param0, int param1, String param2, int param3, String param4, String param5, byte param6) {
        goa var7 = null;
        RuntimeException var7_ref = null;
        goa var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var7 = new goa(param4);
              var8 = new goa(param2);
              if (param6 == 53) {
                break L1;
              } else {
                field_m = (fta) null;
                break L1;
              }
            }
            stackIn_3_0 = fja.a(var8, param5, param0, param1, var7, param6 + 48, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7_ref);

            stackIn_6_1 = new StringBuilder().append("pe.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param6 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(int param0, hs param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pe.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int b(int param0) {
        if (param0 != -7070) {
            this.a((byte) -45, true, false);
            return this.field_l;
        }
        return this.field_l;
    }

    pe(kda param0, ft param1, int param2, int param3, byte[] param4, int param5, int param6) {
        super(param0, 34037, param1, una.field_g, param2 * param3, false);
        try {
            this.field_n = param3;
            this.field_l = param2;
            this.field_j.a(true, (iva) (this));
            jaggl.OpenGL.glPixelStorei(3317, 1);
            jaggl.OpenGL.glPixelStorei(3314, param6);
            jaggl.OpenGL.glTexImage2Dub(this.field_i, 0, this.d(125), param2, param3, 0, waa.a(this.field_f, 1383), 5121, param4, param5);
            jaggl.OpenGL.glPixelStorei(3314, 0);
            jaggl.OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
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
            this.field_l = param1;
            this.field_n = param2;
            this.field_j.a(true, (iva) (this));
            jaggl.OpenGL.glPixelStorei(3314, param5);
            jaggl.OpenGL.glTexImage2Di(this.field_i, 0, 6408, this.field_l, this.field_n, 0, 32993, this.field_j.field_od, param3, param4 * 4);
            jaggl.OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    public final int a(byte param0) {
        if (param0 > 0) {
            return -120;
        }
        return this.field_n;
    }

    public final void b(byte param0) {
        if (param0 <= 32) {
            field_k = (String) null;
            super.b((byte) 72);
            return;
        }
        super.b((byte) 72);
    }

    public final void a(byte param0, boolean param1, boolean param2) {
        if (param0 <= -60) {
            return;
        }
        this.a(96);
    }

    public static void e(int param0) {
        field_m = null;
        field_k = null;
        if (param0 == 0) {
            return;
        }
        field_m = (fta) null;
    }

    pe(kda param0, ft param1, int param2, int param3, float[] param4, int param5, int param6) {
        super(param0, 34037, param1, una.field_h, param2 * param3, false);
        try {
            this.field_n = param3;
            this.field_l = param2;
            this.field_j.a(true, (iva) (this));
            jaggl.OpenGL.glPixelStorei(3314, param6);
            jaggl.OpenGL.glTexImage2Df(this.field_i, 0, this.d(75), param2, param3, 0, waa.a(this.field_f, 1383), 5126, param4, 4 * param5);
            jaggl.OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    public final boolean a(int param0) {
        if (param0 != -14634) {
            field_m = (fta) null;
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
        field_k = "Enter name of player to add to list";
        field_m = new fta();
    }
}
