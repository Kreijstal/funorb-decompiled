/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class or extends bp implements ru {
    private int field_j;
    static int field_k;
    private int field_i;

    public final void a(boolean param0, boolean param1, boolean param2) {
        if (!param2) {
            field_k = 53;
        }
    }

    public final void a(ji param0, int param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "or.J(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static boolean a(byte param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (!Character.isISOControl(param1)) {
              if (!qw.a(57, param1)) {
                var6 = bs.field_o;
                var2 = var6;
                var3 = 0;
                L1: while (true) {
                  if (var6.length <= var3) {
                    var2 = fs.field_m;
                    var3 = 0;
                    L2: while (true) {
                      if (var2.length <= var3) {
                        stackOut_20_0 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        break L0;
                      } else {
                        var4 = var2[var3];
                        if (param1 == var4) {
                          stackOut_17_0 = 1;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0 != 0;
                        } else {
                          var3++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    var4 = var6[var3];
                    if (var4 != param1) {
                      var3++;
                      continue L1;
                    } else {
                      stackOut_10_0 = 1;
                      stackIn_11_0 = stackOut_10_0;
                      return stackIn_11_0 != 0;
                    }
                  }
                }
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2_ref, "or.S(" + 61 + 44 + param1 + 41);
        }
        return stackIn_21_0 != 0;
    }

    public final int b(int param0) {
        if (param0 != -16625) {
            return 22;
        }
        return ((or) this).field_i;
    }

    public final float a(float param0, int param1) {
        if (param1 >= -10) {
            return 0.9796783924102783f;
        }
        return param0;
    }

    public final int a(byte param0) {
        int var2 = 7 / ((-39 - param0) / 40);
        return ((or) this).field_j;
    }

    public final void a(int param0) {
        super.a(param0);
    }

    or(on param0, iw param1, io param2, int param3, int param4) {
        super(param0, 34037, param1, param2, param3 * param4, false);
        try {
            ((or) this).field_i = param3;
            ((or) this).field_j = param4;
            ((or) this).field_e.a((ed) this, 92);
            jaggl.OpenGL.glTexImage2Dub(((or) this).field_h, 0, ((or) this).e(-27), param3, param4, 0, te.a(-21339, ((or) this).field_c), ws.a(((or) this).field_g, (byte) 119), (byte[]) null, 0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "or.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    or(on param0, iw param1, int param2, int param3, byte[] param4, int param5, int param6) {
        super(param0, 34037, param1, io.field_g, param2 * param3, false);
        try {
            ((or) this).field_i = param2;
            ((or) this).field_j = param3;
            ((or) this).field_e.a((ed) this, 113);
            jaggl.OpenGL.glPixelStorei(3317, 1);
            jaggl.OpenGL.glPixelStorei(3314, param6);
            jaggl.OpenGL.glTexImage2Dub(((or) this).field_h, 0, ((or) this).e(-8), param2, param3, 0, te.a(-21339, ((or) this).field_c), 5121, param4, param5);
            jaggl.OpenGL.glPixelStorei(3314, 0);
            jaggl.OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "or.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 44 + param6 + 41);
        }
    }

    public final float b(float param0, int param1) {
        if (param1 != -19230) {
            return 1.154227375984192f;
        }
        return param0;
    }

    public final boolean c(int param0) {
        if (param0 != -24722) {
            return false;
        }
        return false;
    }

    or(on param0, iw param1, int param2, int param3, float[] param4, int param5, int param6) {
        super(param0, 34037, param1, io.field_d, param2 * param3, false);
        try {
            ((or) this).field_j = param3;
            ((or) this).field_i = param2;
            ((or) this).field_e.a((ed) this, 95);
            jaggl.OpenGL.glPixelStorei(3314, param6);
            jaggl.OpenGL.glTexImage2Df(((or) this).field_h, 0, ((or) this).e(-103), param2, param3, 0, te.a(-21339, ((or) this).field_c), 5126, param4, param5 * 4);
            jaggl.OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "or.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 44 + param6 + 41);
        }
    }

    or(on param0, int param1, int param2, int[] param3, int param4, int param5) {
        super(param0, 34037, nl.field_p, io.field_g, param2 * param1, false);
        try {
            ((or) this).field_j = param2;
            ((or) this).field_i = param1;
            ((or) this).field_e.a((ed) this, 93);
            jaggl.OpenGL.glPixelStorei(3314, param5);
            jaggl.OpenGL.glTexImage2Di(((or) this).field_h, 0, 6408, ((or) this).field_i, ((or) this).field_j, 0, 32993, ((or) this).field_e.field_Ec, param3, 4 * param4);
            jaggl.OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "or.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 20;
    }
}
