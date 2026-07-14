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
        super.a(param0, param1);
    }

    final static boolean a(byte param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        char[] var7 = null;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (!Character.isISOControl(param1)) {
          if (!qw.a(57, param1)) {
            var10 = bs.field_o;
            var7 = var10;
            var6 = var7;
            var2 = var6;
            if (param0 == 61) {
              var3 = 0;
              L0: while (true) {
                if (var10.length <= var3) {
                  var12 = fs.field_m;
                  var3 = 0;
                  L1: while (true) {
                    if (var12.length > var3) {
                      var4 = var12[var3];
                      if (param1 == var4) {
                        return true;
                      } else {
                        var3++;
                        continue L1;
                      }
                    } else {
                      return false;
                    }
                  }
                } else {
                  var4 = var10[var3];
                  if (var4 != param1) {
                    var3++;
                    continue L0;
                  } else {
                    return true;
                  }
                }
              }
            } else {
              field_k = -127;
              var3 = 0;
              L2: while (true) {
                if (var10.length <= var3) {
                  var11 = fs.field_m;
                  var3 = 0;
                  L3: while (true) {
                    if (var11.length > var3) {
                      var4 = var11[var3];
                      if (param1 == var4) {
                        return true;
                      } else {
                        var3++;
                        continue L3;
                      }
                    } else {
                      return false;
                    }
                  }
                } else {
                  var4 = var10[var3];
                  if (var4 != param1) {
                    var3++;
                    continue L2;
                  } else {
                    return true;
                  }
                }
              }
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
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
        ((or) this).field_i = param3;
        ((or) this).field_j = param4;
        ((or) this).field_e.a((ed) this, 92);
        jaggl.OpenGL.glTexImage2Dub(((or) this).field_h, 0, ((or) this).e(-27), param3, param4, 0, te.a(-21339, ((or) this).field_c), ws.a(((or) this).field_g, (byte) 119), (byte[]) null, 0);
    }

    or(on param0, iw param1, int param2, int param3, byte[] param4, int param5, int param6) {
        super(param0, 34037, param1, io.field_g, param2 * param3, false);
        ((or) this).field_i = param2;
        ((or) this).field_j = param3;
        ((or) this).field_e.a((ed) this, 113);
        jaggl.OpenGL.glPixelStorei(3317, 1);
        jaggl.OpenGL.glPixelStorei(3314, param6);
        jaggl.OpenGL.glTexImage2Dub(((or) this).field_h, 0, ((or) this).e(-8), param2, param3, 0, te.a(-21339, ((or) this).field_c), 5121, param4, param5);
        jaggl.OpenGL.glPixelStorei(3314, 0);
        jaggl.OpenGL.glPixelStorei(3317, 4);
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
        ((or) this).field_j = param3;
        ((or) this).field_i = param2;
        ((or) this).field_e.a((ed) this, 95);
        jaggl.OpenGL.glPixelStorei(3314, param6);
        jaggl.OpenGL.glTexImage2Df(((or) this).field_h, 0, ((or) this).e(-103), param2, param3, 0, te.a(-21339, ((or) this).field_c), 5126, param4, param5 * 4);
        jaggl.OpenGL.glPixelStorei(3314, 0);
    }

    or(on param0, int param1, int param2, int[] param3, int param4, int param5) {
        super(param0, 34037, nl.field_p, io.field_g, param2 * param1, false);
        ((or) this).field_j = param2;
        ((or) this).field_i = param1;
        ((or) this).field_e.a((ed) this, 93);
        jaggl.OpenGL.glPixelStorei(3314, param5);
        jaggl.OpenGL.glTexImage2Di(((or) this).field_h, 0, 6408, ((or) this).field_i, ((or) this).field_j, 0, 32993, ((or) this).field_e.field_Ec, param3, 4 * param4);
        jaggl.OpenGL.glPixelStorei(3314, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 20;
    }
}
