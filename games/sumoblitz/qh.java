/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh extends da {
    private tq field_e;
    private f field_c;
    private fr field_f;
    private boolean field_d;

    final void a(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7) {
        lu var9 = null;
        f var10 = null;
        float var11 = 0.0f;
        float var12 = 0.0f;
        L0: {
          L1: {
            var9 = (lu) (Object) param5;
            var10 = var9.field_f;
            ((qh) this).field_f.k(-25462);
            ((qh) this).field_f.a(68, (ht) (Object) ((qh) this).field_c);
            if (((qh) this).field_d) {
              break L1;
            } else {
              if (!param4) {
                ((qh) this).field_f.a(20685, 7681, 7681);
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((qh) this).field_f.a(20685, 8448, 7681);
          ((qh) this).field_f.b(34168, 768, 0, -120);
          break L0;
        }
        L2: {
          L3: {
            ((qh) this).field_f.g(1, 86);
            ((qh) this).field_f.a(122, (ht) (Object) var10);
            ((qh) this).field_f.a(20685, 8448, 7681);
            ((qh) this).field_f.b(34168, 768, 0, -116);
            jaggl.OpenGL.glTexGeni(8192, 9472, 9216);
            jaggl.OpenGL.glTexGeni(8193, 9472, 9216);
            var11 = var10.field_q / (float)var10.field_u;
            var12 = var10.field_v / (float)var10.field_p;
            jaggl.OpenGL.glTexGenfv(8192, 9474, new float[4], 0);
            jaggl.OpenGL.glTexGenfv(8193, 9474, new float[4], 0);
            jaggl.OpenGL.glEnable(3168);
            jaggl.OpenGL.glEnable(3169);
            jaggl.OpenGL.glColor4ub((byte)(param3 >> 16), (byte)(param3 >> 8), (byte)param3, (byte)(param3 >> 24));
            jaggl.OpenGL.glTranslatef((float)param1, (float)param2, 0.0f);
            ((qh) this).field_e.a((byte) 121, param0);
            jaggl.OpenGL.glLoadIdentity();
            jaggl.OpenGL.glDisable(3168);
            jaggl.OpenGL.glDisable(3169);
            ((qh) this).field_f.b(5890, 768, 0, -116);
            ((qh) this).field_f.a(20685, 8448, 8448);
            ((qh) this).field_f.a(103, (ht) null);
            ((qh) this).field_f.g(0, 115);
            if (((qh) this).field_d) {
              break L3;
            } else {
              if (!param4) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          ((qh) this).field_f.b(5890, 768, 0, -124);
          break L2;
        }
    }

    qh(fr param0, ta param1, ri[] param2, boolean param3) {
        super((ha) (Object) param0, param1);
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
        ri var22 = null;
        ri var23 = null;
        ri var24 = null;
        byte[] var25 = null;
        byte[] var26 = null;
        int[] var27 = null;
        ri var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        int[] var31 = null;
        byte[] var32 = null;
        byte[] var33 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var37 = null;
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
        ((qh) this).field_f = param0;
        var5 = 0;
        var6 = 0;
        L0: while (true) {
          if (var6 >= 256) {
            L1: {
              var6 = var5 * 16;
              if (!param3) {
                var37 = new int[var6 * var6];
                var34 = var37;
                var31 = var34;
                var27 = var31;
                var7_ref_int__ = var27;
                var8_int = 0;
                L2: while (true) {
                  if (var8_int >= 256) {
                    ((qh) this).field_c = js.a(var6, 0, 0, false, param0, (byte) -125, var6, var37);
                    ((qh) this).field_d = false;
                    break L1;
                  } else {
                    var24 = param2[var8_int];
                    var10 = var24.field_g;
                    var35 = var24.field_a;
                    var32 = var35;
                    var29 = var32;
                    var25 = var29;
                    var11_ref_byte__ = var25;
                    var36 = var24.field_e;
                    var33 = var36;
                    var30 = var33;
                    var26 = var30;
                    var12_ref_byte__ = var26;
                    var13 = var24.field_i;
                    var14 = var24.field_h;
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
                              int incrementValue$11 = var18_int;
                              var18_int++;
                              var21 = var12_ref_byte__[incrementValue$11];
                              if (var12_ref_byte__[incrementValue$11] == 0) {
                                var17_int++;
                                var20_int++;
                                continue L4;
                              } else {
                                int incrementValue$12 = var17_int;
                                var17_int++;
                                var7_ref_int__[incrementValue$12] = -16777216 | var10[var21 & 255];
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
                              int incrementValue$13 = var17_int;
                              var17_int++;
                              var7_ref_int__[incrementValue$13] = var35[var18_int] << 24 | var10[var36[var18_int] & 255];
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
                var7_ref_byte__ = new byte[var6 * var6];
                var8_int = 0;
                L7: while (true) {
                  if (var8_int >= 256) {
                    int discarded$14 = 6406;
                    int discarded$15 = 121;
                    int discarded$16 = 6406;
                    int discarded$17 = 0;
                    ((qh) this).field_c = wp.a(param0, var6, var6, var7_ref_byte__);
                    ((qh) this).field_d = true;
                    break L1;
                  } else {
                    var23 = param2[var8_int];
                    var10_int = var23.field_i;
                    var11 = var23.field_h;
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
                              int incrementValue$18 = var14;
                              var14++;
                              int incrementValue$19 = var15_int;
                              var15_int++;
                              var7_ref_byte__[incrementValue$18] = var16_ref_byte__[incrementValue$19];
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
                      var16_ref_byte__ = var23.field_e;
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
                                int incrementValue$20 = var14;
                                var14++;
                                int incrementValue$21 = var15_int;
                                var15_int++;
                                stackOut_16_0 = (byte[]) var7_ref_byte__;
                                stackOut_16_1 = incrementValue$20;
                                stackIn_18_0 = stackOut_16_0;
                                stackIn_18_1 = stackOut_16_1;
                                stackIn_17_0 = stackOut_16_0;
                                stackIn_17_1 = stackOut_16_1;
                                if (var16_ref_byte__[incrementValue$21] != 0) {
                                  stackOut_18_0 = (byte[]) (Object) stackIn_18_0;
                                  stackOut_18_1 = stackIn_18_1;
                                  stackOut_18_2 = -1;
                                  stackIn_19_0 = stackOut_18_0;
                                  stackIn_19_1 = stackOut_18_1;
                                  stackIn_19_2 = stackOut_18_2;
                                  break L12;
                                } else {
                                  stackOut_17_0 = (byte[]) (Object) stackIn_17_0;
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
            ((qh) this).field_c.a(false, 0);
            ((qh) this).field_e = new tq(param0, 256);
            var7 = ((qh) this).field_c.field_q / (float)((qh) this).field_c.field_u;
            var8 = ((qh) this).field_c.field_v / (float)((qh) this).field_c.field_p;
            var9 = 0;
            L13: while (true) {
              if (var9 >= 256) {
                return;
              } else {
                var28 = param2[var9];
                var11 = var28.field_i;
                var12 = var28.field_h;
                var13 = var28.field_d;
                var14 = var28.field_c;
                var15 = (float)(var9 % 16 * var5);
                var16 = (float)(var9 / 16 * var5);
                var17 = var15 * var7;
                var18 = var16 * var8;
                var19 = (var15 + (float)var12) * var7;
                var20 = (var16 + (float)var11) * var8;
                ((qh) this).field_e.a(var9, 4864);
                jaggl.OpenGL.glBegin(7);
                jaggl.OpenGL.glTexCoord2f(var17, ((qh) this).field_c.field_v - var18);
                jaggl.OpenGL.glVertex2i(var14, var13);
                jaggl.OpenGL.glTexCoord2f(var17, ((qh) this).field_c.field_v - var20);
                jaggl.OpenGL.glVertex2i(var14, var13 + var11);
                jaggl.OpenGL.glTexCoord2f(var19, ((qh) this).field_c.field_v - var20);
                jaggl.OpenGL.glVertex2i(var14 + var12, var13 + var11);
                jaggl.OpenGL.glTexCoord2f(var19, ((qh) this).field_c.field_v - var18);
                jaggl.OpenGL.glVertex2i(var14 + var12, var13);
                jaggl.OpenGL.glEnd();
                ((qh) this).field_e.a(true);
                var9++;
                continue L13;
              }
            }
          } else {
            L14: {
              var22 = param2[var6];
              if (var22.field_i <= var5) {
                break L14;
              } else {
                var5 = var22.field_i;
                break L14;
              }
            }
            if (var22.field_h > var5) {
              var5 = var22.field_h;
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
            ((qh) this).field_f.k(-25462);
            ((qh) this).field_f.a(45, (ht) (Object) ((qh) this).field_c);
            if (((qh) this).field_d) {
              break L1;
            } else {
              if (!param4) {
                ((qh) this).field_f.a(20685, 7681, 7681);
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((qh) this).field_f.a(20685, 8448, 7681);
          ((qh) this).field_f.b(34168, 768, 0, -121);
          break L0;
        }
        L2: {
          L3: {
            jaggl.OpenGL.glColor4ub((byte)(param3 >> 16), (byte)(param3 >> 8), (byte)param3, (byte)(param3 >> 24));
            jaggl.OpenGL.glTranslatef((float)param1, (float)param2, 0.0f);
            ((qh) this).field_e.a((byte) 121, param0);
            jaggl.OpenGL.glLoadIdentity();
            if (((qh) this).field_d) {
              break L3;
            } else {
              if (!param4) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          ((qh) this).field_f.b(5890, 768, 0, -2);
          break L2;
        }
    }
}
