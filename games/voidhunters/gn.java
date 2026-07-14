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
        ((gn) this).field_j = param3;
        ((gn) this).field_l = param2;
        ((gn) this).field_h.a((ura) this, -108);
        jaggl.OpenGL.glPixelStorei(3314, param6);
        jaggl.OpenGL.glTexImage2Df(((gn) this).field_e, 0, ((gn) this).e((byte) -31), param2, param3, 0, una.a(-29328, ((gn) this).field_f), 5126, param4, 4 * param5);
        jaggl.OpenGL.glPixelStorei(3314, 0);
    }

    public final void a(tu param0, int param1) {
        super.a(param0, param1);
    }

    public final void a(boolean param0, byte param1, boolean param2) {
        if (param1 != -98) {
            field_k = null;
        }
    }

    public final void b(int param0) {
        super.b(param0);
    }

    gn(jp param0, int param1, int param2, int[] param3, int param4, int param5) {
        super(param0, 34037, qua.field_d, mj.field_f, param2 * param1, false);
        ((gn) this).field_j = param2;
        ((gn) this).field_l = param1;
        ((gn) this).field_h.a((ura) this, -112);
        jaggl.OpenGL.glPixelStorei(3314, param5);
        jaggl.OpenGL.glTexImage2Di(((gn) this).field_e, 0, 6408, ((gn) this).field_l, ((gn) this).field_j, 0, 32993, ((gn) this).field_h.field_Nc, param3, param4 * 4);
        jaggl.OpenGL.glPixelStorei(3314, 0);
    }

    gn(jp param0, kb param1, int param2, int param3, byte[] param4, int param5, int param6) {
        super(param0, 34037, param1, mj.field_f, param3 * param2, false);
        ((gn) this).field_l = param2;
        ((gn) this).field_j = param3;
        ((gn) this).field_h.a((ura) this, -108);
        jaggl.OpenGL.glPixelStorei(3317, 1);
        jaggl.OpenGL.glPixelStorei(3314, param6);
        jaggl.OpenGL.glTexImage2Dub(((gn) this).field_e, 0, ((gn) this).e((byte) -31), param2, param3, 0, una.a(-29328, ((gn) this).field_f), 5121, param4, param5);
        jaggl.OpenGL.glPixelStorei(3314, 0);
        jaggl.OpenGL.glPixelStorei(3317, 4);
    }

    public final float a(float param0, int param1) {
        if (param1 != -1080) {
            ((gn) this).field_j = -47;
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
        ntb[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        ksa[] var6 = null;
        var5 = VoidHunters.field_G;
        if (param1 == null) {
          return null;
        } else {
          var6 = param1.f(param0 + -4872);
          var2 = var6;
          var3 = new ntb[var6.length];
          var4 = param0;
          L0: while (true) {
            if (var6.length <= var4) {
              return var3;
            } else {
              var3[var4] = (ntb) (Object) var6[var4];
              var4++;
              continue L0;
            }
          }
        }
    }

    public final void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, byte param7) {
        if (param7 < -78) {
          L0: {
            ((gn) this).field_h.a((ura) this, -121);
            if (param4 != 0) {
              break L0;
            } else {
              param4 = param2;
              break L0;
            }
          }
          L1: {
            if (param2 != param4) {
              jaggl.OpenGL.glPixelStorei(3314, param4);
              break L1;
            } else {
              break L1;
            }
          }
          jaggl.OpenGL.glTexSubImage2Di(((gn) this).field_e, 0, param6, param0, param2, param1, 32993, ((gn) this).field_h.field_Nc, param5, param3);
          if (param2 != param4) {
            jaggl.OpenGL.glPixelStorei(3314, 0);
            return;
          } else {
            return;
          }
        } else {
          L2: {
            float discarded$7 = ((gn) this).a(-1.5097984075546265f, 96);
            ((gn) this).field_h.a((ura) this, -121);
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
          jaggl.OpenGL.glTexSubImage2Di(((gn) this).field_e, 0, param6, param0, param2, param1, 32993, ((gn) this).field_h.field_Nc, param5, param3);
          if (param2 == param4) {
            return;
          } else {
            jaggl.OpenGL.glPixelStorei(3314, 0);
            return;
          }
        }
    }

    gn(jp param0, kb param1, mj param2, int param3, int param4) {
        super(param0, 34037, param1, param2, param3 * param4, false);
        ((gn) this).field_j = param4;
        ((gn) this).field_l = param3;
        ((gn) this).field_h.a((ura) this, -109);
        jaggl.OpenGL.glTexImage2Dub(((gn) this).field_e, 0, ((gn) this).e((byte) -31), param3, param4, 0, una.a(-29328, ((gn) this).field_f), od.a(true, ((gn) this).field_b), (byte[]) null, 0);
    }

    public final int b(byte param0) {
        if (param0 != 113) {
            ((gn) this).field_l = -45;
            return ((gn) this).field_l;
        }
        return ((gn) this).field_l;
    }

    public final float b(float param0, int param1) {
        if (param1 <= 58) {
            ((gn) this).field_l = 118;
            return param0;
        }
        return param0;
    }

    public final int a(byte param0) {
        if (param0 >= -40) {
            return 85;
        }
        return ((gn) this).field_j;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new gl(4);
    }
}
