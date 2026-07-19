/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn extends da {
    private qfa field_f;
    private bt field_d;
    private boolean field_c;
    private im field_e;

    fn(qfa param0, sw param1, ima[] param2, boolean param3) {
        super(param0, param1);
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7_ref_int__ = null;
        byte[] var7_ref_byte__ = null;
        float var7 = 0.0f;
        int var8_int = 0;
        float var8 = 0.0f;
        int var9 = 0;
        int[] var10 = null;
        int var10_int = 0;
        byte[] var11_ref_byte__ = null;
        int var11 = 0;
        byte[] var12_ref_byte__ = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15_int = 0;
        float var15 = 0.0f;
        int var16_int = 0;
        byte[] var16_ref_byte__ = null;
        float var16 = 0.0f;
        int var17_int = 0;
        float var17 = 0.0f;
        int var18_int = 0;
        float var18 = 0.0f;
        int var19_int = 0;
        float var19 = 0.0f;
        float var20 = 0.0f;
        int var20_int = 0;
        int var21 = 0;
        ima var22 = null;
        ima var23 = null;
        byte[] var24 = null;
        ima var25 = null;
        byte[] var26 = null;
        byte[] var27 = null;
        int[] var28 = null;
        ima var29 = null;
        byte[] var30 = null;
        byte[] var31 = null;
        byte[] var32 = null;
        int[] var33 = null;
        byte[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        byte[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        byte[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        byte[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        byte[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        byte[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        this.field_f = param0;
        var5 = 0;
        var6 = 0;
        L0: while (true) {
          if (var6 >= 256) {
            L1: {
              var6 = var5 * 16;
              if (!param3) {
                var33 = new int[var6 * var6];
                var28 = var33;
                var7_ref_int__ = var28;
                var8_int = 0;
                L2: while (true) {
                  if (var8_int >= 256) {
                    this.field_e = uw.a(param0, 0, 0, var6, var33, var6, false, (byte) 60);
                    this.field_c = false;
                    break L1;
                  } else {
                    var25 = param2[var8_int];
                    var10 = var25.field_b;
                    var31 = var25.field_a;
                    var26 = var31;
                    var11_ref_byte__ = var26;
                    var32 = var25.field_h;
                    var27 = var32;
                    var12_ref_byte__ = var27;
                    var13 = var25.field_e;
                    var14 = var25.field_f;
                    var15_int = var8_int % 16 * var5;
                    var16_int = var8_int / 16 * var5;
                    var17_int = var16_int * var6 + var15_int;
                    var18_int = 0;
                    if (var11_ref_byte__ == null) {
                      var19_int = 0;
                      L3: while (true) {
                        if (var19_int < var13) {
                          var20_int = 0;
                          L4: while (true) {
                            if (var20_int >= var14) {
                              var17_int = var17_int + (var6 - var14);
                              var19_int++;
                              continue L3;
                            } else {
                              incrementValue$7 = var18_int;
                              var18_int++;
                              var21 = var12_ref_byte__[incrementValue$7];
                              if (var12_ref_byte__[incrementValue$7] == 0) {
                                var17_int++;
                                var20_int++;
                                continue L4;
                              } else {
                                incrementValue$8 = var17_int;
                                var17_int++;
                                var7_ref_int__[incrementValue$8] = -16777216 | var10[var21 & 255];
                                var20_int++;
                                continue L4;
                              }
                            }
                          }
                        } else {
                          var8_int++;
                          continue L2;
                        }
                      }
                    } else {
                      var19_int = 0;
                      L5: while (true) {
                        if (var19_int < var13) {
                          var20_int = 0;
                          L6: while (true) {
                            if (var20_int >= var14) {
                              var17_int = var17_int + (var6 - var14);
                              var19_int++;
                              continue L5;
                            } else {
                              incrementValue$9 = var17_int;
                              var17_int++;
                              var7_ref_int__[incrementValue$9] = var31[var18_int] << 24 | var10[var32[var18_int] & 255];
                              var18_int++;
                              var20_int++;
                              continue L6;
                            }
                          }
                        } else {
                          var8_int++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
              } else {
                var30 = new byte[var6 * var6];
                var24 = var30;
                var7_ref_byte__ = var24;
                var8_int = 0;
                L7: while (true) {
                  if (var8_int >= 256) {
                    this.field_e = kia.a(var6, param0, var6, var30, 6406, false, 21989, 6406);
                    this.field_c = true;
                    break L1;
                  } else {
                    var23 = param2[var8_int];
                    var10_int = var23.field_e;
                    var11 = var23.field_f;
                    var12 = var8_int % 16 * var5;
                    var13 = var8_int / 16 * var5;
                    var14 = var13 * var6 + var12;
                    var15_int = 0;
                    if (var23.field_a != null) {
                      var16_ref_byte__ = var23.field_a;
                      var17_int = 0;
                      L8: while (true) {
                        if (var17_int < var10_int) {
                          var18_int = 0;
                          L9: while (true) {
                            if (var18_int >= var11) {
                              var14 = var14 + (var6 - var11);
                              var17_int++;
                              continue L8;
                            } else {
                              incrementValue$10 = var14;
                              var14++;
                              incrementValue$11 = var15_int;
                              var15_int++;
                              var7_ref_byte__[incrementValue$10] = var16_ref_byte__[incrementValue$11];
                              var18_int++;
                              continue L9;
                            }
                          }
                        } else {
                          var8_int++;
                          continue L7;
                        }
                      }
                    } else {
                      var16_ref_byte__ = var23.field_h;
                      var17_int = 0;
                      L10: while (true) {
                        if (var17_int < var10_int) {
                          var18_int = 0;
                          L11: while (true) {
                            if (var18_int >= var11) {
                              var14 = var14 + (var6 - var11);
                              var17_int++;
                              continue L10;
                            } else {
                              L12: {
                                incrementValue$12 = var14;
                                var14++;
                                incrementValue$13 = var15_int;
                                var15_int++;
                                stackOut_16_0 = (byte[]) (var7_ref_byte__);
                                stackOut_16_1 = incrementValue$12;
                                stackIn_18_0 = stackOut_16_0;
                                stackIn_18_1 = stackOut_16_1;
                                stackIn_17_0 = stackOut_16_0;
                                stackIn_17_1 = stackOut_16_1;
                                if (var16_ref_byte__[incrementValue$13] != 0) {
                                  stackOut_18_0 = (byte[]) ((Object) stackIn_18_0);
                                  stackOut_18_1 = stackIn_18_1;
                                  stackOut_18_2 = -1;
                                  stackIn_19_0 = stackOut_18_0;
                                  stackIn_19_1 = stackOut_18_1;
                                  stackIn_19_2 = stackOut_18_2;
                                  break L12;
                                } else {
                                  stackOut_17_0 = (byte[]) ((Object) stackIn_17_0);
                                  stackOut_17_1 = stackIn_17_1;
                                  stackOut_17_2 = 0;
                                  stackIn_19_0 = stackOut_17_0;
                                  stackIn_19_1 = stackOut_17_1;
                                  stackIn_19_2 = stackOut_17_2;
                                  break L12;
                                }
                              }
                              stackIn_19_0[stackIn_19_1] = (byte)stackIn_19_2;
                              var18_int++;
                              continue L11;
                            }
                          }
                        } else {
                          var8_int++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              }
            }
            this.field_e.a(107, false);
            this.field_d = new bt(param0, 256);
            var7 = this.field_e.field_n / (float)this.field_e.field_m;
            var8 = this.field_e.field_o / (float)this.field_e.field_p;
            var9 = 0;
            L13: while (true) {
              if (var9 >= 256) {
                return;
              } else {
                var29 = param2[var9];
                var11 = var29.field_e;
                var12 = var29.field_f;
                var13 = var29.field_g;
                var14 = var29.field_c;
                var15 = (float)(var9 % 16 * var5);
                var16 = (float)(var9 / 16 * var5);
                var17 = var15 * var7;
                var18 = var16 * var8;
                var19 = (var15 + (float)var12) * var7;
                var20 = (var16 + (float)var11) * var8;
                this.field_d.a(-104, var9);
                jaggl.OpenGL.glBegin(7);
                jaggl.OpenGL.glTexCoord2f(var17, this.field_e.field_o - var18);
                jaggl.OpenGL.glVertex2i(var14, var13);
                jaggl.OpenGL.glTexCoord2f(var17, this.field_e.field_o - var20);
                jaggl.OpenGL.glVertex2i(var14, var13 + var11);
                jaggl.OpenGL.glTexCoord2f(var19, this.field_e.field_o - var20);
                jaggl.OpenGL.glVertex2i(var14 + var12, var13 + var11);
                jaggl.OpenGL.glTexCoord2f(var19, this.field_e.field_o - var18);
                jaggl.OpenGL.glVertex2i(var14 + var12, var13);
                jaggl.OpenGL.glEnd();
                this.field_d.b(4864);
                var9++;
                continue L13;
              }
            }
          } else {
            L14: {
              var22 = param2[var6];
              if (var22.field_e <= var5) {
                break L14;
              } else {
                var5 = var22.field_e;
                break L14;
              }
            }
            if (var22.field_f > var5) {
              var5 = var22.field_f;
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    final void fa(char param0, int param1, int param2, int param3, boolean param4) {
        L0: {
          L1: {
            this.field_f.c(false);
            this.field_f.a(115, this.field_e);
            if (this.field_c) {
              break L1;
            } else {
              if (!param4) {
                this.field_f.b(7681, 7681, false);
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.field_f.b(7681, 8448, false);
          this.field_f.c(0, 34192, 768, 34168);
          break L0;
        }
        L2: {
          L3: {
            jaggl.OpenGL.glColor4ub((byte)(param3 >> 16), (byte)(param3 >> 8), (byte)param3, (byte)(param3 >> 24));
            jaggl.OpenGL.glTranslatef((float)param1, (float)param2, 0.0f);
            this.field_d.a(true, param0);
            jaggl.OpenGL.glLoadIdentity();
            if (this.field_c) {
              break L3;
            } else {
              if (!param4) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          this.field_f.c(0, 34192, 768, 5890);
          break L2;
        }
    }

    final void a(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7) {
        asa var9 = null;
        im var10 = null;
        float var11 = 0.0f;
        float var12 = 0.0f;
        L0: {
          L1: {
            var9 = (asa) ((Object) param5);
            var10 = var9.field_b;
            this.field_f.c(false);
            this.field_f.a(34, this.field_e);
            if (this.field_c) {
              break L1;
            } else {
              if (!param4) {
                this.field_f.b(7681, 7681, false);
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.field_f.b(7681, 8448, false);
          this.field_f.c(0, 34192, 768, 34168);
          break L0;
        }
        L2: {
          L3: {
            this.field_f.h(33984, 1);
            this.field_f.a(126, var10);
            this.field_f.b(7681, 8448, false);
            this.field_f.c(0, 34192, 768, 34168);
            jaggl.OpenGL.glTexGeni(8192, 9472, 9216);
            jaggl.OpenGL.glTexGeni(8193, 9472, 9216);
            var11 = var10.field_n / (float)var10.field_m;
            var12 = var10.field_o / (float)var10.field_p;
            jaggl.OpenGL.glTexGenfv(8192, 9474, new float[]{var11, 0.0f, 0.0f, (float)(-param6) * var11}, 0);
            jaggl.OpenGL.glTexGenfv(8193, 9474, new float[]{0.0f, var12, 0.0f, (float)(-param7) * var12}, 0);
            jaggl.OpenGL.glEnable(3168);
            jaggl.OpenGL.glEnable(3169);
            jaggl.OpenGL.glColor4ub((byte)(param3 >> 16), (byte)(param3 >> 8), (byte)param3, (byte)(param3 >> 24));
            jaggl.OpenGL.glTranslatef((float)param1, (float)param2, 0.0f);
            this.field_d.a(true, param0);
            jaggl.OpenGL.glLoadIdentity();
            jaggl.OpenGL.glDisable(3168);
            jaggl.OpenGL.glDisable(3169);
            this.field_f.c(0, 34192, 768, 5890);
            this.field_f.b(8448, 8448, false);
            this.field_f.a(109, (pib) null);
            this.field_f.h(33984, 0);
            if (this.field_c) {
              break L3;
            } else {
              if (!param4) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          this.field_f.c(0, 34192, 768, 5890);
          break L2;
        }
    }
}
