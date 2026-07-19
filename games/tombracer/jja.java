/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jja extends nh {
    private int field_i;
    qk field_a;
    static ura field_d;
    private int field_h;
    private int field_e;
    private boolean field_b;
    private int field_g;
    private qk field_f;
    private cka field_c;
    private int field_m;
    static String field_k;
    static String field_l;
    static hla field_j;

    public static void a(boolean param0) {
        field_j = null;
        if (param0) {
          jja.a(true);
          field_l = null;
          field_d = null;
          field_k = null;
          return;
        } else {
          field_l = null;
          field_d = null;
          field_k = null;
          return;
        }
    }

    private final void a(int param0) {
        this.field_c.e(1, true);
        this.field_c.a(true, (kl) null);
        this.field_c.b(8448, 8960, 8448);
        this.field_c.c(1, param0, 34168, 768);
        this.field_c.b(5890, 3, 0, 770);
        this.field_c.e(0, true);
        this.field_c.c(1, 0, 34168, 768);
    }

    private final void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7) {
        try {
            if (param2 != 0) {
                this.b(-64, -35);
            }
            this.field_a.a(param3, param5, param7, param0, param6, param4, (byte) -111, true, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "jja.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        if (param5 == 8448) {
          if (this.field_c.field_Eb) {
            var13 = this.field_c.a(param4, param0, (byte) -81, param6, param2);
            var12 = var13;
            var11 = var12;
            var8 = var11;
            if (var11 != null) {
              var9 = 0;
              L0: while (true) {
                if (var9 >= var13.length) {
                  this.a(param4, param1, 0, 0, var13, param4, param3, param0);
                  return;
                } else {
                  var11[var9] = fh.a(var13[var9], -16777216);
                  var9++;
                  if (var10 == 0) {
                    continue L0;
                  } else {
                    return;
                  }
                }
              }
            } else {
              return;
            }
          } else {
            this.field_a.a(param2, param4, param1, param3, (byte) -84, param6, param0);
            if (var10 != 0) {
              var13 = this.field_c.a(param4, param0, (byte) -81, param6, param2);
              var12 = var13;
              var11 = var12;
              var8 = var11;
              if (var11 != null) {
                var9 = 0;
                L1: while (true) {
                  if (var9 >= var13.length) {
                    this.a(param4, param1, 0, 0, var13, param4, param3, param0);
                    return;
                  } else {
                    var11[var9] = fh.a(var13[var9], -16777216);
                    var9++;
                    if (var10 != 0) {
                      return;
                    } else {
                      if (var10 == 0) {
                        continue L1;
                      } else {
                        this.a(param4, param1, 0, 0, var13, param4, param3, param0);
                        return;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          this.a(93, -73, -91, -117, 84);
          if (!this.field_c.field_Eb) {
            this.field_a.a(param2, param4, param1, param3, (byte) -84, param6, param0);
            if (var10 != 0) {
              var13 = this.field_c.a(param4, param0, (byte) -81, param6, param2);
              var12 = var13;
              var11 = var12;
              var8 = var11;
              if (var11 != null) {
                var9 = 0;
                L2: while (true) {
                  if (var9 >= var13.length) {
                    this.a(param4, param1, 0, 0, var13, param4, param3, param0);
                    return;
                  } else {
                    var11[var9] = fh.a(var13[var9], -16777216);
                    var9++;
                    if (var10 != 0) {
                      return;
                    } else {
                      if (var10 == 0) {
                        continue L2;
                      } else {
                        this.a(param4, param1, 0, 0, var13, param4, param3, param0);
                        return;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            var13 = this.field_c.a(param4, param0, (byte) -81, param6, param2);
            var12 = var13;
            var11 = var12;
            var8 = var11;
            if (var11 != null) {
              var9 = 0;
              L3: while (true) {
                if (var9 < var13.length) {
                  var11[var9] = fh.a(var13[var9], -16777216);
                  var9++;
                  if (var10 == 0) {
                    continue L3;
                  } else {
                    return;
                  }
                } else {
                  this.a(param4, param1, 0, 0, var13, param4, param3, param0);
                  return;
                }
              }
            } else {
              return;
            }
          }
        }
    }

    final int d() {
        return this.field_h + (this.field_a.field_t + this.field_i);
    }

    final int b() {
        return this.field_m + this.field_a.field_s - -this.field_e;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        int var15 = 0;
        qk stackIn_1_0 = null;
        qk stackIn_2_0 = null;
        qk stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        qk stackOut_0_0 = null;
        qk stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        qk stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var15 = TombRacer.field_G ? 1 : 0;
          stackOut_0_0 = this.field_a;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if ((param7 & 1) == 0) {
            stackOut_2_0 = (qk) ((Object) stackIn_2_0);
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (qk) ((Object) stackIn_1_0);
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((qk) (Object) stackIn_3_0).b(stackIn_3_1 != 0, 3);
        this.field_c.q(2);
        this.field_c.a((byte) 25, param6);
        jaggl.OpenGL.glColor4ub((byte)(param5 >> -632846160), (byte)(param5 >> 1521648776), (byte)param5, (byte)(param5 >> -1775118696));
        if (this.field_b) {
          var9 = (float)param2 / (float)this.d();
          var10 = (float)param3 / (float)this.b();
          var11 = (float)this.field_h * var9 + (float)param0;
          var12 = (float)param1 + (float)this.field_e * var10;
          var13 = var11 + var9 * (float)this.field_a.field_t;
          var14 = (float)this.field_a.field_s * var10 + var12;
          if (this.field_f == null) {
            this.field_c.a(true, this.field_a);
            this.field_c.d(1, param4);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glTexCoord2f(0.0f, this.field_a.field_v);
            jaggl.OpenGL.glVertex2f(var11, var12);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2f(var11, var14);
            jaggl.OpenGL.glTexCoord2f(this.field_a.field_r, 0.0f);
            jaggl.OpenGL.glVertex2f(var13, var14);
            jaggl.OpenGL.glTexCoord2f(this.field_a.field_r, this.field_a.field_v);
            jaggl.OpenGL.glVertex2f(var13, var12);
            jaggl.OpenGL.glEnd();
            if (var15 == 0) {
              return;
            } else {
              this.b(param4, 117);
              this.field_f.b(true, 3);
              jaggl.OpenGL.glBegin(7);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, this.field_a.field_v);
              jaggl.OpenGL.glTexCoord2f(0.0f, this.field_a.field_v);
              jaggl.OpenGL.glVertex2f(var11, var12);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
              jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
              jaggl.OpenGL.glVertex2f(var11, var14);
              jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_a.field_r, 0.0f);
              jaggl.OpenGL.glTexCoord2f(this.field_a.field_r, 0.0f);
              jaggl.OpenGL.glVertex2f(var13, var14);
              jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_a.field_r, this.field_a.field_v);
              jaggl.OpenGL.glTexCoord2f(this.field_a.field_r, this.field_a.field_v);
              jaggl.OpenGL.glVertex2f(var13, var12);
              jaggl.OpenGL.glEnd();
              this.a(0);
              return;
            }
          } else {
            this.b(param4, 117);
            this.field_f.b(true, 3);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, this.field_a.field_v);
            jaggl.OpenGL.glTexCoord2f(0.0f, this.field_a.field_v);
            jaggl.OpenGL.glVertex2f(var11, var12);
            jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2f(var11, var14);
            jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_a.field_r, 0.0f);
            jaggl.OpenGL.glTexCoord2f(this.field_a.field_r, 0.0f);
            jaggl.OpenGL.glVertex2f(var13, var14);
            jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_a.field_r, this.field_a.field_v);
            jaggl.OpenGL.glTexCoord2f(this.field_a.field_r, this.field_a.field_v);
            jaggl.OpenGL.glVertex2f(var13, var12);
            jaggl.OpenGL.glEnd();
            this.a(0);
            return;
          }
        } else {
          if (null == this.field_f) {
            this.field_c.a(true, this.field_a);
            this.field_c.d(1, param4);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glTexCoord2f(0.0f, this.field_a.field_v);
            jaggl.OpenGL.glVertex2i(param0, param1);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2i(param0, param3 + param1);
            jaggl.OpenGL.glTexCoord2f(this.field_a.field_r, 0.0f);
            jaggl.OpenGL.glVertex2i(param2 + param0, param3 + param1);
            jaggl.OpenGL.glTexCoord2f(this.field_a.field_r, this.field_a.field_v);
            jaggl.OpenGL.glVertex2i(param0 - -param2, param1);
            jaggl.OpenGL.glEnd();
            if (var15 != 0) {
              var9 = (float)param2 / (float)this.d();
              var10 = (float)param3 / (float)this.b();
              var11 = (float)this.field_h * var9 + (float)param0;
              var12 = (float)param1 + (float)this.field_e * var10;
              var13 = var11 + var9 * (float)this.field_a.field_t;
              var14 = (float)this.field_a.field_s * var10 + var12;
              if (this.field_f == null) {
                this.field_c.a(true, this.field_a);
                this.field_c.d(1, param4);
                jaggl.OpenGL.glBegin(7);
                jaggl.OpenGL.glTexCoord2f(0.0f, this.field_a.field_v);
                jaggl.OpenGL.glVertex2f(var11, var12);
                jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
                jaggl.OpenGL.glVertex2f(var11, var14);
                jaggl.OpenGL.glTexCoord2f(this.field_a.field_r, 0.0f);
                jaggl.OpenGL.glVertex2f(var13, var14);
                jaggl.OpenGL.glTexCoord2f(this.field_a.field_r, this.field_a.field_v);
                jaggl.OpenGL.glVertex2f(var13, var12);
                jaggl.OpenGL.glEnd();
                if (var15 != 0) {
                  this.b(param4, 117);
                  this.field_f.b(true, 3);
                  jaggl.OpenGL.glBegin(7);
                  jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, this.field_a.field_v);
                  jaggl.OpenGL.glTexCoord2f(0.0f, this.field_a.field_v);
                  jaggl.OpenGL.glVertex2f(var11, var12);
                  jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
                  jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
                  jaggl.OpenGL.glVertex2f(var11, var14);
                  jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_a.field_r, 0.0f);
                  jaggl.OpenGL.glTexCoord2f(this.field_a.field_r, 0.0f);
                  jaggl.OpenGL.glVertex2f(var13, var14);
                  jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_a.field_r, this.field_a.field_v);
                  jaggl.OpenGL.glTexCoord2f(this.field_a.field_r, this.field_a.field_v);
                  jaggl.OpenGL.glVertex2f(var13, var12);
                  jaggl.OpenGL.glEnd();
                  this.a(0);
                  return;
                } else {
                  return;
                }
              } else {
                this.b(param4, 117);
                this.field_f.b(true, 3);
                jaggl.OpenGL.glBegin(7);
                jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, this.field_a.field_v);
                jaggl.OpenGL.glTexCoord2f(0.0f, this.field_a.field_v);
                jaggl.OpenGL.glVertex2f(var11, var12);
                jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
                jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
                jaggl.OpenGL.glVertex2f(var11, var14);
                jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_a.field_r, 0.0f);
                jaggl.OpenGL.glTexCoord2f(this.field_a.field_r, 0.0f);
                jaggl.OpenGL.glVertex2f(var13, var14);
                jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_a.field_r, this.field_a.field_v);
                jaggl.OpenGL.glTexCoord2f(this.field_a.field_r, this.field_a.field_v);
                jaggl.OpenGL.glVertex2f(var13, var12);
                jaggl.OpenGL.glEnd();
                this.a(0);
                return;
              }
            } else {
              return;
            }
          } else {
            this.b(param4, -48);
            this.field_f.b(true, 3);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, this.field_a.field_v);
            jaggl.OpenGL.glTexCoord2f(0.0f, this.field_a.field_v);
            jaggl.OpenGL.glVertex2i(param0, param1);
            jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2i(param0, param3 + param1);
            jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_a.field_r, 0.0f);
            jaggl.OpenGL.glTexCoord2f(this.field_a.field_r, 0.0f);
            jaggl.OpenGL.glVertex2i(param2 + param0, param1 - -param3);
            jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_a.field_r, this.field_a.field_v);
            jaggl.OpenGL.glTexCoord2f(this.field_a.field_r, this.field_a.field_v);
            jaggl.OpenGL.glVertex2i(param2 + param0, param1);
            jaggl.OpenGL.glEnd();
            this.a(0);
            if (var15 != 0) {
              this.field_c.a(true, this.field_a);
              this.field_c.d(1, param4);
              jaggl.OpenGL.glBegin(7);
              jaggl.OpenGL.glTexCoord2f(0.0f, this.field_a.field_v);
              jaggl.OpenGL.glVertex2i(param0, param1);
              jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
              jaggl.OpenGL.glVertex2i(param0, param3 + param1);
              jaggl.OpenGL.glTexCoord2f(this.field_a.field_r, 0.0f);
              jaggl.OpenGL.glVertex2i(param2 + param0, param3 + param1);
              jaggl.OpenGL.glTexCoord2f(this.field_a.field_r, this.field_a.field_v);
              jaggl.OpenGL.glVertex2i(param0 - -param2, param1);
              jaggl.OpenGL.glEnd();
              if (var15 != 0) {
                var9 = (float)param2 / (float)this.d();
                var10 = (float)param3 / (float)this.b();
                var11 = (float)this.field_h * var9 + (float)param0;
                var12 = (float)param1 + (float)this.field_e * var10;
                var13 = var11 + var9 * (float)this.field_a.field_t;
                var14 = (float)this.field_a.field_s * var10 + var12;
                if (this.field_f == null) {
                  this.field_c.a(true, this.field_a);
                  this.field_c.d(1, param4);
                  jaggl.OpenGL.glBegin(7);
                  jaggl.OpenGL.glTexCoord2f(0.0f, this.field_a.field_v);
                  jaggl.OpenGL.glVertex2f(var11, var12);
                  jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
                  jaggl.OpenGL.glVertex2f(var11, var14);
                  jaggl.OpenGL.glTexCoord2f(this.field_a.field_r, 0.0f);
                  jaggl.OpenGL.glVertex2f(var13, var14);
                  jaggl.OpenGL.glTexCoord2f(this.field_a.field_r, this.field_a.field_v);
                  jaggl.OpenGL.glVertex2f(var13, var12);
                  jaggl.OpenGL.glEnd();
                  if (var15 != 0) {
                    this.b(param4, 117);
                    this.field_f.b(true, 3);
                    jaggl.OpenGL.glBegin(7);
                    jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, this.field_a.field_v);
                    jaggl.OpenGL.glTexCoord2f(0.0f, this.field_a.field_v);
                    jaggl.OpenGL.glVertex2f(var11, var12);
                    jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
                    jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
                    jaggl.OpenGL.glVertex2f(var11, var14);
                    jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_a.field_r, 0.0f);
                    jaggl.OpenGL.glTexCoord2f(this.field_a.field_r, 0.0f);
                    jaggl.OpenGL.glVertex2f(var13, var14);
                    jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_a.field_r, this.field_a.field_v);
                    jaggl.OpenGL.glTexCoord2f(this.field_a.field_r, this.field_a.field_v);
                    jaggl.OpenGL.glVertex2f(var13, var12);
                    jaggl.OpenGL.glEnd();
                    this.a(0);
                    return;
                  } else {
                    return;
                  }
                } else {
                  this.b(param4, 117);
                  this.field_f.b(true, 3);
                  jaggl.OpenGL.glBegin(7);
                  jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, this.field_a.field_v);
                  jaggl.OpenGL.glTexCoord2f(0.0f, this.field_a.field_v);
                  jaggl.OpenGL.glVertex2f(var11, var12);
                  jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
                  jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
                  jaggl.OpenGL.glVertex2f(var11, var14);
                  jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_a.field_r, 0.0f);
                  jaggl.OpenGL.glTexCoord2f(this.field_a.field_r, 0.0f);
                  jaggl.OpenGL.glVertex2f(var13, var14);
                  jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_a.field_r, this.field_a.field_v);
                  jaggl.OpenGL.glTexCoord2f(this.field_a.field_r, this.field_a.field_v);
                  jaggl.OpenGL.glVertex2f(var13, var12);
                  jaggl.OpenGL.glEnd();
                  this.a(0);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
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
        qk stackIn_4_0 = null;
        qk stackIn_5_0 = null;
        qk stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        qk stackOut_3_0 = null;
        qk stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        qk stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          if (this.field_b) {
            var11 = (float)this.d();
            var12 = (float)this.b();
            var13 = (-param0 + param2) / var11;
            var14 = (-param1 + param3) / var11;
            var15 = (param4 - param0) / var12;
            var16 = (-param1 + param5) / var12;
            var17 = (float)this.field_e * var15;
            var18 = var16 * (float)this.field_e;
            var19 = var13 * (float)this.field_h;
            var20 = var14 * (float)this.field_h;
            var21 = -var13 * (float)this.field_i;
            var22 = (float)this.field_i * -var14;
            var23 = -var15 * (float)this.field_m;
            param1 = var20 + param1 + var18;
            var24 = (float)this.field_m * -var16;
            param2 = var21 + param2 + var17;
            param3 = param3 + var22 + var18;
            param4 = param4 + var19 + var23;
            param0 = var17 + (param0 + var19);
            param5 = param5 + var20 + var24;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var11 = param2 - param0 + param4;
          var12 = param5 - param1 + param3;
          stackOut_3_0 = this.field_a;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if ((1 & param9) == 0) {
            stackOut_5_0 = (qk) ((Object) stackIn_5_0);
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = (qk) ((Object) stackIn_4_0);
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        ((qk) (Object) stackIn_6_0).b(stackIn_6_1 != 0, 3);
        this.field_c.q(2);
        this.field_c.a(true, this.field_a);
        this.field_c.a((byte) 96, param8);
        this.field_c.d(1, param6);
        jaggl.OpenGL.glColor4ub((byte)(param7 >> -1390111024), (byte)(param7 >> -1911587416), (byte)param7, (byte)(param7 >> 1241225880));
        jaggl.OpenGL.glBegin(7);
        jaggl.OpenGL.glTexCoord2f(0.0f, this.field_a.field_v);
        jaggl.OpenGL.glVertex2f(param0, param1);
        jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
        jaggl.OpenGL.glVertex2f(param4, param5);
        jaggl.OpenGL.glTexCoord2f(this.field_a.field_r, 0.0f);
        jaggl.OpenGL.glVertex2f(var11, var12);
        jaggl.OpenGL.glTexCoord2f(this.field_a.field_r, this.field_a.field_v);
        jaggl.OpenGL.glVertex2f(param2, param3);
        jaggl.OpenGL.glEnd();
    }

    final void b(int param0, int param1, int param2, int param3) {
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
        this.field_m = param3;
        this.field_i = param2;
        this.field_h = param0;
        this.field_e = param1;
        stackOut_0_0 = this;
        stackIn_2_0 = stackOut_0_0;
        stackIn_1_0 = stackOut_0_0;
        if (0 == this.field_h) {
          stackOut_2_0 = this;
          stackIn_4_0 = stackOut_2_0;
          stackIn_3_0 = stackOut_2_0;
          if (this.field_e == 0) {
            stackOut_4_0 = this;
            stackIn_8_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (this.field_i == 0) {
              stackOut_8_0 = this;
              stackIn_10_0 = stackOut_8_0;
              stackIn_9_0 = stackOut_8_0;
              if (-1 != (this.field_m ^ -1)) {
                ((jja) (this)).field_b = true;
                return;
              } else {
                ((jja) (this)).field_b = false;
                return;
              }
            } else {
              stackOut_5_0 = this;
              stackOut_5_1 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              ((jja) (this)).field_b = stackIn_7_1 != 0;
              return;
            }
          } else {
            ((jja) (this)).field_b = true;
            return;
          }
        } else {
          ((jja) (this)).field_b = true;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_a.b(false, 3);
        this.field_c.q(2);
        this.field_c.a((byte) 46, param4);
        jaggl.OpenGL.glColor4ub((byte)(param3 >> 446922992), (byte)(param3 >> -494088536), (byte)param3, (byte)(param3 >> 1997670296));
        param0 = param0 + this.field_h;
        param1 = param1 + this.field_e;
        if (this.field_f == null) {
          this.field_c.a(true, this.field_a);
          this.field_c.d(1, param2);
          jaggl.OpenGL.glBegin(7);
          jaggl.OpenGL.glTexCoord2f(0.0f, this.field_a.field_v);
          jaggl.OpenGL.glVertex2i(param0, param1);
          jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
          jaggl.OpenGL.glVertex2i(param0, param1 - -this.field_a.field_s);
          jaggl.OpenGL.glTexCoord2f(this.field_a.field_r, 0.0f);
          jaggl.OpenGL.glVertex2i(this.field_a.field_t + param0, param1 + this.field_a.field_s);
          jaggl.OpenGL.glTexCoord2f(this.field_a.field_r, this.field_a.field_v);
          jaggl.OpenGL.glVertex2i(param0 + this.field_a.field_t, param1);
          jaggl.OpenGL.glEnd();
          if (TombRacer.field_G) {
            this.b(param2, -66);
            this.field_f.b(false, 3);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, this.field_a.field_v);
            jaggl.OpenGL.glTexCoord2f(0.0f, this.field_a.field_v);
            jaggl.OpenGL.glVertex2i(param0, param1);
            jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2i(param0, param1 + this.field_a.field_s);
            jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_a.field_r, 0.0f);
            jaggl.OpenGL.glTexCoord2f(this.field_a.field_r, 0.0f);
            jaggl.OpenGL.glVertex2i(this.field_a.field_t + param0, param1 - -this.field_a.field_s);
            jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_a.field_r, this.field_a.field_v);
            jaggl.OpenGL.glTexCoord2f(this.field_a.field_r, this.field_a.field_v);
            jaggl.OpenGL.glVertex2i(this.field_a.field_t + param0, param1);
            jaggl.OpenGL.glEnd();
            this.a(0);
            return;
          } else {
            return;
          }
        } else {
          this.b(param2, -66);
          this.field_f.b(false, 3);
          jaggl.OpenGL.glBegin(7);
          jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, this.field_a.field_v);
          jaggl.OpenGL.glTexCoord2f(0.0f, this.field_a.field_v);
          jaggl.OpenGL.glVertex2i(param0, param1);
          jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
          jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
          jaggl.OpenGL.glVertex2i(param0, param1 + this.field_a.field_s);
          jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_a.field_r, 0.0f);
          jaggl.OpenGL.glTexCoord2f(this.field_a.field_r, 0.0f);
          jaggl.OpenGL.glVertex2i(this.field_a.field_t + param0, param1 - -this.field_a.field_s);
          jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_a.field_r, this.field_a.field_v);
          jaggl.OpenGL.glTexCoord2f(this.field_a.field_r, this.field_a.field_v);
          jaggl.OpenGL.glVertex2i(this.field_a.field_t + param0, param1);
          jaggl.OpenGL.glEnd();
          this.a(0);
          return;
        }
    }

    final int a() {
        return this.field_a.field_t;
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        this.field_c.e(1, true);
        var3 = 105 / ((82 - param1) / 35);
        this.field_c.a(true, this.field_a);
        this.field_c.b(this.field_c.g(1, param0), 8960, 7681);
        this.field_c.c(1, 0, 34167, 768);
        this.field_c.b(34168, 3, 0, 770);
        this.field_c.e(0, true);
        this.field_c.a(true, this.field_f);
        this.field_c.b(34479, 8960, 7681);
        this.field_c.c(1, 0, 34166, 768);
        if (-1 != (this.field_g ^ -1)) {
          if (-2 == (this.field_g ^ -1)) {
            this.field_c.a(1.0f, 0.5f, 0.5f, (byte) -76, 0.0f);
            if (var4 != 0) {
              this.field_c.a(0.5f, 1.0f, 0.5f, (byte) -76, 0.0f);
              return;
            } else {
              return;
            }
          } else {
            if ((this.field_g ^ -1) != -3) {
              if (3 == this.field_g) {
                this.field_c.a(128.5f, 128.5f, 128.5f, (byte) -76, 0.0f);
                if (var4 != 0) {
                  this.field_c.a(1.0f, 0.5f, 0.5f, (byte) -76, 0.0f);
                  if (var4 != 0) {
                    this.field_c.a(0.5f, 1.0f, 0.5f, (byte) -76, 0.0f);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              this.field_c.a(0.5f, 0.5f, 1.0f, (byte) -76, 0.0f);
              if (var4 != 0) {
                if (3 == this.field_g) {
                  this.field_c.a(128.5f, 128.5f, 128.5f, (byte) -76, 0.0f);
                  if (var4 != 0) {
                    this.field_c.a(1.0f, 0.5f, 0.5f, (byte) -76, 0.0f);
                    if (var4 == 0) {
                      return;
                    } else {
                      this.field_c.a(0.5f, 1.0f, 0.5f, (byte) -76, 0.0f);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          this.field_c.a(0.5f, 1.0f, 0.5f, (byte) -76, 0.0f);
          return;
        }
    }

    final int c() {
        return this.field_a.field_s;
    }

    jja(cka param0, int param1, int param2, int[] param3, int param4, int param5) {
        this.field_e = 0;
        this.field_h = 0;
        this.field_g = 0;
        this.field_m = 0;
        this.field_i = 0;
        this.field_b = false;
        try {
            this.field_c = param0;
            this.field_a = mga.a(param2, param1, param3, param5, true, param4, false, param0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "jja.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_d = new ura();
        field_l = "Please send me news and updates (I can unsubscribe at any time)";
        field_k = "Return to lobby";
    }
}
