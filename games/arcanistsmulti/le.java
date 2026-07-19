/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le {
    boolean field_g;
    boolean field_ab;
    private int field_n;
    private int field_c;
    int field_a;
    int field_J;
    private int field_P;
    private boolean field_o;
    int field_D;
    private int field_L;
    private int field_j;
    private int field_S;
    private boolean field_C;
    static String field_db;
    private vn field_cb;
    private int field_Y;
    private int field_e;
    private int field_u;
    private int field_x;
    boolean field_G;
    private int field_p;
    static int[] field_d;
    boolean field_X;
    boolean field_y;
    private int field_K;
    private int field_M;
    private int[] field_v;
    int field_I;
    boolean field_H;
    static kc field_E;
    static int field_q;
    private int[] field_l;
    private boolean field_U;
    ol field_m;
    int field_bb;
    private int field_R;
    private int field_Q;
    static String field_N;
    private ge field_f;
    boolean field_i;
    private boolean field_F;
    private boolean field_k;
    boolean field_O;
    nf field_V;
    int field_b;
    private boolean field_T;
    static String field_A;
    boolean field_t;
    int field_z;
    boolean field_B;
    private int field_W;
    private int field_r;
    private int field_Z;
    nf field_w;
    private int field_h;
    int field_s;

    final static int h(int param0) {
        boolean discarded$12 = false;
        boolean discarded$13 = false;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        var2 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            discarded$12 = p.field_b.a(mk.field_S, dn.field_Jb, true, (byte) -100);
            p.field_b.i(4);
            L1: while (true) {
              if (!ib.b(false)) {
                if (qg.field_c != -1) {
                  var1_int = qg.field_c;
                  ee.a(-1, (byte) 30);
                  stackOut_6_0 = var1_int;
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  if (param0 == -1993) {
                    if (!u.field_k) {
                      if (hb.field_Gb != sk.field_a) {
                        if (wn.field_z.a((byte) -88)) {
                          if (in.field_Gb == sk.field_a) {
                            stackOut_22_0 = 2;
                            stackIn_23_0 = stackOut_22_0;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            return -1;
                          }
                        } else {
                          stackOut_18_0 = 1;
                          stackIn_19_0 = stackOut_18_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      } else {
                        stackOut_15_0 = 1;
                        stackIn_16_0 = stackOut_15_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    } else {
                      stackOut_12_0 = 3;
                      stackIn_13_0 = stackOut_12_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackOut_9_0 = -98;
                    stackIn_10_0 = stackOut_9_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              } else {
                discarded$13 = p.field_b.a(ed.field_Bb, (byte) -89, vn.field_d);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "le.KB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_19_0;
                } else {
                  return stackIn_23_0;
                }
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        int var4 = -1 >= (this.field_V.b(param2) ^ -1) ? an.field_f / 2 : -an.field_f / 2;
        if (!(-var4 <= vn.field_c)) {
            this.field_n = 0;
            vn.field_c = -var4;
        }
        if (!(vn.field_c <= this.field_V.field_y + var4)) {
            vn.field_c = var4 + this.field_V.field_y;
            this.field_n = 0;
        }
        if (!(ol.field_g >= param1)) {
            this.field_S = 0;
            ol.field_g = param1;
        }
        if (!(param0 >= ol.field_g)) {
            this.field_S = 0;
            ol.field_g = param0;
        }
    }

    private final void a(int param0, int param1, wk param2, boolean param3) {
        hl var5 = new hl();
        var5.field_k = param1;
        byte[] var6 = new byte[param0];
        param2.a((byte) 123, 0, var6, param0);
        var5.field_j = new wk(var6);
        var5.field_g = jb.field_v;
        if (param3) {
            return;
        }
        try {
            this.field_cb.b(var5, -1);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "le.QB(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void e(int param0) {
        L0: {
          if (null != this.field_m.field_h) {
            if (!this.field_m.field_h.h(param0 + -17747)) {
              break L0;
            } else {
              vn.field_c = vn.field_c * 7 - -this.field_m.field_h.c(param0 + -17583) >> 1818964803;
              ol.field_g = 7 * ol.field_g + this.field_m.field_h.e(52) >> 280332963;
              break L0;
            }
          } else {
            if (this.field_m.field_d == null) {
              break L0;
            } else {
              L1: {
                if (this.field_m.field_d.f(true)) {
                  break L1;
                } else {
                  if (this.field_m.field_d.y(param0 + -37) == this.field_bb) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
              vn.field_c = vn.field_c * 7 - -this.field_m.field_d.f(64) >> 1872072771;
              ol.field_g = 7 * ol.field_g + this.field_m.field_d.i((byte) -53) >> -1861216061;
              break L0;
            }
          }
        }
        L2: {
          if (param0 == 17608) {
            break L2;
          } else {
            this.field_J = 85;
            break L2;
          }
        }
    }

    private final void b(int param0) {
        this.field_V.t(8);
        this.field_C = true;
        this.field_bb = this.field_V.d(false);
        ml var2 = this.field_V.a(this.field_V.d(false), true);
        if (param0 != 0) {
            return;
        }
        if (var2 == null) {
            this.field_m.a(0);
        } else {
            this.field_m.a(-110, var2);
        }
        this.field_s = -1000;
        this.field_t = false;
        if (!this.field_ab) {
            if ((mj.field_p ^ -1) == -8) {
                if ((this.field_V.field_q ^ -1) < -2) {
                    this.field_I = this.field_V.d(false);
                }
            }
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        var5 = n.field_g.field_nb;
        var6 = var5 / 2 + this.field_V.field_H - param0;
        var7 = 0;
        L0: while (true) {
          if (var7 >= an.field_f) {
            if (param2 == 12224) {
              var7 = 0;
              L1: while (true) {
                if (an.field_f <= var7) {
                  L2: {
                    de.a();
                    if (an.field_j > var6 + 64) {
                      de.d(0, var6 - -64, an.field_f, -var6 + -64 + an.field_j, 0);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return;
                } else {
                  L3: {
                    var8 = (int)Math.abs(20.0 * Math.sin(3.141592653589793 * (double)(param3 + (4 * ge.field_r + var7)) / 64.0));
                    if (64 <= ge.field_r) {
                      var8 = var8 * (-ge.field_r + 96) / 32;
                      break L3;
                    } else {
                      var8 = (-32 + ge.field_r) * var8 / 32;
                      break L3;
                    }
                  }
                  L4: {
                    if ((var8 ^ -1) >= -1) {
                      break L4;
                    } else {
                      var8 = -var8;
                      break L4;
                    }
                  }
                  var8 += 8;
                  var8 = (int)((double)var8 + (Math.sin((double)ge.field_r * 3.141592653589793 / 64.0) * 8.0 + 32.0));
                  de.h(0, var6 - var8, an.field_f, an.field_j);
                  de.c(var7, var6 - 64, 1, 128, (123361 | param1) >> -143396095, 0);
                  var7++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          } else {
            L5: {
              var8 = (int)Math.abs(18.0 * Math.cos(3.141592653589793 * (double)(param3 + (var7 - -(ge.field_r * 4))) / 64.0));
              if (ge.field_r < 64) {
                var8 = var8 * (ge.field_r - 32) / 32;
                break L5;
              } else {
                var8 = var8 * (96 - ge.field_r) / 32;
                break L5;
              }
            }
            L6: {
              if (-1 > (var8 ^ -1)) {
                var8 = -var8;
                break L6;
              } else {
                break L6;
              }
            }
            var8 += 12;
            var8 = (int)((double)var8 + (32.0 + 8.0 * Math.sin((double)ge.field_r * 3.141592653589793 / 64.0)));
            de.f(var7, -var8 + var6, var8, (65792 | param1) >> 235254433, 128);
            var7++;
            continue L0;
          }
        }
    }

    private final boolean j(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 == -27726) {
            break L0;
          } else {
            this.field_Z = 96;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_o) {
              break L2;
            } else {
              L3: {
                if (this.r(-74)) {
                  break L3;
                } else {
                  if (!this.field_k) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    private final boolean f(int param0) {
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            var2 = 53 / ((param0 - -81) / 45);
            if (this.field_o) {
              break L1;
            } else {
              L2: {
                if (this.r(-35)) {
                  break L2;
                } else {
                  if (!this.field_k) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_6_0 != 0;
    }

    private final int b(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        String var11 = null;
        int var12 = 0;
        int var13_int = 0;
        String var13 = null;
        String var14 = null;
        int var15 = 0;
        ml var16 = null;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        int stackIn_28_4 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        int stackOut_27_4 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        int stackOut_47_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        L0: {
          var15 = ArcanistsMulti.field_G ? 1 : 0;
          var16 = this.field_V.a(param2, true);
          if (var16 == null) {
            break L0;
          } else {
            if (0 == (1 << param2 & (this.field_a | this.field_J))) {
              if (var16.field_I == null) {
                break L0;
              } else {
                L1: {
                  if (-1 == (param2 ^ -1)) {
                    break L1;
                  } else {
                    if (!qg.a(param3 + -99)) {
                      break L1;
                    } else {
                      if ((mj.field_p ^ -1) != -7) {
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                L2: {
                  var6 = var16.v(-126);
                  if (0 <= var6) {
                    break L2;
                  } else {
                    var6 = 0;
                    break L2;
                  }
                }
                L3: {
                  var7 = var16.m(-20357) + var6;
                  var8 = nj.field_n[param2];
                  if (var16.o(-22625) != 27) {
                    break L3;
                  } else {
                    var8 = 13413102;
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    de.e(8, 2 + param0, 40 + param1 + -4, -4 + this.field_l[param2], 0, 192);
                    de.a(6, param0, param1 + 40, this.field_l[param2], 6, 0);
                    de.a(7, 1 + param0, param1 + 38, -2 + this.field_l[param2], 6, 16777215);
                    if (-4 == (var16.o(-22625) ^ -1)) {
                      break L5;
                    } else {
                      if ((var16.o(param3 + -22621) ^ -1) != -28) {
                        if ((this.field_l[param2] ^ -1) == -18) {
                          var16.field_I.b(8, -4 + param0);
                          break L4;
                        } else {
                          var16.field_I.c(8, -24 + (param0 + this.field_l[param2] / 2), (-4335 + this.field_l[param2] * 255) / 17);
                          break L4;
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                  if ((this.field_l[param2] ^ -1) != -18) {
                    var16.field_I.c(8, -24 + (param0 + this.field_l[param2] / 2), 32, 48, (-4335 + 255 * this.field_l[param2]) / 17);
                    break L4;
                  } else {
                    var16.field_I.f(8, -4 + param0);
                    break L4;
                  }
                }
                L6: {
                  var9 = this.field_V.c((byte) -123, param2);
                  var10 = 4 * this.field_V.s(0) + (-this.field_V.b(12) - -this.field_V.c((byte) -105, param2));
                  if (var10 > 4) {
                    var10 = 4;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if ((var7 ^ -1) >= -1) {
                    break L7;
                  } else {
                    L8: {
                      var11_int = var7 * 120 / 250;
                      stackOut_25_0 = param1 + (48 + var11_int) ^ -1;
                      stackOut_25_1 = -32;
                      stackOut_25_2 = 272;
                      stackOut_25_3 = mi.field_B.b("350");
                      stackIn_27_0 = stackOut_25_0;
                      stackIn_27_1 = stackOut_25_1;
                      stackIn_27_2 = stackOut_25_2;
                      stackIn_27_3 = stackOut_25_3;
                      stackIn_26_0 = stackOut_25_0;
                      stackIn_26_1 = stackOut_25_1;
                      stackIn_26_2 = stackOut_25_2;
                      stackIn_26_3 = stackOut_25_3;
                      if (-1 <= (var9 ^ -1)) {
                        stackOut_27_0 = stackIn_27_0;
                        stackOut_27_1 = stackIn_27_1;
                        stackOut_27_2 = stackIn_27_2;
                        stackOut_27_3 = stackIn_27_3;
                        stackOut_27_4 = 0;
                        stackIn_28_0 = stackOut_27_0;
                        stackIn_28_1 = stackOut_27_1;
                        stackIn_28_2 = stackOut_27_2;
                        stackIn_28_3 = stackOut_27_3;
                        stackIn_28_4 = stackOut_27_4;
                        break L8;
                      } else {
                        stackOut_26_0 = stackIn_26_0;
                        stackOut_26_1 = stackIn_26_1;
                        stackOut_26_2 = stackIn_26_2;
                        stackOut_26_3 = stackIn_26_3;
                        stackOut_26_4 = mi.field_B.b("5/5") - -1;
                        stackIn_28_0 = stackOut_26_0;
                        stackIn_28_1 = stackOut_26_1;
                        stackIn_28_2 = stackOut_26_2;
                        stackIn_28_3 = stackOut_26_3;
                        stackIn_28_4 = stackOut_26_4;
                        break L8;
                      }
                    }
                    L9: {
                      if (stackIn_28_0 < (stackIn_28_1 + (stackIn_28_2 - (stackIn_28_3 + stackIn_28_4)) ^ -1)) {
                        L10: {
                          stackOut_30_0 = -32 + -mi.field_B.b("350");
                          stackOut_30_1 = -param1;
                          stackOut_30_2 = 224;
                          stackIn_32_0 = stackOut_30_0;
                          stackIn_32_1 = stackOut_30_1;
                          stackIn_32_2 = stackOut_30_2;
                          stackIn_31_0 = stackOut_30_0;
                          stackIn_31_1 = stackOut_30_1;
                          stackIn_31_2 = stackOut_30_2;
                          if (var9 > 0) {
                            stackOut_32_0 = stackIn_32_0;
                            stackOut_32_1 = stackIn_32_1;
                            stackOut_32_2 = stackIn_32_2;
                            stackOut_32_3 = mi.field_B.b("5/5") + 1;
                            stackIn_33_0 = stackOut_32_0;
                            stackIn_33_1 = stackOut_32_1;
                            stackIn_33_2 = stackOut_32_2;
                            stackIn_33_3 = stackOut_32_3;
                            break L10;
                          } else {
                            stackOut_31_0 = stackIn_31_0;
                            stackOut_31_1 = stackIn_31_1;
                            stackOut_31_2 = stackIn_31_2;
                            stackOut_31_3 = 0;
                            stackIn_33_0 = stackOut_31_0;
                            stackIn_33_1 = stackOut_31_1;
                            stackIn_33_2 = stackOut_31_2;
                            stackIn_33_3 = stackOut_31_3;
                            break L10;
                          }
                        }
                        var11_int = stackIn_33_0 + (stackIn_33_1 + (stackIn_33_2 + -stackIn_33_3));
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L11: {
                      if (var11_int > this.field_v[param2]) {
                        this.field_v[param2] = this.field_v[param2] + 1;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (this.field_v[param2] <= var11_int) {
                        break L12;
                      } else {
                        this.field_v[param2] = this.field_v[param2] - 1;
                        break L12;
                      }
                    }
                    L13: {
                      if (this.field_l[param2] <= 17) {
                        break L13;
                      } else {
                        if (this.field_V.d(false) != param2) {
                          this.field_l[param2] = this.field_l[param2] - 1;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                    }
                    if (-35 >= (this.field_l[param2] ^ -1)) {
                      break L7;
                    } else {
                      if (param2 == this.field_V.d(false)) {
                        this.field_l[param2] = this.field_l[param2] + 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                L14: {
                  var11_int = 17 + this.field_v[param2];
                  stackOut_47_0 = param1 + 48;
                  stackIn_49_0 = stackOut_47_0;
                  stackIn_48_0 = stackOut_47_0;
                  if (-1 <= (var9 ^ -1)) {
                    stackOut_49_0 = stackIn_49_0;
                    stackOut_49_1 = 0;
                    stackIn_50_0 = stackOut_49_0;
                    stackIn_50_1 = stackOut_49_1;
                    break L14;
                  } else {
                    stackOut_48_0 = stackIn_48_0;
                    stackOut_48_1 = 1 + mi.field_B.b("5/4");
                    stackIn_50_0 = stackOut_48_0;
                    stackIn_50_1 = stackOut_48_1;
                    break L14;
                  }
                }
                var12 = stackIn_50_0 - -stackIn_50_1;
                de.c(3 + var12, -8 + param0 + (this.field_l[param2] / 2 + 3), -6 + var11_int, 11, var8, (var8 | 8421504) ^ 8421504);
                de.h(3 + var12, 3 + (-8 + (this.field_l[param2] / 2 + param0)), -6 + var11_int + (3 + var12), 20 + (-8 + param0) + this.field_l[param2] / 2 + -6);
                var11_int = var11_int + (this.field_j + param2 * 5) * this.field_l[param2] / 17 / 2;
                L15: while (true) {
                  if (0 >= var11_int) {
                    L16: {
                      de.a();
                      var11_int = this.field_v[param2] - -17;
                      de.a(var12, this.field_l[param2] / 2 + param0 + -8, var11_int, 17, 6, 0);
                      de.a(2 + var12, -8 + (this.field_l[param2] / 2 + (param0 + 2)), var11_int - 4, 13, 4, 0);
                      de.a(1 + var12, 1 + (param0 - -(this.field_l[param2] / 2) - 8), var11_int + -2, 15, 6, 16777215);
                      de.a(var12 + 2, -8 + this.field_l[param2] / 2 + param0 + 2, -4 + var11_int, 13, 6, 0);
                      var13_int = var11_int + var12 + 2;
                      var14 = Integer.toString(var7);
                      mi.field_B.a(var14, var13_int, 3 + (-8 + this.field_l[param2] / 2 + param0 - (-4 - mi.field_B.field_C / 2 - -1)), 8421504 ^ (var8 | 8421504), 0);
                      mi.field_B.a(var14, -1 + var13_int, mi.field_B.field_C / 2 + 4 + -8 + (param0 - (-(this.field_l[param2] / 2) + -3)), (var8 | 8421504) ^ 8421504, 0);
                      mi.field_B.a(var14, var13_int, -4 + (this.field_l[param2] / 2 + param0 + (3 + mi.field_B.field_C / 2)), var8, -1);
                      if (0 < var9) {
                        L17: {
                          var12 = var12 - (mi.field_B.b("5/5") + 1);
                          var13 = var9 + "/" + var10;
                          if (-5 <= (var9 ^ -1)) {
                            break L17;
                          } else {
                            var13 = Integer.toString(var9);
                            break L17;
                          }
                        }
                        L18: {
                          if ((this.field_l[param2] ^ -1) > -35) {
                            break L18;
                          } else {
                            if (fb.field_a == null) {
                              break L18;
                            } else {
                              if (null != fb.field_a[2]) {
                                fb.field_a[2].a(1 + var12, param0);
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                          }
                        }
                        mi.field_B.a(var13, var12, -6 + (param0 + this.field_l[param2] + -8 - (-4 - mi.field_B.field_C / 2)), 0, 0);
                        mi.field_B.a(var13, var12 - 1, mi.field_B.field_C / 2 + 3 + (-8 + param0) + (this.field_l[param2] - 8 - -4), 0, 0);
                        mi.field_B.a(var13, var12, mi.field_B.field_C / 2 + 3 + (-8 + (this.field_l[param2] + param0 + -8)) - -4, var8, -1);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    var11 = qo.a((byte) 121, (CharSequence) ((Object) this.field_V.field_k[param2]));
                    mi.field_B.b(var11, 12 + param1 / 2 + 25, mi.field_B.field_C / 2 + (-1 + param0 + this.field_l[param2] / 2), 8421504 ^ (var8 | 8421504), 0);
                    mi.field_B.b(var11, 12 + param1 / 2 - -26, -1 + (-1 + this.field_l[param2] / 2 + param0 + mi.field_B.field_C / 2), 8421504 ^ (8421504 | var8), 0);
                    mi.field_B.b(var11, param1 / 2 + 12 - -26, -1 + (param0 - -(this.field_l[param2] / 2) - -(mi.field_B.field_C / 2)), var8, -1);
                    if (-3 > (this.field_V.s(0) ^ -1)) {
                      param0 = param0 + (3 + this.field_l[param2]);
                      break L0;
                    } else {
                      L19: {
                        if ((param2 ^ -1) != -2) {
                          break L19;
                        } else {
                          var8 = 16777215;
                          param0 -= 20;
                          var11 = sb.field_c;
                          mi.field_B.b(var11, -1 + param1 / 2 - -36, mi.field_B.field_C / 2 + param0 + 8, 8421504 ^ (var8 | 8421504), 0);
                          mi.field_B.b(var11, 12 + param1 / 2 - -24, -1 + param0 - (-8 + -(mi.field_B.field_C / 2)), (var8 | 8421504) ^ 8421504, 0);
                          mi.field_B.b(var11, param1 / 2 + 36, 8 + param0 - -(mi.field_B.field_C / 2), var8, -1);
                          break L19;
                        }
                      }
                      param0 = param0 + (20 + (this.field_l[param2] + 3));
                      break L0;
                    }
                  } else {
                    var11_int = var11_int - g.field_a.field_n;
                    g.field_a.b(var11_int + 3 + var12, -12 + (param0 + this.field_l[param2] / 2 + -5), 64);
                    continue L15;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        L20: {
          if (param3 == -4) {
            break L20;
          } else {
            this.field_M = -126;
            break L20;
          }
        }
        return param0;
    }

    final void a(boolean param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        int discarded$1 = 0;
        int var8 = 0;
        String var8_ref_String = null;
        int var9_int = 0;
        qa var9 = null;
        int var10 = 0;
        mi var11_ref_mi = null;
        int var11 = 0;
        String var11_ref_String = null;
        int var12 = 0;
        int var13 = 0;
        ml var14 = null;
        String var15 = null;
        vn var16 = null;
        vn var17 = null;
        StringBuilder stackIn_60_0 = null;
        StringBuilder stackIn_61_0 = null;
        StringBuilder stackIn_62_0 = null;
        String stackIn_62_1 = null;
        StringBuilder stackOut_59_0 = null;
        StringBuilder stackOut_61_0 = null;
        String stackOut_61_1 = null;
        StringBuilder stackOut_60_0 = null;
        String stackOut_60_1 = null;
        L0: {
          var13 = ArcanistsMulti.field_G ? 1 : 0;
          ce.field_m.a(true);
          de.h(param4, param2, param4 - -param6, param2 - -param1);
          if (!this.field_k) {
            break L0;
          } else {
            if (!this.field_V.n(4)) {
              de.d(param4, param2, param6, param1, 0);
              var8_ref_String = rb.field_l + " - " + this.field_L + "%";
              discarded$1 = tj.field_t.a(var8_ref_String, param4, param2, param6, param1, 16777215, -1, 1, 1, 0);
              return;
            } else {
              break L0;
            }
          }
        }
        L1: {
          var8 = 2158624;
          if ((this.field_V.a(param5 ^ -31593) ^ -1) == -3) {
            var8 = 2239508;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (3 != this.field_V.a(-31497)) {
            break L2;
          } else {
            var8 = 3298412;
            break L2;
          }
        }
        L3: {
          if (-2 == (this.field_V.a(-31497) ^ -1)) {
            var8 = 4214874;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (this.field_V.a(-31497) != 0) {
            break L4;
          } else {
            var8 = 5663344;
            break L4;
          }
        }
        L5: {
          if (4 != this.field_V.a(-31497)) {
            break L5;
          } else {
            var8 = 2895400;
            break L5;
          }
        }
        L6: {
          if (this.field_V.a(-31497) == 5) {
            var8 = 9054474;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          if (param5 == 96) {
            break L7;
          } else {
            var14 = (ml) null;
            this.a(106, (byte) -85, (ml) null, -35);
            break L7;
          }
        }
        L8: {
          if (this.field_V.a(-31497) == 6) {
            var8 = 15658734;
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          if (-8 != (this.field_V.a(-31497) ^ -1)) {
            break L9;
          } else {
            var8 = 1213580;
            break L9;
          }
        }
        L10: {
          if (-9 == (this.field_V.a(param5 ^ -31593) ^ -1)) {
            var8 = 15597806;
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          if (null == this.field_V.m((byte) 69)) {
            break L11;
          } else {
            L12: {
              this.a(vn.field_c, (byte) -121, var8, ol.field_g);
              this.b(vn.field_c, -98, ol.field_g);
              this.c(ol.field_g, 0, vn.field_c);
              this.a(-8, vn.field_c, ol.field_g);
              var9_int = n.field_g.field_nb;
              var16 = this.field_V.e(param5 + -184);
              if (var16 == null) {
                break L12;
              } else {
                var11_ref_mi = (mi) ((Object) var16.b(12623));
                L13: while (true) {
                  if (var11_ref_mi == null) {
                    break L12;
                  } else {
                    var11_ref_mi.a(-ol.field_g + (var9_int >> 1256824385), 41, -vn.field_c + (an.field_f >> -715420927));
                    var11_ref_mi = (mi) ((Object) var16.a(0));
                    continue L13;
                  }
                }
              }
            }
            L14: {
              var17 = this.field_V.l((byte) 48);
              if (var17 == null) {
                break L14;
              } else {
                if (0 != (jb.field_v & 16)) {
                  break L14;
                } else {
                  var11_ref_mi = (mi) ((Object) var17.b(param5 + 12527));
                  L15: while (true) {
                    if (var11_ref_mi == null) {
                      break L14;
                    } else {
                      var11_ref_mi.a((var9_int >> 891061793) + -ol.field_g, -108, -vn.field_c - -(an.field_f >> -518178271));
                      var11_ref_mi = (mi) ((Object) var17.a(0));
                      continue L15;
                    }
                  }
                }
              }
            }
            this.a(ol.field_g, var8, 12224, vn.field_c);
            this.b(-113, param0);
            break L11;
          }
        }
        L16: {
          if (!param3) {
            break L16;
          } else {
            if (!this.field_V.n(param5 ^ 100)) {
              if (-1 < (this.field_V.d(false) ^ -1)) {
                break L16;
              } else {
                var9_int = nj.field_n[this.field_V.d(false)];
                if (!this.field_y) {
                  break L16;
                } else {
                  if (this.field_V.a(true)) {
                    break L16;
                  } else {
                    if ((this.field_z ^ -1) >= -1) {
                      break L16;
                    } else {
                      L17: {
                        if ((mj.field_p ^ -1) == 0) {
                          break L17;
                        } else {
                          if (this.field_z < this.field_V.f(12955)) {
                            break L17;
                          } else {
                            if (-7 != (mj.field_p ^ -1)) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                      if (-1 != (o.field_s ^ -1)) {
                        break L16;
                      } else {
                        L18: {
                          var10 = (this.field_z + 49) / 50;
                          if (var10 <= this.field_V.f(12955) / 50) {
                            break L18;
                          } else {
                            L19: {
                              if (-9 != (this.field_V.field_x[this.field_V.d(false)] ^ -1)) {
                                break L19;
                              } else {
                                if (this.field_V.field_X[this.field_V.d(false)] != 0) {
                                  break L18;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            var10 = this.field_V.f(param5 ^ 13051) / 50;
                            break L18;
                          }
                        }
                        if (!this.field_X) {
                          break L16;
                        } else {
                          L20: {
                            var11_ref_mi = null;
                            if (var10 < 60) {
                              var11_ref_String = Integer.toString(var10);
                              var15 = var11_ref_String;
                              var11_ref_String = var15;
                              var15 = var11_ref_String;
                              var11_ref_String = var15;
                              var15 = var11_ref_String;
                              break L20;
                            } else {
                              L21: {
                                var12 = var10 % 60;
                                stackOut_59_0 = new StringBuilder().append(var10 / 60);
                                stackIn_61_0 = stackOut_59_0;
                                stackIn_60_0 = stackOut_59_0;
                                if (var12 < 10) {
                                  stackOut_61_0 = (StringBuilder) ((Object) stackIn_61_0);
                                  stackOut_61_1 = ":0";
                                  stackIn_62_0 = stackOut_61_0;
                                  stackIn_62_1 = stackOut_61_1;
                                  break L21;
                                } else {
                                  stackOut_60_0 = (StringBuilder) ((Object) stackIn_60_0);
                                  stackOut_60_1 = ":";
                                  stackIn_62_0 = stackOut_60_0;
                                  stackIn_62_1 = stackOut_60_1;
                                  break L21;
                                }
                              }
                              var11_ref_String = stackIn_62_1 + var12;
                              break L20;
                            }
                          }
                          var12 = an.field_f / 2;
                          mi.field_B.b(co.field_i, var12, 16, var9_int, -1);
                          tj.field_t.b(var11_ref_String, var12, 40, var9_int, -1);
                          de.d(5, 5, var12 - 48, 0, 96, 44);
                          de.a(-48 + var12, 0, 96, 44, 0);
                          de.a(-1 + var12 - 48, 0, 98, 45, 11768360);
                          de.a(-50 + var12, 0, 100, 46, 8547138);
                          de.a(var12 + -51, 0, 102, 47, 0);
                          mi.field_B.b(co.field_i, -1 + var12, 16, 0, 0);
                          mi.field_B.b(co.field_i, var12, 15, 0, 0);
                          mi.field_B.b(co.field_i, var12, 16, var9_int, -1);
                          if (var11_ref_String == null) {
                            break L16;
                          } else {
                            tj.field_t.b(var11_ref_String, -1 + var12, 40, 0, 0);
                            tj.field_t.b(var11_ref_String, var12, 39, 0, 0);
                            tj.field_t.b(var11_ref_String, var12, 40, var9_int, -1);
                            break L16;
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else {
              break L16;
            }
          }
        }
        L22: {
          if (this.field_V.n(param5 ^ 100)) {
            break L22;
          } else {
            var9_int = -64 + n.field_g.field_nb + -10;
            var10 = 0;
            L23: while (true) {
              if (this.field_V.s(0) <= var10) {
                break L22;
              } else {
                L24: {
                  if (this.field_I == var10) {
                    if (-1 != (1 << var10 & this.field_b ^ -1)) {
                      if (this.field_i) {
                        var11_ref_String = mk.field_K;
                        break L24;
                      } else {
                        var11_ref_String = vi.field_R;
                        break L24;
                      }
                    } else {
                      if ((1 << var10 & this.field_J) == 0) {
                        if (!this.field_V.n(param5 + -92)) {
                          if (-1 != (this.field_D & 1 << var10 ^ -1)) {
                            var11_ref_String = nn.field_t;
                            break L24;
                          } else {
                            var10++;
                            continue L23;
                          }
                        } else {
                          var10++;
                          continue L23;
                        }
                      } else {
                        var11_ref_String = null;
                        break L24;
                      }
                    }
                  } else {
                    var15 = this.field_V.field_k[var10];
                    var11_ref_String = var15;
                    var15 = var11_ref_String;
                    var11_ref_String = var15;
                    var11_ref_String = var15;
                    if ((this.field_a & 1 << var10) != 0) {
                      if (0 == (this.field_J & 1 << var10)) {
                        var11_ref_String = null;
                        break L24;
                      } else {
                        var11_ref_String = null;
                        break L24;
                      }
                    } else {
                      if (-1 != (this.field_b & 1 << var10 ^ -1)) {
                        var15 = var11_ref_String;
                        if (this.field_i) {
                          var11_ref_String = tj.a(-69, new String[]{var15}, pb.field_i);
                          break L24;
                        } else {
                          var11_ref_String = tj.a(param5 + -127, new String[]{var15}, tj.field_y);
                          break L24;
                        }
                      } else {
                        if ((this.field_J & 1 << var10) != 0) {
                          var11_ref_String = null;
                          break L24;
                        } else {
                          if (!this.field_V.n(4)) {
                            if (-1 != (this.field_D & 1 << var10 ^ -1)) {
                              var11_ref_String = tj.a(-19, new String[]{var15}, ph.field_d);
                              break L24;
                            } else {
                              var10++;
                              continue L23;
                            }
                          } else {
                            var10++;
                            continue L23;
                          }
                        }
                      }
                    }
                  }
                }
                if (var11_ref_String != null) {
                  var12 = -8 + an.field_f;
                  mi.field_B.c(var11_ref_String, -1 + var12, var9_int, 0, 0);
                  mi.field_B.c(var11_ref_String, 1 + var12, var9_int, 0, 0);
                  mi.field_B.c(var11_ref_String, var12, var9_int + -1, 0, 0);
                  mi.field_B.c(var11_ref_String, var12, var9_int - -1, 0, 0);
                  mi.field_B.c(var11_ref_String, var12, var9_int, 16777215, 0);
                  var9_int -= 14;
                  var10++;
                  continue L23;
                } else {
                  var10++;
                  continue L23;
                }
              }
            }
          }
        }
        L25: {
          if (!this.field_V.n(4)) {
            break L25;
          } else {
            break L25;
          }
        }
        L26: {
          var9 = (qa) ((Object) b.field_a.b(12623));
          if (var9 == null) {
            break L26;
          } else {
            L27: {
              var11 = wi.field_h;
              if (-81 >= (var11 ^ -1)) {
                if (-231 < (var11 ^ -1)) {
                  var10 = 8;
                  break L27;
                } else {
                  var10 = -(var11 / 2) + 123;
                  break L27;
                }
              } else {
                var10 = var11 / 2 - 32;
                break L27;
              }
            }
            mo.field_a[var9.field_n].c(8, var10, 32, 32);
            tj.field_t.a(rb.field_n[var9.field_n], 48, tj.field_t.field_C + var10, 0, -1);
            break L26;
          }
        }
        L28: {
          if (!jb.field_p) {
            break L28;
          } else {
            L29: {
              if (null != this.field_V) {
                tj.field_t.a("Visible c-sum" + this.field_V.o(4), 64, 64, 16776960, 0);
                break L29;
              } else {
                break L29;
              }
            }
            if (null == this.field_w) {
              break L28;
            } else {
              tj.field_t.a("Backup c-sum" + this.field_w.o(4), 64, 96, 65535, 0);
              break L28;
            }
          }
        }
        sb.b(param5 ^ 47);
    }

    final void k(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ml var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_73_1 = 0;
        int stackIn_82_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_84_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_72_1 = 0;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_81_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_83_1 = 0;
        int stackOut_82_0 = 0;
        int stackOut_82_1 = 0;
        L0: {
          var9 = ArcanistsMulti.field_G ? 1 : 0;
          if (vn.field_d != 84) {
            if (!td.e(true)) {
              break L0;
            } else {
              if (!ri.field_b[82]) {
                break L0;
              } else {
                if (!ri.field_b[86]) {
                  break L0;
                } else {
                  if ((vn.field_d ^ -1) != -13) {
                    break L0;
                  } else {
                    he.field_e.b((byte) -59, 67);
                    he.field_e.a(0, (byte) -101);
                    we.a(0, (byte) 113);
                    break L0;
                  }
                }
              }
            }
          } else {
            if (!td.e(true)) {
              break L0;
            } else {
              if (!ri.field_b[82]) {
                break L0;
              } else {
                if (!ri.field_b[86]) {
                  break L0;
                } else {
                  if ((vn.field_d ^ -1) != -13) {
                    break L0;
                  } else {
                    he.field_e.b((byte) -59, 67);
                    he.field_e.a(0, (byte) -101);
                    we.a(0, (byte) 113);
                    break L0;
                  }
                }
              }
            }
          }
        }
        L1: {
          L2: {
            if (!this.field_V.c((byte) 89)) {
              break L2;
            } else {
              if (this.field_V.j(39)) {
                break L2;
              } else {
                stackOut_14_0 = 0;
                stackIn_26_0 = stackOut_14_0;
                break L1;
              }
            }
          }
          if (!this.field_V.a(true)) {
            if (!this.field_V.k(-75)) {
              if (!this.field_V.g(125)) {
                if (1 < this.field_z) {
                  stackOut_24_0 = 1;
                  stackIn_26_0 = stackOut_24_0;
                  break L1;
                } else {
                  stackOut_23_0 = 0;
                  stackIn_26_0 = stackOut_23_0;
                  break L1;
                }
              } else {
                stackOut_21_0 = 0;
                stackIn_26_0 = stackOut_21_0;
                break L1;
              }
            } else {
              stackOut_19_0 = 0;
              stackIn_26_0 = stackOut_19_0;
              break L1;
            }
          } else {
            stackOut_17_0 = 0;
            stackIn_26_0 = stackOut_17_0;
            break L1;
          }
        }
        L3: {
          var2 = stackIn_26_0;
          if (!this.field_ab) {
            break L3;
          } else {
            L4: {
              L5: {
                stackOut_27_0 = var2;
                stackIn_31_0 = stackOut_27_0;
                stackIn_28_0 = stackOut_27_0;
                if (ef.field_r) {
                  break L5;
                } else {
                  stackOut_28_0 = stackIn_28_0;
                  stackIn_31_0 = stackOut_28_0;
                  stackIn_29_0 = stackOut_28_0;
                  if (pn.a((byte) 119)) {
                    break L5;
                  } else {
                    stackOut_29_0 = stackIn_29_0;
                    stackIn_31_0 = stackOut_29_0;
                    stackIn_30_0 = stackOut_29_0;
                    if (this.field_V.d(false) != this.field_I) {
                      break L5;
                    } else {
                      stackOut_30_0 = stackIn_30_0;
                      stackOut_30_1 = 1;
                      stackIn_32_0 = stackOut_30_0;
                      stackIn_32_1 = stackOut_30_1;
                      break L4;
                    }
                  }
                }
              }
              stackOut_31_0 = stackIn_31_0;
              stackOut_31_1 = 0;
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              break L4;
            }
            var2 = stackIn_32_0 & stackIn_32_1;
            break L3;
          }
        }
        L6: {
          if (param0 == 1) {
            break L6;
          } else {
            this.field_g = true;
            break L6;
          }
        }
        L7: {
          if (var2 != 0) {
            L8: {
              var3 = n.field_g.field_nb;
              var4 = ol.field_g + (me.field_I + -(var3 >> 696013313));
              if (-1 > (this.field_u ^ -1)) {
                var4 = this.field_c;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              var5 = this.field_V.a(this.field_bb, true);
              if (-85 != (vn.field_d ^ -1)) {
                if (vn.field_d == 82) {
                  stackOut_46_0 = 1;
                  stackIn_48_0 = stackOut_46_0;
                  break L9;
                } else {
                  stackOut_45_0 = 0;
                  stackIn_48_0 = stackOut_45_0;
                  break L9;
                }
              } else {
                stackOut_43_0 = 1;
                stackIn_48_0 = stackOut_43_0;
                break L9;
              }
            }
            L10: {
              var6 = stackIn_48_0;
              if ((vn.field_d ^ -1) != -86) {
                if ((vn.field_d ^ -1) == -82) {
                  stackOut_52_0 = 1;
                  stackIn_54_0 = stackOut_52_0;
                  break L10;
                } else {
                  stackOut_51_0 = 0;
                  stackIn_54_0 = stackOut_51_0;
                  break L10;
                }
              } else {
                stackOut_49_0 = 1;
                stackIn_54_0 = stackOut_49_0;
                break L10;
              }
            }
            L11: {
              var7 = stackIn_54_0;
              if (var5 != null) {
                if (!this.field_V.j(39)) {
                  if (this.field_G) {
                    if (this.field_Z != 0) {
                      stackOut_62_0 = 0;
                      stackIn_63_0 = stackOut_62_0;
                      break L11;
                    } else {
                      stackOut_61_0 = 1;
                      stackIn_63_0 = stackOut_61_0;
                      break L11;
                    }
                  } else {
                    stackOut_59_0 = 0;
                    stackIn_63_0 = stackOut_59_0;
                    break L11;
                  }
                } else {
                  stackOut_57_0 = 0;
                  stackIn_63_0 = stackOut_57_0;
                  break L11;
                }
              } else {
                stackOut_55_0 = 0;
                stackIn_63_0 = stackOut_55_0;
                break L11;
              }
            }
            L12: {
              var8 = stackIn_63_0;
              if (var6 == 0) {
                break L12;
              } else {
                if (var8 == 0) {
                  break L12;
                } else {
                  if (this.field_O) {
                    break L12;
                  } else {
                    L13: {
                      this.field_Z = 25;
                      if ((this.field_h ^ -1) < -1) {
                        this.i(param0 + 1999);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      if (!this.field_ab) {
                        break L14;
                      } else {
                        L15: {
                          stackOut_70_0 = this.field_V.n((byte) -75);
                          stackIn_72_0 = stackOut_70_0;
                          stackIn_71_0 = stackOut_70_0;
                          if (0 != (var5.field_E ^ -1)) {
                            stackOut_72_0 = stackIn_72_0;
                            stackOut_72_1 = 4;
                            stackIn_73_0 = stackOut_72_0;
                            stackIn_73_1 = stackOut_72_1;
                            break L15;
                          } else {
                            stackOut_71_0 = stackIn_71_0;
                            stackOut_71_1 = 2;
                            stackIn_73_0 = stackOut_71_0;
                            stackIn_73_1 = stackOut_71_1;
                            break L15;
                          }
                        }
                        fieldTemp$2 = this.field_p + 1;
                        this.field_p = this.field_p + 1;
                        p.a(stackIn_73_0, stackIn_73_1, (byte) 11, 158, this.field_r, 1, this.field_bb, var4, fieldTemp$2);
                        break L14;
                      }
                    }
                    var5.c(0, 2);
                    this.field_m.a(-119, var5);
                    ti.field_N = -1;
                    eb.field_b = null;
                    break L12;
                  }
                }
              }
            }
            L16: {
              if (var7 == 0) {
                break L16;
              } else {
                if (var8 != 0) {
                  L17: {
                    this.field_Z = 25;
                    if (this.field_h <= 0) {
                      break L17;
                    } else {
                      this.i(param0 ^ 2001);
                      break L17;
                    }
                  }
                  L18: {
                    if (!this.field_ab) {
                      break L18;
                    } else {
                      L19: {
                        stackOut_81_0 = this.field_V.n((byte) -75);
                        stackIn_83_0 = stackOut_81_0;
                        stackIn_82_0 = stackOut_81_0;
                        if (-1 != var5.field_E) {
                          stackOut_83_0 = stackIn_83_0;
                          stackOut_83_1 = 5;
                          stackIn_84_0 = stackOut_83_0;
                          stackIn_84_1 = stackOut_83_1;
                          break L19;
                        } else {
                          stackOut_82_0 = stackIn_82_0;
                          stackOut_82_1 = 3;
                          stackIn_84_0 = stackOut_82_0;
                          stackIn_84_1 = stackOut_82_1;
                          break L19;
                        }
                      }
                      fieldTemp$3 = this.field_p + 1;
                      this.field_p = this.field_p + 1;
                      p.a(stackIn_84_0, stackIn_84_1, (byte) 11, 158, this.field_r, 1, this.field_bb, var4, fieldTemp$3);
                      break L18;
                    }
                  }
                  var5.c(param0 + -1, 3);
                  this.field_m.a(-90, var5);
                  ti.field_N = -1;
                  eb.field_b = null;
                  break L16;
                } else {
                  break L16;
                }
              }
            }
            if (vn.field_d == bg.field_c) {
              L20: {
                if (!this.field_O) {
                  if (this.field_ab) {
                    this.a(-113);
                    break L20;
                  } else {
                    this.d(false);
                    break L20;
                  }
                } else {
                  break L20;
                }
              }
              this.field_O = false;
              if (this.field_ab) {
                break L7;
              } else {
                if (!qg.a(-79)) {
                  break L7;
                } else {
                  vg.a((byte) 86);
                  break L7;
                }
              }
            } else {
              this.field_O = false;
              if (this.field_ab) {
                break L7;
              } else {
                if (!qg.a(-79)) {
                  break L7;
                } else {
                  vg.a((byte) 86);
                  break L7;
                }
              }
            }
          } else {
            this.field_O = false;
            if (this.field_ab) {
              break L7;
            } else {
              if (!qg.a(-79)) {
                break L7;
              } else {
                vg.a((byte) 86);
                break L7;
              }
            }
          }
        }
        if (13 == vn.field_d) {
          L21: {
            var3 = 1;
            if (this.field_ab) {
              L22: {
                if (0 > this.field_I) {
                  break L22;
                } else {
                  if (null == this.field_V.a(this.field_I, true)) {
                    break L22;
                  } else {
                    if ((1 << this.field_I & this.field_J) == 0) {
                      var3 = 2;
                      break L21;
                    } else {
                      break L22;
                    }
                  }
                }
              }
              var3 = 4;
              break L21;
            } else {
              break L21;
            }
          }
          var4 = var3;
          gj.a(false, true, var4, mn.field_r);
          return;
        } else {
          return;
        }
    }

    private final void d(byte param0) {
        boolean dupTemp$7 = false;
        boolean dupTemp$8 = false;
        boolean dupTemp$9 = false;
        boolean dupTemp$10 = false;
        boolean dupTemp$11 = false;
        boolean dupTemp$12 = false;
        boolean dupTemp$13 = false;
        hl var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        L0: {
          var5 = ArcanistsMulti.field_G ? 1 : 0;
          var2 = (hl) ((Object) this.field_cb.b(12623));
          if (param0 > 26) {
            break L0;
          } else {
            this.field_v = (int[]) null;
            break L0;
          }
        }
        L1: while (true) {
          if (var2 == null) {
            return;
          } else {
            L2: {
              var3 = 0;
              var4 = var2.field_k;
              if ((var4 ^ -1) == -62) {
                dupTemp$7 = this.b((byte) -116);
                var3 = dupTemp$7 ? 1 : 0;
                if (!dupTemp$7) {
                  break L2;
                } else {
                  this.a(5158, var2.field_j);
                  break L2;
                }
              } else {
                if (-66 != (var4 ^ -1)) {
                  if ((var4 ^ -1) != -67) {
                    if (var4 == 63) {
                      dupTemp$8 = this.l(-8712);
                      var3 = dupTemp$8 ? 1 : 0;
                      if (dupTemp$8) {
                        this.b(50, var2.field_j);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      if (var4 != 64) {
                        if (-63 == (var4 ^ -1)) {
                          dupTemp$9 = this.j(-27726);
                          var3 = dupTemp$9 ? 1 : 0;
                          if (!dupTemp$9) {
                            break L2;
                          } else {
                            this.a(var2.field_j, jb.field_v - var2.field_g, 8888);
                            break L2;
                          }
                        } else {
                          if (-68 == (var4 ^ -1)) {
                            dupTemp$10 = this.b(false);
                            var3 = dupTemp$10 ? 1 : 0;
                            if (dupTemp$10) {
                              this.b(var2.field_j, -1);
                              break L2;
                            } else {
                              break L2;
                            }
                          } else {
                            var6 = (String) null;
                            throw new RuntimeException((String) null);
                          }
                        }
                      } else {
                        dupTemp$11 = this.f(-126);
                        var3 = dupTemp$11 ? 1 : 0;
                        if (dupTemp$11) {
                          this.a((byte) 95, var2.field_j);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                  } else {
                    dupTemp$12 = this.f(false);
                    var3 = dupTemp$12 ? 1 : 0;
                    if (!dupTemp$12) {
                      break L2;
                    } else {
                      this.c(var2.field_j, 55);
                      break L2;
                    }
                  }
                } else {
                  dupTemp$13 = this.e(true);
                  var3 = dupTemp$13 ? 1 : 0;
                  if (!dupTemp$13) {
                    break L2;
                  } else {
                    this.a(var2.field_j, -114);
                    break L2;
                  }
                }
              }
            }
            if (var3 != 0) {
              var2.a(true);
              var2 = (hl) ((Object) this.field_cb.a(0));
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    public static void f(byte param0) {
        field_E = null;
        field_db = null;
        field_A = null;
        int var1 = -36 % ((param0 - 27) / 54);
        field_N = null;
        field_d = null;
    }

    private final void b(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        ml var5_ref_ml = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        String var12 = null;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_85_2 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_86_2 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        int stackIn_87_2 = 0;
        int stackIn_87_3 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        int stackIn_91_2 = 0;
        int stackIn_92_0 = 0;
        int stackIn_92_1 = 0;
        int stackIn_92_2 = 0;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        int stackIn_93_2 = 0;
        int stackIn_93_3 = 0;
        int stackIn_111_0 = 0;
        int stackIn_111_1 = 0;
        int stackIn_111_2 = 0;
        int stackIn_111_3 = 0;
        int stackIn_111_4 = 0;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        int stackIn_112_2 = 0;
        int stackIn_112_3 = 0;
        int stackIn_112_4 = 0;
        int stackIn_113_0 = 0;
        int stackIn_113_1 = 0;
        int stackIn_113_2 = 0;
        int stackIn_113_3 = 0;
        int stackIn_113_4 = 0;
        int stackIn_114_0 = 0;
        int stackIn_114_1 = 0;
        int stackIn_114_2 = 0;
        int stackIn_114_3 = 0;
        int stackIn_114_4 = 0;
        int stackIn_115_0 = 0;
        int stackIn_115_1 = 0;
        int stackIn_115_2 = 0;
        int stackIn_115_3 = 0;
        int stackIn_115_4 = 0;
        int stackIn_115_5 = 0;
        ll[] stackIn_116_0 = null;
        ll[] stackIn_117_0 = null;
        ll[] stackIn_118_0 = null;
        ll[] stackIn_119_0 = null;
        ll[] stackIn_120_0 = null;
        int stackIn_120_1 = 0;
        int stackOut_90_0 = 0;
        int stackOut_90_1 = 0;
        int stackOut_90_2 = 0;
        int stackOut_92_0 = 0;
        int stackOut_92_1 = 0;
        int stackOut_92_2 = 0;
        int stackOut_92_3 = 0;
        int stackOut_91_0 = 0;
        int stackOut_91_1 = 0;
        int stackOut_91_2 = 0;
        int stackOut_91_3 = 0;
        int stackOut_84_0 = 0;
        int stackOut_84_1 = 0;
        int stackOut_84_2 = 0;
        int stackOut_86_0 = 0;
        int stackOut_86_1 = 0;
        int stackOut_86_2 = 0;
        int stackOut_86_3 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        int stackOut_85_2 = 0;
        int stackOut_85_3 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        int stackOut_110_2 = 0;
        int stackOut_110_3 = 0;
        int stackOut_110_4 = 0;
        int stackOut_112_0 = 0;
        int stackOut_112_1 = 0;
        int stackOut_112_2 = 0;
        int stackOut_112_3 = 0;
        int stackOut_112_4 = 0;
        int stackOut_114_0 = 0;
        int stackOut_114_1 = 0;
        int stackOut_114_2 = 0;
        int stackOut_114_3 = 0;
        int stackOut_114_4 = 0;
        int stackOut_114_5 = 0;
        int stackOut_113_0 = 0;
        int stackOut_113_1 = 0;
        int stackOut_113_2 = 0;
        int stackOut_113_3 = 0;
        int stackOut_113_4 = 0;
        int stackOut_113_5 = 0;
        int stackOut_111_0 = 0;
        int stackOut_111_1 = 0;
        int stackOut_111_2 = 0;
        int stackOut_111_3 = 0;
        int stackOut_111_4 = 0;
        int stackOut_111_5 = 0;
        ll[] stackOut_115_0 = null;
        ll[] stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        ll[] stackOut_116_0 = null;
        ll[] stackOut_118_0 = null;
        int stackOut_118_1 = 0;
        ll[] stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        L0: {
          var11 = ArcanistsMulti.field_G ? 1 : 0;
          kl.field_A = 320;
          this.field_H = true;
          this.field_B = false;
          this.field_X = true;
          this.field_g = true;
          mo.field_f = null;
          var3 = n.field_g.field_nb;
          var4 = 0;
          if (this.field_I == this.field_V.d(false)) {
            var5_ref_ml = this.field_V.a(this.field_bb, true);
            if (var5_ref_ml == null) {
              break L0;
            } else {
              if (null != var5_ref_ml.w(24501)) {
                break L0;
              } else {
                if (var5_ref_ml.i((byte) -60) >= 128 + this.field_V.field_H) {
                  L1: {
                    var4 = 1;
                    var6 = var5_ref_ml.m(-20357) / 2;
                    if (-26 >= (var6 ^ -1)) {
                      break L1;
                    } else {
                      var6 = 25;
                      break L1;
                    }
                  }
                  L2: {
                    var7 = var5_ref_ml.y(17571);
                    if (-1 <= (this.field_V.a(4, var7, -770226943) ^ -1)) {
                      L3: {
                        var8 = var5_ref_ml.m(-20357) / 3;
                        if (5 > var8) {
                          var8 = 5;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        mo.field_f = in.field_Kb;
                        if (var6 < var5_ref_ml.m(-20357)) {
                          break L4;
                        } else {
                          mo.field_f = ml.field_K;
                          break L4;
                        }
                      }
                      mo.field_f = tj.a(-33, new String[]{Integer.toString(var6), Integer.toString(var8)}, mo.field_f);
                      if (var8 >= var5_ref_ml.m(-20357)) {
                        L5: {
                          if (this.field_ab) {
                            this.a(33);
                            break L5;
                          } else {
                            this.d(false);
                            break L5;
                          }
                        }
                        mo.field_f = null;
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      L6: {
                        mo.field_f = ck.field_g;
                        if (var5_ref_ml.m(-20357) <= var6) {
                          mo.field_f = bc.field_a;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      mo.field_f = tj.a(-44, new String[]{Integer.toString(var6)}, mo.field_f);
                      break L2;
                    }
                  }
                  kl.field_A = 270;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L7: {
          if (qg.a(-114)) {
            jh.a(-3, var4 != 0);
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if (this.field_H) {
            this.o(8);
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          ce.field_m.a(true);
          var5 = 0;
          var5 += 6;
          if (!this.field_g) {
            break L9;
          } else {
            var5 = this.a(var5, 0);
            break L9;
          }
        }
        L10: {
          if (this.field_V.field_d) {
            var6 = 0;
            L11: while (true) {
              if (this.field_V.s(0) <= var6) {
                var6 = 1;
                L12: while (true) {
                  if (this.field_V.s(0) <= var6) {
                    break L10;
                  } else {
                    var5 = this.a(var5, (byte) -3, var6);
                    var6 += 2;
                    continue L12;
                  }
                }
              } else {
                var5 = this.a(var5, (byte) -3, var6);
                var6 += 2;
                continue L11;
              }
            }
          } else {
            var6 = 0;
            L13: while (true) {
              if (var6 >= this.field_V.s(0)) {
                break L10;
              } else {
                var5 = this.a(var5, (byte) -3, var6);
                var6++;
                continue L13;
              }
            }
          }
        }
        L14: {
          if (param0 <= -112) {
            break L14;
          } else {
            this.b(-71, -18, -117);
            break L14;
          }
        }
        L15: {
          if (3 == (mf.field_g ^ -1)) {
            mf.field_g = -1;
            break L15;
          } else {
            break L15;
          }
        }
        L16: {
          if (-1 < (this.field_I ^ -1)) {
            break L16;
          } else {
            L17: {
              if ((mj.field_p ^ -1) == 0) {
                break L17;
              } else {
                if ((mj.field_p ^ -1) != -8) {
                  break L16;
                } else {
                  break L17;
                }
              }
            }
            if (10 == this.field_V.field_x[this.field_I]) {
              break L16;
            } else {
              if (this.field_I == this.field_bb) {
                L18: {
                  var6 = 30;
                  var7 = -150 + (var3 + ii.a((byte) -117));
                  var8 = 0;
                  if ((-var7 + me.field_I + 24) * (-var7 + (me.field_I + 24)) + (-var6 + an.field_g) * (-var6 + an.field_g) < 1296) {
                    L19: {
                      mf.field_g = -4;
                      var8 = 1;
                      var9 = 100;
                      if (4 != this.field_V.field_x[this.field_I]) {
                        break L19;
                      } else {
                        var9 = this.field_V.field_X[this.field_I] / 5 * 5 + 5;
                        if (this.field_V.field_X[this.field_I] <= 0) {
                          break L19;
                        } else {
                          if (this.field_V.field_X[this.field_I] - -5 == var9) {
                            var9 = this.field_V.field_X[this.field_I];
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                      }
                    }
                    if (this.field_V.field_X[this.field_I] < var9) {
                      L20: {
                        if (hc.field_f) {
                          L21: {
                            mo.field_f = vm.field_d[this.field_V.field_x[this.field_I] - -128 - -12];
                            if (this.field_V.field_x[this.field_I] == 8) {
                              mo.field_f = vm.field_d[156];
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          if (9 == this.field_V.field_x[this.field_I]) {
                            mo.field_f = vm.field_d[157];
                            break L20;
                          } else {
                            break L20;
                          }
                        } else {
                          break L20;
                        }
                      }
                      if ((this.field_V.a(this.field_V.d(false), true).m(-20357) ^ -1) < -21) {
                        break L18;
                      } else {
                        var8 = 0;
                        if (hc.field_f) {
                          mo.field_f = mo.field_f + hm.field_b;
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                    } else {
                      var8 = 0;
                      if (hc.field_f) {
                        L22: {
                          mo.field_f = vm.field_d[128 + (this.field_V.field_x[this.field_I] + 12)] + rc.field_i;
                          if (8 == this.field_V.field_x[this.field_I]) {
                            mo.field_f = vm.field_d[156] + rc.field_i;
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                        if ((this.field_V.field_x[this.field_I] ^ -1) != -10) {
                          break L18;
                        } else {
                          mo.field_f = vm.field_d[157] + rc.field_i;
                          break L18;
                        }
                      } else {
                        break L18;
                      }
                    }
                  } else {
                    break L18;
                  }
                }
                var9 = -20;
                L23: while (true) {
                  if (-21 >= (var9 ^ -1)) {
                    var9 = -16;
                    L24: while (true) {
                      if (16 <= var9) {
                        L25: {
                          de.a();
                          if (var8 == 0) {
                            rm.field_o[this.field_V.field_x[this.field_I] - -1].b(var6 + -32, var7 - 48);
                            break L25;
                          } else {
                            rm.field_o[this.field_V.field_x[this.field_I] - -1].b(-32 + var6, -48 + (var7 - (int)(4.0 * Math.sin((double)jb.field_v * 0.5) + 4.0)));
                            break L25;
                          }
                        }
                        if (-1 > (this.field_V.field_X[this.field_I] ^ -1)) {
                          L26: {
                            var9 = this.field_V.field_X[this.field_I] / 20;
                            if (this.field_V.field_x[this.field_I] == 4) {
                              var9 = this.field_V.field_X[this.field_I] % 5;
                              if (0 != var9) {
                                break L26;
                              } else {
                                if (0 < this.field_V.field_X[this.field_I]) {
                                  var9 = 5;
                                  break L26;
                                } else {
                                  break L26;
                                }
                              }
                            } else {
                              break L26;
                            }
                          }
                          var12 = tj.a(120, new String[]{Integer.toString(var9)}, bk.field_H);
                          var10 = var12;
                          var10 = var12;
                          var7 += 16;
                          mi.field_B.b(var12, var6 + -1, var7, 0, 0);
                          mi.field_B.b(var12, var6, -1 + var7, 0, 0);
                          mi.field_B.b(var12, var6, var7, 16777215, -1);
                          break L16;
                        } else {
                          break L16;
                        }
                      } else {
                        L27: {
                          de.h(0, var9 + var7, an.field_f, var7 + (var9 - -1));
                          de.i(var6, var7 + -(var9 / 2), 16, 0);
                          de.h(0, -1 + var9 + var7, an.field_f, var9 + var7);
                          stackOut_90_0 = var6;
                          stackOut_90_1 = -1 + (-(var9 / 2) + var7);
                          stackOut_90_2 = 16;
                          stackIn_92_0 = stackOut_90_0;
                          stackIn_92_1 = stackOut_90_1;
                          stackIn_92_2 = stackOut_90_2;
                          stackIn_91_0 = stackOut_90_0;
                          stackIn_91_1 = stackOut_90_1;
                          stackIn_91_2 = stackOut_90_2;
                          if (var8 == 0) {
                            stackOut_92_0 = stackIn_92_0;
                            stackOut_92_1 = stackIn_92_1;
                            stackOut_92_2 = stackIn_92_2;
                            stackOut_92_3 = 13093320;
                            stackIn_93_0 = stackOut_92_0;
                            stackIn_93_1 = stackOut_92_1;
                            stackIn_93_2 = stackOut_92_2;
                            stackIn_93_3 = stackOut_92_3;
                            break L27;
                          } else {
                            stackOut_91_0 = stackIn_91_0;
                            stackOut_91_1 = stackIn_91_1;
                            stackOut_91_2 = stackIn_91_2;
                            stackOut_91_3 = 16777215;
                            stackIn_93_0 = stackOut_91_0;
                            stackIn_93_1 = stackOut_91_1;
                            stackIn_93_2 = stackOut_91_2;
                            stackIn_93_3 = stackOut_91_3;
                            break L27;
                          }
                        }
                        de.i(stackIn_93_0, stackIn_93_1, stackIn_93_2, stackIn_93_3);
                        var9++;
                        continue L24;
                      }
                    }
                  } else {
                    L28: {
                      de.h(0, 2 + (var7 + var9), an.field_f, 2 + (1 + var7 + var9));
                      de.i(var6, 2 + (-(var9 / 2) + var7), 20, 0);
                      de.h(0, -1 + (var9 + (var7 + 2)), an.field_f, var9 + (var7 + 2));
                      stackOut_84_0 = var6;
                      stackOut_84_1 = 2 + -(var9 / 2) + var7 - 1;
                      stackOut_84_2 = 20;
                      stackIn_86_0 = stackOut_84_0;
                      stackIn_86_1 = stackOut_84_1;
                      stackIn_86_2 = stackOut_84_2;
                      stackIn_85_0 = stackOut_84_0;
                      stackIn_85_1 = stackOut_84_1;
                      stackIn_85_2 = stackOut_84_2;
                      if (var8 == 0) {
                        stackOut_86_0 = stackIn_86_0;
                        stackOut_86_1 = stackIn_86_1;
                        stackOut_86_2 = stackIn_86_2;
                        stackOut_86_3 = 7433831;
                        stackIn_87_0 = stackOut_86_0;
                        stackIn_87_1 = stackOut_86_1;
                        stackIn_87_2 = stackOut_86_2;
                        stackIn_87_3 = stackOut_86_3;
                        break L28;
                      } else {
                        stackOut_85_0 = stackIn_85_0;
                        stackOut_85_1 = stackIn_85_1;
                        stackOut_85_2 = stackIn_85_2;
                        stackOut_85_3 = 13093320;
                        stackIn_87_0 = stackOut_85_0;
                        stackIn_87_1 = stackOut_85_1;
                        stackIn_87_2 = stackOut_85_2;
                        stackIn_87_3 = stackOut_85_3;
                        break L28;
                      }
                    }
                    de.i(stackIn_87_0, stackIn_87_1, stackIn_87_2, stackIn_87_3);
                    var9++;
                    continue L23;
                  }
                }
              } else {
                break L16;
              }
            }
          }
        }
        L29: {
          sb.a(param1, -58);
          if (null != mo.field_f) {
            break L29;
          } else {
            this.d(-25343);
            break L29;
          }
        }
        L30: {
          if (this.field_ab) {
            L31: {
              var6 = 22;
              var7 = -16 + (var3 - 6);
              stackOut_110_0 = -16 + var6;
              stackOut_110_1 = var7 - 16;
              stackOut_110_2 = 32;
              stackOut_110_3 = 32;
              stackOut_110_4 = 15;
              stackIn_112_0 = stackOut_110_0;
              stackIn_112_1 = stackOut_110_1;
              stackIn_112_2 = stackOut_110_2;
              stackIn_112_3 = stackOut_110_3;
              stackIn_112_4 = stackOut_110_4;
              stackIn_111_0 = stackOut_110_0;
              stackIn_111_1 = stackOut_110_1;
              stackIn_111_2 = stackOut_110_2;
              stackIn_111_3 = stackOut_110_3;
              stackIn_111_4 = stackOut_110_4;
              if (vh.field_t > 0) {
                stackOut_112_0 = stackIn_112_0;
                stackOut_112_1 = stackIn_112_1;
                stackOut_112_2 = stackIn_112_2;
                stackOut_112_3 = stackIn_112_3;
                stackOut_112_4 = stackIn_112_4;
                stackIn_114_0 = stackOut_112_0;
                stackIn_114_1 = stackOut_112_1;
                stackIn_114_2 = stackOut_112_2;
                stackIn_114_3 = stackOut_112_3;
                stackIn_114_4 = stackOut_112_4;
                stackIn_113_0 = stackOut_112_0;
                stackIn_113_1 = stackOut_112_1;
                stackIn_113_2 = stackOut_112_2;
                stackIn_113_3 = stackOut_112_3;
                stackIn_113_4 = stackOut_112_4;
                if (-1 == (8 & jb.field_v ^ -1)) {
                  stackOut_114_0 = stackIn_114_0;
                  stackOut_114_1 = stackIn_114_1;
                  stackOut_114_2 = stackIn_114_2;
                  stackOut_114_3 = stackIn_114_3;
                  stackOut_114_4 = stackIn_114_4;
                  stackOut_114_5 = 16711935;
                  stackIn_115_0 = stackOut_114_0;
                  stackIn_115_1 = stackOut_114_1;
                  stackIn_115_2 = stackOut_114_2;
                  stackIn_115_3 = stackOut_114_3;
                  stackIn_115_4 = stackOut_114_4;
                  stackIn_115_5 = stackOut_114_5;
                  break L31;
                } else {
                  stackOut_113_0 = stackIn_113_0;
                  stackOut_113_1 = stackIn_113_1;
                  stackOut_113_2 = stackIn_113_2;
                  stackOut_113_3 = stackIn_113_3;
                  stackOut_113_4 = stackIn_113_4;
                  stackOut_113_5 = 16744703;
                  stackIn_115_0 = stackOut_113_0;
                  stackIn_115_1 = stackOut_113_1;
                  stackIn_115_2 = stackOut_113_2;
                  stackIn_115_3 = stackOut_113_3;
                  stackIn_115_4 = stackOut_113_4;
                  stackIn_115_5 = stackOut_113_5;
                  break L31;
                }
              } else {
                stackOut_111_0 = stackIn_111_0;
                stackOut_111_1 = stackIn_111_1;
                stackOut_111_2 = stackIn_111_2;
                stackOut_111_3 = stackIn_111_3;
                stackOut_111_4 = stackIn_111_4;
                stackOut_111_5 = 16777215;
                stackIn_115_0 = stackOut_111_0;
                stackIn_115_1 = stackOut_111_1;
                stackIn_115_2 = stackOut_111_2;
                stackIn_115_3 = stackOut_111_3;
                stackIn_115_4 = stackOut_111_4;
                stackIn_115_5 = stackOut_111_5;
                break L31;
              }
            }
            L32: {
              de.g(stackIn_115_0, stackIn_115_1, stackIn_115_2, stackIn_115_3, stackIn_115_4, stackIn_115_5);
              de.a(var6 + -16, -16 + var7, 32, 32, 15, 0);
              stackOut_115_0 = tg.field_b;
              stackIn_119_0 = stackOut_115_0;
              stackIn_116_0 = stackOut_115_0;
              if (0 >= vh.field_t) {
                stackOut_119_0 = (ll[]) ((Object) stackIn_119_0);
                stackOut_119_1 = 9;
                stackIn_120_0 = stackOut_119_0;
                stackIn_120_1 = stackOut_119_1;
                break L32;
              } else {
                stackOut_116_0 = (ll[]) ((Object) stackIn_116_0);
                stackIn_118_0 = stackOut_116_0;
                stackIn_117_0 = stackOut_116_0;
                if ((jb.field_v & 8) != 0) {
                  stackOut_118_0 = (ll[]) ((Object) stackIn_118_0);
                  stackOut_118_1 = 11;
                  stackIn_120_0 = stackOut_118_0;
                  stackIn_120_1 = stackOut_118_1;
                  break L32;
                } else {
                  stackOut_117_0 = (ll[]) ((Object) stackIn_117_0);
                  stackOut_117_1 = 10;
                  stackIn_120_0 = stackOut_117_0;
                  stackIn_120_1 = stackOut_117_1;
                  break L32;
                }
              }
            }
            ((ll) (Object) stackIn_120_0[stackIn_120_1]).a(var6 - 16, var7 + -16);
            var8 = var6 - an.field_g;
            var9 = -me.field_I + var7;
            if (-257 >= (var8 * var8 - -(var9 * var9) ^ -1)) {
              break L30;
            } else {
              if (param1) {
                L33: {
                  de.c(var6, var7, 16, 16777215, 128);
                  mf.field_g = -3;
                  var10 = rm.field_a;
                  if (ao.field_d) {
                    break L33;
                  } else {
                    if (1 >= vh.field_t) {
                      if (-2 != (vh.field_t ^ -1)) {
                        var10 = bm.field_b;
                        break L33;
                      } else {
                        var10 = am.field_a;
                        break L33;
                      }
                    } else {
                      var10 = tj.a(120, new String[]{Integer.toString(vh.field_t)}, ig.field_d);
                      break L33;
                    }
                  }
                }
                mi.field_B.a(var10, 5 + var6, var7 - 1, 0, 0);
                mi.field_B.a(var10, 4 + var6, var7, 0, 0);
                mi.field_B.a(var10, 5 + (var6 - -1), var7, 0, 0);
                mi.field_B.a(var10, var6 - -5, var7 - -1, 0, 0);
                mi.field_B.a(var10, var6 + 5, var7, 16777215, 0);
                break L30;
              } else {
                break L30;
              }
            }
          } else {
            break L30;
          }
        }
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var5_ref_String = null;
        ml var6_ref_ml = null;
        int var6 = 0;
        int var7 = 0;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        var3 = 50;
        var4 = param1;
        var5 = 0;
        L0: while (true) {
          if (this.field_V.s(0) <= var5) {
            L1: {
              if (this.field_V.field_d) {
                var5 = 0;
                L2: while (true) {
                  if (this.field_V.s(0) <= var5) {
                    var5_ref_String = sb.field_c;
                    var6 = 16777215;
                    mi.field_B.b(var5_ref_String, 23 + (12 + var4 / 2), mi.field_B.field_C / 2 + (8 + param0), 8421504 ^ (8421504 | var6), 0);
                    mi.field_B.b(var5_ref_String, 12 + (var4 / 2 - -24), -1 + (mi.field_B.field_C / 2 + param0 + 8), 8421504 ^ (var6 | 8421504), 0);
                    mi.field_B.b(var5_ref_String, 36 + var4 / 2, mi.field_B.field_C / 2 + (param0 + 8), var6, -1);
                    param0 += 20;
                    var5 = 1;
                    L3: while (true) {
                      if (this.field_V.s(0) <= var5) {
                        break L1;
                      } else {
                        param0 = this.b(param0, var4, var5, -4);
                        var5 += 2;
                        continue L3;
                      }
                    }
                  } else {
                    param0 = this.b(param0, var4, var5, -4);
                    var5 += 2;
                    continue L2;
                  }
                }
              } else {
                var5 = 0;
                L4: while (true) {
                  if (var5 >= this.field_V.s(0)) {
                    break L1;
                  } else {
                    param0 = this.b(param0, var4, var5, param1 + -4);
                    var5++;
                    continue L4;
                  }
                }
              }
            }
            return param0;
          } else {
            var6_ref_ml = this.field_V.a(var5, true);
            if (var6_ref_ml != null) {
              L5: {
                if (var6_ref_ml.m(-20357) <= var3) {
                  break L5;
                } else {
                  var3 = var6_ref_ml.m(-20357);
                  break L5;
                }
              }
              if (var4 < mi.field_B.b(this.field_V.field_k[var5])) {
                var4 = mi.field_B.b(this.field_V.field_k[var5]);
                var5++;
                continue L0;
              } else {
                var5++;
                continue L0;
              }
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    private final void o(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        vn var8 = null;
        ml var9 = null;
        int var10 = 0;
        int[] var11 = null;
        int var11_int = 0;
        int[] var12 = null;
        int var12_int = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        String var15 = null;
        int var16 = 0;
        int var17 = 0;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] stackIn_3_0 = null;
        int[] stackIn_4_0 = null;
        int[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int[] stackOut_2_0 = null;
        int[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int[] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        L0: {
          var17 = ArcanistsMulti.field_G ? 1 : 0;
          if (null != this.field_V.m((byte) 69)) {
            L1: {
              stackOut_2_0 = nj.field_n;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (0 > this.field_I) {
                stackOut_4_0 = (int[]) ((Object) stackIn_4_0);
                stackOut_4_1 = 6;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_3_0 = (int[]) ((Object) stackIn_3_0);
                stackOut_3_1 = this.field_I;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L1;
              }
            }
            L2: {
              var2 = stackIn_5_0[stackIn_5_1];
              this.field_K = 4;
              var3 = this.field_V.field_y >> this.field_K;
              var4 = this.field_V.field_H >> this.field_K;
              var5 = an.field_j;
              if (an.field_f > 8 + (var3 + 640)) {
                if (640 + 2 * var3 - -8 <= an.field_f) {
                  this.field_K = 3;
                  var3 = this.field_V.field_y >> this.field_K;
                  var4 = this.field_V.field_H >> this.field_K;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                var5 = n.field_g.field_nb;
                break L2;
              }
            }
            L3: {
              var6 = 5;
              var7 = 1;
              de.a(-var7 + -var6 + -var3 + an.field_f, -var7 + (-var6 + -var4 + var5), var3 - -(2 * var7), var7 * 2 + var4, 4799269);
              var7++;
              de.a(-var7 + -var6 + (-var3 + an.field_f), -var4 + (var5 + (-var6 + -var7)), var3 - -(var7 * 2), 2 * var7 + var4, 8547138);
              var7++;
              de.a(-var7 + -var6 + (-var3 + an.field_f), var5 - (var4 - (-var6 + -var7)), var3 + 2 * var7, var4 - -(var7 * 2), 11768360);
              var7++;
              de.a(-var7 + (-var3 + an.field_f + -var6), -var7 + -var6 + (var5 + -var4), var3 + var7 * 2, var4 - -(var7 * 2), 0);
              var7++;
              de.h(an.field_f - (var3 + var6), -var4 + (var5 + -var6), -var6 + an.field_f, -var6 + var5);
              de.c(-var6 + -var3 + an.field_f, var5 - (var4 - -var6), var3, var4, nb.field_a, cg.field_Lb);
              this.field_V.m((byte) 69).b(-var6 + (-var3 + an.field_f), -var4 + var5 + -var6, var3, var4);
              de.f(an.field_f + -var3 - (var6 + -(-(an.field_f >> -382287263) + vn.field_c >> this.field_K)), (ol.field_g + -(var5 >> -1156768319) >> this.field_K) + var5 + (-var4 + -var6), an.field_f >> this.field_K, var5 >> this.field_K, 16777215, 128);
              var8 = this.field_V.g((byte) 61);
              if (var8 == null) {
                break L3;
              } else {
                if (!var8.b(true)) {
                  var9 = (ml) ((Object) var8.a(true));
                  L4: while (true) {
                    if (var9 == null) {
                      if (this.field_K == 2) {
                        i.b(90);
                        ti.field_N = -1;
                        eb.field_b = null;
                        var10 = this.field_V.s(param0 ^ 8);
                        var22 = new int[var10];
                        var19 = var22;
                        var11 = var19;
                        var21 = new int[var10];
                        var18 = var21;
                        var12 = var18;
                        var23 = new int[var10];
                        var20 = var23;
                        var13 = var20;
                        var9 = (ml) ((Object) var8.b(12623));
                        L5: while (true) {
                          if (var9 == null) {
                            de.h(-var6 + (-var3 + an.field_f), 0, -var6 + an.field_f, -var6 + var5);
                            var9 = (ml) ((Object) var8.b(param0 + 12615));
                            L6: while (true) {
                              if (var9 == null) {
                                de.a();
                                var9 = (ml) ((Object) var8.b(12623));
                                L7: while (true) {
                                  if (var9 == null) {
                                    break L3;
                                  } else {
                                    L8: {
                                      if (12 == var9.o(-22625)) {
                                        break L8;
                                      } else {
                                        if (var9.w(param0 + 24493) != null) {
                                          break L8;
                                        } else {
                                          var2 = 0;
                                          var14 = var9.y(17571);
                                          var2 = nj.field_n[var14];
                                          var15 = this.field_V.field_k[var14];
                                          mi.field_B.b(var15, var22[var14], var21[var14] + -1, (var2 | 8421504) ^ 8421504, 0);
                                          mi.field_B.b(var15, -1 + var22[var14], var21[var14], 8421504 ^ (8421504 | var2), 0);
                                          mi.field_B.b(var15, var22[var14], var21[var14], var2, -1);
                                          break L8;
                                        }
                                      }
                                    }
                                    var9 = (ml) ((Object) var8.a(param0 ^ 8));
                                    continue L7;
                                  }
                                }
                              } else {
                                L9: {
                                  if ((var9.o(-22625) ^ -1) == -13) {
                                    break L9;
                                  } else {
                                    if (null == var9.w(24501)) {
                                      var2 = 0;
                                      var14 = var9.y(17571);
                                      var2 = nj.field_n[var14];
                                      var15_int = var9.i((byte) -39);
                                      var16 = var9.p(-8323);
                                      de.d(var22[var14], var21[var14] - 1, -var6 + (var5 + -var4) + ((var15_int + -var16 >> this.field_K) - var21[var14]), var2);
                                      de.d(var22[var14] - 1, var21[var14] - 2, (var15_int - var16 >> this.field_K) + var5 + (-var4 + (-var6 + -var21[var14])), 8421504 ^ (8421504 | var2));
                                      de.d(1 + var22[var14], -2 + var21[var14], -var6 + -var4 + var5 - -(-var16 + var15_int >> this.field_K) - var21[var14], (var2 | 8421504) ^ 8421504);
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                var9 = (ml) ((Object) var8.a(0));
                                continue L6;
                              }
                            }
                          } else {
                            L10: {
                              if ((var9.o(-22625) ^ -1) == -13) {
                                break L10;
                              } else {
                                if (null != var9.w(24501)) {
                                  break L10;
                                } else {
                                  var14 = var9.y(param0 ^ 17579);
                                  var11[var14] = -var6 + an.field_f + -var3 + (var9.f(-85) >> this.field_K);
                                  var12[var14] = -var6 + -var4 + (var5 + -8);
                                  var13[var14] = mi.field_B.b(this.field_V.field_k[var14]);
                                  var15_int = 0;
                                  L11: while (true) {
                                    if (var15_int >= var14) {
                                      break L10;
                                    } else {
                                      if (-1 != (var21[var15_int] ^ -1)) {
                                        if (Math.abs(var22[var15_int] - var22[var14]) < 4 + (var23[var14] + var23[var15_int]) / 2) {
                                          if (var21[var14] >= var21[var15_int]) {
                                            var12[var14] = var21[var15_int] + -mi.field_B.field_C;
                                            var15_int++;
                                            continue L11;
                                          } else {
                                            var15_int++;
                                            continue L11;
                                          }
                                        } else {
                                          var15_int++;
                                          continue L11;
                                        }
                                      } else {
                                        var15_int++;
                                        continue L11;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var9 = (ml) ((Object) var8.a(0));
                            continue L5;
                          }
                        }
                      } else {
                        de.a();
                        break L3;
                      }
                    } else {
                      L12: {
                        if (var9 == null) {
                          break L12;
                        } else {
                          if (-13 == (var9.o(-22625) ^ -1)) {
                            break L12;
                          } else {
                            var2 = 0;
                            var10 = var9.g(false);
                            var2 = nj.field_n[var10];
                            var11_int = an.field_f + (-var3 - var6) - -(var9.f(-99) >> this.field_K);
                            var12_int = var5 - (var4 + var6 + -(var9.i((byte) 110) - (var9.p(param0 + -8331) >> -1632296895) >> this.field_K));
                            de.i(var11_int, var12_int, 14 + (var9.p(-8323) >> 1463375137) >> this.field_K, (var2 | 8421504) ^ 8421504);
                            de.i(var11_int, var12_int, var9.p(param0 + -8331) >> -356206879 >> this.field_K, var2);
                            de.c(var11_int, var12_int, 14 + (var9.p(-8323) >> 1063532353) >> this.field_K, 8421504 ^ (var2 | 8421504));
                            gn.a(14 + (var9.p(-8323) >> -106397151) >> this.field_K, (byte) 72, 255, var11_int, var12_int);
                            if (var9.y(param0 + 17563) != this.field_V.d(false)) {
                              break L12;
                            } else {
                              L13: {
                                if (-5 == (this.field_K ^ -1)) {
                                  tg.field_b[3].b(-3 + var11_int, var12_int - (var9.p(-8323) >> this.field_K + 1) - 8);
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              if ((this.field_K ^ -1) != -3) {
                                break L12;
                              } else {
                                tg.field_b[6].a(var11_int + -16, 8 + var12_int);
                                break L12;
                              }
                            }
                          }
                        }
                      }
                      var9 = (ml) ((Object) var8.b((byte) 53));
                      continue L4;
                    }
                  }
                } else {
                  break L3;
                }
              }
            }
            de.a();
            break L0;
          } else {
            break L0;
          }
        }
        L14: {
          if (param0 == 8) {
            break L14;
          } else {
            this.field_G = true;
            break L14;
          }
        }
    }

    final static void c(int param0, boolean param1) {
        if (!(kh.field_c == null)) {
            fk.a(0, kh.field_c);
        }
        if (eo.field_c != null) {
            eo.field_c.a(param0 ^ -22718, param1);
        }
        ji.a(param1, (byte) -101);
        if (!(db.field_a == null)) {
            db.field_a.a(param1, true);
        }
        ed.a((byte) 90, param1);
        if (param0 != 1) {
            field_A = (String) null;
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        ml var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        qb var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11_int = 0;
        qb var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_20_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_160_0 = 0;
        int stackOut_159_0 = 0;
        int stackOut_158_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        L0: {
          var15 = ArcanistsMulti.field_G ? 1 : 0;
          var5 = -120 / ((param0 - 58) / 53);
          var4 = n.field_g.field_nb;
          if (ti.field_N < 0) {
            break L0;
          } else {
            if (ti.field_N == -1) {
              break L0;
            } else {
              if (null != eb.field_b) {
                break L0;
              } else {
                var6_int = rd.field_e[ti.field_N];
                if (1 != var6_int) {
                  break L0;
                } else {
                  if (999 == (this.field_s ^ -1)) {
                    if (this.field_V.c((byte) 89)) {
                      break L0;
                    } else {
                      var7 = an.field_g;
                      var8 = me.field_I;
                      tg.field_b[5].b().a(var7, var8, this.field_P << -1048402744, 4096 - Math.abs(this.field_P - 128));
                      break L0;
                    }
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
        }
        L1: {
          L2: {
            if (this.field_V.d(false) == this.field_I) {
              break L2;
            } else {
              if (!this.field_ab) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          var6 = this.field_V.a(this.field_bb, true);
          if (var6 != null) {
            var7 = var6.f(-98);
            var8 = var6.i((byte) -5);
            if (this.field_s == -1000) {
              L3: {
                if ((ti.field_N ^ -1) == -3) {
                  break L3;
                } else {
                  if ((ti.field_N ^ -1) == -82) {
                    break L3;
                  } else {
                    if ((ti.field_N ^ -1) == -32) {
                      break L3;
                    } else {
                      if (-61 == (ti.field_N ^ -1)) {
                        break L3;
                      } else {
                        if (-56 == (ti.field_N ^ -1)) {
                          break L3;
                        } else {
                          if (91 == ti.field_N) {
                            break L3;
                          } else {
                            if (-115 == (ti.field_N ^ -1)) {
                              break L3;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L4: {
                var9 = uj.field_i[0];
                if (55 != ti.field_N) {
                  break L4;
                } else {
                  var9 = uj.field_i[1];
                  break L4;
                }
              }
              L5: {
                if ((ti.field_N ^ -1) == -32) {
                  var9 = uj.field_i[2];
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (ti.field_N == 60) {
                  var9 = uj.field_i[3];
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (81 == ti.field_N) {
                  var9 = uj.field_i[4];
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (ti.field_N == 91) {
                  var9 = uj.field_i[5];
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (114 == ti.field_N) {
                  var9 = uj.field_i[6];
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (!this.field_V.a(ti.field_N, var6.i((byte) 116), var6, (byte) 91, var6.f(45))) {
                  stackOut_159_0 = 16711680;
                  stackIn_160_0 = stackOut_159_0;
                  break L10;
                } else {
                  stackOut_158_0 = 65280;
                  stackIn_160_0 = stackOut_158_0;
                  break L10;
                }
              }
              var10 = stackIn_160_0;
              var11 = new qb(16 + var9.field_n, 16 + var9.field_w);
              var11.a();
              var9.a(8, 8, var10);
              de.d(5, 5, 0, 0, var11.field_n, var11.field_w);
              ce.field_m.a(true);
              var11.b(-param1 + (-(var9.field_n / 2) + var7 + (an.field_f >> -217107199) + -8), var8 + (-var9.field_w + (-param2 + (var4 >> -318371455)) - 8), 256);
              var9.a((an.field_f >> -867709951) + var7 + (-(var9.field_n / 2) - param1), (var4 >> 885446209) + (var8 + -var9.field_w + -param2), var10);
              var9.c(-param1 + (var7 - var9.field_n / 2 - -(an.field_f >> 353137025)), -param2 + var8 - (var9.field_w - (var4 >> 1558397409)), 128);
              break L1;
            } else {
              if ((ti.field_N ^ -1) == -79) {
                L11: {
                  var9_int = -(go.field_j[29].field_g / 2) + ((an.field_f >> 1328288673) + (this.field_s - param1));
                  var10 = (var4 >> -712293119) + this.field_r - param2 - go.field_j[29].field_k;
                  if (this.field_V.a(var6, this.field_r, this.field_s, -5)) {
                    break L11;
                  } else {
                    go.field_j[29].b().a(var9_int, var10, 16711680);
                    break L11;
                  }
                }
                go.field_j[29].a(var9_int, var10, 64);
                break L1;
              } else {
                if (-5 == (ti.field_N ^ -1)) {
                  L12: {
                    var9_int = var6.p(-8323);
                    if (this.field_V.b(this.field_s, var6, -16, this.field_r)) {
                      stackOut_125_0 = 65280;
                      stackIn_126_0 = stackOut_125_0;
                      break L12;
                    } else {
                      stackOut_124_0 = 16711680;
                      stackIn_126_0 = stackOut_124_0;
                      break L12;
                    }
                  }
                  var10 = stackIn_126_0;
                  ce.field_m.a(true);
                  de.h(-param1 - -(an.field_f >> -798828255), (var4 >> -1515849695) + -param2, (an.field_f >> 1195920353) + (-param1 + this.field_V.field_y), this.field_V.field_H + -param2 + (var4 >> 855847169));
                  de.a();
                  var11_int = -param1 + (this.field_s - -(an.field_f >> 217096449));
                  var12 = -param2 + (this.field_r + ((var4 >> 13925697) - (var9_int >> 420777921)));
                  de.c(var11_int, var12, var9_int >> 257800417, var10, 128);
                  gn.a(var9_int >> 1945750849, (byte) 100, 128 + Math.abs(-16 + (this.field_P & 31)) * 3, var11_int, var12);
                  if (!this.field_V.c((byte) 89)) {
                    tg.field_b[5].b().a(var11_int, var12, this.field_P << -1411215064, var9_int * (4096 - 64 * Math.abs((this.field_P & 31) + -16)) / 32);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  if (ti.field_N != 150) {
                    L13: {
                      if (-57 == (ti.field_N ^ -1)) {
                        break L13;
                      } else {
                        if ((ti.field_N ^ -1) == -58) {
                          break L13;
                        } else {
                          if (ti.field_N == 32) {
                            break L13;
                          } else {
                            if (33 == ti.field_N) {
                              break L13;
                            } else {
                              if ((ti.field_N ^ -1) == -43) {
                                break L13;
                              } else {
                                if (-18 == (ti.field_N ^ -1)) {
                                  break L13;
                                } else {
                                  if (ti.field_N == 23) {
                                    break L13;
                                  } else {
                                    if (-60 == (ti.field_N ^ -1)) {
                                      break L13;
                                    } else {
                                      if ((ti.field_N ^ -1) == -48) {
                                        break L13;
                                      } else {
                                        if ((ti.field_N ^ -1) == -66) {
                                          break L13;
                                        } else {
                                          if (-68 == (ti.field_N ^ -1)) {
                                            break L13;
                                          } else {
                                            if (ti.field_N == 64) {
                                              break L13;
                                            } else {
                                              if ((ti.field_N ^ -1) == -45) {
                                                break L13;
                                              } else {
                                                if ((ti.field_N ^ -1) == -77) {
                                                  break L13;
                                                } else {
                                                  if ((ti.field_N ^ -1) == -78) {
                                                    break L13;
                                                  } else {
                                                    if ((ti.field_N ^ -1) == -7) {
                                                      break L13;
                                                    } else {
                                                      if (79 == ti.field_N) {
                                                        break L13;
                                                      } else {
                                                        if ((ti.field_N ^ -1) == -99) {
                                                          break L13;
                                                        } else {
                                                          if ((ti.field_N ^ -1) == -91) {
                                                            break L13;
                                                          } else {
                                                            if ((ti.field_N ^ -1) == -105) {
                                                              break L13;
                                                            } else {
                                                              if (-93 == (ti.field_N ^ -1)) {
                                                                break L13;
                                                              } else {
                                                                if (107 == ti.field_N) {
                                                                  break L13;
                                                                } else {
                                                                  if (112 == ti.field_N) {
                                                                    break L13;
                                                                  } else {
                                                                    if (ti.field_N == 118) {
                                                                      break L13;
                                                                    } else {
                                                                      if (9 != ti.field_N) {
                                                                        if ((ti.field_N ^ -1) != -6) {
                                                                          if ((ti.field_N ^ -1) == -31) {
                                                                            L14: {
                                                                              if (this.field_V.a(this.field_s, var6, 30882, this.field_r)) {
                                                                                stackOut_65_0 = 65280;
                                                                                stackIn_66_0 = stackOut_65_0;
                                                                                break L14;
                                                                              } else {
                                                                                stackOut_64_0 = 16711680;
                                                                                stackIn_66_0 = stackOut_64_0;
                                                                                break L14;
                                                                              }
                                                                            }
                                                                            var9_int = stackIn_66_0;
                                                                            bg.field_e.a(-(bg.field_e.field_n >> -646388831) + ((an.field_f >> -2081649343) + -param1 + this.field_s), (var4 >> 639158721) + (-param2 + (this.field_r - bg.field_e.field_w)), var9_int);
                                                                            bg.field_e.c(-param1 + this.field_s - -(an.field_f >> 1174124513) - (bg.field_e.field_n >> -346069279), -bg.field_e.field_w + (this.field_r - (param2 - (var4 >> -463104799))), 128);
                                                                            break L1;
                                                                          } else {
                                                                            if (0 == (ti.field_N ^ -1)) {
                                                                              break L1;
                                                                            } else {
                                                                              var9_int = -param1 + this.field_s + (an.field_f >> 295157441);
                                                                              var10 = -param2 + this.field_r - -(var4 >> -390360255);
                                                                              tg.field_b[5].b().a(var9_int, var10, this.field_P << -953705144, -Math.abs(-128 + this.field_P) + 4096);
                                                                              break L1;
                                                                            }
                                                                          }
                                                                        } else {
                                                                          L15: {
                                                                            L16: {
                                                                              if (!this.field_V.a(false, this.field_s, this.field_r)) {
                                                                                break L16;
                                                                              } else {
                                                                                if (!this.field_V.a(false, var6.f(100), -32 + var6.i((byte) -65) - var6.p(-8323))) {
                                                                                  break L16;
                                                                                } else {
                                                                                  stackOut_55_0 = 65280;
                                                                                  stackIn_57_0 = stackOut_55_0;
                                                                                  break L15;
                                                                                }
                                                                              }
                                                                            }
                                                                            stackOut_56_0 = 16711680;
                                                                            stackIn_57_0 = stackOut_56_0;
                                                                            break L15;
                                                                          }
                                                                          var9_int = stackIn_57_0;
                                                                          ce.field_m.a(true);
                                                                          var10 = 32;
                                                                          var11_int = (an.field_f >> -324234367) + -param1 + var7;
                                                                          var12 = (var4 >> 132038113) + var8 - param2 - (var6.p(-8323) - -32);
                                                                          de.c(var11_int, var12, var10 >> 61031137, var9_int, 128);
                                                                          gn.a(var10 >> -1645074943, (byte) 63, 128 + 3 * Math.abs((this.field_P & 31) + -16), var11_int, var12);
                                                                          var13 = this.field_s - param1 - -(an.field_f >> -1130629183);
                                                                          var14 = (var4 >> -2136676671) + (this.field_r - param2) + -(var10 >> -1518423199);
                                                                          de.c(var13, var14, var10 >> 1937218049, var9_int, 128);
                                                                          gn.a(var10 >> -441540127, (byte) 125, 128 + Math.abs(-16 + (this.field_P & 31)) * 3, var13, var14);
                                                                          if (!this.field_V.c((byte) 89)) {
                                                                            tg.field_b[5].b().a(var13, var14, this.field_P << -485192952, (4096 - 64 * Math.abs((this.field_P & 31) + -16)) * var10 / 32);
                                                                            break L1;
                                                                          } else {
                                                                            break L1;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L17: {
                                                                          if (this.field_V.a(false, this.field_s, this.field_r)) {
                                                                            stackOut_49_0 = 65280;
                                                                            stackIn_50_0 = stackOut_49_0;
                                                                            break L17;
                                                                          } else {
                                                                            stackOut_48_0 = 16711680;
                                                                            stackIn_50_0 = stackOut_48_0;
                                                                            break L17;
                                                                          }
                                                                        }
                                                                        var9_int = stackIn_50_0;
                                                                        ce.field_m.a(true);
                                                                        var10 = 32;
                                                                        var11_int = (an.field_f >> 1352292737) + (-param1 + this.field_s);
                                                                        var12 = -(var10 >> -1349047295) + (-param2 + this.field_r - -(var4 >> -2023381375));
                                                                        de.c(var11_int, var12, var10 >> -854135615, var9_int, 128);
                                                                        gn.a(var10 >> -2026415711, (byte) 94, Math.abs((31 & this.field_P) + -16) * 3 - -128, var11_int, var12);
                                                                        if (this.field_V.c((byte) 89)) {
                                                                          break L1;
                                                                        } else {
                                                                          tg.field_b[5].b().a(var11_int, var12, this.field_P << -1147339096, (4096 - 64 * Math.abs((this.field_P & 31) - 16)) * var10 / 32);
                                                                          break L1;
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
                    L18: {
                      var9_int = 32;
                      if (ti.field_N == 4) {
                        var9_int = var6.p(-8323);
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    L19: {
                      if (-58 != (ti.field_N ^ -1)) {
                        break L19;
                      } else {
                        var9_int = 64;
                        break L19;
                      }
                    }
                    L20: {
                      if ((ti.field_N ^ -1) == -34) {
                        var9_int = 64;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    L21: {
                      if ((ti.field_N ^ -1) == -43) {
                        var9_int = 64;
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    L22: {
                      if ((ti.field_N ^ -1) != -24) {
                        break L22;
                      } else {
                        var9_int = 100;
                        break L22;
                      }
                    }
                    L23: {
                      if (-60 != (ti.field_N ^ -1)) {
                        break L23;
                      } else {
                        var9_int = 100;
                        break L23;
                      }
                    }
                    L24: {
                      if (ti.field_N != 47) {
                        break L24;
                      } else {
                        var9_int = 100;
                        break L24;
                      }
                    }
                    L25: {
                      if ((ti.field_N ^ -1) == -66) {
                        var9_int = 48;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    L26: {
                      if (67 != ti.field_N) {
                        break L26;
                      } else {
                        var9_int = 48;
                        break L26;
                      }
                    }
                    L27: {
                      if (ti.field_N != 76) {
                        break L27;
                      } else {
                        var9_int = 80;
                        break L27;
                      }
                    }
                    L28: {
                      if (ti.field_N == 77) {
                        var9_int = 48;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    L29: {
                      if (ti.field_N == 6) {
                        var9_int = 96;
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                    L30: {
                      if (ti.field_N == 79) {
                        var9_int = 96;
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                    L31: {
                      if (98 != ti.field_N) {
                        break L31;
                      } else {
                        var9_int = 96;
                        break L31;
                      }
                    }
                    L32: {
                      if (-91 == (ti.field_N ^ -1)) {
                        var9_int = 64;
                        break L32;
                      } else {
                        break L32;
                      }
                    }
                    L33: {
                      if ((ti.field_N ^ -1) == -108) {
                        var9_int = 128;
                        break L33;
                      } else {
                        break L33;
                      }
                    }
                    L34: {
                      if ((ti.field_N ^ -1) == -105) {
                        var9_int = 32;
                        break L34;
                      } else {
                        break L34;
                      }
                    }
                    L35: {
                      if (ti.field_N == 92) {
                        var9_int = 96;
                        break L35;
                      } else {
                        break L35;
                      }
                    }
                    L36: {
                      if (-119 == (ti.field_N ^ -1)) {
                        var9_int = 100;
                        break L36;
                      } else {
                        break L36;
                      }
                    }
                    L37: {
                      if (this.field_V.a(false, var6, ti.field_N, this.field_r, this.field_s)) {
                        stackOut_119_0 = 65280;
                        stackIn_120_0 = stackOut_119_0;
                        break L37;
                      } else {
                        stackOut_118_0 = 16711680;
                        stackIn_120_0 = stackOut_118_0;
                        break L37;
                      }
                    }
                    var10 = stackIn_120_0;
                    ce.field_m.a(true);
                    de.h(-param1 - -(an.field_f >> -536856095), -param2 - -(var4 >> -393797535), (an.field_f >> -548660575) + (-param1 - -this.field_V.field_y), (var4 >> 548644737) + (-param2 + this.field_V.field_H));
                    var11_int = -param1 + (var7 + (an.field_f >> 355332865));
                    var12 = (var4 >> -1657461215) + var8 + (-param2 + -(var9_int >> -683056095));
                    gn.a((var9_int >> 532077153) + 128, (byte) 88, -(128 + Math.abs(-16 + (31 & this.field_P)) * 3), var11_int, var12);
                    de.a();
                    var13 = (an.field_f >> -1668702143) + this.field_s - param1;
                    var14 = -(var9_int >> -1833395071) + ((var4 >> 917736481) + (-param2 + this.field_r));
                    de.c(var13, var14, var9_int >> 1297612641, var10, 128);
                    gn.a(var9_int >> 304741217, (byte) 73, Math.abs(-16 + (31 & this.field_P)) * 3 - -128, var13, var14);
                    if (!this.field_V.c((byte) 89)) {
                      tg.field_b[5].b().a(var13, var14, this.field_P << 89626312, var9_int * (4096 - 64 * Math.abs(-16 + (this.field_P & 31))) / 32);
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    L38: {
                      var9_int = var6.p(-8323);
                      if (this.field_V.a(this.field_s, this.field_V.field_H - 16, (byte) -75, var6)) {
                        stackOut_19_0 = 65280;
                        stackIn_20_0 = stackOut_19_0;
                        break L38;
                      } else {
                        stackOut_18_0 = 16711680;
                        stackIn_20_0 = stackOut_18_0;
                        break L38;
                      }
                    }
                    var10 = stackIn_20_0;
                    ce.field_m.a(true);
                    de.h((an.field_f >> 1867039425) + -param1, (var4 >> 471174177) + -param2, this.field_V.field_y + -param1 + (an.field_f >> 1160506721), (var4 >> -1858825407) + (this.field_V.field_H + -param2));
                    de.a();
                    var11_int = (an.field_f >> -2048079903) + (this.field_s - param1);
                    var12 = (var4 >> 194689985) + -param2 + this.field_V.field_H + (-16 + -(var9_int >> 1358143937));
                    de.c(var11_int, var12, var9_int >> -386938239, var10, 128);
                    gn.a(var9_int >> 1740083905, (byte) 78, 3 * Math.abs(-16 + (this.field_P & 31)) - -128, var11_int, var12);
                    if (this.field_V.c((byte) 89)) {
                      break L1;
                    } else {
                      tg.field_b[5].b().a(var11_int, var12, this.field_P << -597832120, var9_int * (-(Math.abs((this.field_P & 31) - 16) * 64) + 4096) / 32);
                      break L1;
                    }
                  }
                }
              }
            }
          } else {
            break L1;
          }
        }
    }

    private final boolean f(boolean param0) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            this.field_n = -11;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_o) {
              break L2;
            } else {
              L3: {
                if (this.r(-87)) {
                  break L3;
                } else {
                  if (!this.field_k) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final boolean e(byte param0) {
        if (param0 >= -75) {
            this.g(66);
        }
        return this.a(df.field_z, on.field_g, 0, fj.field_h);
    }

    private final boolean b(boolean param0) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        if (!param0) {
          L0: {
            L1: {
              if (this.field_o) {
                break L1;
              } else {
                L2: {
                  if (this.r(-40)) {
                    break L2;
                  } else {
                    if (!this.field_k) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L0;
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return true;
        }
    }

    final void m(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = ArcanistsMulti.field_G ? 1 : 0;
          if (ij.field_Tb != null) {
            break L0;
          } else {
            ij.field_Tb = new qb(640, 480);
            break L0;
          }
        }
        L1: {
          ij.field_Tb.a();
          var2 = wm.a(this.field_V.a(-31497), (byte) -124);
          var3 = ng.b((byte) -124, this.field_V.a(-31497));
          nb.field_a = var2;
          cg.field_Lb = var3;
          de.c(0, 0, 640, 480, var2, var3);
          if (null != e.field_M[this.field_V.a(-31497)]) {
            break L1;
          } else {
            ue.field_d.field_f = 0;
            af.a(tj.a(115, new String[]{Integer.toString(this.field_V.a(-31497))}, "background<%0>"), "", 19412, ue.field_d).b(0, 0, 640, 480);
            break L1;
          }
        }
        L2: {
          if (param0 == 413355681) {
            break L2;
          } else {
            this.field_S = 49;
            break L2;
          }
        }
        de.d(2, 2, 0, 0, 640, 480);
        var4 = 0;
        L3: while (true) {
          if (var4 >= ij.field_Tb.field_A.length) {
            return;
          } else {
            if (ij.field_Tb.field_A[var4] == 0) {
              ij.field_Tb.field_A[var4] = 1;
              var4++;
              continue L3;
            } else {
              var4++;
              continue L3;
            }
          }
        }
    }

    private final void b(int param0, int param1, int param2) {
        ml var6 = null;
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 > -50) {
            this.field_p = -101;
        }
        int var4 = n.field_g.field_nb;
        vn var5 = this.field_V.g((byte) 115);
        if (!(var5 == null)) {
            var6 = (ml) ((Object) var5.b(12623));
            while (var6 != null) {
                var6.a(2, -param2 - -(var4 >> -1394999679), (an.field_f >> -1522253151) + -param0);
                var6 = (ml) ((Object) var5.a(0));
            }
        }
    }

    private final void a(byte param0, ml param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
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
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var18 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == -7) {
              L1: {
                var3_int = n.field_g.field_nb;
                var4 = -(an.field_f >> -1810272479) + (vn.field_c + an.field_g);
                var5 = -(var3_int >> 947012673) + ol.field_g + me.field_I;
                if ((this.field_u ^ -1) >= -1) {
                  break L1;
                } else {
                  var5 = this.field_c;
                  var4 = this.field_e;
                  break L1;
                }
              }
              L2: {
                var6 = param1.f(45);
                var7 = param1.i((byte) 114);
                var8 = param1.p(-8323);
                var9 = -var6 + var4;
                var10 = (var8 >> 2084825697) + -var7 + var5;
                var11 = (int)Math.sqrt((double)(var10 * var10 + var9 * var9));
                if (0 != var11) {
                  break L2;
                } else {
                  var10 = -1;
                  var11 = 1;
                  break L2;
                }
              }
              L3: {
                if (!this.field_V.a(true)) {
                  L4: {
                    if ((var9 ^ -1) >= -1) {
                      param1.field_E = -1;
                      break L4;
                    } else {
                      param1.field_E = 1;
                      break L4;
                    }
                  }
                  L5: {
                    if (-156 != (ti.field_N ^ -1)) {
                      break L5;
                    } else {
                      if (Math.abs(var9) < Math.abs(var10)) {
                        L6: {
                          var9 = param1.field_E * 64;
                          if (var10 < 0) {
                            var10 = -64;
                            break L6;
                          } else {
                            var10 = 64;
                            break L6;
                          }
                        }
                        var11 = (int)Math.sqrt((double)(var9 * var9 + var10 * var10));
                        if (var11 != 0) {
                          break L5;
                        } else {
                          var11 = 1;
                          var10 = -1;
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                  var12 = param1.p(param0 ^ 8324) / 2;
                  var15 = 0;
                  L7: while (true) {
                    if (100 <= var15) {
                      break L3;
                    } else {
                      L8: {
                        var16 = var12 - -(var15 / 4);
                        var14 = -var12 + var10 * var16 / var11;
                        var13 = var16 * var9 / var11;
                        var17 = 0;
                        if (var15 >= 25) {
                          var17 = var17 | 16711680;
                          if ((var15 ^ -1) <= -76) {
                            var17 = var17 | 65280;
                            if ((var15 ^ -1) <= -101) {
                              var17 = var17 | 255;
                              break L8;
                            } else {
                              var17 = var17 | 10 * var15 + -750 & 255;
                              break L8;
                            }
                          } else {
                            var17 = var17 | (255 & -125 + var15 * 5) << -1283761080;
                            break L8;
                          }
                        } else {
                          var17 = var17 | (255 & var15 * 10) << -641383728;
                          break L8;
                        }
                      }
                      L9: {
                        if (10 >= var15) {
                          de.c((an.field_f >> -497476959) + (var13 + var6 + -vn.field_c), var14 + var7 - (ol.field_g + -(var3_int >> 1596683169)), 1600 / (200 + -(var15 * 100 / 100)), var17, var15);
                          break L9;
                        } else {
                          de.c((an.field_f >> -985633279) + var6 - (-var13 + vn.field_c), (var3_int >> -2022663583) + var14 + var7 + -ol.field_g, 1600 / (200 - var15 * 100 / 100), var17, 10);
                          break L9;
                        }
                      }
                      var15++;
                      continue L7;
                    }
                  }
                } else {
                  break L3;
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
          L10: {
            var3 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) (var3);
            stackOut_34_1 = new StringBuilder().append("le.UA(").append(param0).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param1 == null) {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L10;
            } else {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L10;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static qb[] a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != 1) {
            field_E = (kc) null;
        }
        return th.a(param4, 1, 3, param0, param2 + -32574, param3, 1, 1, param1);
    }

    private final void a(int param0) {
        int var2 = -52 / ((-45 - param0) / 63);
        he.field_e.b((byte) -78, 63);
        he.field_e.f(this.field_V.n((byte) -75), (byte) -10);
        this.field_V.e(true);
        this.field_w.e(true);
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7, int param8) {
        this.field_f = new ge(this.field_I, param3, param1, param4, param6, param7, param0, param8);
        this.field_W = param2;
        this.field_x = 50;
        if (param5 != -30) {
            this.field_r = 83;
        }
        ob.a(20, this.field_f, param2);
    }

    private final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = ArcanistsMulti.field_G ? 1 : 0;
          var2 = n.field_g.field_nb;
          var3 = 16777215;
          if (0 >= this.field_V.field_G) {
            break L0;
          } else {
            var3 = 16711680;
            break L0;
          }
        }
        de.e((an.field_f >> -2135483775) + -vn.field_c + -8, (var2 >> 1700756897) + (-ol.field_g + -8), 8, 8, var3, 64);
        de.e(-vn.field_c - (-(an.field_f >> -597354623) + -this.field_V.field_y), -8 + (-ol.field_g + (var2 >> -20978431)), 8, 8, var3, 64);
        de.h(-vn.field_c + (an.field_f >> 1573945889), -8 + (var2 >> -1696482303) + (-ol.field_g + param0), this.field_V.field_y + (-vn.field_c - -(an.field_f >> 1766458849)), an.field_j);
        var4 = ((255 & jb.field_v) >> 632843522) + -64;
        L1: while (true) {
          if (8 + this.field_V.field_y < var4) {
            de.h(-vn.field_c - -(an.field_f >> -1825371967) + -8, (var2 >> -346236575) + 0 + -ol.field_g, (an.field_f >> 614824193) + (-vn.field_c - -this.field_V.field_y) - -8, an.field_j);
            var4 = -64 - ((jb.field_v & 255) >> 938216258);
            L2: while (true) {
              if (var4 > this.field_V.field_H) {
                var4 = -64 - -(jb.field_v >> -2136401790 & 63);
                L3: while (true) {
                  if (var4 > this.field_V.field_H) {
                    de.a();
                    return;
                  } else {
                    de.e((an.field_f >> 2056752449) + (this.field_V.field_y - vn.field_c), -4 + ((var2 >> -1280961631) + (var4 - ol.field_g)), 8, 32, var3, 64);
                    var4 += 64;
                    continue L3;
                  }
                }
              } else {
                de.e(-8 + (-vn.field_c + 0) - -(an.field_f >> 614757537), var4 - (ol.field_g - ((var2 >> 1493398721) - 4)), 8, 32, var3, 64);
                var4 += 64;
                continue L2;
              }
            }
          } else {
            de.e((an.field_f >> 468029729) + (-vn.field_c + var4), (var2 >> 1874523745) + (0 + -ol.field_g) - 8, 32, 8, var3, 64);
            var4 += 64;
            continue L1;
          }
        }
    }

    private final boolean b(byte param0) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 == -116) {
            break L0;
          } else {
            this.field_O = true;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_o) {
              break L2;
            } else {
              L3: {
                if (this.r(param0 ^ 45)) {
                  break L3;
                } else {
                  if (!this.field_k) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    private final void i(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_h <= 0) {
            throw new IllegalStateException();
        }
        if (this.field_ab) {
            fieldTemp$0 = this.field_p + 1;
            this.field_p = this.field_p + 1;
            p.a(this.field_V.n((byte) -75), this.field_R, (byte) 11, 158, this.field_r, this.field_h, this.field_bb, 0, fieldTemp$0);
        }
        if (param0 != 2000) {
            this.field_T = false;
        }
        this.field_h = 0;
    }

    private final void a(wk param0, int param1, int param2) {
        ml var5 = null;
        try {
            if (param2 != 8888) {
                this.b(111, -81, -109);
            }
            this.field_z = -param1 + param0.n(param2 ^ -8922);
            if ((this.field_z ^ -1) > -2) {
                this.field_z = 1;
            }
            if (this.field_k) {
                this.field_k = false;
                this.field_V.a((byte) 112, this.field_w);
                this.field_V.field_rb = uk.field_g;
                this.field_V.field_sb = cf.field_h;
                this.field_C = true;
                this.field_bb = this.field_V.d(false);
                var5 = this.field_V.a(this.field_V.d(false), true);
                if (var5 != null) {
                    this.field_m.a(-111, var5);
                } else {
                    this.field_m.a(0);
                }
                this.field_t = false;
                this.field_s = -1000;
            }
            this.field_o = true;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "le.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final boolean l(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        if (param0 == -8712) {
          L0: {
            L1: {
              if (this.field_o) {
                break L1;
              } else {
                L2: {
                  if (this.r(-95)) {
                    break L2;
                  } else {
                    if (!this.field_k) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L0;
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return false;
        }
    }

    final void p(int param0) {
        if (!(this.field_ab)) {
            throw new IllegalStateException();
        }
        if (param0 != 26873) {
            return;
        }
        he.field_e.b((byte) -74, 60);
    }

    final void a(boolean param0) {
        if (!this.field_ab) {
            throw new IllegalStateException();
        }
        if (!param0) {
            this.field_a = -59;
        }
        he.field_e.b((byte) -24, 59);
    }

    final void a(boolean param0, int param1) {
        ml discarded$0 = null;
        if (param1 != -26449) {
            discarded$0 = this.q(-86);
        }
        this.a(param0, an.field_j, 0, true, 0, 96, an.field_f);
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var9_ref_int__ = null;
        int var10 = 0;
        ll var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        L0: {
          var15 = ArcanistsMulti.field_G ? 1 : 0;
          de.b();
          var5 = 0;
          param0 = param0 + ue.b((byte) -32);
          var7 = an.field_j;
          var7 = n.field_g.field_nb;
          var8 = this.field_V.b(true);
          var6 = -(param3 - -240) * (-an.field_j + 960) / 1440;
          var5 = (an.field_f - 1280) * (var8 + param0) / (2 * var8 + this.field_V.field_y);
          if ((var6 ^ -1) >= -1) {
            break L0;
          } else {
            var6 = 0;
            break L0;
          }
        }
        L1: {
          if (960 < an.field_j) {
            ij.field_Tb.c(var5, 0, 1280, an.field_j);
            break L1;
          } else {
            ij.field_Tb.c(var5, var6, 1280, 960);
            break L1;
          }
        }
        L2: {
          ge.field_r = ge.field_r + 1;
          if (-129 > (ge.field_r ^ -1)) {
            ge.field_r = ge.field_r - 128;
            break L2;
          } else {
            break L2;
          }
        }
        var9 = 0;
        L3: while (true) {
          if (an.field_f <= var9) {
            var9 = 0;
            L4: while (true) {
              if (an.field_f <= var9) {
                L5: {
                  if (param1 <= -82) {
                    break L5;
                  } else {
                    this.field_V = (nf) null;
                    break L5;
                  }
                }
                var9 = 0;
                L6: while (true) {
                  if (var9 >= an.field_f) {
                    L7: {
                      L8: {
                        if (!td.e(true)) {
                          break L8;
                        } else {
                          if (this.field_T) {
                            this.field_V.m((byte) 69).b((an.field_f >> 367873601) + -param0, -param3 - -(var7 >> 1603102945), this.field_V.field_y, this.field_V.field_H);
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        var9_ref_int__ = this.field_V.field_V.field_l;
                        if (null != this.field_V.field_pb) {
                          this.field_V.field_V.field_l = this.field_V.field_pb;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      this.field_V.field_V.a((an.field_f >> 1646943201) + -param0, -param3 - -(var7 >> 979099361));
                      this.field_V.field_V.field_l = var9_ref_int__;
                      break L7;
                    }
                    L10: {
                      if (null != this.field_V.field_V) {
                        L11: {
                          var9 = 0;
                          var10 = 0;
                          var11 = this.field_V.m((byte) 69);
                          gd.field_tb = gd.field_tb + 1;
                          if (-1 + this.field_V.field_y <= gd.field_tb) {
                            gd.field_tb = 0;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        L12: {
                          var12 = gd.field_tb - 2 * (1 & gd.field_tb) - -1;
                          if ((var12 ^ -1) <= -1) {
                            break L12;
                          } else {
                            var12 = 0;
                            break L12;
                          }
                        }
                        L13: {
                          if (var12 >= -1 + this.field_V.field_y) {
                            var12 = this.field_V.field_y + -1;
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        var10 = (gd.field_tb >> -2089386335) + this.field_V.field_hb;
                        var13 = 2 * (gd.field_tb & 1) + -1;
                        var9 = gd.field_tb + 2 * this.field_V.field_y;
                        var14 = 2;
                        L14: while (true) {
                          if (var14 >= this.field_V.field_H + -2) {
                            break L10;
                          } else {
                            L15: {
                              if (var11.field_m[var10] != 0) {
                                if (this.field_V.field_V.field_m[var9] != 0) {
                                  break L15;
                                } else {
                                  if (-1 == (var11.field_m[var10 + var13] ^ -1)) {
                                    break L15;
                                  } else {
                                    if (var11.field_m[-this.field_V.field_hb + var10] == 0) {
                                      break L15;
                                    } else {
                                      if ((var11.field_m[var10] ^ -1) != 0) {
                                        this.field_V.field_V.field_m[var9] = var11.field_m[var10];
                                        break L15;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (var11.field_m[var10 + var13] != 0) {
                                  break L15;
                                } else {
                                  if (-1 == (var11.field_m[var10 + -this.field_V.field_hb] ^ -1)) {
                                    this.field_V.field_V.field_m[var9] = (byte) 0;
                                    break L15;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                            }
                            L16: {
                              var9 = var9 + this.field_V.field_y;
                              if (-1 != (var11.field_m[var10] ^ -1)) {
                                if (-1 != (this.field_V.field_V.field_m[var9] ^ -1)) {
                                  break L16;
                                } else {
                                  if (-1 == (var11.field_m[var10 - -var13] ^ -1)) {
                                    break L16;
                                  } else {
                                    if (var11.field_m[var10 + this.field_V.field_hb] == 0) {
                                      break L16;
                                    } else {
                                      if ((var11.field_m[var10] ^ -1) != 0) {
                                        this.field_V.field_V.field_m[var9] = var11.field_m[var10];
                                        break L16;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (0 != var11.field_m[var10 - -var13]) {
                                  break L16;
                                } else {
                                  if (var11.field_m[this.field_V.field_hb + var10] == 0) {
                                    this.field_V.field_V.field_m[var9] = (byte) 0;
                                    break L16;
                                  } else {
                                    var10 = var10 + this.field_V.field_hb;
                                    var9 = var9 + this.field_V.field_y;
                                    var14 += 2;
                                    continue L14;
                                  }
                                }
                              }
                            }
                            var10 = var10 + this.field_V.field_hb;
                            var9 = var9 + this.field_V.field_y;
                            var14 += 2;
                            continue L14;
                          }
                        }
                      } else {
                        break L10;
                      }
                    }
                    return;
                  } else {
                    L17: {
                      var10 = (int)Math.abs(Math.sin(3.141592653589793 * (double)(var9 + ge.field_r * 2 - -param0) / 64.0) * 16.0);
                      if (ge.field_r < 64) {
                        var10 = (ge.field_r - 32) * var10 / 32;
                        break L17;
                      } else {
                        var10 = var10 * (96 + -ge.field_r) / 32;
                        break L17;
                      }
                    }
                    L18: {
                      if (-1 > (var10 ^ -1)) {
                        var10 = -var10;
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    var10 += 16;
                    var10 = (int)((double)var10 + (Math.sin((double)ge.field_r * 3.141592653589793 / 64.0) * 8.0 + 32.0));
                    de.f(var9, -var10 + (-param3 + this.field_V.field_H - -(var7 >> 1076409121)), var10, param2 | 16448, 128);
                    var9++;
                    continue L6;
                  }
                }
              } else {
                L19: {
                  var10 = (int)Math.abs(Math.cos((double)(ge.field_r + (var9 + param0)) * 3.141592653589793 / 64.0) * 14.0);
                  if (-65 < (ge.field_r ^ -1)) {
                    var10 = var10 * (ge.field_r - 32) / 32;
                    break L19;
                  } else {
                    var10 = var10 * (96 + -ge.field_r) / 32;
                    break L19;
                  }
                }
                L20: {
                  if (-1 <= (var10 ^ -1)) {
                    break L20;
                  } else {
                    var10 = -var10;
                    break L20;
                  }
                }
                var10 += 20;
                var10 = (int)((double)var10 + (8.0 * Math.sin((double)ge.field_r * 3.141592653589793 / 64.0) + 32.0));
                de.d(var9, -param3 + this.field_V.field_H - (-(var7 >> -1971870431) + var10), var10, 16448 | param2 >> 306129473);
                var9++;
                continue L4;
              }
            }
          } else {
            L21: {
              var10 = (int)Math.abs(Math.sin(3.141592653589793 * (double)(var9 + ge.field_r - -param0) / 64.0) * 12.0);
              if ((ge.field_r ^ -1) <= -65) {
                var10 = (96 - ge.field_r) * var10 / 32;
                break L21;
              } else {
                var10 = (ge.field_r + -32) * var10 / 32;
                break L21;
              }
            }
            L22: {
              if ((var10 ^ -1) < -1) {
                var10 = -var10;
                break L22;
              } else {
                break L22;
              }
            }
            var10 += 22;
            var10 = (int)((double)var10 + (8.0 * Math.sin(3.141592653589793 * (double)ge.field_r / 64.0) + 32.0));
            de.d(var9, -var10 + this.field_V.field_H + (-param3 + (var7 >> -426135519)), var10, (16449 | param2) >> 562030913);
            var9++;
            continue L3;
          }
        }
    }

    private final void a(int param0, wk param1) {
        int discarded$18 = 0;
        try {
            if (param0 != 5158) {
                this.d((byte) 118);
            }
            if (!this.field_k) {
                this.field_V.a((byte) 88, this.field_w);
            }
            this.field_w.t(-111);
            discarded$18 = this.field_w.e((byte) 72);
            this.field_w.f((byte) -20);
            if (!this.field_k) {
                this.b(0);
            } else {
                bk.a(2);
            }
            this.field_o = true;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "le.KA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(byte param0, wk param1) {
        try {
            this.field_w.e(true);
            if (!(this.field_k)) {
                this.field_V.e(true);
                this.field_z = 0;
            }
            if (param0 <= 11) {
                this.field_s = 97;
            }
            this.field_o = true;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "le.CA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void c(int param0) {
        ml var3 = null;
        vn var4 = null;
        mi var5 = null;
        int var6 = 0;
        vn var7 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        var7 = this.field_V.g((byte) 68);
        var3 = (ml) ((Object) var7.b(param0 + 20398));
        L0: while (true) {
          if (var3 == null) {
            L1: {
              if (this.field_m.field_h == null) {
                break L1;
              } else {
                if (!this.field_m.field_h.d(6)) {
                  break L1;
                } else {
                  return;
                }
              }
            }
            var4 = this.field_V.e(2);
            var5 = (mi) ((Object) var4.b(param0 + 20398));
            L2: while (true) {
              if (var5 == null) {
                L3: {
                  if (null == this.field_m.field_d) {
                    break L3;
                  } else {
                    if (this.field_m.field_d.f(true)) {
                      return;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  var3 = (ml) ((Object) var7.b(12623));
                  if (param0 == -7775) {
                    break L4;
                  } else {
                    this.field_j = 56;
                    break L4;
                  }
                }
                L5: while (true) {
                  if (var3 == null) {
                    L6: {
                      if (this.field_m.field_d == null) {
                        break L6;
                      } else {
                        if (this.field_m.field_d.y(17571) == this.field_V.d(false)) {
                          return;
                        } else {
                          break L6;
                        }
                      }
                    }
                    return;
                  } else {
                    if (var3.f(true)) {
                      this.field_m.a(param0 ^ 7725, var3);
                      return;
                    } else {
                      var3 = (ml) ((Object) var7.a(0));
                      continue L5;
                    }
                  }
                }
              } else {
                if (var5.d(6)) {
                  this.field_m.a(var5, -126);
                  return;
                } else {
                  var5 = (mi) ((Object) var4.a(0));
                  continue L2;
                }
              }
            }
          } else {
            if (var3.i(-52)) {
              this.field_m.a(-105, var3);
              return;
            } else {
              var3 = (ml) ((Object) var7.a(0));
              continue L0;
            }
          }
        }
    }

    private final void n(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var8 = ArcanistsMulti.field_G ? 1 : 0;
          if (re.field_r != 1) {
            break L0;
          } else {
            if (-3 == mf.field_g) {
              L1: {
                if (ao.field_d) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              ao.field_d = stackIn_6_0 != 0;
              if (!ao.field_d) {
                break L0;
              } else {
                vh.field_t = 0;
                break L0;
              }
            } else {
              break L0;
            }
          }
        }
        L2: {
          var2 = n.field_g.field_nb;
          if (-1 < (this.field_I ^ -1)) {
            if (!ao.field_d) {
              stackOut_12_0 = 1;
              stackIn_14_0 = stackOut_12_0;
              break L2;
            } else {
              stackOut_11_0 = 0;
              stackIn_14_0 = stackOut_11_0;
              break L2;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_14_0 = stackOut_9_0;
            break L2;
          }
        }
        L3: {
          L4: {
            L5: {
              var3 = stackIn_14_0;
              if (ri.field_b[96]) {
                break L5;
              } else {
                if (var3 == 0) {
                  break L4;
                } else {
                  if (!ri.field_b[p.field_a]) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            if (-16 >= this.field_n) {
              break L4;
            } else {
              this.field_m.a(param0 + 0);
              this.field_n = this.field_n - 2;
              this.field_t = true;
              break L3;
            }
          }
          if (this.field_n >= 0) {
            break L3;
          } else {
            this.field_n = this.field_n + 1;
            break L3;
          }
        }
        L6: {
          L7: {
            L8: {
              if (ri.field_b[97]) {
                break L8;
              } else {
                if (var3 == 0) {
                  break L7;
                } else {
                  if (!ri.field_b[qo.field_b]) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
            }
            if (-17 >= (this.field_n ^ -1)) {
              break L7;
            } else {
              this.field_m.a(0);
              this.field_n = this.field_n + 2;
              this.field_t = true;
              break L6;
            }
          }
          if (0 < this.field_n) {
            this.field_n = this.field_n - 1;
            break L6;
          } else {
            break L6;
          }
        }
        L9: {
          L10: {
            L11: {
              if (ri.field_b[98]) {
                break L11;
              } else {
                if (var3 == 0) {
                  break L10;
                } else {
                  if (!ri.field_b[fi.field_e]) {
                    break L10;
                  } else {
                    break L11;
                  }
                }
              }
            }
            if (-16 < this.field_S) {
              this.field_m.a(0);
              this.field_S = this.field_S - 2;
              this.field_t = true;
              break L9;
            } else {
              break L10;
            }
          }
          if (-1 >= (this.field_S ^ -1)) {
            break L9;
          } else {
            this.field_S = this.field_S + 1;
            break L9;
          }
        }
        L12: {
          L13: {
            L14: {
              if (ri.field_b[99]) {
                break L14;
              } else {
                if (var3 == 0) {
                  break L13;
                } else {
                  if (!ri.field_b[cm.field_j]) {
                    break L13;
                  } else {
                    break L14;
                  }
                }
              }
            }
            if (16 > this.field_S) {
              this.field_m.a(0);
              this.field_t = true;
              this.field_S = this.field_S + 2;
              break L12;
            } else {
              break L13;
            }
          }
          if (-1 > (this.field_S ^ -1)) {
            this.field_S = this.field_S - 1;
            break L12;
          } else {
            break L12;
          }
        }
        L15: {
          ol.field_g = ol.field_g + this.field_S;
          vn.field_c = vn.field_c + this.field_n;
          if (eb.field_b != null) {
            this.field_M = 2000;
            break L15;
          } else {
            L16: {
              if (this.field_V.a(true)) {
                break L16;
              } else {
                if (this.field_V.c((byte) 89)) {
                  break L16;
                } else {
                  this.field_M = 0 + 15 * this.field_M >> 99314724;
                  break L15;
                }
              }
            }
            this.field_M = 2000;
            break L15;
          }
        }
        L17: {
          var4 = 0;
          if (this.field_V.c((byte) 89)) {
            break L17;
          } else {
            if (this.field_V.k(-45)) {
              break L17;
            } else {
              L18: {
                L19: {
                  if (ef.field_r) {
                    break L19;
                  } else {
                    if (!pn.a((byte) 110)) {
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                if (!this.field_ab) {
                  break L18;
                } else {
                  break L17;
                }
              }
              L20: {
                var5 = this.field_V.field_y >> this.field_K;
                var6 = this.field_V.field_H >> this.field_K;
                var7 = an.field_j;
                if (var5 + 648 > an.field_f) {
                  var7 = var2;
                  break L20;
                } else {
                  break L20;
                }
              }
              L21: {
                if (an.field_g < -8 + -var5 + an.field_f) {
                  break L21;
                } else {
                  if (me.field_I < -8 + (-var6 + var7)) {
                    break L21;
                  } else {
                    if (me.field_I >= var7) {
                      break L21;
                    } else {
                      L22: {
                        if ((wk.field_m ^ -1) != -2) {
                          break L22;
                        } else {
                          vn.field_c = 4 - an.field_f + (var5 + an.field_g) << this.field_K;
                          this.field_t = true;
                          ol.field_g = me.field_I - (-4 + -var6) - var7 << this.field_K;
                          break L22;
                        }
                      }
                      this.field_u = 0;
                      var4 = 1;
                      break L17;
                    }
                  }
                }
              }
              if (1 != wk.field_m) {
                break L17;
              } else {
                this.field_K = 4;
                break L17;
              }
            }
          }
        }
        L23: {
          var5 = -var2 / 2;
          if (param0 == 0) {
            break L23;
          } else {
            this.field_cb = (vn) null;
            break L23;
          }
        }
        L24: {
          L25: {
            L26: {
              L27: {
                var6 = 64 + -(var2 / 2) + this.field_V.field_H;
                this.a(var6, var5, true);
                if (this.field_V.d(false) != this.field_I) {
                  break L27;
                } else {
                  if (-2 > (this.field_z ^ -1)) {
                    break L26;
                  } else {
                    break L27;
                  }
                }
              }
              if (this.field_ab) {
                break L25;
              } else {
                break L26;
              }
            }
            if (this.field_V.a(true)) {
              break L25;
            } else {
              L28: {
                if (!this.field_ab) {
                  break L28;
                } else {
                  if (pn.a((byte) -51)) {
                    break L25;
                  } else {
                    if (ef.field_r) {
                      break L25;
                    } else {
                      break L28;
                    }
                  }
                }
              }
              if (this.field_V.n(param0 + 4)) {
                break L25;
              } else {
                this.a(var4 != 0, (byte) 10);
                break L24;
              }
            }
          }
          eb.field_b = null;
          ti.field_N = -1;
          break L24;
        }
        L29: {
          if (!this.field_V.c((byte) 89)) {
            break L29;
          } else {
            this.field_K = 4;
            break L29;
          }
        }
    }

    private final int a(int param0, byte param1, int param2) {
        boolean discarded$1 = false;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        String var8 = null;
        ml var9 = null;
        L0: {
          var7 = ArcanistsMulti.field_G ? 1 : 0;
          if (param1 == -3) {
            break L0;
          } else {
            discarded$1 = this.r(122);
            break L0;
          }
        }
        L1: {
          L2: {
            var9 = this.field_V.a(param2, true);
            if (var9 == null) {
              break L2;
            } else {
              if (0 < ((this.field_J | this.field_a) & 1 << var9.y(17571))) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          L3: {
            if (0 == param2) {
              break L3;
            } else {
              if (!qg.a(-113)) {
                break L3;
              } else {
                if (rm.field_k == 6) {
                  break L3;
                } else {
                  break L1;
                }
              }
            }
          }
          L4: {
            var5 = 16777215;
            var8 = this.field_V.field_k[param2];
            var6 = var8;
            if ((1 << param2 & this.field_J) > 0) {
              if (-1 > (1 << param2 & this.field_a ^ -1)) {
                var6 = tj.a(param1 ^ -124, new String[]{var8}, qc.field_g);
                break L4;
              } else {
                var6 = tj.a(param1 + 116, new String[]{var8}, lc.field_a);
                break L4;
              }
            } else {
              if (0 >= (1 << param2 & this.field_a)) {
                var6 = tj.a(122, new String[]{var8}, jl.field_i);
                break L4;
              } else {
                var6 = tj.a(param1 + -14, new String[]{var8}, cn.field_Q);
                break L4;
              }
            }
          }
          mi.field_B.a(var6, 3, mi.field_B.field_C / 2 + (param0 - -8), 15790320 ^ (var5 | 15790320), 0);
          mi.field_B.a(var6, 4, 8 + param0 + (mi.field_B.field_C / 2 - 1), 15790320 ^ (var5 | 15790320), 0);
          mi.field_B.a(var6, 4, mi.field_B.field_C / 2 + (8 + param0), var5, -1);
          param0 += 18;
          break L1;
        }
        return param0;
    }

    private final void a(int param0, byte param1, ml param2, int param3) {
        boolean discarded$1 = false;
        RuntimeException var5 = null;
        int var5_int = 0;
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
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var18 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -82) {
                break L1;
              } else {
                discarded$1 = this.j(-127);
                break L1;
              }
            }
            L2: {
              var5_int = n.field_g.field_nb;
              var6 = param2.f(-99);
              var7 = param2.i((byte) 120);
              var8 = param2.p(-8323);
              var9 = -var6 + param3;
              var10 = param0 - var7 - -(var8 >> -1293172319);
              var11 = (int)Math.sqrt((double)(var10 * var10 + var9 * var9));
              if (var11 != 0) {
                break L2;
              } else {
                var11 = 1;
                var10 = -1;
                break L2;
              }
            }
            L3: {
              if (this.field_V.a(true)) {
                break L3;
              } else {
                L4: {
                  if (-1 > (var9 ^ -1)) {
                    param2.field_E = 1;
                    break L4;
                  } else {
                    param2.field_E = -1;
                    break L4;
                  }
                }
                L5: {
                  L6: {
                    if (ti.field_N == 127) {
                      break L6;
                    } else {
                      if (ti.field_N == 128) {
                        break L6;
                      } else {
                        if ((ti.field_N ^ -1) == -130) {
                          break L6;
                        } else {
                          if ((ti.field_N ^ -1) != -137) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  if (Math.abs(var9) < Math.abs(var10)) {
                    L7: {
                      var9 = 64 * param2.field_E;
                      if (-1 >= (var10 ^ -1)) {
                        var10 = 64;
                        break L7;
                      } else {
                        var10 = -64;
                        break L7;
                      }
                    }
                    var11 = (int)Math.sqrt((double)(var9 * var9 - -(var10 * var10)));
                    if (0 == var11) {
                      var11 = 1;
                      var10 = -1;
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                var12 = var8 / 2;
                if (this.field_u < 100) {
                  var15 = 0;
                  L8: while (true) {
                    if (var15 >= this.field_u) {
                      break L3;
                    } else {
                      L9: {
                        var16 = var15 + var12;
                        var14 = var16 * var10 / var11 + -var12;
                        var13 = var9 * var16 / var11;
                        var17 = 0;
                        if (25 > var15) {
                          var17 = var17 | (255 & var15 * 10) << 1337437104;
                          break L9;
                        } else {
                          var17 = var17 | 16711680;
                          if ((var15 ^ -1) > -76) {
                            var17 = var17 | ((var15 + -25) * 5 & 255) << 1934919464;
                            break L9;
                          } else {
                            var17 = var17 | 65280;
                            if ((var15 ^ -1) > -101) {
                              var17 = var17 | -750 + 10 * var15 & 255;
                              break L9;
                            } else {
                              var17 = var17 | 255;
                              break L9;
                            }
                          }
                        }
                      }
                      L10: {
                        if (-26 <= (var15 ^ -1)) {
                          de.c(-vn.field_c + var13 + (var6 + (an.field_f >> 700568097)), -ol.field_g + var7 + (var14 - -(var5_int >> -295165631)), 1600 / (200 - 100 * var15 / 100), var17, 10 * var15);
                          break L10;
                        } else {
                          de.i(-vn.field_c + var13 + var6 - -(an.field_f >> -378656927), (var5_int >> -11922111) + (-ol.field_g + (var14 + var7)), 1600 / (200 - var15 * 100 / 100), var17);
                          break L10;
                        }
                      }
                      var15++;
                      continue L8;
                    }
                  }
                } else {
                  break L3;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) (var5);
            stackOut_38_1 = new StringBuilder().append("le.HB(").append(param0).append(',').append(param1).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param2 == null) {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L11;
            } else {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L11;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param3 + ')');
        }
    }

    private final boolean r(int param0) {
        if (param0 >= -26) {
            return false;
        }
        return !this.field_V.d((byte) -128) ? true : false;
    }

    final void a(boolean param0, boolean param1) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        pg discarded$5 = null;
        int var3 = 0;
        int var4 = 0;
        ml var4_ref_ml = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        rb var9 = null;
        rb var10 = null;
        int stackIn_47_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_60_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        L0: {
          var7 = ArcanistsMulti.field_G ? 1 : 0;
          if (-1 >= (this.field_V.d(false) ^ -1)) {
            break L0;
          } else {
            if (!this.field_V.n(4)) {
              param1 = false;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          this.field_o = false;
          if (ef.field_r) {
            break L1;
          } else {
            if (!pn.a((byte) 111)) {
              L2: {
                if (ri.field_b[69]) {
                  break L2;
                } else {
                  if (ri.field_b[ao.field_f]) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              this.field_t = false;
              this.field_m.a(-96, this.field_V.a(this.field_bb, true));
              break L1;
            } else {
              break L1;
            }
          }
        }
        L3: {
          if (0 >= this.field_V.field_G) {
            break L3;
          } else {
            this.field_V.field_G = this.field_V.field_G - 1;
            break L3;
          }
        }
        L4: {
          vl.a(128);
          if (this.field_Z <= 0) {
            break L4;
          } else {
            this.field_Z = this.field_Z - 1;
            break L4;
          }
        }
        L5: {
          if (-1 >= (an.field_g ^ -1)) {
            if (-1 >= (me.field_I ^ -1)) {
              if (an.field_f > an.field_g) {
                break L5;
              } else {
                if (me.field_I < an.field_j) {
                  break L5;
                } else {
                  ti.field_N = -1;
                  break L5;
                }
              }
            } else {
              ti.field_N = -1;
              break L5;
            }
          } else {
            ti.field_N = -1;
            break L5;
          }
        }
        L6: {
          this.field_P = this.field_P + 1;
          if (0 <= this.field_Z) {
            break L6;
          } else {
            this.field_Z = this.field_Z + 1;
            break L6;
          }
        }
        L7: {
          if (256 > this.field_P) {
            break L7;
          } else {
            this.field_P = this.field_P - 256;
            break L7;
          }
        }
        L8: {
          this.field_j = this.field_j + 1;
          if (this.field_j <= g.field_a.field_n * 2) {
            break L8;
          } else {
            this.field_j = this.field_j - g.field_a.field_n * 2;
            break L8;
          }
        }
        L9: {
          var3 = 0;
          e.g((byte) -49);
          if (dm.h((byte) 97)) {
            this.c((byte) -106);
            if (this.field_V.c((byte) 89)) {
              break L9;
            } else {
              if (!this.field_V.n(4)) {
                break L9;
              } else {
                if (mn.field_r == 3) {
                  break L9;
                } else {
                  if (-5 == mn.field_r) {
                    break L9;
                  } else {
                    if (this.field_V.d(1)) {
                      L10: {
                        L11: {
                          var4 = this.field_V.d(false);
                          if (ob.field_Y == null) {
                            break L11;
                          } else {
                            if (!ob.field_Y.field_l) {
                              break L11;
                            } else {
                              stackOut_39_0 = 1;
                              stackIn_47_0 = stackOut_39_0;
                              break L10;
                            }
                          }
                        }
                        if (an.field_f <= 640) {
                          if ((an.field_j ^ -1) < -481) {
                            stackOut_45_0 = 1;
                            stackIn_47_0 = stackOut_45_0;
                            break L10;
                          } else {
                            stackOut_44_0 = 0;
                            stackIn_47_0 = stackOut_44_0;
                            break L10;
                          }
                        } else {
                          stackOut_42_0 = 1;
                          stackIn_47_0 = stackOut_42_0;
                          break L10;
                        }
                      }
                      L12: {
                        var5 = stackIn_47_0;
                        if (-1 < (var4 ^ -1)) {
                          break L12;
                        } else {
                          if (this.field_I < 0) {
                            break L12;
                          } else {
                            if (var5 == 0) {
                              break L12;
                            } else {
                              if (this.field_i) {
                                L13: {
                                  if (!this.field_V.field_d) {
                                    L14: {
                                      if (this.field_I != var4) {
                                        stackOut_59_0 = 0;
                                        stackIn_60_0 = stackOut_59_0;
                                        break L14;
                                      } else {
                                        stackOut_58_0 = 1;
                                        stackIn_60_0 = stackOut_58_0;
                                        break L14;
                                      }
                                    }
                                    var6 = stackIn_60_0;
                                    break L13;
                                  } else {
                                    L15: {
                                      if ((this.field_I & 1) != (var4 & 1)) {
                                        stackOut_55_0 = 0;
                                        stackIn_56_0 = stackOut_55_0;
                                        break L15;
                                      } else {
                                        stackOut_54_0 = 1;
                                        stackIn_56_0 = stackOut_54_0;
                                        break L15;
                                      }
                                    }
                                    var6 = stackIn_56_0;
                                    break L13;
                                  }
                                }
                                L16: {
                                  if (-1 == (this.field_J & 1 << this.field_I ^ -1)) {
                                    break L16;
                                  } else {
                                    var6 = 0;
                                    break L16;
                                  }
                                }
                                if (var6 == 0) {
                                  break L12;
                                } else {
                                  this.a((byte) 79, 56, 199);
                                  break L12;
                                }
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                      }
                      gj.a(true, true, 3, mn.field_r);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
              }
            }
          } else {
            var3 = 1;
            break L9;
          }
        }
        L17: {
          this.c(-7775);
          if (!this.field_t) {
            this.e(17608);
            break L17;
          } else {
            break L17;
          }
        }
        L18: {
          if (this.field_I <= 0) {
            break L18;
          } else {
            L19: {
              if (ri.field_b[69]) {
                break L19;
              } else {
                if (ri.field_b[ao.field_f]) {
                  break L19;
                } else {
                  if (ri.field_b[ig.field_g]) {
                    break L19;
                  } else {
                    if (ri.field_b[im.field_g]) {
                      break L19;
                    } else {
                      if (ri.field_b[84]) {
                        break L19;
                      } else {
                        if (ri.field_b[82]) {
                          break L19;
                        } else {
                          if (ri.field_b[81]) {
                            break L19;
                          } else {
                            if (ri.field_b[ko.field_k]) {
                              break L19;
                            } else {
                              if (ri.field_b[ud.field_w]) {
                                break L19;
                              } else {
                                if (ri.field_b[85]) {
                                  break L19;
                                } else {
                                  break L18;
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
            var9 = (rb) ((Object) pb.field_m.b(12623));
            var10 = var9;
            this.field_K = 4;
            this.field_M = 2000;
            if (var10 == null) {
              break L18;
            } else {
              var10.field_i = false;
              break L18;
            }
          }
        }
        L20: {
          if (this.field_V.c((byte) 89)) {
            break L20;
          } else {
            if (!this.field_V.k(103)) {
              L21: {
                if (this.field_C) {
                  L22: {
                    this.field_C = false;
                    this.field_V.f((byte) -20);
                    this.field_bb = this.field_V.d(false);
                    var4_ref_ml = this.field_V.a(this.field_bb, param0);
                    if (var4_ref_ml != null) {
                      this.field_m.a(-89, var4_ref_ml);
                      break L22;
                    } else {
                      this.field_m.a(0);
                      break L22;
                    }
                  }
                  this.field_t = false;
                  this.field_s = -1000;
                  break L21;
                } else {
                  break L21;
                }
              }
              if (this.field_w == null) {
                if (!this.field_F) {
                  L23: {
                    this.field_F = true;
                    this.field_V.f((byte) -20);
                    if (this.field_ab) {
                      break L23;
                    } else {
                      if (this.field_V.b(this.field_J, -93)) {
                        if (!qg.a(-102)) {
                          gj.a(false, true, -1, mn.field_r);
                          break L23;
                        } else {
                          mh.i((byte) 74);
                          break L23;
                        }
                      } else {
                        break L23;
                      }
                    }
                  }
                  if (this.field_ab) {
                    break L20;
                  } else {
                    if (5 != mj.field_p) {
                      break L20;
                    } else {
                      wk.j(13805);
                      break L20;
                    }
                  }
                } else {
                  break L20;
                }
              } else {
                break L20;
              }
            } else {
              break L20;
            }
          }
        }
        L24: {
          if (mj.field_p != 6) {
            break L24;
          } else {
            if (-6 < (rm.field_k ^ -1)) {
              this.field_G = false;
              break L24;
            } else {
              this.field_G = true;
              break L24;
            }
          }
        }
        L25: {
          if (!this.field_V.a(param0)) {
            break L25;
          } else {
            if (this.field_V.c((byte) 89)) {
              break L25;
            } else {
              if (this.field_V.n(4)) {
                break L25;
              } else {
                if (this.field_V.k(-127)) {
                  break L25;
                } else {
                  if (var3 != 0) {
                    break L25;
                  } else {
                    if (!pb.field_m.b(true)) {
                      break L25;
                    } else {
                      if (this.field_ab) {
                        break L25;
                      } else {
                        if (this.field_y) {
                          L26: {
                            this.field_t = false;
                            this.c(false);
                            if ((mj.field_p ^ -1) != -7) {
                              break L26;
                            } else {
                              if (this.field_V.d(false) == 0) {
                                break L26;
                              } else {
                                hj.a(-20602);
                                break L25;
                              }
                            }
                          }
                          this.field_V.a(this.field_V.d(false), 157, (byte) 36, 0, 0, 0, 0, this.field_V.d(false), 0);
                          break L25;
                        } else {
                          if (qg.a(-96)) {
                            ik.b(0);
                            this.c(false);
                            break L25;
                          } else {
                            this.c(false);
                            break L25;
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
        L27: {
          var4 = n.field_g.field_nb;
          var5 = -var4 / 2;
          var6 = this.field_V.field_H - var4 / 2 - -64;
          this.a(var6, var5, param0);
          if (!param1) {
            break L27;
          } else {
            this.n(0);
            break L27;
          }
        }
        L28: {
          this.d((byte) 83);
          fieldTemp$3 = this.field_x - 1;
          this.field_x = this.field_x - 1;
          if (fieldTemp$3 <= 0) {
            L29: {
              if (this.field_W == this.field_V.n((byte) -75)) {
                ob.a(20, this.field_f, this.field_W);
                break L29;
              } else {
                break L29;
              }
            }
            this.field_x = 50;
            break L28;
          } else {
            break L28;
          }
        }
        L30: {
          if (this.field_ab) {
            if (this.field_z <= 1) {
              break L30;
            } else {
              this.field_z = this.field_z - 1;
              if ((this.field_z ^ -1) != -2) {
                break L30;
              } else {
                L31: {
                  if ((this.field_h ^ -1) < -1) {
                    this.i(2000);
                    break L31;
                  } else {
                    break L31;
                  }
                }
                if (this.field_V.a(true)) {
                  break L30;
                } else {
                  if (this.field_V.d(false) == this.field_I) {
                    this.a(-113);
                    break L30;
                  } else {
                    break L30;
                  }
                }
              }
            }
          } else {
            L32: {
              if (this.field_y) {
                this.field_z = this.field_z - 1;
                break L32;
              } else {
                break L32;
              }
            }
            if (0 == this.field_z) {
              this.d(false);
              break L30;
            } else {
              break L30;
            }
          }
        }
        L33: {
          if (null == b.field_a.b(12623)) {
            break L33;
          } else {
            fieldTemp$4 = wi.field_h + 1;
            wi.field_h = wi.field_h + 1;
            if (-336 == (fieldTemp$4 ^ -1)) {
              wi.field_h = 0;
              discarded$5 = b.field_a.c(true);
              break L33;
            } else {
              break L33;
            }
          }
        }
    }

    private final void c(byte param0) {
        this.field_V.a(qg.a(-81), !this.field_t ? this.field_m : null, param0 ^ -17);
        if (param0 != -106) {
            wk var3 = (wk) null;
            this.a(19, (wk) null);
        }
    }

    private final boolean a(wk param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_74_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 == 60) {
              this.field_L = param0.e((byte) 99);
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (68 != param1) {
                if ((param1 ^ -1) != -70) {
                  if (70 != param1) {
                    if (71 != param1) {
                      if (param1 != 61) {
                        if ((param1 ^ -1) != -66) {
                          if (param1 == 66) {
                            L1: {
                              L2: {
                                if (!this.f(false)) {
                                  break L2;
                                } else {
                                  if (!this.field_cb.b(true)) {
                                    break L2;
                                  } else {
                                    this.c(param0, 105);
                                    break L1;
                                  }
                                }
                              }
                              this.a(param3, param1, param0, false);
                              break L1;
                            }
                            stackOut_39_0 = 1;
                            stackIn_40_0 = stackOut_39_0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            if (param1 != 63) {
                              if (-65 == (param1 ^ -1)) {
                                L3: {
                                  L4: {
                                    if (!this.f(-128)) {
                                      break L4;
                                    } else {
                                      if (!this.field_cb.b(true)) {
                                        break L4;
                                      } else {
                                        this.a((byte) 59, param0);
                                        break L3;
                                      }
                                    }
                                  }
                                  this.a(param3, param1, param0, false);
                                  break L3;
                                }
                                stackOut_54_0 = 1;
                                stackIn_55_0 = stackOut_54_0;
                                decompiledRegionSelector0 = 9;
                                break L0;
                              } else {
                                if (-63 != (param1 ^ -1)) {
                                  if (67 != param1) {
                                    if (param2 == 0) {
                                      stackOut_73_0 = 0;
                                      stackIn_74_0 = stackOut_73_0;
                                      decompiledRegionSelector0 = 12;
                                      break L0;
                                    } else {
                                      this.field_O = true;
                                      return false;
                                    }
                                  } else {
                                    L5: {
                                      L6: {
                                        if (!this.b(false)) {
                                          break L6;
                                        } else {
                                          if (this.field_cb.b(true)) {
                                            this.b(param0, -1);
                                            break L5;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                      this.a(param3, param1, param0, false);
                                      break L5;
                                    }
                                    stackOut_69_0 = 1;
                                    stackIn_70_0 = stackOut_69_0;
                                    decompiledRegionSelector0 = 11;
                                    break L0;
                                  }
                                } else {
                                  L7: {
                                    L8: {
                                      if (!this.j(param2 + -27726)) {
                                        break L8;
                                      } else {
                                        if (!this.field_cb.b(true)) {
                                          break L8;
                                        } else {
                                          this.a(param0, 0, 8888);
                                          break L7;
                                        }
                                      }
                                    }
                                    this.a(param3, param1, param0, false);
                                    break L7;
                                  }
                                  stackOut_61_0 = 1;
                                  stackIn_62_0 = stackOut_61_0;
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                }
                              }
                            } else {
                              L9: {
                                L10: {
                                  if (!this.l(-8712)) {
                                    break L10;
                                  } else {
                                    if (!this.field_cb.b(true)) {
                                      break L10;
                                    } else {
                                      this.b(33, param0);
                                      break L9;
                                    }
                                  }
                                }
                                this.a(param3, param1, param0, false);
                                break L9;
                              }
                              stackOut_46_0 = 1;
                              stackIn_47_0 = stackOut_46_0;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            }
                          }
                        } else {
                          L11: {
                            L12: {
                              if (!this.e(true)) {
                                break L12;
                              } else {
                                if (this.field_cb.b(true)) {
                                  this.a(param0, -122);
                                  break L11;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            this.a(param3, param1, param0, false);
                            break L11;
                          }
                          stackOut_31_0 = 1;
                          stackIn_32_0 = stackOut_31_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        L13: {
                          L14: {
                            if (!this.b((byte) -116)) {
                              break L14;
                            } else {
                              if (this.field_cb.b(true)) {
                                this.a(5158, param0);
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                          this.a(param3, param1, param0, false);
                          break L13;
                        }
                        stackOut_23_0 = 1;
                        stackIn_24_0 = stackOut_23_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      this.field_a = param0.e((byte) -86);
                      jk.a((byte) 121);
                      stackOut_15_0 = 1;
                      stackIn_16_0 = stackOut_15_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    this.field_b = param0.e((byte) 48);
                    jk.a((byte) 121);
                    stackOut_12_0 = 1;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  this.field_J = param0.e((byte) 80);
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                this.field_D = param0.e((byte) -90);
                jg.a(-3);
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var5 = decompiledCaughtException;
            stackOut_75_0 = (RuntimeException) (var5);
            stackOut_75_1 = new StringBuilder().append("le.V(");
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param0 == null) {
              stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L15;
            } else {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "{...}";
              stackIn_78_0 = stackOut_76_0;
              stackIn_78_1 = stackOut_76_1;
              stackIn_78_2 = stackOut_76_2;
              break L15;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_78_0), stackIn_78_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_24_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_32_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_40_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_47_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_55_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_62_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_70_0 != 0;
                              } else {
                                return stackIn_74_0 != 0;
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

    final static boolean a(byte param0) {
        long var1 = 0L;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        var1 = qj.b(-26572);
        if (param0 > 67) {
          var3 = -mh.field_K + var1;
          if (30000L >= var3) {
            L0: {
              var5 = 3000;
              if (7 <= ik.field_b) {
                var5 = 12000;
                break L0;
              } else {
                if (-6 < (ik.field_b ^ -1)) {
                  if (-4 < (ik.field_b ^ -1)) {
                    break L0;
                  } else {
                    var5 = 6000;
                    break L0;
                  }
                } else {
                  var5 = 9000;
                  break L0;
                }
              }
            }
            if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
              ik.field_b = ik.field_b + 1;
              mh.field_K = var1;
              return true;
            } else {
              return false;
            }
          } else {
            mh.field_K = var1;
            ik.field_b = 0;
            return true;
          }
        } else {
          return true;
        }
    }

    private final void d(boolean param0) {
        this.a(0, 0, 0, 0, 0, 0, -1, -118);
        this.field_V.e(true);
        if (param0) {
            this.field_Z = 120;
        }
    }

    private final void a(byte param0, int param1, int param2) {
        if (!(!wi.a(param1, ad.field_f, param0 ^ 79))) {
            return;
        }
        int[] var6 = ad.field_f;
        int[] var4 = var6;
        int var5 = param1;
        var6[var5 >> -695850555] = fj.b(var6[var5 >> -695850555], 1 << dg.a(var5, 31));
        if (param0 != 79) {
            this.field_O = false;
        }
        b.field_a.b(new qa(param1), -1);
        if (!this.field_U) {
            wh.field_h.b(new cm(param1, param2, 0, 0, 0, 0), param0 + -80);
        }
    }

    private final void a(wk param0, int param1) {
        int var3_int = 0;
        int discarded$20 = 0;
        try {
            if (param1 >= -110) {
                this.field_r = -122;
            }
            var3_int = param0.e((byte) -99);
            if (!(this.field_k)) {
                this.field_V.a((byte) 106, this.field_w);
            }
            this.field_w.b((byte) 88, var3_int);
            discarded$20 = this.field_w.e((byte) 72);
            if (!this.field_k) {
                this.field_V.b((byte) 88, var3_int);
            } else {
                bk.a(2);
            }
            this.field_o = true;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "le.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(boolean param0, byte param1) {
        fk discarded$5 = null;
        fk discarded$6 = null;
        int fieldTemp$7 = 0;
        fk discarded$8 = null;
        fk discarded$9 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ml var6 = null;
        ml var7_ref_ml = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        ml var16 = null;
        ml var17 = null;
        int stackIn_64_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_152_0 = 0;
        int stackIn_178_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_151_0 = 0;
        int stackOut_150_0 = 0;
        int stackOut_177_0 = 0;
        int stackOut_176_0 = 0;
        L0: {
          var15 = ArcanistsMulti.field_G ? 1 : 0;
          var3 = n.field_g.field_nb;
          if (param1 == 10) {
            break L0;
          } else {
            this.a(41, 48, 1, -100);
            break L0;
          }
        }
        L1: {
          var4 = an.field_g - (-vn.field_c + (an.field_f >> -1339707423));
          var5 = -(var3 >> -1920262655) + me.field_I + ol.field_g;
          if (-1 > (this.field_u ^ -1)) {
            var4 = this.field_e;
            var5 = this.field_c;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if ((ti.field_N ^ -1) != -79) {
            break L2;
          } else {
            var5 += 64;
            break L2;
          }
        }
        L3: {
          L4: {
            L5: {
              L6: {
                L7: {
                  var16 = this.field_V.a(this.field_bb, true);
                  var6 = var16;
                  if (var16 == null) {
                    break L7;
                  } else {
                    if (var16.m(-20357) <= 0) {
                      break L7;
                    } else {
                      if (var6 == null) {
                        if (!this.field_ab) {
                          break L5;
                        } else {
                          if (!this.field_V.a(true)) {
                            break L6;
                          } else {
                            break L5;
                          }
                        }
                      } else {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (var6.w(param1 ^ 24511) != null) {
                            break L3;
                          } else {
                            if (var6.y(17571) != this.field_V.d(false)) {
                              break L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L8: {
                  var17 = this.field_V.a(this.field_V.d(false), true);
                  var6 = var17;
                  if (var17 == null) {
                    break L8;
                  } else {
                    this.field_bb = var17.y(17571);
                    break L8;
                  }
                }
                if (var6 != null) {
                  break L5;
                } else {
                  if (!this.field_ab) {
                    break L5;
                  } else {
                    if (!this.field_V.a(true)) {
                      break L6;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              this.a(36);
              break L5;
            }
            if (var6 == null) {
              break L3;
            } else {
              if (var6.w(param1 ^ 24511) != null) {
                break L3;
              } else {
                if (var6.y(17571) != this.field_V.d(false)) {
                  break L4;
                } else {
                  break L3;
                }
              }
            }
          }
          var6 = this.q(param1 + 10771);
          break L3;
        }
        L9: {
          if (var6 == null) {
            break L9;
          } else {
            if (var6.w(24501) == null) {
              break L9;
            } else {
              if (37 == var6.o(-22625)) {
                break L9;
              } else {
                var7_ref_ml = this.field_V.a(this.field_V.d(false), true);
                if (var7_ref_ml == null) {
                  break L9;
                } else {
                  if (var7_ref_ml.i((byte) -32) <= this.field_V.field_H) {
                    break L9;
                  } else {
                    var6 = this.q(10781);
                    break L9;
                  }
                }
              }
            }
          }
        }
        L10: {
          if (var6 == null) {
            break L10;
          } else {
            if (null == var6.w(24501)) {
              break L10;
            } else {
              if (!this.field_V.field_d) {
                if (var6.g(false) != this.field_V.d(false)) {
                  var6 = this.q(10781);
                  break L10;
                } else {
                  break L10;
                }
              } else {
                if (var6.y(17571) == this.field_V.d(false)) {
                  break L10;
                } else {
                  L11: {
                    if (var6.w(24501) == null) {
                      break L11;
                    } else {
                      if (var6.r(param1 + -132) == this.field_V.q((byte) -122)) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  var6 = this.q(10781);
                  break L10;
                }
              }
            }
          }
        }
        L12: {
          L13: {
            if (!this.field_V.c((byte) 89)) {
              break L13;
            } else {
              if (this.field_V.j(39)) {
                break L13;
              } else {
                stackOut_48_0 = 0;
                stackIn_64_0 = stackOut_48_0;
                break L12;
              }
            }
          }
          if (!this.field_V.k(-92)) {
            if (!this.field_V.g(119)) {
              if (1 < this.field_z) {
                if (this.field_ab) {
                  if (!pn.a((byte) 127)) {
                    if (!ef.field_r) {
                      stackOut_62_0 = 1;
                      stackIn_64_0 = stackOut_62_0;
                      break L12;
                    } else {
                      stackOut_61_0 = 0;
                      stackIn_64_0 = stackOut_61_0;
                      break L12;
                    }
                  } else {
                    stackOut_59_0 = 0;
                    stackIn_64_0 = stackOut_59_0;
                    break L12;
                  }
                } else {
                  stackOut_57_0 = 1;
                  stackIn_64_0 = stackOut_57_0;
                  break L12;
                }
              } else {
                stackOut_55_0 = 0;
                stackIn_64_0 = stackOut_55_0;
                break L12;
              }
            } else {
              stackOut_53_0 = 0;
              stackIn_64_0 = stackOut_53_0;
              break L12;
            }
          } else {
            stackOut_51_0 = 0;
            stackIn_64_0 = stackOut_51_0;
            break L12;
          }
        }
        L14: {
          var7 = stackIn_64_0;
          if (var6 == null) {
            break L14;
          } else {
            L15: {
              if (var6.i((byte) 121) < 128 + this.field_V.field_H) {
                break L15;
              } else {
                L16: {
                  if (var6.m(param1 ^ -20367) <= 0) {
                    break L16;
                  } else {
                    if (null == var6.w(24501)) {
                      if (this.field_ab) {
                        break L15;
                      } else {
                        if (!qg.a(-92)) {
                          break L15;
                        } else {
                          if (-8 != (mj.field_p ^ -1)) {
                            rm.a(var6, true);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                      }
                    } else {
                      break L16;
                    }
                  }
                }
                this.field_bb = this.field_V.d(false);
                var6 = this.field_V.a(this.field_bb, true);
                eb.field_b = null;
                ti.field_N = -1;
                break L15;
              }
            }
            L17: {
              if (var7 != 0) {
                if (!ri.field_b[ig.field_g]) {
                  if (ri.field_b[ko.field_k]) {
                    stackOut_81_0 = 1;
                    stackIn_83_0 = stackOut_81_0;
                    break L17;
                  } else {
                    stackOut_80_0 = 0;
                    stackIn_83_0 = stackOut_80_0;
                    break L17;
                  }
                } else {
                  stackOut_78_0 = 1;
                  stackIn_83_0 = stackOut_78_0;
                  break L17;
                }
              } else {
                stackOut_76_0 = 0;
                stackIn_83_0 = stackOut_76_0;
                break L17;
              }
            }
            L18: {
              var8 = stackIn_83_0;
              if (var7 != 0) {
                if (!ri.field_b[im.field_g]) {
                  if (ri.field_b[ud.field_w]) {
                    stackOut_89_0 = 1;
                    stackIn_91_0 = stackOut_89_0;
                    break L18;
                  } else {
                    stackOut_88_0 = 0;
                    stackIn_91_0 = stackOut_88_0;
                    break L18;
                  }
                } else {
                  stackOut_86_0 = 1;
                  stackIn_91_0 = stackOut_86_0;
                  break L18;
                }
              } else {
                stackOut_84_0 = 0;
                stackIn_91_0 = stackOut_84_0;
                break L18;
              }
            }
            L19: {
              var9 = stackIn_91_0;
              if (var8 != 0) {
                break L19;
              } else {
                if (var9 != 0) {
                  break L19;
                } else {
                  if (0 < this.field_h) {
                    this.i(2000);
                    break L19;
                  } else {
                    break L19;
                  }
                }
              }
            }
            if (var7 == 0) {
              break L14;
            } else {
              L20: {
                L21: {
                  if (ri.field_b[69]) {
                    break L21;
                  } else {
                    if (ri.field_b[ao.field_f]) {
                      break L21;
                    } else {
                      this.field_Y = 0;
                      break L20;
                    }
                  }
                }
                this.field_t = false;
                if (-1 > (this.field_Y ^ -1)) {
                  this.field_Y = this.field_Y - 1;
                  break L20;
                } else {
                  L22: {
                    if (cf.field_h[224] == null) {
                      break L22;
                    } else {
                      discarded$5 = ti.a((byte) -30, to.field_r[224], cf.field_h[224]);
                      break L22;
                    }
                  }
                  this.field_Y = 25;
                  var6 = this.q(10781);
                  if (var6 != null) {
                    break L20;
                  } else {
                    var6 = this.field_V.a(this.field_V.d(false), true);
                    break L20;
                  }
                }
              }
              L23: {
                if (!this.field_G) {
                  break L23;
                } else {
                  if (var8 == 0) {
                    break L23;
                  } else {
                    if (0 < this.field_Z) {
                      break L23;
                    } else {
                      L24: {
                        if (this.field_h == 0) {
                          break L24;
                        } else {
                          if (this.field_R != 0) {
                            break L23;
                          } else {
                            break L24;
                          }
                        }
                      }
                      L25: {
                        L26: {
                          L27: {
                            this.field_F = true;
                            this.field_Z = -5;
                            if (0 >= this.field_h) {
                              break L27;
                            } else {
                              if (this.field_R != 0) {
                                break L26;
                              } else {
                                break L27;
                              }
                            }
                          }
                          if (this.field_h <= 50) {
                            break L25;
                          } else {
                            break L26;
                          }
                        }
                        this.i(param1 + 1990);
                        break L25;
                      }
                      this.field_h = this.field_h + 1;
                      this.field_R = 0;
                      var6.c(0, -1);
                      this.field_m.a(-80, var6);
                      eb.field_b = null;
                      ti.field_N = -1;
                      break L23;
                    }
                  }
                }
              }
              if (!this.field_G) {
                break L14;
              } else {
                if (var9 == 0) {
                  break L14;
                } else {
                  if ((this.field_Z ^ -1) > -1) {
                    break L14;
                  } else {
                    L28: {
                      if (this.field_h <= 0) {
                        break L28;
                      } else {
                        if (-2 != (this.field_R ^ -1)) {
                          break L14;
                        } else {
                          break L28;
                        }
                      }
                    }
                    L29: {
                      L30: {
                        this.field_F = true;
                        this.field_Z = 5;
                        if ((this.field_h ^ -1) >= -1) {
                          break L30;
                        } else {
                          if (-2 == (this.field_R ^ -1)) {
                            break L30;
                          } else {
                            this.i(2000);
                            break L29;
                          }
                        }
                      }
                      if ((this.field_h ^ -1) >= -51) {
                        break L29;
                      } else {
                        this.i(2000);
                        break L29;
                      }
                    }
                    this.field_R = 1;
                    this.field_h = this.field_h + 1;
                    var6.c(param1 + -10, 1);
                    this.field_m.a(param1 ^ -106, var6);
                    eb.field_b = null;
                    ti.field_N = -1;
                    break L14;
                  }
                }
              }
            }
          }
        }
        L31: {
          if (var7 != 0) {
            L32: {
              if (re.field_r != 1) {
                break L32;
              } else {
                L33: {
                  if (-1 < (mf.field_g ^ -1)) {
                    break L33;
                  } else {
                    if (null == lm.field_f) {
                      break L33;
                    } else {
                      if (this.field_V.a(lm.field_f[mf.field_g], true, this.field_bb)) {
                        L34: {
                          ti.field_N = lm.field_f[mf.field_g];
                          var8 = 9;
                          if (ti.field_N / 12 > 9) {
                            break L34;
                          } else {
                            var8 = ti.field_N / 12;
                            break L34;
                          }
                        }
                        L35: {
                          if (var8 != 0) {
                            var8--;
                            break L35;
                          } else {
                            var8 = 9;
                            break L35;
                          }
                        }
                        L36: {
                          th.field_g[9] = 42;
                          if (null == cf.field_h[th.field_g[var8]]) {
                            break L36;
                          } else {
                            discarded$6 = ti.a((byte) -30, to.field_r[th.field_g[var8]], cf.field_h[th.field_g[var8]]);
                            break L36;
                          }
                        }
                        this.field_s = -1000;
                        break L33;
                      } else {
                        break L33;
                      }
                    }
                  }
                }
                L37: {
                  if (1 != (mf.field_g ^ -1)) {
                    break L37;
                  } else {
                    L38: {
                      if (hc.field_f) {
                        stackOut_151_0 = 0;
                        stackIn_152_0 = stackOut_151_0;
                        break L38;
                      } else {
                        stackOut_150_0 = 1;
                        stackIn_152_0 = stackOut_150_0;
                        break L38;
                      }
                    }
                    hc.field_f = stackIn_152_0 != 0;
                    break L37;
                  }
                }
                L39: {
                  if ((mf.field_g ^ -1) != 3) {
                    break L39;
                  } else {
                    L40: {
                      var8 = 100;
                      if ((this.field_V.field_x[this.field_I] ^ -1) != -5) {
                        break L40;
                      } else {
                        var8 = this.field_V.field_X[this.field_I] / 5 * 5 - -5;
                        if (this.field_V.field_X[this.field_I] <= 0) {
                          break L40;
                        } else {
                          if (var8 != this.field_V.field_X[this.field_I] + 5) {
                            break L40;
                          } else {
                            var8 = this.field_V.field_X[this.field_I];
                            break L40;
                          }
                        }
                      }
                    }
                    if (this.field_V.field_X[this.field_I] < var8) {
                      if (-21 <= (this.field_V.a(this.field_V.d(false), true).m(-20357) ^ -1)) {
                        break L39;
                      } else {
                        L41: {
                          if (this.field_ab) {
                            fieldTemp$7 = this.field_p + 1;
                            this.field_p = this.field_p + 1;
                            p.a(this.field_V.n((byte) -75), 0, (byte) 11, 159, 0, 1, this.field_bb, 0, fieldTemp$7);
                            break L41;
                          } else {
                            break L41;
                          }
                        }
                        this.field_V.e(this.field_bb, false);
                        break L39;
                      }
                    } else {
                      break L39;
                    }
                  }
                }
                if ((mf.field_g ^ -1) <= 0) {
                  break L32;
                } else {
                  this.field_s = -1000;
                  break L32;
                }
              }
            }
            L42: {
              if (2 != re.field_r) {
                break L42;
              } else {
                this.field_s = -1000;
                ti.field_N = -1;
                break L42;
              }
            }
            if (this.field_z <= 1) {
              break L31;
            } else {
              if (null != eb.field_b) {
                break L31;
              } else {
                if (var6 == null) {
                  break L31;
                } else {
                  if (param0) {
                    break L31;
                  } else {
                    if (-1 == mf.field_g) {
                      L43: {
                        if (-1 < (ti.field_N ^ -1)) {
                          stackOut_177_0 = 0;
                          stackIn_178_0 = stackOut_177_0;
                          break L43;
                        } else {
                          stackOut_176_0 = 1;
                          stackIn_178_0 = stackOut_176_0;
                          break L43;
                        }
                      }
                      L44: {
                        var8 = stackIn_178_0;
                        if (wk.field_m != 1) {
                          break L44;
                        } else {
                          L45: {
                            if ((this.field_u ^ -1) < -1) {
                              break L45;
                            } else {
                              if ((re.field_r ^ -1) != -2) {
                                break L44;
                              } else {
                                break L45;
                              }
                            }
                          }
                          L46: {
                            if (-1 == (this.field_u ^ -1)) {
                              break L46;
                            } else {
                              if ((ti.field_N ^ -1) > -1) {
                                break L44;
                              } else {
                                break L46;
                              }
                            }
                          }
                          if (this.field_u < 100) {
                            L47: {
                              if (re.field_r != 1) {
                                break L47;
                              } else {
                                if (cf.field_h[222] != null) {
                                  discarded$8 = ti.a((byte) -30, to.field_r[222], cf.field_h[222]);
                                  break L47;
                                } else {
                                  break L47;
                                }
                              }
                            }
                            L48: {
                              if (null == sm.field_e) {
                                L49: {
                                  L50: {
                                    var9 = -12 + ti.field_N;
                                    if (-1 < (var9 ^ -1)) {
                                      break L50;
                                    } else {
                                      if (-97 >= (var9 ^ -1)) {
                                        break L50;
                                      } else {
                                        if (-7 == (var9 / 12 ^ -1)) {
                                          break L50;
                                        } else {
                                          if (null == cf.field_h[wh.field_i[var9 / 12]]) {
                                            break L49;
                                          } else {
                                            sm.field_e = kd.a(cf.field_h[wh.field_i[var9 / 12]], 100, to.field_r[wh.field_i[var9 / 12]]);
                                            break L49;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (cf.field_h[wh.field_i[0]] == null) {
                                    break L49;
                                  } else {
                                    sm.field_e = kd.a(cf.field_h[wh.field_i[0]], 100, to.field_r[wh.field_i[0]]);
                                    break L49;
                                  }
                                }
                                if (null != sm.field_e) {
                                  discarded$9 = sc.a(sm.field_e, (byte) 68);
                                  break L48;
                                } else {
                                  break L48;
                                }
                              } else {
                                break L48;
                              }
                            }
                            var8 = 0;
                            if (-101 >= (this.field_u ^ -1)) {
                              if (ti.field_N < 0) {
                                break L44;
                              } else {
                                if (this.field_V.c((byte) 89)) {
                                  break L44;
                                } else {
                                  if ((rd.field_e[ti.field_N] ^ -1) != -2) {
                                    break L44;
                                  } else {
                                    if ((this.field_s ^ -1) != 999) {
                                      break L44;
                                    } else {
                                      this.field_u = 0;
                                      this.field_s = var4;
                                      this.field_r = var5;
                                      break L44;
                                    }
                                  }
                                }
                              }
                            } else {
                              if (ti.field_N < 0) {
                                break L44;
                              } else {
                                if (this.field_V.c((byte) 89)) {
                                  break L44;
                                } else {
                                  if ((rd.field_e[ti.field_N] ^ -1) != -2) {
                                    break L44;
                                  } else {
                                    if ((this.field_s ^ -1) != 999) {
                                      break L44;
                                    } else {
                                      this.field_u = 0;
                                      this.field_s = var4;
                                      this.field_r = var5;
                                      break L44;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            break L44;
                          }
                        }
                      }
                      L51: {
                        if (0 > ti.field_N) {
                          var8 = 1;
                          break L51;
                        } else {
                          L52: {
                            var9 = rd.field_e[ti.field_N];
                            if ((var9 ^ -1) == -3) {
                              break L52;
                            } else {
                              if (var9 == 4) {
                                break L52;
                              } else {
                                if (3 != var9) {
                                  break L51;
                                } else {
                                  break L52;
                                }
                              }
                            }
                          }
                          if (0 >= this.field_u) {
                            break L51;
                          } else {
                            this.field_u = 100;
                            var8 = 1;
                            break L51;
                          }
                        }
                      }
                      if (var8 == 0) {
                        break L31;
                      } else {
                        L53: {
                          if (0 < this.field_u) {
                            this.field_u = 64 * this.field_u / 100;
                            if (-2 < (this.field_u ^ -1)) {
                              this.field_u = 1;
                              break L53;
                            } else {
                              break L53;
                            }
                          } else {
                            break L53;
                          }
                        }
                        L54: {
                          if (sm.field_e == null) {
                            break L54;
                          } else {
                            bl.a(sm.field_e, param1 ^ 119);
                            sm.field_e = null;
                            break L54;
                          }
                        }
                        L55: {
                          var9 = var6.f(-51);
                          var10 = var6.i((byte) 11);
                          var11 = var6.p(param1 ^ -8329);
                          var12 = -var9 + var4;
                          var13 = -var10 + (var5 - -(var11 >> -1147770175));
                          var14 = (int)Math.sqrt((double)(var12 * var12 + var13 * var13));
                          if (0 > ti.field_N) {
                            break L55;
                          } else {
                            if (this.field_V.c((byte) 89)) {
                              break L55;
                            } else {
                              L56: {
                                if ((rd.field_e[ti.field_N] ^ -1) == -2) {
                                  if (-1000 == this.field_s) {
                                    this.field_u = 0;
                                    break L56;
                                  } else {
                                    break L56;
                                  }
                                } else {
                                  break L56;
                                }
                              }
                              L57: {
                                if (rd.field_e[ti.field_N] == 2) {
                                  break L57;
                                } else {
                                  if (-5 == (rd.field_e[ti.field_N] ^ -1)) {
                                    break L57;
                                  } else {
                                    if (-4 != (rd.field_e[ti.field_N] ^ -1)) {
                                      break L55;
                                    } else {
                                      if (!this.field_V.a(var6, var6.i((byte) -111), var6.f(param1 ^ -103), -129, ti.field_N)) {
                                        this.field_u = 0;
                                        break L55;
                                      } else {
                                        break L55;
                                      }
                                    }
                                  }
                                }
                              }
                              this.field_s = var4;
                              this.field_r = var5;
                              if (!this.field_V.a(var6, this.field_r, this.field_s, -129, ti.field_N)) {
                                this.field_u = 0;
                                break L55;
                              } else {
                                break L55;
                              }
                            }
                          }
                        }
                        L58: {
                          if (var14 != 0) {
                            break L58;
                          } else {
                            var13 = -1;
                            var14 = 1;
                            break L58;
                          }
                        }
                        if ((this.field_u ^ -1) >= -1) {
                          break L31;
                        } else {
                          if (this.field_V.c((byte) 89)) {
                            break L31;
                          } else {
                            L59: {
                              if (this.field_V.a(true)) {
                                break L59;
                              } else {
                                if (-1 < (ti.field_N ^ -1)) {
                                  break L59;
                                } else {
                                  L60: {
                                    this.field_u = (int)Math.sqrt((double)(this.field_u * 32));
                                    if ((ti.field_N ^ -1) == -88) {
                                      break L60;
                                    } else {
                                      if (ti.field_N == 116) {
                                        break L60;
                                      } else {
                                        if (-46 == (ti.field_N ^ -1)) {
                                          break L60;
                                        } else {
                                          if (54 == ti.field_N) {
                                            break L60;
                                          } else {
                                            if (154 == ti.field_N) {
                                              break L60;
                                            } else {
                                              if ((ti.field_N ^ -1) == -140) {
                                                break L60;
                                              } else {
                                                if (ti.field_N != 152) {
                                                  this.field_V.e(true);
                                                  break L60;
                                                } else {
                                                  break L60;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L61: {
                                    if (this.field_ab) {
                                      L62: {
                                        L63: {
                                          if (ti.field_N == 4) {
                                            break L63;
                                          } else {
                                            if (87 == ti.field_N) {
                                              break L63;
                                            } else {
                                              if ((ti.field_N ^ -1) != -117) {
                                                break L62;
                                              } else {
                                                break L63;
                                              }
                                            }
                                          }
                                        }
                                        this.field_u = this.field_Q;
                                        this.field_Q = 255 & 1 + this.field_Q;
                                        break L62;
                                      }
                                      L64: {
                                        if (this.field_h <= 0) {
                                          break L64;
                                        } else {
                                          this.i(2000);
                                          break L64;
                                        }
                                      }
                                      L65: {
                                        if (rd.field_e[ti.field_N] == 3) {
                                          this.a(ti.field_N, var4, this.field_V.n((byte) -75), this.field_bb, var5, (byte) -30, var6.f(-80), var6.i((byte) 113), this.field_u);
                                          break L65;
                                        } else {
                                          this.a(ti.field_N, var4, this.field_V.n((byte) -75), this.field_bb, var5, (byte) -30, this.field_s, this.field_r, this.field_u);
                                          break L65;
                                        }
                                      }
                                      if (ti.field_N == 87) {
                                        break L61;
                                      } else {
                                        ti.field_N = -1;
                                        break L61;
                                      }
                                    } else {
                                      this.a(var5, ti.field_N, this.field_r, var4, this.field_u, this.field_s, var6.y(17571), param1 ^ -65);
                                      if (ti.field_N != 87) {
                                        ti.field_N = -1;
                                        break L61;
                                      } else {
                                        break L61;
                                      }
                                    }
                                  }
                                  this.field_u = 0;
                                  break L31;
                                }
                              }
                            }
                            this.field_u = 0;
                            break L31;
                          }
                        }
                      }
                    } else {
                      break L31;
                    }
                  }
                }
              }
            }
          } else {
            break L31;
          }
        }
        L66: {
          if ((this.field_u ^ -1) >= -2) {
            break L66;
          } else {
            this.field_M = 2000;
            break L66;
          }
        }
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        if (param0 >= -97) {
            this.field_v = (int[]) null;
        }
        if (!(this.field_ab)) {
            var3 = param1 ? 1 : 0;
            gj.a(var3 != 0, true, 0, mn.field_r);
        }
    }

    private final void a(ml param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        try {
          L0: {
            L1: {
              if (-1 < (ti.field_N ^ -1)) {
                break L1;
              } else {
                if (0 == (ti.field_N ^ -1)) {
                  break L1;
                } else {
                  if (null != eb.field_b) {
                    break L1;
                  } else {
                    L2: {
                      var3_int = rd.field_e[ti.field_N];
                      if (-4 != (var3_int ^ -1)) {
                        break L2;
                      } else {
                        L3: {
                          if (-11 == (ti.field_N ^ -1)) {
                            break L3;
                          } else {
                            if ((ti.field_N ^ -1) == -124) {
                              break L3;
                            } else {
                              if (-126 == (ti.field_N ^ -1)) {
                                break L3;
                              } else {
                                if (138 == ti.field_N) {
                                  break L3;
                                } else {
                                  if (ti.field_N == 137) {
                                    break L3;
                                  } else {
                                    if (ti.field_N == 155) {
                                      break L3;
                                    } else {
                                      break L2;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        L4: {
                          if (!this.field_ab) {
                            break L4;
                          } else {
                            if (this.field_V.d(false) == this.field_I) {
                              break L4;
                            } else {
                              break L2;
                            }
                          }
                        }
                        this.a((byte) -7, param0);
                        break L2;
                      }
                    }
                    L5: {
                      if (0 == var3_int) {
                        break L5;
                      } else {
                        if (var3_int != 1) {
                          break L1;
                        } else {
                          if (this.field_s == -1000) {
                            break L1;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L6: {
                      if (!this.field_ab) {
                        break L6;
                      } else {
                        if (this.field_V.d(false) == this.field_I) {
                          break L6;
                        } else {
                          break L1;
                        }
                      }
                    }
                    this.a(-110, param0);
                    break L1;
                  }
                }
              }
            }
            L7: {
              if (-1 > (this.field_u ^ -1)) {
                L8: {
                  if (!this.field_ab) {
                    break L8;
                  } else {
                    if (this.field_V.d(false) == this.field_I) {
                      break L8;
                    } else {
                      break L7;
                    }
                  }
                }
                L9: {
                  var3_int = this.field_e;
                  var4 = this.field_c;
                  if (ti.field_N == 78) {
                    var4 += 64;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                this.a(var4, (byte) -82, param0, var3_int);
                break L7;
              } else {
                break L7;
              }
            }
            L10: {
              if (param1 > 42) {
                break L10;
              } else {
                this.field_s = -110;
                break L10;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) (var3);
            stackOut_35_1 = new StringBuilder().append("le.OA(");
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L11;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L11;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param1 + ')');
        }
    }

    private final void b(int param0, wk param1) {
        int discarded$3 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ml var10 = null;
        ml var11 = null;
        int var12 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            discarded$3 = param1.d(-10674);
            var3_int = param1.n(-98);
            var4 = param1.m(0);
            if (param0 > 18) {
              L1: {
                var5 = param1.m(0);
                var6 = param1.m(0);
                var7 = param1.m(0);
                var8 = param1.e((byte) -127);
                var9 = param1.e((byte) -94);
                this.field_w.a(this.field_w.d(false), var8, (byte) -107, var9, var4, var5, var7, var3_int, var6);
                discarded$4 = this.field_w.e((byte) 72);
                if (!this.field_k) {
                  L2: {
                    if (var8 == 158) {
                      break L2;
                    } else {
                      if ((var8 ^ -1) != -160) {
                        L3: {
                          L4: {
                            this.field_t = false;
                            this.field_V.a(this.field_V.d(false), var8, (byte) 11, var9, var4, var5, var7, var3_int, var6);
                            if (-7 == (var8 ^ -1)) {
                              break L4;
                            } else {
                              if ((var8 ^ -1) != -80) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          if (pb.field_m.b(true)) {
                            break L3;
                          } else {
                            break L1;
                          }
                        }
                        ma.a(li.field_I + tc.field_w[var8], 8421504, (byte) -41);
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (this.field_V.d(false) == this.field_I) {
                    if (var4 != this.field_p) {
                      break L1;
                    } else {
                      if (0 != this.field_h) {
                        break L1;
                      } else {
                        L5: {
                          var10 = this.field_V.a(this.field_bb, true);
                          var11 = this.field_w.a(this.field_bb, true);
                          if (var10 != null) {
                            break L5;
                          } else {
                            if (var11 != null) {
                              break L5;
                            } else {
                              break L1;
                            }
                          }
                        }
                        L6: {
                          if (var10 == null) {
                            break L6;
                          } else {
                            if (var11 == null) {
                              break L6;
                            } else {
                              if (var10.f(-118) != var11.f(72)) {
                                break L6;
                              } else {
                                if (var10.i((byte) -102) != var11.i((byte) 116)) {
                                  break L6;
                                } else {
                                  if (var10.o(-22625) != var11.o(-22625)) {
                                    break L6;
                                  } else {
                                    if (var10.m(-20357) == var11.m(-20357)) {
                                      break L1;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        this.field_V.a((byte) 125, this.field_w);
                        discarded$5 = this.field_V.e((byte) 72);
                        this.field_m.a(-86, this.field_V.a(this.field_bb, true));
                        break L1;
                      }
                    }
                  } else {
                    this.field_V.a(this.field_V.d(false), var8, (byte) 25, var9, var4, var5, var7, var3_int, var6);
                    if ((var8 ^ -1) == -160) {
                      ma.a(kj.field_b, 8421504, (byte) -117);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  bk.a(2);
                  break L1;
                }
              }
              this.field_o = true;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) (var3);
            stackOut_33_1 = new StringBuilder().append("le.EA(").append(param0).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L7;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L7;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final boolean e(boolean param0) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            this.field_r = 70;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_o) {
              break L2;
            } else {
              L3: {
                if (this.r(-33)) {
                  break L3;
                } else {
                  if (!this.field_k) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    private final void a(int param0, ml param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
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
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_91_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        String stackOut_90_2 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        String stackOut_89_2 = null;
        var19 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = n.field_g.field_nb;
              var4 = an.field_g + (vn.field_c - (an.field_f >> -1765702527));
              var5 = -(var3_int >> 1101346177) + me.field_I - -ol.field_g;
              if (0 >= this.field_u) {
                break L1;
              } else {
                var4 = this.field_e;
                var5 = this.field_c;
                break L1;
              }
            }
            L2: {
              var6 = param1.f(54);
              var7 = param1.i((byte) 108);
              var8 = param1.p(-8323);
              var9 = -var6 + var4;
              var10 = (var8 >> -1578986239) + (-var7 + var5);
              var11 = (int)Math.sqrt((double)(var9 * var9 + var10 * var10));
              if (0 != var11) {
                break L2;
              } else {
                var11 = 1;
                var10 = -1;
                break L2;
              }
            }
            L3: {
              var12 = 0;
              if ((ti.field_N ^ -1) == -19) {
                var12 = 1;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if ((ti.field_N ^ -1) == -51) {
                var12 = 1;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if ((ti.field_N ^ -1) == -122) {
                var12 = 1;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (24 == ti.field_N) {
                var12 = 1;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (36 == ti.field_N) {
                var12 = 1;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (126 != ti.field_N) {
                break L8;
              } else {
                var12 = 1;
                break L8;
              }
            }
            L9: {
              if (ti.field_N != 127) {
                break L9;
              } else {
                var12 = 1;
                break L9;
              }
            }
            L10: {
              if (-129 == (ti.field_N ^ -1)) {
                var12 = 1;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (-130 == (ti.field_N ^ -1)) {
                var12 = 1;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (ti.field_N != 136) {
                break L12;
              } else {
                var12 = 1;
                break L12;
              }
            }
            L13: {
              if (ti.field_N == 37) {
                var12 = 1;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (ti.field_N != 102) {
                break L14;
              } else {
                var12 = 1;
                break L14;
              }
            }
            L15: {
              if (86 == ti.field_N) {
                var12 = 1;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (87 == ti.field_N) {
                var12 = 1;
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              if ((ti.field_N ^ -1) == -117) {
                var12 = 1;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              if (-150 != (ti.field_N ^ -1)) {
                break L18;
              } else {
                var12 = 1;
                break L18;
              }
            }
            L19: {
              if (param0 <= -107) {
                break L19;
              } else {
                this.field_L = 81;
                break L19;
              }
            }
            L20: {
              if (var12 == 0) {
                break L20;
              } else {
                if (-1 > (this.field_u ^ -1)) {
                  this.field_u = 100;
                  break L20;
                } else {
                  break L20;
                }
              }
            }
            L21: {
              if (!this.field_V.a(true)) {
                L22: {
                  if (0 < var9) {
                    param1.field_E = 1;
                    break L22;
                  } else {
                    param1.field_E = -1;
                    break L22;
                  }
                }
                L23: {
                  L24: {
                    if (ti.field_N == 127) {
                      break L24;
                    } else {
                      if (-129 == (ti.field_N ^ -1)) {
                        break L24;
                      } else {
                        if (-130 == (ti.field_N ^ -1)) {
                          break L24;
                        } else {
                          if (ti.field_N == 136) {
                            break L24;
                          } else {
                            if (155 == ti.field_N) {
                              break L24;
                            } else {
                              break L23;
                            }
                          }
                        }
                      }
                    }
                  }
                  if (Math.abs(var9) >= Math.abs(var10)) {
                    break L23;
                  } else {
                    L25: {
                      var9 = param1.field_E * 64;
                      if (0 > var10) {
                        var10 = -64;
                        break L25;
                      } else {
                        var10 = 64;
                        break L25;
                      }
                    }
                    var11 = (int)Math.sqrt((double)(var9 * var9 - -(var10 * var10)));
                    if (var11 == 0) {
                      var11 = 1;
                      var10 = -1;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                }
                if (var12 == 0) {
                  var13 = var8 / 2;
                  var16 = 0;
                  L26: while (true) {
                    if (var16 >= 100) {
                      break L21;
                    } else {
                      L27: {
                        var17 = var16 + var13;
                        var14 = var9 * var17 / var11;
                        var15 = -var13 + var17 * var10 / var11;
                        var18 = 0;
                        if ((var16 ^ -1) <= -26) {
                          var18 = var18 | 16711680;
                          if (var16 < 75) {
                            var18 = var18 | var16 * 5 - 125 << 130659656 & 65280;
                            break L27;
                          } else {
                            var18 = var18 | 65280;
                            if ((var16 ^ -1) > -101) {
                              var18 = var18 | 10 * var16 - 750 & 255;
                              break L27;
                            } else {
                              var18 = var18 | 255;
                              break L27;
                            }
                          }
                        } else {
                          var18 = var18 | 16711680 & var16 * 10 << 285350768;
                          break L27;
                        }
                      }
                      L28: {
                        if ((var16 ^ -1) >= -26) {
                          de.c(-vn.field_c + (var6 - -var14 + (an.field_f >> -1285323487)), (var3_int >> 348597121) + -ol.field_g + var15 + var7, 1600 / (200 + -(var16 * 100 / 100)), var18, var16);
                          break L28;
                        } else {
                          de.c((an.field_f >> 625218945) + (-vn.field_c + var6) + var14, (var3_int >> -1692184031) + -ol.field_g + var15 + var7, 1600 / (200 - var16 * 100 / 100), var18, 25);
                          break L28;
                        }
                      }
                      var16++;
                      continue L26;
                    }
                  }
                } else {
                  var15 = var8 / 2;
                  var16 = 100 + var15;
                  var14 = (var3_int >> 1725395873) + -ol.field_g + var10 * (var16 + -50) / var11 + (-var15 + var7);
                  var13 = (an.field_f >> 413355681) + (var9 * (-50 + var16) / var11 - -var6) - vn.field_c;
                  tg.field_b[4].a(-16 + var13, -16 + var14);
                  var14 = (var3_int >> -502661215) + ((var16 + -50 - 16) * var10 / var11 - (var15 - var7 - -ol.field_g));
                  var13 = -vn.field_c + (var9 * (-50 + (var16 + -16)) / var11 + var6) - -(an.field_f >> 336855617);
                  tg.field_b[4].c(var13 + -8, var14 - 8);
                  var14 = (var3_int >> 1372985025) + var7 + -var15 + (var10 * (-24 + (var16 - 50)) / var11 - ol.field_g);
                  var13 = -vn.field_c + var6 + var9 * (-24 + var16 + -50) / var11 + (an.field_f >> -1057883199);
                  tg.field_b[4].b(var13 - 4, var14 - 4);
                  break L21;
                }
              } else {
                break L21;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L29: {
            var3 = decompiledCaughtException;
            stackOut_88_0 = (RuntimeException) (var3);
            stackOut_88_1 = new StringBuilder().append("le.N(").append(param0).append(',');
            stackIn_90_0 = stackOut_88_0;
            stackIn_90_1 = stackOut_88_1;
            stackIn_89_0 = stackOut_88_0;
            stackIn_89_1 = stackOut_88_1;
            if (param1 == null) {
              stackOut_90_0 = (RuntimeException) ((Object) stackIn_90_0);
              stackOut_90_1 = (StringBuilder) ((Object) stackIn_90_1);
              stackOut_90_2 = "null";
              stackIn_91_0 = stackOut_90_0;
              stackIn_91_1 = stackOut_90_1;
              stackIn_91_2 = stackOut_90_2;
              break L29;
            } else {
              stackOut_89_0 = (RuntimeException) ((Object) stackIn_89_0);
              stackOut_89_1 = (StringBuilder) ((Object) stackIn_89_1);
              stackOut_89_2 = "{...}";
              stackIn_91_0 = stackOut_89_0;
              stackIn_91_1 = stackOut_89_1;
              stackIn_91_2 = stackOut_89_2;
              break L29;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_91_0), stackIn_91_2 + ')');
        }
    }

    private final void c(wk param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        try {
            var3_int = param0.d(-10674);
            this.field_w.c(-1);
            var4 = this.field_w.o(4);
            if (param1 <= 47) {
                this.field_I = -95;
            }
            if (!(var4 == var3_int)) {
                if (this.field_k) {
                    he.field_e.b((byte) -67, 67);
                    he.field_e.a(var4, (byte) -101);
                    we.a(0, (byte) 93);
                }
                ka.b(false);
            }
            if (!(this.field_k)) {
                this.field_V.c(-1);
                this.field_z = 0;
            }
            this.field_o = true;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "le.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void c(int param0, int param1, int param2) {
        int var4 = 0;
        vn var5 = null;
        ml var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ml var11 = null;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 == 0) {
          var4 = n.field_g.field_nb;
          var5 = this.field_V.g((byte) 70);
          if (var5 == null) {
            return;
          } else {
            var6 = (ml) ((Object) var5.b(param1 + 12623));
            L0: while (true) {
              if (var6 == null) {
                L1: {
                  var11 = this.field_V.a(this.field_bb, true);
                  if (var11 != null) {
                    L2: {
                      var11.c((var4 >> -431058815) + -param0, (an.field_f >> 544990049) + -param2, 1703903841);
                      if (this.field_u != 0) {
                        break L2;
                      } else {
                        if (-1 == ti.field_N) {
                          break L2;
                        } else {
                          if (null == eb.field_b) {
                            var7 = -param2 - -(an.field_f >> 1384071201) - -var11.f(-88);
                            var8 = -48 + (var4 >> 672378433) + -param0 - -var11.i((byte) 115) + (-var11.p(-8323) + -this.field_M);
                            de.i(var7, var8, 20, 16777215);
                            gn.a(20, (byte) 99, 192, var7, var8);
                            de.c(var7, var8, 20, 0);
                            bb.field_g[dd.field_f[ti.field_N]].c(var7 + -20, var8 + -20);
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    L3: {
                      if (this.field_u != 0) {
                        break L3;
                      } else {
                        if (0 != (ti.field_N ^ -1)) {
                          break L3;
                        } else {
                          if (null != eb.field_b) {
                            break L3;
                          } else {
                            if (this.field_V.d(false) >= 0) {
                              var7 = -param2 + ((an.field_f >> 1629268289) + var11.f(param1 ^ -82));
                              var8 = -64 + var11.i((byte) 117) + (-param0 + ((var4 >> 1093167265) - var11.p(-8323))) + -this.field_M;
                              var9 = nj.field_n[this.field_V.d(false)];
                              if (this.field_V.d(false) < 0) {
                                break L3;
                              } else {
                                tg.field_b[3].b(var7 + -16, -(int)(Math.sin(3.14 * (double)this.field_P / 32.0) * 32.0) + -16 + var8, var9);
                                break L3;
                              }
                            } else {
                              this.g(0);
                              this.a(var11, 98);
                              break L1;
                            }
                          }
                        }
                      }
                    }
                    this.g(0);
                    this.a(var11, 98);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return;
              } else {
                L4: {
                  if (var6.y(17571) == this.field_bb) {
                    break L4;
                  } else {
                    var6.c((var4 >> 1974162273) + -param0, -param2 + (an.field_f >> -923083935), 1703903841);
                    break L4;
                  }
                }
                var6 = (ml) ((Object) var5.a(0));
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    private final ml q(int param0) {
        int var3 = 0;
        ml var4 = null;
        int var5 = 0;
        ml var6 = null;
        int var7 = 0;
        ml var8 = null;
        vn var9 = null;
        ml var10 = null;
        pg stackIn_10_0 = null;
        pg stackOut_9_0 = null;
        pg stackOut_8_0 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        var9 = this.field_V.g((byte) 85);
        var3 = this.field_bb;
        var8 = this.field_V.a(var3, true);
        var4 = var8;
        if (param0 == 10781) {
          if (var8 != null) {
            L0: {
              var5 = 0;
              if (var8.i((byte) 127) < this.field_V.field_H) {
                break L0;
              } else {
                var5 = 1;
                break L0;
              }
            }
            var6 = var8;
            L1: while (true) {
              L2: {
                if (var6.field_b == var9.field_e) {
                  stackOut_9_0 = var9.field_e.field_b;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = var6.field_b;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              L3: {
                var10 = (ml) ((Object) stackIn_10_0);
                if (var10 == var8) {
                  break L3;
                } else {
                  L4: {
                    if (var5 == 0) {
                      break L4;
                    } else {
                      if (var10.t(34)) {
                        break L4;
                      } else {
                        if (37 != var10.o(-22625)) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (this.field_V.field_d) {
                    L5: {
                      L6: {
                        if (var10 == null) {
                          break L6;
                        } else {
                          if (var10.y(17571) == this.field_V.d(false)) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if (var10.w(24501) == null) {
                        continue L1;
                      } else {
                        if (var10.r(106) == this.field_V.q((byte) -115)) {
                          break L5;
                        } else {
                          continue L1;
                        }
                      }
                    }
                    if (-13 != (var10.o(param0 + -33406) ^ -1)) {
                      var4 = var10;
                      this.field_bb = var10.y(param0 + 6790);
                      eb.field_b = null;
                      ti.field_N = -1;
                      var10.a((byte) -31, 0);
                      break L3;
                    } else {
                      continue L1;
                    }
                  } else {
                    if (var10 == null) {
                      continue L1;
                    } else {
                      if (-13 == (var10.o(-22625) ^ -1)) {
                        continue L1;
                      } else {
                        if (var10.g(false) != this.field_V.d(false)) {
                          continue L1;
                        } else {
                          var4 = var10;
                          this.field_bb = var10.y(17571);
                          eb.field_b = null;
                          ti.field_N = -1;
                          var10.a((byte) 65, 0);
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              this.field_m.a(param0 + -10886, var4);
              return var4;
            }
          } else {
            return null;
          }
        } else {
          return (ml) null;
        }
    }

    private final void c(boolean param0) {
        this.field_V.b((byte) 88, this.field_J);
        this.field_V.c(-1);
        this.b(0);
        this.field_F = param0 ? true : false;
        this.field_z = this.field_V.f(12955);
    }

    private final void d(int param0) {
        int discarded$3 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ml var7 = null;
        L0: {
          var2 = -50 + an.field_f;
          var3 = 10;
          var4 = -1;
          if (0 == this.field_V.a(param0 + -6154)) {
            var4 = 5;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param0 == -25343) {
            break L1;
          } else {
            var7 = (ml) null;
            this.a(-125, (ml) null);
            break L1;
          }
        }
        L2: {
          if (this.field_V.a(param0 ^ 6646) == 1) {
            var4 = 17;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (2 != this.field_V.a(param0 ^ 6646)) {
            break L3;
          } else {
            var4 = 42;
            break L3;
          }
        }
        L4: {
          if (-5 == (this.field_V.a(-31497) ^ -1)) {
            var4 = 29;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if ((this.field_V.a(-31497) ^ -1) == -6) {
            var4 = 55;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (-7 != (this.field_V.a(-31497) ^ -1)) {
            break L6;
          } else {
            var4 = 67;
            break L6;
          }
        }
        L7: {
          if ((this.field_V.a(-31497) ^ -1) != -8) {
            break L7;
          } else {
            var4 = 85;
            break L7;
          }
        }
        L8: {
          if ((this.field_V.a(-31497) ^ -1) != -9) {
            break L8;
          } else {
            var4 = 72;
            break L8;
          }
        }
        L9: {
          if (0 == (var4 ^ -1)) {
            break L9;
          } else {
            if (this.field_V.n((byte) -75) < this.field_V.l(4)) {
              var5 = 256 * (this.field_V.l(4) - this.field_V.n((byte) -75)) / this.field_V.l(4);
              de.g(-4 + var2, var3 - 4, 48, 48, 8, 8355711);
              de.g(-2 + var2, var3 + -2, 44, 44, 6, 16777215);
              bb.field_g[var4].c(var2, var3, -var5 + 256);
              var6 = (-1 + this.field_V.l(4) + (-this.field_V.n((byte) -75) - -this.field_V.s(0))) / this.field_V.s(0);
              discarded$3 = tj.field_t.a(Integer.toString(var6), -4 + var2, -4 + (var3 + -1), 48, 48, 8355711, 0, 1, 1, tj.field_t.field_C);
              discarded$4 = tj.field_t.a(Integer.toString(var6), -5 + var2, -4 + var3, 48, 48, 8355711, 0, 1, 1, tj.field_t.field_C);
              discarded$5 = tj.field_t.a(Integer.toString(var6), -4 + var2, -4 + var3, 48, 48, 16777215, -1, 1, 1, tj.field_t.field_C);
              break L9;
            } else {
              de.g(-4 + var2, -4 + var3, 48, 48, 8, 8323072);
              de.g(-2 + var2, var3 + -2, 44, 44, 6, 16711680);
              bb.field_g[var4].c(var2, var3);
              break L9;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var10 = 0;
        L0: {
          var10 = ArcanistsMulti.field_G ? 1 : 0;
          if (param7 < -58) {
            break L0;
          } else {
            this.field_c = 77;
            break L0;
          }
        }
        L1: {
          if (param6 != -1) {
            L2: {
              this.field_t = false;
              if ((param1 ^ -1) == -88) {
                break L2;
              } else {
                if (-117 == (param1 ^ -1)) {
                  break L2;
                } else {
                  if (param1 == 158) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        if (6 == param1) {
                          break L4;
                        } else {
                          if (param1 != 79) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      if (pb.field_m.b(true)) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                    if ((param1 ^ -1) == -160) {
                      ma.a(kj.field_b, 8421504, (byte) -42);
                      break L2;
                    } else {
                      ma.a(li.field_I + tc.field_w[param1], 8421504, (byte) -103);
                      break L2;
                    }
                  }
                }
              }
            }
            this.field_V.a(this.field_V.d(false), param1, (byte) 77, param4, param3, param0, param2, param6, param5);
            break L1;
          } else {
            this.field_V.e(true);
            break L1;
          }
        }
        L5: {
          if (qg.a(-127)) {
            break L5;
          } else {
            if (this.field_V.b(this.field_J, -89)) {
              gj.a(false, true, -1, mn.field_r);
              break L5;
            } else {
              break L5;
            }
          }
        }
    }

    final void g(byte param0) {
        if (!this.field_ab) {
            throw new IllegalStateException();
        }
        he.field_e.b((byte) -79, 61);
        if (param0 != -61) {
            this.field_e = -97;
        }
    }

    private final void b(wk param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        try {
            this.field_k = false;
            this.field_V.a((byte) 72, this.field_w);
            var3_int = param0.o(6);
            var4 = param0.e((byte) -114);
            this.field_V.a(var3_int, (byte) 63, var4);
            if (null != this.field_w) {
                this.field_w.a(var3_int, (byte) 60, var4);
            }
            gj.a(false, true, param1, mn.field_r);
            this.field_o = true;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "le.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    le(boolean param0, int param1, int param2, boolean param3, String[] param4, int param5, int[][] param6, int[][] param7, int[] param8, int param9, int param10, boolean param11, int param12, boolean[] param13) {
        RuntimeException var15 = null;
        int var15_int = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
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
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
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
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        this.field_g = true;
        this.field_y = true;
        this.field_v = new int[6];
        this.field_C = false;
        this.field_K = 4;
        this.field_F = false;
        this.field_U = false;
        this.field_H = true;
        this.field_o = false;
        this.field_l = new int[]{17, 17, 17, 17, 17, 17};
        this.field_T = false;
        this.field_X = true;
        this.field_t = false;
        this.field_O = false;
        this.field_G = true;
        this.field_B = false;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param0) {
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
              ((le) (this)).field_ab = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param11) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((le) (this)).field_i = stackIn_7_1 != 0;
              this.field_I = param5;
              var15_int = param12;
              this.field_V = new nf(false, false, param1, param2, param3, param4, param9, param10, param6, param7, param8, var15_int, param13);
              this.field_V.field_H = 960;
              this.field_V.field_y = 1920;
              this.field_V.field_Hb = this.field_V.field_H >> 1283451265;
              this.field_V.field_hb = this.field_V.field_y >> 1971350049;
              this.field_V.p(88);
              this.field_V.c(true);
              ue.a((byte) -117, (le) (this));
              this.field_W = -1;
              this.field_x = 0;
              this.field_f = null;
              this.field_m = new ol();
              this.field_cb = new vn();
              if (!this.field_ab) {
                k.a((le) (this), true);
                df.a((byte) 83, 0);
                this.field_V.field_sb = cf.field_h;
                this.field_V.field_rb = uk.field_g;
                break L3;
              } else {
                tj.c(63);
                this.field_w = new nf(false, false, param1, param2, param3, param4, param9, param10, param6, param7, param8, var15_int, param13);
                this.field_w.p(63);
                this.field_w.c(true);
                this.field_k = true;
                this.field_L = 0;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var15 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var15);
            stackOut_11_1 = new StringBuilder().append("le.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param5).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param6 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param7 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param8 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          L8: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param13 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
    }

    static {
        field_d = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 5, 5, 5, 0, 0, 3, 0, 0, 3, 0, 0, 0, 3, 5, 5, 0, 3, 0, 3, 0, 0, 3, 5, 0, 0, 3, 5, 0, 0, 0, 0, 0, 3, 0, 0, 0, 3, 5, 5, 0, 3, 0, 0, 0, 5, 0, 3, 0, 5, 3, 5, 0, 3, 0, 5, 3, 5, 0, 0, 0, 0, 5, 5, 0, 0, 0, 0, 0, 0, 3, 0, 0, 3, 5, 5, 0, 3, 0, 5, 3, 5, 0, 0, 0, 3, 5, 5, 0, 3, 0, 3, 0, 0, 0, 3, 0, 0, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 15, 15, 15, 15, 15, 15, 15, 0, 0, 0, 0, 0, 3, 0, 0};
        field_db = "Connecting to<br>friend server...";
        field_A = "Confirm Password: ";
        field_N = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
