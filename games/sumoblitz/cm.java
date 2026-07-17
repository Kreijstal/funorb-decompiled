/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm extends hr {
    private int field_c;
    private int field_h;
    private int field_a;
    private f field_d;
    private fr field_j;
    f field_g;
    private boolean field_e;
    private int field_f;
    private int field_i;
    static String field_b;

    public static void b(int param0) {
        field_b = null;
        if (param0 != 0) {
            cm.b(-59);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ((cm) this).field_g.a(false, 0);
        ((cm) this).field_j.q(-97);
        ((cm) this).field_j.c(25189, param4);
        jaggl.OpenGL.glColor4ub((byte)(param3 >> 16), (byte)(param3 >> 8), (byte)param3, (byte)(param3 >> 24));
        param0 = param0 + ((cm) this).field_i;
        param1 = param1 + ((cm) this).field_f;
        if (((cm) this).field_d == null) {
          ((cm) this).field_j.a(98, (ht) (Object) ((cm) this).field_g);
          ((cm) this).field_j.c(param2, true);
          jaggl.OpenGL.glBegin(7);
          jaggl.OpenGL.glTexCoord2f(0.0f, ((cm) this).field_g.field_v);
          jaggl.OpenGL.glVertex2i(param0, param1);
          jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
          jaggl.OpenGL.glVertex2i(param0, ((cm) this).field_g.field_p + param1);
          jaggl.OpenGL.glTexCoord2f(((cm) this).field_g.field_q, 0.0f);
          jaggl.OpenGL.glVertex2i(((cm) this).field_g.field_u + param0, param1 - -((cm) this).field_g.field_p);
          jaggl.OpenGL.glTexCoord2f(((cm) this).field_g.field_q, ((cm) this).field_g.field_v);
          jaggl.OpenGL.glVertex2i(((cm) this).field_g.field_u + param0, param1);
          jaggl.OpenGL.glEnd();
          return;
        } else {
          this.b(6344, param2);
          ((cm) this).field_d.a(false, 0);
          jaggl.OpenGL.glBegin(7);
          jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, ((cm) this).field_g.field_v);
          jaggl.OpenGL.glTexCoord2f(0.0f, ((cm) this).field_g.field_v);
          jaggl.OpenGL.glVertex2i(param0, param1);
          jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
          jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
          jaggl.OpenGL.glVertex2i(param0, param1 - -((cm) this).field_g.field_p);
          jaggl.OpenGL.glMultiTexCoord2f(33985, ((cm) this).field_g.field_q, 0.0f);
          jaggl.OpenGL.glTexCoord2f(((cm) this).field_g.field_q, 0.0f);
          jaggl.OpenGL.glVertex2i(param0 + ((cm) this).field_g.field_u, ((cm) this).field_g.field_p + param1);
          jaggl.OpenGL.glMultiTexCoord2f(33985, ((cm) this).field_g.field_q, ((cm) this).field_g.field_v);
          jaggl.OpenGL.glTexCoord2f(((cm) this).field_g.field_q, ((cm) this).field_g.field_v);
          jaggl.OpenGL.glVertex2i(((cm) this).field_g.field_u + param0, param1);
          jaggl.OpenGL.glEnd();
          this.a(0);
          return;
        }
    }

    final int b() {
        return ((cm) this).field_i + (((cm) this).field_g.field_u + ((cm) this).field_a);
    }

    final int d() {
        return ((cm) this).field_g.field_p - (-((cm) this).field_f + -((cm) this).field_h);
    }

    final void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        int[] var19 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        if (!((cm) this).field_j.field_W) {
          ((cm) this).field_g.a((byte) 125, param3, param0, param4, param1, param2, param5);
          if (param6 == -3773) {
            return;
          } else {
            ((cm) this).b(3, -68, -66, -16, -63, 102, -72);
            return;
          }
        } else {
          var18 = ((cm) this).field_j.b(param3, param5, 1, param2, param1);
          var16 = var18;
          var14 = var16;
          var12 = var14;
          var11 = var12;
          var19 = var11;
          if (var11 != null) {
            var9 = 0;
            L0: while (true) {
              if (var18.length <= var9) {
                this.a(param1, param0, (byte) -76, param5, var19, param4, 0, param5);
                if (param6 == -3773) {
                  return;
                } else {
                  ((cm) this).b(3, -68, -66, -16, -63, 102, -72);
                  return;
                }
              } else {
                var11[var9] = ic.a(var18[var9], -16777216);
                var9++;
                continue L0;
              }
            }
          } else {
            if (param6 != -3773) {
              ((cm) this).b(3, -68, -66, -16, -63, 102, -72);
              return;
            } else {
              return;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        int var15 = 0;
        f stackIn_1_0 = null;
        f stackIn_2_0 = null;
        f stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        f stackOut_0_0 = null;
        f stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        f stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var15 = Sumoblitz.field_L ? 1 : 0;
          stackOut_0_0 = ((cm) this).field_g;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if ((param7 & 1) == 0) {
            stackOut_2_0 = (f) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (f) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((f) (Object) stackIn_3_0).a(stackIn_3_1 != 0, 0);
        ((cm) this).field_j.q(-122);
        ((cm) this).field_j.c(25189, param6);
        jaggl.OpenGL.glColor4ub((byte)(param5 >> 16), (byte)(param5 >> 8), (byte)param5, (byte)(param5 >> 24));
        if (((cm) this).field_e) {
          var9 = (float)param2 / (float)((cm) this).b();
          var10 = (float)param3 / (float)((cm) this).d();
          var11 = (float)param0 + var9 * (float)((cm) this).field_i;
          var12 = (float)param1 + var10 * (float)((cm) this).field_f;
          var13 = var11 + (float)((cm) this).field_g.field_u * var9;
          var14 = (float)((cm) this).field_g.field_p * var10 + var12;
          if (null != ((cm) this).field_d) {
            this.b(6344, param4);
            ((cm) this).field_d.a(true, 0);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, ((cm) this).field_g.field_v);
            jaggl.OpenGL.glTexCoord2f(0.0f, ((cm) this).field_g.field_v);
            jaggl.OpenGL.glVertex2f(var11, var12);
            jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2f(var11, var14);
            jaggl.OpenGL.glMultiTexCoord2f(33985, ((cm) this).field_g.field_q, 0.0f);
            jaggl.OpenGL.glTexCoord2f(((cm) this).field_g.field_q, 0.0f);
            jaggl.OpenGL.glVertex2f(var13, var14);
            jaggl.OpenGL.glMultiTexCoord2f(33985, ((cm) this).field_g.field_q, ((cm) this).field_g.field_v);
            jaggl.OpenGL.glTexCoord2f(((cm) this).field_g.field_q, ((cm) this).field_g.field_v);
            jaggl.OpenGL.glVertex2f(var13, var12);
            jaggl.OpenGL.glEnd();
            this.a(0);
            return;
          } else {
            ((cm) this).field_j.a(39, (ht) (Object) ((cm) this).field_g);
            ((cm) this).field_j.c(param4, true);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glTexCoord2f(0.0f, ((cm) this).field_g.field_v);
            jaggl.OpenGL.glVertex2f(var11, var12);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2f(var11, var14);
            jaggl.OpenGL.glTexCoord2f(((cm) this).field_g.field_q, 0.0f);
            jaggl.OpenGL.glVertex2f(var13, var14);
            jaggl.OpenGL.glTexCoord2f(((cm) this).field_g.field_q, ((cm) this).field_g.field_v);
            jaggl.OpenGL.glVertex2f(var13, var12);
            jaggl.OpenGL.glEnd();
            return;
          }
        } else {
          if (((cm) this).field_d != null) {
            this.b(6344, param4);
            ((cm) this).field_d.a(true, 0);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, ((cm) this).field_g.field_v);
            jaggl.OpenGL.glTexCoord2f(0.0f, ((cm) this).field_g.field_v);
            jaggl.OpenGL.glVertex2i(param0, param1);
            jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2i(param0, param3 + param1);
            jaggl.OpenGL.glMultiTexCoord2f(33985, ((cm) this).field_g.field_q, 0.0f);
            jaggl.OpenGL.glTexCoord2f(((cm) this).field_g.field_q, 0.0f);
            jaggl.OpenGL.glVertex2i(param2 + param0, param1 - -param3);
            jaggl.OpenGL.glMultiTexCoord2f(33985, ((cm) this).field_g.field_q, ((cm) this).field_g.field_v);
            jaggl.OpenGL.glTexCoord2f(((cm) this).field_g.field_q, ((cm) this).field_g.field_v);
            jaggl.OpenGL.glVertex2i(param0 + param2, param1);
            jaggl.OpenGL.glEnd();
            this.a(0);
            return;
          } else {
            ((cm) this).field_j.a(127, (ht) (Object) ((cm) this).field_g);
            ((cm) this).field_j.c(param4, true);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glTexCoord2f(0.0f, ((cm) this).field_g.field_v);
            jaggl.OpenGL.glVertex2i(param0, param1);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2i(param0, param3 + param1);
            jaggl.OpenGL.glTexCoord2f(((cm) this).field_g.field_q, 0.0f);
            jaggl.OpenGL.glVertex2i(param0 + param2, param3 + param1);
            jaggl.OpenGL.glTexCoord2f(((cm) this).field_g.field_q, ((cm) this).field_g.field_v);
            jaggl.OpenGL.glVertex2i(param2 + param0, param1);
            jaggl.OpenGL.glEnd();
            return;
          }
        }
    }

    final int c() {
        return ((cm) this).field_g.field_u;
    }

    final int a() {
        return ((cm) this).field_g.field_p;
    }

    final void a(int param0, int param1, int param2, int param3) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_8_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        ((cm) this).field_h = param3;
        ((cm) this).field_i = param0;
        ((cm) this).field_f = param1;
        ((cm) this).field_a = param2;
        stackOut_0_0 = this;
        stackIn_2_0 = stackOut_0_0;
        stackIn_1_0 = stackOut_0_0;
        if (-1 == ((cm) this).field_i) {
          stackOut_2_0 = this;
          stackIn_4_0 = stackOut_2_0;
          stackIn_3_0 = stackOut_2_0;
          if (0 == ((cm) this).field_f) {
            stackOut_4_0 = this;
            stackIn_8_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (-1 == ((cm) this).field_a) {
              stackOut_8_0 = this;
              stackIn_10_0 = stackOut_8_0;
              stackIn_9_0 = stackOut_8_0;
              if (((cm) this).field_h != 0) {
                ((cm) this).field_e = true;
                return;
              } else {
                ((cm) this).field_e = false;
                return;
              }
            } else {
              stackOut_5_0 = this;
              stackOut_5_1 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              ((cm) this).field_e = stackIn_7_1 != 0;
              return;
            }
          } else {
            ((cm) this).field_e = true;
            return;
          }
        } else {
          ((cm) this).field_e = true;
          return;
        }
    }

    private final void a(int param0) {
        ((cm) this).field_j.g(1, 119);
        ((cm) this).field_j.a(24, (ht) null);
        ((cm) this).field_j.a(20685, 8448, 8448);
        ((cm) this).field_j.b(34168, 768, 1, -128);
        ((cm) this).field_j.a(112, 0, 5890, 770);
        ((cm) this).field_j.g(0, 112);
        ((cm) this).field_j.b(34168, 768, 1, 92);
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
        f stackIn_4_0 = null;
        f stackIn_5_0 = null;
        f stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        f stackOut_3_0 = null;
        f stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        f stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          if (((cm) this).field_e) {
            var11 = (float)((cm) this).b();
            var12 = (float)((cm) this).d();
            var13 = (param2 - param0) / var11;
            var14 = (param3 - param1) / var11;
            var15 = (param4 - param0) / var12;
            var16 = (param5 - param1) / var12;
            var17 = var15 * (float)((cm) this).field_f;
            var18 = (float)((cm) this).field_f * var16;
            var19 = var13 * (float)((cm) this).field_i;
            var20 = var14 * (float)((cm) this).field_i;
            var21 = (float)((cm) this).field_a * -var13;
            var22 = (float)((cm) this).field_a * -var14;
            var23 = -var15 * (float)((cm) this).field_h;
            var24 = -var16 * (float)((cm) this).field_h;
            param1 = var18 + (param1 + var20);
            param0 = param0 + var19 + var17;
            param4 = param4 + var19 + var23;
            param3 = param3 + var22 + var18;
            param2 = var17 + (param2 + var21);
            param5 = var24 + (param5 + var20);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var11 = param4 + (param2 - param0);
          var12 = param3 + (-param1 + param5);
          stackOut_3_0 = ((cm) this).field_g;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if ((param9 & 1) == 0) {
            stackOut_5_0 = (f) (Object) stackIn_5_0;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = (f) (Object) stackIn_4_0;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        ((f) (Object) stackIn_6_0).a(stackIn_6_1 != 0, 0);
        ((cm) this).field_j.q(-70);
        ((cm) this).field_j.a(110, (ht) (Object) ((cm) this).field_g);
        ((cm) this).field_j.c(25189, param8);
        ((cm) this).field_j.c(param6, true);
        jaggl.OpenGL.glColor4ub((byte)(param7 >> 16), (byte)(param7 >> 8), (byte)param7, (byte)(param7 >> 24));
        jaggl.OpenGL.glBegin(7);
        jaggl.OpenGL.glTexCoord2f(0.0f, ((cm) this).field_g.field_v);
        jaggl.OpenGL.glVertex2f(param0, param1);
        jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
        jaggl.OpenGL.glVertex2f(param4, param5);
        jaggl.OpenGL.glTexCoord2f(((cm) this).field_g.field_q, 0.0f);
        jaggl.OpenGL.glVertex2f(var11, var12);
        jaggl.OpenGL.glTexCoord2f(((cm) this).field_g.field_q, ((cm) this).field_g.field_v);
        jaggl.OpenGL.glVertex2f(param2, param3);
        jaggl.OpenGL.glEnd();
    }

    cm(fr param0, int param1, int param2, int[] param3, int param4, int param5) {
        ((cm) this).field_e = false;
        ((cm) this).field_h = 0;
        ((cm) this).field_a = 0;
        ((cm) this).field_c = 0;
        ((cm) this).field_f = 0;
        ((cm) this).field_i = 0;
        try {
            ((cm) this).field_j = param0;
            ((cm) this).field_g = js.a(param2, param4, param5, false, param0, (byte) -119, param1, param3);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "cm.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 41);
        }
    }

    private final void b(int param0, int param1) {
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        ((cm) this).field_j.g(1, 115);
        ((cm) this).field_j.a(74, (ht) (Object) ((cm) this).field_g);
        ((cm) this).field_j.a(param0 ^ 18437, 7681, ((cm) this).field_j.b(param1, (byte) -14));
        ((cm) this).field_j.b(34167, 768, 1, -120);
        ((cm) this).field_j.a(113, 0, 34168, 770);
        ((cm) this).field_j.g(0, 100);
        if (param0 == 6344) {
          ((cm) this).field_j.a(param0 ^ 6275, (ht) (Object) ((cm) this).field_d);
          ((cm) this).field_j.a(20685, 7681, 34479);
          ((cm) this).field_j.b(34166, 768, 1, param0 + -6465);
          if (((cm) this).field_c != 0) {
            if (((cm) this).field_c != 1) {
              if (((cm) this).field_c != 2) {
                if (((cm) this).field_c != 3) {
                  return;
                } else {
                  ((cm) this).field_j.a(31322, 128.5f, 128.5f, 128.5f, 0.0f);
                  return;
                }
              } else {
                ((cm) this).field_j.a(31322, 0.5f, 1.0f, 0.5f, 0.0f);
                return;
              }
            } else {
              ((cm) this).field_j.a(param0 + 24978, 1.0f, 0.5f, 0.5f, 0.0f);
              return;
            }
          } else {
            ((cm) this).field_j.a(31322, 0.5f, 0.5f, 1.0f, 0.0f);
            return;
          }
        } else {
          ((cm) this).a(114, -109, -63, -80, 49);
          ((cm) this).field_j.a(param0 ^ 6275, (ht) (Object) ((cm) this).field_d);
          ((cm) this).field_j.a(20685, 7681, 34479);
          ((cm) this).field_j.b(34166, 768, 1, param0 + -6465);
          if (((cm) this).field_c != 0) {
            if (((cm) this).field_c != 1) {
              if (((cm) this).field_c != 2) {
                if (((cm) this).field_c != 3) {
                  return;
                } else {
                  ((cm) this).field_j.a(31322, 128.5f, 128.5f, 128.5f, 0.0f);
                  return;
                }
              } else {
                ((cm) this).field_j.a(31322, 0.5f, 1.0f, 0.5f, 0.0f);
                return;
              }
            } else {
              ((cm) this).field_j.a(param0 + 24978, 1.0f, 0.5f, 0.5f, 0.0f);
              return;
            }
          } else {
            ((cm) this).field_j.a(31322, 0.5f, 0.5f, 1.0f, 0.0f);
            return;
          }
        }
    }

    private final void a(int param0, int param1, byte param2, int param3, int[] param4, int param5, int param6, int param7) {
        try {
            if (param2 >= -67) {
                this.b(-99, 125);
            }
            ((cm) this).field_g.a(param0, param3, param5, param4, param6, param1, param7, true, true);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "cm.I(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "LEVEL COMPLETE!";
    }
}
