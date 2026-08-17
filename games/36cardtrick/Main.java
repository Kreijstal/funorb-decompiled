/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

public final class Main extends c {
    uh field_cb;
    static int field_G;
    static String field_y;
    static le field_W;
    ad field_P;
    private bk field_X;
    private boolean field_L;
    int field_D;
    int field_C;
    private int field_B;
    private int field_ab;
    private int field_db;
    re[] field_E;
    private String field_Z;
    private int field_J;
    private int field_eb;
    private int field_O;
    static String field_M;
    private int field_bb;
    static te field_V;
    private int field_Q;
    private int field_U;
    private byte[] field_H;
    private int field_F;
    private long field_R;
    private int field_N;
    private int field_K;
    private long field_z;
    private kc[] field_I;
    private int field_Y;
    private long field_S;
    private int field_A;
    public static int field_T;

    private final void r(int param0) {
        Object stackIn_5_0 = null;
        Object stackIn_7_0 = null;
        double stackIn_7_1 = 0.0;
        Object stackIn_8_0 = null;
        double stackIn_8_1 = 0.0;
        int stackIn_8_2 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_17_0 = null;
        double stackIn_17_1 = 0.0;
        Object stackIn_18_0 = null;
        double stackIn_18_1 = 0.0;
        int stackIn_18_2 = 0;
        Object stackIn_22_0 = null;
        double stackIn_22_1 = 0.0;
        Object stackIn_23_0 = null;
        double stackIn_23_1 = 0.0;
        int stackIn_23_2 = 0;
        Object stackIn_26_0 = null;
        double stackIn_26_1 = 0.0;
        Object stackIn_27_0 = null;
        double stackIn_27_1 = 0.0;
        int stackIn_27_2 = 0;
        RuntimeException decompiledCaughtException = null;
        double var2_double = 0.0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        var18 = field_T;
        try {
          L0: {
            L1: {
              L2: {
                var2_double = (double)(dh.field_m + -this.field_z) / (double)this.field_ab;
                var4 = this.q(param0 + -16777142) * 69 + 36;
                var5 = this.m(124) * 69 + 201;
                var6 = this.field_H[this.s(param0 ^ -16751697)];
                var7 = 36 - -(this.m((byte) 45) * 69);
                var8 = this.j(0) * 69 + 201;
                var9 = this.field_H[this.n(128)];
                if (-1 != var6) {
                  break L2;
                } else {
                  L3: {
                    stackIn_7_0 = this;

                    stackIn_7_1 = (double)var7 * (1.0 - var2_double) + var2_double * (double)var4;

                    if (this.field_L) {
                      stackIn_8_0 = this;
                      stackIn_8_1 = stackIn_7_1;
                      stackIn_8_2 = var9;
                      break L3;
                    } else {
                      stackIn_5_0 = this;

                      stackIn_8_0 = this;
                      stackIn_8_1 = stackIn_7_1;
                      stackIn_8_2 = 0;
                      break L3;
                    }
                  }
                  this.a(stackIn_8_1, stackIn_8_2, (double)var8 * (1.0 - var2_double) + (double)var5 * var2_double, param0 ^ 16777215);
                  if (var18 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if ((var9 ^ -1) != 0) {
                  break L4;
                } else {
                  L5: {
                    stackIn_17_0 = this;

                    stackIn_17_1 = (1.0 - var2_double) * (double)var4 + (double)var7 * var2_double;

                    if (this.field_L) {
                      stackIn_18_0 = this;
                      stackIn_18_1 = stackIn_17_1;
                      stackIn_18_2 = var6;
                      break L5;
                    } else {
                      stackIn_15_0 = this;

                      stackIn_18_0 = this;
                      stackIn_18_1 = stackIn_17_1;
                      stackIn_18_2 = 0;
                      break L5;
                    }
                  }
                  this.a(stackIn_18_1, stackIn_18_2, (double)var8 * var2_double + (1.0 - var2_double) * (double)var5, 0);
                  if (var18 == 0) {
                    break L1;
                  } else {
                    break L4;
                  }
                }
              }
              L6: {
                var10 = 3.141592653589793 * var2_double;
                var12 = Math.sin(var10);
                var14 = Math.cos(var10);
                var16 = (var4 - -var7) / 2;
                var17 = (var8 + var5) / 2;
                stackIn_22_0 = this;

                stackIn_22_1 = (double)(var4 - var16) * var14 + (-(var12 * (double)(-var17 + var5)) + (double)var16);

                if (!this.field_L) {
                  stackIn_23_0 = this;
                  stackIn_23_1 = stackIn_22_1;
                  stackIn_23_2 = 0;
                  break L6;
                } else {
                  stackIn_23_0 = this;
                  stackIn_23_1 = stackIn_22_1;
                  stackIn_23_2 = var6;
                  break L6;
                }
              }
              L7: {
                this.a(stackIn_23_1, stackIn_23_2, var12 * (double)(var4 - var16) + ((double)var17 + var14 * (double)(-var17 + var5)), 0);
                stackIn_26_0 = this;

                stackIn_26_1 = (double)var16 - var12 * (double)(-var17 + var8) + var14 * (double)(-var16 + var7);

                if (!this.field_L) {
                  stackIn_27_0 = this;
                  stackIn_27_1 = stackIn_26_1;
                  stackIn_27_2 = 0;
                  break L7;
                } else {
                  stackIn_27_0 = this;
                  stackIn_27_1 = stackIn_26_1;
                  stackIn_27_2 = var9;
                  break L7;
                }
              }
              this.a(stackIn_27_1, stackIn_27_2, (double)var17 + var14 * (double)(-var17 + var8) + var12 * (double)(-var16 + var7), 0);
              break L1;
            }
            L8: {
              if (param0 == 16777215) {
                break L8;
              } else {
                this.field_X = (bk) null;
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "Main.NA(" + param0 + ')');
        }
    }

    private final int s(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -25520) {
              stackIn_4_0 = this.q(7) * 6 - -this.m(param0 ^ -25567);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 120;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "Main.LB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void l(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              this.field_cb = null;
              this.field_P = null;
              sc.a((byte) 81, lc.field_a[1]);
              ai.field_m = 0;
              nb.field_e = 0;
              rj.field_p = af.field_ob - vf.field_b;
              ue.field_d = param0;
              dg.field_J = 0;
              if (-3 >= (ec.field_f ^ -1)) {
                jf.field_n = false;
                break L1;
              } else {
                break L1;
              }
            }
            q.field_i = 255;
            this.p((byte) 99);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "Main.BB(" + param0 + ')');
        }
    }

    private final void a(double param0, int param1, double param2, int param3) {
        try {
            this.field_I[param1].b((int)(param2 + 0.5), (int)(param0 + 0.5));
            if (param3 != 0) {
                this.field_A = 77;
            }
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "Main.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int n(int param0) {
        int discarded$1 = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 128) {
                break L1;
              } else {
                discarded$1 = this.s(41);
                break L1;
              }
            }
            stackIn_4_0 = this.m((byte) 75) * 6 + this.j(0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "Main.TA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final void n(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 7) {
                break L1;
              } else {
                this.l(40);
                break L1;
              }
            }
            L2: {
              if (null == ue.field_a) {
                break L2;
              } else {
                qi.a((byte) -87, ue.field_a);
                ue.field_a = null;
                hj.b((byte) -20);
                break L2;
              }
            }
            mh.field_c = aj.a(1, 1);
            id.field_a = aj.a(1, 5);
            sh.field_g = aj.a(param0 ^ 6, 2);
            fb.field_a = aj.a(1, 3);
            ll.field_e = aj.a(param0 + -6, 4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "Main.LA(" + param0 + ')');
        }
    }

    private final void d(int param0, int param1) {
        int var3_int = 0;
        try {
            var3_int = param0 / 60;
            param0 = param0 % 60;
            this.field_Z = String.valueOf(var3_int) + ':' + String.valueOf(param0 / 10) + String.valueOf(param0 % param1);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "Main.RA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void p(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = field_T;
        try {
          L0: {
            hb.field_d = hb.field_d + 1;
            vf.field_b = vf.field_b + (af.field_ob << -1934370207);
            rj.field_p = rj.field_p - (af.field_ob << -1758211615);
            if (param0 == -97283608) {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      L5: {
                        L6: {
                          L7: {
                            L8: {
                              L9: {
                                L10: {
                                  tk.field_c = tk.field_c + 2;
                                  var2_int = ff.field_b;
                                  if ((var2_int ^ -1) != -10) {
                                    break L10;
                                  } else {
                                    if (var3 == 0) {
                                      break L9;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                L11: {
                                  if ((var2_int ^ -1) != -2) {
                                    break L11;
                                  } else {
                                    if (var3 == 0) {
                                      break L8;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                if (2 == var2_int) {
                                  break L7;
                                } else {
                                  L12: {
                                    if ((var2_int ^ -1) != -4) {
                                      break L12;
                                    } else {
                                      if (var3 == 0) {
                                        break L6;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  L13: {
                                    if (7 != var2_int) {
                                      break L13;
                                    } else {
                                      if (var3 == 0) {
                                        break L6;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  L14: {
                                    if (-9 != (var2_int ^ -1)) {
                                      break L14;
                                    } else {
                                      if (var3 == 0) {
                                        break L5;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  if (4 == var2_int) {
                                    break L4;
                                  } else {
                                    if (var2_int == 5) {
                                      break L3;
                                    } else {
                                      if (6 != var2_int) {
                                        break L1;
                                      } else {
                                        if (var3 == 0) {
                                          break L2;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L15: {
                                if (-1 == (1073741824 & rk.field_X ^ -1)) {
                                  break L15;
                                } else {
                                  L16: {
                                    hb.field_d = hb.field_d - 2;
                                    if ((hb.field_d ^ -1) == -32) {
                                      break L16;
                                    } else {
                                      if (0 != hb.field_d) {
                                        break L1;
                                      } else {
                                        rk.field_X = 0;
                                        ff.field_b = -1;
                                        if (var3 == 0) {
                                          break L1;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                  }
                                  L17: {
                                    L18: {
                                      if (dl.d(0)) {
                                        break L18;
                                      } else {
                                        L19: {
                                          ra.field_d = sk.a(4, (byte) 125);
                                          if (0 >= ai.field_m) {
                                            break L19;
                                          } else {
                                            if (!jf.field_n) {
                                              this.field_P = pk.a(fb.field_c[this.field_C], new int[]{(ai.field_m << -477923896) + dg.field_J}, af.field_ob, vb.field_a[this.field_C], vf.field_b, rj.field_p, tk.field_c, (byte) 80, 3);
                                              break L19;
                                            } else {
                                              break L19;
                                            }
                                          }
                                        }
                                        dj.field_a = (byte)(rk.field_X >> -97283608);
                                        if (var3 == 0) {
                                          break L17;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                    dj.field_a = (byte)rk.field_X;
                                    break L17;
                                  }
                                  if (dj.field_a != -2) {
                                    break L1;
                                  } else {
                                    dj.field_a = 0;
                                    mb.a(qa.field_b.field_s * 3 >> -1851182527, 18, g.field_C, true, 9414, 240, tc.field_a, 6, 320, 2, 18, qa.field_b);
                                    if (var3 == 0) {
                                      break L1;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                              }
                              if ((hb.field_d ^ -1) != -33) {
                                break L1;
                              } else {
                                L20: {
                                  L21: {
                                    if (!eh.d(19314)) {
                                      break L21;
                                    } else {
                                      we.b(-122);
                                      if (var3 == 0) {
                                        break L20;
                                      } else {
                                        break L21;
                                      }
                                    }
                                  }
                                  pf.b((byte) 127);
                                  break L20;
                                }
                                rk.field_X = rk.field_X | 1073741824;
                                if (var3 == 0) {
                                  break L1;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            if (-33 != (hb.field_d ^ -1)) {
                              break L1;
                            } else {
                              ff.field_b = -1;
                              dj.field_a = -1;
                              if (var3 == 0) {
                                break L1;
                              } else {
                                break L7;
                              }
                            }
                          }
                          if ((hb.field_d ^ -1) != -33) {
                            break L1;
                          } else {
                            ff.field_b = -1;
                            dj.field_a = rk.field_X;
                            if (var3 == 0) {
                              break L1;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L22: {
                          if (-2 != (hb.field_d ^ -1)) {
                            break L22;
                          } else {
                            L23: {
                              if (5 != rk.field_X) {
                                break L23;
                              } else {
                                if (!dl.d(param0 + 97283608)) {
                                  this.field_cb = il.a(8, 3, 25404, fb.field_c[this.field_C], 1);
                                  break L23;
                                } else {
                                  break L23;
                                }
                              }
                            }
                            if (-4 == (ff.field_b ^ -1)) {
                              cd.field_h = -1;
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                        }
                        if (32 != hb.field_d) {
                          break L1;
                        } else {
                          ff.field_b = -1;
                          dj.field_a = rk.field_X;
                          if (var3 == 0) {
                            break L1;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L24: {
                        if (-2 == (hb.field_d ^ -1)) {
                          L25: {
                            if (-6 != (rk.field_X ^ -1)) {
                              break L25;
                            } else {
                              if (!dl.d(0)) {
                                this.field_cb = il.a(8, 3, 25404, fb.field_c[this.field_C], 1);
                                break L25;
                              } else {
                                break L25;
                              }
                            }
                          }
                          cd.field_h = dj.field_a;
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                      if (32 != hb.field_d) {
                        break L1;
                      } else {
                        ff.field_b = -1;
                        dj.field_a = rk.field_X;
                        if (var3 == 0) {
                          break L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (32 != hb.field_d) {
                      break L1;
                    } else {
                      L26: {
                        L27: {
                          ff.field_b = -1;
                          if (-8 == (rk.field_X ^ -1)) {
                            break L27;
                          } else {
                            if ((this.field_U ^ -1) != -5) {
                              break L26;
                            } else {
                              if (-1 <= (this.field_K ^ -1)) {
                                break L26;
                              } else {
                                gh.a(ve.field_c, (byte) -78);
                                if (var3 == 0) {
                                  break L26;
                                } else {
                                  break L27;
                                }
                              }
                            }
                          }
                        }
                        this.p((byte) -101);
                        break L26;
                      }
                      dj.field_a = -1;
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (hb.field_d == 32) {
                    ff.field_b = -1;
                    dj.field_a = rk.field_X;
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    break L1;
                  }
                }
                if (-33 == (hb.field_d ^ -1)) {
                  ff.field_b = -1;
                  var2_int = dj.field_a;
                  dj.field_a = rk.field_X;
                  rk.field_X = var2_int;
                  break L1;
                } else {
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
          throw ma.a((Throwable) ((Object) var2), "Main.PA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int j(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                Main.a((byte) -61, (int[]) null);
                break L1;
              }
            }
            stackIn_4_0 = this.field_Y & 15;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "Main.UA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void f(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              jl.b((byte) 22);
              if (null == gj.field_a) {
                break L1;
              } else {
                ga.a(true);
                break L1;
              }
            }
            L2: {
              ph.c(1);
              if (param0 < -36) {
                break L2;
              } else {
                this.d(53, -62);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "Main.FB(" + param0 + ')');
        }
    }

    private final void p(byte param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = field_T;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        jl.field_h = jl.field_h + ((bc.field_a << 1542994273) + bc.field_a);
                        tk.field_a = tk.field_a + 3;
                        ol.field_W = ol.field_W + (tk.field_a << -2099912031);
                        nb.field_e = nb.field_e | ue.field_d;
                        bc.field_a = bc.field_a + 2;
                        q.field_i = q.field_i - 1;
                        dg.field_J = dg.field_J + 1;
                        ue.field_d = 0;
                        rj.field_p = rj.field_p + 1;
                        this.field_Q = this.field_H.length / 2;
                        var2_int = -88 % ((param0 - -29) / 55);
                        var3 = this.field_H.length + -1;
                        var4 = 19;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var3 < 0) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        incrementValue$0 = var3;
                        var3--;
                        this.field_H[incrementValue$0] = (byte)var4;
                        incrementValue$1 = var3;
                        var3--;
                        this.field_H[incrementValue$1] = (byte)var4;
                        var4--;
                        if (var6 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var6 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var3 = this.field_H.length;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (-1 <= (var3 ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        incrementValue$2 = var3;
                        var3--;
                        var4 = sj.a(10999, incrementValue$2, uh.field_l);
                        var5 = this.field_H[var3];
                        this.field_H[var3] = this.field_H[var4];
                        this.field_H[var4] = (byte) var5;
                        if (var6 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var6 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_16_0 = this;
                        stackIn_14_0 = stackIn_16_0;
                        if (-4 >= (dg.field_J ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_17_0 = this;
                        stackIn_17_1 = 1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_17_0 = this;
                        stackIn_17_1 = 2 * ((-1 + dg.field_J) / 2);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((Main) (this)).field_eb = stackIn_17_1;
                        this.field_ab = Math.max(-(dg.field_J * 50) + 600, 100);
                        this.field_J = Math.max(44 + -(4 * dg.field_J), 20);
                        var3 = Math.max(-(20000 * dg.field_J) + 200000, 40000);
                        this.field_bb = this.field_eb * ((20 + this.field_J) * this.field_ab) / 2 + var3;
                        var4 = this.field_bb % 10000;
                        this.field_bb = this.field_bb - var4;
                        this.field_N = -1;
                        this.field_A = -1;
                        this.field_O = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var4 > 5000) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        this.field_bb = this.field_bb + 10000;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        this.field_F = 0;
                        this.c(-115, 1);
                        this.field_db = this.field_bb;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw ma.a((Throwable) ((Object) var2), "Main.EA(" + param0 + ')');
                }
                case 25: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int m(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 > 112) {
              stackIn_4_0 = (4020 & this.field_Y) >> -1282925816;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 70;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "Main.EB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(boolean param0) {
        int discarded$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_11_0 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_24_0 = 0;
        Object stackIn_84_0 = null;
        Object stackIn_86_0 = null;
        Object stackIn_88_0 = null;
        Object stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        dh var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = field_T;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        h.e((byte) -84);
                        if (null == gj.field_a) {
                            statePc = 12;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (!gj.field_a.field_b) {
                            statePc = 12;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param0) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_11_0 = 1;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ga.a(stackIn_11_0 != 0);
                        g.k(4);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_15_0 = this;
                        stackIn_13_0 = stackIn_15_0;
                        stackIn_15_1 = -71;
                        stackIn_13_1 = stackIn_15_1;
                        if (gj.field_a == null) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_16_0 = this;
                        stackIn_16_1 = stackIn_13_1;
                        stackIn_16_2 = 1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = this;
                        stackIn_16_1 = stackIn_15_1;
                        stackIn_16_2 = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.a((byte) stackIn_16_1, stackIn_16_2 != 0);
                        if (kj.field_P) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        this.n((byte) 7);
                        kj.field_P = false;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (param0) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_24_0 = 1;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_24_0 = 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (!th.a(stackIn_24_0 != 0)) {
                            statePc = 31;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        this.k((byte) -100);
                        if (ri.b((byte) 38)) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        discarded$0 = this.b(false, (byte) -59);
                        if (var3 == 0) {
                            statePc = 140;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (!fg.field_k) {
                            statePc = 129;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (null == ra.field_d) {
                            statePc = 52;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (!ra.field_d.field_j) {
                            statePc = 140;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        rg.field_e = ra.field_d.field_h;
                        nb.field_e = nb.field_e & (rg.field_e ^ -1);
                        ue.field_d = ue.field_d & (rg.field_e ^ -1);
                        db.field_m = db.field_m | rg.field_e;
                        var2 = (dh) ((Object) ij.field_h.a((byte) 74));
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var2 == null) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        ii.a(var2, 4, 8192);
                        var2 = (dh) ((Object) ij.field_h.b((byte) -98));
                        if (var3 != 0) {
                            statePc = 47;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var3 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        ra.field_d = null;
                        cf.a((Main) (this), (byte) 45);
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (dj.field_a == 10) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        dj.field_a = 5;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        ok.b(55);
                        if (var3 == 0) {
                            statePc = 140;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (eh.d(19314)) {
                            statePc = 102;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (ag.b(-109)) {
                            statePc = 83;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        dh.field_m = dh.field_m + 20L;
                        if ((ff.field_b ^ -1) != 0) {
                            statePc = 70;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if ((dj.field_a ^ -1) == 0) {
                            statePc = 67;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        this.field_E[dj.field_a].a((byte) -114);
                        if (var3 == 0) {
                            statePc = 72;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        this.o(1);
                        if (var3 == 0) {
                            statePc = 72;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        this.p(-97283608);
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (this.field_X.a((byte) 74) == null) {
                            statePc = 79;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        fieldTemp$1 = this.field_B + 1;
                        this.field_B = this.field_B + 1;
                        if ((fieldTemp$1 ^ -1) == -336) {
                            statePc = 78;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        this.field_B = 0;
                        this.field_X.d(-89);
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (0 != dl.field_h) {
                            statePc = 82;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var2_int = eg.field_b * (640 ^ ij.field_e);
                        tk.field_c = tk.field_c + 8;
                        jl.field_h = jl.field_h + var2_int;
                        ol.field_W = ol.field_W - var2_int;
                        vf.field_b = vf.field_b + (af.field_ob << 631018627);
                        rj.field_p = rj.field_p - (af.field_ob << 1299850659);
                        if (var3 == 0) {
                            statePc = 140;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        stackIn_88_0 = this;
                        stackIn_84_0 = stackIn_88_0;
                        if (null == gj.field_a) {
                            statePc = 88;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        stackIn_86_0 = this;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        stackIn_89_0 = this;
                        stackIn_89_1 = 1;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        stackIn_89_0 = this;
                        stackIn_89_1 = 0;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var2_int = this.a(stackIn_89_1 != 0, (byte) 104);
                        if (var2_int == 1) {
                            statePc = 93;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (-3 != (var2_int ^ -1)) {
                            statePc = 101;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (null == gj.field_a) {
                            statePc = 98;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        ga.a(true);
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (2 != var2_int) {
                            statePc = 101;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        pb.a((byte) -124, mk.g(-124));
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (var3 == 0) {
                            statePc = 140;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (ff.field_b == -1) {
                            statePc = 107;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        var2_int = nl.a(true);
                        if ((var2_int ^ -1) == -3) {
                            statePc = 120;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if ((var2_int ^ -1) != -4) {
                            statePc = 114;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        mb.a(qa.field_b.field_s * 3 >> 1485939809, 18, g.field_C, true, 9414, 240, tc.field_a, 6, 320, 2, 18, qa.field_b);
                        if (var3 == 0) {
                            statePc = 122;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (4 == var2_int) {
                            statePc = 119;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        this.a(-2, false, -2, -112);
                        if (var3 == 0) {
                            statePc = 122;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        ga.a(true);
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        if (eh.d(19314)) {
                            statePc = 125;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        this.field_E[dj.field_a].a(-31102, true);
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        if ((ff.field_b ^ -1) != -10) {
                            statePc = 140;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        this.p(-97283608);
                        if (var3 == 0) {
                            statePc = 140;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        hj.a(2, eg.field_f);
                        var2_int = this.b(true, (byte) -51);
                        if (2 == var2_int) {
                            statePc = 132;
                        } else {
                            statePc = 130;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        bc.field_a = -2073859829;
                        ol.field_W = -2073859829;
                        ok.b(63);
                        this.v(256);
                        fg.field_k = true;
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        if (-3 == (var2_int ^ -1)) {
                            statePc = 139;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        if ((var2_int ^ -1) == -2) {
                            statePc = 139;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        hj.b((byte) -34);
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        if (!Main.a((byte) 30, ad.field_t)) {
                            statePc = 145;
                        } else {
                            statePc = 141;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        this.f((byte) 99);
                        if (var3 != 0) {
                            statePc = 149;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        if (var3 == 0) {
                            statePc = 140;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        statePc = 145;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        if (!param0) {
                            statePc = 148;
                        } else {
                            statePc = 146;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        this.field_K = -119;
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        fe.a((byte) -102, 0);
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        if (!ie.b((byte) 34)) {
                            statePc = 162;
                        } else {
                            statePc = 150;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        var2_int = this.c(false);
                        if (-1 == (var2_int ^ -1)) {
                            statePc = 154;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        if (-2 != (var2_int ^ -1)) {
                            statePc = 156;
                        } else {
                            statePc = 152;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        pg.a(true, 3);
                        tb.a(4, 78);
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        if (2 == var2_int) {
                            statePc = 159;
                        } else {
                            statePc = 157;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        r.a(18, 6, -250, 320, qa.field_b.field_s * 3 >> 984766305, g.field_C, 2, qa.field_b, 6, tc.field_a, 240);
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 161: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw ma.a((Throwable) ((Object) var2_ref), "Main.BA(" + param0 + ')');
                }
                case 162: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (param3 <= -49) {
                break L1;
              } else {
                this.b((byte) 32);
                break L1;
              }
            }
            this.a(11246, ((255 & param2) << -383909400) + (param0 & 255), 9, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var5), "Main.IA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void d(boolean param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        byte stackIn_10_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_33_0 = 0;
        byte stackIn_33_1 = 0;
        int stackIn_49_0 = 0;
        int decompiledRegionSelector0 = 0;
        byte stackOut_9_1;
        byte stackOut_32_1;
        int statePc = 0;
        Throwable caughtException = null;
        short[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = field_T;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = new short[120];
                        var3 = 0;
                        if (param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var4 = 5;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = -1;
                        stackIn_5_1 = var4 ^ -1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (stackIn_5_0 < stackIn_5_1) {
                            statePc = 25;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_26_0 = 4;
                        stackIn_7_0 = stackIn_26_0;
                        if (var8 != 0) {
                            statePc = 26;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var5 = stackIn_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (0 > var5) {
                            statePc = 24;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var6 = (short)(var4 * 4112 + (var5 * 257 - -1));
                        var7 = var5 + var4 * 6;
                        stackIn_5_0 = -1;
                        stackIn_10_0 = stackIn_5_0;
                        stackOut_9_1 = this.field_H[var7];
                        stackIn_5_1 = stackOut_9_1;
                        stackIn_10_1 = stackOut_9_1;
                        if (var8 != 0) {
                            statePc = 5;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 != stackIn_10_1) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (-1 != this.field_H[var7 - -1]) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        incrementValue$0 = var3;
                        var3++;
                        var2[incrementValue$0] = (short) var6;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (this.field_H[var7] == -1) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((this.field_H[var7 - -1] ^ -1) == 0) {
                            statePc = 23;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        incrementValue$1 = var3;
                        var3++;
                        var2[incrementValue$1] = (short) var6;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var5--;
                        if (var8 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var4--;
                        if (var8 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = 4;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var4 = stackIn_26_0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var4 < 0) {
                            statePc = 48;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_49_0 = 5;
                        stackIn_29_0 = stackIn_49_0;
                        if (var8 != 0) {
                            statePc = 49;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var5 = stackIn_29_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_31_0 = -1;
                        stackIn_31_1 = var5 ^ -1;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 < stackIn_31_1) {
                            statePc = 47;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var6 = (short)(257 * var5 + (var4 * 4112 + 16));
                        var7 = var5 + 6 * var4;
                        stackIn_31_0 = -1;
                        stackIn_33_0 = stackIn_31_0;
                        stackOut_32_1 = this.field_H[var7];
                        stackIn_31_1 = stackOut_32_1;
                        stackIn_33_1 = stackOut_32_1;
                        if (var8 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (stackIn_33_0 != stackIn_33_1) {
                            statePc = 39;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (0 != (this.field_H[6 + var7] ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        incrementValue$2 = var3;
                        var3++;
                        var2[incrementValue$2] = (short) var6;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (-1 == this.field_H[var7]) {
                            statePc = 46;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (this.field_H[6 + var7] == -1) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        incrementValue$3 = var3;
                        var3++;
                        var2[incrementValue$3] = (short) var6;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var5--;
                        if (var8 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var4--;
                        if (var8 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        this.field_Y = var2[sj.a(10999, var3, uh.field_l)];
                        stackIn_49_0 = 118;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        mi.a(stackIn_49_0, jd.field_c[9], 100 * lg.field_I[9] / this.field_ab, ca.field_c[9]);
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 51: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw ma.a((Throwable) ((Object) var2_ref), "Main.KB(" + param0 + ')');
                }
                case 52: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void t(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                this.f(25);
                break L1;
              }
            }
            L2: {
              if ((this.field_db ^ -1) > -1) {
                L3: {
                  if (this.field_U == 1) {
                    this.c(85, 0);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                this.field_db = 0;
                break L2;
              } else {
                break L2;
              }
            }
            this.d((this.field_db - -999) / 1000, 10);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "Main.JB(" + param0 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2, int param3, long param4, long param5) {
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = field_T;
        try {
          L0: {
            L1: {
              L2: {
                var10 = 106 % ((-71 - param0) / 36);
                var9_int = 32 + (param1 + -320);
                var11 = -240 + (param3 + 32);
                var12 = (int)(dh.field_m + -param5);
                if (-301 >= (var12 ^ -1)) {
                  break L2;
                } else {
                  sa.a(0, var11, 512, var9_int, 0, (var12 << -499647862) / 300, 0, 0);
                  if (var14 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (dh.field_m < param4) {
                  break L3;
                } else {
                  this.field_I[0].b(param1, param3);
                  if (var14 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (param4 + -300L < dh.field_m) {
                  break L4;
                } else {
                  this.field_I[param2].b(param1, param3);
                  if (var14 == 0) {
                    break L1;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                th.a(107, 0);
                var12 = 300 - -(int)(-param4 + dh.field_m);
                if (this.field_H[this.field_A] != this.field_H[this.field_N]) {
                  break L5;
                } else {
                  var13 = 512 - -(var12 * 1536 / 300);
                  sa.a(0, var11 * var13 >> -718798967, var13, var13 * var9_int >> -1521471511, 0, 0, 0, 2047 & (var12 << 1793534442) / 300);
                  if (var14 == 0) {
                    break L1;
                  } else {
                    break L5;
                  }
                }
              }
              sa.a(0, var11, 512, var9_int, 0, (var12 << 668493834) / 300 - -1024, 0, 0);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var9), "Main.QA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static boolean a(int param0, char param1) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -49) {
                break L1;
              } else {
                Main.u(-128);
                break L1;
              }
            }
            L2: {
              L3: {
                if (-49 < (param1 ^ -1)) {
                  break L3;
                } else {
                  if (57 < param1) {
                    break L3;
                  } else {
                    stackIn_10_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_10_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "Main.DA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final void c(int param0) {
        try {
            this.a(false, param0 ^ 4405030, false, true, false);
            this.a(6, 0, 7, 9, 7, (byte) 115, false, 8);
            oa.a((java.awt.Component) ((Object) tb.field_c), 22050, (byte) 103, jk.field_a, true);
            wg.field_a = param0;
            ca.field_b = 4086842;
            af.field_jb = 4473924;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "Main.CB(" + param0 + ')');
        }
    }

    final void c(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = field_T;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = 96 % ((param0 - -78) / 36);
                var4 = this.field_U;
                if (4 == var4) {
                  pb.a(ve.field_c, 13427);
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                } else {
                  if ((var4 ^ -1) == -3) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              this.field_N = -1;
              this.field_A = -1;
              break L1;
            }
            L3: {
              L4: {
                L5: {
                  this.field_U = param1;
                  var5 = this.field_U;
                  if (4 == var5) {
                    break L5;
                  } else {
                    if (-1 != (var5 ^ -1)) {
                      break L3;
                    } else {
                      if (var6 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                L6: {
                  this.field_K = (this.field_db + 999) / 1000;
                  if (dg.field_J <= 0) {
                    break L6;
                  } else {
                    if ((dg.field_J ^ -1) <= -7) {
                      break L6;
                    } else {
                      th.a(1 + q.field_i, 1, dg.field_J + -1);
                      break L6;
                    }
                  }
                }
                L7: {
                  var4 = Math.max(-(4 * dg.field_J) + 44, 20) + -this.field_J;
                  if (var4 <= 18) {
                    th.a(250, 1, 5);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (12 >= var4) {
                    th.a(249, 1, 6);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if ((var4 ^ -1) >= -10) {
                    th.a(248, 1, 7);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (this.field_K >= 60) {
                    th.a(247, 1, 8);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (-91 < (this.field_K ^ -1)) {
                    break L11;
                  } else {
                    th.a(246, 1, 9);
                    break L11;
                  }
                }
                L12: {
                  if ((this.field_K ^ -1) <= -121) {
                    th.a(245, 1, 10);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if ((this.field_K ^ -1) <= -151) {
                    th.a(244, 1, 11);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if ((ue.field_d ^ -1) == -1) {
                    break L14;
                  } else {
                    this.a(11246, 8, 3, false);
                    if (var6 == 0) {
                      break L3;
                    } else {
                      break L14;
                    }
                  }
                }
                if (this.field_K > 0) {
                  gh.a(ve.field_c, (byte) -87);
                  if (var6 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                } else {
                  break L3;
                }
              }
              L15: {
                if ((ai.field_m ^ -1) >= -1) {
                  break L15;
                } else {
                  if (jf.field_n) {
                    break L15;
                  } else {
                    if (!dl.d(0)) {
                      this.field_P = pk.a(fb.field_c[this.field_C], new int[]{(ai.field_m << -438917208) - -dg.field_J}, af.field_ob, vb.field_a[this.field_C], vf.field_b, rj.field_p, tk.field_c, (byte) 70, 3);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                }
              }
              sc.a((byte) 53, lc.field_a[0]);
              this.a(11246, 6, 3, false);
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3), "Main.W(" + param0 + ',' + param1 + ')');
        }
    }

    public static void u(int param0) {
        field_M = null;
        field_W = null;
        field_V = null;
        if (param0 != -24711) {
            return;
        }
        try {
            field_y = null;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "Main.OA(" + param0 + ')');
        }
    }

    private final int m(byte param0) {
        int discarded$1 = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 33) {
                break L1;
              } else {
                discarded$1 = this.m(-92);
                break L1;
              }
            }
            stackIn_4_0 = this.field_Y >> -1344801244 & 15;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "Main.HA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final void k(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = this.s(-25520);
              var3 = this.n(128);
              if (param0 > 16) {
                break L1;
              } else {
                this.field_ab = 96;
                break L1;
              }
            }
            var4 = this.field_H[var2_int];
            this.field_H[var2_int] = this.field_H[var3];
            this.field_H[var3] = (byte) var4;
            vf.field_b = vf.field_b + af.field_ob;
            tk.field_c = tk.field_c + 1;
            rj.field_p = rj.field_p - af.field_ob;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) runtimeException), "Main.DB(" + param0 + ')');
        }
    }

    final static void a(Object param0, le param1, byte param2) {
        java.awt.AWTEvent stackIn_8_1 = null;
        Object stackIn_15_0 = null;
        Object stackIn_15_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        java.awt.AWTEvent stackOut_7_1;
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = field_T;
        try {
          L0: {
            if (null != param1.field_e) {
              L1: {
                var3_int = 0;
                if (param2 > 101) {
                  break L1;
                } else {
                  field_G = -54;
                  break L1;
                }
              }
              L2: while (true) {
                L3: {
                  L4: {
                    if ((var3_int ^ -1) <= -51) {
                      break L4;
                    } else {
                      stackIn_15_0 = null;

                      stackOut_7_1 = param1.field_e.peekEvent();
                      stackIn_15_1 = stackOut_7_1;
                      stackIn_8_1 = stackOut_7_1;
                      if (var4 != 0) {
                        break L3;
                      } else {
                        if (stackIn_15_0 == stackIn_8_1) {
                          break L4;
                        } else {
                          wk.a((byte) -107, 1L);
                          var3_int++;
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  stackIn_15_0 = null;
                  stackIn_15_1 = param0;
                  break L3;
                }
                L5: {
                  L6: {
                    if (stackIn_15_0 != stackIn_15_1) {
                      try {
                        L7: {
                          param1.field_e.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param0, 1001, "dummy")));
                          decompiledRegionSelector0 = 0;
                          break L7;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L8: {
                          var3 = (Exception) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                          break L8;
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        break L6;
                      } else {
                        break L5;
                      }
                    } else {
                      break L6;
                    }
                  }
                  break L5;
                }
                decompiledRegionSelector1 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector1 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L9: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var3_ref);

            stackIn_24_1 = new StringBuilder().append("Main.SA(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L10;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L10;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_25_0), stackIn_29_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(int param0, int param1) {
        oh stackIn_2_0 = null;
        String stackIn_2_1 = null;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        oh stackIn_4_0 = null;
        String stackIn_4_1 = null;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        oh stackIn_5_0 = null;
        String stackIn_5_1 = null;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        int stackIn_57_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        Object stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        int stackIn_99_2 = 0;
        byte stackIn_99_3 = 0;
        int stackIn_99_4 = 0;
        Object stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        int stackIn_101_2 = 0;
        byte stackIn_101_3 = 0;
        int stackIn_101_4 = 0;
        Object stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        int stackIn_102_2 = 0;
        byte stackIn_102_3 = 0;
        int stackIn_102_4 = 0;
        long stackIn_102_5 = 0L;
        Object stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        int stackIn_103_2 = 0;
        byte stackIn_103_3 = 0;
        int stackIn_103_4 = 0;
        long stackIn_103_5 = 0L;
        Object stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        int stackIn_105_2 = 0;
        byte stackIn_105_3 = 0;
        int stackIn_105_4 = 0;
        long stackIn_105_5 = 0L;
        Object stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        int stackIn_106_2 = 0;
        byte stackIn_106_3 = 0;
        int stackIn_106_4 = 0;
        long stackIn_106_5 = 0L;
        long stackIn_106_6 = 0L;
        int stackIn_113_0 = 0;
        int stackIn_117_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        String var3 = null;
        RuntimeException var3_ref = null;
        hh var4 = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = field_T;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        bd.field_H.b(0, 0);
                        qa.field_b.c(Integer.toString(dg.field_J), 85, 80, 16777215, -1);
                        stackIn_4_0 = qa.field_b;
                        stackIn_2_0 = stackIn_4_0;
                        stackIn_4_1 = Integer.toString(-af.field_ob + rj.field_p + vf.field_b >> 708302952);
                        stackIn_2_1 = stackIn_4_1;
                        stackIn_4_2 = 130;
                        stackIn_2_2 = stackIn_4_2;
                        stackIn_4_3 = 238;
                        stackIn_2_3 = stackIn_4_3;
                        if (jf.field_n) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_5_0 = (oh) ((Object) stackIn_2_0);
                        stackIn_5_1 = (String) ((Object) stackIn_2_1);
                        stackIn_5_2 = stackIn_2_2;
                        stackIn_5_3 = stackIn_2_3;
                        stackIn_5_4 = 16777215;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = (oh) ((Object) stackIn_4_0);
                        stackIn_5_1 = (String) ((Object) stackIn_4_1);
                        stackIn_5_2 = stackIn_4_2;
                        stackIn_5_3 = stackIn_4_3;
                        stackIn_5_4 = 16776960;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ((oh) (Object) stackIn_5_0).c(stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_5_4, -1);
                        if (param1 == 2) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return;
                }
                case 7: {
                    try {
                        var3 = "";
                        if (this.field_J < 0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var3 = Integer.toString(this.field_J);
                        if (var14 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((param0 & 16 ^ -1) <= -9) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var3 = "0";
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        qa.field_b.c(var3, 148, 134, 16777215, -1);
                        var4 = (hh) ((Object) this.field_X.a((byte) 74));
                        if (null != var4) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var6 = this.field_B;
                        if (80 > var6) {
                            statePc = 22;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (230 <= var6) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var5 = 8;
                        if (var14 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var5 = -(var6 / 2) + 123;
                        if (var14 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var5 = -32 + var6 / 2;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        qk.field_a[var4.field_h].a(8, var5);
                        qa.field_b.b(ge.field_b[var4.field_h], 45, var5 - -qa.field_b.field_s, 0, -1);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if ((this.field_U ^ -1) != -5) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        this.d(this.field_K, param1 ^ 8);
                        if (var14 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((this.field_U ^ -1) == -1) {
                            statePc = 36;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (-1 != dj.field_a) {
                            statePc = 36;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        this.t(0);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((this.field_db ^ -1) < -1) {
                            statePc = 40;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((param0 & 16) >= 8) {
                            statePc = 42;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        qa.field_b.c(this.field_Z, 118, 286, 16777215, -1);
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var5 = -1;
                        var6 = -1;
                        if (this.field_U != 3) {
                            statePc = 55;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((-this.field_z + dh.field_m ^ -1L) >= ((long)this.field_ab ^ -1L)) {
                            statePc = 54;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        this.field_z = this.field_z + (long)this.field_ab;
                        this.k(param1 ^ 17);
                        this.field_F = this.field_F - 2;
                        if (-3 >= (this.field_F ^ -1)) {
                            statePc = 52;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        this.c(param1 ^ 23, 1);
                        if (var14 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        this.d(true);
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var5 = this.s(-25520);
                        var6 = this.n(param1 + 126);
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var7 = 36;
                        var8 = 0;
                        var9 = 0;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackIn_57_0 = var9 ^ -1;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (stackIn_57_0 <= -7) {
                            statePc = 116;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var10 = 201;
                        stackIn_117_0 = 0;
                        stackIn_59_0 = stackIn_117_0;
                        if (var14 != 0) {
                            statePc = 117;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var11 = stackIn_59_0;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (6 <= var11) {
                            statePc = 115;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackIn_57_0 = this.field_H[var8] ^ -1;
                        stackIn_62_0 = stackIn_57_0;
                        if (var14 != 0) {
                            statePc = 57;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (stackIn_62_0 == 0) {
                            statePc = 114;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if ((var8 ^ -1) == (var5 ^ -1)) {
                            statePc = 114;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (var8 == var6) {
                            statePc = 114;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if ((this.field_U ^ -1) != -3) {
                            statePc = 80;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if ((this.field_N ^ -1) == (var8 ^ -1)) {
                            statePc = 78;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (this.field_A != var8) {
                            statePc = 80;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        stackIn_81_0 = 1;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        stackIn_81_0 = 0;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var12 = stackIn_81_0;
                        stackIn_87_0 = var12;
                        stackIn_82_0 = stackIn_87_0;
                        if (1 != this.field_C) {
                            statePc = 87;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        stackIn_87_0 = stackIn_82_0;
                        stackIn_83_0 = stackIn_87_0;
                        if (var8 != this.field_N) {
                            statePc = 87;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        stackIn_85_0 = stackIn_83_0;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        stackIn_88_0 = stackIn_85_0;
                        stackIn_88_1 = 1;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        stackIn_88_0 = stackIn_87_0;
                        stackIn_88_1 = 0;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var12 = stackIn_88_0 | stackIn_88_1;
                        var12 = var12 != 0 | this.field_L ? 1 : 0;
                        if (var12 == 0) {
                            statePc = 107;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        stackIn_97_0 = param1 + 118;
                        stackIn_90_0 = stackIn_97_0;
                        if (this.field_C != 0) {
                            statePc = 97;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        stackIn_92_0 = stackIn_90_0;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        stackIn_97_0 = stackIn_92_0;
                        stackIn_93_0 = stackIn_97_0;
                        if (var8 != this.field_N) {
                            statePc = 97;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        stackIn_95_0 = stackIn_93_0;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        stackIn_98_0 = stackIn_95_0;
                        stackIn_98_1 = 1;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        stackIn_98_0 = stackIn_97_0;
                        stackIn_98_1 = 0;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        th.a(stackIn_98_0, stackIn_98_1);
                        ji.a((int) this.field_H[var8], 24355);
                        stackIn_101_0 = this;
                        stackIn_99_0 = stackIn_101_0;
                        stackIn_101_1 = 10;
                        stackIn_99_1 = stackIn_101_1;
                        stackIn_101_2 = var10;
                        stackIn_99_2 = stackIn_101_2;
                        stackIn_101_3 = this.field_H[var8];
                        stackIn_99_3 = stackIn_101_3;
                        stackIn_101_4 = var7;
                        stackIn_99_4 = stackIn_101_4;
                        if (this.field_A == -1) {
                            statePc = 101;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        stackIn_102_0 = this;
                        stackIn_102_1 = stackIn_99_1;
                        stackIn_102_2 = stackIn_99_2;
                        stackIn_102_3 = stackIn_99_3;
                        stackIn_102_4 = stackIn_99_4;
                        stackIn_102_5 = this.field_S - -1000L;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        stackIn_102_0 = this;
                        stackIn_102_1 = stackIn_101_1;
                        stackIn_102_2 = stackIn_101_2;
                        stackIn_102_3 = stackIn_101_3;
                        stackIn_102_4 = stackIn_101_4;
                        stackIn_102_5 = 9223372036854775807L;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        stackIn_105_0 = this;
                        stackIn_103_0 = stackIn_105_0;
                        stackIn_105_1 = stackIn_102_1;
                        stackIn_103_1 = stackIn_105_1;
                        stackIn_105_2 = stackIn_102_2;
                        stackIn_103_2 = stackIn_105_2;
                        stackIn_105_3 = stackIn_102_3;
                        stackIn_103_3 = stackIn_105_3;
                        stackIn_105_4 = stackIn_102_4;
                        stackIn_103_4 = stackIn_105_4;
                        stackIn_105_5 = stackIn_102_5;
                        stackIn_103_5 = stackIn_105_5;
                        if (this.field_N == var8) {
                            statePc = 105;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        stackIn_106_0 = this;
                        stackIn_106_1 = stackIn_103_1;
                        stackIn_106_2 = stackIn_103_2;
                        stackIn_106_3 = stackIn_103_3;
                        stackIn_106_4 = stackIn_103_4;
                        stackIn_106_5 = stackIn_103_5;
                        stackIn_106_6 = this.field_S;
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        stackIn_106_0 = this;
                        stackIn_106_1 = stackIn_105_1;
                        stackIn_106_2 = stackIn_105_2;
                        stackIn_106_3 = stackIn_105_3;
                        stackIn_106_4 = stackIn_105_4;
                        stackIn_106_5 = stackIn_105_5;
                        stackIn_106_6 = this.field_R;
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        this.a((byte) stackIn_106_1, stackIn_106_2, (int) stackIn_106_3, stackIn_106_4, stackIn_106_5, stackIn_106_6);
                        if (var14 == 0) {
                            statePc = 114;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        if ((var8 ^ -1) != (this.field_N ^ -1)) {
                            statePc = 112;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        stackIn_113_0 = 1;
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        stackIn_113_0 = 0;
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        var13 = stackIn_113_0;
                        this.field_I[var13].b(var10, var7);
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        var8++;
                        var10 += 69;
                        var11++;
                        if (var14 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        var7 += 69;
                        var9++;
                        if (var14 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        stackIn_117_0 = this.field_U ^ -1;
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (stackIn_117_0 != -4) {
                            statePc = 122;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        this.r(param1 + 16777213);
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 121: {
                    var3_ref = (RuntimeException) ((Object) caughtException);
                    throw ma.a((Throwable) ((Object) var3_ref), "Main.IB(" + param0 + ',' + param1 + ')');
                }
                case 122: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void v(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              h.a(param0 ^ -17429, 50);
              if (param0 == 256) {
                break L1;
              } else {
                this.field_Z = (String) null;
                break L1;
              }
            }
            L2: {
              mg.a(50, true);
              sc.a((byte) 42, lc.field_a[0]);
              if (dl.d(0)) {
                break L2;
              } else {
                ra.field_d = sk.a(4, (byte) 125);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "Main.JA(" + param0 + ')');
        }
    }

    private final int b(boolean param0, byte param1) {
        kc dupTemp$0 = null;
        kc dupTemp$1 = null;
        kc dupTemp$2 = null;
        ib var3 = null;
        int var3_int = 0;
        kc var3_ref = null;
        RuntimeException var3_ref2 = null;
        ib var4_ref_ib = null;
        int var4 = 0;
        int var5 = 0;
        ib var6 = null;
        int var46 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_50_0 = 0;
        int[] stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int[] stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        int[] stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        int stackIn_63_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_115_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        da var3_ref3 = null;
        byte[] var3_array = null;
        wb[] var4_ref_wb__ = null;
        wb var6_ref = null;
        int var7 = 0;
        kc[] var8 = null;
        int[] var8_array = null;
        int var9_int = 0;
        hg var9 = null;
        kc var10_ref_kc = null;
        int var10 = 0;
        int var11_int = 0;
        kc var11 = null;
        int var12_int = 0;
        kc var12 = null;
        int var13_int = 0;
        wb var13 = null;
        int var14 = 0;
        int var15_int = 0;
        kc var15 = null;
        int var16_int = 0;
        kc var16 = null;
        int var17_int = 0;
        kc var17 = null;
        kc var18 = null;
        kc var19 = null;
        kc var20 = null;
        kc var21 = null;
        kc var22 = null;
        kc var23 = null;
        kc var24 = null;
        Object var24_ref = null;
        int var25 = 0;
        int var26 = 0;
        kc var27 = null;
        kc var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int var32_int = 0;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var46 = field_T;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    hc.a(true);
                    if (null != jd.field_c[0]) {
                        statePc = 64;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (!hf.field_H.b(4)) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (hf.field_H.b(4, "basic")) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ug.a(3.0f, 73, tg.a((byte) 87, "basic", kf.field_j, hf.field_H, bk.field_f));
                    stackIn_9_0 = 0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    return stackIn_9_0;
                }
                case 10: {
                    if (!sh.field_g.b(4)) {
                        statePc = 14;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (sh.field_g.a((byte) 46)) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    ug.a(20.0f, 59, tg.a((byte) 87, "", eg.field_e, sh.field_g, wd.field_a));
                    stackIn_15_0 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    return stackIn_15_0;
                }
                case 16: {
                    if (!id.field_a.b(4)) {
                        statePc = 22;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (!id.field_a.a((byte) 34)) {
                        statePc = 22;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 22: {
                    ug.a(29.0f, 104, tg.a((byte) 87, "", eg.field_e, id.field_a, wd.field_a));
                    stackIn_23_0 = 0;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    return stackIn_23_0;
                }
                case 24: {
                    if (!fb.field_a.b(4)) {
                        statePc = 30;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (!fb.field_a.a((byte) 79)) {
                        statePc = 30;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 30: {
                    ug.a(30.0f, 87, tg.a((byte) 87, "", eg.field_e, fb.field_a, wd.field_a));
                    stackIn_31_0 = 0;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    return stackIn_31_0;
                }
                case 32: {
                    if (!ll.field_e.b(4)) {
                        statePc = 38;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (!ll.field_e.a((byte) 91)) {
                        statePc = 38;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 38: {
                    ug.a(50.0f, 82, tg.a((byte) 87, "", ah.field_a, ll.field_e, dh.field_o));
                    stackIn_39_0 = 0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    return stackIn_39_0;
                }
                case 40: {
                    if (!mh.field_c.b(4)) {
                        statePc = 46;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (!mh.field_c.a((byte) 44)) {
                        statePc = 46;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 46: {
                    ug.a(70.0f, 58, tg.a((byte) 87, "", kf.field_j, mh.field_c, bk.field_f));
                    stackIn_47_0 = 0;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    return stackIn_47_0;
                }
                case 48: {
                    if (param0) {
                        statePc = 51;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    stackIn_50_0 = 1;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    return stackIn_50_0;
                }
                case 51: {
                    ok.b(69);
                    ug.a(80.0f, 122, sc.field_c);
                    this.b((byte) 59);
                    jd.field_c[0] = uj.a(sh.field_g, "", "turnover_card").a();
                    jd.field_c[1] = uj.a(sh.field_g, "", "revolver_cocking").a();
                    jd.field_c[2] = uj.a(sh.field_g, "", "revolver_decocking").a();
                    jd.field_c[3] = ig.a(fb.field_a, "", "gunshot").c();
                    jd.field_c[4] = ig.a(fb.field_a, "", "crow").c();
                    jd.field_c[5] = ig.a(fb.field_a, "", "pesky varment").c();
                    jd.field_c[6] = ig.a(fb.field_a, "", "feelin lucky").c();
                    ca.field_c[6] = 112;
                    jd.field_c[7] = ig.a(fb.field_a, "", "dont try that again").c();
                    jd.field_c[8] = ig.a(fb.field_a, "", "didnt see that one comin").c();
                    jd.field_c[9] = uj.a(sh.field_g, "", "swap_cards").a();
                    jd.field_c[10] = ig.a(fb.field_a, "", "yeeehaaa").c();
                    jd.field_c[11] = ig.a(fb.field_a, "", "yeeehaaa2").c();
                    jd.field_c[12] = ig.a(fb.field_a, "", "yeeehaaa3").c();
                    jd.field_c[13] = ig.a(fb.field_a, "", "are you a mexican").c();
                    ca.field_c[13] = 120;
                    jd.field_c[14] = ig.a(fb.field_a, "", "chicken").c();
                    jd.field_c[15] = uj.a(sh.field_g, "", "menu_click").a();
                    var3 = uj.a(sh.field_g, "", "score-count").a();
                    var3.field_k = var3.field_h.length;
                    ve.field_c = li.a(var3, 100, 30);
                    ve.field_c.e(-1);
                    var4_ref_ib = new ib(jd.field_c[15].field_l, jd.field_c[15].field_h.length + 1000);
                    og.a(jd.field_c[15].field_h, 0, var4_ref_ib.field_h, 0, jd.field_c[15].field_h.length);
                    lh.field_d = li.a(var4_ref_ib, 100, 96);
                    lh.field_d.c(0, var4_ref_ib.field_h.length);
                    lh.field_d.e(0);
                    var5 = 0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (var5 >= 16) {
                        statePc = 62;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var6 = jd.field_c[var5];
                    stackIn_56_0 = lg.field_I;
                    stackIn_54_0 = stackIn_56_0;
                    stackIn_56_1 = var5;
                    stackIn_54_1 = stackIn_56_1;
                    if (var6 != null) {
                        statePc = 56;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    stackIn_57_0 = (int[]) ((Object) stackIn_54_0);
                    stackIn_57_1 = stackIn_54_1;
                    stackIn_57_2 = 0;
                    statePc = 57;
                    continue stateLoop;
                }
                case 56: {
                    stackIn_57_0 = (int[]) ((Object) stackIn_56_0);
                    stackIn_57_1 = stackIn_56_1;
                    stackIn_57_2 = 1000 * var6.field_h.length / var6.field_l;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    stackIn_57_0[stackIn_57_1] = stackIn_57_2;
                    if (-1 == (ca.field_c[var5] ^ -1)) {
                        statePc = 60;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 60: {
                    ca.field_c[var5] = 96;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    var5++;
                    if (var46 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    stackIn_63_0 = 1;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    return stackIn_63_0;
                }
                case 64: {
                    if (null != ll.field_e) {
                        statePc = 67;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 67: {
                    ug.a(85.0f, 105, j.field_A);
                    this.b((byte) 59);
                    var3_ref3 = new da(sh.field_g, fb.field_a);
                    sh.field_g = null;
                    fb.field_a = null;
                    lc.field_a[0] = new uf(gg.a("music/36 Card Trick - Title Screen Music", var3_ref3, ll.field_e, -16351, ""));
                    lc.field_a[1] = new uf(gg.a("music/36 Card Trick - In-game Music", var3_ref3, ll.field_e, -16351, ""));
                    lc.field_a[2] = new uf(gg.a("music/36 Card Trick - Pause Screen", var3_ref3, ll.field_e, -16351, ""));
                    ll.field_e = null;
                    var4 = 0;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if (lc.field_a.length <= var4) {
                        statePc = 70;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    lc.field_a[var4].a(48);
                    var4++;
                    if (var46 == 0) {
                        statePc = 68;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    stackIn_71_0 = 1;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    return stackIn_71_0;
                }
                case 72: {
                    if (hf.field_H == null) {
                        statePc = 75;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    vb.field_k = ce.a(-126, "unachieved", "basic", hf.field_H);
                    qi.field_D = ce.a(-128, "orbcoin", "basic", hf.field_H);
                    hf.field_H = null;
                    stackIn_74_0 = 1;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    return stackIn_74_0;
                }
                case 75: {
                    if (null != mh.field_c) {
                        statePc = 78;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 78: {
                    ug.a(95.0f, 77, lb.field_f);
                    this.b((byte) 59);
                    var3_array = id.field_a.a((byte) 7, "font", "");
                    var4_ref_wb__ = lk.a("font", "", (byte) 49, mh.field_c);
                    qa.field_b = ga.a(121, var4_ref_wb__, var3_array);
                    eb.field_c = kk.a(var4_ref_wb__, var3_array, 1, 256, 16777215);
                    var5 = qa.field_b.field_s + qa.field_b.field_x;
                    sk.field_c = new kc(var5, var5);
                    sk.field_c.c();
                    qi.field_D.a(0, 0, var5, var5);
                    qi.field_D = null;
                    gf.field_e.a(200);
                    this.field_I = gl.a("tiles", mh.field_c, "", -13244);
                    var6_ref = lh.a("canyonmask2", mh.field_c, "", 120);
                    var7 = var6_ref.field_c;
                    var6_ref.field_c = 0;
                    var6_ref.field_f = var6_ref.field_b;
                    td.field_c[0] = new kc(415, 415);
                    td.field_c[0].c();
                    vj.c(0, 0, 415, 415, 9351922);
                    var6_ref.field_j[1] = 8024722;
                    var6_ref.a(0, var7);
                    vj.b(0, 261, 415, 154, 8090514, 11373689);
                    lh.a("hs", mh.field_c, "", -89).a(0, 0);
                    td.field_c[3] = new kc(415, 415);
                    td.field_c[3].c();
                    vj.c(0, 0, 415, 415, 10932727);
                    var6_ref.field_j[1] = 9675196;
                    var6_ref.a(0, var7);
                    vj.b(0, 261, 415, 154, 9675196, 11645356);
                    lh.a("atl", mh.field_c, "", -108).a(0, 0);
                    td.field_c[5] = new kc(415, 415);
                    td.field_c[5].c();
                    vj.c(0, 0, 415, 415, 13869944);
                    var6_ref.field_j[1] = 11698531;
                    var6_ref.a(0, var7);
                    vj.b(0, 261, 415, 154, 11698531, 13734228);
                    lh.a("atg", mh.field_c, "", -21).a(0, 0);
                    td.field_c[4] = new kc(415, 415);
                    td.field_c[4].c();
                    vj.c(0, 0, 415, 415, 10211583);
                    var6_ref.field_j[1] = 5081598;
                    var6_ref.a(0, var7);
                    vj.b(0, 261, 415, 154, 5081598, 11974562);
                    lh.a("ld", mh.field_c, "", -96).a(0, 0);
                    td.field_c[2] = ce.a(-127, "lc", "", mh.field_c);
                    td.field_c[1] = ce.a(-127, "go", "", mh.field_c);
                    db.field_o = ce.a(-126, "gunsight", "", mh.field_c);
                    qk.field_a = gl.a("achievements", mh.field_c, "", -13244);
                    var8 = qk.field_a;
                    var9_int = 0;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    if (var8.length <= var9_int) {
                        statePc = 84;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var10_ref_kc = var8[var9_int];
                    ij.a(var10_ref_kc, (byte) 123);
                    var9_int++;
                    if (var46 != 0) {
                        statePc = 85;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if (var46 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    ij.a(vb.field_k, (byte) 124);
                    mg.field_j = new kc[9];
                    dupTemp$0 = new kc(4, 4);
                    mg.field_j[8] = dupTemp$0;
                    mg.field_j[6] = dupTemp$0;
                    mg.field_j[2] = dupTemp$0;
                    mg.field_j[0] = dupTemp$0;
                    mg.field_j[0].c();
                    vj.c(0, 0, vj.field_l, vj.field_g, 6962948);
                    dupTemp$1 = new kc(256, 4);
                    mg.field_j[7] = dupTemp$1;
                    mg.field_j[1] = dupTemp$1;
                    mg.field_j[1].c();
                    vj.c(0, 0, vj.field_l, vj.field_g, 6962948);
                    dupTemp$2 = new kc(4, 256);
                    mg.field_j[5] = dupTemp$2;
                    mg.field_j[3] = dupTemp$2;
                    mg.field_j[3].c();
                    vj.c(0, 0, vj.field_l, vj.field_g, 6962948);
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    var8_array = ce.a(-126, "woodpal", "", mh.field_c).field_r;
                    var9 = new hg(new int[]{1523066134, 1523066134, 416118573, -1554371402, -117777497, 383414059, -751582233, -486225926});
                    mg.field_j[4] = new kc(640, 480);
                    mg.field_j[4].c();
                    var10 = var8_array.length >> 2019366370;
                    var11_int = -1 + vj.field_j.length;
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    if (var11_int < 0) {
                        statePc = 88;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    vj.field_j[var11_int] = var8_array[var8_array.length + (-1 + -bg.a(var10, -2147483648, var9))];
                    var11_int--;
                    if (var46 == 0) {
                        statePc = 86;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    var11 = new kc(1, 40);
                    var12_int = 0;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    if (var12_int >= vj.field_l) {
                        statePc = 98;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    var13_int = 0;
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    if (10 <= var13_int) {
                        statePc = 96;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    var14 = bg.a(vj.field_g, -2147483648, var9);
                    var15_int = 5 + bg.a(12, -2147483648, var9);
                    var16_int = var8_array[(var8_array.length >> 569790273) - -bg.a(var8_array.length >> 843070529, -2147483648, var9)];
                    var17_int = var8_array[var10];
                    var11.c();
                    vj.d();
                    vj.b(0, 20 + -var15_int, 1, var15_int, var16_int, var17_int);
                    vj.b(0, 20, 1, var15_int, var17_int, var16_int);
                    mg.field_j[4].c();
                    var11.e(var12_int, var14 + -20, bg.a(56, -2147483648, var9) + 200);
                    var13_int++;
                    if (var46 != 0) {
                        statePc = 97;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    if (var46 == 0) {
                        statePc = 91;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    var12_int++;
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    if (var46 == 0) {
                        statePc = 89;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    var12 = new kc(640, 480);
                    var12.c();
                    vj.b(0, 0, 640, 300, 21670, 39641);
                    var13 = lh.a("canyonmask", mh.field_c, "", 127);
                    var14 = var13.field_c;
                    var13.field_f = var13.field_b;
                    var13.field_c = 0;
                    di.a(var13, 4997716, 0, 5000797, 13449, var14);
                    vj.b(0, 316, 640, 164, 5066333, 9336387);
                    var15 = ce.a(-127, "cloud1mask", "", mh.field_c);
                    var16 = ce.a(-127, "cloud2mask", "", mh.field_c);
                    var17 = ce.a(-128, "cloud3mask", "", mh.field_c);
                    var18 = ce.a(-127, "cloud4mask", "", mh.field_c);
                    var19 = ce.a(-126, "cloud5mask", "", mh.field_c);
                    var20 = ce.a(-127, "cloud6mask", "", mh.field_c);
                    var21 = ce.a(-127, "cloud7mask", "", mh.field_c);
                    var22 = ce.a(-128, "menucactus", "", mh.field_c);
                    var23 = ce.a(-127, "logocactus", "", mh.field_c);
                    cg.field_i = ce.a(-128, "screw", "", mh.field_c);
                    d.field_u[0] = var12.b();
                    d.field_u[0].c();
                    re.a(16777215, 0, 0, (byte) 111, var16);
                    re.a(16777215, 0, 0, (byte) 118, var17);
                    re.a(16777215, 0, 0, (byte) 60, var18);
                    re.a(16777215, 0, 0, (byte) 102, var19);
                    var22.d(0, 0);
                    var23.d(0, 0);
                    ce.a(-128, "maintitle", "", mh.field_c).d(0, 0);
                    ce.a(-126, "mmextra1", "", mh.field_c).d(0, 0);
                    ce.a(-128, "mmextra2", "", mh.field_c).d(0, 0);
                    d.field_u[1] = var12.b();
                    d.field_u[1].c();
                    re.a(16777215, 0, 0, (byte) 71, var16);
                    re.a(16777215, 0, 0, (byte) 94, var17);
                    re.a(16777215, 0, 0, (byte) 118, var20);
                    var22.d(0, 0);
                    var23.d(0, 0);
                    ce.a(-128, "pausetitle", "", mh.field_c).d(0, 0);
                    ce.a(-126, "pmextra1", "", mh.field_c).d(0, 0);
                    ce.a(-128, "pmextra2", "", mh.field_c).d(0, 0);
                    d.field_u[2] = ce.a(-126, "titlescreen", "", mh.field_c);
                    d.field_u[3] = var12.b();
                    d.field_u[3].c();
                    vj.g(153, 105, 491, 397);
                    mg.field_j[4].b(0, 0);
                    vj.a();
                    vj.c(169, 121, 308, 261, 16777215);
                    ek.a((byte) 92, 11173684, 2955525, 5122825, 103, 8475405, 296, 151, 342);
                    cg.field_i.d(174, 128);
                    cg.field_i.d(461, 128);
                    cg.field_i.d(176, 363);
                    cg.field_i.d(461, 363);
                    var23.d(4, -38);
                    ce.a(-127, "insttitle", "", mh.field_c).d(0, 0);
                    ce.a(-126, "instextra1", "", mh.field_c).d(0, 0);
                    ce.a(-128, "instextra2", "", mh.field_c).d(0, 0);
                    ce.a(-126, "instextra3", "", mh.field_c).d(0, 0);
                    pc.field_d = new kc[9];
                    var24 = new kc(640, 480);
                    var24.c();
                    mg.field_j[4].b(0, 0);
                    vj.c(18, 18, 604, 444, 16777215);
                    ek.a((byte) 92, 11173684, 2955525, 5122825, 0, 8475405, 480, 0, 640);
                    cg.field_i.d(23, 25);
                    cg.field_i.d(-cg.field_i.field_p + 617, 25);
                    cg.field_i.d(23, 455 - cg.field_i.field_o);
                    cg.field_i.d(-cg.field_i.field_p + 617, -2 + (457 + -cg.field_i.field_o));
                    var25 = 1 + (23 - -cg.field_i.field_p);
                    var26 = 1 + (25 + cg.field_i.field_o);
                    pc.field_d[0] = new kc(var25, var26);
                    pc.field_d[2] = new kc(var25, var26);
                    pc.field_d[6] = new kc(var25, var26);
                    pc.field_d[8] = new kc(var25, var26);
                    pc.field_d[1] = new kc(640 + -(var25 * 2), var26);
                    pc.field_d[7] = new kc(-(2 * var25) + 640, var26);
                    pc.field_d[3] = new kc(var25, 480 - 2 * var26);
                    pc.field_d[5] = new kc(var25, 480 - 2 * var26);
                    pc.field_d[4] = new kc(-(var25 * 2) + 640, -(var26 * 2) + 480);
                    kc.a(var24, pc.field_d[0], 0, 0, 0, 0, var25, var26);
                    kc.a(var24, pc.field_d[2], 640 - var25, 0, 0, 0, var25, var26);
                    kc.a(var24, pc.field_d[6], 0, -var26 + 480, 0, 0, var25, var26);
                    kc.a(var24, pc.field_d[8], -var25 + 640, -var26 + 480, 0, 0, var25, var26);
                    kc.a(var24, pc.field_d[1], var25, 0, 0, 0, 640 - 2 * var25, var26);
                    kc.a(var24, pc.field_d[7], var25, 480 + -var26, 0, 0, 640 - 2 * var25, var26);
                    kc.a(var24, pc.field_d[3], 0, var26, 0, 0, var25, -(2 * var26) + 480);
                    kc.a(var24, pc.field_d[5], -var25 + 640, var26, 0, 0, var25, -(2 * var26) + 480);
                    kc.a(var24, pc.field_d[4], var25, var26, 0, 0, -(var25 * 2) + 640, 480 + -(var25 * 2));
                    var24_ref = null;
                    d.field_u[4] = var12.b();
                    d.field_u[4].c();
                    re.a(16777215, 0, 0, (byte) 83, var15);
                    re.a(16777215, 0, 0, (byte) 111, var16);
                    re.a(16777215, 0, 0, (byte) 118, var17);
                    re.a(16777215, 0, 0, (byte) 52, var18);
                    re.a(16777215, 0, 0, (byte) 78, var19);
                    re.a(16777215, 0, 0, (byte) 74, var20);
                    ce.a(-128, "achtitle", "", mh.field_c).d(0, 0);
                    var27 = ce.a(-127, "achextra2", "", mh.field_c);
                    var27.d(0, 0);
                    var23.d(0, -38);
                    vj.g(225, 93, 589, 407);
                    mg.field_j[4].b(0, 0);
                    vj.a();
                    vj.c(236, 103, 343, 291, 16777215);
                    ek.a((byte) 92, 11173684, 2955525, 5122825, 91, 8475405, 318, 223, 368);
                    cg.field_i.d(242, 109);
                    cg.field_i.d(562, 109);
                    cg.field_i.d(243, 374);
                    cg.field_i.d(562, 374);
                    bd.field_H = var12.b();
                    bd.field_H.c();
                    var23.d(0, 0);
                    re.a(16777215, 0, 0, (byte) 71, var15);
                    re.a(16777215, 0, 0, (byte) 94, var16);
                    re.a(16777215, 0, 0, (byte) 59, var17);
                    re.a(16777215, 0, 0, (byte) 65, var18);
                    re.a(16777215, 0, 0, (byte) 103, var20);
                    re.a(16777215, 0, 0, (byte) 100, var21);
                    ce.a(-128, "ropeout", "", mh.field_c).d(0, 0);
                    ce.a(-128, "ropein", "", mh.field_c).e(0, 0, 116);
                    vj.c(198, 33, 415, 415, 1);
                    ek.a((byte) 92, 10274800, 269877, 538209, 31, 5671872, 419, 196, 419);
                    a.a(16777215, vk.field_j, -1, 39, 6697779, 113);
                    a.a(16777215, tj.field_D, -1, 98, 6697779, 162);
                    a.a(16777215, ti.field_b, -1, 15, 6697779, 262);
                    a.a(16777215, uc.field_o, -1, 36, 6697779, 313);
                    f.field_a = var12.b();
                    f.field_a.c();
                    re.a(16777215, 0, 0, (byte) 100, var15);
                    re.a(16777215, 0, 0, (byte) 90, var16);
                    re.a(16777215, 0, 0, (byte) 106, var17);
                    re.a(16777215, 0, 0, (byte) 57, var18);
                    re.a(16777215, 0, 0, (byte) 116, var20);
                    var23.d(0, -38);
                    var27.d(-5, 0);
                    vj.c(198, 33, 415, 415, 1);
                    ek.a((byte) 92, 10274800, 269877, 538209, 31, 5671872, 419, 196, 419);
                    gf.field_e.a(200);
                    tc.field_a = new kc[9];
                    var28 = new kc(2, 2);
                    var29 = var28.field_r;
                    var30 = var28.field_r;
                    var28.field_r[3] = 7750664;
                    var31 = var28.field_r;
                    var31[2] = 7750664;
                    var29[0] = 7750664;
                    var30[1] = 7750664;
                    var32_int = 0;
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    if (-10 >= (var32_int ^ -1)) {
                        statePc = 104;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    tc.field_a[var32_int] = var28;
                    var32_int++;
                    if (var46 != 0) {
                        statePc = 105;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (var46 == 0) {
                        statePc = 99;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    tc.field_a[4] = null;
                    g.field_C = new kc[9];
                    g.field_C[0] = new kc(2, 2);
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    var32 = g.field_C[0].field_r;
                    g.field_C[0].field_r[2] = 12217600;
                    var33 = g.field_C[0].field_r;
                    var33[1] = 12217600;
                    var32[0] = 12217600;
                    g.field_C[0].field_r[3] = 7619584;
                    g.field_C[1] = new kc(2, 2);
                    g.field_C[1].field_r[1] = 12217600;
                    var34 = g.field_C[1].field_r;
                    var34[0] = 12217600;
                    g.field_C[1].field_r[3] = 7619584;
                    var35 = g.field_C[1].field_r;
                    var35[2] = 7619584;
                    g.field_C[2] = new kc(2, 2);
                    g.field_C[2].field_r[1] = 12217600;
                    var36 = g.field_C[2].field_r;
                    var36[0] = 12217600;
                    g.field_C[2].field_r[2] = 7619584;
                    g.field_C[2].field_r[3] = 3548426;
                    g.field_C[3] = new kc(2, 2);
                    g.field_C[3].field_r[2] = 12217600;
                    var37 = g.field_C[3].field_r;
                    var37[0] = 12217600;
                    g.field_C[3].field_r[3] = 7619584;
                    var38 = g.field_C[3].field_r;
                    var38[1] = 7619584;
                    g.field_C[5] = new kc(2, 2);
                    g.field_C[5].field_r[2] = 5059597;
                    var39 = g.field_C[5].field_r;
                    var39[0] = 5059597;
                    var40 = g.field_C[5].field_r;
                    g.field_C[5].field_r[3] = 3548426;
                    var40[1] = 3548426;
                    g.field_C[6] = new kc(2, 2);
                    g.field_C[6].field_r[2] = 12217600;
                    var41 = g.field_C[6].field_r;
                    g.field_C[6].field_r[1] = 7619584;
                    var41[0] = 12217600;
                    g.field_C[6].field_r[3] = 3548426;
                    g.field_C[7] = new kc(2, 2);
                    var42 = g.field_C[7].field_r;
                    g.field_C[7].field_r[1] = 5059597;
                    var42[0] = 5059597;
                    var43 = g.field_C[7].field_r;
                    g.field_C[7].field_r[3] = 3548426;
                    var43[2] = 3548426;
                    g.field_C[8] = new kc(2, 2);
                    g.field_C[8].field_r[0] = 5059597;
                    var44 = g.field_C[8].field_r;
                    g.field_C[8].field_r[3] = 3548426;
                    var45 = g.field_C[8].field_r;
                    var45[2] = 3548426;
                    mh.field_c = null;
                    var44[1] = 3548426;
                    stackIn_106_0 = 1;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    return stackIn_106_0;
                }
                case 107: {
                    ji.a((byte) -119, this.field_I);
                    mg.c((byte) 96);
                    this.field_E = new re[11];
                    var3_int = 0;
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    if (var3_int >= 11) {
                        statePc = 113;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    this.field_E[var3_int] = new re((Main) (this), var3_int);
                    var3_int++;
                    if (var46 != 0) {
                        statePc = 114;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    if (var46 == 0) {
                        statePc = 108;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    ff.field_b = -1;
                    dj.field_a = 2;
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    var3_ref = ia.field_c[15];
                    la.field_k = new kc(var3_ref.field_p, var3_ref.field_o);
                    la.field_k.c();
                    var4 = 40 / ((param1 - 23) / 52);
                    var3_ref.c(0, 0, 4405028);
                    gf.field_e.a(200);
                    stackIn_115_0 = 2;
                    statePc = 115;
                    continue stateLoop;
                }
                case 115: {
                    return stackIn_115_0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0) {
        RuntimeException runtimeException = null;
        int var3 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = field_T;
        try {
          L0: {
            Main.u(-24711);
            hh.a(20364);
            bk.a(false);
            qk.c(124);
            fb.a(8);
            mh.a((byte) -41);
            pk.a(8450);
            ve.a(param0 + 8192);
            sh.a(4352);
            c.g((byte) 108);
            ac.a((byte) -118);
            fj.a((byte) -67);
            rf.b(param0 ^ -19749);
            ag.a((byte) 98);
            te.a(87);
            vj.c();
            ee.a();
            wh.b(120);
            ii.a(4308);
            pb.c((byte) 111);
            id.a(true);
            sd.a((byte) 39);
            kg.a((byte) 84);
            ll.a(0);
            mc.a(8192);
            hb.a(true);
            ia.a(-12765);
            bi.a(param0 ^ 121);
            lf.a(param0 + -10584);
            vk.a(1);
            gg.a(false);
            ij.a(3);
            bc.a(false);
            gk.c(0);
            kh.b(192);
            gf.a((byte) 103);
            oe.a((byte) 127);
            bj.a(-113);
            ah.a(param0 ^ -38);
            uf.e();
            re.a(-4);
            gj.a((byte) 14);
            eb.a(true);
            tk.a(param0 ^ -1);
            jd.a((byte) 23);
            gi.a(1159353185);
            gd.a();
            oj.a((byte) -105);
            lh.a(7865);
            cj.b((byte) 110);
            vg.a((byte) -72);
            sb.a(false);
            d.a(true);
            ge.a((byte) -117);
            pe.a((byte) -72);
            wf.a(param0 ^ 3);
            al.a((byte) -70);
            hk.a(121);
            j.m(param0 + 46);
            bg.u(-2113);
            rk.e((byte) -30);
            kl.m(-23573);
            tj.l(0);
            ak.a(false);
            fh.m(200);
            jk.a((byte) -63);
            aj.a(83);
            th.b(true);
            hd.a();
            ig.b();
            df.a();
            da.a(-1703274388);
            vb.a(-1);
            rj.b(param0 ^ 72);
            me.a((byte) -128);
            tc.a((byte) -119);
            uk.a((byte) 96);
            ie.e(-11);
            sj.a(0);
            cf.a((byte) 72);
            ik.a();
            oa.a((byte) 109);
            nl.a(10000);
            od.a(-28178);
            fe.a(17449);
            w.h(106);
            i.b(62);
            sk.a(-12865);
            ke.a((byte) -124);
            vf.b(-118);
            ri.a(-2);
            dc.a();
            lg.a(param0 + 18002);
            a.d(param0 ^ -14282);
            cd.a((byte) 104);
            na.c(false);
            hc.b(true);
            ab.e(-78);
            uc.b(param0 ^ 0);
            ud.a(21316);
            la.b((byte) 103);
            kk.a(false);
            eg.a((byte) 38);
            ek.a((byte) 61);
            jb.c();
            ok.a(93);
            ha.a(-124);
            mg.b(40);
            sl.a(-3);
            wg.a((byte) 126);
            jh.a((byte) 51);
            nf.a(param0 ^ 17);
            mb.a(1024);
            ma.a(-47);
            kj.c((byte) 45);
            ph.b(param0 + 62);
            wd.a(true);
            fd.b((byte) 3);
            ti.a(true);
            db.a(0);
            tb.a(param0 + 128);
            mj.a((byte) 126);
            lk.e(0);
            hl.d((byte) -69);
            qg.a(80);
            jc.p(42);
            qf.n(param0 + 8736);
            g.b(true);
            qd.c(param0 ^ -2057);
            ji.a(-61);
            kb.a(480);
            vd.e(69);
            ra.a(250);
            ja.a((byte) -113);
            pg.a((byte) -85);
            ni.a((byte) -35);
            ue.a(4);
            f.a(-663255224);
            ca.a((byte) 127);
            tl.b(80);
            vc.a(param0 + 0);
            ec.d(param0 ^ 10);
            jf.d(param0 ^ -14143);
            hi.a(0);
            ga.b(true);
            dd.a(false);
            ck.d((byte) 41);
            hf.o(-31141);
            ta.e((byte) 116);
            ng.a(2);
            bd.l(-10790);
            dg.h(param0 ^ -74);
            gl.a(1);
            pa.f((byte) -78);
            ua.a(72);
            cg.f(1);
            s.a(30235);
            qe.e((byte) 73);
            se.a(param0 ^ 87);
            h.a(-26526);
            lj.a();
            pj.a(param0 ^ -18178);
            e.a(-560430640);
            dj.a(52);
            lc.b(param0 + 91);
            bf.a((byte) -121);
            ei.d(0);
            ub.d(-126);
            fl.a(param0 ^ 31237);
            qi.d((byte) 77);
            wc.i(param0 + -21693);
            de.a(false);
            ed.a(3663);
            tf.g(-1);
            q.c(0);
            pc.a(120);
            il.b((byte) 38);
            cb.a(-1962269296);
            nb.a(-98);
            r.b(19017);
            rl.c((byte) -98);
            n.d((byte) -89);
            uh.a(param0 ^ -12908);
            ad.d(95);
            bl.a((byte) 114);
            aa.d((byte) -49);
            t.a(0);
            rc.b((byte) 112);
            dh.b((byte) -36);
            sc.a(178313985);
            nk.a(2);
            lb.c(640);
            cc.a((byte) 107);
            kf.b((byte) 110);
            ui.l(-22742);
            qa.a((byte) -31);
            mi.c(-3731);
            rb.d(-107);
            jl.c((byte) 126);
            ml.a(param0 + 107);
            pf.e(param0 ^ -26);
            rh.b((byte) -109);
            dl.a(param0 + 8996);
            gh.a(256);
            oc.a(-41);
            di.a(-1);
            hj.h(param0 ^ 0);
            mk.b((byte) 110);
            rd.c(true);
            p.g(param0 ^ 0);
            ai.g(50);
            fg.c(true);
            td.b((byte) 53);
            fk.a(-30530);
            sg.a(511);
            nc.a(param0);
            this.field_H = null;
            this.field_P = null;
            this.field_I = null;
            this.field_cb = null;
            this.field_Z = null;
            this.field_E = null;
            this.field_t = null;
            this.field_X = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) runtimeException), "Main.FA(" + param0 + ')');
        }
        L1: {
          if (var3 == 0) {
            break L1;
          } else {
            L2: {
              if (!fj.field_g) {
                stackIn_11_0 = 1;
                break L2;
              } else {
                stackIn_11_0 = 0;
                break L2;
              }
            }
            fj.field_g = stackIn_11_0 != 0;
            break L1;
          }
        }
    }

    final void b(byte param0) {
        Object stackIn_7_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_48_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = field_T;
        try {
          L0: {
            if (param0 == 59) {
              L1: {
                if (null == gj.field_a) {
                  stackIn_7_0 = tb.field_c;
                  break L1;
                } else {
                  stackIn_7_0 = gj.field_a;
                  break L1;
                }
              }
              var2 = stackIn_7_0;
              if (!th.a(true)) {
                if (!fg.field_k) {
                  nl.a((java.awt.Canvas) (var2), param0 + -164);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  if (null != ra.field_d) {
                    ug.a(100.0f, 113, tb.field_e);
                    nl.a((java.awt.Canvas) (var2), param0 + 34);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L2: {
                      L3: {
                        vj.d();
                        if (ff.field_b == -1) {
                          break L3;
                        } else {
                          this.q((byte) -111);
                          if (var6 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        if (-1 != dj.field_a) {
                          break L4;
                        } else {
                          this.b(0, param0 + -57);
                          if (var6 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                      this.field_E[dj.field_a].a(0, param0 ^ 59, 0);
                      break L2;
                    }
                    L5: {
                      L6: {
                        if (eh.d(19314)) {
                          break L6;
                        } else {
                          if (!ag.b(-128)) {
                            break L5;
                          } else {
                            L7: {
                              if (null == gj.field_a) {
                                stackIn_48_0 = r.field_q ? 1 : 0;
                                break L7;
                              } else {
                                stackIn_48_0 = 1;
                                break L7;
                              }
                            }
                            bf.a(stackIn_48_0 != 0, (byte) -8);
                            if (var6 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      vj.a(0, 0, vj.field_l, vj.field_g);
                      tc.a(param0 ^ -17180, pc.field_d, 26 - -cg.field_i.field_o, 1 + (23 + cg.field_i.field_p));
                      if (-10 == (ff.field_b ^ -1)) {
                        var3 = hb.field_d << -1271489885;
                        var4 = qf.m(-32749);
                        var5 = v.g((byte) -111);
                        if (0 < var3) {
                          vj.a((-var4 + 640 >> -43495839) + -10, (480 + -var5 >> 1739320737) + -10, 20 + var4, 20 + var5, 0, var3);
                          break L5;
                        } else {
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                    kg.b((byte) 93);
                    ll.a(0, (byte) 115, (java.awt.Canvas) (var2), 0);
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              } else {
                L8: {
                  stackIn_13_0 = var2;

                  stackIn_13_1 = 0;

                  if (gj.field_a == null) {
                    stackIn_14_0 = stackIn_13_0;
                    stackIn_14_1 = stackIn_13_1;
                    stackIn_14_2 = r.field_q ? 1 : 0;
                    break L8;
                  } else {


                    stackIn_14_0 = stackIn_13_0;
                    stackIn_14_1 = stackIn_13_1;
                    stackIn_14_2 = 1;
                    break L8;
                  }
                }
                jf.a((java.awt.Canvas) ((Object) stackIn_14_0), stackIn_14_1 != 0, stackIn_14_2 != 0);
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
          var2_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2_ref), "Main.WA(" + param0 + ')');
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
                return;
              }
            }
          }
        }
    }

    private final int o(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_9_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
          L0: {
            L1: {
              if ((dl.field_h ^ -1) != -2) {
                break L1;
              } else {
                var2_int = -5 + (jc.field_N - 31);
                if (-1 <= (var2_int ^ -1)) {
                  break L1;
                } else {
                  if (var2_int % 69 < 64) {
                    var3 = var2_int / 69;
                    if (var3 < 6) {
                      var4 = -5 + ag.field_a + -196;
                      if ((var4 ^ -1) >= -1) {
                        break L1;
                      } else {
                        if (var4 % 69 >= 64) {
                          break L1;
                        } else {
                          var5 = var4 / 69;
                          if (6 > var5) {
                            var6 = var3 * 6 + var5;
                            if (0 == (this.field_H[var6] ^ -1)) {
                              break L1;
                            } else {
                              stackIn_19_0 = var6;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          } else {
                            stackIn_16_0 = -1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    } else {
                      stackIn_9_0 = -1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
            if (param0 == 30) {
              stackIn_24_0 = -1;
              decompiledRegionSelector0 = 4;
              break L0;
            } else {
              stackIn_22_0 = 88;
              decompiledRegionSelector0 = 3;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "Main.VA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_22_0;
              } else {
                return stackIn_24_0;
              }
            }
          }
        }
    }

    private final void q(byte param0) {
        int stackIn_73_0 = 0;
        int stackIn_86_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        kc var3_ref_kc = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = field_T;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3 = ff.field_b;
                        if (9 == var3) {
                            statePc = 44;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (-2 == (var3 ^ -1)) {
                            statePc = 56;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var3 != 2) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var8 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (-6 != (var3 ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var8 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var3 != 3) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var8 == 0) {
                            statePc = 65;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((var3 ^ -1) != -8) {
                            statePc = 29;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var8 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var3 != 4) {
                            statePc = 35;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var8 == 0) {
                            statePc = 67;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (6 == var3) {
                            statePc = 82;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if ((var3 ^ -1) != -9) {
                            statePc = 85;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var8 == 0) {
                            statePc = 83;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (-1 != dj.field_a) {
                            statePc = 50;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        this.b(0, 2);
                        if (var8 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        this.field_E[dj.field_a].a(0, 0, 0);
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var2_int = hb.field_d << -1835484541;
                        if (0 >= var2_int) {
                            statePc = 85;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        vj.a(0, 0, vj.field_l, vj.field_g, 0, var2_int);
                        if (var8 == 0) {
                            statePc = 85;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        this.b(0, 2);
                        this.field_E[rk.field_X].a(hb.field_d, 0, 0);
                        if (var8 == 0) {
                            statePc = 85;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        this.b(0, 2);
                        this.field_E[rk.field_X].a(-hb.field_d + 32, 0, 0);
                        if (var8 == 0) {
                            statePc = 85;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        this.field_E[dj.field_a].a(0, 0, 0);
                        this.field_E[rk.field_X].a(32 + -hb.field_d, 0, 0);
                        if (var8 == 0) {
                            statePc = 85;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        this.b(0, 2);
                        var3_ref_kc = td.field_c[-5 + rk.field_X];
                        var3_ref_kc.b(198 - -((32 - hb.field_d) * var3_ref_kc.field_p / 64), 33 - -(var3_ref_kc.field_o * (-hb.field_d + 32) / 64), hb.field_d * var3_ref_kc.field_p / 32, var3_ref_kc.field_o * hb.field_d / 32);
                        la.field_k.b(var3_ref_kc.field_p / 2 + (-var3_ref_kc.field_p + 298) * hb.field_d / 64 + 198, 33 + ((-var3_ref_kc.field_o + 736) * hb.field_d / 64 + var3_ref_kc.field_o / 2), hb.field_d * la.field_k.field_p / 32, hb.field_d * la.field_k.field_o / 32);
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        this.field_E[rk.field_X].a(0, 0, 0);
                        td.field_c[-5 + dj.field_a].e(198, 33, -hb.field_d + 32 << -2143119837);
                        la.field_k.b(347, 401);
                        if (var8 == 0) {
                            statePc = 85;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        this.b(0, 2);
                        if (rk.field_X != 7) {
                            statePc = 81;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var3 = -hb.field_d + 68;
                        var4 = hb.field_d * 2;
                        var5 = 0;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if ((var5 ^ -1) <= -7) {
                            statePc = 81;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var6 = -hb.field_d + 233;
                        stackIn_86_0 = 0;
                        stackIn_73_0 = stackIn_86_0;
                        if (var8 != 0) {
                            statePc = 86;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var7 = stackIn_73_0;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (6 <= var7) {
                            statePc = 79;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        this.field_I[0].b(var6, var3, var4, var4);
                        var6 += 69;
                        var7++;
                        if (var8 != 0) {
                            statePc = 80;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (var8 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var3 += 69;
                        var5++;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (var8 == 0) {
                            statePc = 71;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var3_ref_kc = td.field_c[-5 + rk.field_X];
                        var3_ref_kc.b(198 + hb.field_d * var3_ref_kc.field_p / 64, 33 + var3_ref_kc.field_o * hb.field_d / 64, var3_ref_kc.field_p * (-hb.field_d + 32) / 32, (-hb.field_d + 32) * var3_ref_kc.field_o / 32);
                        la.field_k.b(198 + (-hb.field_d + 32) * (-var3_ref_kc.field_p + 298) / 64 - -(var3_ref_kc.field_p / 2), 33 + (32 + -hb.field_d) * (-var3_ref_kc.field_o + 736) / 64 - -(var3_ref_kc.field_o / 2), (32 + -hb.field_d) * la.field_k.field_p / 32, (32 - hb.field_d) * la.field_k.field_o / 32);
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var3 = 24 * hb.field_d;
                        vj.g(0, 0, 640, var3);
                        this.field_E[rk.field_X].a(0, 0, 0);
                        vj.g(0, var3, 640, 480);
                        this.field_E[dj.field_a].a(0, 0, var3);
                        vj.a();
                        if (var8 == 0) {
                            statePc = 85;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        this.field_E[rk.field_X].a(0, 0, 0);
                        this.field_E[dj.field_a].a(hb.field_d, 0, 0);
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        stackIn_86_0 = param0;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (stackIn_86_0 < -98) {
                            statePc = 91;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        this.field_S = -20L;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 90: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw ma.a((Throwable) ((Object) var2), "Main.KA(" + param0 + ')');
                }
                case 91: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void l(byte param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        w var1 = null;
        int var2 = 0;
        int var3 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = field_T;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1 = na.field_r;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (!gl.b(true)) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var1.h(8, 0);
                        fieldTemp$1 = var1.field_i + 1;
                        var1.field_i = var1.field_i + 1;
                        var2 = fieldTemp$1;
                        fl.a(var1, false);
                        na.field_r.f(-var2 + var1.field_i, 8049);
                        if (var3 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param0 > 75) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        Main.a((Object) null, (le) null, (byte) 100);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw ma.a((Throwable) ((Object) runtimeException), "Main.AA(" + param0 + ')');
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final static boolean a(byte param0, int[] param1) {
        int stackIn_5_0 = 0;
        int stackIn_26_0 = 0;
        boolean stackIn_29_0 = false;
        int stackIn_33_0 = 0;
        boolean stackIn_36_0 = false;
        int stackIn_39_0 = 0;
        int stackIn_57_0 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        long var3 = 0L;
        kf var5_ref_kf = null;
        int var5 = 0;
        int var6_int = 0;
        kf var6 = null;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = field_T;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (ad.field_q != ra.field_b) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0 != 0;
                }
                case 6: {
                    try {
                        var2_int = -64 % ((-32 - param0) / 49);
                        var3 = id.a(96);
                        if (-1 == (qf.field_G ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (-1 < (vd.field_u ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5_ref_kf = (kf) ((Object) jl.field_e.a((byte) 74));
                        if (var5_ref_kf == null) {
                            statePc = 27;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((var3 ^ -1L) < (var5_ref_kf.field_g ^ -1L)) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var5_ref_kf.c(119);
                        al.field_a = var5_ref_kf.field_i.length;
                        rd.field_j.field_i = 0;
                        var6_int = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((var6_int ^ -1) <= (al.field_a ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        rd.field_j.field_g[var6_int] = var5_ref_kf.field_i[var6_int];
                        var6_int++;
                        if (var8 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var8 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        ni.field_d = hc.field_f;
                        hc.field_f = sb.field_a;
                        sb.field_a = pd.field_l;
                        pd.field_l = var5_ref_kf.field_h;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = 1;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return stackIn_26_0 != 0;
                }
                case 27: {
                    try {
                        if (0 <= vd.field_u) {
                            statePc = 35;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        rd.field_j.field_i = 0;
                        stackIn_36_0 = r.a(1, (byte) 126);
                        stackIn_29_0 = stackIn_36_0;
                        if (var8 != 0) {
                            statePc = 36;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (stackIn_29_0) {
                            statePc = 34;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_33_0 = 0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 33: {
                    return stackIn_33_0 != 0;
                }
                case 34: {
                    try {
                        vd.field_u = rd.field_j.g((byte) -35);
                        rd.field_j.field_i = 0;
                        al.field_a = param1[vd.field_u];
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_36_0 = gl.a(false);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (!stackIn_36_0) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_39_0 = 0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 39: {
                    return stackIn_39_0 != 0;
                }
                case 40: {
                    try {
                        if (qf.field_G == 0) {
                            statePc = 56;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var5 = qf.field_G;
                        if (k.field_a != 0.0) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var5 = (int)((double)var5 + pg.field_a.nextGaussian() * k.field_a);
                        if (var5 < 0) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var5 = 0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var6 = new kf(var3 - -(long)var5, vd.field_u, new byte[al.field_a]);
                        var7 = 0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((al.field_a ^ -1) >= (var7 ^ -1)) {
                            statePc = 54;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var6.field_i[var7] = rd.field_j.field_g[var7];
                        var7++;
                        if (var8 != 0) {
                            statePc = 55;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var8 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        jl.field_e.a(var6, 27362);
                        vd.field_u = -1;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var8 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        ni.field_d = hc.field_f;
                        hc.field_f = sb.field_a;
                        sb.field_a = pd.field_l;
                        pd.field_l = vd.field_u;
                        vd.field_u = -1;
                        stackIn_57_0 = 1;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 57: {
                    return stackIn_57_0 != 0;
                }
                case 58: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_61_0 = (RuntimeException) (var2);
                    stackIn_59_0 = stackIn_61_0;
                    stackIn_61_1 = new StringBuilder().append("Main.HB(").append(param0).append(',');
                    stackIn_59_1 = stackIn_61_1;
                    if (param1 == null) {
                        statePc = 61;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    stackIn_62_0 = (RuntimeException) ((Object) stackIn_59_0);
                    stackIn_62_1 = (StringBuilder) ((Object) stackIn_59_1);
                    stackIn_62_2 = "{...}";
                    statePc = 62;
                    continue stateLoop;
                }
                case 61: {
                    stackIn_62_0 = (RuntimeException) ((Object) stackIn_61_0);
                    stackIn_62_1 = (StringBuilder) ((Object) stackIn_61_1);
                    stackIn_62_2 = "null";
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    throw ma.a((Throwable) ((Object) stackIn_62_0), stackIn_62_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void init() {
        try {
            this.a(480, "36cardtrick", 10);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "Main.init()");
        }
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            if (param0 == 11246) {
              L1: {
                L2: {
                  hb.field_d = 0;
                  ff.field_b = param2;
                  rk.field_X = param1;
                  this.p(-97283608);
                  if (2 == param2) {
                    break L2;
                  } else {
                    if (6 == param2) {
                      break L2;
                    } else {
                      if (5 == param2) {
                        break L2;
                      } else {
                        if ((param2 ^ -1) == -9) {
                          break L2;
                        } else {
                          if (-4 == (param2 ^ -1)) {
                            break L2;
                          } else {
                            if (param2 == 7) {
                              break L2;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                this.field_E[param1].a(-31102, param3);
                this.field_E[param1].b(param0 + -11139);
                break L1;
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
          var5 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var5), "Main.GB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int q(int param0) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          L0: {
            var2_int = 44 % ((param0 - -67) / 39);
            stackIn_1_0 = this.field_Y >> -1835303188 & 15;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "Main.AB(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    private final void o(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_113_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_118_1 = 0;
        Object stackIn_146_0 = null;
        byte[] stackIn_147_0 = null;
        int stackIn_147_1 = 0;
        byte[] stackIn_149_0 = null;
        int stackIn_149_1 = 0;
        byte[] stackIn_151_0 = null;
        int stackIn_151_1 = 0;
        byte[] stackIn_152_0 = null;
        int stackIn_152_1 = 0;
        int stackIn_152_2 = 0;
        Object stackIn_157_0 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = field_T;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_db = this.field_db - 20;
                        var2_int = this.field_U;
                        if ((var2_int ^ -1) != -3) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var5 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (-5 != (var2_int ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var5 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (-4 != (var2_int ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var5 == 0) {
                            statePc = 154;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((var2_int ^ -1) == -1) {
                            statePc = 154;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (-2 != (var2_int ^ -1)) {
                            statePc = 154;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var5 == 0) {
                            statePc = 79;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (-1001L < (dh.field_m + -this.field_S ^ -1L)) {
                            statePc = 31;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 31: {
                    return;
                }
                case 32: {
                    try {
                        if (this.field_H[this.field_N] == this.field_H[this.field_A]) {
                            statePc = 39;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        this.field_O = 0;
                        fieldTemp$0 = this.field_J - 1;
                        this.field_J = this.field_J - 1;
                        if (0 > fieldTemp$0) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        this.c(param0 + -36, 0);
                        if (var5 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var2 = this.field_H;
                        var3 = this.field_N;
                        this.field_H[this.field_A] = (byte) -1;
                        var2[var3] = (byte) -1;
                        var4 = 4 + dg.field_J;
                        ai.field_m = ai.field_m + var4;
                        af.field_ob = af.field_ob - (var4 << 115590311);
                        rj.field_p = rj.field_p + (var4 << 912914919);
                        var4 = var4 * tk.field_c << -1002773177;
                        bc.field_a = bc.field_a + 1;
                        vf.field_b = vf.field_b - var4;
                        ol.field_W = ol.field_W + tk.field_a;
                        rj.field_p = rj.field_p + var4;
                        fieldTemp$1 = this.field_Q - 1;
                        this.field_Q = this.field_Q - 1;
                        if ((fieldTemp$1 ^ -1) != -1) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        vf.field_b = vf.field_b - (tk.field_c * 50 << -2083110457);
                        af.field_ob = af.field_ob - 6400;
                        ai.field_m = ai.field_m + 50;
                        rj.field_p = rj.field_p + 6400;
                        rj.field_p = rj.field_p + (tk.field_c * 50 << 801644935);
                        this.c(-117, 4);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 41: {
                    return;
                }
                case 42: {
                    try {
                        if (-2 > (this.field_Q ^ -1)) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        this.field_O = this.field_O + 1;
                        if (-4 < (this.field_O ^ -1)) {
                            statePc = 54;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (-6 > (this.field_O ^ -1)) {
                            statePc = 54;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (!th.a(246 - this.field_O, param0 ^ 0, 9 + this.field_O)) {
                            statePc = 54;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        this.field_X.a(new hh(9 + this.field_O), 27362);
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (this.field_U != 2) {
                            statePc = 154;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        this.field_F = this.field_F + this.field_eb;
                        if (1 == this.field_Q) {
                            statePc = 64;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (2 > this.field_F) {
                            statePc = 64;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        this.d(true);
                        this.field_z = dh.field_m;
                        this.c(param0 + -15, 3);
                        if (var5 == 0) {
                            statePc = 154;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        this.c(-119, 1);
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (0 < this.field_J) {
                            statePc = 76;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (0 >= this.field_K) {
                            statePc = 73;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        this.field_K = this.field_K - 1;
                        af.field_ob = af.field_ob - 512;
                        ai.field_m = ai.field_m + 2;
                        vf.field_b = vf.field_b - (tk.field_c << -941827543);
                        rj.field_p = rj.field_p + (tk.field_c << -1544032567);
                        if (var5 == 0) {
                            statePc = 154;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        pb.a(ve.field_c, param0 ^ 13426);
                        this.a(11246, 7, 3, false);
                        if (var5 == 0) {
                            statePc = 154;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        vf.field_b = vf.field_b - (tk.field_c * dg.field_J << 1633767591);
                        this.field_J = this.field_J - 1;
                        ai.field_m = ai.field_m + dg.field_J;
                        rj.field_p = rj.field_p + ((tk.field_c - -1) * dg.field_J << 699274375);
                        af.field_ob = af.field_ob - (dg.field_J << -1656599641);
                        if (var5 == 0) {
                            statePc = 154;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var2_int = this.o((byte) 30);
                        if (-1 == var2_int) {
                            statePc = 128;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        tk.field_a = tk.field_a + 1;
                        jl.field_h = jl.field_h + bc.field_a;
                        if (0 != (this.field_N ^ -1)) {
                            statePc = 92;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        this.field_N = var2_int;
                        this.field_R = dh.field_m;
                        if (0 != this.field_C) {
                            statePc = 89;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        rc.a((byte) 111, 1);
                        if (var5 == 0) {
                            statePc = 136;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        rc.a((byte) 111, 0);
                        if (var5 == 0) {
                            statePc = 136;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if ((this.field_N ^ -1) != (var2_int ^ -1)) {
                            statePc = 101;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (this.field_C != 0) {
                            statePc = 136;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        this.field_N = -1;
                        rc.a((byte) 111, 2);
                        if (var5 == 0) {
                            statePc = 136;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        this.field_A = var2_int;
                        this.c(-1, 2);
                        this.field_S = dh.field_m;
                        if ((this.field_C ^ -1) != -1) {
                            statePc = 106;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        this.field_R = dh.field_m;
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        rc.a((byte) 111, 0);
                        if (this.field_H[this.field_A] == this.field_H[this.field_N]) {
                            statePc = 122;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        var3 = 4 + sj.a(param0 + 10998, 4, uh.field_l);
                        if (var3 >= rb.field_g) {
                            statePc = 110;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        var3++;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        rb.field_g = var3;
                        if (-1 > (this.field_J ^ -1)) {
                            statePc = 119;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        stackIn_117_0 = 124;
                        stackIn_113_0 = stackIn_117_0;
                        if (1 != dg.field_J) {
                            statePc = 117;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        stackIn_115_0 = stackIn_113_0;
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        stackIn_118_0 = stackIn_115_0;
                        stackIn_118_1 = 13;
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        stackIn_118_0 = stackIn_117_0;
                        stackIn_118_1 = 14;
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        hk.a((byte) stackIn_118_0, stackIn_118_1, 300);
                        if (var5 == 0) {
                            statePc = 121;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        hk.a((byte) 125, var3, 300);
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        hk.a((byte) 125, 0, 700);
                        if (var5 == 0) {
                            statePc = 136;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        hk.a((byte) 127, 3, -lg.field_I[3] + 1000);
                        if (-2 == (this.field_Q ^ -1)) {
                            statePc = 127;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        var3 = 10 - -sj.a(10999, 3, uh.field_l);
                        hk.a((byte) 124, var3, 1000);
                        if (var5 == 0) {
                            statePc = 136;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        if (!ge.b((byte) -114)) {
                            statePc = 136;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        if (-14 != (tb.field_d ^ -1)) {
                            statePc = 128;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        this.a(11246, 1, 2, false);
                        rk.a(false, lc.field_a[2], false);
                        if (var5 != 0) {
                            statePc = 154;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        if (var5 == 0) {
                            statePc = 128;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        if (2 > ec.field_f) {
                            statePc = 154;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        this.field_L = ge.field_c[66];
                        jf.field_n = jf.field_n | this.field_L;
                        if (!ge.field_c[25]) {
                            statePc = 142;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        this.field_db = 1000;
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        if (!ge.field_c[51]) {
                            statePc = 154;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        this.field_Q = 1;
                        jf.field_n = true;
                        var3 = 0;
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        if (var3 >= this.field_H.length) {
                            statePc = 153;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        stackIn_157_0 = this;
                        stackIn_146_0 = stackIn_157_0;
                        if (var5 != 0) {
                            statePc = 157;
                        } else {
                            statePc = 146;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        stackIn_151_0 = ((Main) (this)).field_H;
                        stackIn_147_0 = stackIn_151_0;
                        stackIn_151_1 = var3;
                        stackIn_147_1 = stackIn_151_1;
                        if (1 < var3) {
                            statePc = 151;
                        } else {
                            statePc = 147;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        stackIn_149_0 = (byte[]) ((Object) stackIn_147_0);
                        stackIn_149_1 = stackIn_147_1;
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        stackIn_152_0 = (byte[]) ((Object) stackIn_149_0);
                        stackIn_152_1 = stackIn_149_1;
                        stackIn_152_2 = 2;
                        statePc = 152;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        stackIn_152_0 = (byte[]) ((Object) stackIn_151_0);
                        stackIn_152_1 = stackIn_151_1;
                        stackIn_152_2 = -1;
                        statePc = 152;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        stackIn_152_0[stackIn_152_1] = (byte) stackIn_152_2;
                        var3++;
                        if (var5 == 0) {
                            statePc = 144;
                        } else {
                            statePc = 153;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        if (param0 == 1) {
                            statePc = 160;
                        } else {
                            statePc = 155;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        stackIn_157_0 = this;
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        this.d(-109, 70);
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 159: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw ma.a((Throwable) ((Object) var2_ref), "Main.CA(" + param0 + ')');
                }
                case 160: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public Main() {
        this.field_cb = null;
        this.field_P = null;
        this.field_D = 0;
        this.field_L = false;
        this.field_X = new bk();
        this.field_B = 0;
        this.field_O = 0;
        this.field_C = 1;
        this.field_U = 0;
        this.field_Z = new String("0:00");
        this.field_R = -1000L + dh.field_m;
        this.field_N = -1;
        this.field_A = -1;
        this.field_S = -1000L + dh.field_m;
        this.field_H = new byte[36];
    }

    static {
        field_G = 0;
        field_y = "";
        field_M = "Please send me news and updates (I can unsubscribe at any time)";
    }
}
