/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    boolean field_J;
    dk field_h;
    int field_f;
    int field_E;
    int field_j;
    int field_d;
    int field_B;
    boolean field_r;
    boolean field_m;
    private r field_D;
    static ci field_g;
    r[] field_C;
    int field_k;
    hk field_e;
    static rh field_l;
    boolean field_M;
    th field_n;
    private int field_z;
    int field_N;
    r field_q;
    boolean field_b;
    static int[] field_t;
    static ci[] field_p;
    int field_a;
    boolean field_u;
    gi[] field_F;
    int field_i;
    int field_x;
    private boolean field_A;
    String field_K;
    boolean field_v;
    private boolean field_I;
    int field_c;
    private int field_s;
    boolean field_w;
    int field_L;
    static String field_o;
    int field_H;
    int field_y;
    Terraphoenix field_G;

    private final void a(boolean param0, r param1) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        dl var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Terraphoenix.field_V;
        try {
          L0: {
            this.field_h.b((byte) -109);
            if (!param0) {
              param1.field_w = 1;
              var4 = -1 + param1.field_F;
              L1: while (true) {
                if (1 + param1.field_F < var4) {
                  param1.field_Y = true;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5 = -1 + param1.field_H;
                  L2: while (true) {
                    if (param1.field_H - -1 < var5) {
                      var4++;
                      continue L1;
                    } else {
                      L3: {
                        var3 = this.field_h.a(107, var5, param1.field_E, var4);
                        if (var3 == null) {
                          break L3;
                        } else {
                          if (this.field_h.field_g[param1.field_F][param1.field_H] < this.field_h.field_g[var4][var5]) {
                            if ((var3.a(-param1.field_H + var5, var4 + -param1.field_F, -128) ^ -1) < -51) {
                              break L3;
                            } else {
                              param1.field_jb = 20;
                              param1.field_d = param1.field_B;
                              param1.field_w = 0;
                              param1.field_S = true;
                              param1.field_r = null;
                              param1.field_Y = true;
                              param1.field_n = var5;
                              param1.field_A = 0;
                              param1.field_X = var4;
                              decompiledRegionSelector0 = 1;
                              break L0;
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                      var5++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("e.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, ci param5) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        ci var24 = null;
        var23 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var24 = u.field_e[param3];
              var8 = param1;
              var8 = var8 + param5.field_p;
              var9 = param4;
              var9 = var9 + param5.field_v;
              var10 = 0;
              var11 = param5.field_p + param1;
              var14 = 104 % ((-39 - param2) / 63);
              var12 = param4 + param5.field_v;
              var13 = param5.field_t;
              var15 = param5.field_r;
              var16 = 0;
              var17 = param5.field_p - -(param5.field_v * var24.field_r);
              if (l.field_d > var9) {
                var19 = l.field_d - var9;
                var17 = var17 + var19 * var15;
                var13 = var13 - var19;
                var9 = l.field_d;
                var12 = var12 + var19;
                var10 = var10 + var15 * var19;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var18 = 64 + -param5.field_r;
              if (var8 < l.field_b) {
                var19 = -var8 + l.field_b;
                var10 = var10 + var19;
                var8 = l.field_b;
                var17 = var17 + var19;
                var15 = var15 - var19;
                var16 = var16 + var19;
                var11 = var11 + var19;
                var18 = var18 + var19;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (l.field_c >= var9 + var13) {
                break L3;
              } else {
                var13 = var13 - (var13 + (var9 + -l.field_c));
                break L3;
              }
            }
            L4: {
              if (var8 - -var15 <= l.field_f) {
                break L4;
              } else {
                var19 = -l.field_f + var15 + var8;
                var16 = var16 + var19;
                var18 = var18 + var19;
                var15 = var15 - var19;
                break L4;
              }
            }
            L5: {
              if (0 >= var15) {
                break L5;
              } else {
                if (var13 <= 0) {
                  break L5;
                } else {
                  var20 = var11;
                  var21 = var12;
                  var22 = -(var15 >> -1531228030);
                  var15 = -(3 & var15);
                  var9 = -var13;
                  L6: while (true) {
                    if (-1 >= (var9 ^ -1)) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var8 = var22;
                      L7: while (true) {
                        if (0 <= var8) {
                          var8 = var15;
                          L8: while (true) {
                            if (var8 >= 0) {
                              var17 = var17 + var18;
                              var20 = var11;
                              var10 = var10 + var16;
                              var21++;
                              var9++;
                              continue L6;
                            } else {
                              L9: {
                                incrementValue$0 = var10;
                                var10++;
                                var19 = param5.field_z[incrementValue$0];
                                if (-1 != (var19 ^ -1)) {
                                  incrementValue$1 = var20;
                                  var20++;
                                  incrementValue$2 = var17;
                                  var17++;
                                  gd.field_a[incrementValue$1][var21] = 144 * param0 + (var21 + var24.field_z[incrementValue$2] / 5);
                                  break L9;
                                } else {
                                  var17++;
                                  var20++;
                                  break L9;
                                }
                              }
                              var8++;
                              continue L8;
                            }
                          }
                        } else {
                          L10: {
                            incrementValue$3 = var10;
                            var10++;
                            var19 = param5.field_z[incrementValue$3];
                            if ((var19 ^ -1) != -1) {
                              incrementValue$4 = var20;
                              var20++;
                              incrementValue$5 = var17;
                              var17++;
                              gd.field_a[incrementValue$4][var21] = 144 * param0 + (var21 + var24.field_z[incrementValue$5] / 5);
                              break L10;
                            } else {
                              var20++;
                              var17++;
                              break L10;
                            }
                          }
                          L11: {
                            incrementValue$6 = var10;
                            var10++;
                            var19 = param5.field_z[incrementValue$6];
                            if (var19 != 0) {
                              incrementValue$7 = var20;
                              var20++;
                              incrementValue$8 = var17;
                              var17++;
                              gd.field_a[incrementValue$7][var21] = param0 * 144 + (var21 - -(var24.field_z[incrementValue$8] / 5));
                              break L11;
                            } else {
                              var20++;
                              var17++;
                              break L11;
                            }
                          }
                          L12: {
                            incrementValue$9 = var10;
                            var10++;
                            var19 = param5.field_z[incrementValue$9];
                            if (0 != var19) {
                              incrementValue$10 = var20;
                              var20++;
                              incrementValue$11 = var17;
                              var17++;
                              gd.field_a[incrementValue$10][var21] = var21 + (param0 * 144 + var24.field_z[incrementValue$11] / 5);
                              break L12;
                            } else {
                              var20++;
                              var17++;
                              break L12;
                            }
                          }
                          L13: {
                            incrementValue$12 = var10;
                            var10++;
                            var19 = param5.field_z[incrementValue$12];
                            if (var19 != 0) {
                              incrementValue$13 = var20;
                              var20++;
                              incrementValue$14 = var17;
                              var17++;
                              gd.field_a[incrementValue$13][var21] = var21 - -(param0 * 144) + var24.field_z[incrementValue$14] / 5;
                              break L13;
                            } else {
                              var20++;
                              var17++;
                              break L13;
                            }
                          }
                          var8++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var7 = decompiledCaughtException;
            stackIn_42_0 = (RuntimeException) (var7);

            stackIn_42_1 = new StringBuilder().append("e.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L14;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L14;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0) {
        if (!ib.p(86)) {
            return;
        }
        int var1 = -25 / ((param0 - 65) / 50);
        ja.a(-110, false, 4);
    }

    final void a(int param0, int param1) {
        th var3;
        int var4;
        Terraphoenix var5;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        L0: {
          var4 = Terraphoenix.field_V;
          var3 = this.field_n;
          if (param0 == 29518) {
            break L0;
          } else {
            var5 = (Terraphoenix) null;
            this.a((Terraphoenix) null, false);
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            if (var3 == null) {
              break L2;
            } else {
              if ((param1 ^ -1) == (var3.field_a ^ -1)) {
                break L2;
              } else {
                var3 = var3.field_f;
                continue L1;
              }
            }
          }
          L3: {
            if (var3 == null) {
              break L3;
            } else {
              stackIn_7_0 = param1 ^ -1;
              stackIn_7_1 = var3.field_a ^ -1;
              if (stackIn_7_0 == stackIn_7_1) {
                if (var3.field_h) {
                  break L3;
                } else {
                  var3.field_h = true;
                  var3.field_d = 250;
                  break L3;
                }
              } else {
                break L3;
              }
            }
          }
          return;
        }
    }

    final void c(byte param0) {
        int var2;
        int var3;
        L0: {
          var3 = Terraphoenix.field_V;
          if (!this.field_G.field_db) {
            L1: {
              if (1 != this.field_G.field_Bb) {
                break L1;
              } else {
                qd.a((byte) 26, 13);
                break L1;
              }
            }
            L2: {
              if ((this.field_G.field_Bb ^ -1) == -3) {
                qd.a((byte) 113, 11);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (-4 != (this.field_G.field_Bb ^ -1)) {
                break L3;
              } else {
                qd.a((byte) 104, 11);
                break L3;
              }
            }
            L4: {
              if (4 == this.field_G.field_Bb) {
                qd.a((byte) 122, 11);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if ((this.field_G.field_Bb ^ -1) == -6) {
                qd.a((byte) 76, 5);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if ((this.field_G.field_Bb ^ -1) != -7) {
                break L6;
              } else {
                qd.a((byte) 58, 11);
                break L6;
              }
            }
            L7: {
              if (7 != this.field_G.field_Bb) {
                break L7;
              } else {
                qd.a((byte) 32, 5);
                break L7;
              }
            }
            L8: {
              if (-9 != (this.field_G.field_Bb ^ -1)) {
                break L8;
              } else {
                qd.a((byte) 44, 11);
                break L8;
              }
            }
            L9: {
              if (this.field_G.field_Bb != 9) {
                break L9;
              } else {
                qd.a((byte) 24, 5);
                break L9;
              }
            }
            L10: {
              if (-11 == (this.field_G.field_Bb ^ -1)) {
                qd.a((byte) 52, 11);
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (-12 == (this.field_G.field_Bb ^ -1)) {
                qd.a((byte) 53, 4);
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if ((this.field_G.field_Bb ^ -1) == -13) {
                qd.a((byte) 29, 11);
                break L12;
              } else {
                break L12;
              }
            }
            if (13 != this.field_G.field_Bb) {
              break L0;
            } else {
              qd.a((byte) 70, 11);
              break L0;
            }
          } else {
            qd.a((byte) 69, 11);
            break L0;
          }
        }
        L13: {
          if (param0 <= -74) {
            break L13;
          } else {
            this.field_B = 101;
            break L13;
          }
        }
        var2 = 0;
        L14: while (true) {
          if (var2 >= this.field_C.length) {
            return;
          } else {
            if (null != this.field_C[var2]) {
              if (this.field_C[var2].field_Z == null) {
                if (!this.field_J) {
                  this.field_C[var2].b(60);
                  var2++;
                  continue L14;
                } else {
                  this.field_C[var2].b(60);
                  this.field_C[var2].field_q = -(int)(Math.random() * (double)this.field_C[var2].field_jb);
                  var2++;
                  continue L14;
                }
              } else {
                L15: {
                  L16: {
                    if (-6 == (this.field_G.field_Bb ^ -1)) {
                      break L16;
                    } else {
                      if (-8 == (this.field_G.field_Bb ^ -1)) {
                        break L16;
                      } else {
                        if ((this.field_G.field_Bb ^ -1) != -10) {
                          break L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                  }
                  this.field_C[var2].field_h = true;
                  this.field_C[var2].field_R = this.field_C[var2].field_E;
                  this.field_C[var2].field_i = this.field_C[var2].field_F;
                  this.field_C[var2].field_gb = this.field_C[var2].field_H;
                  break L15;
                }
                L17: {
                  if (!this.field_J) {
                    this.field_C[var2].b(60);
                    this.field_C[var2].field_jb = 0;
                    break L17;
                  } else {
                    this.field_C[var2].b(60);
                    break L17;
                  }
                }
                L18: {
                  if (null != this.field_q) {
                    break L18;
                  } else {
                    this.field_q = this.field_C[var2];
                    break L18;
                  }
                }
                this.field_C[var2].a(false);
                var2++;
                continue L14;
              }
            } else {
              var2++;
              continue L14;
            }
          }
        }
    }

    private final int a(byte param0, r param1, r param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param2.field_F + -param1.field_F;
              var5 = -param1.field_H + param2.field_H;
              if (param0 == -60) {
                break L1;
              } else {
                this.field_i = 27;
                break L1;
              }
            }
            stackIn_3_0 = (int)Math.sqrt((double)(var4_int * var4_int + var5 * var5));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("e.R(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    private final void a(Terraphoenix param0, boolean param1) {
        r stackIn_77_0 = null;
        r stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        r stackIn_167_0 = null;
        r stackIn_168_0 = null;
        int stackIn_168_1 = 0;
        r stackIn_280_0 = null;
        r stackIn_280_1 = null;
        int stackIn_289_0 = 0;
        int stackIn_290_0 = 0;
        int stackIn_290_1 = 0;
        int stackIn_293_0 = 0;
        ga stackIn_350_0 = null;
        int stackIn_420_0 = 0;
        int stackIn_421_0 = 0;
        int stackIn_421_1 = 0;
        int stackIn_468_0 = 0;
        int stackIn_469_0 = 0;
        int stackIn_469_1 = 0;
        Object stackIn_505_0 = null;
        StringBuilder stackIn_505_1 = null;
        Object stackIn_506_0 = null;
        StringBuilder stackIn_506_1 = null;
        String stackIn_506_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        Object var3 = null;
        int var4 = 0;
        Object var4_ref = null;
        int var5_int = 0;
        oh var5 = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int[] var7_ref_int__ = null;
        int var8 = 0;
        int var9 = 0;
        oh var10 = null;
        oh var11 = null;
        dl var12 = null;
        dl var13 = null;
        oh var14 = null;
        oh var15 = null;
        var9 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (le.field_q == null) {
                break L1;
              } else {
                le.field_q.field_g = this.field_y;
                le.field_q.field_z = this.field_N;
                le.field_q.field_c = this.field_j;
                if (le.field_q.b(0)) {
                  break L1;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L2: {
              if (null == this.field_q) {
                break L2;
              } else {
                if (this.field_q.field_P > 0) {
                  break L2;
                } else {
                  this.b((byte) -3);
                  var3_int = 0;
                  var4 = 0;
                  L3: while (true) {
                    if (var4 >= 12) {
                      var4 = 0;
                      L4: while (true) {
                        L5: {
                          var4++;
                          var3_int++;
                          if (12 <= var3_int) {
                            var3_int -= 12;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          if (var4 >= 12) {
                            break L6;
                          } else {
                            if (this.field_C[var3_int] == null) {
                              continue L4;
                            } else {
                              if (this.field_C[var3_int].field_Z == null) {
                                continue L4;
                              } else {
                                if (0 >= this.field_C[var3_int].field_jb) {
                                  continue L4;
                                } else {
                                  if (0 >= this.field_C[var3_int].field_P) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L7: {
                          if (null == this.field_C[var3_int]) {
                            break L7;
                          } else {
                            if (null == this.field_C[var3_int].field_Z) {
                              break L7;
                            } else {
                              if (-1 <= (this.field_C[var3_int].field_P ^ -1)) {
                                break L7;
                              } else {
                                this.field_q = this.field_C[var3_int];
                                sj.field_b = (this.field_q.field_F + -this.field_q.field_H) * 32;
                                lg.field_c = 16 * (this.field_q.field_F - -this.field_q.field_H) - this.field_q.field_E * 48;
                                eg.field_p = this.field_q.field_E;
                                break L7;
                              }
                            }
                          }
                        }
                        L8: {
                          if (7 > this.field_B) {
                            break L8;
                          } else {
                            if (10 <= this.field_B) {
                              break L8;
                            } else {
                              this.field_B = this.field_B + 1;
                              break L8;
                            }
                          }
                        }
                        this.a(-1);
                        this.field_m = false;
                        this.field_L = 0;
                        break L2;
                      }
                    } else {
                      if (this.field_q == this.field_C[var4]) {
                        var3_int = var4;
                        var4++;
                        continue L3;
                      } else {
                        var4++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            }
            L9: {
              if (this.field_q == null) {
                break L9;
              } else {
                if (this.field_q.field_b != null) {
                  break L9;
                } else {
                  this.field_m = false;
                  break L9;
                }
              }
            }
            L10: {
              if (1 == this.field_N) {
                if (!gj.a((e) (this), this.field_y, (byte) 114, this.field_j)) {
                  break L10;
                } else {
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                break L10;
              }
            }
            L11: {
              L12: {
                if (this.field_j >= 365) {
                  break L12;
                } else {
                  if ((this.field_j ^ -1) >= -40) {
                    break L12;
                  } else {
                    L13: {
                      if (null == this.field_q) {
                        break L13;
                      } else {
                        if (this.field_q.field_P > 0) {
                          break L13;
                        } else {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                    L14: {
                      var3 = null;
                      var4_ref = null;
                      if (!ha.field_o) {
                        L15: {
                          var12 = this.field_h.a(94, vf.field_a, cm.field_d, uf.field_c);
                          if (null == this.field_q) {
                            break L15;
                          } else {
                            if (uf.field_c == -1) {
                              break L15;
                            } else {
                              L16: {
                                var3 = ke.field_g;
                                var4_ref = va.field_b;
                                if (uf.field_c != ql.field_i) {
                                  break L16;
                                } else {
                                  if (vf.field_a != ld.field_e) {
                                    break L16;
                                  } else {
                                    var3 = wg.field_k;
                                    if (var12 == null) {
                                      break L16;
                                    } else {
                                      if (var12.field_w) {
                                        var3 = bm.field_b;
                                        break L16;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                }
                              }
                              if (this.field_w) {
                                L17: {
                                  var3 = rl.field_c;
                                  if (oh.field_f == 0) {
                                    break L17;
                                  } else {
                                    sj.field_b = 32 * uf.field_c + -(32 * vf.field_a);
                                    lg.field_c = -(eg.field_p * 48) + vf.field_a * 16 + 16 * uf.field_c;
                                    break L17;
                                  }
                                }
                                var4_ref = null;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                        L18: {
                          if (var12 == null) {
                            break L18;
                          } else {
                            if (null == var12.field_h) {
                              break L18;
                            } else {
                              if (var12.field_h.field_C != 0) {
                                break L18;
                              } else {
                                if (var12.field_h.field_Z == null) {
                                  break L18;
                                } else {
                                  var3 = ef.field_a + var12.field_h.field_Z.b(1);
                                  break L18;
                                }
                              }
                            }
                          }
                        }
                        if (var12 == null) {
                          break L14;
                        } else {
                          L19: {
                            L20: {
                              if (null == var12.field_h) {
                                break L20;
                              } else {
                                if (var12.field_h.field_C == 0) {
                                  break L20;
                                } else {
                                  if (var12.field_h.field_k) {
                                    break L19;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                            }
                            if (this.field_L != 1) {
                              break L14;
                            } else {
                              break L19;
                            }
                          }
                          L21: {
                            var3 = q.field_Fb;
                            if (!this.field_m) {
                              break L21;
                            } else {
                              var3 = hm.field_G;
                              break L21;
                            }
                          }
                          L22: {
                            if (this.field_L != 1) {
                              break L22;
                            } else {
                              var4_ref = cm.field_a;
                              break L22;
                            }
                          }
                          L23: {
                            var6 = this.field_q.field_U;
                            var7 = this.field_q.field_ab;
                            this.field_q.a(true, uf.field_c, vf.field_a);
                            if (Math.abs(var6 - this.field_q.field_U) < 2) {
                              break L23;
                            } else {
                              if (Math.abs(-this.field_q.field_U + var6) > 6) {
                                break L23;
                              } else {
                                this.field_q.field_ab = 0;
                                break L23;
                              }
                            }
                          }
                          L24: {
                            stackIn_77_0 = this.field_q;

                            if (param1) {
                              stackIn_78_0 = (r) ((Object) stackIn_77_0);
                              stackIn_78_1 = 0;
                              break L24;
                            } else {
                              stackIn_78_0 = (r) ((Object) stackIn_77_0);
                              stackIn_78_1 = 1;
                              break L24;
                            }
                          }
                          L25: {
                            var8 = ((r) (Object) stackIn_78_0).c(stackIn_78_1 != 0);
                            this.field_q.field_ab = var7;
                            if (var12.field_A != this.field_q.field_F) {
                              break L25;
                            } else {
                              if (var12.field_n != this.field_q.field_H) {
                                break L25;
                              } else {
                                var3 = var4_ref;
                                var4_ref = null;
                                break L25;
                              }
                            }
                          }
                          L26: {
                            this.field_q.field_U = var6;
                            if (this.field_m) {
                              var8 = 15;
                              break L26;
                            } else {
                              break L26;
                            }
                          }
                          L27: {
                            if (this.field_q.field_jb >= var8) {
                              break L27;
                            } else {
                              L28: {
                                if (-10 + var8 > this.field_q.field_jb) {
                                  break L28;
                                } else {
                                  if (this.field_m) {
                                    break L28;
                                  } else {
                                    if (10 <= this.field_q.field_jb) {
                                      break L27;
                                    } else {
                                      break L28;
                                    }
                                  }
                                }
                              }
                              var3 = m.field_h;
                              break L27;
                            }
                          }
                          if (this.field_m) {
                            break L14;
                          } else {
                            if (this.field_q.field_nb.field_c > 0) {
                              break L14;
                            } else {
                              if (7 == this.field_q.field_nb.field_g) {
                                break L14;
                              } else {
                                if (this.field_q.field_nb.field_g != 6) {
                                  var4_ref = null;
                                  var3 = fl.field_d + "<br>" + ql.field_f;
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        break L14;
                      }
                    }
                    L29: {
                      if (2 != this.field_N) {
                        break L29;
                      } else {
                        L30: {
                          if (!ha.field_o) {
                            break L30;
                          } else {
                            if (5 <= this.field_B) {
                              break L30;
                            } else {
                              break L29;
                            }
                          }
                        }
                        L31: {
                          this.b((byte) -3);
                          qd.a((byte) 39, 34);
                          if (this.field_B != 5) {
                            break L31;
                          } else {
                            this.field_B = 6;
                            break L31;
                          }
                        }
                        L32: {
                          if (-1 > (this.field_L ^ -1)) {
                            break L32;
                          } else {
                            if (!this.field_m) {
                              if (0 >= this.field_q.field_jb) {
                                break L29;
                              } else {
                                if (this.field_w) {
                                  break L29;
                                } else {
                                  var5_int = this.field_q.field_U;
                                  this.field_q.a(true, uf.field_c, vf.field_a);
                                  ok.field_i = true;
                                  if (var5_int != this.field_q.field_U) {
                                    this.field_q.field_jb = this.field_q.field_jb - 1;
                                    this.field_q.field_ab = 0;
                                    break L29;
                                  } else {
                                    break L29;
                                  }
                                }
                              }
                            } else {
                              break L32;
                            }
                          }
                        }
                        this.field_L = 0;
                        this.field_m = false;
                        break L29;
                      }
                    }
                    L33: {
                      if (this.field_m) {
                        this.field_L = 1;
                        break L33;
                      } else {
                        break L33;
                      }
                    }
                    L34: {
                      L35: {
                        if (uf.field_c == -1) {
                          break L35;
                        } else {
                          L36: {
                            L37: {
                              if (-2 != (oh.field_f ^ -1)) {
                                break L37;
                              } else {
                                if (!this.field_m) {
                                  break L36;
                                } else {
                                  break L37;
                                }
                              }
                            }
                            if (-2 != (this.field_N ^ -1)) {
                              break L35;
                            } else {
                              break L36;
                            }
                          }
                          if (this.field_L <= 0) {
                            break L35;
                          } else {
                            L38: {
                              if (!ha.field_o) {
                                break L38;
                              } else {
                                if (4 > this.field_B) {
                                  break L35;
                                } else {
                                  break L38;
                                }
                              }
                            }
                            L39: {
                              if (uf.field_c != this.field_q.field_F) {
                                break L39;
                              } else {
                                if (this.field_q.field_H != vf.field_a) {
                                  break L39;
                                } else {
                                  break L35;
                                }
                              }
                            }
                            L40: {
                              this.b((byte) -3);
                              this.field_q.field_X = uf.field_c;
                              ok.field_i = true;
                              if (-5 != (this.field_B ^ -1)) {
                                break L40;
                              } else {
                                this.field_B = 5;
                                break L40;
                              }
                            }
                            L41: {
                              this.field_q.field_n = vf.field_a;
                              this.field_q.field_N = cm.field_d;
                              this.field_q.field_d = 2;
                              this.field_q.field_S = true;
                              if (!this.field_m) {
                                break L41;
                              } else {
                                this.field_q.field_d = 4;
                                break L41;
                              }
                            }
                            L42: {
                              this.field_q.field_A = 0;
                              var5_int = this.field_q.field_U;
                              var6 = this.field_q.field_ab;
                              this.field_q.a(true, uf.field_c, vf.field_a);
                              if ((Math.abs(-this.field_q.field_U + var5_int) ^ -1) > -3) {
                                break L42;
                              } else {
                                if (-7 <= (Math.abs(-this.field_q.field_U + var5_int) ^ -1)) {
                                  this.field_q.field_ab = 0;
                                  break L42;
                                } else {
                                  break L42;
                                }
                              }
                            }
                            L43: {
                              var7 = this.field_q.c(false);
                              if (!this.field_m) {
                                break L43;
                              } else {
                                var7 = 15;
                                break L43;
                              }
                            }
                            L44: {
                              this.field_q.field_U = var5_int;
                              this.field_q.field_ab = var6;
                              if (var7 <= this.field_q.field_jb) {
                                break L44;
                              } else {
                                L45: {
                                  if (this.field_q.field_jb < var7 - 10) {
                                    break L45;
                                  } else {
                                    if (this.field_m) {
                                      break L45;
                                    } else {
                                      if ((this.field_q.field_jb ^ -1) > -11) {
                                        break L45;
                                      } else {
                                        break L44;
                                      }
                                    }
                                  }
                                }
                                this.field_q.field_S = false;
                                break L44;
                              }
                            }
                            L46: {
                              if (this.field_q.field_nb.field_c != 0) {
                                break L46;
                              } else {
                                if (!this.field_m) {
                                  this.field_q.field_S = false;
                                  break L46;
                                } else {
                                  break L46;
                                }
                              }
                            }
                            if (!this.field_q.field_S) {
                              break L34;
                            } else {
                              if (this.field_m) {
                                this.field_L = 0;
                                break L34;
                              } else {
                                break L34;
                              }
                            }
                          }
                        }
                      }
                      if ((this.field_N ^ -1) != -2) {
                        break L34;
                      } else {
                        if (-1 != (this.field_L ^ -1)) {
                          break L34;
                        } else {
                          qd.a((byte) 45, 22);
                          ok.field_i = true;
                          var13 = this.field_h.a(117, vf.field_a, cm.field_d, uf.field_c);
                          this.field_m = false;
                          if (this.field_q == null) {
                            if (var13 != null) {
                              if (null == var13.field_h) {
                                break L34;
                              } else {
                                if (0 != var13.field_h.field_C) {
                                  break L34;
                                } else {
                                  if (null != var13.field_h.field_Z) {
                                    this.b((byte) -3);
                                    this.field_m = false;
                                    this.field_q = var13.field_h;
                                    this.field_L = 0;
                                    this.a(-1);
                                    break L34;
                                  } else {
                                    break L34;
                                  }
                                }
                              }
                            } else {
                              break L34;
                            }
                          } else {
                            L47: {
                              L48: {
                                if (!ha.field_o) {
                                  break L48;
                                } else {
                                  if (-9 >= (this.field_B ^ -1)) {
                                    break L48;
                                  } else {
                                    L49: {
                                      if (this.field_B != 0) {
                                        break L49;
                                      } else {
                                        if ((uf.field_c ^ -1) > -9) {
                                          break L49;
                                        } else {
                                          if (-11 > (uf.field_c ^ -1)) {
                                            break L49;
                                          } else {
                                            if (-5 == (vf.field_a ^ -1)) {
                                              break L48;
                                            } else {
                                              break L49;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    if (-3 != (this.field_B ^ -1)) {
                                      break L47;
                                    } else {
                                      if (8 > uf.field_c) {
                                        break L47;
                                      } else {
                                        if (uf.field_c > 10) {
                                          break L47;
                                        } else {
                                          if ((vf.field_a ^ -1) != -9) {
                                            break L47;
                                          } else {
                                            break L48;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              if (!this.field_w) {
                                this.field_q.field_n = vf.field_a;
                                this.field_q.field_S = true;
                                this.field_q.field_r = null;
                                this.field_q.field_A = 0;
                                this.field_q.field_d = this.field_q.field_B;
                                this.field_q.field_X = uf.field_c;
                                this.field_q.field_N = cm.field_d;
                                break L47;
                              } else {
                                break L47;
                              }
                            }
                            if (var13 != null) {
                              L50: {
                                if (var13.field_h == null) {
                                  break L50;
                                } else {
                                  if (var13.field_h.field_C != 0) {
                                    break L50;
                                  } else {
                                    if (var13.field_h.field_Z == null) {
                                      break L50;
                                    } else {
                                      L51: {
                                        if (!ha.field_o) {
                                          break L51;
                                        } else {
                                          if (7 > this.field_B) {
                                            break L50;
                                          } else {
                                            break L51;
                                          }
                                        }
                                      }
                                      L52: {
                                        this.field_q.field_S = false;
                                        if (7 > this.field_B) {
                                          break L52;
                                        } else {
                                          if (this.field_B >= 10) {
                                            break L52;
                                          } else {
                                            this.field_B = this.field_B + 1;
                                            break L52;
                                          }
                                        }
                                      }
                                      this.field_q = this.field_h.a(102, vf.field_a, cm.field_d, uf.field_c).field_h;
                                      this.a(-1);
                                      this.field_m = false;
                                      this.field_L = 0;
                                      break L50;
                                    }
                                  }
                                }
                              }
                              L53: {
                                if (var13.field_h == null) {
                                  break L53;
                                } else {
                                  if ((var13.field_h.field_C ^ -1) != -2) {
                                    break L53;
                                  } else {
                                    if (!var13.field_h.field_k) {
                                      break L53;
                                    } else {
                                      L54: {
                                        if (!ha.field_o) {
                                          break L54;
                                        } else {
                                          if (5 <= this.field_B) {
                                            break L54;
                                          } else {
                                            break L53;
                                          }
                                        }
                                      }
                                      L55: {
                                        this.field_q.field_X = uf.field_c;
                                        this.field_q.field_d = 2;
                                        this.field_q.field_N = cm.field_d;
                                        ok.field_i = true;
                                        this.field_q.field_n = vf.field_a;
                                        this.field_q.field_S = true;
                                        this.field_q.field_A = 0;
                                        if (!this.field_m) {
                                          break L55;
                                        } else {
                                          this.field_q.field_d = 4;
                                          break L55;
                                        }
                                      }
                                      L56: {
                                        var6 = this.field_q.field_U;
                                        var7 = this.field_q.field_ab;
                                        this.field_q.a(param1, this.field_q.field_X, this.field_q.field_n);
                                        stackIn_167_0 = this.field_q;

                                        if (param1) {
                                          stackIn_168_0 = (r) ((Object) stackIn_167_0);
                                          stackIn_168_1 = 0;
                                          break L56;
                                        } else {
                                          stackIn_168_0 = (r) ((Object) stackIn_167_0);
                                          stackIn_168_1 = 1;
                                          break L56;
                                        }
                                      }
                                      L57: {
                                        var8 = ((r) (Object) stackIn_168_0).c(stackIn_168_1 != 0);
                                        if (-3 < (Math.abs(var6 + -this.field_q.field_U) ^ -1)) {
                                          break L57;
                                        } else {
                                          if (Math.abs(-this.field_q.field_U + var6) <= 6) {
                                            this.field_q.field_ab = 0;
                                            break L57;
                                          } else {
                                            break L57;
                                          }
                                        }
                                      }
                                      L58: {
                                        this.field_q.field_ab = var7;
                                        if (!this.field_m) {
                                          break L58;
                                        } else {
                                          var8 = 15;
                                          break L58;
                                        }
                                      }
                                      L59: {
                                        this.field_q.field_U = var6;
                                        if (this.field_q.field_jb >= var8) {
                                          break L59;
                                        } else {
                                          L60: {
                                            if (this.field_q.field_jb < 10) {
                                              break L60;
                                            } else {
                                              if (this.field_m) {
                                                break L60;
                                              } else {
                                                if (10 > this.field_q.field_jb) {
                                                  break L60;
                                                } else {
                                                  break L59;
                                                }
                                              }
                                            }
                                          }
                                          this.field_q.field_S = false;
                                          break L59;
                                        }
                                      }
                                      L61: {
                                        if (-1 != (this.field_q.field_nb.field_c ^ -1)) {
                                          break L61;
                                        } else {
                                          if (this.field_m) {
                                            break L61;
                                          } else {
                                            this.field_q.field_S = false;
                                            break L61;
                                          }
                                        }
                                      }
                                      if (!this.field_q.field_S) {
                                        break L53;
                                      } else {
                                        if (this.field_m) {
                                          this.field_L = 0;
                                          break L53;
                                        } else {
                                          break L53;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              if (this.field_q.field_S) {
                                if ((this.field_q.field_d ^ -1) != -3) {
                                  if ((this.field_q.field_d ^ -1) == -5) {
                                    this.b((byte) -3);
                                    break L34;
                                  } else {
                                    if (this.field_w) {
                                      break L34;
                                    } else {
                                      L62: {
                                        if (-1 == var13.field_v) {
                                          break L62;
                                        } else {
                                          if (var13.field_v == 2) {
                                            break L62;
                                          } else {
                                            if ((var13.field_v ^ -1) != -4) {
                                              L63: {
                                                if (ql.field_i != uf.field_c) {
                                                  break L63;
                                                } else {
                                                  if (ld.field_e != vf.field_a) {
                                                    break L63;
                                                  } else {
                                                    L64: {
                                                      if (fi.field_m == null) {
                                                        break L64;
                                                      } else {
                                                        if (Math.random() * 100.0 >= (double)fi.field_m.a(param1)) {
                                                          break L64;
                                                        } else {
                                                          L65: {
                                                            var6_ref_int__ = new int[]{2, 10, 11};
                                                            var7_ref_int__ = new int[]{15, 20, 21};
                                                            if (this.field_q.field_Z.field_y) {
                                                              qd.a((byte) 54, var6_ref_int__[(int)(Math.random() * (double)var6_ref_int__.length)]);
                                                              break L65;
                                                            } else {
                                                              break L65;
                                                            }
                                                          }
                                                          if (this.field_q.field_Z.field_y) {
                                                            break L64;
                                                          } else {
                                                            qd.a((byte) 125, var7_ref_int__[(int)(Math.random() * (double)var7_ref_int__.length)]);
                                                            break L64;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    this.b((byte) -3);
                                                    if (-1 != (this.field_B ^ -1)) {
                                                      break L34;
                                                    } else {
                                                      this.field_B = 1;
                                                      break L34;
                                                    }
                                                  }
                                                }
                                              }
                                              ql.field_i = uf.field_c;
                                              ld.field_e = vf.field_a;
                                              og.field_d = -1;
                                              this.field_q.field_S = false;
                                              this.field_q.field_c.field_h = null;
                                              fi.field_m = this.field_h.a(false, this.field_q.field_n, this.field_q.field_H, -89, true, this.field_q.field_N, this.field_q.field_E, this.field_q.field_X, this.field_q.field_F);
                                              this.field_q.field_c.field_h = this.field_q;
                                              if (fi.field_m == null) {
                                                break L34;
                                              } else {
                                                og.field_d = fi.field_m.a(param1);
                                                break L34;
                                              }
                                            } else {
                                              break L62;
                                            }
                                          }
                                        }
                                      }
                                      ql.field_i = uf.field_c;
                                      fi.field_m = null;
                                      this.field_q.field_S = false;
                                      ld.field_e = vf.field_a;
                                      og.field_d = -1;
                                      break L34;
                                    }
                                  }
                                } else {
                                  this.b((byte) -3);
                                  break L34;
                                }
                              } else {
                                this.b((byte) -3);
                                break L34;
                              }
                            } else {
                              this.b((byte) -3);
                              this.field_q.field_S = false;
                              break L34;
                            }
                          }
                        }
                      }
                    }
                    L66: {
                      if (var3 == null) {
                        break L66;
                      } else {
                        if (var4_ref != null) {
                          param0.field_Eb = new String[2];
                          param0.field_Eb[1] = (String) (var4_ref);
                          param0.field_Eb[0] = (String) (var3);
                          break L11;
                        } else {
                          break L66;
                        }
                      }
                    }
                    L67: {
                      if (var3 != null) {
                        param0.field_Eb = new String[1];
                        param0.field_Eb[0] = (String) (var3);
                        break L67;
                      } else {
                        break L67;
                      }
                    }
                    if (var4_ref != null) {
                      param0.field_Eb = new String[1];
                      param0.field_Eb[0] = (String) (var4_ref);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                }
              }
              L68: {
                var3_int = this.field_y;
                var4 = this.field_j - 385;
                if ((var3_int ^ -1) > -100) {
                  break L68;
                } else {
                  if ((var3_int ^ -1) <= -126) {
                    break L68;
                  } else {
                    if (var4 < 66) {
                      break L68;
                    } else {
                      if (-93 >= (var4 ^ -1)) {
                        break L68;
                      } else {
                        L69: {
                          if (!ha.field_o) {
                            break L69;
                          } else {
                            if (-12 < (this.field_B ^ -1)) {
                              break L68;
                            } else {
                              break L69;
                            }
                          }
                        }
                        if (this.field_q.field_B == 0) {
                          param0.field_Eb = new String[1];
                          param0.field_Eb[0] = fa.field_e;
                          if (this.field_N == 1) {
                            L70: {
                              qd.a((byte) 16, 33);
                              var5_int = this.field_q.g(12384);
                              this.field_q.field_B = 1;
                              this.field_q.field_jb = this.field_q.field_jb - var5_int;
                              this.field_q.field_jb = this.field_q.field_jb - this.field_q.field_jb / 2;
                              if (this.field_q.field_jb < 0) {
                                this.field_q.field_jb = 0;
                                break L70;
                              } else {
                                break L70;
                              }
                            }
                            this.field_q.b(var5_int, (byte) -126);
                            break L68;
                          } else {
                            break L68;
                          }
                        } else {
                          break L68;
                        }
                      }
                    }
                  }
                }
              }
              L71: {
                if (-128 < (var3_int ^ -1)) {
                  break L71;
                } else {
                  if (var3_int >= 153) {
                    break L71;
                  } else {
                    if (var4 < 66) {
                      break L71;
                    } else {
                      if (92 <= var4) {
                        break L71;
                      } else {
                        if (1 != this.field_q.field_B) {
                          break L71;
                        } else {
                          L72: {
                            if (!ha.field_o) {
                              break L72;
                            } else {
                              if (this.field_B < 11) {
                                break L71;
                              } else {
                                break L72;
                              }
                            }
                          }
                          L73: {
                            if (-2 != (this.field_q.field_B ^ -1)) {
                              break L73;
                            } else {
                              param0.field_Eb = new String[1];
                              param0.field_Eb[0] = db.field_a;
                              break L73;
                            }
                          }
                          if ((this.field_N ^ -1) != -2) {
                            break L71;
                          } else {
                            qd.a((byte) 47, 33);
                            this.field_q.field_B = 0;
                            stackIn_280_0 = this.field_q;
                            stackIn_280_1 = this.field_q;
                            stackIn_280_0.field_jb = stackIn_280_1.field_jb + this.field_q.field_jb / 2;
                            break L71;
                          }
                        }
                      }
                    }
                  }
                }
              }
              L74: {
                if ((var3_int ^ -1) > -156) {
                  break L74;
                } else {
                  if ((var3_int ^ -1) <= -182) {
                    break L74;
                  } else {
                    if (66 > var4) {
                      break L74;
                    } else {
                      if (var4 >= 92) {
                        break L74;
                      } else {
                        param0.field_Eb = new String[1];
                        param0.field_Eb[0] = of.field_i;
                        if (-2 == (this.field_N ^ -1)) {
                          L75: {
                            stackIn_289_0 = 39;

                            if (d.field_H) {
                              stackIn_290_0 = stackIn_289_0;
                              stackIn_290_1 = 34;
                              break L75;
                            } else {
                              stackIn_290_0 = stackIn_289_0;
                              stackIn_290_1 = 33;
                              break L75;
                            }
                          }
                          L76: {
                            qd.a((byte) stackIn_290_0, stackIn_290_1);
                            if (d.field_H) {
                              stackIn_293_0 = 0;
                              break L76;
                            } else {
                              stackIn_293_0 = 1;
                              break L76;
                            }
                          }
                          d.field_H = stackIn_293_0 != 0;
                          break L74;
                        } else {
                          break L74;
                        }
                      }
                    }
                  }
                }
              }
              L77: {
                if (var3_int < 184) {
                  break L77;
                } else {
                  if ((var3_int ^ -1) <= -211) {
                    break L77;
                  } else {
                    if (var4 < 66) {
                      break L77;
                    } else {
                      if (-93 >= (var4 ^ -1)) {
                        break L77;
                      } else {
                        if (-1 <= (eg.field_p ^ -1)) {
                          break L77;
                        } else {
                          L78: {
                            if (!ha.field_o) {
                              break L78;
                            } else {
                              if (this.field_B >= 12) {
                                break L78;
                              } else {
                                break L77;
                              }
                            }
                          }
                          L79: {
                            if ((eg.field_p ^ -1) < -2) {
                              param0.field_Eb = new String[1];
                              param0.field_Eb[0] = di.field_g + (eg.field_p - 1);
                              break L79;
                            } else {
                              break L79;
                            }
                          }
                          L80: {
                            if ((eg.field_p ^ -1) != -2) {
                              break L80;
                            } else {
                              param0.field_Eb = new String[1];
                              param0.field_Eb[0] = ph.field_u;
                              break L80;
                            }
                          }
                          if (-2 == (this.field_N ^ -1)) {
                            L81: {
                              qd.a((byte) 80, 25);
                              if (this.field_B != 12) {
                                break L81;
                              } else {
                                this.field_B = 13;
                                break L81;
                              }
                            }
                            eg.field_p = eg.field_p - 1;
                            break L77;
                          } else {
                            break L77;
                          }
                        }
                      }
                    }
                  }
                }
              }
              L82: {
                if (212 > var3_int) {
                  break L82;
                } else {
                  if (238 <= var3_int) {
                    break L82;
                  } else {
                    if ((var4 ^ -1) > -67) {
                      break L82;
                    } else {
                      if (92 <= var4) {
                        break L82;
                      } else {
                        if (eg.field_p >= 5) {
                          break L82;
                        } else {
                          L83: {
                            if (!ha.field_o) {
                              break L83;
                            } else {
                              if (-13 >= (this.field_B ^ -1)) {
                                break L83;
                              } else {
                                break L82;
                              }
                            }
                          }
                          param0.field_Eb = new String[1];
                          param0.field_Eb[0] = di.field_g + (eg.field_p + 1);
                          if ((this.field_N ^ -1) == -2) {
                            L84: {
                              qd.a((byte) 107, 24);
                              if (-13 != (this.field_B ^ -1)) {
                                break L84;
                              } else {
                                this.field_B = 13;
                                break L84;
                              }
                            }
                            eg.field_p = eg.field_p + 1;
                            break L82;
                          } else {
                            break L82;
                          }
                        }
                      }
                    }
                  }
                }
              }
              L85: {
                if ((var3_int ^ -1) > -242) {
                  break L85;
                } else {
                  if (267 <= var3_int) {
                    break L85;
                  } else {
                    if (66 > var4) {
                      break L85;
                    } else {
                      if (92 <= var4) {
                        break L85;
                      } else {
                        L86: {
                          if (!ha.field_o) {
                            break L86;
                          } else {
                            if ((this.field_B ^ -1) <= -8) {
                              break L86;
                            } else {
                              break L85;
                            }
                          }
                        }
                        param0.field_Eb = new String[1];
                        param0.field_Eb[0] = sd.field_f;
                        if (this.field_N == 1) {
                          qd.a((byte) 109, 24);
                          var5_int = 0;
                          var6 = 0;
                          L87: while (true) {
                            if ((var6 ^ -1) <= -13) {
                              var6 = 0;
                              L88: while (true) {
                                L89: {
                                  var6++;
                                  var5_int++;
                                  if (var5_int >= 12) {
                                    var5_int -= 12;
                                    break L89;
                                  } else {
                                    break L89;
                                  }
                                }
                                L90: {
                                  if (var6 >= 12) {
                                    break L90;
                                  } else {
                                    if (this.field_C[var5_int] == null) {
                                      continue L88;
                                    } else {
                                      if (this.field_C[var5_int].field_Z == null) {
                                        continue L88;
                                      } else {
                                        if (-1 <= (this.field_C[var5_int].field_jb ^ -1)) {
                                          continue L88;
                                        } else {
                                          if (this.field_C[var5_int].field_P <= 0) {
                                            continue L88;
                                          } else {
                                            break L90;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                if (this.field_C[var5_int] == null) {
                                  break L85;
                                } else {
                                  stackIn_350_0 = this.field_C[var5_int].field_Z;
                                  if (stackIn_350_0 == null) {
                                    break L85;
                                  } else {
                                    if ((this.field_C[var5_int].field_P ^ -1) < -1) {
                                      L91: {
                                        this.field_q = this.field_C[var5_int];
                                        lg.field_c = -(this.field_q.field_E * 48) + (this.field_q.field_H + this.field_q.field_F) * 16;
                                        this.field_m = false;
                                        if (-8 < (this.field_B ^ -1)) {
                                          break L91;
                                        } else {
                                          if (this.field_B >= 10) {
                                            break L91;
                                          } else {
                                            this.field_B = this.field_B + 1;
                                            break L91;
                                          }
                                        }
                                      }
                                      sj.field_b = 32 * (-this.field_q.field_H + this.field_q.field_F);
                                      eg.field_p = this.field_q.field_E;
                                      this.field_L = 0;
                                      this.a(-1);
                                      break L85;
                                    } else {
                                      break L85;
                                    }
                                  }
                                }
                              }
                            } else {
                              if (this.field_q == this.field_C[var6]) {
                                var5_int = var6;
                                var6++;
                                continue L87;
                              } else {
                                var6++;
                                continue L87;
                              }
                            }
                          }
                        } else {
                          break L85;
                        }
                      }
                    }
                  }
                }
              }
              L92: {
                L93: {
                  L94: {
                    if ((var3_int ^ -1) > -14) {
                      break L94;
                    } else {
                      if ((var3_int ^ -1) <= -82) {
                        break L94;
                      } else {
                        if (12 > var4) {
                          break L94;
                        } else {
                          if ((var4 ^ -1) > -81) {
                            break L93;
                          } else {
                            break L94;
                          }
                        }
                      }
                    }
                  }
                  if (-270 < (var3_int ^ -1)) {
                    break L92;
                  } else {
                    if ((var3_int ^ -1) <= -296) {
                      break L92;
                    } else {
                      if (66 > var4) {
                        break L92;
                      } else {
                        if ((var4 ^ -1) <= -93) {
                          break L92;
                        } else {
                          break L93;
                        }
                      }
                    }
                  }
                }
                L95: {
                  if (!ha.field_o) {
                    break L95;
                  } else {
                    if (-10 < (this.field_B ^ -1)) {
                      break L92;
                    } else {
                      break L95;
                    }
                  }
                }
                param0.field_Eb = new String[1];
                param0.field_Eb[0] = ab.field_f;
                if ((this.field_N ^ -1) != -2) {
                  break L92;
                } else {
                  qd.a((byte) 18, 33);
                  lg.field_c = -(48 * this.field_q.field_E) + (this.field_q.field_F - -this.field_q.field_H) * 16;
                  eg.field_p = this.field_q.field_E;
                  sj.field_b = 32 * (this.field_q.field_F + -this.field_q.field_H);
                  break L92;
                }
              }
              L96: {
                if ((var3_int ^ -1) > -310) {
                  break L96;
                } else {
                  if (var3_int >= 457) {
                    break L96;
                  } else {
                    if (var4 < 10) {
                      break L96;
                    } else {
                      if ((var4 ^ -1) <= -84) {
                        break L96;
                      } else {
                        L97: {
                          if (!ha.field_o) {
                            break L97;
                          } else {
                            if (5 <= this.field_B) {
                              break L97;
                            } else {
                              if (3 == this.field_B) {
                                break L97;
                              } else {
                                break L96;
                              }
                            }
                          }
                        }
                        L98: {
                          var14 = this.field_q.field_nb;
                          var5 = var14;
                          if (var14 == null) {
                            break L98;
                          } else {
                            L99: {
                              if (0 == var14.field_g) {
                                break L99;
                              } else {
                                if (var14.field_g == 3) {
                                  break L99;
                                } else {
                                  if (8 == var14.field_g) {
                                    break L99;
                                  } else {
                                    if (12 != var14.field_g) {
                                      break L98;
                                    } else {
                                      break L99;
                                    }
                                  }
                                }
                              }
                            }
                            var5 = this.field_q.field_eb;
                            break L98;
                          }
                        }
                        if (var5 == null) {
                          break L96;
                        } else {
                          L100: {
                            param0.field_Eb = new String[1];
                            param0.field_Eb[0] = ne.field_b + od.field_c[var5.field_g].field_j + " " + gl.field_h;
                            if (-2 != (this.field_L ^ -1)) {
                              break L100;
                            } else {
                              param0.field_Eb[0] = ne.field_b + od.field_c[var5.field_g].field_j + " " + td.field_a;
                              break L100;
                            }
                          }
                          L101: {
                            if (ef.field_j < 324) {
                              break L101;
                            } else {
                              if ((ef.field_j ^ -1) < -355) {
                                break L101;
                              } else {
                                if (var4 < 50) {
                                  break L101;
                                } else {
                                  if (80 < var4) {
                                    break L101;
                                  } else {
                                    if (var5.field_c >= var5.a(true)) {
                                      break L101;
                                    } else {
                                      if ((var5.field_g ^ -1) == -7) {
                                        break L101;
                                      } else {
                                        if (-8 == (var5.field_g ^ -1)) {
                                          break L101;
                                        } else {
                                          param0.field_Eb = new String[1];
                                          param0.field_Eb[0] = rf.field_q + od.field_c[var5.field_g].field_j + hi.field_Y;
                                          if (1 == this.field_N) {
                                            var6 = 14;
                                            if (var6 > this.field_q.field_jb) {
                                              break L96;
                                            } else {
                                              var5.a(0);
                                              qd.a((byte) 120, od.field_c[var5.field_g].field_n);
                                              this.field_q.field_jb = this.field_q.field_jb - var6;
                                              this.field_q.b(var6, (byte) -116);
                                              this.field_q.field_ab = 0;
                                              break L96;
                                            }
                                          } else {
                                            break L96;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (1 != this.field_N) {
                            break L96;
                          } else {
                            L102: {
                              L103: {
                                if (this.field_q.field_eb == null) {
                                  break L103;
                                } else {
                                  L104: {
                                    if (this.field_q.field_nb.field_g == 0) {
                                      break L104;
                                    } else {
                                      if (8 == this.field_q.field_nb.field_g) {
                                        break L104;
                                      } else {
                                        if ((this.field_q.field_nb.field_g ^ -1) == -4) {
                                          break L104;
                                        } else {
                                          if (-13 != (this.field_q.field_nb.field_g ^ -1)) {
                                            break L103;
                                          } else {
                                            break L104;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L105: {
                                    var10 = this.field_q.field_nb;
                                    var5 = var10;
                                    this.field_q.field_nb = this.field_q.field_eb;
                                    if (this.field_m) {
                                      this.field_L = 0;
                                      break L105;
                                    } else {
                                      break L105;
                                    }
                                  }
                                  this.field_q.field_eb = var10;
                                  this.field_q.field_ab = 0;
                                  break L102;
                                }
                              }
                              if (!this.field_m) {
                                this.field_L = 1 + -this.field_L;
                                break L102;
                              } else {
                                this.field_L = 0;
                                break L102;
                              }
                            }
                            L106: {
                              if ((this.field_B ^ -1) == -4) {
                                this.field_B = 4;
                                break L106;
                              } else {
                                break L106;
                              }
                            }
                            L107: {
                              this.field_m = false;
                              stackIn_420_0 = 41;

                              if (this.field_L == 0) {
                                stackIn_421_0 = stackIn_420_0;
                                stackIn_421_1 = 34;
                                break L107;
                              } else {
                                stackIn_421_0 = stackIn_420_0;
                                stackIn_421_1 = 33;
                                break L107;
                              }
                            }
                            qd.a((byte) stackIn_421_0, stackIn_421_1);
                            break L96;
                          }
                        }
                      }
                    }
                  }
                }
              }
              L108: {
                if (-468 < (var3_int ^ -1)) {
                  break L108;
                } else {
                  if (var3_int >= 540) {
                    break L108;
                  } else {
                    if (var4 < 10) {
                      break L108;
                    } else {
                      if (83 <= var4) {
                        break L108;
                      } else {
                        L109: {
                          if (!ha.field_o) {
                            break L109;
                          } else {
                            if (this.field_B >= 5) {
                              break L109;
                            } else {
                              if (this.field_B != 3) {
                                break L108;
                              } else {
                                break L109;
                              }
                            }
                          }
                        }
                        L110: {
                          L111: {
                            var15 = this.field_q.field_eb;
                            var5 = var15;
                            if (var15 == null) {
                              break L111;
                            } else {
                              if (var15.field_g == 0) {
                                break L110;
                              } else {
                                if (-4 == (var15.field_g ^ -1)) {
                                  break L110;
                                } else {
                                  if (8 == var15.field_g) {
                                    break L110;
                                  } else {
                                    if ((var15.field_g ^ -1) == -13) {
                                      break L110;
                                    } else {
                                      break L111;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var5 = this.field_q.field_nb;
                          break L110;
                        }
                        if (var5 == null) {
                          break L108;
                        } else {
                          L112: {
                            param0.field_Eb = new String[1];
                            param0.field_Eb[0] = ne.field_b + od.field_c[var5.field_g].field_j + " " + gl.field_h;
                            if ((this.field_L ^ -1) != -2) {
                              break L112;
                            } else {
                              param0.field_Eb[0] = ne.field_b + od.field_c[var5.field_g].field_j + " " + td.field_a;
                              break L112;
                            }
                          }
                          L113: {
                            if (-482 < (ef.field_j ^ -1)) {
                              break L113;
                            } else {
                              if ((ef.field_j ^ -1) < -512) {
                                break L113;
                              } else {
                                if ((var4 ^ -1) > -51) {
                                  break L113;
                                } else {
                                  if (var4 > 80) {
                                    break L113;
                                  } else {
                                    if (var5.field_c >= var5.a(true)) {
                                      break L113;
                                    } else {
                                      if (-7 == (var5.field_g ^ -1)) {
                                        break L113;
                                      } else {
                                        if (7 != var5.field_g) {
                                          param0.field_Eb = new String[1];
                                          param0.field_Eb[0] = rf.field_q + od.field_c[var5.field_g].field_j + hi.field_Y;
                                          if (-2 == (this.field_N ^ -1)) {
                                            var6 = 14;
                                            if (this.field_q.field_jb >= var6) {
                                              var5.a(0);
                                              qd.a((byte) 25, od.field_c[var5.field_g].field_n);
                                              this.field_q.field_jb = this.field_q.field_jb - var6;
                                              this.field_q.b(var6, (byte) -117);
                                              this.field_q.field_ab = 0;
                                              break L108;
                                            } else {
                                              break L108;
                                            }
                                          } else {
                                            break L108;
                                          }
                                        } else {
                                          break L113;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (-2 != (this.field_N ^ -1)) {
                            break L108;
                          } else {
                            L114: {
                              L115: {
                                if (null == this.field_q.field_eb) {
                                  break L115;
                                } else {
                                  if (0 == this.field_q.field_nb.field_g) {
                                    break L115;
                                  } else {
                                    if ((this.field_q.field_nb.field_g ^ -1) == -9) {
                                      break L115;
                                    } else {
                                      if (-4 == (this.field_q.field_nb.field_g ^ -1)) {
                                        break L115;
                                      } else {
                                        if (this.field_q.field_nb.field_g == 12) {
                                          break L115;
                                        } else {
                                          L116: {
                                            var11 = this.field_q.field_nb;
                                            var5 = var11;
                                            this.field_q.field_nb = this.field_q.field_eb;
                                            this.field_q.field_ab = 0;
                                            if (this.field_m) {
                                              this.field_L = 0;
                                              break L116;
                                            } else {
                                              break L116;
                                            }
                                          }
                                          this.field_q.field_eb = var11;
                                          break L114;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              if (this.field_m) {
                                this.field_L = 0;
                                break L114;
                              } else {
                                this.field_L = 1 + -this.field_L;
                                break L114;
                              }
                            }
                            L117: {
                              if ((this.field_B ^ -1) != -4) {
                                break L117;
                              } else {
                                this.field_B = 4;
                                break L117;
                              }
                            }
                            L118: {
                              this.field_m = false;
                              if (-6 == (this.field_B ^ -1)) {
                                this.field_B = 6;
                                break L118;
                              } else {
                                break L118;
                              }
                            }
                            L119: {
                              stackIn_468_0 = 16;

                              if (-1 == (this.field_L ^ -1)) {
                                stackIn_469_0 = stackIn_468_0;
                                stackIn_469_1 = 34;
                                break L119;
                              } else {
                                stackIn_469_0 = stackIn_468_0;
                                stackIn_469_1 = 33;
                                break L119;
                              }
                            }
                            qd.a((byte) stackIn_469_0, stackIn_469_1);
                            break L108;
                          }
                        }
                      }
                    }
                  }
                }
              }
              L120: {
                if (547 > var3_int) {
                  break L120;
                } else {
                  if (595 <= var3_int) {
                    break L120;
                  } else {
                    if (var4 < 35) {
                      break L120;
                    } else {
                      if (-84 >= (var4 ^ -1)) {
                        break L120;
                      } else {
                        L121: {
                          if (!ha.field_o) {
                            break L121;
                          } else {
                            if (-15 < (this.field_B ^ -1)) {
                              break L120;
                            } else {
                              break L121;
                            }
                          }
                        }
                        L122: {
                          param0.field_Eb = new String[1];
                          param0.field_Eb[0] = wg.field_g;
                          if (!this.field_m) {
                            break L122;
                          } else {
                            param0.field_Eb[0] = kd.field_d;
                            break L122;
                          }
                        }
                        if (1 != this.field_N) {
                          break L120;
                        } else {
                          L123: {
                            if (0 == this.field_L) {
                              break L123;
                            } else {
                              if (!this.field_m) {
                                break L123;
                              } else {
                                qd.a((byte) 108, 34);
                                this.field_m = false;
                                this.field_L = 0;
                                break L120;
                              }
                            }
                          }
                          this.field_L = 1;
                          this.field_m = true;
                          qd.a((byte) 102, 33);
                          break L120;
                        }
                      }
                    }
                  }
                }
              }
              if (var3_int < ge.field_b) {
                break L11;
              } else {
                if (var3_int >= vb.field_i + ge.field_b) {
                  break L11;
                } else {
                  if (var4 < 9) {
                    break L11;
                  } else {
                    if (-85 >= (var4 ^ -1)) {
                      break L11;
                    } else {
                      L124: {
                        if (!ha.field_o) {
                          break L124;
                        } else {
                          if (-11 >= (this.field_B ^ -1)) {
                            break L124;
                          } else {
                            break L11;
                          }
                        }
                      }
                      param0.field_Eb = new String[1];
                      param0.field_Eb[0] = kd.field_e;
                      if (-2 != (this.field_N ^ -1)) {
                        break L11;
                      } else {
                        L125: {
                          if (-11 != (this.field_B ^ -1)) {
                            break L125;
                          } else {
                            this.field_B = 11;
                            break L125;
                          }
                        }
                        this.a(param0, (byte) 69);
                        qd.a((byte) 59, 32);
                        break L11;
                      }
                    }
                  }
                }
              }
            }
            L126: {
              if (param1) {
                break L126;
              } else {
                this.field_e = (hk) null;
                break L126;
              }
            }
            decompiledRegionSelector0 = 3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L127: {
            var3 = decompiledCaughtException;
            stackIn_505_0 = var3;

            stackIn_505_1 = new StringBuilder().append("e.A(");

            if (param0 == null) {
              stackIn_506_0 = stackIn_505_0;
              stackIn_506_1 = (StringBuilder) ((Object) stackIn_505_1);
              stackIn_506_2 = "null";
              break L127;
            } else {
              stackIn_506_0 = stackIn_505_0;
              stackIn_506_1 = (StringBuilder) ((Object) stackIn_505_1);
              stackIn_506_2 = "{...}";
              break L127;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_506_0), stackIn_506_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final void a(byte param0, int param1) {
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_39_0 = 0;
        int var3;
        oh var4_ref_oh;
        int var4;
        int var5;
        L0: {
          var5 = Terraphoenix.field_V;
          if (param1 != 64) {
            break L0;
          } else {
            if ((mm.field_e ^ -1) <= -3) {
              L1: {
                stackIn_5_0 = this;

                if (this.field_I) {
                  stackIn_6_0 = this;
                  stackIn_6_1 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = this;
                  stackIn_6_1 = 1;
                  break L1;
                }
              }
              ((e) (this)).field_I = stackIn_6_1 != 0;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L2: {
          if ((param1 ^ -1) != -50) {
            break L2;
          } else {
            if (ha.field_o) {
              break L2;
            } else {
              L3: {
                if (d.field_H) {
                  stackIn_12_0 = 0;
                  break L3;
                } else {
                  stackIn_12_0 = 1;
                  break L3;
                }
              }
              d.field_H = stackIn_12_0 != 0;
              break L2;
            }
          }
        }
        L4: {
          if (param1 != 40) {
            break L4;
          } else {
            if (ha.field_o) {
              break L4;
            } else {
              L5: {
                if (ce.field_e) {
                  stackIn_18_0 = 0;
                  break L5;
                } else {
                  stackIn_18_0 = 1;
                  break L5;
                }
              }
              ce.field_e = stackIn_18_0 != 0;
              break L4;
            }
          }
        }
        L6: {
          if (wb.field_e != param1) {
            break L6;
          } else {
            if (!ha.field_o) {
              L7: {
                stackIn_24_0 = this;

                if (this.field_w) {
                  stackIn_25_0 = this;
                  stackIn_25_1 = 0;
                  break L7;
                } else {
                  stackIn_25_0 = this;
                  stackIn_25_1 = 1;
                  break L7;
                }
              }
              ((e) (this)).field_w = stackIn_25_1 != 0;
              break L6;
            } else {
              break L6;
            }
          }
        }
        L8: {
          if ((param1 ^ -1) != -33) {
            break L8;
          } else {
            if ((mm.field_e ^ -1) <= -3) {
              L9: {
                if (g.field_tb) {
                  stackIn_32_0 = 0;
                  break L9;
                } else {
                  stackIn_32_0 = 1;
                  break L9;
                }
              }
              g.field_tb = stackIn_32_0 != 0;
              break L8;
            } else {
              break L8;
            }
          }
        }
        L10: {
          if (-40 != (param1 ^ -1)) {
            break L10;
          } else {
            if (!ha.field_o) {
              L11: {
                if (fd.field_o) {
                  stackIn_39_0 = 0;
                  break L11;
                } else {
                  stackIn_39_0 = 1;
                  break L11;
                }
              }
              fd.field_o = stackIn_39_0 != 0;
              break L10;
            } else {
              break L10;
            }
          }
        }
        L12: {
          if (!this.field_J) {
            break L12;
          } else {
            if (rh.field_c != param1) {
              break L12;
            } else {
              if (this.field_q.field_S) {
                break L12;
              } else {
                L13: {
                  if (!ha.field_o) {
                    break L13;
                  } else {
                    if (11 > this.field_B) {
                      break L12;
                    } else {
                      break L13;
                    }
                  }
                }
                if (-1 == (this.field_q.field_B ^ -1)) {
                  L14: {
                    var3 = this.field_q.g(12384);
                    this.field_q.field_jb = this.field_q.field_jb - var3;
                    this.field_q.field_B = 1;
                    this.field_q.field_jb = this.field_q.field_jb - this.field_q.field_jb / 2;
                    if (this.field_q.field_jb >= 0) {
                      break L14;
                    } else {
                      this.field_q.field_jb = 0;
                      break L14;
                    }
                  }
                  this.field_q.b(var3, (byte) -64);
                  break L12;
                } else {
                  break L12;
                }
              }
            }
          }
        }
        L15: {
          if (!this.field_J) {
            break L15;
          } else {
            if (param1 != 35) {
              break L15;
            } else {
              if (this.field_q.field_S) {
                break L15;
              } else {
                L16: {
                  if (!ha.field_o) {
                    break L16;
                  } else {
                    if (this.field_B < 11) {
                      break L15;
                    } else {
                      break L16;
                    }
                  }
                }
                if (1 != this.field_q.field_B) {
                  break L15;
                } else {
                  this.field_q.field_jb = this.field_q.field_jb + this.field_q.field_jb / 2;
                  this.field_q.field_B = 0;
                  break L15;
                }
              }
            }
          }
        }
        L17: {
          if (!this.field_J) {
            break L17;
          } else {
            if (param1 != 36) {
              break L17;
            } else {
              if (mm.field_e >= 2) {
                this.field_q.field_jb = this.field_q.field_v;
                kg.field_q = true;
                break L17;
              } else {
                break L17;
              }
            }
          }
        }
        L18: {
          if (!this.field_J) {
            break L18;
          } else {
            if (-57 != (param1 ^ -1)) {
              break L18;
            } else {
              var3 = 14;
              var4_ref_oh = this.field_q.field_nb;
              if (od.field_c[var4_ref_oh.field_g].field_o <= var4_ref_oh.field_c) {
                break L18;
              } else {
                if (this.field_q.field_jb >= var3) {
                  var4_ref_oh.a(0);
                  qd.a((byte) 73, od.field_c[var4_ref_oh.field_g].field_n);
                  this.field_q.field_jb = this.field_q.field_jb - var3;
                  this.field_q.b(var3, (byte) -111);
                  this.field_q.field_ab = 0;
                  break L18;
                } else {
                  break L18;
                }
              }
            }
          }
        }
        L19: {
          if (!this.field_J) {
            break L19;
          } else {
            if (param1 != 69) {
              break L19;
            } else {
              L20: {
                if (!ha.field_o) {
                  break L20;
                } else {
                  if ((this.field_B ^ -1) <= -8) {
                    break L20;
                  } else {
                    break L19;
                  }
                }
              }
              this.b((byte) -3);
              var3 = 0;
              var4 = 0;
              L21: while (true) {
                if (var4 >= 12) {
                  var4 = 0;
                  L22: while (true) {
                    L23: {
                      var3++;
                      if (-13 >= (var3 ^ -1)) {
                        var3 -= 12;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    L24: {
                      var4++;
                      if ((var4 ^ -1) <= -13) {
                        break L24;
                      } else {
                        if (null == this.field_C[var3]) {
                          continue L22;
                        } else {
                          if (this.field_C[var3].field_Z == null) {
                            continue L22;
                          } else {
                            if ((this.field_C[var3].field_jb ^ -1) >= -1) {
                              continue L22;
                            } else {
                              if ((this.field_C[var3].field_P ^ -1) >= -1) {
                                continue L22;
                              } else {
                                break L24;
                              }
                            }
                          }
                        }
                      }
                    }
                    L25: {
                      if (this.field_C[var3] == null) {
                        break L25;
                      } else {
                        if (null == this.field_C[var3].field_Z) {
                          break L25;
                        } else {
                          if (-1 > (this.field_C[var3].field_P ^ -1)) {
                            this.field_q = this.field_C[var3];
                            sj.field_b = 32 * (-this.field_q.field_H + this.field_q.field_F);
                            eg.field_p = this.field_q.field_E;
                            lg.field_c = (this.field_q.field_H + this.field_q.field_F) * 16 - this.field_q.field_E * 48;
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                      }
                    }
                    L26: {
                      if (-8 < (this.field_B ^ -1)) {
                        break L26;
                      } else {
                        if (this.field_B < 10) {
                          this.field_B = this.field_B + 1;
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                    }
                    this.a(-1);
                    this.field_m = false;
                    ok.field_i = true;
                    this.field_L = 0;
                    break L19;
                  }
                } else {
                  if (this.field_q == this.field_C[var4]) {
                    var3 = var4;
                    var4++;
                    continue L21;
                  } else {
                    var4++;
                    continue L21;
                  }
                }
              }
            }
          }
        }
        L27: {
          if (!this.field_J) {
            break L27;
          } else {
            if (param1 != ef.field_h) {
              break L27;
            } else {
              L28: {
                if (!ha.field_o) {
                  break L28;
                } else {
                  if ((this.field_B ^ -1) > -10) {
                    break L27;
                  } else {
                    break L28;
                  }
                }
              }
              lg.field_c = 16 * (this.field_q.field_F - -this.field_q.field_H) + -(this.field_q.field_E * 48);
              sj.field_b = 32 * (this.field_q.field_F - this.field_q.field_H);
              eg.field_p = this.field_q.field_E;
              break L27;
            }
          }
        }
        if (param0 == -106) {
          L29: {
            L30: {
              if (!this.field_J) {
                break L30;
              } else {
                if (param1 == 80) {
                  var3 = 0;
                  var4 = 0;
                  L31: while (true) {
                    if (0 != var4) {
                      break L30;
                    } else {
                      if (110 <= var3) {
                        break L30;
                      } else {
                        L32: {
                          this.field_s = this.field_s + 1;
                          var3++;
                          if ((this.field_s ^ -1) <= -101) {
                            this.field_s = 0;
                            break L32;
                          } else {
                            break L32;
                          }
                        }
                        if (this.field_C[this.field_s] == null) {
                          continue L31;
                        } else {
                          if (this.field_C[this.field_s].field_C != 1) {
                            break L29;
                          } else {
                            if (mm.field_e < 2) {
                              break L29;
                            } else {
                              this.a(true);
                              this.a(this.field_G, (byte) -67);
                              break L29;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L30;
                }
              }
            }
            L33: {
              if (!this.field_J) {
                break L33;
              } else {
                if (param1 != fl.field_b) {
                  break L33;
                } else {
                  L34: {
                    if (!ha.field_o) {
                      break L34;
                    } else {
                      if (-4 == (this.field_B ^ -1)) {
                        break L34;
                      } else {
                        if (this.field_B >= 5) {
                          break L34;
                        } else {
                          break L33;
                        }
                      }
                    }
                  }
                  L35: {
                    this.b((byte) -3);
                    if (3 == this.field_B) {
                      this.field_B = 4;
                      break L35;
                    } else {
                      break L35;
                    }
                  }
                  L36: {
                    if (!this.field_m) {
                      this.field_L = 1 + -this.field_L;
                      break L36;
                    } else {
                      this.field_m = false;
                      break L36;
                    }
                  }
                  if (5 == this.field_B) {
                    this.field_B = 6;
                    break L33;
                  } else {
                    break L33;
                  }
                }
              }
            }
            L37: {
              if (!this.field_J) {
                break L37;
              } else {
                if (-53 != (param1 ^ -1)) {
                  break L37;
                } else {
                  L38: {
                    if (!ha.field_o) {
                      break L38;
                    } else {
                      if (14 <= this.field_B) {
                        break L38;
                      } else {
                        break L37;
                      }
                    }
                  }
                  this.b((byte) -3);
                  if (null == this.field_q.field_b) {
                    break L37;
                  } else {
                    if (this.field_m) {
                      this.field_m = false;
                      this.field_L = 0;
                      break L37;
                    } else {
                      this.field_L = 1;
                      this.field_m = true;
                      break L37;
                    }
                  }
                }
              }
            }
            L39: {
              if (!this.field_J) {
                break L39;
              } else {
                if (-68 != (param1 ^ -1)) {
                  break L39;
                } else {
                  if (ha.field_o) {
                    break L39;
                  } else {
                    if (this.field_q.field_jb <= 0) {
                      break L39;
                    } else {
                      L40: {
                        this.b((byte) -3);
                        var3 = this.field_q.field_U;
                        this.field_q.a(true, uf.field_c, vf.field_a);
                        if (this.field_q.field_U != var3) {
                          this.field_q.field_jb = this.field_q.field_jb - 1;
                          this.field_q.field_ab = 0;
                          break L40;
                        } else {
                          break L40;
                        }
                      }
                      ok.field_i = true;
                      break L39;
                    }
                  }
                }
              }
            }
            L41: {
              if (!this.field_J) {
                break L41;
              } else {
                if (-43 != (param1 ^ -1)) {
                  break L41;
                } else {
                  if (g.field_tb) {
                    break L41;
                  } else {
                    L42: {
                      if (!ha.field_o) {
                        break L42;
                      } else {
                        if (this.field_B < 12) {
                          break L41;
                        } else {
                          break L42;
                        }
                      }
                    }
                    L43: {
                      this.b((byte) -3);
                      eg.field_p = eg.field_p - 1;
                      if ((this.field_B ^ -1) != -13) {
                        break L43;
                      } else {
                        this.field_B = 13;
                        break L43;
                      }
                    }
                    if (eg.field_p >= 0) {
                      break L41;
                    } else {
                      eg.field_p = 0;
                      break L41;
                    }
                  }
                }
              }
            }
            if (this.field_J) {
              if (55 == param1) {
                if (mm.field_e < 2) {
                  break L29;
                } else {
                  this.a(true);
                  this.a(this.field_G, (byte) -67);
                  break L29;
                }
              } else {
                if (55 != param1) {
                  break L29;
                } else {
                  if (mm.field_e < 2) {
                    break L29;
                  } else {
                    this.a(true);
                    this.a(this.field_G, (byte) -67);
                    break L29;
                  }
                }
              }
            } else {
              if (55 != param1) {
                break L29;
              } else {
                if (mm.field_e < 2) {
                  break L29;
                } else {
                  this.a(true);
                  this.a(this.field_G, (byte) -67);
                  break L29;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void b(int param0) {
        field_o = null;
        if (param0 != 20) {
            e.b(-97);
        }
        field_g = null;
        field_l = null;
        field_t = null;
        field_p = null;
    }

    private final void a(int param0, Terraphoenix param1, boolean param2) {
        int incrementValue$0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_85_0 = 0;
        int stackIn_88_1 = 0;
        int stackIn_98_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_122_1 = 0;
        int stackIn_126_0 = 0;
        int stackIn_136_0 = 0;
        int stackIn_154_0 = 0;
        Object stackIn_158_0 = null;
        int stackIn_238_0 = 0;
        Object stackIn_241_0;
        dk stackIn_241_1;
        int stackIn_241_2;
        int stackIn_241_3;
        int stackIn_241_4;
        int stackIn_241_5;
        Object stackIn_242_0 = null;
        dk stackIn_242_1 = null;
        int stackIn_242_2 = 0;
        int stackIn_242_3 = 0;
        int stackIn_242_4 = 0;
        int stackIn_242_5 = 0;
        int stackIn_242_6 = 0;
        int stackIn_252_0 = 0;
        int stackIn_255_1 = 0;
        int stackIn_296_0 = 0;
        Object stackIn_359_0 = null;
        StringBuilder stackIn_359_1 = null;
        Object stackIn_360_0 = null;
        StringBuilder stackIn_360_1 = null;
        String stackIn_360_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        Object var4 = null;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        dl var9_ref_dl = null;
        int var10 = 0;
        Object var11 = null;
        int var11_int = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Terraphoenix var17 = null;
        Object var18 = null;
        r var18_ref = null;
        dl var19 = null;
        var16 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var4 = null;
              if (param0 == 22341) {
                break L1;
              } else {
                var17 = (Terraphoenix) null;
                this.a(95, (Terraphoenix) null, false);
                break L1;
              }
            }
            var6 = 0;
            L2: while (true) {
              L3: {
                if (var6 >= this.field_C.length) {
                  break L3;
                } else {
                  L4: {
                    if (null == this.field_C[var6]) {
                      break L4;
                    } else {
                      if (this.field_C[var6].field_Z != null) {
                        break L4;
                      } else {
                        L5: {
                          if (-1 != (param1.field_Bb ^ -1)) {
                            break L5;
                          } else {
                            if (this.field_C[var6].field_k) {
                              break L5;
                            } else {
                              if (this.field_C[var6].field_h) {
                                break L5;
                              } else {
                                if (-17 >= (this.field_B ^ -1)) {
                                  break L5;
                                } else {
                                  if ((fa.field_a ^ -1) < -1) {
                                    break L5;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                            }
                          }
                        }
                        if (this.field_C[var6].field_P <= 0) {
                          break L4;
                        } else {
                          if (!this.field_C[var6].field_Y) {
                            var4 = this.field_C[var6];
                            var18 = var4;
                            var5 = var18;
                            var18 = var4;
                            var5 = var18;
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  var6++;
                  continue L2;
                }
              }
              L6: {
                var5 = null;
                if (var4 != null) {
                  L7: {
                    if (this.field_D == var4) {
                      break L7;
                    } else {
                      var6 = 0;
                      L8: while (true) {
                        if (-51 >= (var6 ^ -1)) {
                          break L7;
                        } else {
                          if (this.field_F[var6] == null) {
                            var6++;
                            continue L8;
                          } else {
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                  L9: {
                    ((r) (var4)).field_f = false;
                    this.field_D = (r) (var4);
                    var6 = 0;
                    var7 = 20000;
                    if (null == ((r) (var4)).field_a) {
                      break L9;
                    } else {
                      if (0 >= ((r) (var4)).field_a.field_P) {
                        ((r) (var4)).field_a = null;
                        ((r) (var4)).field_w = 0;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var8 = 0;
                  L10: while (true) {
                    if (var8 >= this.field_C.length) {
                      L11: {
                        if (null == ((r) (var4)).field_a) {
                          break L11;
                        } else {
                          if (-1 <= (((r) (var4)).field_a.field_P ^ -1)) {
                            break L11;
                          } else {
                            if (!((r) (var4)).field_a.field_k) {
                              break L11;
                            } else {
                              L12: {
                                var8 = ((r) (var4)).field_a.field_F - ((r) (var4)).field_F;
                                var9 = ((r) (var4)).field_a.field_H - ((r) (var4)).field_H;
                                var10 = var9 * var9 + var8 * var8;
                                var18_ref = ((r) (var4)).field_a;
                                var5 = var18_ref;
                                if (!this.field_h.a((byte) -93, (r) (var4), var18_ref)) {
                                  stackIn_154_0 = 0;
                                  break L12;
                                } else {
                                  stackIn_154_0 = 1;
                                  break L12;
                                }
                              }
                              var6 = stackIn_154_0;
                              var7 = var10;
                              break L11;
                            }
                          }
                        }
                      }
                      L13: {
                        if (var6 == 0) {
                          stackIn_158_0 = var4;
                          ((r) ((Object) stackIn_158_0)).field_a = null;
                          break L13;
                        } else {
                          ((r) (var4)).field_a = (r) (var5);
                          break L13;
                        }
                      }
                      L14: {
                        var7 = (int)Math.sqrt((double)var7);
                        if (0 == ((r) (var4)).field_w) {
                          L15: {
                            L16: {
                              var8 = od.field_c[((r) (var4)).field_nb.field_g].field_m;
                              if (0 == var8) {
                                break L16;
                              } else {
                                if (1 != var8) {
                                  break L15;
                                } else {
                                  if (10.0 <= Math.random() * 100.0) {
                                    break L15;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                            }
                            if (-2 == (((r) (var4)).field_B ^ -1)) {
                              ((r) (var4)).field_B = 0;
                              ((r) (var4)).field_jb = ((r) (var4)).field_jb * 3 / 2;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          L17: {
                            if (var8 != 4) {
                              break L17;
                            } else {
                              if (((r) (var4)).field_B != 1) {
                                break L17;
                              } else {
                                if (((r) (var4)).field_mb <= ((r) (var4)).field_P) {
                                  break L17;
                                } else {
                                  ((r) (var4)).field_jb = ((r) (var4)).field_jb * 3 / 2;
                                  ((r) (var4)).field_B = 0;
                                  break L17;
                                }
                              }
                            }
                          }
                          if (var5 == null) {
                            ((r) (var4)).field_w = 1;
                            var6 = 0;
                            break L14;
                          } else {
                            if (var6 == 0) {
                              ((r) (var4)).field_w = 2;
                              break L14;
                            } else {
                              L18: {
                                ((r) (var4)).field_w = 3;
                                if (1 != var8) {
                                  break L18;
                                } else {
                                  ((r) (var4)).field_w = 4;
                                  if (((r) (var4)).field_ab != 0) {
                                    break L18;
                                  } else {
                                    if ((double)var7 <= Math.random() * 10.0 + 10.0) {
                                      break L18;
                                    } else {
                                      ((r) (var4)).field_w = 3;
                                      break L18;
                                    }
                                  }
                                }
                              }
                              L19: {
                                if ((var8 ^ -1) == -3) {
                                  ((r) (var4)).field_w = 4;
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              L20: {
                                if (3 == var8) {
                                  ((r) (var4)).field_w = 5;
                                  break L20;
                                } else {
                                  break L20;
                                }
                              }
                              if (-3 >= (((r) (var4)).field_z ^ -1)) {
                                ((r) (var4)).field_w = 5;
                                break L14;
                              } else {
                                break L14;
                              }
                            }
                          }
                        } else {
                          break L14;
                        }
                      }
                      L21: {
                        var8 = ((r) (var4)).field_w;
                        if (-1 == (var8 ^ -1)) {
                          ((r) (var4)).field_Y = true;
                          break L21;
                        } else {
                          if ((var8 ^ -1) == -2) {
                            break L21;
                          } else {
                            L22: {
                              if (2 != var8) {
                                if ((var8 ^ -1) != -4) {
                                  if (-5 == (var8 ^ -1)) {
                                    if (((r) (var4)).field_jb <= ((r) (var4)).c(false)) {
                                      if (!param2) {
                                        if (((r) (var4)).field_t == 7) {
                                          ((r) (var4)).field_Y = true;
                                          decompiledRegionSelector0 = 5;
                                          break L0;
                                        } else {
                                          this.a(false, (r) (var4));
                                          break L6;
                                        }
                                      } else {
                                        break L6;
                                      }
                                    } else {
                                      L23: {
                                        if (var5 == null) {
                                          break L23;
                                        } else {
                                          if (((r) (var5)).field_P > 0) {
                                            ((r) (var4)).field_n = ((r) (var5)).field_H;
                                            ((r) (var4)).field_X = ((r) (var5)).field_F;
                                            ((r) (var4)).field_S = true;
                                            ((r) (var4)).field_A = 0;
                                            ((r) (var4)).field_d = 2;
                                            ((r) (var4)).field_N = ((r) (var5)).field_E;
                                            if (-9 >= (this.a((byte) -60, (r) (var5), (r) (var4)) ^ -1)) {
                                              break L6;
                                            } else {
                                              if (null == ((r) (var4)).field_b) {
                                                break L6;
                                              } else {
                                                ((r) (var4)).field_d = 4;
                                                break L6;
                                              }
                                            }
                                          } else {
                                            break L23;
                                          }
                                        }
                                      }
                                      ((r) (var4)).field_w = 0;
                                      break L6;
                                    }
                                  } else {
                                    if (-6 == (var8 ^ -1)) {
                                      L24: {
                                        if (var6 == 0) {
                                          break L24;
                                        } else {
                                          L25: {
                                            if (((r) (var4)).field_jb >= ((r) (var4)).c(false)) {
                                              break L25;
                                            } else {
                                              if (-1 > (((r) (var4)).field_ab ^ -1)) {
                                                break L25;
                                              } else {
                                                if (((r) (var4)).field_jb > 10) {
                                                  break L25;
                                                } else {
                                                  break L24;
                                                }
                                              }
                                            }
                                          }
                                          L26: {
                                            if (((r) (var4)).field_jb >= ((r) (var4)).c(false)) {
                                              break L26;
                                            } else {
                                              if ((((r) (var4)).field_jb ^ -1) < -11) {
                                                break L26;
                                              } else {
                                                if (!param2) {
                                                  if (-8 != (((r) (var4)).field_t ^ -1)) {
                                                    this.a(false, (r) (var4));
                                                    break L6;
                                                  } else {
                                                    ((r) (var4)).field_Y = true;
                                                    decompiledRegionSelector0 = 7;
                                                    break L0;
                                                  }
                                                } else {
                                                  break L6;
                                                }
                                              }
                                            }
                                          }
                                          if (var5 != null) {
                                            ((r) (var4)).field_d = 2;
                                            ((r) (var4)).field_S = true;
                                            ((r) (var4)).field_A = 0;
                                            ((r) (var4)).field_N = ((r) (var5)).field_E;
                                            ((r) (var4)).field_X = ((r) (var5)).field_F;
                                            ((r) (var4)).field_n = ((r) (var5)).field_H;
                                            if ((this.a((byte) -60, (r) (var5), (r) (var4)) ^ -1) <= -9) {
                                              break L6;
                                            } else {
                                              if (((r) (var4)).field_b != null) {
                                                ((r) (var4)).field_d = 4;
                                                break L6;
                                              } else {
                                                break L6;
                                              }
                                            }
                                          } else {
                                            ((r) (var4)).field_w = 0;
                                            break L6;
                                          }
                                        }
                                      }
                                      if (!param2) {
                                        if (7 != ((r) (var4)).field_t) {
                                          this.a(false, (r) (var4));
                                          break L6;
                                        } else {
                                          ((r) (var4)).field_Y = true;
                                          decompiledRegionSelector0 = 6;
                                          break L0;
                                        }
                                      } else {
                                        break L6;
                                      }
                                    } else {
                                      break L6;
                                    }
                                  }
                                } else {
                                  break L22;
                                }
                              } else {
                                break L22;
                              }
                            }
                            if (-8 == (((r) (var4)).field_t ^ -1)) {
                              ((r) (var4)).field_Y = true;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            } else {
                              L27: {
                                if (-4 != (((r) (var4)).field_w ^ -1)) {
                                  break L27;
                                } else {
                                  break L27;
                                }
                              }
                              if (var5 != null) {
                                L28: {
                                  if (!param2) {
                                    ((r) (var4)).field_A = 0;
                                    ((r) (var4)).field_d = ((r) (var4)).field_B;
                                    ((r) (var4)).field_S = true;
                                    var8 = 0;
                                    var9 = 0;
                                    L29: while (true) {
                                      var8 = 1;
                                      var10 = 0;
                                      var11 = null;
                                      L30: while (true) {
                                        L31: {
                                          ((r) (var4)).field_X = ((r) (var5)).field_F - -(int)(9.0 * Math.random() - 4.0);
                                          ((r) (var4)).field_n = ((r) (var5)).field_H + (int)(9.0 * Math.random() - 4.0);
                                          ((r) (var4)).field_N = ((r) (var5)).field_E;
                                          var19 = ((r) (var4)).field_c.field_s.a(-82, ((r) (var4)).field_n, ((r) (var4)).field_N, ((r) (var4)).field_X);
                                          incrementValue$0 = var10;
                                          var10++;
                                          if ((incrementValue$0 ^ -1) <= -6) {
                                            break L31;
                                          } else {
                                            if (var19 == null) {
                                              continue L30;
                                            } else {
                                              if (!var19.field_z) {
                                                continue L30;
                                              } else {
                                                break L31;
                                              }
                                            }
                                          }
                                        }
                                        L32: {
                                          if (!((r) (var5)).field_k) {
                                            ((r) (var4)).field_X = ((r) (var5)).field_i - -(int)(-4.0 + Math.random() * 9.0);
                                            ((r) (var4)).field_n = ((r) (var5)).field_gb - -(int)(9.0 * Math.random() - 4.0);
                                            ((r) (var4)).field_N = ((r) (var5)).field_R;
                                            break L32;
                                          } else {
                                            break L32;
                                          }
                                        }
                                        L33: {
                                          ((r) (var4)).field_c.field_h = null;
                                          ((r) (var4)).field_r = null;
                                          if (((r) (var4)).field_C != 0) {
                                            this.field_h.b((byte) 75);
                                            ((r) (var4)).field_r = this.field_h.a(((r) (var4)).field_n, ((r) (var4)).field_N, ((r) (var4)).field_X, ((r) (var4)).field_E, ((r) (var4)).field_H, ((r) (var4)).field_F, true);
                                            if (null != ((r) (var4)).field_r) {
                                              break L33;
                                            } else {
                                              var8 = 0;
                                              break L33;
                                            }
                                          } else {
                                            ((r) (var4)).field_r = this.field_h.a(((r) (var4)).field_n, ((r) (var4)).field_H, ((r) (var4)).field_F, ((r) (var4)).field_N, false, ((r) (var4)).field_X, ((r) (var4)).field_E, true);
                                            if (((r) (var4)).field_r == null) {
                                              var8 = 0;
                                              break L33;
                                            } else {
                                              break L33;
                                            }
                                          }
                                        }
                                        L34: {
                                          ((r) (var4)).field_c.field_h = (r) (var4);
                                          var9++;
                                          if (var9 > 25) {
                                            L35: {
                                              ((r) (var4)).field_w = 1;
                                              var8 = 1;
                                              if (od.field_c[((r) (var4)).field_nb.field_g].field_m <= 1) {
                                                break L35;
                                              } else {
                                                ((r) (var4)).field_Y = true;
                                                break L35;
                                              }
                                            }
                                            ((r) (var4)).field_X = ((r) (var4)).field_F;
                                            ((r) (var4)).field_S = false;
                                            ((r) (var4)).field_n = ((r) (var4)).field_H;
                                            break L34;
                                          } else {
                                            break L34;
                                          }
                                        }
                                        L36: {
                                          if (var8 != 0) {
                                            stackIn_296_0 = 0;
                                            break L36;
                                          } else {
                                            stackIn_296_0 = 1;
                                            break L36;
                                          }
                                        }
                                        if (stackIn_296_0 == 1) {
                                          continue L29;
                                        } else {
                                          if (2 != ((r) (var4)).field_w) {
                                            break L28;
                                          } else {
                                            if (var6 == 0) {
                                              break L28;
                                            } else {
                                              ((r) (var4)).field_S = false;
                                              ((r) (var4)).field_w = 0;
                                              ((r) (var4)).field_X = ((r) (var4)).field_F;
                                              ((r) (var4)).field_n = ((r) (var4)).field_H;
                                              break L28;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L28;
                                  }
                                }
                                L37: {
                                  var8 = (int)(10.0 * Math.random() + 10.0);
                                  if (((r) (var4)).field_t != 9) {
                                    break L37;
                                  } else {
                                    ((r) (var4)).field_ab = 0;
                                    var8 = 2;
                                    break L37;
                                  }
                                }
                                if (3 != ((r) (var4)).field_w) {
                                  break L6;
                                } else {
                                  L38: {
                                    if (var8 > var7) {
                                      break L38;
                                    } else {
                                      if (((r) (var4)).field_ab <= 0) {
                                        break L6;
                                      } else {
                                        break L38;
                                      }
                                    }
                                  }
                                  if (var6 == 0) {
                                    break L6;
                                  } else {
                                    L39: {
                                      if (((r) (var4)).field_jb >= ((r) (var4)).c(false)) {
                                        break L39;
                                      } else {
                                        if ((((r) (var4)).field_jb ^ -1) >= -11) {
                                          break L6;
                                        } else {
                                          break L39;
                                        }
                                      }
                                    }
                                    if (var5 == null) {
                                      ((r) (var4)).field_w = 0;
                                      break L6;
                                    } else {
                                      ((r) (var4)).field_N = ((r) (var5)).field_E;
                                      ((r) (var4)).field_n = ((r) (var5)).field_H;
                                      ((r) (var4)).field_A = 0;
                                      ((r) (var4)).field_d = 2;
                                      ((r) (var4)).field_S = true;
                                      ((r) (var4)).field_X = ((r) (var5)).field_F;
                                      if (-9 >= (this.a((byte) -60, (r) (var5), (r) (var4)) ^ -1)) {
                                        break L6;
                                      } else {
                                        if (null == ((r) (var4)).field_b) {
                                          break L6;
                                        } else {
                                          ((r) (var4)).field_d = 4;
                                          break L6;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                ((r) (var4)).field_w = 0;
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      if (7 == ((r) (var4)).field_t) {
                        ((r) (var4)).field_Y = true;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        if (param2) {
                          break L6;
                        } else {
                          L40: {
                            if (var6 == 0) {
                              break L40;
                            } else {
                              if (var5 == null) {
                                break L40;
                              } else {
                                if (-1 <= (((r) (var5)).field_P ^ -1)) {
                                  break L40;
                                } else {
                                  L41: {
                                    if (var6 != 0) {
                                      break L41;
                                    } else {
                                      L42: {
                                        if (var5 == null) {
                                          break L42;
                                        } else {
                                          if ((((r) (var5)).field_P ^ -1) >= -1) {
                                            break L42;
                                          } else {
                                            break L41;
                                          }
                                        }
                                      }
                                      ((r) (var4)).field_Y = true;
                                      break L6;
                                    }
                                  }
                                  ((r) (var4)).field_w = 4;
                                  break L6;
                                }
                              }
                            }
                          }
                          L43: {
                            L44: {
                              L45: {
                                if ((Math.abs(((r) (var4)).field_X - ((r) (var4)).field_F) ^ -1) <= -3) {
                                  break L45;
                                } else {
                                  if (Math.abs(-((r) (var4)).field_H + ((r) (var4)).field_n) < 2) {
                                    break L44;
                                  } else {
                                    break L45;
                                  }
                                }
                              }
                              if (null == this.field_h.a(false, ((r) (var4)).field_X, ((r) (var4)).field_E, ((r) (var4)).field_F, ((r) (var4)).field_n, ((r) (var4)).field_H, 86)) {
                                break L44;
                              } else {
                                ((r) (var4)).field_A = 0;
                                ((r) (var4)).field_d = ((r) (var4)).field_B;
                                ((r) (var4)).field_S = true;
                                break L43;
                              }
                            }
                            ((r) (var4)).field_A = 0;
                            ((r) (var4)).field_S = true;
                            ((r) (var4)).field_d = ((r) (var4)).field_B;
                            var8 = 0;
                            var10 = 0;
                            L46: while (true) {
                              L47: {
                                ((r) (var4)).field_X = 4 + (int)(Math.random() * (double)(this.field_h.field_b - 8));
                                ((r) (var4)).field_n = 4 + (int)(Math.random() * (double)(-8 + this.field_h.field_e));
                                ((r) (var4)).field_N = ((r) (var4)).field_E;
                                if (((r) (var4)).field_z != 2) {
                                  break L47;
                                } else {
                                  ((r) (var4)).field_N = 1;
                                  break L47;
                                }
                              }
                              L48: {
                                if (-4 == (((r) (var4)).field_z ^ -1)) {
                                  ((r) (var4)).field_N = 2;
                                  break L48;
                                } else {
                                  break L48;
                                }
                              }
                              L49: {
                                if (4 == ((r) (var4)).field_z) {
                                  ((r) (var4)).field_N = 4;
                                  break L49;
                                } else {
                                  break L49;
                                }
                              }
                              L50: {
                                var9_ref_dl = this.field_h.a(-115, ((r) (var4)).field_n, ((r) (var4)).field_E, ((r) (var4)).field_X);
                                ((r) (var4)).field_c.field_h = null;
                                if (null == var9_ref_dl) {
                                  break L50;
                                } else {
                                  L51: {
                                    if (((r) (var4)).field_X != ((r) (var4)).field_F) {
                                      break L51;
                                    } else {
                                      if (((r) (var4)).field_n != ((r) (var4)).field_H) {
                                        break L51;
                                      } else {
                                        break L50;
                                      }
                                    }
                                  }
                                  var8 = 1;
                                  if (0 != ((r) (var4)).field_z) {
                                    break L50;
                                  } else {
                                    if (var9_ref_dl.field_d) {
                                      var8 = 0;
                                      break L50;
                                    } else {
                                      break L50;
                                    }
                                  }
                                }
                              }
                              L52: {
                                if (var8 != 0) {
                                  stackIn_238_0 = 0;
                                  break L52;
                                } else {
                                  stackIn_238_0 = 1;
                                  break L52;
                                }
                              }
                              L53: {
                                if (stackIn_238_0 != 0) {
                                  break L53;
                                } else {
                                  L54: {
                                    stackIn_241_0 = null;

                                    stackIn_241_1 = this.field_h;

                                    stackIn_241_2 = ((r) (var4)).field_n;

                                    stackIn_241_3 = ((r) (var4)).field_H;

                                    stackIn_241_4 = ((r) (var4)).field_F;

                                    stackIn_241_5 = ((r) (var4)).field_N;

                                    if (((r) (var4)).field_C <= 0) {
                                      stackIn_242_0 = stackIn_241_0;
                                      stackIn_242_1 = (dk) ((Object) stackIn_241_1);
                                      stackIn_242_2 = stackIn_241_2;
                                      stackIn_242_3 = stackIn_241_3;
                                      stackIn_242_4 = stackIn_241_4;
                                      stackIn_242_5 = stackIn_241_5;
                                      stackIn_242_6 = 0;
                                      break L54;
                                    } else {
                                      stackIn_242_0 = stackIn_241_0;
                                      stackIn_242_1 = (dk) ((Object) stackIn_241_1);
                                      stackIn_242_2 = stackIn_241_2;
                                      stackIn_242_3 = stackIn_241_3;
                                      stackIn_242_4 = stackIn_241_4;
                                      stackIn_242_5 = stackIn_241_5;
                                      stackIn_242_6 = 1;
                                      break L54;
                                    }
                                  }
                                  if (stackIn_242_0 == ((dk) (Object) stackIn_242_1).a(stackIn_242_2, stackIn_242_3, stackIn_242_4, stackIn_242_5, stackIn_242_6 != 0, ((r) (var4)).field_X, ((r) (var4)).field_E, true)) {
                                    var8 = 0;
                                    break L53;
                                  } else {
                                    break L53;
                                  }
                                }
                              }
                              L55: {
                                ((r) (var4)).field_c.field_h = (r) (var4);
                                var10++;
                                if (25 >= var10) {
                                  break L55;
                                } else {
                                  var8 = 1;
                                  ((r) (var4)).field_Y = true;
                                  ((r) (var4)).field_S = false;
                                  break L55;
                                }
                              }
                              if (0 == var8) {
                                continue L46;
                              } else {
                                L56: {
                                  if (null == var9_ref_dl) {
                                    break L56;
                                  } else {
                                    L57: {
                                      if (var9_ref_dl.field_d) {
                                        stackIn_252_0 = 0;
                                        break L57;
                                      } else {
                                        stackIn_252_0 = 1;
                                        break L57;
                                      }
                                    }
                                    L58: {


                                      if (((r) (var4)).field_c.field_d) {

                                        stackIn_255_1 = 0;
                                        break L58;
                                      } else {

                                        stackIn_255_1 = 1;
                                        break L58;
                                      }
                                    }
                                    if (stackIn_252_0 != stackIn_255_1) {
                                      ((r) (var4)).field_Y = true;
                                      ((r) (var4)).field_S = false;
                                      break L56;
                                    } else {
                                      break L56;
                                    }
                                  }
                                }
                                ((r) (var4)).field_r = null;
                                ((r) (var4)).field_w = 0;
                                break L43;
                              }
                            }
                          }
                          if ((double)((r) (var4)).field_jb >= (double)((r) (var4)).field_v * Math.random()) {
                            break L6;
                          } else {
                            L59: {
                              if (!param2) {
                                this.a(false, (r) (var4));
                                break L59;
                              } else {
                                break L59;
                              }
                            }
                            ((r) (var4)).field_Y = true;
                            break L6;
                          }
                        }
                      }
                    } else {
                      if (this.field_C[var8] != null) {
                        if ((this.field_C[var8].field_P ^ -1) < -1) {
                          if (((r) (var4)).field_C != this.field_C[var8].field_C) {
                            L60: {
                              L61: {
                                if (this.field_C[var8].field_k) {
                                  break L61;
                                } else {
                                  if (this.field_C[var8].field_h) {
                                    break L61;
                                  } else {
                                    break L60;
                                  }
                                }
                              }
                              L62: {
                                var9 = 1;
                                var10 = this.field_C[var8].field_F;
                                var11_int = this.field_C[var8].field_H;
                                if (!this.field_C[var8].field_k) {
                                  var10 = this.field_C[var8].field_i;
                                  var11_int = this.field_C[var8].field_gb;
                                  break L62;
                                } else {
                                  break L62;
                                }
                              }
                              L63: {
                                ((r) (var4)).a(true, var10, var11_int);
                                var12 = this.field_h.a((byte) -93, (r) (var4), this.field_C[var8]) ? 1 : 0;
                                var13 = -((r) (var4)).field_F + var10;
                                var14 = -((r) (var4)).field_H + var11_int;
                                var15 = var13 * var13 + var14 * var14;
                                if (var5 == null) {
                                  L64: {
                                    if (var12 != 0) {
                                      break L64;
                                    } else {
                                      if (this.field_C[var8].field_E < ((r) (var4)).field_E) {
                                        var9 = 0;
                                        break L64;
                                      } else {
                                        break L64;
                                      }
                                    }
                                  }
                                  L65: {
                                    if (var12 != 0) {
                                      break L65;
                                    } else {
                                      if (((r) (var4)).field_z != 1) {
                                        break L65;
                                      } else {
                                        L66: {
                                          if (this.field_C[var8].field_c.field_d) {
                                            stackIn_119_0 = 0;
                                            break L66;
                                          } else {
                                            stackIn_119_0 = 1;
                                            break L66;
                                          }
                                        }
                                        L67: {


                                          if (((r) (var4)).field_c.field_d) {

                                            stackIn_122_1 = 0;
                                            break L67;
                                          } else {

                                            stackIn_122_1 = 1;
                                            break L67;
                                          }
                                        }
                                        if (stackIn_119_0 == stackIn_122_1) {
                                          break L65;
                                        } else {
                                          L68: {
                                            if (this.field_A) {
                                              stackIn_126_0 = 0;
                                              break L68;
                                            } else {
                                              stackIn_126_0 = 1;
                                              break L68;
                                            }
                                          }
                                          if (stackIn_126_0 == 1) {
                                            var9 = 0;
                                            break L65;
                                          } else {
                                            break L65;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L69: {
                                    if (var12 != 0) {
                                      break L69;
                                    } else {
                                      if (2 != ((r) (var4)).field_z) {
                                        break L69;
                                      } else {
                                        if (((r) (var4)).field_E <= this.field_C[var8].field_E) {
                                          break L69;
                                        } else {
                                          if (this.field_C[var8].field_c.field_d == ((r) (var4)).field_c.field_d) {
                                            break L69;
                                          } else {
                                            L70: {
                                              if (this.field_A) {
                                                stackIn_136_0 = 0;
                                                break L70;
                                              } else {
                                                stackIn_136_0 = 1;
                                                break L70;
                                              }
                                            }
                                            L71: {
                                              if (stackIn_136_0 != 0) {
                                                break L71;
                                              } else {
                                                if (param1.field_Bb == 6) {
                                                  break L69;
                                                } else {
                                                  break L71;
                                                }
                                              }
                                            }
                                            var9 = 0;
                                            break L69;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (var12 != 0) {
                                    break L63;
                                  } else {
                                    if (-4 < (((r) (var4)).field_z ^ -1)) {
                                      break L63;
                                    } else {
                                      if (((r) (var4)).field_E <= this.field_C[var8].field_E) {
                                        break L63;
                                      } else {
                                        var9 = 0;
                                        break L63;
                                      }
                                    }
                                  }
                                } else {
                                  L72: {
                                    L73: {
                                      if (var12 != 0) {
                                        break L73;
                                      } else {
                                        if (var6 == 0) {
                                          break L72;
                                        } else {
                                          break L73;
                                        }
                                      }
                                    }
                                    if (var12 != 0) {
                                      break L72;
                                    } else {
                                      if (var12 == 0) {
                                        var9 = 0;
                                        break L63;
                                      } else {
                                        if (var9 != 0) {
                                          var6 = var12;
                                          var5 = this.field_C[var8];
                                          var7 = var15;
                                          var8++;
                                          continue L10;
                                        } else {
                                          var8++;
                                          continue L10;
                                        }
                                      }
                                    }
                                  }
                                  L74: {
                                    if (7 == param1.field_Bb) {
                                      break L74;
                                    } else {
                                      L75: {
                                        stackIn_64_0 = 0;

                                        if (param1.field_db) {
                                          stackIn_65_0 = stackIn_64_0;
                                          stackIn_65_1 = 0;
                                          break L75;
                                        } else {
                                          stackIn_65_0 = stackIn_64_0;
                                          stackIn_65_1 = 1;
                                          break L75;
                                        }
                                      }
                                      if (stackIn_65_0 != stackIn_65_1) {
                                        L76: {
                                          if (((r) (var5)).field_E != ((r) (var4)).field_E) {
                                            break L76;
                                          } else {
                                            if (this.field_C[var8].field_E == ((r) (var4)).field_E) {
                                              break L76;
                                            } else {
                                              if (var12 == 0) {
                                                var9 = 0;
                                                break L76;
                                              } else {
                                                break L76;
                                              }
                                            }
                                          }
                                        }
                                        L77: {
                                          if (((r) (var4)).field_E >= ((r) (var5)).field_E) {
                                            break L77;
                                          } else {
                                            if (((r) (var4)).field_E <= this.field_C[var8].field_E) {
                                              break L77;
                                            } else {
                                              if (var12 != 0) {
                                                break L77;
                                              } else {
                                                var9 = 0;
                                                break L77;
                                              }
                                            }
                                          }
                                        }
                                        if (var12 != 0) {
                                          break L74;
                                        } else {
                                          if (this.field_C[var8].field_E < ((r) (var4)).field_E) {
                                            var9 = 0;
                                            break L74;
                                          } else {
                                            break L74;
                                          }
                                        }
                                      } else {
                                        break L74;
                                      }
                                    }
                                  }
                                  L78: {
                                    if (var12 != 0) {
                                      break L78;
                                    } else {
                                      if ((((r) (var4)).field_z ^ -1) != -2) {
                                        break L78;
                                      } else {
                                        L79: {
                                          if (((r) (var4)).field_c.field_d) {
                                            stackIn_85_0 = 0;
                                            break L79;
                                          } else {
                                            stackIn_85_0 = 1;
                                            break L79;
                                          }
                                        }
                                        L80: {


                                          if (this.field_C[var8].field_c.field_d) {

                                            stackIn_88_1 = 0;
                                            break L80;
                                          } else {

                                            stackIn_88_1 = 1;
                                            break L80;
                                          }
                                        }
                                        if (stackIn_85_0 == stackIn_88_1) {
                                          break L78;
                                        } else {
                                          if (!this.field_A) {
                                            var9 = 0;
                                            break L78;
                                          } else {
                                            break L78;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L81: {
                                    if (var12 != 0) {
                                      break L81;
                                    } else {
                                      if (((r) (var4)).field_z != 2) {
                                        break L81;
                                      } else {
                                        if (this.field_C[var8].field_E >= ((r) (var4)).field_E) {
                                          break L81;
                                        } else {
                                          L82: {
                                            if (((r) (var4)).field_c.field_d) {
                                              stackIn_98_0 = 0;
                                              break L82;
                                            } else {
                                              stackIn_98_0 = 1;
                                              break L82;
                                            }
                                          }
                                          if (stackIn_98_0 != (this.field_C[var8].field_c.field_d ? 1 : 0)) {
                                            break L81;
                                          } else {
                                            L83: {
                                              if (!this.field_A) {
                                                break L83;
                                              } else {
                                                if ((param1.field_Bb ^ -1) == -7) {
                                                  break L81;
                                                } else {
                                                  break L83;
                                                }
                                              }
                                            }
                                            var9 = 0;
                                            break L81;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L84: {
                                    if (var12 != 0) {
                                      break L84;
                                    } else {
                                      if (3 > ((r) (var4)).field_z) {
                                        break L84;
                                      } else {
                                        if (this.field_C[var8].field_E < ((r) (var4)).field_E) {
                                          var9 = 0;
                                          break L84;
                                        } else {
                                          break L84;
                                        }
                                      }
                                    }
                                  }
                                  if (var7 >= var15) {
                                    break L63;
                                  } else {
                                    var9 = 0;
                                    break L63;
                                  }
                                }
                              }
                              if (var9 != 0) {
                                var6 = var12;
                                var5 = this.field_C[var8];
                                var7 = var15;
                                break L60;
                              } else {
                                var8++;
                                continue L10;
                              }
                            }
                            var8++;
                            continue L10;
                          } else {
                            var8++;
                            continue L10;
                          }
                        } else {
                          var8++;
                          continue L10;
                        }
                      } else {
                        var8++;
                        continue L10;
                      }
                    }
                  }
                } else {
                  var6 = 0;
                  L85: while (true) {
                    if (var6 >= 50) {
                      this.a(param1, (byte) 99);
                      break L6;
                    } else {
                      if (null == this.field_F[var6]) {
                        var6++;
                        continue L85;
                      } else {
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L86: {
            var4 = decompiledCaughtException;
            stackIn_359_0 = var4;

            stackIn_359_1 = new StringBuilder().append("e.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_360_0 = stackIn_359_0;
              stackIn_360_1 = (StringBuilder) ((Object) stackIn_359_1);
              stackIn_360_2 = "null";
              break L86;
            } else {
              stackIn_360_0 = stackIn_359_0;
              stackIn_360_1 = (StringBuilder) ((Object) stackIn_359_1);
              stackIn_360_2 = "{...}";
              break L86;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_360_0), stackIn_360_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void a(gi param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        Terraphoenix var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (param1 == -51) {
                break L1;
              } else {
                var5 = (Terraphoenix) null;
                this.a((Terraphoenix) null, false);
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              if (-51 >= (var3_int ^ -1)) {
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (this.field_F[var3_int] == null) {
                  this.field_F[var3_int] = param0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3_int++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("e.J(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0) {
        int var2;
        int var3;
        var3 = Terraphoenix.field_V;
        if (param0 == -1) {
          var2 = 0;
          L0: while (true) {
            if (this.field_C.length <= var2) {
              return;
            } else {
              if (this.field_C[var2] != null) {
                if (null == this.field_C[var2].field_Z) {
                  if (-1 > (this.field_C[var2].field_P ^ -1)) {
                    if (this.field_h.a((byte) -93, this.field_q, this.field_C[var2])) {
                      this.field_C[var2].field_ib = true;
                      var2++;
                      continue L0;
                    } else {
                      this.field_C[var2].field_ib = false;
                      var2++;
                      continue L0;
                    }
                  } else {
                    var2++;
                    continue L0;
                  }
                } else {
                  var2++;
                  continue L0;
                }
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, ci param3, boolean param4, int param5) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int incrementValue$24 = 0;
        int incrementValue$25 = 0;
        int incrementValue$26 = 0;
        int incrementValue$27 = 0;
        int incrementValue$28 = 0;
        int incrementValue$29 = 0;
        RuntimeException stackIn_132_0 = null;
        StringBuilder stackIn_132_1 = null;
        RuntimeException stackIn_133_0 = null;
        StringBuilder stackIn_133_1 = null;
        String stackIn_133_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        var20 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (param5 == 28144) {
                break L1;
              } else {
                this.a(42, 90);
                break L1;
              }
            }
            L2: {
              if (param4) {
                L3: {
                  var7_int = -16 + (param3.field_u + param2 * 144);
                  if (60 != param3.field_u) {
                    break L3;
                  } else {
                    var7_int = param2 * 144 + (param3.field_u + -12);
                    break L3;
                  }
                }
                L4: {
                  var8 = param0;
                  var8 = var8 + param3.field_p;
                  var9 = param1;
                  var9 = var9 + param3.field_v;
                  var10 = 0;
                  var11 = param3.field_p + param0;
                  var12 = param3.field_v + param1;
                  var13 = param3.field_t;
                  var14 = param3.field_r;
                  var15 = 0;
                  if (var9 >= l.field_d) {
                    break L4;
                  } else {
                    var16 = l.field_d + -var9;
                    var9 = l.field_d;
                    var10 = var10 + var16 * var14;
                    var12 = var12 + var16;
                    var13 = var13 - var16;
                    break L4;
                  }
                }
                L5: {
                  if (l.field_b <= var8) {
                    break L5;
                  } else {
                    var16 = -var8 + l.field_b;
                    var8 = l.field_b;
                    var10 = var10 + var16;
                    var15 = var15 + var16;
                    var11 = var11 + var16;
                    var14 = var14 - var16;
                    break L5;
                  }
                }
                L6: {
                  if (var13 + var9 <= l.field_c) {
                    break L6;
                  } else {
                    var13 = var13 - (-l.field_c + var9 - -var13);
                    break L6;
                  }
                }
                L7: {
                  if (var14 + var8 <= l.field_f) {
                    break L7;
                  } else {
                    var16 = var8 - -var14 + -l.field_f;
                    var14 = var14 - var16;
                    var15 = var15 + var16;
                    break L7;
                  }
                }
                L8: {
                  if (-1 <= (var14 ^ -1)) {
                    break L8;
                  } else {
                    if (var13 <= 0) {
                      break L8;
                    } else {
                      L9: {
                        var17 = var11;
                        var18 = var12;
                        if (-113 == (param3.field_u ^ -1)) {
                          break L9;
                        } else {
                          if (param3.field_u != 60) {
                            if (param0 != var17) {
                              var19 = -(var14 >> 1336811746);
                              var14 = -(3 & var14);
                              var9 = -var13;
                              L10: while (true) {
                                if (-1 >= (var9 ^ -1)) {
                                  break L2;
                                } else {
                                  var8 = var19;
                                  L11: while (true) {
                                    if (-1 >= (var8 ^ -1)) {
                                      var8 = var14;
                                      L12: while (true) {
                                        if (var8 >= 0) {
                                          var18++;
                                          var10 = var10 + var15;
                                          var17 = var11;
                                          var9++;
                                          continue L10;
                                        } else {
                                          L13: {
                                            incrementValue$0 = var10;
                                            var10++;
                                            var16 = param3.field_z[incrementValue$0];
                                            if (var16 != 0) {
                                              incrementValue$1 = var17;
                                              var17++;
                                              gd.field_a[incrementValue$1][var18] = -((param0 + -var17 + 64) / 2) + param1 + var7_int;
                                              break L13;
                                            } else {
                                              var17++;
                                              break L13;
                                            }
                                          }
                                          var8++;
                                          continue L12;
                                        }
                                      }
                                    } else {
                                      L14: {
                                        incrementValue$2 = var10;
                                        var10++;
                                        var16 = param3.field_z[incrementValue$2];
                                        if (var16 == 0) {
                                          var17++;
                                          break L14;
                                        } else {
                                          incrementValue$3 = var17;
                                          var17++;
                                          gd.field_a[incrementValue$3][var18] = param1 + (var7_int + -((64 + (-var17 - -param0)) / 2));
                                          break L14;
                                        }
                                      }
                                      L15: {
                                        incrementValue$4 = var10;
                                        var10++;
                                        var16 = param3.field_z[incrementValue$4];
                                        if (-1 == (var16 ^ -1)) {
                                          var17++;
                                          break L15;
                                        } else {
                                          incrementValue$5 = var17;
                                          var17++;
                                          gd.field_a[incrementValue$5][var18] = -((64 + -var17 - -param0) / 2) + var7_int + param1;
                                          break L15;
                                        }
                                      }
                                      L16: {
                                        incrementValue$6 = var10;
                                        var10++;
                                        var16 = param3.field_z[incrementValue$6];
                                        if (var16 != 0) {
                                          incrementValue$7 = var17;
                                          var17++;
                                          gd.field_a[incrementValue$7][var18] = param1 + var7_int - (param0 + -var17 - -64) / 2;
                                          break L16;
                                        } else {
                                          var17++;
                                          break L16;
                                        }
                                      }
                                      L17: {
                                        incrementValue$8 = var10;
                                        var10++;
                                        var16 = param3.field_z[incrementValue$8];
                                        if (-1 == (var16 ^ -1)) {
                                          var17++;
                                          break L17;
                                        } else {
                                          incrementValue$9 = var17;
                                          var17++;
                                          gd.field_a[incrementValue$9][var18] = -((64 + -var17 + param0) / 2) + (var7_int + param1);
                                          break L17;
                                        }
                                      }
                                      var8++;
                                      continue L11;
                                    }
                                  }
                                }
                              }
                            } else {
                              var19 = -(var14 >> -732073726);
                              var14 = -(3 & var14);
                              var9 = -var13;
                              L18: while (true) {
                                if (-1 >= (var9 ^ -1)) {
                                  break L2;
                                } else {
                                  var8 = var19;
                                  L19: while (true) {
                                    if (-1 >= (var8 ^ -1)) {
                                      var8 = var14;
                                      L20: while (true) {
                                        if (0 <= var8) {
                                          var17 = var11;
                                          var18++;
                                          var10 = var10 + var15;
                                          var9++;
                                          continue L18;
                                        } else {
                                          L21: {
                                            incrementValue$10 = var10;
                                            var10++;
                                            var16 = param3.field_z[incrementValue$10];
                                            if (-1 == (var16 ^ -1)) {
                                              break L21;
                                            } else {
                                              gd.field_a[var17][var18] = -((-param0 + var17) / 2) + var7_int + param1;
                                              break L21;
                                            }
                                          }
                                          var17++;
                                          var8++;
                                          continue L20;
                                        }
                                      }
                                    } else {
                                      L22: {
                                        incrementValue$11 = var10;
                                        var10++;
                                        var16 = param3.field_z[incrementValue$11];
                                        if (-1 != (var16 ^ -1)) {
                                          gd.field_a[var17][var18] = var7_int + param1 + -((var17 - param0) / 2);
                                          break L22;
                                        } else {
                                          break L22;
                                        }
                                      }
                                      L23: {
                                        var17++;
                                        incrementValue$12 = var10;
                                        var10++;
                                        var16 = param3.field_z[incrementValue$12];
                                        if (-1 != (var16 ^ -1)) {
                                          gd.field_a[var17][var18] = param1 + var7_int + -((var17 - param0) / 2);
                                          break L23;
                                        } else {
                                          break L23;
                                        }
                                      }
                                      L24: {
                                        var17++;
                                        incrementValue$13 = var10;
                                        var10++;
                                        var16 = param3.field_z[incrementValue$13];
                                        if (0 == var16) {
                                          break L24;
                                        } else {
                                          gd.field_a[var17][var18] = var7_int + (param1 - (-param0 + var17) / 2);
                                          break L24;
                                        }
                                      }
                                      L25: {
                                        var17++;
                                        incrementValue$14 = var10;
                                        var10++;
                                        var16 = param3.field_z[incrementValue$14];
                                        if (var16 != 0) {
                                          gd.field_a[var17][var18] = var7_int + param1 + -((-param0 + var17) / 2);
                                          break L25;
                                        } else {
                                          break L25;
                                        }
                                      }
                                      var17++;
                                      var8++;
                                      continue L19;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            break L9;
                          }
                        }
                      }
                      var19 = -(var14 >> 2094240962);
                      var14 = -(var14 & 3);
                      var9 = -var13;
                      L26: while (true) {
                        if (var9 >= 0) {
                          break L2;
                        } else {
                          var8 = var19;
                          L27: while (true) {
                            if (0 <= var8) {
                              var8 = var14;
                              L28: while (true) {
                                if (var8 >= 0) {
                                  var17 = var11;
                                  var10 = var10 + var15;
                                  var18++;
                                  var9++;
                                  continue L26;
                                } else {
                                  L29: {
                                    incrementValue$15 = var10;
                                    var10++;
                                    var16 = param3.field_z[incrementValue$15];
                                    if (0 == var16) {
                                      break L29;
                                    } else {
                                      gd.field_a[var17][var18] = Math.abs(-param0 + var17 + -param3.field_q) / 2 + (var7_int + param1);
                                      break L29;
                                    }
                                  }
                                  var17++;
                                  var8++;
                                  continue L28;
                                }
                              }
                            } else {
                              L30: {
                                incrementValue$16 = var10;
                                var10++;
                                var16 = param3.field_z[incrementValue$16];
                                if ((var16 ^ -1) == -1) {
                                  break L30;
                                } else {
                                  gd.field_a[var17][var18] = Math.abs(var17 - param0 + -param3.field_q) / 2 + var7_int + param1;
                                  break L30;
                                }
                              }
                              L31: {
                                var17++;
                                incrementValue$17 = var10;
                                var10++;
                                var16 = param3.field_z[incrementValue$17];
                                if (var16 != 0) {
                                  gd.field_a[var17][var18] = Math.abs(-param3.field_q + (var17 + -param0)) / 2 + (var7_int + param1);
                                  break L31;
                                } else {
                                  break L31;
                                }
                              }
                              L32: {
                                incrementValue$18 = var10;
                                var10++;
                                var16 = param3.field_z[incrementValue$18];
                                var17++;
                                if (var16 != 0) {
                                  gd.field_a[var17][var18] = param1 - -var7_int + Math.abs(var17 - (param0 - -param3.field_q)) / 2;
                                  break L32;
                                } else {
                                  break L32;
                                }
                              }
                              L33: {
                                incrementValue$19 = var10;
                                var10++;
                                var16 = param3.field_z[incrementValue$19];
                                var17++;
                                if (var16 != 0) {
                                  gd.field_a[var17][var18] = Math.abs(-param0 + (var17 + -param3.field_q)) / 2 + param1 + var7_int;
                                  break L33;
                                } else {
                                  break L33;
                                }
                              }
                              var17++;
                              var8++;
                              continue L27;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L34: {
                  var7_int = param0;
                  var8 = param1;
                  var7_int = var7_int + param3.field_p;
                  var8 = var8 + param3.field_v;
                  var9 = 0;
                  var10 = param0 - -param3.field_p;
                  var11 = param3.field_v + param1;
                  var12 = param3.field_t;
                  var13 = param3.field_r;
                  var14 = 0;
                  if (l.field_d <= var8) {
                    break L34;
                  } else {
                    var15 = l.field_d + -var8;
                    var11 = var11 + var15;
                    var8 = l.field_d;
                    var9 = var9 + var13 * var15;
                    var12 = var12 - var15;
                    break L34;
                  }
                }
                L35: {
                  if (var8 + var12 > l.field_c) {
                    var12 = var12 - (var12 + (var8 - l.field_c));
                    break L35;
                  } else {
                    break L35;
                  }
                }
                L36: {
                  if (l.field_b > var7_int) {
                    var15 = l.field_b + -var7_int;
                    var7_int = l.field_b;
                    var13 = var13 - var15;
                    var14 = var14 + var15;
                    var10 = var10 + var15;
                    var9 = var9 + var15;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (var7_int - -var13 > l.field_f) {
                    var15 = -l.field_f + (var7_int + var13);
                    var14 = var14 + var15;
                    var13 = var13 - var15;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                L38: {
                  if (0 >= var13) {
                    break L38;
                  } else {
                    if ((var12 ^ -1) < -1) {
                      var16 = var10;
                      var17 = var11;
                      var18 = -(var13 >> -1702500478);
                      var13 = -(var13 & 3);
                      var8 = -var12;
                      L39: while (true) {
                        if ((var8 ^ -1) <= -1) {
                          break L2;
                        } else {
                          var7_int = var18;
                          L40: while (true) {
                            if (var7_int >= 0) {
                              var7_int = var13;
                              L41: while (true) {
                                if ((var7_int ^ -1) <= -1) {
                                  var16 = var10;
                                  var9 = var9 + var14;
                                  var17++;
                                  var8++;
                                  continue L39;
                                } else {
                                  L42: {
                                    incrementValue$20 = var9;
                                    var9++;
                                    var15 = param3.field_z[incrementValue$20];
                                    if (0 != var15) {
                                      incrementValue$21 = var16;
                                      var16++;
                                      gd.field_a[incrementValue$21][var17] = var17 - -(param2 * 144);
                                      break L42;
                                    } else {
                                      var16++;
                                      break L42;
                                    }
                                  }
                                  var7_int++;
                                  continue L41;
                                }
                              }
                            } else {
                              L43: {
                                incrementValue$22 = var9;
                                var9++;
                                var15 = param3.field_z[incrementValue$22];
                                if ((var15 ^ -1) == -1) {
                                  var16++;
                                  break L43;
                                } else {
                                  incrementValue$23 = var16;
                                  var16++;
                                  gd.field_a[incrementValue$23][var17] = param2 * 144 + var17;
                                  break L43;
                                }
                              }
                              L44: {
                                incrementValue$24 = var9;
                                var9++;
                                var15 = param3.field_z[incrementValue$24];
                                if (var15 == 0) {
                                  var16++;
                                  break L44;
                                } else {
                                  incrementValue$25 = var16;
                                  var16++;
                                  gd.field_a[incrementValue$25][var17] = param2 * 144 + var17;
                                  break L44;
                                }
                              }
                              L45: {
                                incrementValue$26 = var9;
                                var9++;
                                var15 = param3.field_z[incrementValue$26];
                                if (-1 == (var15 ^ -1)) {
                                  var16++;
                                  break L45;
                                } else {
                                  incrementValue$27 = var16;
                                  var16++;
                                  gd.field_a[incrementValue$27][var17] = 144 * param2 + var17;
                                  break L45;
                                }
                              }
                              L46: {
                                incrementValue$28 = var9;
                                var9++;
                                var15 = param3.field_z[incrementValue$28];
                                if (0 != var15) {
                                  incrementValue$29 = var16;
                                  var16++;
                                  gd.field_a[incrementValue$29][var17] = 144 * param2 + var17;
                                  break L46;
                                } else {
                                  var16++;
                                  break L46;
                                }
                              }
                              var7_int++;
                              continue L40;
                            }
                          }
                        }
                      }
                    } else {
                      break L38;
                    }
                  }
                }
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L47: {
            var7 = decompiledCaughtException;
            stackIn_132_0 = (RuntimeException) (var7);

            stackIn_132_1 = new StringBuilder().append("e.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_133_0 = (RuntimeException) ((Object) stackIn_132_0);
              stackIn_133_1 = (StringBuilder) ((Object) stackIn_132_1);
              stackIn_133_2 = "null";
              break L47;
            } else {
              stackIn_133_0 = (RuntimeException) ((Object) stackIn_132_0);
              stackIn_133_1 = (StringBuilder) ((Object) stackIn_132_1);
              stackIn_133_2 = "{...}";
              break L47;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_133_0), stackIn_133_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void a(int param0, Terraphoenix param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int dupTemp$3 = 0;
        r dupTemp$4 = null;
        int dupTemp$5 = 0;
        int dupTemp$6 = 0;
        int dupTemp$7 = 0;
        ga dupTemp$8 = null;
        ga dupTemp$9 = null;
        ga dupTemp$10 = null;
        ga dupTemp$11 = null;
        ga dupTemp$12 = null;
        ga dupTemp$13 = null;
        ga dupTemp$14 = null;
        ga dupTemp$15 = null;
        ga dupTemp$16 = null;
        ga dupTemp$17 = null;
        ga dupTemp$18 = null;
        hk stackIn_84_0 = null;
        hk stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        hk stackIn_92_0 = null;
        hk stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        hk stackIn_168_0 = null;
        hk stackIn_169_0 = null;
        int stackIn_169_1 = 0;
        hk stackIn_184_0 = null;
        hk stackIn_185_0 = null;
        int stackIn_185_1 = 0;
        hk stackIn_192_0 = null;
        hk stackIn_193_0 = null;
        int stackIn_193_1 = 0;
        RuntimeException stackIn_380_0 = null;
        StringBuilder stackIn_380_1 = null;
        RuntimeException stackIn_381_0 = null;
        StringBuilder stackIn_381_1 = null;
        String stackIn_381_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        oh var11_ref_oh = null;
        int var11 = 0;
        int var12 = 0;
        var12 = Terraphoenix.field_V;
        try {
          L0: {
            ja.field_i = 7;
            rk.field_c = 32;
            wb.field_g = 20;
            hh.field_m.a();
            l.a();
            k.field_f.a(0);
            var4 = -88 % ((-66 - param0) / 59);
            var3_int = 0;
            var5 = 0;
            var6 = 0;
            L1: while (true) {
              if (this.field_C.length <= var6) {
                var6 = 0;
                L2: while (true) {
                  if (var6 >= param1.field_nb.length) {
                    L3: {
                      L4: {
                        if (var3_int <= 0) {
                          break L4;
                        } else {
                          if (var5 != 0) {
                            break L4;
                          } else {
                            if (!this.field_r) {
                              L5: {
                                if (param1.field_db) {
                                  break L5;
                                } else {
                                  L6: {
                                    if ((param1.field_Bb ^ -1) != -3) {
                                      break L6;
                                    } else {
                                      mh.a((byte) 117, 9, 246);
                                      break L6;
                                    }
                                  }
                                  L7: {
                                    if (param1.field_Bb == 6) {
                                      mh.a((byte) 123, 10, 245);
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                  L8: {
                                    if (-11 != (param1.field_Bb ^ -1)) {
                                      break L8;
                                    } else {
                                      mh.a((byte) 113, 11, 244);
                                      break L8;
                                    }
                                  }
                                  if ((param1.field_Bb ^ -1) != -14) {
                                    break L5;
                                  } else {
                                    L9: {
                                      mh.a((byte) 127, 12, 243);
                                      if (param1.field_fb) {
                                        mh.a((byte) 119, 13, 242);
                                        break L9;
                                      } else {
                                        break L9;
                                      }
                                    }
                                    L10: {
                                      if (!param1.field_ob) {
                                        break L10;
                                      } else {
                                        if ((fa.field_a ^ -1) != -2) {
                                          break L10;
                                        } else {
                                          mh.a((byte) 117, 14, 241);
                                          break L10;
                                        }
                                      }
                                    }
                                    if ((fa.field_a ^ -1) != -3) {
                                      break L5;
                                    } else {
                                      mh.a((byte) 121, 15, 240);
                                      break L5;
                                    }
                                  }
                                }
                              }
                              L11: {
                                if (!param1.field_db) {
                                  break L11;
                                } else {
                                  param1.field_M = param1.field_M + 1;
                                  param1.field_Fb = param1.field_Fb + 1;
                                  qc.field_c = qc.field_c + 1;
                                  if (mb.b(0, -64)) {
                                    mh.a((byte) 120, 16, 239);
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              L12: {
                                this.field_f = 1;
                                this.field_i = 6;
                                if (13 == param1.field_Bb) {
                                  this.field_i = 4;
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              L13: {
                                if ((param1.field_Bb ^ -1) == -2) {
                                  this.field_e.field_i = 1;
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              L14: {
                                if (2 != param1.field_Bb) {
                                  break L14;
                                } else {
                                  this.field_e.field_i = 2;
                                  break L14;
                                }
                              }
                              L15: {
                                if (3 != param1.field_Bb) {
                                  break L15;
                                } else {
                                  L16: {
                                    stackIn_168_0 = this.field_e;

                                    if (-2 == (param1.field_ub ^ -1)) {
                                      stackIn_169_0 = (hk) ((Object) stackIn_168_0);
                                      stackIn_169_1 = 3;
                                      break L16;
                                    } else {
                                      stackIn_169_0 = (hk) ((Object) stackIn_168_0);
                                      stackIn_169_1 = 4;
                                      break L16;
                                    }
                                  }
                                  stackIn_169_0.field_i = stackIn_169_1;
                                  break L15;
                                }
                              }
                              L17: {
                                if (4 == param1.field_Bb) {
                                  this.field_e.field_i = 5;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              L18: {
                                if (5 == param1.field_Bb) {
                                  this.field_e.field_i = 2;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              L19: {
                                if (6 != param1.field_Bb) {
                                  break L19;
                                } else {
                                  this.field_e.field_i = 6;
                                  break L19;
                                }
                              }
                              L20: {
                                if (param1.field_Bb == 7) {
                                  this.field_e.field_i = 2;
                                  break L20;
                                } else {
                                  break L20;
                                }
                              }
                              L21: {
                                if ((param1.field_Bb ^ -1) != -9) {
                                  break L21;
                                } else {
                                  L22: {
                                    stackIn_184_0 = this.field_e;

                                    if (1 != param1.field_vb) {
                                      stackIn_185_0 = (hk) ((Object) stackIn_184_0);
                                      stackIn_185_1 = 8;
                                      break L22;
                                    } else {
                                      stackIn_185_0 = (hk) ((Object) stackIn_184_0);
                                      stackIn_185_1 = 7;
                                      break L22;
                                    }
                                  }
                                  stackIn_185_0.field_i = stackIn_185_1;
                                  break L21;
                                }
                              }
                              L23: {
                                if (9 == param1.field_Bb) {
                                  this.field_e.field_i = 2;
                                  break L23;
                                } else {
                                  break L23;
                                }
                              }
                              L24: {
                                if (10 != param1.field_Bb) {
                                  break L24;
                                } else {
                                  L25: {
                                    stackIn_192_0 = this.field_e;

                                    if (param1.field_vb == 1) {
                                      stackIn_193_0 = (hk) ((Object) stackIn_192_0);
                                      stackIn_193_1 = 8;
                                      break L25;
                                    } else {
                                      stackIn_193_0 = (hk) ((Object) stackIn_192_0);
                                      stackIn_193_1 = 7;
                                      break L25;
                                    }
                                  }
                                  stackIn_193_0.field_i = stackIn_193_1;
                                  break L24;
                                }
                              }
                              L26: {
                                if ((param1.field_Bb ^ -1) != -12) {
                                  break L26;
                                } else {
                                  this.field_e.field_i = 9;
                                  break L26;
                                }
                              }
                              L27: {
                                if (param1.field_Bb != 12) {
                                  break L27;
                                } else {
                                  this.field_e.field_i = 10;
                                  break L27;
                                }
                              }
                              L28: {
                                if (-14 != (param1.field_Bb ^ -1)) {
                                  break L28;
                                } else {
                                  this.field_e.field_i = 11;
                                  break L28;
                                }
                              }
                              L29: {
                                if (!param1.field_db) {
                                  break L29;
                                } else {
                                  this.field_e.field_i = 12;
                                  break L29;
                                }
                              }
                              var6 = 0;
                              L30: while (true) {
                                if (this.field_C.length <= var6) {
                                  break L3;
                                } else {
                                  L31: {
                                    if (null != this.field_C[var6]) {
                                      if (this.field_C[var6].field_Z == null) {
                                        L32: {
                                          if (this.field_C[var6].field_t == 0) {
                                            this.field_e.field_g = this.field_e.field_g + 1;
                                            break L32;
                                          } else {
                                            break L32;
                                          }
                                        }
                                        L33: {
                                          if (-2 == (this.field_C[var6].field_t ^ -1)) {
                                            this.field_e.field_j = this.field_e.field_j + 1;
                                            break L33;
                                          } else {
                                            break L33;
                                          }
                                        }
                                        L34: {
                                          if (2 == this.field_C[var6].field_t) {
                                            this.field_e.field_j = this.field_e.field_j + 1;
                                            break L34;
                                          } else {
                                            break L34;
                                          }
                                        }
                                        L35: {
                                          if (this.field_C[var6].field_t != 3) {
                                            break L35;
                                          } else {
                                            this.field_e.field_j = this.field_e.field_j + 1;
                                            this.field_e.field_l.field_a[17] = this.field_e.field_l.field_a[17] + 1;
                                            break L35;
                                          }
                                        }
                                        L36: {
                                          if (-5 != (this.field_C[var6].field_t ^ -1)) {
                                            break L36;
                                          } else {
                                            this.field_e.field_b = this.field_e.field_b + 1;
                                            break L36;
                                          }
                                        }
                                        L37: {
                                          if ((this.field_C[var6].field_t ^ -1) != -6) {
                                            break L37;
                                          } else {
                                            this.field_e.field_j = this.field_e.field_j + 1;
                                            break L37;
                                          }
                                        }
                                        L38: {
                                          if (6 == this.field_C[var6].field_t) {
                                            this.field_e.field_j = this.field_e.field_j + 1;
                                            break L38;
                                          } else {
                                            break L38;
                                          }
                                        }
                                        L39: {
                                          if ((this.field_C[var6].field_t ^ -1) == -10) {
                                            this.field_e.field_m = this.field_e.field_m + 1;
                                            break L39;
                                          } else {
                                            break L39;
                                          }
                                        }
                                        L40: {
                                          if (this.field_C[var6].field_nb == null) {
                                            break L40;
                                          } else {
                                            if (19 <= this.field_C[var6].field_nb.field_g) {
                                              break L40;
                                            } else {
                                              dupTemp$0 = this.field_C[var6].field_nb.field_g;
                                              this.field_e.field_l.field_a[dupTemp$0] = this.field_e.field_l.field_a[dupTemp$0] + 1;
                                              break L40;
                                            }
                                          }
                                        }
                                        if (null != this.field_C[var6].field_b) {
                                          dupTemp$1 = this.field_C[var6].field_b.field_g;
                                          this.field_e.field_l.field_a[dupTemp$1] = this.field_e.field_l.field_a[dupTemp$1] + this.field_C[var6].field_b.field_d;
                                          break L31;
                                        } else {
                                          break L31;
                                        }
                                      } else {
                                        if (param1.field_Bb != 12) {
                                          L41: {
                                            if (this.field_C[var6].field_Z.field_b == null) {
                                              break L41;
                                            } else {
                                              this.field_C[var6].field_Z.field_b = this.field_C[var6].field_Z.field_b.a(this.field_e.field_l, param1.field_I, 8);
                                              break L41;
                                            }
                                          }
                                          if (this.field_C[var6].field_Z.field_A != null) {
                                            this.field_C[var6].field_Z.field_A = this.field_C[var6].field_Z.field_A.a(this.field_e.field_l, param1.field_I, 8);
                                            break L31;
                                          } else {
                                            var6++;
                                            continue L30;
                                          }
                                        } else {
                                          break L31;
                                        }
                                      }
                                    } else {
                                      break L31;
                                    }
                                  }
                                  var6++;
                                  continue L30;
                                }
                              }
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      this.field_f = 2;
                      if (!this.field_r) {
                        L42: {
                          this.field_i = 5;
                          if (-2 == (param1.field_Bb ^ -1)) {
                            this.field_e.field_i = -2;
                            break L42;
                          } else {
                            break L42;
                          }
                        }
                        L43: {
                          if ((param1.field_Bb ^ -1) == -3) {
                            this.field_e.field_i = -2;
                            break L43;
                          } else {
                            break L43;
                          }
                        }
                        L44: {
                          if ((param1.field_Bb ^ -1) == -4) {
                            this.field_e.field_i = -2;
                            break L44;
                          } else {
                            break L44;
                          }
                        }
                        L45: {
                          if (-5 == (param1.field_Bb ^ -1)) {
                            this.field_e.field_i = -1;
                            break L45;
                          } else {
                            break L45;
                          }
                        }
                        L46: {
                          if (-6 != (param1.field_Bb ^ -1)) {
                            break L46;
                          } else {
                            this.field_e.field_i = -2;
                            break L46;
                          }
                        }
                        L47: {
                          if ((param1.field_Bb ^ -1) != -7) {
                            break L47;
                          } else {
                            this.field_e.field_i = -1;
                            break L47;
                          }
                        }
                        L48: {
                          if ((param1.field_Bb ^ -1) == -8) {
                            this.field_e.field_i = -2;
                            break L48;
                          } else {
                            break L48;
                          }
                        }
                        L49: {
                          if (-9 == (param1.field_Bb ^ -1)) {
                            L50: {
                              stackIn_84_0 = this.field_e;

                              if (-2 != (param1.field_vb ^ -1)) {
                                stackIn_85_0 = (hk) ((Object) stackIn_84_0);
                                stackIn_85_1 = -1;
                                break L50;
                              } else {
                                stackIn_85_0 = (hk) ((Object) stackIn_84_0);
                                stackIn_85_1 = -3;
                                break L50;
                              }
                            }
                            stackIn_85_0.field_i = stackIn_85_1;
                            break L49;
                          } else {
                            break L49;
                          }
                        }
                        L51: {
                          if (9 != param1.field_Bb) {
                            break L51;
                          } else {
                            this.field_e.field_i = -2;
                            break L51;
                          }
                        }
                        L52: {
                          if (10 == param1.field_Bb) {
                            L53: {
                              stackIn_92_0 = this.field_e;

                              if (param1.field_vb != 1) {
                                stackIn_93_0 = (hk) ((Object) stackIn_92_0);
                                stackIn_93_1 = -3;
                                break L53;
                              } else {
                                stackIn_93_0 = (hk) ((Object) stackIn_92_0);
                                stackIn_93_1 = -1;
                                break L53;
                              }
                            }
                            stackIn_93_0.field_i = stackIn_93_1;
                            break L52;
                          } else {
                            break L52;
                          }
                        }
                        L54: {
                          if ((param1.field_Bb ^ -1) == -12) {
                            this.field_e.field_i = -4;
                            break L54;
                          } else {
                            break L54;
                          }
                        }
                        L55: {
                          if (12 == param1.field_Bb) {
                            this.field_e.field_i = -3;
                            break L55;
                          } else {
                            break L55;
                          }
                        }
                        L56: {
                          if ((param1.field_Bb ^ -1) != -14) {
                            break L56;
                          } else {
                            this.field_e.field_i = -5;
                            break L56;
                          }
                        }
                        L57: {
                          if (!param1.field_db) {
                            break L57;
                          } else {
                            this.field_e.field_i = -6;
                            break L57;
                          }
                        }
                        var6 = 0;
                        L58: while (true) {
                          if (var6 >= this.field_C.length) {
                            break L3;
                          } else {
                            L59: {
                              if (null != this.field_C[var6]) {
                                if (null != this.field_C[var6].field_Z) {
                                  if (-13 != (param1.field_Bb ^ -1)) {
                                    L60: {
                                      if (this.field_C[var6].field_Z.field_b == null) {
                                        break L60;
                                      } else {
                                        this.field_C[var6].field_Z.field_b = this.field_C[var6].field_Z.field_b.a(this.field_e.field_l, param1.field_I, 8);
                                        break L60;
                                      }
                                    }
                                    if (null == this.field_C[var6].field_Z.field_A) {
                                      break L59;
                                    } else {
                                      this.field_C[var6].field_Z.field_A = this.field_C[var6].field_Z.field_A.a(this.field_e.field_l, param1.field_I, 8);
                                      break L59;
                                    }
                                  } else {
                                    break L59;
                                  }
                                } else {
                                  if (-1 > (this.field_C[var6].field_P ^ -1)) {
                                    break L59;
                                  } else {
                                    L61: {
                                      if (this.field_C[var6].field_t != 0) {
                                        break L61;
                                      } else {
                                        this.field_e.field_g = this.field_e.field_g + 1;
                                        break L61;
                                      }
                                    }
                                    L62: {
                                      if (this.field_C[var6].field_t != 1) {
                                        break L62;
                                      } else {
                                        this.field_e.field_j = this.field_e.field_j + 1;
                                        break L62;
                                      }
                                    }
                                    L63: {
                                      if (-3 != (this.field_C[var6].field_t ^ -1)) {
                                        break L63;
                                      } else {
                                        this.field_e.field_j = this.field_e.field_j + 1;
                                        break L63;
                                      }
                                    }
                                    L64: {
                                      if (this.field_C[var6].field_t == 3) {
                                        this.field_e.field_j = this.field_e.field_j + 1;
                                        this.field_e.field_l.field_a[17] = this.field_e.field_l.field_a[17] + 1;
                                        break L64;
                                      } else {
                                        break L64;
                                      }
                                    }
                                    L65: {
                                      if (this.field_C[var6].field_t == 4) {
                                        this.field_e.field_b = this.field_e.field_b + 1;
                                        break L65;
                                      } else {
                                        break L65;
                                      }
                                    }
                                    L66: {
                                      if ((this.field_C[var6].field_t ^ -1) != -6) {
                                        break L66;
                                      } else {
                                        this.field_e.field_j = this.field_e.field_j + 1;
                                        break L66;
                                      }
                                    }
                                    L67: {
                                      if (6 != this.field_C[var6].field_t) {
                                        break L67;
                                      } else {
                                        this.field_e.field_j = this.field_e.field_j + 1;
                                        break L67;
                                      }
                                    }
                                    if (this.field_C[var6].field_t == 9) {
                                      this.field_e.field_m = this.field_e.field_m + 1;
                                      break L59;
                                    } else {
                                      break L59;
                                    }
                                  }
                                }
                              } else {
                                break L59;
                              }
                            }
                            var6++;
                            continue L58;
                          }
                        }
                      } else {
                        this.field_e.field_i = -1;
                        var6 = 0;
                        L68: while (true) {
                          if (var6 >= this.field_C.length) {
                            this.field_i = 6;
                            break L3;
                          } else {
                            L69: {
                              if (this.field_C[var6] != null) {
                                if (this.field_C[var6].field_Z == null) {
                                  L70: {
                                    if (this.field_C[var6].field_t == 0) {
                                      this.field_e.field_g = this.field_e.field_g + 1;
                                      break L70;
                                    } else {
                                      break L70;
                                    }
                                  }
                                  L71: {
                                    if ((this.field_C[var6].field_t ^ -1) != -2) {
                                      break L71;
                                    } else {
                                      this.field_e.field_j = this.field_e.field_j + 1;
                                      break L71;
                                    }
                                  }
                                  L72: {
                                    if ((this.field_C[var6].field_t ^ -1) != -3) {
                                      break L72;
                                    } else {
                                      this.field_e.field_j = this.field_e.field_j + 1;
                                      break L72;
                                    }
                                  }
                                  L73: {
                                    if (-4 != (this.field_C[var6].field_t ^ -1)) {
                                      break L73;
                                    } else {
                                      this.field_e.field_j = this.field_e.field_j + 1;
                                      this.field_e.field_l.field_a[17] = this.field_e.field_l.field_a[17] + 1;
                                      break L73;
                                    }
                                  }
                                  L74: {
                                    if (4 != this.field_C[var6].field_t) {
                                      break L74;
                                    } else {
                                      this.field_e.field_b = this.field_e.field_b + 1;
                                      break L74;
                                    }
                                  }
                                  L75: {
                                    if ((this.field_C[var6].field_t ^ -1) == -6) {
                                      this.field_e.field_j = this.field_e.field_j + 1;
                                      break L75;
                                    } else {
                                      break L75;
                                    }
                                  }
                                  L76: {
                                    if (6 != this.field_C[var6].field_t) {
                                      break L76;
                                    } else {
                                      this.field_e.field_j = this.field_e.field_j + 1;
                                      break L76;
                                    }
                                  }
                                  L77: {
                                    if (9 == this.field_C[var6].field_t) {
                                      this.field_e.field_m = this.field_e.field_m + 1;
                                      break L77;
                                    } else {
                                      break L77;
                                    }
                                  }
                                  L78: {
                                    if (this.field_C[var6].field_nb != null) {
                                      dupTemp$2 = this.field_C[var6].field_nb.field_g;
                                      this.field_e.field_l.field_a[dupTemp$2] = this.field_e.field_l.field_a[dupTemp$2] + 1;
                                      break L78;
                                    } else {
                                      break L78;
                                    }
                                  }
                                  if (this.field_C[var6].field_b == null) {
                                    break L69;
                                  } else {
                                    dupTemp$3 = this.field_C[var6].field_b.field_g;
                                    this.field_e.field_l.field_a[dupTemp$3] = this.field_e.field_l.field_a[dupTemp$3] + this.field_C[var6].field_b.field_d;
                                    break L69;
                                  }
                                } else {
                                  if (param1.field_Bb == 12) {
                                    break L69;
                                  } else {
                                    L79: {
                                      if (null != this.field_C[var6].field_Z.field_b) {
                                        this.field_C[var6].field_Z.field_b = this.field_C[var6].field_Z.field_b.a(this.field_e.field_l, param1.field_I, 8);
                                        break L79;
                                      } else {
                                        break L79;
                                      }
                                    }
                                    if (this.field_C[var6].field_Z.field_A == null) {
                                      break L69;
                                    } else {
                                      this.field_C[var6].field_Z.field_A = this.field_C[var6].field_Z.field_A.a(this.field_e.field_l, param1.field_I, 8);
                                      break L69;
                                    }
                                  }
                                }
                              } else {
                                break L69;
                              }
                            }
                            var6++;
                            continue L68;
                          }
                        }
                      }
                    }
                    var7 = 0;
                    var8 = 0;
                    var9 = 0;
                    var6 = 0;
                    L80: while (true) {
                      if (var6 >= ak.field_q) {
                        L81: {
                          if ((var8 + 1) * 2 < var7) {
                            var10 = 0;
                            var6 = 0;
                            L82: while (true) {
                              if (var6 >= ak.field_q) {
                                var8++;
                                var7--;
                                this.field_C[var10].field_Z.field_h = 2;
                                break L81;
                              } else {
                                if (this.field_C[var6] != null) {
                                  if (null != this.field_C[var6].field_Z) {
                                    if (this.field_C[var6].field_Z.field_h == 1) {
                                      L83: {
                                        L84: {
                                          if (var10 == 0) {
                                            break L84;
                                          } else {
                                            if (this.field_C[var6].field_Z.field_e > this.field_C[var10].field_Z.field_e) {
                                              break L84;
                                            } else {
                                              break L83;
                                            }
                                          }
                                        }
                                        var10 = var6;
                                        break L83;
                                      }
                                      var6++;
                                      continue L82;
                                    } else {
                                      var6++;
                                      continue L82;
                                    }
                                  } else {
                                    var6++;
                                    continue L82;
                                  }
                                } else {
                                  var6++;
                                  continue L82;
                                }
                              }
                            }
                          } else {
                            break L81;
                          }
                        }
                        L85: {
                          if (var8 <= 2 * var9 - -2) {
                            break L85;
                          } else {
                            if (-1 != (var9 ^ -1)) {
                              break L85;
                            } else {
                              var10 = 0;
                              var6 = 0;
                              L86: while (true) {
                                if (var6 >= ak.field_q) {
                                  this.field_C[var10].field_Z.field_h = 3;
                                  mh.a((byte) 118, 4, 251);
                                  var9++;
                                  var8--;
                                  break L85;
                                } else {
                                  if (null != this.field_C[var6]) {
                                    if (null != this.field_C[var6].field_Z) {
                                      if (this.field_C[var6].field_Z.field_h <= 2) {
                                        L87: {
                                          if (0 == var10) {
                                            break L87;
                                          } else {
                                            if (this.field_C[var6].field_Z.field_e > this.field_C[var10].field_Z.field_e) {
                                              break L87;
                                            } else {
                                              var6++;
                                              continue L86;
                                            }
                                          }
                                        }
                                        var10 = var6;
                                        var6++;
                                        continue L86;
                                      } else {
                                        var6++;
                                        continue L86;
                                      }
                                    } else {
                                      var6++;
                                      continue L86;
                                    }
                                  } else {
                                    var6++;
                                    continue L86;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L88: {
                          if (5 != this.field_i) {
                            L89: {
                              if (param1.field_Y) {
                                mh.a((byte) 125, 5, 250);
                                break L89;
                              } else {
                                break L89;
                              }
                            }
                            L90: {
                              if (param1.field_E) {
                                mh.a((byte) 124, 6, 249);
                                break L90;
                              } else {
                                break L90;
                              }
                            }
                            L91: {
                              if (param1.field_Ab) {
                                mh.a((byte) 112, 7, 248);
                                break L91;
                              } else {
                                break L91;
                              }
                            }
                            if (param1.field_H) {
                              mh.a((byte) 113, 8, 247);
                              break L88;
                            } else {
                              break L88;
                            }
                          } else {
                            break L88;
                          }
                        }
                        cb.a(false, this.field_i);
                        break L0;
                      } else {
                        L92: {
                          if ((var6 ^ -1) <= -13) {
                            break L92;
                          } else {
                            param1.field_nb[var6] = null;
                            break L92;
                          }
                        }
                        L93: {
                          if (this.field_C[var6] == null) {
                            break L93;
                          } else {
                            L94: {
                              if (null == this.field_C[var6].field_Z) {
                                break L94;
                              } else {
                                if (0 < this.field_C[var6].field_P) {
                                  break L94;
                                } else {
                                  if (this.field_C[var6].field_T <= 0) {
                                    break L94;
                                  } else {
                                    L95: {
                                      if (-2 == (this.field_f ^ -1)) {
                                        break L95;
                                      } else {
                                        if (!this.field_r) {
                                          break L94;
                                        } else {
                                          break L95;
                                        }
                                      }
                                    }
                                    dupTemp$4 = this.field_C[var6];
                                    dupTemp$4.field_P = dupTemp$4.field_P + this.field_C[var6].field_T;
                                    this.field_C[var6].field_T = 0;
                                    this.field_e.field_f = this.field_e.field_f + 1;
                                    break L94;
                                  }
                                }
                              }
                            }
                            if ((this.field_C[var6].field_P ^ -1) >= -1) {
                              L96: {
                                if (this.field_C[var6].field_Z != null) {
                                  this.field_e.field_k = this.field_e.field_k + 1;
                                  break L96;
                                } else {
                                  break L96;
                                }
                              }
                              if (-2 == (this.field_f ^ -1)) {
                                L97: {
                                  if (null != this.field_C[var6].field_nb) {
                                    dupTemp$5 = this.field_C[var6].field_nb.field_g;
                                    this.field_e.field_l.field_a[dupTemp$5] = this.field_e.field_l.field_a[dupTemp$5] + 1;
                                    break L97;
                                  } else {
                                    break L97;
                                  }
                                }
                                L98: {
                                  if (null == this.field_C[var6].field_eb) {
                                    break L98;
                                  } else {
                                    dupTemp$6 = this.field_C[var6].field_eb.field_g;
                                    this.field_e.field_l.field_a[dupTemp$6] = this.field_e.field_l.field_a[dupTemp$6] + 1;
                                    break L98;
                                  }
                                }
                                if (null == this.field_C[var6].field_b) {
                                  break L93;
                                } else {
                                  dupTemp$7 = this.field_C[var6].field_b.field_g;
                                  this.field_e.field_l.field_a[dupTemp$7] = this.field_e.field_l.field_a[dupTemp$7] + this.field_C[var6].field_b.field_d;
                                  break L93;
                                }
                              } else {
                                break L93;
                              }
                            } else {
                              if (null != this.field_C[var6].field_Z) {
                                L99: {
                                  param1.field_nb[var6] = this.field_C[var6].field_Z;
                                  param1.field_nb[var6].field_b = this.field_C[var6].field_nb;
                                  param1.field_nb[var6].field_A = this.field_C[var6].field_eb;
                                  if (null != param1.field_nb[var6].field_b) {
                                    L100: {
                                      var10 = param1.field_nb[var6].field_b.field_g;
                                      if (0 == var10) {
                                        break L100;
                                      } else {
                                        if (3 == var10) {
                                          break L100;
                                        } else {
                                          if ((var10 ^ -1) == -9) {
                                            break L100;
                                          } else {
                                            if (-13 != (var10 ^ -1)) {
                                              break L99;
                                            } else {
                                              break L100;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var11_ref_oh = param1.field_nb[var6].field_A;
                                    param1.field_nb[var6].field_A = param1.field_nb[var6].field_b;
                                    param1.field_nb[var6].field_b = var11_ref_oh;
                                    break L99;
                                  } else {
                                    break L99;
                                  }
                                }
                                L101: {
                                  param1.field_nb[var6].field_i = this.field_C[var6].field_b;
                                  if ((this.field_C[var6].field_Z.field_e ^ -1) >= -1) {
                                    break L101;
                                  } else {
                                    if (this.field_C[var6].field_Z.field_h == 0) {
                                      this.field_C[var6].field_Z.field_h = 1;
                                      break L101;
                                    } else {
                                      break L101;
                                    }
                                  }
                                }
                                L102: {
                                  if (-3 != (this.field_C[var6].field_Z.field_h ^ -1)) {
                                    break L102;
                                  } else {
                                    var8++;
                                    break L102;
                                  }
                                }
                                L103: {
                                  if ((this.field_C[var6].field_Z.field_h ^ -1) == -4) {
                                    var9++;
                                    break L103;
                                  } else {
                                    break L103;
                                  }
                                }
                                L104: {
                                  if (-2 == (this.field_C[var6].field_Z.field_h ^ -1)) {
                                    var7++;
                                    break L104;
                                  } else {
                                    break L104;
                                  }
                                }
                                L105: {
                                  this.field_C[var6].field_Z.d((byte) 126);
                                  var10 = -this.field_C[var6].field_Z.field_v + this.field_C[var6].field_Z.field_x;
                                  if (-1 > (var10 ^ -1)) {
                                    L106: {
                                      if (-21 <= (var10 ^ -1)) {
                                        break L106;
                                      } else {
                                        var10 = 20;
                                        break L106;
                                      }
                                    }
                                    dupTemp$8 = this.field_C[var6].field_Z;
                                    dupTemp$8.field_v = (int)((double)dupTemp$8.field_v + (3.0 * Math.random() * (double)var10 / 4.0 + (double)(var10 / 4)));
                                    if (this.field_C[var6].field_Z.field_v > 100) {
                                      this.field_C[var6].field_Z.field_v = 100;
                                      break L105;
                                    } else {
                                      break L105;
                                    }
                                  } else {
                                    break L105;
                                  }
                                }
                                var11 = 0;
                                L107: while (true) {
                                  if (var11 >= this.field_C[var6].field_Z.field_h) {
                                    L108: {
                                      if (0 < this.field_C[var6].field_Z.field_h) {
                                        L109: {
                                          if (33 * this.field_C[var6].field_Z.field_h - -1 <= this.field_C[var6].field_Z.field_t) {
                                            break L109;
                                          } else {
                                            dupTemp$9 = this.field_C[var6].field_Z;
                                            dupTemp$9.field_t = dupTemp$9.field_t + 1;
                                            break L109;
                                          }
                                        }
                                        L110: {
                                          if (33 * this.field_C[var6].field_Z.field_h - -1 <= this.field_C[var6].field_Z.field_w) {
                                            break L110;
                                          } else {
                                            dupTemp$10 = this.field_C[var6].field_Z;
                                            dupTemp$10.field_w = dupTemp$10.field_w + 1;
                                            break L110;
                                          }
                                        }
                                        L111: {
                                          if (33 * this.field_C[var6].field_Z.field_h + 1 <= this.field_C[var6].field_Z.field_v) {
                                            break L111;
                                          } else {
                                            dupTemp$11 = this.field_C[var6].field_Z;
                                            dupTemp$11.field_v = dupTemp$11.field_v + 1;
                                            break L111;
                                          }
                                        }
                                        L112: {
                                          if (this.field_C[var6].field_Z.field_h * 33 - -1 <= this.field_C[var6].field_Z.field_B) {
                                            break L112;
                                          } else {
                                            dupTemp$12 = this.field_C[var6].field_Z;
                                            dupTemp$12.field_B = dupTemp$12.field_B + 1;
                                            break L112;
                                          }
                                        }
                                        if (this.field_C[var6].field_Z.field_h * 33 - -1 <= this.field_C[var6].field_Z.field_q) {
                                          break L108;
                                        } else {
                                          dupTemp$13 = this.field_C[var6].field_Z;
                                          dupTemp$13.field_q = dupTemp$13.field_q + 1;
                                          break L108;
                                        }
                                      } else {
                                        break L108;
                                      }
                                    }
                                    L113: {
                                      if ((this.field_C[var6].field_Z.field_B ^ -1) <= -91) {
                                        mh.a((byte) 121, 0, 255);
                                        break L113;
                                      } else {
                                        break L113;
                                      }
                                    }
                                    if ((this.field_C[var6].field_Z.field_t ^ -1) > -91) {
                                      break L93;
                                    } else {
                                      mh.a((byte) 125, 1, 254);
                                      break L93;
                                    }
                                  } else {
                                    L114: {
                                      if (100.0 * Math.random() > (double)this.field_C[var6].field_Z.field_t) {
                                        dupTemp$14 = this.field_C[var6].field_Z;
                                        dupTemp$14.field_t = dupTemp$14.field_t + 1;
                                        break L114;
                                      } else {
                                        break L114;
                                      }
                                    }
                                    L115: {
                                      if (100.0 * Math.random() > (double)this.field_C[var6].field_Z.field_w) {
                                        dupTemp$15 = this.field_C[var6].field_Z;
                                        dupTemp$15.field_w = dupTemp$15.field_w + 1;
                                        break L115;
                                      } else {
                                        break L115;
                                      }
                                    }
                                    L116: {
                                      if (Math.random() * 100.0 <= (double)this.field_C[var6].field_Z.field_v) {
                                        break L116;
                                      } else {
                                        dupTemp$16 = this.field_C[var6].field_Z;
                                        dupTemp$16.field_v = dupTemp$16.field_v + 1;
                                        break L116;
                                      }
                                    }
                                    L117: {
                                      if (Math.random() * 100.0 > (double)this.field_C[var6].field_Z.field_B) {
                                        dupTemp$17 = this.field_C[var6].field_Z;
                                        dupTemp$17.field_B = dupTemp$17.field_B + 1;
                                        break L117;
                                      } else {
                                        break L117;
                                      }
                                    }
                                    L118: {
                                      if (Math.random() * 100.0 <= (double)this.field_C[var6].field_Z.field_q) {
                                        break L118;
                                      } else {
                                        dupTemp$18 = this.field_C[var6].field_Z;
                                        dupTemp$18.field_q = dupTemp$18.field_q + 1;
                                        break L118;
                                      }
                                    }
                                    var11++;
                                    continue L107;
                                  }
                                }
                              } else {
                                break L93;
                              }
                            }
                          }
                        }
                        var6++;
                        continue L80;
                      }
                    }
                  } else {
                    L119: {
                      if (param1.field_nb[var6] == null) {
                        break L119;
                      } else {
                        this.field_e.field_e = this.field_e.field_e + 1;
                        break L119;
                      }
                    }
                    var6++;
                    continue L2;
                  }
                }
              } else {
                L120: {
                  if (this.field_C[var6] != null) {
                    if (-1 > (this.field_C[var6].field_P ^ -1)) {
                      L121: {
                        if (null == this.field_C[var6].field_c) {
                          break L121;
                        } else {
                          this.field_C[var6].field_c.field_h = null;
                          break L121;
                        }
                      }
                      L122: {
                        if (null != this.field_C[var6].field_Z) {
                          break L122;
                        } else {
                          if (-1 == (this.field_C[var6].field_C ^ -1)) {
                            break L122;
                          } else {
                            var5++;
                            break L120;
                          }
                        }
                      }
                      var3_int++;
                      break L120;
                    } else {
                      break L120;
                    }
                  } else {
                    break L120;
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L123: {
            var3 = decompiledCaughtException;
            stackIn_380_0 = (RuntimeException) (var3);

            stackIn_380_1 = new StringBuilder().append("e.T(").append(param0).append(',');

            if (param1 == null) {
              stackIn_381_0 = (RuntimeException) ((Object) stackIn_380_0);
              stackIn_381_1 = (StringBuilder) ((Object) stackIn_380_1);
              stackIn_381_2 = "null";
              break L123;
            } else {
              stackIn_381_0 = (RuntimeException) ((Object) stackIn_380_0);
              stackIn_381_1 = (StringBuilder) ((Object) stackIn_380_1);
              stackIn_381_2 = "{...}";
              break L123;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_381_0), stackIn_381_2 + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        int stackIn_14_0 = 0;
        dk stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        dk stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        int stackIn_94_2 = 0;
        ci[] stackIn_129_0 = null;
        ci[] stackIn_131_0 = null;
        int stackIn_131_1 = 0;
        int stackIn_150_0 = 0;
        int stackIn_151_0 = 0;
        int stackIn_151_1 = 0;
        int stackIn_161_0 = 0;
        int stackIn_161_1 = 0;
        int stackIn_161_2 = 0;
        int stackIn_162_0 = 0;
        int stackIn_162_1 = 0;
        int stackIn_162_2 = 0;
        int stackIn_162_3 = 0;
        int stackIn_165_4;
        int stackIn_215_0 = 0;
        int stackIn_215_1 = 0;
        int stackIn_215_2 = 0;
        int stackIn_216_0 = 0;
        int stackIn_216_1 = 0;
        int stackIn_216_2 = 0;
        int stackIn_216_3 = 0;
        int stackIn_219_4;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        ci var8_ref_ci;
        dl var8_ref_dl;
        th var8_ref_th;
        int var9;
        Object var9_ref;
        int var10_int;
        dl var10;
        int var11_int;
        Object var11;
        int var12;
        int var13;
        int var14;
        int var15;
        String var15_ref_String;
        String var16_ref_String;
        int var16;
        int var17;
        int var18;
        int var19;
        r var20;
        dl var21;
        oh var22;
        oh var23;
        ci var24;
        String var25;
        String var26;
        Object var27;
        dl var27_ref;
        r var28;
        var27 = null;
        var19 = Terraphoenix.field_V;
        var3 = li.field_a ? 1 : 0;
        tg.field_l = -1;
        rd.field_t = 0;
        li.field_a = false;
        if (this.field_u) {
          L0: {
            if (this.field_q != null) {
              L1: {
                tg.field_l = -1;
                if (null == this.field_q.field_c.field_C) {
                  break L1;
                } else {
                  L2: {
                    if (this.field_q.field_c.field_C.field_C == null) {
                      break L2;
                    } else {
                      tg.field_l = 1 + this.field_q.field_E;
                      break L2;
                    }
                  }
                  if (0 != (this.field_q.field_c.field_C.field_b ^ -1)) {
                    tg.field_l = this.field_q.field_E;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              tg.field_l = eg.field_p;
              break L0;
            } else {
              break L0;
            }
          }
          L3: {
            var4 = 0;
            if (hl.field_a) {
              stackIn_14_0 = 0;
              break L3;
            } else {
              stackIn_14_0 = 1;
              break L3;
            }
          }
          L4: {
            L5: {
              var5 = stackIn_14_0;
              if (jb.field_b >= 365) {
                break L5;
              } else {
                if (39 < jb.field_b) {
                  break L4;
                } else {
                  break L5;
                }
              }
            }
            var5 = 0;
            break L4;
          }
          L6: {
            if (!param1) {
              break L6;
            } else {
              var5 = 0;
              break L6;
            }
          }
          L7: {
            if (ld.field_b) {
              var5 = 0;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (!this.field_J) {
              var5 = 0;
              break L8;
            } else {
              break L8;
            }
          }
          this.field_h.a(false, var5 != 0);
          var6 = 0;
          L9: while (true) {
            if (this.field_C.length <= var6) {
              L10: {
                if (!eh.field_m) {
                  break L10;
                } else {
                  var6 = -(32 * ui.field_f.field_H) + (-sj.field_b + (320 + 32 * ui.field_f.field_F));
                  var7 = ui.field_f.field_H * 16 + 16 * ui.field_f.field_F + (240 + (-lg.field_c + -(ui.field_f.field_E * 48 / 100)) - 32);
                  var8 = -320 + var6;
                  var8 += 304;
                  var9 = -240 + var7 - 32;
                  var9 += 224;
                  ui.field_f.field_g.a(var9, 4, var8, -22899, ui.field_f);
                  ck.a(ui.field_f.field_g, -31661);
                  break L10;
                }
              }
              L11: {
                if (var5 == 0) {
                  break L11;
                } else {
                  var4 = -sj.field_b + 320;
                  var4 = var4 + 32 * (-vf.field_a + uf.field_c);
                  var6 = 240 + -lg.field_c;
                  var6 = var6 + 16 * (vf.field_a + uf.field_c);
                  var7 = 0;
                  L12: while (true) {
                    if (var7 > eg.field_p) {
                      break L11;
                    } else {
                      var21 = this.field_h.a(-99, vf.field_a, var7, uf.field_c);
                      if (var21 != null) {
                        L13: {
                          var9_ref = hb.field_p[0];
                          if (var21.field_h == null) {
                            break L13;
                          } else {
                            if (eg.field_p != var7) {
                              break L13;
                            } else {
                              if (null == var21.field_h.field_Z) {
                                if (1 == var21.field_h.field_C) {
                                  if (!var21.field_h.field_k) {
                                    break L13;
                                  } else {
                                    var9_ref = hb.field_p[1];
                                    break L13;
                                  }
                                } else {
                                  var9_ref = null;
                                  break L13;
                                }
                              } else {
                                var9_ref = hb.field_p[2];
                                break L13;
                              }
                            }
                          }
                        }
                        L14: {
                          if (-1 == (this.field_L ^ -1)) {
                            break L14;
                          } else {
                            if (eg.field_p != var7) {
                              break L14;
                            } else {
                              var9_ref = hb.field_p[1];
                              break L14;
                            }
                          }
                        }
                        L15: {
                          if (var9_ref == hb.field_p[1]) {
                            if (this.field_q == null) {
                              break L15;
                            } else {
                              L16: {
                                var10_int = this.field_q.field_U;
                                var11_int = this.field_q.field_ab;
                                this.field_q.a(param0, uf.field_c, vf.field_a);
                                if (2 > Math.abs(var10_int + -this.field_q.field_U)) {
                                  break L16;
                                } else {
                                  if ((Math.abs(var10_int - this.field_q.field_U) ^ -1) < -7) {
                                    break L16;
                                  } else {
                                    this.field_q.field_ab = 0;
                                    break L16;
                                  }
                                }
                              }
                              L17: {
                                var12 = this.field_q.c(false);
                                if (this.field_m) {
                                  var12 = 15;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              L18: {
                                this.field_q.field_U = var10_int;
                                this.field_q.field_ab = var11_int;
                                if (this.field_m) {
                                  break L18;
                                } else {
                                  if (0 < this.field_q.field_nb.field_c) {
                                    break L18;
                                  } else {
                                    if (7 == this.field_q.field_nb.field_g) {
                                      break L18;
                                    } else {
                                      if (6 != this.field_q.field_nb.field_g) {
                                        this.field_h.a(-36 + var6 - 48 * var7, 16711680, var4, -2, ta.field_a);
                                        break L15;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                }
                              }
                              L19: {
                                if (var12 <= this.field_q.field_jb) {
                                  break L19;
                                } else {
                                  L20: {
                                    if (var12 + -10 > this.field_q.field_jb) {
                                      break L20;
                                    } else {
                                      if (this.field_m) {
                                        break L20;
                                      } else {
                                        if ((this.field_q.field_jb ^ -1) <= -11) {
                                          break L19;
                                        } else {
                                          break L20;
                                        }
                                      }
                                    }
                                  }
                                  this.field_h.a(-(48 * var7) + -36 + var6, 16711680, var4, -2, hj.field_A);
                                  break L15;
                                }
                              }
                              L21: {
                                if (var12 <= this.field_q.field_jb) {
                                  break L21;
                                } else {
                                  var12 = this.field_q.field_jb;
                                  break L21;
                                }
                              }
                              var13 = var12;
                              this.field_h.a(-(var7 * 48) + (var6 - 36), 16711680, var4, -2, Integer.toString(var13));
                              break L15;
                            }
                          } else {
                            break L15;
                          }
                        }
                        if (hb.field_p[0] == var9_ref) {
                          if (var7 == eg.field_p) {
                            L22: {
                              if (var21.field_z) {
                                break L22;
                              } else {
                                if (!var21.field_d) {
                                  break L22;
                                } else {
                                  var7++;
                                  continue L12;
                                }
                              }
                            }
                            L23: {
                              if (-5 == (var21.field_v ^ -1)) {
                                rh.field_b[9].b(-16 + var4, var6 + (-36 - 48 * var7));
                                rh.field_b[9].b(-16 + var4, var6 + -36 + (-(var7 * 48) - -8));
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                            if (5 == var21.field_v) {
                              rh.field_b[10].b(-16 + var4, -(var7 * 48) + -36 + var6);
                              rh.field_b[10].b(var4 + -16, 8 + (var6 - (36 - -(var7 * 48))));
                              var7++;
                              continue L12;
                            } else {
                              var7++;
                              continue L12;
                            }
                          } else {
                            var7++;
                            continue L12;
                          }
                        } else {
                          var7++;
                          continue L12;
                        }
                      } else {
                        var7++;
                        continue L12;
                      }
                    }
                  }
                }
              }
              L24: {
                if ((ql.field_i ^ -1) >= 0) {
                  break L24;
                } else {
                  if (0 <= (ld.field_e ^ -1)) {
                    break L24;
                  } else {
                    if (var5 != 0) {
                      var4 = -sj.field_b + 320;
                      var6 = -lg.field_c + 240;
                      var4 = var4 + 32 * (ql.field_i - ld.field_e);
                      var6 = var6 + 16 * (ld.field_e + ql.field_i);
                      var7 = this.field_q.field_N;
                      if ((og.field_d ^ -1) >= -1) {
                        var8_ref_ci = hb.field_p[3];
                        var9 = (int)(24.0 + Math.sin(mm.field_f) * 24.0);
                        ve.a(var8_ref_ci, -5353, var9 + var7 * 144, -(48 * var7) + (var6 + -var9), var4 + -24);
                        var9 = (int)(24.0 + 24.0 * Math.cos(mm.field_f));
                        ve.a(var8_ref_ci, -5353, 144 * var7 - -var9, -(48 * var7) + (var6 - var9), -24 + var4);
                        this.field_h.a(-(48 * var7) + (-24 + var6), 16711680, var4, -2, rj.field_f);
                        break L24;
                      } else {
                        L25: {
                          var8_ref_ci = hb.field_p[3];
                          var9 = (int)(24.0 + Math.sin(mm.field_f) * 24.0);
                          ve.a(var8_ref_ci, -5353, var7 * 144 + var9, var6 + (-(var7 * 48) - var9), var4 - 24);
                          var9 = (int)(Math.cos(mm.field_f) * 24.0 + 24.0);
                          ve.a(var8_ref_ci, -5353, var9 + var7 * 144, -var9 + -(48 * var7) + var6, -24 + var4);
                          var10_int = og.field_d;
                          stackIn_93_0 = this.field_h;

                          stackIn_93_1 = var6 + (-24 + -(var7 * 48));

                          if (var10_int > this.field_q.field_jb) {
                            stackIn_94_0 = (dk) ((Object) stackIn_93_0);
                            stackIn_94_1 = stackIn_93_1;
                            stackIn_94_2 = 16711680;
                            break L25;
                          } else {
                            stackIn_94_0 = (dk) ((Object) stackIn_93_0);
                            stackIn_94_1 = stackIn_93_1;
                            stackIn_94_2 = 65280;
                            break L25;
                          }
                        }
                        ((dk) (Object) stackIn_94_0).a(stackIn_94_1, stackIn_94_2, var4, -2, Integer.toString(var10_int));
                        break L24;
                      }
                    } else {
                      break L24;
                    }
                  }
                }
              }
              var6 = 0;
              L26: while (true) {
                if (50 <= var6) {
                  L27: {
                    if (le.field_q != null) {
                      le.field_q.d((byte) 124);
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  L28: {
                    if (!this.field_I) {
                      break L28;
                    } else {
                      var6 = 0;
                      L29: while (true) {
                        if (640 <= var6) {
                          break L28;
                        } else {
                          var7 = 0;
                          L30: while (true) {
                            if ((var7 ^ -1) <= -481) {
                              var6++;
                              continue L29;
                            } else {
                              if (-1 > (gd.field_a[var6][var7] ^ -1)) {
                                l.a(var6, var7, (2048 * gd.field_a[var6][var7] + (gd.field_a[var6][var7] * 16 - -(262144 * gd.field_a[var6][var7]))) % 16777215);
                                var7++;
                                continue L30;
                              } else {
                                var7++;
                                continue L30;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  jl.h((byte) -108);
                  if (param0) {
                    L31: {
                      var6 = 608;
                      var7 = 448;
                      if (this.field_J) {
                        var7 = 320;
                        wc.a((e) (this), var7, var6, -11669);
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                    L32: {
                      if (this.field_J) {
                        var8 = 385;
                        ic.field_t.b(0, var8);
                        var9 = 0;
                        L33: while (true) {
                          if (7 <= var9) {
                            L34: {
                              if (this.field_q == null) {
                                break L34;
                              } else {
                                if (this.field_J) {
                                  L35: {
                                    nf.field_g[this.field_q.field_Z.field_d].b(10, 9 + var8);
                                    var22 = this.field_q.field_nb;
                                    var9_ref = var22;
                                    if (var22 == null) {
                                      break L35;
                                    } else {
                                      L36: {
                                        if (-1 == (var22.field_g ^ -1)) {
                                          break L36;
                                        } else {
                                          if ((var22.field_g ^ -1) == -4) {
                                            break L36;
                                          } else {
                                            if (var22.field_g == 8) {
                                              break L36;
                                            } else {
                                              if (-13 != (var22.field_g ^ -1)) {
                                                break L35;
                                              } else {
                                                break L36;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var9_ref = this.field_q.field_eb;
                                      break L35;
                                    }
                                  }
                                  L37: {
                                    if (var9_ref != null) {
                                      L38: {
                                        cc.field_i[((oh) (var9_ref)).field_g].a(192, 93, 383, var8 - -46, (byte) 21);
                                        if (this.field_q.field_nb != var9_ref) {
                                          break L38;
                                        } else {
                                          l.e(310, var8 + 10, 148, 73, 16777215);
                                          if (this.field_L != 1) {
                                            break L38;
                                          } else {
                                            L39: {
                                              stackIn_150_0 = 1;

                                              if (this.field_m) {
                                                stackIn_151_0 = stackIn_150_0;
                                                stackIn_151_1 = 0;
                                                break L39;
                                              } else {
                                                stackIn_151_0 = stackIn_150_0;
                                                stackIn_151_1 = 1;
                                                break L39;
                                              }
                                            }
                                            if (stackIn_151_0 != stackIn_151_1) {
                                              break L38;
                                            } else {
                                              l.e(311, 11 - -var8, 146, 71, 16711680);
                                              break L38;
                                            }
                                          }
                                        }
                                      }
                                      L40: {
                                        if (0 >= ((oh) (var9_ref)).a(true)) {
                                          break L40;
                                        } else {
                                          L41: {
                                            var10_int = 73 / ((oh) (var9_ref)).a(true);
                                            if (var10_int >= 1) {
                                              break L41;
                                            } else {
                                              var10_int = 1;
                                              break L41;
                                            }
                                          }
                                          if (1 > var10_int) {
                                            break L40;
                                          } else {
                                            var12 = 1;
                                            L42: while (true) {
                                              if (var12 > ((oh) (var9_ref)).a(true)) {
                                                break L40;
                                              } else {
                                                L43: {
                                                  var11_int = (int)(((double)(-var12) + (double)((oh) (var9_ref)).a(param0) / 2.0) * (double)var10_int + (double)(var8 + 47));
                                                  stackIn_161_0 = 314;

                                                  stackIn_161_1 = var11_int;

                                                  stackIn_161_2 = 4;

                                                  if (1 < var10_int) {
                                                    stackIn_162_0 = stackIn_161_0;
                                                    stackIn_162_1 = stackIn_161_1;
                                                    stackIn_162_2 = stackIn_161_2;
                                                    stackIn_162_3 = var10_int + -1;
                                                    break L43;
                                                  } else {
                                                    stackIn_162_0 = stackIn_161_0;
                                                    stackIn_162_1 = stackIn_161_1;
                                                    stackIn_162_2 = stackIn_161_2;
                                                    stackIn_162_3 = 1;
                                                    break L43;
                                                  }
                                                }
                                                L44: {








                                                  if (((oh) (var9_ref)).field_c < var12) {




                                                    stackIn_165_4 = 16711680;
                                                    break L44;
                                                  } else {




                                                    stackIn_165_4 = 65280;
                                                    break L44;
                                                  }
                                                }
                                                l.f(stackIn_162_0, stackIn_162_1, stackIn_162_2, stackIn_162_3, stackIn_165_4);
                                                var12++;
                                                continue L42;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (var9_ref != this.field_q.field_nb) {
                                        break L37;
                                      } else {
                                        L45: {
                                          var10_int = (int)Math.sqrt((double)(this.field_q.c((byte) -16) * this.field_q.field_y));
                                          if (95 >= var10_int) {
                                            break L45;
                                          } else {
                                            var10_int = 95;
                                            break L45;
                                          }
                                        }
                                        og.field_f.a(var10_int + "%", 449, 80 + var8, 16777215, -1);
                                        if (6 == ((oh) (var9_ref)).field_g) {
                                          break L37;
                                        } else {
                                          if (7 == ((oh) (var9_ref)).field_g) {
                                            break L37;
                                          } else {
                                            if (((oh) (var9_ref)).field_c >= ((oh) (var9_ref)).a(true)) {
                                              break L37;
                                            } else {
                                              nb.field_d[7].b(324, 50 + var8);
                                              if (-325 >= (ef.field_j ^ -1)) {
                                                if (((oh) (var9_ref)).field_c > 0) {
                                                  break L37;
                                                } else {
                                                  if (mm.field_f <= 3.14) {
                                                    l.d(324, 50 + var8, 30, 30, 16711680, 128);
                                                    break L37;
                                                  } else {
                                                    if (((oh) (var9_ref)).field_c > 0) {
                                                      break L37;
                                                    } else {
                                                      if (mm.field_f > 3.14) {
                                                        break L37;
                                                      } else {
                                                        l.d(324, 50 + var8, 30, 30, 16711680, 128);
                                                        break L37;
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                if (((oh) (var9_ref)).field_c > 0) {
                                                  break L37;
                                                } else {
                                                  if (mm.field_f <= 3.14) {
                                                    l.d(324, 50 + var8, 30, 30, 16711680, 128);
                                                    break L37;
                                                  } else {
                                                    if (((oh) (var9_ref)).field_c > 0) {
                                                      break L37;
                                                    } else {
                                                      if (mm.field_f > 3.14) {
                                                        break L37;
                                                      } else {
                                                        l.d(324, 50 + var8, 30, 30, 16711680, 128);
                                                        break L37;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      if (this.field_q.field_Z.field_b == null) {
                                        break L37;
                                      } else {
                                        if ((this.field_q.field_Z.field_b.field_g ^ -1) != -18) {
                                          break L37;
                                        } else {
                                          cc.field_i[17].a(192, 93, 367, 10 + (var8 + 36), (byte) 21);
                                          break L37;
                                        }
                                      }
                                    }
                                  }
                                  L46: {
                                    L47: {
                                      var23 = this.field_q.field_eb;
                                      var9_ref = var23;
                                      if (var23 == null) {
                                        break L47;
                                      } else {
                                        if (var23.field_g == 0) {
                                          break L46;
                                        } else {
                                          if (3 == var23.field_g) {
                                            break L46;
                                          } else {
                                            if (8 == var23.field_g) {
                                              break L46;
                                            } else {
                                              if (12 != var23.field_g) {
                                                break L47;
                                              } else {
                                                break L46;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var9_ref = this.field_q.field_nb;
                                    break L46;
                                  }
                                  L48: {
                                    if (var9_ref != null) {
                                      L49: {
                                        var10_int = 467;
                                        l.c(var10_int, 10 + var8, var10_int - -73, var8 - -10 + 73);
                                        if (-1 != (((oh) (var9_ref)).field_g ^ -1)) {
                                          cc.field_i[((oh) (var9_ref)).field_g].a(192, 93, var10_int + 73, 36 + var8 - -10, (byte) 21);
                                          break L49;
                                        } else {
                                          cc.field_i[((oh) (var9_ref)).field_g].a(192, 93, var10_int - -81, var8 - -46, (byte) 21);
                                          break L49;
                                        }
                                      }
                                      L50: {
                                        l.c();
                                        if (var9_ref == this.field_q.field_nb) {
                                          l.e(var10_int, 10 - -var8, 73, 73, 16777215);
                                          if (1 != this.field_L) {
                                            break L50;
                                          } else {
                                            if (!this.field_m) {
                                              l.e(1 + var10_int, var8 + 11, 71, 71, 16711680);
                                              break L50;
                                            } else {
                                              break L50;
                                            }
                                          }
                                        } else {
                                          break L50;
                                        }
                                      }
                                      L51: {
                                        if (0 < ((oh) (var9_ref)).a(true)) {
                                          L52: {
                                            var11_int = 73 / ((oh) (var9_ref)).a(true);
                                            if ((var11_int ^ -1) > -2) {
                                              var11_int = 1;
                                              break L52;
                                            } else {
                                              break L52;
                                            }
                                          }
                                          L53: {
                                            if (1 <= var11_int) {
                                              var13 = 1;
                                              L54: while (true) {
                                                if (((oh) (var9_ref)).a(true) < var13) {
                                                  break L53;
                                                } else {
                                                  L55: {
                                                    var12 = (int)((double)(var8 - -47) + ((double)(-var13) + (double)((oh) (var9_ref)).a(true) / 2.0) * (double)var11_int);
                                                    stackIn_215_0 = var10_int + 4;

                                                    stackIn_215_1 = var12;

                                                    stackIn_215_2 = 4;

                                                    if (-2 <= (var11_int ^ -1)) {
                                                      stackIn_216_0 = stackIn_215_0;
                                                      stackIn_216_1 = stackIn_215_1;
                                                      stackIn_216_2 = stackIn_215_2;
                                                      stackIn_216_3 = 1;
                                                      break L55;
                                                    } else {
                                                      stackIn_216_0 = stackIn_215_0;
                                                      stackIn_216_1 = stackIn_215_1;
                                                      stackIn_216_2 = stackIn_215_2;
                                                      stackIn_216_3 = -1 + var11_int;
                                                      break L55;
                                                    }
                                                  }
                                                  L56: {








                                                    if (((oh) (var9_ref)).field_c < var13) {




                                                      stackIn_219_4 = 16711680;
                                                      break L56;
                                                    } else {




                                                      stackIn_219_4 = 65280;
                                                      break L56;
                                                    }
                                                  }
                                                  l.f(stackIn_216_0, stackIn_216_1, stackIn_216_2, stackIn_216_3, stackIn_219_4);
                                                  var13++;
                                                  continue L54;
                                                }
                                              }
                                            } else {
                                              break L53;
                                            }
                                          }
                                          if (-7 == (((oh) (var9_ref)).field_g ^ -1)) {
                                            break L51;
                                          } else {
                                            if ((((oh) (var9_ref)).field_g ^ -1) == -8) {
                                              break L51;
                                            } else {
                                              if (((oh) (var9_ref)).field_c >= ((oh) (var9_ref)).a(true)) {
                                                break L51;
                                              } else {
                                                nb.field_d[7].b(478, var8 - -50);
                                                if (((oh) (var9_ref)).field_c > 0) {
                                                  break L51;
                                                } else {
                                                  if (3.14 >= mm.field_f) {
                                                    l.d(478, var8 - -50, 30, 30, 16711680, 128);
                                                    if (-464 + (var10_int + 478) > ef.field_j) {
                                                      break L51;
                                                    } else {
                                                      if (-464 + (508 + var10_int) < ef.field_j) {
                                                        break L51;
                                                      } else {
                                                        if (jb.field_b < var8 - -50) {
                                                          break L51;
                                                        } else {
                                                          if (jb.field_b > var8 - -80) {
                                                            break L51;
                                                          } else {
                                                            nb.field_d[15].b(478, var8 - -50);
                                                            break L51;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    break L51;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          break L51;
                                        }
                                      }
                                      if (this.field_q.field_nb == var9_ref) {
                                        L57: {
                                          var11_int = (int)Math.sqrt((double)(this.field_q.c((byte) -16) * this.field_q.field_y));
                                          if (95 < var11_int) {
                                            var11_int = 95;
                                            break L57;
                                          } else {
                                            break L57;
                                          }
                                        }
                                        og.field_f.a(var11_int + "%", -464 + (531 + var10_int), 80 + var8, 16777215, -1);
                                        break L48;
                                      } else {
                                        break L48;
                                      }
                                    } else {
                                      break L48;
                                    }
                                  }
                                  L58: {
                                    if (null == this.field_q.field_b) {
                                      break L58;
                                    } else {
                                      L59: {
                                        l.c(547, 35 + var8, 595, 48 + var8 + 35);
                                        var24 = cc.field_i[this.field_q.field_b.field_g].d();
                                        var24.b();
                                        if ((this.field_q.field_b.field_g ^ -1) == -6) {
                                          var24.b(547 - var24.field_p - -6, 26 + (var8 - -(var24.field_v / 2)));
                                          break L59;
                                        } else {
                                          break L59;
                                        }
                                      }
                                      L60: {
                                        if (-12 != (this.field_q.field_b.field_g ^ -1)) {
                                          break L60;
                                        } else {
                                          var24.b(547 - var24.field_p, -3 + (var8 - (-32 + -(var24.field_v / 2))));
                                          break L60;
                                        }
                                      }
                                      L61: {
                                        l.c();
                                        if (!this.field_m) {
                                          break L61;
                                        } else {
                                          l.e(547, var8 + 35, 48, 48, 16777215);
                                          l.e(548, var8 + 36, 46, 46, 16711680);
                                          break L61;
                                        }
                                      }
                                      og.field_f.a(Integer.toString(this.field_q.field_b.field_d), 589, var8 - -81, 16777215, -1);
                                      break L58;
                                    }
                                  }
                                  L62: {
                                    if (this.field_q.field_B != 0) {
                                      break L62;
                                    } else {
                                      l.d(100, var8 - -67, 24, 24, 0, 128);
                                      break L62;
                                    }
                                  }
                                  L63: {
                                    if ((this.field_q.field_B ^ -1) != -2) {
                                      break L63;
                                    } else {
                                      l.d(128, 67 + var8, 24, 24, 0, 128);
                                      break L63;
                                    }
                                  }
                                  L64: {
                                    if (eg.field_p == 0) {
                                      l.d(185, var8 - -67, 24, 24, 0, 128);
                                      break L64;
                                    } else {
                                      break L64;
                                    }
                                  }
                                  L65: {
                                    if (5 > eg.field_p) {
                                      break L65;
                                    } else {
                                      l.d(213, var8 + 67, 24, 24, 0, 128);
                                      break L65;
                                    }
                                  }
                                  L66: {
                                    var10_int = 133;
                                    var11_int = this.field_q.field_P * var10_int / this.field_q.field_mb;
                                    var12 = var10_int * this.field_q.field_T / this.field_q.field_mb;
                                    var13 = (this.field_q.field_u + this.field_q.field_m) * var10_int / 200;
                                    l.d(var11_int + 159, var8 + 28, var10_int - var11_int, 7, 16776960, 128);
                                    l.d(var11_int + 159 + var12, var8 - -28, -var12 - (var11_int - var10_int), 7, 0, 192);
                                    l.d(159 - -var13, 45 + var8, var10_int + -var13, 7, 0, 192);
                                    var14 = this.field_q.field_jb;
                                    if (this.field_q.field_B == 0) {
                                      var14 = 2 * var14 / 3;
                                      var15 = var10_int * var14 / this.field_q.field_v;
                                      l.d(159, var8 + 11, var15, 7, 16777215, 128);
                                      l.d(159 - -var15, var8 - -11, -var15 + var10_int, 7, 0, 192);
                                      break L66;
                                    } else {
                                      var15 = var10_int * this.field_q.field_jb / this.field_q.field_v;
                                      l.d(159 - -var15, var8 - -11, -var15 + var10_int, 7, 0, 192);
                                      break L66;
                                    }
                                  }
                                  L67: {
                                    var14 = this.field_q.field_jb;
                                    var25 = Integer.toString(var14);
                                    var16_ref_String = var25;
                                    var16_ref_String = var25;
                                    var15_ref_String = var25;
                                    if (-1 == (this.field_q.field_B ^ -1)) {
                                      var15_ref_String = "<lt>" + var25 + "<gt>";
                                      var16_ref_String = var15_ref_String;
                                      var16_ref_String = var15_ref_String;
                                      break L67;
                                    } else {
                                      break L67;
                                    }
                                  }
                                  L68: {
                                    var26 = Integer.toString(this.field_q.field_P);
                                    var16_ref_String = var26;
                                    var16_ref_String = var26;
                                    var16_ref_String = var26;
                                    if ((this.field_q.field_T ^ -1) >= -1) {
                                      break L68;
                                    } else {
                                      L69: {
                                        var17 = this.field_q.field_P - -this.field_q.field_T;
                                        if (99 < var17) {
                                          var17 = 99;
                                          break L69;
                                        } else {
                                          break L69;
                                        }
                                      }
                                      var16_ref_String = var26 + "/" + var17;
                                      break L68;
                                    }
                                  }
                                  og.field_f.c(var15_ref_String, 134, 18 + var8, 0, 0);
                                  og.field_f.c(var16_ref_String, 134, 35 + var8, 0, 0);
                                  og.field_f.c(Integer.toString(this.field_q.field_u + this.field_q.field_m), 134, var8 - -52, 0, 0);
                                  og.field_f.c(var15_ref_String, 135, 17 + var8, 0, 0);
                                  og.field_f.c(var16_ref_String, 135, var8 + 34, 0, 0);
                                  og.field_f.c(Integer.toString(this.field_q.field_m + this.field_q.field_u), 135, var8 - -51, 0, 0);
                                  og.field_f.c(var15_ref_String, 135, 18 + var8, 8421631, -1);
                                  og.field_f.c(var16_ref_String, 135, 35 + var8, 16719904, -1);
                                  og.field_f.c(Integer.toString(this.field_q.field_u - -this.field_q.field_m), 135, 52 + var8, 2162464, -1);
                                  break L34;
                                } else {
                                  break L34;
                                }
                              }
                            }
                            L70: {
                              if (ha.field_o) {
                                L71: {
                                  if (this.field_B >= 2) {
                                    break L71;
                                  } else {
                                    l.f(306, 7 - -var8, 234, 79, 0);
                                    break L71;
                                  }
                                }
                                L72: {
                                  if (this.field_B < 7) {
                                    l.f(241, 66 + var8, 26, 26, 0);
                                    break L72;
                                  } else {
                                    break L72;
                                  }
                                }
                                L73: {
                                  if ((this.field_B ^ -1) > -10) {
                                    l.f(269, var8 + 66, 26, 26, 0);
                                    break L73;
                                  } else {
                                    break L73;
                                  }
                                }
                                L74: {
                                  if (this.field_B < 10) {
                                    l.f(606, 7 - -var8, 29, 79, 0);
                                    break L74;
                                  } else {
                                    break L74;
                                  }
                                }
                                L75: {
                                  if (-12 >= (this.field_B ^ -1)) {
                                    break L75;
                                  } else {
                                    l.f(99, 66 + var8, 54, 26, 0);
                                    break L75;
                                  }
                                }
                                L76: {
                                  if (this.field_B >= 12) {
                                    break L76;
                                  } else {
                                    l.f(184, var8 + 66, 54, 26, 0);
                                    break L76;
                                  }
                                }
                                if ((this.field_B ^ -1) > -15) {
                                  l.f(541, 7 - -var8, 54, 54, 0);
                                  break L70;
                                } else {
                                  break L70;
                                }
                              } else {
                                break L70;
                              }
                            }
                            var9 = 0;
                            var10_int = -1;
                            var11_int = 0;
                            var12 = 0;
                            L77: while (true) {
                              if (12 <= var12) {
                                L78: {
                                  if (-2 > (var9 ^ -1)) {
                                    var12 = 550 / (-1 + var9);
                                    break L78;
                                  } else {
                                    var12 = 90;
                                    break L78;
                                  }
                                }
                                L79: {
                                  if (var12 <= 90) {
                                    break L79;
                                  } else {
                                    var12 = 90;
                                    break L79;
                                  }
                                }
                                var13 = -1 + var9;
                                L80: while (true) {
                                  if (-1 < (var13 ^ -1)) {
                                    break L32;
                                  } else {
                                    L81: {
                                      var14 = var12;
                                      if ((var10_int ^ -1) != (var13 ^ -1)) {
                                        break L81;
                                      } else {
                                        var14 = 90;
                                        break L81;
                                      }
                                    }
                                    L82: {
                                      var4 = var13 * var12;
                                      if (var10_int >= var13) {
                                        break L82;
                                      } else {
                                        var4 = var4 + (90 - var12);
                                        break L82;
                                      }
                                    }
                                    L83: while (true) {
                                      if (null != this.field_C[var11_int]) {
                                        if ((this.field_C[var11_int].field_P ^ -1) < -1) {
                                          L84: {
                                            var8 = 384;
                                            if (var4 + (-th.field_i.field_r - -var14) > ef.field_j) {
                                              break L84;
                                            } else {
                                              if (jb.field_b < 365) {
                                                break L84;
                                              } else {
                                                if (394 < jb.field_b) {
                                                  break L84;
                                                } else {
                                                  if (ef.field_j > var14 + var4) {
                                                    break L84;
                                                  } else {
                                                    L85: {
                                                      if (!ha.field_o) {
                                                        break L85;
                                                      } else {
                                                        if (this.field_B >= 7) {
                                                          break L85;
                                                        } else {
                                                          break L84;
                                                        }
                                                      }
                                                    }
                                                    this.field_G.field_Eb = new String[1];
                                                    this.field_G.field_Eb[0] = ne.field_b + this.field_C[var11_int].field_Z.b(1);
                                                    if (oh.field_f == 1) {
                                                      L86: {
                                                        if (this.field_B < 7) {
                                                          break L86;
                                                        } else {
                                                          if (-11 >= (this.field_B ^ -1)) {
                                                            break L86;
                                                          } else {
                                                            if (sj.field_b == 32 * (this.field_q.field_F + -this.field_q.field_H)) {
                                                              break L86;
                                                            } else {
                                                              if (16 * (this.field_q.field_F + this.field_q.field_H) != lg.field_c) {
                                                                this.field_B = this.field_B + 1;
                                                                break L86;
                                                              } else {
                                                                break L86;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                      this.field_q = this.field_C[var11_int];
                                                      eg.field_p = this.field_q.field_E;
                                                      sj.field_b = (-this.field_q.field_H + this.field_q.field_F) * 32;
                                                      lg.field_c = 16 * (this.field_q.field_F + this.field_q.field_H);
                                                      this.a(-1);
                                                      this.field_L = 0;
                                                      this.field_m = false;
                                                      break L84;
                                                    } else {
                                                      break L84;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          L87: {
                                            var15 = this.field_C[var11_int].field_jb;
                                            var16 = 52428;
                                            var17 = 65535;
                                            var18 = 16777215;
                                            if (this.field_C[var11_int].field_B != 0) {
                                              break L87;
                                            } else {
                                              var17 = 16711680;
                                              var18 = 16744576;
                                              var16 = 13369344;
                                              break L87;
                                            }
                                          }
                                          L88: {
                                            if (var10_int == var13) {
                                              vl.field_c.b(var14 + var4 + -vl.field_c.field_r, 365);
                                              og.field_f.b(this.field_C[var11_int].field_Z.a(-1426, -20 + var14), var4, var8 - 5, 65280, -1);
                                              og.field_f.a(Integer.toString(var15), -5 + (var4 - -var14), -5 + var8, var17, -1);
                                              break L88;
                                            } else {
                                              th.field_i.b(var4 - th.field_i.field_r - -var14, 365);
                                              og.field_f.b(this.field_C[var11_int].field_Z.a(-1426, -12 + var14 + -8), var4, var8 + -5, 52224, -1);
                                              og.field_f.a(Integer.toString(var15), -5 + (var14 + var4), -5 + var8, var16, -1);
                                              break L88;
                                            }
                                          }
                                          L89: {
                                            if (this.field_C[var11_int].field_ob) {
                                              l.e(89 + -vl.field_c.field_r + var4 - (-var14 - -1), 383, 4, 16777215);
                                              l.e(89 + (-vl.field_c.field_r + (var4 + var14)) + 1, 383, 4, 16777215);
                                              l.e(-vl.field_c.field_r + var4 + (var14 + 89), 383, 3, 16711680);
                                              l.e(var4 + (-vl.field_c.field_r - -var14) - -89, 383, 2, 0);
                                              break L89;
                                            } else {
                                              break L89;
                                            }
                                          }
                                          if (this.field_C[var11_int].field_v == this.field_C[var11_int].field_jb) {
                                            if (1 == this.field_C[var11_int].field_B) {
                                              og.field_f.a(Integer.toString(var15), var14 + var4 - 5, var8 - 5, var18, -1);
                                              var11_int--;
                                              var13--;
                                              continue L80;
                                            } else {
                                              var11_int--;
                                              var13--;
                                              continue L80;
                                            }
                                          } else {
                                            var11_int--;
                                            var13--;
                                            continue L80;
                                          }
                                        } else {
                                          var11_int--;
                                          continue L83;
                                        }
                                      } else {
                                        var11_int--;
                                        continue L83;
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (null != this.field_C[var12]) {
                                  if (null != this.field_C[var12].field_Z) {
                                    if ((this.field_C[var12].field_P ^ -1) < -1) {
                                      L90: {
                                        if (this.field_q != null) {
                                          break L90;
                                        } else {
                                          this.field_q = this.field_C[var11_int];
                                          break L90;
                                        }
                                      }
                                      L91: {
                                        if (this.field_C[var12] != this.field_q) {
                                          break L91;
                                        } else {
                                          var10_int = var9;
                                          break L91;
                                        }
                                      }
                                      var11_int = var12;
                                      var9++;
                                      var12++;
                                      continue L77;
                                    } else {
                                      var12++;
                                      continue L77;
                                    }
                                  } else {
                                    var12++;
                                    continue L77;
                                  }
                                } else {
                                  var12++;
                                  continue L77;
                                }
                              }
                            }
                          } else {
                            L92: {
                              L93: {
                                stackIn_129_0 = nb.field_d;

                                if ((28 * var9 + 97 ^ -1) < (this.field_y ^ -1)) {
                                  break L93;
                                } else {
                                  stackIn_129_0 = (ci[]) ((Object) stackIn_129_0);

                                  if (99 + (28 * var9 + 24) <= this.field_y) {
                                    break L93;
                                  } else {
                                    stackIn_129_0 = (ci[]) ((Object) stackIn_129_0);

                                    if (-2 + var8 + 66 >= this.field_j) {
                                      break L93;
                                    } else {


                                      if (26 + (-2 + var8 + 66) > this.field_j) {
                                        stackIn_131_0 = (ci[]) ((Object) stackIn_129_0);
                                        stackIn_131_1 = var9 - -8;
                                        break L92;
                                      } else {
                                        stackIn_129_0 = (ci[]) ((Object) stackIn_129_0);
                                        break L93;
                                      }
                                    }
                                  }
                                }
                              }
                              stackIn_131_0 = (ci[]) ((Object) stackIn_129_0);
                              stackIn_131_1 = var9;
                              break L92;
                            }
                            ((ci) (Object) stackIn_131_0[stackIn_131_1]).b(99 + (var9 * 28 - 2), -2 + (66 + var8));
                            var9++;
                            continue L33;
                          }
                        }
                      } else {
                        break L32;
                      }
                    }
                    L94: {
                      if (!g.field_tb) {
                        break L94;
                      } else {
                        if ((mm.field_e ^ -1) <= -3) {
                          vc.field_f.b("QA MODE", 10, 70, 16711823, 0);
                          var27_ref = this.field_h.a(-111, vf.field_a, eg.field_p, uf.field_c);
                          var8_ref_dl = var27_ref;
                          if (var27_ref != null) {
                            L95: {
                              if (null == oi.field_J) {
                                break L95;
                              } else {
                                l.f(0, 100, oi.field_J.field_q, oi.field_J.field_u, 16711823);
                                oi.field_J.b(0, 100);
                                break L95;
                              }
                            }
                            var20 = var27_ref.field_h;
                            var28 = var20;
                            var10_int = 80;
                            if (var28 == null) {
                              L96: {
                                L97: {
                                  if (var27_ref.field_v == 0) {
                                    break L97;
                                  } else {
                                    if ((var27_ref.field_v ^ -1) != -2) {
                                      break L96;
                                    } else {
                                      break L97;
                                    }
                                  }
                                }
                                og.field_f.a("Press the numberkeys from 0 to 6 to create a unit here", 630, var10_int, 16777215, 0);
                                var10_int += 12;
                                break L96;
                              }
                              L98: {
                                var11 = null;
                                if (bh.field_e[25]) {
                                  var11 = new r(0, this.field_G.field_Bb);
                                  break L98;
                                } else {
                                  break L98;
                                }
                              }
                              L99: {
                                if (bh.field_e[16]) {
                                  var11 = new r(1, this.field_G.field_Bb);
                                  break L99;
                                } else {
                                  break L99;
                                }
                              }
                              L100: {
                                if (!bh.field_e[17]) {
                                  break L100;
                                } else {
                                  var11 = new r(2, this.field_G.field_Bb);
                                  break L100;
                                }
                              }
                              L101: {
                                if (!bh.field_e[18]) {
                                  break L101;
                                } else {
                                  var11 = new r(3, this.field_G.field_Bb);
                                  break L101;
                                }
                              }
                              L102: {
                                if (!bh.field_e[19]) {
                                  break L102;
                                } else {
                                  var11 = new r(4, this.field_G.field_Bb);
                                  break L102;
                                }
                              }
                              L103: {
                                if (bh.field_e[20]) {
                                  var11 = new r(5, this.field_G.field_Bb);
                                  break L103;
                                } else {
                                  break L103;
                                }
                              }
                              L104: {
                                if (!bh.field_e[21]) {
                                  break L104;
                                } else {
                                  var11 = new r(6, this.field_G.field_Bb);
                                  break L104;
                                }
                              }
                              if (var11 != null) {
                                var12 = 0;
                                L105: while (true) {
                                  L106: {
                                    if (this.field_C.length <= var12) {
                                      break L106;
                                    } else {
                                      if (null == this.field_C[var12]) {
                                        this.field_C[var12] = (r) (var11);
                                        ((r) (var11)).field_c = var27_ref;
                                        ((r) (var11)).field_H = vf.field_a;
                                        ((r) (var11)).field_E = eg.field_p;
                                        var27_ref.field_h = (r) (var11);
                                        ((r) (var11)).field_F = uf.field_c;
                                        var11 = null;
                                        break L106;
                                      } else {
                                        var12++;
                                        continue L105;
                                      }
                                    }
                                  }
                                  if (var11 == null) {
                                    break L94;
                                  } else {
                                    var12 = 0;
                                    L107: while (true) {
                                      if (this.field_C.length <= var12) {
                                        break L94;
                                      } else {
                                        if (this.field_C[var12] != null) {
                                          if (0 >= this.field_C[var12].field_P) {
                                            this.field_C[var12] = (r) (var11);
                                            ((r) (var11)).field_H = vf.field_a;
                                            ((r) (var11)).field_c = var27_ref;
                                            ((r) (var11)).field_E = eg.field_p;
                                            var27_ref.field_h = (r) (var11);
                                            ((r) (var11)).field_F = uf.field_c;
                                            var11 = null;
                                            break L94;
                                          } else {
                                            var12++;
                                            continue L107;
                                          }
                                        } else {
                                          var12++;
                                          continue L107;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (var11 == null) {
                                  break L94;
                                } else {
                                  var12 = 0;
                                  L108: while (true) {
                                    if (this.field_C.length <= var12) {
                                      break L94;
                                    } else {
                                      if (this.field_C[var12] != null) {
                                        if (0 >= this.field_C[var12].field_P) {
                                          this.field_C[var12] = (r) (var11);
                                          ((r) (var11)).field_H = vf.field_a;
                                          ((r) (var11)).field_c = var27_ref;
                                          ((r) (var11)).field_E = eg.field_p;
                                          var27_ref.field_h = (r) (var11);
                                          ((r) (var11)).field_F = uf.field_c;
                                          var11 = null;
                                          break L94;
                                        } else {
                                          var12++;
                                          continue L108;
                                        }
                                      } else {
                                        var12++;
                                        continue L108;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              L109: {
                                og.field_f.a(var28.field_K, 630, var10_int, 16777215, 0);
                                var10_int += 12;
                                og.field_f.a("Health " + var28.field_P + "/" + var28.field_mb, 630, var10_int, 16777215, 0);
                                var10_int += 12;
                                og.field_f.a("Armour " + var28.field_u + "/" + var28.field_fb, 630, var10_int, 16777215, 0);
                                var10_int += 12;
                                og.field_f.a("Shield " + var28.field_m + "/" + var28.field_J, 630, var10_int, 16777215, 0);
                                var10_int += 12;
                                og.field_f.a("Weapon: " + od.field_c[var20.field_nb.field_g].field_j, 630, var10_int, 16777215, 0);
                                var10_int += 12;
                                if (null != var28.field_b) {
                                  og.field_f.a("Nades:  " + od.field_c[var20.field_b.field_g].field_j + "*" + var28.field_b.field_d, 630, var10_int, 16777215, 0);
                                  break L109;
                                } else {
                                  break L109;
                                }
                              }
                              L110: {
                                var10_int += 12;
                                og.field_f.a("Tus " + var28.field_jb + "/" + var28.field_v, 630, var10_int, 16777215, 0);
                                var10_int += 12;
                                og.field_f.a("Interupt " + var28.field_q, 630, var10_int, 16777215, 0);
                                var10_int += 12;
                                var10_int += 12;
                                og.field_f.a("Use [ and ] to change weapon", 630, var10_int, 16777215, 0);
                                var10_int += 12;
                                og.field_f.a("Use <lt> and > to change tus", 630, var10_int, 16777215, 0);
                                var10_int += 12;
                                og.field_f.a("Hold shift and use <lt> and > to change interupttus", 630, var10_int, 16777215, 0);
                                var10_int += 12;
                                og.field_f.a("Press / to kill this unit", 630, var10_int, 16777215, 0);
                                if (!bh.field_e[uf.field_b]) {
                                  break L110;
                                } else {
                                  if (!bh.field_e[81]) {
                                    L111: {
                                      var28.field_jb = var28.field_jb - 1;
                                      if (var28.field_jb >= 0) {
                                        break L111;
                                      } else {
                                        var28.field_jb = 0;
                                        break L111;
                                      }
                                    }
                                    if (var28.field_q < -var28.field_jb) {
                                      var28.field_q = -var28.field_jb;
                                      break L110;
                                    } else {
                                      break L110;
                                    }
                                  } else {
                                    L112: {
                                      var28.field_q = var28.field_q - 1;
                                      if (var28.field_q >= -var28.field_v) {
                                        break L112;
                                      } else {
                                        var28.field_q = -var28.field_v;
                                        break L112;
                                      }
                                    }
                                    if (-var28.field_jb > var28.field_q) {
                                      var28.field_jb = -var28.field_q;
                                      break L110;
                                    } else {
                                      break L110;
                                    }
                                  }
                                }
                              }
                              L113: {
                                var10_int += 12;
                                if (!bh.field_e[ne.field_e]) {
                                  break L113;
                                } else {
                                  if (bh.field_e[81]) {
                                    L114: {
                                      var28.field_q = var28.field_q + 1;
                                      if (var28.field_q <= var28.field_v) {
                                        break L114;
                                      } else {
                                        var28.field_q = var28.field_v;
                                        break L114;
                                      }
                                    }
                                    if (var28.field_v < var28.field_q + var28.field_jb) {
                                      var28.field_jb = var28.field_v + -var28.field_q;
                                      break L113;
                                    } else {
                                      break L113;
                                    }
                                  } else {
                                    L115: {
                                      var28.field_jb = var28.field_jb + 1;
                                      if (var28.field_v < var28.field_jb) {
                                        var28.field_jb = var28.field_v;
                                        break L115;
                                      } else {
                                        break L115;
                                      }
                                    }
                                    if (var28.field_q + var28.field_jb <= var28.field_v) {
                                      break L113;
                                    } else {
                                      var28.field_q = var28.field_v + -var28.field_jb;
                                      break L113;
                                    }
                                  }
                                }
                              }
                              L116: {
                                if (25 <= nd.field_k) {
                                  break L116;
                                } else {
                                  L117: {
                                    if (!bh.field_e[42]) {
                                      break L117;
                                    } else {
                                      L118: {
                                        var28.field_nb.field_g = var28.field_nb.field_g - 1;
                                        if (-18 == (var28.field_nb.field_g ^ -1)) {
                                          var28.field_nb.field_g = 16;
                                          break L118;
                                        } else {
                                          break L118;
                                        }
                                      }
                                      L119: {
                                        if (var28.field_nb.field_g != 5) {
                                          break L119;
                                        } else {
                                          var28.field_nb.field_g = 4;
                                          break L119;
                                        }
                                      }
                                      L120: {
                                        if (11 != var28.field_nb.field_g) {
                                          break L120;
                                        } else {
                                          var28.field_nb.field_g = 10;
                                          break L120;
                                        }
                                      }
                                      nd.field_k = 25;
                                      if (0 > (var28.field_nb.field_g ^ -1)) {
                                        break L117;
                                      } else {
                                        var28.field_nb.field_g = 18;
                                        break L117;
                                      }
                                    }
                                  }
                                  if (!bh.field_e[43]) {
                                    break L116;
                                  } else {
                                    L121: {
                                      var28.field_nb.field_g = var28.field_nb.field_g + 1;
                                      if (17 == var28.field_nb.field_g) {
                                        var28.field_nb.field_g = 18;
                                        break L121;
                                      } else {
                                        break L121;
                                      }
                                    }
                                    L122: {
                                      if ((var28.field_nb.field_g ^ -1) == -6) {
                                        var28.field_nb.field_g = 6;
                                        break L122;
                                      } else {
                                        break L122;
                                      }
                                    }
                                    L123: {
                                      if (var28.field_nb.field_g == 11) {
                                        var28.field_nb.field_g = 12;
                                        break L123;
                                      } else {
                                        break L123;
                                      }
                                    }
                                    L124: {
                                      if (-20 >= (var28.field_nb.field_g ^ -1)) {
                                        var28.field_nb.field_g = 0;
                                        break L124;
                                      } else {
                                        break L124;
                                      }
                                    }
                                    nd.field_k = 25;
                                    break L116;
                                  }
                                }
                              }
                              if (!bh.field_e[73]) {
                                break L94;
                              } else {
                                var28.field_d = 5;
                                var28.field_A = 0;
                                var28.field_S = true;
                                var28.field_P = 0;
                                break L94;
                              }
                            }
                          } else {
                            break L94;
                          }
                        } else {
                          break L94;
                        }
                      }
                    }
                    L125: {
                      if (!this.field_w) {
                        break L125;
                      } else {
                        this.field_h.c(5);
                        break L125;
                      }
                    }
                    L126: {
                      if (null != this.field_K) {
                        break L126;
                      } else {
                        if (this.field_J) {
                          break L126;
                        } else {
                          L127: {
                            this.field_K = mk.field_f;
                            var8 = vc.field_f.b(this.field_K);
                            var9 = 24;
                            if (-321 >= (var8 ^ -1)) {
                              var8 = 320;
                              break L127;
                            } else {
                              break L127;
                            }
                          }
                          var9 = 24 * vc.field_f.c(this.field_K, var8);
                          l.f(320 + -(var8 / 2) + -10, 237 - (var9 / 2 - 122), var8 + 20, 8 + var9, 8388608);
                          jl.a(jc.field_G, 6 + var9 + 8, 116 + (-(var9 / 2) + 240), 20 + var8 - -6, (byte) -115, -13 + (-(var8 / 2) + 320));
                          kb.a(116, 24, var8 + (-(var8 / 2) + 320), this.field_K, -(var8 / 2) + 320, 50 + (240 + -var9 + 105), 16777215);
                          this.field_K = null;
                          break L126;
                        }
                      }
                    }
                    L128: {
                      if (null != this.field_K) {
                        L129: {
                          jm.field_h = jm.field_h + 1;
                          if ((jm.field_h ^ -1) >= -101) {
                            break L129;
                          } else {
                            lg.field_c = this.field_k;
                            this.field_K = null;
                            sj.field_b = this.field_c;
                            jm.field_h = 0;
                            eg.field_p = this.field_E;
                            break L129;
                          }
                        }
                        L130: {
                          var8 = vc.field_f.b(this.field_K);
                          var9 = 24;
                          if (-321 < (var8 ^ -1)) {
                            break L130;
                          } else {
                            var8 = 320;
                            break L130;
                          }
                        }
                        L131: {
                          if (var8 >= og.field_f.b(jc.field_B)) {
                            break L131;
                          } else {
                            var8 = og.field_f.b(jc.field_B);
                            break L131;
                          }
                        }
                        var9 = 24 + 24 * vc.field_f.c(this.field_K, var8);
                        l.f(-10 + -(var8 / 2) + 320, 50 + (-28 + -(var9 / 2) + 240), var8 - -20, 8 + var9, 8388608);
                        jl.a(jc.field_G, var9 - -14, 209 + (-(var9 / 2) + 50), var8 - -26, (byte) 103, -3 + (310 - var8 / 2));
                        vc.field_f.a(this.field_K, -(var8 / 2) + 320, 24 + (240 - var9 / 2), var8, var9, 16777215, 0, 1, 0, vc.field_f.field_s);
                        og.field_f.c(jc.field_B, 320, 24 + (var9 / 2 + 240), 16777215, -1);
                        break L128;
                      } else {
                        break L128;
                      }
                    }
                    L132: {
                      vb.field_i = 25;
                      ge.field_b = 610;
                      if (!this.field_J) {
                        break L132;
                      } else {
                        tf.a(vb.field_i, (byte) 29, 390, ge.field_b, true, 89);
                        break L132;
                      }
                    }
                    L133: {
                      L134: {
                        if (!this.field_w) {
                          break L134;
                        } else {
                          if (!this.field_J) {
                            break L134;
                          } else {
                            break L133;
                          }
                        }
                      }
                      L135: {
                        var8_ref_th = this.field_n;
                        var9 = 361;
                        if (!this.field_J) {
                          var9 = 472;
                          break L135;
                        } else {
                          break L135;
                        }
                      }
                      L136: while (true) {
                        if (var8_ref_th == null) {
                          break L133;
                        } else {
                          L137: {
                            rh.field_b[11].a(0, -14 + var9, 16, 16);
                            if (var8_ref_th.field_h) {
                              var10_int = 65793 * var8_ref_th.field_d;
                              og.field_f.b(var8_ref_th.field_b, 21, var9, 0, -1);
                              og.field_f.b(var8_ref_th.field_b, 19, var9, 0, -1);
                              og.field_f.b(var8_ref_th.field_b, 20, var9 - -1, 0, -1);
                              og.field_f.b(var8_ref_th.field_b, 20, -1 + var9, 0, -1);
                              og.field_f.b(var8_ref_th.field_b, 20, var9, var10_int, -1);
                              break L137;
                            } else {
                              L138: {
                                var10_int = 65280;
                                if (1 != var8_ref_th.field_d / 5 % 2) {
                                  break L138;
                                } else {
                                  var10_int = 16777215;
                                  break L138;
                                }
                              }
                              og.field_f.b(var8_ref_th.field_b, 21, var9, 0, -1);
                              og.field_f.b(var8_ref_th.field_b, 19, var9, 0, -1);
                              og.field_f.b(var8_ref_th.field_b, 20, var9 - -1, 0, -1);
                              og.field_f.b(var8_ref_th.field_b, 20, -1 + var9, 0, -1);
                              og.field_f.b(var8_ref_th.field_b, 20, var9, var10_int, -1);
                              break L137;
                            }
                          }
                          if (var8_ref_th != null) {
                            var8_ref_th = var8_ref_th.field_f;
                            var9 -= 16;
                            continue L136;
                          } else {
                            var9 -= 16;
                            continue L136;
                          }
                        }
                      }
                    }
                    L139: {
                      if (!param1) {
                        break L139;
                      } else {
                        this.field_G.field_Eb = null;
                        break L139;
                      }
                    }
                    L140: {
                      if (this.field_J) {
                        l.d(162, 7, 364, 33, 0, 128);
                        l.b(162, 39, 364, 4473924);
                        ua.field_b.b(0, 0);
                        if (null != this.field_G.field_Eb) {
                          if (this.field_G.field_Eb.length != 1) {
                            og.field_f.a(this.field_G.field_Eb[0], 178, 6, 162, 33, 16777215, -1, 1, 1, 12);
                            l.f(344, 10, 27, 4473924);
                            og.field_f.a(this.field_G.field_Eb[1], 348, 6, 162, 33, 16777215, -1, 1, 1, 12);
                            break L140;
                          } else {
                            og.field_f.a(this.field_G.field_Eb[0], 178, 6, 332, 33, 16777215, -1, 1, 1, 12);
                            break L140;
                          }
                        } else {
                          break L140;
                        }
                      } else {
                        break L140;
                      }
                    }
                    L141: {
                      if (!this.field_b) {
                        break L141;
                      } else {
                        le.field_q = null;
                        break L141;
                      }
                    }
                    L142: {
                      if (le.field_q != null) {
                        le.field_q.a((byte) -100);
                        break L142;
                      } else {
                        break L142;
                      }
                    }
                    L143: {
                      if (var3 == 0) {
                        break L143;
                      } else {
                        if (li.field_a) {
                          break L143;
                        } else {
                          var8 = 0;
                          L144: while (true) {
                            if (this.field_h.field_b <= var8) {
                              break L143;
                            } else {
                              var9 = 0;
                              L145: while (true) {
                                if (this.field_h.field_e <= var9) {
                                  var8++;
                                  continue L144;
                                } else {
                                  var10 = this.field_h.field_f[var8][var9];
                                  L146: while (true) {
                                    if (var10 == null) {
                                      var9++;
                                      continue L145;
                                    } else {
                                      var10.field_p = 0;
                                      var10 = var10.field_C;
                                      continue L146;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (this.field_F[var6] != null) {
                    this.field_F[var6].c(16);
                    var6++;
                    continue L26;
                  } else {
                    var6++;
                    continue L26;
                  }
                }
              }
            } else {
              if (null != this.field_C[var6]) {
                this.field_C[var6].e((byte) 41);
                var6++;
                continue L9;
              } else {
                var6++;
                continue L9;
              }
            }
          }
        } else {
          this.field_h.a(24, (byte) -122, 92);
          return;
        }
    }

    private final void b(byte param0) {
        fi.field_m = null;
        ql.field_i = -1;
        ld.field_e = -1;
        og.field_d = -1;
        if (param0 != -3) {
            this.field_d = 61;
        }
    }

    final void a(byte param0, int param1, int param2, ci param3) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        var18 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var5_int = -16 + param3.field_u;
              if (60 != param3.field_u) {
                break L1;
              } else {
                var5_int = -12 + param3.field_u;
                break L1;
              }
            }
            var6 = param2;
            var6 = var6 + param3.field_p;
            var7 = param1;
            var7 = var7 + param3.field_v;
            var8 = 0;
            var9 = param3.field_p + param2;
            var10 = param1 - -param3.field_v;
            var11 = param3.field_t;
            var12 = param3.field_r;
            if (param0 == -101) {
              L2: {
                if (l.field_d <= var7) {
                  break L2;
                } else {
                  var14 = l.field_d + -var7;
                  var11 = var11 - var14;
                  var8 = var8 + var14 * var12;
                  var7 = l.field_d;
                  var10 = var10 + var14;
                  break L2;
                }
              }
              L3: {
                var13 = 0;
                if (l.field_c >= var7 + var11) {
                  break L3;
                } else {
                  var11 = var11 - (-l.field_c + (var11 + var7));
                  break L3;
                }
              }
              L4: {
                if (var6 < l.field_b) {
                  var14 = l.field_b + -var6;
                  var13 = var13 + var14;
                  var8 = var8 + var14;
                  var12 = var12 - var14;
                  var9 = var9 + var14;
                  var6 = l.field_b;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (l.field_f < var6 + var12) {
                  var14 = var12 + var6 - l.field_f;
                  var12 = var12 - var14;
                  var13 = var13 + var14;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (0 >= var12) {
                  break L6;
                } else {
                  if (-1 <= (var11 ^ -1)) {
                    break L6;
                  } else {
                    var15 = var9;
                    var16 = var10;
                    var17 = -(var12 >> 193240131);
                    var12 = -(var12 & 7);
                    var7 = -var11;
                    L7: while (true) {
                      if (0 <= var7) {
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var6 = var17;
                        L8: while (true) {
                          if (-1 >= (var6 ^ -1)) {
                            var6 = var17;
                            L9: while (true) {
                              if (var6 >= 0) {
                                var6 = var12;
                                L10: while (true) {
                                  if ((var6 ^ -1) <= -1) {
                                    var8 = var8 + var13;
                                    var16++;
                                    var15 = var9;
                                    var7++;
                                    continue L7;
                                  } else {
                                    L11: {
                                      incrementValue$0 = var8;
                                      var8++;
                                      var14 = param3.field_z[incrementValue$0];
                                      if (0 == var14) {
                                        break L11;
                                      } else {
                                        gd.field_a[var15][var16] = var5_int + (param1 - -(Math.abs(var17 * 8 + (var15 + -var9)) / 2));
                                        break L11;
                                      }
                                    }
                                    var15++;
                                    var6++;
                                    continue L10;
                                  }
                                }
                              } else {
                                L12: {
                                  incrementValue$1 = var8;
                                  var8++;
                                  var14 = param3.field_z[incrementValue$1];
                                  if (-1 != (var14 ^ -1)) {
                                    gd.field_a[var15][var16] = Math.abs(var15 - var9 + var17 * 8) / 2 + var5_int + param1;
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                L13: {
                                  var15++;
                                  incrementValue$2 = var8;
                                  var8++;
                                  var14 = param3.field_z[incrementValue$2];
                                  if (-1 != (var14 ^ -1)) {
                                    gd.field_a[var15][var16] = var5_int + param1 + Math.abs(var17 * 8 + (var15 - var9)) / 2;
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                                L14: {
                                  var15++;
                                  incrementValue$3 = var8;
                                  var8++;
                                  var14 = param3.field_z[incrementValue$3];
                                  if (0 != var14) {
                                    gd.field_a[var15][var16] = Math.abs(8 * var17 + var15 + -var9) / 2 + (param1 + var5_int);
                                    break L14;
                                  } else {
                                    break L14;
                                  }
                                }
                                L15: {
                                  var15++;
                                  incrementValue$4 = var8;
                                  var8++;
                                  var14 = param3.field_z[incrementValue$4];
                                  if (-1 != (var14 ^ -1)) {
                                    gd.field_a[var15][var16] = param1 - -var5_int + Math.abs(var17 * 8 + var15 - var9) / 2;
                                    break L15;
                                  } else {
                                    break L15;
                                  }
                                }
                                var15++;
                                var6++;
                                continue L9;
                              }
                            }
                          } else {
                            L16: {
                              incrementValue$5 = var8;
                              var8++;
                              var14 = param3.field_z[incrementValue$5];
                              if (0 != var14) {
                                gd.field_a[var15][var16] = param1 + (var5_int - -(Math.abs(var15 - var9) / 2));
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            L17: {
                              var15++;
                              incrementValue$6 = var8;
                              var8++;
                              var14 = param3.field_z[incrementValue$6];
                              if (-1 == (var14 ^ -1)) {
                                break L17;
                              } else {
                                gd.field_a[var15][var16] = param1 + var5_int - -(Math.abs(var15 + -var9) / 2);
                                break L17;
                              }
                            }
                            L18: {
                              incrementValue$7 = var8;
                              var8++;
                              var14 = param3.field_z[incrementValue$7];
                              var15++;
                              if (var14 == 0) {
                                break L18;
                              } else {
                                gd.field_a[var15][var16] = Math.abs(var15 - var9) / 2 + (param1 - -var5_int);
                                break L18;
                              }
                            }
                            L19: {
                              var15++;
                              incrementValue$8 = var8;
                              var8++;
                              var14 = param3.field_z[incrementValue$8];
                              if (var14 != 0) {
                                gd.field_a[var15][var16] = Math.abs(-var9 + var15) / 2 + param1 + var5_int;
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                            var15++;
                            var6++;
                            continue L8;
                          }
                        }
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var5 = decompiledCaughtException;
            stackIn_58_0 = (RuntimeException) (var5);

            stackIn_58_1 = new StringBuilder().append("e.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_59_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "null";
              break L20;
            } else {
              stackIn_59_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "{...}";
              break L20;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_59_0), stackIn_59_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void a(int param0, String param1, int param2) {
        th var4 = null;
        int var5 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var5 = Terraphoenix.field_V;
        try {
          L0: {
            var4 = this.field_n;
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (var4 != null) {
                    break L2;
                  } else {
                    this.field_n = new th(param0, param1, this.field_n);
                    break L2;
                  }
                }
                L3: {
                  if (param2 <= -3) {
                    break L3;
                  } else {
                    this.field_z = -33;
                    break L3;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                if (param0 == var4.field_a) {
                  if (0 != var4.field_b.compareTo(param1)) {
                    this.field_n = new th(param0, param1, this.field_n);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  var4 = var4.field_f;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4_ref);

            stackIn_17_1 = new StringBuilder().append("e.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final void a(boolean param0) {
        int var2;
        int var3;
        var3 = Terraphoenix.field_V;
        if (param0) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= this.field_C.length) {
              return;
            } else {
              if (null != this.field_C[var2]) {
                if (null == this.field_C[var2].field_Z) {
                  this.field_C[var2].field_P = 0;
                  var2++;
                  continue L0;
                } else {
                  var2++;
                  continue L0;
                }
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(Terraphoenix param0, byte param1) {
        dl dupTemp$0 = null;
        dl dupTemp$1 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        RuntimeException stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        String stackIn_117_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        r var4_ref_r = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        r var8 = null;
        int var9 = 0;
        r var10 = null;
        r var11 = null;
        var7 = Terraphoenix.field_V;
        try {
          L0: {
            this.field_L = 0;
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= 12) {
                L2: {
                  var4 = 100 % ((param1 - 17) / 46);
                  this.b((byte) -3);
                  this.field_D = null;
                  stackIn_9_0 = this;

                  if (this.field_J) {
                    stackIn_10_0 = this;
                    stackIn_10_1 = 0;
                    break L2;
                  } else {
                    stackIn_10_0 = this;
                    stackIn_10_1 = 1;
                    break L2;
                  }
                }
                L3: {
                  ((e) (this)).field_J = stackIn_10_1 != 0;
                  if (!this.field_J) {
                    break L3;
                  } else {
                    jh.field_n = jh.field_n + 1;
                    break L3;
                  }
                }
                L4: {
                  if (this.field_J) {
                    break L4;
                  } else {
                    L5: {
                      if (12 == param0.field_Bb) {
                        break L5;
                      } else {
                        if (13 == param0.field_Bb) {
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L6: {
                      if (Math.random() * 100.0 >= 50.0) {
                        break L6;
                      } else {
                        if (this.field_h.field_f[this.field_h.field_b / 2][2].field_z) {
                          break L6;
                        } else {
                          if (this.field_h.a(this.field_h.field_b / 2, false, 0, 2)) {
                            break L6;
                          } else {
                            var3_int = 0;
                            var4_ref_r = this.field_C[0];
                            L7: while (true) {
                              L8: {
                                if (var4_ref_r == null) {
                                  break L8;
                                } else {
                                  if ((this.field_C.length + -1 ^ -1) >= (var3_int ^ -1)) {
                                    break L8;
                                  } else {
                                    var3_int++;
                                    var4_ref_r = this.field_C[var3_int];
                                    continue L7;
                                  }
                                }
                              }
                              if (var4_ref_r != null) {
                                break L6;
                              } else {
                                this.field_C[var3_int] = new r(4, param0.field_Bb);
                                var10 = this.field_C[var3_int];
                                var10.field_F = this.field_h.field_b / 2;
                                var10.field_H = 2;
                                var10.field_c = this.field_h.field_f[this.field_h.field_b / 2][2];
                                var10.field_c.field_h = var10;
                                break L6;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (50.0 <= Math.random() * 100.0) {
                      break L4;
                    } else {
                      if (this.field_h.field_f[2][this.field_h.field_e / 2].field_z) {
                        break L4;
                      } else {
                        if (this.field_h.a(2, false, 0, this.field_h.field_e / 2)) {
                          break L4;
                        } else {
                          var3_int = 0;
                          var4_ref_r = this.field_C[0];
                          L9: while (true) {
                            L10: {
                              if (var4_ref_r == null) {
                                break L10;
                              } else {
                                stackIn_31_0 = var3_int;
                                stackIn_31_1 = this.field_C.length - 1;
                                if (stackIn_31_0 >= stackIn_31_1) {
                                  break L10;
                                } else {
                                  var3_int++;
                                  var4_ref_r = this.field_C[var3_int];
                                  continue L9;
                                }
                              }
                            }
                            if (var4_ref_r == null) {
                              this.field_C[var3_int] = new r(4, param0.field_Bb);
                              var8 = this.field_C[var3_int];
                              var11 = var8;
                              var11.field_F = 2;
                              var11.field_H = this.field_h.field_e / 2;
                              var8.field_c = this.field_h.field_f[2][this.field_h.field_e / 2];
                              var11.field_c.field_h = var11;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                var3_int = 0;
                var5 = 0;
                L11: while (true) {
                  if (this.field_h.field_b <= var5) {
                    var4 = 0;
                    this.field_A = false;
                    var5 = 0;
                    L12: while (true) {
                      if (var5 >= this.field_C.length) {
                        L13: {
                          if (!this.field_J) {
                            break L13;
                          } else {
                            if (null != this.field_q) {
                              lg.field_c = -(this.field_q.field_E * 48) + 16 * (this.field_q.field_F + this.field_q.field_H);
                              eg.field_p = this.field_q.field_E;
                              sj.field_b = 32 * (this.field_q.field_F - this.field_q.field_H);
                              this.a(-1);
                              this.field_d = this.field_d + 1;
                              this.field_m = false;
                              this.field_L = 0;
                              jm.field_h = 0;
                              this.field_k = lg.field_c;
                              this.field_E = eg.field_p;
                              this.field_c = sj.field_b;
                              this.field_K = mc.field_a + this.field_d;
                              this.field_a = this.field_q.field_F;
                              this.field_x = this.field_q.field_H;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                        }
                        L14: {
                          if (this.field_A) {
                            break L14;
                          } else {
                            if (-1 <= (this.field_z ^ -1)) {
                              break L14;
                            } else {
                              if (this.field_J) {
                                if (-1 > (this.field_z ^ -1)) {
                                  this.field_z = this.field_z - 1;
                                  if ((this.field_z ^ -1) >= -1) {
                                    qd.a((byte) 57, 90);
                                    this.a(0, param0);
                                    break L14;
                                  } else {
                                    if (-4 <= (this.field_z ^ -1)) {
                                      qd.a((byte) 91, 89);
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                } else {
                                  break L14;
                                }
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                        L15: {
                          if (!this.field_A) {
                            break L15;
                          } else {
                            if (4 <= this.field_z) {
                              break L15;
                            } else {
                              if (!this.field_J) {
                                break L15;
                              } else {
                                if (this.field_z <= 0) {
                                  break L15;
                                } else {
                                  this.field_z = 4;
                                  break L15;
                                }
                              }
                            }
                          }
                        }
                        L16: {
                          L17: {
                            L18: {
                              if (-1 != (var4 ^ -1)) {
                                break L18;
                              } else {
                                if (!this.field_J) {
                                  break L17;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            if (var3_int != 0) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                          this.a(-125, param0);
                          break L16;
                        }
                        this.field_h.b((byte) -19);
                        break L0;
                      } else {
                        L19: {
                          if (this.field_C[var5] == null) {
                            break L19;
                          } else {
                            if (-1 <= (this.field_C[var5].field_P ^ -1)) {
                              break L19;
                            } else {
                              L20: {
                                if (null != this.field_C[var5].field_Z) {
                                  break L20;
                                } else {
                                  if (this.field_C[var5].field_C != 0) {
                                    L21: {
                                      if ((this.field_C[var5].field_C ^ -1) != -2) {
                                        break L21;
                                      } else {
                                        var4++;
                                        break L21;
                                      }
                                    }
                                    L22: {
                                      if (this.field_J) {
                                        this.field_C[var5].f(106);
                                        break L22;
                                      } else {
                                        this.field_C[var5].b(60);
                                        break L22;
                                      }
                                    }
                                    this.field_C[var5].field_k = false;
                                    var9 = 0;
                                    var6 = var9;
                                    L23: while (true) {
                                      if (this.field_C.length <= var9) {
                                        break L19;
                                      } else {
                                        L24: {
                                          if (this.field_C[var9] == null) {
                                            break L24;
                                          } else {
                                            if (-1 != (this.field_C[var9].field_C ^ -1)) {
                                              break L24;
                                            } else {
                                              if ((this.field_C[var9].field_P ^ -1) >= -1) {
                                                break L24;
                                              } else {
                                                if (this.field_C[var5].field_E == this.field_C[var9].field_E) {
                                                  if (!this.field_h.a((byte) -93, this.field_C[var9], this.field_C[var5])) {
                                                    break L24;
                                                  } else {
                                                    this.field_C[var5].field_k = true;
                                                    this.field_C[var5].field_h = true;
                                                    this.field_C[var5].field_i = this.field_C[var5].field_F;
                                                    this.field_C[var5].field_gb = this.field_C[var5].field_H;
                                                    break L24;
                                                  }
                                                } else {
                                                  break L24;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var9++;
                                        continue L23;
                                      }
                                    }
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              L25: {
                                var3_int++;
                                if (this.field_z <= 0) {
                                  break L25;
                                } else {
                                  if (this.field_C[var5].field_c == null) {
                                    break L25;
                                  } else {
                                    if (!this.field_C[var5].field_c.field_d) {
                                      break L25;
                                    } else {
                                      this.field_A = true;
                                      break L25;
                                    }
                                  }
                                }
                              }
                              L26: {
                                if (this.field_C[var5].field_Z == null) {
                                  break L26;
                                } else {
                                  if (null == this.field_C[var5].field_c) {
                                    break L26;
                                  } else {
                                    this.field_q = this.field_C[var5];
                                    break L26;
                                  }
                                }
                              }
                              if (!this.field_J) {
                                this.field_C[var5].f(100);
                                break L19;
                              } else {
                                this.field_C[var5].b(60);
                                break L19;
                              }
                            }
                          }
                        }
                        var5++;
                        continue L12;
                      }
                    }
                  } else {
                    var6 = 0;
                    L27: while (true) {
                      if (var6 >= this.field_h.field_e) {
                        var5++;
                        continue L11;
                      } else {
                        L28: {
                          this.field_h.field_f[var5][var6].field_B = false;
                          if (0 < this.field_h.field_f[var5][var6].field_i) {
                            L29: {
                              if (-1 <= (1 & this.field_h.field_f[var5][var6].field_i ^ -1)) {
                                break L29;
                              } else {
                                if (-4 == (this.field_h.field_f[var5][var6].field_g % 4 ^ -1)) {
                                  dupTemp$0 = this.field_h.field_f[var5][var6];
                                  dupTemp$0.field_g = dupTemp$0.field_g - 3;
                                  this.field_h.field_f[var5][var6].a(1, true, 114);
                                  break L29;
                                } else {
                                  break L29;
                                }
                              }
                            }
                            if (0 < (2 & this.field_h.field_f[var5][var6].field_i)) {
                              if (this.field_h.field_f[var5][var6].field_k % 4 == 3) {
                                dupTemp$1 = this.field_h.field_f[var5][var6];
                                dupTemp$1.field_k = dupTemp$1.field_k - 3;
                                this.field_h.field_f[var5][var6].a(2, true, 87);
                                break L28;
                              } else {
                                break L28;
                              }
                            } else {
                              var6++;
                              continue L27;
                            }
                          } else {
                            break L28;
                          }
                        }
                        var6++;
                        continue L27;
                      }
                    }
                  }
                }
              } else {
                L30: {
                  if (this.field_C[var3_int] == null) {
                    break L30;
                  } else {
                    if (this.field_C[var3_int].field_Z == null) {
                      break L30;
                    } else {
                      this.field_C[var3_int].field_ob = false;
                      break L30;
                    }
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L31: {
            var3 = decompiledCaughtException;
            stackIn_116_0 = (RuntimeException) (var3);

            stackIn_116_1 = new StringBuilder().append("e.O(");

            if (param0 == null) {
              stackIn_117_0 = (RuntimeException) ((Object) stackIn_116_0);
              stackIn_117_1 = (StringBuilder) ((Object) stackIn_116_1);
              stackIn_117_2 = "null";
              break L31;
            } else {
              stackIn_117_0 = (RuntimeException) ((Object) stackIn_116_0);
              stackIn_117_1 = (StringBuilder) ((Object) stackIn_116_1);
              stackIn_117_2 = "{...}";
              break L31;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_117_0), stackIn_117_2 + ',' + param1 + ')');
        }
    }

    final void b(int param0, Terraphoenix param1) {
        r dupTemp$0 = null;
        r dupTemp$1 = null;
        r dupTemp$2 = null;
        r dupTemp$3 = null;
        dl dupTemp$4 = null;
        dl dupTemp$5 = null;
        dl dupTemp$6 = null;
        dl dupTemp$7 = null;
        int stackIn_58_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        dl stackIn_155_0 = null;
        Object stackIn_203_0 = null;
        r stackIn_203_1 = null;
        Object stackIn_336_0 = null;
        r stackIn_336_1 = null;
        int stackIn_346_0 = 0;
        int stackIn_352_0 = 0;
        int stackIn_386_0 = 0;
        r stackIn_510_0 = null;
        RuntimeException stackIn_521_0 = null;
        StringBuilder stackIn_521_1 = null;
        RuntimeException stackIn_522_0 = null;
        StringBuilder stackIn_522_1 = null;
        String stackIn_522_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        th var4 = null;
        int var5 = 0;
        int var6 = 0;
        dl var7_ref_dl = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var12 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (null != le.field_q) {
                le.field_q.a(false);
                break L1;
              } else {
                break L1;
              }
            }
            hl.field_a = false;
            if (!this.field_u) {
              L2: {
                if (1 == this.field_N) {
                  this.field_u = true;
                  var3_int = 0;
                  var4_int = 0;
                  L3: while (true) {
                    if (var4_int >= ak.field_q) {
                      this.field_u = false;
                      break L2;
                    } else {
                      L4: {
                        if (null == this.field_C[var4_int]) {
                          break L4;
                        } else {
                          if (this.field_C[var4_int].field_c != null) {
                            break L4;
                          } else {
                            if (var3_int >= 1) {
                              this.field_u = false;
                              break L4;
                            } else {
                              var3_int++;
                              var5 = 0;
                              var6 = 1;
                              L5: while (true) {
                                L6: {
                                  var10 = 1;
                                  var8 = (int)((double)(-var6) + (double)var6 * Math.random() * 2.0) - -uf.field_c;
                                  if (1 > var8) {
                                    var8 = 1;
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                                L7: {
                                  var9 = (int)((double)(-var6) + 2.0 * (Math.random() * (double)var6)) - -vf.field_a;
                                  if ((var9 ^ -1) <= -2) {
                                    break L7;
                                  } else {
                                    var9 = 1;
                                    break L7;
                                  }
                                }
                                L8: {
                                  if (-2 + this.field_h.field_b < var8) {
                                    var8 = -2 + this.field_h.field_b;
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                L9: {
                                  if (this.field_h.field_e - 2 >= var9) {
                                    break L9;
                                  } else {
                                    var9 = this.field_h.field_e - 2;
                                    break L9;
                                  }
                                }
                                L10: {
                                  this.field_C[var4_int].field_F = var8;
                                  var5++;
                                  this.field_C[var4_int].field_H = var9;
                                  var7_ref_dl = this.field_h.a(109, this.field_C[var4_int].field_H, 0, this.field_C[var4_int].field_F);
                                  if (var5 <= 10) {
                                    break L10;
                                  } else {
                                    var5 = 0;
                                    var6++;
                                    break L10;
                                  }
                                }
                                L11: {
                                  if (2 != this.field_h.field_a) {
                                    break L11;
                                  } else {
                                    L12: {
                                      this.field_C[var4_int].a(true, this.field_h.field_b / 2, this.field_h.field_e / 2);
                                      dupTemp$0 = this.field_C[var4_int];
                                      dupTemp$0.field_U = dupTemp$0.field_U + 4;
                                      if (8 <= this.field_C[var4_int].field_U) {
                                        dupTemp$1 = this.field_C[var4_int];
                                        dupTemp$1.field_U = dupTemp$1.field_U - 8;
                                        break L12;
                                      } else {
                                        break L12;
                                      }
                                    }
                                    L13: {
                                      var11 = this.field_h.field_b / 4;
                                      if (param1.field_Bb == 11) {
                                        var11 = this.field_h.field_b / 8 - -1;
                                        break L13;
                                      } else {
                                        break L13;
                                      }
                                    }
                                    L14: {
                                      L15: {
                                        if (var8 < -var11 + this.field_h.field_b / 2) {
                                          break L15;
                                        } else {
                                          if (var8 > var11 + this.field_h.field_b / 2) {
                                            break L15;
                                          } else {
                                            if (this.field_h.field_e / 2 + -var11 > var9) {
                                              break L15;
                                            } else {
                                              if (this.field_h.field_e / 2 - -var11 >= var9) {
                                                break L14;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var10 = 0;
                                      break L14;
                                    }
                                    if (var9 >= this.field_h.field_e / 2 + -var11 + 3) {
                                      break L11;
                                    } else {
                                      if (this.field_h.field_b / 2 - 1 > var8) {
                                        break L11;
                                      } else {
                                        if (var8 > this.field_h.field_b / 2 - -1) {
                                          break L11;
                                        } else {
                                          var10 = 0;
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                }
                                L16: {
                                  if (this.field_h.field_a == 3) {
                                    this.field_C[var4_int].a(true, this.field_h.field_b / 2, this.field_h.field_e / 2);
                                    if (var8 <= this.field_h.field_b / 8) {
                                      break L16;
                                    } else {
                                      if (this.field_h.field_b * 7 / 8 <= var8) {
                                        break L16;
                                      } else {
                                        if (this.field_h.field_e / 8 >= var9) {
                                          break L16;
                                        } else {
                                          if (this.field_h.field_e * 7 / 8 <= var9) {
                                            break L16;
                                          } else {
                                            var10 = 0;
                                            break L16;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L16;
                                  }
                                }
                                L17: {
                                  L18: {
                                    if (-5 == (this.field_h.field_a ^ -1)) {
                                      break L18;
                                    } else {
                                      if (1 == this.field_h.field_a) {
                                        break L18;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  this.field_C[var4_int].a(true, this.field_h.field_b / 2, this.field_h.field_e / 2);
                                  break L17;
                                }
                                L19: {
                                  if ((this.field_h.field_f[this.field_C[var4_int].field_F][this.field_C[var4_int].field_H].field_v ^ -1) > -4) {
                                    break L19;
                                  } else {
                                    var10 = 0;
                                    break L19;
                                  }
                                }
                                L20: {
                                  stackIn_58_0 = 0;

                                  if (var10 != 0) {
                                    stackIn_59_0 = stackIn_58_0;
                                    stackIn_59_1 = 0;
                                    break L20;
                                  } else {
                                    stackIn_59_0 = stackIn_58_0;
                                    stackIn_59_1 = 1;
                                    break L20;
                                  }
                                }
                                if (stackIn_59_0 != stackIn_59_1) {
                                  continue L5;
                                } else {
                                  if (this.field_h.a(this.field_C[var4_int].field_F, false, 0, this.field_C[var4_int].field_H)) {
                                    continue L5;
                                  } else {
                                    if (var7_ref_dl.field_d) {
                                      continue L5;
                                    } else {
                                      L21: {
                                        this.field_h.field_f[this.field_C[var4_int].field_F][this.field_C[var4_int].field_H].field_h = this.field_C[var4_int];
                                        this.field_C[var4_int].field_c = this.field_h.field_f[this.field_C[var4_int].field_F][this.field_C[var4_int].field_H];
                                        this.field_q = this.field_C[var4_int];
                                        lg.field_c = 16 * (this.field_q.field_F - -this.field_q.field_H);
                                        eg.field_p = this.field_q.field_E;
                                        sj.field_b = (-this.field_q.field_H + this.field_q.field_F) * 32;
                                        if (null == this.field_C[var4_int].field_nb) {
                                          qd.a((byte) 127, od.field_c[this.field_C[var4_int].field_eb.field_g].field_n);
                                          break L21;
                                        } else {
                                          qd.a((byte) 114, od.field_c[this.field_C[var4_int].field_nb.field_g].field_n);
                                          break L21;
                                        }
                                      }
                                      this.a(-1);
                                      break L4;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      var4_int++;
                      continue L3;
                    }
                  }
                } else {
                  break L2;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = 1;
              var13 = 0;
              var4_int = var13;
              L22: while (true) {
                if (-13 >= (var13 ^ -1)) {
                  L23: {
                    if (var3_int != 0) {
                      this.a(29518, 2);
                      this.a(-1, rf.field_s, -41);
                      this.field_b = true;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if (null == this.field_n) {
                      break L24;
                    } else {
                      if (!this.field_n.field_h) {
                        break L24;
                      } else {
                        if ((this.field_n.field_d ^ -1) < -1) {
                          break L24;
                        } else {
                          this.field_n = this.field_n.field_f;
                          break L24;
                        }
                      }
                    }
                  }
                  L25: {
                    var4 = this.field_n;
                    if (var4 != null) {
                      break L25;
                    } else {
                      if (this.field_b) {
                        L26: {
                          if (!this.field_v) {
                            break L26;
                          } else {
                            var5 = 0;
                            L27: while (true) {
                              if (var5 >= this.field_C.length) {
                                break L26;
                              } else {
                                L28: {
                                  if (this.field_C[var5] == null) {
                                    break L28;
                                  } else {
                                    if (this.field_C[var5].field_Z == null) {
                                      if (0 < this.field_C[var5].field_P) {
                                        this.field_C[var5] = null;
                                        break L28;
                                      } else {
                                        this.field_C[var5].field_nb = null;
                                        this.field_C[var5].field_b = null;
                                        break L28;
                                      }
                                    } else {
                                      break L28;
                                    }
                                  }
                                }
                                if (this.field_C[var5] != null) {
                                  L29: {
                                    if (null != this.field_C[var5].field_Z) {
                                      if (-1 <= (this.field_C[var5].field_P ^ -1)) {
                                        L30: {
                                          if ((this.field_C[var5].field_P + this.field_C[var5].field_T ^ -1) >= -1) {
                                            this.field_e.field_k = this.field_e.field_k + 1;
                                            break L30;
                                          } else {
                                            this.field_e.field_f = this.field_e.field_f + 1;
                                            break L30;
                                          }
                                        }
                                        this.field_C[var5] = null;
                                        break L29;
                                      } else {
                                        var5++;
                                        continue L27;
                                      }
                                    } else {
                                      break L29;
                                    }
                                  }
                                  var5++;
                                  continue L27;
                                } else {
                                  var5++;
                                  continue L27;
                                }
                              }
                            }
                          }
                        }
                        L31: {
                          if (!this.field_r) {
                            break L31;
                          } else {
                            var5 = 0;
                            L32: while (true) {
                              if (var5 >= this.field_C.length) {
                                break L31;
                              } else {
                                L33: {
                                  if (null == this.field_C[var5]) {
                                    break L33;
                                  } else {
                                    if (this.field_C[var5].field_c.field_d) {
                                      L34: {
                                        if (this.field_C[var5].field_Z != null) {
                                          if ((this.field_C[var5].field_T + this.field_C[var5].field_P ^ -1) < -1) {
                                            this.field_e.field_h = this.field_e.field_h + 1;
                                            break L34;
                                          } else {
                                            this.field_e.field_k = this.field_e.field_k + 1;
                                            break L34;
                                          }
                                        } else {
                                          if ((this.field_C[var5].field_P ^ -1) >= -1) {
                                            L35: {
                                              if ((this.field_C[var5].field_t ^ -1) != -5) {
                                                if (-10 == (this.field_C[var5].field_t ^ -1)) {
                                                  this.field_e.field_m = this.field_e.field_m + 1;
                                                  break L35;
                                                } else {
                                                  this.field_e.field_j = this.field_e.field_j + 1;
                                                  break L35;
                                                }
                                              } else {
                                                break L35;
                                              }
                                            }
                                            if (-5 == (this.field_C[var5].field_t ^ -1)) {
                                              this.field_e.field_b = this.field_e.field_b + 1;
                                              break L34;
                                            } else {
                                              break L34;
                                            }
                                          } else {
                                            break L34;
                                          }
                                        }
                                      }
                                      this.field_C[var5] = null;
                                      break L33;
                                    } else {
                                      break L33;
                                    }
                                  }
                                }
                                if (this.field_C[var5] != null) {
                                  if (this.field_C[var5].field_Z == null) {
                                    L36: {
                                      if (-1 > (this.field_C[var5].field_P ^ -1)) {
                                        this.field_C[var5] = null;
                                        break L36;
                                      } else {
                                        break L36;
                                      }
                                    }
                                    var5++;
                                    continue L32;
                                  } else {
                                    var5++;
                                    continue L32;
                                  }
                                } else {
                                  var5++;
                                  continue L32;
                                }
                              }
                            }
                          }
                        }
                        this.a(41, param1);
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        break L25;
                      }
                    }
                  }
                  L37: while (true) {
                    if (var4 == null) {
                      L38: {
                        if (ja.field_n <= 0) {
                          break L38;
                        } else {
                          ja.field_n = ja.field_n - 1;
                          break L38;
                        }
                      }
                      var6 = 0;
                      var5 = 0;
                      L39: while (true) {
                        if (var5 >= this.field_C.length) {
                          L40: {
                            if (null == this.field_K) {
                              break L40;
                            } else {
                              if (le.field_q == null) {
                                break L40;
                              } else {
                                if ("" == le.field_q.field_o) {
                                  this.field_K = null;
                                  break L40;
                                } else {
                                  break L40;
                                }
                              }
                            }
                          }
                          L41: {
                            ok.field_i = false;
                            if (param0 == -1) {
                              break L41;
                            } else {
                              this.field_s = 75;
                              break L41;
                            }
                          }
                          L42: {
                            q.field_Ib = false;
                            if (!this.field_J) {
                              break L42;
                            } else {
                              q.field_Ib = true;
                              break L42;
                            }
                          }
                          var7 = 0;
                          var5 = 0;
                          L43: while (true) {
                            if (50 <= var5) {
                              var5 = 0;
                              L44: while (true) {
                                if (var5 >= this.field_C.length) {
                                  L45: {
                                    if (!li.field_a) {
                                      break L45;
                                    } else {
                                      var6 = 1;
                                      break L45;
                                    }
                                  }
                                  L46: {
                                    if (this.field_w) {
                                      this.field_h.c((byte) -96);
                                      break L46;
                                    } else {
                                      break L46;
                                    }
                                  }
                                  L47: {
                                    if (var6 != 0) {
                                      var8 = 0;
                                      L48: while (true) {
                                        if (var8 >= 12) {
                                          break L47;
                                        } else {
                                          if (this.field_C[var8] != null) {
                                            L49: {
                                              if (this.field_C[var8].field_Z != null) {
                                                this.field_C[var8].field_ob = false;
                                                break L49;
                                              } else {
                                                break L49;
                                              }
                                            }
                                            var8++;
                                            continue L48;
                                          } else {
                                            var8++;
                                            continue L48;
                                          }
                                        }
                                      }
                                    } else {
                                      break L47;
                                    }
                                  }
                                  L50: {
                                    if (var6 == 0) {
                                      if (this.field_J) {
                                        this.a(param1, true);
                                        break L50;
                                      } else {
                                        this.a(22341, param1, var7 != 0);
                                        break L50;
                                      }
                                    } else {
                                      break L50;
                                    }
                                  }
                                  L51: {
                                    if (0 > this.field_B) {
                                      break L51;
                                    } else {
                                      if ((this.field_B ^ -1) <= -17) {
                                        break L51;
                                      } else {
                                        stackIn_510_0 = this.field_C[9];
                                        L52: {
                                          if (stackIn_510_0.field_k) {
                                            break L52;
                                          } else {
                                            if (this.field_C[10].field_k) {
                                              break L52;
                                            } else {
                                              if (this.field_C[11].field_k) {
                                                break L52;
                                              } else {
                                                if (this.field_C[6].field_P <= 0) {
                                                  break L52;
                                                } else {
                                                  if (-1 > (this.field_C[7].field_P ^ -1)) {
                                                    break L51;
                                                  } else {
                                                    break L52;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        this.field_B = 16;
                                        break L51;
                                      }
                                    }
                                  }
                                  ha.field_o = false;
                                  decompiledRegionSelector0 = 2;
                                  break L0;
                                } else {
                                  L53: {
                                    if (null != this.field_C[var5]) {
                                      if (this.field_C[var5].field_S) {
                                        this.field_C[var5].a(var7 != 0, (byte) -127);
                                        var6 = 1;
                                        break L53;
                                      } else {
                                        break L53;
                                      }
                                    } else {
                                      break L53;
                                    }
                                  }
                                  var5++;
                                  continue L44;
                                }
                              }
                            } else {
                              if (null != this.field_F[var5]) {
                                L54: {
                                  if (null != this.field_F[var5].field_e) {
                                    break L54;
                                  } else {
                                    var7 = 1;
                                    break L54;
                                  }
                                }
                                this.field_F[var5] = this.field_F[var5].a((byte) 11);
                                var5++;
                                continue L43;
                              } else {
                                var5++;
                                continue L43;
                              }
                            }
                          }
                        } else {
                          stackIn_336_0 = null;
                          stackIn_336_1 = this.field_C[var5];
                          L55: {
                            if (stackIn_336_0 == stackIn_336_1) {
                              break L55;
                            } else {
                              L56: {
                                if (0 >= this.field_C[var5].field_cb) {
                                  break L56;
                                } else {
                                  dupTemp$2 = this.field_C[var5];
                                  dupTemp$2.field_cb = dupTemp$2.field_cb - 8;
                                  break L56;
                                }
                              }
                              L57: {
                                if (this.field_C[var5].field_ib) {
                                  break L57;
                                } else {
                                  if (this.field_C[var5].field_Z != null) {
                                    L58: {
                                      if (0 < this.field_C[var5].field_P) {
                                        break L58;
                                      } else {
                                        if (null != this.field_K) {
                                          break L58;
                                        } else {
                                          param1.field_Y = false;
                                          dupTemp$3 = this.field_C[var5];
                                          dupTemp$3.field_p = dupTemp$3.field_p + 1;
                                          if (-26 > (this.field_C[var5].field_p ^ -1)) {
                                            L59: {
                                              this.field_a = this.field_C[var5].field_F;
                                              this.field_x = this.field_C[var5].field_H;
                                              this.field_c = sj.field_b;
                                              this.field_k = lg.field_c;
                                              this.field_E = eg.field_p;
                                              eg.field_p = this.field_C[var5].field_E;
                                              this.field_K = this.field_C[var5].field_Z.b(1) + aa.field_r;
                                              if (-1 <= (this.field_C[var5].field_T ^ -1)) {
                                                break L59;
                                              } else {
                                                this.field_K = this.field_C[var5].field_Z.b(1) + d.field_O;
                                                break L59;
                                              }
                                            }
                                            this.field_C[var5].field_ib = true;
                                            qd.a((byte) 126, 3);
                                            break L57;
                                          } else {
                                            break L57;
                                          }
                                        }
                                      }
                                    }
                                    if (-1 > (this.field_C[var5].field_P ^ -1)) {
                                      this.field_C[var5].field_p = 0;
                                      break L57;
                                    } else {
                                      this.field_C[var5].field_p = 26;
                                      break L57;
                                    }
                                  } else {
                                    if (-8 == (this.field_C[var5].field_t ^ -1)) {
                                      break L57;
                                    } else {
                                      L60: {
                                        if (!this.field_J) {
                                          break L60;
                                        } else {
                                          L61: {
                                            if (this.field_C[var5].field_k) {
                                              stackIn_346_0 = 0;
                                              break L61;
                                            } else {
                                              stackIn_346_0 = 1;
                                              break L61;
                                            }
                                          }
                                          if (stackIn_346_0 == 1) {
                                            break L60;
                                          } else {
                                            if (this.field_q == null) {
                                              break L60;
                                            } else {
                                              L62: {
                                                if (this.field_q.field_B == 1) {
                                                  break L62;
                                                } else {
                                                  L63: {
                                                    if (this.field_q.field_S) {
                                                      stackIn_352_0 = 0;
                                                      break L63;
                                                    } else {
                                                      stackIn_352_0 = 1;
                                                      break L63;
                                                    }
                                                  }
                                                  if (stackIn_352_0 == 0) {
                                                    break L60;
                                                  } else {
                                                    break L62;
                                                  }
                                                }
                                              }
                                              if (-1 <= (this.field_C[var5].field_P ^ -1)) {
                                                break L60;
                                              } else {
                                                if (this.field_h.a((byte) -93, this.field_q, this.field_C[var5])) {
                                                  L64: {
                                                    if (!this.field_J) {
                                                      break L64;
                                                    } else {
                                                      if (this.field_q == null) {
                                                        break L64;
                                                      } else {
                                                        L65: {
                                                          if (this.field_q.field_d == 0) {
                                                            break L65;
                                                          } else {
                                                            if (1 != this.field_q.field_d) {
                                                              break L64;
                                                            } else {
                                                              break L65;
                                                            }
                                                          }
                                                        }
                                                        if (-1 == (this.field_q.field_B ^ -1)) {
                                                          break L64;
                                                        } else {
                                                          this.field_q.field_X = this.field_q.field_F;
                                                          this.field_q.field_n = this.field_q.field_H;
                                                          this.field_q.field_r = null;
                                                          break L64;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  L66: {
                                                    if (!this.field_C[var5].field_l) {
                                                      this.field_C[var5].field_l = true;
                                                      this.field_a = this.field_C[var5].field_F;
                                                      this.field_x = this.field_C[var5].field_H;
                                                      this.field_k = lg.field_c;
                                                      this.field_c = sj.field_b;
                                                      this.field_E = eg.field_p;
                                                      eg.field_p = this.field_C[var5].field_E;
                                                      this.field_K = ib.field_X;
                                                      if (-2 < (this.field_C[var5].field_t ^ -1)) {
                                                        break L66;
                                                      } else {
                                                        this.field_K = p.field_d;
                                                        break L66;
                                                      }
                                                    } else {
                                                      break L66;
                                                    }
                                                  }
                                                  this.field_C[var5].field_ib = true;
                                                  qd.a((byte) 26, 3);
                                                  break L57;
                                                } else {
                                                  break L60;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      this.field_C[var5].field_p = 0;
                                      break L57;
                                    }
                                  }
                                }
                              }
                              L67: {
                                if (7 == this.field_C[var5].field_t) {
                                  break L67;
                                } else {
                                  if (this.field_C[var5].field_Z == null) {
                                    if (this.field_C[var5].field_d != 5) {
                                      break L67;
                                    } else {
                                      L68: {
                                        if (this.field_C[var5].field_S) {
                                          stackIn_386_0 = 0;
                                          break L68;
                                        } else {
                                          stackIn_386_0 = 1;
                                          break L68;
                                        }
                                      }
                                      if (stackIn_386_0 == 1) {
                                        this.field_C[var5].field_d = 6;
                                        break L67;
                                      } else {
                                        break L67;
                                      }
                                    }
                                  } else {
                                    break L67;
                                  }
                                }
                              }
                              if ((this.field_C[var5].field_P ^ -1) < -1) {
                                L69: {
                                  if (-1 <= (1 & this.field_h.a(112, this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F).field_i ^ -1)) {
                                    break L69;
                                  } else {
                                    if (this.field_h.a(-63, this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F).field_g % 4 == 0) {
                                      dupTemp$4 = this.field_C[var5].field_c;
                                      dupTemp$4.field_g = dupTemp$4.field_g + 3;
                                      this.field_C[var5].field_c.a(1, true, -114);
                                      if (24 <= this.field_C[var5].field_c.field_g) {
                                        qd.a((byte) 84, 86);
                                        break L69;
                                      } else {
                                        qd.a((byte) 125, 87);
                                        break L69;
                                      }
                                    } else {
                                      break L69;
                                    }
                                  }
                                }
                                L70: {
                                  if (-1 <= (this.field_h.a(param0 + -35, this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F).field_i & 2 ^ -1)) {
                                    break L70;
                                  } else {
                                    if (0 != this.field_h.a(-124, this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F).field_k % 4) {
                                      break L70;
                                    } else {
                                      dupTemp$5 = this.field_C[var5].field_c;
                                      dupTemp$5.field_k = dupTemp$5.field_k + 3;
                                      this.field_C[var5].field_c.a(2, true, 81);
                                      if (this.field_C[var5].field_c.field_k >= 24) {
                                        qd.a((byte) 54, 86);
                                        break L70;
                                      } else {
                                        qd.a((byte) 70, 87);
                                        break L70;
                                      }
                                    }
                                  }
                                }
                                L71: {
                                  if ((4 & this.field_h.a(105, this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F).field_i) <= 0) {
                                    break L71;
                                  } else {
                                    if (this.field_h.a(127, this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F + 1).field_g % 4 == 0) {
                                      dupTemp$6 = this.field_h.a(param0 ^ -112, this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F - -1);
                                      dupTemp$6.field_g = dupTemp$6.field_g + 3;
                                      this.field_h.a(98, this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F + 1).a(1, true, -111);
                                      if ((this.field_h.a(-64, this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F + 1).field_g ^ -1) > -25) {
                                        qd.a((byte) 82, 87);
                                        break L71;
                                      } else {
                                        qd.a((byte) 101, 86);
                                        break L71;
                                      }
                                    } else {
                                      break L71;
                                    }
                                  }
                                }
                                L72: {
                                  if ((this.field_h.a(param0 ^ 72, this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F).field_i & 8 ^ -1) >= -1) {
                                    break L72;
                                  } else {
                                    if (this.field_h.a(param0 + -116, 1 + this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F).field_k % 4 == 0) {
                                      dupTemp$7 = this.field_h.a(91, this.field_C[var5].field_H + 1, this.field_C[var5].field_E, this.field_C[var5].field_F);
                                      dupTemp$7.field_k = dupTemp$7.field_k + 3;
                                      this.field_h.a(86, 1 + this.field_C[var5].field_H, this.field_C[var5].field_E, this.field_C[var5].field_F).a(2, true, -113);
                                      if (-25 >= (this.field_h.a(param0 + -78, this.field_C[var5].field_H - -1, this.field_C[var5].field_E, this.field_C[var5].field_F).field_k ^ -1)) {
                                        qd.a((byte) 116, 86);
                                        break L72;
                                      } else {
                                        qd.a((byte) 36, 87);
                                        break L72;
                                      }
                                    } else {
                                      break L72;
                                    }
                                  }
                                }
                                if ((this.field_C[var5].field_C ^ -1) == -2) {
                                  L73: {
                                    L74: {
                                      if (this.field_C[var5].field_k) {
                                        break L74;
                                      } else {
                                        if ((this.field_C[var5].field_t ^ -1) != -7) {
                                          break L73;
                                        } else {
                                          break L74;
                                        }
                                      }
                                    }
                                    this.field_C[var5].field_h = true;
                                    this.field_C[var5].field_i = this.field_C[var5].field_F;
                                    this.field_C[var5].field_gb = this.field_C[var5].field_H;
                                    this.field_C[var5].field_R = this.field_C[var5].field_E;
                                    this.field_C[var5].field_k = false;
                                    break L73;
                                  }
                                  var7 = 0;
                                  var8 = 0;
                                  L75: while (true) {
                                    if (this.field_C.length <= var8) {
                                      L76: {
                                        if (this.field_C[var5].field_k) {
                                          break L76;
                                        } else {
                                          if (var7 == 0) {
                                            break L55;
                                          } else {
                                            break L76;
                                          }
                                        }
                                      }
                                      this.field_C[var5].field_h = false;
                                      break L55;
                                    } else {
                                      L77: {
                                        if (null == this.field_C[var8]) {
                                          break L77;
                                        } else {
                                          if (this.field_C[var8].field_C != 0) {
                                            break L77;
                                          } else {
                                            if (this.field_C[var8].field_P > 0) {
                                              L78: {
                                                if (!this.field_h.a((byte) -93, this.field_C[var8], this.field_C[var5])) {
                                                  if (!this.field_C[var5].field_h) {
                                                    break L78;
                                                  } else {
                                                    if (!this.field_h.a(param0 + 10057, this.field_C[var5], this.field_C[var8], true)) {
                                                      break L78;
                                                    } else {
                                                      var7 = 1;
                                                      break L78;
                                                    }
                                                  }
                                                } else {
                                                  this.field_C[var5].field_k = true;
                                                  this.field_C[var5].field_h = true;
                                                  this.field_C[var5].field_i = this.field_C[var5].field_F;
                                                  this.field_C[var5].field_gb = this.field_C[var5].field_H;
                                                  this.field_C[var5].field_R = this.field_C[var5].field_E;
                                                  break L78;
                                                }
                                              }
                                              if (!this.field_C[var5].field_db) {
                                                break L77;
                                              } else {
                                                this.field_C[var5].field_h = true;
                                                this.field_C[var5].field_i = this.field_C[var5].field_F;
                                                this.field_C[var5].field_gb = this.field_C[var5].field_H;
                                                this.field_C[var5].field_R = this.field_C[var5].field_E;
                                                break L77;
                                              }
                                            } else {
                                              break L77;
                                            }
                                          }
                                        }
                                      }
                                      var8++;
                                      continue L75;
                                    }
                                  }
                                } else {
                                  L79: {
                                    if (this.field_C[var5].field_k) {
                                      this.field_C[var5].field_h = true;
                                      this.field_C[var5].field_i = this.field_C[var5].field_F;
                                      this.field_C[var5].field_gb = this.field_C[var5].field_H;
                                      this.field_C[var5].field_R = this.field_C[var5].field_E;
                                      this.field_C[var5].field_k = false;
                                      break L79;
                                    } else {
                                      break L79;
                                    }
                                  }
                                  L80: {
                                    if (this.field_J) {
                                      break L80;
                                    } else {
                                      if (!ok.field_i) {
                                        break L80;
                                      } else {
                                        this.field_C[var5].a((byte) -46, false);
                                        break L80;
                                      }
                                    }
                                  }
                                  L81: {
                                    if (!this.field_J) {
                                      break L81;
                                    } else {
                                      if (this.field_q != this.field_C[var5]) {
                                        break L81;
                                      } else {
                                        if (ok.field_i) {
                                          this.field_C[var5].a((byte) -51, true);
                                          break L81;
                                        } else {
                                          break L81;
                                        }
                                      }
                                    }
                                  }
                                  this.field_C[var5].field_k = false;
                                  var7 = 0;
                                  L82: while (true) {
                                    if (this.field_C.length <= var7) {
                                      if (this.field_C[var5].field_k) {
                                        this.field_C[var5].field_h = false;
                                        break L55;
                                      } else {
                                        break L55;
                                      }
                                    } else {
                                      L83: {
                                        if (null == this.field_C[var7]) {
                                          break L83;
                                        } else {
                                          if ((this.field_C[var7].field_C ^ -1) != -2) {
                                            break L83;
                                          } else {
                                            if (-1 <= (this.field_C[var7].field_P ^ -1)) {
                                              break L83;
                                            } else {
                                              L84: {
                                                if (this.field_h.a((byte) -93, this.field_C[var7], this.field_C[var5])) {
                                                  this.field_C[var5].field_k = true;
                                                  this.field_C[var5].field_h = true;
                                                  this.field_C[var5].field_i = this.field_C[var5].field_F;
                                                  this.field_C[var5].field_gb = this.field_C[var5].field_H;
                                                  this.field_C[var5].field_R = this.field_C[var5].field_E;
                                                  break L84;
                                                } else {
                                                  break L84;
                                                }
                                              }
                                              if (!this.field_C[var5].field_db) {
                                                break L83;
                                              } else {
                                                this.field_C[var5].field_h = true;
                                                this.field_C[var5].field_i = this.field_C[var5].field_F;
                                                this.field_C[var5].field_gb = this.field_C[var5].field_H;
                                                this.field_C[var5].field_R = this.field_C[var5].field_E;
                                                break L83;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var7++;
                                      continue L82;
                                    }
                                  }
                                }
                              } else {
                                break L55;
                              }
                            }
                          }
                          var5++;
                          continue L39;
                        }
                      }
                    } else {
                      L85: {
                        if (this.field_b) {
                          var4.field_h = true;
                          break L85;
                        } else {
                          break L85;
                        }
                      }
                      L86: {
                        L87: {
                          if (param1.field_Bb > 0) {
                            break L87;
                          } else {
                            if (var4.field_a != 1) {
                              break L86;
                            } else {
                              break L87;
                            }
                          }
                        }
                        if (var4.field_h) {
                          break L86;
                        } else {
                          L88: {
                            if (-1 != (var4.field_a ^ -1)) {
                              break L88;
                            } else {
                              var5 = 0;
                              L89: while (true) {
                                if (-13 >= (var5 ^ -1)) {
                                  break L88;
                                } else {
                                  L90: {
                                    if (null == this.field_C[var5]) {
                                      break L90;
                                    } else {
                                      if (null == this.field_C[var5].field_Z) {
                                        break L90;
                                      } else {
                                        stackIn_155_0 = this.field_C[var5].field_c;
                                        if ((stackIn_155_0.field_C.field_v ^ -1) != 0) {
                                          this.a(29518, 0);
                                          var5 = 12;
                                          this.a(1, pl.field_G, -84);
                                          break L88;
                                        } else {
                                          break L90;
                                        }
                                      }
                                    }
                                  }
                                  var5++;
                                  continue L89;
                                }
                              }
                            }
                          }
                          L91: {
                            if (-2 == (var4.field_a ^ -1)) {
                              var3_int = 1;
                              var5 = 0;
                              L92: while (true) {
                                if (var5 >= this.field_C.length) {
                                  if (var3_int != 0) {
                                    this.a(29518, 1);
                                    this.field_b = true;
                                    break L91;
                                  } else {
                                    break L91;
                                  }
                                } else {
                                  if (this.field_C[var5] != null) {
                                    if (this.field_C[var5].field_P > 0) {
                                      if (-2 == (this.field_C[var5].field_C ^ -1)) {
                                        var3_int = 0;
                                        var5++;
                                        continue L92;
                                      } else {
                                        var5++;
                                        continue L92;
                                      }
                                    } else {
                                      var5++;
                                      continue L92;
                                    }
                                  } else {
                                    var5++;
                                    continue L92;
                                  }
                                }
                              }
                            } else {
                              break L91;
                            }
                          }
                          L93: {
                            if (-3 == (var4.field_a ^ -1)) {
                              var3_int = 1;
                              var5 = 0;
                              L94: while (true) {
                                if (-13 >= (var5 ^ -1)) {
                                  if (var3_int != 0) {
                                    this.a(29518, 2);
                                    this.a(-1, rf.field_s, -8);
                                    this.field_b = true;
                                    break L93;
                                  } else {
                                    break L93;
                                  }
                                } else {
                                  if (this.field_C[var5] != null) {
                                    if (this.field_C[var5].field_P > 0) {
                                      L95: {
                                        if (this.field_C[var5].field_Z != null) {
                                          var3_int = 0;
                                          break L95;
                                        } else {
                                          break L95;
                                        }
                                      }
                                      var5++;
                                      continue L94;
                                    } else {
                                      var5++;
                                      continue L94;
                                    }
                                  } else {
                                    var5++;
                                    continue L94;
                                  }
                                }
                              }
                            } else {
                              break L93;
                            }
                          }
                          L96: {
                            if ((var4.field_a ^ -1) == -4) {
                              var5 = 0;
                              L97: while (true) {
                                if (var5 >= this.field_C.length) {
                                  break L96;
                                } else {
                                  L98: {
                                    if (null == this.field_C[var5]) {
                                      break L98;
                                    } else {
                                      if (6 != this.field_C[var5].field_t) {
                                        break L98;
                                      } else {
                                        L99: {
                                          if (this.field_C[var5].field_k) {
                                            break L99;
                                          } else {
                                            if ((this.field_C[var5].field_P ^ -1) < -1) {
                                              break L98;
                                            } else {
                                              break L99;
                                            }
                                          }
                                        }
                                        this.a(param0 ^ -29519, 3);
                                        this.a(9, ki.field_Z, -7);
                                        break L98;
                                      }
                                    }
                                  }
                                  var5++;
                                  continue L97;
                                }
                              }
                            } else {
                              break L96;
                            }
                          }
                          L100: {
                            if (-10 != (var4.field_a ^ -1)) {
                              break L100;
                            } else {
                              var5 = 0;
                              L101: while (true) {
                                if (this.field_C.length <= var5) {
                                  break L100;
                                } else {
                                  stackIn_203_0 = null;
                                  stackIn_203_1 = this.field_C[var5];
                                  if (stackIn_203_0 != stackIn_203_1) {
                                    if (this.field_C[var5].field_s) {
                                      L102: {
                                        if (null != this.field_C[var5].field_Z) {
                                          this.a(29518, 9);
                                          this.a(4, ch.field_h, -110);
                                          break L102;
                                        } else {
                                          break L102;
                                        }
                                      }
                                      var5++;
                                      continue L101;
                                    } else {
                                      var5++;
                                      continue L101;
                                    }
                                  } else {
                                    var5++;
                                    continue L101;
                                  }
                                }
                              }
                            }
                          }
                          L103: {
                            if (-5 == (var4.field_a ^ -1)) {
                              var3_int = 1;
                              var5 = 0;
                              var6 = 0;
                              L104: while (true) {
                                if (var6 >= 12) {
                                  this.field_h.field_m = 1;
                                  if (var3_int == 0) {
                                    break L103;
                                  } else {
                                    if (var5 != 0) {
                                      this.a(29518, 4);
                                      this.field_b = true;
                                      this.field_v = true;
                                      break L103;
                                    } else {
                                      break L103;
                                    }
                                  }
                                } else {
                                  L105: {
                                    if (this.field_C[var6] == null) {
                                      break L105;
                                    } else {
                                      if (this.field_C[var6].field_P <= 0) {
                                        break L105;
                                      } else {
                                        if (!this.field_C[var6].field_s) {
                                          break L105;
                                        } else {
                                          if (this.field_C[var6].field_Z == null) {
                                            break L105;
                                          } else {
                                            if (this.field_C[var6].field_c.field_d) {
                                              break L105;
                                            } else {
                                              var5 = 1;
                                              break L105;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (null != this.field_C[var6]) {
                                    if ((this.field_C[var6].field_P ^ -1) < -1) {
                                      if (null != this.field_C[var6].field_Z) {
                                        L106: {
                                          if (this.field_C[var6].field_c.field_d) {
                                            var3_int = 0;
                                            break L106;
                                          } else {
                                            break L106;
                                          }
                                        }
                                        var6++;
                                        continue L104;
                                      } else {
                                        var6++;
                                        continue L104;
                                      }
                                    } else {
                                      var6++;
                                      continue L104;
                                    }
                                  } else {
                                    var6++;
                                    continue L104;
                                  }
                                }
                              }
                            } else {
                              break L103;
                            }
                          }
                          L107: {
                            if ((var4.field_a ^ -1) != -6) {
                              break L107;
                            } else {
                              var3_int = 1;
                              var5 = 0;
                              var6 = 0;
                              L108: while (true) {
                                if (-13 >= (var6 ^ -1)) {
                                  this.field_h.field_m = 2;
                                  if (var3_int == 0) {
                                    break L107;
                                  } else {
                                    if (var5 != 0) {
                                      this.a(29518, 5);
                                      this.field_v = true;
                                      this.field_b = true;
                                      break L107;
                                    } else {
                                      break L107;
                                    }
                                  }
                                } else {
                                  L109: {
                                    if (this.field_C[var6] == null) {
                                      break L109;
                                    } else {
                                      if ((this.field_C[var6].field_P ^ -1) >= -1) {
                                        break L109;
                                      } else {
                                        if (null == this.field_C[var6].field_Z) {
                                          break L109;
                                        } else {
                                          if (Math.abs(-(this.field_h.field_b / 2) + this.field_C[var6].field_F) >= this.field_h.field_b / 2 + -5) {
                                            break L109;
                                          } else {
                                            if (Math.abs(-(this.field_h.field_e / 2) + this.field_C[var6].field_H) < this.field_h.field_e / 2 + -5) {
                                              var3_int = 0;
                                              break L109;
                                            } else {
                                              break L109;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (this.field_C[var6] != null) {
                                    if (-1 > (this.field_C[var6].field_P ^ -1)) {
                                      if (this.field_C[var6].field_s) {
                                        if (this.field_C[var6].field_Z != null) {
                                          L110: {
                                            if (Math.abs(this.field_C[var6].field_F + -(this.field_h.field_b / 2)) >= -5 + this.field_h.field_b / 2) {
                                              break L110;
                                            } else {
                                              if (Math.abs(-(this.field_h.field_e / 2) + this.field_C[var6].field_H) >= -5 + this.field_h.field_e / 2) {
                                                break L110;
                                              } else {
                                                var6++;
                                                continue L108;
                                              }
                                            }
                                          }
                                          var5 = 1;
                                          var6++;
                                          continue L108;
                                        } else {
                                          var6++;
                                          continue L108;
                                        }
                                      } else {
                                        var6++;
                                        continue L108;
                                      }
                                    } else {
                                      var6++;
                                      continue L108;
                                    }
                                  } else {
                                    var6++;
                                    continue L108;
                                  }
                                }
                              }
                            }
                          }
                          L111: {
                            if (6 == var4.field_a) {
                              var3_int = 1;
                              var5 = 0;
                              var6 = 0;
                              L112: while (true) {
                                if (12 <= var6) {
                                  this.field_h.field_m = 3;
                                  if (var3_int == 0) {
                                    break L111;
                                  } else {
                                    if (var5 != 0) {
                                      this.a(param0 ^ -29519, 6);
                                      this.field_v = true;
                                      this.field_b = true;
                                      break L111;
                                    } else {
                                      break L111;
                                    }
                                  }
                                } else {
                                  L113: {
                                    if (null == this.field_C[var6]) {
                                      break L113;
                                    } else {
                                      if (-1 <= (this.field_C[var6].field_P ^ -1)) {
                                        break L113;
                                      } else {
                                        if (this.field_C[var6].field_Z == null) {
                                          break L113;
                                        } else {
                                          if (1 != this.field_C[var6].field_E) {
                                            break L113;
                                          } else {
                                            if ((this.field_C[var6].field_F ^ -1) < -13) {
                                              break L113;
                                            } else {
                                              if (this.field_C[var6].field_H > 12) {
                                                break L113;
                                              } else {
                                                if (this.field_C[var6].field_s) {
                                                  var5 = 1;
                                                  break L113;
                                                } else {
                                                  break L113;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (this.field_C[var6] != null) {
                                    if ((this.field_C[var6].field_P ^ -1) < -1) {
                                      if (null != this.field_C[var6].field_Z) {
                                        L114: {
                                          if ((this.field_C[var6].field_E ^ -1) != -2) {
                                            break L114;
                                          } else {
                                            if (-13 > (this.field_C[var6].field_F ^ -1)) {
                                              break L114;
                                            } else {
                                              if (-13 > (this.field_C[var6].field_H ^ -1)) {
                                                break L114;
                                              } else {
                                                var6++;
                                                continue L112;
                                              }
                                            }
                                          }
                                        }
                                        var3_int = 0;
                                        var6++;
                                        continue L112;
                                      } else {
                                        var6++;
                                        continue L112;
                                      }
                                    } else {
                                      var6++;
                                      continue L112;
                                    }
                                  } else {
                                    var6++;
                                    continue L112;
                                  }
                                }
                              }
                            } else {
                              break L111;
                            }
                          }
                          L115: {
                            if ((var4.field_a ^ -1) == -8) {
                              this.field_h.field_m = 4;
                              var5 = 0;
                              L116: while (true) {
                                if (-13 >= (var5 ^ -1)) {
                                  break L115;
                                } else {
                                  L117: {
                                    if (null == this.field_C[var5]) {
                                      break L117;
                                    } else {
                                      if ((this.field_C[var5].field_P ^ -1) >= -1) {
                                        break L117;
                                      } else {
                                        if (!this.field_C[var5].field_s) {
                                          break L117;
                                        } else {
                                          if (null == this.field_C[var5].field_Z) {
                                            break L117;
                                          } else {
                                            if (-3 != (this.field_C[var5].field_E ^ -1)) {
                                              break L117;
                                            } else {
                                              this.a(29518, 7);
                                              dd.field_M = 8;
                                              this.a(4, va.field_j, param0 + -13);
                                              break L117;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var5++;
                                  continue L116;
                                }
                              }
                            } else {
                              break L115;
                            }
                          }
                          if (-9 == (var4.field_a ^ -1)) {
                            L118: {
                              if (3 != this.field_z) {
                                break L118;
                              } else {
                                if (var4.field_b == vk.field_a) {
                                  break L118;
                                } else {
                                  var4.field_b = vk.field_a;
                                  var4.field_d = 0;
                                  break L118;
                                }
                              }
                            }
                            L119: {
                              if (2 != this.field_z) {
                                break L119;
                              } else {
                                if (fc.field_h != var4.field_b) {
                                  var4.field_b = fc.field_h;
                                  var4.field_d = 0;
                                  break L119;
                                } else {
                                  break L119;
                                }
                              }
                            }
                            L120: {
                              if (-2 != (this.field_z ^ -1)) {
                                break L120;
                              } else {
                                if (var4.field_b == jm.field_a) {
                                  break L120;
                                } else {
                                  var4.field_d = 0;
                                  var4.field_b = jm.field_a;
                                  break L120;
                                }
                              }
                            }
                            if (-1 == (this.field_z ^ -1)) {
                              this.a(29518, 8);
                              this.a(-1, rf.field_s, -104);
                              this.field_b = true;
                              this.field_r = true;
                              break L86;
                            } else {
                              break L86;
                            }
                          } else {
                            break L86;
                          }
                        }
                      }
                      L121: {
                        if (null == var4.field_f) {
                          break L121;
                        } else {
                          if (!var4.field_f.field_h) {
                            break L121;
                          } else {
                            if (-1 > (var4.field_f.field_d ^ -1)) {
                              break L121;
                            } else {
                              var4.field_f = var4.field_f.field_f;
                              break L121;
                            }
                          }
                        }
                      }
                      L122: {
                        if (var4.field_h) {
                          if ((var4.field_d ^ -1) >= -1) {
                            break L122;
                          } else {
                            var4.field_d = var4.field_d - 1;
                            break L122;
                          }
                        } else {
                          if ((var4.field_d ^ -1) <= -251) {
                            if (le.field_q == null) {
                              break L122;
                            } else {
                              var4.field_d = 0;
                              break L122;
                            }
                          } else {
                            var4.field_d = var4.field_d + 1;
                            break L122;
                          }
                        }
                      }
                      if (var4 != null) {
                        var4 = var4.field_f;
                        continue L37;
                      } else {
                        continue L37;
                      }
                    }
                  }
                } else {
                  if (null != this.field_C[var13]) {
                    if ((this.field_C[var13].field_P ^ -1) < -1) {
                      if (this.field_C[var13].field_Z != null) {
                        var3_int = 0;
                        var13++;
                        continue L22;
                      } else {
                        var13++;
                        continue L22;
                      }
                    } else {
                      var13++;
                      continue L22;
                    }
                  } else {
                    var13++;
                    continue L22;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L123: {
            var3 = decompiledCaughtException;
            stackIn_521_0 = (RuntimeException) (var3);

            stackIn_521_1 = new StringBuilder().append("e.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_522_0 = (RuntimeException) ((Object) stackIn_521_0);
              stackIn_522_1 = (StringBuilder) ((Object) stackIn_521_1);
              stackIn_522_2 = "null";
              break L123;
            } else {
              stackIn_522_0 = (RuntimeException) ((Object) stackIn_521_0);
              stackIn_522_1 = (StringBuilder) ((Object) stackIn_521_1);
              stackIn_522_2 = "{...}";
              break L123;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_522_0), stackIn_522_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    e(Terraphoenix param0) {
        Terraphoenix stackIn_3_0 = null;
        Terraphoenix stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Terraphoenix stackIn_6_0 = null;
        Terraphoenix stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Terraphoenix stackIn_9_0 = null;
        Terraphoenix stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Terraphoenix stackIn_12_0 = null;
        Terraphoenix stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_256_0 = 0;
        int stackIn_293_0 = 0;
        RuntimeException stackIn_373_0 = null;
        StringBuilder stackIn_373_1 = null;
        RuntimeException stackIn_374_0 = null;
        StringBuilder stackIn_374_1 = null;
        String stackIn_374_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Object var17_ref = null;
        dl var17_ref_dl = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        dl var21 = null;
        int var22 = 0;
        int var23 = 0;
        dl var25 = null;
        dl var26 = null;
        var17_ref = null;
        this.field_D = null;
        this.field_F = new gi[50];
        this.field_w = false;
        this.field_n = null;
        this.field_C = new r[100];
        try {
          L0: {
            L1: {
              System.gc();
              this.field_i = 1;
              le.field_q = null;
              this.b((byte) -3);
              this.field_f = 0;
              this.field_G = param0;
              this.field_z = 0;
              this.field_v = false;
              this.field_L = 0;
              ok.field_i = true;
              this.field_J = false;
              this.field_b = false;
              this.field_B = -1;
              eg.field_p = 0;
              li.field_a = false;
              this.field_r = false;
              this.field_A = false;
              this.field_e = new hk();
              var2_int = 0;
              var3 = 0;
              var4 = 0;
              var5 = 0;
              var6 = 0;
              var7 = 0;
              var8 = 0;
              var9 = 0;
              var10 = 0;
              var11 = 0;
              var12 = 0;
              var13 = 0;
              stackIn_3_0 = (Terraphoenix) (param0);

              if ((param0.field_Bb ^ -1) >= -3) {
                stackIn_4_0 = (Terraphoenix) ((Object) stackIn_3_0);
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = (Terraphoenix) ((Object) stackIn_3_0);
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              stackIn_4_0.field_Ab = stackIn_4_1 != 0;
              stackIn_6_0 = (Terraphoenix) (param0);

              if ((param0.field_Bb ^ -1) >= -3) {
                stackIn_7_0 = (Terraphoenix) ((Object) stackIn_6_0);
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = (Terraphoenix) ((Object) stackIn_6_0);
                stackIn_7_1 = 1;
                break L2;
              }
            }
            L3: {
              stackIn_7_0.field_H = stackIn_7_1 != 0;
              stackIn_9_0 = (Terraphoenix) (param0);

              if (-3 <= (param0.field_Bb ^ -1)) {
                stackIn_10_0 = (Terraphoenix) ((Object) stackIn_9_0);
                stackIn_10_1 = 0;
                break L3;
              } else {
                stackIn_10_0 = (Terraphoenix) ((Object) stackIn_9_0);
                stackIn_10_1 = 1;
                break L3;
              }
            }
            L4: {
              stackIn_10_0.field_E = stackIn_10_1 != 0;
              stackIn_12_0 = (Terraphoenix) (param0);

              if (-3 <= (param0.field_Bb ^ -1)) {
                stackIn_13_0 = (Terraphoenix) ((Object) stackIn_12_0);
                stackIn_13_1 = 0;
                break L4;
              } else {
                stackIn_13_0 = (Terraphoenix) ((Object) stackIn_12_0);
                stackIn_13_1 = 1;
                break L4;
              }
            }
            L5: {
              stackIn_13_0.field_Y = stackIn_13_1 != 0;
              var14 = 0;
              if (param0.field_db) {
                L6: {
                  var15 = param0.field_Bb;
                  if (var15 == 0) {
                    break L6;
                  } else {
                    if (var15 == 1) {
                      break L6;
                    } else {
                      if (-3 == (var15 ^ -1)) {
                        break L6;
                      } else {
                        if (3 == var15) {
                          L7: {
                            if (qc.field_c >= 4) {
                              break L7;
                            } else {
                              var6 = -qc.field_c + 4;
                              break L7;
                            }
                          }
                          var2_int = qc.field_c + 6;
                          break L6;
                        } else {
                          if ((var15 ^ -1) == -5) {
                            L8: {
                              if (4 <= qc.field_c) {
                                break L8;
                              } else {
                                var6 = 4 - qc.field_c;
                                break L8;
                              }
                            }
                            var2_int = 8 - -qc.field_c;
                            break L6;
                          } else {
                            if (var15 == 5) {
                              break L6;
                            } else {
                              if (6 == var15) {
                                var2_int = qc.field_c + 10;
                                break L6;
                              } else {
                                if (var15 == 7) {
                                  break L6;
                                } else {
                                  if (var15 == 8) {
                                    var2_int = 12 - -qc.field_c;
                                    break L6;
                                  } else {
                                    if (9 == var15) {
                                      break L6;
                                    } else {
                                      if ((var15 ^ -1) == -11) {
                                        var2_int = 14 + qc.field_c;
                                        break L6;
                                      } else {
                                        if (11 == var15) {
                                          break L6;
                                        } else {
                                          if (12 == var15) {
                                            break L6;
                                          } else {
                                            if (var15 != 13) {
                                              break L6;
                                            } else {
                                              break L6;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L9: {
                  this.field_i = 2;
                  if (!mb.b(0, 109)) {
                    break L9;
                  } else {
                    var7 = 88;
                    var6 = 0;
                    var2_int = 0;
                    break L9;
                  }
                }
                this.field_J = true;
                break L5;
              } else {
                var15 = param0.field_Bb;
                if (var15 == 0) {
                  L10: {
                    this.field_B = 0;
                    var2_int = 10;
                    le.field_q = new ad(0);
                    le.field_q.field_A = (e) (this);
                    if (fa.field_a < 1) {
                      this.a(-1, ak.field_c, -32);
                      break L10;
                    } else {
                      this.a(1, kl.field_d[76], -87);
                      break L10;
                    }
                  }
                  L11: {
                    if (2 != fa.field_a) {
                      break L11;
                    } else {
                      var2_int = 14;
                      break L11;
                    }
                  }
                  this.field_J = true;
                  break L5;
                } else {
                  if (-2 == (var15 ^ -1)) {
                    var2_int = 16;
                    var6 = 4;
                    this.field_J = false;
                    if (fa.field_a != 2) {
                      break L5;
                    } else {
                      var2_int = 20;
                      break L5;
                    }
                  } else {
                    if (var15 == 2) {
                      var9 = 2;
                      var2_int = 12;
                      var8 = 2;
                      this.field_J = true;
                      if ((fa.field_a ^ -1) != -3) {
                        break L5;
                      } else {
                        var2_int = 20;
                        break L5;
                      }
                    } else {
                      if (3 == var15) {
                        L12: {
                          var3 = 1;
                          var2_int = 16;
                          this.field_J = true;
                          if (fa.field_a != 2) {
                            break L12;
                          } else {
                            var2_int = 20;
                            var3 = 2;
                            break L12;
                          }
                        }
                        this.field_i = 2;
                        if (param0.field_ub == 2) {
                          var9 = 1;
                          var8 = 1;
                          break L5;
                        } else {
                          var10 = 2;
                          break L5;
                        }
                      } else {
                        if (-5 == (var15 ^ -1)) {
                          var3 = 6;
                          this.field_z = 15;
                          var11 = 0;
                          var12 = 2;
                          this.field_J = false;
                          if (fa.field_a != 2) {
                            break L5;
                          } else {
                            var12 = 4;
                            break L5;
                          }
                        } else {
                          if (5 == var15) {
                            L13: {
                              var12 = 6;
                              var3 = 6;
                              var11 = 4;
                              if (-3 != (fa.field_a ^ -1)) {
                                break L13;
                              } else {
                                var12 = 8;
                                var11 = 6;
                                break L13;
                              }
                            }
                            this.field_J = true;
                            break L5;
                          } else {
                            if ((var15 ^ -1) == -7) {
                              L14: {
                                var3 = 6;
                                this.field_z = 10;
                                var11 = 4;
                                var13 = 4;
                                var12 = 4;
                                var8 = 3;
                                if (fa.field_a != 0) {
                                  break L14;
                                } else {
                                  var11 = 2;
                                  break L14;
                                }
                              }
                              this.field_J = false;
                              if (-3 != (fa.field_a ^ -1)) {
                                break L5;
                              } else {
                                var12 = 8;
                                var13 = 6;
                                var11 = 6;
                                var3 = 4;
                                break L5;
                              }
                            } else {
                              if (7 == var15) {
                                var13 = 6;
                                var3 = 4;
                                var12 = 8;
                                this.field_J = true;
                                var11 = 4;
                                if (2 != fa.field_a) {
                                  break L5;
                                } else {
                                  var13 = 8;
                                  var3 = 2;
                                  break L5;
                                }
                              } else {
                                if (-9 == (var15 ^ -1)) {
                                  L15: {
                                    this.field_J = true;
                                    this.field_i = 3;
                                    if (1 != param0.field_vb) {
                                      var9 = 2;
                                      var8 = 6;
                                      this.field_z = 5;
                                      var12 = 6;
                                      var3 = 4;
                                      var13 = 4;
                                      this.field_J = false;
                                      var4 = 1;
                                      var14 = 6;
                                      break L15;
                                    } else {
                                      var13 = 4;
                                      var3 = 4;
                                      var12 = 2;
                                      var4 = 1;
                                      var8 = 10;
                                      var9 = 2;
                                      var5 = 4;
                                      var14 = 6;
                                      break L15;
                                    }
                                  }
                                  dd.field_M = 7;
                                  break L5;
                                } else {
                                  if (9 == var15) {
                                    L16: {
                                      var13 = 6;
                                      var14 = 6;
                                      var12 = 6;
                                      var3 = 18;
                                      if (-3 != (fa.field_a ^ -1)) {
                                        break L16;
                                      } else {
                                        var12 = 12;
                                        var3 = 12;
                                        break L16;
                                      }
                                    }
                                    this.field_J = true;
                                    var11 = 0;
                                    break L5;
                                  } else {
                                    if (-11 == (var15 ^ -1)) {
                                      L17: {
                                        this.field_i = 3;
                                        if ((param0.field_vb ^ -1) != -2) {
                                          var5 = 10;
                                          var13 = 4;
                                          var12 = 0;
                                          var14 = 6;
                                          var4 = 1;
                                          var9 = 2;
                                          var8 = 10;
                                          break L17;
                                        } else {
                                          var9 = 2;
                                          var4 = 1;
                                          var8 = 6;
                                          var5 = 6;
                                          var12 = 4;
                                          this.field_z = 5;
                                          this.field_J = false;
                                          var13 = 4;
                                          var14 = 6;
                                          break L17;
                                        }
                                      }
                                      dd.field_M = 7;
                                      this.field_J = true;
                                      break L5;
                                    } else {
                                      if (-12 == (var15 ^ -1)) {
                                        dd.field_M = 4;
                                        this.field_i = 2;
                                        var12 = 6;
                                        var14 = 6;
                                        var13 = 6;
                                        var5 = 6;
                                        this.field_J = true;
                                        break L5;
                                      } else {
                                        if (var15 == 12) {
                                          this.field_J = true;
                                          dd.field_M = 4;
                                          this.field_i = 3;
                                          var8 = 8;
                                          var5 = 2;
                                          var14 = 8;
                                          break L5;
                                        } else {
                                          if (-14 != (var15 ^ -1)) {
                                            break L5;
                                          } else {
                                            var8 = 12;
                                            var5 = 4;
                                            this.field_J = true;
                                            dd.field_M = 4;
                                            this.field_i = 3;
                                            var14 = 12;
                                            break L5;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            var16 = 0;
            this.field_u = false;
            ak.field_q = 0;
            var15 = 0;
            L18: while (true) {
              if ((var15 ^ -1) <= -13) {
                L19: {
                  this.field_h = new dk((e) (this));
                  if (param0.field_Bb != 0) {
                    break L19;
                  } else {
                    var15 = 0;
                    this.field_C[var15].field_F = 3;
                    this.field_C[var15].field_H = 4;
                    this.field_C[var15].field_E = 0;
                    this.field_C[var15].field_U = 2;
                    var17_ref_dl = this.field_h.a(120, this.field_C[var15].field_H, this.field_C[var15].field_E, this.field_C[var15].field_F);
                    var17_ref_dl.field_h = this.field_C[var15];
                    this.field_C[var15].field_c = var17_ref_dl;
                    this.field_q = this.field_C[var15];
                    this.field_u = true;
                    this.field_C[1] = null;
                    this.field_C[2] = null;
                    eg.field_p = this.field_q.field_E;
                    this.field_C[3] = null;
                    lg.field_c = (this.field_q.field_F + this.field_q.field_H) * 16;
                    sj.field_b = (this.field_q.field_F + -this.field_q.field_H) * 32;
                    break L19;
                  }
                }
                L20: {
                  if (param0.field_Bb != 1) {
                    break L20;
                  } else {
                    var15 = 0;
                    L21: while (true) {
                      if ((var15 ^ -1) <= -13) {
                        this.field_u = true;
                        break L20;
                      } else {
                        L22: {
                          if (null == this.field_C[var15]) {
                            break L22;
                          } else {
                            if (null == this.field_C[var15].field_Z) {
                              break L22;
                            } else {
                              L23: {
                                if (0 != var15) {
                                  break L23;
                                } else {
                                  this.field_C[var15].field_F = 42;
                                  this.field_C[var15].field_H = 31;
                                  break L23;
                                }
                              }
                              L24: {
                                if (-2 != (var15 ^ -1)) {
                                  break L24;
                                } else {
                                  this.field_C[var15].field_F = 41;
                                  this.field_C[var15].field_H = 30;
                                  break L24;
                                }
                              }
                              L25: {
                                if (var15 != 2) {
                                  break L25;
                                } else {
                                  this.field_C[var15].field_F = 41;
                                  this.field_C[var15].field_H = 28;
                                  break L25;
                                }
                              }
                              L26: {
                                if (var15 != 3) {
                                  break L26;
                                } else {
                                  this.field_C[var15].field_F = 42;
                                  this.field_C[var15].field_H = 27;
                                  break L26;
                                }
                              }
                              L27: {
                                if ((var15 ^ -1) != -5) {
                                  break L27;
                                } else {
                                  this.field_C[var15].field_F = 44;
                                  this.field_C[var15].field_H = 31;
                                  break L27;
                                }
                              }
                              L28: {
                                if (var15 != 5) {
                                  break L28;
                                } else {
                                  this.field_C[var15].field_F = 45;
                                  this.field_C[var15].field_H = 30;
                                  break L28;
                                }
                              }
                              L29: {
                                if (6 != var15) {
                                  break L29;
                                } else {
                                  this.field_C[var15].field_F = 45;
                                  this.field_C[var15].field_H = 28;
                                  break L29;
                                }
                              }
                              L30: {
                                if (var15 != 7) {
                                  break L30;
                                } else {
                                  this.field_C[var15].field_F = 44;
                                  this.field_C[var15].field_H = 27;
                                  break L30;
                                }
                              }
                              this.field_C[var15].field_U = 6;
                              this.field_C[var15].field_E = 0;
                              var17_ref_dl = this.field_h.a(-75, this.field_C[var15].field_H, this.field_C[var15].field_E, this.field_C[var15].field_F);
                              var17_ref_dl.field_h = this.field_C[var15];
                              var17_ref_dl.field_j = -1;
                              var17_ref_dl.field_v = 0;
                              this.field_C[var15].field_c = var17_ref_dl;
                              this.field_q = this.field_C[var15];
                              eg.field_p = this.field_q.field_E;
                              lg.field_c = (this.field_q.field_F + this.field_q.field_H) * 16;
                              sj.field_b = (-this.field_q.field_H + this.field_q.field_F) * 32;
                              break L22;
                            }
                          }
                        }
                        var15++;
                        continue L21;
                      }
                    }
                  }
                }
                L31: {
                  if (param0.field_db) {
                    break L31;
                  } else {
                    L32: {
                      L33: {
                        if (param0.field_Bb != 8) {
                          break L33;
                        } else {
                          if (param0.field_vb == 1) {
                            break L32;
                          } else {
                            break L33;
                          }
                        }
                      }
                      L34: {
                        if ((param0.field_Bb ^ -1) != -11) {
                          break L34;
                        } else {
                          if ((param0.field_vb ^ -1) == -3) {
                            break L32;
                          } else {
                            break L34;
                          }
                        }
                      }
                      if ((param0.field_Bb ^ -1) == -13) {
                        break L32;
                      } else {
                        if (13 != param0.field_Bb) {
                          break L31;
                        } else {
                          break L32;
                        }
                      }
                    }
                    var15 = 0;
                    L35: while (true) {
                      if (12 <= var15) {
                        this.field_u = true;
                        break L31;
                      } else {
                        L36: {
                          if (this.field_C[var15] == null) {
                            break L36;
                          } else {
                            if (this.field_C[var15].field_Z == null) {
                              break L36;
                            } else {
                              this.field_C[var15].field_F = var15 / 3 % 2 + (2 * (var15 % 3) + (this.field_h.field_b + -9));
                              this.field_C[var15].field_H = this.field_h.field_e + -8 + var15 / 3;
                              this.field_C[var15].field_E = 0;
                              this.field_C[var15].field_U = 5;
                              var17_ref_dl = this.field_h.a(-121, this.field_C[var15].field_H, this.field_C[var15].field_E, this.field_C[var15].field_F);
                              var17_ref_dl.field_h = this.field_C[var15];
                              this.field_C[var15].field_c = var17_ref_dl;
                              this.field_q = this.field_C[var15];
                              lg.field_c = (this.field_q.field_F - -this.field_q.field_H) * 16;
                              eg.field_p = this.field_q.field_E;
                              sj.field_b = (this.field_q.field_F + -this.field_q.field_H) * 32;
                              break L36;
                            }
                          }
                        }
                        var15++;
                        continue L35;
                      }
                    }
                  }
                }
                var16 = ak.field_q;
                var15 = 0;
                L37: while (true) {
                  if (var15 >= var6) {
                    L38: {
                      if (-12 != (param0.field_Bb ^ -1)) {
                        break L38;
                      } else {
                        this.field_C[0].field_s = true;
                        break L38;
                      }
                    }
                    L39: {
                      if (12 != param0.field_Bb) {
                        break L39;
                      } else {
                        this.field_C[0].field_s = true;
                        break L39;
                      }
                    }
                    L40: {
                      if (-14 != (param0.field_Bb ^ -1)) {
                        break L40;
                      } else {
                        this.field_C[0].field_s = true;
                        break L40;
                      }
                    }
                    var15 = 0;
                    L41: while (true) {
                      if (var2_int <= var15) {
                        var15 = 0;
                        L42: while (true) {
                          if (var15 >= var3) {
                            var15 = 0;
                            L43: while (true) {
                              if (var12 <= var15) {
                                var15 = 0;
                                L44: while (true) {
                                  if (var15 >= var13) {
                                    var15 = 0;
                                    L45: while (true) {
                                      if (var15 >= var5) {
                                        var15 = 0;
                                        L46: while (true) {
                                          if (var15 >= var14) {
                                            var15 = 0;
                                            L47: while (true) {
                                              if (var4 <= var15) {
                                                var15 = 0;
                                                L48: while (true) {
                                                  if (var7 <= var15) {
                                                    var15 = var16 - 1;
                                                    L49: while (true) {
                                                      if (var15 < ak.field_q) {
                                                        var17 = 0;
                                                        var15 = 0;
                                                        L50: while (true) {
                                                          if (var15 >= this.field_C.length) {
                                                            L51: {
                                                              this.field_d = 0;
                                                              if (!this.field_J) {
                                                                break L51;
                                                              } else {
                                                                this.field_d = 1;
                                                                break L51;
                                                              }
                                                            }
                                                            L52: {
                                                              if (!this.field_u) {
                                                                break L52;
                                                              } else {
                                                                this.c((byte) -116);
                                                                break L52;
                                                              }
                                                            }
                                                            L53: {
                                                              if (le.field_q == null) {
                                                                break L53;
                                                              } else {
                                                                if (-1 <= (fa.field_a ^ -1)) {
                                                                  break L53;
                                                                } else {
                                                                  le.field_q.c((byte) 51);
                                                                  this.field_B = -1;
                                                                  le.field_q = null;
                                                                  break L53;
                                                                }
                                                              }
                                                            }
                                                            break L0;
                                                          } else {
                                                            L54: {
                                                              if (null == this.field_C[var15]) {
                                                                break L54;
                                                              } else {
                                                                if (this.field_C[var15].field_Z != null) {
                                                                  break L54;
                                                                } else {
                                                                  if (this.field_C[var15].field_c != null) {
                                                                    break L54;
                                                                  } else {
                                                                    L55: {
                                                                      var17 = 0;
                                                                      if (0 != param0.field_Bb) {
                                                                        break L55;
                                                                      } else {
                                                                        var17 = 2;
                                                                        break L55;
                                                                      }
                                                                    }
                                                                    L56: {
                                                                      if (-2 != (param0.field_Bb ^ -1)) {
                                                                        break L56;
                                                                      } else {
                                                                        if (-1 != (this.field_C[var15].field_t ^ -1)) {
                                                                          break L56;
                                                                        } else {
                                                                          var17 = 1;
                                                                          break L56;
                                                                        }
                                                                      }
                                                                    }
                                                                    L57: {
                                                                      if ((param0.field_Bb ^ -1) != -12) {
                                                                        break L57;
                                                                      } else {
                                                                        var17 = 1;
                                                                        break L57;
                                                                      }
                                                                    }
                                                                    L58: {
                                                                      if (this.field_C[var15].field_z != 0) {
                                                                        break L58;
                                                                      } else {
                                                                        if (var11 <= 0) {
                                                                          break L58;
                                                                        } else {
                                                                          var11--;
                                                                          var17 = 1;
                                                                          break L58;
                                                                        }
                                                                      }
                                                                    }
                                                                    L59: {
                                                                      if (this.field_C[var15].field_t != 9) {
                                                                        break L59;
                                                                      } else {
                                                                        var17 = 1;
                                                                        break L59;
                                                                      }
                                                                    }
                                                                    L60: {
                                                                      if (0 != var17) {
                                                                        break L60;
                                                                      } else {
                                                                        L61: {
                                                                          if (0 != this.field_C[var15].field_C) {
                                                                            break L61;
                                                                          } else {
                                                                            this.field_C[var15].field_z = 0;
                                                                            break L61;
                                                                          }
                                                                        }
                                                                        L62: {
                                                                          if (this.field_C[var15].field_z != 0) {
                                                                            break L62;
                                                                          } else {
                                                                            if ((this.field_C[var15].field_t ^ -1) >= -1) {
                                                                              break L62;
                                                                            } else {
                                                                              if ((this.field_C[var15].field_C ^ -1) != -2) {
                                                                                break L62;
                                                                              } else {
                                                                                L63: {
                                                                                  if ((param0.field_Bb ^ -1) == -5) {
                                                                                    break L63;
                                                                                  } else {
                                                                                    if (6 == param0.field_Bb) {
                                                                                      break L63;
                                                                                    } else {
                                                                                      if ((param0.field_Bb ^ -1) == -9) {
                                                                                        break L63;
                                                                                      } else {
                                                                                        if (-11 != (param0.field_Bb ^ -1)) {
                                                                                          break L62;
                                                                                        } else {
                                                                                          break L63;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                if (50.0 <= Math.random() * 100.0) {
                                                                                  break L62;
                                                                                } else {
                                                                                  this.field_C[var15].field_z = 1;
                                                                                  break L62;
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                        this.field_C[var15].field_U = (int)(8.0 * Math.random());
                                                                        var23 = 0;
                                                                        L64: while (true) {
                                                                          L65: {
                                                                            var18 = (int)(Math.random() * (double)this.field_h.field_b / 2.0) - -(this.field_h.field_b / 4);
                                                                            var23++;
                                                                            var19 = (int)(Math.random() * (double)this.field_h.field_e / 2.0) + this.field_h.field_e / 4;
                                                                            if (this.field_C[var15].field_t < 1) {
                                                                              break L65;
                                                                            } else {
                                                                              if (6 < this.field_C[var15].field_t) {
                                                                                break L65;
                                                                              } else {
                                                                                var18 = 2 + (int)(Math.random() * (double)(-4 + this.field_h.field_b));
                                                                                var19 = (int)(Math.random() * (double)(-4 + this.field_h.field_e)) + 2;
                                                                                break L65;
                                                                              }
                                                                            }
                                                                          }
                                                                          L66: {
                                                                            if (9 != param0.field_Bb) {
                                                                              break L66;
                                                                            } else {
                                                                              var18 = 2 + (int)(Math.random() * (double)(-4 + this.field_h.field_b));
                                                                              var19 = (int)(Math.random() * (double)(this.field_h.field_e - 4)) - -2;
                                                                              break L66;
                                                                            }
                                                                          }
                                                                          L67: {
                                                                            L68: {
                                                                              var20 = 0;
                                                                              if (this.field_C[var15].field_t == 0) {
                                                                                break L68;
                                                                              } else {
                                                                                if (this.field_C[var15].field_t == 7) {
                                                                                  break L68;
                                                                                } else {
                                                                                  if (9 == this.field_C[var15].field_t) {
                                                                                    break L68;
                                                                                  } else {
                                                                                    L69: {
                                                                                      var25 = this.field_h.a(-118, var19, var20, var18);
                                                                                      var21 = var25;
                                                                                      if (var25.field_C == null) {
                                                                                        break L69;
                                                                                      } else {
                                                                                        if (this.field_C[var15].field_z < 2) {
                                                                                          break L69;
                                                                                        } else {
                                                                                          var20++;
                                                                                          var21 = this.field_h.a(-51, var19, var20, var18);
                                                                                          break L69;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    L70: {
                                                                                      if (null == var21.field_C) {
                                                                                        break L70;
                                                                                      } else {
                                                                                        if (3 > this.field_C[var15].field_z) {
                                                                                          break L70;
                                                                                        } else {
                                                                                          var20++;
                                                                                          var21 = this.field_h.a(-48, var19, var20, var18);
                                                                                          break L70;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    L71: {
                                                                                      if (var21.field_C == null) {
                                                                                        break L71;
                                                                                      } else {
                                                                                        if (-5 != (this.field_C[var15].field_z ^ -1)) {
                                                                                          break L71;
                                                                                        } else {
                                                                                          var20++;
                                                                                          var21 = this.field_h.a(102, var19, var20, var18);
                                                                                          break L71;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    L72: {
                                                                                      if (null == var21.field_C) {
                                                                                        break L72;
                                                                                      } else {
                                                                                        if ((this.field_C[var15].field_z ^ -1) != -5) {
                                                                                          break L72;
                                                                                        } else {
                                                                                          var20++;
                                                                                          var21 = this.field_h.a(-63, var19, var20, var18);
                                                                                          break L72;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    L73: {
                                                                                      if (this.field_h.a(var18, false, var20, var19)) {
                                                                                        stackIn_256_0 = 0;
                                                                                        break L73;
                                                                                      } else {
                                                                                        stackIn_256_0 = 1;
                                                                                        break L73;
                                                                                      }
                                                                                    }
                                                                                    L74: {
                                                                                      var22 = stackIn_256_0;
                                                                                      if (this.field_C[var15].field_z - 1 <= var21.field_r) {
                                                                                        break L74;
                                                                                      } else {
                                                                                        var22 = 0;
                                                                                        break L74;
                                                                                      }
                                                                                    }
                                                                                    if (4 == var21.field_b) {
                                                                                      break L67;
                                                                                    } else {
                                                                                      if (var21.field_b == 14) {
                                                                                        break L67;
                                                                                      } else {
                                                                                        var22 = 0;
                                                                                        break L67;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            L75: {
                                                                              var26 = this.field_h.a(124, var19, var20, var18);
                                                                              var21 = var26;
                                                                              if (var26.field_C == null) {
                                                                                break L75;
                                                                              } else {
                                                                                if ((this.field_C[var15].field_z ^ -1) > -3) {
                                                                                  break L75;
                                                                                } else {
                                                                                  var20++;
                                                                                  var21 = this.field_h.a(-32, var19, var20, var18);
                                                                                  break L75;
                                                                                }
                                                                              }
                                                                            }
                                                                            L76: {
                                                                              if (var21.field_C == null) {
                                                                                break L76;
                                                                              } else {
                                                                                if (this.field_C[var15].field_z < 3) {
                                                                                  break L76;
                                                                                } else {
                                                                                  var20++;
                                                                                  var21 = this.field_h.a(114, var19, var20, var18);
                                                                                  break L76;
                                                                                }
                                                                              }
                                                                            }
                                                                            L77: {
                                                                              if (null == var21.field_C) {
                                                                                break L77;
                                                                              } else {
                                                                                if (this.field_C[var15].field_z != 4) {
                                                                                  break L77;
                                                                                } else {
                                                                                  var20++;
                                                                                  var21 = this.field_h.a(-36, var19, var20, var18);
                                                                                  break L77;
                                                                                }
                                                                              }
                                                                            }
                                                                            L78: {
                                                                              if (null == var21.field_C) {
                                                                                break L78;
                                                                              } else {
                                                                                if (this.field_C[var15].field_z != 4) {
                                                                                  break L78;
                                                                                } else {
                                                                                  var20++;
                                                                                  var21 = this.field_h.a(-111, var19, var20, var18);
                                                                                  break L78;
                                                                                }
                                                                              }
                                                                            }
                                                                            L79: {
                                                                              if (-1001 <= (var23 ^ -1)) {
                                                                                break L79;
                                                                              } else {
                                                                                if ((this.field_C[var15].field_z ^ -1) != -5) {
                                                                                  break L79;
                                                                                } else {
                                                                                  this.field_C[var15].field_z = 3;
                                                                                  break L79;
                                                                                }
                                                                              }
                                                                            }
                                                                            L80: {
                                                                              if (1250 >= var23) {
                                                                                break L80;
                                                                              } else {
                                                                                if (this.field_C[var15].field_z != 3) {
                                                                                  break L80;
                                                                                } else {
                                                                                  this.field_C[var15].field_z = 2;
                                                                                  break L80;
                                                                                }
                                                                              }
                                                                            }
                                                                            L81: {
                                                                              if (var23 <= 1500) {
                                                                                break L81;
                                                                              } else {
                                                                                if (2 != this.field_C[var15].field_z) {
                                                                                  break L81;
                                                                                } else {
                                                                                  this.field_C[var15].field_z = 0;
                                                                                  break L81;
                                                                                }
                                                                              }
                                                                            }
                                                                            L82: {
                                                                              if (var21.field_C == null) {
                                                                                break L82;
                                                                              } else {
                                                                                if (!param0.field_db) {
                                                                                  break L82;
                                                                                } else {
                                                                                  if (Math.random() * 100.0 >= 75.0) {
                                                                                    break L82;
                                                                                  } else {
                                                                                    var20++;
                                                                                    var21 = this.field_h.a(88, var19, var20, var18);
                                                                                    break L82;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            L83: {
                                                                              if (var21.field_C == null) {
                                                                                break L83;
                                                                              } else {
                                                                                if (!param0.field_db) {
                                                                                  break L83;
                                                                                } else {
                                                                                  if (75.0 <= Math.random() * 100.0) {
                                                                                    break L83;
                                                                                  } else {
                                                                                    var20++;
                                                                                    var21 = this.field_h.a(124, var19, var20, var18);
                                                                                    break L83;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            L84: {
                                                                              if (this.field_h.a(var18, false, var20, var19)) {
                                                                                stackIn_293_0 = 0;
                                                                                break L84;
                                                                              } else {
                                                                                stackIn_293_0 = 1;
                                                                                break L84;
                                                                              }
                                                                            }
                                                                            L85: {
                                                                              var22 = stackIn_293_0;
                                                                              if (!param0.field_db) {
                                                                                break L85;
                                                                              } else {
                                                                                if (6 != var21.field_b) {
                                                                                  break L85;
                                                                                } else {
                                                                                  var22 = 0;
                                                                                  break L85;
                                                                                }
                                                                              }
                                                                            }
                                                                            L86: {
                                                                              if (!param0.field_db) {
                                                                                break L86;
                                                                              } else {
                                                                                if (12 != var21.field_b) {
                                                                                  break L86;
                                                                                } else {
                                                                                  var22 = 0;
                                                                                  break L86;
                                                                                }
                                                                              }
                                                                            }
                                                                            L87: {
                                                                              if (1 >= param0.field_Bb) {
                                                                                break L87;
                                                                              } else {
                                                                                if (var21.field_b != 0) {
                                                                                  break L87;
                                                                                } else {
                                                                                  var22 = 0;
                                                                                  break L87;
                                                                                }
                                                                              }
                                                                            }
                                                                            L88: {
                                                                              if (-1 + this.field_C[var15].field_z <= var21.field_r) {
                                                                                break L88;
                                                                              } else {
                                                                                if ((this.field_C[var15].field_z ^ -1) <= -5) {
                                                                                  break L88;
                                                                                } else {
                                                                                  var22 = 0;
                                                                                  break L88;
                                                                                }
                                                                              }
                                                                            }
                                                                            L89: {
                                                                              if (this.field_C[var15].field_z <= var21.field_r) {
                                                                                break L89;
                                                                              } else {
                                                                                if ((this.field_C[var15].field_z ^ -1) != -5) {
                                                                                  break L89;
                                                                                } else {
                                                                                  var22 = 0;
                                                                                  break L89;
                                                                                }
                                                                              }
                                                                            }
                                                                            L90: {
                                                                              if (var21.field_b != 3) {
                                                                                break L90;
                                                                              } else {
                                                                                var22 = 0;
                                                                                break L90;
                                                                              }
                                                                            }
                                                                            L91: {
                                                                              if (var21.field_b != 5) {
                                                                                break L91;
                                                                              } else {
                                                                                var22 = 0;
                                                                                break L91;
                                                                              }
                                                                            }
                                                                            L92: {
                                                                              if (8 != var21.field_b) {
                                                                                break L92;
                                                                              } else {
                                                                                var22 = 0;
                                                                                break L92;
                                                                              }
                                                                            }
                                                                            if (-1 != var21.field_b) {
                                                                              break L67;
                                                                            } else {
                                                                              var22 = 0;
                                                                              break L67;
                                                                            }
                                                                          }
                                                                          if (var22 == 0) {
                                                                            continue L64;
                                                                          } else {
                                                                            this.field_C[var15].field_F = var18;
                                                                            this.field_C[var15].field_H = var19;
                                                                            this.field_C[var15].field_E = var20;
                                                                            var21 = this.field_h.a(-119, var19, var20, var18);
                                                                            var21.field_h = this.field_C[var15];
                                                                            this.field_C[var15].field_c = var21;
                                                                            break L60;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                    L93: {
                                                                      if (1 != var17) {
                                                                        break L93;
                                                                      } else {
                                                                        this.field_C[var15].field_U = (int)(8.0 * Math.random());
                                                                        this.field_C[var15].field_z = 0;
                                                                        L94: while (true) {
                                                                          L95: {
                                                                            var20 = (int)(Math.random() * 4.0);
                                                                            var18 = (int)(Math.random() * (double)(-6 + this.field_h.field_b)) + 3;
                                                                            var19 = 3 + (int)(Math.random() * (double)(-6 + this.field_h.field_e));
                                                                            if (param0.field_Bb != 1) {
                                                                              break L95;
                                                                            } else {
                                                                              var20 = 0;
                                                                              break L95;
                                                                            }
                                                                          }
                                                                          L96: {
                                                                            if (0 != var20) {
                                                                              break L96;
                                                                            } else {
                                                                              var18 = (int)(Math.random() * 3.0 + 2.0);
                                                                              break L96;
                                                                            }
                                                                          }
                                                                          L97: {
                                                                            if (1 != var20) {
                                                                              break L97;
                                                                            } else {
                                                                              var18 = this.field_h.field_b - (int)(3.0 * Math.random() + 2.0);
                                                                              break L97;
                                                                            }
                                                                          }
                                                                          L98: {
                                                                            if (-3 != (var20 ^ -1)) {
                                                                              break L98;
                                                                            } else {
                                                                              var19 = (int)(2.0 + Math.random() * 3.0);
                                                                              break L98;
                                                                            }
                                                                          }
                                                                          L99: {
                                                                            if (3 != var20) {
                                                                              break L99;
                                                                            } else {
                                                                              var19 = this.field_h.field_e + -(int)(3.0 * Math.random() + 2.0);
                                                                              break L99;
                                                                            }
                                                                          }
                                                                          if (this.field_h.a(var18, false, 0, var19)) {
                                                                            continue L94;
                                                                          } else {
                                                                            this.field_C[var15].field_F = var18;
                                                                            this.field_C[var15].field_H = var19;
                                                                            this.field_h.field_f[var18][var19].field_h = this.field_C[var15];
                                                                            this.field_C[var15].field_c = this.field_h.field_f[var18][var19];
                                                                            break L93;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                    if (2 != var17) {
                                                                      break L54;
                                                                    } else {
                                                                      L100: {
                                                                        var18 = 0;
                                                                        var19 = 0;
                                                                        var20 = 0;
                                                                        if (var15 != 0 - -ak.field_q) {
                                                                          break L100;
                                                                        } else {
                                                                          var19 = 16;
                                                                          var20 = 0;
                                                                          this.field_C[var15].field_nb = new oh(2);
                                                                          var18 = 20;
                                                                          break L100;
                                                                        }
                                                                      }
                                                                      L101: {
                                                                        if (ak.field_q + 1 != var15) {
                                                                          break L101;
                                                                        } else {
                                                                          this.field_C[var15].field_nb = new oh(2);
                                                                          var19 = 20;
                                                                          var18 = 19;
                                                                          var20 = 0;
                                                                          break L101;
                                                                        }
                                                                      }
                                                                      L102: {
                                                                        if (ak.field_q + 2 != var15) {
                                                                          break L102;
                                                                        } else {
                                                                          var20 = 0;
                                                                          var18 = 26;
                                                                          var19 = 21;
                                                                          this.field_C[var15].field_nb = new oh(1);
                                                                          break L102;
                                                                        }
                                                                      }
                                                                      L103: {
                                                                        if (ak.field_q + 3 != var15) {
                                                                          break L103;
                                                                        } else {
                                                                          var20 = 0;
                                                                          var18 = 27;
                                                                          this.field_C[var15].field_nb = new oh(1);
                                                                          var19 = 18;
                                                                          break L103;
                                                                        }
                                                                      }
                                                                      L104: {
                                                                        if (4 + ak.field_q != var15) {
                                                                          break L104;
                                                                        } else {
                                                                          var20 = 0;
                                                                          var19 = 30;
                                                                          this.field_C[var15].field_nb = new oh(0);
                                                                          var18 = 28;
                                                                          break L104;
                                                                        }
                                                                      }
                                                                      L105: {
                                                                        if (var15 != ak.field_q + 5) {
                                                                          break L105;
                                                                        } else {
                                                                          this.field_C[var15].field_nb = new oh(1);
                                                                          var19 = 33;
                                                                          var20 = 0;
                                                                          var18 = 27;
                                                                          break L105;
                                                                        }
                                                                      }
                                                                      L106: {
                                                                        if (var15 != ak.field_q + 6) {
                                                                          break L106;
                                                                        } else {
                                                                          var19 = 31;
                                                                          this.field_C[var15].field_nb = new oh(1);
                                                                          var20 = 0;
                                                                          var18 = 29;
                                                                          break L106;
                                                                        }
                                                                      }
                                                                      L107: {
                                                                        if (7 - -ak.field_q != var15) {
                                                                          break L107;
                                                                        } else {
                                                                          this.field_C[var15].field_nb = new oh(3);
                                                                          var20 = 0;
                                                                          var18 = 25;
                                                                          var19 = 5;
                                                                          break L107;
                                                                        }
                                                                      }
                                                                      L108: {
                                                                        if (var15 != ak.field_q + 8) {
                                                                          break L108;
                                                                        } else {
                                                                          var18 = 26;
                                                                          var19 = 5;
                                                                          this.field_C[var15].field_nb = new oh(1);
                                                                          var20 = 0;
                                                                          break L108;
                                                                        }
                                                                      }
                                                                      L109: {
                                                                        if (var15 != ak.field_q + 9) {
                                                                          break L109;
                                                                        } else {
                                                                          this.field_C[var15].field_nb = new oh(3);
                                                                          var20 = 0;
                                                                          var18 = 27;
                                                                          var19 = 5;
                                                                          break L109;
                                                                        }
                                                                      }
                                                                      L110: {
                                                                        if (var15 != 10 - -ak.field_q) {
                                                                          break L110;
                                                                        } else {
                                                                          var19 = 37;
                                                                          var20 = 0;
                                                                          var18 = 2;
                                                                          this.field_C[var15].field_nb = new oh(2);
                                                                          break L110;
                                                                        }
                                                                      }
                                                                      L111: {
                                                                        if (var15 != ak.field_q + 11) {
                                                                          break L111;
                                                                        } else {
                                                                          this.field_C[var15].field_nb = new oh(2);
                                                                          var18 = 3;
                                                                          var20 = 0;
                                                                          var19 = 38;
                                                                          break L111;
                                                                        }
                                                                      }
                                                                      L112: {
                                                                        if (var15 != ak.field_q + 12) {
                                                                          break L112;
                                                                        } else {
                                                                          var18 = 29;
                                                                          var19 = 2;
                                                                          var20 = 0;
                                                                          this.field_C[var15].field_nb = new oh(2);
                                                                          break L112;
                                                                        }
                                                                      }
                                                                      L113: {
                                                                        if (13 + ak.field_q != var15) {
                                                                          break L113;
                                                                        } else {
                                                                          var20 = 0;
                                                                          var18 = 29;
                                                                          this.field_C[var15].field_nb = new oh(2);
                                                                          var19 = 1;
                                                                          break L113;
                                                                        }
                                                                      }
                                                                      this.field_C[var15].field_F = var18;
                                                                      this.field_C[var15].field_H = var19;
                                                                      this.field_C[var15].field_E = var20;
                                                                      var21 = this.field_h.a(-125, var19, var20, var18);
                                                                      var21.field_h = this.field_C[var15];
                                                                      this.field_C[var15].field_c = var21;
                                                                      this.field_C[var15].field_U = 6;
                                                                      break L54;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            var15++;
                                                            continue L50;
                                                          }
                                                        }
                                                      } else {
                                                        L114: {
                                                          if ((this.field_C[var15].field_t ^ -1) == -5) {
                                                            break L114;
                                                          } else {
                                                            if ((this.field_C[var15].field_t ^ -1) == -7) {
                                                              break L114;
                                                            } else {
                                                              L115: {
                                                                if (var10 > 0) {
                                                                  this.field_C[var15].field_z = 4;
                                                                  var10--;
                                                                  break L115;
                                                                } else {
                                                                  if (-1 > (var9 ^ -1)) {
                                                                    this.field_C[var15].field_z = 3;
                                                                    var9--;
                                                                    break L115;
                                                                  } else {
                                                                    if (0 >= var8) {
                                                                      break L115;
                                                                    } else {
                                                                      var8--;
                                                                      this.field_C[var15].field_z = 2;
                                                                      break L115;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              L116: {
                                                                if ((param0.field_Bb ^ -1) != -4) {
                                                                  break L116;
                                                                } else {
                                                                  if ((this.field_C[var15].field_t ^ -1) != -2) {
                                                                    break L116;
                                                                  } else {
                                                                    if (param0.field_ub != 2) {
                                                                      break L116;
                                                                    } else {
                                                                      this.field_C[var15].field_z = 2;
                                                                      break L116;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              if ((param0.field_Bb ^ -1) != -4) {
                                                                break L114;
                                                              } else {
                                                                if (this.field_C[var15].field_t != 1) {
                                                                  break L114;
                                                                } else {
                                                                  if (param0.field_ub != 1) {
                                                                    break L114;
                                                                  } else {
                                                                    this.field_C[var15].field_z = 1;
                                                                    break L114;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var15--;
                                                        continue L49;
                                                      }
                                                    }
                                                  } else {
                                                    this.field_C[var16] = new r(9, param0.field_Bb);
                                                    var16++;
                                                    var15++;
                                                    continue L48;
                                                  }
                                                }
                                              } else {
                                                this.field_C[var16] = new r(6, param0.field_Bb);
                                                var16++;
                                                var15++;
                                                continue L47;
                                              }
                                            }
                                          } else {
                                            this.field_C[var16] = new r(5, param0.field_Bb);
                                            var16++;
                                            var15++;
                                            continue L46;
                                          }
                                        }
                                      } else {
                                        this.field_C[var16] = new r(4, param0.field_Bb);
                                        var16++;
                                        var15++;
                                        continue L45;
                                      }
                                    }
                                  } else {
                                    this.field_C[var16] = new r(3, param0.field_Bb);
                                    var16++;
                                    var15++;
                                    continue L44;
                                  }
                                }
                              } else {
                                this.field_C[var16] = new r(2, param0.field_Bb);
                                var16++;
                                var15++;
                                continue L43;
                              }
                            }
                          } else {
                            this.field_C[var16] = new r(1, param0.field_Bb);
                            var16++;
                            var15++;
                            continue L42;
                          }
                        }
                      } else {
                        this.field_C[var16] = new r(0, param0.field_Bb);
                        var16++;
                        var15++;
                        continue L41;
                      }
                    }
                  } else {
                    L117: {
                      this.field_C[var16] = new r(7, param0.field_Bb);
                      if ((param0.field_Bb ^ -1) != -2) {
                        break L117;
                      } else {
                        L118: {
                          if (var15 != 0) {
                            break L118;
                          } else {
                            this.field_C[var16].field_F = 28;
                            this.field_C[var16].field_H = 37;
                            this.field_C[var16].field_U = 6;
                            break L118;
                          }
                        }
                        L119: {
                          if (1 != var15) {
                            break L119;
                          } else {
                            this.field_C[var16].field_F = 42;
                            this.field_C[var16].field_H = 43;
                            this.field_C[var16].field_U = 4;
                            break L119;
                          }
                        }
                        L120: {
                          if (2 != var15) {
                            break L120;
                          } else {
                            this.field_C[var16].field_F = 34;
                            this.field_C[var16].field_H = 19;
                            this.field_C[var16].field_U = 2;
                            break L120;
                          }
                        }
                        L121: {
                          if (-4 != (var15 ^ -1)) {
                            break L121;
                          } else {
                            this.field_C[var16].field_F = 27;
                            this.field_C[var16].field_H = 21;
                            this.field_C[var16].field_U = 4;
                            break L121;
                          }
                        }
                        this.field_C[var16].field_E = 0;
                        var17_ref_dl = this.field_h.a(-49, this.field_C[var16].field_H, this.field_C[var16].field_E, this.field_C[var16].field_F);
                        var17_ref_dl.field_h = this.field_C[var16];
                        this.field_C[var16].field_c = var17_ref_dl;
                        break L117;
                      }
                    }
                    var16++;
                    ak.field_q = ak.field_q + 1;
                    var15++;
                    continue L37;
                  }
                }
              } else {
                L122: {
                  if (param0.field_nb[var15] == null) {
                    break L122;
                  } else {
                    this.field_C[ak.field_q] = new r(param0.field_nb[var15]);
                    ak.field_q = ak.field_q + 1;
                    break L122;
                  }
                }
                var15++;
                continue L18;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L123: {
            var2 = decompiledCaughtException;
            stackIn_373_0 = (RuntimeException) (var2);

            stackIn_373_1 = new StringBuilder().append("e.<init>(");

            if (param0 == null) {
              stackIn_374_0 = (RuntimeException) ((Object) stackIn_373_0);
              stackIn_374_1 = (StringBuilder) ((Object) stackIn_373_1);
              stackIn_374_2 = "null";
              break L123;
            } else {
              stackIn_374_0 = (RuntimeException) ((Object) stackIn_373_0);
              stackIn_374_1 = (StringBuilder) ((Object) stackIn_373_1);
              stackIn_374_2 = "{...}";
              break L123;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_374_0), stackIn_374_2 + ')');
        }
    }

    static {
        field_t = new int[4];
        field_o = null;
        field_l = new rh(13, 0, 1, 0);
    }
}
