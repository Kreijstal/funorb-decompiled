/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk extends hh {
    private boolean field_e;
    static int field_f;
    private si field_i;
    static double field_g;
    private boolean field_h;
    private q[] field_d;

    final void a(int param0, int param1, rt param2) {
        wd var5 = null;
        ((wk) this).field_a.a(param2, 1);
        if (param1 != -1486691000) {
          var5 = (wd) null;
          boolean discarded$2 = wk.a((String) null, 16, (String) null, (String) null, (wd) null, -73, false);
          ((wk) this).field_a.a(param0, (byte) -39);
          return;
        } else {
          ((wk) this).field_a.a(param0, (byte) -39);
          return;
        }
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 == -65) {
          if (((wk) this).field_h) {
            ((wk) this).field_a.a(false, 1);
            ((wk) this).field_a.a((rt) (Object) ((wk) this).field_d[param1 - 1], 1);
            ((wk) this).field_a.a(false, 0);
            return;
          } else {
            return;
          }
        } else {
          ((wk) this).a((byte) 58, 85, 122);
          if (!((wk) this).field_h) {
            return;
          } else {
            ((wk) this).field_a.a(false, 1);
            ((wk) this).field_a.a((rt) (Object) ((wk) this).field_d[param1 - 1], 1);
            ((wk) this).field_a.a(false, 0);
            return;
          }
        }
    }

    final static boolean a(String param0, int param1, String param2, String param3, wd param4, int param5, boolean param6) {
        if (ht.field_k != dk.field_h) {
            return false;
        }
        jq var8 = new jq(vn.field_f, param4);
        vn.field_f.a((ea) (Object) var8, 0);
        if (gb.a(param5)) {
            var8.n(126);
        } else {
            sd.field_h = param1;
            nl.field_s = param6 ? true : false;
            ld.field_c = null;
            rt.field_e = param3;
            fs.field_g = param0;
            ht.field_k = jq.field_fb;
            nh.field_b = param2;
            return true;
        }
        return true;
    }

    wk(wl param0) {
        super(param0);
        int var2 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        byte[][] var27 = null;
        byte[][] var28 = null;
        byte[][] var29 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_7_0 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          ((wk) this).field_h = false;
          if (!((wl) param0).field_nc) {
            break L0;
          } else {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (-4 >= (((wl) param0).field_Xb ^ -1)) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((wk) this).field_e = stackIn_4_1 != 0;
              if (!((wk) this).field_e) {
                stackOut_6_0 = 127;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 48;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            var2 = stackIn_7_0;
            var29 = new byte[6][4096];
            var27 = new byte[6][4096];
            var28 = new byte[6][4096];
            var9 = 0;
            var14 = 0;
            L3: while (true) {
              if (64 <= var14) {
                ((wk) this).field_d = new q[3];
                ((wk) this).field_d[0] = new q(((wk) this).field_a, 6406, 64, false, var27, 6406);
                ((wk) this).field_d[1] = new q(((wk) this).field_a, 6406, 64, false, var28, 6406);
                ((wk) this).field_d[2] = new q(((wk) this).field_a, 6406, 64, false, var29, 6406);
                this.d((byte) -57);
                break L0;
              } else {
                var15 = 0;
                L4: while (true) {
                  if (-65 >= (var15 ^ -1)) {
                    var14++;
                    continue L3;
                  } else {
                    var12 = (float)var14 * 2.0f / 64.0f - 1.0f;
                    var11 = -1.0f + (float)var15 * 2.0f / 64.0f;
                    var13 = (float)(1.0 / Math.sqrt((double)(var12 * var12 + (var11 * var11 + 1.0f))));
                    var11 = var11 * var13;
                    var12 = var12 * var13;
                    var16 = 0;
                    L5: while (true) {
                      if (-7 >= var16) {
                        var9++;
                        var15++;
                        continue L4;
                      } else {
                        L6: {
                          if (var16 != 0) {
                            if (var16 != 1) {
                              if (-3 != var16) {
                                if (-4 == var16) {
                                  var10 = -var12;
                                  break L6;
                                } else {
                                  if (-5 != var16) {
                                    var10 = -var13;
                                    break L6;
                                  } else {
                                    var10 = var13;
                                    break L6;
                                  }
                                }
                              } else {
                                var10 = var12;
                                break L6;
                              }
                            } else {
                              var10 = var11;
                              break L6;
                            }
                          } else {
                            var10 = -var11;
                            break L6;
                          }
                        }
                        L7: {
                          if (0.0f < var10) {
                            var6 = (int)(Math.pow((double)var10, 96.0) * (double)var2);
                            var7 = (int)(Math.pow((double)var10, 36.0) * (double)var2);
                            var8 = (int)(Math.pow((double)var10, 12.0) * (double)var2);
                            break L7;
                          } else {
                            var8 = 0;
                            var7 = 0;
                            var6 = 0;
                            break L7;
                          }
                        }
                        var27[var16][var9] = (byte)var6;
                        var28[var16][var9] = (byte)var7;
                        var29[var16][var9] = (byte)var8;
                        var16++;
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void a(int param0, boolean param1) {
        ((wk) this).field_a.a(8448, param0 ^ -30721, 7681);
        if (param0 != 4096) {
            wk.c((byte) 102);
        }
    }

    final boolean a(byte param0) {
        int var2 = -28 % ((-11 - param0) / 63);
        return true;
    }

    final void a(boolean param0, boolean param1) {
        if (null != ((wk) this).field_i) {
          if (param1) {
            L0: {
              if (!((wk) this).field_e) {
                ((wk) this).field_a.a(false, 2);
                ((wk) this).field_a.a((rt) (Object) ((wk) this).field_a.field_Vb, 1);
                ((wk) this).field_a.a(false, 0);
                break L0;
              } else {
                break L0;
              }
            }
            ((wk) this).field_i.a(-23085, ' ');
            ((wk) this).field_h = true;
            if (param0) {
              wk.c((byte) -106);
              return;
            } else {
              return;
            }
          } else {
            ((wk) this).field_a.a(770, 34168, 0, (byte) 81);
            if (param0) {
              wk.c((byte) -106);
              return;
            } else {
              return;
            }
          }
        } else {
          ((wk) this).field_a.a(770, 34168, 0, (byte) 81);
          if (param0) {
            wk.c((byte) -106);
            return;
          } else {
            return;
          }
        }
    }

    private final void d(byte param0) {
        int var3 = 0;
        var3 = AceOfSkies.field_G ? 1 : 0;
        ((wk) this).field_i = new si(((wk) this).field_a, 2);
        ((wk) this).field_i.a((byte) 125, 0);
        ((wk) this).field_a.a(false, 1);
        jaggl.OpenGL.glTexGeni(8192, 9472, 34065);
        jaggl.OpenGL.glTexGeni(8193, 9472, 34065);
        jaggl.OpenGL.glTexGeni(8194, 9472, 34065);
        jaggl.OpenGL.glEnable(3168);
        jaggl.OpenGL.glEnable(3169);
        jaggl.OpenGL.glEnable(3170);
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glRotatef(22.5f, 1.0f, 0.0f, 0.0f);
        jaggl.OpenGL.glMatrixMode(5888);
        if (!((wk) this).field_e) {
          ((wk) this).field_a.a(7681, -26625, 8448);
          ((wk) this).field_a.a(34168, 768, 34176, 0);
          ((wk) this).field_a.a(false, 2);
          ((wk) this).field_a.a(260, -26625, 7681);
          ((wk) this).field_a.a(34168, 768, param0 ^ -34233, 0);
          ((wk) this).field_a.a(34168, 770, 34176, 1);
          ((wk) this).field_a.a(770, 34167, 0, (byte) 107);
          ((wk) this).field_a.a(false, 0);
          ((wk) this).field_i.b(false);
          ((wk) this).field_i.a((byte) 37, 1);
          ((wk) this).field_a.a(false, 1);
          jaggl.OpenGL.glDisable(3168);
          jaggl.OpenGL.glDisable(3169);
          jaggl.OpenGL.glDisable(3170);
          jaggl.OpenGL.glMatrixMode(5890);
          jaggl.OpenGL.glLoadIdentity();
          if (param0 != -57) {
            ((wk) this).a((byte) 89, 16, 11);
            jaggl.OpenGL.glMatrixMode(5888);
            if (!((wk) this).field_e) {
              ((wk) this).field_a.a(8448, -26625, 8448);
              ((wk) this).field_a.a(5890, 768, 34176, 0);
              ((wk) this).field_a.a(false, 2);
              ((wk) this).field_a.a(8448, param0 + -26568, 8448);
              ((wk) this).field_a.a(5890, 768, 34176, 0);
              ((wk) this).field_a.a(34168, 768, param0 + 34233, 1);
              ((wk) this).field_a.a(770, 5890, 0, (byte) 82);
              ((wk) this).field_a.a(false, 0);
              ((wk) this).field_i.b(false);
              return;
            } else {
              ((wk) this).field_a.a(8448, -26625, 8448);
              ((wk) this).field_a.a(5890, 768, 34176, 0);
              ((wk) this).field_a.a(770, 5890, 0, (byte) 108);
              ((wk) this).field_a.a(false, 0);
              ((wk) this).field_i.b(false);
              return;
            }
          } else {
            jaggl.OpenGL.glMatrixMode(5888);
            if (!((wk) this).field_e) {
              ((wk) this).field_a.a(8448, -26625, 8448);
              ((wk) this).field_a.a(5890, 768, 34176, 0);
              ((wk) this).field_a.a(false, 2);
              ((wk) this).field_a.a(8448, param0 + -26568, 8448);
              ((wk) this).field_a.a(5890, 768, 34176, 0);
              ((wk) this).field_a.a(34168, 768, param0 + 34233, 1);
              ((wk) this).field_a.a(770, 5890, 0, (byte) 82);
              ((wk) this).field_a.a(false, 0);
              ((wk) this).field_i.b(false);
              return;
            } else {
              ((wk) this).field_a.a(8448, -26625, 8448);
              ((wk) this).field_a.a(5890, 768, 34176, 0);
              ((wk) this).field_a.a(770, 5890, 0, (byte) 108);
              ((wk) this).field_a.a(false, 0);
              ((wk) this).field_i.b(false);
              return;
            }
          }
        } else {
          ((wk) this).field_a.a(260, -26625, 7681);
          ((wk) this).field_a.a(5890, 770, 34176, 0);
          ((wk) this).field_a.a(770, 34167, 0, (byte) 75);
          ((wk) this).field_a.a(false, 0);
          ((wk) this).field_i.b(false);
          ((wk) this).field_i.a((byte) 37, 1);
          ((wk) this).field_a.a(false, 1);
          jaggl.OpenGL.glDisable(3168);
          jaggl.OpenGL.glDisable(3169);
          jaggl.OpenGL.glDisable(3170);
          jaggl.OpenGL.glMatrixMode(5890);
          jaggl.OpenGL.glLoadIdentity();
          if (param0 != -57) {
            ((wk) this).a((byte) 89, 16, 11);
            jaggl.OpenGL.glMatrixMode(5888);
            if (!((wk) this).field_e) {
              ((wk) this).field_a.a(8448, -26625, 8448);
              ((wk) this).field_a.a(5890, 768, 34176, 0);
              ((wk) this).field_a.a(false, 2);
              ((wk) this).field_a.a(8448, param0 + -26568, 8448);
              ((wk) this).field_a.a(5890, 768, 34176, 0);
              ((wk) this).field_a.a(34168, 768, param0 + 34233, 1);
              ((wk) this).field_a.a(770, 5890, 0, (byte) 82);
              ((wk) this).field_a.a(false, 0);
              ((wk) this).field_i.b(false);
              return;
            } else {
              ((wk) this).field_a.a(8448, -26625, 8448);
              ((wk) this).field_a.a(5890, 768, 34176, 0);
              ((wk) this).field_a.a(770, 5890, 0, (byte) 108);
              ((wk) this).field_a.a(false, 0);
              ((wk) this).field_i.b(false);
              return;
            }
          } else {
            jaggl.OpenGL.glMatrixMode(5888);
            if (!((wk) this).field_e) {
              ((wk) this).field_a.a(8448, -26625, 8448);
              ((wk) this).field_a.a(5890, 768, 34176, 0);
              ((wk) this).field_a.a(false, 2);
              ((wk) this).field_a.a(8448, param0 + -26568, 8448);
              ((wk) this).field_a.a(5890, 768, 34176, 0);
              ((wk) this).field_a.a(34168, 768, param0 + 34233, 1);
              ((wk) this).field_a.a(770, 5890, 0, (byte) 82);
              ((wk) this).field_a.a(false, 0);
              ((wk) this).field_i.b(false);
              return;
            } else {
              ((wk) this).field_a.a(8448, -26625, 8448);
              ((wk) this).field_a.a(5890, 768, 34176, 0);
              ((wk) this).field_a.a(770, 5890, 0, (byte) 108);
              ((wk) this).field_a.a(false, 0);
              ((wk) this).field_i.b(false);
              return;
            }
          }
        }
    }

    final void b(byte param0) {
        if (((wk) this).field_h) {
          if (((wk) this).field_e) {
            ((wk) this).field_a.a(false, 1);
            ((wk) this).field_a.a((rt) null, 1);
            ((wk) this).field_a.a(false, 0);
            ((wk) this).field_i.a(-23085, '');
            ((wk) this).field_h = false;
            ((wk) this).field_a.a(8448, -26625, 8448);
            if (param0 > 5) {
              return;
            } else {
              wk.c((byte) 80);
              return;
            }
          } else {
            ((wk) this).field_a.a(false, 2);
            ((wk) this).field_a.a((rt) null, 1);
            ((wk) this).field_a.a(false, 1);
            ((wk) this).field_a.a((rt) null, 1);
            ((wk) this).field_a.a(false, 0);
            ((wk) this).field_i.a(-23085, '');
            ((wk) this).field_h = false;
            ((wk) this).field_a.a(8448, -26625, 8448);
            if (param0 <= 5) {
              wk.c((byte) 80);
              return;
            } else {
              return;
            }
          }
        } else {
          ((wk) this).field_a.a(770, 5890, 0, (byte) 94);
          ((wk) this).field_a.a(8448, -26625, 8448);
          if (param0 > 5) {
            return;
          } else {
            wk.c((byte) 80);
            return;
          }
        }
    }

    final static void c(byte param0) {
        int var1 = 0;
        if (-225 >= (l.field_c ^ -1)) {
            ve.a((byte) 43, 256);
        } else {
            var1 = l.field_c % 32;
            ve.a((byte) 43, -var1 + l.field_c - -32);
        }
        var1 = -94 % ((param0 - -73) / 39);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_g = 0.0;
    }
}
