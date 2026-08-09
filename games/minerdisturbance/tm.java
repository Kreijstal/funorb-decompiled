/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm extends pi {
    private int field_F;
    private int field_y;
    private int field_n;
    private int field_H;
    static int field_v;
    private int field_A;
    private int field_z;
    private String[] field_t;
    private int field_r;
    private int field_C;
    private int field_J;
    private int field_o;
    private int field_p;
    private int field_w;
    private int field_E;
    int field_s;
    static byte[][] field_u;
    private int field_D;
    private int field_q;
    static int field_I;
    private int field_G;
    private boolean field_B;
    private float field_x;

    public static void a(byte param0) {
        try {
            field_u = (byte[][]) null;
            if (param0 >= -60) {
                field_I = 32;
            }
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "tm.F(" + param0 + ')');
        }
    }

    final boolean a(int param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 8) {
                break L1;
              } else {
                this.field_B = true;
                break L1;
              }
            }
            L2: {
              if (1.0f > this.field_x) {
                stackIn_7_0 = 0;
                break L2;
              } else {
                stackIn_7_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "tm.A(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final void a(boolean param0) {
        try {
            this.field_p = db.field_d;
            this.field_E = li.field_c;
            if (param0) {
                this.field_A = -66;
            }
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "tm.E(" + param0 + ')');
        }
    }

    final static void a(pb param0, int param1, int[] param2, int[] param3, boolean param4, boolean param5, boolean param6) {
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_75_1 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        StringBuilder stackIn_79_1 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
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
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        var30 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var7_int = 2147483647;
              var8 = -2147483648;
              var21 = param2[3] >> -1438759454;
              var22 = param2[4] >> -2123204094;
              var23 = param2[5] >> -1260355742;
              var24 = param2[6] >> 1488546242;
              var25 = param2[7] >> 1260932258;
              var26 = param2[8] >> -1178665982;
              var27 = param2[9] >> -820210558;
              var28 = param2[10] >> 654968706;
              var13 = var26 * param3[5] + (var24 * param3[3] + param3[4] * var25) >> 1072901006;
              var12 = param3[3] * var21 + (param3[4] * var22 + param3[5] * var23) >> -520637138;
              var29 = param2[11] >> -136854494;
              var17 = param3[6] * var27 + param3[7] * var28 + var29 * param3[8] >> -1198368530;
              var18 = var23 * param3[11] + (var21 * param3[9] + param3[10] * var22) >> 349265294;
              var19 = var24 * param3[9] - (-(var25 * param3[10]) - param3[11] * var26) >> 668381006;
              var15 = param3[7] * var22 + param3[6] * var21 - -(param3[8] * var23) >> -1539282514;
              var20 = var29 * param3[11] + var27 * param3[9] + param3[10] * var28 >> 1382583758;
              var14 = param3[3] * var27 + var28 * param3[4] + param3[5] * var29 >> 761327406;
              var16 = var26 * param3[8] + (param3[6] * var24 + var25 * param3[7]) >> 745049038;
              var21 = -param2[0] + param3[0];
              var22 = param3[1] - param2[1];
              var23 = param3[2] - param2[2];
              var9 = var23 * param2[5] + (var22 * param2[4] + param2[3] * var21) >> -ml.field_d + 16;
              var11 = param2[10] * var22 + var21 * param2[9] + var23 * param2[11] >> -145897456;
              var10 = var22 * param2[7] + var21 * param2[6] - -(param2[8] * var23) >> -ml.field_d + 16;
              var21 = dj.field_d;
              var22 = dj.field_c;
              if (param1 == -363953584) {
                break L1;
              } else {
                field_I = 80;
                break L1;
              }
            }
            var23 = 0;
            L2: while (true) {
              L3: {
                if ((param0.field_y ^ -1) >= (var23 ^ -1)) {
                  L4: {
                    if (param0.field_b == null) {
                      break L4;
                    } else {
                      if (null == param0.field_D) {
                        break L4;
                      } else {
                        if (null == param0.field_o) {
                          break L4;
                        } else {
                          if (null == param0.field_p) {
                            break L4;
                          } else {
                            if (null == param0.field_N) {
                              break L4;
                            } else {
                              if (null == param0.field_S) {
                                break L4;
                              } else {
                                if (param0.field_m == null) {
                                  break L4;
                                } else {
                                  if (null == param0.field_L) {
                                    break L4;
                                  } else {
                                    if (param0.field_k != null) {
                                      var23 = 0;
                                      L5: while (true) {
                                        if ((var23 ^ -1) <= (param0.field_I ^ -1)) {
                                          break L4;
                                        } else {
                                          var24 = param0.field_b[var23];
                                          var25 = param0.field_D[var23];
                                          var26 = param0.field_o[var23];
                                          sd.field_g[var23] = var9 - -(var25 * var15 + var24 * var12 + var18 * var26 >> -1613428336);
                                          kk.field_c[var23] = (var16 * var25 + (var24 * var13 + var19 * var26) >> -585034512) + var10;
                                          mj.field_n[var23] = (var24 * var14 + (var17 * var25 - -(var20 * var26)) >> -410258832) + var11;
                                          var24 = param0.field_p[var23];
                                          var25 = param0.field_N[var23];
                                          var26 = param0.field_S[var23];
                                          bl.field_z[var23] = (var24 * var12 + (var25 * var15 + var18 * var26) >> 1183260560) + var9;
                                          jc.field_F[var23] = var10 + (var13 * var24 + var25 * var16 - -(var19 * var26) >> 591515536);
                                          id.field_b[var23] = var11 + (var14 * var24 + var17 * var25 + var20 * var26 >> 1079038224);
                                          var24 = param0.field_m[var23];
                                          var25 = param0.field_L[var23];
                                          var26 = param0.field_k[var23];
                                          qg.field_n[var23] = var9 + (var15 * var25 + var24 * var12 + var18 * var26 >> -226410736);
                                          pk.field_f[var23] = (var25 * var16 + var13 * var24 + var26 * var19 >> -363953584) + var10;
                                          wc.field_a[var23] = (var20 * var26 + var25 * var17 + var24 * var14 >> -34052304) + var11;
                                          var23++;
                                          continue L5;
                                        }
                                      }
                                    } else {
                                      break L4;
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
                  if (param4) {
                    var9 = param3[3];
                    var10 = param3[4];
                    var11 = param3[5];
                    var12 = param3[6];
                    var13 = param3[7];
                    var14 = param3[8];
                    var15 = param3[9];
                    var16 = param3[10];
                    var17 = param3[11];
                    var18 = 0;
                    L6: while (true) {
                      stackIn_59_0 = var18;
                      stackIn_59_1 = param0.field_g;
                      if (stackIn_59_0 >= stackIn_59_1) {
                        break L3;
                      } else {
                        stackIn_62_0 = fb.field_b.length;
                        stackIn_62_1 = var18;
                        if (stackIn_62_0 <= stackIn_62_1) {
                          break L3;
                        } else {
                          var19 = param0.field_C[var18];
                          var20 = param0.field_q[var18];
                          var21 = param0.field_B[var18];
                          fb.field_b[var18] = var15 * var21 + (var20 * var12 + var9 * var19) >> -1577322032;
                          sf.field_a[var18] = var10 * var19 + (var20 * var13 + var16 * var21) >> 315659824;
                          h.field_a[var18] = var17 * var21 + (var14 * var20 + var19 * var11) >> -254115120;
                          var18++;
                          continue L6;
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                } else {
                  var24 = param0.field_n[var23];
                  var25 = param0.field_M[var23];
                  var26 = param0.field_Q[var23];
                  var27 = var9 + (var26 * var18 + var24 * var12 + var25 * var15 >> 16 - ml.field_d);
                  var28 = var10 - -(var19 * var26 + var24 * var13 - -(var25 * var16) >> 16 - ml.field_d);
                  var29 = (var17 * var25 + var14 * var24 + var20 * var26 >> -563390512) + var11;
                  stackIn_59_0 = var29;

                  stackIn_59_1 = 50;

                  L8: {
                    if (stackIn_59_0 < stackIn_59_1) {
                      oc.field_l[var23] = -2147483648;
                      break L8;
                    } else {
                      L9: {
                        wa.field_d[var23] = var27 / var29 + var21;
                        ti.field_O[var23] = var28 / var29 + var22;
                        if (var29 <= var8) {
                          break L9;
                        } else {
                          var8 = var29;
                          break L9;
                        }
                      }
                      oc.field_l[var23] = var29;
                      if ((var29 ^ -1) <= (var7_int ^ -1)) {
                        break L8;
                      } else {
                        var7_int = var29;
                        break L8;
                      }
                    }
                  }
                  L10: {
                    if (!param5) {
                      break L10;
                    } else {
                      kk.field_b[var23] = var27 >> ml.field_d;
                      dm.field_d[var23] = var28 >> ml.field_d;
                      nf.field_d[var23] = var29;
                      break L10;
                    }
                  }
                  var23++;
                  continue L2;
                }
              }
              ri.a(param6, var7_int, var8, param0, 0);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var7 = decompiledCaughtException;
            stackIn_71_0 = (RuntimeException) (var7);

            stackIn_71_1 = new StringBuilder().append("tm.D(");

            if (param0 == null) {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "null";
              break L11;
            } else {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "null";
              break L12;
            } else {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_79_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_76_2).append(',');

            if (param3 == null) {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "null";
              break L13;
            } else {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "{...}";
              break L13;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_72_0), stackIn_80_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final boolean e(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_2_0 = 0;
        int stackIn_25_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 3) {
              L1: {
                L2: {
                  L3: {
                    var2_int = -li.field_c + this.field_E;
                    var3 = -db.field_d + this.field_p;
                    var4 = var2_int + this.field_z;
                    var5 = this.field_C + var3;
                    if ((this.field_q ^ -1) <= -1) {
                      break L3;
                    } else {
                      if (!this.field_B) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (this.field_x < 1.0f) {
                      break L4;
                    } else {
                      if (404 < (var4 ^ -1)) {
                        break L2;
                      } else {
                        if ((var4 ^ -1) < -641) {
                          break L2;
                        } else {
                          if (var5 > 480) {
                            break L2;
                          } else {
                            if (var5 >= -40 + -this.field_A) {
                              break L4;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackIn_25_0 = 0;
                  break L1;
                }
                stackIn_25_0 = 1;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "tm.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_25_0 != 0;
        }
    }

    final void a(boolean param0, byte param1) {
        RuntimeException decompiledCaughtException = null;
        float var3_float = 0.0f;
        RuntimeException var3 = null;
        float var4 = 0.0f;
        try {
          L0: {
            L1: {
              var3_float = 1.0f - this.field_x;
              var4 = var3_float * var3_float;
              this.field_z = (int)(0.5f + (this.field_x * 2.0f * var3_float * (float)this.field_w + var4 * (float)this.field_y + this.field_x * this.field_x * (float)this.field_o));
              this.field_C = (int)(0.5f + ((float)this.field_r * (this.field_x * this.field_x) + (var4 * (float)this.field_H + (float)this.field_n * (this.field_x * 2.0f * var3_float))));
              this.field_x = this.field_x + 0.019999999552965164f;
              this.field_G = this.field_G + this.field_F;
              if (param1 >= 21) {
                break L1;
              } else {
                tm.a((pb) null, 112, (int[]) null, (int[]) null, true, false, true);
                break L1;
              }
            }
            L2: {
              this.field_q = this.field_q - 1;
              if (1.0f >= this.field_x) {
                break L2;
              } else {
                this.field_x = 1.0f;
                break L2;
              }
            }
            L3: {
              if (1 > this.field_G) {
                this.field_F = 10;
                this.field_G = 0;
                break L3;
              } else {
                if (this.field_G >= 255) {
                  this.field_F = -10;
                  this.field_G = 255;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var3), "tm.B(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(byte param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        int decompiledRegionSelector0 = 0;
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
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        var28 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (d.field_b) {
              L1: {
                var2_int = ce.field_d.field_I + (ce.field_d.field_E - 2);
                if (-471 > (350 + this.field_A ^ -1)) {
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (-1 <= (this.field_D ^ -1)) {
                  break L2;
                } else {
                  if ((this.field_J ^ -1) >= -1) {
                    break L2;
                  } else {
                    ef.field_b[3].a(-li.field_c + (this.field_D + -ef.field_b[3].field_x), (ef.field_b[3].field_A >> 1179547202) + (this.field_J - db.field_d), this.field_G ^ -1 | this.field_G << 1972890860);
                    break L2;
                  }
                }
              }
              L3: {
                L4: {
                  var3 = -li.field_c + this.field_E;
                  var4 = -db.field_d + this.field_p;
                  var5 = ca.field_k * 32 + -li.field_c + sk.field_d / 10;
                  var6 = -db.field_d + 32 * hf.field_t - -(mf.field_i / 10);
                  var7 = 360;
                  if ((var5 ^ -1) >= (-96 + (this.field_z - -var3) - 32 ^ -1)) {
                    break L4;
                  } else {
                    if ((45 + (this.field_z - -var3 - (-var7 - 96)) ^ -1) >= (var5 ^ -1)) {
                      break L4;
                    } else {
                      if (var6 <= -128 + (var4 + this.field_C)) {
                        break L4;
                      } else {
                        if (40 + this.field_A + (this.field_C - -var4 + 96) <= var6) {
                          break L4;
                        } else {
                          L5: {
                            if (!this.field_B) {
                              break L5;
                            } else {
                              if (this.field_x >= 1.0f) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          stackIn_29_0 = 1;
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackIn_29_0 = 0;
                break L3;
              }
              L6: {
                var8 = stackIn_29_0;
                if (var8 != 0) {
                  L7: {
                    var9 = 0;
                    var10 = a.field_a[0].field_x >> 671904225;
                    var11 = a.field_a[0].field_A >> 1802860673;
                    var12 = var10 + var5 + 96;
                    var13 = var11 + var6 + 96;
                    var14 = var11 + var6 + -96;
                    var15 = var10 + var5 - 96;
                    var16 = 0;
                    if (-1 >= (var15 ^ -1)) {
                      break L7;
                    } else {
                      var16 = var15 * -1;
                      var15 = 0;
                      break L7;
                    }
                  }
                  L8: {
                    var17 = 0;
                    if (var14 >= 0) {
                      break L8;
                    } else {
                      var14 = 0;
                      break L8;
                    }
                  }
                  L9: {
                    if (eh.field_g + -1 < var12) {
                      var17 = var12 - -1 - eh.field_g;
                      var12 = -1 + eh.field_g;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (var14 <= -1 + eh.field_c) {
                      break L10;
                    } else {
                      var14 = eh.field_c - 1;
                      break L10;
                    }
                  }
                  L11: while (true) {
                    if ((var14 ^ -1) <= (var13 ^ -1)) {
                      break L6;
                    } else {
                      var9 = var9 + var16;
                      var18 = var15;
                      L12: while (true) {
                        if (var18 >= var12) {
                          var9 = var9 + var17;
                          var14++;
                          continue L11;
                        } else {
                          incrementValue$0 = var9;
                          var9++;
                          m.field_j[incrementValue$0] = eh.field_f[var14 * eh.field_g + var18];
                          var18++;
                          continue L12;
                        }
                      }
                    }
                  }
                } else {
                  break L6;
                }
              }
              L13: {
                if (!this.field_B) {
                  g.a(var4 + this.field_C, 60 + this.field_A, var3 + this.field_z, var7 + 60, (byte) 93, hd.field_d);
                  break L13;
                } else {
                  L14: {
                    var9 = var7 - -60;
                    var9 = var9 - (ah.field_c[2].field_x + ah.field_c[0].field_x);
                    var10 = this.field_A + 60;
                    var9 = var9 / ah.field_c[1].field_x * ah.field_c[1].field_x;
                    var9 = var9 + (ah.field_c[2].field_x + ah.field_c[0].field_x);
                    var10 = var10 - (ah.field_c[0].field_A - -ah.field_c[6].field_A);
                    var10 = (var10 / ah.field_c[3].field_A + 1) * ah.field_c[3].field_A;
                    if ((var7 - -60 ^ -1) < (var9 ^ -1)) {
                      var9 = var9 + ah.field_c[1].field_x;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    var10 = var10 + (ah.field_c[0].field_A + ah.field_c[6].field_A);
                    if (this.field_A + 60 > var10) {
                      var10 = var10 + ah.field_c[1].field_A;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  var11 = 60 + var7 - var9;
                  var12 = -var10 + 60 + this.field_A;
                  g.a(this.field_C + var4 - -(var12 / 2), var10, var3 + (this.field_z + var11 / 2), var9, (byte) 31, ah.field_c);
                  break L13;
                }
              }
              L16: {
                var9 = 0;
                var10 = 30 + this.field_z + var3;
                var11 = var4 + (40 + this.field_C);
                var12 = 0;
                if (!this.field_B) {
                  break L16;
                } else {
                  var12 = mm.field_a.field_I - -mm.field_a.field_E;
                  mm.field_a.a(oe.field_f, var10, var11, 1, 8063303);
                  break L16;
                }
              }
              var13 = 0;
              if (param0 == 94) {
                L17: while (true) {
                  L18: {
                    if ((this.field_t.length ^ -1) >= (var13 ^ -1)) {
                      var13 = 0;
                      stackIn_95_0 = -4;
                      stackIn_95_1 = this.field_s ^ -1;
                      break L18;
                    } else {
                      stackIn_95_0 = 3;

                      stackIn_95_1 = this.field_s;

                      L19: {
                        L20: {
                          L21: {
                            if (stackIn_95_0 != stackIn_95_1) {
                              break L21;
                            } else {
                              if (1 >= var13) {
                                break L21;
                              } else {
                                if (5 > var13) {
                                  break L20;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                          if (16 == this.field_s) {
                            break L20;
                          } else {
                            if ((this.field_s ^ -1) == -14) {
                              break L20;
                            } else {
                              if ((this.field_s ^ -1) == -1) {
                                break L20;
                              } else {
                                if (2 == this.field_s) {
                                  break L20;
                                } else {
                                  if ((this.field_s ^ -1) != -10) {
                                    var7 = 360;
                                    break L19;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var7 = 313;
                        break L19;
                      }
                      ce.field_d.a(this.field_t[var13], -var7 + 360 + var10, var12 + var9 * var2_int + var11 + -ce.field_d.field_I, var7, 480, 1, -1, 0, 0, var2_int);
                      var9 = var9 + ce.field_d.a(this.field_t[var13], var7);
                      var13++;
                      continue L17;
                    }
                  }
                  L22: {
                    if (stackIn_95_0 != stackIn_95_1) {
                      if (this.field_s != 9) {
                        if (-3 == (this.field_s ^ -1)) {
                          fl.field_j[8].c(var10, var11);
                          var13 = fl.field_j[8].field_j;
                          break L22;
                        } else {
                          L23: {
                            if (0 == this.field_s) {
                              break L23;
                            } else {
                              if (16 != this.field_s) {
                                if (this.field_s != 13) {
                                  break L22;
                                } else {
                                  fl.field_j[9].c(var10, 15 + var11);
                                  var13 = fl.field_j[9].field_j;
                                  break L22;
                                }
                              } else {
                                break L23;
                              }
                            }
                          }
                          fl.field_j[5].c(var10, var11 + 20);
                          var13 = fl.field_j[5].field_j;
                          break L22;
                        }
                      } else {
                        fl.field_j[3].c(var10, 35 + var11);
                        var13 = fl.field_j[3].field_j;
                        break L22;
                      }
                    } else {
                      fl.field_j[7].c(var10, var11 + 35);
                      break L22;
                    }
                  }
                  L24: {
                    if (!this.field_B) {
                      ce.field_d.a(aj.field_a, var10, var12 + (var11 - -(var2_int * (var9 - -1))), 1, -1);
                      ce.field_d.c(qe.field_d, -15 + (var10 - -var7 + var13), var11 - (-(var2_int * (var9 - -1)) + -var12), 1, -1);
                      ce.field_d.c(Integer.toString(this.field_q / 100), var13 + (var7 + var10), var11 - (-(var2_int * (1 + var9)) - var12), 1, -1);
                      break L24;
                    } else {
                      ce.field_d.a(ni.field_b, var10, (1 + var9) * var2_int + var11 - -var12, 1, -1);
                      break L24;
                    }
                  }
                  L25: {
                    if (var8 == 0) {
                      break L25;
                    } else {
                      L26: {
                        var14 = 0;
                        var15 = a.field_a[0].field_x >> 675825793;
                        var16 = a.field_a[0].field_A >> 1248886913;
                        var17 = var15 + (var5 + 96);
                        var18 = var16 + (var6 + 96);
                        var19 = var16 + (-96 + var6);
                        var20 = var15 + var5 - 96;
                        var21 = 0;
                        if (-1 >= (var20 ^ -1)) {
                          break L26;
                        } else {
                          var21 = var20 * -1;
                          var20 = 0;
                          break L26;
                        }
                      }
                      L27: {
                        var22 = 0;
                        if (-1 + eh.field_g >= var17) {
                          break L27;
                        } else {
                          var22 = -eh.field_g - -1 + var17;
                          var17 = -1 + eh.field_g;
                          break L27;
                        }
                      }
                      L28: {
                        if (0 > var19) {
                          var19 = 0;
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                      L29: {
                        if (eh.field_c - 1 >= var19) {
                          break L29;
                        } else {
                          var19 = -1 + eh.field_c;
                          break L29;
                        }
                      }
                      L30: while (true) {
                        if (var19 >= var18) {
                          break L25;
                        } else {
                          var14 = var14 + var21;
                          var23 = var20;
                          L31: while (true) {
                            if (var17 <= var23) {
                              var14 = var14 + var22;
                              var19++;
                              continue L30;
                            } else {
                              var24 = ec.field_b[var14];
                              var25 = -var24 + 256;
                              var26 = eh.field_f[eh.field_g * var19 - -var23];
                              incrementValue$1 = var14;
                              var14++;
                              var27 = m.field_j[incrementValue$1];
                              eh.field_f[var23 + eh.field_g * var19] = c.a(16711680, var24 * c.a(var27, 65280) - -(c.a(var26, 65280) * var25)) + c.a(-16711936, var25 * c.a(var26, 16711935) + c.a(var27, 16711935) * var24) >> 1964181640;
                              var23++;
                              continue L31;
                            }
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "tm.G(" + param0 + ')');
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

    tm(int param0, int param1, int param2, boolean param3) {
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (e.field_i[param0].length != 1) {
                this.field_t = e.field_i[param0][cm.field_o];
                break L1;
              } else {
                this.field_t = e.field_i[param0][0];
                break L1;
              }
            }
            if (null != this.field_t) {
              L2: {
                L3: {
                  this.field_J = param2;
                  this.field_q = 2000;
                  this.field_x = 0.0f;
                  this.field_s = param0;
                  this.field_D = param1;
                  this.field_B = param3;
                  var5_int = ce.field_d.field_I + (ce.field_d.field_E + -2);
                  var6 = 360;
                  if (-10 == (this.field_s ^ -1)) {
                    break L3;
                  } else {
                    if (this.field_s == 2) {
                      break L3;
                    } else {
                      if (-1 == (this.field_s ^ -1)) {
                        break L3;
                      } else {
                        if (this.field_s == 16) {
                          break L3;
                        } else {
                          if (this.field_s != 13) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                var6 = 313;
                break L2;
              }
              var7 = 0;
              L4: while (true) {
                L5: {
                  if (var7 >= this.field_t.length) {
                    L6: {
                      this.field_A = this.field_A + ce.field_d.a(uf.field_v, var6);
                      this.field_A = this.field_A * var5_int;
                      this.field_A = this.field_A + 10;
                      if (this.field_B) {
                        this.field_A = this.field_A + (mm.field_a.field_E + mm.field_a.field_I);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var7 = 380;
                    stackIn_37_0 = 0;
                    stackIn_37_1 = param1;
                    break L5;
                  } else {
                    stackIn_37_0 = this.field_s;

                    stackIn_37_1 = 3;

                    L7: {
                      if (stackIn_37_0 != stackIn_37_1) {
                        break L7;
                      } else {
                        if ((var7 ^ -1) >= -2) {
                          break L7;
                        } else {
                          var6 = 320;
                          break L7;
                        }
                      }
                    }
                    this.field_A = this.field_A + ce.field_d.a(this.field_t[var7], var6);
                    var7++;
                    continue L4;
                  }
                }
                L8: {
                  if (stackIn_37_0 < stackIn_37_1) {
                    param1 = param1 - li.field_c;
                    break L8;
                  } else {
                    param1 = 320;
                    break L8;
                  }
                }
                L9: {
                  L10: {
                    var8 = 20 + this.field_A;
                    var9 = -var8 + (-64 + 32 * hf.field_t) - db.field_d;
                    this.field_o = 32 * ca.field_k - li.field_c + -180;
                    if ((db.field_d + var9 ^ -1) > -33) {
                      break L10;
                    } else {
                      if (this.field_B) {
                        break L10;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var9 = 64 + (32 * hf.field_t + -db.field_d);
                  break L9;
                }
                L11: {
                  this.field_z = -var7;
                  this.field_C = 480 + var8;
                  if (-1 >= (this.field_o ^ -1)) {
                    if ((this.field_o ^ -1) >= (1024 + -li.field_c - 405 ^ -1)) {
                      break L11;
                    } else {
                      this.field_o = -li.field_c + 555;
                      break L11;
                    }
                  } else {
                    this.field_o = 64;
                    break L11;
                  }
                }
                this.field_H = this.field_C;
                this.field_y = this.field_z;
                this.field_r = var9;
                this.field_w = 180 + (this.field_r + this.field_z);
                this.field_E = li.field_c;
                this.field_p = db.field_d;
                this.field_n = this.field_C - -this.field_o + this.field_A / 2;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var5), "tm.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_u = new byte[250][];
    }
}
