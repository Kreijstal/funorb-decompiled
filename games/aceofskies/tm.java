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
          jaggl.OpenGL.glColor4ub((byte)(param3 >> 1078945648), (byte)(param3 >> 611817960), (byte)param3, (byte)(param3 >> -1859342504));
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
            if (-1 != (((tm) this).field_c ^ -1)) {
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
          if (-1 == (1 & param9 ^ -1)) {
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
        jaggl.OpenGL.glColor4ub((byte)(param7 >> 1549611824), (byte)(param7 >> 571364328), (byte)param7, (byte)(param7 >> -1608824616));
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
            field_l = (int[]) null;
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
          ((tm) this).field_g.a(param0, 1);
          ((tm) this).field_g.a((rt) (Object) ((tm) this).field_j, 1);
          ((tm) this).field_g.a(((tm) this).field_g.b(true, param1), -26625, 7681);
          ((tm) this).field_g.a(34167, 768, 34176, 1);
          ((tm) this).field_g.a(770, 34168, 0, (byte) 103);
          ((tm) this).field_g.a(false, 0);
          ((tm) this).field_g.a((rt) (Object) ((tm) this).field_f, 1);
          ((tm) this).field_g.a(34479, -26625, 7681);
          ((tm) this).field_g.a(34166, 768, 34176, 1);
          if (-1 != (((tm) this).field_k ^ -1)) {
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
        int[] var14 = null;
        int[] var12 = null;
        int[] var11 = null;
        int[] var15 = null;
        int var9 = 0;
        int var10 = AceOfSkies.field_G ? 1 : 0;
        if (!((tm) this).field_g.field_eb) {
            ((tm) this).field_j.a(param3, param1, param2, param6, param4, param0, 83);
        } else {
            var14 = ((tm) this).field_g.a(param1, param6, (byte) -78, param0, param3);
            var12 = var14;
            var11 = var12;
            var15 = var11;
            if (!(var11 == null)) {
                for (var9 = 0; var9 < var14.length; var9++) {
                    var11[var9] = vo.a(var14[var9], -16777216);
                }
                this.a(var15, param2, 0, param0, param0, param4, param6, 0);
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
          jaggl.OpenGL.glColor4ub((byte)(param5 >> 1804509456), (byte)(param5 >> 2064478792), (byte)param5, (byte)(param5 >> 1247801720));
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
        if (param0 > -127) {
            int[] var2 = (int[]) null;
            tm.a(124, 122, 112, -109, 59, (int[]) null, 37, -107, -100);
        }
        field_l = null;
        field_h = null;
    }

    final int d() {
        return ((tm) this).field_c + (((tm) this).field_j.field_q - -((tm) this).field_d);
    }

    private final void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((tm) this).field_j.a(param3, param1, param6, true, param5, param0, param7, (byte) 0, param4);
        if (param2 != 0) {
            ((tm) this).a(-1.3366332054138184f, -0.0905967578291893f, 1.239539384841919f, -0.2479313760995865f, 0.13926813006401062f, -0.1986529529094696f, -78, 35, 110, -22);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, int param8) {
        int var9 = 0;
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
        L0: {
          var19 = AceOfSkies.field_G ? 1 : 0;
          if (param1 < 0) {
            break L0;
          } else {
            if (re.field_f <= param6) {
              break L0;
            } else {
              L1: {
                if (param4 >= 0) {
                  break L1;
                } else {
                  if (param0 >= 0) {
                    break L1;
                  } else {
                    if (param2 >= 0) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              L2: {
                if (re.field_b > param4) {
                  break L2;
                } else {
                  if (re.field_b > param0) {
                    break L2;
                  } else {
                    if (param2 >= re.field_b) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if (param3 == 14250) {
                  break L3;
                } else {
                  field_h = (ia) null;
                  break L3;
                }
              }
              L4: {
                L5: {
                  var14 = -param6 + param1;
                  if (param7 == param6) {
                    break L5;
                  } else {
                    L6: {
                      L7: {
                        var10 = param4 << 1569735280;
                        var9 = param4 << 1569735280;
                        var15 = -param6 + param7;
                        var12 = (-param4 + param2 << 2119789008) / var14;
                        var11 = (param0 + -param4 << -299402928) / var15;
                        if (var11 < var12) {
                          break L7;
                        } else {
                          var13 = 1;
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          if (0 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var13 = 0;
                      break L6;
                    }
                    L8: {
                      L9: {
                        if (param6 >= 0) {
                          var16 = re.field_i[param6];
                          L10: while (true) {
                            if (param6 >= param7) {
                              break L8;
                            } else {
                              L11: {
                                var17 = var9 >> 1707718832;
                                if ((re.field_b ^ -1) >= (var17 ^ -1)) {
                                  break L11;
                                } else {
                                  L12: {
                                    var18 = -(var9 >> -1049095792) + (var10 >> 219532496);
                                    if (var18 == 0) {
                                      break L12;
                                    } else {
                                      L13: {
                                        if (var18 + var17 < re.field_b) {
                                          break L13;
                                        } else {
                                          var18 = -1 + (re.field_b - var17);
                                          break L13;
                                        }
                                      }
                                      L14: {
                                        if (var17 >= 0) {
                                          break L14;
                                        } else {
                                          ut.a(var18 + var17, (byte) -96, param5, param8, var16);
                                          if (0 == 0) {
                                            break L11;
                                          } else {
                                            break L14;
                                          }
                                        }
                                      }
                                      ut.a(var18, (byte) -96, param5, param8, var17 + var16);
                                      if (0 == 0) {
                                        break L11;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  if (var17 < 0) {
                                    break L11;
                                  } else {
                                    if (re.field_b <= var17) {
                                      break L11;
                                    } else {
                                      ut.a(var18, (byte) -96, param5, param8, var17 - -var16);
                                      break L11;
                                    }
                                  }
                                }
                              }
                              param6++;
                              if (re.field_f > param6) {
                                var9 = var9 + var11;
                                var10 = var10 + var12;
                                var16 = var16 + vp.field_i;
                                if (0 == 0) {
                                  continue L10;
                                } else {
                                  break L9;
                                }
                              } else {
                                return;
                              }
                            }
                          }
                        } else {
                          L15: {
                            if (0 <= param7) {
                              break L15;
                            } else {
                              param6 = -param6 + param7;
                              var10 = var10 + var12 * param6;
                              var9 = var9 + var11 * param6;
                              param6 = param7;
                              if (0 == 0) {
                                break L8;
                              } else {
                                break L15;
                              }
                            }
                          }
                          param6 = -param6;
                          var9 = var9 + param6 * var11;
                          var10 = var10 + param6 * var12;
                          param6 = 0;
                          break L9;
                        }
                      }
                      var16 = re.field_i[param6];
                      L16: while (true) {
                        if (param6 >= param7) {
                          break L8;
                        } else {
                          L17: {
                            var17 = var9 >> 1707718832;
                            if ((re.field_b ^ -1) >= (var17 ^ -1)) {
                              break L17;
                            } else {
                              L18: {
                                var18 = -(var9 >> -1049095792) + (var10 >> 219532496);
                                if (var18 == 0) {
                                  break L18;
                                } else {
                                  L19: {
                                    if (var18 + var17 < re.field_b) {
                                      break L19;
                                    } else {
                                      var18 = -1 + (re.field_b - var17);
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    if (var17 >= 0) {
                                      break L20;
                                    } else {
                                      ut.a(var18 + var17, (byte) -96, param5, param8, var16);
                                      if (0 == 0) {
                                        break L17;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                  ut.a(var18, (byte) -96, param5, param8, var17 + var16);
                                  if (0 == 0) {
                                    break L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              if (var17 < 0) {
                                break L17;
                              } else {
                                if (re.field_b <= var17) {
                                  break L17;
                                } else {
                                  ut.a(var18, (byte) -96, param5, param8, var17 - -var16);
                                  break L17;
                                }
                              }
                            }
                          }
                          param6++;
                          if (re.field_f > param6) {
                            var9 = var9 + var11;
                            var10 = var10 + var12;
                            var16 = var16 + vp.field_i;
                            if (0 == 0) {
                              continue L16;
                            } else {
                              break L8;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    L21: {
                      L22: {
                        var16 = param1 + -param7;
                        if (var16 == 0) {
                          break L22;
                        } else {
                          L23: {
                            L24: {
                              var17 = param2 << 120732208;
                              if (var13 == 0) {
                                break L24;
                              } else {
                                var10 = param0 << -1000141264;
                                if (0 == 0) {
                                  break L23;
                                } else {
                                  break L24;
                                }
                              }
                            }
                            var9 = param0 << 1225872752;
                            break L23;
                          }
                          var12 = (-var10 + var17) / var16;
                          var11 = (-var9 + var17) / var16;
                          if (0 == 0) {
                            break L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      var12 = 0;
                      var11 = 0;
                      break L21;
                    }
                    if (0 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                L25: {
                  L26: {
                    if (param6 != param1) {
                      break L26;
                    } else {
                      var11 = 0;
                      var12 = 0;
                      var10 = param0 << -1801227984;
                      var9 = param4 << 1965636464;
                      if (0 == 0) {
                        break L25;
                      } else {
                        break L26;
                      }
                    }
                  }
                  L27: {
                    var15 = -param7 + param1;
                    if (param4 < param0) {
                      break L27;
                    } else {
                      var12 = (param2 - param4 << -1274827120) / var14;
                      var9 = param0 << 46725424;
                      var10 = param4 << -1704298928;
                      var11 = (param2 + -param0 << -1572383056) / var15;
                      if (0 == 0) {
                        break L25;
                      } else {
                        break L27;
                      }
                    }
                  }
                  var11 = (-param4 + param2 << -1551573264) / var14;
                  var9 = param4 << 1057151088;
                  var10 = param0 << 1599238960;
                  var12 = (param2 + -param0 << -2041930544) / var15;
                  break L25;
                }
                L28: {
                  if (param6 >= 0) {
                    break L28;
                  } else {
                    param6 = Math.min(-param6, -param6 + param7);
                    var10 = var10 + param6 * var12;
                    var9 = var9 + param6 * var11;
                    param6 = 0;
                    break L28;
                  }
                }
                var13 = 0;
                break L4;
              }
              L29: {
                if (0 <= param6) {
                  break L29;
                } else {
                  param6 = -param6;
                  var10 = var10 + var12 * param6;
                  var9 = var9 + var11 * param6;
                  param6 = 0;
                  break L29;
                }
              }
              L30: {
                var15 = re.field_i[param6];
                if (param1 <= param6) {
                  break L30;
                } else {
                  L31: {
                    var16 = var9 >> 1477358896;
                    if (var16 >= re.field_b) {
                      break L31;
                    } else {
                      L32: {
                        var17 = -(var9 >> 2118278416) + (var10 >> -258342608);
                        if (var17 == 0) {
                          break L32;
                        } else {
                          L33: {
                            if (var16 - -var17 < re.field_b) {
                              break L33;
                            } else {
                              var17 = -1 + (-var16 + re.field_b);
                              break L33;
                            }
                          }
                          L34: {
                            if (var16 >= 0) {
                              break L34;
                            } else {
                              ut.a(var17 - -var16, (byte) -96, param5, param8, var15);
                              if (0 == 0) {
                                break L31;
                              } else {
                                break L34;
                              }
                            }
                          }
                          ut.a(var17, (byte) -96, param5, param8, var16 - -var15);
                          if (0 == 0) {
                            break L31;
                          } else {
                            break L32;
                          }
                        }
                      }
                      if (var16 < 0) {
                        break L31;
                      } else {
                        if (re.field_b <= var16) {
                          break L31;
                        } else {
                          ut.a(var17, (byte) -96, param5, param8, var16 - -var15);
                          break L31;
                        }
                      }
                    }
                  }
                  param6++;
                  if (re.field_f > param6) {
                    var10 = var10 + var12;
                    var15 = var15 + vp.field_i;
                    var9 = var9 + var11;
                    break L30;
                  } else {
                    return;
                  }
                }
              }
              return;
            }
          }
        }
    }

    tm(wl param0, int param1, int param2, int[] param3, int param4, int param5) {
        ((tm) this).field_k = 0;
        ((tm) this).field_b = 0;
        ((tm) this).field_d = 0;
        ((tm) this).field_c = 0;
        ((tm) this).field_a = 0;
        ((tm) this).field_e = false;
        ((tm) this).field_g = param0;
        ((tm) this).field_j = ab.a(param0, -126, false, param3, param4, param5, param1, param2);
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
