/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends tfa implements gf {
    static fta field_m;
    static String field_k;
    private int field_l;
    private int field_n;

    final static String[] a(uia param0, byte param1) {
        int var3_int = 0;
        String[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        vna var6 = null;
        String[] var7 = null;
        String[] var8 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        var6 = new vna();
        if (param1 >= 32) {
          L0: while (true) {
            if (param0.field_h >= param0.field_g.length) {
              var7 = new String[var6.a((byte) -16)];
              var3 = var7;
              var4 = 0;
              L1: while (true) {
                if (var7.length <= var4) {
                  return var3;
                } else {
                  var3[var4] = ((gka) (Object) var6.c(-103)).field_h;
                  var4++;
                  continue L1;
                }
              }
            } else {
              var3_int = w.a(param0, -58, var6);
              if (!qqa.a(param0, mga.field_j, var3_int, true)) {
                continue L0;
              } else {
                param0.field_h = param0.field_h + (mga.field_j.length - 1);
                var8 = new String[var6.a((byte) -16)];
                var3 = var8;
                var4 = 0;
                L2: while (true) {
                  if (var8.length <= var4) {
                    return var3;
                  } else {
                    var3[var4] = ((gka) (Object) var6.c(-103)).field_h;
                    var4++;
                    continue L2;
                  }
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    pe(kda param0, ft param1, una param2, int param3, int param4) {
        super(param0, 34037, param1, param2, param3 * param4, false);
        ((pe) this).field_l = param3;
        ((pe) this).field_n = param4;
        ((pe) this).field_j.a(true, (iva) this);
        jaggl.OpenGL.glTexImage2Dub(((pe) this).field_i, 0, ((pe) this).d(78), param3, param4, 0, waa.a(((pe) this).field_f, 1383), lr.a(((pe) this).field_a, 5126), (byte[]) null, 0);
    }

    final static int a(boolean param0, int param1, String param2, int param3, String param4, String param5, byte param6) {
        goa var7 = null;
        goa var8 = null;
        var7 = new goa(param4);
        var8 = new goa(param2);
        if (param6 != 53) {
          field_m = null;
          return fja.a(var8, param5, param0, param1, var7, param6 + 48, param3);
        } else {
          return fja.a(var8, param5, param0, param1, var7, param6 + 48, param3);
        }
    }

    public final void a(int param0, hs param1) {
        super.a(param0, param1);
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
        ((pe) this).field_n = param3;
        ((pe) this).field_l = param2;
        ((pe) this).field_j.a(true, (iva) this);
        jaggl.OpenGL.glPixelStorei(3317, 1);
        jaggl.OpenGL.glPixelStorei(3314, param6);
        jaggl.OpenGL.glTexImage2Dub(((pe) this).field_i, 0, ((pe) this).d(125), param2, param3, 0, waa.a(((pe) this).field_f, 1383), 5121, param4, param5);
        jaggl.OpenGL.glPixelStorei(3314, 0);
        jaggl.OpenGL.glPixelStorei(3317, 4);
    }

    public final float a(int param0, float param1) {
        if (param0 <= 60) {
            return -1.0163322687149048f;
        }
        return param1;
    }

    pe(kda param0, int param1, int param2, int[] param3, int param4, int param5) {
        super(param0, 34037, gpa.field_a, una.field_g, param1 * param2, false);
        ((pe) this).field_l = param1;
        ((pe) this).field_n = param2;
        ((pe) this).field_j.a(true, (iva) this);
        jaggl.OpenGL.glPixelStorei(3314, param5);
        jaggl.OpenGL.glTexImage2Di(((pe) this).field_i, 0, 6408, ((pe) this).field_l, ((pe) this).field_n, 0, 32993, ((pe) this).field_j.field_od, param3, param4 * 4);
        jaggl.OpenGL.glPixelStorei(3314, 0);
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
        if (param0 == 0) {
            return;
        }
        field_m = null;
    }

    pe(kda param0, ft param1, int param2, int param3, float[] param4, int param5, int param6) {
        super(param0, 34037, param1, una.field_h, param2 * param3, false);
        ((pe) this).field_n = param3;
        ((pe) this).field_l = param2;
        ((pe) this).field_j.a(true, (iva) this);
        jaggl.OpenGL.glPixelStorei(3314, param6);
        jaggl.OpenGL.glTexImage2Df(((pe) this).field_i, 0, ((pe) this).d(75), param2, param3, 0, waa.a(((pe) this).field_f, 1383), 5126, param4, 4 * param5);
        jaggl.OpenGL.glPixelStorei(3314, 0);
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
