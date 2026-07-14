/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mu extends da {
    private wl field_f;
    private si field_g;
    private boolean field_e;
    private el field_h;

    final void a(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7) {
        dc var9 = null;
        el var10 = null;
        float var11 = 0.0f;
        float var12 = 0.0f;
        L0: {
          L1: {
            var9 = (dc) param5;
            var10 = ((dc) var9).field_e;
            ((mu) this).field_f.a((byte) 10);
            ((mu) this).field_f.a((rt) (Object) ((mu) this).field_h, 1);
            if (((mu) this).field_e) {
              break L1;
            } else {
              if (!param4) {
                ((mu) this).field_f.a(7681, -26625, 7681);
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((mu) this).field_f.a(7681, -26625, 8448);
          ((mu) this).field_f.a(34168, 768, 34176, 0);
          break L0;
        }
        L2: {
          L3: {
            ((mu) this).field_f.a(false, 1);
            ((mu) this).field_f.a((rt) (Object) var10, 1);
            ((mu) this).field_f.a(7681, -26625, 8448);
            ((mu) this).field_f.a(34168, 768, 34176, 0);
            jaggl.OpenGL.glTexGeni(8192, 9472, 9216);
            jaggl.OpenGL.glTexGeni(8193, 9472, 9216);
            var11 = ((el) var10).field_r / (float)((el) var10).field_q;
            var12 = ((el) var10).field_p / (float)((el) var10).field_o;
            jaggl.OpenGL.glTexGenfv(8192, 9474, new float[4], 0);
            jaggl.OpenGL.glTexGenfv(8193, 9474, new float[4], 0);
            jaggl.OpenGL.glEnable(3168);
            jaggl.OpenGL.glEnable(3169);
            jaggl.OpenGL.glColor4ub((byte)(param3 >> 16), (byte)(param3 >> 8), (byte)param3, (byte)(param3 >> 24));
            jaggl.OpenGL.glTranslatef((float)param1, (float)param2, 0.0f);
            ((mu) this).field_g.a(-23085, param0);
            jaggl.OpenGL.glLoadIdentity();
            jaggl.OpenGL.glDisable(3168);
            jaggl.OpenGL.glDisable(3169);
            ((mu) this).field_f.a(5890, 768, 34176, 0);
            ((mu) this).field_f.a(8448, -26625, 8448);
            ((mu) this).field_f.a((rt) null, 1);
            ((mu) this).field_f.a(false, 0);
            if (((mu) this).field_e) {
              break L3;
            } else {
              if (!param4) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          ((mu) this).field_f.a(5890, 768, 34176, 0);
          break L2;
        }
    }

    final void fa(char param0, int param1, int param2, int param3, boolean param4) {
        L0: {
          L1: {
            ((mu) this).field_f.a((byte) 10);
            ((mu) this).field_f.a((rt) (Object) ((mu) this).field_h, 1);
            if (((mu) this).field_e) {
              break L1;
            } else {
              if (!param4) {
                ((mu) this).field_f.a(7681, -26625, 7681);
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((mu) this).field_f.a(7681, -26625, 8448);
          ((mu) this).field_f.a(34168, 768, 34176, 0);
          break L0;
        }
        L2: {
          L3: {
            jaggl.OpenGL.glColor4ub((byte)(param3 >> 16), (byte)(param3 >> 8), (byte)param3, (byte)(param3 >> 24));
            jaggl.OpenGL.glTranslatef((float)param1, (float)param2, 0.0f);
            ((mu) this).field_g.a(-23085, param0);
            jaggl.OpenGL.glLoadIdentity();
            if (((mu) this).field_e) {
              break L3;
            } else {
              if (!param4) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          ((mu) this).field_f.a(5890, 768, 34176, 0);
          break L2;
        }
    }

    mu(wl param0, vs param1, vd[] param2, boolean param3) {
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
        vd var22 = null;
        vd var23 = null;
        byte[] var24 = null;
        vd var25 = null;
        byte[] var26 = null;
        byte[] var27 = null;
        int[] var28 = null;
        vd var29 = null;
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
        ((mu) this).field_f = param0;
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
                    ((mu) this).field_h = ab.a(param0, -125, false, var41, 0, 0, var6, var6);
                    ((mu) this).field_e = false;
                    break L1;
                  } else {
                    var25 = param2[var8_int];
                    var10 = ((vd) var25).field_f;
                    var39 = ((vd) var25).field_e;
                    var35 = var39;
                    var31 = var35;
                    var26 = var31;
                    var11_ref_byte__ = var26;
                    var40 = ((vd) var25).field_d;
                    var36 = var40;
                    var32 = var36;
                    var27 = var32;
                    var12_ref_byte__ = var27;
                    var13 = ((vd) var25).field_c;
                    var14 = ((vd) var25).field_h;
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
                    ((mu) this).field_h = wq.a(param0, var6, var6, false, 6406, 6406, 9980, var38);
                    ((mu) this).field_e = true;
                    break L1;
                  } else {
                    var23 = param2[var8_int];
                    var10_int = ((vd) var23).field_c;
                    var11 = ((vd) var23).field_h;
                    var12 = var8_int % 16 * var5;
                    var13 = var8_int / 16 * var5;
                    var14 = var13 * var6 + var12;
                    var15_int = 0;
                    if (((vd) var23).field_e != null) {
                      var16_ref_byte__ = ((vd) var23).field_e;
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
                      var16_ref_byte__ = ((vd) var23).field_d;
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
            ((mu) this).field_h.a(false, -128);
            ((mu) this).field_g = new si(param0, 256);
            var7 = ((mu) this).field_h.field_r / (float)((mu) this).field_h.field_q;
            var8 = ((mu) this).field_h.field_p / (float)((mu) this).field_h.field_o;
            var9 = 0;
            L13: while (true) {
              if (var9 >= 256) {
              } else {
                var29 = param2[var9];
                var11 = ((vd) var29).field_c;
                var12 = ((vd) var29).field_h;
                var13 = ((vd) var29).field_i;
                var14 = ((vd) var29).field_a;
                var15 = (float)(var9 % 16 * var5);
                var16 = (float)(var9 / 16 * var5);
                var17 = var15 * var7;
                var18 = var16 * var8;
                var19 = (var15 + (float)var12) * var7;
                var20 = (var16 + (float)var11) * var8;
                ((mu) this).field_g.a((byte) 111, var9);
                jaggl.OpenGL.glBegin(7);
                jaggl.OpenGL.glTexCoord2f(var17, ((mu) this).field_h.field_p - var18);
                jaggl.OpenGL.glVertex2i(var14, var13);
                jaggl.OpenGL.glTexCoord2f(var17, ((mu) this).field_h.field_p - var20);
                jaggl.OpenGL.glVertex2i(var14, var13 + var11);
                jaggl.OpenGL.glTexCoord2f(var19, ((mu) this).field_h.field_p - var20);
                jaggl.OpenGL.glVertex2i(var14 + var12, var13 + var11);
                jaggl.OpenGL.glTexCoord2f(var19, ((mu) this).field_h.field_p - var18);
                jaggl.OpenGL.glVertex2i(var14 + var12, var13);
                jaggl.OpenGL.glEnd();
                ((mu) this).field_g.b(false);
                var9++;
                continue L13;
              }
            }
          } else {
            L14: {
              var22 = param2[var6];
              if (((vd) var22).field_c <= var5) {
                break L14;
              } else {
                var5 = ((vd) var22).field_c;
                break L14;
              }
            }
            if (((vd) var22).field_h > var5) {
              var5 = ((vd) var22).field_h;
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
