/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class j {
    private boolean field_U;
    boolean field_F;
    static db field_V;
    static he[] field_db;
    static java.applet.Applet field_K;
    private boolean field_ab;
    private boolean field_W;
    static String field_Y;
    private vd field_I;
    static int field_ib;
    static int field_e;
    private int field_r;
    private int field_P;
    int field_gb;
    double field_c;
    private int field_o;
    int field_A;
    private gf[] field_v;
    private ag field_M;
    double field_j;
    int field_H;
    int field_q;
    private ib[] field_d;
    int field_T;
    private gf[] field_m;
    mk field_G;
    private bf[] field_n;
    private int field_x;
    private int field_p;
    private td[] field_hb;
    private int[] field_t;
    private Random field_l;
    private boolean field_O;
    private int field_u;
    int field_w;
    private int field_bb;
    private int field_Z;
    private int field_s;
    private int field_Q;
    private td[] field_B;
    int field_L;
    private boolean field_a;
    double field_D;
    private int field_E;
    double field_N;
    int field_R;
    private int field_S;
    private int field_g;
    private int field_b;
    private int[] field_cb;
    private int field_f;
    private ck[] field_k;
    private int field_C;
    private int field_i;
    int field_X;
    private ck[] field_h;
    private boolean field_eb;
    private ag field_z;
    int field_fb;
    private boolean field_y;
    int field_J;

    private final void G(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        double var5 = 0.0;
        double var7 = 0.0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        gg var11_ref_gg = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        double stackIn_5_0 = 0.0;
        gg stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        gg stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        gg stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        double stackOut_4_0 = 0.0;
        double stackOut_3_0 = 0.0;
        gg stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        gg stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        gg stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        var16 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 == 0) {
          L0: {
            var5 = (double)this.field_G.field_h.length;
            var7 = var5 - 640.0;
            if (var7 <= (double)this.field_J) {
              stackOut_4_0 = var7;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = (double)this.field_J;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            L2: {
              L3: {
                L4: {
                  var9 = (int)stackIn_5_0;
                  var11 = this.field_q;
                  if (0 == var11) {
                    L5: {
                      v.field_O.a(0, 0);
                      var3 = oi.field_f.field_d;
                      if ((sd.field_e ^ -1) != -3) {
                        break L5;
                      } else {
                        this.b((byte) -51);
                        break L5;
                      }
                    }
                    L6: {
                      var4 = (int)((double)(-var9 * (var3 + -640)) / var7);
                      if (-1 == (sd.field_e ^ -1)) {
                        break L6;
                      } else {
                        this.b((byte) 51, var4);
                        break L6;
                      }
                    }
                    this.a((byte) 0, var4);
                    oi.field_f.d(var4, 0);
                    var3 = 2 * nj.field_o.field_d;
                    nj.field_o.d((int)((double)((var3 - 640) * -var9) / var7), 0);
                    nj.field_o.d((int)(-((double)(var9 * (-640 + var3)) / var7) + (double)(var3 / 2)), 0);
                    if (var16 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  } else {
                    L7: {
                      if (-2 != (var11 ^ -1)) {
                        break L7;
                      } else {
                        if (var16 == 0) {
                          break L4;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (2 != var11) {
                        break L8;
                      } else {
                        if (var16 == 0) {
                          break L3;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      L10: {
                        L11: {
                          L12: {
                            L13: {
                              if (3 == var11) {
                                nb.field_b.a(0, 0);
                                var3 = 2 * hc.field_K[0].field_z;
                                var2 = 0;
                                L14: while (true) {
                                  L15: {
                                    L16: {
                                      if (-3 >= (var2 ^ -1)) {
                                        break L16;
                                      } else {
                                        hc.field_K[var2].a((int)((double)((var3 - 640) * -var9) / var7), 0, 450);
                                        var2++;
                                        if (var16 != 0) {
                                          break L15;
                                        } else {
                                          if (var16 == 0) {
                                            continue L14;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                    }
                                    be.b(sh.field_b, (int)((double)((-640 + var3) * -var9) / var7), 0);
                                    break L15;
                                  }
                                  if (var16 == 0) {
                                    break L2;
                                  } else {
                                    break L13;
                                  }
                                }
                              } else {
                                if (var11 == 4) {
                                  break L13;
                                } else {
                                  L17: {
                                    if (-6 != (var11 ^ -1)) {
                                      break L17;
                                    } else {
                                      if (var16 == 0) {
                                        break L12;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  if ((var11 ^ -1) == -7) {
                                    break L11;
                                  } else {
                                    L18: {
                                      if ((var11 ^ -1) != -8) {
                                        break L18;
                                      } else {
                                        if (var16 == 0) {
                                          break L10;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                    if (var11 == 8) {
                                      break L9;
                                    } else {
                                      break L1;
                                    }
                                  }
                                }
                              }
                            }
                            nb.field_b.a(0, 0);
                            var3 = hc.field_K[0].field_z * 2;
                            var10 = (int)((double)((-640 + var3) * -var9) / var7);
                            var2 = 0;
                            L19: while (true) {
                              L20: {
                                L21: {
                                  if (-3 >= (var2 ^ -1)) {
                                    break L21;
                                  } else {
                                    hc.field_K[var2].a(var10, 0, 450);
                                    var2++;
                                    if (var16 != 0) {
                                      break L20;
                                    } else {
                                      if (var16 == 0) {
                                        continue L19;
                                      } else {
                                        break L21;
                                      }
                                    }
                                  }
                                }
                                sh.field_b.d(var10, 0);
                                break L20;
                              }
                              if ((sd.field_e ^ -1) != -3) {
                                break L2;
                              } else {
                                var2 = 0;
                                L22: while (true) {
                                  L23: {
                                    L24: {
                                      if (var2 >= 75) {
                                        break L24;
                                      } else {
                                        var11 = wi.field_f[var2];
                                        var12 = wa.field_Q[var2] - var9 / md.field_c[var2];
                                        var13 = we.field_e[var2];
                                        var14 = jf.field_ib[var2];
                                        var15 = hh.field_a[var2];
                                        kl.field_R[var11].a(5, var13, var15, var14, var12);
                                        var2++;
                                        if (var16 != 0) {
                                          break L23;
                                        } else {
                                          if (var16 == 0) {
                                            continue L22;
                                          } else {
                                            break L24;
                                          }
                                        }
                                      }
                                    }
                                    si.field_F.a(var10 - -300, 200, 256);
                                    break L23;
                                  }
                                  if (var16 == 0) {
                                    break L2;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                          }
                          nb.field_b.a(0, 0);
                          var3 = 2 * hc.field_K[0].field_z;
                          var2 = 0;
                          L25: while (true) {
                            L26: {
                              L27: {
                                if (2 <= var2) {
                                  break L27;
                                } else {
                                  hc.field_K[var2].a((int)((double)((var3 - 640) * -var9) / var7), 0, 450);
                                  var2++;
                                  if (var16 != 0) {
                                    break L26;
                                  } else {
                                    if (var16 == 0) {
                                      continue L25;
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                              }
                              be.a(sh.field_b, (int)((double)(-var9 * (var3 + -640)) / var7), 0);
                              break L26;
                            }
                            if (var16 == 0) {
                              break L2;
                            } else {
                              break L11;
                            }
                          }
                        }
                        wj.f(0, 0, 640, 430, 7091712, 131328);
                        var3 = vi.field_g.field_d;
                        vi.field_g.a((int)((double)(-var9 * (var3 - 640)) / var7), 0, 128);
                        var3 = cc.field_w.field_d * 2;
                        cc.field_w.d((int)((double)((-640 + var3) * -var9) / var7), 0);
                        cc.field_w.d((int)(-((double)((-640 + var3) * var9) / var7) + (double)(var3 / 2)), 0);
                        if (var16 == 0) {
                          break L2;
                        } else {
                          break L10;
                        }
                      }
                      wj.f(0, 0, 640, 430, 27648, 512);
                      var3 = gb.field_e.field_d;
                      gb.field_e.a((int)((double)(-var9 * (-640 + var3)) / var7), 0, 128);
                      var3 = b.field_k.field_d * 2;
                      b.field_k.d((int)((double)(-var9 * (var3 - 640)) / var7), 0);
                      b.field_k.d((int)(-((double)((var3 - 640) * var9) / var7) + (double)(var3 / 2)), 0);
                      if (var16 == 0) {
                        break L2;
                      } else {
                        break L9;
                      }
                    }
                    wj.f(0, 0, 640, 430, 27648, 512);
                    var3 = ha.field_b.field_d;
                    ha.field_b.a((int)((double)((var3 + -640) * -var9) / var7), 0, 128);
                    var3 = 2 * nf.field_v.field_d;
                    nf.field_v.a((int)((double)((var3 - 640) * -var9) / var7), 0);
                    nf.field_v.c((int)((double)(var3 / 2) - (double)((-640 + var3) * var9) / var7), 0);
                    break L2;
                  }
                }
                L28: {
                  wj.f(0, 0, 640, 430, 262656, 11754240);
                  var3 = sg.field_e.field_d;
                  var4 = (int)((double)((var3 - 640) * -var9) / var7);
                  if (sd.field_e != 2) {
                    break L28;
                  } else {
                    this.b((byte) -101);
                    break L28;
                  }
                }
                L29: {
                  if ((sd.field_e ^ -1) == -1) {
                    break L29;
                  } else {
                    this.b((byte) -120, var4);
                    break L29;
                  }
                }
                this.a((byte) 0, var4);
                sg.field_e.d(var4, 0);
                var3 = nj.field_o.field_d * 2;
                nj.field_o.d((int)((double)(-var9 * (-640 + var3)) / var7), 0);
                nj.field_o.d((int)((double)(var3 / 2) - (double)(var9 * (var3 + -640)) / var7), 0);
                if (var16 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
              L30: {
                wj.f(0, 0, 640, 430, 258, 13932);
                if (sd.field_e == 0) {
                  break L30;
                } else {
                  if (0 > DrPhlogistonSavesTheEarth.field_K) {
                    break L30;
                  } else {
                    L31: {
                      var11_ref_gg = new gg(ib.field_a, ch.field_y, 70, 0.0, 1.0, 1.0, 1, 1.5, 0.99, 1);
                      var11_ref_gg.field_o = var9 >> -1827964765;
                      var12 = DrPhlogistonSavesTheEarth.field_K * 128;
                      var13 = 64 * DrPhlogistonSavesTheEarth.field_K;
                      var13 = var13 >> 8;
                      var14 = 255 * DrPhlogistonSavesTheEarth.field_K;
                      var12 = var12 >> 8;
                      var13 = var13 << 8;
                      var14 = var14 >> 8;
                      var12 = var12 << 16;
                      stackOut_35_0 = (gg) (var11_ref_gg);
                      stackOut_35_1 = -1093327740;
                      stackOut_35_2 = 16777215;
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_37_1 = stackOut_35_1;
                      stackIn_37_2 = stackOut_35_2;
                      stackIn_36_0 = stackOut_35_0;
                      stackIn_36_1 = stackOut_35_1;
                      stackIn_36_2 = stackOut_35_2;
                      if (sd.field_e != 2) {
                        stackOut_37_0 = (gg) ((Object) stackIn_37_0);
                        stackOut_37_1 = stackIn_37_1;
                        stackOut_37_2 = stackIn_37_2;
                        stackOut_37_3 = 0;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        stackIn_38_2 = stackOut_37_2;
                        stackIn_38_3 = stackOut_37_3;
                        break L31;
                      } else {
                        stackOut_36_0 = (gg) ((Object) stackIn_36_0);
                        stackOut_36_1 = stackIn_36_1;
                        stackOut_36_2 = stackIn_36_2;
                        stackOut_36_3 = 1;
                        stackIn_38_0 = stackOut_36_0;
                        stackIn_38_1 = stackOut_36_1;
                        stackIn_38_2 = stackOut_36_2;
                        stackIn_38_3 = stackOut_36_3;
                        break L31;
                      }
                    }
                    ((gg) (Object) stackIn_38_0).a(stackIn_38_1, stackIn_38_2, stackIn_38_3 != 0, var14 | (var13 | var12));
                    break L30;
                  }
                }
              }
              L32: {
                var3 = uk.field_h.field_d;
                var4 = (int)((double)((var3 + -640) * -var9) / var7);
                if ((sd.field_e ^ -1) == -1) {
                  break L32;
                } else {
                  this.b((byte) -105, var4);
                  break L32;
                }
              }
              this.a((byte) 0, var4);
              uk.field_h.d(var4, 0);
              var3 = 2 * nj.field_o.field_d;
              nj.field_o.d((int)((double)((var3 + -640) * -var9) / var7), 0);
              nj.field_o.d((int)((double)(var3 / 2) - (double)((var3 - 640) * var9) / var7), 0);
              break L1;
            }
            break L1;
          }
          return;
        } else {
          return;
        }
    }

    private final void E(int param0) {
        L0: {
          L1: {
            L2: {
              this.field_D = this.field_D + this.field_j;
              this.field_N = this.field_N + this.field_c;
              if (!this.field_U) {
                break L2;
              } else {
                if (0 < this.field_w) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if ((this.field_G.field_h.length ^ -1) < (this.field_J - -640 ^ -1)) {
              break L1;
            } else {
              if (this.field_eb) {
                break L1;
              } else {
                L3: {
                  if (!this.field_ab) {
                    break L3;
                  } else {
                    if (150 <= gm.field_J) {
                      break L3;
                    } else {
                      break L0;
                    }
                  }
                }
                this.field_c = 5.0;
                if (!DrPhlogistonSavesTheEarth.field_D) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          L4: {
            if (this.field_D < 0.0) {
              this.field_j = 0.0;
              this.field_D = 0.0;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if ((double)ri.field_e + this.field_D <= 430.0) {
              break L5;
            } else {
              this.field_j = 0.0;
              this.field_D = (double)(430 - ri.field_e);
              break L5;
            }
          }
          L6: {
            if (0.0 <= this.field_N) {
              break L6;
            } else {
              this.field_N = 0.0;
              this.field_c = 0.0;
              break L6;
            }
          }
          L7: {
            if (this.field_N + (double)am.field_l <= 640.0) {
              break L7;
            } else {
              this.field_c = 0.0;
              this.field_N = (double)(-am.field_l + 640);
              break L7;
            }
          }
          this.field_j = this.field_j - this.field_j / 20.0;
          this.field_c = this.field_c - this.field_c / 20.0;
          break L0;
        }
        L8: {
          this.field_M.l(e.a(125, (int)this.field_N));
          this.field_z.l(e.a(119, (int)this.field_N));
          if (param0 == -8499) {
            break L8;
          } else {
            this.k(-18);
            break L8;
          }
        }
        L9: {
          if (this.field_z.m()) {
            if (this.field_z.f() != ((vk) ((Object) this.field_z.field_i)).field_i.length) {
              break L9;
            } else {
              this.field_z.i(-1);
              th.a(-27610, 32, e.a(105, (int)this.field_N), nl.field_r[8]);
              break L9;
            }
          } else {
            break L9;
          }
        }
    }

    final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (-1 > (hb.field_g ^ -1)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 11;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          L2: {
            tc.field_d = stackIn_3_0;
            if (-1 == (ej.field_h ^ -1)) {
              break L2;
            } else {
              ek.a(-76, false, 9);
              if (var3 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (0 != this.field_H) {
              break L3;
            } else {
              ek.a(-109, false, 0);
              if (var3 == 0) {
                break L1;
              } else {
                break L3;
              }
            }
          }
          ek.a(-106, false, 2);
          break L1;
        }
        L4: {
          if (param0 > 35) {
            break L4;
          } else {
            this.E(-104);
            break L4;
          }
        }
        L5: {
          if (!this.C(31578)) {
            break L5;
          } else {
            r.field_d = 5;
            break L5;
          }
        }
        L6: {
          if (!oh.a(0)) {
            bf.field_h = this.j((byte) -68);
            break L6;
          } else {
            break L6;
          }
        }
        var2 = 0;
        L7: while (true) {
          L8: {
            if ((this.field_n.length ^ -1) >= (var2 ^ -1)) {
              break L8;
            } else {
              if (var3 != 0) {
                break L8;
              } else {
                L9: {
                  if (null == this.field_n[var2]) {
                    break L9;
                  } else {
                    this.field_n[var2].a(7769);
                    break L9;
                  }
                }
                var2++;
                if (var3 == 0) {
                  continue L7;
                } else {
                  break L8;
                }
              }
            }
          }
          return;
        }
    }

    public static void h(int param0) {
        field_db = null;
        field_V = null;
        if (param0 != 24342) {
            j.h(-24);
        }
        field_Y = null;
        field_K = null;
    }

    private final void c(bf param0, int param1) {
        RuntimeException runtimeException = null;
        double var3_double = 0.0;
        double var5 = 0.0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.field_s) {
                  break L1;
                } else {
                  if (0 <= this.field_fb) {
                    break L1;
                  } else {
                    L2: {
                      var3_double = this.field_c - param0.field_l;
                      var5 = -param0.field_j + this.field_j;
                      if (param1 <= -115) {
                        break L2;
                      } else {
                        this.k(-90);
                        break L2;
                      }
                    }
                    L3: {
                      L4: {
                        if (cj.field_c[param0.field_Q]) {
                          break L4;
                        } else {
                          this.field_c = -(var3_double / 2.0) + param0.field_l;
                          this.field_j = param0.field_j - var5 / 2.0;
                          if (!DrPhlogistonSavesTheEarth.field_D) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      this.field_c = param0.field_l - var3_double;
                      this.field_j = -var5 + param0.field_j;
                      break L3;
                    }
                    this.field_N = this.field_N + this.field_c;
                    this.field_D = this.field_D + this.field_j;
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
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (runtimeException);
            stackOut_13_1 = new StringBuilder().append("j.OB(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void s(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        if (param0 > 79) {
          L0: while (true) {
            L1: {
              L2: {
                if ((this.field_m.length ^ -1) >= (var2 ^ -1)) {
                  break L2;
                } else {
                  this.field_m[var2] = null;
                  var2++;
                  if (var3 != 0) {
                    break L1;
                  } else {
                    if (var3 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var2 = 0;
              break L1;
            }
            L3: while (true) {
              L4: {
                L5: {
                  if (this.field_v.length <= var2) {
                    break L5;
                  } else {
                    this.field_v[var2] = null;
                    var2++;
                    if (var3 != 0) {
                      break L4;
                    } else {
                      if (var3 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                var2 = 0;
                break L4;
              }
              L6: while (true) {
                L7: {
                  L8: {
                    if ((this.field_d.length ^ -1) >= (var2 ^ -1)) {
                      break L8;
                    } else {
                      this.field_d[var2] = null;
                      var2++;
                      if (var3 != 0) {
                        break L7;
                      } else {
                        if (var3 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  var2 = 0;
                  break L7;
                }
                L9: while (true) {
                  L10: {
                    L11: {
                      if (this.field_n.length <= var2) {
                        break L11;
                      } else {
                        if (var3 != 0) {
                          break L10;
                        } else {
                          L12: {
                            if (null == this.field_n[var2]) {
                              break L12;
                            } else {
                              this.field_n[var2].a(7769);
                              break L12;
                            }
                          }
                          this.field_n[var2] = null;
                          var2++;
                          if (var3 == 0) {
                            continue L9;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    var2 = 0;
                    break L10;
                  }
                  L13: while (true) {
                    L14: {
                      L15: {
                        if ((this.field_B.length ^ -1) >= (var2 ^ -1)) {
                          break L15;
                        } else {
                          this.field_B[var2] = null;
                          var2++;
                          if (var3 != 0) {
                            break L14;
                          } else {
                            if (var3 == 0) {
                              continue L13;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                      bc.field_d.c();
                      wj.c();
                      lb.field_C.a(119);
                      fc.field_a = 0;
                      this.field_b = 0;
                      bc.field_f = 0;
                      bg.field_k = 0;
                      this.field_U = false;
                      nf.field_u = 0;
                      this.field_J = 0;
                      dg.field_c = 0;
                      lh.field_m = 0;
                      this.field_Z = 0;
                      this.field_ab = false;
                      this.field_u = 0;
                      gi.field_f = 0;
                      this.field_S = 0;
                      hl.field_d = false;
                      cj.field_b = 0;
                      break L14;
                    }
                    return;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    private final void w(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param0 >= 18) {
            break L0;
          } else {
            field_ib = -47;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          L2: {
            if (var2 >= 160) {
              break L2;
            } else {
              if (var3 != 0) {
                break L2;
              } else {
                L3: {
                  if (null == this.field_d[var2]) {
                    break L3;
                  } else {
                    bc.field_f = bc.field_f | 1 << this.field_q;
                    if (!this.field_d[var2].a((byte) -127)) {
                      break L3;
                    } else {
                      this.field_d[var2] = null;
                      nf.field_u = nf.field_u | 1 << this.field_q;
                      break L3;
                    }
                  }
                }
                var2++;
                if (var3 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          return;
        }
    }

    private final void a(int param0, int param1, int param2, bf param3, int param4) {
        int var6_int = 0;
        td var7 = null;
        try {
            if (param4 > -106) {
                this.G(127);
            }
            var6_int = this.l((byte) 105);
            var7 = new td(param3.field_w, param0, param1, param2);
            if (!(!param3.h(-83))) {
                pe.field_e = var7;
            }
            this.field_B[var6_int] = var7;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "j.LA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    private final void x(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          L1: {
            if ((var2 ^ -1) <= -3802) {
              break L1;
            } else {
              L2: {
                if (null != this.field_B[var2]) {
                  this.field_B[var2].a(true);
                  break L2;
                } else {
                  break L2;
                }
              }
              var2++;
              if (var4 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L3: {
            var3 = 68 % ((16 - param0) / 58);
            if (null != cj.field_e) {
              var2 = 0;
              L4: while (true) {
                if (ck.field_j.length <= var2) {
                  break L3;
                } else {
                  if (var4 != 0) {
                    break L3;
                  } else {
                    L5: {
                      if (null == ck.field_j[var2]) {
                        break L5;
                      } else {
                        ck.field_j[var2].a(true);
                        break L5;
                      }
                    }
                    var2++;
                    if (var4 == 0) {
                      continue L4;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            } else {
              break L3;
            }
          }
          return;
        }
    }

    private final void b(bf param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        this.field_cb[param0.field_Q] = this.field_cb[param0.field_Q] + 1;
                        var3_int = param0.field_Q;
                        if (2 != var3_int) {
                          break L6;
                        } else {
                          if (var4 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (var3_int != 39) {
                          break L7;
                        } else {
                          if (var4 == 0) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L8: {
                        if ((var3_int ^ -1) != -48) {
                          break L8;
                        } else {
                          if (var4 == 0) {
                            break L5;
                          } else {
                            break L8;
                          }
                        }
                      }
                      if (-5 == (var3_int ^ -1)) {
                        break L4;
                      } else {
                        L9: {
                          if (var3_int != 14) {
                            break L9;
                          } else {
                            if (var4 == 0) {
                              break L3;
                            } else {
                              break L9;
                            }
                          }
                        }
                        if ((var3_int ^ -1) == -14) {
                          break L3;
                        } else {
                          L10: {
                            if (-13 != (var3_int ^ -1)) {
                              break L10;
                            } else {
                              if (var4 == 0) {
                                break L2;
                              } else {
                                break L10;
                              }
                            }
                          }
                          if (-37 != (var3_int ^ -1)) {
                            break L1;
                          } else {
                            if (var4 == 0) {
                              break L2;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                    }
                    if (-16 != (this.field_cb[47] + (this.field_cb[2] + this.field_cb[39]) ^ -1)) {
                      break L1;
                    } else {
                      this.a(0, 255, (byte) -123);
                      if (var4 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (15 != this.field_cb[param0.field_Q]) {
                    break L1;
                  } else {
                    this.a(1, 254, (byte) -83);
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                if ((this.field_cb[14] - -this.field_cb[13] ^ -1) == -16) {
                  this.a(2, 253, (byte) -127);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                } else {
                  break L1;
                }
              }
              if (-16 == (this.field_cb[36] + this.field_cb[12] ^ -1)) {
                this.a(3, 252, (byte) -77);
                break L1;
              } else {
                break L1;
              }
            }
            L11: {
              if (param1 >= 39) {
                break L11;
              } else {
                this.field_L = 106;
                break L11;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) (var3);
            stackOut_36_1 = new StringBuilder().append("j.SA(");
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L12;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L12;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ',' + param1 + ')');
        }
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_21_0 = null;
        boolean stackIn_25_0 = false;
        boolean stackIn_26_0 = false;
        boolean stackIn_27_0 = false;
        boolean stackIn_28_0 = false;
        boolean stackIn_29_0 = false;
        boolean stackIn_30_0 = false;
        boolean stackIn_31_0 = false;
        int stackIn_31_1 = 0;
        Object stackIn_34_0 = null;
        Object stackOut_20_0 = null;
        boolean stackOut_24_0 = false;
        boolean stackOut_25_0 = false;
        boolean stackOut_26_0 = false;
        boolean stackOut_27_0 = false;
        boolean stackOut_30_0 = false;
        int stackOut_30_1 = 0;
        boolean stackOut_28_0 = false;
        boolean stackOut_29_0 = false;
        int stackOut_29_1 = 0;
        Object stackOut_33_0 = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!this.field_eb) {
          L0: {
            this.field_w = this.field_w - 1;
            this.a(255, 0);
            gi.a(this.field_M, param0 ^ -6799);
            if (this.field_q >= 0) {
              fc.field_a = fc.field_a | 1 << this.field_q;
              gi.field_f = gi.field_f | 1 << this.field_q;
              break L0;
            } else {
              break L0;
            }
          }
          this.field_fb = 225;
          L1: while (true) {
            L2: {
              L3: {
                if ((this.field_L ^ -1) >= -2) {
                  break L3;
                } else {
                  this.field_d[this.f(qk.a(param0, -6111))] = new ib(this.field_N, this.field_D, 7, true, false);
                  this.field_L = this.field_L - 1;
                  if (var5 != 0) {
                    break L2;
                  } else {
                    if (var5 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L4: while (true) {
                L5: {
                  if (this.field_A <= 1) {
                    break L5;
                  } else {
                    this.field_d[this.f(0)] = new ib(this.field_N, this.field_D, 1, true, false);
                    this.field_A = this.field_A - 1;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (var5 == 0) {
                        continue L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                this.field_u = 0;
                break L2;
              }
            }
            L6: {
              if (param0 == -6111) {
                break L6;
              } else {
                this.k((byte) -99);
                break L6;
              }
            }
            L7: {
              L8: {
                this.field_S = 0;
                var2 = e.a(110, (int)this.field_N);
                if (this.field_w > 0) {
                  break L8;
                } else {
                  tc.field_i = false;
                  var3 = 0;
                  L9: while (true) {
                    L10: {
                      L11: {
                        if ((var3 ^ -1) <= (this.field_n.length ^ -1)) {
                          break L11;
                        } else {
                          stackOut_20_0 = this;
                          stackIn_34_0 = stackOut_20_0;
                          stackIn_21_0 = stackOut_20_0;
                          if (var5 != 0) {
                            break L10;
                          } else {
                            L12: {
                              if (((j) (this)).field_n[var3] == null) {
                                break L12;
                              } else {
                                if (!this.field_n[var3].field_s) {
                                  L13: {
                                    L14: {
                                      var4 = this.field_n[var3].field_Q;
                                      stackOut_24_0 = tc.field_i;
                                      stackIn_29_0 = stackOut_24_0;
                                      stackIn_25_0 = stackOut_24_0;
                                      if ((var4 ^ -1) == -6) {
                                        break L14;
                                      } else {
                                        stackOut_25_0 = stackIn_25_0;
                                        stackIn_29_0 = stackOut_25_0;
                                        stackIn_26_0 = stackOut_25_0;
                                        if ((var4 ^ -1) == -12) {
                                          break L14;
                                        } else {
                                          stackOut_26_0 = stackIn_26_0;
                                          stackIn_29_0 = stackOut_26_0;
                                          stackIn_27_0 = stackOut_26_0;
                                          if ((var4 ^ -1) == -18) {
                                            break L14;
                                          } else {
                                            stackOut_27_0 = stackIn_27_0;
                                            stackIn_30_0 = stackOut_27_0;
                                            stackIn_28_0 = stackOut_27_0;
                                            if (var4 != 18) {
                                              stackOut_30_0 = stackIn_30_0;
                                              stackOut_30_1 = 0;
                                              stackIn_31_0 = stackOut_30_0;
                                              stackIn_31_1 = stackOut_30_1;
                                              break L13;
                                            } else {
                                              stackOut_28_0 = stackIn_28_0;
                                              stackIn_29_0 = stackOut_28_0;
                                              break L14;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    stackOut_29_0 = stackIn_29_0;
                                    stackOut_29_1 = 1;
                                    stackIn_31_0 = stackOut_29_0;
                                    stackIn_31_1 = stackOut_29_1;
                                    break L13;
                                  }
                                  tc.field_i = stackIn_31_0 | stackIn_31_1 != 0;
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            var3++;
                            if (var5 == 0) {
                              continue L9;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                      sc.a(param0 + 6110, false, dm.field_x);
                      this.field_eb = true;
                      th.a(-27610, 64, var2, nl.field_r[9]);
                      this.o(param0 ^ -6049);
                      stackOut_33_0 = this;
                      stackIn_34_0 = stackOut_33_0;
                      break L10;
                    }
                    ((j) (this)).field_s = this.field_J;
                    if (var5 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
              }
              this.a(9, ri.field_q + (int)this.field_D, -1, (int)this.field_N - -am.field_p, param0 ^ -31963);
              this.field_z.j(64);
              od.a(param0 ^ 1630761897, this.field_z);
              break L7;
            }
            return;
          }
        } else {
          return;
        }
    }

    private final void g(int param0) {
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        String var10 = null;
        int var11_int = 0;
        jb var11 = null;
        int var12_int = 0;
        nh var12 = null;
        double var13 = 0.0;
        int var13_int = 0;
        int var15_int = 0;
        Runtime var15 = null;
        int var16 = 0;
        int var17 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        he stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        he stackIn_22_0 = null;
        he stackIn_23_0 = null;
        he stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        he stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_52_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        he stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        he stackOut_21_0 = null;
        he stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        he stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        he stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_43_0 = 0;
        boolean stackOut_51_0 = false;
        var17 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        ea.field_c.a(0, 0);
        var2 = (double)this.field_gb / 256.0 * 3.141592653589793;
        var4 = 89;
        var5 = 464;
        var6 = var4 + -(int)(pj.a(var2, param0 + 35407) * 27.0);
        var7 = -(int)(27.0 * ji.a(65535, var2)) + var5;
        var8 = -1;
        L0: while (true) {
          L1: {
            L2: {
              if ((var8 ^ -1) < -2) {
                break L2;
              } else {
                stackOut_2_0 = -1;
                stackIn_11_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var17 != 0) {
                  break L1;
                } else {
                  var9 = stackIn_3_0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (var9 > 1) {
                          break L5;
                        } else {
                          wj.g(var4 - -var9, var8 + var5, var6, var7, 16711680);
                          var9++;
                          if (var17 != 0) {
                            break L4;
                          } else {
                            if (var17 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var8++;
                      break L4;
                    }
                    if (var17 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            wj.b(89, 464, 3, 16711680);
            var8 = this.field_H;
            stackOut_10_0 = -1;
            stackIn_11_0 = stackOut_10_0;
            break L1;
          }
          var9 = stackIn_11_0;
          L6: while (true) {
            L7: {
              L8: {
                if (0 == var8) {
                  break L8;
                } else {
                  var9++;
                  var8 = var8 / 10;
                  if (var17 != 0) {
                    break L7;
                  } else {
                    if (var17 == 0) {
                      continue L6;
                    } else {
                      break L8;
                    }
                  }
                }
              }
              if ((var9 ^ -1) <= -7) {
                break L7;
              } else {
                var9 = 6;
                break L7;
              }
            }
            var10_int = 0;
            L9: while (true) {
              L10: {
                L11: {
                  if (var9 < var10_int) {
                    break L11;
                  } else {
                    var11_int = (int)(Math.floor((double)this.field_H / Math.pow(10.0, (double)(var10_int + 1))) * Math.pow(10.0, (double)(1 + var10_int)));
                    var12_int = (int)Math.floor((double)(-var11_int + this.field_H) / Math.pow(10.0, (double)var10_int));
                    stackOut_20_0 = pi.field_S[var12_int];
                    stackOut_20_1 = var9 ^ -1;
                    stackOut_20_2 = -7;
                    stackIn_26_0 = stackOut_20_0;
                    stackIn_26_1 = stackOut_20_1;
                    stackIn_26_2 = stackOut_20_2;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    stackIn_21_2 = stackOut_20_2;
                    if (var17 != 0) {
                      break L10;
                    } else {
                      L12: {
                        stackOut_21_0 = (he) ((Object) stackIn_21_0);
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_22_0 = stackOut_21_0;
                        if (stackIn_21_1 == stackIn_21_2) {
                          stackOut_23_0 = (he) ((Object) stackIn_23_0);
                          stackOut_23_1 = 21;
                          stackIn_24_0 = stackOut_23_0;
                          stackIn_24_1 = stackOut_23_1;
                          break L12;
                        } else {
                          stackOut_22_0 = (he) ((Object) stackIn_22_0);
                          stackOut_22_1 = 18;
                          stackIn_24_0 = stackOut_22_0;
                          stackIn_24_1 = stackOut_22_1;
                          break L12;
                        }
                      }
                      ((he) (Object) stackIn_24_0).e(-(stackIn_24_1 * var10_int) + 320, 438);
                      var10_int++;
                      if (var17 == 0) {
                        continue L9;
                      } else {
                        break L11;
                      }
                    }
                  }
                }
                stackOut_25_0 = pi.field_S[this.field_L];
                stackOut_25_1 = 161;
                stackOut_25_2 = 438;
                stackIn_26_0 = stackOut_25_0;
                stackIn_26_1 = stackOut_25_1;
                stackIn_26_2 = stackOut_25_2;
                break L10;
              }
              L13: {
                ((he) (Object) stackIn_26_0).e(stackIn_26_1, stackIn_26_2);
                if (this.field_w >= 0) {
                  pi.field_S[this.field_w].e(383, 438);
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                L15: {
                  dh.field_R[ah.field_J].a(408, 429);
                  wj.b(this.field_t);
                  wj.f(400, 425, 515, 475);
                  if (this.field_J - pa.field_c > 10) {
                    break L15;
                  } else {
                    dh.field_R[ib.field_t].a(408, -((-pa.field_c + this.field_J) * 5) + 479);
                    if (var17 == 0) {
                      break L14;
                    } else {
                      break L15;
                    }
                  }
                }
                dh.field_R[ib.field_t].a(408, 429);
                break L14;
              }
              L16: {
                wj.a(this.field_t);
                var10 = "x" + this.field_A;
                var11 = cb.field_b;
                var12 = new nh(var11.b(var10), var11.field_x - -var11.field_S);
                var12.c();
                if (param0 == -2639) {
                  break L16;
                } else {
                  this.field_T = -118;
                  break L16;
                }
              }
              L17: {
                var11.c(var10, 0, var11.field_x, 16777215, -1);
                lb.field_C.a(116);
                var12.b(-(var12.field_y / 2) + 503, var12.field_w / 2 + 443);
                if ((this.field_Z ^ -1) < -1) {
                  L18: {
                    if (this.field_Z % 20 < 10) {
                      stackOut_39_0 = 16711680;
                      stackIn_40_0 = stackOut_39_0;
                      break L18;
                    } else {
                      stackOut_38_0 = 0;
                      stackIn_40_0 = stackOut_38_0;
                      break L18;
                    }
                  }
                  var13_int = stackIn_40_0;
                  cb.field_b.a(na.field_b, 620, cb.field_b.field_x - -10, var13_int, 0);
                  break L17;
                } else {
                  break L17;
                }
              }
              var4 = 551;
              var5 = 464;
              var13 = (double)this.field_u / 200.0 * 3.141592653589793;
              var6 = -(int)(27.0 * pj.a(var13, 32768)) + var4;
              var7 = -(int)(ji.a(param0 + 68174, var13) * 27.0) + var5;
              var15_int = -1;
              L19: while (true) {
                L20: {
                  L21: {
                    if ((var15_int ^ -1) < -2) {
                      break L21;
                    } else {
                      stackOut_43_0 = -1;
                      stackIn_52_0 = stackOut_43_0;
                      stackIn_44_0 = stackOut_43_0;
                      if (var17 != 0) {
                        break L20;
                      } else {
                        var16 = stackIn_44_0;
                        L22: while (true) {
                          L23: {
                            L24: {
                              if (var16 > 1) {
                                break L24;
                              } else {
                                wj.g(var4 - -var16, var5 - -var15_int, var6, var7, 16711680);
                                var16++;
                                if (var17 != 0) {
                                  break L23;
                                } else {
                                  if (var17 == 0) {
                                    continue L22;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                            }
                            var15_int++;
                            break L23;
                          }
                          if (var17 == 0) {
                            continue L19;
                          } else {
                            break L21;
                          }
                        }
                      }
                    }
                  }
                  wj.b(89, 464, 3, 16711680);
                  stackOut_51_0 = this.field_F;
                  stackIn_52_0 = stackOut_51_0 ? 1 : 0;
                  break L20;
                }
                L25: {
                  if (stackIn_52_0 != 0) {
                    ji.field_d.b("lvl: " + Integer.toString(this.field_q) + "; fps: " + pc.field_a, 112, 32, 65280, 65280);
                    ji.field_d.a("Bonus: " + this.field_R, 630, 32, 16777215, 16777215);
                    var15 = Runtime.getRuntime();
                    var16 = (int)(var15.totalMemory() - var15.freeMemory()) >> 447005844;
                    ji.field_d.b(Integer.toString(var16), 330, 35, 16711680, 16711680);
                    break L25;
                  } else {
                    break L25;
                  }
                }
                return;
              }
            }
          }
        }
    }

    private final void i(int param0) {
        if (!(-3 == (sd.field_e ^ -1))) {
            return;
        }
        if (param0 != 215) {
            this.w(45);
        }
        if (!((this.field_J & 1 ^ -1) != -1)) {
            return;
        }
        bc.field_d = gm.a(bc.field_d, 65280, (-8096 + this.field_J) / 20, q.field_f, 16711680, true);
    }

    private final void p(int param0) {
        int var2_int = 0;
        gg var2 = null;
        int var3 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_10_0 = null;
        gg stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        gg stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        gg stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_9_0 = null;
        gg stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        gg stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        gg stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        L0: {
          var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param0 == -3) {
            break L0;
          } else {
            this.y(-39);
            break L0;
          }
        }
        var2_int = 0;
        L1: while (true) {
          L2: {
            L3: {
              if ((var2_int ^ -1) <= -1401) {
                break L3;
              } else {
                stackOut_4_0 = this;
                stackIn_10_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (var3 != 0) {
                  break L2;
                } else {
                  L4: {
                    if (((j) (this)).field_m[var2_int] != null) {
                      this.field_m[var2_int].c((byte) 119);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var2_int++;
                  if (var3 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            stackOut_9_0 = this;
            stackIn_10_0 = stackOut_9_0;
            break L2;
          }
          L5: {
            if (!((j) (this)).field_a) {
              break L5;
            } else {
              L6: {
                var2 = new gg((int)((double)am.field_p + this.field_N), (int)((double)ri.field_q + this.field_D), 15, 0.0, 6.283185307179586, 1.5707963267948966, 3, 1.9, 0.92, this.field_J >> -553800703);
                stackOut_11_0 = (gg) (var2);
                stackOut_11_1 = -1093327740;
                stackOut_11_2 = 16777215;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_13_2 = stackOut_11_2;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                if ((sd.field_e ^ -1) != -3) {
                  stackOut_13_0 = (gg) ((Object) stackIn_13_0);
                  stackOut_13_1 = stackIn_13_1;
                  stackOut_13_2 = stackIn_13_2;
                  stackOut_13_3 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  stackIn_14_3 = stackOut_13_3;
                  break L6;
                } else {
                  stackOut_12_0 = (gg) ((Object) stackIn_12_0);
                  stackOut_12_1 = stackIn_12_1;
                  stackOut_12_2 = stackIn_12_2;
                  stackOut_12_3 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  stackIn_14_3 = stackOut_12_3;
                  break L6;
                }
              }
              ((gg) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_14_2, stackIn_14_3 != 0, 8405247);
              this.field_a = false;
              break L5;
            }
          }
          return;
        }
    }

    private final void B(int param0) {
        he var2 = null;
        he[] var3_ref_he__ = null;
        int var3 = 0;
        int var4 = 0;
        he var5 = null;
        he var6 = null;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_17_4 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        int[] stackIn_20_4 = null;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        int stackOut_16_4 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_15_4 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        int[] stackOut_19_4 = null;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        int[] stackOut_18_4 = null;
        L0: {
          L1: {
            var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            if (0 < this.field_fb) {
              break L1;
            } else {
              L2: {
                var5 = kh.field_e;
                var2 = var5;
                if (!this.field_y) {
                  break L2;
                } else {
                  var5.c(-var5.field_a + (int)this.field_N, (int)this.field_D + -var5.field_f, 128, this.field_r);
                  this.field_y = false;
                  if (var4 == 0) {
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              var5.a(-var5.field_a + (int)this.field_N, (int)this.field_D + -var5.field_f);
              if (var4 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var3_ref_he__ = ii.field_b;
          var6 = var3_ref_he__[(-1 + var3_ref_he__.length) * (225 - this.field_fb) / 225];
          var2 = var6;
          wj.d(0, 0, 640, 430, 16777215, this.field_fb * 255 / 225);
          var2.a(-var6.field_a + (int)this.field_N, -var6.field_f + (int)this.field_D, (225 - this.field_fb) * 256 / 225);
          break L0;
        }
        if (param0 == -5651) {
          var3 = 0;
          L3: while (true) {
            L4: {
              L5: {
                L6: {
                  L7: {
                    if ((var3 ^ -1) <= (this.field_h.length ^ -1)) {
                      break L7;
                    } else {
                      this.field_h[var3].c(param0 + 5650);
                      stackOut_11_0 = this.field_u ^ -1;
                      stackOut_11_1 = -1;
                      stackIn_36_0 = stackOut_11_0;
                      stackIn_36_1 = stackOut_11_1;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      if (var4 != 0) {
                        L8: while (true) {
                          if (stackIn_36_0 <= stackIn_36_1) {
                            break L5;
                          } else {
                            this.field_k[var3].c(-1);
                            var3++;
                            if (var4 != 0) {
                              break L4;
                            } else {
                              if (var4 == 0) {
                                stackOut_38_0 = var3 ^ -1;
                                stackOut_38_1 = this.field_k.length ^ -1;
                                stackIn_36_0 = stackOut_38_0;
                                stackIn_36_1 = stackOut_38_1;
                                continue L8;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      } else {
                        L9: {
                          if (stackIn_12_0 < stackIn_12_1) {
                            L10: {
                              stackOut_14_0 = (int)((double)am.field_l + this.field_N) << -1573415996;
                              stackOut_14_1 = (int)(this.field_D + (double)ri.field_q) << -1990697948;
                              stackOut_14_2 = 256;
                              stackOut_14_3 = this.field_u;
                              stackIn_16_0 = stackOut_14_0;
                              stackIn_16_1 = stackOut_14_1;
                              stackIn_16_2 = stackOut_14_2;
                              stackIn_16_3 = stackOut_14_3;
                              stackIn_15_0 = stackOut_14_0;
                              stackIn_15_1 = stackOut_14_1;
                              stackIn_15_2 = stackOut_14_2;
                              stackIn_15_3 = stackOut_14_3;
                              if (50 < this.field_u) {
                                stackOut_16_0 = stackIn_16_0;
                                stackOut_16_1 = stackIn_16_1;
                                stackOut_16_2 = stackIn_16_2;
                                stackOut_16_3 = stackIn_16_3;
                                stackOut_16_4 = 2;
                                stackIn_17_0 = stackOut_16_0;
                                stackIn_17_1 = stackOut_16_1;
                                stackIn_17_2 = stackOut_16_2;
                                stackIn_17_3 = stackOut_16_3;
                                stackIn_17_4 = stackOut_16_4;
                                break L10;
                              } else {
                                stackOut_15_0 = stackIn_15_0;
                                stackOut_15_1 = stackIn_15_1;
                                stackOut_15_2 = stackIn_15_2;
                                stackOut_15_3 = stackIn_15_3;
                                stackOut_15_4 = 4;
                                stackIn_17_0 = stackOut_15_0;
                                stackIn_17_1 = stackOut_15_1;
                                stackIn_17_2 = stackOut_15_2;
                                stackIn_17_3 = stackOut_15_3;
                                stackIn_17_4 = stackOut_15_4;
                                break L10;
                              }
                            }
                            L11: {
                              stackOut_17_0 = stackIn_17_0;
                              stackOut_17_1 = stackIn_17_1;
                              stackOut_17_2 = stackIn_17_2;
                              stackOut_17_3 = stackIn_17_3 / stackIn_17_4;
                              stackIn_19_0 = stackOut_17_0;
                              stackIn_19_1 = stackOut_17_1;
                              stackIn_19_2 = stackOut_17_2;
                              stackIn_19_3 = stackOut_17_3;
                              stackIn_18_0 = stackOut_17_0;
                              stackIn_18_1 = stackOut_17_1;
                              stackIn_18_2 = stackOut_17_2;
                              stackIn_18_3 = stackOut_17_3;
                              if (50 >= this.field_u) {
                                stackOut_19_0 = stackIn_19_0;
                                stackOut_19_1 = stackIn_19_1;
                                stackOut_19_2 = stackIn_19_2;
                                stackOut_19_3 = stackIn_19_3;
                                stackOut_19_4 = uh.field_j;
                                stackIn_20_0 = stackOut_19_0;
                                stackIn_20_1 = stackOut_19_1;
                                stackIn_20_2 = stackOut_19_2;
                                stackIn_20_3 = stackOut_19_3;
                                stackIn_20_4 = stackOut_19_4;
                                break L11;
                              } else {
                                stackOut_18_0 = stackIn_18_0;
                                stackOut_18_1 = stackIn_18_1;
                                stackOut_18_2 = stackIn_18_2;
                                stackOut_18_3 = stackIn_18_3;
                                stackOut_18_4 = uh.field_l;
                                stackIn_20_0 = stackOut_18_0;
                                stackIn_20_1 = stackOut_18_1;
                                stackIn_20_2 = stackOut_18_2;
                                stackIn_20_3 = stackOut_18_3;
                                stackIn_20_4 = stackOut_18_4;
                                break L11;
                              }
                            }
                            wj.a(stackIn_20_0, stackIn_20_1, stackIn_20_2, stackIn_20_3, stackIn_20_4);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var3++;
                        if (var4 == 0) {
                          continue L3;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  if (!this.field_eb) {
                    break L5;
                  } else {
                    if (null != this.field_k) {
                      var3 = 0;
                      L12: while (true) {
                        if ((var3 ^ -1) <= (this.field_k.length ^ -1)) {
                          break L5;
                        } else {
                          this.field_k[var3].c(-1);
                          var3++;
                          if (var4 != 0) {
                            break L4;
                          } else {
                            if (var4 == 0) {
                              continue L12;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                break L5;
              }
              le.field_c = var2;
              break L4;
            }
            return;
          }
        } else {
          return;
        }
    }

    private final void q(int param0) {
        int var2 = 0;
        ib var3 = null;
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            L2: {
              var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
              if (200 > this.field_fb) {
                break L2;
              } else {
                if ((gm.field_J ^ -1) >= -1) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if ((this.field_w ^ -1) >= -1) {
              break L1;
            } else {
              var2 = 0;
              L3: while (true) {
                if (160 <= var2) {
                  break L1;
                } else {
                  var3 = this.field_d[var2];
                  if (var5 != 0) {
                    break L0;
                  } else {
                    L4: {
                      if (var3 != null) {
                        if (!ne.a(le.field_c, (int)this.field_N, (int)this.field_D, var3.field_n, (int)var3.field_d, (int)var3.field_k)) {
                          break L4;
                        } else {
                          L5: {
                            L6: {
                              L7: {
                                L8: {
                                  L9: {
                                    L10: {
                                      L11: {
                                        var4 = var3.field_g;
                                        if (4 != var4) {
                                          break L11;
                                        } else {
                                          if (var5 == 0) {
                                            break L10;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                      L12: {
                                        if (var4 != 5) {
                                          break L12;
                                        } else {
                                          if (var5 == 0) {
                                            break L10;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      L13: {
                                        if ((var4 ^ -1) != -7) {
                                          break L13;
                                        } else {
                                          if (var5 == 0) {
                                            break L10;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      if (7 == var4) {
                                        break L9;
                                      } else {
                                        if (3 == var4) {
                                          break L8;
                                        } else {
                                          L14: {
                                            if (var4 != 2) {
                                              break L14;
                                            } else {
                                              if (var5 == 0) {
                                                break L7;
                                              } else {
                                                break L14;
                                              }
                                            }
                                          }
                                          if (-2 != (var4 ^ -1)) {
                                            break L5;
                                          } else {
                                            if (var5 == 0) {
                                              break L6;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    this.d((byte) -90, var3.field_m);
                                    if (var5 == 0) {
                                      break L5;
                                    } else {
                                      break L9;
                                    }
                                  }
                                  this.field_L = this.field_L + 1;
                                  if (var5 == 0) {
                                    break L5;
                                  } else {
                                    break L8;
                                  }
                                }
                                this.field_w = this.field_w + 1;
                                if (9 < this.field_w) {
                                  this.field_w = 9;
                                  if (var5 == 0) {
                                    break L5;
                                  } else {
                                    break L7;
                                  }
                                } else {
                                  break L5;
                                }
                              }
                              this.a(this.field_gb - -64, 0);
                              if (var5 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                            this.field_A = this.field_A + 1;
                            break L5;
                          }
                          this.a(this.field_gb, 0);
                          this.field_d[var2] = null;
                          bg.field_k = bg.field_k | 1 << this.field_q;
                          ah.a(nl.field_r[70], e.a(118, (int)this.field_N), -1321705304);
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    var2++;
                    if (var5 == 0) {
                      continue L3;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          if (param0 >= 91) {
            break L0;
          } else {
            this.field_v = (gf[]) null;
            break L0;
          }
        }
    }

    final void r(int param0) {
        int fieldTemp$3 = 0;
        gi discarded$4 = null;
        boolean discarded$5 = false;
        double var2 = 0.0;
        int var2_int = 0;
        int var4 = 0;
        bf var5 = null;
        nh var6 = null;
        bf var7 = null;
        bf var8 = null;
        bf var9 = null;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackOut_65_0 = 0;
        int stackOut_65_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        L0: {
          var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param0 <= -67) {
            break L0;
          } else {
            this.a((byte) 58);
            break L0;
          }
        }
        L1: {
          if ((qe.field_a ^ -1) == 149) {
            System.gc();
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if ((ab.field_b ^ -1) == (this.field_q ^ -1)) {
            break L2;
          } else {
            this.c((byte) 111);
            break L2;
          }
        }
        L3: {
          L4: {
            if (null == this.field_I.h(-11151)) {
              break L4;
            } else {
              fieldTemp$3 = this.field_bb + 1;
              this.field_bb = this.field_bb + 1;
              if (fieldTemp$3 != 335) {
                break L4;
              } else {
                this.field_bb = 0;
                discarded$4 = this.field_I.d(180479896);
                break L3;
              }
            }
          }
          break L3;
        }
        L5: while (true) {
          L6: {
            L7: {
              L8: {
                if (!th.a(-114)) {
                  L9: {
                    this.E(-8499);
                    this.i((byte) -1);
                    this.A(1052688);
                    this.I(0);
                    if (qe.field_a <= 0) {
                      break L9;
                    } else {
                      L10: {
                        this.z(215);
                        this.b(114);
                        this.a(true);
                        this.w(19);
                        this.k(0);
                        this.i(215);
                        this.a(0);
                        this.q(114);
                        if (-1 == (gm.field_J ^ -1)) {
                          this.c(-6718);
                          this.b(true);
                          if (this.field_eb) {
                            break L10;
                          } else {
                            this.k((byte) 123);
                            break L10;
                          }
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        this.F(-125);
                        this.field_fb = this.field_fb - 1;
                        if ((this.field_fb ^ -1) < -1) {
                          this.a(11, (int)this.field_D - -hi.a(ri.field_e, 4, this.field_l), -1, (int)this.field_N - -hi.a(am.field_l, 4, this.field_l), 27396);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        this.field_Z = this.field_Z - 1;
                        if (!this.n(115)) {
                          break L12;
                        } else {
                          this.field_J = this.field_J + 1;
                          this.field_l.setSeed((long)(this.field_J + (this.field_q << 182458384)));
                          if (var4 == 0) {
                            break L6;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L13: {
                        L14: {
                          if (!this.field_U) {
                            break L14;
                          } else {
                            if (!this.field_ab) {
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        var2_int = 0;
                        L15: while (true) {
                          L16: {
                            L17: {
                              if (-1601 >= (var2_int ^ -1)) {
                                break L17;
                              } else {
                                var5 = this.field_n[var2_int];
                                var8 = var5;
                                var8 = var5;
                                var7 = var5;
                                if (var4 != 0) {
                                  break L16;
                                } else {
                                  L18: {
                                    if (var7 == null) {
                                      break L18;
                                    } else {
                                      L19: {
                                        L20: {
                                          if (var7.a(false)) {
                                            break L20;
                                          } else {
                                            if (wh.field_v[var5.field_Q]) {
                                              break L20;
                                            } else {
                                              if (0 < var7.field_H) {
                                                break L19;
                                              } else {
                                                break L20;
                                              }
                                            }
                                          }
                                        }
                                        if (!cj.field_c[var5.field_Q]) {
                                          break L18;
                                        } else {
                                          var7.field_o = var7.field_o + 1.0;
                                          if (var4 == 0) {
                                            break L18;
                                          } else {
                                            break L19;
                                          }
                                        }
                                      }
                                      this.a(119, (gf) null, var5);
                                      this.field_n[var2_int].a(7769);
                                      this.field_n[var2_int] = null;
                                      break L18;
                                    }
                                  }
                                  var2_int++;
                                  if (var4 == 0) {
                                    continue L15;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                            }
                            this.H(1);
                            break L16;
                          }
                          if (var4 == 0) {
                            break L7;
                          } else {
                            break L13;
                          }
                        }
                      }
                      L21: {
                        L22: {
                          this.field_J = this.field_J + 1;
                          this.field_l.setSeed((long)(this.field_J + (this.field_q << 513393392)));
                          var2_int = this.field_q;
                          if (-3 != (var2_int ^ -1)) {
                            break L22;
                          } else {
                            if (var4 == 0) {
                              if ((this.field_J % 298 ^ -1) != -1) {
                                break L7;
                              } else {
                                L23: {
                                  var2_int = hi.a(9, 4, this.field_l) + 19;
                                  if (-22 >= (var2_int ^ -1)) {
                                    var2_int += 2;
                                    break L23;
                                  } else {
                                    break L23;
                                  }
                                }
                                var8 = this.a(0, true, var2_int, this.field_J, 0, true);
                                var8.field_H = 1;
                                discarded$5 = var8.a(2, 10);
                                var8.field_N = (double)(-var8.b((byte) 55).field_c + 430);
                                var8.field_o = 640.0;
                                if (var4 == 0) {
                                  break L7;
                                } else {
                                  break L21;
                                }
                              }
                            } else {
                              break L22;
                            }
                          }
                        }
                        L24: {
                          if (-6 != (var2_int ^ -1)) {
                            break L24;
                          } else {
                            if (var4 == 0) {
                              break L7;
                            } else {
                              break L24;
                            }
                          }
                        }
                        if (-9 == (var2_int ^ -1)) {
                          break L21;
                        } else {
                          break L6;
                        }
                      }
                      if (0 != this.field_J % vc.field_b[0].field_d) {
                        break L7;
                      } else {
                        var9 = this.a(0, true, 31, this.field_J, 0, true);
                        var9.field_N = (double)(430 + -var9.b((byte) 55).field_c);
                        var9.field_o = 640.0;
                        if (var4 == 0) {
                          break L7;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  stackOut_65_0 = qe.field_a ^ -1;
                  stackOut_65_1 = 149;
                  stackIn_66_0 = stackOut_65_0;
                  stackIn_66_1 = stackOut_65_1;
                  break L8;
                } else {
                  stackOut_12_0 = 150;
                  stackOut_12_1 = gm.field_J;
                  stackIn_66_0 = stackOut_12_0;
                  stackIn_66_1 = stackOut_12_1;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  if (var4 != 0) {
                    break L8;
                  } else {
                    L25: {
                      if (stackIn_13_0 >= stackIn_13_1) {
                        break L25;
                      } else {
                        gm.field_J = 500;
                        break L25;
                      }
                    }
                    if (di.field_c == 13) {
                      L26: {
                        L27: {
                          if (null == rh.field_b) {
                            break L27;
                          } else {
                            var6 = rh.field_b;
                            kg.a(wj.field_l, 0, var6.field_B, 0, var6.field_B.length);
                            if (var4 == 0) {
                              break L26;
                            } else {
                              break L27;
                            }
                          }
                        }
                        rh.field_b = be.b();
                        break L26;
                      }
                      rh.field_b.c();
                      be.a(0, 0, 640, 480, 22070844, 255);
                      lb.field_C.a(117);
                      ek.a(-78, false, 1);
                      return;
                    } else {
                      continue L5;
                    }
                  }
                }
              }
              L28: {
                if (stackIn_66_0 == stackIn_66_1) {
                  this.b(116);
                  break L28;
                } else {
                  break L28;
                }
              }
              var2 = -((double)qe.field_a / -150.0) + 1.0;
              qe.field_a = qe.field_a + 1;
              this.field_N = (double)(-am.field_l) + (double)(275 - -am.field_l) * var2;
              if (!ck.field_f[83]) {
                break L7;
              } else {
                qe.field_a = qe.field_a + 10;
                break L6;
              }
            }
            break L6;
          }
          return;
        }
    }

    private final void k(byte param0) {
        int var2 = 0;
        bf var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_11_0 = 0;
        boolean stackOut_10_0 = false;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (-1601 >= (var2 ^ -1)) {
                break L2;
              } else {
                var3 = this.field_n[var2];
                if (var6 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (var3 == null) {
                      break L3;
                    } else {
                      if (!var3.m(-117)) {
                        break L3;
                      } else {
                        L4: {
                          if (ne.a(le.field_c, (int)this.field_N, (int)this.field_D, var3.b((byte) 55), (int)var3.field_o, (int)var3.field_N)) {
                            break L4;
                          } else {
                            if (var3.field_D == null) {
                              break L3;
                            } else {
                              if (!ne.a(le.field_c, (int)this.field_N, (int)this.field_D, var3.field_D, var3.field_d, var3.field_p)) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        L5: {
                          if (var3.field_s) {
                            stackOut_11_0 = 0;
                            stackIn_12_0 = stackOut_11_0;
                            break L5;
                          } else {
                            stackOut_10_0 = var3.a(16, 10);
                            stackIn_12_0 = stackOut_10_0 ? 1 : 0;
                            break L5;
                          }
                        }
                        L6: {
                          L7: {
                            var4 = stackIn_12_0;
                            if (-7 == (var3.field_Q ^ -1)) {
                              break L7;
                            } else {
                              if ((var3.field_Q ^ -1) == -38) {
                                break L7;
                              } else {
                                L8: {
                                  if (wh.field_v[var3.field_Q]) {
                                    break L8;
                                  } else {
                                    L9: {
                                      if (!var3.field_s) {
                                        stackOut_17_0 = 16;
                                        stackIn_18_0 = stackOut_17_0;
                                        break L9;
                                      } else {
                                        stackOut_16_0 = 1;
                                        stackIn_18_0 = stackOut_16_0;
                                        break L9;
                                      }
                                    }
                                    var5 = stackIn_18_0;
                                    this.a(-var5 + this.field_gb, 0);
                                    if (var6 == 0) {
                                      break L6;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                this.a(this.field_gb - 8, 0);
                                if (var6 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          var4 = 1;
                          this.a(-100 + this.field_gb, 0);
                          break L6;
                        }
                        L10: {
                          if (var4 != 0) {
                            break L10;
                          } else {
                            this.c(var3, -128);
                            if (var6 == 0) {
                              break L3;
                            } else {
                              break L10;
                            }
                          }
                        }
                        L11: {
                          this.b(var3, 122);
                          this.d((byte) -82, wh.field_x[var3.field_Q]);
                          if (var3.a(false)) {
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        L12: {
                          this.a(114, (gf) null, var3);
                          if (th.field_d[var3.field_Q]) {
                            break L12;
                          } else {
                            this.field_n[var2].a(7769);
                            this.field_n[var2] = null;
                            break L12;
                          }
                        }
                        if (var3.h(40)) {
                          this.a(var3, 0);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var2++;
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var2 = -63 % ((44 - param0) / 57);
            break L1;
          }
          return;
        }
    }

    private final void o(int param0) {
        int var2 = 0;
        L0: {
          if ((lh.field_m >> this.field_q & 1) != 0) {
            break L0;
          } else {
            if (-1 <= (this.field_w ^ -1)) {
              break L0;
            } else {
              this.a(4, 251, (byte) -95);
              break L0;
            }
          }
        }
        L1: {
          if (0 == (gi.field_f >> this.field_q & 1)) {
            this.a(5, 250, (byte) -116);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (0 == (1 & fc.field_a >> this.field_q)) {
            this.a(6, 249, (byte) -99);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var2 = 125 / ((param0 - 82) / 34);
          if (-1 == (1 & bc.field_f >> this.field_q ^ -1)) {
            break L3;
          } else {
            if (0 != (nf.field_u >> this.field_q & 1)) {
              break L3;
            } else {
              if ((this.field_w ^ -1) < -1) {
                this.a(7, 248, (byte) -125);
                break L3;
              } else {
                break L3;
              }
            }
          }
        }
        L4: {
          if ((bc.field_f >> this.field_q & 1) == 0) {
            break L4;
          } else {
            if (0 != (1 & bg.field_k >> this.field_q)) {
              break L4;
            } else {
              if (this.field_w <= 0) {
                break L4;
              } else {
                this.a(8, 247, (byte) -90);
                break L4;
              }
            }
          }
        }
        L5: {
          if (-1 != (1 & cj.field_b >> this.field_q ^ -1)) {
            break L5;
          } else {
            if (0 >= this.field_w) {
              break L5;
            } else {
              this.a(9, 246, (byte) -99);
              break L5;
            }
          }
        }
        L6: {
          if (2 != this.field_q) {
            break L6;
          } else {
            if (this.field_w > 0) {
              this.a(10, 245, (byte) -123);
              break L6;
            } else {
              break L6;
            }
          }
        }
        L7: {
          if ((this.field_q ^ -1) != -6) {
            break L7;
          } else {
            if ((this.field_w ^ -1) >= -1) {
              break L7;
            } else {
              this.a(11, 244, (byte) -81);
              break L7;
            }
          }
        }
        L8: {
          if (8 != this.field_q) {
            break L8;
          } else {
            if (this.field_w > 0) {
              this.a(12, 243, (byte) -94);
              if (-3 == (hc.field_G ^ -1)) {
                this.a(14, 241, (byte) -112);
                break L8;
              } else {
                break L8;
              }
            } else {
              break L8;
            }
          }
        }
        L9: {
          if (0 != (dg.field_c >> this.field_q & 1)) {
            break L9;
          } else {
            L10: {
              if (2 < this.field_q) {
                break L10;
              } else {
                if (-1 > (this.field_w ^ -1)) {
                  this.a(13, 242, (byte) -96);
                  break L10;
                } else {
                  break L9;
                }
              }
            }
            break L9;
          }
        }
    }

    private final int j(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        if (param0 > 48) {
          L0: while (true) {
            L1: {
              if (this.field_n[var2] == null) {
                break L1;
              } else {
                var2++;
                if (var3 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            return var2;
          }
        } else {
          return 48;
        }
    }

    final bg j(byte param0) {
        if (0 < this.field_H) {
            if (!(this.field_W)) {
                return vg.a(true, this.field_f, this.field_x, 3, this.field_i, 65514, this.field_g, new int[]{this.field_H}, 21);
            }
        }
        if (param0 == -68) {
            return null;
        }
        return (bg) null;
    }

    private final void b(byte param0, int param1) {
        q.field_e.c(0, 0, 1907987);
        int var3 = -87 / ((-57 - param0) / 40);
        if (-1 >= (nd.field_M ^ -1)) {
            q.field_e.e(0, 0, nd.field_M);
        }
    }

    final void a(int param0, int param1) {
        L0: {
          if (param1 == 0) {
            break L0;
          } else {
            this.A(-84);
            break L0;
          }
        }
        L1: {
          if (-1 >= (this.field_fb ^ -1)) {
            break L1;
          } else {
            L2: {
              if (-1 < (this.field_q ^ -1)) {
                break L2;
              } else {
                if ((param0 ^ -1) > (this.field_gb ^ -1)) {
                  gi.field_f = gi.field_f | 1 << this.field_q;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              this.field_y = true;
              this.field_gb = param0;
              if (255 < this.field_gb) {
                this.field_gb = 255;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (this.field_gb >= 0) {
                break L4;
              } else {
                this.d(-6111);
                if (!DrPhlogistonSavesTheEarth.field_D) {
                  break L1;
                } else {
                  break L4;
                }
              }
            }
            this.field_r = oj.field_e[this.field_gb];
            break L1;
          }
        }
    }

    private final void F(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param0 <= -122) {
            break L0;
          } else {
            this.b(-24);
            break L0;
          }
        }
        L1: {
          if (this.field_eb) {
            L2: {
              this.field_M.j(0);
              this.field_u = 0;
              var2 = -this.field_s + this.field_J;
              if ((var2 ^ -1) < -301) {
                break L2;
              } else {
                L3: {
                  L4: {
                    this.field_c = this.field_c + (-0.5 + Math.random());
                    this.field_j = this.field_j + (-0.4 + Math.random());
                    if (this.field_k == null) {
                      this.field_k = new ck[10];
                      var3 = 0;
                      L5: while (true) {
                        if ((this.field_k.length ^ -1) >= (var3 ^ -1)) {
                          break L4;
                        } else {
                          this.field_k[var3] = new ck();
                          var3++;
                          if (var4 != 0) {
                            break L3;
                          } else {
                            if (var4 == 0) {
                              continue L5;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  var3 = 0;
                  break L3;
                }
                L6: while (true) {
                  L7: {
                    if (var3 >= this.field_k.length) {
                      break L7;
                    } else {
                      this.field_k[var3].a((int)this.field_D + hi.a(ri.field_e, 4, this.field_l), var2 / 4, 1049600, -104, 1, (int)this.field_N + hi.a(am.field_l, 4, this.field_l));
                      var3++;
                      if (var4 != 0) {
                        break L1;
                      } else {
                        if (var4 == 0) {
                          continue L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
            this.s(87);
            this.d((byte) 76);
            break L1;
          } else {
            break L1;
          }
        }
    }

    private final void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        L0: {
          L1: {
            var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            var2 = qe.field_a * 3 * pi.field_S[0].field_c / -150;
            var3 = (-fk.field_m.field_h + 640) / 2;
            var4 = -(fk.field_m.field_h / 2) + 120;
            if (qe.field_a > -25) {
              break L1;
            } else {
              fk.field_m.a(var3, var4);
              if (var6 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var5_int = -(qe.field_a * 10);
          var4 = var4 - (255 + -var5_int) / 2;
          fk.field_m.a(var3, var4, var5_int);
          break L0;
        }
        wj.f(var3 + 94, 101 + var4, var3 - -116, var4 + 131);
        var5_int = 0;
        L2: while (true) {
          L3: {
            L4: {
              if (var5_int > 3) {
                break L4;
              } else {
                pi.field_S[var5_int].e(var3 + 94, -var2 + (48 + (var4 + 53 - pi.field_S[0].field_c * -var5_int)));
                var5_int++;
                if (var6 != 0) {
                  break L3;
                } else {
                  if (var6 == 0) {
                    continue L2;
                  } else {
                    break L4;
                  }
                }
              }
            }
            wj.a();
            cb.field_b.b(a.field_f, 320, 45 + var4, 16777215, 0);
            break L3;
          }
          if (param0) {
            var5 = uf.field_d + (this.field_q / 3 - -1) + "-" + (this.field_q % 3 - -1);
            cb.field_b.b(var5, 320, cb.field_b.field_E + (var4 + 45), 16777215, 0);
            return;
          } else {
            return;
          }
        }
    }

    private final void z(int param0) {
        bf discarded$78 = null;
        bf discarded$79 = null;
        bf discarded$80 = null;
        bf discarded$81 = null;
        bf discarded$82 = null;
        bf discarded$83 = null;
        bf discarded$84 = null;
        bf discarded$85 = null;
        bf discarded$86 = null;
        bf discarded$87 = null;
        bf discarded$88 = null;
        bf discarded$89 = null;
        bf discarded$90 = null;
        bf discarded$91 = null;
        bf discarded$92 = null;
        bf discarded$93 = null;
        bf discarded$94 = null;
        bf discarded$95 = null;
        bf discarded$96 = null;
        bf discarded$97 = null;
        bf discarded$98 = null;
        bf discarded$99 = null;
        bf discarded$100 = null;
        bf discarded$101 = null;
        bf discarded$102 = null;
        bf discarded$103 = null;
        bf discarded$104 = null;
        bf discarded$105 = null;
        bf discarded$106 = null;
        bf discarded$107 = null;
        bf discarded$108 = null;
        bf discarded$109 = null;
        bf discarded$110 = null;
        bf discarded$111 = null;
        bf discarded$112 = null;
        bf discarded$113 = null;
        bf discarded$114 = null;
        bf discarded$115 = null;
        bf discarded$116 = null;
        bf discarded$117 = null;
        bf discarded$118 = null;
        bf discarded$119 = null;
        bf discarded$120 = null;
        bf discarded$121 = null;
        bf discarded$122 = null;
        bf discarded$123 = null;
        bf discarded$124 = null;
        bf discarded$125 = null;
        bf discarded$126 = null;
        bf discarded$127 = null;
        bf discarded$128 = null;
        bf discarded$129 = null;
        bf discarded$130 = null;
        bf discarded$131 = null;
        bf discarded$132 = null;
        bf discarded$133 = null;
        bf discarded$134 = null;
        bf discarded$135 = null;
        bf discarded$136 = null;
        bf discarded$137 = null;
        bf discarded$138 = null;
        bf discarded$139 = null;
        bf discarded$140 = null;
        bf discarded$141 = null;
        bf discarded$142 = null;
        bf discarded$143 = null;
        bf discarded$144 = null;
        bf discarded$145 = null;
        bf discarded$146 = null;
        bf discarded$147 = null;
        bf discarded$148 = null;
        bf discarded$149 = null;
        bf discarded$150 = null;
        bf discarded$151 = null;
        bf discarded$152 = null;
        bf discarded$153 = null;
        bf discarded$154 = null;
        bf discarded$155 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        boolean stackOut_14_0 = false;
        int stackOut_16_0 = 0;
        Object stackOut_18_0 = null;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        L0: {
          var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (!ck.field_f[98]) {
            break L0;
          } else {
            si.field_C[0] = true;
            this.field_j = this.field_j - 0.5;
            break L0;
          }
        }
        L1: {
          if (!ck.field_f[99]) {
            break L1;
          } else {
            this.field_j = this.field_j + 0.5;
            si.field_C[1] = true;
            break L1;
          }
        }
        L2: {
          if (ck.field_f[96]) {
            this.field_c = this.field_c - 0.5;
            si.field_C[2] = true;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (ck.field_f[97]) {
            this.field_c = this.field_c + 0.5;
            si.field_C[3] = true;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (!ck.field_f[81]) {
            break L4;
          } else {
            if (this.field_O) {
              pa.field_c = this.field_J;
              ah.field_J = ib.field_t;
              L5: while (true) {
                ib.field_t = (ib.field_t - -1) % 4;
                stackOut_14_0 = nc.field_J[this.field_q][ib.field_t];
                stackIn_15_0 = stackOut_14_0 ? 1 : 0;
                L6: while (true) {
                  if (stackIn_15_0 == 0) {
                    continue L5;
                  } else {
                    stackOut_16_0 = 1;
                    stackIn_15_0 = stackOut_16_0;
                    stackIn_17_0 = stackOut_16_0;
                    if (var3 != 0) {
                      continue L6;
                    } else {
                      s.field_e = stackIn_17_0 != 0;
                      break L4;
                    }
                  }
                }
              }
            } else {
              break L4;
            }
          }
        }
        L7: {
          stackOut_18_0 = this;
          stackIn_20_0 = stackOut_18_0;
          stackIn_19_0 = stackOut_18_0;
          if (ck.field_f[81]) {
            stackOut_20_0 = this;
            stackOut_20_1 = 0;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            break L7;
          } else {
            stackOut_19_0 = this;
            stackOut_19_1 = 1;
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            break L7;
          }
        }
        ((j) (this)).field_O = stackIn_21_1 != 0;
        if (param0 == 215) {
          L8: {
            L9: {
              if (!ck.field_f[em.field_e]) {
                break L9;
              } else {
                if (0 == ib.field_t) {
                  break L9;
                } else {
                  L10: {
                    L11: {
                      if (nc.field_J[this.field_q][0]) {
                        break L11;
                      } else {
                        this.field_Z = 50;
                        if (var3 == 0) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    pa.field_c = this.field_J;
                    ah.field_J = ib.field_t;
                    ib.field_t = 0;
                    break L10;
                  }
                  s.field_e = true;
                  if (var3 == 0) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
            }
            L12: {
              L13: {
                if (!ck.field_f[lb.field_A]) {
                  break L13;
                } else {
                  if (ib.field_t != 1) {
                    break L12;
                  } else {
                    break L13;
                  }
                }
              }
              L14: {
                L15: {
                  if (!ck.field_f[vd.field_f]) {
                    break L15;
                  } else {
                    if (2 != ib.field_t) {
                      break L14;
                    } else {
                      break L15;
                    }
                  }
                }
                if (!ck.field_f[lf.field_c]) {
                  break L8;
                } else {
                  if (-4 == (ib.field_t ^ -1)) {
                    break L8;
                  } else {
                    L16: {
                      L17: {
                        if (!nc.field_J[this.field_q][3]) {
                          break L17;
                        } else {
                          pa.field_c = this.field_J;
                          ah.field_J = ib.field_t;
                          ib.field_t = 3;
                          if (var3 == 0) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      this.field_Z = 50;
                      break L16;
                    }
                    s.field_e = true;
                    if (var3 == 0) {
                      break L8;
                    } else {
                      break L14;
                    }
                  }
                }
              }
              L18: {
                L19: {
                  if (nc.field_J[this.field_q][2]) {
                    break L19;
                  } else {
                    this.field_Z = 50;
                    if (var3 == 0) {
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                pa.field_c = this.field_J;
                ah.field_J = ib.field_t;
                ib.field_t = 2;
                break L18;
              }
              s.field_e = true;
              if (var3 == 0) {
                break L8;
              } else {
                break L12;
              }
            }
            L20: {
              L21: {
                if (!nc.field_J[this.field_q][1]) {
                  break L21;
                } else {
                  pa.field_c = this.field_J;
                  ah.field_J = ib.field_t;
                  ib.field_t = 1;
                  if (var3 == 0) {
                    break L20;
                  } else {
                    break L21;
                  }
                }
              }
              this.field_Z = 50;
              break L20;
            }
            s.field_e = true;
            break L8;
          }
          L22: {
            L23: {
              if (ck.field_f[83]) {
                break L23;
              } else {
                if (!ck.field_f[84]) {
                  break L22;
                } else {
                  break L23;
                }
              }
            }
            if (-1 != (this.field_S ^ -1)) {
              break L22;
            } else {
              if ((this.field_J ^ -1) > (this.field_b ^ -1)) {
                break L22;
              } else {
                if (0 < gm.field_J) {
                  break L22;
                } else {
                  L24: {
                    if ((ib.field_t ^ -1) == -4) {
                      ol.field_d = true;
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  this.field_S = this.field_A;
                  lg.field_g = true;
                  break L22;
                }
              }
            }
          }
          L25: {
            L26: {
              L27: {
                L28: {
                  if (ck.field_f[82]) {
                    break L28;
                  } else {
                    if (!ck.field_f[nj.field_a]) {
                      break L27;
                    } else {
                      break L28;
                    }
                  }
                }
                if (this.n(param0 ^ 176)) {
                  break L26;
                } else {
                  break L27;
                }
              }
              L29: {
                if ((this.field_u ^ -1) >= -51) {
                  break L29;
                } else {
                  this.a(23, (byte) 113);
                  this.field_E = 0;
                  nb.field_d = true;
                  this.field_u = 0;
                  if (var3 == 0) {
                    break L25;
                  } else {
                    break L29;
                  }
                }
              }
              this.field_u = 0;
              if (var3 == 0) {
                break L25;
              } else {
                break L26;
              }
            }
            L30: {
              if (this.field_u == 0) {
                od.a(-1630758008, this.field_M);
                break L30;
              } else {
                break L30;
              }
            }
            L31: {
              this.field_M.h(this.field_u + 196);
              this.field_M.j((int)((25.0 + (double)this.field_u / 2.0) * (double)dg.field_e / 80.0));
              this.field_u = this.field_u + 1;
              if (this.field_u > 200) {
                this.field_u = 200;
                this.field_E = this.field_E + 1;
                var2 = (int)(Math.exp((double)(-this.field_E) / 100.0) * 125.0);
                this.field_M.j(dg.field_e * var2 / 80);
                break L31;
              } else {
                break L31;
              }
            }
            if ((this.field_u ^ -1) >= -51) {
              break L25;
            } else {
              ni.field_w = true;
              break L25;
            }
          }
          L32: {
            if (0 != this.field_u) {
              break L32;
            } else {
              gi.a(this.field_M, 3408);
              this.field_M.i(-1);
              break L32;
            }
          }
          L33: {
            if ((nj.field_j ^ -1) <= -3) {
              L34: {
                if (this.field_W) {
                  break L34;
                } else {
                  this.field_W = ck.field_f[12];
                  if (var3 == 0) {
                    break L33;
                  } else {
                    break L34;
                  }
                }
              }
              L35: {
                if (!ck.field_f[11]) {
                  break L35;
                } else {
                  L36: {
                    if (ck.field_f[25]) {
                      k.a(0, 1);
                      break L36;
                    } else {
                      break L36;
                    }
                  }
                  L37: {
                    if (!ck.field_f[16]) {
                      break L37;
                    } else {
                      k.a(0, 2);
                      break L37;
                    }
                  }
                  L38: {
                    if (ck.field_f[17]) {
                      k.a(param0 ^ 215, 4);
                      break L38;
                    } else {
                      break L38;
                    }
                  }
                  L39: {
                    if (!ck.field_f[18]) {
                      break L39;
                    } else {
                      k.a(0, 8);
                      break L39;
                    }
                  }
                  L40: {
                    if (ck.field_f[19]) {
                      k.a(0, 16);
                      break L40;
                    } else {
                      break L40;
                    }
                  }
                  L41: {
                    if (ck.field_f[20]) {
                      k.a(param0 + -215, 32);
                      break L41;
                    } else {
                      break L41;
                    }
                  }
                  L42: {
                    if (ck.field_f[21]) {
                      k.a(param0 + -215, 50);
                      break L42;
                    } else {
                      break L42;
                    }
                  }
                  if (ck.field_f[22]) {
                    k.a(0, 100);
                    break L35;
                  } else {
                    break L35;
                  }
                }
              }
              L43: {
                if (!ck.field_f[10]) {
                  break L43;
                } else {
                  this.field_W = true;
                  this.d((byte) -53, 1234567);
                  break L43;
                }
              }
              L44: {
                if (!ck.field_f[88]) {
                  break L44;
                } else {
                  this.field_W = true;
                  this.d((byte) -87, -this.field_H);
                  break L44;
                }
              }
              L45: {
                if (!ck.field_f[103]) {
                  break L45;
                } else {
                  this.field_W = true;
                  this.field_w = 0;
                  this.d(-6111);
                  break L45;
                }
              }
              L46: {
                L47: {
                  if (!ck.field_f[85]) {
                    break L47;
                  } else {
                    this.field_W = true;
                    var2 = 0;
                    L48: while (true) {
                      if (var2 >= this.field_n.length) {
                        break L47;
                      } else {
                        if (var3 != 0) {
                          break L46;
                        } else {
                          L49: {
                            if (null != this.field_n[var2]) {
                              this.field_n[var2].a(7769);
                              break L49;
                            } else {
                              break L49;
                            }
                          }
                          this.field_n[var2] = null;
                          var2++;
                          if (var3 == 0) {
                            continue L48;
                          } else {
                            break L47;
                          }
                        }
                      }
                    }
                  }
                }
                if (!ck.field_f[27]) {
                  break L46;
                } else {
                  this.field_F = true;
                  this.field_W = true;
                  break L46;
                }
              }
              L50: {
                if (0 == (this.field_J & 15)) {
                  L51: {
                    if (ck.field_f[90]) {
                      this.field_W = true;
                      this.a(119, (double)hi.a(430, 4, this.field_l), 640.0, false, false);
                      break L51;
                    } else {
                      break L51;
                    }
                  }
                  L52: {
                    if (ck.field_f[89]) {
                      this.field_W = true;
                      discarded$78 = this.a(hi.a(430, 4, this.field_l), false, hi.a(77, 4, this.field_l), 640, 0, true);
                      break L52;
                    } else {
                      break L52;
                    }
                  }
                  L53: {
                    if (!ck.field_f[80]) {
                      break L53;
                    } else {
                      if (!ck.field_f[86]) {
                        break L53;
                      } else {
                        L54: {
                          this.field_W = true;
                          if (ck.field_f[16]) {
                            this.a(0, 255, (byte) -105);
                            break L54;
                          } else {
                            break L54;
                          }
                        }
                        L55: {
                          if (!ck.field_f[17]) {
                            break L55;
                          } else {
                            this.a(1, 254, (byte) -118);
                            break L55;
                          }
                        }
                        L56: {
                          if (ck.field_f[18]) {
                            this.a(2, 253, (byte) -81);
                            break L56;
                          } else {
                            break L56;
                          }
                        }
                        L57: {
                          if (ck.field_f[19]) {
                            this.a(3, 252, (byte) -77);
                            break L57;
                          } else {
                            break L57;
                          }
                        }
                        L58: {
                          if (ck.field_f[20]) {
                            this.a(4, 251, (byte) -83);
                            break L58;
                          } else {
                            break L58;
                          }
                        }
                        L59: {
                          if (ck.field_f[21]) {
                            this.a(5, 250, (byte) -107);
                            break L59;
                          } else {
                            break L59;
                          }
                        }
                        L60: {
                          if (ck.field_f[22]) {
                            this.a(6, 249, (byte) -121);
                            break L60;
                          } else {
                            break L60;
                          }
                        }
                        L61: {
                          if (ck.field_f[23]) {
                            this.a(7, 248, (byte) -105);
                            break L61;
                          } else {
                            break L61;
                          }
                        }
                        L62: {
                          if (ck.field_f[24]) {
                            this.a(8, 247, (byte) -90);
                            break L62;
                          } else {
                            break L62;
                          }
                        }
                        L63: {
                          if (ck.field_f[25]) {
                            this.a(9, 246, (byte) -92);
                            break L63;
                          } else {
                            break L63;
                          }
                        }
                        L64: {
                          if (!ck.field_f[32]) {
                            break L64;
                          } else {
                            this.a(10, 245, (byte) -105);
                            break L64;
                          }
                        }
                        L65: {
                          if (ck.field_f[33]) {
                            this.a(11, 244, (byte) -80);
                            break L65;
                          } else {
                            break L65;
                          }
                        }
                        L66: {
                          if (ck.field_f[34]) {
                            this.a(12, 243, (byte) -107);
                            break L66;
                          } else {
                            break L66;
                          }
                        }
                        if (ck.field_f[35]) {
                          this.a(13, 242, (byte) -96);
                          if (var3 == 0) {
                            break L50;
                          } else {
                            break L53;
                          }
                        } else {
                          break L50;
                        }
                      }
                    }
                  }
                  L67: {
                    if (!ck.field_f[80]) {
                      break L67;
                    } else {
                      if (ck.field_f[86]) {
                        break L67;
                      } else {
                        L68: {
                          this.field_W = true;
                          if (ck.field_f[16]) {
                            this.field_d[this.f(0)] = new ib(640.0, 215.0, 1, false, false);
                            break L68;
                          } else {
                            break L68;
                          }
                        }
                        L69: {
                          if (ck.field_f[17]) {
                            this.field_d[this.f(0)] = new ib(640.0, 215.0, 2, false, false);
                            break L69;
                          } else {
                            break L69;
                          }
                        }
                        L70: {
                          if (!ck.field_f[18]) {
                            break L70;
                          } else {
                            this.field_d[this.f(qk.a(param0, 215))] = new ib(640.0, 215.0, 3, false, false);
                            break L70;
                          }
                        }
                        L71: {
                          if (ck.field_f[19]) {
                            this.field_d[this.f(0)] = new ib(640.0, 215.0, 4, false, false);
                            break L71;
                          } else {
                            break L71;
                          }
                        }
                        L72: {
                          if (ck.field_f[20]) {
                            this.field_d[this.f(0)] = new ib(640.0, 215.0, 5, false, false);
                            break L72;
                          } else {
                            break L72;
                          }
                        }
                        L73: {
                          if (ck.field_f[21]) {
                            this.field_d[this.f(qk.a(param0, 215))] = new ib(640.0, 215.0, 6, false, false);
                            break L73;
                          } else {
                            break L73;
                          }
                        }
                        if (ck.field_f[22]) {
                          this.field_d[this.f(0)] = new ib(640.0, 215.0, 7, false, false);
                          if (var3 == 0) {
                            break L50;
                          } else {
                            break L67;
                          }
                        } else {
                          break L50;
                        }
                      }
                    }
                  }
                  if (!ck.field_f[86]) {
                    break L50;
                  } else {
                    if (ck.field_f[80]) {
                      break L50;
                    } else {
                      L74: {
                        this.field_W = true;
                        if (ck.field_f[102]) {
                          break L74;
                        } else {
                          L75: {
                            if (!ck.field_f[16]) {
                              break L75;
                            } else {
                              discarded$79 = this.a(250, true, 0, 640, 0, true);
                              break L75;
                            }
                          }
                          L76: {
                            if (ck.field_f[17]) {
                              discarded$80 = this.a(215, true, 1, 640, 0, true);
                              break L76;
                            } else {
                              break L76;
                            }
                          }
                          L77: {
                            if (ck.field_f[18]) {
                              discarded$81 = this.a(215, true, 2, 640, 0, true);
                              break L77;
                            } else {
                              break L77;
                            }
                          }
                          L78: {
                            if (!ck.field_f[19]) {
                              break L78;
                            } else {
                              discarded$82 = this.a(215, true, 3, 640, 0, true);
                              break L78;
                            }
                          }
                          L79: {
                            if (!ck.field_f[20]) {
                              break L79;
                            } else {
                              discarded$83 = this.a(215, true, 4, 640, 0, true);
                              break L79;
                            }
                          }
                          L80: {
                            if (!ck.field_f[21]) {
                              break L80;
                            } else {
                              discarded$84 = this.a(215, true, 5, 640, 0, true);
                              break L80;
                            }
                          }
                          L81: {
                            if (!ck.field_f[22]) {
                              break L81;
                            } else {
                              discarded$85 = this.a(215, true, 6, 640, 0, true);
                              break L81;
                            }
                          }
                          L82: {
                            if (ck.field_f[23]) {
                              discarded$86 = this.a(215, true, 7, 640, 0, true);
                              break L82;
                            } else {
                              break L82;
                            }
                          }
                          L83: {
                            if (ck.field_f[24]) {
                              discarded$87 = this.a(215, true, 8, 640, 0, true);
                              break L83;
                            } else {
                              break L83;
                            }
                          }
                          L84: {
                            if (!ck.field_f[25]) {
                              break L84;
                            } else {
                              discarded$88 = this.a(215, true, 9, 640, 0, true);
                              break L84;
                            }
                          }
                          L85: {
                            if (!ck.field_f[26]) {
                              break L85;
                            } else {
                              discarded$89 = this.a(215, true, 10, 640, 0, true);
                              break L85;
                            }
                          }
                          L86: {
                            if (ck.field_f[27]) {
                              discarded$90 = this.a(215, true, 11, 640, 0, true);
                              break L86;
                            } else {
                              break L86;
                            }
                          }
                          L87: {
                            if (ck.field_f[32]) {
                              discarded$91 = this.a(215, true, 12, 640, 0, true);
                              break L87;
                            } else {
                              break L87;
                            }
                          }
                          L88: {
                            if (!ck.field_f[33]) {
                              break L88;
                            } else {
                              discarded$92 = this.a(215, true, 13, 640, 0, true);
                              break L88;
                            }
                          }
                          L89: {
                            if (!ck.field_f[34]) {
                              break L89;
                            } else {
                              discarded$93 = this.a(215, true, 14, 640, 0, true);
                              break L89;
                            }
                          }
                          L90: {
                            if (ck.field_f[35]) {
                              discarded$94 = this.a(215, true, 15, 640, 0, true);
                              break L90;
                            } else {
                              break L90;
                            }
                          }
                          L91: {
                            if (!ck.field_f[36]) {
                              break L91;
                            } else {
                              discarded$95 = this.a(215, true, 16, 640, 0, true);
                              break L91;
                            }
                          }
                          L92: {
                            if (!ck.field_f[37]) {
                              break L92;
                            } else {
                              discarded$96 = this.a(215, true, 17, 640, 0, true);
                              break L92;
                            }
                          }
                          L93: {
                            if (ck.field_f[38]) {
                              discarded$97 = this.a(215, true, 18, 640, 0, true);
                              break L93;
                            } else {
                              break L93;
                            }
                          }
                          L94: {
                            if (!ck.field_f[39]) {
                              break L94;
                            } else {
                              discarded$98 = this.a(215, true, 19, 640, 0, true);
                              break L94;
                            }
                          }
                          L95: {
                            if (ck.field_f[40]) {
                              discarded$99 = this.a(215, true, 20, 640, 0, true);
                              break L95;
                            } else {
                              break L95;
                            }
                          }
                          L96: {
                            if (!ck.field_f[41]) {
                              break L96;
                            } else {
                              discarded$100 = this.a(215, true, 21, 640, 0, true);
                              break L96;
                            }
                          }
                          L97: {
                            if (ck.field_f[42]) {
                              discarded$101 = this.a(215, true, 22, 640, 0, true);
                              break L97;
                            } else {
                              break L97;
                            }
                          }
                          L98: {
                            if (!ck.field_f[43]) {
                              break L98;
                            } else {
                              discarded$102 = this.a(215, true, 23, 640, 0, true);
                              break L98;
                            }
                          }
                          L99: {
                            if (!ck.field_f[48]) {
                              break L99;
                            } else {
                              discarded$103 = this.a(215, true, 24, 640, 0, true);
                              break L99;
                            }
                          }
                          L100: {
                            if (ck.field_f[49]) {
                              discarded$104 = this.a(215, true, 25, 640, 0, true);
                              break L100;
                            } else {
                              break L100;
                            }
                          }
                          L101: {
                            if (!ck.field_f[50]) {
                              break L101;
                            } else {
                              discarded$105 = this.a(215, true, 26, 640, 0, true);
                              break L101;
                            }
                          }
                          L102: {
                            if (!ck.field_f[51]) {
                              break L102;
                            } else {
                              discarded$106 = this.a(215, true, 27, 640, 0, true);
                              break L102;
                            }
                          }
                          L103: {
                            if (!ck.field_f[52]) {
                              break L103;
                            } else {
                              discarded$107 = this.a(215, true, 28, 640, 0, true);
                              break L103;
                            }
                          }
                          L104: {
                            if (!ck.field_f[53]) {
                              break L104;
                            } else {
                              discarded$108 = this.a(215, true, 29, 640, 0, true);
                              break L104;
                            }
                          }
                          L105: {
                            if (ck.field_f[54]) {
                              discarded$109 = this.a(215, true, 30, 640, 0, true);
                              break L105;
                            } else {
                              break L105;
                            }
                          }
                          L106: {
                            if (ck.field_f[55]) {
                              discarded$110 = this.a(215, true, 31, 640, 0, true);
                              break L106;
                            } else {
                              break L106;
                            }
                          }
                          L107: {
                            if (!ck.field_f[56]) {
                              break L107;
                            } else {
                              discarded$111 = this.a(215, true, 32, 640, 0, true);
                              break L107;
                            }
                          }
                          L108: {
                            if (ck.field_f[57]) {
                              discarded$112 = this.a(215, true, 33, 640, 0, true);
                              break L108;
                            } else {
                              break L108;
                            }
                          }
                          L109: {
                            if (ck.field_f[58]) {
                              discarded$113 = this.a(215, true, 34, 640, 0, true);
                              break L109;
                            } else {
                              break L109;
                            }
                          }
                          L110: {
                            if (!ck.field_f[59]) {
                              break L110;
                            } else {
                              discarded$114 = this.a(215, true, 35, 640, 0, true);
                              break L110;
                            }
                          }
                          L111: {
                            if (!ck.field_f[74]) {
                              break L111;
                            } else {
                              discarded$115 = this.a(215, true, 36, 640, 0, true);
                              break L111;
                            }
                          }
                          L112: {
                            if (!ck.field_f[64]) {
                              break L112;
                            } else {
                              discarded$116 = this.a(215, true, 37, 640, 0, true);
                              break L112;
                            }
                          }
                          L113: {
                            if (!ck.field_f[65]) {
                              break L113;
                            } else {
                              discarded$117 = this.a(215, true, 38, 640, 0, true);
                              break L113;
                            }
                          }
                          L114: {
                            if (!ck.field_f[66]) {
                              break L114;
                            } else {
                              discarded$118 = this.a(215, true, 39, 640, 0, true);
                              break L114;
                            }
                          }
                          L115: {
                            if (!ck.field_f[67]) {
                              break L115;
                            } else {
                              discarded$119 = this.a(215, true, 40, 640, 0, true);
                              break L115;
                            }
                          }
                          L116: {
                            if (ck.field_f[68]) {
                              discarded$120 = this.a(215, true, 41, 640, 0, true);
                              break L116;
                            } else {
                              break L116;
                            }
                          }
                          L117: {
                            if (!ck.field_f[69]) {
                              break L117;
                            } else {
                              discarded$121 = this.a(215, true, 42, 640, 0, true);
                              break L117;
                            }
                          }
                          L118: {
                            if (ck.field_f[70]) {
                              discarded$122 = this.a(250, true, 43, 640, 0, true);
                              break L118;
                            } else {
                              break L118;
                            }
                          }
                          L119: {
                            if (!ck.field_f[71]) {
                              break L119;
                            } else {
                              discarded$123 = this.a(250, true, 44, 640, 0, true);
                              break L119;
                            }
                          }
                          L120: {
                            if (!ck.field_f[72]) {
                              break L120;
                            } else {
                              discarded$124 = this.a(250, true, 45, 640, 0, true);
                              break L120;
                            }
                          }
                          if (!ck.field_f[73]) {
                            break L50;
                          } else {
                            discarded$125 = this.a(250, true, 46, 640, 0, true);
                            if (var3 == 0) {
                              break L50;
                            } else {
                              break L74;
                            }
                          }
                        }
                      }
                      L121: {
                        if (ck.field_f[16]) {
                          discarded$126 = this.a(250, true, 47, -90, 0, true);
                          break L121;
                        } else {
                          break L121;
                        }
                      }
                      L122: {
                        if (!ck.field_f[17]) {
                          break L122;
                        } else {
                          discarded$127 = this.a(215, true, 48, 640, 0, true);
                          break L122;
                        }
                      }
                      L123: {
                        if (!ck.field_f[18]) {
                          break L123;
                        } else {
                          discarded$128 = this.a(215, true, 49, 640, 0, true);
                          break L123;
                        }
                      }
                      L124: {
                        if (!ck.field_f[19]) {
                          break L124;
                        } else {
                          discarded$129 = this.a(215, true, 50, 640, 0, true);
                          break L124;
                        }
                      }
                      L125: {
                        if (!ck.field_f[20]) {
                          break L125;
                        } else {
                          discarded$130 = this.a(215, true, 51, 640, 0, true);
                          break L125;
                        }
                      }
                      L126: {
                        if (ck.field_f[21]) {
                          discarded$131 = this.a(215, true, 52, 640, 0, true);
                          break L126;
                        } else {
                          break L126;
                        }
                      }
                      L127: {
                        if (!ck.field_f[22]) {
                          break L127;
                        } else {
                          discarded$132 = this.a(215, true, 53, 640, 0, true);
                          break L127;
                        }
                      }
                      L128: {
                        if (!ck.field_f[23]) {
                          break L128;
                        } else {
                          discarded$133 = this.a(215, true, 54, 640, 0, true);
                          break L128;
                        }
                      }
                      L129: {
                        if (ck.field_f[24]) {
                          discarded$134 = this.a(215, true, 55, 640, 0, true);
                          break L129;
                        } else {
                          break L129;
                        }
                      }
                      L130: {
                        if (!ck.field_f[25]) {
                          break L130;
                        } else {
                          discarded$135 = this.a(215, true, 56, 640, 0, true);
                          break L130;
                        }
                      }
                      L131: {
                        if (!ck.field_f[26]) {
                          break L131;
                        } else {
                          discarded$136 = this.a(215, true, 57, 640, 0, true);
                          break L131;
                        }
                      }
                      L132: {
                        if (!ck.field_f[27]) {
                          break L132;
                        } else {
                          discarded$137 = this.a(215, true, 58, 640, 0, true);
                          break L132;
                        }
                      }
                      L133: {
                        if (!ck.field_f[32]) {
                          break L133;
                        } else {
                          discarded$138 = this.a(215, true, 59, 640, 0, true);
                          break L133;
                        }
                      }
                      L134: {
                        if (ck.field_f[33]) {
                          discarded$139 = this.a(215, true, 60, 640, 0, true);
                          break L134;
                        } else {
                          break L134;
                        }
                      }
                      L135: {
                        if (ck.field_f[34]) {
                          discarded$140 = this.a(215, true, 61, 640, 0, true);
                          break L135;
                        } else {
                          break L135;
                        }
                      }
                      L136: {
                        if (!ck.field_f[35]) {
                          break L136;
                        } else {
                          discarded$141 = this.a(215, true, 62, 640, 0, true);
                          break L136;
                        }
                      }
                      L137: {
                        if (!ck.field_f[36]) {
                          break L137;
                        } else {
                          discarded$142 = this.a(215, true, 63, 640, 0, true);
                          break L137;
                        }
                      }
                      L138: {
                        if (!ck.field_f[37]) {
                          break L138;
                        } else {
                          discarded$143 = this.a(215, true, 64, 640, 0, true);
                          break L138;
                        }
                      }
                      L139: {
                        if (!ck.field_f[38]) {
                          break L139;
                        } else {
                          discarded$144 = this.a(215, true, 65, 640, 0, true);
                          break L139;
                        }
                      }
                      L140: {
                        if (!ck.field_f[39]) {
                          break L140;
                        } else {
                          discarded$145 = this.a(215, true, 66, 640, 0, true);
                          break L140;
                        }
                      }
                      L141: {
                        if (!ck.field_f[40]) {
                          break L141;
                        } else {
                          discarded$146 = this.a(215, true, 67, 640, 0, true);
                          break L141;
                        }
                      }
                      L142: {
                        if (!ck.field_f[41]) {
                          break L142;
                        } else {
                          discarded$147 = this.a(215, true, 68, 640, 0, true);
                          break L142;
                        }
                      }
                      L143: {
                        if (!ck.field_f[42]) {
                          break L143;
                        } else {
                          discarded$148 = this.a(215, true, 69, 640, 0, true);
                          break L143;
                        }
                      }
                      L144: {
                        if (!ck.field_f[43]) {
                          break L144;
                        } else {
                          discarded$149 = this.a(215, true, 70, 640, 0, true);
                          break L144;
                        }
                      }
                      L145: {
                        if (!ck.field_f[48]) {
                          break L145;
                        } else {
                          discarded$150 = this.a(215, true, 71, 640, 0, true);
                          break L145;
                        }
                      }
                      L146: {
                        if (!ck.field_f[49]) {
                          break L146;
                        } else {
                          discarded$151 = this.a(215, true, 72, 640, 0, true);
                          break L146;
                        }
                      }
                      L147: {
                        if (ck.field_f[50]) {
                          discarded$152 = this.a(215, true, 73, 640, 0, true);
                          break L147;
                        } else {
                          break L147;
                        }
                      }
                      L148: {
                        if (ck.field_f[51]) {
                          discarded$153 = this.a(215, true, 74, 640, 0, true);
                          break L148;
                        } else {
                          break L148;
                        }
                      }
                      L149: {
                        if (!ck.field_f[52]) {
                          break L149;
                        } else {
                          discarded$154 = this.a(215, true, 75, 640, 0, true);
                          break L149;
                        }
                      }
                      if (!ck.field_f[53]) {
                        break L50;
                      } else {
                        discarded$155 = this.a(215, true, 76, 640, 0, true);
                        break L50;
                      }
                    }
                  }
                } else {
                  break L50;
                }
              }
              L150: {
                if (!ck.field_f[87]) {
                  break L150;
                } else {
                  this.field_ab = true;
                  this.field_W = true;
                  this.H(1);
                  break L150;
                }
              }
              L151: {
                if (!ck.field_f[2]) {
                  break L151;
                } else {
                  this.field_ab = true;
                  this.field_q = 0;
                  this.field_W = true;
                  this.H(1);
                  break L151;
                }
              }
              L152: {
                if (!ck.field_f[3]) {
                  break L152;
                } else {
                  this.field_W = true;
                  this.field_q = 1;
                  this.field_ab = true;
                  this.H(1);
                  break L152;
                }
              }
              L153: {
                if (!ck.field_f[4]) {
                  break L153;
                } else {
                  this.field_ab = true;
                  this.field_W = true;
                  this.field_q = 2;
                  this.H(1);
                  break L153;
                }
              }
              L154: {
                if (ck.field_f[5]) {
                  this.field_q = 3;
                  this.field_ab = true;
                  this.field_W = true;
                  this.H(1);
                  break L154;
                } else {
                  break L154;
                }
              }
              L155: {
                if (ck.field_f[6]) {
                  this.field_ab = true;
                  this.field_q = 4;
                  this.field_W = true;
                  this.H(param0 ^ 214);
                  break L155;
                } else {
                  break L155;
                }
              }
              L156: {
                if (ck.field_f[7]) {
                  this.field_ab = true;
                  this.field_W = true;
                  this.field_q = 5;
                  this.H(1);
                  break L156;
                } else {
                  break L156;
                }
              }
              L157: {
                if (ck.field_f[8]) {
                  this.field_ab = true;
                  this.field_q = 6;
                  this.field_W = true;
                  this.H(param0 ^ 214);
                  break L157;
                } else {
                  break L157;
                }
              }
              if (!ck.field_f[9]) {
                break L33;
              } else {
                this.field_W = true;
                this.field_q = 7;
                this.field_ab = true;
                this.H(1);
                break L33;
              }
            } else {
              break L33;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var5 = 97 % ((50 - param1) / 52);
        int var4 = this.m(1280);
        this.field_hb[var4] = new td(13, param2, param0, -1);
    }

    private final void i(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param0 == -1) {
            break L0;
          } else {
            this.v(-22);
            break L0;
          }
        }
        L1: {
          L2: {
            if ((this.field_q ^ -1) == -1) {
              break L2;
            } else {
              if (-4 != (this.field_q ^ -1)) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          var2 = 1;
          var3 = 0;
          L3: while (true) {
            L4: {
              L5: {
                if (si.field_C.length <= var3) {
                  break L5;
                } else {
                  var2 = var2 != 0 & si.field_C[var3] ? 1 : 0;
                  var3++;
                  if (var4 != 0) {
                    break L4;
                  } else {
                    if (var4 == 0) {
                      continue L3;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              if (el.field_tb != 0) {
                break L4;
              } else {
                if (var2 != 0) {
                  el.field_tb = el.field_tb + 1;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L6: {
              if (-2 != (el.field_tb ^ -1)) {
                break L6;
              } else {
                if (!lg.field_g) {
                  break L6;
                } else {
                  el.field_tb = el.field_tb + 1;
                  break L6;
                }
              }
            }
            L7: {
              if (2 != el.field_tb) {
                break L7;
              } else {
                if (s.field_e) {
                  el.field_tb = el.field_tb + 1;
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            L8: {
              if (el.field_tb != 3) {
                break L8;
              } else {
                if (!ni.field_w) {
                  break L8;
                } else {
                  el.field_tb = el.field_tb + 1;
                  break L8;
                }
              }
            }
            L9: {
              if (el.field_tb != 4) {
                break L9;
              } else {
                if (!nb.field_d) {
                  break L9;
                } else {
                  el.field_tb = el.field_tb + 1;
                  break L9;
                }
              }
            }
            L10: {
              if (5 != el.field_tb) {
                break L10;
              } else {
                if (ol.field_d) {
                  el.field_tb = el.field_tb + 1;
                  break L10;
                } else {
                  break L10;
                }
              }
            }
            L11: {
              L12: {
                if (5 != el.field_tb) {
                  break L12;
                } else {
                  if ((this.field_q ^ -1) != -1) {
                    break L12;
                  } else {
                    we.field_f = we.field_f + 1;
                    if (var4 == 0) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
              }
              L13: {
                L14: {
                  if (-7 != (el.field_tb ^ -1)) {
                    break L14;
                  } else {
                    if (-4 == (this.field_q ^ -1)) {
                      break L13;
                    } else {
                      break L14;
                    }
                  }
                }
                we.field_f = 0;
                if (var4 == 0) {
                  break L11;
                } else {
                  break L13;
                }
              }
              we.field_f = we.field_f + 1;
              break L1;
            }
            break L1;
          }
        }
    }

    private final void a(boolean param0) {
        int var2 = 0;
        gf var3_ref_gf = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_12_0 = null;
        gf stackIn_12_1 = null;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        Object stackIn_57_0 = null;
        gf stackIn_57_1 = null;
        Object stackOut_11_0 = null;
        gf stackOut_11_1 = null;
        Object stackOut_59_0 = null;
        gf stackOut_59_1 = null;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        L0: {
          var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if ((this.field_S ^ -1) >= -1) {
            break L0;
          } else {
            if (this.field_b <= this.field_J) {
              L1: {
                this.a(ib.field_t + 19, (byte) 34);
                if ((this.field_S ^ -1) < -1) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if ((ib.field_t ^ -1) == -3) {
                        break L3;
                      } else {
                        var2 = ni.field_v[ib.field_t];
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var2 = (int)((double)ni.field_v[ib.field_t] / Math.pow(1.25, (double)this.field_A));
                    break L2;
                  }
                  this.field_b = this.field_J - -var2;
                  if (var5 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              this.field_b = this.field_b + gg.field_i[ib.field_t];
              break L0;
            } else {
              break L0;
            }
          }
        }
        var2 = 0;
        L4: while (true) {
          L5: {
            L6: {
              if (-1401 >= (var2 ^ -1)) {
                break L6;
              } else {
                var3_ref_gf = this.field_m[var2];
                stackOut_11_0 = null;
                stackOut_11_1 = (gf) (var3_ref_gf);
                stackIn_57_0 = stackOut_11_0;
                stackIn_57_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (var5 != 0) {
                  L7: while (true) {
                    L8: {
                      if (stackIn_57_0 == stackIn_57_1) {
                        break L8;
                      } else {
                        if (this.field_v[var2].a((byte) -93)) {
                          this.field_v[var2] = null;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var2++;
                    if (var5 == 0) {
                      if (800 <= var2) {
                        break L5;
                      } else {
                        stackOut_59_0 = null;
                        stackOut_59_1 = this.field_v[var2];
                        stackIn_57_0 = stackOut_59_0;
                        stackIn_57_1 = stackOut_59_1;
                        continue L7;
                      }
                    } else {
                      break L5;
                    }
                  }
                } else {
                  L9: {
                    if (stackIn_12_0 == stackIn_12_1) {
                      break L9;
                    } else {
                      L10: {
                        L11: {
                          if (28 == var3_ref_gf.field_I) {
                            break L11;
                          } else {
                            L12: {
                              if (!var3_ref_gf.a(16510, this.field_D, 640.0)) {
                                stackOut_16_0 = 0;
                                stackIn_17_0 = stackOut_16_0;
                                break L12;
                              } else {
                                stackOut_15_0 = 1;
                                stackIn_17_0 = stackOut_15_0;
                                break L12;
                              }
                            }
                            var4 = stackIn_17_0;
                            if (var5 == 0) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        L13: {
                          if (!var3_ref_gf.a(var3_ref_gf.field_d, this.field_D + (double)ri.field_q, this.field_N + (double)am.field_p, var3_ref_gf.field_F, param0)) {
                            stackOut_20_0 = 0;
                            stackIn_21_0 = stackOut_20_0;
                            break L13;
                          } else {
                            stackOut_19_0 = 1;
                            stackIn_21_0 = stackOut_19_0;
                            break L13;
                          }
                        }
                        var4 = stackIn_21_0;
                        break L10;
                      }
                      L14: {
                        if (-21 != (var3_ref_gf.field_I ^ -1)) {
                          break L14;
                        } else {
                          if (435.0 >= var3_ref_gf.field_m) {
                            break L14;
                          } else {
                            var4 = 1;
                            this.a(ld.field_h[var3_ref_gf.field_I], (int)var3_ref_gf.field_m, gf.field_k[var3_ref_gf.field_I], (int)var3_ref_gf.field_i, 27396);
                            break L14;
                          }
                        }
                      }
                      if (var4 != 0) {
                        this.field_m[var2] = null;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var2++;
                  if (var5 == 0) {
                    continue L4;
                  } else {
                    break L6;
                  }
                }
              }
            }
            if (param0) {
              var2 = 0;
              L15: while (true) {
                if (800 <= var2) {
                  break L5;
                } else {
                  L16: {
                    if (null == this.field_v[var2]) {
                      break L16;
                    } else {
                      if (this.field_v[var2].a((byte) -93)) {
                        this.field_v[var2] = null;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                  }
                  var2++;
                  if (var5 == 0) {
                    continue L15;
                  } else {
                    break L5;
                  }
                }
              }
            } else {
              return;
            }
          }
          var3 = 0;
          L17: while (true) {
            L18: {
              if ((this.field_h.length ^ -1) >= (var3 ^ -1)) {
                break L18;
              } else {
                if (var5 != 0) {
                  break L18;
                } else {
                  L19: {
                    L20: {
                      if (this.field_u < 50) {
                        break L20;
                      } else {
                        L21: {
                          if (100 <= this.field_u) {
                            break L21;
                          } else {
                            var4 = 65536 * (this.field_u >> -1835558109);
                            if (var5 == 0) {
                              break L19;
                            } else {
                              break L21;
                            }
                          }
                        }
                        L22: {
                          if (150 <= this.field_u) {
                            break L22;
                          } else {
                            var4 = (this.field_u >> 1426778883) * 65792;
                            if (var5 == 0) {
                              break L19;
                            } else {
                              break L22;
                            }
                          }
                        }
                        var4 = 65537 * (this.field_u >> 250666755);
                        if (var5 == 0) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                    var4 = 65793 * (this.field_u >> 56073124);
                    break L19;
                  }
                  this.field_h[var3].a((int)(this.field_D + (double)hi.a((int)(1.5 * (double)ri.field_e), 4, this.field_l) - (double)(ri.field_e / 3)), 15, var4, -5, 1, (int)(this.field_N + (double)hi.a((int)((double)am.field_l * 1.5), 4, this.field_l) - (double)(am.field_l / 3)));
                  var3++;
                  if (var5 == 0) {
                    continue L17;
                  } else {
                    break L18;
                  }
                }
              }
            }
            return;
          }
        }
    }

    private final int g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (this.field_m[var2] == null) {
                break L2;
              } else {
                var2++;
                if (var3 != 0) {
                  break L1;
                } else {
                  if (var3 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            if (param0 == 119) {
              break L1;
            } else {
              this.i((byte) -102);
              break L1;
            }
          }
          return var2;
        }
    }

    private final void c(byte param0) {
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_20_0 = 0;
        boolean stackOut_14_0 = false;
        int stackOut_19_0 = 0;
        L0: {
          var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var2 = null;
          if (0 == this.field_q) {
            var2 = oi.field_f;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 > 109) {
          L1: {
            if (1 != this.field_q) {
              break L1;
            } else {
              var2 = sg.field_e;
              break L1;
            }
          }
          L2: {
            if (2 == this.field_q) {
              var2 = uk.field_h;
              break L2;
            } else {
              break L2;
            }
          }
          if (var2 != null) {
            var3 = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if (-21 >= (var3 ^ -1)) {
                    break L5;
                  } else {
                    al.field_g[var3] = hi.a(640, 4, this.field_l);
                    stackOut_14_0 = ((he) (var2)).b(0, 0, al.field_g[var3], 305);
                    stackIn_20_0 = stackOut_14_0 ? 1 : 0;
                    stackIn_15_0 = stackOut_14_0;
                    if (var4 != 0) {
                      break L4;
                    } else {
                      L6: {
                        if (!stackIn_15_0) {
                          var3--;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var3++;
                      if (var4 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                bc.field_d.c();
                wj.f(0, 0, bc.field_d.field_y, bc.field_d.field_w, 0);
                lb.field_C.a(124);
                stackOut_19_0 = this.field_q;
                stackIn_20_0 = stackOut_19_0;
                break L4;
              }
              ab.field_b = stackIn_20_0;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final void c(byte param0, int param1) {
        if (0 < param1) {
            this.field_R = this.field_R + param1;
        }
        if (param0 != -61) {
            this.a(-77, -76);
        }
    }

    final void a(int param0, gf param1) {
        try {
            if (param0 != 24) {
                this.c(69);
            }
            this.field_v[this.h((byte) -111)] = param1;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "j.RA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void H(int param0) {
        int var2 = 0;
        int var3 = 0;
        nl var4 = null;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 == 1) {
          if (!this.field_eb) {
            L0: {
              L1: {
                this.field_Z = 0;
                this.field_fb = 0;
                if (-501 < (gm.field_J ^ -1)) {
                  break L1;
                } else {
                  this.s(94);
                  var2 = 0;
                  L2: while (true) {
                    L3: {
                      L4: {
                        if ((si.field_C.length ^ -1) >= (var2 ^ -1)) {
                          break L4;
                        } else {
                          si.field_C[var2] = true;
                          var2++;
                          if (var3 != 0) {
                            break L3;
                          } else {
                            if (var3 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      lg.field_g = true;
                      s.field_e = true;
                      ni.field_w = true;
                      nb.field_d = true;
                      wb.a(34);
                      break L3;
                    }
                    if (var3 == 0) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L5: {
                if ((gm.field_J ^ -1) == -1) {
                  L6: {
                    gf.field_D = Math.max(1 + sd.field_a.field_q, gf.field_D);
                    var4 = new nl(0, -1 + gf.field_D, 0, 0, 0, 0);
                    if (!oh.a(param0 + -1)) {
                      break L6;
                    } else {
                      dl.field_M.a(var4, param0 + 254);
                      if (var3 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  rc.a(5, var4, -11659);
                  break L5;
                } else {
                  break L5;
                }
              }
              L7: {
                L8: {
                  if ((gm.field_J ^ -1) >= -129) {
                    break L8;
                  } else {
                    if (this.field_R == 0) {
                      break L8;
                    } else {
                      break L7;
                    }
                  }
                }
                gm.field_J = gm.field_J + 1;
                break L7;
              }
              this.o(param0 + 122);
              break L0;
            }
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final void u(int param0) {
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        L0: {
          L1: {
            var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            if (-1 > (gm.field_J ^ -1)) {
              break L1;
            } else {
              if (!this.field_eb) {
                break L0;
              } else {
                L2: {
                  var2 = (-this.field_s + this.field_J) * 255 / 300;
                  if (255 < var2) {
                    var2 = 255;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                be.a(64 + var2 / 2, -(var2 / 2 + 64), -(var2 / 2 + 64));
                be.b(var2 * 2 + 128);
                if (var6 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          L3: {
            if (150 < gm.field_J) {
              L4: {
                if (this.field_D <= (double)ri.field_e) {
                  break L4;
                } else {
                  this.field_j = this.field_j - 0.5;
                  if (var6 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              this.field_j = 0.0;
              break L3;
            } else {
              break L3;
            }
          }
          L5: {
            if (gm.field_J < 50) {
              break L5;
            } else {
              L6: {
                be.a(0, 0, 640, 430, 22070844, 255);
                var2 = gm.field_J * 2;
                if (255 < var2) {
                  var2 = 255;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                var3 = (-150 + gm.field_J) * 2;
                if (var3 > 255) {
                  var3 = 255;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                cb.field_b.b(vh.field_d, 320, 200, 16777215, -1, var2);
                if (0 > var3) {
                  var3 = 0;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                var4 = sa.field_g + this.field_H;
                cb.field_b.b(var4, 320, 250, 16777215, -1, var2);
                if (0 >= this.field_R) {
                  break L9;
                } else {
                  var5 = kh.field_o + this.field_T + af.field_c + this.field_X + l.field_h + this.field_R;
                  cb.field_b.b(var5, 320, 255 - -cb.field_b.field_x, 16777215, -1, var2);
                  if (-201 > (var2 ^ -1)) {
                    L10: {
                      if (-30 > (this.field_R ^ -1)) {
                        break L10;
                      } else {
                        this.d((byte) -100, this.field_R);
                        this.field_R = 0;
                        if (var6 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    this.field_R = this.field_R - 29;
                    this.d((byte) -100, 29);
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
              cb.field_b.b(bj.field_b, 320, 320, 16711680, -1, var3);
              if (var6 == 0) {
                break L0;
              } else {
                break L5;
              }
            }
          }
          be.a(0, 0, 640, 430, 22070844, gm.field_J * 5);
          break L0;
        }
        L11: {
          if (param0 == 7) {
            break L11;
          } else {
            this.field_u = -51;
            break L11;
          }
        }
    }

    private final void v(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            var2 = this.field_q;
            if (-3 == (var2 ^ -1)) {
              var2 = 0;
              L2: while (true) {
                if (var2 >= 64) {
                  break L1;
                } else {
                  wj.a(var2 * 10, i.field_c[var2], 20, 16777215, 64);
                  var2++;
                  if (var3 != 0) {
                    break L0;
                  } else {
                    if (var3 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            } else {
              break L1;
            }
          }
          if (param0 <= -56) {
            break L0;
          } else {
            field_e = 123;
            break L0;
          }
        }
    }

    private final void a(int param0, double param1, double param2, boolean param3, boolean param4) {
        if (param0 <= 111) {
            this.b(true);
        }
        int var8 = (this.field_q ^ -1) >= -6 ? 430 : 334;
        if (!((double)var8 >= param1)) {
            param1 = (double)(-of.field_x.field_c + var8);
        }
        this.field_d[this.f(0)] = new ib(param2, param1, param3, param4);
    }

    private final void a(byte param0) {
        fj var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        fj var7 = null;
        L0: {
          var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var3 = -108 / ((param0 - 60) / 54);
          var7 = (fj) ((Object) this.field_I.h(-11151));
          var2 = var7;
          if (var2 != null) {
            L1: {
              L2: {
                var5 = this.field_bb;
                if (80 > var5) {
                  break L2;
                } else {
                  L3: {
                    if (-231 >= (var5 ^ -1)) {
                      break L3;
                    } else {
                      var4 = 8;
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var4 = -(var5 / 2) + 123;
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var4 = var5 / 2 + -32;
              break L1;
            }
            di.field_b[var7.field_h].b(8, var4);
            a.field_g.c(sc.field_b[var7.field_h], 48, a.field_g.field_x + var4, 16777215, -1);
            break L0;
          } else {
            break L0;
          }
        }
    }

    private final void d(byte param0, int param1) {
        int var3 = 0;
        if (param0 >= -37) {
            return;
        }
        if (param1 > 0) {
            var3 = (int)(cd.a((byte) 97) * (double)this.field_L * (double)param1);
            this.field_i = this.field_i + var3;
            this.field_g = this.field_g ^ var3;
            this.field_H = this.field_H + var3;
            this.field_f = this.field_f + var3;
            this.field_x = this.field_x ^ var3;
            this.field_f = this.field_f + var3;
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        bf var6 = null;
        int var7_int = 0;
        ib var7 = null;
        int var8 = 0;
        int var9 = 0;
        bf var10 = null;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        int var19 = 0;
        int var20 = 0;
        int stackIn_5_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_13_0 = 0;
        var19 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (3 == this.field_q) {
          return;
        } else {
          var4 = this.field_G.field_h.length;
          var5 = -this.field_J + var4;
          var7_int = 0;
          L0: while (true) {
            stackOut_4_0 = 1600;
            stackIn_5_0 = stackOut_4_0;
            L1: while (true) {
              L2: {
                L3: {
                  if (stackIn_5_0 <= var7_int) {
                    break L3;
                  } else {
                    var6 = this.field_n[var7_int];
                    var10 = var6;
                    var10 = var6;
                    if (var19 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (var6 == null) {
                          break L4;
                        } else {
                          if (var6.field_s) {
                            break L4;
                          } else {
                            if (cj.field_c[var6.field_Q]) {
                              break L4;
                            } else {
                              if ((var6.field_Q ^ -1) == -41) {
                                break L4;
                              } else {
                                var3 = var6.field_I + ((int)var6.field_o - -this.field_J);
                                var8 = (int)var6.field_o;
                                L5: while (true) {
                                  if (((int)((double)var6.field_m + var6.field_o) ^ -1) >= (var8 ^ -1)) {
                                    break L4;
                                  } else {
                                    stackOut_13_0 = var8 - -this.field_J;
                                    stackIn_5_0 = stackOut_13_0;
                                    stackIn_14_0 = stackOut_13_0;
                                    if (var19 != 0) {
                                      continue L1;
                                    } else {
                                      if (stackIn_14_0 < 0) {
                                        break L4;
                                      } else {
                                        L6: {
                                          L7: {
                                            if ((var8 ^ -1) <= (var5 ^ -1)) {
                                              break L7;
                                            } else {
                                              var2 = -this.field_G.field_h[this.field_J + var8] + 430;
                                              if (var19 == 0) {
                                                break L6;
                                              } else {
                                                break L7;
                                              }
                                            }
                                          }
                                          L8: {
                                            var2 = 330;
                                            if (3 == this.field_q) {
                                              break L8;
                                            } else {
                                              if ((this.field_q ^ -1) == -5) {
                                                break L8;
                                              } else {
                                                if (5 == this.field_q) {
                                                  break L8;
                                                } else {
                                                  break L6;
                                                }
                                              }
                                            }
                                          }
                                          var2 = 0;
                                          break L6;
                                        }
                                        L9: {
                                          L10: {
                                            L11: {
                                              if ((var4 ^ -1) >= (var3 ^ -1)) {
                                                break L11;
                                              } else {
                                                if (var6.field_N + (double)var6.field_O > (double)(430 - this.field_G.field_h[var3])) {
                                                  break L10;
                                                } else {
                                                  break L11;
                                                }
                                              }
                                            }
                                            if (var6.b((byte) 55).b((int)var6.field_o, (int)var6.field_N, var8, var2)) {
                                              break L10;
                                            } else {
                                              break L9;
                                            }
                                          }
                                          var6.field_j = -2.0;
                                          var6.field_N = var6.field_N - 5.0;
                                          var6.c(5);
                                          break L9;
                                        }
                                        var8++;
                                        if (var19 == 0) {
                                          continue L5;
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
                      var7_int++;
                      if (var19 == 0) {
                        continue L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == -6718) {
                  break L2;
                } else {
                  this.a(121, -0.13010396482122083, -0.11679658977195154, true, true);
                  break L2;
                }
              }
              var20 = 0;
              var8 = var20;
              L12: while (true) {
                L13: {
                  if (var20 >= 160) {
                    break L13;
                  } else {
                    var7 = this.field_d[var20];
                    if (var19 != 0) {
                      break L13;
                    } else {
                      L14: {
                        L15: {
                          if (var7 == null) {
                            break L15;
                          } else {
                            if (!var7.field_q) {
                              break L15;
                            } else {
                              var9 = 0;
                              L16: while (true) {
                                if (-1601 >= (var9 ^ -1)) {
                                  break L15;
                                } else {
                                  var10 = this.field_n[var9];
                                  if (var19 != 0) {
                                    break L14;
                                  } else {
                                    L17: {
                                      if (var10 == null) {
                                        break L17;
                                      } else {
                                        if (!cj.field_c[var10.field_Q]) {
                                          break L17;
                                        } else {
                                          if (!var10.field_s) {
                                            if (ne.a(var10.b((byte) 55), (int)var10.field_o, (int)var10.field_N, var7.field_n, (int)var7.field_d, (int)var7.field_k)) {
                                              L18: {
                                                var11 = 0.0;
                                                var11 = -var7.field_b - 1.0 + -1.0;
                                                var13 = 0.0;
                                                var7.field_b = var11;
                                                var13 = -var7.field_p;
                                                var7.field_p = var13;
                                                var15 = Math.sqrt(var7.field_b * var7.field_b + var7.field_p * var7.field_p);
                                                if (var15 == 0.0) {
                                                  break L18;
                                                } else {
                                                  var7.field_b = var7.field_b / var15;
                                                  var7.field_p = var7.field_p / var15;
                                                  var17 = Math.pow(0.95, (double)var7.field_c);
                                                  var7.field_b = var7.field_b * var17;
                                                  var7.field_p = var7.field_p * var17;
                                                  if (var19 == 0) {
                                                    break L17;
                                                  } else {
                                                    break L18;
                                                  }
                                                }
                                              }
                                              var17 = Math.random() * 6.283185307179586;
                                              var7.field_b = ji.a(65535, var17);
                                              var7.field_p = pj.a(var17, 32768);
                                              break L17;
                                            } else {
                                              break L17;
                                            }
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                    }
                                    var9++;
                                    if (var19 == 0) {
                                      continue L16;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        var20++;
                        break L14;
                      }
                      if (var19 == 0) {
                        continue L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        }
    }

    private final void a(int param0, byte param1) {
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        int var13_int = 0;
        double var13 = 0.0;
        double var15 = 0.0;
        double[] var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        double var24 = 0.0;
        double var26 = 0.0;
        Object var28 = null;
        int var29 = 0;
        double var30 = 0.0;
        int var32 = 0;
        gf var32_ref_gf = null;
        int var33 = 0;
        double var34_double = 0.0;
        int var34 = 0;
        double var36 = 0.0;
        int var38 = 0;
        bf var39 = null;
        bf var40 = null;
        bf var41 = null;
        bf var42 = null;
        int stackIn_86_0 = 0;
        double stackIn_98_0 = 0.0;
        double stackIn_99_0 = 0.0;
        double stackIn_100_0 = 0.0;
        double stackIn_100_1 = 0.0;
        int stackIn_111_0 = 0;
        int stackOut_85_0 = 0;
        double stackOut_97_0 = 0.0;
        double stackOut_99_0 = 0.0;
        double stackOut_99_1 = 0.0;
        double stackOut_98_0 = 0.0;
        double stackOut_98_1 = 0.0;
        int stackOut_110_0 = 0;
        L0: {
          var38 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param1 >= 21) {
            break L0;
          } else {
            this.a(-113, -38, 62, 92, 4);
            break L0;
          }
        }
        var3 = 0.0;
        var5 = 0.0;
        var7 = 0.0;
        var9 = 0.0;
        if (this.field_eb) {
          return;
        } else {
          L1: {
            L2: {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      L7: {
                        var5 = (double)ri.field_q + this.field_D;
                        lh.field_m = lh.field_m | 1 << this.field_q;
                        var3 = this.field_N + (double)am.field_p;
                        var13_int = param0;
                        if (19 != var13_int) {
                          break L7;
                        } else {
                          if (var38 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      if (var13_int == 24) {
                        break L6;
                      } else {
                        L8: {
                          if (-26 != (var13_int ^ -1)) {
                            break L8;
                          } else {
                            if (var38 == 0) {
                              break L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          if ((var13_int ^ -1) != -21) {
                            break L9;
                          } else {
                            if (var38 == 0) {
                              break L5;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L10: {
                          if ((var13_int ^ -1) != -22) {
                            break L10;
                          } else {
                            if (var38 == 0) {
                              break L4;
                            } else {
                              break L10;
                            }
                          }
                        }
                        L11: {
                          if (22 != var13_int) {
                            break L11;
                          } else {
                            if (var38 == 0) {
                              break L3;
                            } else {
                              break L11;
                            }
                          }
                        }
                        if (-24 != (var13_int ^ -1)) {
                          break L1;
                        } else {
                          if (var38 == 0) {
                            break L2;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    L12: {
                      var7 = 23.0;
                      if (param0 != 25) {
                        break L12;
                      } else {
                        var7 = 34.0;
                        break L12;
                      }
                    }
                    var9 = 0.0;
                    var5 = var5 + 1.0;
                    var3 = -32.0 + (this.field_N + (double)am.field_l);
                    if (var38 == 0) {
                      break L1;
                    } else {
                      break L5;
                    }
                  }
                  var7 = this.field_c;
                  var9 = 0.0;
                  if (var38 == 0) {
                    break L1;
                  } else {
                    break L4;
                  }
                }
                param0 = 28;
                if (var38 == 0) {
                  break L1;
                } else {
                  break L3;
                }
              }
              var9 = (double)(hi.a(this.field_S * 4, 4, this.field_l) - this.field_S * 2);
              var7 = 10.0;
              if (var38 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
            var7 = 10.0;
            var9 = 0.0;
            break L1;
          }
          L13: {
            L14: {
              L15: {
                L16: {
                  var32 = param0;
                  if ((var32 ^ -1) != -20) {
                    break L16;
                  } else {
                    if (var38 == 0) {
                      L17: {
                        L18: {
                          L19: {
                            L20: {
                              L21: {
                                L22: {
                                  L23: {
                                    L24: {
                                      var32 = this.field_S;
                                      if (var32 == 1) {
                                        var9 = var9 + 3.0 * (Math.random() - 0.5);
                                        this.field_m[this.g((byte) 119)] = new gf(param0, var3, var5, var7, var9, 800.0, this.field_D);
                                        this.field_S = 0;
                                        if (var38 == 0) {
                                          break L13;
                                        } else {
                                          break L24;
                                        }
                                      } else {
                                        L25: {
                                          if (-3 != (var32 ^ -1)) {
                                            break L25;
                                          } else {
                                            if (var38 == 0) {
                                              break L24;
                                            } else {
                                              break L25;
                                            }
                                          }
                                        }
                                        if (var32 == 3) {
                                          break L23;
                                        } else {
                                          L26: {
                                            if (-5 != (var32 ^ -1)) {
                                              break L26;
                                            } else {
                                              if (var38 == 0) {
                                                break L22;
                                              } else {
                                                break L26;
                                              }
                                            }
                                          }
                                          if (var32 == 5) {
                                            break L21;
                                          } else {
                                            if ((var32 ^ -1) == -7) {
                                              break L20;
                                            } else {
                                              if (var32 == 7) {
                                                break L19;
                                              } else {
                                                if (var32 == 8) {
                                                  break L18;
                                                } else {
                                                  break L17;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var11 = 2.0 * (-0.5 + Math.random()) + 0.5;
                                    this.field_m[this.g((byte) 119)] = new gf(param0, var3 - 10.0, var5 - 6.0, var7, var9 + var11, 800.0, this.field_D);
                                    this.field_m[this.g((byte) 119)] = new gf(param0, var3 - 10.0, 6.0 + var5, var7, var9 - var11, 800.0, this.field_D);
                                    this.field_S = 0;
                                    if (var38 == 0) {
                                      break L14;
                                    } else {
                                      break L23;
                                    }
                                  }
                                  var11 = (Math.random() - 0.5) * 1.0 + 1.0;
                                  this.field_m[this.g((byte) 119)] = new gf(param0, var3 - 10.0, var5 - 6.0, var7, var9 - var11, 800.0, this.field_D);
                                  this.field_m[this.g((byte) 119)] = new gf(param0, var3, var5, var7, var9, 800.0, this.field_D);
                                  this.field_m[this.g((byte) 119)] = new gf(param0, -10.0 + var3, 6.0 + var5, var7, var9 + var11, 800.0, this.field_D);
                                  this.field_S = 0;
                                  if (var38 == 0) {
                                    break L14;
                                  } else {
                                    break L22;
                                  }
                                }
                                var11 = 0.5 + (Math.random() - 0.5) * 1.0;
                                this.field_m[this.g((byte) 119)] = new gf(param0, -10.0 + var3, -6.0 + var5, var7, var9 - var11, 800.0, this.field_D);
                                this.field_m[this.g((byte) 119)] = new gf(24, var3, var5, 2.0 + var7, var9, 800.0, this.field_D);
                                this.field_m[this.g((byte) 119)] = new gf(param0, -10.0 + var3, var5 + 6.0, var7, var9 + var11, 800.0, this.field_D);
                                this.field_S = 0;
                                if (var38 == 0) {
                                  break L14;
                                } else {
                                  break L21;
                                }
                              }
                              var11 = 0.5 + 2.0 * (Math.random() - 0.5);
                              this.field_m[this.g((byte) 119)] = new gf(24, -10.0 + var3, -6.0 + var5, 2.0 + var7, -var11 + var9, 800.0, this.field_D);
                              this.field_m[this.g((byte) 119)] = new gf(param0, var3, var5, var7, var9, 800.0, this.field_D);
                              this.field_m[this.g((byte) 119)] = new gf(24, var3 - 10.0, var5 + 6.0, var7 + 2.0, var9 + var11, 800.0, this.field_D);
                              this.field_S = 0;
                              if (var38 == 0) {
                                break L14;
                              } else {
                                break L20;
                              }
                            }
                            var11 = 1.0 + 1.5 * (-0.5 + Math.random());
                            this.field_m[this.g((byte) 119)] = new gf(24, var3 - 10.0, -6.0 + var5, 2.0 + var7, -var11 + var9, 800.0, this.field_D);
                            this.field_m[this.g((byte) 119)] = new gf(24, var3, var5, 2.0 + var7, var9, 800.0, this.field_D);
                            this.field_m[this.g((byte) 119)] = new gf(24, var3 - 10.0, var5 + 6.0, 2.0 + var7, var9 + var11, 800.0, this.field_D);
                            this.field_S = 0;
                            if (var38 == 0) {
                              break L14;
                            } else {
                              break L19;
                            }
                          }
                          var11 = 2.0 * (-0.5 + Math.random()) + 0.5;
                          this.field_m[this.g((byte) 119)] = new gf(24, -10.0 + var3, var5 - 6.0, var7 + 2.0, -var11 + var9, 800.0, this.field_D);
                          this.field_m[this.g((byte) 119)] = new gf(25, var3, var5, 5.0 + var7, var9, 800.0, this.field_D);
                          this.field_m[this.g((byte) 119)] = new gf(24, var3 - 10.0, var5 + 6.0, 2.0 + var7, var9 + var11, 800.0, this.field_D);
                          this.field_S = 0;
                          if (var38 == 0) {
                            break L14;
                          } else {
                            break L18;
                          }
                        }
                        var11 = 0.5 + 2.5 * (-0.5 + Math.random());
                        this.field_m[this.g((byte) 119)] = new gf(25, var3 - 10.0, -3.0 + var5, 5.0 + var7, var9 - var11, 800.0, this.field_D);
                        this.field_m[this.g((byte) 119)] = new gf(24, var3, var5, var7 + 2.0, var9, 800.0, this.field_D);
                        this.field_m[this.g((byte) 119)] = new gf(25, var3 - 10.0, var5 + 3.0, 5.0 + var7, var11 + var9, 800.0, this.field_D);
                        this.field_S = 0;
                        if (var38 == 0) {
                          break L14;
                        } else {
                          break L17;
                        }
                      }
                      L27: {
                        var11 = 1.0 + (-0.5 + Math.random()) * 2.5;
                        this.field_m[this.g((byte) 119)] = new gf(25, -10.0 + var3, -3.0 + var5, 5.0 + var7, -var11 + var9, 800.0, this.field_D);
                        this.field_m[this.g((byte) 119)] = new gf(25, var3, var5, var7 + 5.0, var9, 800.0, this.field_D);
                        this.field_m[this.g((byte) 119)] = new gf(25, var3 - 10.0, var5 + 3.0, 5.0 + var7, var9 + var11, 800.0, this.field_D);
                        if (-10 != (this.field_S ^ -1)) {
                          break L27;
                        } else {
                          this.field_S = 0;
                          if (var38 == 0) {
                            break L14;
                          } else {
                            break L27;
                          }
                        }
                      }
                      this.field_S = this.field_S - 3;
                      if (var38 == 0) {
                        break L14;
                      } else {
                        break L15;
                      }
                    } else {
                      break L16;
                    }
                  }
                }
                L28: {
                  if (-22 != (var32 ^ -1)) {
                    break L28;
                  } else {
                    if (var38 == 0) {
                      break L15;
                    } else {
                      break L28;
                    }
                  }
                }
                L29: {
                  if (28 != var32) {
                    break L29;
                  } else {
                    if (var38 == 0) {
                      var23 = -1;
                      var26 = 150.0;
                      var18 = (int)((double)am.field_p + this.field_N);
                      var20 = 0;
                      var29 = 0;
                      var28 = null;
                      var19 = (int)(this.field_D + (double)ri.field_q);
                      L30: while (true) {
                        L31: {
                          L32: {
                            if (var29 != 0) {
                              break L32;
                            } else {
                              stackOut_85_0 = 0;
                              stackIn_111_0 = stackOut_85_0;
                              stackIn_86_0 = stackOut_85_0;
                              if (var38 != 0) {
                                break L31;
                              } else {
                                var32 = stackIn_86_0;
                                L33: while (true) {
                                  L34: {
                                    L35: {
                                      if (1600 <= var32) {
                                        break L35;
                                      } else {
                                        var39 = this.field_n[var32];
                                        var40 = var39;
                                        var42 = var40;
                                        var40 = var39;
                                        var42 = var40;
                                        var41 = var39;
                                        if (var38 != 0) {
                                          break L34;
                                        } else {
                                          L36: {
                                            if (var41 == null) {
                                              break L36;
                                            } else {
                                              if (var41.a(false)) {
                                                break L36;
                                              } else {
                                                if (var41.field_s) {
                                                  break L36;
                                                } else {
                                                  if (!wh.field_v[var39.field_Q]) {
                                                    L37: {
                                                      if (0 == var20) {
                                                        break L37;
                                                      } else {
                                                        if (var41.h(63)) {
                                                          break L37;
                                                        } else {
                                                          break L36;
                                                        }
                                                      }
                                                    }
                                                    L38: {
                                                      var24 = dl.a(true, -var41.field_o - (double)var41.field_I - (double)var20 + (double)var18, -var41.field_N - (double)var41.field_t + (double)var19);
                                                      stackOut_97_0 = var24;
                                                      stackIn_99_0 = stackOut_97_0;
                                                      stackIn_98_0 = stackOut_97_0;
                                                      if (-37 == (var41.field_Q ^ -1)) {
                                                        stackOut_99_0 = stackIn_99_0;
                                                        stackOut_99_1 = 30.0;
                                                        stackIn_100_0 = stackOut_99_0;
                                                        stackIn_100_1 = stackOut_99_1;
                                                        break L38;
                                                      } else {
                                                        stackOut_98_0 = stackIn_98_0;
                                                        stackOut_98_1 = 0.0;
                                                        stackIn_100_0 = stackOut_98_0;
                                                        stackIn_100_1 = stackOut_98_1;
                                                        break L38;
                                                      }
                                                    }
                                                    var24 = stackIn_100_0 - stackIn_100_1;
                                                    if (var24 >= var26) {
                                                      break L36;
                                                    } else {
                                                      var23 = var32;
                                                      var24 = var26;
                                                      break L36;
                                                    }
                                                  } else {
                                                    break L36;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          var32++;
                                          if (var38 == 0) {
                                            continue L33;
                                          } else {
                                            break L35;
                                          }
                                        }
                                      }
                                    }
                                    if (var23 == -1) {
                                      break L34;
                                    } else {
                                      var29 = 1;
                                      if (var38 == 0) {
                                        continue L30;
                                      } else {
                                        break L34;
                                      }
                                    }
                                  }
                                  L39: {
                                    if (-1 != (var20 ^ -1)) {
                                      break L39;
                                    } else {
                                      var20 = -100;
                                      if (var38 == 0) {
                                        continue L30;
                                      } else {
                                        break L39;
                                      }
                                    }
                                  }
                                  L40: {
                                    if (-100 == var20) {
                                      break L40;
                                    } else {
                                      var29 = 1;
                                      if (var38 == 0) {
                                        continue L30;
                                      } else {
                                        break L40;
                                      }
                                    }
                                  }
                                  var20 = 100;
                                  if (var38 == 0) {
                                    continue L30;
                                  } else {
                                    break L32;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_110_0 = 0;
                          stackIn_111_0 = stackOut_110_0;
                          break L31;
                        }
                        L41: {
                          if (stackIn_111_0 == (var23 ^ -1)) {
                            this.field_a = true;
                            break L41;
                          } else {
                            L42: {
                              L43: {
                                var40 = this.field_n[var23];
                                var42 = var40;
                                var21 = var42.field_I + (int)var42.field_o;
                                var22 = var42.field_t + (int)var42.field_N;
                                if (var42.field_Q == 0) {
                                  break L43;
                                } else {
                                  if (var42.field_Q != 35) {
                                    break L42;
                                  } else {
                                    break L43;
                                  }
                                }
                              }
                              var22 = var22 - var42.field_t / 2;
                              break L42;
                            }
                            var32_ref_gf = new gf(param0, var3, var5, 0.0, 0.0, (double)var21, (double)var22);
                            var32_ref_gf.field_l = this.field_J;
                            this.field_m[this.g((byte) 119)] = var32_ref_gf;
                            if (!var42.a(var32_ref_gf.field_t, 10)) {
                              break L41;
                            } else {
                              L44: {
                                this.b(var42, 57);
                                this.d((byte) -63, wh.field_x[var40.field_Q]);
                                if (var42.a(false)) {
                                  break L44;
                                } else {
                                  if ((qa.field_I[var40.field_Q] ^ -1) != -1) {
                                    this.field_o = this.field_o - 1;
                                    break L44;
                                  } else {
                                    break L44;
                                  }
                                }
                              }
                              L45: {
                                L46: {
                                  L47: {
                                    if (0 == this.field_o) {
                                      break L47;
                                    } else {
                                      if (qa.field_I[var40.field_Q] < 0) {
                                        break L47;
                                      } else {
                                        break L46;
                                      }
                                    }
                                  }
                                  this.field_o = 5 - -hi.a(10, 4, this.field_l);
                                  var34 = Math.abs(qa.field_I[var40.field_Q]);
                                  L48: while (true) {
                                    if (-1 <= (var34 ^ -1)) {
                                      break L46;
                                    } else {
                                      this.a(121, var42.field_N + (double)hi.a(var42.field_O / 2, 4, this.field_l), var42.field_o + (double)hi.a(var42.field_m, 4, this.field_l), false, cj.field_c[var40.field_Q]);
                                      var34--;
                                      if (var38 != 0) {
                                        break L45;
                                      } else {
                                        if (var38 == 0) {
                                          continue L48;
                                        } else {
                                          break L46;
                                        }
                                      }
                                    }
                                  }
                                }
                                this.a(116, (gf) null, var40);
                                break L45;
                              }
                              L49: {
                                if (th.field_d[var40.field_Q]) {
                                  break L49;
                                } else {
                                  this.field_n[var23].a(7769);
                                  this.field_n[var23] = null;
                                  break L49;
                                }
                              }
                              if (var42.h(-120)) {
                                this.a(var42, 0);
                                break L41;
                              } else {
                                break L41;
                              }
                            }
                          }
                        }
                        this.field_S = 0;
                        return;
                      }
                    } else {
                      break L29;
                    }
                  }
                }
                L50: {
                  L51: {
                    L52: {
                      L53: {
                        if (23 != var32) {
                          break L53;
                        } else {
                          if (var38 == 0) {
                            this.field_m[this.g((byte) 119)] = new gf(param0, var3, var5, var7, var9, 800.0, this.field_D, this.field_u);
                            if (var38 == 0) {
                              break L14;
                            } else {
                              break L52;
                            }
                          } else {
                            break L53;
                          }
                        }
                      }
                      if (var32 == 22) {
                        break L52;
                      } else {
                        if (-21 == (var32 ^ -1)) {
                          break L51;
                        } else {
                          break L50;
                        }
                      }
                    }
                    this.field_m[this.g((byte) 119)] = new gf(22, var3, var5, var7, var9, 800.0, this.field_D);
                    this.field_S = this.field_S - 1;
                    if (var38 == 0) {
                      break L14;
                    } else {
                      break L51;
                    }
                  }
                  var30 = (double)this.field_S / 4.0;
                  var32 = 0;
                  L54: while (true) {
                    L55: {
                      if (this.field_S <= var32) {
                        break L55;
                      } else {
                        this.field_m[this.g((byte) 119)] = new gf(param0, var3, var5, -var30 + (var7 + (double)var32), var9, 800.0, this.field_D);
                        this.field_S = this.field_S - 1;
                        var32++;
                        if (var38 != 0) {
                          break L14;
                        } else {
                          if (var38 == 0) {
                            continue L54;
                          } else {
                            break L55;
                          }
                        }
                      }
                    }
                    if (var38 == 0) {
                      break L14;
                    } else {
                      break L50;
                    }
                  }
                }
                this.field_m[this.g((byte) 119)] = new gf(param0, var3, var5, var7, var9, 800.0, this.field_D);
                this.field_S = this.field_S - 1;
                break L13;
              }
              var5 = var5 + 13.0;
              var13 = 20.0;
              var3 = var3 + 14.0;
              var17 = new double[]{0.0, 0.7853981633974483, -0.7853981633974483, 2.6179938779914944, -2.6179938779914944};
              var32 = -2;
              L56: while (true) {
                L57: {
                  if ((var32 ^ -1) < -3) {
                    break L57;
                  } else {
                    var15 = (double)var32 * 0.15 / 2.0 + 1.5707963267948966;
                    if (var38 != 0) {
                      break L14;
                    } else {
                      var33 = 0;
                      L58: while (true) {
                        L59: {
                          L60: {
                            if (var33 >= 5) {
                              break L60;
                            } else {
                              var34_double = ji.a(65535, (double)this.field_J / 5.0) * var13 * ji.a(65535, var17[var33] + var15);
                              var36 = var13 * ji.a(65535, (double)this.field_J / 5.0) * pj.a(var17[var33] + var15, 32768);
                              this.field_m[this.g((byte) 119)] = new gf(param0, var34_double + (-15.0 + var3), var36 + var5, ji.a(65535, var15 + var17[var33]) * var13, pj.a(var15 + var17[var33], 32768) * var13, 800.0, this.field_D);
                              var33++;
                              if (var38 != 0) {
                                break L59;
                              } else {
                                if (var38 == 0) {
                                  continue L58;
                                } else {
                                  break L60;
                                }
                              }
                            }
                          }
                          var32++;
                          break L59;
                        }
                        if (var38 == 0) {
                          continue L56;
                        } else {
                          break L57;
                        }
                      }
                    }
                  }
                }
                this.field_S = this.field_S - 1;
                break L13;
              }
            }
            break L13;
          }
          return;
        }
    }

    private final void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var2 >= 800) {
                break L2;
              } else {
                if (var3 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (null == this.field_v[var2]) {
                      break L3;
                    } else {
                      this.field_v[var2].c((byte) 114);
                      break L3;
                    }
                  }
                  var2++;
                  if (var3 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            if (param0 == 97) {
              break L1;
            } else {
              this.field_A = -89;
              break L1;
            }
          }
          return;
        }
    }

    private final void a(int param0, gf param1, bf param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        Object stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
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
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
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
        try {
          L0: {
            L1: {
              stackOut_0_0 = this;
              stackOut_0_1 = (int)param2.field_o + param2.field_I;
              stackOut_0_2 = (int)param2.field_N - -param2.field_t;
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_2_2 = stackOut_0_2;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              stackIn_1_2 = stackOut_0_2;
              if (param1 != null) {
                stackOut_2_0 = this;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = gf.field_k[param1.field_I];
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                stackIn_3_3 = stackOut_2_3;
                break L1;
              } else {
                stackOut_1_0 = this;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = stackIn_1_2;
                stackOut_1_3 = -1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                stackIn_3_3 = stackOut_1_3;
                break L1;
              }
            }
            L2: {
              this.a(stackIn_3_1, stackIn_3_2, stackIn_3_3, param2, -111);
              if ((param2.field_Q ^ -1) == -43) {
                var4_int = param2.e((byte) -122);
                if (0 < var4_int) {
                  this.a(11, var4_int + ((int)param2.field_N - -param2.field_t), -1, param2.field_I + (int)param2.field_o - 5, 27396);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 > 97) {
                break L3;
              } else {
                this.a(60, -64, (byte) -16);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("j.V(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
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
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    final bf a(int param0, boolean param1, int param2, int param3, int param4, boolean param5) {
        int var7 = 0;
        bf var8 = null;
        int var9 = 0;
        L0: {
          var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var8 = new bf(param2, param4, this.field_J, param3, param0, param1);
          if (param5) {
            break L0;
          } else {
            this.field_d = (ib[]) null;
            break L0;
          }
        }
        L1: {
          if (!var8.h(49)) {
            break L1;
          } else {
            sc.a(-1, true, lh.field_l);
            this.field_U = true;
            break L1;
          }
        }
        L2: {
          L3: {
            if (var8.a(false)) {
              break L3;
            } else {
              if (param1) {
                break L3;
              } else {
                var7 = this.j(116);
                if (var9 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
          }
          var7 = this.e(2183);
          break L2;
        }
        L4: {
          L5: {
            this.field_n[var7] = var8;
            if (param1) {
              break L5;
            } else {
              L6: {
                if (param2 == 8) {
                  break L6;
                } else {
                  if (-10 == (param2 ^ -1)) {
                    break L6;
                  } else {
                    if (param2 == 10) {
                      break L6;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              this.field_n[var7].field_j = this.field_n[var7].field_j / 3.0;
              if (var9 == 0) {
                break L4;
              } else {
                break L5;
              }
            }
          }
          this.field_n[var7].field_o = (double)param3;
          break L4;
        }
        this.field_n[var7].c(5);
        return var8;
    }

    private final void A(int param0) {
        int var2 = 0;
        int var3_int = 0;
        td var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_24_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_23_0 = 0;
        L0: {
          var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (this.field_q == 0) {
            break L0;
          } else {
            if (-2 != (this.field_q ^ -1)) {
              return;
            } else {
              break L0;
            }
          }
        }
        L1: {
          var2 = 0;
          if (param0 == 1052688) {
            break L1;
          } else {
            this.y(53);
            break L1;
          }
        }
        stackOut_6_0 = var2;
        stackIn_8_0 = stackOut_6_0;
        L2: while (true) {
          L3: {
            L4: {
              if (stackIn_8_0 >= 2) {
                break L4;
              } else {
                stackOut_9_0 = 0;
                stackIn_24_0 = stackOut_9_0;
                stackIn_10_0 = stackOut_9_0;
                if (var4 != 0) {
                  break L3;
                } else {
                  var3_int = stackIn_10_0;
                  L5: while (true) {
                    L6: {
                      if (-21 >= (var3_int ^ -1)) {
                        break L6;
                      } else {
                        vi.field_h[var2][var3_int].a((int)vj.field_f[var2], 3, lh.field_n[var2], -21, 1, (int)tc.field_f[var2]);
                        tc.field_f[var2] = tc.field_f[var2] + 0.3;
                        vj.field_f[var2] = vj.field_f[var2] + 0.6;
                        stackOut_12_0 = (vj.field_f[var2] < 305.0 ? -1 : (vj.field_f[var2] == 305.0 ? 0 : 1));
                        stackIn_8_0 = stackOut_12_0;
                        stackIn_13_0 = stackOut_12_0;
                        if (var4 != 0) {
                          continue L2;
                        } else {
                          L7: {
                            if (stackIn_13_0 > 0) {
                              L8: {
                                nd.field_M = 256;
                                this.a((int)vj.field_f[var2], -84, (int)tc.field_f[var2]);
                                tc.field_f[var2] = (double)(hi.a(640, 4, this.field_l) + -100);
                                vj.field_f[var2] = (double)(-hi.a(1720, 4, this.field_l));
                                if ((hi.a(5, 4, this.field_l) ^ -1) > -5) {
                                  break L8;
                                } else {
                                  lh.field_n[var2] = 2102528;
                                  if (var4 == 0) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              lh.field_n[var2] = 1052688;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          L9: {
                            if (640.0 >= tc.field_f[var2]) {
                              break L9;
                            } else {
                              tc.field_f[var2] = 0.0;
                              break L9;
                            }
                          }
                          var3_int++;
                          if (var4 == 0) {
                            continue L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    var2++;
                    if (var4 == 0) {
                      stackOut_7_0 = var2;
                      stackIn_8_0 = stackOut_7_0;
                      continue L2;
                    } else {
                      break L4;
                    }
                  }
                }
              }
            }
            stackOut_23_0 = 0;
            stackIn_24_0 = stackOut_23_0;
            break L3;
          }
          var5 = stackIn_24_0;
          var2 = var5;
          L10: while (true) {
            L11: {
              if (var5 >= 3801) {
                break L11;
              } else {
                var3 = this.field_hb[var5];
                if (var4 != 0) {
                  break L11;
                } else {
                  L12: {
                    if (var3 == null) {
                      break L12;
                    } else {
                      if (var3.a((byte) -107)) {
                        this.field_hb[var5] = null;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                  var5++;
                  if (var4 == 0) {
                    continue L10;
                  } else {
                    break L11;
                  }
                }
              }
            }
            return;
          }
        }
    }

    private final void a(bf param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_14_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            cj.field_e = param0.b((byte) 55);
            ti.field_a = (int)param0.field_N;
            lc.field_m = (int)param0.field_o;
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (ck.field_j.length <= var3_int) {
                    break L3;
                  } else {
                    ck.field_j[var3_int] = new td(hi.a(6, param1 + 4, this.field_l), lc.field_m - -hi.a(cj.field_e.field_h, 4, this.field_l), ti.field_a - -hi.a(cj.field_e.field_c, 4, this.field_l), -1);
                    var3_int++;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.field_U = false;
                break L2;
              }
              var3_int = param1;
              L4: while (true) {
                L5: {
                  L6: {
                    if ((this.field_n.length ^ -1) >= (var3_int ^ -1)) {
                      break L6;
                    } else {
                      if (var4 != 0) {
                        break L5;
                      } else {
                        L7: {
                          if (null != this.field_n[var3_int]) {
                            this.field_U = this.field_U | this.field_n[var3_int].h(param1 ^ 80);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var3_int++;
                        if (var4 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  L8: {
                    stackOut_14_0 = this;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_15_0 = stackOut_14_0;
                    if (this.field_U) {
                      stackOut_16_0 = this;
                      stackOut_16_1 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      break L8;
                    } else {
                      stackOut_15_0 = this;
                      stackOut_15_1 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      break L8;
                    }
                  }
                  ((j) (this)).field_ab = stackIn_17_1 != 0;
                  break L5;
                }
                L9: {
                  if (!this.field_ab) {
                    break L9;
                  } else {
                    this.H(1);
                    break L9;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var3);
            stackOut_21_1 = new StringBuilder().append("j.A(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L10;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L10;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
    }

    final void y(int param0) {
        L0: {
          L1: {
            if (0 == sd.field_e) {
              break L1;
            } else {
              this.G(param0 ^ 6212);
              if (!DrPhlogistonSavesTheEarth.field_D) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          wj.c();
          break L0;
        }
        L2: {
          this.e((byte) 97);
          this.l(-1601);
          this.f((byte) -125);
          this.p(-3);
          this.B(-5651);
          this.x(-64);
          this.v(-122);
          if (qe.field_a > 0) {
            break L2;
          } else {
            this.c(true);
            break L2;
          }
        }
        L3: {
          this.u(7);
          this.a((byte) 123);
          this.t(1);
          this.g(param0 ^ -4619);
          if (param0 == 6212) {
            break L3;
          } else {
            this.i(-74);
            break L3;
          }
        }
        L4: {
          if (!this.field_W) {
            break L4;
          } else {
            cb.field_b.b("Cheating!", 270, 465, 16777215, -1, (int)(ji.a(65535, (double)this.field_J / 50.0) * 128.0 + 128.0));
            break L4;
          }
        }
    }

    private final boolean n(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 > 65) {
            break L0;
          } else {
            this.field_S = -21;
            break L0;
          }
        }
        L1: {
          L2: {
            if (640 + this.field_J >= this.field_G.field_h.length) {
              break L2;
            } else {
              if (this.field_ab) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    private final void I(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = param0;
        L0: while (true) {
          L1: {
            L2: {
              if (64 <= var2) {
                break L2;
              } else {
                i.field_c[var2] = i.field_c[var2] + 10;
                stackOut_2_0 = 430;
                stackOut_2_1 = i.field_c[var2];
                stackIn_7_0 = stackOut_2_0;
                stackIn_7_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var4 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0 >= stackIn_3_1) {
                      break L3;
                    } else {
                      i.field_c[var2] = -20;
                      break L3;
                    }
                  }
                  var2++;
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_6_0 = -3;
            stackOut_6_1 = this.field_q ^ -1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            break L1;
          }
          L4: {
            L5: {
              if (stackIn_7_0 != stackIn_7_1) {
                break L5;
              } else {
                if (hi.a(100, 4, this.field_l) >= 1) {
                  break L5;
                } else {
                  nd.field_M = 255;
                  DrPhlogistonSavesTheEarth.field_K = 255;
                  var2 = 0;
                  var3 = 0;
                  L6: while (true) {
                    ib.field_a = hi.a(640, 4, this.field_l);
                    var3++;
                    ch.field_y = hi.a(75, param0 + 4, this.field_l);
                    var2 = var2 != 0 | q.field_e.a(0, 0, ib.field_a, ch.field_y) ? 1 : 0;
                    L7: while (true) {
                      L8: {
                        if (-101 >= (var3 ^ -1)) {
                          break L8;
                        } else {
                          if (var2 == 0) {
                            continue L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                      if (var4 != 0) {
                        continue L7;
                      } else {
                        if (var4 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
              }
            }
            DrPhlogistonSavesTheEarth.field_K = DrPhlogistonSavesTheEarth.field_K - 10;
            break L4;
          }
          L9: {
            if (nd.field_M <= 64) {
              break L9;
            } else {
              nd.field_M = nd.field_M - 10;
              break L9;
            }
          }
          return;
        }
    }

    private final int m(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 == 1280) {
          var2 = 0;
          L0: while (true) {
            L1: {
              if (this.field_hb[var2] == null) {
                break L1;
              } else {
                var2++;
                if (var3 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            return var2;
          }
        } else {
          return 14;
        }
    }

    private final int f(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = param0;
        L0: while (true) {
          L1: {
            if (this.field_d[var2] == null) {
              break L1;
            } else {
              var2++;
              if (var3 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          return var2;
        }
    }

    private final void b(boolean param0) {
        int var2 = 0;
        gf var3 = null;
        bf var4 = null;
        int var5 = 0;
        bf var6 = null;
        int var6_int = 0;
        int var8 = 0;
        int var9 = 0;
        gf var10 = null;
        gf var11 = null;
        gf var12 = null;
        gf var13 = null;
        int stackIn_3_0 = 0;
        gf stackIn_6_0 = null;
        bf stackIn_38_0 = null;
        bf stackIn_39_0 = null;
        bf stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_50_0 = 0;
        gf stackIn_54_0 = null;
        gf stackIn_67_0 = null;
        gf stackIn_124_0 = null;
        int stackOut_2_0 = 0;
        gf stackOut_5_0 = null;
        bf stackOut_37_0 = null;
        bf stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        bf stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_49_0 = 0;
        gf stackOut_53_0 = null;
        gf stackOut_66_0 = null;
        gf stackOut_126_0 = null;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              L3: {
                L4: {
                  L5: {
                    if (1400 <= var2) {
                      break L5;
                    } else {
                      var10 = this.field_m[var2];
                      var12 = var10;
                      var3 = var12;
                      stackOut_2_0 = 0;
                      stackIn_50_0 = stackOut_2_0;
                      stackIn_3_0 = stackOut_2_0;
                      if (var9 != 0) {
                        break L4;
                      } else {
                        var5 = stackIn_3_0;
                        L6: while (true) {
                          L7: {
                            if ((var5 ^ -1) <= -1601) {
                              break L7;
                            } else {
                              stackOut_5_0 = this.field_m[var2];
                              stackIn_124_0 = stackOut_5_0;
                              stackIn_6_0 = stackOut_5_0;
                              if (var9 != 0) {
                                break L3;
                              } else {
                                if (stackIn_6_0 == null) {
                                  break L7;
                                } else {
                                  L8: {
                                    var4 = this.field_n[var5];
                                    var6 = var4;
                                    var6 = var4;
                                    if (var4 == null) {
                                      break L8;
                                    } else {
                                      if (!var4.field_s) {
                                        L9: {
                                          if (ne.a(var12.field_g, (int)var12.field_i, (int)var12.field_m, var4.b((byte) 55), (int)var4.field_o, (int)var4.field_N)) {
                                            break L9;
                                          } else {
                                            if (var4.field_D == null) {
                                              break L8;
                                            } else {
                                              if (ne.a(var12.field_g, (int)var12.field_i, (int)var12.field_m, var4.field_D, var4.field_d, var4.field_p)) {
                                                break L9;
                                              } else {
                                                break L8;
                                              }
                                            }
                                          }
                                        }
                                        L10: {
                                          L11: {
                                            if (23 != var12.field_I) {
                                              break L11;
                                            } else {
                                              var6_int = 50;
                                              if ((var6_int ^ -1) >= (var12.field_t ^ -1)) {
                                                break L10;
                                              } else {
                                                var6_int = var12.field_t;
                                                if (var9 == 0) {
                                                  break L10;
                                                } else {
                                                  break L11;
                                                }
                                              }
                                            }
                                          }
                                          var6_int = var12.field_t;
                                          break L10;
                                        }
                                        L12: {
                                          if (!var4.a(var6_int, 10)) {
                                            break L12;
                                          } else {
                                            L13: {
                                              this.b(var4, 64);
                                              this.d((byte) -126, wh.field_x[var4.field_Q]);
                                              if (var4.a(false)) {
                                                break L13;
                                              } else {
                                                if (0 != qa.field_I[var4.field_Q]) {
                                                  this.field_o = this.field_o - 1;
                                                  break L13;
                                                } else {
                                                  break L13;
                                                }
                                              }
                                            }
                                            L14: {
                                              L15: {
                                                L16: {
                                                  if (-1 == (this.field_o ^ -1)) {
                                                    break L16;
                                                  } else {
                                                    if (-1 >= (qa.field_I[var4.field_Q] ^ -1)) {
                                                      break L15;
                                                    } else {
                                                      break L16;
                                                    }
                                                  }
                                                }
                                                this.field_o = hi.a(10, 4, this.field_l) + 5;
                                                var8 = Math.abs(qa.field_I[var4.field_Q]);
                                                L17: while (true) {
                                                  if (var8 <= 0) {
                                                    break L15;
                                                  } else {
                                                    this.a(123, var4.field_N + (double)hi.a(var4.field_O / 2, 4, this.field_l), var4.field_o + (double)hi.a(var4.field_m, 4, this.field_l), false, cj.field_c[var4.field_Q]);
                                                    var8--;
                                                    if (var9 != 0) {
                                                      break L14;
                                                    } else {
                                                      if (var9 == 0) {
                                                        continue L17;
                                                      } else {
                                                        break L15;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              this.a(102, var10, var4);
                                              break L14;
                                            }
                                            L18: {
                                              if (th.field_d[var4.field_Q]) {
                                                break L18;
                                              } else {
                                                this.field_n[var5].a(7769);
                                                this.field_n[var5] = null;
                                                break L18;
                                              }
                                            }
                                            L19: {
                                              if (var4.h(-65)) {
                                                this.a(var4, 0);
                                                break L19;
                                              } else {
                                                break L19;
                                              }
                                            }
                                            L20: {
                                              stackOut_37_0 = (bf) (var4);
                                              stackIn_39_0 = stackOut_37_0;
                                              stackIn_38_0 = stackOut_37_0;
                                              if (param0) {
                                                stackOut_39_0 = (bf) ((Object) stackIn_39_0);
                                                stackOut_39_1 = 0;
                                                stackIn_40_0 = stackOut_39_0;
                                                stackIn_40_1 = stackOut_39_1;
                                                break L20;
                                              } else {
                                                stackOut_38_0 = (bf) ((Object) stackIn_38_0);
                                                stackOut_38_1 = 1;
                                                stackIn_40_0 = stackOut_38_0;
                                                stackIn_40_1 = stackOut_38_1;
                                                break L20;
                                              }
                                            }
                                            if (((bf) (Object) stackIn_40_0).a(stackIn_40_1 == 0)) {
                                              break L12;
                                            } else {
                                              dg.field_c = dg.field_c | 1 << this.field_q;
                                              break L12;
                                            }
                                          }
                                        }
                                        L21: {
                                          if ((var12.field_I ^ -1) != -24) {
                                            break L21;
                                          } else {
                                            L22: {
                                              var12.field_t = var12.field_t - var6_int;
                                              if (var12.field_t > 0) {
                                                break L22;
                                              } else {
                                                this.field_m[var2] = null;
                                                break L22;
                                              }
                                            }
                                            this.a(ld.field_h[var10.field_I], var12.field_u + (int)var12.field_m, gf.field_k[var10.field_I], var12.field_q + (int)var12.field_i, 27396);
                                            if (var9 == 0) {
                                              break L8;
                                            } else {
                                              break L21;
                                            }
                                          }
                                        }
                                        this.a(ld.field_h[var10.field_I], (int)var12.field_m + var12.field_u, gf.field_k[var10.field_I], var12.field_q + (int)var12.field_i, 27396);
                                        this.field_m[var2] = null;
                                        break L8;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  var5++;
                                  if (var9 == 0) {
                                    continue L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          var2++;
                          if (var9 == 0) {
                            continue L0;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  stackOut_49_0 = this.field_fb ^ -1;
                  stackIn_50_0 = stackOut_49_0;
                  break L4;
                }
                L23: {
                  if (stackIn_50_0 <= -1) {
                    break L23;
                  } else {
                    var2 = 0;
                    L24: while (true) {
                      if (-801 >= (var2 ^ -1)) {
                        break L23;
                      } else {
                        var11 = this.field_v[var2];
                        var3 = var11;
                        var3 = var11;
                        var13 = var11;
                        var3 = var13;
                        stackOut_53_0 = (gf) (var13);
                        stackIn_124_0 = stackOut_53_0;
                        stackIn_54_0 = stackOut_53_0;
                        if (var9 != 0) {
                          break L3;
                        } else {
                          L25: {
                            if (stackIn_54_0 != null) {
                              if (ne.a(var13.field_g, (int)var13.field_i, (int)var13.field_m, le.field_c, (int)this.field_N, (int)this.field_D)) {
                                this.a(this.field_gb - var13.field_t, 0);
                                this.a(ld.field_h[var11.field_I], (int)var13.field_m, gf.field_k[var11.field_I], (int)var13.field_i, 27396);
                                if (uf.field_f[var11.field_I]) {
                                  break L25;
                                } else {
                                  this.field_v[var2] = null;
                                  break L25;
                                }
                              } else {
                                break L25;
                              }
                            } else {
                              break L25;
                            }
                          }
                          var2++;
                          if (var9 == 0) {
                            continue L24;
                          } else {
                            break L23;
                          }
                        }
                      }
                    }
                  }
                }
                L26: {
                  if (param0) {
                    break L26;
                  } else {
                    this.field_v = (gf[]) null;
                    break L26;
                  }
                }
                var2 = 0;
                L27: while (true) {
                  if (800 <= var2) {
                    break L1;
                  } else {
                    var3 = this.field_v[var2];
                    if (var9 != 0) {
                      break L1;
                    } else {
                      stackOut_66_0 = (gf) (var3);
                      stackIn_67_0 = stackOut_66_0;
                      L28: {
                        L29: {
                          if (stackIn_67_0 == null) {
                            break L29;
                          } else {
                            var5 = 0;
                            L30: while (true) {
                              if (var5 >= 1600) {
                                break L29;
                              } else {
                                var6 = this.field_n[var5];
                                if (var9 != 0) {
                                  break L28;
                                } else {
                                  L31: {
                                    if (var6 == null) {
                                      break L31;
                                    } else {
                                      L32: {
                                        if (wh.field_v[var6.field_Q]) {
                                          break L32;
                                        } else {
                                          if (!var6.a(false)) {
                                            break L31;
                                          } else {
                                            if (var6.field_s) {
                                              break L31;
                                            } else {
                                              if (ne.a(var3.field_g, (int)var3.field_i, (int)var3.field_m, var6.b((byte) 55), (int)var6.field_o, (int)var6.field_N)) {
                                                L33: {
                                                  this.a(ld.field_h[var3.field_I], (int)var3.field_m, gf.field_k[var3.field_I], (int)var3.field_i, 27396);
                                                  if (!var6.a(var3.field_t, 10)) {
                                                    break L33;
                                                  } else {
                                                    this.a(120, var3, var6);
                                                    if (cj.field_c[var6.field_Q]) {
                                                      break L33;
                                                    } else {
                                                      this.field_n[var5].a(7769);
                                                      this.field_n[var5] = null;
                                                      break L33;
                                                    }
                                                  }
                                                }
                                                L34: {
                                                  if (uf.field_f[var3.field_I]) {
                                                    break L34;
                                                  } else {
                                                    this.field_v[var2] = null;
                                                    break L34;
                                                  }
                                                }
                                                if (var9 == 0) {
                                                  break L31;
                                                } else {
                                                  break L32;
                                                }
                                              } else {
                                                break L31;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (!ne.a(var3.field_g, (int)var3.field_i, (int)var3.field_m, var6.b((byte) 55), (int)var6.field_o, (int)var6.field_N)) {
                                        break L31;
                                      } else {
                                        this.a(ld.field_h[var3.field_I], (int)var3.field_m, gf.field_k[var3.field_I], (int)var3.field_i, 27396);
                                        this.field_v[var2] = null;
                                        break L31;
                                      }
                                    }
                                  }
                                  var5++;
                                  if (var9 == 0) {
                                    continue L30;
                                  } else {
                                    break L29;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var2++;
                        break L28;
                      }
                      if (var9 == 0) {
                        continue L27;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              L35: while (true) {
                L36: {
                  L37: {
                    if (stackIn_124_0 == null) {
                      break L37;
                    } else {
                      var5 = 0;
                      L38: while (true) {
                        if (var5 >= 1600) {
                          break L37;
                        } else {
                          var6 = this.field_n[var5];
                          if (var9 != 0) {
                            break L36;
                          } else {
                            L39: {
                              if (var6 == null) {
                                break L39;
                              } else {
                                L40: {
                                  if (wh.field_v[var6.field_Q]) {
                                    break L40;
                                  } else {
                                    if (!var6.a(false)) {
                                      break L39;
                                    } else {
                                      if (var6.field_s) {
                                        break L39;
                                      } else {
                                        if (ne.a(var3.field_g, (int)var3.field_i, (int)var3.field_m, var6.b((byte) 55), (int)var6.field_o, (int)var6.field_N)) {
                                          L41: {
                                            this.a(ld.field_h[var3.field_I], (int)var3.field_m, gf.field_k[var3.field_I], (int)var3.field_i, 27396);
                                            if (!var6.a(var3.field_t, 10)) {
                                              break L41;
                                            } else {
                                              this.a(120, var3, var6);
                                              if (cj.field_c[var6.field_Q]) {
                                                break L41;
                                              } else {
                                                this.field_n[var5].a(7769);
                                                this.field_n[var5] = null;
                                                break L41;
                                              }
                                            }
                                          }
                                          L42: {
                                            if (uf.field_f[var3.field_I]) {
                                              break L42;
                                            } else {
                                              this.field_v[var2] = null;
                                              break L42;
                                            }
                                          }
                                          if (var9 == 0) {
                                            break L39;
                                          } else {
                                            break L40;
                                          }
                                        } else {
                                          break L39;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (!ne.a(var3.field_g, (int)var3.field_i, (int)var3.field_m, var6.b((byte) 55), (int)var6.field_o, (int)var6.field_N)) {
                                  break L39;
                                } else {
                                  this.a(ld.field_h[var3.field_I], (int)var3.field_m, gf.field_k[var3.field_I], (int)var3.field_i, 27396);
                                  this.field_v[var2] = null;
                                  break L39;
                                }
                              }
                            }
                            var5++;
                            if (var9 == 0) {
                              continue L38;
                            } else {
                              break L37;
                            }
                          }
                        }
                      }
                    }
                  }
                  var2++;
                  break L36;
                }
                if (var9 == 0) {
                  if (800 <= var2) {
                    break L1;
                  } else {
                    var3 = this.field_v[var2];
                    if (var9 != 0) {
                      break L1;
                    } else {
                      stackOut_126_0 = (gf) (var3);
                      stackIn_124_0 = stackOut_126_0;
                      continue L35;
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            break L1;
          }
          return;
        }
    }

    private final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (-3 == (sd.field_e ^ -1)) {
          L0: {
            if (2 == this.field_q) {
              stackOut_4_0 = 381;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 305;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          var3 = stackIn_5_0;
          var4 = 0;
          L1: while (true) {
            L2: {
              L3: {
                if (var4 >= 20) {
                  break L3;
                } else {
                  bc.field_d.a(al.field_g[var4], var3 + -bc.field_d.field_w, 256);
                  var4++;
                  if (var5 != 0) {
                    break L2;
                  } else {
                    if (var5 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              if (param0 == 0) {
                break L2;
              } else {
                this.a(-86, -83);
                break L2;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    private final void k(int param0) {
        int var2 = 0;
        int var4 = 0;
        td stackIn_3_0 = null;
        td stackIn_15_0 = null;
        td stackIn_37_0 = null;
        td stackOut_2_0 = null;
        td stackOut_39_0 = null;
        td stackOut_14_0 = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = param0;
        L0: while (true) {
          L1: {
            L2: {
              L3: {
                if (-3802 >= (var2 ^ -1)) {
                  break L3;
                } else {
                  stackOut_2_0 = this.field_B[var2];
                  stackIn_37_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (var4 != 0) {
                    L4: while (true) {
                      L5: {
                        if (stackIn_37_0 == null) {
                          break L5;
                        } else {
                          if (null == pe.field_e) {
                            break L5;
                          } else {
                            if (!ck.field_j[var2].a((byte) -125)) {
                              break L5;
                            } else {
                              L6: {
                                if (!pe.field_e.field_j) {
                                  break L6;
                                } else {
                                  ck.field_j[var2] = null;
                                  if (var4 == 0) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              ck.field_j[var2] = new td(hi.a(6, qk.a(param0, 4), this.field_l), lc.field_m + hi.a(cj.field_e.field_h, 4, this.field_l), ti.field_a - -hi.a(cj.field_e.field_c, qk.a(param0, 4), this.field_l), -1);
                              break L5;
                            }
                          }
                        }
                      }
                      var2++;
                      if (var4 == 0) {
                        if (ck.field_j.length <= var2) {
                          break L1;
                        } else {
                          if (var4 != 0) {
                            break L1;
                          } else {
                            stackOut_39_0 = ck.field_j[var2];
                            stackIn_37_0 = stackOut_39_0;
                            continue L4;
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    L7: {
                      if (stackIn_3_0 != null) {
                        if (this.field_B[var2].a((byte) -106)) {
                          this.field_B[var2] = null;
                          break L7;
                        } else {
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                    var2++;
                    if (var4 == 0) {
                      continue L0;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              if (null != cj.field_e) {
                var2 = 0;
                L8: while (true) {
                  if (ck.field_j.length <= var2) {
                    break L1;
                  } else {
                    if (var4 != 0) {
                      break L1;
                    } else {
                      stackOut_14_0 = ck.field_j[var2];
                      stackIn_15_0 = stackOut_14_0;
                      L9: {
                        if (stackIn_15_0 == null) {
                          break L9;
                        } else {
                          if (null == pe.field_e) {
                            break L9;
                          } else {
                            if (!ck.field_j[var2].a((byte) -125)) {
                              break L9;
                            } else {
                              L10: {
                                if (!pe.field_e.field_j) {
                                  break L10;
                                } else {
                                  ck.field_j[var2] = null;
                                  if (var4 == 0) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              ck.field_j[var2] = new td(hi.a(6, qk.a(param0, 4), this.field_l), lc.field_m + hi.a(cj.field_e.field_h, 4, this.field_l), ti.field_a - -hi.a(cj.field_e.field_c, qk.a(param0, 4), this.field_l), -1);
                              break L9;
                            }
                          }
                        }
                      }
                      var2++;
                      if (var4 == 0) {
                        continue L8;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            break L1;
          }
          return;
        }
    }

    private final int h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        var3 = 17 % ((param0 - 0) / 36);
        L0: while (true) {
          L1: {
            if (null == this.field_v[var2]) {
              break L1;
            } else {
              var2++;
              if (var4 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          return var2;
        }
    }

    private final void l(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param0 == -1601) {
            break L0;
          } else {
            this.I(-47);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          L2: {
            if (-1601 >= (var2 ^ -1)) {
              break L2;
            } else {
              if (var3 != 0) {
                break L2;
              } else {
                L3: {
                  if (this.field_n[var2] == null) {
                    break L3;
                  } else {
                    this.field_n[var2].j(30325);
                    break L3;
                  }
                }
                var2++;
                if (var3 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          return;
        }
    }

    private final void f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param0 <= -111) {
            break L0;
          } else {
            this.field_X = -33;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          L2: {
            if (160 <= var2) {
              break L2;
            } else {
              if (var3 != 0) {
                break L2;
              } else {
                L3: {
                  if (this.field_d[var2] == null) {
                    break L3;
                  } else {
                    this.field_d[var2].b((byte) -114);
                    break L3;
                  }
                }
                var2++;
                if (var3 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          return;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = this.l((byte) 113);
        td var7 = new td(param0, param3, param1, param2);
        if (param4 != 27396) {
            return;
        }
        this.field_B[var6] = var7;
    }

    private final int l(byte param0) {
        int var2 = 0;
        ArrayIndexOutOfBoundsException var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 >= 24) {
          var2 = 0;
          try {
            L0: {
              L1: while (true) {
                L2: {
                  if (this.field_B[var2] == null) {
                    break L2;
                  } else {
                    var2++;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                break L0;
              }
            }
          } catch (java.lang.ArrayIndexOutOfBoundsException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L3: {
              var3 = (ArrayIndexOutOfBoundsException) (Object) decompiledCaughtException;
              var2 = 0;
              this.field_B = new td[this.field_B.length];
              break L3;
            }
          }
          return var2;
        } else {
          return 68;
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        bf var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = param0;
        L0: while (true) {
          L1: {
            if (var2 >= 1600) {
              break L1;
            } else {
              var3 = this.field_n[var2];
              if (var5 != 0) {
                break L1;
              } else {
                L2: {
                  if (var3 == null) {
                    break L2;
                  } else {
                    if (!var3.d((byte) 119)) {
                      break L2;
                    } else {
                      L3: {
                        this.field_n[var2].a(7769);
                        this.field_n[var2] = null;
                        if (var3.a(false)) {
                          break L3;
                        } else {
                          if (-9 == (var3.field_Q ^ -1)) {
                            break L3;
                          } else {
                            if ((var3.field_Q ^ -1) == -10) {
                              break L3;
                            } else {
                              if (var3.field_Q != 10) {
                                cj.field_b = cj.field_b | 1 << this.field_q;
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                      var4 = var3.field_Q;
                      if (-1 >= (wh.field_x[var4] ^ -1)) {
                        break L2;
                      } else {
                        L4: {
                          if (0 < var3.field_H) {
                            this.c((byte) -61, -wh.field_x[var4]);
                            this.field_T = this.field_T + 1;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        this.field_X = this.field_X + 1;
                        break L2;
                      }
                    }
                  }
                }
                var2++;
                if (var5 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
          }
          return;
        }
    }

    private final int e(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param0 == 2183) {
            break L0;
          } else {
            this.field_S = -10;
            break L0;
          }
        }
        var2 = -1 + this.field_n.length;
        L1: while (true) {
          L2: {
            if (null == this.field_n[var2]) {
              break L2;
            } else {
              var2--;
              if (var3 == 0) {
                continue L1;
              } else {
                break L2;
              }
            }
          }
          return var2;
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4_int = 0;
        bf var4 = null;
        int var5 = 0;
        Object var6 = null;
        int var7 = 0;
        L0: {
          L1: {
            L2: {
              var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
              var2 = this.field_G.field_c.length;
              var3 = -50;
              var4_int = this.field_q;
              if (6 != var4_int) {
                break L2;
              } else {
                if (var7 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (7 == var4_int) {
              break L1;
            } else {
              if ((var4_int ^ -1) != -9) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var3 = -25;
          break L0;
        }
        L3: {
          if (param0 >= 112) {
            break L3;
          } else {
            this.field_C = 62;
            break L3;
          }
        }
        var5 = 0;
        L4: while (true) {
          L5: {
            if (var5 >= var2) {
              break L5;
            } else {
              var4 = this.field_G.field_c[var5];
              if (var7 != 0) {
                break L5;
              } else {
                L6: {
                  if (var4 == null) {
                    break L6;
                  } else {
                    L7: {
                      var6 = null;
                      if ((640 + this.field_J ^ -1) != (var4.field_k ^ -1)) {
                        if (-1 != (this.field_J ^ -1)) {
                          break L7;
                        } else {
                          if ((var4.field_k ^ -1) > (640 + this.field_J ^ -1)) {
                            var6 = this.a(-var4.field_W + (430 - -var3), true, var4.field_Q, var4.field_k, var4.field_J, true);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      } else {
                        var6 = this.a(var3 + (430 - var4.field_W), false, var4.field_Q, this.field_J, var4.field_J, true);
                        break L7;
                      }
                    }
                    if (var6 == null) {
                      break L6;
                    } else {
                      if (((bf) (var6)).field_Q != 38) {
                        break L6;
                      } else {
                        ((bf) (var6)).field_H = ((bf) (var6)).field_H * (1 - -this.field_q);
                        break L6;
                      }
                    }
                  }
                }
                var5++;
                if (var7 == 0) {
                  continue L4;
                } else {
                  break L5;
                }
              }
            }
          }
          return;
        }
    }

    final boolean C(int param0) {
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          if (param0 == 31578) {
            break L0;
          } else {
            this.b((byte) 45, -85);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!oh.a(param0 ^ 31578)) {
              break L2;
            } else {
              L3: {
                if (0 != ej.field_h) {
                  break L3;
                } else {
                  if ((sd.field_a.field_H ^ -1) != -1) {
                    break L3;
                  } else {
                    if ((sd.field_a.field_q ^ -1) == -1) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              stackOut_7_0 = 1;
              stackIn_9_0 = stackOut_7_0;
              break L1;
            }
          }
          stackOut_8_0 = 0;
          stackIn_9_0 = stackOut_8_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    private final void t(int param0) {
        int discarded$6 = 0;
        int discarded$7 = 0;
        int var2 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (-1 == (ue.field_b ^ -1)) {
          L0: {
            this.i((byte) -1);
            if (we.field_f >= 96) {
              stackOut_4_0 = 96;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = we.field_f;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_5_0;
            if (param0 == 1) {
              break L1;
            } else {
              field_ib = -60;
              break L1;
            }
          }
          L2: {
            L3: {
              L4: {
                if (this.field_q == 0) {
                  break L4;
                } else {
                  if (3 != this.field_q) {
                    break L2;
                  } else {
                    if ((gm.field_J ^ -1) >= -1) {
                      if (ol.field_i.length <= el.field_tb) {
                        break L3;
                      } else {
                        discarded$6 = cb.field_b.a(ol.field_i[el.field_tb], 0, 334, 544, 96, 16777215, 0, 2, 1, cb.field_b.field_x);
                        al.field_a[1].a(-al.field_a[1].field_h + var2 + 640, 430 - al.field_a[1].field_c);
                        if (!DrPhlogistonSavesTheEarth.field_D) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                }
              }
              if ((-1 + ol.field_i.length ^ -1) >= (el.field_tb ^ -1)) {
                break L3;
              } else {
                discarded$7 = cb.field_b.a(ol.field_i[el.field_tb], 0, 334, 544, 96, 16777215, 0, 2, 1, cb.field_b.field_x);
                al.field_a[0].a(var2 - -640 - al.field_a[0].field_h, -al.field_a[0].field_c + 430);
                break L2;
              }
            }
            break L2;
          }
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, byte param2) {
        if (param2 > -75) {
            return;
        }
        int var4 = 1 << param0;
        if (!((var4 & hi.field_j ^ -1) == -1)) {
            return;
        }
        hi.field_j = hi.field_j | var4;
        ej.field_h = ej.field_h | var4;
        this.field_I.a(new fj(param0), 255);
        if (!(this.field_W)) {
            nf.field_x.a(new je(param0, param1, this.field_Q, this.field_P, this.field_p, this.field_C), 255);
        }
    }

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var2 = 0;
          if (param0 < 0) {
            break L0;
          } else {
            this.a(36, -16, 69, 83, -103);
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            L3: {
              if (2 <= var2) {
                break L3;
              } else {
                stackOut_3_0 = 0;
                stackIn_12_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (var4 != 0) {
                  break L2;
                } else {
                  var3 = stackIn_4_0;
                  L4: while (true) {
                    L5: {
                      L6: {
                        if (var3 >= 20) {
                          break L6;
                        } else {
                          vi.field_h[var2][var3].c(-1);
                          var3++;
                          if (var4 != 0) {
                            break L5;
                          } else {
                            if (var4 == 0) {
                              continue L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      var2++;
                      break L5;
                    }
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
            stackOut_11_0 = 0;
            stackIn_12_0 = stackOut_11_0;
            break L2;
          }
          var5 = stackIn_12_0;
          var2 = var5;
          L7: while (true) {
            L8: {
              if ((var5 ^ -1) <= -3802) {
                break L8;
              } else {
                if (var4 != 0) {
                  break L8;
                } else {
                  L9: {
                    if (this.field_hb[var5] == null) {
                      break L9;
                    } else {
                      this.field_hb[var5].a(true);
                      break L9;
                    }
                  }
                  var5++;
                  if (var4 == 0) {
                    continue L7;
                  } else {
                    break L8;
                  }
                }
              }
            }
            return;
          }
        }
    }

    j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_15_0 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        this.field_U = false;
        this.field_F = false;
        this.field_ab = false;
        this.field_W = false;
        this.field_I = new vd();
        this.field_o = 10;
        this.field_c = 0.0;
        this.field_A = 1;
        this.field_d = new ib[160];
        this.field_gb = 255;
        this.field_t = new int[4];
        this.field_P = 268435455;
        this.field_u = 0;
        this.field_m = new gf[1400];
        this.field_w = 3;
        this.field_L = 1;
        this.field_n = new bf[1600];
        this.field_bb = 0;
        this.field_hb = new td[3801];
        this.field_E = 0;
        this.field_Z = 0;
        this.field_O = true;
        this.field_s = 2147483647;
        this.field_T = 0;
        this.field_S = 0;
        this.field_a = false;
        this.field_D = 190.0;
        this.field_B = new td[3801];
        this.field_R = 0;
        this.field_X = 0;
        this.field_b = 0;
        this.field_h = new ck[3];
        this.field_j = 0.0;
        this.field_v = new gf[800];
        this.field_H = 0;
        this.field_cb = new int[77];
        this.field_N = (double)(-am.field_l);
        this.field_Q = 0;
        this.field_k = null;
        this.field_p = this.field_Q ^ this.field_P;
        this.field_C = 268435456 - this.field_p;
        this.field_eb = false;
        this.field_fb = -1;
        this.field_J = 0;
        ib.field_t = 0;
        qk.field_c = true;
        ej.field_h = 0;
        this.field_l = new Random(9416L);
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (64 <= var2) {
                break L2;
              } else {
                i.field_c[var2] = hi.a(430, 4, this.field_l);
                var2++;
                if (var4 != 0) {
                  break L1;
                } else {
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var2 = 0;
            break L1;
          }
          L3: while (true) {
            L4: {
              L5: {
                if (var2 >= 2) {
                  break L5;
                } else {
                  tc.field_f[var2] = (double)(hi.a(640, 4, this.field_l) - 100);
                  vj.field_f[var2] = (double)(-hi.a(1720, 4, this.field_l));
                  stackOut_6_0 = 0;
                  stackIn_16_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (var4 != 0) {
                    break L4;
                  } else {
                    var3 = stackIn_7_0;
                    L6: while (true) {
                      L7: {
                        L8: {
                          L9: {
                            if (20 <= var3) {
                              break L9;
                            } else {
                              vi.field_h[var2][var3] = new ck();
                              var3++;
                              if (var4 != 0) {
                                break L8;
                              } else {
                                if (var4 == 0) {
                                  continue L6;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                          if (hi.a(5, 4, this.field_l) < 4) {
                            break L8;
                          } else {
                            lh.field_n[var2] = 2102528;
                            if (var4 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        lh.field_n[var2] = 1052688;
                        break L7;
                      }
                      var2++;
                      if (var4 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
              }
              stackOut_15_0 = 0;
              stackIn_16_0 = stackOut_15_0;
              break L4;
            }
            var2 = stackIn_16_0;
            L10: while (true) {
              L11: {
                L12: {
                  if (var2 >= 75) {
                    break L12;
                  } else {
                    wa.field_Q[var2] = hi.a(1280, 4, this.field_l);
                    we.field_e[var2] = 107 + hi.a(215, 4, this.field_l);
                    jf.field_ib[var2] = hi.a(65535, 4, this.field_l);
                    hh.field_a[var2] = hi.a(4096, 4, this.field_l) * hi.a(2048, 4, this.field_l) >> -309920180;
                    wi.field_f[var2] = hi.a(5, 4, this.field_l);
                    md.field_c[var2] = 15 + hi.a(10, 4, this.field_l);
                    var2++;
                    if (var4 != 0) {
                      break L11;
                    } else {
                      if (var4 == 0) {
                        continue L10;
                      } else {
                        break L12;
                      }
                    }
                  }
                }
                this.field_x = -1901789184;
                gm.field_J = 0;
                this.field_g = 15132;
                qe.field_a = -150;
                this.field_f = 0;
                this.field_q = -1 + param0;
                this.field_M = ag.a(nl.field_r[5], 256, dg.field_e * 24 / 80);
                this.field_M.c(0, nl.field_r[5].field_i.length);
                this.field_M.f(-1);
                this.field_z = ag.a(nl.field_r[7], 256, 48);
                break L11;
              }
              var2 = 0;
              L13: while (true) {
                L14: {
                  L15: {
                    if (var2 >= this.field_h.length) {
                      break L15;
                    } else {
                      this.field_h[var2] = new ck();
                      var2++;
                      if (var4 != 0) {
                        break L14;
                      } else {
                        if (var4 == 0) {
                          continue L13;
                        } else {
                          break L15;
                        }
                      }
                    }
                  }
                  this.a(255, 0);
                  break L14;
                }
                return;
              }
            }
          }
        }
    }

    static {
        field_V = new db(0);
        field_Y = "Logging in...";
    }
}
