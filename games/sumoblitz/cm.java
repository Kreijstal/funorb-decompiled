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
        this.field_g.a(false, 0);
        this.field_j.q(-97);
        this.field_j.c(25189, param4);
        jaggl.OpenGL.glColor4ub((byte)(param3 >> -1229480656), (byte)(param3 >> -1294747768), (byte)param3, (byte)(param3 >> -1113128136));
        param0 = param0 + this.field_i;
        param1 = param1 + this.field_f;
        if (this.field_d == null) {
          this.field_j.a(98, this.field_g);
          this.field_j.c(param2, true);
          jaggl.OpenGL.glBegin(7);
          jaggl.OpenGL.glTexCoord2f(0.0f, this.field_g.field_v);
          jaggl.OpenGL.glVertex2i(param0, param1);
          jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
          jaggl.OpenGL.glVertex2i(param0, this.field_g.field_p + param1);
          jaggl.OpenGL.glTexCoord2f(this.field_g.field_q, 0.0f);
          jaggl.OpenGL.glVertex2i(this.field_g.field_u + param0, param1 - -this.field_g.field_p);
          jaggl.OpenGL.glTexCoord2f(this.field_g.field_q, this.field_g.field_v);
          jaggl.OpenGL.glVertex2i(this.field_g.field_u + param0, param1);
          jaggl.OpenGL.glEnd();
          return;
        } else {
          this.b(6344, param2);
          this.field_d.a(false, 0);
          jaggl.OpenGL.glBegin(7);
          jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, this.field_g.field_v);
          jaggl.OpenGL.glTexCoord2f(0.0f, this.field_g.field_v);
          jaggl.OpenGL.glVertex2i(param0, param1);
          jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
          jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
          jaggl.OpenGL.glVertex2i(param0, param1 - -this.field_g.field_p);
          jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_g.field_q, 0.0f);
          jaggl.OpenGL.glTexCoord2f(this.field_g.field_q, 0.0f);
          jaggl.OpenGL.glVertex2i(param0 + this.field_g.field_u, this.field_g.field_p + param1);
          jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_g.field_q, this.field_g.field_v);
          jaggl.OpenGL.glTexCoord2f(this.field_g.field_q, this.field_g.field_v);
          jaggl.OpenGL.glVertex2i(this.field_g.field_u + param0, param1);
          jaggl.OpenGL.glEnd();
          this.a(0);
          return;
        }
    }

    final int b() {
        return this.field_i + (this.field_g.field_u + this.field_a);
    }

    final int d() {
        return this.field_g.field_p - (-this.field_f + -this.field_h);
    }

    final void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var9;
        int var10;
        int[] var11;
        int[] var12;
        int[] var14;
        int[] var17;
        var10 = Sumoblitz.field_L ? 1 : 0;
        if (!this.field_j.field_W) {
          this.field_g.a((byte) 125, param3, param0, param4, param1, param2, param5);
          if (param6 == -3773) {
            return;
          } else {
            this.b(3, -68, -66, -16, -63, 102, -72);
            return;
          }
        } else {
          var14 = this.field_j.b(param3, param5, 1, param2, param1);
          var12 = var14;
          var11 = var12;
          var17 = var11;
          if (var11 != null) {
            var9 = 0;
            L0: while (true) {
              if (var14.length <= var9) {
                this.a(param1, param0, (byte) -76, param5, var17, param4, 0, param5);
                if (param6 == -3773) {
                  return;
                } else {
                  this.b(3, -68, -66, -16, -63, 102, -72);
                  return;
                }
              } else {
                var11[var9] = ic.a(var14[var9], -16777216);
                var9++;
                continue L0;
              }
            }
          } else {
            if (param6 != -3773) {
              this.b(3, -68, -66, -16, -63, 102, -72);
              return;
            } else {
              return;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        float var9;
        float var10;
        float var11;
        float var12;
        float var13;
        float var14;
        int var15;
        f stackIn_2_0 = null;
        f stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        L0: {
          var15 = Sumoblitz.field_L ? 1 : 0;
          stackIn_2_0 = this.field_g;

          if (-1 == (param7 & 1 ^ -1)) {
            stackIn_3_0 = (f) ((Object) stackIn_2_0);
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = (f) ((Object) stackIn_2_0);
            stackIn_3_1 = 1;
            break L0;
          }
        }
        ((f) (Object) stackIn_3_0).a(stackIn_3_1 != 0, 0);
        this.field_j.q(-122);
        this.field_j.c(25189, param6);
        jaggl.OpenGL.glColor4ub((byte)(param5 >> 1370758544), (byte)(param5 >> -2077854808), (byte)param5, (byte)(param5 >> 1960969336));
        if (this.field_e) {
          var9 = (float)param2 / (float)this.b();
          var10 = (float)param3 / (float)this.d();
          var11 = (float)param0 + var9 * (float)this.field_i;
          var12 = (float)param1 + var10 * (float)this.field_f;
          var13 = var11 + (float)this.field_g.field_u * var9;
          var14 = (float)this.field_g.field_p * var10 + var12;
          if (null != this.field_d) {
            this.b(6344, param4);
            this.field_d.a(true, 0);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, this.field_g.field_v);
            jaggl.OpenGL.glTexCoord2f(0.0f, this.field_g.field_v);
            jaggl.OpenGL.glVertex2f(var11, var12);
            jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2f(var11, var14);
            jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_g.field_q, 0.0f);
            jaggl.OpenGL.glTexCoord2f(this.field_g.field_q, 0.0f);
            jaggl.OpenGL.glVertex2f(var13, var14);
            jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_g.field_q, this.field_g.field_v);
            jaggl.OpenGL.glTexCoord2f(this.field_g.field_q, this.field_g.field_v);
            jaggl.OpenGL.glVertex2f(var13, var12);
            jaggl.OpenGL.glEnd();
            this.a(0);
            return;
          } else {
            this.field_j.a(39, this.field_g);
            this.field_j.c(param4, true);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glTexCoord2f(0.0f, this.field_g.field_v);
            jaggl.OpenGL.glVertex2f(var11, var12);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2f(var11, var14);
            jaggl.OpenGL.glTexCoord2f(this.field_g.field_q, 0.0f);
            jaggl.OpenGL.glVertex2f(var13, var14);
            jaggl.OpenGL.glTexCoord2f(this.field_g.field_q, this.field_g.field_v);
            jaggl.OpenGL.glVertex2f(var13, var12);
            jaggl.OpenGL.glEnd();
            return;
          }
        } else {
          if (this.field_d != null) {
            this.b(6344, param4);
            this.field_d.a(true, 0);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, this.field_g.field_v);
            jaggl.OpenGL.glTexCoord2f(0.0f, this.field_g.field_v);
            jaggl.OpenGL.glVertex2i(param0, param1);
            jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2i(param0, param3 + param1);
            jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_g.field_q, 0.0f);
            jaggl.OpenGL.glTexCoord2f(this.field_g.field_q, 0.0f);
            jaggl.OpenGL.glVertex2i(param2 + param0, param1 - -param3);
            jaggl.OpenGL.glMultiTexCoord2f(33985, this.field_g.field_q, this.field_g.field_v);
            jaggl.OpenGL.glTexCoord2f(this.field_g.field_q, this.field_g.field_v);
            jaggl.OpenGL.glVertex2i(param0 + param2, param1);
            jaggl.OpenGL.glEnd();
            this.a(0);
            return;
          } else {
            this.field_j.a(127, this.field_g);
            this.field_j.c(param4, true);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glTexCoord2f(0.0f, this.field_g.field_v);
            jaggl.OpenGL.glVertex2i(param0, param1);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2i(param0, param3 + param1);
            jaggl.OpenGL.glTexCoord2f(this.field_g.field_q, 0.0f);
            jaggl.OpenGL.glVertex2i(param0 + param2, param3 + param1);
            jaggl.OpenGL.glTexCoord2f(this.field_g.field_q, this.field_g.field_v);
            jaggl.OpenGL.glVertex2i(param2 + param0, param1);
            jaggl.OpenGL.glEnd();
            return;
          }
        }
    }

    final int c() {
        return this.field_g.field_u;
    }

    final int a() {
        return this.field_g.field_p;
    }

    final void a(int param0, int param1, int param2, int param3) {
        Object stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        this.field_h = param3;
        this.field_i = param0;
        this.field_f = param1;
        this.field_a = param2;
        stackIn_2_0 = this;

        if (-1 == (this.field_i ^ -1)) {
          stackIn_4_0 = this;

          if (0 == this.field_f) {
            stackIn_8_0 = this;

            if (-1 == (this.field_a ^ -1)) {
              stackIn_10_0 = this;

              if (-1 != (this.field_h ^ -1)) {
                ((cm) (this)).field_e = true;
                return;
              } else {
                ((cm) (this)).field_e = false;
                return;
              }
            } else {
              stackIn_7_0 = this;
              stackIn_7_1 = 1;
              ((cm) (this)).field_e = stackIn_7_1 != 0;
              return;
            }
          } else {
            ((cm) (this)).field_e = true;
            return;
          }
        } else {
          ((cm) (this)).field_e = true;
          return;
        }
    }

    private final void a(int param0) {
        this.field_j.g(1, 119);
        this.field_j.a(24, (ht) null);
        this.field_j.a(param0 ^ 20685, 8448, 8448);
        this.field_j.b(34168, 768, 1, -128);
        this.field_j.a(112, 0, 5890, 770);
        this.field_j.g(param0, 112);
        this.field_j.b(34168, 768, 1, 92);
    }

    final void a(float param0, float param1, float param2, float param3, float param4, float param5, int param6, int param7, int param8, int param9) {
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
        float var11 = 0.0f;
        float var12 = 0.0f;
        if (!(!this.field_e)) {
            var11 = (float)this.b();
            var12 = (float)this.d();
            var13 = (param2 - param0) / var11;
            var14 = (param3 - param1) / var11;
            var15 = (param4 - param0) / var12;
            var16 = (param5 - param1) / var12;
            var17 = var15 * (float)this.field_f;
            var18 = (float)this.field_f * var16;
            var19 = var13 * (float)this.field_i;
            var20 = var14 * (float)this.field_i;
            var21 = (float)this.field_a * -var13;
            var22 = (float)this.field_a * -var14;
            var23 = -var15 * (float)this.field_h;
            var24 = -var16 * (float)this.field_h;
            param1 = var18 + (param1 + var20);
            param0 = param0 + var19 + var17;
            param4 = param4 + var19 + var23;
            param3 = param3 + var22 + var18;
            param2 = var17 + (param2 + var21);
            param5 = var24 + (param5 + var20);
        }
        var11 = param4 + (param2 - param0);
        var12 = param3 + (-param1 + param5);
        this.field_g.a((param9 & 1) != 0 ? true : false, 0);
        this.field_j.q(-70);
        this.field_j.a(110, this.field_g);
        this.field_j.c(25189, param8);
        this.field_j.c(param6, true);
        jaggl.OpenGL.glColor4ub((byte)(param7 >> -1827763280), (byte)(param7 >> -782156952), (byte)param7, (byte)(param7 >> -1585327592));
        jaggl.OpenGL.glBegin(7);
        jaggl.OpenGL.glTexCoord2f(0.0f, this.field_g.field_v);
        jaggl.OpenGL.glVertex2f(param0, param1);
        jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
        jaggl.OpenGL.glVertex2f(param4, param5);
        jaggl.OpenGL.glTexCoord2f(this.field_g.field_q, 0.0f);
        jaggl.OpenGL.glVertex2f(var11, var12);
        jaggl.OpenGL.glTexCoord2f(this.field_g.field_q, this.field_g.field_v);
        jaggl.OpenGL.glVertex2f(param2, param3);
        jaggl.OpenGL.glEnd();
    }

    cm(fr param0, int param1, int param2, int[] param3, int param4, int param5) {
        this.field_e = false;
        this.field_h = 0;
        this.field_a = 0;
        this.field_c = 0;
        this.field_f = 0;
        this.field_i = 0;
        try {
            this.field_j = param0;
            this.field_g = js.a(param2, param4, param5, false, param0, (byte) -119, param1, param3);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "cm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void b(int param0, int param1) {
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        this.field_j.g(1, 115);
        this.field_j.a(74, this.field_g);
        this.field_j.a(param0 ^ 18437, 7681, this.field_j.b(param1, (byte) -14));
        this.field_j.b(34167, 768, 1, -120);
        this.field_j.a(113, 0, 34168, 770);
        this.field_j.g(0, 100);
        if (param0 == 6344) {
          this.field_j.a(param0 ^ 6275, this.field_d);
          this.field_j.a(20685, 7681, 34479);
          this.field_j.b(34166, 768, 1, param0 + -6465);
          if (this.field_c != 0) {
            if (-2 != (this.field_c ^ -1)) {
              if ((this.field_c ^ -1) != -3) {
                if ((this.field_c ^ -1) != -4) {
                  return;
                } else {
                  this.field_j.a(31322, 128.5f, 128.5f, 128.5f, 0.0f);
                  return;
                }
              } else {
                this.field_j.a(31322, 0.5f, 1.0f, 0.5f, 0.0f);
                return;
              }
            } else {
              this.field_j.a(param0 + 24978, 1.0f, 0.5f, 0.5f, 0.0f);
              return;
            }
          } else {
            this.field_j.a(31322, 0.5f, 0.5f, 1.0f, 0.0f);
            return;
          }
        } else {
          this.a(114, -109, -63, -80, 49);
          this.field_j.a(param0 ^ 6275, this.field_d);
          this.field_j.a(20685, 7681, 34479);
          this.field_j.b(34166, 768, 1, param0 + -6465);
          if (this.field_c != 0) {
            if (-2 != (this.field_c ^ -1)) {
              if ((this.field_c ^ -1) != -3) {
                if ((this.field_c ^ -1) != -4) {
                  return;
                } else {
                  this.field_j.a(31322, 128.5f, 128.5f, 128.5f, 0.0f);
                  return;
                }
              } else {
                this.field_j.a(31322, 0.5f, 1.0f, 0.5f, 0.0f);
                return;
              }
            } else {
              this.field_j.a(param0 + 24978, 1.0f, 0.5f, 0.5f, 0.0f);
              return;
            }
          } else {
            this.field_j.a(31322, 0.5f, 0.5f, 1.0f, 0.0f);
            return;
          }
        }
    }

    private final void a(int param0, int param1, byte param2, int param3, int[] param4, int param5, int param6, int param7) {
        try {
            if (param2 >= -67) {
                this.b(-99, 125);
            }
            this.field_g.a(param0, param3, param5, param4, param6, param1, param7, true, true);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "cm.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_b = "LEVEL COMPLETE!";
    }
}
