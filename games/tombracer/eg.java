/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends da {
    private boolean field_g;
    private qk field_d;
    private cka field_e;
    private tla field_f;

    final void fa(char param0, int param1, int param2, int param3, boolean param4) {
        L0: {
          L1: {
            ((eg) this).field_e.o(-104);
            ((eg) this).field_e.a(true, (kl) (Object) ((eg) this).field_d);
            if (((eg) this).field_g) {
              break L1;
            } else {
              if (!param4) {
                ((eg) this).field_e.b(7681, 8960, 7681);
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((eg) this).field_e.b(7681, 8960, 8448);
          ((eg) this).field_e.c(0, 0, 34168, 768);
          break L0;
        }
        L2: {
          L3: {
            jaggl.OpenGL.glColor4ub((byte)(param3 >> 16), (byte)(param3 >> 8), (byte)param3, (byte)(param3 >> 24));
            jaggl.OpenGL.glTranslatef((float)param1, (float)param2, 0.0f);
            ((eg) this).field_f.a(4864, param0);
            jaggl.OpenGL.glLoadIdentity();
            if (((eg) this).field_g) {
              break L3;
            } else {
              if (!param4) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          ((eg) this).field_e.c(0, 0, 5890, 768);
          break L2;
        }
    }

    final void a(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7) {
        au var9 = null;
        qk var10 = null;
        float var11 = 0.0f;
        float var12 = 0.0f;
        L0: {
          L1: {
            var9 = (au) (Object) param5;
            var10 = var9.field_d;
            ((eg) this).field_e.o(107);
            ((eg) this).field_e.a(true, (kl) (Object) ((eg) this).field_d);
            if (((eg) this).field_g) {
              break L1;
            } else {
              if (!param4) {
                ((eg) this).field_e.b(7681, 8960, 7681);
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((eg) this).field_e.b(7681, 8960, 8448);
          ((eg) this).field_e.c(0, 0, 34168, 768);
          break L0;
        }
        L2: {
          L3: {
            ((eg) this).field_e.e(1, true);
            ((eg) this).field_e.a(true, (kl) (Object) var10);
            ((eg) this).field_e.b(7681, 8960, 8448);
            ((eg) this).field_e.c(0, 0, 34168, 768);
            jaggl.OpenGL.glTexGeni(8192, 9472, 9216);
            jaggl.OpenGL.glTexGeni(8193, 9472, 9216);
            var11 = var10.field_r / (float)var10.field_t;
            var12 = var10.field_v / (float)var10.field_s;
            jaggl.OpenGL.glTexGenfv(8192, 9474, new float[4], 0);
            jaggl.OpenGL.glTexGenfv(8193, 9474, new float[4], 0);
            jaggl.OpenGL.glEnable(3168);
            jaggl.OpenGL.glEnable(3169);
            jaggl.OpenGL.glColor4ub((byte)(param3 >> 16), (byte)(param3 >> 8), (byte)param3, (byte)(param3 >> 24));
            jaggl.OpenGL.glTranslatef((float)param1, (float)param2, 0.0f);
            ((eg) this).field_f.a(4864, param0);
            jaggl.OpenGL.glLoadIdentity();
            jaggl.OpenGL.glDisable(3168);
            jaggl.OpenGL.glDisable(3169);
            ((eg) this).field_e.c(0, 0, 5890, 768);
            ((eg) this).field_e.b(8448, 8960, 8448);
            ((eg) this).field_e.a(true, (kl) null);
            ((eg) this).field_e.e(0, true);
            if (((eg) this).field_g) {
              break L3;
            } else {
              if (!param4) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          ((eg) this).field_e.c(0, 0, 5890, 768);
          break L2;
        }
    }

    eg(cka param0, qla param1, jpa[] param2, boolean param3) {
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
        jpa var22 = null;
        jpa var23 = null;
        byte[] var24 = null;
        jpa var25 = null;
        byte[] var26 = null;
        byte[] var27 = null;
        int[] var28 = null;
        jpa var29 = null;
        byte[] var30 = null;
        byte[] var31 = null;
        byte[] var32 = null;
        int[] var33 = null;
        byte[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var37 = null;
        byte[] var38 = null;
        byte[] var39 = null;
        byte[] var40 = null;
        int[] var41 = null;
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
        ((eg) this).field_e = param0;
        var5 = 0;
        var6 = 0;
        L0: while (true) {
          if (var6 >= 256) {
            L1: {
              var6 = var5 * 16;
              if (!param3) {
                var41 = new int[var6 * var6];
                var37 = var41;
                var33 = var37;
                var28 = var33;
                var7_ref_int__ = var28;
                var8_int = 0;
                L2: while (true) {
                  if (var8_int >= 256) {
                    ((eg) this).field_d = mga.a(var6, var6, var41, 0, true, 0, false, param0);
                    ((eg) this).field_g = false;
                    break L1;
                  } else {
                    var25 = param2[var8_int];
                    var10 = var25.field_g;
                    var39 = var25.field_h;
                    var35 = var39;
                    var31 = var35;
                    var26 = var31;
                    var11_ref_byte__ = var26;
                    var40 = var25.field_f;
                    var36 = var40;
                    var32 = var36;
                    var27 = var32;
                    var12_ref_byte__ = var27;
                    var13 = var25.field_a;
                    var14 = var25.field_i;
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
                              var18_int++;
                              var21 = var12_ref_byte__[var18_int];
                              if (var12_ref_byte__[var18_int] == 0) {
                                var17_int++;
                                var20_int++;
                                continue L4;
                              } else {
                                var17_int++;
                                var7_ref_int__[var17_int] = -16777216 | var10[var21 & 255];
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
                              var17_int++;
                              var7_ref_int__[var17_int] = var39[var18_int] << 24 | var10[var40[var18_int] & 255];
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
                var38 = new byte[var6 * var6];
                var34 = var38;
                var30 = var34;
                var24 = var30;
                var7_ref_byte__ = var24;
                var8_int = 0;
                L7: while (true) {
                  if (var8_int >= 256) {
                    ((eg) this).field_d = jq.a(var38, 6406, (byte) 67, 6406, param0, var6, false, var6);
                    ((eg) this).field_g = true;
                    break L1;
                  } else {
                    var23 = param2[var8_int];
                    var10_int = var23.field_a;
                    var11 = var23.field_i;
                    var12 = var8_int % 16 * var5;
                    var13 = var8_int / 16 * var5;
                    var14 = var13 * var6 + var12;
                    var15_int = 0;
                    if (var23.field_h != null) {
                      var16_ref_byte__ = var23.field_h;
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
                              var14++;
                              var15_int++;
                              var7_ref_byte__[var14] = var16_ref_byte__[var15_int];
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
                      var16_ref_byte__ = var23.field_f;
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
                                var14++;
                                var15_int++;
                                stackOut_16_0 = (byte[]) var7_ref_byte__;
                                stackOut_16_1 = var14;
                                stackIn_18_0 = stackOut_16_0;
                                stackIn_18_1 = stackOut_16_1;
                                stackIn_17_0 = stackOut_16_0;
                                stackIn_17_1 = stackOut_16_1;
                                if (var16_ref_byte__[var15_int] != 0) {
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
            ((eg) this).field_d.b(false, 3);
            ((eg) this).field_f = new tla(param0, 256);
            var7 = ((eg) this).field_d.field_r / (float)((eg) this).field_d.field_t;
            var8 = ((eg) this).field_d.field_v / (float)((eg) this).field_d.field_s;
            var9 = 0;
            L13: while (true) {
              if (var9 >= 256) {
              } else {
                var29 = param2[var9];
                var11 = var29.field_a;
                var12 = var29.field_i;
                var13 = var29.field_c;
                var14 = var29.field_d;
                var15 = (float)(var9 % 16 * var5);
                var16 = (float)(var9 / 16 * var5);
                var17 = var15 * var7;
                var18 = var16 * var8;
                var19 = (var15 + (float)var12) * var7;
                var20 = (var16 + (float)var11) * var8;
                ((eg) this).field_f.a((byte) 6, var9);
                jaggl.OpenGL.glBegin(7);
                jaggl.OpenGL.glTexCoord2f(var17, ((eg) this).field_d.field_v - var18);
                jaggl.OpenGL.glVertex2i(var14, var13);
                jaggl.OpenGL.glTexCoord2f(var17, ((eg) this).field_d.field_v - var20);
                jaggl.OpenGL.glVertex2i(var14, var13 + var11);
                jaggl.OpenGL.glTexCoord2f(var19, ((eg) this).field_d.field_v - var20);
                jaggl.OpenGL.glVertex2i(var14 + var12, var13 + var11);
                jaggl.OpenGL.glTexCoord2f(var19, ((eg) this).field_d.field_v - var18);
                jaggl.OpenGL.glVertex2i(var14 + var12, var13);
                jaggl.OpenGL.glEnd();
                ((eg) this).field_f.b((byte) -111);
                var9++;
                continue L13;
              }
            }
          } else {
            L14: {
              var22 = param2[var6];
              if (var22.field_a <= var5) {
                break L14;
              } else {
                var5 = var22.field_a;
                break L14;
              }
            }
            if (var22.field_i > var5) {
              var5 = var22.field_i;
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }
}
