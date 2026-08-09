/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk {
    private kc field_D;
    private int field_a;
    private int field_k;
    private int field_bb;
    private int field_l;
    private boolean field_yb;
    private int field_pb;
    private int field_zb;
    private int field_c;
    private int field_K;
    private md[] field_A;
    private int field_eb;
    private boolean field_j;
    int field_b;
    private int field_lb;
    private int field_ub;
    private qf[] field_n;
    private int field_O;
    private int field_sb;
    private int field_db;
    private int field_Ab;
    private int field_fb;
    private wm[] field_i;
    private int field_w;
    static l field_wb;
    private eu[] field_S;
    private int field_Bb;
    private int field_o;
    private o[] field_E;
    private md field_X;
    private boolean field_m;
    int field_q;
    private int field_L;
    private ok[] field_C;
    private int field_ab;
    static hc field_e;
    private int field_qb;
    private int[] field_r;
    private vc[] field_z;
    private int field_gb;
    private int field_v;
    private int field_p;
    private int field_d;
    private int field_T;
    private hk field_vb;
    private int field_xb;
    private int[] field_Z;
    private double field_kb;
    private int field_H;
    private int field_cb;
    private boolean field_rb;
    private int field_tb;
    private boolean field_Eb;
    private boolean field_ob;
    private boolean field_Cb;
    private int field_P;
    private boolean field_B;
    private int field_jb;
    private boolean field_U;
    private boolean field_g;
    private int field_N;
    private int field_s;
    private int field_mb;
    private int field_G;
    private boolean field_W;
    private int field_M;
    private int field_h;
    private int field_F;
    private int field_J;
    private double field_hb;
    private double field_u;
    private int field_x;
    private int field_nb;
    private int field_ib;
    private int field_Db;
    private int field_Q;
    private double field_Y;
    private int field_y;
    private int field_V;
    private int field_R;
    private int field_f;
    private double field_t;

    private final void a(ha param0, int param1) {
        int stackIn_53_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_79_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        int stackIn_88_0 = 0;
        int stackIn_102_0 = 0;
        bo stackIn_129_0;
        int stackIn_129_1;
        int stackIn_129_2;
        int stackIn_129_3;
        int stackIn_129_4;
        bo stackIn_130_0 = null;
        int stackIn_130_1 = 0;
        int stackIn_130_2 = 0;
        int stackIn_130_3 = 0;
        int stackIn_130_4 = 0;
        int stackIn_130_5 = 0;
        int stackIn_135_0 = 0;
        int stackIn_135_1 = 0;
        int stackIn_163_0 = 0;
        RuntimeException stackIn_175_0 = null;
        StringBuilder stackIn_175_1 = null;
        RuntimeException stackIn_176_0 = null;
        StringBuilder stackIn_176_1 = null;
        String stackIn_176_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        ok var4 = null;
        int var5 = 0;
        bo var5_ref_bo = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        md[] var10_ref_md__ = null;
        int var10 = 0;
        int var11 = 0;
        md var12 = null;
        int var13 = 0;
        var13 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if ((this.field_R ^ -1) > -201) {
                  L3: {
                    var3_int = 128 + (int)(128.0 * -Math.cos((double)this.field_R * 3.141592653589793 / 200.0));
                    var4_int = var3_int * 140 >> -731047608;
                    if (!this.field_Cb) {
                      var5 = -var4_int - -5;
                      var6 = 5;
                      var7 = 0;
                      L4: while (true) {
                        if (-8 >= (var7 ^ -1)) {
                          break L3;
                        } else {
                          var8 = 0;
                          stackIn_135_0 = -1;

                          stackIn_135_1 = var7 ^ -1;

                          L5: {
                            if (stackIn_135_0 != stackIn_135_1) {
                              break L5;
                            } else {
                              var8 = this.field_d;
                              break L5;
                            }
                          }
                          L6: {
                            if (1 != var7) {
                              break L6;
                            } else {
                              var8 = this.field_J;
                              break L6;
                            }
                          }
                          L7: {
                            if (-3 != (var7 ^ -1)) {
                              break L7;
                            } else {
                              var8 = this.field_x;
                              break L7;
                            }
                          }
                          L8: {
                            if ((var7 ^ -1) == -4) {
                              var8 = this.field_H;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          L9: {
                            if (4 != var7) {
                              break L9;
                            } else {
                              var8 = this.field_F;
                              break L9;
                            }
                          }
                          L10: {
                            if ((var7 ^ -1) != -6) {
                              break L10;
                            } else {
                              var9 = 0;
                              var10_ref_md__ = this.field_A;
                              var11 = 0;
                              L11: while (true) {
                                if ((var10_ref_md__.length ^ -1) >= (var11 ^ -1)) {
                                  var8 = var9;
                                  break L10;
                                } else {
                                  L12: {
                                    var12 = var10_ref_md__[var11];
                                    if (var12 == null) {
                                      break L12;
                                    } else {
                                      if (-1 <= (var12.field_k ^ -1)) {
                                        break L12;
                                      } else {
                                        if (this.field_X != var12) {
                                          if (gh.field_j != var12.field_r) {
                                            break L12;
                                          } else {
                                            var9++;
                                            break L12;
                                          }
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                  }
                                  var11++;
                                  continue L11;
                                }
                              }
                            }
                          }
                          L13: {
                            var9 = (int)((1.0 + Math.sin((double)this.field_c * 3.141592653589793 / 20.0)) * 127.0);
                            if (-1 != (var9 ^ -1)) {
                              break L13;
                            } else {
                              this.field_y = this.field_p;
                              break L13;
                            }
                          }
                          L14: {
                            if ((1 + var7 ^ -1) < (this.field_y ^ -1)) {
                              stackIn_53_0 = 0;
                              break L14;
                            } else {
                              stackIn_53_0 = 1;
                              break L14;
                            }
                          }
                          L15: {
                            var10 = stackIn_53_0;
                            if (-7 != (var7 ^ -1)) {
                              L16: {
                                if (var7 == 4) {
                                  break L16;
                                } else {
                                  if (5 != var7) {
                                    L17: {
                                      if (var8 <= 12) {
                                        break L17;
                                      } else {
                                        var8 = 12;
                                        break L17;
                                      }
                                    }
                                    L18: {
                                      stackIn_79_0 = var10;

                                      if (12 <= var8) {
                                        stackIn_80_0 = stackIn_79_0;
                                        stackIn_80_1 = 0;
                                        break L18;
                                      } else {
                                        stackIn_80_0 = stackIn_79_0;
                                        stackIn_80_1 = 1;
                                        break L18;
                                      }
                                    }
                                    var10 = stackIn_80_0 & stackIn_80_1;
                                    break L15;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              L19: {
                                if (6 < var8) {
                                  var8 = 6;
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              L20: {
                                stackIn_70_0 = var10;

                                if ((var8 ^ -1) <= -7) {
                                  stackIn_71_0 = stackIn_70_0;
                                  stackIn_71_1 = 0;
                                  break L20;
                                } else {
                                  stackIn_71_0 = stackIn_70_0;
                                  stackIn_71_1 = 1;
                                  break L20;
                                }
                              }
                              var10 = stackIn_71_0 & stackIn_71_1;
                              var8 += 13;
                              break L15;
                            } else {
                              var8 = 20;
                              break L15;
                            }
                          }
                          L21: {
                            jm.field_a[var8].a(var5, var6);
                            if (-7 == (var7 ^ -1)) {
                              L22: {
                                if (-51 <= (this.field_V ^ -1)) {
                                  stackIn_88_0 = 16777215 | 255 * this.field_V / 50 << -139422792;
                                  break L22;
                                } else {
                                  stackIn_88_0 = -1;
                                  break L22;
                                }
                              }
                              var11 = stackIn_88_0;
                              jm.field_a[1 + var8].a(var5, var6, 0, var11, 1);
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          L23: {
                            bs.field_b[var7].a(var5, var6);
                            if (var10 == 0) {
                              break L23;
                            } else {
                              uc.field_o[1].a(var5 - 9, -12 + var6, 0, var9 * 16843009, 2);
                              break L23;
                            }
                          }
                          L24: {
                            if (this.field_r[var7] > 0) {
                              L25: {
                                var9 = this.field_r[var7];
                                if (64 <= var9) {
                                  if (var9 > 448) {
                                    stackIn_102_0 = -(var9 + -512 << 1663820994);
                                    break L25;
                                  } else {
                                    stackIn_102_0 = 255;
                                    break L25;
                                  }
                                } else {
                                  stackIn_102_0 = var9 << 1362916642;
                                  break L25;
                                }
                              }
                              var9 = stackIn_102_0;
                              var9 = (-var3_int + 256) * var9 >> -734226328;
                              if ((var9 ^ -1) < -1) {
                                rb.field_j.a(16777215 | var9 << 1370642936, -1, var5 + 55, ii.field_e[var7], param1 ^ -1573, 24 - -var6);
                                break L24;
                              } else {
                                break L24;
                              }
                            } else {
                              break L24;
                            }
                          }
                          var6 += 38;
                          var7++;
                          continue L4;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L26: {
                    var5_ref_bo = fa.a(param0, true);
                    var6 = 0;
                    if (-1 > (this.field_G ^ -1)) {
                      var6 = 40 * (int)(-Math.cos((double)this.field_G * 3.141592653589793 / 200.0) * 128.0) - -5120 >> -387728792;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if (!this.field_Eb) {
                      break L27;
                    } else {
                      if (!this.field_j) {
                        break L27;
                      } else {
                        var4_int = (var3_int * 40 >> 1216468232) + var6;
                        param0.d(33, 70, 0 + -var4_int, -5782, -65281, sh.field_u + -211);
                        var4_int = var3_int * 146 >> 1340445672;
                        param0.d(33, 213, 0, -5782, -65281, -149 + sh.field_u - -var4_int);
                        break L27;
                      }
                    }
                  }
                  var4_int = var6 + (40 * var3_int >> 747974280);
                  ua.field_g[1].a(-208 + sh.field_u, -var4_int);
                  this.a(this.field_P, 3, -var4_int + 4, true, this.field_Q, this.field_tb, -167 + sh.field_u, true, 10);
                  var4_int = 146 * var3_int >> -714998776;
                  ua.field_g[0].a(sh.field_u - 146 - -var4_int, 0);
                  this.a(this.field_N, 8, 4, false, this.field_cb, this.field_nb, -21 + (sh.field_u + var4_int), false, 10);
                  var4_int = 130 * var3_int >> 1578972072;
                  this.a(param0, var4_int, param1 ^ -16732145);
                  var4_int = 35 * var3_int >> -1958335640;
                  var7 = sh.field_u - 30;
                  var8 = var4_int + gp.field_w - 30;
                  var9 = 0;
                  L28: while (true) {
                    if (var9 >= this.field_F) {
                      var4_int = var3_int * 80 >> 916492840;
                      var8 = gp.field_w - 150;
                      var7 = -25 + (sh.field_u + var4_int);
                      ii.field_k[1][2].a(var7, var8);
                      var5_ref_bo.a(var7 + 20, var7, 124 + var8, -this.field_a + var8 - -104, 82);
                      ii.field_k[1][1].a(var7, var8);
                      var5_ref_bo.a(true);
                      ii.field_k[1][0].a(var7, var8);
                      var7 = var4_int + (sh.field_u + -50);
                      var8 = -150 + gp.field_w;
                      ii.field_k[0][2].a(var7, var8);
                      var5_ref_bo.a(var7 - -20, var7, var8 - -124, -this.field_eb + var8 + 101, -92);
                      ii.field_k[0][1].a(var7, var8);
                      var5_ref_bo.a(true);
                      ii.field_k[0][0].a(var7, var8);
                      var9 = 0;
                      L29: while (true) {
                        if ((var9 ^ -1) <= (gh.field_j.field_e ^ -1)) {
                          L30: {
                            var7 = var4_int + (-80 + sh.field_u);
                            var8 = -151 + gp.field_w;
                            ii.field_k[2][3].a(var7, var8, 0, 16777215 | this.field_bb << -1061353992, 1);
                            var5_ref_bo.a(30 + var7, var7, 135 + var8, -this.field_qb + (103 + var8), param1 + 20115);
                            ii.field_k[2][2].a(var7, var8, 0, 16777215 | this.field_bb << -1088198952, 1);
                            var5_ref_bo.a(true);
                            ii.field_k[2][1].a(var7, var8, 0, this.field_bb << -783056072 | 16777215, 1);
                            var9 = (int)((1.0 + Math.sin((double)this.field_c * 3.141592653589793 / 20.0)) * (double)this.field_bb / 2.0);
                            stackIn_129_0 = (bo) (var5_ref_bo);

                            stackIn_129_1 = 30 + var7;

                            stackIn_129_2 = var7;

                            stackIn_129_3 = var8 + 135;

                            stackIn_129_4 = 103 + var8 - this.field_qb;

                            if (this.field_qb >= 99) {
                              stackIn_130_0 = (bo) ((Object) stackIn_129_0);
                              stackIn_130_1 = stackIn_129_1;
                              stackIn_130_2 = stackIn_129_2;
                              stackIn_130_3 = stackIn_129_3;
                              stackIn_130_4 = stackIn_129_4;
                              stackIn_130_5 = 50;
                              break L30;
                            } else {
                              stackIn_130_0 = (bo) ((Object) stackIn_129_0);
                              stackIn_130_1 = stackIn_129_1;
                              stackIn_130_2 = stackIn_129_2;
                              stackIn_130_3 = stackIn_129_3;
                              stackIn_130_4 = stackIn_129_4;
                              stackIn_130_5 = 0;
                              break L30;
                            }
                          }
                          ((bo) (Object) stackIn_130_0).a(stackIn_130_1, stackIn_130_2, stackIn_130_3, stackIn_130_4 + -stackIn_130_5, 100);
                          ii.field_k[2][0].a(var7, var8, 0, 16843009 * var9, 2);
                          var5_ref_bo.a(true);
                          if (this.field_gb > 0) {
                            po.field_e[-1 + this.field_gb].a(var7 - -7, 104 + var8, 0, this.field_bb << 1094384952 | 16777215, 1);
                            break L2;
                          } else {
                            break L2;
                          }
                        } else {
                          var10 = -(var9 * 100 / gh.field_j.field_e) + (var8 + 100);
                          param0.b(var10, var7 + 5, var7 + 10, 1879048192, var10, 1);
                          param0.b(var10 - -1, var7 - -5, var7 + 10, 1073741824, var10 - -1, 1);
                          var9++;
                          continue L29;
                        }
                      }
                    } else {
                      this.field_X.field_r.b(-32275)[4].b(var7, var8, 20, 20);
                      var7 -= 20;
                      var9++;
                      continue L28;
                    }
                  }
                } else {
                  break L2;
                }
              }
              stackIn_135_0 = param1;
              stackIn_135_1 = -20240;
              break L1;
            }
            L31: {
              if (stackIn_135_0 == stackIn_135_1) {
                break L31;
              } else {
                this.field_G = -51;
                break L31;
              }
            }
            var3_int = 0;
            L32: while (true) {
              if (var3_int >= this.field_K) {
                L33: {
                  if (!this.field_j) {
                    break L33;
                  } else {
                    if (!this.field_W) {
                      break L33;
                    } else {
                      rb.field_j.a(119, -16711936, -16777216, 50, sh.field_u - 20, Integer.toString(this.field_h));
                      break L33;
                    }
                  }
                }
                break L0;
              } else {
                L34: {
                  var4 = this.field_C[var3_int];
                  if (-1 <= (var4.field_d ^ -1)) {
                    break L34;
                  } else {
                    L35: {
                      var5 = var4.field_k >> 360550248;
                      var6 = var4.field_n >> 433276584;
                      var7 = var4.field_m >> 1882164840;
                      var8 = (var4.field_d + -Math.abs(var4.field_h)) * var4.field_p / var4.field_d;
                      if ((var4.field_e ^ -1) != -1) {
                        break L35;
                      } else {
                        if ((var4.field_h ^ -1) > (var4.field_d ^ -1)) {
                          L36: {
                            if ((var8 ^ -1) >= -65) {
                              stackIn_163_0 = var8 << 1491535098 | 16711680;
                              break L36;
                            } else {
                              if (-193 <= (var8 ^ -1)) {
                                stackIn_163_0 = (-64 + var8 | -1107296384) << -1598903735;
                                break L36;
                              } else {
                                stackIn_163_0 = var8 - 192 << -103581278 | -256;
                                break L36;
                              }
                            }
                          }
                          var9 = stackIn_163_0;
                          param0.b(var6, var5, var4.field_c >> -1306738296, var9, var4.field_g >> 2101580712, param1 ^ -20239);
                          break L34;
                        } else {
                          break L35;
                        }
                      }
                    }
                    if ((var4.field_e ^ -1) != -2) {
                      break L34;
                    } else {
                      es.field_b[(var4.field_d - -var4.field_p) % es.field_b.length].a(-var7 + var5, var6 + -var7, var7 << -1213288671, var7 << -1555596159, 0, var8 << -521957384 | 16777215, 1);
                      break L34;
                    }
                  }
                }
                var3_int++;
                continue L32;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L37: {
            var3 = decompiledCaughtException;
            stackIn_175_0 = (RuntimeException) (var3);

            stackIn_175_1 = new StringBuilder().append("pk.V(");

            if (param0 == null) {
              stackIn_176_0 = (RuntimeException) ((Object) stackIn_175_0);
              stackIn_176_1 = (StringBuilder) ((Object) stackIn_175_1);
              stackIn_176_2 = "null";
              break L37;
            } else {
              stackIn_176_0 = (RuntimeException) ((Object) stackIn_175_0);
              stackIn_176_1 = (StringBuilder) ((Object) stackIn_175_1);
              stackIn_176_2 = "{...}";
              break L37;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_176_0), stackIn_176_2 + ',' + param1 + ')');
        }
    }

    private final void a(byte param0, kc param1) {
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        o[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        o var7 = null;
        int var8 = 0;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((this.field_db ^ -1) < -1) {
                this.field_db = this.field_db - 1;
                this.field_sb = this.b(this.field_db, this.field_o, -570490625, this.field_k);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (0 >= this.field_zb) {
                break L2;
              } else {
                this.field_zb = this.field_zb - 1;
                break L2;
              }
            }
            L3: {
              if (10 == this.field_zb) {
                lq.a(hp.field_i, -28);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if ((this.field_zb ^ -1) == -1) {
                if (this.field_L > 0) {
                  if ((qq.a(20, this.field_L) ^ -1) > -11) {
                    this.field_zb = qq.a(20, 20) + 10;
                    break L4;
                  } else {
                    this.field_zb = 10 + qq.a(20, this.field_L) - -(this.field_L >> 1910603105);
                    break L4;
                  }
                } else {
                  this.field_zb = -1;
                  break L4;
                }
              } else {
                break L4;
              }
            }
            var3_int = np.a(-5, 5, (byte) 75);
            var5 = 125 / ((-14 - param0) / 43);
            var4 = this.field_E;
            var6 = 0;
            L5: while (true) {
              if (var6 >= var4.length) {
                break L0;
              } else {
                var7 = var4[var6];
                var7.field_f = var7.field_f + var3_int;
                var7.field_d.a(param1, -30507);
                var7.a(2);
                var7.a(1300000.0 / this.field_kb, -87);
                var6++;
                continue L5;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_36_0 = (RuntimeException) (var3);

            stackIn_36_1 = new StringBuilder().append("pk.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L6;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L6;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ')');
        }
    }

    private final int a(kc param0, int param1, kc param2) {
        int var4_int = 0;
        int var6 = 0;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param1;
              if (600.0 >= this.field_kb) {
                var4_int = 0;
                break L1;
              } else {
                if (this.field_kb >= 1000.0) {
                  break L1;
                } else {
                  var4_int = (int)((double)var4_int * (400.0 - (1000.0 - this.field_kb)) / 400.0);
                  break L1;
                }
              }
            }
            if (param0 != param2) {
              L2: {
                var5 = (int)sb.a(param1 ^ 157, param0, param2);
                if (-1001 <= (var5 ^ -1)) {
                  if (var5 <= 10) {
                    break L2;
                  } else {
                    var4_int = var4_int * (-var5 - -10 + 990) / 990;
                    break L2;
                  }
                } else {
                  var4_int = 0;
                  break L2;
                }
              }
              stackIn_17_0 = var4_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_9_0 = var4_int;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("pk.EA(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L3;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L4;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_22_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_17_0;
        }
    }

    private final void a(int param0, kc param1, byte param2, int param3) {
        qf dupTemp$1 = null;
        RuntimeException runtimeException = null;
        qf var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if ((this.field_n.length ^ -1) < (this.field_w ^ -1)) {
              L1: {
                var5 = this.field_n[this.field_w];
                if (param2 == -74) {
                  break L1;
                } else {
                  this.field_W = false;
                  break L1;
                }
              }
              L2: {
                if (var5 != null) {
                  break L2;
                } else {
                  dupTemp$1 = new qf();
                  this.field_n[this.field_w] = dupTemp$1;
                  var5 = dupTemp$1;
                  break L2;
                }
              }
              var5.a(-32, param1, param3, param0);
              this.field_w = this.field_w + 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (runtimeException);

            stackIn_12_1 = new StringBuilder().append("pk.R(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void b(int param0) {
        int var2_int = 0;
        int var3 = 0;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_vb == null) {
                break L1;
              } else {
                if (this.field_ob) {
                  break L1;
                } else {
                  L2: {
                    if (param0 == 11154) {
                      break L2;
                    } else {
                      this.field_hb = 0.030616966813019907;
                      break L2;
                    }
                  }
                  var2_int = 0;
                  L3: while (true) {
                    if (16 <= var2_int) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L4: {
                        stackIn_18_0 = this.field_Z;

                        stackIn_18_1 = var2_int;

                        if (sd.field_d[this.field_h][var2_int]) {
                          stackIn_19_0 = (int[]) ((Object) stackIn_18_0);
                          stackIn_19_1 = stackIn_18_1;
                          stackIn_19_2 = 255;
                          break L4;
                        } else {


                          stackIn_19_0 = (int[]) ((Object) stackIn_18_0);
                          stackIn_19_1 = stackIn_18_1;
                          stackIn_19_2 = 0;
                          break L4;
                        }
                      }
                      stackIn_19_0[stackIn_19_1] = stackIn_19_2;
                      this.field_vb.a((byte) -120, this.field_Z[var2_int], var2_int);
                      var2_int++;
                      continue L3;
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
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2), "pk.IA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void b(md param0, int param1) {
        int stackIn_19_0 = 0;
        int stackIn_23_1 = 0;
        md stackIn_88_0 = null;
        Object stackIn_152_0 = null;
        md stackIn_152_1 = null;
        md stackIn_177_0 = null;
        md stackIn_177_1 = null;
        RuntimeException stackIn_182_0 = null;
        StringBuilder stackIn_182_1 = null;
        RuntimeException stackIn_183_0 = null;
        StringBuilder stackIn_183_1 = null;
        String stackIn_183_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        md[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        md var5 = null;
        int var6 = 0;
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_yb) {
                break L1;
              } else {
                L2: {
                  if (null != param0.field_n) {
                    if (param0.field_n.field_t > 2) {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      param0.field_n = null;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                var3_int = qq.a(20, this.field_A.length);
                if (null == this.field_A[var3_int]) {
                  break L1;
                } else {
                  L3: {
                    if (gh.field_j != param0.field_r) {
                      stackIn_19_0 = 0;
                      break L3;
                    } else {
                      stackIn_19_0 = 1;
                      break L3;
                    }
                  }
                  L4: {


                    if (this.field_A[var3_int].field_r != gh.field_j) {

                      stackIn_23_1 = 0;
                      break L4;
                    } else {

                      stackIn_23_1 = 1;
                      break L4;
                    }
                  }
                  if ((stackIn_19_0 ^ stackIn_23_1) != 0) {
                    param0.field_n = this.field_A[var3_int];
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            if (!this.field_Cb) {
              L5: {
                if (param1 <= -69) {
                  break L5;
                } else {
                  this.field_Eb = true;
                  break L5;
                }
              }
              L6: {
                L7: {
                  L8: {
                    L9: {
                      L10: {
                        if (ro.field_u == param0.field_r) {
                          if (param0.field_n == null) {
                            var3 = this.field_A;
                            var4 = 0;
                            L11: while (true) {
                              if ((var4 ^ -1) <= (var3.length ^ -1)) {
                                var3 = this.field_A;
                                var4 = 0;
                                L12: while (true) {
                                  L13: {
                                    if (var3.length <= var4) {
                                      param0.field_n = this.field_X;
                                      stackIn_88_0 = this.field_X;
                                      break L13;
                                    } else {
                                      var5 = var3[var4];
                                      stackIn_88_0 = (md) (var5);

                                      L14: {
                                        if (stackIn_88_0 == null) {
                                          break L14;
                                        } else {
                                          if (2 >= var5.field_t) {
                                            break L14;
                                          } else {
                                            if (this.field_X == var5) {
                                              break L14;
                                            } else {
                                              if (ro.field_u == var5.field_r) {
                                                break L14;
                                              } else {
                                                L15: {
                                                  if (param0.field_n == null) {
                                                    break L15;
                                                  } else {
                                                    param0.field_n.field_g = null;
                                                    break L15;
                                                  }
                                                }
                                                param0.field_n = var5;
                                                decompiledRegionSelector0 = 4;
                                                break L0;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var4++;
                                      continue L12;
                                    }
                                  }
                                  stackIn_88_0.field_g = param0;
                                  break L10;
                                }
                              } else {
                                var5 = var3[var4];
                                stackIn_152_0 = null;

                                stackIn_152_1 = (md) (var5);

                                L19: {
                                  if (stackIn_152_0 == stackIn_152_1) {
                                    break L19;
                                  } else {
                                    if (-3 <= (var5.field_t ^ -1)) {
                                      break L19;
                                    } else {
                                      if (this.field_X == var5) {
                                        break L19;
                                      } else {
                                        if (var5.field_r == ro.field_u) {
                                          break L19;
                                        } else {
                                          if (var5.field_r == gh.field_j) {
                                            break L19;
                                          } else {
                                            L20: {
                                              if (param0.field_n == null) {
                                                break L20;
                                              } else {
                                                param0.field_n.field_g = null;
                                                break L20;
                                              }
                                            }
                                            param0.field_n = var5;
                                            decompiledRegionSelector0 = 3;
                                            break L0;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                var4++;
                                continue L11;
                              }
                            }
                          } else {
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        } else {
                          break L10;
                        }
                      }
                      if (gh.field_j != param0.field_r) {
                        if (param0 != this.field_X.field_g) {
                          if (this.field_X.field_g == null) {
                            L21: {
                              if (param0.field_n != null) {
                                param0.field_n.field_g = null;
                                break L21;
                              } else {
                                break L21;
                              }
                            }
                            this.field_X.field_g = param0;
                            param0.field_n = this.field_X;
                            decompiledRegionSelector0 = 8;
                            break L0;
                          } else {
                            L22: {
                              if (param0.field_n == this.field_X) {
                                break L22;
                              } else {
                                if (null != param0.field_n) {
                                  decompiledRegionSelector0 = 9;
                                  break L0;
                                } else {
                                  break L22;
                                }
                              }
                            }
                            var3 = this.field_A;
                            var4 = 0;
                            L23: while (true) {
                              if (var3.length <= var4) {
                                break L8;
                              } else {
                                var5 = var3[var4];
                                stackIn_177_0 = this.field_X;

                                stackIn_177_1 = (md) (var5);

                                L24: {
                                  if (stackIn_177_0 == stackIn_177_1) {
                                    break L24;
                                  } else {
                                    stackIn_152_0 = null;
                                    stackIn_152_1 = (md) (var5);
                                    if (stackIn_152_0 == stackIn_152_1) {
                                      break L24;
                                    } else {
                                      if (2 < var5.field_t) {
                                        if (var5.field_r != gh.field_j) {
                                          break L24;
                                        } else {
                                          if (var5.field_n == param0) {
                                            break L24;
                                          } else {
                                            if (var5.field_g != null) {
                                              break L24;
                                            } else {
                                              break L9;
                                            }
                                          }
                                        }
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                }
                                var4++;
                                continue L23;
                              }
                            }
                          }
                        } else {
                          decompiledRegionSelector0 = 7;
                          break L0;
                        }
                      } else {
                        if (null == param0.field_n) {
                          var3 = this.field_A;
                          var4 = 0;
                          L25: while (true) {
                            if ((var4 ^ -1) <= (var3.length ^ -1)) {
                              break L6;
                            } else {
                              L26: {
                                var5 = var3[var4];
                                if (var5 == null) {
                                  break L26;
                                } else {
                                  if ((var5.field_t ^ -1) >= -3) {
                                    break L26;
                                  } else {
                                    if (gh.field_j != var5.field_r) {
                                      if (param0 == var5.field_n) {
                                        break L26;
                                      } else {
                                        if (var5.field_g == null) {
                                          L27: {
                                            if (param0.field_n != null) {
                                              param0.field_n.field_g = null;
                                              break L27;
                                            } else {
                                              break L27;
                                            }
                                          }
                                          param0.field_n = var5;
                                          var5.field_g = param0;
                                          decompiledRegionSelector0 = 6;
                                          break L0;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    } else {
                                      break L26;
                                    }
                                  }
                                }
                              }
                              var4++;
                              continue L25;
                            }
                          }
                        } else {
                          decompiledRegionSelector0 = 5;
                          break L0;
                        }
                      }
                    }
                    L28: {
                      if (param0.field_n == null) {
                        break L28;
                      } else {
                        param0.field_n.field_g = null;
                        break L28;
                      }
                    }
                    var5.field_g = param0;
                    param0.field_n = var5;
                    decompiledRegionSelector0 = 10;
                    break L0;
                  }
                  stackIn_177_0 = (md) (param0);
                  stackIn_177_1 = this.field_X;
                  break L7;
                }
                stackIn_177_0.field_n = stackIn_177_1;
                break L6;
              }
              decompiledRegionSelector0 = 11;
              break L0;
            } else {
              param0.field_n = this.field_X;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L29: {
            var3_ref = decompiledCaughtException;
            stackIn_182_0 = (RuntimeException) (var3_ref);

            stackIn_182_1 = new StringBuilder().append("pk.O(");

            if (param0 == null) {
              stackIn_183_0 = (RuntimeException) ((Object) stackIn_182_0);
              stackIn_183_1 = (StringBuilder) ((Object) stackIn_182_1);
              stackIn_183_2 = "null";
              break L29;
            } else {
              stackIn_183_0 = (RuntimeException) ((Object) stackIn_182_0);
              stackIn_183_1 = (StringBuilder) ((Object) stackIn_182_1);
              stackIn_183_2 = "{...}";
              break L29;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_183_0), stackIn_183_2 + ',' + param1 + ')');
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
                      if (decompiledRegionSelector0 == 7) {
                        return;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
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
            }
          }
        }
    }

    private final void a(byte param0, int param1) {
        int discarded$0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_db = 255;
              this.field_o = this.field_sb;
              var3_int = qq.a(param0 + -8, 220);
              var4 = qq.a(20, 200);
              var4 = 152;
              var5 = qq.a(param0 ^ 8, 128);
              if (param0 == 28) {
                break L1;
              } else {
                this.a(true, (md) null);
                break L1;
              }
            }
            L2: {
              L3: {
                var5 = 127;
                var3_int = 192;
                this.field_k = var3_int << -2024393992 | this.b(var4, 0, param0 ^ -570490653, this.b(var5, 255, param0 ^ -570490653, 16777215));
                if (-191 <= (var3_int ^ -1)) {
                  break L3;
                } else {
                  if (-151 <= (var4 ^ -1)) {
                    break L3;
                  } else {
                    this.field_L = qq.a(param0 ^ 8, 255) + 100;
                    if (this.field_zb == -1) {
                      this.field_zb = this.field_L;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              this.field_L = -1;
              break L2;
            }
            var6 = new int[]{1, 3, 4, 6, 8, 20};
            param1 = param1 << 1;
            var7 = 2;
            L4: while (true) {
              if (-1 <= (param1 ^ -1)) {
                break L0;
              } else {
                var8 = 0;
                L5: while (true) {
                  L6: {
                    L7: {
                      if (var6.length <= var8) {
                        break L7;
                      } else {
                        stackIn_28_0 = param1 >> 98046753;

                        stackIn_28_1 = var6[var8];

                        if (stackIn_28_0 < stackIn_28_1) {
                          break L7;
                        } else {
                          var8++;
                          continue L5;
                        }
                      }
                    }
                    stackIn_28_0 = 0;
                    stackIn_28_1 = var8;
                    break L6;
                  }
                  L8: {
                    if (stackIn_28_0 >= stackIn_28_1) {
                      break L8;
                    } else {
                      var8--;
                      break L8;
                    }
                  }
                  L9: {
                    param1 = param1 - var6[var8];
                    discarded$0 = this.a((byte) -120, this.b((byte) 108, var8), 1, var7);
                    if (var7 <= 0) {
                      break L9;
                    } else {
                      var7--;
                      break L9;
                    }
                  }
                  continue L4;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3), "pk.S(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, boolean param1) {
        md var3 = null;
        int var4 = 0;
        int var5 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            this.field_ob = false;
            lm.a(40, tg.field_a[1], true, (byte) -58);
            this.field_vb = wt.field_e.field_s;
            this.field_h = 0;
            this.b(11154);
            this.a(true);
            this.field_Cb = param1;
            to.field_r = null;
            this.field_c = 0;
            wd.field_t.c(268435455);
            if (param0 > 59) {
              L1: {
                bo.field_h = 0;
                gh.field_j.field_i = ub.field_h.field_i;
                this.field_J = 0;
                this.field_f = 0;
                this.field_G = 200;
                ei.field_a = 0;
                this.field_nb = 0;
                this.field_x = 0;
                this.field_p = 0;
                this.field_V = 1;
                this.field_Eb = false;
                this.field_tb = 1;
                gh.field_j.field_g = ub.field_h.field_g;
                or.field_a = 0;
                se.field_b = 0;
                this.field_H = 0;
                this.field_v = 0;
                ct.field_x = 0;
                gh.field_j.field_e = ub.field_h.field_e;
                this.field_N = 0;
                gh.field_j.field_d = ub.field_h.field_d;
                r.field_n = 0;
                this.field_d = 0;
                this.field_P = 1;
                gh.field_j.field_f = ub.field_h.field_f;
                var3 = this.field_X;
                this.field_X = new md(new kc(), gh.field_j);
                this.field_X.field_h = po.a(this.a(this.field_X.field_d, 200, this.field_X.field_d), 0, this.field_X.field_r.a((byte) -88));
                this.field_A = new md[16];
                this.field_S = new eu[1000];
                this.field_w = 0;
                this.field_ab = 0;
                this.field_i = new wm[16];
                this.field_Bb = 0;
                this.field_n = new qf[1000];
                this.field_m = true;
                if (null == var3) {
                  break L1;
                } else {
                  this.field_X.field_e = var3.field_e;
                  break L1;
                }
              }
              this.field_A[0] = this.field_X;
              var4 = 0;
              L2: while (true) {
                if ((var4 ^ -1) <= (this.field_r.length ^ -1)) {
                  L3: {
                    this.field_xb = 0;
                    this.field_jb = 120;
                    this.field_Ab = 0;
                    this.field_ub = 80;
                    this.field_s = 0;
                    this.field_pb = 0;
                    tt.field_a = false;
                    this.field_F = 3;
                    if (this.field_Cb) {
                      this.a((byte) 28, 1);
                      break L3;
                    } else {
                      this.f(-20416);
                      break L3;
                    }
                  }
                  this.field_yb = false;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  this.field_r[var4] = -1;
                  var4++;
                  continue L2;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3_ref), "pk.F(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(kc param0, byte param1) {
        Object stackIn_10_0 = null;
        md stackIn_10_1 = null;
        Object stackIn_25_0 = null;
        md stackIn_25_1 = null;
        Object stackIn_55_0 = null;
        md stackIn_55_1 = null;
        Object stackIn_78_0 = null;
        Object stackIn_80_0 = null;
        Object stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        Object stackIn_95_0 = null;
        md stackIn_95_1 = null;
        Object stackIn_131_0 = null;
        md stackIn_131_1 = null;
        RuntimeException stackIn_169_0 = null;
        StringBuilder stackIn_169_1 = null;
        RuntimeException stackIn_171_0 = null;
        StringBuilder stackIn_171_1 = null;
        RuntimeException stackIn_172_0 = null;
        StringBuilder stackIn_172_1 = null;
        String stackIn_172_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        eu var4 = null;
        int var5 = 0;
        md[] var6_ref_md__ = null;
        int var6 = 0;
        int var7 = 0;
        md var8 = null;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = AceOfSkies.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == -93) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var3_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3_int >= this.field_ab) {
                            statePc = 173;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4 = this.field_S[var3_int];
                        if (null == var4) {
                            statePc = 14;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_10_0 = null;
                        stackIn_10_1 = var4.field_i;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 == stackIn_10_1) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!uh.a(98, var4.field_i.field_d, 600.0, var4.field_d)) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        this.d(73, var3_int);
                        var3_int--;
                        statePc = 166;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var4.field_d.a(param0, -30507);
                        var4.a(param1 + 95);
                        var5 = 0;
                        if (null == var4.field_i) {
                            statePc = 128;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (ro.field_u == var4.field_i.field_r) {
                            statePc = 92;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var4.field_i.field_r == gh.field_j) {
                            statePc = 52;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var6_ref_md__ = this.field_A;
                        var7 = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var6_ref_md__.length <= var7) {
                            statePc = 51;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var8 = var6_ref_md__[var7];
                        stackIn_10_0 = null;
                        stackIn_25_0 = stackIn_10_0;
                        stackIn_10_1 = (md) (var8);
                        stackIn_25_1 = stackIn_10_1;
                        if (false) {
                            statePc = 10;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (stackIn_25_0 == stackIn_25_1) {
                            statePc = 48;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (-1 <= (var8.field_k ^ -1)) {
                            statePc = 48;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var8.field_r == gh.field_j) {
                            statePc = 35;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (this.field_X != var8) {
                            statePc = 41;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (-1 > (this.field_jb ^ -1)) {
                            statePc = 48;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (uh.a(param1 + 217, var8.field_d, (double)(2 * var8.field_r.field_a), var4.field_d)) {
                            statePc = 47;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var8.field_q = 256;
                        var8.field_k = var8.field_k - 1;
                        var5 = 1;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var7++;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var6_ref_md__ = this.field_A;
                        var7 = 0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var7 >= var6_ref_md__.length) {
                            statePc = 91;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var8 = var6_ref_md__[var7];
                        stackIn_10_0 = null;
                        stackIn_55_0 = stackIn_10_0;
                        stackIn_10_1 = (md) (var8);
                        stackIn_55_1 = stackIn_10_1;
                        if (false) {
                            statePc = 10;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (stackIn_55_0 == stackIn_55_1) {
                            statePc = 88;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var8.field_k > 0) {
                            statePc = 62;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var8.field_r == gh.field_j) {
                            statePc = 88;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (uh.a(param1 + 185, var8.field_d, (double)(var8.field_r.field_a * 2), var4.field_d)) {
                            statePc = 71;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (var4.field_i == this.field_X) {
                            statePc = 76;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        this.field_pb = this.field_pb + 1;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var8.field_k = var8.field_k - 1;
                        var5 = 1;
                        var8.field_q = 256;
                        stackIn_80_0 = this;
                        stackIn_78_0 = stackIn_80_0;
                        if (this.field_X == var4.field_i) {
                            statePc = 80;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        stackIn_81_0 = this;
                        stackIn_81_1 = 25;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        stackIn_81_0 = this;
                        stackIn_81_1 = 50;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        this.e(stackIn_81_1 * this.field_V, -54);
                        if (-1 != (var8.field_k ^ -1)) {
                            statePc = 91;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (0 > (var8.field_v ^ -1)) {
                            statePc = 87;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        this.a(var8.field_d, param1 + 32690, var8.field_v);
                        var8.field_v = -1;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var7++;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        var6_ref_md__ = this.field_A;
                        var7 = 0;
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (var6_ref_md__.length <= var7) {
                            statePc = 127;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var8 = var6_ref_md__[var7];
                        stackIn_10_0 = null;
                        stackIn_95_0 = stackIn_10_0;
                        stackIn_10_1 = (md) (var8);
                        stackIn_95_1 = stackIn_10_1;
                        if (false) {
                            statePc = 10;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (stackIn_95_0 == stackIn_95_1) {
                            statePc = 124;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (0 >= var8.field_k) {
                            statePc = 124;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (ro.field_u != var8.field_r) {
                            statePc = 105;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (this.field_X != var8) {
                            statePc = 114;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if (-1 <= (this.field_jb ^ -1)) {
                            statePc = 114;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (!uh.a(param1 + 199, var8.field_d, (double)(2 * var8.field_r.field_a), var4.field_d)) {
                            statePc = 124;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        var8.field_k = var8.field_k - 1;
                        var5 = 1;
                        var8.field_q = 256;
                        if ((var8.field_k ^ -1) != -1) {
                            statePc = 127;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        if ((var8.field_v ^ -1) >= 0) {
                            statePc = 127;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        this.a(var8.field_d, 32597, var8.field_v);
                        var8.field_v = -1;
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        var7++;
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        var6_ref_md__ = this.field_A;
                        var7 = 0;
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        if ((var7 ^ -1) <= (var6_ref_md__.length ^ -1)) {
                            statePc = 160;
                        } else {
                            statePc = 130;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        var8 = var6_ref_md__[var7];
                        stackIn_10_0 = null;
                        stackIn_131_0 = stackIn_10_0;
                        stackIn_10_1 = (md) (var8);
                        stackIn_131_1 = stackIn_10_1;
                        if (false) {
                            statePc = 10;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        if (stackIn_131_0 == stackIn_131_1) {
                            statePc = 157;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        if (0 < var8.field_k) {
                            statePc = 138;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        if (gh.field_j == var8.field_r) {
                            statePc = 157;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        if (this.field_X != var8) {
                            statePc = 150;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        if (0 >= this.field_jb) {
                            statePc = 150;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        if (uh.a(122, var8.field_d, (double)(var8.field_r.field_a * 2), var4.field_d)) {
                            statePc = 156;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        var8.field_k = var8.field_k - 1;
                        var8.field_q = 256;
                        var5 = 1;
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        var7++;
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        if (var5 != 0) {
                            statePc = 163;
                        } else {
                            statePc = 161;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        statePc = 166;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        var4.a(2);
                        this.a(80, var4.field_d, (byte) -74, -20);
                        var6 = this.a(this.field_X.field_d, param1 + 293, var4.field_d);
                        if ((var6 ^ -1) <= -2) {
                            statePc = 165;
                        } else {
                            statePc = 164;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 164: {
                    return;
                }
                case 165: {
                    try {
                        bo.a(lp.field_g, var6, 23187);
                        this.d(42, var3_int);
                        var3_int--;
                        statePc = 166;
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        var3_int++;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 168: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_171_0 = (RuntimeException) (var3);
                    stackIn_169_0 = stackIn_171_0;
                    stackIn_171_1 = new StringBuilder().append("pk.C(");
                    stackIn_169_1 = stackIn_171_1;
                    if (param0 == null) {
                        statePc = 171;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    stackIn_172_0 = (RuntimeException) ((Object) stackIn_169_0);
                    stackIn_172_1 = (StringBuilder) ((Object) stackIn_169_1);
                    stackIn_172_2 = "{...}";
                    statePc = 172;
                    continue stateLoop;
                }
                case 171: {
                    stackIn_172_0 = (RuntimeException) ((Object) stackIn_171_0);
                    stackIn_172_1 = (StringBuilder) ((Object) stackIn_171_1);
                    stackIn_172_2 = "null";
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    throw pn.a((Throwable) ((Object) stackIn_172_0), stackIn_172_2 + ',' + param1 + ')');
                }
                case 173: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void f(int param0, int param1) {
        RuntimeException runtimeException = null;
        vc var3 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_l = this.field_l - 1;
            if ((param0 ^ -1) == (this.field_l ^ -1)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3 = this.field_z[param0];
                this.field_z[param0] = this.field_z[this.field_l];
                if (param1 == 10355) {
                  break L1;
                } else {
                  this.field_Eb = false;
                  break L1;
                }
              }
              this.field_z[this.field_l] = var3;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "pk.M(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0, md param1) {
        eu dupTemp$0 = null;
        eu dupTemp$1 = null;
        eu dupTemp$2 = null;
        eu stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        eu stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        eu stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        eu stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        int stackIn_40_3 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        eu var4 = null;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        var9 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = param1.field_r.field_b;
              if (1 == param1.field_m) {
                var3_int = 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if ((param1.field_m ^ -1) != -3) {
                break L2;
              } else {
                var3_int = 2;
                break L2;
              }
            }
            if (this.field_ab < -var3_int + this.field_S.length) {
              L3: {
                var4 = this.field_S[this.field_ab];
                var5 = param1.field_r.field_c;
                var6 = (double)np.a(-var5, var5, (byte) 83) / 300.0;
                if ((var3_int ^ -1) == -2) {
                  break L3;
                } else {
                  L4: {
                    if (var4 == null) {
                      dupTemp$0 = new eu();
                      this.field_S[this.field_ab] = dupTemp$0;
                      var4 = dupTemp$0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var4.a(0, 0, var6, param1);
                  this.field_ab = this.field_ab + 1;
                  if (param1 == this.field_X) {
                    this.field_Ab = this.field_Ab + 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                if (param0 >= 9) {
                  break L5;
                } else {
                  this.field_rb = true;
                  break L5;
                }
              }
              L6: {
                if (0 >= var3_int) {
                  break L6;
                } else {
                  L7: {
                    var6 = (double)np.a(-var5, var5, (byte) 83) / 100.0;
                    var4 = this.field_S[this.field_ab];
                    if (var4 == null) {
                      dupTemp$1 = new eu();
                      this.field_S[this.field_ab] = dupTemp$1;
                      var4 = dupTemp$1;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    stackIn_31_0 = (eu) (var4);

                    stackIn_31_1 = param1.field_r.field_a;

                    stackIn_31_2 = 0;

                    if (2 != var3_int) {
                      stackIn_32_0 = (eu) ((Object) stackIn_31_0);
                      stackIn_32_1 = stackIn_31_1;
                      stackIn_32_2 = stackIn_31_2;
                      stackIn_32_3 = 0;
                      break L8;
                    } else {
                      stackIn_32_0 = (eu) ((Object) stackIn_31_0);
                      stackIn_32_1 = stackIn_31_1;
                      stackIn_32_2 = stackIn_31_2;
                      stackIn_32_3 = 10;
                      break L8;
                    }
                  }
                  L9: {
                    ((eu) (Object) stackIn_32_0).a(stackIn_32_1, stackIn_32_2, (double)stackIn_32_3 + var6, param1);
                    this.field_ab = this.field_ab + 1;
                    var4 = this.field_S[this.field_ab];
                    var6 = (double)np.a(-var5, var5, (byte) -67) / 100.0;
                    if (var4 == null) {
                      dupTemp$2 = new eu();
                      this.field_S[this.field_ab] = dupTemp$2;
                      var4 = dupTemp$2;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    stackIn_39_0 = (eu) (var4);

                    stackIn_39_1 = -param1.field_r.field_a;

                    stackIn_39_2 = 0;

                    if (-3 == (var3_int ^ -1)) {
                      stackIn_40_0 = (eu) ((Object) stackIn_39_0);
                      stackIn_40_1 = stackIn_39_1;
                      stackIn_40_2 = stackIn_39_2;
                      stackIn_40_3 = -10;
                      break L10;
                    } else {
                      stackIn_40_0 = (eu) ((Object) stackIn_39_0);
                      stackIn_40_1 = stackIn_39_1;
                      stackIn_40_2 = stackIn_39_2;
                      stackIn_40_3 = 0;
                      break L10;
                    }
                  }
                  L11: {
                    ((eu) (Object) stackIn_40_0).a(stackIn_40_1, stackIn_40_2, (double)stackIn_40_3 + var6, param1);
                    if (param1 != this.field_X) {
                      break L11;
                    } else {
                      this.field_Ab = this.field_Ab + 2;
                      break L11;
                    }
                  }
                  this.field_ab = this.field_ab + 1;
                  break L6;
                }
              }
              var8 = this.a(this.field_X.field_d, 200, param1.field_d);
              if (-2 >= (var8 ^ -1)) {
                L12: {
                  if (ro.field_u == param1.field_r) {
                    bo.a(fd.field_b[4], var8, 23187);
                    break L12;
                  } else {
                    if (-4 != (param1.field_m ^ -1)) {
                      if ((var3_int ^ -1) != -3) {
                        if (1 == var3_int) {
                          bo.a(fd.field_b[1], var8, 23187);
                          break L12;
                        } else {
                          bo.a(fd.field_b[0], var8, 23187);
                          break L12;
                        }
                      } else {
                        bo.a(fd.field_b[2], var8, 23187);
                        break L12;
                      }
                    } else {
                      bo.a(fd.field_b[3], var8, 23187);
                      break L12;
                    }
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
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
          L13: {
            var3 = decompiledCaughtException;
            stackIn_74_0 = (RuntimeException) (var3);

            stackIn_74_1 = new StringBuilder().append("pk.T(").append(param0).append(',');

            if (param1 == null) {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L13;
            } else {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L13;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_75_0), stackIn_75_2 + ')');
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

    private final void a(md param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = (int)(param0.field_d.field_a / 3.0);
              var4 = (int)(param0.field_d.field_b / 3.0);
              var5 = (int)(this.field_t - (double)(1720 * this.field_fb));
              var6 = (int)(this.field_Y - (double)(1280 * this.field_O));
              this.a(-var6 + var4, param1 + -22703, -var5 + var3_int, param0.field_r.field_a << -158082206);
              if (param1 == 8073) {
                break L1;
              } else {
                this.a((ha) null, -110);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("pk.J(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, boolean param7, int param8) {
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        ha var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        var18 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var10_int = (int)(Math.cos(3.141592653589793 * (double)param4 / 20.0) * 10.0);
              var11 = (int)(100.0 * Math.sin(3.141592653589793 * (double)param4 / 20.0));
              var12 = field_wb.a((byte) 95);
              var13 = param7 ? 1 : 0;
              var14 = param7 ? 1 : 0;
              if (param8 == 10) {
                break L1;
              } else {
                this.f(94);
                break L1;
              }
            }
            L2: {
              if (param7) {
                stackIn_8_0 = 0;
                break L2;
              } else {
                stackIn_8_0 = 1;
                break L2;
              }
            }
            var15 = stackIn_8_0;
            L3: while (true) {
              L4: {
                var16 = param0 % 10;
                var17 = param5 % 10;
                if (!param3) {
                  break L4;
                } else {
                  if (var15 == 0) {
                    L5: {
                      if (0 != param5) {
                        if (!param7) {
                          break L5;
                        } else {
                          var17 += 22;
                          break L5;
                        }
                      } else {
                        L6: {
                          var17 = 10;
                          if (var14 != 0) {
                            var17 += 22;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var14 = 0;
                        break L5;
                      }
                    }
                    if (0 != param0) {
                      if (param7) {
                        var16 += 22;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      L7: {
                        var16 = 10;
                        if (var13 == 0) {
                          break L7;
                        } else {
                          var16 += 22;
                          break L7;
                        }
                      }
                      var13 = 0;
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
              }
              L8: {
                var15 = 0;
                in.field_c[var17].a(param6, param2);
                in.field_c[var16 + 11].a(param6, 10 + param2);
                if ((var17 ^ -1) != (var16 ^ -1)) {
                  if ((var10_int ^ -1) > -1) {
                    in.field_c[var16].b(param6, var10_int + 10 + param2, 16, -var10_int);
                    var12.d(-var10_int, 16, param2 + 10 + var10_int, -5782, (var11 | -739482368) << -1113857000, param6);
                    break L8;
                  } else {
                    in.field_c[11 + var17].b(param6, 10 + param2, 16, var10_int);
                    var12.d(var10_int, 16, param2 - -10, -5782, var11 << 1568982168 | 16777215, param6);
                    break L8;
                  }
                } else {
                  break L8;
                }
              }
              param0 = param0 / 10;
              param5 = param5 / 10;
              param1--;
              param6 -= 17;
              if (param1 > 0) {
                continue L3;
              } else {
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var10), "pk.HB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    private final void c(int param0, int param1) {
        qf var3 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            this.field_w = this.field_w - 1;
            if (param0 == this.field_w) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == -690800984) {
                  break L1;
                } else {
                  this.field_ub = -99;
                  break L1;
                }
              }
              var3 = this.field_n[param0];
              this.field_n[param0] = this.field_n[this.field_w];
              this.field_n[this.field_w] = var3;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3_ref), "pk.JA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void d(byte param0, int param1) {
        RuntimeException runtimeException = null;
        ok var3 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_K = this.field_K - 1;
            if (param1 == this.field_K) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3 = this.field_C[param1];
                this.field_C[param1] = this.field_C[this.field_K];
                this.field_C[this.field_K] = var3;
                if (param0 == -94) {
                  break L1;
                } else {
                  this.b((byte) -55);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "pk.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void g(int param0) {
        ga stackIn_12_0 = null;
        ga stackIn_12_1 = null;
        ga stackIn_13_0 = null;
        ga stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        int stackIn_15_3;
        int stackIn_16_3 = 0;
        int stackIn_16_4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (to.field_r != null) {
                break L1;
              } else {
                if ((this.field_q ^ -1) >= -1) {
                  break L1;
                } else {
                  if (tt.field_a) {
                    break L1;
                  } else {
                    L2: {
                      stackIn_12_0 = null;

                      stackIn_12_1 = null;

                      if (this.field_Cb) {
                        stackIn_13_0 = null;
                        stackIn_13_1 = null;
                        stackIn_13_2 = 1;
                        break L2;
                      } else {


                        stackIn_13_0 = null;
                        stackIn_13_1 = null;
                        stackIn_13_2 = 0;
                        break L2;
                      }
                    }
                    L3: {






                      stackIn_15_3 = 65535;

                      if (!this.field_Cb) {
                        stackIn_13_0 = null;
                        stackIn_13_1 = null;

                        stackIn_16_3 = stackIn_15_3;
                        stackIn_16_4 = 0;
                        break L3;
                      } else {
                        stackIn_13_0 = null;
                        stackIn_13_1 = null;

                        stackIn_16_3 = stackIn_15_3;
                        stackIn_16_4 = 1;
                        break L3;
                      }
                    }
                    to.field_r = new ga(stackIn_13_2, stackIn_16_3 ^ stackIn_16_4, ct.field_x, bo.field_h, se.field_b, ei.field_a, new int[]{100 * this.field_q + this.field_b});
                    if (!cn.b(true)) {
                      ak.a(to.field_r, true, 3);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            L4: {
              if (param0 == -8) {
                break L4;
              } else {
                this.field_Z = (int[]) null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2), "pk.GA(" + param0 + ')');
        }
    }

    private final void a(byte param0) {
        int discarded$0 = 0;
        int discarded$1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        md[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        md var4 = null;
        int var5 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              se.field_b = se.field_b + 8;
              ei.field_a = ei.field_a - 3;
              bo.field_h = bo.field_h - 5;
              ct.field_x = ct.field_x + 10;
              if (this.field_yb) {
                break L1;
              } else {
                L2: {
                  if (!this.field_Cb) {
                    if ((bk.field_f ^ -1) > -17) {
                      break L2;
                    } else {
                      if (22 >= bk.field_f) {
                        this.a(1, bk.field_f + -16);
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if ((bk.field_f ^ -1) != -14) {
                    break L3;
                  } else {
                    if (!this.field_g) {
                      this.field_g = true;
                      eu.a((byte) 111, 1, false);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!this.field_j) {
                  break L1;
                } else {
                  if (!lp.field_a[81]) {
                    break L1;
                  } else {
                    L4: {
                      if (bk.field_f != 5) {
                        break L4;
                      } else {
                        tt.field_a = true;
                        this.field_W = false;
                        break L4;
                      }
                    }
                    L5: {
                      if (-8 != (bk.field_f ^ -1)) {
                        break L5;
                      } else {
                        L6: {
                          this.field_W = true;
                          if (this.field_h < -1 + sd.field_d.length) {
                            this.field_h = this.field_h + 1;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        tt.field_a = true;
                        break L5;
                      }
                    }
                    L7: {
                      if (bk.field_f != 6) {
                        break L7;
                      } else {
                        L8: {
                          this.field_W = true;
                          if (this.field_h <= 0) {
                            break L8;
                          } else {
                            this.field_h = this.field_h - 1;
                            break L8;
                          }
                        }
                        tt.field_a = true;
                        break L7;
                      }
                    }
                    L9: {
                      if (-2 != (bk.field_f ^ -1)) {
                        break L9;
                      } else {
                        this.field_gb = 1;
                        tt.field_a = true;
                        this.field_X.field_x = 100;
                        this.field_X.field_m = 1;
                        break L9;
                      }
                    }
                    L10: {
                      if ((bk.field_f ^ -1) == -3) {
                        tt.field_a = true;
                        this.field_gb = 2;
                        this.field_X.field_m = 2;
                        this.field_X.field_x = 100;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if ((bk.field_f ^ -1) == -4) {
                        tt.field_a = true;
                        this.field_X.field_x = 100;
                        this.field_gb = 3;
                        this.field_X.field_m = 3;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (8 == bk.field_f) {
                        this.field_F = this.field_F + 1;
                        tt.field_a = true;
                        this.field_X.field_k = 0;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      if (bk.field_f != 4) {
                        break L13;
                      } else {
                        this.field_X.field_x = 100;
                        this.field_gb = 4;
                        tt.field_a = true;
                        this.field_X.field_m = 4;
                        break L13;
                      }
                    }
                    L14: {
                      if (70 != bk.field_f) {
                        break L14;
                      } else {
                        this.field_p = 400;
                        tt.field_a = true;
                        wd.field_t.c(268435455);
                        var2_int = -1;
                        L15: while (true) {
                          if ((var2_int ^ -1) <= -9) {
                            break L14;
                          } else {
                            nk.field_g.a(95, new iq(var2_int));
                            var2_int++;
                            continue L15;
                          }
                        }
                      }
                    }
                    L16: {
                      if (bk.field_f == 38) {
                        tt.field_a = true;
                        discarded$0 = this.a((byte) 108, ro.field_u, 1, 0);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    L17: {
                      if ((bk.field_f ^ -1) == -52) {
                        tt.field_a = true;
                        or.field_a = or.field_a + 13;
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    L18: {
                      if (-66 != (bk.field_f ^ -1)) {
                        break L18;
                      } else {
                        tt.field_a = true;
                        this.field_V = this.field_V + 1;
                        break L18;
                      }
                    }
                    L19: {
                      if ((bk.field_f ^ -1) == -50) {
                        tt.field_a = true;
                        discarded$1 = this.a((byte) -123, ju.field_k, 1, 0);
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    L20: {
                      if ((bk.field_f ^ -1) != -42) {
                        break L20;
                      } else {
                        tt.field_a = true;
                        this.a(new kc(100.0, 100.0), 32597, 2);
                        break L20;
                      }
                    }
                    L21: {
                      if ((bk.field_f ^ -1) == -34) {
                        tt.field_a = true;
                        var2 = this.field_A;
                        var3 = 0;
                        L22: while (true) {
                          if (var3 >= var2.length) {
                            break L21;
                          } else {
                            L23: {
                              var4 = var2[var3];
                              if (var4 != null) {
                                if (var4.field_r == gh.field_j) {
                                  break L23;
                                } else {
                                  var4.field_k = 0;
                                  break L23;
                                }
                              } else {
                                break L23;
                              }
                            }
                            var3++;
                            continue L22;
                          }
                        }
                      } else {
                        break L21;
                      }
                    }
                    L24: {
                      if (56 == bk.field_f) {
                        if ((this.field_db ^ -1) >= -2) {
                          break L24;
                        } else {
                          this.field_db = 1;
                          break L24;
                        }
                      } else {
                        break L24;
                      }
                    }
                    L25: {
                      if (bk.field_f == 52) {
                        this.field_Eb = this.field_Eb ^ true;
                        tt.field_a = true;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    L26: {
                      if (bk.field_f != 50) {
                        break L26;
                      } else {
                        mj.field_b = mj.field_b ^ true;
                        break L26;
                      }
                    }
                    if ((bk.field_f ^ -1) == -66) {
                      this.a(0, -14630, 0, 64);
                      tt.field_a = true;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            L27: {
              if (param0 >= 31) {
                break L27;
              } else {
                this.field_eb = -94;
                break L27;
              }
            }
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2_ref), "pk.NA(" + param0 + ')');
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

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        ok var8 = null;
        ok dupTemp$0 = null;
        if ((this.field_C.length ^ -1) >= (this.field_K ^ -1)) {
            return;
        }
        try {
            int var9 = 23 % ((24 - param6) / 62);
            var8 = this.field_C[this.field_K];
            if (null == var8) {
                dupTemp$0 = new ok();
                this.field_C[this.field_K] = dupTemp$0;
                var8 = dupTemp$0;
            }
            var8.a(param3, param1, param5, param2, param4, param0, -1588713311);
            this.field_K = this.field_K + 1;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "pk.AA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void i(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 == 32458) {
                break L1;
              } else {
                field_e = (hc) null;
                break L1;
              }
            }
            field_wb = null;
            field_e = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "pk.BA(" + param0 + ')');
        }
    }

    private final void a(kc param0, int param1, int param2, int param3, int param4) {
        qf dupTemp$1 = null;
        RuntimeException runtimeException = null;
        qf var6 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 == 0) {
              if ((this.field_n.length ^ -1) >= (this.field_w ^ -1)) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var6 = this.field_n[this.field_w];
                  if (var6 != null) {
                    break L1;
                  } else {
                    dupTemp$1 = new qf();
                    this.field_n[this.field_w] = dupTemp$1;
                    var6 = dupTemp$1;
                    break L1;
                  }
                }
                var6.a(param2, 122, param1, param4, param0);
                this.field_w = this.field_w + 1;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (runtimeException);

            stackIn_12_1 = new StringBuilder().append("pk.DB(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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

    private final void a(kc param0, boolean param1) {
        int incrementValue$0 = 0;
        boolean discarded$1 = false;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        wm var4 = null;
        int var5 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                this.field_Y = -0.6422101977961518;
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              if (var3_int >= this.field_Bb) {
                break L0;
              } else {
                L3: {
                  var4 = this.field_i[var3_int];
                  var4.field_d.a(param0, -30507);
                  var4.field_g = var4.field_g - 1;
                  if ((var4.field_g ^ -1) < -1) {
                    if (!uh.a(99, var4.field_d, (double)(this.field_X.field_r.field_a + 16), this.field_X.field_d)) {
                      break L3;
                    } else {
                      if (var4.field_k < 4) {
                        this.field_gb = var4.field_k - -1;
                        this.field_X.field_x = 100;
                        this.field_X.field_m = 1 + var4.field_k;
                        bm.a((byte) -70, uh.field_g[1]);
                        this.a(50, (byte) -127, -16711681, ke.field_c[var4.field_k]);
                        incrementValue$0 = var3_int;
                        var3_int--;
                        this.a(false, incrementValue$0);
                        break L3;
                      } else {
                        discarded$1 = this.c((byte) -95, var4.field_k - 4);
                        incrementValue$2 = var3_int;
                        var3_int--;
                        this.a(false, incrementValue$2);
                        break L3;
                      }
                    }
                  } else {
                    if ((var4.field_g ^ -1) < 183) {
                      break L3;
                    } else {
                      incrementValue$3 = var3_int;
                      var3_int--;
                      this.a(false, incrementValue$3);
                      break L3;
                    }
                  }
                }
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var3);

            stackIn_31_1 = new StringBuilder().append("pk.U(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L4;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L4;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2, String param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              wd.field_t.a(82, new tb(param3, param2, param0));
              if (param1 <= -34) {
                break L1;
              } else {
                this.a(-63, -32, -115, -32);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("pk.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw pn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6) {
        ok dupTemp$1 = null;
        RuntimeException runtimeException = null;
        ok var8 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if ((this.field_C.length ^ -1) >= (this.field_K ^ -1)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var8 = this.field_C[this.field_K];
                if (null != var8) {
                  break L1;
                } else {
                  dupTemp$1 = new ok();
                  this.field_C[this.field_K] = dupTemp$1;
                  var8 = dupTemp$1;
                  break L1;
                }
              }
              L2: {
                if (param3 <= -35) {
                  break L2;
                } else {
                  field_wb = (l) null;
                  break L2;
                }
              }
              var8.a(param1, false, param4, param0, param2, param6, param5);
              this.field_K = this.field_K + 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "pk.VA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void b(byte param0, md param1) {
        int discarded$0 = 0;
        int var3_int = 0;
        md var4 = null;
        int var5 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              L2: {
                if ((this.field_A.length ^ -1) >= (var3_int ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    var4 = this.field_A[var3_int];
                    if (null == var4) {
                      break L3;
                    } else {
                      L4: {
                        if (var4 == this.field_X) {
                          break L4;
                        } else {
                          if ((var4.field_t ^ -1) < -3) {
                            break L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var3_int++;
                      continue L1;
                    }
                  }
                  this.field_A[var3_int] = param1;
                  break L2;
                }
              }
              L5: {
                if (param0 >= 111) {
                  break L5;
                } else {
                  this.e(-75, 118);
                  break L5;
                }
              }
              discarded$0 = this.a(this.field_X.field_d, 200, param1.field_d);
              param1.field_h = po.a(this.a(this.field_X.field_d, 200, param1.field_d), 0, param1.field_r.a((byte) -66));
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var3);

            stackIn_26_1 = new StringBuilder().append("pk.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L6;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L6;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
    }

    private final void e(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = or.field_a;
              or.field_a = or.field_a + param0;
              if ((qq.a(20, 10) ^ -1) <= -6) {
                if (-6 < (qq.a(20, 10) ^ -1)) {
                  bo.field_h = bo.field_h - param0;
                  break L1;
                } else {
                  ct.field_x = ct.field_x - param0;
                  break L1;
                }
              } else {
                if (5 <= qq.a(20, 10)) {
                  ei.field_a = ei.field_a + param0;
                  break L1;
                } else {
                  se.field_b = se.field_b + param0;
                  break L1;
                }
              }
            }
            L2: {
              if (this.field_yb) {
                break L2;
              } else {
                if (!this.field_Cb) {
                  L3: {
                    if (var3_int >= 5000) {
                      break L3;
                    } else {
                      if (or.field_a < 5000) {
                        break L3;
                      } else {
                        fm.a(255, (byte) 111, 0);
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if ((var3_int ^ -1) <= -30001) {
                      break L4;
                    } else {
                      if (or.field_a >= 30000) {
                        fm.a(254, (byte) 111, 1);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if ((var3_int ^ -1) <= -80001) {
                    break L2;
                  } else {
                    if (or.field_a >= 80000) {
                      fm.a(253, (byte) 111, 2);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            var4 = -30 / ((26 - param1) / 46);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3), "pk.LA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if ((this.field_r[param1] ^ -1) >= -1) {
                break L1;
              } else {
                if (this.field_r[param1] <= 448) {
                  if (-65 > (this.field_r[param1] ^ -1)) {
                    this.field_r[param1] = 64;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  this.field_r[param1] = 512 + -this.field_r[param1];
                  break L1;
                }
              }
            }
            L2: {
              var3_int = param1 + param0;
              if ((this.field_p ^ -1) > (var3_int ^ -1)) {
                break L2;
              } else {
                if (this.c((byte) -14, param1)) {
                  this.field_p = this.field_p - var3_int;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3), "pk.MA(" + param0 + ',' + param1 + ')');
        }
    }

    private final int b(int param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (-1 > (param0 ^ -1)) {
              if (256 > param0) {
                var5_int = 256 + -param0;
                var6 = (16711935 & param1) * param0 + (param3 & 16711935) * var5_int >>> -690800984 & param2;
                var7 = (16711890 & (65280 & param1) * param0 + var5_int * (65280 & param3)) >>> 727054440;
                var8 = param0 * (16711680 & param1 >>> 2110879432) + var5_int * ((-16777216 & param3) >>> 1048961960) & -16777216;
                stackIn_7_0 = var6 | var8 | var7;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = param1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = param3;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var5), "pk.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    private final void a(int param0) {
        int discarded$1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -19054) {
                break L1;
              } else {
                this.c(-82, -76);
                break L1;
              }
            }
            discarded$1 = this.a((byte) -8, gh.field_j, 1, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2), "pk.TA(" + param0 + ')');
        }
    }

    private final void a(boolean param0, int param1) {
        wm var3 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            this.field_Bb = this.field_Bb - 1;
            if ((param1 ^ -1) == (this.field_Bb ^ -1)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  this.a((byte) -109);
                  break L1;
                }
              }
              var3 = this.field_i[param1];
              this.field_i[param1] = this.field_i[this.field_Bb];
              this.field_i[this.field_Bb] = var3;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3_ref), "pk.K(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void d(int param0, int param1) {
        eu var3 = null;
        this.field_ab = this.field_ab - 1;
        if ((this.field_ab ^ -1) == (param1 ^ -1)) {
            return;
        }
        try {
            var3 = this.field_S[param1];
            this.field_S[param1] = this.field_S[this.field_ab];
            this.field_S[this.field_ab] = var3;
            int var4 = -12 / ((-3 - param0) / 40);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "pk.UA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        int discarded$0 = 0;
        int discarded$1 = 0;
        int discarded$2 = 0;
        int discarded$3 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
        int discarded$6 = 0;
        int fieldTemp$7 = 0;
        Object stackIn_36_0 = null;
        kc stackIn_36_1 = null;
        Object stackIn_37_0 = null;
        kc stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        md stackIn_165_0 = null;
        int stackIn_257_0 = 0;
        int stackIn_257_1 = 0;
        md stackIn_261_0 = null;
        md stackIn_292_0 = null;
        int stackIn_359_0 = 0;
        int stackIn_359_1 = 0;
        double stackIn_369_0 = 0.0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        kc var3 = null;
        RuntimeException var3_ref = null;
        md[] var4_ref_md__ = null;
        int var4 = 0;
        int var5 = 0;
        md[] var6_ref_md__ = null;
        int var6_int = 0;
        o[] var6_ref_o__ = null;
        wm[] var6_ref_wm__ = null;
        eu[] var6_ref_eu__ = null;
        qf[] var6_ref_qf__ = null;
        md var6_ref_md = null;
        double var6 = 0.0;
        int var7 = 0;
        md var8_ref_md = null;
        int var8_int = 0;
        md[] var8_ref_md__ = null;
        qf var8_ref_qf = null;
        eu var8_ref_eu = null;
        wm var8_ref_wm = null;
        o var8_ref_o = null;
        double var8 = 0.0;
        int var9 = 0;
        md[] var10_ref_md__ = null;
        int var10_int = 0;
        md var10_ref_md = null;
        double var10 = 0.0;
        int var11 = 0;
        md var12_ref_md = null;
        double var12 = 0.0;
        kc var14 = null;
        double var15 = 0.0;
        double var17 = 0.0;
        int var19 = 0;
        var19 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              this.b(24260, 10);
              if (!param1) {
                break L1;
              } else {
                L2: while (true) {
                  if (!ek.a((byte) -126)) {
                    break L1;
                  } else {
                    this.a((byte) 73);
                    continue L2;
                  }
                }
              }
            }
            L3: {
              L4: {
                if (this.field_g) {
                  break L4;
                } else {
                  if (this.field_yb) {
                    break L4;
                  } else {
                    if ((this.field_R ^ -1) < -1) {
                      this.field_R = this.field_R - 5;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              if ((this.field_R ^ -1) > -201) {
                this.field_R = this.field_R + 5;
                break L3;
              } else {
                break L3;
              }
            }
            this.c(-115);
            if (!this.field_g) {
              this.field_c = this.field_c + 1;
              var3 = new kc(this.field_X.field_d);
              this.field_Y = this.field_Y - this.field_X.field_d.field_b / 3.0;
              this.field_t = this.field_t - this.field_X.field_d.field_a / 3.0;
              this.a((byte) 76, var3);
              var4_ref_md__ = this.field_A;
              var5 = 0;
              L5: while (true) {
                if ((var5 ^ -1) <= (var4_ref_md__.length ^ -1)) {
                  L6: {
                    stackIn_36_0 = this;

                    stackIn_36_1 = (kc) (var3);

                    if (param0) {
                      stackIn_37_0 = this;
                      stackIn_37_1 = (kc) ((Object) stackIn_36_1);
                      stackIn_37_2 = 0;
                      break L6;
                    } else {
                      stackIn_37_0 = this;
                      stackIn_37_1 = (kc) ((Object) stackIn_36_1);
                      stackIn_37_2 = 1;
                      break L6;
                    }
                  }
                  this.a(stackIn_37_1, stackIn_37_2 != 0);
                  this.a(var3, (byte) -93);
                  this.a(var3, 4473924);
                  var4 = 0;
                  L7: while (true) {
                    L8: {
                      L9: {
                        if (var4 >= 7) {
                          L10: {
                            if (this.field_yb) {
                              var4 = 0;
                              var5 = 0;
                              var6_ref_md__ = this.field_A;
                              var7 = 0;
                              L11: while (true) {
                                if (var6_ref_md__.length <= var7) {
                                  L12: {
                                    if ((var5 ^ -1) > -8) {
                                      discarded$0 = this.a((byte) -1, gh.field_j, 1, 0);
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  if (var4 < 7) {
                                    L13: {
                                      var4 = qq.a(20, 100);
                                      if (var4 != 0) {
                                        break L13;
                                      } else {
                                        if ((hg.field_D & 64 ^ -1) == -1) {
                                          break L13;
                                        } else {
                                          discarded$1 = this.a((byte) 54, ro.field_u, 1, 0);
                                          break L10;
                                        }
                                      }
                                    }
                                    L14: {
                                      if (5 <= var4) {
                                        break L14;
                                      } else {
                                        if ((2 & hg.field_D ^ -1) == -1) {
                                          break L14;
                                        } else {
                                          discarded$2 = this.a((byte) 116, ju.field_k, 1, 0);
                                          break L10;
                                        }
                                      }
                                    }
                                    L15: {
                                      if (15 <= var4) {
                                        break L15;
                                      } else {
                                        if (-1 != (hg.field_D & 1 ^ -1)) {
                                          discarded$3 = this.a((byte) 13, qq.field_g, 1, 0);
                                          break L10;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    if (-26 >= (var4 ^ -1)) {
                                      if (40 <= var4) {
                                        discarded$4 = this.a((byte) 85, kk.field_N, 1, 0);
                                        break L10;
                                      } else {
                                        discarded$5 = this.a((byte) 56, sl.field_p, 1, 0);
                                        break L10;
                                      }
                                    } else {
                                      discarded$6 = this.a((byte) 38, gm.field_y, 1, 0);
                                      break L10;
                                    }
                                  } else {
                                    break L10;
                                  }
                                } else {
                                  var8_ref_md = var6_ref_md__[var7];
                                  stackIn_261_0 = (md) (var8_ref_md);

                                  L16: {
                                    if (stackIn_261_0 != null) {
                                      if (-3 > (var8_ref_md.field_t ^ -1)) {
                                        if (gh.field_j == var8_ref_md.field_r) {
                                          var5++;
                                          break L16;
                                        } else {
                                          var4++;
                                          break L16;
                                        }
                                      } else {
                                        break L16;
                                      }
                                    } else {
                                      break L16;
                                    }
                                  }
                                  var7++;
                                  continue L11;
                                }
                              }
                            } else {
                              if ((this.field_lb ^ -1) <= -1) {
                                fieldTemp$7 = this.field_lb - 1;
                                this.field_lb = this.field_lb - 1;
                                if (fieldTemp$7 == 0) {
                                  L17: {
                                    if (this.field_yb) {
                                      break L17;
                                    } else {
                                      if (!this.field_m) {
                                        break L17;
                                      } else {
                                        fm.a(250, (byte) 111, 5);
                                        break L17;
                                      }
                                    }
                                  }
                                  this.a(false, true, 100);
                                  break L10;
                                } else {
                                  break L10;
                                }
                              } else {
                                var4 = 0;
                                var5 = 0;
                                var6_int = 0;
                                var7 = 0;
                                var8_int = 0;
                                var9 = 0;
                                var10_ref_md__ = this.field_A;
                                var11 = 0;
                                L18: while (true) {
                                  L19: {
                                    L20: {
                                      if (var10_ref_md__.length <= var11) {
                                        L21: {
                                          if (0 >= var4) {
                                            break L21;
                                          } else {
                                            if (!this.field_W) {
                                              L22: {
                                                L23: {
                                                  if (-1 <= (var9 ^ -1)) {
                                                    break L23;
                                                  } else {
                                                    if (this.field_ob) {
                                                      break L23;
                                                    } else {
                                                      this.field_ob = true;
                                                      lm.a(20, tg.field_a[2], true, (byte) -106);
                                                      var10_int = 0;
                                                      L24: while (true) {
                                                        if (var10_int >= 16) {
                                                          break L22;
                                                        } else {
                                                          wt.field_e.field_s.a((byte) -119, 256, var10_int);
                                                          var10_int++;
                                                          continue L24;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                if (var9 != 0) {
                                                  break L22;
                                                } else {
                                                  if (!this.field_ob) {
                                                    break L22;
                                                  } else {
                                                    this.field_ob = false;
                                                    lm.a(20, tg.field_a[1], true, (byte) 115);
                                                    this.b(11154);
                                                    break L22;
                                                  }
                                                }
                                              }
                                              if ((var4 ^ -1) == (var5 ^ -1)) {
                                                this.field_h = 4;
                                                break L21;
                                              } else {
                                                L25: {
                                                  if (-1 > (var5 ^ -1)) {
                                                    break L25;
                                                  } else {
                                                    if (var7 <= 0) {
                                                      L26: {
                                                        if ((var6_int ^ -1) < -1) {
                                                          break L26;
                                                        } else {
                                                          if (var8_int > 4) {
                                                            break L26;
                                                          } else {
                                                            if (-1 <= (var8_int ^ -1)) {
                                                              this.field_h = 0;
                                                              break L21;
                                                            } else {
                                                              this.field_h = 1;
                                                              break L21;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      this.field_h = 2;
                                                      break L21;
                                                    } else {
                                                      break L25;
                                                    }
                                                  }
                                                }
                                                this.field_h = 3;
                                                break L21;
                                              }
                                            } else {
                                              break L21;
                                            }
                                          }
                                        }
                                        if (!this.field_Cb) {
                                          if ((var4 ^ -1) >= (this.field_s / 5 ^ -1)) {
                                            if ((this.field_s ^ -1) > (oe.field_f.length + -1 ^ -1)) {
                                              this.field_xb = this.field_xb + 1;
                                              this.field_s = this.field_s + 1;
                                              stackIn_165_0 = this.field_X;
                                              break L20;
                                            } else {
                                              if (0 < var4) {
                                                break L19;
                                              } else {
                                                this.a(-16711936, (byte) -32, "Congratulations!");
                                                this.field_lb = 100;
                                                break L19;
                                              }
                                            }
                                          } else {
                                            break L19;
                                          }
                                        } else {
                                          if (0 < var4) {
                                            break L19;
                                          } else {
                                            this.field_xb = this.field_xb + 1;
                                            this.a((byte) 28, this.field_xb - -1);
                                            break L19;
                                          }
                                        }
                                      } else {
                                        var12_ref_md = var10_ref_md__[var11];
                                        stackIn_165_0 = (md) (var12_ref_md);

                                        L27: {
                                          if (stackIn_165_0 == null) {
                                            break L27;
                                          } else {
                                            if (gh.field_j == var12_ref_md.field_r) {
                                              break L27;
                                            } else {
                                              if ((var12_ref_md.field_t ^ -1) < -3) {
                                                L28: {
                                                  if (var12_ref_md.field_r == sl.field_p) {
                                                    var8_int++;
                                                    break L28;
                                                  } else {
                                                    break L28;
                                                  }
                                                }
                                                L29: {
                                                  if (var12_ref_md.field_r == qq.field_g) {
                                                    var7++;
                                                    break L29;
                                                  } else {
                                                    break L29;
                                                  }
                                                }
                                                L30: {
                                                  if (gm.field_y != var12_ref_md.field_r) {
                                                    break L30;
                                                  } else {
                                                    var6_int++;
                                                    break L30;
                                                  }
                                                }
                                                L31: {
                                                  if (ro.field_u != var12_ref_md.field_r) {
                                                    break L31;
                                                  } else {
                                                    var9++;
                                                    break L31;
                                                  }
                                                }
                                                L32: {
                                                  if (ju.field_k != var12_ref_md.field_r) {
                                                    break L32;
                                                  } else {
                                                    var5++;
                                                    break L32;
                                                  }
                                                }
                                                var4++;
                                                break L27;
                                              } else {
                                                break L27;
                                              }
                                            }
                                          }
                                        }
                                        var11++;
                                        continue L18;
                                      }
                                    }
                                    L33: {
                                      if (stackIn_165_0.field_k <= 0) {
                                        break L33;
                                      } else {
                                        this.field_X.field_k = this.field_X.field_k + (this.field_X.field_r.field_e >> 1254808129);
                                        break L33;
                                      }
                                    }
                                    L34: {
                                      if ((this.field_X.field_r.field_e ^ -1) > (this.field_X.field_k ^ -1)) {
                                        this.field_X.field_k = this.field_X.field_r.field_e;
                                        break L34;
                                      } else {
                                        break L34;
                                      }
                                    }
                                    this.f(-20416);
                                    break L19;
                                  }
                                  break L10;
                                }
                              }
                            }
                          }
                          stackIn_257_0 = -1;
                          stackIn_257_1 = this.field_jb ^ -1;
                          break L9;
                        } else {
                          stackIn_257_0 = -1;

                          stackIn_257_1 = this.field_r[var4] ^ -1;

                          L35: {
                            L36: {
                              if (stackIn_257_0 >= stackIn_257_1) {
                                break L36;
                              } else {
                                if (this.field_p > var4) {
                                  this.field_r[var4] = 512;
                                  break L35;
                                } else {
                                  break L36;
                                }
                              }
                            }
                            if (this.field_r[var4] <= 0) {
                              break L35;
                            } else {
                              this.field_r[var4] = this.field_r[var4] - 1;
                              break L35;
                            }
                          }
                          var4++;
                          continue L7;
                        }
                      }
                      L37: {
                        if (stackIn_257_0 > stackIn_257_1) {
                          this.field_jb = this.field_jb - 1;
                          break L37;
                        } else {
                          break L37;
                        }
                      }
                      stackIn_261_0 = this.field_X;
                      break L8;
                    }
                    L38: {
                      L39: {
                        if (stackIn_261_0.field_k > 0) {
                          break L39;
                        } else {
                          if (-3 <= (this.field_X.field_t ^ -1)) {
                            if (!this.field_yb) {
                              this.field_m = false;
                              if (-1 > (this.field_ub ^ -1)) {
                                this.field_ub = this.field_ub - 1;
                                break L39;
                              } else {
                                this.field_ub = 80;
                                var4 = 0;
                                var5 = 0;
                                L40: while (true) {
                                  L41: {
                                    if (var4 != 0) {
                                      break L41;
                                    } else {
                                      var5++;
                                      stackIn_359_0 = -51;

                                      stackIn_359_1 = var5 ^ -1;

                                      if (stackIn_359_0 >= stackIn_359_1) {
                                        break L41;
                                      } else {
                                        var6_int = qq.a(20, 3200);
                                        var7 = qq.a(20, 2400);
                                        this.field_X.field_d.a((double)var6_int, (double)var7, true);
                                        jp.a(50, this.field_X.field_h);
                                        stackIn_292_0 = this.field_X;
                                        L42: while (true) {
                                          stackIn_292_0.field_h = po.a(256, 0, this.field_X.field_r.a((byte) 104));
                                          var4 = 1;
                                          var8_ref_md__ = this.field_A;
                                          var9 = 0;
                                          L43: while (true) {
                                            L44: {
                                              if (var9 >= var8_ref_md__.length) {
                                                break L44;
                                              } else {
                                                var10_ref_md = var8_ref_md__[var9];
                                                stackIn_292_0 = (md) (var10_ref_md);

                                                L45: {
                                                  if (stackIn_292_0 == null) {
                                                    break L45;
                                                  } else {
                                                    if (var10_ref_md == this.field_X) {
                                                      break L45;
                                                    } else {
                                                      if (var10_ref_md.field_t <= 2) {
                                                        break L45;
                                                      } else {
                                                        if (uh.a(97, var10_ref_md.field_d, 500.0, this.field_X.field_d)) {
                                                          var4 = 0;
                                                          break L44;
                                                        } else {
                                                          break L45;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                var9++;
                                                continue L43;
                                              }
                                            }
                                            continue L40;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  this.field_t = this.field_t - this.field_X.field_d.field_a / 3.0;
                                  this.field_Y = this.field_Y - this.field_X.field_d.field_b / 3.0;
                                  var3.a(this.field_X.field_d, true);
                                  var6_ref_o__ = this.field_E;
                                  var7 = 0;
                                  L46: while (true) {
                                    if (var7 >= var6_ref_o__.length) {
                                      var6_ref_md__ = this.field_A;
                                      var7 = 0;
                                      L47: while (true) {
                                        if (var6_ref_md__.length <= var7) {
                                          var6_ref_wm__ = this.field_i;
                                          var7 = 0;
                                          L48: while (true) {
                                            if ((var6_ref_wm__.length ^ -1) >= (var7 ^ -1)) {
                                              var6_ref_eu__ = this.field_S;
                                              var7 = 0;
                                              L49: while (true) {
                                                if (var7 >= var6_ref_eu__.length) {
                                                  var6_ref_qf__ = this.field_n;
                                                  var7 = 0;
                                                  L50: while (true) {
                                                    if (var6_ref_qf__.length <= var7) {
                                                      this.field_jb = 120;
                                                      this.field_X.field_t = 3;
                                                      this.field_X.field_k = this.field_X.field_r.field_e;
                                                      this.field_F = this.field_F - 1;
                                                      break L39;
                                                    } else {
                                                      L51: {
                                                        var8_ref_qf = var6_ref_qf__[var7];
                                                        if (null != var8_ref_qf) {
                                                          var8_ref_qf.field_d.a(var3, -30507);
                                                          break L51;
                                                        } else {
                                                          break L51;
                                                        }
                                                      }
                                                      var7++;
                                                      continue L50;
                                                    }
                                                  }
                                                } else {
                                                  L52: {
                                                    var8_ref_eu = var6_ref_eu__[var7];
                                                    if (var8_ref_eu != null) {
                                                      var8_ref_eu.field_d.a(var3, -30507);
                                                      break L52;
                                                    } else {
                                                      break L52;
                                                    }
                                                  }
                                                  var7++;
                                                  continue L49;
                                                }
                                              }
                                            } else {
                                              L53: {
                                                var8_ref_wm = var6_ref_wm__[var7];
                                                if (var8_ref_wm == null) {
                                                  break L53;
                                                } else {
                                                  var8_ref_wm.field_d.a(var3, -30507);
                                                  break L53;
                                                }
                                              }
                                              var7++;
                                              continue L48;
                                            }
                                          }
                                        } else {
                                          L54: {
                                            var8_ref_md = var6_ref_md__[var7];
                                            if (var8_ref_md != null) {
                                              var8_ref_md.field_d.a(var3, -30507);
                                              break L54;
                                            } else {
                                              break L54;
                                            }
                                          }
                                          var7++;
                                          continue L47;
                                        }
                                      }
                                    } else {
                                      L55: {
                                        var8_ref_o = var6_ref_o__[var7];
                                        if (var8_ref_o == null) {
                                          break L55;
                                        } else {
                                          var8_ref_o.field_d.a(var3, -30507);
                                          break L55;
                                        }
                                      }
                                      var7++;
                                      continue L46;
                                    }
                                  }
                                }
                              }
                            } else {
                              var4_ref_md__ = this.field_A;
                              var5 = 0;
                              L56: while (true) {
                                if (var5 >= var4_ref_md__.length) {
                                  break L39;
                                } else {
                                  L57: {
                                    var6_ref_md = var4_ref_md__[var5];
                                    if (var6_ref_md == null) {
                                      break L57;
                                    } else {
                                      if (var6_ref_md.field_r != gh.field_j) {
                                        break L57;
                                      } else {
                                        if (var6_ref_md.field_k > 0) {
                                          this.field_X = var6_ref_md;
                                          break L57;
                                        } else {
                                          break L57;
                                        }
                                      }
                                    }
                                  }
                                  var5++;
                                  continue L56;
                                }
                              }
                            }
                          } else {
                            break L39;
                          }
                        }
                      }
                      this.b((byte) -13);
                      stackIn_359_0 = this.field_F ^ -1;
                      stackIn_359_1 = -1;
                      break L38;
                    }
                    L58: {
                      if (stackIn_359_0 > stackIn_359_1) {
                        this.a(false, false, 100);
                        break L58;
                      } else {
                        break L58;
                      }
                    }
                    L59: {
                      var4 = 0;
                      if (param0) {
                        break L59;
                      } else {
                        this.f(-8);
                        break L59;
                      }
                    }
                    L60: {
                      var5 = 0;
                      if ((sh.field_u ^ -1) > (gp.field_w ^ -1)) {
                        stackIn_369_0 = (double)sh.field_u;
                        break L60;
                      } else {
                        stackIn_369_0 = (double)gp.field_w;
                        break L60;
                      }
                    }
                    L61: {
                      var6 = stackIn_369_0;
                      var8 = var6 * 100.0 / 480.0;
                      var10 = var6 * 600.0 / 480.0;
                      var12 = var6 * 1000.0 / 480.0;
                      if (!this.field_yb) {
                        L62: {
                          var14 = this.field_X.field_d;
                          var15 = Math.abs(this.field_kb * var14.field_a / 1000.0);
                          var17 = Math.abs(var14.field_b * this.field_kb / 1000.0);
                          if (1.01 * var15 >= (double)(gp.field_w / 4)) {
                            break L62;
                          } else {
                            if ((double)(sh.field_u / 4) <= var17 * 1.01) {
                              break L62;
                            } else {
                              var5 = 1;
                              break L62;
                            }
                          }
                        }
                        L63: {
                          L64: {
                            if (0.99 * var15 > (double)(sh.field_u / 4)) {
                              break L64;
                            } else {
                              if (var17 * 0.99 <= (double)(gp.field_w / 4)) {
                                break L63;
                              } else {
                                break L64;
                              }
                            }
                          }
                          var4 = 1;
                          break L63;
                        }
                        L65: {
                          if (this.field_kb <= var12) {
                            break L65;
                          } else {
                            var4 = 1;
                            break L65;
                          }
                        }
                        if (var4 == 0) {
                          if (var5 != 0) {
                            this.field_kb = this.field_kb * 1.01;
                            if (var12 < this.field_kb) {
                              this.field_kb = var12;
                              break L61;
                            } else {
                              break L61;
                            }
                          } else {
                            break L61;
                          }
                        } else {
                          this.field_kb = this.field_kb * 0.99;
                          if (this.field_kb >= var8) {
                            break L61;
                          } else {
                            this.field_kb = var8;
                            break L61;
                          }
                        }
                      } else {
                        L66: {
                          if (var10 < this.field_kb) {
                            this.field_kb = this.field_kb * 0.99;
                            break L66;
                          } else {
                            break L66;
                          }
                        }
                        if (this.field_kb >= var10) {
                          break L61;
                        } else {
                          this.field_kb = var10;
                          break L61;
                        }
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  L67: {
                    var6_ref_md = var4_ref_md__[var5];
                    if (null != var6_ref_md) {
                      this.a(-106, var6_ref_md, var3);
                      break L67;
                    } else {
                      break L67;
                    }
                  }
                  var5++;
                  continue L5;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3_ref), "pk.SA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        vc dupTemp$2 = null;
        int discarded$3 = 0;
        RuntimeException runtimeException = null;
        vc var5 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_z.length > this.field_l) {
              L1: {
                var5 = this.field_z[this.field_l];
                if (var5 != null) {
                  break L1;
                } else {
                  dupTemp$2 = new vc();
                  this.field_z[this.field_l] = dupTemp$2;
                  var5 = dupTemp$2;
                  break L1;
                }
              }
              L2: {
                var5.a(param3, param2, param0, (byte) 127);
                if (param1 == -14630) {
                  break L2;
                } else {
                  discarded$3 = this.a((md) null, 100, (md) null);
                  break L2;
                }
              }
              this.field_l = this.field_l + 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "pk.WA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(boolean param0) {
        RuntimeException runtimeException = null;
        md[] var2 = null;
        int var3 = 0;
        md var4 = null;
        int var5 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (param0) {
              if (null != this.field_A) {
                var2 = this.field_A;
                var3 = 0;
                L1: while (true) {
                  if ((var2.length ^ -1) >= (var3 ^ -1)) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L2: {
                      var4 = var2[var3];
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (null != var4.field_h) {
                          jp.a(50, var4.field_h);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var3++;
                    continue L1;
                  }
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
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "pk.QA(" + param0 + ')');
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

    private final void a(int param0, md param1, kc param2) {
        RuntimeException stackIn_146_0 = null;
        StringBuilder stackIn_146_1 = null;
        RuntimeException stackIn_147_0 = null;
        StringBuilder stackIn_147_1 = null;
        String stackIn_147_2 = null;
        StringBuilder stackIn_150_1 = null;
        StringBuilder stackIn_151_1 = null;
        String stackIn_151_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              param1.field_d.a(param2, -30507);
              if (param1.field_g == null) {
                break L1;
              } else {
                L2: {
                  if (param1.field_g.field_k <= 0) {
                    break L2;
                  } else {
                    if (param1.field_g.field_n == param1) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param1.field_g = null;
                break L1;
              }
            }
            L3: {
              if (0 >= param1.field_q) {
                break L3;
              } else {
                param1.field_q = param1.field_q - 2;
                if (param1.field_k <= 0) {
                  break L3;
                } else {
                  this.a(qq.a(20, 10) + (param1.field_q >> 470669025), param1.field_d, (byte) -74, 4473924);
                  break L3;
                }
              }
            }
            L4: {
              if (!this.field_Eb) {
                break L4;
              } else {
                if (!this.field_j) {
                  break L4;
                } else {
                  if (param1 != this.field_X) {
                    break L4;
                  } else {
                    param1.field_k = param1.field_r.field_e;
                    break L4;
                  }
                }
              }
            }
            if ((param1.field_k ^ -1) < -1) {
              L5: {
                rg.a(this.a(param1, 5000, this.field_X), false, param1.field_h, this.a(this.field_X.field_d, 200, param1.field_d));
                if (param1.field_p) {
                  L6: {
                    if (param1.field_b > param1.field_r.field_h) {
                      param1.field_b = param1.field_b - 0.2;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  if (param1.field_r.field_h > param1.field_b) {
                    param1.field_b = param1.field_r.field_h;
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  L7: {
                    if (param1.field_r.field_i > param1.field_b) {
                      param1.field_b = param1.field_b + 0.2;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  if (param1.field_r.field_i < param1.field_b) {
                    param1.field_b = param1.field_r.field_i;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              L8: {
                if (param1.field_t < 92) {
                  param1.field_t = param1.field_t + 1;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if ((param1.field_j ^ -1) >= -101) {
                  break L9;
                } else {
                  param1.b(24.0, 128);
                  this.field_D.a(param1.field_d, true);
                  param1.b(-24.0, 128);
                  this.field_D.a((byte) 103, oh.a(3.0, (byte) 28));
                  break L9;
                }
              }
              L10: {
                if (!param1.field_l) {
                  break L10;
                } else {
                  if (-93 == (param1.field_t ^ -1)) {
                    if (-1 <= (param1.field_y ^ -1)) {
                      if ((param1.field_m ^ -1) == -4) {
                        this.a((byte) 60, param1);
                        param1.field_y = param1.field_y + 2;
                        param1.field_x = param1.field_x - 2;
                        break L10;
                      } else {
                        if (param1.field_m != 4) {
                          if ((param1.field_j ^ -1) > -101) {
                            L11: {
                              this.a((byte) 115, param1);
                              param1.field_j = param1.field_j + (-param1.field_r.field_f + param1.field_r.field_d + 22);
                              param1.field_y = param1.field_y + param1.field_r.field_d;
                              if (0 >= param1.field_m) {
                                break L11;
                              } else {
                                param1.field_x = param1.field_x - 5;
                                break L11;
                              }
                            }
                            if (param1.field_j >= 100) {
                              param1.field_j = 200;
                              if (this.field_X != param1) {
                                break L10;
                              } else {
                                if (!this.field_yb) {
                                  bm.a((byte) -70, mh.field_o);
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                            } else {
                              break L10;
                            }
                          } else {
                            break L10;
                          }
                        } else {
                          this.a((byte) 55, param1);
                          param1.field_x = param1.field_x - 2;
                          param1.field_y = param1.field_y + param1.field_r.field_d;
                          param1.field_j = param1.field_j + param1.field_r.field_d;
                          break L10;
                        }
                      }
                    } else {
                      break L10;
                    }
                  } else {
                    break L10;
                  }
                }
              }
              L12: {
                if (0 < param1.field_x) {
                  break L12;
                } else {
                  if (0 >= param1.field_m) {
                    break L12;
                  } else {
                    L13: {
                      if ((param1.field_m ^ -1) != -4) {
                        break L13;
                      } else {
                        param1.field_j = 200;
                        bm.a((byte) -70, mh.field_o);
                        break L13;
                      }
                    }
                    param1.field_m = 0;
                    param1.field_x = 0;
                    break L12;
                  }
                }
              }
              L14: {
                if (0 >= param1.field_y) {
                  break L14;
                } else {
                  param1.field_y = param1.field_y - 1;
                  break L14;
                }
              }
              L15: {
                var4_int = -31 % ((7 - param0) / 35);
                if ((param1.field_j ^ -1) < -1) {
                  param1.field_j = param1.field_j - 1;
                  if ((param1.field_j ^ -1) != -101) {
                    break L15;
                  } else {
                    param1.field_j = 0;
                    break L15;
                  }
                } else {
                  break L15;
                }
              }
              L16: {
                param1.field_l = false;
                param1.a(2);
                param1.a(3200.0, (byte) 49, 2400.0);
                if (ro.field_u == param1.field_r) {
                  param1.field_i = param1.field_i + 1;
                  break L16;
                } else {
                  L17: {
                    if (0 >= param1.field_i) {
                      break L17;
                    } else {
                      param1.field_i = param1.field_i - 1;
                      break L17;
                    }
                  }
                  if ((param1.field_i ^ -1) > -1) {
                    param1.field_i = param1.field_i + 1;
                    break L16;
                  } else {
                    break L16;
                  }
                }
              }
              L18: {
                L19: {
                  if (this.field_X != param1) {
                    break L19;
                  } else {
                    if (this.field_yb) {
                      break L19;
                    } else {
                      break L18;
                    }
                  }
                }
                L20: {
                  if (qo.field_e != param1.field_u) {
                    break L20;
                  } else {
                    if (!uh.a(93, this.field_X.field_d, 1000.0, param1.field_d)) {
                      break L20;
                    } else {
                      param1.field_u = ht.field_i;
                      break L20;
                    }
                  }
                }
                L21: {
                  if (param1.field_n == null) {
                    break L21;
                  } else {
                    if ((param1.field_n.field_k ^ -1) < -1) {
                      break L21;
                    } else {
                      param1.field_n = null;
                      break L21;
                    }
                  }
                }
                param1.field_b = param1.field_r.field_i;
                this.b(param1, -111);
                param1.a(this.field_xb, (byte) 75, param1.field_n);
                break L18;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.a(true, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var4 = decompiledCaughtException;
            stackIn_146_0 = (RuntimeException) (var4);

            stackIn_146_1 = new StringBuilder().append("pk.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_147_0 = (RuntimeException) ((Object) stackIn_146_0);
              stackIn_147_1 = (StringBuilder) ((Object) stackIn_146_1);
              stackIn_147_2 = "null";
              break L22;
            } else {
              stackIn_147_0 = (RuntimeException) ((Object) stackIn_146_0);
              stackIn_147_1 = (StringBuilder) ((Object) stackIn_146_1);
              stackIn_147_2 = "{...}";
              break L22;
            }
          }
          L23: {


            stackIn_150_1 = ((StringBuilder) (Object) stackIn_147_1).append(stackIn_147_2).append(',');

            if (param2 == null) {
              stackIn_147_0 = (RuntimeException) ((Object) stackIn_147_0);
              stackIn_151_1 = (StringBuilder) ((Object) stackIn_150_1);
              stackIn_151_2 = "null";
              break L23;
            } else {
              stackIn_147_0 = (RuntimeException) ((Object) stackIn_147_0);
              stackIn_151_1 = (StringBuilder) ((Object) stackIn_150_1);
              stackIn_151_2 = "{...}";
              break L23;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_147_0), stackIn_151_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(kc param0, int param1, int param2) {
        wm dupTemp$0 = null;
        RuntimeException runtimeException = null;
        wm var4 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 32597) {
              if (this.field_i.length <= this.field_Bb) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var4 = this.field_i[this.field_Bb];
                  if (var4 == null) {
                    dupTemp$0 = new wm();
                    this.field_i[this.field_Bb] = dupTemp$0;
                    var4 = dupTemp$0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var4.a(param2, -111, param0);
                this.field_Bb = this.field_Bb + 1;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (runtimeException);

            stackIn_14_1 = new StringBuilder().append("pk.KA(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
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

    private final int a(md param0, int param1, md param2) {
        int stackIn_4_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        double var4_double = 0.0;
        RuntimeException var4 = null;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        try {
          L0: {
            if (param0 == param2) {
              stackIn_4_0 = 256;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == 5000) {
                  break L1;
                } else {
                  this.field_Db = 84;
                  break L1;
                }
              }
              L2: {
                ek.field_u.a(param2.field_d, true);
                ek.field_u.a(param0.field_d, -30507);
                var4_double = 3.141592653589793 * param0.field_e / 128.0;
                kp.field_d.a(param0.field_b * Math.sin(var4_double), param0.field_b * Math.cos(var4_double), true);
                var4_double = param2.field_e * 3.141592653589793 / 128.0;
                kp.field_d.field_a = kp.field_d.field_a - param2.field_b * Math.sin(var4_double);
                kp.field_d.field_b = kp.field_d.field_b - param2.field_b * Math.cos(var4_double);
                var6 = kp.field_d.a(ek.field_u, (byte) -67);
                var8 = 500;
                var8 = (int)(var6 * (double)var8 / ek.field_u.b(127));
                if (99 >= (var8 ^ -1)) {
                  break L2;
                } else {
                  var8 = -100;
                  break L2;
                }
              }
              L3: {
                if (100 < var8) {
                  var8 = 100;
                  break L3;
                } else {
                  break L3;
                }
              }
              var9 = -var8 + 256;
              stackIn_15_0 = var9;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("pk.W(");

            if (param0 == null) {
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
          L5: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_20_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_15_0;
        }
    }

    private final void a(boolean param0, md param1) {
        int stackIn_23_0 = 0;
        int stackIn_27_1 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (2 < param1.field_t) {
                L2: {
                  if (param1.field_r != ro.field_u) {
                    break L2;
                  } else {
                    param1.field_i = param1.field_i + 1;
                    break L2;
                  }
                }
                L3: {
                  if (92 > param1.field_t) {
                    L4: {
                      if (param1.field_r != ro.field_u) {
                        stackIn_23_0 = param1.field_t + 164;
                        break L4;
                      } else {
                        stackIn_23_0 = 256;
                        break L4;
                      }
                    }
                    L5: {


                      if (param0) {

                        stackIn_27_1 = 0;
                        break L5;
                      } else {

                        stackIn_27_1 = 1;
                        break L5;
                      }
                    }
                    rg.a(stackIn_23_0, stackIn_27_1 != 0, param1.field_h, this.a(this.field_X.field_d, 200, param1.field_d));
                    this.field_D.a(param1.field_d, true);
                    this.field_D.a((byte) 103, oh.a(5.0, (byte) 28));
                    this.a(this.field_D, 16777215, qq.a(20, 64) + 64, 0, param1.field_t);
                    break L3;
                  } else {
                    if (ro.field_u == param1.field_r) {
                      jp.a(50, param1.field_h);
                      param1.field_h = po.a(this.a(this.field_X.field_d, 200, param1.field_d), 0, kn.field_c[4]);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L6: {
                  param1.field_t = param1.field_t - 1;
                  if (param1.field_t == 2) {
                    L7: {
                      if (this.field_X != param1) {
                        this.field_p = this.field_p + 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      jp.a(50, param1.field_h);
                      param1.field_h = null;
                      this.a(param1, 8073);
                      this.a(this.field_D, -param1.field_r.field_a * 4, 240, 0, 0);
                      if (param1.field_r != ro.field_u) {
                        break L8;
                      } else {
                        if (this.field_yb) {
                          break L8;
                        } else {
                          if (this.field_Cb) {
                            break L8;
                          } else {
                            fm.a(249, (byte) 111, 6);
                            break L8;
                          }
                        }
                      }
                    }
                    var3_int = this.a(this.field_X.field_d, 200, param1.field_d);
                    if ((var3_int ^ -1) >= -1) {
                      break L6;
                    } else {
                      if (ro.field_u != param1.field_r) {
                        if (gm.field_y != param1.field_r) {
                          gg.a(kn.field_c[qq.a(20, 3)], var3_int, -27227);
                          break L6;
                        } else {
                          gg.a(kn.field_c[3], var3_int, -27227);
                          break L6;
                        }
                      } else {
                        gg.a(kn.field_c[5], var3_int, -27227);
                        break L6;
                      }
                    }
                  } else {
                    break L6;
                  }
                }
                L9: {
                  if (param1.field_b <= 0.0) {
                    break L9;
                  } else {
                    param1.field_b = param1.field_b - 0.1;
                    break L9;
                  }
                }
                L10: {
                  param1.field_m = 0;
                  if (0 >= param1.field_x) {
                    break L10;
                  } else {
                    param1.field_x = param1.field_x - 1;
                    break L10;
                  }
                }
                param1.a(2.0, (byte) 25);
                param1.a(2);
                param1.a(3200.0, (byte) 49, 2400.0);
                break L1;
              } else {
                param1.field_b = 0.0;
                break L1;
              }
            }
            L11: {
              if (param0) {
                break L11;
              } else {
                this.c(110, -27);
                break L11;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackIn_73_0 = (RuntimeException) (var3);

            stackIn_73_1 = new StringBuilder().append("pk.GB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "null";
              break L12;
            } else {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "{...}";
              break L12;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ')');
        }
    }

    final void a(boolean param0, boolean param1, int param2) {
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_q = or.field_a;
              stackIn_4_0 = this;

              if (this.field_Ab > 0) {
                stackIn_5_0 = this;
                stackIn_5_1 = this.field_pb * 100 / this.field_Ab;
                break L1;
              } else {
                stackIn_5_0 = this;
                stackIn_5_1 = 0;
                break L1;
              }
            }
            L2: {
              ((pk) (this)).field_b = stackIn_5_1;
              if (param2 != this.field_b) {
                break L2;
              } else {
                if (param1) {
                  fm.a(248, (byte) 111, 7);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (cn.b(true)) {
                if (0 >= or.field_a) {
                  eu.a((byte) -86, 0, param0);
                  break L3;
                } else {
                  eu.a((byte) -81, 6, param0);
                  break L3;
                }
              } else {
                L4: {
                  sg.field_c.g(-8);
                  ql.field_r = null;
                  if (!this.field_Cb) {
                    stackIn_19_0 = 0;
                    break L4;
                  } else {
                    stackIn_19_0 = 1;
                    break L4;
                  }
                }
                cs.field_a = stackIn_19_0;
                if (0 != r.field_n) {
                  eu.a((byte) -102, 5, param0);
                  break L3;
                } else {
                  eu.a((byte) -105, 2, param0);
                  break L3;
                }
              }
            }
            lm.a(40, tg.field_a[0], true, (byte) -84);
            var4_int = 0;
            L5: while (true) {
              if (-17 >= (var4_int ^ -1)) {
                sg.field_c.c((byte) 50);
                co.field_b = 0;
                break L0;
              } else {
                wt.field_e.field_s.a((byte) -126, 256, var4_int);
                var4_int++;
                continue L5;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var4), "pk.BB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(ha param0, int param1, int param2) {
        int stackIn_13_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_90_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        md[] var7_ref_md__ = null;
        int var7 = 0;
        int var8_int = 0;
        wm var8 = null;
        int var9 = 0;
        md var9_ref_md = null;
        int var10 = 0;
        int var11 = 0;
        double var12_double = 0.0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        double var14_double = 0.0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        var18 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var4_int = -param1 + 64;
            var5 = -64 + gp.field_w - -param1;
            ec.field_e[0].a(3 + -param1, param1 + (-126 + gp.field_w));
            var6 = 7 * -this.field_c & 511;
            ec.field_e[1].a((float)var4_int, (float)var5, 4096, 65536 * var6 / 511);
            if (param2 == 16711935) {
              var7_ref_md__ = this.field_A;
              var8_int = 0;
              L1: while (true) {
                if (var8_int >= var7_ref_md__.length) {
                  var7 = 0;
                  L2: while (true) {
                    if ((this.field_Bb ^ -1) >= (var7 ^ -1)) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L3: {
                        var8 = this.field_i[var7];
                        if (null != var8) {
                          if (var8.field_g >= 0) {
                            L4: {
                              var9 = (int)(var8.field_d.field_a * 60.0 / 2400.0);
                              var10 = (int)(60.0 * var8.field_d.field_b / 2400.0);
                              var11 = var9 * var9 - -(var10 * var10);
                              if (3600 < var11) {
                                var12_double = 60.0 / Math.sqrt((double)var11);
                                var9 = (int)((double)var9 * var12_double);
                                var10 = (int)((double)var10 * var12_double);
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            L5: {
                              var10 = var10 + var5;
                              var9 = var9 + var4_int;
                              var12 = 2;
                              var14 = (var8.field_g & 15) >> 792704801;
                              var12 = 8 + -var14;
                              stackIn_82_0 = var14 << -183478755;

                              if ((var8.field_k ^ -1) > -5) {
                                stackIn_83_0 = stackIn_82_0;
                                stackIn_83_1 = 65280;
                                break L5;
                              } else {
                                stackIn_83_0 = stackIn_82_0;
                                stackIn_83_1 = 16776960;
                                break L5;
                              }
                            }
                            var13 = stackIn_83_0 | stackIn_83_1;
                            param0.e(var13, var12, -(var12 >> -238218975) + var10, var12, -(var12 >> -467998111) + var9, 3105);
                            break L3;
                          } else {
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      var7++;
                      continue L2;
                    }
                  }
                } else {
                  L6: {
                    var9_ref_md = var7_ref_md__[var8_int];
                    if (null == var9_ref_md) {
                      break L6;
                    } else {
                      if ((var9_ref_md.field_t ^ -1) >= -3) {
                        break L6;
                      } else {
                        L7: {
                          var10 = (int)(60.0 * var9_ref_md.field_d.field_a / 2400.0);
                          var11 = (int)(var9_ref_md.field_d.field_b * 60.0 / 2400.0);
                          if (this.field_X == var9_ref_md) {
                            stackIn_13_0 = 255;
                            break L7;
                          } else {
                            stackIn_13_0 = 511 & var9_ref_md.field_d.c(-113) + var6;
                            break L7;
                          }
                        }
                        L8: {
                          var12 = stackIn_13_0;
                          if (-256 <= (var12 ^ -1)) {
                            break L8;
                          } else {
                            var12 = 0;
                            break L8;
                          }
                        }
                        L9: {
                          if (gh.field_j != var9_ref_md.field_r) {
                            break L9;
                          } else {
                            var12 = 127 + (var12 >> 190018049);
                            break L9;
                          }
                        }
                        L10: {
                          var13 = var11 * var11 + var10 * var10;
                          if (var13 <= 3600) {
                            break L10;
                          } else {
                            var14_double = 60.0 / Math.sqrt((double)var13);
                            var10 = (int)((double)var10 * var14_double);
                            var11 = (int)((double)var11 * var14_double);
                            break L10;
                          }
                        }
                        L11: {
                          var10 = var10 + var4_int;
                          var11 = var11 + var5;
                          var14 = 2;
                          if (var9_ref_md == this.field_X) {
                            var15 = -16711936;
                            var14 = 3;
                            break L11;
                          } else {
                            if (gh.field_j != var9_ref_md.field_r) {
                              if (kk.field_N == var9_ref_md.field_r) {
                                var15 = 16711680 | var12 << 2082359000;
                                break L11;
                              } else {
                                if (var9_ref_md.field_r == sl.field_p) {
                                  var15 = var12 << 1779969784 | 16711935;
                                  break L11;
                                } else {
                                  if (var9_ref_md.field_r == gm.field_y) {
                                    var15 = 16777215 | var12 << -2143202344;
                                    break L11;
                                  } else {
                                    if (var9_ref_md.field_r != id.field_f) {
                                      if (qq.field_g != var9_ref_md.field_r) {
                                        if (var9_ref_md.field_r == ju.field_k) {
                                          var16 = (int)sb.a(63, var9_ref_md.field_d, this.field_X.field_d);
                                          if ((var16 ^ -1) <= -601) {
                                            break L6;
                                          } else {
                                            L12: {
                                              var15 = 16742144;
                                              if ((var16 ^ -1) >= -501) {
                                                var15 = var15 | -16777216;
                                                break L12;
                                              } else {
                                                var17 = (-var16 + 600) * 255 / 100;
                                                var15 = var15 | var17 * var12 >> -758360 << 1582101240;
                                                break L12;
                                              }
                                            }
                                            break L11;
                                          }
                                        } else {
                                          if (var9_ref_md.field_r != ro.field_u) {
                                            throw new IllegalStateException();
                                          } else {
                                            var14 = 5;
                                            var15 = var12 << 1116068952 | 65535;
                                            break L11;
                                          }
                                        }
                                      } else {
                                        var15 = var12 << -1213635208 | 224694;
                                        break L11;
                                      }
                                    } else {
                                      var15 = var12 << -1671134664 | 16777088;
                                      break L11;
                                    }
                                  }
                                }
                              }
                            } else {
                              var15 = 65280 | var12 << 654223096;
                              break L11;
                            }
                          }
                        }
                        param0.d(var14, var14, -(var14 >> -1801508543) + var11, -5782, var15, var10 - (var14 >> -1766219039));
                        break L6;
                      }
                    }
                  }
                  var8_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var4 = decompiledCaughtException;
            stackIn_89_0 = (RuntimeException) (var4);

            stackIn_89_1 = new StringBuilder().append("pk.EB(");

            if (param0 == null) {
              stackIn_90_0 = (RuntimeException) ((Object) stackIn_89_0);
              stackIn_90_1 = (StringBuilder) ((Object) stackIn_89_1);
              stackIn_90_2 = "null";
              break L13;
            } else {
              stackIn_90_0 = (RuntimeException) ((Object) stackIn_89_0);
              stackIn_90_1 = (StringBuilder) ((Object) stackIn_89_1);
              stackIn_90_2 = "{...}";
              break L13;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_90_0), stackIn_90_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(kc param0, int param1) {
        int fieldTemp$0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        qf var4 = null;
        int var5 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              L2: {
                if ((this.field_w ^ -1) >= (var3_int ^ -1)) {
                  stackIn_18_0 = param1;
                  stackIn_18_1 = 4473924;
                  break L2;
                } else {
                  var4 = this.field_n[var3_int];
                  var4.field_d.a(param0, -30507);
                  fieldTemp$0 = var4.field_i + 5;
                  var4.field_i = var4.field_i + 5;
                  stackIn_18_0 = fieldTemp$0 ^ -1;

                  stackIn_18_1 = var4.field_g ^ -1;

                  L3: {
                    if (stackIn_18_0 <= stackIn_18_1) {
                      this.c(var3_int, -690800984);
                      var3_int--;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (-1 >= (var4.field_l ^ -1)) {
                      break L4;
                    } else {
                      if ((var4.field_i ^ -1) > (var4.field_g ^ -1)) {
                        this.a(var4.field_d, 10066329, 2 * qq.a(param1 ^ 4473936, -var4.field_i + var4.field_g), 0, var4.field_j);
                        this.a(var4.field_d, 6710886, 2 * qq.a(20, -var4.field_i + var4.field_g), param1 + -4473924, var4.field_j);
                        this.a(var4.field_d, 4473924, 2 * qq.a(20, -var4.field_i + var4.field_g), 0, var4.field_j);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var3_int++;
                  continue L1;
                }
              }
              L5: {
                if (stackIn_18_0 == stackIn_18_1) {
                  break L5;
                } else {
                  this.a(-112, (kc) null, (byte) 98, -76);
                  break L5;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var3);

            stackIn_25_1 = new StringBuilder().append("pk.L(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
    }

    private final boolean c(byte param0, int param1) {
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_101_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        md[] var5 = null;
        int var6 = 0;
        md var7 = null;
        int var8 = 0;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                if ((this.field_d ^ -1) == -13) {
                  stackIn_8_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  this.field_d = this.field_d + 1;
                  this.field_X.field_r.field_i = this.field_X.field_r.field_i + 0.4;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (1 == param1) {
                if (12 == this.field_J) {
                  stackIn_17_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  this.field_J = this.field_J + 1;
                  if (1 >= this.field_X.field_r.field_d) {
                    stackIn_22_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    this.field_X.field_r.field_d = this.field_X.field_r.field_d - 1;
                    this.field_X.field_r.field_f = this.field_X.field_r.field_f + 1;
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 == 2) {
                if (12 != this.field_x) {
                  this.field_x = this.field_x + 1;
                  this.field_X.field_r.field_g = this.field_X.field_r.field_g + 0.1;
                  break L3;
                } else {
                  stackIn_29_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                break L3;
              }
            }
            L4: {
              if (param1 != 3) {
                break L4;
              } else {
                if ((this.field_H ^ -1) != -13) {
                  this.field_X.field_r.field_e = this.field_X.field_r.field_e + 1;
                  this.field_H = this.field_H + 1;
                  if ((this.field_X.field_k ^ -1) >= -1) {
                    break L4;
                  } else {
                    this.field_X.field_k = this.field_X.field_k + 1;
                    break L4;
                  }
                } else {
                  stackIn_36_0 = 0;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              }
            }
            L5: {
              if (param1 != 4) {
                break L5;
              } else {
                if (5 >= this.field_F) {
                  this.field_F = this.field_F + 1;
                  break L5;
                } else {
                  stackIn_45_0 = 0;
                  decompiledRegionSelector0 = 5;
                  break L0;
                }
              }
            }
            L6: {
              var3_int = -31 / ((50 - param0) / 59);
              if (5 == param1) {
                var4 = 0;
                var5 = this.field_A;
                var6 = 0;
                L7: while (true) {
                  if (var5.length <= var6) {
                    if (6 > var4) {
                      L8: {
                        if (-6 != (var4 ^ -1)) {
                          break L8;
                        } else {
                          fm.a(252, (byte) 111, 3);
                          break L8;
                        }
                      }
                      this.a(-19054);
                      break L6;
                    } else {
                      stackIn_67_0 = 0;
                      decompiledRegionSelector0 = 6;
                      break L0;
                    }
                  } else {
                    L9: {
                      var7 = var5[var6];
                      if (null == var7) {
                        break L9;
                      } else {
                        if (this.field_X == var7) {
                          break L9;
                        } else {
                          if (var7.field_r == gh.field_j) {
                            var4++;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    var6++;
                    continue L7;
                  }
                }
              } else {
                break L6;
              }
            }
            L10: {
              if (param1 == 6) {
                if (-100 != (this.field_V ^ -1)) {
                  this.field_V = this.field_V + 1;
                  break L10;
                } else {
                  stackIn_77_0 = 0;
                  decompiledRegionSelector0 = 7;
                  break L0;
                }
              } else {
                break L10;
              }
            }
            L11: {
              if ((param1 ^ -1) <= -5) {
                break L11;
              } else {
                if ((this.field_H ^ -1) != -13) {
                  break L11;
                } else {
                  if (12 != this.field_x) {
                    break L11;
                  } else {
                    if ((this.field_J ^ -1) != -13) {
                      break L11;
                    } else {
                      if (-13 != (this.field_d ^ -1)) {
                        break L11;
                      } else {
                        fm.a(251, (byte) 111, 4);
                        break L11;
                      }
                    }
                  }
                }
              }
            }
            L12: {
              this.a(50, (byte) -86, 65280, ae.field_h[param1]);
              if (this.field_Cb) {
                break L12;
              } else {
                var4 = 0;
                L13: while (true) {
                  if (var4 >= 80) {
                    break L12;
                  } else {
                    this.a(2560, 5888, np.a(25, 80, (byte) -65) >> -1087273791, 80, 23 + param1 * 38 << -84501688, 800, (byte) -108);
                    var4++;
                    continue L13;
                  }
                }
              }
            }
            bm.a((byte) -70, uh.field_g[param1]);
            stackIn_101_0 = 1;
            decompiledRegionSelector0 = 8;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3), "pk.DA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_22_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_29_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_36_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_45_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_67_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_77_0 != 0;
                      } else {
                        return stackIn_101_0 != 0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final void b(byte param0) {
        Object stackIn_65_0 = null;
        Object stackIn_67_0 = null;
        boolean stackIn_67_1 = false;
        Object stackIn_68_0 = null;
        boolean stackIn_68_1 = false;
        int stackIn_68_2 = 0;
        md stackIn_71_0 = null;
        md stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        md stackIn_76_0 = null;
        md stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == -13) {
              L1: {
                this.field_M = this.field_M + 1;
                if (this.field_yb) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if (!lp.field_a[96]) {
                        break L3;
                      } else {
                        if (lp.field_a[97]) {
                          break L3;
                        } else {
                          L4: {
                            this.field_X.a(this.field_X.field_r.field_g, (byte) 25);
                            this.field_X.field_i = this.field_X.field_i + 2;
                            if (16 >= this.field_X.field_i) {
                              break L4;
                            } else {
                              this.field_X.field_i = 16;
                              break L4;
                            }
                          }
                          L5: {
                            if (!this.field_U) {
                              L6: {
                                if (50 > -this.field_T + this.field_M) {
                                  this.field_mb = -1;
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                              this.field_T = this.field_M;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          this.field_U = true;
                          break L2;
                        }
                      }
                    }
                    L7: {
                      if ((this.field_mb ^ -1) == 0) {
                        this.field_mb = 0;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    this.field_U = false;
                    break L2;
                  }
                  L8: {
                    L9: {
                      if (!lp.field_a[97]) {
                        break L9;
                      } else {
                        if (lp.field_a[96]) {
                          break L9;
                        } else {
                          L10: {
                            this.field_X.a(-this.field_X.field_r.field_g, (byte) 25);
                            this.field_X.field_i = this.field_X.field_i - 2;
                            if ((this.field_X.field_i ^ -1) <= 15) {
                              break L10;
                            } else {
                              this.field_X.field_i = -16;
                              break L10;
                            }
                          }
                          L11: {
                            if (this.field_rb) {
                              break L11;
                            } else {
                              L12: {
                                if (this.field_M + -this.field_ib < 50) {
                                  this.field_mb = 1;
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              this.field_ib = this.field_M;
                              break L11;
                            }
                          }
                          this.field_rb = true;
                          break L8;
                        }
                      }
                    }
                    L13: {
                      if (-2 != (this.field_mb ^ -1)) {
                        break L13;
                      } else {
                        this.field_mb = 0;
                        break L13;
                      }
                    }
                    this.field_rb = false;
                    break L8;
                  }
                  L14: {
                    L15: {
                      if (lp.field_a[83]) {
                        break L15;
                      } else {
                        if (lp.field_a[82]) {
                          break L15;
                        } else {
                          this.field_B = false;
                          break L14;
                        }
                      }
                    }
                    L16: {
                      stackIn_67_0 = this;

                      stackIn_67_1 = this.field_B;

                      if ((this.field_X.field_j ^ -1) >= -101) {
                        stackIn_68_0 = this;
                        stackIn_68_1 = stackIn_67_1;
                        stackIn_68_2 = 0;
                        break L16;
                      } else {
                        stackIn_65_0 = this;

                        stackIn_68_0 = this;
                        stackIn_68_1 = stackIn_67_1;
                        stackIn_68_2 = 1;
                        break L16;
                      }
                    }
                    L17: {
                      ((pk) (this)).field_B = stackIn_68_1 | stackIn_68_2 != 0;
                      stackIn_71_0 = this.field_X;

                      if (this.field_B) {
                        stackIn_72_0 = (md) ((Object) stackIn_71_0);
                        stackIn_72_1 = 0;
                        break L17;
                      } else {
                        stackIn_72_0 = (md) ((Object) stackIn_71_0);
                        stackIn_72_1 = 1;
                        break L17;
                      }
                    }
                    stackIn_72_0.field_l = stackIn_72_1 != 0;
                    break L14;
                  }
                  L18: {
                    stackIn_76_0 = this.field_X;

                    if (this.field_mb == 0) {
                      stackIn_77_0 = (md) ((Object) stackIn_76_0);
                      stackIn_77_1 = 0;
                      break L18;
                    } else {
                      stackIn_77_0 = (md) ((Object) stackIn_76_0);
                      stackIn_77_1 = 1;
                      break L18;
                    }
                  }
                  stackIn_77_0.field_p = stackIn_77_1 != 0;
                  break L1;
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
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2), "pk.FA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void h(int param0) {
        int incrementValue$0 = 0;
        Object stackIn_22_0 = null;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        int stackIn_95_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackIn_133_0 = 0;
        int stackIn_158_0 = 0;
        int stackIn_158_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        double var13 = 0.0;
        double var15 = 0.0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        md[] var21_ref_md__ = null;
        vc var22 = null;
        o var22_ref = null;
        qf var22_ref2 = null;
        eu var22_ref3 = null;
        wm var22_ref4 = null;
        int var22_int = 0;
        int var23 = 0;
        md var23_ref_md = null;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        var28 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            field_wb.a((byte) 121);
            var2_int = 1;
            L1: while (true) {
              if (-1720.0 <= this.field_t + this.field_hb) {
                L2: while (true) {
                  if (-1280.0 <= this.field_u + this.field_Y) {
                    L3: while (true) {
                      if (this.field_hb + this.field_t <= 0.0) {
                        L4: {
                          if (param0 == -132670633) {
                            break L4;
                          } else {
                            this.field_J = -125;
                            break L4;
                          }
                        }
                        L5: while (true) {
                          if (this.field_Y + this.field_u <= 0.0) {
                            L6: {
                              var3 = this.field_kb / 1000.0;
                              var5 = 3.141592653589793 * this.field_X.field_e / 128.0;
                              var7 = Math.sin(var5) * 192.0 * this.field_kb / 1000.0;
                              var9 = 192.0 * Math.cos(var5) * this.field_kb / 1000.0;
                              this.field_u = this.field_u + (-this.field_u + var9) * 0.05;
                              this.field_hb = this.field_hb + 0.05 * (-this.field_hb + var7);
                              var11 = (int)(this.field_t - this.field_hb * 2.0 / 3.0);
                              var12 = (int)(this.field_Y - this.field_u * 2.0 / 3.0);
                              var13 = (double)(sh.field_u / 2);
                              var15 = (double)(gp.field_w / 2);
                              var17 = this.field_sb;
                              if ((this.field_zb ^ -1) >= -11) {
                                if ((this.field_zb ^ -1) < -6) {
                                  var17 = this.b((10 - this.field_zb) * 51, -1, param0 + -437819992, this.field_sb);
                                  break L6;
                                } else {
                                  var17 = this.b(this.field_zb * 51, -1, param0 + -437819992, this.field_sb);
                                  break L6;
                                }
                              } else {
                                break L6;
                              }
                            }
                            var18 = this.field_O;
                            var19 = (int)(this.field_hb + var13);
                            var20 = (int)(this.field_u + var15);
                            var21 = -1280 + var12;
                            L7: while (true) {
                              if (var21 > gp.field_w) {
                                var21 = 0;
                                L8: while (true) {
                                  L9: {
                                    if (var21 >= this.field_l) {
                                      stackIn_61_0 = -1;
                                      stackIn_61_1 = this.field_w;
                                      break L9;
                                    } else {
                                      var22 = this.field_z[var21];
                                      var23 = var19 + var22.field_b - this.field_fb * 1720 - -var11;
                                      var24 = var20 + (var22.field_d - 1280 * this.field_O) - -var12;
                                      var25 = var22.field_e;
                                      stackIn_61_0 = var23;

                                      stackIn_61_1 = -500 + -var25;

                                      L10: {
                                        L11: {
                                          if (stackIn_61_0 < stackIn_61_1) {
                                            break L11;
                                          } else {
                                            if (-var25 + -500 > var24) {
                                              break L11;
                                            } else {
                                              if ((500 + var25 + sh.field_u ^ -1) > (var23 ^ -1)) {
                                                break L11;
                                              } else {
                                                if (var24 > var25 + gp.field_w - -500) {
                                                  break L11;
                                                } else {
                                                  co.field_i[var22.field_c].b(-(var25 >> -1704831615) + var23, var24 + -(var25 >> 1668667105), var25, var25);
                                                  break L10;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        incrementValue$0 = var21;
                                        var21--;
                                        this.f(incrementValue$0, 10355);
                                        break L10;
                                      }
                                      var21++;
                                      continue L8;
                                    }
                                  }
                                  var21 = stackIn_61_0 + stackIn_61_1;
                                  L12: while (true) {
                                    L13: {
                                      if (-1 < (var21 ^ -1)) {
                                        if (var2_int != 0) {
                                          var21 = 0;
                                          L14: while (true) {
                                            stackIn_82_0 = var21 ^ -1;
                                            stackIn_82_1 = this.field_E.length ^ -1;
                                            if (stackIn_82_0 <= stackIn_82_1) {
                                              break L13;
                                            } else {
                                              var22_ref = this.field_E[var21];
                                              var23 = (int)((var22_ref.field_d.field_a + this.field_hb) * var3 * 0.9 + var13);
                                              var24 = (int)((var22_ref.field_d.field_b + this.field_u) * var3 * 0.9 + var15);
                                              var25 = (int)((double)sd.field_k[var21 % sd.field_k.length].a() * var3 * 0.9);
                                              var26 = (int)(0.9 * ((double)sd.field_k[var21 % sd.field_k.length].b() * var3));
                                              sd.field_k[var21 % sd.field_k.length].a(-(var25 >> 292100513) + var23, -(var26 >> 379515905) + var24, var25, var26, 0, var17, 1);
                                              var21 += 2;
                                              continue L14;
                                            }
                                          }
                                        } else {
                                          break L13;
                                        }
                                      } else {
                                        var22_ref2 = this.field_n[var21];
                                        stackIn_82_0 = var22_ref2.field_j;

                                        stackIn_82_1 = 30;

                                        L16: {
                                          if (stackIn_82_0 <= stackIn_82_1) {
                                            var23 = (int)(var13 + (var22_ref2.field_d.field_a + this.field_hb) * this.a((byte) -125, var22_ref2.field_j, var3));
                                            var24 = (int)(var15 + (var22_ref2.field_d.field_b + this.field_u) * this.a((byte) -123, var22_ref2.field_j, var3));
                                            if (-513 >= (var22_ref2.field_g ^ -1)) {
                                              break L16;
                                            } else {
                                              if (-1 >= (var22_ref2.field_l ^ -1)) {
                                                var25 = var22_ref2.field_h;
                                                var26 = (int)(var3 * (double)(50 * var22_ref2.field_i) / (double)var22_ref2.field_g + 10.0);
                                                var27 = -(var22_ref2.field_i * 256 / var22_ref2.field_g) + 256;
                                                es.field_b[var25].a(-(var26 >> 1810933825) + var23, -(var26 >> 1517906145) + var24, var26, var26, 0, var27 << -132670633 & -14870727 | var22_ref2.field_l & 16777215, 1);
                                                break L16;
                                              } else {
                                                var25 = (int)(var3 * (double)(2 * -var22_ref2.field_l));
                                                var26 = var22_ref2.field_i * bl.field_b.length / var22_ref2.field_g;
                                                bl.field_b[var26].b(-(var25 >> -1112884575) + var23, -(var25 >> -5936255) + var24, var25, var25);
                                                break L16;
                                              }
                                            }
                                          } else {
                                            break L16;
                                          }
                                        }
                                        var21--;
                                        continue L12;
                                      }
                                    }
                                    var21 = 0;
                                    L17: while (true) {
                                      L18: {
                                        if ((this.field_Bb ^ -1) >= (var21 ^ -1)) {
                                          var21 = 0;
                                          L19: while (true) {
                                            stackIn_108_0 = var21 ^ -1;
                                            stackIn_108_1 = this.field_ab ^ -1;
                                            if (stackIn_108_0 <= stackIn_108_1) {
                                              break L18;
                                            } else {
                                              var22_ref3 = this.field_S[var21];
                                              var23 = (int)(var13 + (var22_ref3.field_d.field_a + this.field_hb) * var3);
                                              var24 = (int)(var3 * (var22_ref3.field_d.field_b + this.field_u) + var15);
                                              dc.field_g.a((float)var23, (float)var24, (int)((double)(var22_ref3.field_h * 42) * var3), (int)(256.0 * var22_ref3.field_e));
                                              var21++;
                                              continue L19;
                                            }
                                          }
                                        } else {
                                          var22_ref4 = this.field_i[var21];
                                          stackIn_108_0 = -1;

                                          stackIn_108_1 = var22_ref4.field_g ^ -1;

                                          L21: {
                                            if (stackIn_108_0 < stackIn_108_1) {
                                              stackIn_95_0 = (var22_ref4.field_g >> -1520671295) + 92;
                                              break L21;
                                            } else {
                                              stackIn_95_0 = 92;
                                              break L21;
                                            }
                                          }
                                          L22: {
                                            var23 = stackIn_95_0;
                                            var24 = (int)((this.field_hb + var22_ref4.field_d.field_a) * this.a((byte) -124, var23, var3) + var13);
                                            var25 = (int)((this.field_u + var22_ref4.field_d.field_b) * this.a((byte) -122, var23, var3) + var15);
                                            var26 = (int)(var3 * (double)(42 * var23));
                                            if ((400 - var22_ref4.field_g ^ -1) > -16) {
                                              var26 = var26 * (-var22_ref4.field_g + 400) / 15;
                                              break L22;
                                            } else {
                                              break L22;
                                            }
                                          }
                                          L23: {
                                            if (0 <= var22_ref4.field_g) {
                                              wm.field_i[var22_ref4.field_k].a((float)var24, (float)var25, var26, 20 * var22_ref4.field_g);
                                              break L23;
                                            } else {
                                              wm.field_i[var22_ref4.field_k].a((float)var24, (float)var25, var26, var22_ref4.field_g * 20, 0, -16777216 | 190 * var23 / 92 * 65793, 1);
                                              break L23;
                                            }
                                          }
                                          var21++;
                                          continue L17;
                                        }
                                      }
                                      var21_ref_md__ = this.field_A;
                                      var22_int = 0;
                                      L24: while (true) {
                                        if ((var22_int ^ -1) <= (var21_ref_md__.length ^ -1)) {
                                          var21 = -1 + this.field_w;
                                          L25: while (true) {
                                            L26: {
                                              if (var21 < 0) {
                                                if (var2_int != 0) {
                                                  var21 = 1;
                                                  L27: while (true) {
                                                    stackIn_158_0 = this.field_E.length ^ -1;
                                                    stackIn_158_1 = var21 ^ -1;
                                                    if (stackIn_158_0 >= stackIn_158_1) {
                                                      break L26;
                                                    } else {
                                                      var22_ref = this.field_E[var21];
                                                      var23 = (int)(var3 * (this.field_hb + var22_ref.field_d.field_a) + var13);
                                                      var24 = (int)(var15 + (this.field_u + var22_ref.field_d.field_b) * var3);
                                                      var25 = (int)(var3 * (double)sd.field_k[var21 % sd.field_k.length].a());
                                                      var26 = (int)((double)sd.field_k[var21 % sd.field_k.length].b() * var3);
                                                      sd.field_k[var21 % sd.field_k.length].a(-(var25 >> -33277535) + var23, var24 + -(var26 >> -1999964831), var25, var26, 0, var17, 1);
                                                      var21 += 2;
                                                      continue L27;
                                                    }
                                                  }
                                                } else {
                                                  break L26;
                                                }
                                              } else {
                                                var22_ref2 = this.field_n[var21];
                                                stackIn_158_0 = var22_ref2.field_j ^ -1;

                                                stackIn_158_1 = -31;

                                                L29: {
                                                  if (stackIn_158_0 < stackIn_158_1) {
                                                    var23 = (int)(var13 + (this.field_hb + var22_ref2.field_d.field_a) * this.a((byte) -124, var22_ref2.field_j, var3));
                                                    var24 = (int)(var15 + (var22_ref2.field_d.field_b + this.field_u) * this.a((byte) -119, var22_ref2.field_j, var3));
                                                    if (512 > var22_ref2.field_g) {
                                                      if (-1 < (var22_ref2.field_l ^ -1)) {
                                                        var25 = (int)(var3 * (double)(2 * -var22_ref2.field_l));
                                                        var26 = bl.field_b.length * var22_ref2.field_i / var22_ref2.field_g;
                                                        bl.field_b[var26].b(-(var25 >> 788123233) + var23, var24 - (var25 >> -1709114399), var25, var25);
                                                        break L29;
                                                      } else {
                                                        var25 = var22_ref2.field_h;
                                                        var26 = (int)(10.0 + var3 * (double)(var22_ref2.field_i * 50) / (double)var22_ref2.field_g);
                                                        var27 = 256 + -(var22_ref2.field_i * 256 / var22_ref2.field_g);
                                                        es.field_b[var25].a(-(var26 >> 798574849) + var23, -(var26 >> -1378930751) + var24, var26, var26, 0, 16777215 & var22_ref2.field_l | -9633548 & var27 << -934854409, 1);
                                                        break L29;
                                                      }
                                                    } else {
                                                      break L29;
                                                    }
                                                  } else {
                                                    break L29;
                                                  }
                                                }
                                                var21--;
                                                continue L25;
                                              }
                                            }
                                            break L0;
                                          }
                                        } else {
                                          L30: {
                                            var23_ref_md = var21_ref_md__[var22_int];
                                            if (var23_ref_md != null) {
                                              if ((var23_ref_md.field_t ^ -1) >= -3) {
                                                break L30;
                                              } else {
                                                L31: {
                                                  var24 = (int)((var23_ref_md.field_d.field_a + this.field_hb) * this.a((byte) -126, var23_ref_md.field_t, var3) + var13);
                                                  var25 = (int)((var23_ref_md.field_d.field_b + this.field_u) * this.a((byte) -126, var23_ref_md.field_t, var3) + var15);
                                                  var26 = 4 * var23_ref_md.field_i / 16 + 4;
                                                  if (var23_ref_md != this.field_X) {
                                                    break L31;
                                                  } else {
                                                    if ((this.field_jb ^ -1) >= -1) {
                                                      break L31;
                                                    } else {
                                                      var27 = -16777216;
                                                      var27 = var27 | 65793 * (int)(-Math.cos((double)this.field_jb * 3.141592653589793 / 5.0) * (double)this.field_jb + (double)this.field_jb);
                                                      var23_ref_md.field_r.b(-32275)[var26].a((float)var24, (float)var25, (int)(var3 * (double)(32 * var23_ref_md.field_t)), (int)(256.0 * var23_ref_md.field_e), 3, var27, 1);
                                                      break L30;
                                                    }
                                                  }
                                                }
                                                if (ro.field_u != var23_ref_md.field_r) {
                                                  var23_ref_md.field_r.b(-32275)[var26].a((float)var24, (float)var25, (int)(var3 * (double)(32 * var23_ref_md.field_t)), (int)(256.0 * var23_ref_md.field_e));
                                                  break L30;
                                                } else {
                                                  L32: {
                                                    var23_ref_md.field_r.b(-32275)[0].a((float)var24, (float)var25, (int)((double)(var23_ref_md.field_t * 32) * var3), 0);
                                                    var23_ref_md.field_r.b(-32275)[1].a((float)var24, (float)var25, (int)((double)(32 * var23_ref_md.field_t) * var3), var23_ref_md.field_i << -347264630);
                                                    var27 = (var23_ref_md.field_i & 536870975) << 2065506595;
                                                    if (var27 <= 255) {
                                                      stackIn_133_0 = var27;
                                                      break L32;
                                                    } else {
                                                      stackIn_133_0 = 511 - var27;
                                                      break L32;
                                                    }
                                                  }
                                                  var27 = stackIn_133_0;
                                                  var23_ref_md.field_r.b(-32275)[2].a((float)var24, (float)var25, (int)((double)(var23_ref_md.field_t * 32) * var3), var23_ref_md.field_i << -1902034966, 0, var27 * -16711423, 2);
                                                  var23_ref_md.field_r.b(param0 ^ 132651706)[2].a((float)var24, (float)var25, (int)((double)(32 * var23_ref_md.field_t) * var3), var23_ref_md.field_i << -1118041558, 0, var27 * -16711423, 2);
                                                  break L30;
                                                }
                                              }
                                            } else {
                                              break L30;
                                            }
                                          }
                                          var22_int++;
                                          continue L24;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var22_int = this.field_fb;
                                var23 = var11 - 1720;
                                L33: while (true) {
                                  if ((var23 ^ -1) < (sh.field_u ^ -1)) {
                                    var18++;
                                    var21 += 1280;
                                    continue L7;
                                  } else {
                                    is.field_a[qg.a((byte) 110, is.field_a.length, var22_int * 23 + 7 * var18)].a((int)(var13 + this.field_hb) + var23, var21 - -(int)(var15 + this.field_u), 1, 0, 0);
                                    var22_int++;
                                    var23 += 1720;
                                    continue L33;
                                  }
                                }
                              }
                            }
                          } else {
                            this.field_Y = this.field_Y - 1280.0;
                            stackIn_22_0 = this;
                            ((pk) (this)).field_O = ((pk) (this)).field_O - 1;
                            continue L5;
                          }
                        }
                      } else {
                        this.field_fb = this.field_fb - 1;
                        this.field_t = this.field_t - 1720.0;
                        continue L3;
                      }
                    }
                  } else {
                    this.field_Y = this.field_Y + 1280.0;
                    this.field_O = this.field_O + 1;
                    continue L2;
                  }
                }
              } else {
                this.field_fb = this.field_fb + 1;
                this.field_t = this.field_t + 1720.0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2), "pk.N(" + param0 + ')');
        }
    }

    final void e(int param0) {
        try {
            int var2_int = -5 % ((param0 - -73) / 34);
            this.field_g = false;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "pk.Q(" + param0 + ')');
        }
    }

    final static boolean d(int param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 <= -56) {
              L1: {
                if (nb.field_c != jq.field_fb) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "pk.RA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    private final gb b(byte param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        gb stackIn_32_0 = null;
        gb stackIn_34_0 = null;
        gb stackIn_36_0 = null;
        gb stackIn_38_0 = null;
        gb stackIn_40_0 = null;
        gb stackIn_42_0 = null;
        gb stackIn_44_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 99) {
                break L1;
              } else {
                this.field_t = -1.7731094820794981;
                break L1;
              }
            }
            var3_int = param1;
            if ((var3_int ^ -1) != -1) {
              if (-2 == (var3_int ^ -1)) {
                stackIn_34_0 = sl.field_p;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var3_int == 3) {
                  stackIn_36_0 = gm.field_y;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (var3_int != 2) {
                    if (-5 != (var3_int ^ -1)) {
                      if (-6 == (var3_int ^ -1)) {
                        stackIn_42_0 = ro.field_u;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        stackIn_44_0 = kk.field_N;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      }
                    } else {
                      stackIn_40_0 = ju.field_k;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_38_0 = qq.field_g;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_32_0 = kk.field_N;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3), "pk.AB(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_32_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_34_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_36_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_38_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_40_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_42_0;
                  } else {
                    return stackIn_44_0;
                  }
                }
              }
            }
          }
        }
    }

    final void a(int param0, boolean param1, ha param2) {
        RuntimeException runtimeException = null;
        tb var4 = null;
        int var5 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              this.h(-132670633);
              this.a(param2, -20240);
              if (this.field_yb) {
                break L1;
              } else {
                var4 = (tb) ((Object) wd.field_t.d(param0 ^ -251723521));
                L2: while (true) {
                  if (var4 == null) {
                    break L1;
                  } else {
                    L3: {
                      if (var4 == null) {
                        break L3;
                      } else {
                        var4.d(param0 ^ 16711886);
                        break L3;
                      }
                    }
                    var4 = (tb) ((Object) wd.field_t.b((byte) 103));
                    continue L2;
                  }
                }
              }
            }
            L4: {
              if (param0 == -16711936) {
                break L4;
              } else {
                this.c(8, 125);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (runtimeException);

            stackIn_17_1 = new StringBuilder().append("pk.CB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    private final void b(int param0, int param1) {
        boolean stackIn_11_0 = false;
        int stackIn_17_0 = 0;
        int stackIn_33_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_10_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_vb == null) {
                break L1;
              } else {
                if (this.field_ob) {
                  break L1;
                } else {
                  var3_int = 0;
                  L2: while (true) {
                    L3: {
                      if (16 <= var3_int) {
                        stackIn_33_0 = param0;
                        break L3;
                      } else {
                        stackOut_10_0 = sd.field_d[this.field_h][var3_int];
                        stackIn_33_0 = stackOut_10_0 ? 1 : 0;
                        stackIn_11_0 = stackOut_10_0;
                        L4: {
                          if (!stackIn_11_0) {
                            stackIn_17_0 = 0;
                            break L4;
                          } else {
                            stackIn_17_0 = 255;
                            break L4;
                          }
                        }
                        L5: {
                          var4 = stackIn_17_0;
                          if (var4 > this.field_Z[var3_int]) {
                            this.field_Z[var3_int] = this.field_Z[var3_int] + param1;
                            if ((this.field_Z[var3_int] ^ -1) < (var4 ^ -1)) {
                              this.field_Z[var3_int] = var4;
                              break L5;
                            } else {
                              break L5;
                            }
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          if (var4 < this.field_Z[var3_int]) {
                            this.field_Z[var3_int] = this.field_Z[var3_int] - param1;
                            if (var4 > this.field_Z[var3_int]) {
                              this.field_Z[var3_int] = var4;
                              break L6;
                            } else {
                              break L6;
                            }
                          } else {
                            break L6;
                          }
                        }
                        this.field_vb.a((byte) -126, this.field_Z[var3_int], var3_int);
                        var3_int++;
                        continue L2;
                      }
                    }
                    L7: {
                      if (stackIn_33_0 == 24260) {
                        break L7;
                      } else {
                        this.field_V = 9;
                        break L7;
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3), "pk.E(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, byte param1, String param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            wd.field_t.a(120, new tb(param2, param0));
            var4_int = 105 % ((param1 - 70) / 46);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("pk.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    private final void c(byte param0) {
        RuntimeException runtimeException = null;
        md var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              wd.field_t.c(268435455);
              gh.field_j.field_d = ub.field_h.field_d;
              this.field_g = false;
              gh.field_j.field_e = ub.field_h.field_e;
              gh.field_j.field_f = ub.field_h.field_f;
              gh.field_j.field_i = ub.field_h.field_i;
              gh.field_j.field_g = ub.field_h.field_g;
              this.field_Eb = false;
              var2 = this.field_X;
              this.a(true);
              this.field_X = new md(new kc(), gh.field_j);
              this.field_A = new md[16];
              this.field_A[0] = this.field_X;
              this.field_X.field_h = po.a(this.a(this.field_X.field_d, 200, this.field_X.field_d), 0, this.field_X.field_r.a((byte) 93));
              this.field_n = new qf[1000];
              this.field_F = 3;
              this.field_S = new eu[1000];
              this.field_xb = 20;
              this.field_jb = 120;
              this.field_ab = 0;
              if (null != var2) {
                this.field_X.field_e = var2.field_e;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 > 34) {
                break L2;
              } else {
                this.field_vb = (hk) null;
                break L2;
              }
            }
            this.field_i = new wm[16];
            this.field_Bb = 0;
            this.field_p = 0;
            this.field_yb = true;
            this.field_w = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "pk.HA(" + param0 + ')');
        }
    }

    private final double a(byte param0, int param1, double param2) {
        double var5_double = 0.0;
        RuntimeException var5 = null;
        double stackIn_2_0 = 0.0;
        double stackIn_5_0 = 0.0;
        double stackIn_7_0 = 0.0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != 92) {
              if (param0 < -118) {
                var5_double = 3.0 - (-(1.0 / param2) + 3.0) * (double)param1 / 92.0;
                stackIn_7_0 = 1.0 / var5_double;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = -0.6152644756512422;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = param2;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var5), "pk.FB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    private final void f(int param0) {
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        gb stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        try {
          L0: {
            L1: {
              this.field_db = 255;
              this.field_o = this.field_sb;
              this.field_k = mr.field_b[this.field_s];
              this.field_L = gi.field_e[this.field_s];
              if ((this.field_zb ^ -1) != 0) {
                break L1;
              } else {
                this.field_zb = this.field_L;
                break L1;
              }
            }
            L2: {
              this.a(16744448, (byte) -44, oe.field_f[this.field_s]);
              var2 = ip.field_a[this.field_s];
              if (param0 == -20416) {
                break L2;
              } else {
                this.field_jb = -42;
                break L2;
              }
            }
            L3: {
              var3 = var2[6];
              if (-1 > (var2[5] ^ -1)) {
                var3 = this.a((byte) -128, ro.field_u, var2[5], var3);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (-1 > (var2[4] ^ -1)) {
                var3 = this.a((byte) -118, ju.field_k, var2[4], var3);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (var2[3] > 0) {
                L6: {
                  stackIn_20_0 = this;

                  stackIn_20_1 = -127;

                  if ((this.field_s ^ -1) >= -11) {
                    stackIn_21_0 = this;
                    stackIn_21_1 = stackIn_20_1;
                    stackIn_21_2 = id.field_f;
                    break L6;
                  } else {
                    stackIn_21_0 = this;
                    stackIn_21_1 = stackIn_20_1;
                    stackIn_21_2 = qq.field_g;
                    break L6;
                  }
                }
                var3 = this.a((byte) stackIn_21_1, stackIn_21_2, var2[3], var3);
                break L5;
              } else {
                break L5;
              }
            }
            L7: {
              if (var2[2] <= 0) {
                break L7;
              } else {
                var3 = this.a((byte) -128, gm.field_y, var2[2], var3);
                break L7;
              }
            }
            L8: {
              if (0 < var2[1]) {
                var3 = this.a((byte) -125, sl.field_p, var2[1], var3);
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (var2[0] > 0) {
                var3 = this.a((byte) 127, kk.field_N, var2[0], var3);
                break L9;
              } else {
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2_ref), "pk.OA(" + param0 + ')');
        }
    }

    private final int a(byte param0, gb param1, int param2, int param3) {
        int incrementValue$1 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        md var8 = null;
        int var9 = 0;
        md stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        md stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              L2: {
                if (var5_int >= param2) {
                  var5_int = 18 / ((param0 - -74) / 36);
                  stackIn_16_0 = param3;
                  break L2;
                } else {
                  var6 = 3200 + (int)this.field_X.field_d.field_a - -np.a(-1600, 1600, (byte) -42);
                  var7 = (int)this.field_X.field_d.field_b + (2400 + np.a(-1200, 1200, (byte) -46));
                  var8 = new md(new kc((double)var6, (double)var7), param1);
                  incrementValue$1 = param3;
                  param3--;
                  stackIn_16_0 = incrementValue$1;

                  L3: {
                    if (stackIn_16_0 <= 0) {
                      break L3;
                    } else {
                      L4: {
                        stackIn_12_0 = (md) (var8);

                        stackIn_12_1 = 20;

                        if (!this.field_Cb) {
                          stackIn_13_0 = (md) ((Object) stackIn_12_0);
                          stackIn_13_1 = stackIn_12_1;
                          stackIn_13_2 = 4;
                          break L4;
                        } else {


                          stackIn_13_0 = (md) ((Object) stackIn_12_0);
                          stackIn_13_1 = stackIn_12_1;
                          stackIn_13_2 = 9;
                          break L4;
                        }
                      }
                      stackIn_13_0.field_v = qq.a(stackIn_13_1, stackIn_13_2);
                      break L3;
                    }
                  }
                  this.b((byte) 112, var8);
                  var5_int++;
                  continue L1;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("pk.PA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_16_0;
    }

    private final void c(int param0) {
        int fieldTemp$0 = 0;
        int incrementValue$1 = 0;
        boolean stackIn_27_0 = false;
        int stackIn_40_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_26_0;
        int var2_int = 0;
        tb var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ok var3_ref_ok = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = 0;
              if (param0 <= -79) {
                break L1;
              } else {
                this.field_vb = (hk) null;
                break L1;
              }
            }
            L2: while (true) {
              if ((var2_int ^ -1) <= (this.field_K ^ -1)) {
                L3: {
                  if (this.field_X.field_j > 100) {
                    if (this.field_R >= 200) {
                      break L3;
                    } else {
                      var2_int = (int)(-Math.cos((double)this.field_R * 3.141592653589793 / 200.0) * 128.0) + 128;
                      var3 = var2_int * 80 >> -924180888;
                      var4 = var3 + 623;
                      this.a(80, var4 << -1427224216, 2560, (byte) -115, np.a(20, 40, (byte) 99) * (this.field_X.field_j - 100) / 100, 117760, (-12800 + 128 * this.field_X.field_j) / 100);
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (-1 == (this.field_c % 40 ^ -1)) {
                    this.field_y = this.field_p;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var2 = (tb) ((Object) wd.field_t.d(268435455));
                L5: while (true) {
                  L6: {
                    L7: {
                      if (var2 == null) {
                        break L7;
                      } else {
                        stackOut_26_0 = var2.a(-122);
                        stackIn_40_0 = stackOut_26_0 ? 1 : 0;
                        stackIn_27_0 = stackOut_26_0;
                        L8: {
                          if (stackIn_27_0) {
                            var2.c(-127);
                            break L8;
                          } else {
                            if (!var2.c((byte) 47)) {
                              break L8;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var2 = (tb) ((Object) wd.field_t.b((byte) 103));
                        continue L5;
                      }
                    }
                    stackIn_40_0 = this.field_cb ^ -1;
                    break L6;
                  }
                  L9: {
                    if (stackIn_40_0 != -1) {
                      this.field_cb = this.field_cb - 1;
                      if (-1 != (this.field_cb ^ -1)) {
                        break L9;
                      } else {
                        this.field_N = this.field_nb;
                        break L9;
                      }
                    } else {
                      if ((this.field_N ^ -1) == (or.field_a ^ -1)) {
                        break L9;
                      } else {
                        this.field_cb = 20;
                        this.field_nb = or.field_a;
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (-1 != (this.field_Db ^ -1)) {
                      this.field_Db = this.field_Db - 1;
                      if (this.field_Db != 0) {
                        break L10;
                      } else {
                        this.field_v = this.field_f;
                        break L10;
                      }
                    } else {
                      if ((this.field_p ^ -1) == (this.field_v ^ -1)) {
                        break L10;
                      } else {
                        this.field_f = this.field_p;
                        this.field_Db = 20;
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if (-1 <= (this.field_G ^ -1)) {
                      break L11;
                    } else {
                      if ((this.field_V ^ -1) >= -2) {
                        break L11;
                      } else {
                        this.field_G = this.field_G - 5;
                        break L11;
                      }
                    }
                  }
                  L12: {
                    if (this.field_Q == 0) {
                      if (this.field_V != this.field_P) {
                        this.field_tb = this.field_V;
                        this.field_Q = 20;
                        break L12;
                      } else {
                        break L12;
                      }
                    } else {
                      this.field_Q = this.field_Q - 1;
                      if (-1 != (this.field_Q ^ -1)) {
                        break L12;
                      } else {
                        this.field_P = this.field_tb;
                        break L12;
                      }
                    }
                  }
                  L13: {
                    var3 = this.field_eb - this.field_X.field_k * 100 / gh.field_j.field_e;
                    this.field_qb = this.field_X.field_x + this.field_qb >> 1024322881;
                    if (var3 <= 0) {
                      if (-1 < (var3 ^ -1)) {
                        this.field_eb = this.field_eb - ((var3 >> -475903516) + -1);
                        break L13;
                      } else {
                        break L13;
                      }
                    } else {
                      this.field_eb = this.field_eb - (1 + (var3 >> 278834820));
                      break L13;
                    }
                  }
                  L14: {
                    if ((this.field_X.field_j ^ -1) > -101) {
                      this.field_a = this.field_a + this.field_X.field_j >> -396644735;
                      break L14;
                    } else {
                      this.field_a = this.field_X.field_j + this.field_a + -100 >> -1804447935;
                      break L14;
                    }
                  }
                  L15: {
                    if (this.field_X.field_m <= 0) {
                      break L15;
                    } else {
                      if (this.field_bb < 255) {
                        this.field_bb = this.field_bb + 8;
                        if (this.field_bb <= 255) {
                          break L15;
                        } else {
                          this.field_bb = 255;
                          break L15;
                        }
                      } else {
                        break L15;
                      }
                    }
                  }
                  L16: {
                    if (-1 != (this.field_X.field_m ^ -1)) {
                      break L16;
                    } else {
                      if ((this.field_bb ^ -1) >= -1) {
                        break L16;
                      } else {
                        this.field_bb = this.field_bb - 8;
                        if ((this.field_bb ^ -1) > -1) {
                          this.field_bb = 0;
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                    }
                  }
                  L17: {
                    if (this.field_yb) {
                      break L17;
                    } else {
                      if (this.field_Cb) {
                        break L17;
                      } else {
                        if (!this.field_g) {
                          if (1 == vj.field_d) {
                            var4 = -22 + ln.field_c;
                            var5 = -22 + lq.field_a;
                            var6 = 0;
                            L18: while (true) {
                              if ((var6 ^ -1) <= -8) {
                                break L17;
                              } else {
                                L19: {
                                  if (var4 * var4 - -(var5 * var5) < 289) {
                                    this.a(1, var6);
                                    break L19;
                                  } else {
                                    break L19;
                                  }
                                }
                                var5 -= 38;
                                var6++;
                                continue L18;
                              }
                            }
                          } else {
                            break L17;
                          }
                        } else {
                          break L17;
                        }
                      }
                    }
                  }
                  break L0;
                }
              } else {
                L20: {
                  L21: {
                    var3_ref_ok = this.field_C[var2_int];
                    if (var3_ref_ok == null) {
                      break L21;
                    } else {
                      fieldTemp$0 = var3_ref_ok.field_h + 1;
                      var3_ref_ok.field_h = var3_ref_ok.field_h + 1;
                      if ((var3_ref_ok.field_d ^ -1) > (fieldTemp$0 ^ -1)) {
                        break L21;
                      } else {
                        break L20;
                      }
                    }
                  }
                  incrementValue$1 = var2_int;
                  var2_int--;
                  this.d((byte) -94, incrementValue$1);
                  break L20;
                }
                var3_ref_ok.field_c = var3_ref_ok.field_k;
                var3_ref_ok.field_g = var3_ref_ok.field_n;
                var3_ref_ok.field_m = var3_ref_ok.field_m + var3_ref_ok.field_l;
                var3_ref_ok.field_n = var3_ref_ok.field_n + var3_ref_ok.field_i;
                var3_ref_ok.field_k = var3_ref_ok.field_k + var3_ref_ok.field_b;
                var3_ref_ok.field_i = var3_ref_ok.field_i + var3_ref_ok.field_f;
                var3_ref_ok.field_l = var3_ref_ok.field_l + var3_ref_ok.field_j;
                var3_ref_ok.field_b = var3_ref_ok.field_b + var3_ref_ok.field_a;
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2_ref), "pk.I(" + param0 + ')');
        }
    }

    pk() {
        kc var1 = null;
        int var2 = 0;
        int var3 = 0;
        o var4 = null;
        int var5 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        this.field_k = 0;
        this.field_bb = 0;
        this.field_yb = true;
        this.field_c = 0;
        this.field_a = 0;
        this.field_sb = 0;
        this.field_db = 0;
        this.field_Ab = 0;
        this.field_lb = -1;
        this.field_eb = 100;
        this.field_o = 0;
        this.field_zb = -1;
        this.field_m = true;
        this.field_L = -1;
        this.field_pb = 0;
        this.field_C = new ok[1000];
        this.field_qb = 0;
        this.field_r = new int[7];
        this.field_z = new vc[200];
        this.field_D = new kc(0.0, 0.0);
        this.field_T = -100;
        this.field_Z = new int[16];
        this.field_cb = 0;
        this.field_G = 200;
        this.field_H = 0;
        this.field_W = false;
        this.field_rb = false;
        this.field_B = false;
        this.field_M = 0;
        this.field_ob = false;
        this.field_kb = 600.0;
        this.field_d = 0;
        this.field_mb = 0;
        this.field_P = 1;
        this.field_nb = 0;
        this.field_Db = 0;
        this.field_tb = 1;
        this.field_Eb = false;
        this.field_N = 0;
        this.field_ib = -100;
        this.field_Q = 0;
        this.field_x = 0;
        this.field_U = false;
        this.field_J = 0;
        this.field_R = 200;
        this.field_V = 1;
        try {
          L0: {
            L1: {
              stackIn_3_0 = this;

              if (2 > ln.field_d) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            ((pk) (this)).field_j = stackIn_4_1 != 0;
            var1 = new kc();
            var2 = qq.a(20, 128);
            this.field_E = new o[30];
            var3 = 0;
            L2: while (true) {
              if (30 <= var3) {
                this.c((byte) 56);
                break L0;
              } else {
                var1.a((double)qq.a(20, 3200), (double)qq.a(20, 2400), true);
                var4 = new o(var1);
                var4.field_b = 0.5;
                var4.field_e = (double)(qq.a(20, 128) - -var2);
                this.field_E[var3] = var4;
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1_ref), "pk.<init>()");
        }
    }

    static {
    }
}
