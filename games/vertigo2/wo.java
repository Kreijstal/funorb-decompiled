/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wo {
    int field_k;
    int field_a;
    private int field_h;
    private int field_U;
    private boolean field_T;
    private int field_K;
    static double field_S;
    int field_E;
    static lg[] field_q;
    private int field_bb;
    private boolean field_x;
    boolean field_z;
    private int field_t;
    private boolean field_r;
    int field_W;
    static String[] field_V;
    int field_I;
    boolean field_A;
    private boolean field_i;
    byte field_C;
    int field_l;
    int field_p;
    int[] field_P;
    private boolean field_o;
    private int field_n;
    private int field_f;
    int field_X;
    private int field_Y;
    static boolean field_s;
    private int field_D;
    private int field_u;
    static String field_b;
    int field_c;
    int field_w;
    private int field_ab;
    int field_g;
    private int field_Z;
    int field_N;
    boolean field_G;
    private int field_j;
    int field_H;
    int[] field_L;
    private int field_B;
    private byte field_v;
    private boolean field_R;
    private boolean field_F;
    private int field_J;
    int field_y;
    private boolean field_e;
    int field_O;
    int field_d;
    private int field_Q;
    int field_m;
    private int field_M;

    final void b(byte param0) {
        this.field_J = 0;
        if (param0 >= -10) {
          this.c(-60);
        }
    }

    private final void i(byte param0) {
        if (param0 >= -115) {
          return;
        }
        this.field_A = false;
    }

    final void b(int param0, int param1) {
        if (param1 != -7394) {
          this.g(40);
        }
        if (1 != this.field_J) {
          this.field_h = param0;
        }
    }

    final void k(int param0) {
        this.field_J = param0;
        this.field_ab = -1;
    }

    final void a(boolean param0, int param1, int param2) {
        int var5;
        var5 = Vertigo2.field_L ? 1 : 0;
        if (param0) {
          return;
        }
        if (this.field_N < 2) {
          this.field_O = -this.field_O / 2;
          this.field_c = -this.field_c / 2;
          if (this.field_O > -704 &&
            this.field_O < 704) {
            this.field_O = 0;
          }
          if (this.field_c > -704 &&
            this.field_c < 704) {
            this.field_c = 0;
          }
          this.field_E = this.field_M;
          this.field_y = this.field_Q;
        } else {
          this.field_N = 3;
          if (param2 >= this.field_y) {
            this.field_O = this.field_O - 22;
          } else {
            this.field_O = this.field_O + 22;
          }
          if (param1 < this.field_E) {
            this.field_c = this.field_c + 22;
          } else {
            this.field_c = this.field_c - 22;
          }
        }
    }

    final int l(int param0) {
        if (param0 != -32768) {
          this.a(103, 35, -63);
        }
        return this.field_ab;
    }

    private final void e(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int stackIn_9_0 = 0;
        if (param0 != 7883) {
          return;
        }
        if (9 != this.field_J &&
          -50 != this.field_X &&
          0 < this.field_U) {
          this.field_U = this.field_U - 1;
          this.field_J = 9;
          this.field_t = 28;
          this.field_X = -50;
          var2 = -this.field_k + (-480 + this.field_f * 240) - 30 << 8;
          var3 = 64 + var2;
          var4 = 128 + wg.a(115, -var3 << 8);
          var4 = var4 << 1;
          var5 = -wg.a(124, -var3 << 8) + 128;
          var5 = var5 << 1;
          var4 = var4 >> 8;
          var5 = var5 >> 8;
          stackIn_9_0 = (Math.abs(var4) >= Math.abs(var5)) ? 0 : 1;
          var6 = stackIn_9_0;
          if (var6 == 0) {
            this.field_h = var5;
          } else {
            this.field_h = var4;
          }
          return;
        }
    }

    final int j(int param0) {
        if (param0 <= 48) {
          this.c(3);
        }
        return this.field_n;
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4, int param5) {
        int var8;
        String var8_ref_String;
        int var9;
        Object var10;
        int var11_int;
        String var11;
        String var12_ref_String;
        int var12;
        int var13;
        String var13_ref_String;
        int var14;
        StringBuilder var15;
        int var16;
        int var17;
        String var18;
        wn var19;
        String var20;
        String var21;
        int var11_intLifetime1;
        int var13Lifetime1;
        int var16Lifetime1;
        var17 = Vertigo2.field_L ? 1 : 0;
        if (8 == this.field_J) {
          return;
        }
        if (this.field_J != 4 &&
          this.field_J != 7) {
          var19 = va.field_s;
          if (6 == this.field_J) {
            var8_ref_String = Vertigo2.a(new String[]{Integer.toString(this.field_t / 50)}, jd.field_c, -18);
            var19.a(var8_ref_String, 16777215, -1, 320, 240, 2);
            return;
          }
          if (2 != param0 &&
            3 != param0) {
            tn.field_i.e(10, 10);
            va.field_s.a(16777215, (byte) 75, -1, tn.field_i.field_x + 15, Vertigo2.a(new String[]{Integer.toString(this.field_ab)}, uj.field_k, 109), 10 + (va.field_s.field_k + 10));
          }
          var8 = td.field_c.field_C;
          var9 = 0;
          if (param0 == 2 ||
            param0 == 1) {
            var9 = 32;
          }
          var10 = null;
          if (0 == this.field_Y * this.field_Y) {
            var10 = uo.field_e;
          } else {
            if (this.field_Y < 0) {
              var10 = bh.field_y[-this.field_Y - 1];
            } else {
              if (this.field_Y > 0) {
                var10 = im.field_c[-1 + this.field_Y];
              }
            }
          }
          if (var10 != null) {
            ((fe) (var10)).e(-((fe) (var10)).field_x + 625, -((fe) (var10)).field_B + var8 - 12);
          }
          if (this.field_g > 0) {
            var11_int = 25;
            be.field_n.e(-5 + var11_int, 5 + (-be.field_n.field_B + (var8 - var9) - 20));
            va.field_s.a(16777215, (byte) 77, -1, 48, Integer.toString(this.field_g), 5 + (var8 + (-20 - var9) - (be.field_n.field_B - va.field_s.field_k)));
            qi.a(false, var11_int, 25, var8 - 20 - (var9 + be.field_n.field_B));
          }
          if (this.field_U > 0) {
            var11_intLifetime1 = -60 - (var9 - var8) - bj.field_j.field_B;
            bj.field_j.e(20, var11_intLifetime1 + 5);
            va.field_s.a(16777215, (byte) 124, -1, 48, Integer.toString(this.field_U), 5 + va.field_s.field_k + var11_intLifetime1);
            qi.a(false, 25, 25, var11_intLifetime1);
          }
          if (!this.field_x) {
            var20 = Integer.toString(this.field_W);
            var13 = var20.length();
            var14 = 6;
            var15 = new StringBuilder(var14);
            w.a(true, ' ', var14, var15);
            for (var16 = 0; -var13 + var14 > var16; var16++) {
              var15.setCharAt(var16, '0');
            }
            for (var16Lifetime1 = -var13 + var14; var14 > var16Lifetime1; var16Lifetime1++) {
              var15.setCharAt(var16Lifetime1, var20.charAt(var16Lifetime1 - (var14 - var13)));
            }
            var11 = Vertigo2.a(new String[]{var15.toString()}, mj.field_a, -124);
          } else {
            var18 = Integer.toString(param2);
            var12_ref_String = var18;
            var13_ref_String = Integer.toString(param5);
            var11 = Vertigo2.a(new String[]{var18, var13_ref_String}, kb.field_f, 3);
            if (this.field_R) {
              wi.field_j[30][0].a(0, 2047 - Math.abs((2 * this.field_D & 511) - 255), 0, 0, -270, -75, 500, 0L);
            }
          }
          if (param1 != param0) {
            var12 = va.field_s.a(param1 - 2, var11);
            qi.a(false, 620 - var12, var12, 10);
            va.field_s.a(16777215, (byte) 109, -1, -var12 + 620, var11, -2 + va.field_s.field_k + 16);
          }
          if (0 < this.field_H) {
            var21 = Vertigo2.a(new String[]{gl.a(-126, true, false, this.field_H)}, mc.field_f, -114);
            var13Lifetime1 = va.field_s.a(1, var21);
            qi.a(false, -var13Lifetime1 + 620, var13Lifetime1, 10);
            va.field_s.a(16777215, (byte) 61, -1, -var13Lifetime1 + 620, var21, va.field_s.field_k + 16 - 2);
          }
          if (param4) {
            var19.a(aj.field_i, 16777215, -1, 320, 64, 2);
          }
          return;
        }
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = Vertigo2.field_L ? 1 : 0;
        if (param0 >= -55) {
          this.field_y = -72;
        }
        for (var2 = 0; var2 < 9; var2++) {
          this.field_P[var2] = -1;
          this.field_L[var2] = -1;
        }
    }

    final void d(boolean param0) {
        this.field_Y = 0;
        this.field_g = 0;
        this.field_U = 0;
        this.field_p = this.field_W;
        if (param0) {
          this.field_A = true;
        }
    }

    final void a(int param0, mi param1) {
        boolean stackIn_3_1 = false;
        boolean stackIn_6_1 = false;
        boolean stackIn_9_1 = false;
        boolean stackIn_12_1 = false;
        boolean stackIn_15_1 = false;
        boolean stackIn_20_1 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_c = -256 + param1.c((byte) -106, 10);
          this.field_O = param1.c((byte) -113, 10) - 256;
          this.field_ab = param1.c((byte) -122, 4);
          this.field_Y = param1.c((byte) -100, 4) - 5;
          this.field_U = param1.c((byte) -98, 3);
          this.field_g = param1.c((byte) -104, 3);
          this.field_W = param1.c((byte) -109, 15);
          this.field_E = param1.c((byte) -117, 32);
          this.field_y = param1.c((byte) -114, 32);
          this.field_k = param1.c((byte) -106, 32);
          this.field_f = param1.c((byte) -100, 4);
          this.field_M = param1.c((byte) -118, 32);
          this.field_Q = param1.c((byte) -112, 32);
          stackIn_3_1 = (param1.c((byte) -123, 1) == 1);
          this.field_A = stackIn_3_1;
          stackIn_6_1 = (1 == param1.c((byte) -115, 1));
          this.field_z = stackIn_6_1;
          stackIn_9_1 = (param1.c((byte) -95, 1) == 1);
          this.field_F = stackIn_9_1;
          stackIn_12_1 = (1 == param1.c((byte) -96, 1));
          this.field_o = stackIn_12_1;
          stackIn_15_1 = (param1.c((byte) -101, 1) == 1);
          this.field_G = stackIn_15_1;
          this.field_h = param1.c((byte) -103, 7) - 50;
          this.field_X = -param1.c((byte) -105, 6);
          this.field_n = param1.c((byte) -97, 11);
          this.field_N = param1.c((byte) -114, 2);
          this.field_K = param1.c((byte) -121, 10);
          this.field_Z = param1.c((byte) -108, 10);
          this.field_bb = param1.c((byte) -122, 12);
          if (param0 != 0) {
            wo.a(114, -101, false, -98, 72, -17);
          }
          this.field_J = param1.c((byte) -105, 4);
          this.field_t = -1 + param1.c((byte) -102, 9);
          this.field_v = (byte)param1.c((byte) -125, 5);
          this.field_B = param1.c((byte) -101, 4);
          stackIn_20_1 = (param1.c((byte) -109, 1) == 1);
          this.field_R = stackIn_20_1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("wo.PA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1) {
        if (param1 != -29273) {
          wo.n(80);
        }
        return (param0 & 1) != 0 ? true : false;
    }

    final boolean h(byte param0) {
        if (param0 != 117) {
          this.field_u = -49;
        }
        return this.field_ab <= 0 ? true : false;
    }

    final boolean i(int param0) {
        if (!this.field_e) {
          return false;
        }
        if (param0 != 10949) {
          return false;
        }
        this.field_e = false;
        return true;
    }

    final int a(int param0, boolean param1, int param2, boolean param3, int param4, int param5) {
        int stackIn_43_0 = 0;
        int stackIn_63_0 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var8Lifetime2;
        int var9Lifetime2;
        int var10Lifetime2;
        var11 = Vertigo2.field_L ? 1 : 0;
        this.field_X = -36;
        if (param5 != 18113) {
          this.field_L = (int[]) null;
        }
        boolean decompiledFrameRemainder0 = true;
        var7 = param4;
        if (var7 == 16) {
          this.field_X = -6;
        } else {
          if (var7 != 10) {
            if (6 != var7) {
              if (var7 == 5) {
                if (this.field_Y == 0 &&
                  param1) {
                  if (0 == this.field_l ||
                    !this.field_x) {
                    this.field_Y = 5;
                    if (!this.field_i &&
                      param3) {
                      gm.a(8, (byte) -55);
                    }
                  }
                  stackIn_63_0 = (param2 == 2) ? 5 : 4;
                  return stackIn_63_0;
                }
              } else {
                if (var7 == 29) {
                  if (param1) {
                    this.field_R = true;
                    return 4;
                  }
                } else {
                  if (var7 != 30) {
                    if (1 == var7) {
                      if (param1 &&
                        this.field_X != 0) {
                        this.field_X = -50;
                      }
                    } else {
                      if (var7 != 26 &&
                        var7 != 3) {
                        if (var7 != 2) {
                          if (var7 != 25 &&
                            var7 != 4) {
                            if ((var7 == 11) &&
                              (decompiledFrameRemainder0 = (param1)) &&
                              (decompiledFrameRemainder0 = !(this.field_g >= 7))) {
                              this.field_g = this.field_g + 1;
                              if (!this.field_i &&
                                param3) {
                                gm.a(20, (byte) -55);
                              }
                              return 27;
                            }
                            if (decompiledFrameRemainder0) {
                              if ((var7 == 18) &&
                                (decompiledFrameRemainder0 = (param1)) &&
                                (decompiledFrameRemainder0 = !(this.field_U >= 7))) {
                                if (!this.field_i &&
                                  param3) {
                                  gm.a(20, (byte) -55);
                                }
                                this.field_U = this.field_U + 1;
                                return 27;
                              }
                              if (decompiledFrameRemainder0) {
                                if ((var7 == 19) &&
                                  (decompiledFrameRemainder0 = (param1)) &&
                                  (decompiledFrameRemainder0 = !(15 <= this.field_ab))) {
                                  if (!this.field_i &&
                                    param3) {
                                    gm.a(7, (byte) -55);
                                  }
                                  this.field_ab = this.field_ab + 1;
                                  return 27;
                                }
                                if (decompiledFrameRemainder0) {
                                  if (var7 == 20) {
                                    this.field_F = true;
                                    decompiledFrameRemainder0 = (param1);
                                    if (decompiledFrameRemainder0) {
                                      if (!this.field_i &&
                                        param3) {
                                        gm.a(18, (byte) -55);
                                      }
                                      return 27;
                                    }
                                  }
                                  if (decompiledFrameRemainder0) {
                                    if (12 != var7) {
                                      if (((var7 == 8)) &&
                                        (param1)) {
                                        return 22;
                                      }
                                      decompiledFrameRemainder0 = false;
                                    }
                                    if ((decompiledFrameRemainder0) &&
                                      (decompiledFrameRemainder0 = (param1))) {
                                      var7 = this.field_W;
                                      this.field_W = this.field_W + 100;
                                      if (this.field_W >= 32767) {
                                        this.field_W = 32767;
                                      }
                                      if (!this.field_i &&
                                        !this.field_T &&
                                        !this.field_r &&
                                        0 < this.field_W - var7) {
                                        var8 = -var7 + this.field_W;
                                        if (null != ln.field_d &&
                                          ln.field_d.field_B >= 0 &&
                                          null == oe.field_pb) {
                                          var9 = ln.field_d.field_s % 3;
                                          if (var9 != 0) {
                                            if (var9 == 1) {
                                              pn.field_R = pn.field_R - var8;
                                            } else {
                                              var10 = var8 / 3;
                                              gi.field_u = gi.field_u + var10;
                                              pn.field_R = pn.field_R - (-var10 + var8);
                                            }
                                          } else {
                                            gi.field_u = gi.field_u + var8;
                                          }
                                        }
                                      }
                                      if (!this.field_i &&
                                        param3) {
                                        gm.a(17, (byte) -55);
                                      }
                                      return 27;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          if (param1 &&
                            this.field_X != 0) {
                            this.field_X = -50;
                          }
                        }
                        if ((decompiledFrameRemainder0) &&
                          (decompiledFrameRemainder0 = !(this.field_Y >= 0)) &&
                          (decompiledFrameRemainder0 = (param1))) {
                          var7 = this.field_W;
                          this.field_W = this.field_W + 10;
                          if (this.field_W >= 32767) {
                            this.field_W = 32767;
                          }
                          if (!this.field_i &&
                            !this.field_T &&
                            !this.field_r &&
                            -var7 + this.field_W > 0) {
                            var8Lifetime2 = this.field_W - var7;
                            if (ln.field_d != null &&
                              ln.field_d.field_B >= 0 &&
                              oe.field_pb == null) {
                              var9Lifetime2 = ln.field_d.field_s % 3;
                              if (var9Lifetime2 != 0) {
                                if (var9Lifetime2 == 1) {
                                  pn.field_R = pn.field_R - var8Lifetime2;
                                } else {
                                  var10Lifetime2 = var8Lifetime2 / 3;
                                  pn.field_R = pn.field_R - (var8Lifetime2 - var10Lifetime2);
                                  gi.field_u = gi.field_u + var10Lifetime2;
                                }
                              } else {
                                gi.field_u = gi.field_u + var8Lifetime2;
                              }
                            }
                          }
                          this.field_j = this.field_j + 1;
                          this.field_Y = this.field_Y + 1;
                          if (0 == this.field_Y &&
                            !this.field_i &&
                            param3) {
                            qg.a(param5 - 18112, 500, 26, 0);
                          }
                          if (param4 == 2) {
                            return 1;
                          }
                          if (param4 != 4) {
                            return 26;
                          }
                          return 3;
                        }
                      }
                    }
                    if ((decompiledFrameRemainder0) && (0 < this.field_Y &&
                      param1)) {
                      var7 = this.field_W;
                      this.field_W = this.field_W + 10;
                      if (this.field_W >= 32767) {
                        this.field_W = 32767;
                      }
                      if (!this.field_i &&
                        !this.field_T &&
                        !this.field_r &&
                        0 < -var7 + this.field_W) {
                        var8Lifetime1 = this.field_W - var7;
                        if (ln.field_d != null &&
                          ln.field_d.field_B >= 0 &&
                          null == oe.field_pb) {
                          var9Lifetime1 = ln.field_d.field_s % 3;
                          if (0 == var9Lifetime1) {
                            gi.field_u = gi.field_u + var8Lifetime1;
                          } else {
                            if (var9Lifetime1 == 1) {
                              pn.field_R = pn.field_R - var8Lifetime1;
                            } else {
                              var10Lifetime1 = var8Lifetime1 / 3;
                              gi.field_u = gi.field_u + var10Lifetime1;
                              pn.field_R = pn.field_R - (var8Lifetime1 - var10Lifetime1);
                            }
                          }
                        }
                      }
                      this.field_j = this.field_j + 1;
                      this.field_Y = this.field_Y - 1;
                      if (this.field_Y == 0 &&
                        !this.field_i &&
                        param3) {
                        qg.a(1, 500, 26, 0);
                      }
                      if (param4 == 1) {
                        return 2;
                      }
                      if (3 == param4) {
                        return 4;
                      }
                      return 25;
                    }
                  } else {
                    if (param1) {
                      this.field_R = true;
                      return 3;
                    }
                  }
                }
              }
            } else {
              if (param1 &&
                this.field_J != 4 &&
                this.field_J != 7 &&
                this.field_J != 8) {
                this.field_t = 130;
                this.field_J = 4;
                this.field_E = 64 + 128 * lj.a(this.field_E, false, 128);
                this.field_y = lj.a(this.field_y, false, 128) * 128 + 64;
                this.field_k = lj.a(this.field_k, false, 240) * 240;
                this.field_h = 0;
                this.field_d = param0;
              }
            }
          } else {
            if (this.field_Y == 0 &&
              param1) {
              if (this.field_l != 1) {
                if (!this.field_x) {
                  this.field_Y = -5;
                  if (!this.field_i &&
                    param3) {
                    gm.a(8, (byte) -55);
                  }
                }
              } else {
                this.field_Y = -5;
                if (!this.field_i &&
                  param3) {
                  gm.a(8, (byte) -55);
                }
              }
              stackIn_43_0 = (param2 == 2) ? 10 : 3;
              return stackIn_43_0;
            }
          }
        }
        return -1;
    }

    final int c(byte param0) {
        if (param0 >= -126) {
          this.field_o = false;
        }
        return this.field_h;
    }

    final boolean e(boolean param0) {
        if (param0) {
          this.field_n = -51;
        }
        return this.field_J == 7 ? true : false;
    }

    final boolean f(int param0) {
        if (param0 != -1) {
          this.field_t = -37;
        }
        return this.field_h > 0 ? true : false;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        aj.field_f[cq.field_i] = param3;
        ac.field_I[cq.field_i] = cq.field_i;
        on.field_e[cq.field_i] = param0;
        if (!(param0 <= ug.field_b)) {
          id.field_d = param0;
        }
        if (!(param0 >= q.field_x)) {
          f.field_y = param0;
        }
        if (!param2) {
          wo.a(36, -58, true, -105, -9, -63);
        }
        li.field_g[cq.field_i] = param4;
        ub.field_p[cq.field_i] = param1;
        jf.field_N[cq.field_i] = param5;
        int var6 = param5 + param1 + param4;
        int var7 = var6 != 0 ? 1000 * param4 / var6 : 0;
        hm.field_A[cq.field_i] = var7;
        if (!(f.field_y <= var7)) {
          f.field_y = var7;
        }
        if (!(var7 <= id.field_d)) {
          id.field_d = var7;
        }
        cq.field_i = cq.field_i + 1;
    }

    final void a(wo param0, int param1) {
        try {
          this.field_j = param0.field_j;
          this.field_M = param0.field_M;
          this.field_H = param0.field_H;
          this.field_o = param0.field_o;
          this.field_W = param0.field_W;
          this.field_p = param0.field_p;
          this.field_C = param0.field_C;
          this.field_F = param0.field_F;
          this.field_a = param0.field_a;
          this.field_d = param0.field_d;
          this.field_R = param0.field_R;
          this.field_Z = param0.field_Z;
          this.field_N = param0.field_N;
          this.field_A = param0.field_A;
          this.field_k = param0.field_k;
          this.field_E = param0.field_E;
          this.field_ab = param0.field_ab;
          this.field_g = param0.field_g;
          this.field_t = param0.field_t;
          this.field_h = param0.field_h;
          this.field_e = param0.field_e;
          this.field_O = param0.field_O;
          this.field_m = param0.field_m;
          this.field_Y = param0.field_Y;
          this.field_f = param0.field_f;
          this.field_K = param0.field_K;
          this.field_X = param0.field_X;
          this.field_n = param0.field_n;
          this.field_u = param0.field_u;
          this.field_y = param0.field_y;
          this.field_c = param0.field_c;
          this.field_J = param0.field_J;
          this.field_B = param0.field_B;
          if (param1 != 16777215) {
            this.field_g = -26;
          }
          this.field_G = param0.field_G;
          this.field_bb = param0.field_bb;
          this.field_z = param0.field_z;
          this.field_U = param0.field_U;
          this.field_I = param0.field_I;
          this.field_Q = param0.field_Q;
          this.field_D = param0.field_D;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "wo.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void c(int param0) {
        if (this.field_J == 4) {
          this.field_J = 4;
          if (this.field_t > 1) {
            this.field_t = 1;
          }
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_J != 7) {
          if (this.field_J != 6 &&
            this.field_J != 8 &&
            this.field_J != 2 &&
            this.field_J != 3) {
            if (10 == this.field_J) {
              return;
            }
            if (this.field_B > 4 &&
              this.field_B < 12 &&
              0 < this.field_U) {
              this.e(7883);
              return;
            }
            this.field_B = 0;
            decompiledFrameRemainder0 = (this.field_z);
            if (decompiledFrameRemainder0) {
              if (this.field_J != 1 &&
                this.field_J != 9 &&
                this.field_h >= 0) {
                this.field_t = 6;
                if (param0 != 3) {
                  this.f(8);
                }
                this.field_J = 1;
                return;
              }
              return;
            }
          }
          if (decompiledFrameRemainder0) {
            return;
          }
        }

    }

    final int g(byte param0) {
        if (param0 != 121) {
          this.d((byte) -23);
        }
        return this.field_j;
    }

    final boolean a(byte param0, int param1) {
        if (param0 <= 49) {
          this.field_t = -89;
        }
        if (param1 == this.field_u) {
          return false;
        }
        this.field_u = param1;
        return true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.field_k = param1;
        this.field_E = param4;
        if (param0 != 12649) {
          this.e((byte) 122);
        }
        this.field_y = param2;
        if (this.field_J != 2) {
          if (this.field_J == 3) {
            return;
          }
          this.field_bb = param3;
          this.field_t = 86;
          this.field_Z = param6;
          this.field_K = param5;
          this.field_h = 0;
          this.field_J = 2;
          return;
        }
    }

    final void b(boolean param0) {
        this.field_d = -1;
        this.field_n = 0;
        this.field_z = false;
        this.field_e = false;
        this.field_O = 0;
        this.field_J = 0;
        this.field_y = this.field_I;
        this.field_o = false;
        this.field_E = this.field_a;
        this.field_g = 0;
        this.field_t = 0;
        this.field_Y = 0;
        this.field_X = -36;
        this.field_B = 0;
        this.field_N = 0;
        this.field_G = false;
        this.field_h = 0;
        this.field_R = param0 ? true : false;
        this.field_k = this.field_m;
        this.field_U = 0;
        this.field_H = 0;
        this.field_c = 0;
    }

    final boolean c(boolean param0) {
        if (!param0) {
          this.field_g = 76;
        }
        return this.field_U > 0 ? true : false;
    }

    final boolean a(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != 703) {
          this.c((byte) 89);
        }
        stackIn_7_0 = (this.field_J != 7) && (this.field_J != 8) && (this.field_J != 4);
        return stackIn_7_0;
    }

    final void a(byte param0, boolean param1) {
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_71_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var9 = Vertigo2.field_L ? 1 : 0;
        this.field_t = this.field_t - 1;
        if (this.field_v < 31) {
          this.field_v = (byte)(this.field_v + 1);
        }
        this.field_B = this.field_B + 1;
        this.field_D = this.field_D + 1;
        var3 = this.field_J;
        switch (var3) {
          case 6:
            this.field_u = 0;
            if (0 != this.field_t) {
              return;
            }
            this.field_J = 0;
            break;
          case 3:
          case 1:
          case 4:
          case 8:
          case 10:
          default:
            if (5 != var3 &&
              var3 != 9) {
              if (var3 == 3) {
                if (this.field_t != 0) {
                  return;
                }
                this.field_J = 0;
                break;
              }
              if (1 == var3) {
                if (this.field_t != 0) {
                  return;
                }
                this.field_h = this.field_X;
                this.field_J = 0;
                this.field_f = lj.a(this.field_k, false, 240);
                break;
              }
              if (var3 != 4) {
                if (var3 == 8) {
                  break;
                }
                if (var3 != 10) {
                  this.field_X = -36;
                  break;
                }
                if (this.field_t == 10) {
                  this.field_o = true;
                }
                if (this.field_t != 0) {
                  return;
                }
                this.field_J = 0;
                break;
              }
              if (this.field_t != 0) {
                return;
              }
              this.field_G = false;
              this.field_e = true;
              if (!this.h((byte) 117)) {
                this.field_J = 7;
                this.field_t = 50;
                break;
              }
              this.field_J = 8;
              if (this.field_i) {
                break;
              }
              db.a(false, 12, (byte) 36, nq.field_D, false, 12);
              break;
            }
            if (this.field_t == 0) {
              this.field_J = 0;
            }
            this.field_c = 0;
            this.field_O = 0;
            break;
          case 2:
            if (0 != this.field_t) {
              return;
            }
            this.field_y = this.field_Z;
            this.field_k = this.field_bb;
            this.field_c = 0;
            this.field_O = 0;
            this.field_h = 0;
            this.field_A = true;
            this.field_J = 3;
            this.field_t = 37;
            this.field_E = this.field_K;
            this.field_n = 0;
            break;
          case 7:
            if (this.field_t != 0) {
              return;
            }
            if (this.field_x) {
              this.b(false);
            }
            this.field_J = 6;
            this.field_t = 250;
            break;
        }
        this.i((byte) -117);
        if (9 != this.field_J) {
          stackIn_62_0 = (0 == (1 & this.field_u)) ? 0 : 1;
          var3 = stackIn_62_0;
          stackIn_65_0 = ((2 & this.field_u) == 0) ? 0 : 1;
          var4 = stackIn_65_0;
          stackIn_68_0 = ((4 & this.field_u) == 0) ? 0 : 1;
          var5 = stackIn_68_0;
          stackIn_71_0 = ((this.field_u & 8) == 0) ? 0 : 1;
          var6 = stackIn_71_0;
          var7 = 0;
          if (var3 != 0) {
            var7 = -25;
          }
          var8 = 0;
          if (var6 != 0) {
            var8 = -25;
          }
          if (var4 != 0) {
            var7 = 25;
          }
          this.field_c = this.field_c + var7;
          if (var5 != 0) {
            var8 = 25;
          }
          this.field_O = this.field_O + var8;
          if (this.field_c >= -256) {
            if (this.field_c > 256) {
              this.field_c = 256;
            }
          } else {
            this.field_c = -256;
          }
          this.field_Q = this.field_y;
          if (this.field_O < -256) {
            this.field_O = -256;
          } else {
            if (256 < this.field_O) {
              this.field_O = 256;
            }
          }
          this.field_M = this.field_E;
          this.field_E = this.field_E + this.field_c / 22;
          this.field_y = this.field_y + this.field_O / 22;
          if (9 > this.field_O &&
            this.field_O > -9) {
            this.field_O = 0;
          } else {
            if (this.field_O > 0) {
              this.field_O = this.field_O - 9;
            } else {
              if (this.field_O < 0) {
                this.field_O = this.field_O + 9;
              }
            }
          }
          if (this.field_c < 9 &&
            this.field_c > -9) {
            this.field_c = 0;
          } else {
            if (this.field_c > 0) {
              this.field_c = this.field_c - 9;
            } else {
              if (0 > this.field_c) {
                this.field_c = this.field_c + 9;
              }
            }
          }
          if (this.field_N != 1 &&
            this.field_N != 3) {
            this.field_N = 0;
          } else {
            this.field_N = 2;
          }
          if (5 == this.field_J) {
            return;
          }
          if (this.field_c != 0 ||
            0 != this.field_O) {
            this.c((int)(325.944 * Math.atan2((double)this.field_c, (double)this.field_O) + 1024.0) & 2047, 10);
          }
        }
        if (16 <= this.field_h) {
          this.field_h = 16;
        } else {
          this.field_h = this.field_h + 2;
        }
        if (param1 &&
          this.field_k > 4080 &&
          this.field_J != 4 &&
          7 != this.field_J &&
          this.field_J != 8 &&
          this.field_J != 6) {
          this.field_G = true;
          this.field_J = 4;
          this.field_t = 130;
        }
        if (this.field_G) {
          if (this.field_h < 16) {
            this.field_h = this.field_h + 2;
          } else {
            this.field_h = 16;
          }
          this.field_k = this.field_k + this.field_h;
        }
        if (param0 != 80) {
          this.field_T = false;
        }
    }

    final int m(int param0) {
        if (param0 != -1) {
          this.a(true, 50);
        }
        return this.field_Y;
    }

    final void e(byte param0) {
        if (10 == this.field_J) {
          return;
        }
        if (param0 > -106) {
          return;
        }
        if (this.field_g > 0 &&
          this.field_z) {
          this.field_g = this.field_g - 1;
          this.field_t = 49;
          this.field_J = 10;
        }
    }

    final boolean j(byte param0) {
        if (this.field_o) {
          this.field_o = false;
          return true;
        }
        int var2 = -24 / ((param0 - 60) / 43);
        return false;
    }

    final boolean a(boolean param0) {
        if (param0) {
          this.field_G = false;
        }
        if (this.field_F) {
          this.field_F = false;
          return true;
        }
        return false;
    }

    public static void n(int param0) {
        field_b = null;
        field_q = null;
        if (param0 != 511) {
          field_V = (String[]) null;
        }
        field_V = null;
    }

    final int b(int param0) {
        if (param0 != -1) {
          return -71;
        }
        return this.field_J;
    }

    final void l(byte param0) {
        if (param0 != -89) {
          this.e((byte) -61);
        }
        if (7 > this.field_U) {
          this.field_U = this.field_U + 1;
        }
    }

    final void a(byte param0) {
        if (param0 != -88) {
          this.field_O = 99;
        }
        this.field_J = 0;
        this.field_U = 0;
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var6 = Vertigo2.field_L ? 1 : 0;
        for (var4 = 0; param1 > var4; var4++) {
          if (~this.field_L[var4] == ~param2) {
            return param1;
          }
        }
        int var5 = -18 / ((6 - param0) / 62);
        int incrementValue$0 = param1;
        param1++;
        this.field_L[incrementValue$0] = param2;
        return param1;
    }

    final boolean k(byte param0) {
        if (param0 <= 63) {
          this.j((byte) 14);
        }
        return this.field_R;
    }

    final void d(byte param0) {
        if (param0 != 4) {
          return;
        }
        this.field_ab = this.field_ab + 1;
        if (15 < this.field_ab) {
          this.field_ab = 15;
        }
    }

    final void c(int param0, int param1) {
        this.field_n = param0;
        if (param1 != 10) {
          this.field_P = (int[]) null;
        }
    }

    final int h(int param0) {
        if (param0 != 13289) {
          this.l(121);
        }
        return this.field_u;
    }

    final void a(boolean param0, int param1) {
        this.field_ab = param1;
        if (!param0) {
          this.e(58);
        }
    }

    final void d(int param0) {
        this.field_R = false;
        if (param0 != -5) {
          this.a(8, 71, -46, 103, 78, -54, 73);
        }
    }

    final boolean f(byte param0) {
        if (param0 <= 32) {
          this.a(true, 117, 83);
        }
        return this.field_J == 8 ? true : false;
    }

    wo(int param0, boolean param1, int param2, boolean param3, boolean param4, boolean param5) {
        this.field_X = -36;
        this.field_A = false;
        this.field_ab = 3;
        this.field_d = -1;
        this.field_i = param1 ? true : false;
        this.field_P = new int[9];
        this.field_T = param5 ? true : false;
        this.field_l = param0;
        this.field_r = param3 ? true : false;
        this.field_x = param4 ? true : false;
        this.field_L = new int[9];
        this.field_w = param2;
        this.field_J = 0;
    }

    static {
        field_q = new lg[2];
        field_S = 0.0;
        field_V = new String[]{"Game type", "Starting level", "Number of levels"};
        field_b = "Who can join";
        field_s = false;
    }
}
