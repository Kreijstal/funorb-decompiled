/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends bp implements ru {
    static boolean field_j;
    private int field_i;
    private int field_k;

    final void a(iw param0, int param1, byte param2, int param3, byte[] param4, int param5, int param6, int param7, int param8) {
        ((sa) this).field_e.a((ed) this, param2 ^ 43);
        jaggl.OpenGL.glPixelStorei(3317, 1);
        jaggl.OpenGL.glPixelStorei(3314, param8);
        jaggl.OpenGL.glTexSubImage2Dub(((sa) this).field_h, 0, param1, param7, param6, param5, te.a(param2 + -21416, param0), 5121, param4, param3);
        jaggl.OpenGL.glPixelStorei(3314, 0);
        if (param2 != 77) {
            field_j = true;
        } else {
            jaggl.OpenGL.glPixelStorei(3317, 4);
            return;
        }
        jaggl.OpenGL.glPixelStorei(3317, 4);
    }

    public final void a(int param0) {
        super.a(param0);
    }

    public final float a(float param0, int param1) {
        if (param1 > -10) {
            ((sa) this).field_k = 68;
            return param0 / (float)((sa) this).field_i;
        }
        return param0 / (float)((sa) this).field_i;
    }

    sa(on param0, iw param1, io param2, int param3, int param4) {
        super(param0, 3553, param1, param2, param4 * param3, false);
        ((sa) this).field_i = param3;
        ((sa) this).field_k = param4;
        ((sa) this).field_e.a((ed) this, 108);
        jaggl.OpenGL.glTexImage2Dub(((sa) this).field_h, 0, ((sa) this).e(-67), param3, param4, 0, te.a(-21339, ((sa) this).field_c), ws.a(((sa) this).field_g, (byte) 117), (byte[]) null, 0);
    }

    public final float b(float param0, int param1) {
        if (param1 != -19230) {
            ((sa) this).field_i = -80;
            return param0 / (float)((sa) this).field_k;
        }
        return param0 / (float)((sa) this).field_k;
    }

    public final void a(boolean param0, boolean param1, boolean param2) {
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
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
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        if (!param2) {
          L0: {
            field_j = true;
            ((sa) this).field_e.a((ed) this, 91);
            stackOut_8_0 = ((sa) this).field_h;
            stackOut_8_1 = 10242;
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (!param1) {
              stackOut_10_0 = stackIn_10_0;
              stackOut_10_1 = stackIn_10_1;
              stackOut_10_2 = 33071;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L0;
            } else {
              stackOut_9_0 = stackIn_9_0;
              stackOut_9_1 = stackIn_9_1;
              stackOut_9_2 = 10497;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L0;
            }
          }
          L1: {
            jaggl.OpenGL.glTexParameteri(stackIn_11_0, stackIn_11_1, stackIn_11_2);
            stackOut_11_0 = ((sa) this).field_h;
            stackOut_11_1 = 10243;
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0) {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = stackIn_13_1;
              stackOut_13_2 = 10497;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = stackIn_12_1;
              stackOut_12_2 = 33071;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          jaggl.OpenGL.glTexParameteri(stackIn_14_0, stackIn_14_1, stackIn_14_2);
          return;
        } else {
          L2: {
            ((sa) this).field_e.a((ed) this, 91);
            stackOut_1_0 = ((sa) this).field_h;
            stackOut_1_1 = 10242;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_2_0 = stackOut_1_0;
            stackIn_2_1 = stackOut_1_1;
            if (!param1) {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = stackIn_3_1;
              stackOut_3_2 = 33071;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              break L2;
            } else {
              stackOut_2_0 = stackIn_2_0;
              stackOut_2_1 = stackIn_2_1;
              stackOut_2_2 = 10497;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              break L2;
            }
          }
          L3: {
            jaggl.OpenGL.glTexParameteri(stackIn_4_0, stackIn_4_1, stackIn_4_2);
            stackOut_4_0 = ((sa) this).field_h;
            stackOut_4_1 = 10243;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0) {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = stackIn_6_1;
              stackOut_6_2 = 10497;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L3;
            } else {
              stackOut_5_0 = stackIn_5_0;
              stackOut_5_1 = stackIn_5_1;
              stackOut_5_2 = 33071;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L3;
            }
          }
          jaggl.OpenGL.glTexParameteri(stackIn_7_0, stackIn_7_1, stackIn_7_2);
          return;
        }
    }

    sa(on param0, iw param1, int param2, int param3, boolean param4, float[] param5, int param6, int param7) {
        super(param0, 3553, param1, io.field_d, param2 * param3, param4);
        L0: {
          L1: {
            ((sa) this).field_i = param2;
            ((sa) this).field_k = param3;
            ((sa) this).field_e.a((ed) this, 109);
            if (param4) {
              break L1;
            } else {
              if (param7 != 0) {
                break L1;
              } else {
                if (param6 == 0) {
                  ((sa) this).a(((sa) this).field_h, param3, -117, param2, param5);
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          jaggl.OpenGL.glPixelStorei(3314, param7);
          jaggl.OpenGL.glTexImage2Df(((sa) this).field_h, 0, ((sa) this).e(-8), param2, param3, 0, te.a(-21339, ((sa) this).field_c), 5126, param5, 4 * param6);
          jaggl.OpenGL.glPixelStorei(3314, 0);
          break L0;
        }
    }

    sa(on param0, int param1, int param2, boolean param3, int[] param4, int param5, int param6) {
        super(param0, 3553, nl.field_p, io.field_g, param1 * param2, param3);
        ((sa) this).field_k = param2;
        ((sa) this).field_i = param1;
        ((sa) this).field_e.a((ed) this, 125);
        if (param3) {
            // if_icmpne L121
            // if_icmpne L172
            ((sa) this).a(param2, param1, param4, ((sa) this).field_h, -1);
        }
        jaggl.OpenGL.glPixelStorei(3314, param6);
        jaggl.OpenGL.glTexImage2Di(((sa) this).field_h, 0, 6408, ((sa) this).field_i, ((sa) this).field_k, 0, 32993, ((sa) this).field_e.field_Ec, param4, 4 * param5);
        jaggl.OpenGL.glPixelStorei(3314, 0);
        jaggl.OpenGL.glPixelStorei(3314, param6);
        jaggl.OpenGL.glTexImage2Di(((sa) this).field_h, 0, 6408, ((sa) this).field_i, ((sa) this).field_k, 0, 32993, ((sa) this).field_e.field_Ec, param4, 4 * param5);
        jaggl.OpenGL.glPixelStorei(3314, 0);
        jaggl.OpenGL.glPixelStorei(3314, param6);
        jaggl.OpenGL.glTexImage2Di(((sa) this).field_h, 0, 6408, ((sa) this).field_i, ((sa) this).field_k, 0, 32993, ((sa) this).field_e.field_Ec, param4, 4 * param5);
        jaggl.OpenGL.glPixelStorei(3314, 0);
    }

    public final boolean c(int param0) {
        if (param0 != -24722) {
            ((sa) this).field_k = 91;
            return true;
        }
        return true;
    }

    public final int a(byte param0) {
        int var2 = -100 % ((param0 - -39) / 40);
        return ((sa) this).field_k;
    }

    public final void a(ji param0, int param1) {
        if (param1 != 15149) {
          float discarded$2 = ((sa) this).b(0.2777647376060486f, 21);
          super.a(param0, param1 + 0);
          return;
        } else {
          super.a(param0, param1 + 0);
          return;
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4, int[] param5, int param6, int param7) {
        ((sa) this).field_e.a((ed) this, 123);
        jaggl.OpenGL.glPixelStorei(3314, param4);
        jaggl.OpenGL.glTexSubImage2Di(((sa) this).field_h, 0, param7, param6, param3, param0, 32993, ((sa) this).field_e.field_Ec, param5, param2);
        if (param1) {
          return;
        } else {
          jaggl.OpenGL.glPixelStorei(3314, 0);
          return;
        }
    }

    sa(on param0, iw param1, int param2, int param3, boolean param4, byte[] param5, int param6, int param7) {
        super(param0, 3553, param1, io.field_g, param2 * param3, param4);
        L0: {
          ((sa) this).field_k = param3;
          ((sa) this).field_i = param2;
          ((sa) this).field_e.a((ed) this, 109);
          jaggl.OpenGL.glPixelStorei(3317, 1);
          if (!param4) {
            break L0;
          } else {
            if (0 != param7) {
              break L0;
            } else {
              if (0 == param6) {
                ((sa) this).a(param5, param2, ((sa) this).field_h, param3, 81);
                jaggl.OpenGL.glPixelStorei(3317, 4);
              } else {
                break L0;
              }
            }
          }
        }
        jaggl.OpenGL.glPixelStorei(3314, param7);
        jaggl.OpenGL.glTexImage2Dub(((sa) this).field_h, 0, ((sa) this).e(104), param2, param3, 0, te.a(-21339, ((sa) this).field_c), 5121, param5, param6);
        jaggl.OpenGL.glPixelStorei(3314, 0);
        jaggl.OpenGL.glPixelStorei(3317, 4);
    }

    public final int b(int param0) {
        if (param0 != -16625) {
            return 83;
        }
        return ((sa) this).field_i;
    }

    final void a(int param0, iw param1, int param2, int param3, int param4, int param5, int param6, float[] param7, int param8) {
        ((sa) this).field_e.a((ed) this, param4 + -14032);
        jaggl.OpenGL.glPixelStorei(3314, param8);
        jaggl.OpenGL.glTexSubImage2Df(((sa) this).field_h, 0, param0, param3, param6, param2, te.a(-21339, param1), 5121, param7, param5);
        jaggl.OpenGL.glPixelStorei(3314, 0);
        if (param4 != 14137) {
            field_j = false;
        }
    }

    static {
    }
}
