/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm extends pa {
    private int field_k;
    private int field_a;
    private int field_b;
    el field_j;
    private wl field_g;
    private el field_f;
    private boolean field_e;
    private int field_c;
    private int field_d;
    static ia field_h;
    static int[] field_l;
    static int field_i;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        L0: {
          ((tm) this).field_j.a(false, -128);
          ((tm) this).field_g.g(1025208104);
          ((tm) this).field_g.b((byte) -113, param4);
          jaggl.OpenGL.glColor4ub((byte)(param3 >> 16), (byte)(param3 >> 8), (byte)param3, (byte)(param3 >> 24));
          param0 = param0 + ((tm) this).field_c;
          param1 = param1 + ((tm) this).field_a;
          if (((tm) this).field_f == null) {
            ((tm) this).field_g.a((rt) (Object) ((tm) this).field_j, 1);
            ((tm) this).field_g.a(param2, (byte) -39);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glTexCoord2f(0.0f, ((tm) this).field_j.field_p);
            jaggl.OpenGL.glVertex2i(param0, param1);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2i(param0, param1 - -((tm) this).field_j.field_o);
            jaggl.OpenGL.glTexCoord2f(((tm) this).field_j.field_r, 0.0f);
            jaggl.OpenGL.glVertex2i(param0 - -((tm) this).field_j.field_q, param1 + ((tm) this).field_j.field_o);
            jaggl.OpenGL.glTexCoord2f(((tm) this).field_j.field_r, ((tm) this).field_j.field_p);
            jaggl.OpenGL.glVertex2i(param0 - -((tm) this).field_j.field_q, param1);
            jaggl.OpenGL.glEnd();
            break L0;
          } else {
            this.a(false, param2);
            ((tm) this).field_f.a(false, -128);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, ((tm) this).field_j.field_p);
            jaggl.OpenGL.glTexCoord2f(0.0f, ((tm) this).field_j.field_p);
            jaggl.OpenGL.glVertex2i(param0, param1);
            jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2i(param0, ((tm) this).field_j.field_o + param1);
            jaggl.OpenGL.glMultiTexCoord2f(33985, ((tm) this).field_j.field_r, 0.0f);
            jaggl.OpenGL.glTexCoord2f(((tm) this).field_j.field_r, 0.0f);
            jaggl.OpenGL.glVertex2i(((tm) this).field_j.field_q + param0, ((tm) this).field_j.field_o + param1);
            jaggl.OpenGL.glMultiTexCoord2f(33985, ((tm) this).field_j.field_r, ((tm) this).field_j.field_p);
            jaggl.OpenGL.glTexCoord2f(((tm) this).field_j.field_r, ((tm) this).field_j.field_p);
            jaggl.OpenGL.glVertex2i(((tm) this).field_j.field_q + param0, param1);
            jaggl.OpenGL.glEnd();
            this.b(118);
            break L0;
          }
        }
    }

    final int c() {
        return ((tm) this).field_b + (((tm) this).field_j.field_o + ((tm) this).field_a);
    }

    final void a(int param0, int param1, int param2, int param3) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        L0: {
          L1: {
            ((tm) this).field_d = param2;
            ((tm) this).field_a = param1;
            ((tm) this).field_c = param0;
            ((tm) this).field_b = param3;
            stackOut_0_0 = this;
            stackIn_5_0 = stackOut_0_0;
            stackIn_1_0 = stackOut_0_0;
            if (((tm) this).field_c != 0) {
              break L1;
            } else {
              stackOut_1_0 = this;
              stackIn_5_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (((tm) this).field_a != 0) {
                break L1;
              } else {
                stackOut_2_0 = this;
                stackIn_5_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (((tm) this).field_d != 0) {
                  break L1;
                } else {
                  stackOut_3_0 = this;
                  stackIn_6_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (((tm) this).field_b == 0) {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L0;
                  } else {
                    stackOut_4_0 = this;
                    stackIn_5_0 = stackOut_4_0;
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_5_0 = this;
          stackOut_5_1 = 1;
          stackIn_7_0 = stackOut_5_0;
          stackIn_7_1 = stackOut_5_1;
          break L0;
        }
        ((tm) this).field_e = stackIn_7_1 != 0;
    }

    final void a(float param0, float param1, float param2, float param3, float param4, float param5, int param6, int param7, int param8, int param9) {
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        float var21 = 0.0f;
        float var22 = 0.0f;
        float var23 = 0.0f;
        float var24 = 0.0f;
        el stackIn_4_0 = null;
        el stackIn_5_0 = null;
        el stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        el stackOut_3_0 = null;
        el stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        el stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          if (((tm) this).field_e) {
            var11 = (float)((tm) this).d();
            var12 = (float)((tm) this).c();
            var13 = (param2 - param0) / var11;
            var14 = (param3 - param1) / var11;
            var15 = (-param0 + param4) / var12;
            var16 = (param5 - param1) / var12;
            var17 = var15 * (float)((tm) this).field_a;
            var18 = (float)((tm) this).field_a * var16;
            var19 = (float)((tm) this).field_c * var13;
            var20 = (float)((tm) this).field_c * var14;
            var21 = (float)((tm) this).field_d * -var13;
            var22 = -var14 * (float)((tm) this).field_d;
            var23 = -var15 * (float)((tm) this).field_b;
            param0 = var17 + (param0 + var19);
            param2 = param2 + var21 + var17;
            param4 = var23 + (var19 + param4);
            var24 = -var16 * (float)((tm) this).field_b;
            param3 = var18 + (var22 + param3);
            param1 = var18 + (param1 + var20);
            param5 = var24 + (var20 + param5);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var11 = param4 + (-param0 + param2);
          stackOut_3_0 = ((tm) this).field_j;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if ((1 & param9) == 0) {
            stackOut_5_0 = (el) (Object) stackIn_5_0;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = (el) (Object) stackIn_4_0;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        ((el) (Object) stackIn_6_0).a(stackIn_6_1 != 0, -128);
        var12 = param3 + (-param1 + param5);
        ((tm) this).field_g.g(1025208104);
        ((tm) this).field_g.a((rt) (Object) ((tm) this).field_j, 1);
        ((tm) this).field_g.b((byte) -126, param8);
        ((tm) this).field_g.a(param6, (byte) -39);
        jaggl.OpenGL.glColor4ub((byte)(param7 >> 16), (byte)(param7 >> 8), (byte)param7, (byte)(param7 >> 24));
        jaggl.OpenGL.glBegin(7);
        jaggl.OpenGL.glTexCoord2f(0.0f, ((tm) this).field_j.field_p);
        jaggl.OpenGL.glVertex2f(param0, param1);
        jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
        jaggl.OpenGL.glVertex2f(param4, param5);
        jaggl.OpenGL.glTexCoord2f(((tm) this).field_j.field_r, 0.0f);
        jaggl.OpenGL.glVertex2f(var11, var12);
        jaggl.OpenGL.glTexCoord2f(((tm) this).field_j.field_r, ((tm) this).field_j.field_p);
        jaggl.OpenGL.glVertex2f(param2, param3);
        jaggl.OpenGL.glEnd();
    }

    final static void b(int param0, int param1) {
        if (param1 > -87) {
            field_l = null;
        }
        ld.field_b = 1000000000L / (long)param0;
    }

    private final void b(int param0) {
        ((tm) this).field_g.a(false, 1);
        ((tm) this).field_g.a((rt) null, 1);
        ((tm) this).field_g.a(8448, -26625, 8448);
        if (param0 < 82) {
            tm.b(47, -9);
        }
        ((tm) this).field_g.a(34168, 768, 34176, 1);
        ((tm) this).field_g.a(770, 5890, 0, (byte) 113);
        ((tm) this).field_g.a(false, 0);
        ((tm) this).field_g.a(34168, 768, 34176, 1);
    }

    private final void a(boolean param0, int param1) {
        int var4 = 0;
        L0: {
          var4 = AceOfSkies.field_G ? 1 : 0;
          ((tm) this).field_g.a(false, 1);
          ((tm) this).field_g.a((rt) (Object) ((tm) this).field_j, 1);
          ((tm) this).field_g.a(((tm) this).field_g.b(true, param1), -26625, 7681);
          ((tm) this).field_g.a(34167, 768, 34176, 1);
          ((tm) this).field_g.a(770, 34168, 0, (byte) 103);
          ((tm) this).field_g.a(false, 0);
          ((tm) this).field_g.a((rt) (Object) ((tm) this).field_f, 1);
          ((tm) this).field_g.a(34479, -26625, 7681);
          ((tm) this).field_g.a(34166, 768, 34176, 1);
          if (((tm) this).field_k != 0) {
            if (((tm) this).field_k != 1) {
              if (2 == ((tm) this).field_k) {
                ((tm) this).field_g.a(1.0f, 0.5f, 0.5f, 0.0f, (byte) 35);
                break L0;
              } else {
                if (3 == ((tm) this).field_k) {
                  ((tm) this).field_g.a(128.5f, 128.5f, 128.5f, 0.0f, (byte) 35);
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              ((tm) this).field_g.a(0.5f, 1.0f, 0.5f, 0.0f, (byte) 35);
              break L0;
            }
          } else {
            ((tm) this).field_g.a(0.5f, 0.5f, 1.0f, 0.0f, (byte) 35);
            break L0;
          }
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int[] var13 = null;
        int[] var12 = null;
        int[] var11 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = AceOfSkies.field_G ? 1 : 0;
        if (!((tm) this).field_g.field_eb) {
            ((tm) this).field_j.a(param3, param1, param2, param6, param4, param0, 83);
        } else {
            var13 = ((tm) this).field_g.a(param1, param6, (byte) -78, param0, param3);
            var12 = var13;
            var11 = var12;
            var8 = var11;
            if (!(var11 == null)) {
                for (var9 = 0; var9 < var13.length; var9++) {
                    var11[var9] = vo.a(var13[var9], -16777216);
                }
                int discarded$0 = 0;
                this.a(var8, param2, 0, param0, param0, param4, param6);
            }
        }
        if (param5 != -14164) {
            ((tm) this).a(46, 40, 8, -47, 93);
        }
    }

    final int a() {
        return ((tm) this).field_j.field_q;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        int var15 = 0;
        el stackIn_1_0 = null;
        el stackIn_2_0 = null;
        el stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        el stackOut_0_0 = null;
        el stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        el stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var15 = AceOfSkies.field_G ? 1 : 0;
          stackOut_0_0 = ((tm) this).field_j;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if ((param7 & 1) == 0) {
            stackOut_2_0 = (el) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (el) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((el) (Object) stackIn_3_0).a(stackIn_3_1 != 0, -128);
          ((tm) this).field_g.g(1025208104);
          ((tm) this).field_g.b((byte) -97, param6);
          jaggl.OpenGL.glColor4ub((byte)(param5 >> 16), (byte)(param5 >> 8), (byte)param5, (byte)(param5 >> 24));
          if (!((tm) this).field_e) {
            if (null == ((tm) this).field_f) {
              ((tm) this).field_g.a((rt) (Object) ((tm) this).field_j, 1);
              ((tm) this).field_g.a(param4, (byte) -39);
              jaggl.OpenGL.glBegin(7);
              jaggl.OpenGL.glTexCoord2f(0.0f, ((tm) this).field_j.field_p);
              jaggl.OpenGL.glVertex2i(param0, param1);
              jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
              jaggl.OpenGL.glVertex2i(param0, param1 + param3);
              jaggl.OpenGL.glTexCoord2f(((tm) this).field_j.field_r, 0.0f);
              jaggl.OpenGL.glVertex2i(param0 - -param2, param3 + param1);
              jaggl.OpenGL.glTexCoord2f(((tm) this).field_j.field_r, ((tm) this).field_j.field_p);
              jaggl.OpenGL.glVertex2i(param2 + param0, param1);
              jaggl.OpenGL.glEnd();
              break L1;
            } else {
              this.a(false, param4);
              ((tm) this).field_f.a(true, -128);
              jaggl.OpenGL.glBegin(7);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, ((tm) this).field_j.field_p);
              jaggl.OpenGL.glTexCoord2f(0.0f, ((tm) this).field_j.field_p);
              jaggl.OpenGL.glVertex2i(param0, param1);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
              jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
              jaggl.OpenGL.glVertex2i(param0, param1 + param3);
              jaggl.OpenGL.glMultiTexCoord2f(33985, ((tm) this).field_j.field_r, 0.0f);
              jaggl.OpenGL.glTexCoord2f(((tm) this).field_j.field_r, 0.0f);
              jaggl.OpenGL.glVertex2i(param2 + param0, param1 - -param3);
              jaggl.OpenGL.glMultiTexCoord2f(33985, ((tm) this).field_j.field_r, ((tm) this).field_j.field_p);
              jaggl.OpenGL.glTexCoord2f(((tm) this).field_j.field_r, ((tm) this).field_j.field_p);
              jaggl.OpenGL.glVertex2i(param0 + param2, param1);
              jaggl.OpenGL.glEnd();
              this.b(123);
              break L1;
            }
          } else {
            var9 = (float)param2 / (float)((tm) this).d();
            var10 = (float)param3 / (float)((tm) this).c();
            var11 = (float)((tm) this).field_c * var9 + (float)param0;
            var12 = (float)param1 + var10 * (float)((tm) this).field_a;
            var13 = var11 + (float)((tm) this).field_j.field_q * var9;
            var14 = (float)((tm) this).field_j.field_o * var10 + var12;
            if (null != ((tm) this).field_f) {
              this.a(false, param4);
              ((tm) this).field_f.a(true, -128);
              jaggl.OpenGL.glBegin(7);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, ((tm) this).field_j.field_p);
              jaggl.OpenGL.glTexCoord2f(0.0f, ((tm) this).field_j.field_p);
              jaggl.OpenGL.glVertex2f(var11, var12);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
              jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
              jaggl.OpenGL.glVertex2f(var11, var14);
              jaggl.OpenGL.glMultiTexCoord2f(33985, ((tm) this).field_j.field_r, 0.0f);
              jaggl.OpenGL.glTexCoord2f(((tm) this).field_j.field_r, 0.0f);
              jaggl.OpenGL.glVertex2f(var13, var14);
              jaggl.OpenGL.glMultiTexCoord2f(33985, ((tm) this).field_j.field_r, ((tm) this).field_j.field_p);
              jaggl.OpenGL.glTexCoord2f(((tm) this).field_j.field_r, ((tm) this).field_j.field_p);
              jaggl.OpenGL.glVertex2f(var13, var12);
              jaggl.OpenGL.glEnd();
              this.b(85);
              break L1;
            } else {
              ((tm) this).field_g.a((rt) (Object) ((tm) this).field_j, 1);
              ((tm) this).field_g.a(param4, (byte) -39);
              jaggl.OpenGL.glBegin(7);
              jaggl.OpenGL.glTexCoord2f(0.0f, ((tm) this).field_j.field_p);
              jaggl.OpenGL.glVertex2f(var11, var12);
              jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
              jaggl.OpenGL.glVertex2f(var11, var14);
              jaggl.OpenGL.glTexCoord2f(((tm) this).field_j.field_r, 0.0f);
              jaggl.OpenGL.glVertex2f(var13, var14);
              jaggl.OpenGL.glTexCoord2f(((tm) this).field_j.field_r, ((tm) this).field_j.field_p);
              jaggl.OpenGL.glVertex2f(var13, var12);
              jaggl.OpenGL.glEnd();
              break L1;
            }
          }
        }
    }

    final int b() {
        return ((tm) this).field_j.field_o;
    }

    public static void a(int param0) {
        field_l = null;
        field_h = null;
    }

    final int d() {
        return ((tm) this).field_c + (((tm) this).field_j.field_q - -((tm) this).field_d);
    }

    private final void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var9 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            ((tm) this).field_j.a(param3, param1, param6, true, param5, param0, 0, (byte) 0, param4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var9;
            stackOut_2_1 = new StringBuilder().append("tm.A(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
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
          throw pn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + 0 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + 0 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var19 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < 0) {
                break L1;
              } else {
                if (~re.field_f >= ~param6) {
                  break L1;
                } else {
                  L2: {
                    if (param4 >= 0) {
                      break L2;
                    } else {
                      if (param0 >= 0) {
                        break L2;
                      } else {
                        if (param2 >= 0) {
                          break L2;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L3: {
                    if (re.field_b > param4) {
                      break L3;
                    } else {
                      if (~re.field_b < ~param0) {
                        break L3;
                      } else {
                        if (param2 >= re.field_b) {
                          return;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    var14 = -param6 + param1;
                    if (~param7 == ~param6) {
                      L5: {
                        if (param6 != param1) {
                          var15 = -param7 + param1;
                          if (~param4 > ~param0) {
                            var11 = (-param4 + param2 << 16) / var14;
                            var9_int = param4 << 16;
                            var10 = param0 << 16;
                            var12 = (param2 + -param0 << 16) / var15;
                            break L5;
                          } else {
                            var12 = (param2 - param4 << 16) / var14;
                            var9_int = param0 << 16;
                            var10 = param4 << 16;
                            var11 = (param2 + -param0 << 16) / var15;
                            break L5;
                          }
                        } else {
                          var11 = 0;
                          var12 = 0;
                          var10 = param0 << 16;
                          var9_int = param4 << 16;
                          break L5;
                        }
                      }
                      L6: {
                        if (param6 >= 0) {
                          break L6;
                        } else {
                          param6 = Math.min(-param6, -param6 + param7);
                          var10 = var10 + param6 * var12;
                          var9_int = var9_int + param6 * var11;
                          param6 = 0;
                          break L6;
                        }
                      }
                      var13 = 0;
                      break L4;
                    } else {
                      L7: {
                        var10 = param4 << 16;
                        var9_int = param4 << 16;
                        var15 = -param6 + param7;
                        var12 = (-param4 + param2 << 16) / var14;
                        var11 = (param0 + -param4 << 16) / var15;
                        if (var11 < var12) {
                          var13 = 0;
                          break L7;
                        } else {
                          var13 = 1;
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          break L7;
                        }
                      }
                      L8: {
                        L9: {
                          if (param6 >= 0) {
                            break L9;
                          } else {
                            if (0 <= param7) {
                              param6 = -param6;
                              var9_int = var9_int + param6 * var11;
                              var10 = var10 + param6 * var12;
                              param6 = 0;
                              break L9;
                            } else {
                              param6 = -param6 + param7;
                              var10 = var10 + var12 * param6;
                              var9_int = var9_int + var11 * param6;
                              param6 = param7;
                              break L8;
                            }
                          }
                        }
                        var16 = re.field_i[param6];
                        L10: while (true) {
                          if (param6 >= param7) {
                            break L8;
                          } else {
                            L11: {
                              var17 = var9_int >> 16;
                              if (~re.field_b >= ~var17) {
                                break L11;
                              } else {
                                var18 = -(var9_int >> 16) + (var10 >> 16);
                                if (var18 == 0) {
                                  if (var17 < 0) {
                                    break L11;
                                  } else {
                                    if (~re.field_b >= ~var17) {
                                      break L11;
                                    } else {
                                      ut.a(var18, (byte) -96, param5, param8, var17 - -var16);
                                      break L11;
                                    }
                                  }
                                } else {
                                  L12: {
                                    if (var18 + var17 < re.field_b) {
                                      break L12;
                                    } else {
                                      var18 = -1 + (re.field_b - var17);
                                      break L12;
                                    }
                                  }
                                  if (var17 >= 0) {
                                    ut.a(var18, (byte) -96, param5, param8, var17 + var16);
                                    break L11;
                                  } else {
                                    ut.a(var18 + var17, (byte) -96, param5, param8, var16);
                                    break L11;
                                  }
                                }
                              }
                            }
                            param6++;
                            if (re.field_f > param6) {
                              var9_int = var9_int + var11;
                              var10 = var10 + var12;
                              var16 = var16 + vp.field_i;
                              continue L10;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      var16 = param1 + -param7;
                      if (var16 == 0) {
                        var12 = 0;
                        var11 = 0;
                        break L4;
                      } else {
                        L13: {
                          var17 = param2 << 16;
                          if (var13 == 0) {
                            var9_int = param0 << 16;
                            break L13;
                          } else {
                            var10 = param0 << 16;
                            break L13;
                          }
                        }
                        var12 = (-var10 + var17) / var16;
                        var11 = (-var9_int + var17) / var16;
                        break L4;
                      }
                    }
                  }
                  L14: {
                    if (0 <= param6) {
                      break L14;
                    } else {
                      param6 = -param6;
                      var10 = var10 + var12 * param6;
                      var9_int = var9_int + var11 * param6;
                      param6 = 0;
                      break L14;
                    }
                  }
                  var15 = re.field_i[param6];
                  L15: while (true) {
                    if (param1 <= param6) {
                      break L0;
                    } else {
                      L16: {
                        var16 = var9_int >> 16;
                        if (~var16 <= ~re.field_b) {
                          break L16;
                        } else {
                          var17 = -(var9_int >> 16) + (var10 >> 16);
                          if (var17 == 0) {
                            if (var16 < 0) {
                              break L16;
                            } else {
                              if (~re.field_b >= ~var16) {
                                break L16;
                              } else {
                                ut.a(var17, (byte) -96, param5, param8, var16 - -var15);
                                break L16;
                              }
                            }
                          } else {
                            L17: {
                              if (var16 - -var17 < re.field_b) {
                                break L17;
                              } else {
                                var17 = -1 + (-var16 + re.field_b);
                                break L17;
                              }
                            }
                            if (var16 >= 0) {
                              ut.a(var17, (byte) -96, param5, param8, var16 - -var15);
                              break L16;
                            } else {
                              ut.a(var17 - -var16, (byte) -96, param5, param8, var15);
                              break L16;
                            }
                          }
                        }
                      }
                      param6++;
                      if (re.field_f > param6) {
                        var10 = var10 + var12;
                        var15 = var15 + vp.field_i;
                        var9_int = var9_int + var11;
                        continue L15;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var9 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) var9;
            stackOut_70_1 = new StringBuilder().append("tm.J(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(14250).append(44).append(param4).append(44);
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param5 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L18;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L18;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    tm(wl param0, int param1, int param2, int[] param3, int param4, int param5) {
        ((tm) this).field_k = 0;
        ((tm) this).field_b = 0;
        ((tm) this).field_d = 0;
        ((tm) this).field_c = 0;
        ((tm) this).field_a = 0;
        ((tm) this).field_e = false;
        try {
            ((tm) this).field_g = param0;
            ((tm) this).field_j = ab.a(param0, -126, false, param3, param4, param5, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "tm.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new ia();
        field_l = new int[8192];
        field_i = 0;
    }
}
