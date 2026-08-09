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
            this.field_a.a(param2, 1);
            if (param1 != -1486691000) {
                wd var5 = (wd) null;
                wk.a((String) null, 16, (String) null, (String) null, (wd) null, -73, false);
            }
            this.field_a.a(param0, (byte) -39);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "wk.J(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 == -65) {
          if (this.field_h) {
            this.field_a.a(false, 1);
            this.field_a.a(this.field_d[param1 - 1], 1);
            this.field_a.a(false, 0);
            return;
          } else {
            return;
          }
        } else {
          this.a((byte) 58, 85, 122);
          if (!this.field_h) {
            return;
          } else {
            this.field_a.a(false, 1);
            this.field_a.a(this.field_d[param1 - 1], 1);
            this.field_a.a(false, 0);
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ht.field_k == dk.field_h) {
              var8 = new jq(vn.field_f, param4);
              vn.field_f.a(var8, 0);
              if (!gb.a(param5)) {
                L1: {
                  sd.field_h = param1;
                  if (!param6) {
                    stackIn_8_0 = 0;
                    break L1;
                  } else {
                    stackIn_8_0 = 1;
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
                stackIn_10_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var7);

            stackIn_13_1 = new StringBuilder().append("wk.C(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param4 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_14_0), stackIn_23_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    wk(wl param0) {
        super(param0);
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
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
        this.field_h = false;
        try {
          L0: {
            L1: {
              if (!param0.field_nc) {
                break L1;
              } else {
                L2: {
                  stackIn_4_0 = this;

                  if (-4 >= (param0.field_Xb ^ -1)) {
                    stackIn_5_0 = this;
                    stackIn_5_1 = 0;
                    break L2;
                  } else {
                    stackIn_5_0 = this;
                    stackIn_5_1 = 1;
                    break L2;
                  }
                }
                L3: {
                  ((wk) (this)).field_e = stackIn_5_1 != 0;
                  if (!this.field_e) {
                    stackIn_8_0 = 127;
                    break L3;
                  } else {
                    stackIn_8_0 = 48;
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
                    this.field_d = new q[3];
                    this.field_d[0] = new q(this.field_a, 6406, 64, false, var27, 6406);
                    this.field_d[1] = new q(this.field_a, 6406, 64, false, var28, 6406);
                    this.field_d[2] = new q(this.field_a, 6406, 64, false, var29, 6406);
                    this.d((byte) -57);
                    break L1;
                  } else {
                    var15 = 0;
                    L5: while (true) {
                      if (-65 >= (var15 ^ -1)) {
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
                          if (-7 >= (var16 ^ -1)) {
                            var9++;
                            var15++;
                            continue L5;
                          } else {
                            L7: {
                              if (var16 != 0) {
                                if (var16 != 1) {
                                  if (-3 != (var16 ^ -1)) {
                                    if (-4 == (var16 ^ -1)) {
                                      var10 = -var12;
                                      break L7;
                                    } else {
                                      if (-5 != (var16 ^ -1)) {
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
            stackIn_35_0 = (RuntimeException) (var2);

            stackIn_35_1 = new StringBuilder().append("wk.<init>(");

            if (param0 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L9;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L9;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ')');
        }
    }

    final void a(int param0, boolean param1) {
        this.field_a.a(8448, param0 ^ -30721, 7681);
        if (param0 != 4096) {
            wk.c((byte) 102);
        }
    }

    final boolean a(byte param0) {
        int var2 = -28 % ((-11 - param0) / 63);
        return true;
    }

    final void a(boolean param0, boolean param1) {
        if (null != this.field_i) {
          if (param1) {
            L0: {
              if (!this.field_e) {
                this.field_a.a(false, 2);
                this.field_a.a(this.field_a.field_Vb, 1);
                this.field_a.a(false, 0);
                break L0;
              } else {
                break L0;
              }
            }
            this.field_i.a(-23085, ' ');
            this.field_h = true;
            if (param0) {
              wk.c((byte) -106);
              return;
            } else {
              return;
            }
          } else {
            this.field_a.a(770, 34168, 0, (byte) 81);
            if (param0) {
              wk.c((byte) -106);
              return;
            } else {
              return;
            }
          }
        } else {
          this.field_a.a(770, 34168, 0, (byte) 81);
          if (param0) {
            wk.c((byte) -106);
            return;
          } else {
            return;
          }
        }
    }

    private final void d(byte param0) {
        int var3;
        var3 = AceOfSkies.field_G ? 1 : 0;
        this.field_i = new si(this.field_a, 2);
        this.field_i.a((byte) 125, 0);
        this.field_a.a(false, 1);
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
        if (!this.field_e) {
          this.field_a.a(7681, -26625, 8448);
          this.field_a.a(34168, 768, 34176, 0);
          this.field_a.a(false, 2);
          this.field_a.a(260, -26625, 7681);
          this.field_a.a(34168, 768, param0 ^ -34233, 0);
          this.field_a.a(34168, 770, 34176, 1);
          this.field_a.a(770, 34167, 0, (byte) 107);
          this.field_a.a(false, 0);
          this.field_i.b(false);
          this.field_i.a((byte) 37, 1);
          this.field_a.a(false, 1);
          jaggl.OpenGL.glDisable(3168);
          jaggl.OpenGL.glDisable(3169);
          jaggl.OpenGL.glDisable(3170);
          jaggl.OpenGL.glMatrixMode(5890);
          jaggl.OpenGL.glLoadIdentity();
          if (param0 != -57) {
            this.a((byte) 89, 16, 11);
            jaggl.OpenGL.glMatrixMode(5888);
            if (!this.field_e) {
              this.field_a.a(8448, -26625, 8448);
              this.field_a.a(5890, 768, 34176, 0);
              this.field_a.a(false, 2);
              this.field_a.a(8448, param0 + -26568, 8448);
              this.field_a.a(5890, 768, 34176, 0);
              this.field_a.a(34168, 768, param0 + 34233, 1);
              this.field_a.a(770, 5890, 0, (byte) 82);
              this.field_a.a(false, 0);
              this.field_i.b(false);
              return;
            } else {
              this.field_a.a(8448, -26625, 8448);
              this.field_a.a(5890, 768, 34176, 0);
              this.field_a.a(770, 5890, 0, (byte) 108);
              this.field_a.a(false, 0);
              this.field_i.b(false);
              return;
            }
          } else {
            jaggl.OpenGL.glMatrixMode(5888);
            if (!this.field_e) {
              this.field_a.a(8448, -26625, 8448);
              this.field_a.a(5890, 768, 34176, 0);
              this.field_a.a(false, 2);
              this.field_a.a(8448, param0 + -26568, 8448);
              this.field_a.a(5890, 768, 34176, 0);
              this.field_a.a(34168, 768, param0 + 34233, 1);
              this.field_a.a(770, 5890, 0, (byte) 82);
              this.field_a.a(false, 0);
              this.field_i.b(false);
              return;
            } else {
              this.field_a.a(8448, -26625, 8448);
              this.field_a.a(5890, 768, 34176, 0);
              this.field_a.a(770, 5890, 0, (byte) 108);
              this.field_a.a(false, 0);
              this.field_i.b(false);
              return;
            }
          }
        } else {
          this.field_a.a(260, -26625, 7681);
          this.field_a.a(5890, 770, 34176, 0);
          this.field_a.a(770, 34167, 0, (byte) 75);
          this.field_a.a(false, 0);
          this.field_i.b(false);
          this.field_i.a((byte) 37, 1);
          this.field_a.a(false, 1);
          jaggl.OpenGL.glDisable(3168);
          jaggl.OpenGL.glDisable(3169);
          jaggl.OpenGL.glDisable(3170);
          jaggl.OpenGL.glMatrixMode(5890);
          jaggl.OpenGL.glLoadIdentity();
          if (param0 != -57) {
            this.a((byte) 89, 16, 11);
            jaggl.OpenGL.glMatrixMode(5888);
            if (!this.field_e) {
              this.field_a.a(8448, -26625, 8448);
              this.field_a.a(5890, 768, 34176, 0);
              this.field_a.a(false, 2);
              this.field_a.a(8448, param0 + -26568, 8448);
              this.field_a.a(5890, 768, 34176, 0);
              this.field_a.a(34168, 768, param0 + 34233, 1);
              this.field_a.a(770, 5890, 0, (byte) 82);
              this.field_a.a(false, 0);
              this.field_i.b(false);
              return;
            } else {
              this.field_a.a(8448, -26625, 8448);
              this.field_a.a(5890, 768, 34176, 0);
              this.field_a.a(770, 5890, 0, (byte) 108);
              this.field_a.a(false, 0);
              this.field_i.b(false);
              return;
            }
          } else {
            jaggl.OpenGL.glMatrixMode(5888);
            if (!this.field_e) {
              this.field_a.a(8448, -26625, 8448);
              this.field_a.a(5890, 768, 34176, 0);
              this.field_a.a(false, 2);
              this.field_a.a(8448, param0 + -26568, 8448);
              this.field_a.a(5890, 768, 34176, 0);
              this.field_a.a(34168, 768, param0 + 34233, 1);
              this.field_a.a(770, 5890, 0, (byte) 82);
              this.field_a.a(false, 0);
              this.field_i.b(false);
              return;
            } else {
              this.field_a.a(8448, -26625, 8448);
              this.field_a.a(5890, 768, 34176, 0);
              this.field_a.a(770, 5890, 0, (byte) 108);
              this.field_a.a(false, 0);
              this.field_i.b(false);
              return;
            }
          }
        }
    }

    final void b(byte param0) {
        if (this.field_h) {
          if (this.field_e) {
            this.field_a.a(false, 1);
            this.field_a.a((rt) null, 1);
            this.field_a.a(false, 0);
            this.field_i.a(-23085, '');
            this.field_h = false;
            this.field_a.a(8448, -26625, 8448);
            if (param0 > 5) {
              return;
            } else {
              wk.c((byte) 80);
              return;
            }
          } else {
            this.field_a.a(false, 2);
            this.field_a.a((rt) null, 1);
            this.field_a.a(false, 1);
            this.field_a.a((rt) null, 1);
            this.field_a.a(false, 0);
            this.field_i.a(-23085, '');
            this.field_h = false;
            this.field_a.a(8448, -26625, 8448);
            if (param0 <= 5) {
              wk.c((byte) 80);
              return;
            } else {
              return;
            }
          }
        } else {
          this.field_a.a(770, 5890, 0, (byte) 94);
          this.field_a.a(8448, -26625, 8448);
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
        field_f = 0;
        field_g = 0.0;
    }
}
