/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tla extends aja {
    private int field_b;
    static String field_k;
    private int field_j;
    private qfa field_g;
    private im field_e;
    static String field_h;
    private int field_a;
    private boolean field_l;
    im field_f;
    static boolean field_c;
    private int field_d;
    private int field_i;

    private final void a(int param0) {
        ((tla) this).field_g.h(33984, 1);
        ((tla) this).field_g.a(65, (pib) null);
        ((tla) this).field_g.b(8448, 8448, false);
        ((tla) this).field_g.c(1, 34192, 768, 34168);
        ((tla) this).field_g.b(0, 770, 5890, 34184);
        ((tla) this).field_g.h(33984, 0);
        ((tla) this).field_g.c(1, 34192, 768, 34168);
    }

    final static boolean b(int param0, int param1) {
        if (param0 < 92) {
            return false;
        }
        return fwa.field_g.a(param1, 11, true);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        L0: {
          ((tla) this).field_f.a(-78, false);
          ((tla) this).field_g.n(27841);
          ((tla) this).field_g.d(param4, 73);
          jaggl.OpenGL.glColor4ub((byte)(param3 >> 16), (byte)(param3 >> 8), (byte)param3, (byte)(param3 >> 24));
          param1 = param1 + ((tla) this).field_d;
          param0 = param0 + ((tla) this).field_i;
          if (((tla) this).field_e == null) {
            ((tla) this).field_g.a(117, (pib) (Object) ((tla) this).field_f);
            ((tla) this).field_g.c(0, param2);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glTexCoord2f(0.0f, ((tla) this).field_f.field_o);
            jaggl.OpenGL.glVertex2i(param0, param1);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2i(param0, ((tla) this).field_f.field_p + param1);
            jaggl.OpenGL.glTexCoord2f(((tla) this).field_f.field_n, 0.0f);
            jaggl.OpenGL.glVertex2i(((tla) this).field_f.field_m + param0, param1 + ((tla) this).field_f.field_p);
            jaggl.OpenGL.glTexCoord2f(((tla) this).field_f.field_n, ((tla) this).field_f.field_o);
            jaggl.OpenGL.glVertex2i(((tla) this).field_f.field_m + param0, param1);
            jaggl.OpenGL.glEnd();
            break L0;
          } else {
            this.a(true, param2);
            ((tla) this).field_e.a(-77, false);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, ((tla) this).field_f.field_o);
            jaggl.OpenGL.glTexCoord2f(0.0f, ((tla) this).field_f.field_o);
            jaggl.OpenGL.glVertex2i(param0, param1);
            jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2i(param0, ((tla) this).field_f.field_p + param1);
            jaggl.OpenGL.glMultiTexCoord2f(33985, ((tla) this).field_f.field_n, 0.0f);
            jaggl.OpenGL.glTexCoord2f(((tla) this).field_f.field_n, 0.0f);
            jaggl.OpenGL.glVertex2i(((tla) this).field_f.field_m + param0, ((tla) this).field_f.field_p + param1);
            jaggl.OpenGL.glMultiTexCoord2f(33985, ((tla) this).field_f.field_n, ((tla) this).field_f.field_o);
            jaggl.OpenGL.glTexCoord2f(((tla) this).field_f.field_n, ((tla) this).field_f.field_o);
            jaggl.OpenGL.glVertex2i(param0 - -((tla) this).field_f.field_m, param1);
            jaggl.OpenGL.glEnd();
            this.a(-27568);
            break L0;
          }
        }
    }

    final int a() {
        return ((tla) this).field_f.field_p;
    }

    final int b() {
        return ((tla) this).field_f.field_p - (-((tla) this).field_d - ((tla) this).field_b);
    }

    private final void a(boolean param0, int param1) {
        int var4 = 0;
        qfa stackIn_11_0 = null;
        float stackIn_11_1 = 0.0f;
        float stackIn_11_2 = 0.0f;
        qfa stackIn_12_0 = null;
        float stackIn_12_1 = 0.0f;
        float stackIn_12_2 = 0.0f;
        qfa stackIn_13_0 = null;
        float stackIn_13_1 = 0.0f;
        float stackIn_13_2 = 0.0f;
        int stackIn_13_3 = 0;
        qfa stackOut_10_0 = null;
        float stackOut_10_1 = 0.0f;
        float stackOut_10_2 = 0.0f;
        qfa stackOut_12_0 = null;
        float stackOut_12_1 = 0.0f;
        float stackOut_12_2 = 0.0f;
        int stackOut_12_3 = 0;
        qfa stackOut_11_0 = null;
        float stackOut_11_1 = 0.0f;
        float stackOut_11_2 = 0.0f;
        int stackOut_11_3 = 0;
        L0: {
          var4 = VoidHunters.field_G;
          if (param0) {
            break L0;
          } else {
            ((tla) this).b(10, 76, -118, 126, -96, -43, 86);
            break L0;
          }
        }
        L1: {
          ((tla) this).field_g.h(33984, 1);
          ((tla) this).field_g.a(55, (pib) (Object) ((tla) this).field_f);
          ((tla) this).field_g.b(((tla) this).field_g.j(param1, 25887), 7681, false);
          ((tla) this).field_g.c(1, 34192, 768, 34167);
          ((tla) this).field_g.b(0, 770, 34168, 34184);
          ((tla) this).field_g.h(33984, 0);
          ((tla) this).field_g.a(63, (pib) (Object) ((tla) this).field_e);
          ((tla) this).field_g.b(34479, 7681, false);
          ((tla) this).field_g.c(1, 34192, 768, 34166);
          if (((tla) this).field_j == 0) {
            L2: {
              stackOut_10_0 = ((tla) this).field_g;
              stackOut_10_1 = 0.0f;
              stackOut_10_2 = 0.5f;
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              if (param0) {
                stackOut_12_0 = (qfa) (Object) stackIn_12_0;
                stackOut_12_1 = stackIn_12_1;
                stackOut_12_2 = stackIn_12_2;
                stackOut_12_3 = 0;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                stackIn_13_2 = stackOut_12_2;
                stackIn_13_3 = stackOut_12_3;
                break L2;
              } else {
                stackOut_11_0 = (qfa) (Object) stackIn_11_0;
                stackOut_11_1 = stackIn_11_1;
                stackOut_11_2 = stackIn_11_2;
                stackOut_11_3 = 1;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_13_2 = stackOut_11_2;
                stackIn_13_3 = stackOut_11_3;
                break L2;
              }
            }
            ((qfa) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_13_2, stackIn_13_3 != 0, 0.5f, 1.0f);
            break L1;
          } else {
            if (((tla) this).field_j == 1) {
              ((tla) this).field_g.a(0.0f, 1.0f, false, 0.5f, 0.5f);
              break L1;
            } else {
              if (((tla) this).field_j != 2) {
                if (((tla) this).field_j == 3) {
                  ((tla) this).field_g.a(0.0f, 128.5f, false, 128.5f, 128.5f);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                ((tla) this).field_g.a(0.0f, 0.5f, false, 1.0f, 0.5f);
                break L1;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        try {
            ((tla) this).field_f.a((byte) 32, param6, param2, param1, param3, param0, param5, true, param4);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "tla.D(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 44 + param6 + 41);
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
        im stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        im stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        im stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        im stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        im stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        im stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        L0: {
          var15 = VoidHunters.field_G;
          stackOut_0_0 = ((tla) this).field_f;
          stackOut_0_1 = -124;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          if ((param7 & 1) == 0) {
            stackOut_2_0 = (im) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            break L0;
          } else {
            stackOut_1_0 = (im) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            break L0;
          }
        }
        L1: {
          ((im) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2 != 0);
          ((tla) this).field_g.n(27841);
          ((tla) this).field_g.d(param6, 115);
          jaggl.OpenGL.glColor4ub((byte)(param5 >> 16), (byte)(param5 >> 8), (byte)param5, (byte)(param5 >> 24));
          if (!((tla) this).field_l) {
            if (null != ((tla) this).field_e) {
              this.a(true, param4);
              ((tla) this).field_e.a(-112, true);
              jaggl.OpenGL.glBegin(7);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, ((tla) this).field_f.field_o);
              jaggl.OpenGL.glTexCoord2f(0.0f, ((tla) this).field_f.field_o);
              jaggl.OpenGL.glVertex2i(param0, param1);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
              jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
              jaggl.OpenGL.glVertex2i(param0, param1 - -param3);
              jaggl.OpenGL.glMultiTexCoord2f(33985, ((tla) this).field_f.field_n, 0.0f);
              jaggl.OpenGL.glTexCoord2f(((tla) this).field_f.field_n, 0.0f);
              jaggl.OpenGL.glVertex2i(param0 - -param2, param1 + param3);
              jaggl.OpenGL.glMultiTexCoord2f(33985, ((tla) this).field_f.field_n, ((tla) this).field_f.field_o);
              jaggl.OpenGL.glTexCoord2f(((tla) this).field_f.field_n, ((tla) this).field_f.field_o);
              jaggl.OpenGL.glVertex2i(param2 + param0, param1);
              jaggl.OpenGL.glEnd();
              this.a(-27568);
              break L1;
            } else {
              ((tla) this).field_g.a(103, (pib) (Object) ((tla) this).field_f);
              ((tla) this).field_g.c(0, param4);
              jaggl.OpenGL.glBegin(7);
              jaggl.OpenGL.glTexCoord2f(0.0f, ((tla) this).field_f.field_o);
              jaggl.OpenGL.glVertex2i(param0, param1);
              jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
              jaggl.OpenGL.glVertex2i(param0, param1 + param3);
              jaggl.OpenGL.glTexCoord2f(((tla) this).field_f.field_n, 0.0f);
              jaggl.OpenGL.glVertex2i(param0 - -param2, param3 + param1);
              jaggl.OpenGL.glTexCoord2f(((tla) this).field_f.field_n, ((tla) this).field_f.field_o);
              jaggl.OpenGL.glVertex2i(param2 + param0, param1);
              jaggl.OpenGL.glEnd();
              break L1;
            }
          } else {
            var9 = (float)param2 / (float)((tla) this).c();
            var10 = (float)param3 / (float)((tla) this).b();
            var11 = (float)((tla) this).field_i * var9 + (float)param0;
            var12 = (float)param1 + (float)((tla) this).field_d * var10;
            var13 = var11 + (float)((tla) this).field_f.field_m * var9;
            var14 = (float)((tla) this).field_f.field_p * var10 + var12;
            if (((tla) this).field_e != null) {
              this.a(true, param4);
              ((tla) this).field_e.a(-128, true);
              jaggl.OpenGL.glBegin(7);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, ((tla) this).field_f.field_o);
              jaggl.OpenGL.glTexCoord2f(0.0f, ((tla) this).field_f.field_o);
              jaggl.OpenGL.glVertex2f(var11, var12);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
              jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
              jaggl.OpenGL.glVertex2f(var11, var14);
              jaggl.OpenGL.glMultiTexCoord2f(33985, ((tla) this).field_f.field_n, 0.0f);
              jaggl.OpenGL.glTexCoord2f(((tla) this).field_f.field_n, 0.0f);
              jaggl.OpenGL.glVertex2f(var13, var14);
              jaggl.OpenGL.glMultiTexCoord2f(33985, ((tla) this).field_f.field_n, ((tla) this).field_f.field_o);
              jaggl.OpenGL.glTexCoord2f(((tla) this).field_f.field_n, ((tla) this).field_f.field_o);
              jaggl.OpenGL.glVertex2f(var13, var12);
              jaggl.OpenGL.glEnd();
              this.a(-27568);
              break L1;
            } else {
              ((tla) this).field_g.a(120, (pib) (Object) ((tla) this).field_f);
              ((tla) this).field_g.c(0, param4);
              jaggl.OpenGL.glBegin(7);
              jaggl.OpenGL.glTexCoord2f(0.0f, ((tla) this).field_f.field_o);
              jaggl.OpenGL.glVertex2f(var11, var12);
              jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
              jaggl.OpenGL.glVertex2f(var11, var14);
              jaggl.OpenGL.glTexCoord2f(((tla) this).field_f.field_n, 0.0f);
              jaggl.OpenGL.glVertex2f(var13, var14);
              jaggl.OpenGL.glTexCoord2f(((tla) this).field_f.field_n, ((tla) this).field_f.field_o);
              jaggl.OpenGL.glVertex2f(var13, var12);
              jaggl.OpenGL.glEnd();
              break L1;
            }
          }
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        float var10 = 0.0f;
        int var11_int = 0;
        float var11 = 0.0f;
        int var12 = 0;
        int var13 = 0;
        int var14_int = 0;
        float var14 = 0.0f;
        int var15 = 0;
        int var16 = 0;
        float var16_float = 0.0f;
        float var17 = 0.0f;
        int var18 = 0;
        L0: {
          L1: {
            var18 = VoidHunters.field_G;
            var8 = param2 + param0;
            ((tla) this).field_f.a(-122, false);
            var9 = param1 + param3;
            ((tla) this).field_g.n(27841);
            ((tla) this).field_g.a(31, (pib) (Object) ((tla) this).field_f);
            ((tla) this).field_g.d(param6, 111);
            ((tla) this).field_g.c(0, param4);
            jaggl.OpenGL.glColor4ub((byte)(param5 >> 16), (byte)(param5 >> 8), (byte)param5, (byte)(param5 >> 24));
            if (!((tla) this).field_f.field_l) {
              break L1;
            } else {
              if (!((tla) this).field_l) {
                var10 = ((tla) this).field_f.field_o * (float)param3 / (float)((tla) this).field_f.field_p;
                var11 = ((tla) this).field_f.field_n * (float)param2 / (float)((tla) this).field_f.field_m;
                jaggl.OpenGL.glBegin(7);
                jaggl.OpenGL.glTexCoord2f(0.0f, var10);
                jaggl.OpenGL.glVertex2i(param0, param1);
                jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
                jaggl.OpenGL.glVertex2i(param0, var9);
                jaggl.OpenGL.glTexCoord2f(var11, 0.0f);
                jaggl.OpenGL.glVertex2i(var8, var9);
                jaggl.OpenGL.glTexCoord2f(var11, var10);
                jaggl.OpenGL.glVertex2i(var8, param1);
                jaggl.OpenGL.glEnd();
                break L0;
              } else {
                break L1;
              }
            }
          }
          jaggl.OpenGL.glPushMatrix();
          jaggl.OpenGL.glTranslatef((float)((tla) this).field_i, (float)((tla) this).field_d, 0.0f);
          var10_int = ((tla) this).c();
          var11_int = ((tla) this).b();
          var13 = ((tla) this).field_f.field_p + param1;
          jaggl.OpenGL.glBegin(7);
          var12 = param1;
          L2: while (true) {
            if (var13 > var9) {
              if (var12 < var9) {
                var14 = (float)(((tla) this).field_f.field_p - (var9 - var12)) * ((tla) this).field_f.field_o / (float)((tla) this).field_f.field_p;
                var16 = param0 - -((tla) this).field_f.field_m;
                var15 = param0;
                L3: while (true) {
                  if (var16 > var8) {
                    L4: {
                      if (var15 < var8) {
                        var17 = (float)(var8 + -var15) * ((tla) this).field_f.field_n / (float)((tla) this).field_f.field_m;
                        jaggl.OpenGL.glTexCoord2f(0.0f, ((tla) this).field_f.field_o);
                        jaggl.OpenGL.glVertex2i(var15, var12);
                        jaggl.OpenGL.glTexCoord2f(0.0f, var14);
                        jaggl.OpenGL.glVertex2i(var15, var9);
                        jaggl.OpenGL.glTexCoord2f(var17, var14);
                        jaggl.OpenGL.glVertex2i(var8, var9);
                        jaggl.OpenGL.glTexCoord2f(var17, ((tla) this).field_f.field_o);
                        jaggl.OpenGL.glVertex2i(var8, var12);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    jaggl.OpenGL.glEnd();
                    jaggl.OpenGL.glPopMatrix();
                    break L0;
                  } else {
                    jaggl.OpenGL.glTexCoord2f(0.0f, ((tla) this).field_f.field_o);
                    jaggl.OpenGL.glVertex2i(var15, var12);
                    jaggl.OpenGL.glTexCoord2f(0.0f, var14);
                    jaggl.OpenGL.glVertex2i(var15, var9);
                    jaggl.OpenGL.glTexCoord2f(((tla) this).field_f.field_n, var14);
                    jaggl.OpenGL.glVertex2i(var16, var9);
                    jaggl.OpenGL.glTexCoord2f(((tla) this).field_f.field_n, ((tla) this).field_f.field_o);
                    jaggl.OpenGL.glVertex2i(var16, var12);
                    var16 = var16 + var10_int;
                    var15 = var15 + var10_int;
                    continue L3;
                  }
                }
              } else {
                jaggl.OpenGL.glEnd();
                jaggl.OpenGL.glPopMatrix();
                break L0;
              }
            } else {
              var15 = param0 - -((tla) this).field_f.field_m;
              var14_int = param0;
              L5: while (true) {
                if (var15 > var8) {
                  L6: {
                    if (var8 > var14_int) {
                      var16_float = ((tla) this).field_f.field_n * (float)(-var14_int + var8) / (float)((tla) this).field_f.field_m;
                      jaggl.OpenGL.glTexCoord2f(0.0f, ((tla) this).field_f.field_o);
                      jaggl.OpenGL.glVertex2i(var14_int, var12);
                      jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
                      jaggl.OpenGL.glVertex2i(var14_int, var13);
                      jaggl.OpenGL.glTexCoord2f(var16_float, 0.0f);
                      jaggl.OpenGL.glVertex2i(var8, var13);
                      jaggl.OpenGL.glTexCoord2f(var16_float, ((tla) this).field_f.field_o);
                      jaggl.OpenGL.glVertex2i(var8, var12);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var13 = var13 + var11_int;
                  var12 = var12 + var11_int;
                  continue L2;
                } else {
                  jaggl.OpenGL.glTexCoord2f(0.0f, ((tla) this).field_f.field_o);
                  jaggl.OpenGL.glVertex2i(var14_int, var12);
                  jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
                  jaggl.OpenGL.glVertex2i(var14_int, var13);
                  jaggl.OpenGL.glTexCoord2f(((tla) this).field_f.field_n, 0.0f);
                  jaggl.OpenGL.glVertex2i(var15, var13);
                  jaggl.OpenGL.glTexCoord2f(((tla) this).field_f.field_n, ((tla) this).field_f.field_o);
                  jaggl.OpenGL.glVertex2i(var15, var12);
                  var14_int = var14_int + var10_int;
                  var15 = var15 + var10_int;
                  continue L5;
                }
              }
            }
          }
        }
    }

    final int c() {
        return ((tla) this).field_a + (((tla) this).field_f.field_m + ((tla) this).field_i);
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
            ((tla) this).field_a = param2;
            ((tla) this).field_b = param3;
            ((tla) this).field_d = param1;
            ((tla) this).field_i = param0;
            stackOut_0_0 = this;
            stackIn_5_0 = stackOut_0_0;
            stackIn_1_0 = stackOut_0_0;
            if (((tla) this).field_i != 0) {
              break L1;
            } else {
              stackOut_1_0 = this;
              stackIn_5_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (0 != ((tla) this).field_d) {
                break L1;
              } else {
                stackOut_2_0 = this;
                stackIn_5_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (0 != ((tla) this).field_a) {
                  break L1;
                } else {
                  stackOut_3_0 = this;
                  stackIn_6_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (0 == ((tla) this).field_b) {
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
        ((tla) this).field_l = stackIn_7_1 != 0;
    }

    final void c(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int[] var14 = null;
        int[] var12 = null;
        int[] var11 = null;
        int[] var15 = null;
        int var9 = 0;
        int var10 = VoidHunters.field_G;
        if (param4 <= 90) {
            field_h = null;
        }
        if (!((tla) this).field_g.field_eb) {
            ((tla) this).field_f.a(112, param2, param0, param6, param1, param3, param5);
        } else {
            var14 = ((tla) this).field_g.na(param3, param5, param1, param6);
            var12 = var14;
            var11 = var12;
            var15 = var11;
            if (!(var11 == null)) {
                for (var9 = 0; var9 < var14.length; var9++) {
                    var11[var9] = knb.a(var14[var9], -16777216);
                }
                ((tla) this).a(param0, param2, param1, param6, var15, 0, param1);
            }
        }
    }

    final int d() {
        return ((tla) this).field_f.field_m;
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
        im stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        im stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        im stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        im stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        im stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        im stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        L0: {
          if (((tla) this).field_l) {
            var11 = (float)((tla) this).c();
            var12 = (float)((tla) this).b();
            var13 = (-param0 + param2) / var11;
            var14 = (-param1 + param3) / var11;
            var15 = (-param0 + param4) / var12;
            var16 = (param5 - param1) / var12;
            var17 = var15 * (float)((tla) this).field_d;
            var18 = var16 * (float)((tla) this).field_d;
            var19 = (float)((tla) this).field_i * var13;
            var20 = var14 * (float)((tla) this).field_i;
            var21 = (float)((tla) this).field_a * -var13;
            var22 = -var14 * (float)((tla) this).field_a;
            var23 = (float)((tla) this).field_b * -var15;
            param1 = var18 + (param1 + var20);
            param3 = var18 + (var22 + param3);
            param0 = var19 + param0 + var17;
            param4 = param4 + var19 + var23;
            var24 = (float)((tla) this).field_b * -var16;
            param2 = var17 + (var21 + param2);
            param5 = var24 + (var20 + param5);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var11 = param4 + (param2 - param0);
          stackOut_3_0 = ((tla) this).field_f;
          stackOut_3_1 = 109;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          if ((1 & param9) == 0) {
            stackOut_5_0 = (im) (Object) stackIn_5_0;
            stackOut_5_1 = stackIn_5_1;
            stackOut_5_2 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            break L1;
          } else {
            stackOut_4_0 = (im) (Object) stackIn_4_0;
            stackOut_4_1 = stackIn_4_1;
            stackOut_4_2 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            break L1;
          }
        }
        ((im) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2 != 0);
        var12 = -param1 + param5 + param3;
        ((tla) this).field_g.n(27841);
        ((tla) this).field_g.a(54, (pib) (Object) ((tla) this).field_f);
        ((tla) this).field_g.d(param8, 122);
        ((tla) this).field_g.c(0, param6);
        jaggl.OpenGL.glColor4ub((byte)(param7 >> 16), (byte)(param7 >> 8), (byte)param7, (byte)(param7 >> 24));
        jaggl.OpenGL.glBegin(7);
        jaggl.OpenGL.glTexCoord2f(0.0f, ((tla) this).field_f.field_o);
        jaggl.OpenGL.glVertex2f(param0, param1);
        jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
        jaggl.OpenGL.glVertex2f(param4, param5);
        jaggl.OpenGL.glTexCoord2f(((tla) this).field_f.field_n, 0.0f);
        jaggl.OpenGL.glVertex2f(var11, var12);
        jaggl.OpenGL.glTexCoord2f(((tla) this).field_f.field_n, ((tla) this).field_f.field_o);
        jaggl.OpenGL.glVertex2f(param2, param3);
        jaggl.OpenGL.glEnd();
    }

    public static void b(int param0) {
        field_k = null;
        field_h = null;
    }

    tla(qfa param0, int param1, int param2, boolean param3) {
        ((tla) this).field_a = 0;
        ((tla) this).field_d = 0;
        ((tla) this).field_b = 0;
        ((tla) this).field_j = 0;
        ((tla) this).field_i = 0;
        ((tla) this).field_l = false;
        try {
            ((tla) this).field_g = param0;
            ((tla) this).field_f = jr.a(28, param1, param2, param0, param3 ? 6408 : 6407);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "tla.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    tla(qfa param0, int param1, int param2, int[] param3, int param4, int param5) {
        ((tla) this).field_a = 0;
        ((tla) this).field_d = 0;
        ((tla) this).field_b = 0;
        ((tla) this).field_j = 0;
        ((tla) this).field_i = 0;
        ((tla) this).field_l = false;
        try {
            ((tla) this).field_g = param0;
            ((tla) this).field_f = uw.a(param0, param4, param5, param2, param3, param1, false, (byte) 60);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "tla.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "You can spectate this game";
        field_k = "Swap control to clicked ship";
    }
}
