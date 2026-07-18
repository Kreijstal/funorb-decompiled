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
        RuntimeException var2 = null;
        int var2_int = 0;
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
        double stackIn_7_0 = 0.0;
        gg stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        gg stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        int stackIn_69_2 = 0;
        gg stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        int stackIn_70_2 = 0;
        int stackIn_70_3 = 0;
        RuntimeException decompiledCaughtException = null;
        double stackOut_6_0 = 0.0;
        double stackOut_4_0 = 0.0;
        gg stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        int stackOut_66_2 = 0;
        gg stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        int stackOut_69_2 = 0;
        int stackOut_69_3 = 0;
        gg stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        int stackOut_67_2 = 0;
        int stackOut_67_3 = 0;
        var16 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (param0 == 0) {
              L1: {
                var5 = (double)((j) this).field_G.field_h.length;
                var7 = var5 - 640.0;
                if (var7 <= (double)((j) this).field_J) {
                  stackOut_6_0 = var7;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_4_0 = (double)((j) this).field_J;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              }
              L2: {
                L3: {
                  L4: {
                    var9 = (int)stackIn_7_0;
                    var11 = ((j) this).field_q;
                    if (0 == var11) {
                      L5: {
                        v.field_O.a(0, 0);
                        var3 = oi.field_f.field_d;
                        if (sd.field_e != 2) {
                          break L5;
                        } else {
                          this.b((byte) -51);
                          break L5;
                        }
                      }
                      L6: {
                        var4 = (int)((double)(-var9 * (var3 + -640)) / var7);
                        if (sd.field_e == 0) {
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
                        break L2;
                      } else {
                        break L4;
                      }
                    } else {
                      L7: {
                        if (var11 != 1) {
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
                                  var2_int = 0;
                                  L14: while (true) {
                                    L15: {
                                      L16: {
                                        if (var2_int >= 2) {
                                          break L16;
                                        } else {
                                          hc.field_K[var2_int].a((int)((double)((var3 - 640) * -var9) / var7), 0, 450);
                                          var2_int++;
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
                                      if (var11 != 5) {
                                        break L17;
                                      } else {
                                        if (var16 == 0) {
                                          break L12;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                    if (var11 == 6) {
                                      break L11;
                                    } else {
                                      L18: {
                                        if (var11 != 7) {
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
                                        break L2;
                                      }
                                    }
                                  }
                                }
                              }
                              nb.field_b.a(0, 0);
                              var3 = hc.field_K[0].field_z * 2;
                              var10 = (int)((double)((-640 + var3) * -var9) / var7);
                              var2_int = 0;
                              L19: while (true) {
                                L20: {
                                  L21: {
                                    if (var2_int >= 2) {
                                      break L21;
                                    } else {
                                      hc.field_K[var2_int].a(var10, 0, 450);
                                      var2_int++;
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
                                if (sd.field_e != 2) {
                                  break L2;
                                } else {
                                  var2_int = 0;
                                  L22: while (true) {
                                    L23: {
                                      L24: {
                                        if (var2_int >= 75) {
                                          break L24;
                                        } else {
                                          var11 = wi.field_f[var2_int];
                                          var12 = wa.field_Q[var2_int] - var9 / md.field_c[var2_int];
                                          var13 = we.field_e[var2_int];
                                          var14 = jf.field_ib[var2_int];
                                          var15 = hh.field_a[var2_int];
                                          kl.field_R[var11].a(5, var13, var15, var14, var12);
                                          var2_int++;
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
                            var2_int = 0;
                            L25: while (true) {
                              L26: {
                                L27: {
                                  if (2 <= var2_int) {
                                    break L27;
                                  } else {
                                    hc.field_K[var2_int].a((int)((double)((var3 - 640) * -var9) / var7), 0, 450);
                                    var2_int++;
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
                    if (sd.field_e == 0) {
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
                        stackOut_66_0 = (gg) var11_ref_gg;
                        stackOut_66_1 = -1093327740;
                        stackOut_66_2 = 16777215;
                        stackIn_69_0 = stackOut_66_0;
                        stackIn_69_1 = stackOut_66_1;
                        stackIn_69_2 = stackOut_66_2;
                        stackIn_67_0 = stackOut_66_0;
                        stackIn_67_1 = stackOut_66_1;
                        stackIn_67_2 = stackOut_66_2;
                        if (sd.field_e != 2) {
                          stackOut_69_0 = (gg) (Object) stackIn_69_0;
                          stackOut_69_1 = stackIn_69_1;
                          stackOut_69_2 = stackIn_69_2;
                          stackOut_69_3 = 0;
                          stackIn_70_0 = stackOut_69_0;
                          stackIn_70_1 = stackOut_69_1;
                          stackIn_70_2 = stackOut_69_2;
                          stackIn_70_3 = stackOut_69_3;
                          break L31;
                        } else {
                          stackOut_67_0 = (gg) (Object) stackIn_67_0;
                          stackOut_67_1 = stackIn_67_1;
                          stackOut_67_2 = stackIn_67_2;
                          stackOut_67_3 = 1;
                          stackIn_70_0 = stackOut_67_0;
                          stackIn_70_1 = stackOut_67_1;
                          stackIn_70_2 = stackOut_67_2;
                          stackIn_70_3 = stackOut_67_3;
                          break L31;
                        }
                      }
                      ((gg) (Object) stackIn_70_0).a(stackIn_70_1, stackIn_70_2, stackIn_70_3 != 0, var14 | (var13 | var12));
                      break L30;
                    }
                  }
                }
                L32: {
                  var3 = uk.field_h.field_d;
                  var4 = (int)((double)((var3 + -640) * -var9) / var7);
                  if (sd.field_e == 0) {
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
                break L2;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.C(" + param0 + ')');
        }
    }

    private final void E(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  ((j) this).field_D = ((j) this).field_D + ((j) this).field_j;
                  ((j) this).field_N = ((j) this).field_N + ((j) this).field_c;
                  if (!((j) this).field_U) {
                    break L3;
                  } else {
                    if (0 < ((j) this).field_w) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (~((j) this).field_G.field_h.length < ~(((j) this).field_J - -640)) {
                  break L2;
                } else {
                  if (((j) this).field_eb) {
                    break L2;
                  } else {
                    L4: {
                      if (!((j) this).field_ab) {
                        break L4;
                      } else {
                        if (150 <= gm.field_J) {
                          break L4;
                        } else {
                          break L1;
                        }
                      }
                    }
                    ((j) this).field_c = 5.0;
                    if (!DrPhlogistonSavesTheEarth.field_D) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L5: {
                if (((j) this).field_D < 0.0) {
                  ((j) this).field_j = 0.0;
                  ((j) this).field_D = 0.0;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if ((double)ri.field_e + ((j) this).field_D <= 430.0) {
                  break L6;
                } else {
                  ((j) this).field_j = 0.0;
                  ((j) this).field_D = (double)(430 - ri.field_e);
                  break L6;
                }
              }
              L7: {
                if (0.0 <= ((j) this).field_N) {
                  break L7;
                } else {
                  ((j) this).field_N = 0.0;
                  ((j) this).field_c = 0.0;
                  break L7;
                }
              }
              L8: {
                if (((j) this).field_N + (double)am.field_l <= 640.0) {
                  break L8;
                } else {
                  ((j) this).field_c = 0.0;
                  ((j) this).field_N = (double)(-am.field_l + 640);
                  break L8;
                }
              }
              ((j) this).field_j = ((j) this).field_j - ((j) this).field_j / 20.0;
              ((j) this).field_c = ((j) this).field_c - ((j) this).field_c / 20.0;
              break L1;
            }
            L9: {
              ((j) this).field_M.l(e.a(125, (int)((j) this).field_N));
              ((j) this).field_z.l(e.a(119, (int)((j) this).field_N));
              if (param0 == -8499) {
                break L9;
              } else {
                this.k(-18);
                break L9;
              }
            }
            L10: {
              if (((j) this).field_z.m()) {
                if (((j) this).field_z.f() != ((vk) (Object) ((j) this).field_z.field_i).field_i.length) {
                  break L10;
                } else {
                  ((j) this).field_z.i(-1);
                  th.a(-27610, 32, e.a(105, (int)((j) this).field_N), nl.field_r[8]);
                  break L10;
                }
              } else {
                break L10;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.D(" + param0 + ')');
        }
    }

    final void d(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (hb.field_g > 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_2_0 = 11;
                stackIn_5_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              L3: {
                tc.field_d = stackIn_5_0;
                if (ej.field_h == 0) {
                  break L3;
                } else {
                  ek.a(-76, false, 9);
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (0 != ((j) this).field_H) {
                  break L4;
                } else {
                  ek.a(-109, false, 0);
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              ek.a(-106, false, 2);
              break L2;
            }
            L5: {
              if (param0 > 35) {
                break L5;
              } else {
                this.E(-104);
                break L5;
              }
            }
            L6: {
              if (!((j) this).C(31578)) {
                break L6;
              } else {
                r.field_d = 5;
                break L6;
              }
            }
            L7: {
              if (!oh.a(0)) {
                bf.field_h = ((j) this).j((byte) -68);
                break L7;
              } else {
                break L7;
              }
            }
            var2_int = 0;
            L8: while (true) {
              L9: {
                L10: {
                  if (~((j) this).field_n.length >= ~var2_int) {
                    break L10;
                  } else {
                    if (var3 != 0) {
                      break L9;
                    } else {
                      L11: {
                        if (null == ((j) this).field_n[var2_int]) {
                          break L11;
                        } else {
                          ((j) this).field_n[var2_int].a(7769);
                          break L11;
                        }
                      }
                      var2_int++;
                      if (var3 == 0) {
                        continue L8;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                break L9;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.GB(" + param0 + ')');
        }
    }

    public static void h(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_db = null;
              field_V = null;
              if (param0 == 24342) {
                break L1;
              } else {
                j.h(-24);
                break L1;
              }
            }
            field_Y = null;
            field_K = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var1, "j.TB(" + param0 + ')');
        }
    }

    private final void c(bf param0, int param1) {
        RuntimeException runtimeException = null;
        double var3_double = 0.0;
        double var5 = 0.0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.field_s) {
                  break L1;
                } else {
                  if (0 <= ((j) this).field_fb) {
                    break L1;
                  } else {
                    L2: {
                      var3_double = ((j) this).field_c - param0.field_l;
                      var5 = -param0.field_j + ((j) this).field_j;
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
                          ((j) this).field_c = -(var3_double / 2.0) + param0.field_l;
                          ((j) this).field_j = param0.field_j - var5 / 2.0;
                          if (!DrPhlogistonSavesTheEarth.field_D) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      ((j) this).field_c = param0.field_l - var3_double;
                      ((j) this).field_j = -var5 + param0.field_j;
                      break L3;
                    }
                    ((j) this).field_N = ((j) this).field_N + ((j) this).field_c;
                    ((j) this).field_D = ((j) this).field_D + ((j) this).field_j;
                    break L0;
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) runtimeException;
            stackOut_21_1 = new StringBuilder().append("j.OB(");
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L5;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param1 + ')');
        }
    }

    final void s(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            if (param0 > 79) {
              L1: while (true) {
                L2: {
                  L3: {
                    if (~((j) this).field_m.length >= ~var2_int) {
                      break L3;
                    } else {
                      ((j) this).field_m[var2_int] = null;
                      var2_int++;
                      if (var3 != 0) {
                        break L2;
                      } else {
                        if (var3 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var2_int = 0;
                  break L2;
                }
                L4: while (true) {
                  L5: {
                    L6: {
                      if (((j) this).field_v.length <= var2_int) {
                        break L6;
                      } else {
                        ((j) this).field_v[var2_int] = null;
                        var2_int++;
                        if (var3 != 0) {
                          break L5;
                        } else {
                          if (var3 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    var2_int = 0;
                    break L5;
                  }
                  L7: while (true) {
                    L8: {
                      L9: {
                        if (~((j) this).field_d.length >= ~var2_int) {
                          break L9;
                        } else {
                          ((j) this).field_d[var2_int] = null;
                          var2_int++;
                          if (var3 != 0) {
                            break L8;
                          } else {
                            if (var3 == 0) {
                              continue L7;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      var2_int = 0;
                      break L8;
                    }
                    L10: while (true) {
                      L11: {
                        L12: {
                          if (((j) this).field_n.length <= var2_int) {
                            break L12;
                          } else {
                            if (var3 != 0) {
                              break L11;
                            } else {
                              L13: {
                                if (null == ((j) this).field_n[var2_int]) {
                                  break L13;
                                } else {
                                  ((j) this).field_n[var2_int].a(7769);
                                  break L13;
                                }
                              }
                              ((j) this).field_n[var2_int] = null;
                              var2_int++;
                              if (var3 == 0) {
                                continue L10;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        var2_int = 0;
                        break L11;
                      }
                      L14: while (true) {
                        L15: {
                          L16: {
                            if (~((j) this).field_B.length >= ~var2_int) {
                              break L16;
                            } else {
                              ((j) this).field_B[var2_int] = null;
                              var2_int++;
                              if (var3 != 0) {
                                break L15;
                              } else {
                                if (var3 == 0) {
                                  continue L14;
                                } else {
                                  break L16;
                                }
                              }
                            }
                          }
                          bc.field_d.c();
                          wj.c();
                          lb.field_C.a(119);
                          fc.field_a = 0;
                          ((j) this).field_b = 0;
                          bc.field_f = 0;
                          bg.field_k = 0;
                          ((j) this).field_U = false;
                          nf.field_u = 0;
                          ((j) this).field_J = 0;
                          dg.field_c = 0;
                          lh.field_m = 0;
                          ((j) this).field_Z = 0;
                          ((j) this).field_ab = false;
                          ((j) this).field_u = 0;
                          gi.field_f = 0;
                          ((j) this).field_S = 0;
                          hl.field_d = false;
                          cj.field_b = 0;
                          break L15;
                        }
                        break L0;
                      }
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.PB(" + param0 + ')');
        }
    }

    private final void w(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 18) {
                break L1;
              } else {
                field_ib = -47;
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var2_int >= 160) {
                    break L4;
                  } else {
                    if (var3 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (null == ((j) this).field_d[var2_int]) {
                          break L5;
                        } else {
                          bc.field_f = bc.field_f | 1 << ((j) this).field_q;
                          if (!((j) this).field_d[var2_int].a((byte) -127)) {
                            break L5;
                          } else {
                            ((j) this).field_d[var2_int] = null;
                            nf.field_u = nf.field_u | 1 << ((j) this).field_q;
                            break L5;
                          }
                        }
                      }
                      var2_int++;
                      if (var3 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.HB(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, bf param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        td var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param4 <= -106) {
                break L1;
              } else {
                this.G(127);
                break L1;
              }
            }
            L2: {
              var6_int = this.l((byte) 105);
              var7 = new td(param3.field_w, param0, param1, param2);
              if (param3.h(-83)) {
                pe.field_e = var7;
                break L2;
              } else {
                break L2;
              }
            }
            ((j) this).field_B[var6_int] = var7;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("j.LA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param4 + ')');
        }
    }

    private final void x(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                if (var2_int >= 3801) {
                  break L2;
                } else {
                  L3: {
                    if (null != ((j) this).field_B[var2_int]) {
                      ((j) this).field_B[var2_int].a(true);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var2_int++;
                  if (var4 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                L5: {
                  var3 = 68 % ((16 - param0) / 58);
                  if (null != cj.field_e) {
                    var2_int = 0;
                    L6: while (true) {
                      if (ck.field_j.length <= var2_int) {
                        break L5;
                      } else {
                        if (var4 != 0) {
                          break L4;
                        } else {
                          L7: {
                            if (null == ck.field_j[var2_int]) {
                              break L7;
                            } else {
                              ck.field_j[var2_int].a(true);
                              break L7;
                            }
                          }
                          var2_int++;
                          if (var4 == 0) {
                            continue L6;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                break L4;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ie.a((Throwable) (Object) runtimeException, "j.PA(" + param0 + ')');
        }
    }

    private final void b(bf param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        ((j) this).field_cb[param0.field_Q] = ((j) this).field_cb[param0.field_Q] + 1;
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
                        if (var3_int != 47) {
                          break L8;
                        } else {
                          if (var4 == 0) {
                            break L5;
                          } else {
                            break L8;
                          }
                        }
                      }
                      if (var3_int == 4) {
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
                        if (var3_int == 13) {
                          break L3;
                        } else {
                          L10: {
                            if (var3_int != 12) {
                              break L10;
                            } else {
                              if (var4 == 0) {
                                break L2;
                              } else {
                                break L10;
                              }
                            }
                          }
                          if (var3_int != 36) {
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
                    if (((j) this).field_cb[47] + (((j) this).field_cb[2] + ((j) this).field_cb[39]) != 15) {
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
                  if (15 != ((j) this).field_cb[param0.field_Q]) {
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
                if (((j) this).field_cb[14] - -((j) this).field_cb[13] == 15) {
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
              if (((j) this).field_cb[36] + ((j) this).field_cb[12] == 15) {
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
                ((j) this).field_L = 106;
                break L11;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) var3;
            stackOut_69_1 = new StringBuilder().append("j.SA(");
            stackIn_72_0 = stackOut_69_0;
            stackIn_72_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param0 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L12;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_73_0 = stackOut_70_0;
              stackIn_73_1 = stackOut_70_1;
              stackIn_73_2 = stackOut_70_2;
              break L12;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + ',' + param1 + ')');
        }
    }

    private final void d(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_26_0 = null;
        boolean stackIn_35_0 = false;
        boolean stackIn_36_0 = false;
        boolean stackIn_38_0 = false;
        boolean stackIn_39_0 = false;
        boolean stackIn_41_0 = false;
        boolean stackIn_42_0 = false;
        boolean stackIn_44_0 = false;
        boolean stackIn_46_0 = false;
        boolean stackIn_47_0 = false;
        int stackIn_47_1 = 0;
        Object stackIn_50_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_25_0 = null;
        boolean stackOut_34_0 = false;
        boolean stackOut_35_0 = false;
        boolean stackOut_36_0 = false;
        boolean stackOut_38_0 = false;
        boolean stackOut_39_0 = false;
        boolean stackOut_41_0 = false;
        boolean stackOut_46_0 = false;
        int stackOut_46_1 = 0;
        boolean stackOut_42_0 = false;
        boolean stackOut_44_0 = false;
        int stackOut_44_1 = 0;
        Object stackOut_49_0 = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (!((j) this).field_eb) {
              L1: {
                ((j) this).field_w = ((j) this).field_w - 1;
                ((j) this).a(255, 0);
                gi.a(((j) this).field_M, param0 ^ -6799);
                if (((j) this).field_q >= 0) {
                  fc.field_a = fc.field_a | 1 << ((j) this).field_q;
                  gi.field_f = gi.field_f | 1 << ((j) this).field_q;
                  break L1;
                } else {
                  break L1;
                }
              }
              ((j) this).field_fb = 225;
              L2: while (true) {
                L3: {
                  L4: {
                    if (((j) this).field_L <= 1) {
                      break L4;
                    } else {
                      ((j) this).field_d[this.f(qk.a(param0, -6111))] = new ib(((j) this).field_N, ((j) this).field_D, 7, true, false);
                      ((j) this).field_L = ((j) this).field_L - 1;
                      if (var5 != 0) {
                        break L3;
                      } else {
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L5: while (true) {
                    L6: {
                      if (((j) this).field_A <= 1) {
                        break L6;
                      } else {
                        ((j) this).field_d[this.f(0)] = new ib(((j) this).field_N, ((j) this).field_D, 1, true, false);
                        ((j) this).field_A = ((j) this).field_A - 1;
                        if (var5 != 0) {
                          break L3;
                        } else {
                          if (var5 == 0) {
                            continue L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    ((j) this).field_u = 0;
                    break L3;
                  }
                }
                L7: {
                  if (param0 == -6111) {
                    break L7;
                  } else {
                    this.k((byte) -99);
                    break L7;
                  }
                }
                L8: {
                  L9: {
                    ((j) this).field_S = 0;
                    var2_int = e.a(110, (int)((j) this).field_N);
                    if (((j) this).field_w > 0) {
                      break L9;
                    } else {
                      tc.field_i = false;
                      var3 = 0;
                      L10: while (true) {
                        L11: {
                          L12: {
                            if (~var3 <= ~((j) this).field_n.length) {
                              break L12;
                            } else {
                              stackOut_25_0 = this;
                              stackIn_50_0 = stackOut_25_0;
                              stackIn_26_0 = stackOut_25_0;
                              if (var5 != 0) {
                                break L11;
                              } else {
                                L13: {
                                  if (((j) this).field_n[var3] == null) {
                                    break L13;
                                  } else {
                                    if (!((j) this).field_n[var3].field_s) {
                                      L14: {
                                        L15: {
                                          var4 = ((j) this).field_n[var3].field_Q;
                                          stackOut_34_0 = tc.field_i;
                                          stackIn_44_0 = stackOut_34_0;
                                          stackIn_35_0 = stackOut_34_0;
                                          if (var4 == 5) {
                                            break L15;
                                          } else {
                                            stackOut_35_0 = stackIn_35_0;
                                            stackIn_44_0 = stackOut_35_0;
                                            stackIn_36_0 = stackOut_35_0;
                                            if (var4 == 11) {
                                              break L15;
                                            } else {
                                              stackOut_36_0 = stackIn_36_0;
                                              stackIn_38_0 = stackOut_36_0;
                                              stackOut_38_0 = stackIn_38_0;
                                              stackIn_44_0 = stackOut_38_0;
                                              stackIn_39_0 = stackOut_38_0;
                                              if (var4 == 17) {
                                                break L15;
                                              } else {
                                                stackOut_39_0 = stackIn_39_0;
                                                stackIn_41_0 = stackOut_39_0;
                                                stackOut_41_0 = stackIn_41_0;
                                                stackIn_46_0 = stackOut_41_0;
                                                stackIn_42_0 = stackOut_41_0;
                                                if (var4 != 18) {
                                                  stackOut_46_0 = stackIn_46_0;
                                                  stackOut_46_1 = 0;
                                                  stackIn_47_0 = stackOut_46_0;
                                                  stackIn_47_1 = stackOut_46_1;
                                                  break L14;
                                                } else {
                                                  stackOut_42_0 = stackIn_42_0;
                                                  stackIn_44_0 = stackOut_42_0;
                                                  break L15;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        stackOut_44_0 = stackIn_44_0;
                                        stackOut_44_1 = 1;
                                        stackIn_47_0 = stackOut_44_0;
                                        stackIn_47_1 = stackOut_44_1;
                                        break L14;
                                      }
                                      tc.field_i = stackIn_47_0 | stackIn_47_1 != 0;
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                var3++;
                                if (var5 == 0) {
                                  continue L10;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                          sc.a(param0 + 6110, false, dm.field_x);
                          ((j) this).field_eb = true;
                          th.a(-27610, 64, var2_int, nl.field_r[9]);
                          this.o(param0 ^ -6049);
                          stackOut_49_0 = this;
                          stackIn_50_0 = stackOut_49_0;
                          break L11;
                        }
                        ((j) this).field_s = ((j) this).field_J;
                        if (var5 == 0) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  this.a(9, ri.field_q + (int)((j) this).field_D, -1, (int)((j) this).field_N - -am.field_p, param0 ^ -31963);
                  ((j) this).field_z.j(64);
                  od.a(param0 ^ 1630761897, ((j) this).field_z);
                  break L8;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.DB(" + param0 + ')');
        }
    }

    private final void g(int param0) {
        RuntimeException var2 = null;
        double var2_double = 0.0;
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
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        he stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        he stackIn_25_0 = null;
        he stackIn_27_0 = null;
        he stackIn_29_0 = null;
        he stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        he stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        int stackIn_52_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        he stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        he stackOut_24_0 = null;
        he stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        he stackOut_25_0 = null;
        he stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        he stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        int stackOut_51_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_55_0 = 0;
        boolean stackOut_64_0 = false;
        var17 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            ea.field_c.a(0, 0);
            var2_double = (double)((j) this).field_gb / 256.0 * 3.141592653589793;
            var4 = 89;
            var5 = 464;
            var6 = var4 + -(int)(pj.a(var2_double, param0 + 35407) * 27.0);
            var7 = -(int)(27.0 * ji.a(65535, var2_double)) + var5;
            var8 = -1;
            L1: while (true) {
              L2: {
                L3: {
                  if (var8 > 1) {
                    break L3;
                  } else {
                    stackOut_3_0 = -1;
                    stackIn_13_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var17 != 0) {
                      break L2;
                    } else {
                      var9 = stackIn_4_0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (var9 > 1) {
                              break L6;
                            } else {
                              wj.g(var4 - -var9, var8 + var5, var6, var7, 16711680);
                              var9++;
                              if (var17 != 0) {
                                break L5;
                              } else {
                                if (var17 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var8++;
                          break L5;
                        }
                        if (var17 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                wj.b(89, 464, 3, 16711680);
                var8 = ((j) this).field_H;
                stackOut_12_0 = -1;
                stackIn_13_0 = stackOut_12_0;
                break L2;
              }
              var9 = stackIn_13_0;
              L7: while (true) {
                L8: {
                  L9: {
                    if (0 == var8) {
                      break L9;
                    } else {
                      var9++;
                      var8 = var8 / 10;
                      if (var17 != 0) {
                        break L8;
                      } else {
                        if (var17 == 0) {
                          continue L7;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  if (var9 >= 6) {
                    break L8;
                  } else {
                    var9 = 6;
                    break L8;
                  }
                }
                var10_int = 0;
                L10: while (true) {
                  L11: {
                    L12: {
                      if (var9 < var10_int) {
                        break L12;
                      } else {
                        var11_int = (int)(Math.floor((double)((j) this).field_H / Math.pow(10.0, (double)(var10_int + 1))) * Math.pow(10.0, (double)(1 + var10_int)));
                        var12_int = (int)Math.floor((double)(-var11_int + ((j) this).field_H) / Math.pow(10.0, (double)var10_int));
                        stackOut_23_0 = pi.field_S[var12_int];
                        stackOut_23_1 = ~var9;
                        stackOut_23_2 = -7;
                        stackIn_32_0 = stackOut_23_0;
                        stackIn_32_1 = stackOut_23_1;
                        stackIn_32_2 = stackOut_23_2;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        stackIn_24_2 = stackOut_23_2;
                        if (var17 != 0) {
                          break L11;
                        } else {
                          L13: {
                            stackOut_24_0 = (he) (Object) stackIn_24_0;
                            stackIn_29_0 = stackOut_24_0;
                            stackIn_25_0 = stackOut_24_0;
                            if (stackIn_24_1 == stackIn_24_2) {
                              stackOut_29_0 = (he) (Object) stackIn_29_0;
                              stackOut_29_1 = 21;
                              stackIn_30_0 = stackOut_29_0;
                              stackIn_30_1 = stackOut_29_1;
                              break L13;
                            } else {
                              stackOut_25_0 = (he) (Object) stackIn_25_0;
                              stackIn_27_0 = stackOut_25_0;
                              stackOut_27_0 = (he) (Object) stackIn_27_0;
                              stackOut_27_1 = 18;
                              stackIn_30_0 = stackOut_27_0;
                              stackIn_30_1 = stackOut_27_1;
                              break L13;
                            }
                          }
                          ((he) (Object) stackIn_30_0).e(-(stackIn_30_1 * var10_int) + 320, 438);
                          var10_int++;
                          if (var17 == 0) {
                            continue L10;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                    stackOut_31_0 = pi.field_S[((j) this).field_L];
                    stackOut_31_1 = 161;
                    stackOut_31_2 = 438;
                    stackIn_32_0 = stackOut_31_0;
                    stackIn_32_1 = stackOut_31_1;
                    stackIn_32_2 = stackOut_31_2;
                    break L11;
                  }
                  L14: {
                    ((he) (Object) stackIn_32_0).e(stackIn_32_1, stackIn_32_2);
                    if (((j) this).field_w >= 0) {
                      pi.field_S[((j) this).field_w].e(383, 438);
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    L16: {
                      dh.field_R[ah.field_J].a(408, 429);
                      wj.b(((j) this).field_t);
                      wj.f(400, 425, 515, 475);
                      if (((j) this).field_J - pa.field_c > 10) {
                        break L16;
                      } else {
                        dh.field_R[ib.field_t].a(408, -((-pa.field_c + ((j) this).field_J) * 5) + 479);
                        if (var17 == 0) {
                          break L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                    dh.field_R[ib.field_t].a(408, 429);
                    break L15;
                  }
                  L17: {
                    wj.a(((j) this).field_t);
                    var10 = "x" + ((j) this).field_A;
                    var11 = cb.field_b;
                    var12 = new nh(var11.b(var10), var11.field_x - -var11.field_S);
                    var12.c();
                    if (param0 == -2639) {
                      break L17;
                    } else {
                      ((j) this).field_T = -118;
                      break L17;
                    }
                  }
                  L18: {
                    var11.c(var10, 0, var11.field_x, 16777215, -1);
                    lb.field_C.a(116);
                    var12.b(-(var12.field_y / 2) + 503, var12.field_w / 2 + 443);
                    if (((j) this).field_Z > 0) {
                      L19: {
                        if (((j) this).field_Z % 20 < 10) {
                          stackOut_51_0 = 16711680;
                          stackIn_52_0 = stackOut_51_0;
                          break L19;
                        } else {
                          stackOut_49_0 = 0;
                          stackIn_52_0 = stackOut_49_0;
                          break L19;
                        }
                      }
                      var13_int = stackIn_52_0;
                      cb.field_b.a(na.field_b, 620, cb.field_b.field_x - -10, var13_int, 0);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  var4 = 551;
                  var5 = 464;
                  var13 = (double)((j) this).field_u / 200.0 * 3.141592653589793;
                  var6 = -(int)(27.0 * pj.a(var13, 32768)) + var4;
                  var7 = -(int)(ji.a(param0 + 68174, var13) * 27.0) + var5;
                  var15_int = -1;
                  L20: while (true) {
                    L21: {
                      L22: {
                        if (var15_int > 1) {
                          break L22;
                        } else {
                          stackOut_55_0 = -1;
                          stackIn_65_0 = stackOut_55_0;
                          stackIn_56_0 = stackOut_55_0;
                          if (var17 != 0) {
                            break L21;
                          } else {
                            var16 = stackIn_56_0;
                            L23: while (true) {
                              L24: {
                                L25: {
                                  if (var16 > 1) {
                                    break L25;
                                  } else {
                                    wj.g(var4 - -var16, var5 - -var15_int, var6, var7, 16711680);
                                    var16++;
                                    if (var17 != 0) {
                                      break L24;
                                    } else {
                                      if (var17 == 0) {
                                        continue L23;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                }
                                var15_int++;
                                break L24;
                              }
                              if (var17 == 0) {
                                continue L20;
                              } else {
                                break L22;
                              }
                            }
                          }
                        }
                      }
                      wj.b(89, 464, 3, 16711680);
                      stackOut_64_0 = ((j) this).field_F;
                      stackIn_65_0 = stackOut_64_0 ? 1 : 0;
                      break L21;
                    }
                    L26: {
                      if (stackIn_65_0 != 0) {
                        ji.field_d.b("lvl: " + Integer.toString(((j) this).field_q) + "; fps: " + pc.field_a, 112, 32, 65280, 65280);
                        ji.field_d.a("Bonus: " + ((j) this).field_R, 630, 32, 16777215, 16777215);
                        var15 = Runtime.getRuntime();
                        var16 = (int)(var15.totalMemory() - var15.freeMemory()) >> 447005844;
                        ji.field_d.b(Integer.toString(var16), 330, 35, 16711680, 16711680);
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.G(" + param0 + ')');
        }
    }

    private final void i(int param0) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (sd.field_e != 2) {
              return;
            } else {
              L1: {
                if (param0 == 215) {
                  break L1;
                } else {
                  this.w(45);
                  break L1;
                }
              }
              if ((((j) this).field_J & 1) == 0) {
                return;
              } else {
                bc.field_d = gm.a(bc.field_d, 65280, (-8096 + ((j) this).field_J) / 20, q.field_f, 16711680, true);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ie.a((Throwable) (Object) runtimeException, "j.CA(" + param0 + ')');
        }
    }

    private final void p(int param0) {
        int var2_int = 0;
        gg var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_15_0 = null;
        gg stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        gg stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        gg stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        Object stackOut_14_0 = null;
        gg stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        gg stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        gg stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -3) {
                break L1;
              } else {
                ((j) this).y(-39);
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var2_int >= 1400) {
                    break L4;
                  } else {
                    stackOut_6_0 = this;
                    stackIn_15_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var3 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (((j) this).field_m[var2_int] != null) {
                          ((j) this).field_m[var2_int].c((byte) 119);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var2_int++;
                      if (var3 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_14_0 = this;
                stackIn_15_0 = stackOut_14_0;
                break L3;
              }
              L6: {
                if (!((j) this).field_a) {
                  break L6;
                } else {
                  L7: {
                    var2 = new gg((int)((double)am.field_p + ((j) this).field_N), (int)((double)ri.field_q + ((j) this).field_D), 15, 0.0, 6.283185307179586, 1.5707963267948966, 3, 1.9, 0.92, ((j) this).field_J >> -553800703);
                    stackOut_16_0 = (gg) var2;
                    stackOut_16_1 = -1093327740;
                    stackOut_16_2 = 16777215;
                    stackIn_19_0 = stackOut_16_0;
                    stackIn_19_1 = stackOut_16_1;
                    stackIn_19_2 = stackOut_16_2;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    if (sd.field_e != 2) {
                      stackOut_19_0 = (gg) (Object) stackIn_19_0;
                      stackOut_19_1 = stackIn_19_1;
                      stackOut_19_2 = stackIn_19_2;
                      stackOut_19_3 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      stackIn_20_2 = stackOut_19_2;
                      stackIn_20_3 = stackOut_19_3;
                      break L7;
                    } else {
                      stackOut_17_0 = (gg) (Object) stackIn_17_0;
                      stackOut_17_1 = stackIn_17_1;
                      stackOut_17_2 = stackIn_17_2;
                      stackOut_17_3 = 1;
                      stackIn_20_0 = stackOut_17_0;
                      stackIn_20_1 = stackOut_17_1;
                      stackIn_20_2 = stackOut_17_2;
                      stackIn_20_3 = stackOut_17_3;
                      break L7;
                    }
                  }
                  ((gg) (Object) stackIn_20_0).a(stackIn_20_1, stackIn_20_2, stackIn_20_3 != 0, 8405247);
                  ((j) this).field_a = false;
                  break L6;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2_ref, "j.KB(" + param0 + ')');
        }
    }

    private final void B(int param0) {
        RuntimeException var2 = null;
        he var2_ref = null;
        he[] var3_ref_he__ = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int[] stackIn_27_4 = null;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        int stackOut_20_4 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int[] stackOut_26_4 = null;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int[] stackOut_24_4 = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (0 < ((j) this).field_fb) {
                  break L2;
                } else {
                  L3: {
                    var2_ref = kh.field_e;
                    if (!((j) this).field_y) {
                      break L3;
                    } else {
                      var2_ref.c(-var2_ref.field_a + (int)((j) this).field_N, (int)((j) this).field_D + -var2_ref.field_f, 128, ((j) this).field_r);
                      ((j) this).field_y = false;
                      if (var4 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_ref.a(-var2_ref.field_a + (int)((j) this).field_N, (int)((j) this).field_D + -var2_ref.field_f);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3_ref_he__ = ii.field_b;
              var2_ref = var3_ref_he__[(-1 + var3_ref_he__.length) * (225 - ((j) this).field_fb) / 225];
              wj.d(0, 0, 640, 430, 16777215, ((j) this).field_fb * 255 / 225);
              var2_ref.a(-var2_ref.field_a + (int)((j) this).field_N, -var2_ref.field_f + (int)((j) this).field_D, (225 - ((j) this).field_fb) * 256 / 225);
              break L1;
            }
            if (param0 == -5651) {
              var3 = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    L7: {
                      L8: {
                        if (~var3 <= ~((j) this).field_h.length) {
                          break L8;
                        } else {
                          ((j) this).field_h[var3].c(param0 + 5650);
                          stackOut_14_0 = ~((j) this).field_u;
                          stackOut_14_1 = -1;
                          stackIn_37_0 = stackOut_14_0;
                          stackIn_37_1 = stackOut_14_1;
                          stackIn_15_0 = stackOut_14_0;
                          stackIn_15_1 = stackOut_14_1;
                          if (var4 != 0) {
                            L9: while (true) {
                              if (stackIn_37_0 <= stackIn_37_1) {
                                break L6;
                              } else {
                                ((j) this).field_k[var3].c(-1);
                                var3++;
                                if (var4 != 0) {
                                  break L5;
                                } else {
                                  if (var4 == 0) {
                                    stackOut_36_0 = ~var3;
                                    stackOut_36_1 = ~((j) this).field_k.length;
                                    stackIn_37_0 = stackOut_36_0;
                                    stackIn_37_1 = stackOut_36_1;
                                    continue L9;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          } else {
                            L10: {
                              if (stackIn_15_0 < stackIn_15_1) {
                                L11: {
                                  stackOut_19_0 = (int)((double)am.field_l + ((j) this).field_N) << -1573415996;
                                  stackOut_19_1 = (int)(((j) this).field_D + (double)ri.field_q) << -1990697948;
                                  stackOut_19_2 = 256;
                                  stackOut_19_3 = ((j) this).field_u;
                                  stackIn_22_0 = stackOut_19_0;
                                  stackIn_22_1 = stackOut_19_1;
                                  stackIn_22_2 = stackOut_19_2;
                                  stackIn_22_3 = stackOut_19_3;
                                  stackIn_20_0 = stackOut_19_0;
                                  stackIn_20_1 = stackOut_19_1;
                                  stackIn_20_2 = stackOut_19_2;
                                  stackIn_20_3 = stackOut_19_3;
                                  if (50 < ((j) this).field_u) {
                                    stackOut_22_0 = stackIn_22_0;
                                    stackOut_22_1 = stackIn_22_1;
                                    stackOut_22_2 = stackIn_22_2;
                                    stackOut_22_3 = stackIn_22_3;
                                    stackOut_22_4 = 2;
                                    stackIn_23_0 = stackOut_22_0;
                                    stackIn_23_1 = stackOut_22_1;
                                    stackIn_23_2 = stackOut_22_2;
                                    stackIn_23_3 = stackOut_22_3;
                                    stackIn_23_4 = stackOut_22_4;
                                    break L11;
                                  } else {
                                    stackOut_20_0 = stackIn_20_0;
                                    stackOut_20_1 = stackIn_20_1;
                                    stackOut_20_2 = stackIn_20_2;
                                    stackOut_20_3 = stackIn_20_3;
                                    stackOut_20_4 = 4;
                                    stackIn_23_0 = stackOut_20_0;
                                    stackIn_23_1 = stackOut_20_1;
                                    stackIn_23_2 = stackOut_20_2;
                                    stackIn_23_3 = stackOut_20_3;
                                    stackIn_23_4 = stackOut_20_4;
                                    break L11;
                                  }
                                }
                                L12: {
                                  stackOut_23_0 = stackIn_23_0;
                                  stackOut_23_1 = stackIn_23_1;
                                  stackOut_23_2 = stackIn_23_2;
                                  stackOut_23_3 = stackIn_23_3 / stackIn_23_4;
                                  stackIn_26_0 = stackOut_23_0;
                                  stackIn_26_1 = stackOut_23_1;
                                  stackIn_26_2 = stackOut_23_2;
                                  stackIn_26_3 = stackOut_23_3;
                                  stackIn_24_0 = stackOut_23_0;
                                  stackIn_24_1 = stackOut_23_1;
                                  stackIn_24_2 = stackOut_23_2;
                                  stackIn_24_3 = stackOut_23_3;
                                  if (50 >= ((j) this).field_u) {
                                    stackOut_26_0 = stackIn_26_0;
                                    stackOut_26_1 = stackIn_26_1;
                                    stackOut_26_2 = stackIn_26_2;
                                    stackOut_26_3 = stackIn_26_3;
                                    stackOut_26_4 = uh.field_j;
                                    stackIn_27_0 = stackOut_26_0;
                                    stackIn_27_1 = stackOut_26_1;
                                    stackIn_27_2 = stackOut_26_2;
                                    stackIn_27_3 = stackOut_26_3;
                                    stackIn_27_4 = stackOut_26_4;
                                    break L12;
                                  } else {
                                    stackOut_24_0 = stackIn_24_0;
                                    stackOut_24_1 = stackIn_24_1;
                                    stackOut_24_2 = stackIn_24_2;
                                    stackOut_24_3 = stackIn_24_3;
                                    stackOut_24_4 = uh.field_l;
                                    stackIn_27_0 = stackOut_24_0;
                                    stackIn_27_1 = stackOut_24_1;
                                    stackIn_27_2 = stackOut_24_2;
                                    stackIn_27_3 = stackOut_24_3;
                                    stackIn_27_4 = stackOut_24_4;
                                    break L12;
                                  }
                                }
                                wj.a(stackIn_27_0, stackIn_27_1, stackIn_27_2, stackIn_27_3, stackIn_27_4);
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            var3++;
                            if (var4 == 0) {
                              continue L4;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      if (!((j) this).field_eb) {
                        break L6;
                      } else {
                        if (null != ((j) this).field_k) {
                          var3 = 0;
                          L13: while (true) {
                            stackOut_36_0 = ~var3;
                            stackOut_36_1 = ~((j) this).field_k.length;
                            stackIn_37_0 = stackOut_36_0;
                            stackIn_37_1 = stackOut_36_1;
                            if (stackIn_37_0 <= stackIn_37_1) {
                              break L6;
                            } else {
                              ((j) this).field_k[var3].c(-1);
                              var3++;
                              if (var4 != 0) {
                                break L5;
                              } else {
                                if (var4 == 0) {
                                  continue L13;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                        } else {
                          break L6;
                        }
                      }
                    }
                    break L6;
                  }
                  le.field_c = var2_ref;
                  break L5;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.IA(" + param0 + ')');
        }
    }

    private final void q(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        ib var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (200 > ((j) this).field_fb) {
                    break L3;
                  } else {
                    if (gm.field_J <= 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (((j) this).field_w <= 0) {
                  break L2;
                } else {
                  var2_int = 0;
                  L4: while (true) {
                    if (160 <= var2_int) {
                      break L2;
                    } else {
                      var3 = ((j) this).field_d[var2_int];
                      if (var5 != 0) {
                        break L1;
                      } else {
                        L5: {
                          if (null != var3) {
                            if (!ne.a(le.field_c, (int)((j) this).field_N, (int)((j) this).field_D, var3.field_n, (int)var3.field_d, (int)var3.field_k)) {
                              break L5;
                            } else {
                              L6: {
                                L7: {
                                  L8: {
                                    L9: {
                                      L10: {
                                        L11: {
                                          L12: {
                                            var4 = var3.field_g;
                                            if (4 != var4) {
                                              break L12;
                                            } else {
                                              if (var5 == 0) {
                                                break L11;
                                              } else {
                                                break L12;
                                              }
                                            }
                                          }
                                          L13: {
                                            if (var4 != 5) {
                                              break L13;
                                            } else {
                                              if (var5 == 0) {
                                                break L11;
                                              } else {
                                                break L13;
                                              }
                                            }
                                          }
                                          L14: {
                                            if (var4 != 6) {
                                              break L14;
                                            } else {
                                              if (var5 == 0) {
                                                break L11;
                                              } else {
                                                break L14;
                                              }
                                            }
                                          }
                                          if (7 == var4) {
                                            break L10;
                                          } else {
                                            if (3 == var4) {
                                              break L9;
                                            } else {
                                              L15: {
                                                if (var4 != 2) {
                                                  break L15;
                                                } else {
                                                  if (var5 == 0) {
                                                    break L8;
                                                  } else {
                                                    break L15;
                                                  }
                                                }
                                              }
                                              if (var4 != 1) {
                                                break L6;
                                              } else {
                                                if (var5 == 0) {
                                                  break L7;
                                                } else {
                                                  break L11;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        this.d((byte) -90, var3.field_m);
                                        if (var5 == 0) {
                                          break L6;
                                        } else {
                                          break L10;
                                        }
                                      }
                                      ((j) this).field_L = ((j) this).field_L + 1;
                                      if (var5 == 0) {
                                        break L6;
                                      } else {
                                        break L9;
                                      }
                                    }
                                    ((j) this).field_w = ((j) this).field_w + 1;
                                    if (9 < ((j) this).field_w) {
                                      ((j) this).field_w = 9;
                                      if (var5 == 0) {
                                        break L6;
                                      } else {
                                        break L8;
                                      }
                                    } else {
                                      break L6;
                                    }
                                  }
                                  ((j) this).a(((j) this).field_gb - -64, 0);
                                  if (var5 == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                                ((j) this).field_A = ((j) this).field_A + 1;
                                break L6;
                              }
                              ((j) this).a(((j) this).field_gb, 0);
                              ((j) this).field_d[var2_int] = null;
                              bg.field_k = bg.field_k | 1 << ((j) this).field_q;
                              ah.a(nl.field_r[70], e.a(118, (int)((j) this).field_N), -1321705304);
                              break L5;
                            }
                          } else {
                            break L5;
                          }
                        }
                        var2_int++;
                        if (var5 == 0) {
                          continue L4;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              if (param0 >= 91) {
                break L1;
              } else {
                ((j) this).field_v = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.WA(" + param0 + ')');
        }
    }

    final void r(int param0) {
        RuntimeException var2 = null;
        double var2_double = 0.0;
        nh var2_ref = null;
        int var2_int = 0;
        bf var2_ref2 = null;
        bf var3 = null;
        int var4 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_111_0 = 0;
        int stackIn_111_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 <= -67) {
                break L1;
              } else {
                this.a((byte) 58);
                break L1;
              }
            }
            L2: {
              if (qe.field_a == -150) {
                System.gc();
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (~ab.field_b == ~((j) this).field_q) {
                break L3;
              } else {
                this.c((byte) 111);
                break L3;
              }
            }
            L4: {
              if (null == ((j) this).field_I.h(-11151)) {
                break L4;
              } else {
                int fieldTemp$3 = ((j) this).field_bb + 1;
                ((j) this).field_bb = ((j) this).field_bb + 1;
                if (fieldTemp$3 != 335) {
                  break L4;
                } else {
                  ((j) this).field_bb = 0;
                  gi discarded$4 = ((j) this).field_I.d(180479896);
                  break L4;
                }
              }
            }
            L5: while (true) {
              L6: {
                L7: {
                  if (!th.a(-114)) {
                    L8: {
                      this.E(-8499);
                      this.i((byte) -1);
                      this.A(1052688);
                      this.I(0);
                      if (qe.field_a <= 0) {
                        break L8;
                      } else {
                        L9: {
                          this.z(215);
                          this.b(114);
                          this.a(true);
                          this.w(19);
                          this.k(0);
                          this.i(215);
                          this.a(0);
                          this.q(114);
                          if (gm.field_J == 0) {
                            this.c(-6718);
                            this.b(true);
                            if (((j) this).field_eb) {
                              break L9;
                            } else {
                              this.k((byte) 123);
                              break L9;
                            }
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          this.F(-125);
                          ((j) this).field_fb = ((j) this).field_fb - 1;
                          if (((j) this).field_fb > 0) {
                            this.a(11, (int)((j) this).field_D - -hi.a(ri.field_e, 4, ((j) this).field_l), -1, (int)((j) this).field_N - -hi.a(am.field_l, 4, ((j) this).field_l), 27396);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: {
                          ((j) this).field_Z = ((j) this).field_Z - 1;
                          if (!this.n(115)) {
                            break L11;
                          } else {
                            ((j) this).field_J = ((j) this).field_J + 1;
                            ((j) this).field_l.setSeed((long)(((j) this).field_J + (((j) this).field_q << 182458384)));
                            if (var4 == 0) {
                              break L6;
                            } else {
                              break L11;
                            }
                          }
                        }
                        L12: {
                          L13: {
                            if (!((j) this).field_U) {
                              break L13;
                            } else {
                              if (!((j) this).field_ab) {
                                break L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          var2_int = 0;
                          L14: while (true) {
                            L15: {
                              L16: {
                                if (var2_int >= 1600) {
                                  break L16;
                                } else {
                                  var3 = ((j) this).field_n[var2_int];
                                  if (var4 != 0) {
                                    break L15;
                                  } else {
                                    L17: {
                                      if (null == var3) {
                                        break L17;
                                      } else {
                                        L18: {
                                          L19: {
                                            if (var3.a(false)) {
                                              break L19;
                                            } else {
                                              if (wh.field_v[var3.field_Q]) {
                                                break L19;
                                              } else {
                                                if (0 < var3.field_H) {
                                                  break L18;
                                                } else {
                                                  break L19;
                                                }
                                              }
                                            }
                                          }
                                          if (!cj.field_c[var3.field_Q]) {
                                            break L17;
                                          } else {
                                            var3.field_o = var3.field_o + 1.0;
                                            if (var4 == 0) {
                                              break L17;
                                            } else {
                                              break L18;
                                            }
                                          }
                                        }
                                        this.a(119, (gf) null, var3);
                                        ((j) this).field_n[var2_int].a(7769);
                                        ((j) this).field_n[var2_int] = null;
                                        break L17;
                                      }
                                    }
                                    var2_int++;
                                    if (var4 == 0) {
                                      continue L14;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                              }
                              this.H(1);
                              break L15;
                            }
                            if (var4 == 0) {
                              break L6;
                            } else {
                              break L12;
                            }
                          }
                        }
                        L20: {
                          L21: {
                            ((j) this).field_J = ((j) this).field_J + 1;
                            ((j) this).field_l.setSeed((long)(((j) this).field_J + (((j) this).field_q << 513393392)));
                            var2_int = ((j) this).field_q;
                            if (var2_int != 2) {
                              break L21;
                            } else {
                              if (var4 == 0) {
                                if (((j) this).field_J % 298 != 0) {
                                  break L6;
                                } else {
                                  L22: {
                                    var2_int = hi.a(9, 4, ((j) this).field_l) + 19;
                                    if (var2_int >= 21) {
                                      var2_int += 2;
                                      break L22;
                                    } else {
                                      break L22;
                                    }
                                  }
                                  var3 = ((j) this).a(0, true, var2_int, ((j) this).field_J, 0, true);
                                  var3.field_H = 1;
                                  boolean discarded$5 = var3.a(2, 10);
                                  var3.field_N = (double)(-var3.b((byte) 55).field_c + 430);
                                  var3.field_o = 640.0;
                                  if (var4 == 0) {
                                    break L6;
                                  } else {
                                    break L20;
                                  }
                                }
                              } else {
                                break L21;
                              }
                            }
                          }
                          L23: {
                            if (var2_int != 5) {
                              break L23;
                            } else {
                              if (var4 == 0) {
                                break L6;
                              } else {
                                break L23;
                              }
                            }
                          }
                          if (var2_int == 8) {
                            break L20;
                          } else {
                            break L6;
                          }
                        }
                        if (0 != ((j) this).field_J % vc.field_b[0].field_d) {
                          break L6;
                        } else {
                          var2_ref2 = ((j) this).a(0, true, 31, ((j) this).field_J, 0, true);
                          var2_ref2.field_N = (double)(430 + -var2_ref2.b((byte) 55).field_c);
                          var2_ref2.field_o = 640.0;
                          if (var4 == 0) {
                            break L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    stackOut_109_0 = ~qe.field_a;
                    stackOut_109_1 = 149;
                    stackIn_111_0 = stackOut_109_0;
                    stackIn_111_1 = stackOut_109_1;
                    break L7;
                  } else {
                    stackOut_18_0 = 150;
                    stackOut_18_1 = gm.field_J;
                    stackIn_111_0 = stackOut_18_0;
                    stackIn_111_1 = stackOut_18_1;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    if (var4 != 0) {
                      break L7;
                    } else {
                      stackOut_19_0 = stackIn_19_0;
                      stackOut_19_1 = stackIn_19_1;
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_21_1 = stackOut_19_1;
                      L24: {
                        if (stackIn_21_0 >= stackIn_21_1) {
                          break L24;
                        } else {
                          gm.field_J = 500;
                          break L24;
                        }
                      }
                      if (di.field_c == 13) {
                        L25: {
                          L26: {
                            if (null == rh.field_b) {
                              break L26;
                            } else {
                              var2_ref = rh.field_b;
                              kg.a(wj.field_l, 0, var2_ref.field_B, 0, var2_ref.field_B.length);
                              if (var4 == 0) {
                                break L25;
                              } else {
                                break L26;
                              }
                            }
                          }
                          rh.field_b = be.b();
                          break L25;
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
                L27: {
                  if (stackIn_111_0 == stackIn_111_1) {
                    this.b(116);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                var2_double = -((double)qe.field_a / -150.0) + 1.0;
                qe.field_a = qe.field_a + 1;
                ((j) this).field_N = (double)(-am.field_l) + (double)(275 - -am.field_l) * var2_double;
                if (!ck.field_f[83]) {
                  break L6;
                } else {
                  qe.field_a = qe.field_a + 10;
                  break L6;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.QB(" + param0 + ')');
        }
    }

    private final void k(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        bf var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_25_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        boolean stackOut_22_0 = false;
        int stackOut_37_0 = 0;
        int stackOut_35_0 = 0;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int >= 1600) {
                    break L3;
                  } else {
                    var3 = ((j) this).field_n[var2_int];
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (var3 == null) {
                          break L4;
                        } else {
                          if (!var3.m(-117)) {
                            break L4;
                          } else {
                            L5: {
                              if (ne.a(le.field_c, (int)((j) this).field_N, (int)((j) this).field_D, var3.b((byte) 55), (int)var3.field_o, (int)var3.field_N)) {
                                break L5;
                              } else {
                                if (var3.field_D == null) {
                                  break L4;
                                } else {
                                  if (!ne.a(le.field_c, (int)((j) this).field_N, (int)((j) this).field_D, var3.field_D, var3.field_d, var3.field_p)) {
                                    break L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                            L6: {
                              if (var3.field_s) {
                                stackOut_24_0 = 0;
                                stackIn_25_0 = stackOut_24_0;
                                break L6;
                              } else {
                                stackOut_22_0 = var3.a(16, 10);
                                stackIn_25_0 = stackOut_22_0 ? 1 : 0;
                                break L6;
                              }
                            }
                            L7: {
                              L8: {
                                var4 = stackIn_25_0;
                                if (var3.field_Q == 6) {
                                  break L8;
                                } else {
                                  if (var3.field_Q == 37) {
                                    break L8;
                                  } else {
                                    L9: {
                                      if (wh.field_v[var3.field_Q]) {
                                        break L9;
                                      } else {
                                        L10: {
                                          if (!var3.field_s) {
                                            stackOut_37_0 = 16;
                                            stackIn_38_0 = stackOut_37_0;
                                            break L10;
                                          } else {
                                            stackOut_35_0 = 1;
                                            stackIn_38_0 = stackOut_35_0;
                                            break L10;
                                          }
                                        }
                                        var5 = stackIn_38_0;
                                        ((j) this).a(-var5 + ((j) this).field_gb, 0);
                                        if (var6 == 0) {
                                          break L7;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    ((j) this).a(((j) this).field_gb - 8, 0);
                                    if (var6 == 0) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              }
                              var4 = 1;
                              ((j) this).a(-100 + ((j) this).field_gb, 0);
                              break L7;
                            }
                            L11: {
                              if (var4 != 0) {
                                break L11;
                              } else {
                                this.c(var3, -128);
                                if (var6 == 0) {
                                  break L4;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            L12: {
                              this.b(var3, 122);
                              this.d((byte) -82, wh.field_x[var3.field_Q]);
                              if (var3.a(false)) {
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            L13: {
                              this.a(114, (gf) null, var3);
                              if (th.field_d[var3.field_Q]) {
                                break L13;
                              } else {
                                ((j) this).field_n[var2_int].a(7769);
                                ((j) this).field_n[var2_int] = null;
                                break L13;
                              }
                            }
                            if (var3.h(40)) {
                              this.a(var3, 0);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      var2_int++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var2_int = -63 % ((44 - param0) / 57);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.DA(" + param0 + ')');
        }
    }

    private final void o(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((lh.field_m >> ((j) this).field_q & 1) != 0) {
                break L1;
              } else {
                if (((j) this).field_w <= 0) {
                  break L1;
                } else {
                  this.a(4, 251, (byte) -95);
                  break L1;
                }
              }
            }
            L2: {
              if (0 == (gi.field_f >> ((j) this).field_q & 1)) {
                this.a(5, 250, (byte) -116);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (0 == (1 & fc.field_a >> ((j) this).field_q)) {
                this.a(6, 249, (byte) -99);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var2_int = 125 / ((param0 - 82) / 34);
              if ((1 & bc.field_f >> ((j) this).field_q) == 0) {
                break L4;
              } else {
                if (0 != (nf.field_u >> ((j) this).field_q & 1)) {
                  break L4;
                } else {
                  if (((j) this).field_w > 0) {
                    this.a(7, 248, (byte) -125);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
            }
            L5: {
              if ((bc.field_f >> ((j) this).field_q & 1) == 0) {
                break L5;
              } else {
                if (0 != (1 & bg.field_k >> ((j) this).field_q)) {
                  break L5;
                } else {
                  if (((j) this).field_w <= 0) {
                    break L5;
                  } else {
                    this.a(8, 247, (byte) -90);
                    break L5;
                  }
                }
              }
            }
            L6: {
              if ((1 & cj.field_b >> ((j) this).field_q) != 0) {
                break L6;
              } else {
                if (0 >= ((j) this).field_w) {
                  break L6;
                } else {
                  this.a(9, 246, (byte) -99);
                  break L6;
                }
              }
            }
            L7: {
              if (2 != ((j) this).field_q) {
                break L7;
              } else {
                if (((j) this).field_w > 0) {
                  this.a(10, 245, (byte) -123);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            L8: {
              if (((j) this).field_q != 5) {
                break L8;
              } else {
                if (((j) this).field_w <= 0) {
                  break L8;
                } else {
                  this.a(11, 244, (byte) -81);
                  break L8;
                }
              }
            }
            L9: {
              if (8 != ((j) this).field_q) {
                break L9;
              } else {
                if (((j) this).field_w > 0) {
                  this.a(12, 243, (byte) -94);
                  if (hc.field_G == 2) {
                    this.a(14, 241, (byte) -112);
                    break L9;
                  } else {
                    break L9;
                  }
                } else {
                  break L9;
                }
              }
            }
            L10: {
              if (0 != (dg.field_c >> ((j) this).field_q & 1)) {
                break L10;
              } else {
                if (2 < ((j) this).field_q) {
                  break L10;
                } else {
                  if (((j) this).field_w > 0) {
                    this.a(13, 242, (byte) -96);
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.O(" + param0 + ')');
        }
    }

    private final int j(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_2_0 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            if (param0 > 48) {
              L1: while (true) {
                L2: {
                  if (((j) this).field_n[var2_int] == null) {
                    break L2;
                  } else {
                    var2_int++;
                    if (var3 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_6_0 = var2_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 48;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.P(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final bg j(byte param0) {
        RuntimeException var2 = null;
        bg stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        bg stackOut_6_0 = null;
        Object stackOut_11_0 = null;
        Object stackOut_9_0 = null;
        try {
          L0: {
            L1: {
              if (0 >= ((j) this).field_H) {
                break L1;
              } else {
                if (!((j) this).field_W) {
                  stackOut_6_0 = vg.a(true, ((j) this).field_f, ((j) this).field_x, 3, ((j) this).field_i, 65514, ((j) this).field_g, new int[1], 21);
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                } else {
                  break L1;
                }
              }
            }
            if (param0 == -68) {
              stackOut_11_0 = null;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              stackOut_9_0 = null;
              stackIn_10_0 = stackOut_9_0;
              return (bg) (Object) stackIn_10_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.FA(" + param0 + ')');
        }
        return (bg) (Object) stackIn_12_0;
    }

    private final void b(byte param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              q.field_e.c(0, 0, 1907987);
              var3_int = -87 / ((-57 - param0) / 40);
              if (nd.field_M < 0) {
                break L1;
              } else {
                q.field_e.e(0, 0, nd.field_M);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ie.a((Throwable) (Object) runtimeException, "j.AA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                this.A(-84);
                break L1;
              }
            }
            L2: {
              if (((j) this).field_fb >= 0) {
                break L2;
              } else {
                L3: {
                  if (((j) this).field_q < 0) {
                    break L3;
                  } else {
                    if (~param0 > ~((j) this).field_gb) {
                      gi.field_f = gi.field_f | 1 << ((j) this).field_q;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  ((j) this).field_y = true;
                  ((j) this).field_gb = param0;
                  if (255 < ((j) this).field_gb) {
                    ((j) this).field_gb = 255;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (((j) this).field_gb >= 0) {
                    break L5;
                  } else {
                    this.d(-6111);
                    if (!DrPhlogistonSavesTheEarth.field_D) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                }
                ((j) this).field_r = oj.field_e[((j) this).field_gb];
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var3, "j.MA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void F(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 <= -122) {
                break L1;
              } else {
                this.b(-24);
                break L1;
              }
            }
            L2: {
              if (((j) this).field_eb) {
                L3: {
                  ((j) this).field_M.j(0);
                  ((j) this).field_u = 0;
                  var2_int = -((j) this).field_s + ((j) this).field_J;
                  if (var2_int > 300) {
                    break L3;
                  } else {
                    L4: {
                      L5: {
                        ((j) this).field_c = ((j) this).field_c + (-0.5 + Math.random());
                        ((j) this).field_j = ((j) this).field_j + (-0.4 + Math.random());
                        if (((j) this).field_k == null) {
                          ((j) this).field_k = new ck[10];
                          var3 = 0;
                          L6: while (true) {
                            if (~((j) this).field_k.length >= ~var3) {
                              break L5;
                            } else {
                              ((j) this).field_k[var3] = new ck();
                              var3++;
                              if (var4 != 0) {
                                break L4;
                              } else {
                                if (var4 == 0) {
                                  continue L6;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        } else {
                          break L5;
                        }
                      }
                      var3 = 0;
                      break L4;
                    }
                    L7: while (true) {
                      L8: {
                        if (var3 >= ((j) this).field_k.length) {
                          break L8;
                        } else {
                          ((j) this).field_k[var3].a((int)((j) this).field_D + hi.a(ri.field_e, 4, ((j) this).field_l), var2_int / 4, 1049600, -104, 1, (int)((j) this).field_N + hi.a(am.field_l, 4, ((j) this).field_l));
                          var3++;
                          if (var4 != 0) {
                            break L2;
                          } else {
                            if (var4 == 0) {
                              continue L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ((j) this).s(87);
                ((j) this).d((byte) 76);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.B(" + param0 + ')');
        }
    }

    private final void c(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = qe.field_a * 3 * pi.field_S[0].field_c / -150;
                var3 = (-fk.field_m.field_h + 640) / 2;
                var4 = -(fk.field_m.field_h / 2) + 120;
                if (qe.field_a > -25) {
                  break L2;
                } else {
                  fk.field_m.a(var3, var4);
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var5_int = -(qe.field_a * 10);
              var4 = var4 - (255 + -var5_int) / 2;
              fk.field_m.a(var3, var4, var5_int);
              break L1;
            }
            wj.f(var3 + 94, 101 + var4, var3 - -116, var4 + 131);
            var5_int = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if (var5_int > 3) {
                    break L5;
                  } else {
                    pi.field_S[var5_int].e(var3 + 94, -var2_int + (48 + (var4 + 53 - pi.field_S[0].field_c * -var5_int)));
                    var5_int++;
                    if (var6 != 0) {
                      break L4;
                    } else {
                      if (var6 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                wj.a();
                cb.field_b.b(a.field_f, 320, 45 + var4, 16777215, 0);
                break L4;
              }
              if (param0) {
                var5 = uf.field_d + (((j) this).field_q / 3 - -1) + "-" + (((j) this).field_q % 3 - -1);
                cb.field_b.b(var5, 320, cb.field_b.field_E + (var4 + 45), 16777215, 0);
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.KA(" + param0 + ')');
        }
    }

    private final void z(int param0) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        boolean stackOut_15_0 = false;
        int stackOut_17_0 = 0;
        Object stackOut_19_0 = null;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        L0: {
          var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (!ck.field_f[98]) {
            break L0;
          } else {
            si.field_C[0] = true;
            ((j) this).field_j = ((j) this).field_j - 0.5;
            break L0;
          }
        }
        L1: {
          if (!ck.field_f[99]) {
            break L1;
          } else {
            ((j) this).field_j = ((j) this).field_j + 0.5;
            si.field_C[1] = true;
            break L1;
          }
        }
        L2: {
          if (ck.field_f[96]) {
            ((j) this).field_c = ((j) this).field_c - 0.5;
            si.field_C[2] = true;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (ck.field_f[97]) {
            ((j) this).field_c = ((j) this).field_c + 0.5;
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
            if (((j) this).field_O) {
              pa.field_c = ((j) this).field_J;
              ah.field_J = ib.field_t;
              L5: while (true) {
                ib.field_t = (ib.field_t - -1) % 4;
                stackOut_15_0 = nc.field_J[((j) this).field_q][ib.field_t];
                stackIn_16_0 = stackOut_15_0 ? 1 : 0;
                L6: while (true) {
                  if (stackIn_16_0 == 0) {
                    continue L5;
                  } else {
                    stackOut_17_0 = 1;
                    stackIn_16_0 = stackOut_17_0;
                    stackIn_18_0 = stackOut_17_0;
                    if (var3 != 0) {
                      continue L6;
                    } else {
                      s.field_e = stackIn_18_0 != 0;
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
          stackOut_19_0 = this;
          stackIn_21_0 = stackOut_19_0;
          stackIn_20_0 = stackOut_19_0;
          if (ck.field_f[81]) {
            stackOut_21_0 = this;
            stackOut_21_1 = 0;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            break L7;
          } else {
            stackOut_20_0 = this;
            stackOut_20_1 = 1;
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            break L7;
          }
        }
        ((j) this).field_O = stackIn_22_1 != 0;
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
                      if (nc.field_J[((j) this).field_q][0]) {
                        break L11;
                      } else {
                        ((j) this).field_Z = 50;
                        if (var3 == 0) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    pa.field_c = ((j) this).field_J;
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
                  if (ib.field_t == 3) {
                    break L8;
                  } else {
                    L16: {
                      L17: {
                        if (!nc.field_J[((j) this).field_q][3]) {
                          break L17;
                        } else {
                          pa.field_c = ((j) this).field_J;
                          ah.field_J = ib.field_t;
                          ib.field_t = 3;
                          if (var3 == 0) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      ((j) this).field_Z = 50;
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
                  if (nc.field_J[((j) this).field_q][2]) {
                    break L19;
                  } else {
                    ((j) this).field_Z = 50;
                    if (var3 == 0) {
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                pa.field_c = ((j) this).field_J;
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
                if (!nc.field_J[((j) this).field_q][1]) {
                  break L21;
                } else {
                  pa.field_c = ((j) this).field_J;
                  ah.field_J = ib.field_t;
                  ib.field_t = 1;
                  if (var3 == 0) {
                    break L20;
                  } else {
                    break L21;
                  }
                }
              }
              ((j) this).field_Z = 50;
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
            if (((j) this).field_S != 0) {
              break L22;
            } else {
              if (~((j) this).field_J > ~((j) this).field_b) {
                break L22;
              } else {
                if (0 < gm.field_J) {
                  break L22;
                } else {
                  L24: {
                    if (ib.field_t == 3) {
                      ol.field_d = true;
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  ((j) this).field_S = ((j) this).field_A;
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
                if (((j) this).field_u <= 50) {
                  break L29;
                } else {
                  this.a(23, (byte) 113);
                  ((j) this).field_E = 0;
                  nb.field_d = true;
                  ((j) this).field_u = 0;
                  if (var3 == 0) {
                    break L25;
                  } else {
                    break L29;
                  }
                }
              }
              ((j) this).field_u = 0;
              if (var3 == 0) {
                break L25;
              } else {
                break L26;
              }
            }
            L30: {
              if (((j) this).field_u == 0) {
                od.a(-1630758008, ((j) this).field_M);
                break L30;
              } else {
                break L30;
              }
            }
            L31: {
              ((j) this).field_M.h(((j) this).field_u + 196);
              ((j) this).field_M.j((int)((25.0 + (double)((j) this).field_u / 2.0) * (double)dg.field_e / 80.0));
              ((j) this).field_u = ((j) this).field_u + 1;
              if (((j) this).field_u > 200) {
                ((j) this).field_u = 200;
                ((j) this).field_E = ((j) this).field_E + 1;
                var2_int = (int)(Math.exp((double)(-((j) this).field_E) / 100.0) * 125.0);
                ((j) this).field_M.j(dg.field_e * var2_int / 80);
                break L31;
              } else {
                break L31;
              }
            }
            if (((j) this).field_u <= 50) {
              break L25;
            } else {
              ni.field_w = true;
              break L25;
            }
          }
          L32: {
            if (0 != ((j) this).field_u) {
              break L32;
            } else {
              gi.a(((j) this).field_M, 3408);
              ((j) this).field_M.i(-1);
              break L32;
            }
          }
          L33: {
            if (nj.field_j >= 2) {
              L34: {
                if (((j) this).field_W) {
                  break L34;
                } else {
                  ((j) this).field_W = ck.field_f[12];
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
                  ((j) this).field_W = true;
                  this.d((byte) -53, 1234567);
                  break L43;
                }
              }
              L44: {
                if (!ck.field_f[88]) {
                  break L44;
                } else {
                  ((j) this).field_W = true;
                  this.d((byte) -87, -((j) this).field_H);
                  break L44;
                }
              }
              L45: {
                if (!ck.field_f[103]) {
                  break L45;
                } else {
                  ((j) this).field_W = true;
                  ((j) this).field_w = 0;
                  this.d(-6111);
                  break L45;
                }
              }
              L46: {
                L47: {
                  if (!ck.field_f[85]) {
                    break L47;
                  } else {
                    ((j) this).field_W = true;
                    var2_int = 0;
                    L48: while (true) {
                      if (var2_int >= ((j) this).field_n.length) {
                        break L47;
                      } else {
                        if (var3 != 0) {
                          break L46;
                        } else {
                          L49: {
                            if (null != ((j) this).field_n[var2_int]) {
                              ((j) this).field_n[var2_int].a(7769);
                              break L49;
                            } else {
                              break L49;
                            }
                          }
                          ((j) this).field_n[var2_int] = null;
                          var2_int++;
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
                  ((j) this).field_F = true;
                  ((j) this).field_W = true;
                  break L46;
                }
              }
              L50: {
                if (0 == (((j) this).field_J & 15)) {
                  L51: {
                    if (ck.field_f[90]) {
                      ((j) this).field_W = true;
                      this.a(119, (double)hi.a(430, 4, ((j) this).field_l), 640.0, false, false);
                      break L51;
                    } else {
                      break L51;
                    }
                  }
                  L52: {
                    if (ck.field_f[89]) {
                      ((j) this).field_W = true;
                      bf discarded$78 = ((j) this).a(hi.a(430, 4, ((j) this).field_l), false, hi.a(77, 4, ((j) this).field_l), 640, 0, true);
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
                          ((j) this).field_W = true;
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
                          ((j) this).field_W = true;
                          if (ck.field_f[16]) {
                            ((j) this).field_d[this.f(0)] = new ib(640.0, 215.0, 1, false, false);
                            break L68;
                          } else {
                            break L68;
                          }
                        }
                        L69: {
                          if (ck.field_f[17]) {
                            ((j) this).field_d[this.f(0)] = new ib(640.0, 215.0, 2, false, false);
                            break L69;
                          } else {
                            break L69;
                          }
                        }
                        L70: {
                          if (!ck.field_f[18]) {
                            break L70;
                          } else {
                            ((j) this).field_d[this.f(qk.a(param0, 215))] = new ib(640.0, 215.0, 3, false, false);
                            break L70;
                          }
                        }
                        L71: {
                          if (ck.field_f[19]) {
                            ((j) this).field_d[this.f(0)] = new ib(640.0, 215.0, 4, false, false);
                            break L71;
                          } else {
                            break L71;
                          }
                        }
                        L72: {
                          if (ck.field_f[20]) {
                            ((j) this).field_d[this.f(0)] = new ib(640.0, 215.0, 5, false, false);
                            break L72;
                          } else {
                            break L72;
                          }
                        }
                        L73: {
                          if (ck.field_f[21]) {
                            ((j) this).field_d[this.f(qk.a(param0, 215))] = new ib(640.0, 215.0, 6, false, false);
                            break L73;
                          } else {
                            break L73;
                          }
                        }
                        if (ck.field_f[22]) {
                          ((j) this).field_d[this.f(0)] = new ib(640.0, 215.0, 7, false, false);
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
                        ((j) this).field_W = true;
                        if (ck.field_f[102]) {
                          break L74;
                        } else {
                          L75: {
                            if (!ck.field_f[16]) {
                              break L75;
                            } else {
                              bf discarded$79 = ((j) this).a(250, true, 0, 640, 0, true);
                              break L75;
                            }
                          }
                          L76: {
                            if (ck.field_f[17]) {
                              bf discarded$80 = ((j) this).a(215, true, 1, 640, 0, true);
                              break L76;
                            } else {
                              break L76;
                            }
                          }
                          L77: {
                            if (ck.field_f[18]) {
                              bf discarded$81 = ((j) this).a(215, true, 2, 640, 0, true);
                              break L77;
                            } else {
                              break L77;
                            }
                          }
                          L78: {
                            if (!ck.field_f[19]) {
                              break L78;
                            } else {
                              bf discarded$82 = ((j) this).a(215, true, 3, 640, 0, true);
                              break L78;
                            }
                          }
                          L79: {
                            if (!ck.field_f[20]) {
                              break L79;
                            } else {
                              bf discarded$83 = ((j) this).a(215, true, 4, 640, 0, true);
                              break L79;
                            }
                          }
                          L80: {
                            if (!ck.field_f[21]) {
                              break L80;
                            } else {
                              bf discarded$84 = ((j) this).a(215, true, 5, 640, 0, true);
                              break L80;
                            }
                          }
                          L81: {
                            if (!ck.field_f[22]) {
                              break L81;
                            } else {
                              bf discarded$85 = ((j) this).a(215, true, 6, 640, 0, true);
                              break L81;
                            }
                          }
                          L82: {
                            if (ck.field_f[23]) {
                              bf discarded$86 = ((j) this).a(215, true, 7, 640, 0, true);
                              break L82;
                            } else {
                              break L82;
                            }
                          }
                          L83: {
                            if (ck.field_f[24]) {
                              bf discarded$87 = ((j) this).a(215, true, 8, 640, 0, true);
                              break L83;
                            } else {
                              break L83;
                            }
                          }
                          L84: {
                            if (!ck.field_f[25]) {
                              break L84;
                            } else {
                              bf discarded$88 = ((j) this).a(215, true, 9, 640, 0, true);
                              break L84;
                            }
                          }
                          L85: {
                            if (!ck.field_f[26]) {
                              break L85;
                            } else {
                              bf discarded$89 = ((j) this).a(215, true, 10, 640, 0, true);
                              break L85;
                            }
                          }
                          L86: {
                            if (ck.field_f[27]) {
                              bf discarded$90 = ((j) this).a(215, true, 11, 640, 0, true);
                              break L86;
                            } else {
                              break L86;
                            }
                          }
                          L87: {
                            if (ck.field_f[32]) {
                              bf discarded$91 = ((j) this).a(215, true, 12, 640, 0, true);
                              break L87;
                            } else {
                              break L87;
                            }
                          }
                          L88: {
                            if (!ck.field_f[33]) {
                              break L88;
                            } else {
                              bf discarded$92 = ((j) this).a(215, true, 13, 640, 0, true);
                              break L88;
                            }
                          }
                          L89: {
                            if (!ck.field_f[34]) {
                              break L89;
                            } else {
                              bf discarded$93 = ((j) this).a(215, true, 14, 640, 0, true);
                              break L89;
                            }
                          }
                          L90: {
                            if (ck.field_f[35]) {
                              bf discarded$94 = ((j) this).a(215, true, 15, 640, 0, true);
                              break L90;
                            } else {
                              break L90;
                            }
                          }
                          L91: {
                            if (!ck.field_f[36]) {
                              break L91;
                            } else {
                              bf discarded$95 = ((j) this).a(215, true, 16, 640, 0, true);
                              break L91;
                            }
                          }
                          L92: {
                            if (!ck.field_f[37]) {
                              break L92;
                            } else {
                              bf discarded$96 = ((j) this).a(215, true, 17, 640, 0, true);
                              break L92;
                            }
                          }
                          L93: {
                            if (ck.field_f[38]) {
                              bf discarded$97 = ((j) this).a(215, true, 18, 640, 0, true);
                              break L93;
                            } else {
                              break L93;
                            }
                          }
                          L94: {
                            if (!ck.field_f[39]) {
                              break L94;
                            } else {
                              bf discarded$98 = ((j) this).a(215, true, 19, 640, 0, true);
                              break L94;
                            }
                          }
                          L95: {
                            if (ck.field_f[40]) {
                              bf discarded$99 = ((j) this).a(215, true, 20, 640, 0, true);
                              break L95;
                            } else {
                              break L95;
                            }
                          }
                          L96: {
                            if (!ck.field_f[41]) {
                              break L96;
                            } else {
                              bf discarded$100 = ((j) this).a(215, true, 21, 640, 0, true);
                              break L96;
                            }
                          }
                          L97: {
                            if (ck.field_f[42]) {
                              bf discarded$101 = ((j) this).a(215, true, 22, 640, 0, true);
                              break L97;
                            } else {
                              break L97;
                            }
                          }
                          L98: {
                            if (!ck.field_f[43]) {
                              break L98;
                            } else {
                              bf discarded$102 = ((j) this).a(215, true, 23, 640, 0, true);
                              break L98;
                            }
                          }
                          L99: {
                            if (!ck.field_f[48]) {
                              break L99;
                            } else {
                              bf discarded$103 = ((j) this).a(215, true, 24, 640, 0, true);
                              break L99;
                            }
                          }
                          L100: {
                            if (ck.field_f[49]) {
                              bf discarded$104 = ((j) this).a(215, true, 25, 640, 0, true);
                              break L100;
                            } else {
                              break L100;
                            }
                          }
                          L101: {
                            if (!ck.field_f[50]) {
                              break L101;
                            } else {
                              bf discarded$105 = ((j) this).a(215, true, 26, 640, 0, true);
                              break L101;
                            }
                          }
                          L102: {
                            if (!ck.field_f[51]) {
                              break L102;
                            } else {
                              bf discarded$106 = ((j) this).a(215, true, 27, 640, 0, true);
                              break L102;
                            }
                          }
                          L103: {
                            if (!ck.field_f[52]) {
                              break L103;
                            } else {
                              bf discarded$107 = ((j) this).a(215, true, 28, 640, 0, true);
                              break L103;
                            }
                          }
                          L104: {
                            if (!ck.field_f[53]) {
                              break L104;
                            } else {
                              bf discarded$108 = ((j) this).a(215, true, 29, 640, 0, true);
                              break L104;
                            }
                          }
                          L105: {
                            if (ck.field_f[54]) {
                              bf discarded$109 = ((j) this).a(215, true, 30, 640, 0, true);
                              break L105;
                            } else {
                              break L105;
                            }
                          }
                          L106: {
                            if (ck.field_f[55]) {
                              bf discarded$110 = ((j) this).a(215, true, 31, 640, 0, true);
                              break L106;
                            } else {
                              break L106;
                            }
                          }
                          L107: {
                            if (!ck.field_f[56]) {
                              break L107;
                            } else {
                              bf discarded$111 = ((j) this).a(215, true, 32, 640, 0, true);
                              break L107;
                            }
                          }
                          L108: {
                            if (ck.field_f[57]) {
                              bf discarded$112 = ((j) this).a(215, true, 33, 640, 0, true);
                              break L108;
                            } else {
                              break L108;
                            }
                          }
                          L109: {
                            if (ck.field_f[58]) {
                              bf discarded$113 = ((j) this).a(215, true, 34, 640, 0, true);
                              break L109;
                            } else {
                              break L109;
                            }
                          }
                          L110: {
                            if (!ck.field_f[59]) {
                              break L110;
                            } else {
                              bf discarded$114 = ((j) this).a(215, true, 35, 640, 0, true);
                              break L110;
                            }
                          }
                          L111: {
                            if (!ck.field_f[74]) {
                              break L111;
                            } else {
                              bf discarded$115 = ((j) this).a(215, true, 36, 640, 0, true);
                              break L111;
                            }
                          }
                          L112: {
                            if (!ck.field_f[64]) {
                              break L112;
                            } else {
                              bf discarded$116 = ((j) this).a(215, true, 37, 640, 0, true);
                              break L112;
                            }
                          }
                          L113: {
                            if (!ck.field_f[65]) {
                              break L113;
                            } else {
                              bf discarded$117 = ((j) this).a(215, true, 38, 640, 0, true);
                              break L113;
                            }
                          }
                          L114: {
                            if (!ck.field_f[66]) {
                              break L114;
                            } else {
                              bf discarded$118 = ((j) this).a(215, true, 39, 640, 0, true);
                              break L114;
                            }
                          }
                          L115: {
                            if (!ck.field_f[67]) {
                              break L115;
                            } else {
                              bf discarded$119 = ((j) this).a(215, true, 40, 640, 0, true);
                              break L115;
                            }
                          }
                          L116: {
                            if (ck.field_f[68]) {
                              bf discarded$120 = ((j) this).a(215, true, 41, 640, 0, true);
                              break L116;
                            } else {
                              break L116;
                            }
                          }
                          L117: {
                            if (!ck.field_f[69]) {
                              break L117;
                            } else {
                              bf discarded$121 = ((j) this).a(215, true, 42, 640, 0, true);
                              break L117;
                            }
                          }
                          L118: {
                            if (ck.field_f[70]) {
                              bf discarded$122 = ((j) this).a(250, true, 43, 640, 0, true);
                              break L118;
                            } else {
                              break L118;
                            }
                          }
                          L119: {
                            if (!ck.field_f[71]) {
                              break L119;
                            } else {
                              bf discarded$123 = ((j) this).a(250, true, 44, 640, 0, true);
                              break L119;
                            }
                          }
                          L120: {
                            if (!ck.field_f[72]) {
                              break L120;
                            } else {
                              bf discarded$124 = ((j) this).a(250, true, 45, 640, 0, true);
                              break L120;
                            }
                          }
                          if (!ck.field_f[73]) {
                            break L50;
                          } else {
                            bf discarded$125 = ((j) this).a(250, true, 46, 640, 0, true);
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
                          bf discarded$126 = ((j) this).a(250, true, 47, -90, 0, true);
                          break L121;
                        } else {
                          break L121;
                        }
                      }
                      L122: {
                        if (!ck.field_f[17]) {
                          break L122;
                        } else {
                          bf discarded$127 = ((j) this).a(215, true, 48, 640, 0, true);
                          break L122;
                        }
                      }
                      L123: {
                        if (!ck.field_f[18]) {
                          break L123;
                        } else {
                          bf discarded$128 = ((j) this).a(215, true, 49, 640, 0, true);
                          break L123;
                        }
                      }
                      L124: {
                        if (!ck.field_f[19]) {
                          break L124;
                        } else {
                          bf discarded$129 = ((j) this).a(215, true, 50, 640, 0, true);
                          break L124;
                        }
                      }
                      L125: {
                        if (!ck.field_f[20]) {
                          break L125;
                        } else {
                          bf discarded$130 = ((j) this).a(215, true, 51, 640, 0, true);
                          break L125;
                        }
                      }
                      L126: {
                        if (ck.field_f[21]) {
                          bf discarded$131 = ((j) this).a(215, true, 52, 640, 0, true);
                          break L126;
                        } else {
                          break L126;
                        }
                      }
                      L127: {
                        if (!ck.field_f[22]) {
                          break L127;
                        } else {
                          bf discarded$132 = ((j) this).a(215, true, 53, 640, 0, true);
                          break L127;
                        }
                      }
                      L128: {
                        if (!ck.field_f[23]) {
                          break L128;
                        } else {
                          bf discarded$133 = ((j) this).a(215, true, 54, 640, 0, true);
                          break L128;
                        }
                      }
                      L129: {
                        if (ck.field_f[24]) {
                          bf discarded$134 = ((j) this).a(215, true, 55, 640, 0, true);
                          break L129;
                        } else {
                          break L129;
                        }
                      }
                      L130: {
                        if (!ck.field_f[25]) {
                          break L130;
                        } else {
                          bf discarded$135 = ((j) this).a(215, true, 56, 640, 0, true);
                          break L130;
                        }
                      }
                      L131: {
                        if (!ck.field_f[26]) {
                          break L131;
                        } else {
                          bf discarded$136 = ((j) this).a(215, true, 57, 640, 0, true);
                          break L131;
                        }
                      }
                      L132: {
                        if (!ck.field_f[27]) {
                          break L132;
                        } else {
                          bf discarded$137 = ((j) this).a(215, true, 58, 640, 0, true);
                          break L132;
                        }
                      }
                      L133: {
                        if (!ck.field_f[32]) {
                          break L133;
                        } else {
                          bf discarded$138 = ((j) this).a(215, true, 59, 640, 0, true);
                          break L133;
                        }
                      }
                      L134: {
                        if (ck.field_f[33]) {
                          bf discarded$139 = ((j) this).a(215, true, 60, 640, 0, true);
                          break L134;
                        } else {
                          break L134;
                        }
                      }
                      L135: {
                        if (ck.field_f[34]) {
                          bf discarded$140 = ((j) this).a(215, true, 61, 640, 0, true);
                          break L135;
                        } else {
                          break L135;
                        }
                      }
                      L136: {
                        if (!ck.field_f[35]) {
                          break L136;
                        } else {
                          bf discarded$141 = ((j) this).a(215, true, 62, 640, 0, true);
                          break L136;
                        }
                      }
                      L137: {
                        if (!ck.field_f[36]) {
                          break L137;
                        } else {
                          bf discarded$142 = ((j) this).a(215, true, 63, 640, 0, true);
                          break L137;
                        }
                      }
                      L138: {
                        if (!ck.field_f[37]) {
                          break L138;
                        } else {
                          bf discarded$143 = ((j) this).a(215, true, 64, 640, 0, true);
                          break L138;
                        }
                      }
                      L139: {
                        if (!ck.field_f[38]) {
                          break L139;
                        } else {
                          bf discarded$144 = ((j) this).a(215, true, 65, 640, 0, true);
                          break L139;
                        }
                      }
                      L140: {
                        if (!ck.field_f[39]) {
                          break L140;
                        } else {
                          bf discarded$145 = ((j) this).a(215, true, 66, 640, 0, true);
                          break L140;
                        }
                      }
                      L141: {
                        if (!ck.field_f[40]) {
                          break L141;
                        } else {
                          bf discarded$146 = ((j) this).a(215, true, 67, 640, 0, true);
                          break L141;
                        }
                      }
                      L142: {
                        if (!ck.field_f[41]) {
                          break L142;
                        } else {
                          bf discarded$147 = ((j) this).a(215, true, 68, 640, 0, true);
                          break L142;
                        }
                      }
                      L143: {
                        if (!ck.field_f[42]) {
                          break L143;
                        } else {
                          bf discarded$148 = ((j) this).a(215, true, 69, 640, 0, true);
                          break L143;
                        }
                      }
                      L144: {
                        if (!ck.field_f[43]) {
                          break L144;
                        } else {
                          bf discarded$149 = ((j) this).a(215, true, 70, 640, 0, true);
                          break L144;
                        }
                      }
                      L145: {
                        if (!ck.field_f[48]) {
                          break L145;
                        } else {
                          bf discarded$150 = ((j) this).a(215, true, 71, 640, 0, true);
                          break L145;
                        }
                      }
                      L146: {
                        if (!ck.field_f[49]) {
                          break L146;
                        } else {
                          bf discarded$151 = ((j) this).a(215, true, 72, 640, 0, true);
                          break L146;
                        }
                      }
                      L147: {
                        if (ck.field_f[50]) {
                          bf discarded$152 = ((j) this).a(215, true, 73, 640, 0, true);
                          break L147;
                        } else {
                          break L147;
                        }
                      }
                      L148: {
                        if (ck.field_f[51]) {
                          bf discarded$153 = ((j) this).a(215, true, 74, 640, 0, true);
                          break L148;
                        } else {
                          break L148;
                        }
                      }
                      L149: {
                        if (!ck.field_f[52]) {
                          break L149;
                        } else {
                          bf discarded$154 = ((j) this).a(215, true, 75, 640, 0, true);
                          break L149;
                        }
                      }
                      if (!ck.field_f[53]) {
                        break L50;
                      } else {
                        bf discarded$155 = ((j) this).a(215, true, 76, 640, 0, true);
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
                  ((j) this).field_ab = true;
                  ((j) this).field_W = true;
                  this.H(1);
                  break L150;
                }
              }
              L151: {
                if (!ck.field_f[2]) {
                  break L151;
                } else {
                  ((j) this).field_ab = true;
                  ((j) this).field_q = 0;
                  ((j) this).field_W = true;
                  this.H(1);
                  break L151;
                }
              }
              L152: {
                if (!ck.field_f[3]) {
                  break L152;
                } else {
                  ((j) this).field_W = true;
                  ((j) this).field_q = 1;
                  ((j) this).field_ab = true;
                  this.H(1);
                  break L152;
                }
              }
              L153: {
                if (!ck.field_f[4]) {
                  break L153;
                } else {
                  ((j) this).field_ab = true;
                  ((j) this).field_W = true;
                  ((j) this).field_q = 2;
                  this.H(1);
                  break L153;
                }
              }
              L154: {
                if (ck.field_f[5]) {
                  ((j) this).field_q = 3;
                  ((j) this).field_ab = true;
                  ((j) this).field_W = true;
                  this.H(1);
                  break L154;
                } else {
                  break L154;
                }
              }
              L155: {
                if (ck.field_f[6]) {
                  ((j) this).field_ab = true;
                  ((j) this).field_q = 4;
                  ((j) this).field_W = true;
                  this.H(param0 ^ 214);
                  break L155;
                } else {
                  break L155;
                }
              }
              L156: {
                if (ck.field_f[7]) {
                  ((j) this).field_ab = true;
                  ((j) this).field_W = true;
                  ((j) this).field_q = 5;
                  this.H(1);
                  break L156;
                } else {
                  break L156;
                }
              }
              L157: {
                if (ck.field_f[8]) {
                  ((j) this).field_ab = true;
                  ((j) this).field_q = 6;
                  ((j) this).field_W = true;
                  this.H(param0 ^ 214);
                  break L157;
                } else {
                  break L157;
                }
              }
              if (!ck.field_f[9]) {
                break L33;
              } else {
                ((j) this).field_W = true;
                ((j) this).field_q = 7;
                ((j) this).field_ab = true;
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
        int var4_int = 0;
        try {
            int var5 = 97 % ((50 - param1) / 52);
            var4_int = this.m(1280);
            ((j) this).field_hb[var4_int] = new td(13, param2, param0, -1);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "j.BB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void i(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                this.v(-22);
                break L1;
              }
            }
            L2: {
              L3: {
                if (((j) this).field_q == 0) {
                  break L3;
                } else {
                  if (((j) this).field_q != 3) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var2_int = 1;
              var3 = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (si.field_C.length <= var3) {
                      break L6;
                    } else {
                      var2_int = var2_int != 0 & si.field_C[var3] ? 1 : 0;
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
                  if (el.field_tb != 0) {
                    break L5;
                  } else {
                    if (var2_int != 0) {
                      el.field_tb = el.field_tb + 1;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L7: {
                  if (el.field_tb != 1) {
                    break L7;
                  } else {
                    if (!lg.field_g) {
                      break L7;
                    } else {
                      el.field_tb = el.field_tb + 1;
                      break L7;
                    }
                  }
                }
                L8: {
                  if (2 != el.field_tb) {
                    break L8;
                  } else {
                    if (s.field_e) {
                      el.field_tb = el.field_tb + 1;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  if (el.field_tb != 3) {
                    break L9;
                  } else {
                    if (!ni.field_w) {
                      break L9;
                    } else {
                      el.field_tb = el.field_tb + 1;
                      break L9;
                    }
                  }
                }
                L10: {
                  if (el.field_tb != 4) {
                    break L10;
                  } else {
                    if (!nb.field_d) {
                      break L10;
                    } else {
                      el.field_tb = el.field_tb + 1;
                      break L10;
                    }
                  }
                }
                L11: {
                  if (5 != el.field_tb) {
                    break L11;
                  } else {
                    if (ol.field_d) {
                      el.field_tb = el.field_tb + 1;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                }
                L12: {
                  if (5 != el.field_tb) {
                    break L12;
                  } else {
                    if (((j) this).field_q != 0) {
                      break L12;
                    } else {
                      we.field_f = we.field_f + 1;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L12;
                      }
                    }
                  }
                }
                L13: {
                  L14: {
                    if (el.field_tb != 6) {
                      break L14;
                    } else {
                      if (((j) this).field_q == 3) {
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  we.field_f = 0;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L13;
                  }
                }
                we.field_f = we.field_f + 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.M(" + param0 + ')');
        }
    }

    private final void a(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        gf var3_ref_gf = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_19_0 = null;
        gf stackIn_19_1 = null;
        Object stackIn_42_0 = null;
        gf stackIn_42_1 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_18_0 = null;
        gf stackOut_18_1 = null;
        Object stackOut_41_0 = null;
        gf stackOut_41_1 = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((j) this).field_S <= 0) {
                break L1;
              } else {
                if (((j) this).field_b <= ((j) this).field_J) {
                  L2: {
                    this.a(ib.field_t + 19, (byte) 34);
                    if (((j) this).field_S > 0) {
                      break L2;
                    } else {
                      L3: {
                        L4: {
                          if (ib.field_t == 2) {
                            break L4;
                          } else {
                            var2_int = ni.field_v[ib.field_t];
                            if (var5 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var2_int = (int)((double)ni.field_v[ib.field_t] / Math.pow(1.25, (double)((j) this).field_A));
                        break L3;
                      }
                      ((j) this).field_b = ((j) this).field_J - -var2_int;
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  ((j) this).field_b = ((j) this).field_b + gg.field_i[ib.field_t];
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var2_int = 0;
            L5: while (true) {
              L6: {
                L7: {
                  if (var2_int >= 1400) {
                    break L7;
                  } else {
                    var3_ref_gf = ((j) this).field_m[var2_int];
                    stackOut_18_0 = null;
                    stackOut_18_1 = (gf) var3_ref_gf;
                    stackIn_42_0 = stackOut_18_0;
                    stackIn_42_1 = stackOut_18_1;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    if (var5 != 0) {
                      L8: while (true) {
                        L9: {
                          if (stackIn_42_0 == (Object) (Object) stackIn_42_1) {
                            break L9;
                          } else {
                            if (((j) this).field_v[var2_int].a((byte) -93)) {
                              ((j) this).field_v[var2_int] = null;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                        }
                        var2_int++;
                        if (var5 == 0) {
                          if (800 <= var2_int) {
                            break L6;
                          } else {
                            stackOut_41_0 = null;
                            stackOut_41_1 = ((j) this).field_v[var2_int];
                            stackIn_42_0 = stackOut_41_0;
                            stackIn_42_1 = stackOut_41_1;
                            continue L8;
                          }
                        } else {
                          break L6;
                        }
                      }
                    } else {
                      L10: {
                        if (stackIn_19_0 == (Object) (Object) stackIn_19_1) {
                          break L10;
                        } else {
                          L11: {
                            L12: {
                              if (28 == var3_ref_gf.field_I) {
                                break L12;
                              } else {
                                var4 = var3_ref_gf.a(16510, ((j) this).field_D, 640.0) ? 1 : 0;
                                if (var5 == 0) {
                                  break L11;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            var4 = var3_ref_gf.a(var3_ref_gf.field_d, ((j) this).field_D + (double)ri.field_q, ((j) this).field_N + (double)am.field_p, var3_ref_gf.field_F, param0) ? 1 : 0;
                            break L11;
                          }
                          L13: {
                            if (var3_ref_gf.field_I != 20) {
                              break L13;
                            } else {
                              if (435.0 >= var3_ref_gf.field_m) {
                                break L13;
                              } else {
                                var4 = 1;
                                this.a(ld.field_h[var3_ref_gf.field_I], (int)var3_ref_gf.field_m, gf.field_k[var3_ref_gf.field_I], (int)var3_ref_gf.field_i, 27396);
                                break L13;
                              }
                            }
                          }
                          if (var4 != 0) {
                            ((j) this).field_m[var2_int] = null;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                      var2_int++;
                      if (var5 == 0) {
                        continue L5;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                if (param0) {
                  var2_int = 0;
                  L14: while (true) {
                    if (800 <= var2_int) {
                      break L6;
                    } else {
                      stackOut_41_0 = null;
                      stackOut_41_1 = ((j) this).field_v[var2_int];
                      stackIn_42_0 = stackOut_41_0;
                      stackIn_42_1 = stackOut_41_1;
                      L15: {
                        if (stackIn_42_0 == (Object) (Object) stackIn_42_1) {
                          break L15;
                        } else {
                          if (((j) this).field_v[var2_int].a((byte) -93)) {
                            ((j) this).field_v[var2_int] = null;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                      }
                      var2_int++;
                      if (var5 == 0) {
                        continue L14;
                      } else {
                        break L6;
                      }
                    }
                  }
                } else {
                  return;
                }
              }
              var3 = 0;
              L16: while (true) {
                L17: {
                  L18: {
                    if (~((j) this).field_h.length >= ~var3) {
                      break L18;
                    } else {
                      if (var5 != 0) {
                        break L17;
                      } else {
                        L19: {
                          L20: {
                            if (((j) this).field_u < 50) {
                              break L20;
                            } else {
                              L21: {
                                if (100 <= ((j) this).field_u) {
                                  break L21;
                                } else {
                                  var4 = 65536 * (((j) this).field_u >> -1835558109);
                                  if (var5 == 0) {
                                    break L19;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                              L22: {
                                if (150 <= ((j) this).field_u) {
                                  break L22;
                                } else {
                                  var4 = (((j) this).field_u >> 1426778883) * 65792;
                                  if (var5 == 0) {
                                    break L19;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                              var4 = 65537 * (((j) this).field_u >> 250666755);
                              if (var5 == 0) {
                                break L19;
                              } else {
                                break L20;
                              }
                            }
                          }
                          var4 = 65793 * (((j) this).field_u >> 56073124);
                          break L19;
                        }
                        ((j) this).field_h[var3].a((int)(((j) this).field_D + (double)hi.a((int)(1.5 * (double)ri.field_e), 4, ((j) this).field_l) - (double)(ri.field_e / 3)), 15, var4, -5, 1, (int)(((j) this).field_N + (double)hi.a((int)((double)am.field_l * 1.5), 4, ((j) this).field_l) - (double)(am.field_l / 3)));
                        var3++;
                        if (var5 == 0) {
                          continue L16;
                        } else {
                          break L18;
                        }
                      }
                    }
                  }
                  break L17;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.H(" + param0 + ')');
        }
    }

    private final int g(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (((j) this).field_m[var2_int] == null) {
                    break L3;
                  } else {
                    var2_int++;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == 119) {
                  break L2;
                } else {
                  this.i((byte) -102);
                  break L2;
                }
              }
              stackOut_10_0 = var2_int;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.FB(" + param0 + ')');
        }
        return stackIn_11_0;
    }

    private final void c(byte param0) {
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_18_0 = false;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_17_0 = false;
        int stackOut_24_0 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var2 = null;
              if (0 == ((j) this).field_q) {
                var2 = (Object) (Object) oi.field_f;
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 > 109) {
              L2: {
                if (1 != ((j) this).field_q) {
                  break L2;
                } else {
                  var2 = (Object) (Object) sg.field_e;
                  break L2;
                }
              }
              L3: {
                if (2 == ((j) this).field_q) {
                  var2 = (Object) (Object) uk.field_h;
                  break L3;
                } else {
                  break L3;
                }
              }
              if (null != var2) {
                var3 = 0;
                L4: while (true) {
                  L5: {
                    L6: {
                      if (var3 >= 20) {
                        break L6;
                      } else {
                        al.field_g[var3] = hi.a(640, 4, ((j) this).field_l);
                        stackOut_17_0 = ((he) var2).b(0, 0, al.field_g[var3], 305);
                        stackIn_25_0 = stackOut_17_0 ? 1 : 0;
                        stackIn_18_0 = stackOut_17_0;
                        if (var4 != 0) {
                          break L5;
                        } else {
                          L7: {
                            if (!stackIn_18_0) {
                              var3--;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          var3++;
                          if (var4 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    bc.field_d.c();
                    wj.f(0, 0, bc.field_d.field_y, bc.field_d.field_w, 0);
                    lb.field_C.a(124);
                    stackOut_24_0 = ((j) this).field_q;
                    stackIn_25_0 = stackOut_24_0;
                    break L5;
                  }
                  ab.field_b = stackIn_25_0;
                  break L0;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw ie.a((Throwable) var2, "j.GA(" + param0 + ')');
        }
    }

    private final void c(byte param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (0 >= param1) {
                break L1;
              } else {
                ((j) this).field_R = ((j) this).field_R + param1;
                break L1;
              }
            }
            L2: {
              if (param0 == -61) {
                break L2;
              } else {
                ((j) this).a(-77, -76);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var3, "j.W(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, gf param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 24) {
                break L1;
              } else {
                this.c(69);
                break L1;
              }
            }
            ((j) this).field_v[this.h((byte) -111)] = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("j.RA(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    private final void H(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        nl var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (param0 == 1) {
              if (!((j) this).field_eb) {
                L1: {
                  L2: {
                    ((j) this).field_Z = 0;
                    ((j) this).field_fb = 0;
                    if (gm.field_J < 500) {
                      break L2;
                    } else {
                      ((j) this).s(94);
                      var2_int = 0;
                      L3: while (true) {
                        L4: {
                          L5: {
                            if (~si.field_C.length >= ~var2_int) {
                              break L5;
                            } else {
                              si.field_C[var2_int] = true;
                              var2_int++;
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
                          lg.field_g = true;
                          s.field_e = true;
                          ni.field_w = true;
                          nb.field_d = true;
                          wb.a(34);
                          break L4;
                        }
                        if (var3 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L6: {
                    if (gm.field_J == 0) {
                      L7: {
                        gf.field_D = Math.max(1 + sd.field_a.field_q, gf.field_D);
                        var2_ref = new nl(0, -1 + gf.field_D, 0, 0, 0, 0);
                        if (!oh.a(param0 + -1)) {
                          break L7;
                        } else {
                          dl.field_M.a((gi) (Object) var2_ref, param0 + 254);
                          if (var3 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      rc.a(5, var2_ref, -11659);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L8: {
                    L9: {
                      if (gm.field_J <= 128) {
                        break L9;
                      } else {
                        if (((j) this).field_R == 0) {
                          break L9;
                        } else {
                          break L8;
                        }
                      }
                    }
                    gm.field_J = gm.field_J + 1;
                    break L8;
                  }
                  this.o(param0 + 122);
                  break L1;
                }
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.F(" + param0 + ')');
        }
    }

    private final void u(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (gm.field_J > 0) {
                  break L2;
                } else {
                  if (!((j) this).field_eb) {
                    break L1;
                  } else {
                    L3: {
                      var2_int = (-((j) this).field_s + ((j) this).field_J) * 255 / 300;
                      if (255 < var2_int) {
                        var2_int = 255;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    be.a(64 + var2_int / 2, -(var2_int / 2 + 64), -(var2_int / 2 + 64));
                    be.b(var2_int * 2 + 128);
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L4: {
                if (150 < gm.field_J) {
                  L5: {
                    if (((j) this).field_D <= (double)ri.field_e) {
                      break L5;
                    } else {
                      ((j) this).field_j = ((j) this).field_j - 0.5;
                      if (var6 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  ((j) this).field_j = 0.0;
                  break L4;
                } else {
                  break L4;
                }
              }
              L6: {
                if (gm.field_J < 50) {
                  break L6;
                } else {
                  L7: {
                    be.a(0, 0, 640, 430, 22070844, 255);
                    var2_int = gm.field_J * 2;
                    if (255 < var2_int) {
                      var2_int = 255;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    var3 = (-150 + gm.field_J) * 2;
                    if (var3 > 255) {
                      var3 = 255;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    cb.field_b.b(vh.field_d, 320, 200, 16777215, -1, var2_int);
                    if (0 > var3) {
                      var3 = 0;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    var4 = sa.field_g + ((j) this).field_H;
                    cb.field_b.b(var4, 320, 250, 16777215, -1, var2_int);
                    if (0 >= ((j) this).field_R) {
                      break L10;
                    } else {
                      var5 = kh.field_o + ((j) this).field_T + af.field_c + ((j) this).field_X + l.field_h + ((j) this).field_R;
                      cb.field_b.b(var5, 320, 255 - -cb.field_b.field_x, 16777215, -1, var2_int);
                      if (var2_int > 200) {
                        L11: {
                          if (((j) this).field_R > 29) {
                            break L11;
                          } else {
                            this.d((byte) -100, ((j) this).field_R);
                            ((j) this).field_R = 0;
                            if (var6 == 0) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        ((j) this).field_R = ((j) this).field_R - 29;
                        this.d((byte) -100, 29);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                  }
                  cb.field_b.b(bj.field_b, 320, 320, 16711680, -1, var3);
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L6;
                  }
                }
              }
              be.a(0, 0, 640, 430, 22070844, gm.field_J * 5);
              break L1;
            }
            L12: {
              if (param0 == 7) {
                break L12;
              } else {
                ((j) this).field_u = -51;
                break L12;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.Q(" + param0 + ')');
        }
    }

    private final void v(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = ((j) this).field_q;
                if (var2_int == 2) {
                  var2_int = 0;
                  L3: while (true) {
                    if (var2_int >= 64) {
                      break L2;
                    } else {
                      wj.a(var2_int * 10, i.field_c[var2_int], 20, 16777215, 64);
                      var2_int++;
                      if (var3 != 0) {
                        break L1;
                      } else {
                        if (var3 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              if (param0 <= -56) {
                break L1;
              } else {
                field_e = 123;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ie.a((Throwable) (Object) runtimeException, "j.S(" + param0 + ')');
        }
    }

    private final void a(int param0, double param1, double param2, boolean param3, boolean param4) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 > 111) {
                break L1;
              } else {
                this.b(true);
                break L1;
              }
            }
            L2: {
              if (((j) this).field_q > 5) {
                stackOut_6_0 = 334;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 430;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            L3: {
              var8_int = stackIn_7_0;
              if ((double)var8_int < param1) {
                param1 = (double)(-of.field_x.field_c + var8_int);
                break L3;
              } else {
                break L3;
              }
            }
            ((j) this).field_d[this.f(0)] = new ib(param2, param1, param3, param4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var8, "j.UA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(byte param0) {
        RuntimeException runtimeException = null;
        fj var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = -108 / ((param0 - 60) / 54);
              var2 = (fj) (Object) ((j) this).field_I.h(-11151);
              if (null != var2) {
                L2: {
                  L3: {
                    var5 = ((j) this).field_bb;
                    if (80 > var5) {
                      break L3;
                    } else {
                      L4: {
                        if (var5 >= 230) {
                          break L4;
                        } else {
                          var4 = 8;
                          if (var6 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var4 = -(var5 / 2) + 123;
                      if (var6 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var4 = var5 / 2 + -32;
                  break L2;
                }
                di.field_b[var2.field_h].b(8, var4);
                a.field_g.c(sc.field_b[var2.field_h], 48, a.field_g.field_x + var4, 16777215, -1);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ie.a((Throwable) (Object) runtimeException, "j.RB(" + param0 + ')');
        }
    }

    private final void d(byte param0, int param1) {
        int var3_int = 0;
        if (param0 >= -37) {
            return;
        }
        try {
            if (param1 > 0) {
                var3_int = (int)(cd.a((byte) 97) * (double)((j) this).field_L * (double)param1);
                ((j) this).field_i = ((j) this).field_i + var3_int;
                ((j) this).field_g = ((j) this).field_g ^ var3_int;
                ((j) this).field_H = ((j) this).field_H + var3_int;
                ((j) this).field_f = ((j) this).field_f + var3_int;
                ((j) this).field_x = ((j) this).field_x ^ var3_int;
                ((j) this).field_f = ((j) this).field_f + var3_int;
            }
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "j.J(" + param0 + ',' + param1 + ')');
        }
    }

    private final void c(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
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
        int stackIn_6_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_22_0 = 0;
        var19 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (3 == ((j) this).field_q) {
              return;
            } else {
              var4 = ((j) this).field_G.field_h.length;
              var5 = -((j) this).field_J + var4;
              var7_int = 0;
              L1: while (true) {
                stackOut_5_0 = 1600;
                stackIn_6_0 = stackOut_5_0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (stackIn_6_0 <= var7_int) {
                        break L4;
                      } else {
                        var6 = ((j) this).field_n[var7_int];
                        if (var19 != 0) {
                          break L3;
                        } else {
                          L5: {
                            if (var6 == null) {
                              break L5;
                            } else {
                              if (var6.field_s) {
                                break L5;
                              } else {
                                if (cj.field_c[var6.field_Q]) {
                                  break L5;
                                } else {
                                  if (var6.field_Q == 40) {
                                    break L5;
                                  } else {
                                    var3 = var6.field_I + ((int)var6.field_o - -((j) this).field_J);
                                    var8 = (int)var6.field_o;
                                    L6: while (true) {
                                      if (~(int)((double)var6.field_m + var6.field_o) >= ~var8) {
                                        break L5;
                                      } else {
                                        stackOut_22_0 = var8 - -((j) this).field_J;
                                        stackIn_6_0 = stackOut_22_0;
                                        stackIn_23_0 = stackOut_22_0;
                                        if (var19 != 0) {
                                          continue L2;
                                        } else {
                                          if (stackIn_23_0 < 0) {
                                            break L5;
                                          } else {
                                            L7: {
                                              L8: {
                                                if (~var8 <= ~var5) {
                                                  break L8;
                                                } else {
                                                  var2_int = -((j) this).field_G.field_h[((j) this).field_J + var8] + 430;
                                                  if (var19 == 0) {
                                                    break L7;
                                                  } else {
                                                    break L8;
                                                  }
                                                }
                                              }
                                              L9: {
                                                var2_int = 330;
                                                if (3 == ((j) this).field_q) {
                                                  break L9;
                                                } else {
                                                  if (((j) this).field_q == 4) {
                                                    break L9;
                                                  } else {
                                                    if (5 == ((j) this).field_q) {
                                                      break L9;
                                                    } else {
                                                      break L7;
                                                    }
                                                  }
                                                }
                                              }
                                              var2_int = 0;
                                              break L7;
                                            }
                                            L10: {
                                              L11: {
                                                L12: {
                                                  if (~var4 >= ~var3) {
                                                    break L12;
                                                  } else {
                                                    if (var6.field_N + (double)var6.field_O > (double)(430 - ((j) this).field_G.field_h[var3])) {
                                                      break L11;
                                                    } else {
                                                      break L12;
                                                    }
                                                  }
                                                }
                                                if (var6.b((byte) 55).b((int)var6.field_o, (int)var6.field_N, var8, var2_int)) {
                                                  break L11;
                                                } else {
                                                  break L10;
                                                }
                                              }
                                              var6.field_j = -2.0;
                                              var6.field_N = var6.field_N - 5.0;
                                              var6.c(5);
                                              break L10;
                                            }
                                            var8++;
                                            if (var19 == 0) {
                                              continue L6;
                                            } else {
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
                          var7_int++;
                          if (var19 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (param0 == -6718) {
                      break L3;
                    } else {
                      this.a(121, -0.13010396482122083, -0.11679658977195154, true, true);
                      break L3;
                    }
                  }
                  var8 = 0;
                  L13: while (true) {
                    L14: {
                      L15: {
                        if (var8 >= 160) {
                          break L15;
                        } else {
                          var7 = ((j) this).field_d[var8];
                          if (var19 != 0) {
                            break L14;
                          } else {
                            L16: {
                              L17: {
                                if (var7 == null) {
                                  break L17;
                                } else {
                                  if (!var7.field_q) {
                                    break L17;
                                  } else {
                                    var9 = 0;
                                    L18: while (true) {
                                      if (var9 >= 1600) {
                                        break L17;
                                      } else {
                                        var10 = ((j) this).field_n[var9];
                                        if (var19 != 0) {
                                          break L16;
                                        } else {
                                          L19: {
                                            if (null == var10) {
                                              break L19;
                                            } else {
                                              if (!cj.field_c[var10.field_Q]) {
                                                break L19;
                                              } else {
                                                if (!var10.field_s) {
                                                  if (ne.a(var10.b((byte) 55), (int)var10.field_o, (int)var10.field_N, var7.field_n, (int)var7.field_d, (int)var7.field_k)) {
                                                    L20: {
                                                      var11 = 0.0;
                                                      var11 = -var7.field_b - 1.0 + -1.0;
                                                      var13 = 0.0;
                                                      var7.field_b = var11;
                                                      var13 = -var7.field_p;
                                                      var7.field_p = var13;
                                                      var15 = Math.sqrt(var7.field_b * var7.field_b + var7.field_p * var7.field_p);
                                                      if (var15 == 0.0) {
                                                        break L20;
                                                      } else {
                                                        var7.field_b = var7.field_b / var15;
                                                        var7.field_p = var7.field_p / var15;
                                                        var17 = Math.pow(0.95, (double)var7.field_c);
                                                        var7.field_b = var7.field_b * var17;
                                                        var7.field_p = var7.field_p * var17;
                                                        if (var19 == 0) {
                                                          break L19;
                                                        } else {
                                                          break L20;
                                                        }
                                                      }
                                                    }
                                                    var17 = Math.random() * 6.283185307179586;
                                                    var7.field_b = ji.a(65535, var17);
                                                    var7.field_p = pj.a(var17, 32768);
                                                    break L19;
                                                  } else {
                                                    break L19;
                                                  }
                                                } else {
                                                  break L19;
                                                }
                                              }
                                            }
                                          }
                                          var9++;
                                          if (var19 == 0) {
                                            continue L18;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              var8++;
                              break L16;
                            }
                            if (var19 == 0) {
                              continue L13;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                      break L14;
                    }
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.JB(" + param0 + ')');
        }
    }

    private final void a(int param0, byte param1) {
        double var3_double = 0.0;
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
        bf var28_ref = null;
        int var29 = 0;
        double var30 = 0.0;
        int var32 = 0;
        gf var32_ref_gf = null;
        int var33 = 0;
        double var34_double = 0.0;
        int var34 = 0;
        double var36 = 0.0;
        int var38 = 0;
        int stackIn_105_0 = 0;
        double stackIn_122_0 = 0.0;
        double stackIn_123_0 = 0.0;
        double stackIn_124_0 = 0.0;
        double stackIn_124_1 = 0.0;
        int stackIn_135_0 = 0;
        int stackOut_104_0 = 0;
        double stackOut_121_0 = 0.0;
        double stackOut_123_0 = 0.0;
        double stackOut_123_1 = 0.0;
        double stackOut_122_0 = 0.0;
        double stackOut_122_1 = 0.0;
        int stackOut_134_0 = 0;
        L0: {
          var38 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param1 >= 21) {
            break L0;
          } else {
            this.a(-113, -38, 62, 92, 4);
            break L0;
          }
        }
        var3_double = 0.0;
        var5 = 0.0;
        var7 = 0.0;
        var9 = 0.0;
        if (((j) this).field_eb) {
          return;
        } else {
          L1: {
            L2: {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      L7: {
                        var5 = (double)ri.field_q + ((j) this).field_D;
                        lh.field_m = lh.field_m | 1 << ((j) this).field_q;
                        var3_double = ((j) this).field_N + (double)am.field_p;
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
                          if (var13_int != 25) {
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
                          if (var13_int != 20) {
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
                          if (var13_int != 21) {
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
                        if (var13_int != 23) {
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
                    var3_double = -32.0 + (((j) this).field_N + (double)am.field_l);
                    if (var38 == 0) {
                      break L1;
                    } else {
                      break L5;
                    }
                  }
                  var7 = ((j) this).field_c;
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
              var9 = (double)(hi.a(((j) this).field_S * 4, 4, ((j) this).field_l) - ((j) this).field_S * 2);
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
                var32 = param0;
                if (var32 != 19) {
                  break L15;
                } else {
                  if (var38 == 0) {
                    L16: {
                      L17: {
                        L18: {
                          L19: {
                            L20: {
                              L21: {
                                L22: {
                                  L23: {
                                    var32 = ((j) this).field_S;
                                    if (var32 == 1) {
                                      var9 = var9 + 3.0 * (Math.random() - 0.5);
                                      ((j) this).field_m[this.g((byte) 119)] = new gf(param0, var3_double, var5, var7, var9, 800.0, ((j) this).field_D);
                                      ((j) this).field_S = 0;
                                      if (var38 == 0) {
                                        break L13;
                                      } else {
                                        break L23;
                                      }
                                    } else {
                                      L24: {
                                        if (var32 != 2) {
                                          break L24;
                                        } else {
                                          if (var38 == 0) {
                                            break L23;
                                          } else {
                                            break L24;
                                          }
                                        }
                                      }
                                      if (var32 == 3) {
                                        break L22;
                                      } else {
                                        L25: {
                                          if (var32 != 4) {
                                            break L25;
                                          } else {
                                            if (var38 == 0) {
                                              break L21;
                                            } else {
                                              break L25;
                                            }
                                          }
                                        }
                                        if (var32 == 5) {
                                          break L20;
                                        } else {
                                          if (var32 == 6) {
                                            break L19;
                                          } else {
                                            if (var32 == 7) {
                                              break L18;
                                            } else {
                                              if (var32 == 8) {
                                                break L17;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var11 = 2.0 * (-0.5 + Math.random()) + 0.5;
                                  ((j) this).field_m[this.g((byte) 119)] = new gf(param0, var3_double - 10.0, var5 - 6.0, var7, var9 + var11, 800.0, ((j) this).field_D);
                                  ((j) this).field_m[this.g((byte) 119)] = new gf(param0, var3_double - 10.0, 6.0 + var5, var7, var9 - var11, 800.0, ((j) this).field_D);
                                  ((j) this).field_S = 0;
                                  if (var38 == 0) {
                                    break L13;
                                  } else {
                                    break L22;
                                  }
                                }
                                var11 = (Math.random() - 0.5) * 1.0 + 1.0;
                                ((j) this).field_m[this.g((byte) 119)] = new gf(param0, var3_double - 10.0, var5 - 6.0, var7, var9 - var11, 800.0, ((j) this).field_D);
                                ((j) this).field_m[this.g((byte) 119)] = new gf(param0, var3_double, var5, var7, var9, 800.0, ((j) this).field_D);
                                ((j) this).field_m[this.g((byte) 119)] = new gf(param0, -10.0 + var3_double, 6.0 + var5, var7, var9 + var11, 800.0, ((j) this).field_D);
                                ((j) this).field_S = 0;
                                if (var38 == 0) {
                                  break L13;
                                } else {
                                  break L21;
                                }
                              }
                              var11 = 0.5 + (Math.random() - 0.5) * 1.0;
                              ((j) this).field_m[this.g((byte) 119)] = new gf(param0, -10.0 + var3_double, -6.0 + var5, var7, var9 - var11, 800.0, ((j) this).field_D);
                              ((j) this).field_m[this.g((byte) 119)] = new gf(24, var3_double, var5, 2.0 + var7, var9, 800.0, ((j) this).field_D);
                              ((j) this).field_m[this.g((byte) 119)] = new gf(param0, -10.0 + var3_double, var5 + 6.0, var7, var9 + var11, 800.0, ((j) this).field_D);
                              ((j) this).field_S = 0;
                              if (var38 == 0) {
                                break L13;
                              } else {
                                break L20;
                              }
                            }
                            var11 = 0.5 + 2.0 * (Math.random() - 0.5);
                            ((j) this).field_m[this.g((byte) 119)] = new gf(24, -10.0 + var3_double, -6.0 + var5, 2.0 + var7, -var11 + var9, 800.0, ((j) this).field_D);
                            ((j) this).field_m[this.g((byte) 119)] = new gf(param0, var3_double, var5, var7, var9, 800.0, ((j) this).field_D);
                            ((j) this).field_m[this.g((byte) 119)] = new gf(24, var3_double - 10.0, var5 + 6.0, var7 + 2.0, var9 + var11, 800.0, ((j) this).field_D);
                            ((j) this).field_S = 0;
                            if (var38 == 0) {
                              break L13;
                            } else {
                              break L19;
                            }
                          }
                          var11 = 1.0 + 1.5 * (-0.5 + Math.random());
                          ((j) this).field_m[this.g((byte) 119)] = new gf(24, var3_double - 10.0, -6.0 + var5, 2.0 + var7, -var11 + var9, 800.0, ((j) this).field_D);
                          ((j) this).field_m[this.g((byte) 119)] = new gf(24, var3_double, var5, 2.0 + var7, var9, 800.0, ((j) this).field_D);
                          ((j) this).field_m[this.g((byte) 119)] = new gf(24, var3_double - 10.0, var5 + 6.0, 2.0 + var7, var9 + var11, 800.0, ((j) this).field_D);
                          ((j) this).field_S = 0;
                          if (var38 == 0) {
                            break L13;
                          } else {
                            break L18;
                          }
                        }
                        var11 = 2.0 * (-0.5 + Math.random()) + 0.5;
                        ((j) this).field_m[this.g((byte) 119)] = new gf(24, -10.0 + var3_double, var5 - 6.0, var7 + 2.0, -var11 + var9, 800.0, ((j) this).field_D);
                        ((j) this).field_m[this.g((byte) 119)] = new gf(25, var3_double, var5, 5.0 + var7, var9, 800.0, ((j) this).field_D);
                        ((j) this).field_m[this.g((byte) 119)] = new gf(24, var3_double - 10.0, var5 + 6.0, 2.0 + var7, var9 + var11, 800.0, ((j) this).field_D);
                        ((j) this).field_S = 0;
                        if (var38 == 0) {
                          break L13;
                        } else {
                          break L17;
                        }
                      }
                      var11 = 0.5 + 2.5 * (-0.5 + Math.random());
                      ((j) this).field_m[this.g((byte) 119)] = new gf(25, var3_double - 10.0, -3.0 + var5, 5.0 + var7, var9 - var11, 800.0, ((j) this).field_D);
                      ((j) this).field_m[this.g((byte) 119)] = new gf(24, var3_double, var5, var7 + 2.0, var9, 800.0, ((j) this).field_D);
                      ((j) this).field_m[this.g((byte) 119)] = new gf(25, var3_double - 10.0, var5 + 3.0, 5.0 + var7, var11 + var9, 800.0, ((j) this).field_D);
                      ((j) this).field_S = 0;
                      if (var38 == 0) {
                        break L13;
                      } else {
                        break L16;
                      }
                    }
                    L26: {
                      var11 = 1.0 + (-0.5 + Math.random()) * 2.5;
                      ((j) this).field_m[this.g((byte) 119)] = new gf(25, -10.0 + var3_double, -3.0 + var5, 5.0 + var7, -var11 + var9, 800.0, ((j) this).field_D);
                      ((j) this).field_m[this.g((byte) 119)] = new gf(25, var3_double, var5, var7 + 5.0, var9, 800.0, ((j) this).field_D);
                      ((j) this).field_m[this.g((byte) 119)] = new gf(25, var3_double - 10.0, var5 + 3.0, 5.0 + var7, var9 + var11, 800.0, ((j) this).field_D);
                      if (((j) this).field_S != 9) {
                        break L26;
                      } else {
                        ((j) this).field_S = 0;
                        if (var38 == 0) {
                          break L13;
                        } else {
                          break L26;
                        }
                      }
                    }
                    ((j) this).field_S = ((j) this).field_S - 3;
                    if (var38 == 0) {
                      break L13;
                    } else {
                      break L14;
                    }
                  } else {
                    break L15;
                  }
                }
              }
              L27: {
                if (var32 != 21) {
                  break L27;
                } else {
                  if (var38 == 0) {
                    break L14;
                  } else {
                    break L27;
                  }
                }
              }
              L28: {
                if (28 != var32) {
                  break L28;
                } else {
                  if (var38 == 0) {
                    var23 = -1;
                    var26 = 150.0;
                    var18 = (int)((double)am.field_p + ((j) this).field_N);
                    var20 = 0;
                    var29 = 0;
                    var28 = null;
                    var19 = (int)(((j) this).field_D + (double)ri.field_q);
                    L29: while (true) {
                      L30: {
                        L31: {
                          if (var29 != 0) {
                            break L31;
                          } else {
                            stackOut_104_0 = 0;
                            stackIn_135_0 = stackOut_104_0;
                            stackIn_105_0 = stackOut_104_0;
                            if (var38 != 0) {
                              break L30;
                            } else {
                              var32 = stackIn_105_0;
                              L32: while (true) {
                                L33: {
                                  L34: {
                                    if (1600 <= var32) {
                                      break L34;
                                    } else {
                                      var28_ref = ((j) this).field_n[var32];
                                      if (var38 != 0) {
                                        break L33;
                                      } else {
                                        L35: {
                                          if (null == var28_ref) {
                                            break L35;
                                          } else {
                                            if (var28_ref.a(false)) {
                                              break L35;
                                            } else {
                                              if (var28_ref.field_s) {
                                                break L35;
                                              } else {
                                                if (!wh.field_v[var28_ref.field_Q]) {
                                                  L36: {
                                                    if (0 == var20) {
                                                      break L36;
                                                    } else {
                                                      if (var28_ref.h(63)) {
                                                        break L36;
                                                      } else {
                                                        break L35;
                                                      }
                                                    }
                                                  }
                                                  L37: {
                                                    var24 = dl.a(true, -var28_ref.field_o - (double)var28_ref.field_I - (double)var20 + (double)var18, -var28_ref.field_N - (double)var28_ref.field_t + (double)var19);
                                                    stackOut_121_0 = var24;
                                                    stackIn_123_0 = stackOut_121_0;
                                                    stackIn_122_0 = stackOut_121_0;
                                                    if (var28_ref.field_Q == 36) {
                                                      stackOut_123_0 = stackIn_123_0;
                                                      stackOut_123_1 = 30.0;
                                                      stackIn_124_0 = stackOut_123_0;
                                                      stackIn_124_1 = stackOut_123_1;
                                                      break L37;
                                                    } else {
                                                      stackOut_122_0 = stackIn_122_0;
                                                      stackOut_122_1 = 0.0;
                                                      stackIn_124_0 = stackOut_122_0;
                                                      stackIn_124_1 = stackOut_122_1;
                                                      break L37;
                                                    }
                                                  }
                                                  var24 = stackIn_124_0 - stackIn_124_1;
                                                  if (var24 >= var26) {
                                                    break L35;
                                                  } else {
                                                    var23 = var32;
                                                    var24 = var26;
                                                    break L35;
                                                  }
                                                } else {
                                                  break L35;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var32++;
                                        if (var38 == 0) {
                                          continue L32;
                                        } else {
                                          break L34;
                                        }
                                      }
                                    }
                                  }
                                  if (var23 == -1) {
                                    break L33;
                                  } else {
                                    var29 = 1;
                                    if (var38 == 0) {
                                      continue L29;
                                    } else {
                                      break L33;
                                    }
                                  }
                                }
                                L38: {
                                  if (var20 != 0) {
                                    break L38;
                                  } else {
                                    var20 = -100;
                                    if (var38 == 0) {
                                      continue L29;
                                    } else {
                                      break L38;
                                    }
                                  }
                                }
                                L39: {
                                  if (-100 == var20) {
                                    break L39;
                                  } else {
                                    var29 = 1;
                                    if (var38 == 0) {
                                      continue L29;
                                    } else {
                                      break L39;
                                    }
                                  }
                                }
                                var20 = 100;
                                if (var38 == 0) {
                                  continue L29;
                                } else {
                                  break L31;
                                }
                              }
                            }
                          }
                        }
                        stackOut_134_0 = 0;
                        stackIn_135_0 = stackOut_134_0;
                        break L30;
                      }
                      L40: {
                        if (stackIn_135_0 == ~var23) {
                          ((j) this).field_a = true;
                          break L40;
                        } else {
                          L41: {
                            L42: {
                              var28_ref = ((j) this).field_n[var23];
                              var21 = var28_ref.field_I + (int)var28_ref.field_o;
                              var22 = var28_ref.field_t + (int)var28_ref.field_N;
                              if (var28_ref.field_Q == 0) {
                                break L42;
                              } else {
                                if (var28_ref.field_Q != 35) {
                                  break L41;
                                } else {
                                  break L42;
                                }
                              }
                            }
                            var22 = var22 - var28_ref.field_t / 2;
                            break L41;
                          }
                          L43: {
                            var32_ref_gf = new gf(param0, var3_double, var5, 0.0, 0.0, (double)var21, (double)var22);
                            var32_ref_gf.field_l = ((j) this).field_J;
                            ((j) this).field_m[this.g((byte) 119)] = var32_ref_gf;
                            var33 = var28_ref.a(var32_ref_gf.field_t, 10) ? 1 : 0;
                            if (var33 == 0) {
                              break L43;
                            } else {
                              L44: {
                                this.b(var28_ref, 57);
                                this.d((byte) -63, wh.field_x[var28_ref.field_Q]);
                                if (var28_ref.a(false)) {
                                  break L44;
                                } else {
                                  if (qa.field_I[var28_ref.field_Q] != 0) {
                                    ((j) this).field_o = ((j) this).field_o - 1;
                                    break L44;
                                  } else {
                                    break L44;
                                  }
                                }
                              }
                              L45: {
                                L46: {
                                  L47: {
                                    if (0 == ((j) this).field_o) {
                                      break L47;
                                    } else {
                                      if (qa.field_I[var28_ref.field_Q] < 0) {
                                        break L47;
                                      } else {
                                        break L46;
                                      }
                                    }
                                  }
                                  ((j) this).field_o = 5 - -hi.a(10, 4, ((j) this).field_l);
                                  var34 = Math.abs(qa.field_I[var28_ref.field_Q]);
                                  L48: while (true) {
                                    if (var34 <= 0) {
                                      break L46;
                                    } else {
                                      this.a(121, var28_ref.field_N + (double)hi.a(var28_ref.field_O / 2, 4, ((j) this).field_l), var28_ref.field_o + (double)hi.a(var28_ref.field_m, 4, ((j) this).field_l), false, cj.field_c[var28_ref.field_Q]);
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
                                this.a(116, (gf) null, var28_ref);
                                break L45;
                              }
                              L49: {
                                if (th.field_d[var28_ref.field_Q]) {
                                  break L49;
                                } else {
                                  ((j) this).field_n[var23].a(7769);
                                  ((j) this).field_n[var23] = null;
                                  break L49;
                                }
                              }
                              if (var28_ref.h(-120)) {
                                this.a(var28_ref, 0);
                                break L43;
                              } else {
                                break L43;
                              }
                            }
                          }
                          break L40;
                        }
                      }
                      ((j) this).field_S = 0;
                      return;
                    }
                  } else {
                    break L28;
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
                          ((j) this).field_m[this.g((byte) 119)] = new gf(param0, var3_double, var5, var7, var9, 800.0, ((j) this).field_D, ((j) this).field_u);
                          if (var38 == 0) {
                            break L13;
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
                      if (var32 == 20) {
                        break L51;
                      } else {
                        break L50;
                      }
                    }
                  }
                  ((j) this).field_m[this.g((byte) 119)] = new gf(22, var3_double, var5, var7, var9, 800.0, ((j) this).field_D);
                  ((j) this).field_S = ((j) this).field_S - 1;
                  if (var38 == 0) {
                    break L13;
                  } else {
                    break L51;
                  }
                }
                var30 = (double)((j) this).field_S / 4.0;
                var32 = 0;
                L54: while (true) {
                  L55: {
                    if (((j) this).field_S <= var32) {
                      break L55;
                    } else {
                      ((j) this).field_m[this.g((byte) 119)] = new gf(param0, var3_double, var5, -var30 + (var7 + (double)var32), var9, 800.0, ((j) this).field_D);
                      ((j) this).field_S = ((j) this).field_S - 1;
                      var32++;
                      if (var38 != 0) {
                        break L13;
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
                    break L13;
                  } else {
                    break L50;
                  }
                }
              }
              ((j) this).field_m[this.g((byte) 119)] = new gf(param0, var3_double, var5, var7, var9, 800.0, ((j) this).field_D);
              ((j) this).field_S = ((j) this).field_S - 1;
              break L13;
            }
            var5 = var5 + 13.0;
            var13 = 20.0;
            var3_double = var3_double + 14.0;
            var17 = new double[]{0.0, 0.7853981633974483, -0.7853981633974483, 2.6179938779914944, -2.6179938779914944};
            var32 = -2;
            L56: while (true) {
              L57: {
                L58: {
                  if (var32 > 2) {
                    break L58;
                  } else {
                    var15 = (double)var32 * 0.15 / 2.0 + 1.5707963267948966;
                    if (var38 != 0) {
                      break L57;
                    } else {
                      var33 = 0;
                      L59: while (true) {
                        L60: {
                          L61: {
                            if (var33 >= 5) {
                              break L61;
                            } else {
                              var34_double = ji.a(65535, (double)((j) this).field_J / 5.0) * var13 * ji.a(65535, var17[var33] + var15);
                              var36 = var13 * ji.a(65535, (double)((j) this).field_J / 5.0) * pj.a(var17[var33] + var15, 32768);
                              ((j) this).field_m[this.g((byte) 119)] = new gf(param0, var34_double + (-15.0 + var3_double), var36 + var5, ji.a(65535, var15 + var17[var33]) * var13, pj.a(var15 + var17[var33], 32768) * var13, 800.0, ((j) this).field_D);
                              var33++;
                              if (var38 != 0) {
                                break L60;
                              } else {
                                if (var38 == 0) {
                                  continue L59;
                                } else {
                                  break L61;
                                }
                              }
                            }
                          }
                          var32++;
                          break L60;
                        }
                        if (var38 == 0) {
                          continue L56;
                        } else {
                          break L58;
                        }
                      }
                    }
                  }
                }
                ((j) this).field_S = ((j) this).field_S - 1;
                break L57;
              }
              break L13;
            }
          }
          return;
        }
    }

    private final void e(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int >= 800) {
                    break L3;
                  } else {
                    if (var3 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (null == ((j) this).field_v[var2_int]) {
                          break L4;
                        } else {
                          ((j) this).field_v[var2_int].c((byte) 114);
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
                if (param0 == 97) {
                  break L2;
                } else {
                  ((j) this).field_A = -89;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ie.a((Throwable) (Object) runtimeException, "j.OA(" + param0 + ')');
        }
    }

    private final void a(int param0, gf param1, bf param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        Object stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = this;
              stackOut_0_1 = (int)param2.field_o + param2.field_I;
              stackOut_0_2 = (int)param2.field_N - -param2.field_t;
              stackIn_3_0 = stackOut_0_0;
              stackIn_3_1 = stackOut_0_1;
              stackIn_3_2 = stackOut_0_2;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              stackIn_1_2 = stackOut_0_2;
              if (null != param1) {
                stackOut_3_0 = this;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = stackIn_3_2;
                stackOut_3_3 = gf.field_k[param1.field_I];
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                stackIn_4_3 = stackOut_3_3;
                break L1;
              } else {
                stackOut_1_0 = this;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = stackIn_1_2;
                stackOut_1_3 = -1;
                stackIn_4_0 = stackOut_1_0;
                stackIn_4_1 = stackOut_1_1;
                stackIn_4_2 = stackOut_1_2;
                stackIn_4_3 = stackOut_1_3;
                break L1;
              }
            }
            L2: {
              this.a(stackIn_4_1, stackIn_4_2, stackIn_4_3, param2, -111);
              if (param2.field_Q == 42) {
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
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("j.V(").append(param0).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L5;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
    }

    final bf a(int param0, boolean param1, int param2, int param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        bf var8 = null;
        int var9 = 0;
        bf stackIn_29_0 = null;
        RuntimeException decompiledCaughtException = null;
        bf stackOut_28_0 = null;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var8 = new bf(param2, param4, ((j) this).field_J, param3, param0, param1);
              if (param5) {
                break L1;
              } else {
                ((j) this).field_d = null;
                break L1;
              }
            }
            L2: {
              if (!var8.h(49)) {
                break L2;
              } else {
                sc.a(-1, true, lh.field_l);
                ((j) this).field_U = true;
                break L2;
              }
            }
            L3: {
              L4: {
                if (var8.a(false)) {
                  break L4;
                } else {
                  if (param1) {
                    break L4;
                  } else {
                    var7_int = this.j(116);
                    if (var9 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              var7_int = this.e(2183);
              break L3;
            }
            L5: {
              L6: {
                ((j) this).field_n[var7_int] = var8;
                if (param1) {
                  break L6;
                } else {
                  L7: {
                    if (param2 == 8) {
                      break L7;
                    } else {
                      if (param2 == 9) {
                        break L7;
                      } else {
                        if (param2 == 10) {
                          break L7;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  ((j) this).field_n[var7_int].field_j = ((j) this).field_n[var7_int].field_j / 3.0;
                  if (var9 == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              ((j) this).field_n[var7_int].field_o = (double)param3;
              break L5;
            }
            ((j) this).field_n[var7_int].c(5);
            stackOut_28_0 = (bf) var8;
            stackIn_29_0 = stackOut_28_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var7, "j.EA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_29_0;
    }

    private final void A(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3_int = 0;
        td var3 = null;
        int var4 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_30_0 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((j) this).field_q == 0) {
                break L1;
              } else {
                if (((j) this).field_q != 1) {
                  return;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var2_int = 0;
              if (param0 == 1052688) {
                break L2;
              } else {
                ((j) this).y(53);
                break L2;
              }
            }
            L3: while (true) {
              stackOut_11_0 = var2_int;
              stackIn_12_0 = stackOut_11_0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (stackIn_12_0 >= 2) {
                      break L6;
                    } else {
                      stackOut_13_0 = 0;
                      stackIn_31_0 = stackOut_13_0;
                      stackIn_14_0 = stackOut_13_0;
                      if (var4 != 0) {
                        break L5;
                      } else {
                        var3_int = stackIn_14_0;
                        L7: while (true) {
                          L8: {
                            if (var3_int >= 20) {
                              break L8;
                            } else {
                              vi.field_h[var2_int][var3_int].a((int)vj.field_f[var2_int], 3, lh.field_n[var2_int], -21, 1, (int)tc.field_f[var2_int]);
                              tc.field_f[var2_int] = tc.field_f[var2_int] + 0.3;
                              vj.field_f[var2_int] = vj.field_f[var2_int] + 0.6;
                              stackOut_16_0 = (vj.field_f[var2_int] < 305.0 ? -1 : (vj.field_f[var2_int] == 305.0 ? 0 : 1));
                              stackIn_12_0 = stackOut_16_0;
                              stackIn_17_0 = stackOut_16_0;
                              if (var4 != 0) {
                                continue L4;
                              } else {
                                L9: {
                                  if (stackIn_17_0 > 0) {
                                    L10: {
                                      nd.field_M = 256;
                                      this.a((int)vj.field_f[var2_int], -84, (int)tc.field_f[var2_int]);
                                      tc.field_f[var2_int] = (double)(hi.a(640, 4, ((j) this).field_l) + -100);
                                      vj.field_f[var2_int] = (double)(-hi.a(1720, 4, ((j) this).field_l));
                                      if (hi.a(5, 4, ((j) this).field_l) < 4) {
                                        break L10;
                                      } else {
                                        lh.field_n[var2_int] = 2102528;
                                        if (var4 == 0) {
                                          break L9;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    lh.field_n[var2_int] = 1052688;
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                L11: {
                                  if (640.0 >= tc.field_f[var2_int]) {
                                    break L11;
                                  } else {
                                    tc.field_f[var2_int] = 0.0;
                                    break L11;
                                  }
                                }
                                var3_int++;
                                if (var4 == 0) {
                                  continue L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          var2_int++;
                          if (var4 == 0) {
                            continue L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  stackOut_30_0 = 0;
                  stackIn_31_0 = stackOut_30_0;
                  break L5;
                }
                var2_int = stackIn_31_0;
                L12: while (true) {
                  L13: {
                    L14: {
                      if (var2_int >= 3801) {
                        break L14;
                      } else {
                        var3 = ((j) this).field_hb[var2_int];
                        if (var4 != 0) {
                          break L13;
                        } else {
                          L15: {
                            if (var3 == null) {
                              break L15;
                            } else {
                              if (var3.a((byte) -107)) {
                                ((j) this).field_hb[var2_int] = null;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                          }
                          var2_int++;
                          if (var4 == 0) {
                            continue L12;
                          } else {
                            break L14;
                          }
                        }
                      }
                    }
                    break L13;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.E(" + param0 + ')');
        }
    }

    private final void a(bf param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Object stackIn_19_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_18_0 = null;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
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
                    ck.field_j[var3_int] = new td(hi.a(6, param1 + 4, ((j) this).field_l), lc.field_m - -hi.a(cj.field_e.field_h, 4, ((j) this).field_l), ti.field_a - -hi.a(cj.field_e.field_c, 4, ((j) this).field_l), -1);
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
                ((j) this).field_U = false;
                break L2;
              }
              var3_int = param1;
              L4: while (true) {
                L5: {
                  L6: {
                    if (~((j) this).field_n.length >= ~var3_int) {
                      break L6;
                    } else {
                      if (var4 != 0) {
                        break L5;
                      } else {
                        L7: {
                          if (null != ((j) this).field_n[var3_int]) {
                            ((j) this).field_U = ((j) this).field_U | ((j) this).field_n[var3_int].h(param1 ^ 80);
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
                    stackOut_18_0 = this;
                    stackIn_21_0 = stackOut_18_0;
                    stackIn_19_0 = stackOut_18_0;
                    if (((j) this).field_U) {
                      stackOut_21_0 = this;
                      stackOut_21_1 = 0;
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      break L8;
                    } else {
                      stackOut_19_0 = this;
                      stackOut_19_1 = 1;
                      stackIn_22_0 = stackOut_19_0;
                      stackIn_22_1 = stackOut_19_1;
                      break L8;
                    }
                  }
                  ((j) this).field_ab = stackIn_22_1 != 0;
                  break L5;
                }
                L9: {
                  if (!((j) this).field_ab) {
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
            stackOut_27_0 = (RuntimeException) var3;
            stackOut_27_1 = new StringBuilder().append("j.A(");
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L10;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param1 + ')');
        }
    }

    final void y(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (0 == sd.field_e) {
                  break L2;
                } else {
                  this.G(param0 ^ 6212);
                  if (!DrPhlogistonSavesTheEarth.field_D) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              wj.c();
              break L1;
            }
            L3: {
              this.e((byte) 97);
              this.l(-1601);
              this.f((byte) -125);
              this.p(-3);
              this.B(-5651);
              this.x(-64);
              this.v(-122);
              if (qe.field_a > 0) {
                break L3;
              } else {
                this.c(true);
                break L3;
              }
            }
            L4: {
              this.u(7);
              this.a((byte) 123);
              this.t(1);
              this.g(param0 ^ -4619);
              if (param0 == 6212) {
                break L4;
              } else {
                this.i(-74);
                break L4;
              }
            }
            L5: {
              if (!((j) this).field_W) {
                break L5;
              } else {
                cb.field_b.b("Cheating!", 270, 465, 16777215, -1, (int)(ji.a(65535, (double)((j) this).field_J / 50.0) * 128.0 + 128.0));
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.QA(" + param0 + ')');
        }
    }

    private final boolean n(int param0) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 > 65) {
                break L1;
              } else {
                ((j) this).field_S = -21;
                break L1;
              }
            }
            L2: {
              L3: {
                if (640 + ((j) this).field_J >= ((j) this).field_G.field_h.length) {
                  break L3;
                } else {
                  if (((j) this).field_ab) {
                    break L3;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_10_0 = stackOut_7_0;
                    break L2;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.N(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final void I(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = param0;
            L1: while (true) {
              L2: {
                L3: {
                  if (64 <= var2_int) {
                    break L3;
                  } else {
                    i.field_c[var2_int] = i.field_c[var2_int] + 10;
                    stackOut_3_0 = 430;
                    stackOut_3_1 = i.field_c[var2_int];
                    stackIn_11_0 = stackOut_3_0;
                    stackIn_11_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 >= stackIn_4_1) {
                          break L4;
                        } else {
                          i.field_c[var2_int] = -20;
                          break L4;
                        }
                      }
                      var2_int++;
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_10_0 = -3;
                stackOut_10_1 = ~((j) this).field_q;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                break L2;
              }
              L5: {
                L6: {
                  if (stackIn_11_0 != stackIn_11_1) {
                    break L6;
                  } else {
                    if (hi.a(100, 4, ((j) this).field_l) >= 1) {
                      break L6;
                    } else {
                      nd.field_M = 255;
                      DrPhlogistonSavesTheEarth.field_K = 255;
                      var2_int = 0;
                      var3 = 0;
                      L7: while (true) {
                        ib.field_a = hi.a(640, 4, ((j) this).field_l);
                        var3++;
                        ch.field_y = hi.a(75, param0 + 4, ((j) this).field_l);
                        var2_int = var2_int != 0 | q.field_e.a(0, 0, ib.field_a, ch.field_y) ? 1 : 0;
                        L8: while (true) {
                          L9: {
                            if (var3 >= 100) {
                              break L9;
                            } else {
                              if (var2_int == 0) {
                                continue L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                          if (var4 != 0) {
                            continue L8;
                          } else {
                            if (var4 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                DrPhlogistonSavesTheEarth.field_K = DrPhlogistonSavesTheEarth.field_K - 10;
                break L5;
              }
              L10: {
                if (nd.field_M <= 64) {
                  break L10;
                } else {
                  nd.field_M = nd.field_M - 10;
                  break L10;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ie.a((Throwable) (Object) runtimeException, "j.LB(" + param0 + ')');
        }
    }

    private final int m(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_2_0 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (param0 == 1280) {
              var2_int = 0;
              L1: while (true) {
                L2: {
                  if (((j) this).field_hb[var2_int] == null) {
                    break L2;
                  } else {
                    var2_int++;
                    if (var3 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_7_0 = var2_int;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 14;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.JA(" + param0 + ')');
        }
        return stackIn_8_0;
    }

    private final int f(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = param0;
            L1: while (true) {
              L2: {
                if (((j) this).field_d[var2_int] == null) {
                  break L2;
                } else {
                  var2_int++;
                  if (var3 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_4_0 = var2_int;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.U(" + param0 + ')');
        }
        return stackIn_5_0;
    }

    private final void b(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        gf var3 = null;
        bf var4 = null;
        int var5 = 0;
        bf var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_4_0 = 0;
        gf stackIn_7_0 = null;
        bf stackIn_58_0 = null;
        bf stackIn_60_0 = null;
        bf stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        int stackIn_76_0 = 0;
        gf stackIn_80_0 = null;
        gf stackIn_99_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        gf stackOut_6_0 = null;
        bf stackOut_57_0 = null;
        bf stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        bf stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        int stackOut_75_0 = 0;
        gf stackOut_79_0 = null;
        gf stackOut_97_0 = null;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        if (1400 <= var2_int) {
                          break L6;
                        } else {
                          var3 = ((j) this).field_m[var2_int];
                          stackOut_3_0 = 0;
                          stackIn_76_0 = stackOut_3_0;
                          stackIn_4_0 = stackOut_3_0;
                          if (var9 != 0) {
                            break L5;
                          } else {
                            var5 = stackIn_4_0;
                            L7: while (true) {
                              L8: {
                                if (var5 >= 1600) {
                                  break L8;
                                } else {
                                  stackOut_6_0 = ((j) this).field_m[var2_int];
                                  stackIn_99_0 = stackOut_6_0;
                                  stackIn_7_0 = stackOut_6_0;
                                  if (var9 != 0) {
                                    break L4;
                                  } else {
                                    if (stackIn_7_0 == null) {
                                      break L8;
                                    } else {
                                      L9: {
                                        var4 = ((j) this).field_n[var5];
                                        if (var4 == null) {
                                          break L9;
                                        } else {
                                          if (!var4.field_s) {
                                            L10: {
                                              if (ne.a(var3.field_g, (int)var3.field_i, (int)var3.field_m, var4.b((byte) 55), (int)var4.field_o, (int)var4.field_N)) {
                                                break L10;
                                              } else {
                                                if (var4.field_D == null) {
                                                  break L9;
                                                } else {
                                                  if (ne.a(var3.field_g, (int)var3.field_i, (int)var3.field_m, var4.field_D, var4.field_d, var4.field_p)) {
                                                    break L10;
                                                  } else {
                                                    break L9;
                                                  }
                                                }
                                              }
                                            }
                                            L11: {
                                              L12: {
                                                if (23 != var3.field_I) {
                                                  break L12;
                                                } else {
                                                  var6_int = 50;
                                                  if (~var6_int >= ~var3.field_t) {
                                                    break L11;
                                                  } else {
                                                    var6_int = var3.field_t;
                                                    if (var9 == 0) {
                                                      break L11;
                                                    } else {
                                                      break L12;
                                                    }
                                                  }
                                                }
                                              }
                                              var6_int = var3.field_t;
                                              break L11;
                                            }
                                            L13: {
                                              var7 = var4.a(var6_int, 10) ? 1 : 0;
                                              if (var7 == 0) {
                                                break L13;
                                              } else {
                                                L14: {
                                                  this.b(var4, 64);
                                                  this.d((byte) -126, wh.field_x[var4.field_Q]);
                                                  if (var4.a(false)) {
                                                    break L14;
                                                  } else {
                                                    if (0 != qa.field_I[var4.field_Q]) {
                                                      ((j) this).field_o = ((j) this).field_o - 1;
                                                      break L14;
                                                    } else {
                                                      break L14;
                                                    }
                                                  }
                                                }
                                                L15: {
                                                  L16: {
                                                    L17: {
                                                      if (((j) this).field_o == 0) {
                                                        break L17;
                                                      } else {
                                                        if (qa.field_I[var4.field_Q] >= 0) {
                                                          break L16;
                                                        } else {
                                                          break L17;
                                                        }
                                                      }
                                                    }
                                                    ((j) this).field_o = hi.a(10, 4, ((j) this).field_l) + 5;
                                                    var8 = Math.abs(qa.field_I[var4.field_Q]);
                                                    L18: while (true) {
                                                      if (var8 <= 0) {
                                                        break L16;
                                                      } else {
                                                        this.a(123, var4.field_N + (double)hi.a(var4.field_O / 2, 4, ((j) this).field_l), var4.field_o + (double)hi.a(var4.field_m, 4, ((j) this).field_l), false, cj.field_c[var4.field_Q]);
                                                        var8--;
                                                        if (var9 != 0) {
                                                          break L15;
                                                        } else {
                                                          if (var9 == 0) {
                                                            continue L18;
                                                          } else {
                                                            break L16;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  this.a(102, var3, var4);
                                                  break L15;
                                                }
                                                L19: {
                                                  if (th.field_d[var4.field_Q]) {
                                                    break L19;
                                                  } else {
                                                    ((j) this).field_n[var5].a(7769);
                                                    ((j) this).field_n[var5] = null;
                                                    break L19;
                                                  }
                                                }
                                                L20: {
                                                  if (var4.h(-65)) {
                                                    this.a(var4, 0);
                                                    break L20;
                                                  } else {
                                                    break L20;
                                                  }
                                                }
                                                L21: {
                                                  stackOut_57_0 = (bf) var4;
                                                  stackIn_60_0 = stackOut_57_0;
                                                  stackIn_58_0 = stackOut_57_0;
                                                  if (param0) {
                                                    stackOut_60_0 = (bf) (Object) stackIn_60_0;
                                                    stackOut_60_1 = 0;
                                                    stackIn_61_0 = stackOut_60_0;
                                                    stackIn_61_1 = stackOut_60_1;
                                                    break L21;
                                                  } else {
                                                    stackOut_58_0 = (bf) (Object) stackIn_58_0;
                                                    stackOut_58_1 = 1;
                                                    stackIn_61_0 = stackOut_58_0;
                                                    stackIn_61_1 = stackOut_58_1;
                                                    break L21;
                                                  }
                                                }
                                                if (((bf) (Object) stackIn_61_0).a(stackIn_61_1 == 0)) {
                                                  break L13;
                                                } else {
                                                  dg.field_c = dg.field_c | 1 << ((j) this).field_q;
                                                  break L13;
                                                }
                                              }
                                            }
                                            L22: {
                                              if (var3.field_I != 23) {
                                                break L22;
                                              } else {
                                                L23: {
                                                  var3.field_t = var3.field_t - var6_int;
                                                  if (var3.field_t > 0) {
                                                    break L23;
                                                  } else {
                                                    ((j) this).field_m[var2_int] = null;
                                                    break L23;
                                                  }
                                                }
                                                this.a(ld.field_h[var3.field_I], var3.field_u + (int)var3.field_m, gf.field_k[var3.field_I], var3.field_q + (int)var3.field_i, 27396);
                                                if (var9 == 0) {
                                                  break L9;
                                                } else {
                                                  break L22;
                                                }
                                              }
                                            }
                                            this.a(ld.field_h[var3.field_I], (int)var3.field_m + var3.field_u, gf.field_k[var3.field_I], var3.field_q + (int)var3.field_i, 27396);
                                            ((j) this).field_m[var2_int] = null;
                                            break L9;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      var5++;
                                      if (var9 == 0) {
                                        continue L7;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                }
                              }
                              var2_int++;
                              if (var9 == 0) {
                                continue L1;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      stackOut_75_0 = ~((j) this).field_fb;
                      stackIn_76_0 = stackOut_75_0;
                      break L5;
                    }
                    L24: {
                      if (stackIn_76_0 <= -1) {
                        break L24;
                      } else {
                        var2_int = 0;
                        L25: while (true) {
                          if (var2_int >= 800) {
                            break L24;
                          } else {
                            var3 = ((j) this).field_v[var2_int];
                            stackOut_79_0 = (gf) var3;
                            stackIn_99_0 = stackOut_79_0;
                            stackIn_80_0 = stackOut_79_0;
                            if (var9 != 0) {
                              break L4;
                            } else {
                              L26: {
                                if (stackIn_80_0 != null) {
                                  if (ne.a(var3.field_g, (int)var3.field_i, (int)var3.field_m, le.field_c, (int)((j) this).field_N, (int)((j) this).field_D)) {
                                    ((j) this).a(((j) this).field_gb - var3.field_t, 0);
                                    this.a(ld.field_h[var3.field_I], (int)var3.field_m, gf.field_k[var3.field_I], (int)var3.field_i, 27396);
                                    if (uf.field_f[var3.field_I]) {
                                      break L26;
                                    } else {
                                      ((j) this).field_v[var2_int] = null;
                                      break L26;
                                    }
                                  } else {
                                    break L26;
                                  }
                                } else {
                                  break L26;
                                }
                              }
                              var2_int++;
                              if (var9 == 0) {
                                continue L25;
                              } else {
                                break L24;
                              }
                            }
                          }
                        }
                      }
                    }
                    L27: {
                      if (param0) {
                        break L27;
                      } else {
                        ((j) this).field_v = null;
                        break L27;
                      }
                    }
                    var2_int = 0;
                    L28: while (true) {
                      if (800 <= var2_int) {
                        break L3;
                      } else {
                        var3 = ((j) this).field_v[var2_int];
                        if (var9 != 0) {
                          break L2;
                        } else {
                          stackOut_97_0 = (gf) var3;
                          stackIn_99_0 = stackOut_97_0;
                          L29: {
                            L30: {
                              if (stackIn_99_0 == null) {
                                break L30;
                              } else {
                                var5 = 0;
                                L31: while (true) {
                                  if (var5 >= 1600) {
                                    break L30;
                                  } else {
                                    var6 = ((j) this).field_n[var5];
                                    if (var9 != 0) {
                                      break L29;
                                    } else {
                                      L32: {
                                        if (null == var6) {
                                          break L32;
                                        } else {
                                          L33: {
                                            if (wh.field_v[var6.field_Q]) {
                                              break L33;
                                            } else {
                                              if (!var6.a(false)) {
                                                break L32;
                                              } else {
                                                if (var6.field_s) {
                                                  break L32;
                                                } else {
                                                  if (ne.a(var3.field_g, (int)var3.field_i, (int)var3.field_m, var6.b((byte) 55), (int)var6.field_o, (int)var6.field_N)) {
                                                    L34: {
                                                      this.a(ld.field_h[var3.field_I], (int)var3.field_m, gf.field_k[var3.field_I], (int)var3.field_i, 27396);
                                                      var7 = var6.a(var3.field_t, 10) ? 1 : 0;
                                                      if (var7 == 0) {
                                                        break L34;
                                                      } else {
                                                        this.a(120, var3, var6);
                                                        if (cj.field_c[var6.field_Q]) {
                                                          break L34;
                                                        } else {
                                                          ((j) this).field_n[var5].a(7769);
                                                          ((j) this).field_n[var5] = null;
                                                          break L34;
                                                        }
                                                      }
                                                    }
                                                    L35: {
                                                      if (uf.field_f[var3.field_I]) {
                                                        break L35;
                                                      } else {
                                                        ((j) this).field_v[var2_int] = null;
                                                        break L35;
                                                      }
                                                    }
                                                    if (var9 == 0) {
                                                      break L32;
                                                    } else {
                                                      break L33;
                                                    }
                                                  } else {
                                                    break L32;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          if (!ne.a(var3.field_g, (int)var3.field_i, (int)var3.field_m, var6.b((byte) 55), (int)var6.field_o, (int)var6.field_N)) {
                                            break L32;
                                          } else {
                                            this.a(ld.field_h[var3.field_I], (int)var3.field_m, gf.field_k[var3.field_I], (int)var3.field_i, 27396);
                                            ((j) this).field_v[var2_int] = null;
                                            break L32;
                                          }
                                        }
                                      }
                                      var5++;
                                      if (var9 == 0) {
                                        continue L31;
                                      } else {
                                        break L30;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var2_int++;
                            break L29;
                          }
                          if (var9 == 0) {
                            continue L28;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  L36: while (true) {
                    L37: {
                      L38: {
                        if (stackIn_99_0 == null) {
                          break L38;
                        } else {
                          var5 = 0;
                          L39: while (true) {
                            if (var5 >= 1600) {
                              break L38;
                            } else {
                              var6 = ((j) this).field_n[var5];
                              if (var9 != 0) {
                                break L37;
                              } else {
                                L40: {
                                  if (null == var6) {
                                    break L40;
                                  } else {
                                    L41: {
                                      if (wh.field_v[var6.field_Q]) {
                                        break L41;
                                      } else {
                                        if (!var6.a(false)) {
                                          break L40;
                                        } else {
                                          if (var6.field_s) {
                                            break L40;
                                          } else {
                                            if (ne.a(var3.field_g, (int)var3.field_i, (int)var3.field_m, var6.b((byte) 55), (int)var6.field_o, (int)var6.field_N)) {
                                              L42: {
                                                this.a(ld.field_h[var3.field_I], (int)var3.field_m, gf.field_k[var3.field_I], (int)var3.field_i, 27396);
                                                var7 = var6.a(var3.field_t, 10) ? 1 : 0;
                                                if (var7 == 0) {
                                                  break L42;
                                                } else {
                                                  this.a(120, var3, var6);
                                                  if (cj.field_c[var6.field_Q]) {
                                                    break L42;
                                                  } else {
                                                    ((j) this).field_n[var5].a(7769);
                                                    ((j) this).field_n[var5] = null;
                                                    break L42;
                                                  }
                                                }
                                              }
                                              L43: {
                                                if (uf.field_f[var3.field_I]) {
                                                  break L43;
                                                } else {
                                                  ((j) this).field_v[var2_int] = null;
                                                  break L43;
                                                }
                                              }
                                              if (var9 == 0) {
                                                break L40;
                                              } else {
                                                break L41;
                                              }
                                            } else {
                                              break L40;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    if (!ne.a(var3.field_g, (int)var3.field_i, (int)var3.field_m, var6.b((byte) 55), (int)var6.field_o, (int)var6.field_N)) {
                                      break L40;
                                    } else {
                                      this.a(ld.field_h[var3.field_I], (int)var3.field_m, gf.field_k[var3.field_I], (int)var3.field_i, 27396);
                                      ((j) this).field_v[var2_int] = null;
                                      break L40;
                                    }
                                  }
                                }
                                var5++;
                                if (var9 == 0) {
                                  continue L39;
                                } else {
                                  break L38;
                                }
                              }
                            }
                          }
                        }
                      }
                      var2_int++;
                      break L37;
                    }
                    if (var9 == 0) {
                      if (800 <= var2_int) {
                        break L3;
                      } else {
                        var3 = ((j) this).field_v[var2_int];
                        if (var9 != 0) {
                          break L2;
                        } else {
                          stackOut_97_0 = (gf) var3;
                          stackIn_99_0 = stackOut_97_0;
                          continue L36;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.NA(" + param0 + ')');
        }
    }

    private final void a(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (sd.field_e == 2) {
              L1: {
                if (2 == ((j) this).field_q) {
                  stackOut_6_0 = 381;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_4_0 = 305;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              }
              var3_int = stackIn_7_0;
              var4 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (var4 >= 20) {
                      break L4;
                    } else {
                      bc.field_d.a(al.field_g[var4], var3_int + -bc.field_d.field_w, 256);
                      var4++;
                      if (var5 != 0) {
                        break L3;
                      } else {
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (param0 == 0) {
                    break L3;
                  } else {
                    ((j) this).a(-86, -83);
                    break L3;
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var3, "j.R(" + param0 + ',' + param1 + ')');
        }
    }

    private final void k(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        td stackIn_4_0 = null;
        td stackIn_21_0 = null;
        RuntimeException decompiledCaughtException = null;
        td stackOut_3_0 = null;
        td stackOut_19_0 = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = param0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var2_int >= 3801) {
                      break L4;
                    } else {
                      stackOut_3_0 = ((j) this).field_B[var2_int];
                      stackIn_21_0 = stackOut_3_0;
                      stackIn_4_0 = stackOut_3_0;
                      if (var4 != 0) {
                        L5: while (true) {
                          L6: {
                            if (stackIn_21_0 == null) {
                              break L6;
                            } else {
                              if (null == pe.field_e) {
                                break L6;
                              } else {
                                if (!ck.field_j[var2_int].a((byte) -125)) {
                                  break L6;
                                } else {
                                  L7: {
                                    if (!pe.field_e.field_j) {
                                      break L7;
                                    } else {
                                      ck.field_j[var2_int] = null;
                                      if (var4 == 0) {
                                        break L6;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  ck.field_j[var2_int] = new td(hi.a(6, qk.a(param0, 4), ((j) this).field_l), lc.field_m + hi.a(cj.field_e.field_h, 4, ((j) this).field_l), ti.field_a - -hi.a(cj.field_e.field_c, qk.a(param0, 4), ((j) this).field_l), -1);
                                  break L6;
                                }
                              }
                            }
                          }
                          var2_int++;
                          if (var4 == 0) {
                            if (ck.field_j.length <= var2_int) {
                              break L3;
                            } else {
                              if (var4 != 0) {
                                break L2;
                              } else {
                                stackOut_19_0 = ck.field_j[var2_int];
                                stackIn_21_0 = stackOut_19_0;
                                continue L5;
                              }
                            }
                          } else {
                            break L3;
                          }
                        }
                      } else {
                        L8: {
                          if (stackIn_4_0 != null) {
                            var3 = ((j) this).field_B[var2_int].a((byte) -106) ? 1 : 0;
                            if (var3 != 0) {
                              ((j) this).field_B[var2_int] = null;
                              break L8;
                            } else {
                              break L8;
                            }
                          } else {
                            break L8;
                          }
                        }
                        var2_int++;
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (null != cj.field_e) {
                    var2_int = 0;
                    L9: while (true) {
                      if (ck.field_j.length <= var2_int) {
                        break L3;
                      } else {
                        if (var4 != 0) {
                          break L2;
                        } else {
                          stackOut_19_0 = ck.field_j[var2_int];
                          stackIn_21_0 = stackOut_19_0;
                          L10: {
                            if (stackIn_21_0 == null) {
                              break L10;
                            } else {
                              if (null == pe.field_e) {
                                break L10;
                              } else {
                                if (!ck.field_j[var2_int].a((byte) -125)) {
                                  break L10;
                                } else {
                                  L11: {
                                    if (!pe.field_e.field_j) {
                                      break L11;
                                    } else {
                                      ck.field_j[var2_int] = null;
                                      if (var4 == 0) {
                                        break L10;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  ck.field_j[var2_int] = new td(hi.a(6, qk.a(param0, 4), ((j) this).field_l), lc.field_m + hi.a(cj.field_e.field_h, 4, ((j) this).field_l), ti.field_a - -hi.a(cj.field_e.field_c, qk.a(param0, 4), ((j) this).field_l), -1);
                                  break L10;
                                }
                              }
                            }
                          }
                          var2_int++;
                          if (var4 == 0) {
                            continue L9;
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
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.VA(" + param0 + ')');
        }
    }

    private final int h(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3 = 17 % ((param0 - 0) / 36);
            L1: while (true) {
              L2: {
                if (null == ((j) this).field_v[var2_int]) {
                  break L2;
                } else {
                  var2_int++;
                  if (var4 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_4_0 = var2_int;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.TA(" + param0 + ')');
        }
        return stackIn_5_0;
    }

    private final void l(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -1601) {
                break L1;
              } else {
                this.I(-47);
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var2_int >= 1600) {
                    break L4;
                  } else {
                    if (var3 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (((j) this).field_n[var2_int] == null) {
                          break L5;
                        } else {
                          ((j) this).field_n[var2_int].j(30325);
                          break L5;
                        }
                      }
                      var2_int++;
                      if (var3 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.HA(" + param0 + ')');
        }
    }

    private final void f(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 <= -111) {
                break L1;
              } else {
                ((j) this).field_X = -33;
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (160 <= var2_int) {
                    break L4;
                  } else {
                    if (var3 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (((j) this).field_d[var2_int] == null) {
                          break L5;
                        } else {
                          ((j) this).field_d[var2_int].b((byte) -114);
                          break L5;
                        }
                      }
                      var2_int++;
                      if (var3 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.CB(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6_int = this.l((byte) 113);
        td var7 = new td(param0, param3, param1, param2);
        if (param4 != 27396) {
            return;
        }
        try {
            ((j) this).field_B[var6_int] = var7;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "j.NB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final int l(byte param0) {
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_2_0 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (param0 >= 24) {
              var2_int = 0;
              try {
                L1: {
                  L2: while (true) {
                    L3: {
                      L4: {
                        if (((j) this).field_B[var2_int] == null) {
                          break L4;
                        } else {
                          var2_int++;
                          if (var4 != 0) {
                            break L3;
                          } else {
                            if (var4 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      break L3;
                    }
                    break L1;
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L5: {
                  arrayIndexOutOfBoundsException = (ArrayIndexOutOfBoundsException) (Object) decompiledCaughtException;
                  var2_int = 0;
                  ((j) this).field_B = new td[((j) this).field_B.length];
                  break L5;
                }
              }
              stackOut_12_0 = var2_int;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            } else {
              stackOut_2_0 = 68;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.AB(" + param0 + ')');
        }
        return stackIn_13_0;
    }

    private final void a(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        bf var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = param0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int >= 1600) {
                    break L3;
                  } else {
                    var3 = ((j) this).field_n[var2_int];
                    if (var5 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (null == var3) {
                          break L4;
                        } else {
                          if (!var3.d((byte) 119)) {
                            break L4;
                          } else {
                            L5: {
                              ((j) this).field_n[var2_int].a(7769);
                              ((j) this).field_n[var2_int] = null;
                              if (var3.a(false)) {
                                break L5;
                              } else {
                                if (var3.field_Q == 8) {
                                  break L5;
                                } else {
                                  if (var3.field_Q == 9) {
                                    break L5;
                                  } else {
                                    if (var3.field_Q != 10) {
                                      cj.field_b = cj.field_b | 1 << ((j) this).field_q;
                                      break L5;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                            }
                            var4 = var3.field_Q;
                            if (wh.field_x[var4] >= 0) {
                              break L4;
                            } else {
                              L6: {
                                if (0 < var3.field_H) {
                                  this.c((byte) -61, -wh.field_x[var4]);
                                  ((j) this).field_T = ((j) this).field_T + 1;
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                              ((j) this).field_X = ((j) this).field_X + 1;
                              break L4;
                            }
                          }
                        }
                      }
                      var2_int++;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.IB(" + param0 + ')');
        }
    }

    private final int e(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 2183) {
                break L1;
              } else {
                ((j) this).field_S = -10;
                break L1;
              }
            }
            var2_int = -1 + ((j) this).field_n.length;
            L2: while (true) {
              L3: {
                if (null == ((j) this).field_n[var2_int]) {
                  break L3;
                } else {
                  var2_int--;
                  if (var3 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_7_0 = var2_int;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.SB(" + param0 + ')');
        }
        return stackIn_8_0;
    }

    private final void b(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4_int = 0;
        bf var4 = null;
        int var5 = 0;
        Object var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var2_int = ((j) this).field_G.field_c.length;
                  var3 = -50;
                  var4_int = ((j) this).field_q;
                  if (6 != var4_int) {
                    break L3;
                  } else {
                    if (var7 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (7 == var4_int) {
                  break L2;
                } else {
                  if (var4_int != 8) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = -25;
              break L1;
            }
            L4: {
              if (param0 >= 112) {
                break L4;
              } else {
                ((j) this).field_C = 62;
                break L4;
              }
            }
            var5 = 0;
            L5: while (true) {
              L6: {
                L7: {
                  if (var5 >= var2_int) {
                    break L7;
                  } else {
                    var4 = ((j) this).field_G.field_c[var5];
                    if (var7 != 0) {
                      break L6;
                    } else {
                      L8: {
                        if (var4 == null) {
                          break L8;
                        } else {
                          L9: {
                            var6 = null;
                            if (~(640 + ((j) this).field_J) != ~var4.field_k) {
                              if (((j) this).field_J != 0) {
                                break L9;
                              } else {
                                if (~var4.field_k > ~(640 + ((j) this).field_J)) {
                                  var6 = (Object) (Object) ((j) this).a(-var4.field_W + (430 - -var3), true, var4.field_Q, var4.field_k, var4.field_J, true);
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                            } else {
                              var6 = (Object) (Object) ((j) this).a(var3 + (430 - var4.field_W), false, var4.field_Q, ((j) this).field_J, var4.field_J, true);
                              break L9;
                            }
                          }
                          if (null == var6) {
                            break L8;
                          } else {
                            if (((bf) var6).field_Q != 38) {
                              break L8;
                            } else {
                              ((bf) var6).field_H = ((bf) var6).field_H * (1 - -((j) this).field_q);
                              break L8;
                            }
                          }
                        }
                      }
                      var5++;
                      if (var7 == 0) {
                        continue L5;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                break L6;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.K(" + param0 + ')');
        }
    }

    final boolean C(int param0) {
        RuntimeException var2 = null;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 31578) {
                break L1;
              } else {
                this.b((byte) 45, -85);
                break L1;
              }
            }
            L2: {
              L3: {
                if (!oh.a(param0 ^ 31578)) {
                  break L3;
                } else {
                  L4: {
                    if (0 != ej.field_h) {
                      break L4;
                    } else {
                      if (sd.field_a.field_H != 0) {
                        break L4;
                      } else {
                        if (sd.field_a.field_q == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_13_0 = 1;
                  stackIn_16_0 = stackOut_13_0;
                  break L2;
                }
              }
              stackOut_15_0 = 0;
              stackIn_16_0 = stackOut_15_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.T(" + param0 + ')');
        }
        return stackIn_16_0 != 0;
    }

    private final void t(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        try {
          L0: {
            if (ue.field_b == 0) {
              L1: {
                this.i((byte) -1);
                if (we.field_f >= 96) {
                  stackOut_5_0 = 96;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_3_0 = we.field_f;
                  stackIn_6_0 = stackOut_3_0;
                  break L1;
                }
              }
              L2: {
                var2_int = stackIn_6_0;
                if (param0 == 1) {
                  break L2;
                } else {
                  field_ib = -60;
                  break L2;
                }
              }
              L3: {
                L4: {
                  if (((j) this).field_q == 0) {
                    break L4;
                  } else {
                    if (3 != ((j) this).field_q) {
                      break L3;
                    } else {
                      if (gm.field_J <= 0) {
                        if (ol.field_i.length <= el.field_tb) {
                          break L3;
                        } else {
                          int discarded$2 = cb.field_b.a(ol.field_i[el.field_tb], 0, 334, 544, 96, 16777215, 0, 2, 1, cb.field_b.field_x);
                          al.field_a[1].a(-al.field_a[1].field_h + var2_int + 640, 430 - al.field_a[1].field_c);
                          if (!DrPhlogistonSavesTheEarth.field_D) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (~(-1 + ol.field_i.length) >= ~el.field_tb) {
                  break L3;
                } else {
                  int discarded$3 = cb.field_b.a(ol.field_i[el.field_tb], 0, 334, 544, 96, 16777215, 0, 2, 1, cb.field_b.field_x);
                  al.field_a[0].a(var2_int - -640 - al.field_a[0].field_h, -al.field_a[0].field_c + 430);
                  break L3;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.L(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 <= -75) {
              var4_int = 1 << param0;
              if ((var4_int & hi.field_j) != 0) {
                return;
              } else {
                L1: {
                  hi.field_j = hi.field_j | var4_int;
                  ej.field_h = ej.field_h | var4_int;
                  ((j) this).field_I.a((gi) (Object) new fj(param0), 255);
                  if (!((j) this).field_W) {
                    nf.field_x.a((gi) (Object) new je(param0, param1, ((j) this).field_Q, ((j) this).field_P, ((j) this).field_p, ((j) this).field_C), 255);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var4, "j.BA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_14_0 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = 0;
              if (param0 < 0) {
                break L1;
              } else {
                this.a(36, -16, 69, 83, -103);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (2 <= var2_int) {
                    break L4;
                  } else {
                    stackOut_5_0 = 0;
                    stackIn_15_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var4 != 0) {
                      break L3;
                    } else {
                      var3 = stackIn_6_0;
                      L5: while (true) {
                        L6: {
                          L7: {
                            if (var3 >= 20) {
                              break L7;
                            } else {
                              vi.field_h[var2_int][var3].c(-1);
                              var3++;
                              if (var4 != 0) {
                                break L6;
                              } else {
                                if (var4 == 0) {
                                  continue L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          var2_int++;
                          break L6;
                        }
                        if (var4 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackOut_14_0 = 0;
                stackIn_15_0 = stackOut_14_0;
                break L3;
              }
              var2_int = stackIn_15_0;
              L8: while (true) {
                L9: {
                  L10: {
                    if (var2_int >= 3801) {
                      break L10;
                    } else {
                      if (var4 != 0) {
                        break L9;
                      } else {
                        L11: {
                          if (((j) this).field_hb[var2_int] == null) {
                            break L11;
                          } else {
                            ((j) this).field_hb[var2_int].a(true);
                            break L11;
                          }
                        }
                        var2_int++;
                        if (var4 == 0) {
                          continue L8;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  break L9;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ie.a((Throwable) (Object) runtimeException, "j.EB(" + param0 + ')');
        }
    }

    j(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_24_0 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        ((j) this).field_U = false;
        ((j) this).field_F = false;
        ((j) this).field_ab = false;
        ((j) this).field_W = false;
        ((j) this).field_I = new vd();
        ((j) this).field_o = 10;
        ((j) this).field_c = 0.0;
        ((j) this).field_A = 1;
        ((j) this).field_d = new ib[160];
        ((j) this).field_gb = 255;
        ((j) this).field_t = new int[4];
        ((j) this).field_P = 268435455;
        ((j) this).field_u = 0;
        ((j) this).field_m = new gf[1400];
        ((j) this).field_w = 3;
        ((j) this).field_L = 1;
        ((j) this).field_n = new bf[1600];
        ((j) this).field_bb = 0;
        ((j) this).field_hb = new td[3801];
        ((j) this).field_E = 0;
        ((j) this).field_Z = 0;
        ((j) this).field_O = true;
        ((j) this).field_s = 2147483647;
        ((j) this).field_T = 0;
        ((j) this).field_S = 0;
        ((j) this).field_a = false;
        ((j) this).field_D = 190.0;
        ((j) this).field_B = new td[3801];
        ((j) this).field_R = 0;
        ((j) this).field_X = 0;
        ((j) this).field_b = 0;
        ((j) this).field_h = new ck[3];
        ((j) this).field_j = 0.0;
        ((j) this).field_v = new gf[800];
        ((j) this).field_H = 0;
        ((j) this).field_cb = new int[77];
        ((j) this).field_N = (double)(-am.field_l);
        ((j) this).field_Q = 0;
        ((j) this).field_k = null;
        ((j) this).field_p = ((j) this).field_Q ^ ((j) this).field_P;
        ((j) this).field_C = 268435456 - ((j) this).field_p;
        ((j) this).field_eb = false;
        ((j) this).field_fb = -1;
        ((j) this).field_J = 0;
        try {
          L0: {
            ib.field_t = 0;
            qk.field_c = true;
            ej.field_h = 0;
            ((j) this).field_l = new Random(9416L);
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (64 <= var2_int) {
                    break L3;
                  } else {
                    i.field_c[var2_int] = hi.a(430, 4, ((j) this).field_l);
                    var2_int++;
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
                var2_int = 0;
                break L2;
              }
              L4: while (true) {
                L5: {
                  L6: {
                    if (var2_int >= 2) {
                      break L6;
                    } else {
                      tc.field_f[var2_int] = (double)(hi.a(640, 4, ((j) this).field_l) - 100);
                      vj.field_f[var2_int] = (double)(-hi.a(1720, 4, ((j) this).field_l));
                      stackOut_9_0 = 0;
                      stackIn_25_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var4 != 0) {
                        break L5;
                      } else {
                        stackOut_10_0 = stackIn_10_0;
                        stackIn_12_0 = stackOut_10_0;
                        var3 = stackIn_12_0;
                        L7: while (true) {
                          L8: {
                            L9: {
                              L10: {
                                if (20 <= var3) {
                                  break L10;
                                } else {
                                  vi.field_h[var2_int][var3] = new ck();
                                  var3++;
                                  if (var4 != 0) {
                                    break L9;
                                  } else {
                                    if (var4 == 0) {
                                      continue L7;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                              if (hi.a(5, 4, ((j) this).field_l) < 4) {
                                break L9;
                              } else {
                                lh.field_n[var2_int] = 2102528;
                                if (var4 == 0) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            lh.field_n[var2_int] = 1052688;
                            break L8;
                          }
                          var2_int++;
                          if (var4 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  stackOut_24_0 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  break L5;
                }
                var2_int = stackIn_25_0;
                L11: while (true) {
                  L12: {
                    L13: {
                      if (var2_int >= 75) {
                        break L13;
                      } else {
                        wa.field_Q[var2_int] = hi.a(1280, 4, ((j) this).field_l);
                        we.field_e[var2_int] = 107 + hi.a(215, 4, ((j) this).field_l);
                        jf.field_ib[var2_int] = hi.a(65535, 4, ((j) this).field_l);
                        hh.field_a[var2_int] = hi.a(4096, 4, ((j) this).field_l) * hi.a(2048, 4, ((j) this).field_l) >> -309920180;
                        wi.field_f[var2_int] = hi.a(5, 4, ((j) this).field_l);
                        md.field_c[var2_int] = 15 + hi.a(10, 4, ((j) this).field_l);
                        var2_int++;
                        if (var4 != 0) {
                          break L12;
                        } else {
                          if (var4 == 0) {
                            continue L11;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    ((j) this).field_x = -1901789184;
                    gm.field_J = 0;
                    ((j) this).field_g = 15132;
                    qe.field_a = -150;
                    ((j) this).field_f = 0;
                    ((j) this).field_q = -1 + param0;
                    ((j) this).field_M = ag.a(nl.field_r[5], 256, dg.field_e * 24 / 80);
                    ((j) this).field_M.c(0, nl.field_r[5].field_i.length);
                    ((j) this).field_M.f(-1);
                    ((j) this).field_z = ag.a(nl.field_r[7], 256, 48);
                    break L12;
                  }
                  var2_int = 0;
                  L14: while (true) {
                    L15: {
                      L16: {
                        if (var2_int >= ((j) this).field_h.length) {
                          break L16;
                        } else {
                          ((j) this).field_h[var2_int] = new ck();
                          var2_int++;
                          if (var4 != 0) {
                            break L15;
                          } else {
                            if (var4 == 0) {
                              continue L14;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                      ((j) this).a(255, 0);
                      break L15;
                    }
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "j.<init>(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_V = new db(0);
        field_Y = "Logging in...";
    }
}
