/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wt extends bq {
    private boolean field_j;
    private hp[] field_e;
    static rj field_i;
    private tq field_f;
    private boolean field_g;
    static int[] field_h;

    final boolean b(byte param0) {
        if (param0 >= -64) {
            return true;
        }
        return true;
    }

    final void a(byte param0, int param1, ht param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((wt) this).field_b.a(33, param2);
              ((wt) this).field_b.c(param1, true);
              if (param0 == 35) {
                break L1;
              } else {
                ((wt) this).a((byte) 46, 96, -43);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("wt.A(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final static void c(int param0) {
        if (param0 != 8193) {
            field_h = null;
        }
    }

    final void a(int param0, boolean param1) {
        ((wt) this).field_b.a(20685, 7681, 8448);
        if (param0 >= -30) {
            field_h = null;
        }
    }

    private final void d() {
        int var3 = 0;
        L0: {
          var3 = Sumoblitz.field_L ? 1 : 0;
          ((wt) this).field_f = new tq(((wt) this).field_b, 2);
          ((wt) this).field_f.a(0, 4864);
          ((wt) this).field_b.g(1, 98);
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
          if (((wt) this).field_j) {
            ((wt) this).field_b.a(20685, 7681, 260);
            ((wt) this).field_b.b(5890, 770, 0, -20);
            ((wt) this).field_b.a(117, 0, 34167, 770);
            break L0;
          } else {
            ((wt) this).field_b.a(20685, 8448, 7681);
            ((wt) this).field_b.b(34168, 768, 0, 30);
            ((wt) this).field_b.g(2, 123);
            ((wt) this).field_b.a(20685, 7681, 260);
            ((wt) this).field_b.b(34168, 768, 0, 4);
            ((wt) this).field_b.b(34168, 770, 1, 20);
            ((wt) this).field_b.a(125, 0, 34167, 770);
            break L0;
          }
        }
        L1: {
          ((wt) this).field_b.g(0, 83);
          ((wt) this).field_f.a(true);
          ((wt) this).field_f.a(1, 4864);
          ((wt) this).field_b.g(1, 102);
          jaggl.OpenGL.glDisable(3168);
          jaggl.OpenGL.glDisable(3169);
          jaggl.OpenGL.glDisable(3170);
          jaggl.OpenGL.glMatrixMode(5890);
          jaggl.OpenGL.glLoadIdentity();
          jaggl.OpenGL.glMatrixMode(5888);
          if (((wt) this).field_j) {
            ((wt) this).field_b.a(20685, 8448, 8448);
            ((wt) this).field_b.b(5890, 768, 0, -118);
            ((wt) this).field_b.a(122, 0, 5890, 770);
            break L1;
          } else {
            ((wt) this).field_b.a(20685, 8448, 8448);
            ((wt) this).field_b.b(5890, 768, 0, -120);
            ((wt) this).field_b.g(2, 111);
            ((wt) this).field_b.a(20685, 8448, 8448);
            ((wt) this).field_b.b(5890, 768, 0, 20);
            ((wt) this).field_b.b(34168, 768, 1, -126);
            ((wt) this).field_b.a(114, 0, 5890, 770);
            break L1;
          }
        }
        ((wt) this).field_b.g(0, 81);
        ((wt) this).field_f.a(true);
    }

    wt(fr param0) {
        super(param0);
        RuntimeException var2 = null;
        int var2_int = 0;
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
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        ((wt) this).field_g = false;
        try {
          L0: {
            L1: {
              if (!param0.field_Ob) {
                break L1;
              } else {
                L2: {
                  stackOut_2_0 = this;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (param0.field_T >= 3) {
                    stackOut_4_0 = this;
                    stackOut_4_1 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    break L2;
                  } else {
                    stackOut_3_0 = this;
                    stackOut_3_1 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    break L2;
                  }
                }
                L3: {
                  ((wt) this).field_j = stackIn_5_1 != 0;
                  if (((wt) this).field_j) {
                    stackOut_7_0 = 48;
                    stackIn_8_0 = stackOut_7_0;
                    break L3;
                  } else {
                    stackOut_6_0 = 127;
                    stackIn_8_0 = stackOut_6_0;
                    break L3;
                  }
                }
                var2_int = stackIn_8_0;
                var29 = new byte[6][4096];
                var27 = new byte[6][4096];
                var28 = new byte[6][4096];
                var9 = 0;
                var14 = 0;
                L4: while (true) {
                  if (64 <= var14) {
                    ((wt) this).field_e = new hp[3];
                    ((wt) this).field_e[0] = new hp(((wt) this).field_b, 6406, 64, false, var27, 6406);
                    ((wt) this).field_e[1] = new hp(((wt) this).field_b, 6406, 64, false, var28, 6406);
                    ((wt) this).field_e[2] = new hp(((wt) this).field_b, 6406, 64, false, var29, 6406);
                    int discarded$1 = -125;
                    this.d();
                    break L1;
                  } else {
                    var15 = 0;
                    L5: while (true) {
                      if (var15 >= 64) {
                        var14++;
                        continue L4;
                      } else {
                        var12 = 2.0f * (float)var14 / 64.0f - 1.0f;
                        var11 = -1.0f + 2.0f * (float)var15 / 64.0f;
                        var13 = (float)(1.0 / Math.sqrt((double)(var11 * var11 + 1.0f + var12 * var12)));
                        var12 = var12 * var13;
                        var11 = var11 * var13;
                        var16 = 0;
                        L6: while (true) {
                          if (var16 >= 6) {
                            var9++;
                            var15++;
                            continue L5;
                          } else {
                            L7: {
                              if (var16 != 0) {
                                if (var16 == 1) {
                                  var10 = var11;
                                  break L7;
                                } else {
                                  if (var16 != 2) {
                                    if (3 == var16) {
                                      var10 = -var12;
                                      break L7;
                                    } else {
                                      if (var16 == 4) {
                                        var10 = var13;
                                        break L7;
                                      } else {
                                        var10 = -var13;
                                        break L7;
                                      }
                                    }
                                  } else {
                                    var10 = var12;
                                    break L7;
                                  }
                                }
                              } else {
                                var10 = -var11;
                                break L7;
                              }
                            }
                            L8: {
                              if (0.0f >= var10) {
                                var8 = 0;
                                var7 = 0;
                                var6 = 0;
                                break L8;
                              } else {
                                var6 = (int)(Math.pow((double)var10, 96.0) * (double)var2_int);
                                var7 = (int)(Math.pow((double)var10, 36.0) * (double)var2_int);
                                var8 = (int)(Math.pow((double)var10, 12.0) * (double)var2_int);
                                break L8;
                              }
                            }
                            var27[var16][var9] = (byte)var6;
                            var28[var16][var9] = (byte)var7;
                            var29[var16][var9] = (byte)var8;
                            var16++;
                            continue L6;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var2;
            stackOut_33_1 = new StringBuilder().append("wt.<init>(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L9;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L9;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ')');
        }
    }

    public static void c() {
        field_i = null;
        field_h = null;
    }

    final void b(int param0) {
        if (((wt) this).field_g) {
            if (!(((wt) this).field_j)) {
                ((wt) this).field_b.g(2, 124);
                ((wt) this).field_b.a(39, (ht) null);
            }
            ((wt) this).field_b.g(1, 91);
            ((wt) this).field_b.a(59, (ht) null);
            ((wt) this).field_b.g(0, 92);
            ((wt) this).field_f.a((byte) 121, '');
            ((wt) this).field_g = false;
        } else {
            ((wt) this).field_b.a(118, 0, 5890, 770);
        }
        ((wt) this).field_b.a(20685, 8448, 8448);
        if (param0 > -125) {
            ((wt) this).field_e = null;
        }
    }

    final void a(byte param0, boolean param1) {
        L0: {
          if (param0 > 33) {
            break L0;
          } else {
            wt.c(-77);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((wt) this).field_f == null) {
              break L2;
            } else {
              if (!param1) {
                break L2;
              } else {
                L3: {
                  if (!((wt) this).field_j) {
                    ((wt) this).field_b.g(2, 89);
                    ((wt) this).field_b.a(101, (ht) (Object) ((wt) this).field_b.field_n);
                    ((wt) this).field_b.g(0, 105);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                ((wt) this).field_f.a((byte) 121, ' ');
                ((wt) this).field_g = true;
                break L1;
              }
            }
          }
          ((wt) this).field_b.a(124, 0, 34168, 770);
          break L1;
        }
    }

    final static void a(int param0, byte param1) {
        int discarded$7 = 1;
        ut.a(8, (byte) -55, nt.field_m[param0]);
        if (param1 < 27) {
            field_i = null;
        }
    }

    final void a(byte param0, int param1, int param2) {
        if (((wt) this).field_g) {
            ((wt) this).field_b.g(1, 122);
            ((wt) this).field_b.a(107, (ht) (Object) ((wt) this).field_e[param1 + -1]);
            ((wt) this).field_b.g(0, 95);
        }
        if (param0 < 39) {
            wt.c(-83);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new int[]{1, 1, 1};
    }
}
