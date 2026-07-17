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
        try {
            ((wk) this).field_a.a(param2, 1);
            if (param1 != -1486691000) {
                Object var5 = null;
                boolean discarded$0 = wk.a((String) null, 16, (String) null, (String) null, (wd) null, -73, false);
            }
            ((wk) this).field_a.a(param0, (byte) -39);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "wk.J(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
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
        RuntimeException var7 = null;
        jq var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            if (ht.field_k == dk.field_h) {
              var8 = new jq(vn.field_f, param4);
              vn.field_f.a((ea) (Object) var8, 0);
              if (!gb.a(param5)) {
                L1: {
                  sd.field_h = param1;
                  if (!param6) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L1;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
                nl.field_s = stackIn_8_0 != 0;
                ld.field_c = null;
                rt.field_e = param3;
                fs.field_g = param0;
                ht.field_k = jq.field_fb;
                nh.field_b = param2;
                return true;
              } else {
                var8.n(126);
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var7;
            stackOut_11_1 = new StringBuilder().append("wk.C(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          L3: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          L5: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param4 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_10_0 != 0;
    }

    wk(wl param0) {
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
        ((wk) this).field_h = false;
        try {
          L0: {
            L1: {
              if (!param0.field_nc) {
                break L1;
              } else {
                L2: {
                  stackOut_2_0 = this;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (param0.field_Xb >= 3) {
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
                  ((wk) this).field_e = stackIn_5_1 != 0;
                  if (!((wk) this).field_e) {
                    stackOut_7_0 = 127;
                    stackIn_8_0 = stackOut_7_0;
                    break L3;
                  } else {
                    stackOut_6_0 = 48;
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
                    ((wk) this).field_d = new q[3];
                    ((wk) this).field_d[0] = new q(((wk) this).field_a, 6406, 64, false, var27, 6406);
                    ((wk) this).field_d[1] = new q(((wk) this).field_a, 6406, 64, false, var28, 6406);
                    ((wk) this).field_d[2] = new q(((wk) this).field_a, 6406, 64, false, var29, 6406);
                    this.d((byte) -57);
                    break L1;
                  } else {
                    var15 = 0;
                    L5: while (true) {
                      if (var15 >= 64) {
                        var14++;
                        continue L4;
                      } else {
                        var12 = (float)var14 * 2.0f / 64.0f - 1.0f;
                        var11 = -1.0f + (float)var15 * 2.0f / 64.0f;
                        var13 = (float)(1.0 / Math.sqrt((double)(var12 * var12 + (var11 * var11 + 1.0f))));
                        var11 = var11 * var13;
                        var12 = var12 * var13;
                        var16 = 0;
                        L6: while (true) {
                          if (var16 >= 6) {
                            var9++;
                            var15++;
                            continue L5;
                          } else {
                            L7: {
                              if (var16 != 0) {
                                if (var16 != 1) {
                                  if (var16 != 2) {
                                    if (var16 == 3) {
                                      var10 = -var12;
                                      break L7;
                                    } else {
                                      if (var16 != 4) {
                                        var10 = -var13;
                                        break L7;
                                      } else {
                                        var10 = var13;
                                        break L7;
                                      }
                                    }
                                  } else {
                                    var10 = var12;
                                    break L7;
                                  }
                                } else {
                                  var10 = var11;
                                  break L7;
                                }
                              } else {
                                var10 = -var11;
                                break L7;
                              }
                            }
                            L8: {
                              if (0.0f < var10) {
                                var6 = (int)(Math.pow((double)var10, 96.0) * (double)var2_int);
                                var7 = (int)(Math.pow((double)var10, 36.0) * (double)var2_int);
                                var8 = (int)(Math.pow((double)var10, 12.0) * (double)var2_int);
                                break L8;
                              } else {
                                var8 = 0;
                                var7 = 0;
                                var6 = 0;
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
            stackOut_33_1 = new StringBuilder().append("wk.<init>(");
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
          throw pn.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 41);
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
          ((wk) this).field_a.a(34168, 768, 34176, 0);
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
          jaggl.OpenGL.glMatrixMode(5888);
          if (!((wk) this).field_e) {
            ((wk) this).field_a.a(8448, -26625, 8448);
            ((wk) this).field_a.a(5890, 768, 34176, 0);
            ((wk) this).field_a.a(false, 2);
            ((wk) this).field_a.a(8448, -26625, 8448);
            ((wk) this).field_a.a(5890, 768, 34176, 0);
            ((wk) this).field_a.a(34168, 768, 34176, 1);
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
          jaggl.OpenGL.glMatrixMode(5888);
          if (!((wk) this).field_e) {
            ((wk) this).field_a.a(8448, -26625, 8448);
            ((wk) this).field_a.a(5890, 768, 34176, 0);
            ((wk) this).field_a.a(false, 2);
            ((wk) this).field_a.a(8448, -26625, 8448);
            ((wk) this).field_a.a(5890, 768, 34176, 0);
            ((wk) this).field_a.a(34168, 768, 34176, 1);
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
        if (l.field_c >= 224) {
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
