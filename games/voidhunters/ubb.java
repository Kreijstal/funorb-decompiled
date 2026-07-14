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
        ((ubb) this).field_m = param3;
        ((ubb) this).field_l = param2;
        ((ubb) this).field_h.a((ura) this, -111);
        if (!param4) {
            // if_icmpne L126
            // ifne L179
            ((ubb) this).a(((ubb) this).field_e, param5, param3, param2, (byte) -67);
        }
        jaggl.OpenGL.glPixelStorei(3314, param7);
        jaggl.OpenGL.glTexImage2Df(((ubb) this).field_e, 0, ((ubb) this).e((byte) -31), param2, param3, 0, una.a(-29328, ((ubb) this).field_f), 5126, param5, 4 * param6);
        jaggl.OpenGL.glPixelStorei(3314, 0);
        jaggl.OpenGL.glPixelStorei(3314, param7);
        jaggl.OpenGL.glTexImage2Df(((ubb) this).field_e, 0, ((ubb) this).e((byte) -31), param2, param3, 0, una.a(-29328, ((ubb) this).field_f), 5126, param5, 4 * param6);
        jaggl.OpenGL.glPixelStorei(3314, 0);
        jaggl.OpenGL.glPixelStorei(3314, param7);
        jaggl.OpenGL.glTexImage2Df(((ubb) this).field_e, 0, ((ubb) this).e((byte) -31), param2, param3, 0, una.a(-29328, ((ubb) this).field_f), 5126, param5, 4 * param6);
        jaggl.OpenGL.glPixelStorei(3314, 0);
    }

    final void a(int param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, kb param8) {
        ((ubb) this).field_h.a((ura) this, -116);
        jaggl.OpenGL.glPixelStorei(3317, 1);
        jaggl.OpenGL.glPixelStorei(param6, param0);
        jaggl.OpenGL.glTexSubImage2Dub(((ubb) this).field_e, 0, param7, param5, param3, param2, una.a(param6 ^ -32382, param8), 5121, param1, param4);
        jaggl.OpenGL.glPixelStorei(3314, 0);
        jaggl.OpenGL.glPixelStorei(3317, 4);
    }

    ubb(jp param0, kb param1, mj param2, int param3, int param4) {
        super(param0, 3553, param1, param2, param4 * param3, false);
        ((ubb) this).field_m = param4;
        ((ubb) this).field_l = param3;
        ((ubb) this).field_h.a((ura) this, -118);
        jaggl.OpenGL.glTexImage2Dub(((ubb) this).field_e, 0, ((ubb) this).e((byte) -31), param3, param4, 0, una.a(-29328, ((ubb) this).field_f), od.a(true, ((ubb) this).field_b), (byte[]) null, 0);
    }

    public final float b(float param0, int param1) {
        if (param1 <= 58) {
            return 0.2576850950717926f;
        }
        return param0 / (float)((ubb) this).field_m;
    }

    public final float a(float param0, int param1) {
        if (param1 != -1080) {
          ((ubb) this).a(false, (byte) 127, false);
          return param0 / (float)((ubb) this).field_l;
        } else {
          return param0 / (float)((ubb) this).field_l;
        }
    }

    public final void a(tu param0, int param1) {
        super.a(param0, param1 ^ 0);
        if (param1 != -28798) {
            field_j = null;
        }
    }

    public final void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, byte param7) {
        ((ubb) this).field_h.a((ura) this, -121);
        jaggl.OpenGL.glPixelStorei(3314, param4);
        jaggl.OpenGL.glTexSubImage2Di(((ubb) this).field_e, 0, param6, param0, param2, param1, 32993, ((ubb) this).field_h.field_Nc, param5, param3);
        if (param7 >= -78) {
            ((ubb) this).field_m = 42;
        } else {
            jaggl.OpenGL.glPixelStorei(3314, 0);
            return;
        }
        jaggl.OpenGL.glPixelStorei(3314, 0);
    }

    final static void a(String param0, int param1) {
        if (!(!nia.field_o)) {
            System.out.print(param0);
        }
        if (param1 != 0) {
            Object var3 = null;
            ubb.a((String) null, 70);
            return;
        }
    }

    ubb(jp param0, kb param1, int param2, int param3, boolean param4, byte[] param5, int param6, int param7) {
        super(param0, 3553, param1, mj.field_f, param3 * param2, param4);
        ((ubb) this).field_m = param3;
        ((ubb) this).field_l = param2;
        ((ubb) this).field_h.a((ura) this, -110);
        jaggl.OpenGL.glPixelStorei(3317, 1);
        if (!param4) {
          jaggl.OpenGL.glPixelStorei(3314, param7);
          jaggl.OpenGL.glTexImage2Dub(((ubb) this).field_e, 0, ((ubb) this).e((byte) -31), param2, param3, 0, una.a(-29328, ((ubb) this).field_f), 5121, param5, param6);
          jaggl.OpenGL.glPixelStorei(3314, 0);
          jaggl.OpenGL.glPixelStorei(3317, 4);
        } else {
          if (-1 != param7) {
            jaggl.OpenGL.glPixelStorei(3314, param7);
            jaggl.OpenGL.glTexImage2Dub(((ubb) this).field_e, 0, ((ubb) this).e((byte) -31), param2, param3, 0, una.a(-29328, ((ubb) this).field_f), 5121, param5, param6);
            jaggl.OpenGL.glPixelStorei(3314, 0);
            jaggl.OpenGL.glPixelStorei(3317, 4);
          } else {
            if (-1 != param6) {
              jaggl.OpenGL.glPixelStorei(3314, param7);
              jaggl.OpenGL.glTexImage2Dub(((ubb) this).field_e, 0, ((ubb) this).e((byte) -31), param2, param3, 0, una.a(-29328, ((ubb) this).field_f), 5121, param5, param6);
              jaggl.OpenGL.glPixelStorei(3314, 0);
              jaggl.OpenGL.glPixelStorei(3317, 4);
            } else {
              ((ubb) this).a(((ubb) this).field_e, param3, param5, 0, param2);
              jaggl.OpenGL.glPixelStorei(3317, 4);
            }
          }
        }
    }

    public final boolean a(int param0) {
        int var2 = 24 % ((-92 - param0) / 34);
        return true;
    }

    public final void a(boolean param0, byte param1, boolean param2) {
        int stackIn_1_0 = 0;
        int stackIn_1_1 = 0;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackOut_0_0 = 0;
        int stackOut_0_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        L0: {
          ((ubb) this).field_h.a((ura) this, -121);
          stackOut_0_0 = ((ubb) this).field_e;
          stackOut_0_1 = 10242;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          if (!param0) {
            stackOut_2_0 = stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = 33071;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            break L0;
          } else {
            stackOut_1_0 = stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = 10497;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            break L0;
          }
        }
        jaggl.OpenGL.glTexParameteri(stackIn_3_0, stackIn_3_1, stackIn_3_2);
        if (param1 != -98) {
          L1: {
            int discarded$10 = ((ubb) this).a((byte) 80);
            stackOut_8_0 = ((ubb) this).field_e;
            stackOut_8_1 = 10243;
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2) {
              stackOut_10_0 = stackIn_10_0;
              stackOut_10_1 = stackIn_10_1;
              stackOut_10_2 = 10497;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = stackIn_9_0;
              stackOut_9_1 = stackIn_9_1;
              stackOut_9_2 = 33071;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          jaggl.OpenGL.glTexParameteri(stackIn_11_0, stackIn_11_1, stackIn_11_2);
          return;
        } else {
          L2: {
            stackOut_4_0 = ((ubb) this).field_e;
            stackOut_4_1 = 10243;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2) {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = stackIn_6_1;
              stackOut_6_2 = 10497;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = stackIn_5_0;
              stackOut_5_1 = stackIn_5_1;
              stackOut_5_2 = 33071;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          jaggl.OpenGL.glTexParameteri(stackIn_7_0, stackIn_7_1, stackIn_7_2);
          return;
        }
    }

    ubb(jp param0, int param1, int param2, boolean param3, int[] param4, int param5, int param6) {
        super(param0, 3553, qua.field_d, mj.field_f, param2 * param1, param3);
        L0: {
          L1: {
            ((ubb) this).field_m = param2;
            ((ubb) this).field_l = param1;
            ((ubb) this).field_h.a((ura) this, -111);
            if (!param3) {
              break L1;
            } else {
              if (param6 != 0) {
                break L1;
              } else {
                if (param5 == 0) {
                  ((ubb) this).a((byte) 14, ((ubb) this).field_e, param2, param1, param4);
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          jaggl.OpenGL.glPixelStorei(3314, param6);
          jaggl.OpenGL.glTexImage2Di(((ubb) this).field_e, 0, 6408, ((ubb) this).field_l, ((ubb) this).field_m, 0, 32993, ((ubb) this).field_h.field_Nc, param4, 4 * param5);
          jaggl.OpenGL.glPixelStorei(3314, 0);
          break L0;
        }
    }

    public final int b(byte param0) {
        if (param0 != 113) {
            float discarded$0 = ((ubb) this).a(-1.557132363319397f, 85);
            return ((ubb) this).field_l;
        }
        return ((ubb) this).field_l;
    }

    public final void b(int param0) {
        if (param0 != -27445) {
            ((ubb) this).field_m = 72;
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
            field_k = null;
            return ((ubb) this).field_m;
        }
        return ((ubb) this).field_m;
    }

    final void a(int param0, kb param1, byte param2, int param3, float[] param4, int param5, int param6, int param7, int param8) {
        ((ubb) this).field_h.a((ura) this, -122);
        jaggl.OpenGL.glPixelStorei(3314, param3);
        jaggl.OpenGL.glTexSubImage2Df(((ubb) this).field_e, 0, param6, param5, param7, param0, una.a(-29328, param1), 5121, param4, param8);
        if (param2 >= -35) {
            ubb.f((byte) -66);
        } else {
            jaggl.OpenGL.glPixelStorei(3314, 0);
            return;
        }
        jaggl.OpenGL.glPixelStorei(3314, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Short arm";
    }
}
