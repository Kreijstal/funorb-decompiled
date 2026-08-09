/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hi {
    private boolean field_F;
    private boolean field_A;
    static String field_pb;
    int field_eb;
    private int field_I;
    static String field_Y;
    int field_K;
    private int field_C;
    private int field_ab;
    int field_g;
    private int field_c;
    static vn field_x;
    private vo field_ob;
    private int field_Z;
    static op field_O;
    int field_r;
    private qj field_b;
    int field_f;
    ej field_H;
    int field_nb;
    int field_G;
    private int field_z;
    wk field_S;
    int field_P;
    int field_hb;
    private ub field_gb;
    uh field_Q;
    int field_q;
    private int field_j;
    private vo field_T;
    private int field_N;
    int[] field_u;
    private int field_k;
    private boolean field_p;
    private vn field_t;
    int field_db;
    private int field_jb;
    private vo field_v;
    private boolean field_w;
    vo field_R;
    private int field_U;
    private int[] field_s;
    private int field_B;
    private int field_o;
    int field_h;
    on field_mb;
    private ra field_W;
    vo field_e;
    mj field_n;
    private int field_fb;
    private fn field_L;
    private int field_ib;
    int[] field_J;
    private boolean field_X;
    private boolean field_M;
    private vn field_V;
    private vo field_m;
    private kd field_kb;
    int field_bb;
    private int[] field_D;
    private int field_y;
    vo field_lb;
    private vo field_d;
    int field_l;
    private vo field_i;
    private int field_cb;
    private ah field_a;
    private int field_E;

    private final void g(byte param0) {
        int fieldTemp$0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_62_0 = 0;
        Object stackIn_134_0 = null;
        Object stackIn_136_0 = null;
        Object stackIn_137_0 = null;
        int stackIn_137_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        wg var4_ref_wg = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        ap var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = 58 / ((60 - param0) / 46);
                if (0 == (this.field_ib ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    if (this.field_ib == 0) {
                      break L3;
                    } else {
                      L4: {
                        if (1 == this.field_ib) {
                          break L4;
                        } else {
                          if (this.field_ib == 2) {
                            break L4;
                          } else {
                            break L1;
                          }
                        }
                      }
                      this.field_p = false;
                      fieldTemp$0 = this.field_cb;
                      this.field_cb = this.field_cb - 1;
                      if (fieldTemp$0 <= 0) {
                        L5: {
                          if ((this.field_ib ^ -1) == -2) {
                            var3 = this.f(86);
                            if (var3 == to.field_b[this.field_bb]) {
                              L6: {
                                to.field_b[this.field_bb] = var3 - -1;
                                if ((lo.field_j ^ -1) <= -3) {
                                  break L6;
                                } else {
                                  if (!this.field_F) {
                                    break L6;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              L7: {
                                var4_ref_wg = new wg(this.field_bb, -1 + to.field_b[this.field_bb], this.field_c, this.field_C, this.field_eb, this.field_Z);
                                if (!po.w(13296)) {
                                  break L7;
                                } else {
                                  dn.field_D.a(0, var4_ref_wg);
                                  if (var8 == 0) {
                                    break L5;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              dd.a(5, var4_ref_wg, -40);
                              break L5;
                            } else {
                              break L5;
                            }
                          } else {
                            break L5;
                          }
                        }
                        ca.a(false, true, 10);
                        if (var8 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  L8: {
                    if (0 != (this.field_h ^ -1)) {
                      stackIn_41_0 = 0;
                      break L8;
                    } else {
                      stackIn_41_0 = 1;
                      break L8;
                    }
                  }
                  L9: {
                    var3 = stackIn_41_0;
                    if (0 < be.field_j) {
                      stackIn_45_0 = 0;
                      break L9;
                    } else {
                      stackIn_45_0 = 1;
                      break L9;
                    }
                  }
                  var4 = stackIn_45_0;
                  var6_int = 0;
                  L10: while (true) {
                    L11: {
                      L12: {
                        if (3 <= var6_int) {
                          break L12;
                        } else {
                          stackIn_62_0 = -1;

                          if (var8 != 0) {
                            break L11;
                          } else {
                            L13: {
                              if (stackIn_62_0 <= (this.field_u[var6_int] ^ -1)) {
                                break L13;
                              } else {
                                if (-1 != (this.field_J[var6_int] ^ -1)) {
                                  break L13;
                                } else {
                                  if (!this.field_gb.b(true)) {
                                    ck.a(-8, 6836);
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                            var6_int++;
                            if (var8 == 0) {
                              continue L10;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      stackIn_62_0 = 0;
                      break L11;
                    }
                    L14: {
                      var5 = stackIn_62_0;
                      if (-501 < (vj.field_q ^ -1)) {
                        break L14;
                      } else {
                        var5 = 1;
                        break L14;
                      }
                    }
                    L15: {
                      L16: {
                        if (var3 != 0) {
                          break L16;
                        } else {
                          L17: {
                            if (this.field_gb.g(16954)) {
                              break L17;
                            } else {
                              if (!this.field_gb.b(true)) {
                                break L15;
                              } else {
                                break L17;
                              }
                            }
                          }
                          var5 = 1;
                          if (var8 == 0) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      L18: {
                        L19: {
                          if (this.field_q == 0) {
                            break L19;
                          } else {
                            if (2 != this.field_q) {
                              break L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        L20: {
                          if (this.field_gb.b(true)) {
                            break L20;
                          } else {
                            if (!this.field_gb.k(16284)) {
                              break L18;
                            } else {
                              break L20;
                            }
                          }
                        }
                        var5 = 1;
                        break L18;
                      }
                      L21: {
                        if (-2 != (this.field_q ^ -1)) {
                          break L21;
                        } else {
                          if ((this.field_gb.field_k ^ -1) != -1) {
                            break L21;
                          } else {
                            var5 = 1;
                            break L21;
                          }
                        }
                      }
                      L22: {
                        if (!bo.field_i) {
                          break L22;
                        } else {
                          if (wo.field_wb) {
                            var5 = 1;
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                      }
                      L23: {
                        L24: {
                          if (4 == this.field_q) {
                            break L24;
                          } else {
                            if (-6 != (this.field_q ^ -1)) {
                              break L23;
                            } else {
                              break L24;
                            }
                          }
                        }
                        if (!this.field_gb.k(16284)) {
                          break L23;
                        } else {
                          var5 = 1;
                          break L23;
                        }
                      }
                      if (6 != this.field_q) {
                        break L15;
                      } else {
                        L25: {
                          if (this.field_gb.k(16284)) {
                            break L25;
                          } else {
                            if ((this.field_gb.field_k ^ -1) != -1) {
                              break L15;
                            } else {
                              break L25;
                            }
                          }
                        }
                        var5 = 1;
                        break L15;
                      }
                    }
                    L26: {
                      if (var5 == 0) {
                        break L26;
                      } else {
                        L27: {
                          var6 = (ap) ((Object) jj.c(10, 94));
                          var7 = this.field_gb.field_k;
                          if (var3 == 0) {
                            break L27;
                          } else {
                            L28: {
                              if (1 == this.field_q) {
                                break L28;
                              } else {
                                if (-7 == (this.field_q ^ -1)) {
                                  break L28;
                                } else {
                                  if (this.field_q != 5) {
                                    break L27;
                                  } else {
                                    var7 = this.field_nb;
                                    if (var8 == 0) {
                                      break L27;
                                    } else {
                                      break L28;
                                    }
                                  }
                                }
                              }
                            }
                            var7 = this.field_gb.field_b;
                            break L27;
                          }
                        }
                        L29: {
                          this.c(true);
                          var6.a(this.field_G, this.field_q, this.field_gb.a((byte) 117), (byte) -101, var7, this.field_gb.b(true), var3 != 0, var4 != 0);
                          if (!bo.field_i) {
                            tp.a(100, false, w.field_a[5]);
                            break L29;
                          } else {
                            break L29;
                          }
                        }
                        L30: {
                          L31: {
                            this.field_cb = 60;
                            stackIn_136_0 = this;

                            if (var3 != 0) {
                              break L31;
                            } else {
                              stackIn_136_0 = this;

                              if (this.field_gb.b(true)) {
                                break L31;
                              } else {
                                stackIn_134_0 = this;
                                stackIn_137_0 = this;
                                stackIn_137_1 = 2;
                                break L30;
                              }
                            }
                          }
                          stackIn_137_0 = this;
                          stackIn_137_1 = 1;
                          break L30;
                        }
                        ((hi) (this)).field_ib = stackIn_137_1;
                        if (this.field_ib == 1) {
                          L32: {
                            if (-251 != (this.field_P ^ -1)) {
                              break L32;
                            } else {
                              if (this.field_q != 0) {
                                break L32;
                              } else {
                                if (this.field_h == -1) {
                                  this.a(252, 3, (byte) -23);
                                  break L32;
                                } else {
                                  break L32;
                                }
                              }
                            }
                          }
                          L33: {
                            if (this.field_gb.field_k < 400) {
                              break L33;
                            } else {
                              if (this.field_q != 4) {
                                break L33;
                              } else {
                                if ((this.field_h ^ -1) == 0) {
                                  this.a(239, 16, (byte) -23);
                                  break L33;
                                } else {
                                  break L33;
                                }
                              }
                            }
                          }
                          L34: {
                            if ((this.field_f ^ -1) != (this.field_P ^ -1)) {
                              break L34;
                            } else {
                              if (this.field_q != 2) {
                                break L34;
                              } else {
                                if (-1 != this.field_h) {
                                  break L34;
                                } else {
                                  this.a(250, 5, (byte) -23);
                                  break L34;
                                }
                              }
                            }
                          }
                          L35: {
                            if (-1 != (this.field_q ^ -1)) {
                              break L35;
                            } else {
                              if (5 == this.field_h) {
                                this.a(247, 8, (byte) -23);
                                break L35;
                              } else {
                                break L35;
                              }
                            }
                          }
                          L36: {
                            if (1 != this.field_q) {
                              break L36;
                            } else {
                              if ((this.field_h ^ -1) != -6) {
                                break L36;
                              } else {
                                if ((this.field_y ^ -1) < -8) {
                                  break L36;
                                } else {
                                  if (!vi.field_a) {
                                    break L36;
                                  } else {
                                    this.a(246, 9, (byte) -23);
                                    break L36;
                                  }
                                }
                              }
                            }
                          }
                          L37: {
                            if (-3 != (this.field_q ^ -1)) {
                              break L37;
                            } else {
                              if (-6 != (this.field_h ^ -1)) {
                                break L37;
                              } else {
                                if (-15 > (this.field_y ^ -1)) {
                                  break L37;
                                } else {
                                  if (!vi.field_a) {
                                    break L37;
                                  } else {
                                    this.a(245, 10, (byte) -23);
                                    break L37;
                                  }
                                }
                              }
                            }
                          }
                          L38: {
                            if (this.field_q != 3) {
                              break L38;
                            } else {
                              if (5 != this.field_h) {
                                break L38;
                              } else {
                                if ((this.field_y ^ -1) < -22) {
                                  break L38;
                                } else {
                                  if (!vi.field_a) {
                                    break L38;
                                  } else {
                                    this.a(244, 11, (byte) -23);
                                    break L38;
                                  }
                                }
                              }
                            }
                          }
                          L39: {
                            if ((this.field_q ^ -1) != -5) {
                              break L39;
                            } else {
                              if (5 != this.field_h) {
                                break L39;
                              } else {
                                if (-29 > (this.field_y ^ -1)) {
                                  break L39;
                                } else {
                                  if (!vi.field_a) {
                                    break L39;
                                  } else {
                                    this.a(230, 25, (byte) -23);
                                    break L39;
                                  }
                                }
                              }
                            }
                          }
                          L40: {
                            if (this.field_q != 5) {
                              break L40;
                            } else {
                              if (this.field_h != 5) {
                                break L40;
                              } else {
                                if ((this.field_y ^ -1) < -36) {
                                  break L40;
                                } else {
                                  if (!vi.field_a) {
                                    break L40;
                                  } else {
                                    this.a(229, 26, (byte) -23);
                                    break L40;
                                  }
                                }
                              }
                            }
                          }
                          L41: {
                            if ((this.field_q ^ -1) != -7) {
                              break L41;
                            } else {
                              if ((this.field_h ^ -1) != -6) {
                                break L41;
                              } else {
                                if (-43 > (this.field_y ^ -1)) {
                                  break L41;
                                } else {
                                  if (vi.field_a) {
                                    this.a(228, 27, (byte) -23);
                                    break L41;
                                  } else {
                                    break L41;
                                  }
                                }
                              }
                            }
                          }
                          if (7 != this.field_q) {
                            break L26;
                          } else {
                            if (this.field_h != 5) {
                              break L26;
                            } else {
                              if ((this.field_y ^ -1) < -50) {
                                break L26;
                              } else {
                                if (vi.field_a) {
                                  this.a(227, 28, (byte) -23);
                                  break L26;
                                } else {
                                  break L26;
                                }
                              }
                            }
                          }
                        } else {
                          break L26;
                        }
                      }
                    }
                    if (var8 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              if (this.field_S.field_d) {
                break L1;
              } else {
                this.field_ib = 0;
                ck.a(-1, 6836);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "hi.C(" + param0 + ')');
        }
    }

    private final void a(boolean param0, kd param1) {
        Object stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        Object stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var3 = null;
        qh var4_ref_qh = null;
        int var4 = 0;
        int var5 = 0;
        var5 = ZombieDawn.field_J;
        try {
          L0: {
            if (!param0) {
              L1: {
                if (this.field_q == 6) {
                  L2: {
                    if ((this.field_h ^ -1) != -4) {
                      break L2;
                    } else {
                      L3: {
                        L4: {
                          if (2 != param1.field_fb) {
                            break L4;
                          } else {
                            var3 = this.a(80, (byte) 121, 180, 104, 694);
                            ((kd) (var3)).field_gb = 30;
                            ((kd) (var3)).field_fb = param1.field_fb;
                            if (var5 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var3 = this.a(80, (byte) 124, 110, 1610, 150);
                        ((kd) (var3)).field_gb = 30;
                        ((kd) (var3)).field_fb = param1.field_fb;
                        break L3;
                      }
                      this.field_gb.d((byte) -106);
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L5: {
                    if (this.field_h == 4) {
                      break L5;
                    } else {
                      if (this.field_h == 5) {
                        var3 = this.a(30, (byte) 126, 20, 1440, 400);
                        var4_ref_qh = new qh();
                        var4_ref_qh.a(0, new kk(((kd) (var3)).a(true) - 400, ((kd) (var3)).f(237239984)));
                        ((kd) (var3)).a(var4_ref_qh, true);
                        ((kd) (var3)).field_fb = 2;
                        this.field_gb.d((byte) -106);
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L5;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  L6: {
                    L7: {
                      var3 = null;
                      var4 = param1.field_fb;
                      if ((var4 ^ -1) != -2) {
                        break L7;
                      } else {
                        if (var5 == 0) {
                          var3 = this.a(200, (byte) 126, 70, 350, 150);
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (-3 != (var4 ^ -1)) {
                        break L8;
                      } else {
                        if (var5 == 0) {
                          var3 = this.a(20, (byte) 120, 100, 650, 370);
                          break L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                    if (-4 == (var4 ^ -1)) {
                      var3 = this.a(20, (byte) 123, 100, 720, 60);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L9: {
                    if (var3 != null) {
                      ((kd) (var3)).field_fb = param1.field_fb;
                      ((kd) (var3)).field_gb = 30;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  this.field_gb.d((byte) -106);
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
          L10: {
            var3 = decompiledCaughtException;
            stackIn_49_0 = var3;

            stackIn_49_1 = new StringBuilder().append("hi.CB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_50_0 = stackIn_49_0;
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "null";
              break L10;
            } else {
              stackIn_50_0 = stackIn_49_0;
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "{...}";
              break L10;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_50_0), stackIn_50_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, byte param2) {
        RuntimeException runtimeException = null;
        int[] var4 = null;
        int var5 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!vi.a(param1, dj.field_i, -88)) {
              L1: {
                var4 = dj.field_i;
                var5 = param1;
                var4[var5 >> -1899950043] = hi.a(var4[var5 >> -1899950043], 1 << eg.a(31, var5));
                var4 = kg.field_g;
                var5 = param1;
                if (param2 == -23) {
                  break L1;
                } else {
                  this.field_q = -95;
                  break L1;
                }
              }
              L2: {
                var4[var5 >> 1856747749] = hi.a(var4[var5 >> 1856747749], 1 << eg.a(31, var5));
                this.field_ob.a(0, new da(param1));
                if (this.field_F) {
                  break L2;
                } else {
                  kk.field_j.a(0, new bo(param1, param0, this.field_c, this.field_C, this.field_eb, this.field_Z));
                  break L2;
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
          runtimeException = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) runtimeException), "hi.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0) {
        RuntimeException runtimeException = null;
        fb var2 = null;
        si var3 = null;
        jo var3_ref = null;
        kd var3_ref2 = null;
        int var4 = 0;
        vo stackIn_27_0 = null;
        vo stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            var2 = (fb) ((Object) this.field_R.b((byte) 26));
            if (param0) {
              L1: while (true) {
                L2: {
                  L3: {
                    if (null == var2) {
                      break L3;
                    } else {
                      if (var4 != 0) {
                        break L2;
                      } else {
                        L4: {
                          L5: {
                            if (var2 instanceof kd) {
                              break L5;
                            } else {
                              L6: {
                                if (!(var2 instanceof si)) {
                                  break L6;
                                } else {
                                  var3 = (si) ((Object) var2);
                                  var3.g(107);
                                  if (var4 == 0) {
                                    break L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              if (!(var2 instanceof jo)) {
                                break L4;
                              } else {
                                var3_ref = (jo) ((Object) var2);
                                var3_ref.l((byte) 52);
                                if (var4 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          L7: {
                            var3_ref2 = (kd) ((Object) var2);
                            if (var3_ref2.field_fb > 0) {
                              var3_ref2.field_gb = so.c(var3_ref2.field_sb);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          var3_ref2.j((byte) 82);
                          if (!var3_ref2.n((byte) 25)) {
                            var3_ref2.B(-124);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L8: {
                          stackIn_27_0 = this.field_R;

                          if (param0) {
                            stackIn_28_0 = (vo) ((Object) stackIn_27_0);
                            stackIn_28_1 = 0;
                            break L8;
                          } else {
                            stackIn_28_0 = (vo) ((Object) stackIn_27_0);
                            stackIn_28_1 = 1;
                            break L8;
                          }
                        }
                        var2 = (fb) ((Object) ((vo) (Object) stackIn_28_0).a(stackIn_28_1 != 0));
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  break L2;
                }
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
          throw sh.a((Throwable) ((Object) runtimeException), "hi.BB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean b(int param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -25983) {
                break L1;
              } else {
                this.field_d = (vo) null;
                break L1;
              }
            }
            L2: {
              if (eh.field_y <= 0) {
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
          throw sh.a((Throwable) ((Object) var2), "hi.B(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final void a(int param0, boolean param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_29_0 = 0;
        wk stackIn_39_0 = null;
        wk stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        wk stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        wk stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int stackIn_59_2 = 0;
        int stackIn_59_3 = 0;
        int stackIn_63_4;
        wk stackIn_66_0;
        int stackIn_66_1;
        int stackIn_66_2;
        int stackIn_66_3;
        int stackIn_66_4;
        int stackIn_66_5;
        boolean stackIn_79_0 = false;
        int stackIn_92_0 = 0;
        boolean stackIn_123_0 = false;
        int stackIn_136_0 = 0;
        int stackIn_137_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_78_0;
        boolean stackOut_122_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ZombieDawn.field_J;
        try {
          L0: {
            if (!this.field_X) {
              this.e(false);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                this.field_Z = this.field_Z + 1;
                this.field_eb = this.field_eb + this.field_c;
                if (-1 > (this.field_r ^ -1)) {
                  L2: {
                    fieldTemp$0 = this.field_r - 1;
                    this.field_r = this.field_r - 1;
                    if (-1 > (fieldTemp$0 ^ -1)) {
                      break L2;
                    } else {
                      pc.a((byte) 13, this.field_L);
                      break L2;
                    }
                  }
                  if (-1 == (this.field_r % 32 ^ -1)) {
                    this.field_H.a(true, 33);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              L3: {
                L4: {
                  this.d((byte) -127);
                  this.e((byte) -115);
                  mm.d((byte) 93);
                  this.field_b.b(param0);
                  if (!this.field_p) {
                    break L4;
                  } else {
                    this.field_Q.a(-1, -1, true);
                    if (var7 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                this.field_Q.a(ei.field_K, ha.field_b, true);
                break L3;
              }
              L5: {
                L6: {
                  if (ei.h(param0 ^ 123)) {
                    break L6;
                  } else {
                    if (param1) {
                      stackIn_29_0 = 0;
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                stackIn_29_0 = 1;
                break L5;
              }
              L7: {
                L8: {
                  var3_int = stackIn_29_0;
                  var4 = this.field_S.field_u;
                  var5 = this.field_S.field_c;
                  if (param1) {
                    break L8;
                  } else {
                    this.field_S.a(false, false, false, (byte) -87, false, false);
                    if (var7 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  L10: {
                    stackIn_39_0 = this.field_S;

                    if (bo.field_p[99]) {
                      break L10;
                    } else {



                      if (!bo.field_p[ge.field_e]) {
                        stackIn_42_0 = (wk) ((Object) stackIn_39_0);
                        stackIn_42_1 = 0;
                        break L9;
                      } else {
                        stackIn_39_0 = (wk) ((Object) stackIn_39_0);
                        break L10;
                      }
                    }
                  }
                  stackIn_42_0 = (wk) ((Object) stackIn_39_0);
                  stackIn_42_1 = 1;
                  break L9;
                }
                L11: {
                  L12: {
                    stackIn_42_0 = (wk) ((Object) stackIn_42_0);

                    if (bo.field_p[98]) {
                      break L12;
                    } else {




                      if (!bo.field_p[vf.field_d]) {
                        stackIn_49_0 = (wk) ((Object) stackIn_42_0);
                        stackIn_49_1 = stackIn_42_1;
                        stackIn_49_2 = 0;
                        break L11;
                      } else {
                        stackIn_42_0 = (wk) ((Object) stackIn_42_0);

                        break L12;
                      }
                    }
                  }
                  stackIn_49_0 = (wk) ((Object) stackIn_42_0);
                  stackIn_49_1 = stackIn_42_1;
                  stackIn_49_2 = 1;
                  break L11;
                }
                L13: {
                  L14: {
                    stackIn_49_0 = (wk) ((Object) stackIn_49_0);

                    if (bo.field_p[96]) {
                      break L14;
                    } else {
                      L15: {
                        stackIn_49_0 = (wk) ((Object) stackIn_49_0);

                        if (!bo.field_p[ic.field_P]) {
                          break L15;
                        } else {



                          stackIn_49_0 = (wk) ((Object) stackIn_49_0);

                          if (bo.field_p[82]) {
                            break L15;
                          } else {
                            stackIn_49_0 = (wk) ((Object) stackIn_49_0);


                            break L14;
                          }
                        }
                      }
                      stackIn_59_0 = (wk) ((Object) stackIn_49_0);
                      stackIn_59_1 = stackIn_49_1;
                      stackIn_59_2 = stackIn_49_2;
                      stackIn_59_3 = 0;
                      break L13;
                    }
                  }
                  stackIn_59_0 = (wk) ((Object) stackIn_49_0);
                  stackIn_59_1 = stackIn_49_1;
                  stackIn_59_2 = stackIn_49_2;
                  stackIn_59_3 = 1;
                  break L13;
                }
                L16: {
                  L17: {
                    stackIn_59_0 = (wk) ((Object) stackIn_59_0);

                    stackIn_63_4 = -48;

                    if (bo.field_p[97]) {
                      break L17;
                    } else {










                      if (!bo.field_p[me.field_Gb]) {
                        stackIn_66_0 = (wk) ((Object) stackIn_59_0);
                        stackIn_66_1 = stackIn_59_1;
                        stackIn_66_2 = stackIn_59_2;
                        stackIn_66_3 = stackIn_59_3;
                        stackIn_66_4 = stackIn_63_4;
                        stackIn_66_5 = 0;
                        break L16;
                      } else {
                        stackIn_59_0 = (wk) ((Object) stackIn_59_0);




                        break L17;
                      }
                    }
                  }
                  stackIn_66_0 = (wk) ((Object) stackIn_59_0);
                  stackIn_66_1 = stackIn_59_1;
                  stackIn_66_2 = stackIn_59_2;
                  stackIn_66_3 = stackIn_59_3;
                  stackIn_66_4 = stackIn_63_4;
                  stackIn_66_5 = 1;
                  break L16;
                }
                ((wk) (Object) stackIn_66_0).a(stackIn_66_1 != 0, stackIn_66_2 != 0, stackIn_66_3 != 0, (byte) stackIn_66_4, stackIn_66_5 != 0, bo.field_p[81]);
                break L7;
              }
              L18: {
                if (!bo.field_i) {
                  break L18;
                } else {
                  if (0 == (this.field_ib ^ -1)) {
                    break L18;
                  } else {
                    if (var3_int == 0) {
                      this.field_S.field_u = var4;
                      this.field_S.field_c = var5;
                      var6 = 0;
                      L19: while (true) {
                        L20: {
                          L21: {
                            if (!this.field_A) {
                              break L21;
                            } else {
                              stackOut_78_0 = param1;
                              stackIn_92_0 = stackOut_78_0 ? 1 : 0;
                              stackIn_79_0 = stackOut_78_0;
                              if (var7 != 0) {
                                break L20;
                              } else {
                                if (!stackIn_79_0) {
                                  break L21;
                                } else {
                                  if (!bo.field_p[80]) {
                                    break L21;
                                  } else {
                                    if (bo.field_p[81]) {
                                      stackIn_92_0 = 16;
                                      break L20;
                                    } else {
                                      stackIn_92_0 = 8;
                                      break L20;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackIn_92_0 = 1;
                          break L20;
                        }
                        if (stackIn_92_0 <= var6) {
                          break L18;
                        } else {
                          vl.a(this.field_S, this.field_gb, -91);
                          var6++;
                          if (var7 == 0) {
                            continue L19;
                          } else {
                            break L18;
                          }
                        }
                      }
                    } else {
                      break L18;
                    }
                  }
                }
              }
              L22: {
                if (!this.field_p) {
                  break L22;
                } else {
                  if (1 == kc.field_R) {
                    this.field_B = this.field_B - (-var4 + this.field_S.field_u);
                    this.field_j = this.field_j - (this.field_S.field_c - var5);
                    if (0 != (this.field_B ^ -1)) {
                      break L22;
                    } else {
                      this.field_B = this.field_B - 1;
                      break L22;
                    }
                  } else {
                    break L22;
                  }
                }
              }
              L23: {
                if (null == this.field_ob.b((byte) 26)) {
                  break L23;
                } else {
                  fieldTemp$1 = this.field_z + 1;
                  this.field_z = this.field_z + 1;
                  if ((fieldTemp$1 ^ -1) > -336) {
                    break L23;
                  } else {
                    this.field_z = 0;
                    this.field_ob.f(62);
                    break L23;
                  }
                }
              }
              L24: {
                if ((this.field_h ^ -1) != 0) {
                  break L24;
                } else {
                  if (-2 != (this.field_q ^ -1)) {
                    break L24;
                  } else {
                    this.g(115);
                    break L24;
                  }
                }
              }
              L25: {
                this.field_H.field_A.a(0, false);
                co.a(0);
                if (var3_int == 0) {
                  var6 = 0;
                  L26: while (true) {
                    L27: {
                      L28: {
                        L29: {
                          if (!this.field_A) {
                            break L29;
                          } else {
                            stackOut_122_0 = param1;
                            stackIn_137_0 = stackOut_122_0 ? 1 : 0;
                            stackIn_123_0 = stackOut_122_0;
                            if (var7 != 0) {
                              break L27;
                            } else {
                              if (!stackIn_123_0) {
                                break L29;
                              } else {
                                if (!bo.field_p[80]) {
                                  break L29;
                                } else {
                                  if (bo.field_p[81]) {
                                    stackIn_136_0 = 16;
                                    break L28;
                                  } else {
                                    stackIn_136_0 = 8;
                                    break L28;
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackIn_136_0 = 1;
                        break L28;
                      }
                      stackIn_137_0 = stackIn_136_0 ^ -1;
                      break L27;
                    }
                    if (stackIn_137_0 >= (var6 ^ -1)) {
                      break L25;
                    } else {
                      this.b((byte) 93);
                      var6++;
                      if (var7 == 0) {
                        continue L26;
                      } else {
                        break L25;
                      }
                    }
                  }
                } else {
                  break L25;
                }
              }
              L30: {
                if (0 >= this.field_N) {
                  break L30;
                } else {
                  L31: {
                    if (0 == this.field_ib) {
                      break L31;
                    } else {
                      if ((this.field_ib ^ -1) != 0) {
                        break L30;
                      } else {
                        if ((double)this.field_S.field_e > 0.95) {
                          break L31;
                        } else {
                          break L30;
                        }
                      }
                    }
                  }
                  this.field_N = this.field_N - 15;
                  break L30;
                }
              }
              this.g((byte) 125);
              so.b(this.field_R);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var3), "hi.GA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(on param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_X = false;
            if (param1 == -99) {
              this.field_mb = param0;
              this.e(false);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("hi.D(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        fb var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = ZombieDawn.field_J;
        try {
          L0: {
            kh.a(78, false);
            if (param2) {
              var5_int = param1 >> -1931554681;
              var6 = param0 >> 1050929159;
              var7 = param3 * param3;
              var8 = (fb) ((Object) this.field_n.a((param3 >> -509258105) - -1, var6, 29845, var5_int));
              L1: while (true) {
                L2: {
                  L3: {
                    if (var8 == null) {
                      break L3;
                    } else {
                      if (var11 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (!(var8 instanceof g)) {
                            break L4;
                          } else {
                            var9 = -param1 + var8.a(true);
                            var10 = var8.f(237239984) - param0;
                            if ((var7 ^ -1) >= (var9 * var9 - -(var10 * var10) ^ -1)) {
                              break L4;
                            } else {
                              ((g) ((Object) var8)).b((byte) 126, 1000);
                              break L4;
                            }
                          }
                        }
                        var8 = (fb) ((Object) this.field_n.b(false));
                        if (var11 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  break L2;
                }
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
          throw sh.a((Throwable) ((Object) runtimeException), "hi.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        le var6 = null;
        kd var7 = null;
        int var8 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            if (bo.field_i) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param3 >= 31) {
                  break L1;
                } else {
                  this.f((byte) 105);
                  break L1;
                }
              }
              var6 = this.field_R.b((byte) 26);
              L2: while (true) {
                L3: {
                  L4: {
                    if (!(var6 instanceof fb)) {
                      break L4;
                    } else {
                      if (var8 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (!(var6 instanceof kd)) {
                            break L5;
                          } else {
                            var7 = (kd) ((Object) var6);
                            if (!var7.i((byte) -126)) {
                              break L5;
                            } else {
                              var7.field_qb = false;
                              if (var7.a(param1, param4, param2, param0, false)) {
                                this.field_W.a(var7, (byte) -123);
                                var7.r(-31340);
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var6 = var6.field_b;
                        if (var8 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  break L3;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var6_ref), "hi.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final kd a(int param0, byte param1, int param2, int param3, int param4) {
        kd var6 = null;
        RuntimeException var6_ref = null;
        kd stackIn_2_0 = null;
        kd stackIn_6_0;
        kd stackIn_6_1;
        int stackIn_6_2;
        int stackIn_6_3;
        kd stackIn_7_0;
        kd stackIn_7_1;
        int stackIn_7_2;
        int stackIn_7_3;
        int stackIn_7_4;
        kd stackIn_8_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 > 119) {
              L1: {
                stackIn_6_0 = null;

                stackIn_6_1 = null;

                stackIn_6_2 = param3 - -pb.a(so.field_a, param2, 1);

                stackIn_6_3 = param4 - -pb.a(so.field_a, param0, 1);

                if (pb.a(so.field_a, 2, 1) != 1) {
                  stackIn_7_0 = null;
                  stackIn_7_1 = null;
                  stackIn_7_2 = stackIn_6_2;
                  stackIn_7_3 = stackIn_6_3;
                  stackIn_7_4 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = null;
                  stackIn_7_1 = null;
                  stackIn_7_2 = stackIn_6_2;
                  stackIn_7_3 = stackIn_6_3;
                  stackIn_7_4 = 1;
                  break L1;
                }
              }
              var6 = new kd(stackIn_7_2, stackIn_7_3, stackIn_7_4 != 0, 0);
              var6.field_gb = 500;
              this.field_R.a(0, var6);
              this.field_gb.d((byte) -106);
              stackIn_8_0 = (kd) (var6);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (kd) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var6_ref), "hi.RA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_8_0;
        }
    }

    final void c(int param0, int param1, int param2) {
        try {
            this.field_lb.a(0, new mm(param0, param2));
            if (param1 != 54) {
                field_O = (op) null;
            }
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "hi.P(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
                      if (param1 >= 117) {
                        break L2;
                      } else {
                        hi.f(true);
                        break L2;
                      }
                    }
                    param0.getAppletContext().showDocument(rc.a(-1, param0, var2), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_10_0 = (RuntimeException) (var2_ref2);

                stackIn_10_1 = new StringBuilder().append("hi.F(");

                if (param0 == null) {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackIn_11_2 = "null";
                  break L4;
                } else {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackIn_11_2 = "{...}";
                  break L4;
                }
              }
              throw sh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void d(int param0) {
        int stackIn_14_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            var2_int = 1 * fb.a(1311979239, (int)(tp.field_p << 1630550657)) + 2 * rd.a(true, (int)(tp.field_p >> -63145023)) >> 1396584944;
            var3 = (-this.field_S.field_u + (-1 + (int)tp.field_p * bd.field_e)) % 1337;
            var4 = var3 / bd.field_e;
            L1: while (true) {
              L2: {
                L3: {
                  if (nh.field_P <= var4) {
                    break L3;
                  } else {
                    stackIn_14_0 = (5 * var4 + var3 * 3) % 9;

                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_14_0 != 0) {
                          break L4;
                        } else {
                          bi.e(var3, var4, var2_int + var3 + -3, -7 + var4, 6715272);
                          break L4;
                        }
                      }
                      var3 += 939;
                      if ((var3 ^ -1) < (bd.field_e ^ -1)) {
                        var4 = var4 + var3 / bd.field_e;
                        var3 = var3 % bd.field_e;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      } else {
                        continue L1;
                      }
                    }
                  }
                }
                var3 = ((int)tp.field_p * bd.field_e - 1 - this.field_S.field_u) % 917;
                stackIn_14_0 = var3 / bd.field_e;
                break L2;
              }
              var4 = stackIn_14_0;
              L5: while (true) {
                L6: {
                  L7: {
                    if (nh.field_P <= var4) {
                      break L7;
                    } else {
                      stackIn_27_0 = (2 * var3 + 4 * var4) % 7;

                      if (var6 != 0) {
                        break L6;
                      } else {
                        L8: {
                          if (stackIn_27_0 == 0) {
                            bi.e(var3, var4, var2_int + (var3 + -3), var4 + -5, 3364192);
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var3 += 547;
                        if (bd.field_e < var3) {
                          var4 = var4 + var3 / bd.field_e;
                          var3 = var3 % bd.field_e;
                          if (var6 == 0) {
                            continue L5;
                          } else {
                            break L7;
                          }
                        } else {
                          continue L5;
                        }
                      }
                    }
                  }
                  var4 = -54 / ((-32 - param0) / 46);
                  var3 = (-this.field_S.field_u + -1 + (int)tp.field_p * bd.field_e) % 593;
                  stackIn_27_0 = var3 / bd.field_e;
                  break L6;
                }
                var5 = stackIn_27_0;
                L9: while (true) {
                  L10: {
                    L11: {
                      if ((nh.field_P ^ -1) >= (var5 ^ -1)) {
                        break L11;
                      } else {
                        if (var6 != 0) {
                          break L10;
                        } else {
                          L12: {
                            if (-1 == ((4 * var5 + var3 * 2) % 7 ^ -1)) {
                              bi.e(var3, var5, var3 - 4 + var2_int, -7 + var5, 5461344);
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          var3 += 375;
                          if ((var3 ^ -1) < (bd.field_e ^ -1)) {
                            var5 = var5 + var3 / bd.field_e;
                            var3 = var3 % bd.field_e;
                            if (var6 == 0) {
                              continue L9;
                            } else {
                              break L11;
                            }
                          } else {
                            continue L9;
                          }
                        }
                      }
                    }
                    break L10;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "hi.W(" + param0 + ')');
        }
    }

    final int f(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = 37 / ((param0 - 28) / 37);
              stackIn_3_0 = 7 * (this.field_q % 4);

              if (0 != (this.field_h ^ -1)) {
                stackIn_4_0 = stackIn_3_0;
                stackIn_4_1 = this.field_h;
                break L1;
              } else {
                stackIn_4_0 = stackIn_3_0;
                stackIn_4_1 = 6;
                break L1;
              }
            }
            stackIn_5_0 = stackIn_4_0 + stackIn_4_1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "hi.Q(" + param0 + ')');
        }
        return stackIn_5_0;
    }

    private final void b(int param0, int param1) {
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        int stackIn_40_3 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        int stackIn_42_3 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_43_2 = 0;
        int stackIn_43_3 = 0;
        int stackIn_43_4 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        int stackIn_44_3 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        int stackIn_46_3 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        int stackIn_47_3 = 0;
        int stackIn_47_4 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_48_2 = 0;
        int stackIn_48_3 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        int stackIn_50_3 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_51_3 = 0;
        int stackIn_51_4 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        int stackIn_52_3 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_54_2 = 0;
        int stackIn_54_3 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        int stackIn_55_3 = 0;
        int stackIn_55_4 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_56_2 = 0;
        int stackIn_56_3 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_58_2 = 0;
        int stackIn_58_3 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_59_2 = 0;
        int stackIn_59_3 = 0;
        int stackIn_59_4 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_60_2 = 0;
        int stackIn_60_3 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_62_2 = 0;
        int stackIn_62_3 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        int stackIn_63_3 = 0;
        int stackIn_63_4 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_64_2 = 0;
        int stackIn_64_3 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_66_2 = 0;
        int stackIn_66_3 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        int stackIn_67_3 = 0;
        int stackIn_67_4 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_68_2 = 0;
        int stackIn_68_3 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        int stackIn_70_2 = 0;
        int stackIn_70_3 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_71_2 = 0;
        int stackIn_71_3 = 0;
        int stackIn_71_4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = ZombieDawn.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        a.a((byte) 40);
                        po.f(-1, param1);
                        if ((param1 ^ -1) == -1) {
                            statePc = 84;
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
                        if (param1 == 1) {
                            statePc = 81;
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
                        if (-3 == (param1 ^ -1)) {
                            statePc = 78;
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
                        if ((param1 ^ -1) == -4) {
                            statePc = 75;
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
                        if (param1 == 4) {
                            statePc = 86;
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
                        if (-6 != (param1 ^ -1)) {
                            statePc = 25;
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
                        ul.b(397, (byte) -118);
                        ul.b(414, (byte) -116);
                        ul.b(415, (byte) -84);
                        ul.b(413, (byte) -83);
                        ul.b(430, (byte) -127);
                        ul.b(431, (byte) -105);
                        ul.b(429, (byte) -68);
                        tm.a(413, (byte) -77, true, 429);
                        tm.a(397, (byte) -77, true, 430);
                        tm.a(414, (byte) -77, true, 430);
                        tm.a(415, (byte) -77, true, 431);
                        ul.b(69, (byte) -79);
                        ul.b(68, (byte) -109);
                        tm.a(68, (byte) -77, false, 343);
                        tm.a(69, (byte) -77, false, 343);
                        var3_int = 16;
                        var4 = 2;
                        var5 = 1;
                        var6 = 22;
                        var7 = pj.a(131072, -80) >> -1353767166;
                        var8 = 16384;
                        var8 = var8 << 1;
                        var9 = 18432;
                        var7 = var7 << 1;
                        var5 = 8 + var3_int;
                        var9 = var9 << 1;
                        var4 = 1;
                        hk.a(var5 + 2, (byte) -23, var6, 0, var4 + (var5 - -2), -var7, var3_int - 0);
                        hk.a(4 + var5, (byte) -23, var6, var8, var4 + (4 + var5), -var8, var3_int + 1);
                        hk.a(0 + var5, (byte) -23, var6, var7, var4 + var5 + 0, 0, var3_int - -2);
                        hk.a(6 + var5, (byte) -23, var6, var8, var5 + (6 - -var4), var8, 3 + var3_int);
                        hk.a(var4 + (2 + var5), (byte) -23, var6, 0, var5 + 2, var7, 4 + var3_int);
                        hk.a(var4 + var5 + 4, (byte) -23, var6, -var8, var5 + 4, var8, 5 + var3_int);
                        hk.a(0 + var5 - -var4, (byte) -23, var6, -var7, var5 - 0, 0, var3_int - -6);
                        hk.a(var4 + (var5 + 6), (byte) -23, var6, -var8, var5 - -6, -var8, 7 + var3_int);
                        var3_int += 32;
                        var10 = 0;
                        hk.a(-16 + var10 + var3_int, (byte) -23, var6, var9, var10 + (var3_int - 16) - -1, -var8, var10 + var3_int);
                        var10 = 1;
                        hk.a(-17 + var3_int - -var10, (byte) -23, var6, -var8, var10 + var3_int + -16, var9, var10 + var3_int);
                        var10 = 2;
                        hk.a(-16 + (var10 + var3_int), (byte) -23, var6, var8, 1 + var3_int + (var10 + -16), -var9, var3_int - -var10);
                        var10 = 3;
                        hk.a(var3_int - (-var10 + 17), (byte) -23, var6, -var9, -16 + (var3_int + var10), var8, var3_int - -var10);
                        var10 = 4;
                        hk.a(-16 + var10 + var3_int, (byte) -23, var6, var8, 1 + var3_int - (-var10 - -16), var9, var3_int - -var10);
                        var10 = 5;
                        hk.a(var3_int + var10 - 17, (byte) -23, var6, -var9, -16 + (var3_int + var10), -var8, var3_int + var10);
                        var10 = 6;
                        hk.a(var3_int - -var10 - 16, (byte) -23, var6, var9, 1 + (-16 + var10 + var3_int), var8, var3_int + var10);
                        var10 = 7;
                        hk.a(-17 + var3_int - -var10, (byte) -23, var6, -var8, var3_int + (var10 - 16), -var9, var10 + var3_int);
                        var11 = 150;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var11 >= 180) {
                            statePc = 23;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        np.a((byte) 9, var11);
                        var11++;
                        if (var12 != 0) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var12 == 0) {
                            statePc = 18;
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
                        np.a((byte) 9, 155);
                        np.a((byte) 9, 156);
                        np.a((byte) 9, 157);
                        np.a((byte) 9, 169);
                        np.a((byte) 9, 170);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var12 == 0) {
                            statePc = 86;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (param1 == 6) {
                            statePc = 72;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (param1 == 7) {
                            statePc = 37;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if ((param1 ^ -1) != -9) {
                            statePc = 86;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        tm.a(184, (byte) -77, false, 200);
                        ul.b(184, (byte) -113);
                        ul.b(185, (byte) -111);
                        ul.b(186, (byte) -103);
                        ul.b(187, (byte) -115);
                        ul.b(200, (byte) -126);
                        tm.a(323, (byte) -77, false, 416);
                        tm.a(324, (byte) -77, false, 406);
                        tm.a(325, (byte) -77, false, 417);
                        ul.b(323, (byte) -118);
                        ul.b(324, (byte) -104);
                        ul.b(325, (byte) -113);
                        ul.b(416, (byte) -123);
                        ul.b(417, (byte) -85);
                        tm.a(260, (byte) -77, false, 407);
                        ul.b(260, (byte) -105);
                        ul.b(407, (byte) -72);
                        if (var12 == 0) {
                            statePc = 86;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_42_0 = 499;
                        stackIn_38_0 = stackIn_42_0;
                        stackIn_42_1 = 481;
                        stackIn_38_1 = stackIn_42_1;
                        stackIn_42_2 = 1;
                        stackIn_38_2 = stackIn_42_2;
                        stackIn_42_3 = -101;
                        stackIn_38_3 = stackIn_42_3;
                        if (0 != (this.field_h ^ -1)) {
                            statePc = 42;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_40_0 = stackIn_38_0;
                        stackIn_40_1 = stackIn_38_1;
                        stackIn_40_2 = stackIn_38_2;
                        stackIn_40_3 = stackIn_38_3;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_43_0 = stackIn_40_0;
                        stackIn_43_1 = stackIn_40_1;
                        stackIn_43_2 = stackIn_40_2;
                        stackIn_43_3 = stackIn_40_3;
                        stackIn_43_4 = -1;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_43_0 = stackIn_42_0;
                        stackIn_43_1 = stackIn_42_1;
                        stackIn_43_2 = stackIn_42_2;
                        stackIn_43_3 = stackIn_42_3;
                        stackIn_43_4 = 0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        qk.a(stackIn_43_0, stackIn_43_1, stackIn_43_2, stackIn_43_3, stackIn_43_4);
                        stackIn_46_0 = 499;
                        stackIn_44_0 = stackIn_46_0;
                        stackIn_46_1 = 483;
                        stackIn_44_1 = stackIn_46_1;
                        stackIn_46_2 = 1;
                        stackIn_44_2 = stackIn_46_2;
                        stackIn_46_3 = -100;
                        stackIn_44_3 = stackIn_46_3;
                        if (-1 != this.field_h) {
                            statePc = 46;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_47_0 = stackIn_44_0;
                        stackIn_47_1 = stackIn_44_1;
                        stackIn_47_2 = stackIn_44_2;
                        stackIn_47_3 = stackIn_44_3;
                        stackIn_47_4 = -1;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_47_0 = stackIn_46_0;
                        stackIn_47_1 = stackIn_46_1;
                        stackIn_47_2 = stackIn_46_2;
                        stackIn_47_3 = stackIn_46_3;
                        stackIn_47_4 = 1;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        qk.a(stackIn_47_0, stackIn_47_1, stackIn_47_2, stackIn_47_3, stackIn_47_4);
                        stackIn_50_0 = 499;
                        stackIn_48_0 = stackIn_50_0;
                        stackIn_50_1 = 485;
                        stackIn_48_1 = stackIn_50_1;
                        stackIn_50_2 = 1;
                        stackIn_48_2 = stackIn_50_2;
                        stackIn_50_3 = -110;
                        stackIn_48_3 = stackIn_50_3;
                        if (-1 != this.field_h) {
                            statePc = 50;
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
                        stackIn_51_0 = stackIn_48_0;
                        stackIn_51_1 = stackIn_48_1;
                        stackIn_51_2 = stackIn_48_2;
                        stackIn_51_3 = stackIn_48_3;
                        stackIn_51_4 = -1;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_51_0 = stackIn_50_0;
                        stackIn_51_1 = stackIn_50_1;
                        stackIn_51_2 = stackIn_50_2;
                        stackIn_51_3 = stackIn_50_3;
                        stackIn_51_4 = 2;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        qk.a(stackIn_51_0, stackIn_51_1, stackIn_51_2, stackIn_51_3, stackIn_51_4);
                        stackIn_54_0 = 499;
                        stackIn_52_0 = stackIn_54_0;
                        stackIn_54_1 = 487;
                        stackIn_52_1 = stackIn_54_1;
                        stackIn_54_2 = 1;
                        stackIn_52_2 = stackIn_54_2;
                        stackIn_54_3 = -114;
                        stackIn_52_3 = stackIn_54_3;
                        if (-1 == this.field_h) {
                            statePc = 54;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackIn_55_0 = stackIn_52_0;
                        stackIn_55_1 = stackIn_52_1;
                        stackIn_55_2 = stackIn_52_2;
                        stackIn_55_3 = stackIn_52_3;
                        stackIn_55_4 = 3;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackIn_55_0 = stackIn_54_0;
                        stackIn_55_1 = stackIn_54_1;
                        stackIn_55_2 = stackIn_54_2;
                        stackIn_55_3 = stackIn_54_3;
                        stackIn_55_4 = -1;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        qk.a(stackIn_55_0, stackIn_55_1, stackIn_55_2, stackIn_55_3, stackIn_55_4);
                        stackIn_58_0 = 497;
                        stackIn_56_0 = stackIn_58_0;
                        stackIn_58_1 = 482;
                        stackIn_56_1 = stackIn_58_1;
                        stackIn_58_2 = 2;
                        stackIn_56_2 = stackIn_58_2;
                        stackIn_58_3 = param0 + -130;
                        stackIn_56_3 = stackIn_58_3;
                        if (0 == (this.field_h ^ -1)) {
                            statePc = 58;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackIn_59_0 = stackIn_56_0;
                        stackIn_59_1 = stackIn_56_1;
                        stackIn_59_2 = stackIn_56_2;
                        stackIn_59_3 = stackIn_56_3;
                        stackIn_59_4 = 0;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        stackIn_59_0 = stackIn_58_0;
                        stackIn_59_1 = stackIn_58_1;
                        stackIn_59_2 = stackIn_58_2;
                        stackIn_59_3 = stackIn_58_3;
                        stackIn_59_4 = -1;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        qk.a(stackIn_59_0, stackIn_59_1, stackIn_59_2, stackIn_59_3, stackIn_59_4);
                        stackIn_62_0 = 497;
                        stackIn_60_0 = stackIn_62_0;
                        stackIn_62_1 = 484;
                        stackIn_60_1 = stackIn_62_1;
                        stackIn_62_2 = 2;
                        stackIn_60_2 = stackIn_62_2;
                        stackIn_62_3 = -96;
                        stackIn_60_3 = stackIn_62_3;
                        if (0 == (this.field_h ^ -1)) {
                            statePc = 62;
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
                        stackIn_63_0 = stackIn_60_0;
                        stackIn_63_1 = stackIn_60_1;
                        stackIn_63_2 = stackIn_60_2;
                        stackIn_63_3 = stackIn_60_3;
                        stackIn_63_4 = 1;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackIn_63_0 = stackIn_62_0;
                        stackIn_63_1 = stackIn_62_1;
                        stackIn_63_2 = stackIn_62_2;
                        stackIn_63_3 = stackIn_62_3;
                        stackIn_63_4 = -1;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        qk.a(stackIn_63_0, stackIn_63_1, stackIn_63_2, stackIn_63_3, stackIn_63_4);
                        stackIn_66_0 = 497;
                        stackIn_64_0 = stackIn_66_0;
                        stackIn_66_1 = 486;
                        stackIn_64_1 = stackIn_66_1;
                        stackIn_66_2 = 2;
                        stackIn_64_2 = stackIn_66_2;
                        stackIn_66_3 = param0 ^ -125;
                        stackIn_64_3 = stackIn_66_3;
                        if (-1 != this.field_h) {
                            statePc = 66;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackIn_67_0 = stackIn_64_0;
                        stackIn_67_1 = stackIn_64_1;
                        stackIn_67_2 = stackIn_64_2;
                        stackIn_67_3 = stackIn_64_3;
                        stackIn_67_4 = -1;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackIn_67_0 = stackIn_66_0;
                        stackIn_67_1 = stackIn_66_1;
                        stackIn_67_2 = stackIn_66_2;
                        stackIn_67_3 = stackIn_66_3;
                        stackIn_67_4 = 2;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        qk.a(stackIn_67_0, stackIn_67_1, stackIn_67_2, stackIn_67_3, stackIn_67_4);
                        stackIn_70_0 = 497;
                        stackIn_68_0 = stackIn_70_0;
                        stackIn_70_1 = 488;
                        stackIn_68_1 = stackIn_70_1;
                        stackIn_70_2 = 2;
                        stackIn_68_2 = stackIn_70_2;
                        stackIn_70_3 = param0 + -131;
                        stackIn_68_3 = stackIn_70_3;
                        if (this.field_h != -1) {
                            statePc = 70;
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
                        stackIn_71_0 = stackIn_68_0;
                        stackIn_71_1 = stackIn_68_1;
                        stackIn_71_2 = stackIn_68_2;
                        stackIn_71_3 = stackIn_68_3;
                        stackIn_71_4 = -1;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        stackIn_71_0 = stackIn_70_0;
                        stackIn_71_1 = stackIn_70_1;
                        stackIn_71_2 = stackIn_70_2;
                        stackIn_71_3 = stackIn_70_3;
                        stackIn_71_4 = 3;
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
                        qk.a(stackIn_71_0, stackIn_71_1, stackIn_71_2, stackIn_71_3, stackIn_71_4);
                        jc.a(510, (byte) -75);
                        ul.b(472, (byte) -91);
                        ul.b(473, (byte) -120);
                        if (var12 == 0) {
                            statePc = 86;
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
                        hk.a(48, (byte) -23, 10, 0, 54, 0, 55);
                        hk.a(56, (byte) -23, 10, 0, 62, 0, 63);
                        ul.b(329, (byte) -126);
                        tm.a(329, (byte) -77, false, 330);
                        if (var12 == 0) {
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
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        ul.b(163, (byte) -108);
                        ul.b(164, (byte) -70);
                        ul.b(165, (byte) -69);
                        ul.b(213, (byte) -108);
                        ul.b(214, (byte) -89);
                        ul.b(215, (byte) -69);
                        tm.a(163, (byte) -77, true, 213);
                        tm.a(164, (byte) -77, true, 214);
                        tm.a(165, (byte) -77, true, 215);
                        ul.b(230, (byte) -124);
                        ul.b(246, (byte) -74);
                        tm.a(230, (byte) -77, false, 246);
                        ul.b(247, (byte) -72);
                        ul.b(263, (byte) -126);
                        tm.a(247, (byte) -77, false, 263);
                        if (var12 == 0) {
                            statePc = 86;
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
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        ul.b(132, (byte) -89);
                        ul.b(133, (byte) -95);
                        ul.b(70, (byte) -111);
                        ul.b(264, (byte) -104);
                        ul.b(265, (byte) -106);
                        ul.b(266, (byte) -93);
                        ul.b(267, (byte) -76);
                        tm.a(133, (byte) -77, false, 132);
                        tm.a(264, (byte) -77, false, 268);
                        tm.a(265, (byte) -77, false, 269);
                        tm.a(266, (byte) -77, false, 270);
                        tm.a(267, (byte) -77, false, 271);
                        if (var12 == 0) {
                            statePc = 86;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        ul.b(77, (byte) -124);
                        ul.b(110, (byte) -67);
                        ul.b(111, (byte) -117);
                        ul.b(173, (byte) -106);
                        ul.b(174, (byte) -71);
                        ul.b(175, (byte) -122);
                        tm.a(173, (byte) -77, true, 189);
                        tm.a(174, (byte) -77, true, 190);
                        tm.a(175, (byte) -77, true, 191);
                        if (var12 == 0) {
                            statePc = 86;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        hk.a(21, (byte) -23, 3, 0, 16, -16384, 22);
                        hk.a(16, (byte) -23, 3, 0, 21, 16384, 23);
                        qk.n((byte) 98);
                        ul.b(59, (byte) -91);
                        ul.b(60, (byte) -81);
                        ul.b(61, (byte) -74);
                        ul.b(71, (byte) -76);
                        ul.b(70, (byte) -96);
                        ul.b(110, (byte) -66);
                        ul.b(111, (byte) -67);
                        ul.b(120, (byte) -104);
                        ul.b(121, (byte) -103);
                        ul.b(122, (byte) -73);
                        ul.b(156, (byte) -103);
                        ul.b(157, (byte) -87);
                        ul.b(158, (byte) -97);
                        ul.b(276, (byte) -80);
                        ul.b(277, (byte) -116);
                        ul.b(278, (byte) -74);
                        tm.a(120, (byte) -77, true, 276);
                        tm.a(121, (byte) -77, true, 277);
                        tm.a(122, (byte) -77, true, 278);
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (param0 == 8) {
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
                        this.field_o = -16;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 90: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw sh.a((Throwable) ((Object) var3), "hi.DB(" + param0 + ',' + param1 + ')');
                }
                case 91: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void c(byte param0) {
        RuntimeException runtimeException = null;
        kd var2 = null;
        int var3 = 0;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ZombieDawn.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (-1 == (this.field_W.a(false) ^ -1)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        var3 = -60 / ((param0 - -57) / 38);
                        var2 = (kd) ((Object) this.field_W.c((byte) 34));
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (null == var2) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var2.q((byte) -119);
                        var2 = (kd) ((Object) this.field_W.a((byte) 123));
                        if (var4 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var4 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.field_W.b(65);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw sh.a((Throwable) ((Object) runtimeException), "hi.IA(" + param0 + ')');
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0) {
        try {
            jk.a(true, false);
            int var1_int = 92 % ((param0 - 56) / 63);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "hi.DA(" + param0 + ')');
        }
    }

    final int j(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -5402) {
              stackIn_4_0 = eh.field_y;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 10;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "hi.M(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(kd param0, boolean param1) {
        Object stackIn_34_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        kd var4_ref_kd = null;
        int var4 = 0;
        qh var5 = null;
        kd var5_ref = null;
        qh var6 = null;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ZombieDawn.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        param0.d(0);
                        param0.c((byte) -48);
                        param0.b(-27598);
                        this.field_gb.d((byte) -106);
                        if (param1) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.e(69);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (-1 != this.field_h) {
                            statePc = 18;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((this.field_q ^ -1) != -3) {
                            statePc = 18;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (-101 >= (this.field_gb.field_k ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var3_int = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var3_int >= 2) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var4_ref_kd = this.a(20, (byte) 125, 400, 160, 670);
                        var5 = new qh();
                        var5.a(0, new kk(var4_ref_kd.a(true), -110 + var4_ref_kd.f(237239984)));
                        var4_ref_kd.a(var5, true);
                        var3_int++;
                        if (var7 != 0) {
                            statePc = 52;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var7 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var7 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((this.field_h ^ -1) != -1) {
                            statePc = 27;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (-8 != (this.field_q ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (!param0.i((byte) -126)) {
                            statePc = 40;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (-1 <= (param0.field_fb ^ -1)) {
                            statePc = 52;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (6 != this.field_q) {
                            statePc = 52;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_38_0 = this;
                        stackIn_34_0 = stackIn_38_0;
                        if (param1) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackIn_36_0 = this;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_39_0 = this;
                        stackIn_39_1 = 1;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_39_0 = this;
                        stackIn_39_1 = 0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        this.a(stackIn_39_1 != 0, param0);
                        if (var7 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var3_int = 1;
                        var4 = 0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if ((var4 ^ -1) <= (var3_int ^ -1)) {
                            statePc = 52;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var5_ref = this.a(90, (byte) 125, 90, 915 - (80 + -(80 * param0.field_fb)), 1600);
                        var5_ref.field_fb = param0.field_fb;
                        this.field_gb.d((byte) -106);
                        var6 = new qh();
                        var6.a(0, new kk(960, 1090));
                        var5_ref.a(var6, true);
                        var4++;
                        if (var7 != 0) {
                            statePc = 52;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var7 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 47: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_50_0 = (RuntimeException) (var3);
                    stackIn_48_0 = stackIn_50_0;
                    stackIn_50_1 = new StringBuilder().append("hi.EA(");
                    stackIn_48_1 = stackIn_50_1;
                    if (param0 == null) {
                        statePc = 50;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    stackIn_51_0 = (RuntimeException) ((Object) stackIn_48_0);
                    stackIn_51_1 = (StringBuilder) ((Object) stackIn_48_1);
                    stackIn_51_2 = "{...}";
                    statePc = 51;
                    continue stateLoop;
                }
                case 50: {
                    stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
                    stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
                    stackIn_51_2 = "null";
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    throw sh.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param1 + ')');
                }
                case 52: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(ig param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              this.field_nb = this.field_nb + 1;
              if (param1 >= 51) {
                break L1;
              } else {
                this.a(-98, 109, 21, -13, -54);
                break L1;
              }
            }
            L2: {
              if (-121 >= (this.field_nb ^ -1)) {
                this.a(237, 18, (byte) -23);
                break L2;
              } else {
                break L2;
              }
            }
            var3_int = jo.field_Qb;
            var4 = var3_int;
            this.field_G = this.field_G + var4;
            this.field_l = this.field_l + var4;
            this.field_C = this.field_C + (var4 << -1813374968);
            this.field_ab = this.field_ab + var4 * this.field_K;
            this.h(1);
            this.field_i.a(0, new ao(param0.a(true), -30 + param0.f(237239984), var3_int, true));
            this.field_gb.d((byte) -106);
            kh.a(47, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("hi.BA(");

            if (param0 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final void h(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if ((this.field_G ^ -1) <= -2001) {
                this.a(255, 0, (byte) -23);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (5000 <= this.field_G) {
                this.a(254, 1, (byte) -23);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (this.field_G < 10000) {
                break L3;
              } else {
                this.a(253, 2, (byte) -23);
                break L3;
              }
            }
            if (param0 == 1) {
              L4: {
                if (-16662 >= (this.field_G ^ -1)) {
                  this.a(242, 13, (byte) -23);
                  break L4;
                } else {
                  break L4;
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
          throw sh.a((Throwable) ((Object) var2), "hi.J(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0) {
        int var3 = 0;
        if (!(this.b(-25983))) {
            return;
        }
        try {
            int var2_int = -108 % ((param0 - -64) / 49);
            var3 = -this.field_l;
            this.field_ab = this.field_ab + var3 * this.field_K;
            this.field_l = this.field_l + var3;
            this.field_C = this.field_C + (var3 << 2017301704);
            this.field_G = this.field_G + var3;
            this.h(1);
            this.c(true);
            this.a(this.a(this.field_q, (byte) -103, this.field_h), (byte) -99);
            eh.field_y = eh.field_y - 1;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "hi.QA(" + param0 + ')');
        }
    }

    private final int h(boolean param0) {
        int stackIn_47_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = -1;
                if ((this.field_h ^ -1) == 0) {
                  break L2;
                } else {
                  L3: {
                    if (-1 != (this.field_q ^ -1)) {
                      break L3;
                    } else {
                      var2_int = 1;
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (1 == this.field_q) {
                      break L4;
                    } else {
                      L5: {
                        if (this.field_q != 2) {
                          break L5;
                        } else {
                          var2_int = 3;
                          if (var3 == 0) {
                            break L1;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (-4 == (this.field_q ^ -1)) {
                          break L6;
                        } else {
                          L7: {
                            if ((this.field_q ^ -1) == -5) {
                              break L7;
                            } else {
                              L8: {
                                if (-6 != (this.field_q ^ -1)) {
                                  break L8;
                                } else {
                                  var2_int = 12;
                                  if (var3 == 0) {
                                    break L1;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              L9: {
                                if (7 == this.field_q) {
                                  break L9;
                                } else {
                                  if ((this.field_q ^ -1) != -7) {
                                    break L1;
                                  } else {
                                    var2_int = 11;
                                    if (var3 == 0) {
                                      break L1;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                              var2_int = 13;
                              if (var3 == 0) {
                                break L1;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var2_int = 10;
                          if (var3 == 0) {
                            break L1;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var2_int = 4;
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var2_int = 2;
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L10: {
                if (-4 == (this.field_q ^ -1)) {
                  break L10;
                } else {
                  L11: {
                    if ((this.field_q ^ -1) == -8) {
                      break L11;
                    } else {
                      var2_int = 7;
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L11;
                      }
                    }
                  }
                  var2_int = 8;
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L10;
                  }
                }
              }
              var2_int = 8;
              break L1;
            }
            L12: {
              if (!param0) {
                break L12;
              } else {
                this.field_h = 28;
                break L12;
              }
            }
            stackIn_47_0 = var2_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "hi.R(" + param0 + ')');
        }
        return stackIn_47_0;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        mn var5 = null;
        mn stackIn_6_0;
        mn stackIn_6_1;
        ej stackIn_6_2;
        int stackIn_6_3;
        int stackIn_6_4;
        mn stackIn_7_0 = null;
        mn stackIn_7_1 = null;
        ej stackIn_7_2 = null;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          L0: {
            L1: {
              if (param1 == -6355) {
                break L1;
              } else {
                this.a(105, 'ﾬ', -105);
                break L1;
              }
            }
            L2: {
              stackIn_6_0 = null;

              stackIn_6_1 = null;

              stackIn_6_2 = this.field_H;

              stackIn_6_3 = param2;

              stackIn_6_4 = param3;

              if (!param0) {
                stackIn_7_0 = null;
                stackIn_7_1 = null;
                stackIn_7_2 = (ej) ((Object) stackIn_6_2);
                stackIn_7_3 = stackIn_6_3;
                stackIn_7_4 = stackIn_6_4;
                stackIn_7_5 = 0;
                break L2;
              } else {
                stackIn_7_0 = null;
                stackIn_7_1 = null;
                stackIn_7_2 = (ej) ((Object) stackIn_6_2);
                stackIn_7_3 = stackIn_6_3;
                stackIn_7_4 = stackIn_6_4;
                stackIn_7_5 = 1;
                break L2;
              }
            }
            L3: {
              var5 = new mn(stackIn_7_2, stackIn_7_3, stackIn_7_4, stackIn_7_5);
              if (!param0) {
                stackIn_11_0 = 77;
                break L3;
              } else {
                stackIn_11_0 = 76;
                break L3;
              }
            }
            kh.a(stackIn_11_0, false);
            this.field_v.a(param1 + 6355, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var5_ref), "hi.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void i(int param0) {
        int stackIn_18_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        fn var5 = null;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            if (param0 == 1) {
              L1: {
                L2: {
                  if (0 >= this.field_fb) {
                    break L2;
                  } else {
                    var2_int = this.field_fb * (3 - Math.abs(-3 + this.field_h)) / 3;
                    bi.a(0, 0, bd.field_e, nh.field_P, 13421772, var2_int);
                    this.field_fb = this.field_fb - 14;
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  L4: {
                    L5: {
                      var2_int = (int)(tp.field_p % 157L);
                      if (var2_int < 2) {
                        break L5;
                      } else {
                        if (-140 < (var2_int ^ -1)) {
                          break L4;
                        } else {
                          if (-142 > (var2_int ^ -1)) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    if (-1 >= (fb.a(1311979239, (int)(tp.field_p << 496585990)) ^ -1)) {
                      break L4;
                    } else {
                      stackIn_18_0 = 1;
                      break L3;
                    }
                  }
                  stackIn_18_0 = 0;
                  break L3;
                }
                L6: {
                  var3 = stackIn_18_0;
                  if (var3 == 0) {
                    break L6;
                  } else {
                    L7: {
                      this.field_fb = 70 + (40 * rd.a(true, (int)(tp.field_p << -670907514)) >> -1177145936);
                      var4 = this.field_fb * (-Math.abs(this.field_h + -3) + 3) / 3;
                      var5 = tp.b((byte) 40, 97);
                      if (null != var5) {
                        var5.h(var4 * ge.field_c >> -685658808);
                        var5.i(300 - -(var4 * 150));
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L6;
                    }
                  }
                }
                if (var2_int != 5) {
                  break L1;
                } else {
                  if (3 <= fb.a(param0 ^ 1311979238, (int)(tp.field_p << 314321798))) {
                    break L1;
                  } else {
                    L8: {
                      var4 = 70 + (40 * rd.a(true, (int)(tp.field_p << 750006534)) >> 647893360);
                      stackIn_33_0 = 84;

                      if (0L != (tp.field_p & 1L)) {
                        stackIn_34_0 = stackIn_33_0;
                        stackIn_34_1 = 129;
                        break L8;
                      } else {
                        stackIn_34_0 = stackIn_33_0;
                        stackIn_34_1 = 128;
                        break L8;
                      }
                    }
                    var5 = tp.b((byte) stackIn_34_0, stackIn_34_1);
                    if (var5 == null) {
                      break L1;
                    } else {
                      var5.h(var4 * ge.field_c >> -2002178936);
                      break L1;
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
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "hi.UA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, char param1, int param2) {
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_121_0 = 0;
        uh stackIn_128_0 = null;
        int stackIn_128_1 = 0;
        uh stackIn_129_0 = null;
        int stackIn_129_1 = 0;
        int stackIn_129_2 = 0;
        int stackIn_130_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_153_0 = 0;
        boolean stackIn_158_0 = false;
        int stackIn_168_0 = 0;
        int stackIn_173_0 = 0;
        int stackIn_176_0 = 0;
        int stackIn_179_0 = 0;
        int stackIn_182_0 = 0;
        int stackIn_187_0 = 0;
        int stackIn_193_0 = 0;
        int stackIn_198_0 = 0;
        int stackIn_206_0 = 0;
        int stackIn_208_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_157_0;
        int var4_int = 0;
        le var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        var5 = ZombieDawn.field_J;
        try {
          L0: {
            this.field_C = this.field_C - this.field_Z;
            this.field_c = this.field_c - 1;
            this.field_I = this.field_I - param0;
            this.field_g = this.field_g + param0;
            if (param0 == 13) {
              ca.a(false, true, 2);
              stackIn_5_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (mg.field_j != param0) {
                if ((gm.field_k ^ -1) == (param0 ^ -1)) {
                  this.field_Q.a(3158064, 1);
                  stackIn_13_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param0 != dl.field_c) {
                    if (param0 == e.field_K) {
                      this.field_Q.a(3158064, 3);
                      stackIn_21_0 = 1;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if ((param0 ^ -1) != (rd.field_D ^ -1)) {
                        if (param0 != si.field_Rb) {
                          if (sh.field_g != param0) {
                            if ((hn.field_m ^ -1) == (param0 ^ -1)) {
                              this.field_Q.a(3158064, 7);
                              stackIn_35_0 = 1;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              L1: {
                                if (param2 == -29638) {
                                  break L1;
                                } else {
                                  field_x = (vn) null;
                                  break L1;
                                }
                              }
                              L2: {
                                if (!this.field_A) {
                                  break L2;
                                } else {
                                  L3: {
                                    if (-35 != (param0 ^ -1)) {
                                      break L3;
                                    } else {
                                      L4: {
                                        if (ga.field_w) {
                                          stackIn_49_0 = 0;
                                          break L4;
                                        } else {
                                          stackIn_49_0 = 1;
                                          break L4;
                                        }
                                      }
                                      ga.field_w = stackIn_49_0 != 0;
                                      break L3;
                                    }
                                  }
                                  L5: {
                                    if (-37 == (param0 ^ -1)) {
                                      L6: {
                                        if (jp.field_m) {
                                          stackIn_57_0 = 0;
                                          break L6;
                                        } else {
                                          stackIn_57_0 = 1;
                                          break L6;
                                        }
                                      }
                                      jp.field_m = stackIn_57_0 != 0;
                                      break L5;
                                    } else {
                                      break L5;
                                    }
                                  }
                                  L7: {
                                    if (39 == param0) {
                                      L8: {
                                        if (al.field_e) {
                                          stackIn_65_0 = 0;
                                          break L8;
                                        } else {
                                          stackIn_65_0 = 1;
                                          break L8;
                                        }
                                      }
                                      al.field_e = stackIn_65_0 != 0;
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                  L9: {
                                    if (-52 != (param0 ^ -1)) {
                                      break L9;
                                    } else {
                                      L10: {
                                        if (g.field_Q) {
                                          stackIn_73_0 = 0;
                                          break L10;
                                        } else {
                                          stackIn_73_0 = 1;
                                          break L10;
                                        }
                                      }
                                      g.field_Q = stackIn_73_0 != 0;
                                      break L9;
                                    }
                                  }
                                  L11: {
                                    if ((param0 ^ -1) == -38) {
                                      L12: {
                                        if (ac.field_r) {
                                          stackIn_81_0 = 0;
                                          break L12;
                                        } else {
                                          stackIn_81_0 = 1;
                                          break L12;
                                        }
                                      }
                                      ac.field_r = stackIn_81_0 != 0;
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                  L13: {
                                    if (param0 == 85) {
                                      L14: {
                                        if (a.field_c) {
                                          stackIn_89_0 = 0;
                                          break L14;
                                        } else {
                                          stackIn_89_0 = 1;
                                          break L14;
                                        }
                                      }
                                      a.field_c = stackIn_89_0 != 0;
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  L15: {
                                    if ((param0 ^ -1) != -33) {
                                      break L15;
                                    } else {
                                      L16: {
                                        if (kc.field_Q) {
                                          stackIn_97_0 = 0;
                                          break L16;
                                        } else {
                                          stackIn_97_0 = 1;
                                          break L16;
                                        }
                                      }
                                      kc.field_Q = stackIn_97_0 != 0;
                                      break L15;
                                    }
                                  }
                                  L17: {
                                    if ((param0 ^ -1) == -39) {
                                      L18: {
                                        if (nk.field_d) {
                                          stackIn_105_0 = 0;
                                          break L18;
                                        } else {
                                          stackIn_105_0 = 1;
                                          break L18;
                                        }
                                      }
                                      nk.field_d = stackIn_105_0 != 0;
                                      break L17;
                                    } else {
                                      break L17;
                                    }
                                  }
                                  L19: {
                                    if (param0 != 35) {
                                      break L19;
                                    } else {
                                      L20: {
                                        if (b.field_h) {
                                          stackIn_113_0 = 0;
                                          break L20;
                                        } else {
                                          stackIn_113_0 = 1;
                                          break L20;
                                        }
                                      }
                                      b.field_h = stackIn_113_0 != 0;
                                      break L19;
                                    }
                                  }
                                  L21: {
                                    if ((param0 ^ -1) != -41) {
                                      break L21;
                                    } else {
                                      L22: {
                                        if (dg.field_a) {
                                          stackIn_121_0 = 0;
                                          break L22;
                                        } else {
                                          stackIn_121_0 = 1;
                                          break L22;
                                        }
                                      }
                                      dg.field_a = stackIn_121_0 != 0;
                                      break L21;
                                    }
                                  }
                                  if (param0 != 41) {
                                    L23: {
                                      if (-74 != (param0 ^ -1)) {
                                        break L23;
                                      } else {
                                        System.gc();
                                        break L23;
                                      }
                                    }
                                    L24: {
                                      if ((param0 ^ -1) > -2) {
                                        break L24;
                                      } else {
                                        if (4 < param0) {
                                          break L24;
                                        } else {
                                          L25: {
                                            var4_int = -1 + param0;
                                            if (!bo.field_p[81]) {
                                              break L25;
                                            } else {
                                              var4_int += 4;
                                              break L25;
                                            }
                                          }
                                          this.a(this.a(var4_int, (byte) -77, 0), (byte) -99);
                                          this.field_F = true;
                                          stackIn_142_0 = 1;
                                          decompiledRegionSelector0 = 10;
                                          break L0;
                                        }
                                      }
                                    }
                                    L26: {
                                      if (-89 != (param0 ^ -1)) {
                                        break L26;
                                      } else {
                                        ((kl) ((Object) jj.c(12, param2 ^ -29608))).e(param2 + 29510);
                                        ca.a(true, true, 12);
                                        break L26;
                                      }
                                    }
                                    if (param0 == 5) {
                                      L27: {
                                        if (!bo.field_i) {
                                          break L27;
                                        } else {
                                          ch.a((byte) 80);
                                          break L27;
                                        }
                                      }
                                      this.field_F = true;
                                      this.field_P = this.field_f;
                                      stackIn_153_0 = 1;
                                      decompiledRegionSelector0 = 11;
                                      break L0;
                                    } else {
                                      if ((param0 ^ -1) != -7) {
                                        if ((param0 ^ -1) == -8) {
                                          this.field_gb.l(param2 + 29688);
                                          this.field_F = true;
                                          stackIn_173_0 = 1;
                                          decompiledRegionSelector0 = 13;
                                          break L0;
                                        } else {
                                          if (8 != param0) {
                                            if ((param0 ^ -1) != -10) {
                                              if ((param0 ^ -1) != -11) {
                                                if ((param0 ^ -1) == -12) {
                                                  he.field_c = 1;
                                                  stackIn_187_0 = 1;
                                                  decompiledRegionSelector0 = 17;
                                                  break L0;
                                                } else {
                                                  L28: {
                                                    if ((param0 ^ -1) != -13) {
                                                      break L28;
                                                    } else {
                                                      if (!bo.field_p[82]) {
                                                        break L28;
                                                      } else {
                                                        this.field_S.a((byte) -99);
                                                        stackIn_193_0 = 1;
                                                        decompiledRegionSelector0 = 18;
                                                        break L0;
                                                      }
                                                    }
                                                  }
                                                  if (param0 == 12) {
                                                    this.field_gb.d(0);
                                                    this.field_F = true;
                                                    stackIn_198_0 = 1;
                                                    decompiledRegionSelector0 = 19;
                                                    break L0;
                                                  } else {
                                                    break L2;
                                                  }
                                                }
                                              } else {
                                                this.a(this.a(this.field_q, (byte) 126, this.field_h), (byte) -99);
                                                this.field_F = true;
                                                stackIn_182_0 = 1;
                                                decompiledRegionSelector0 = 16;
                                                break L0;
                                              }
                                            } else {
                                              this.a(this.a(this.field_q, (byte) 98, -1), (byte) -99);
                                              this.field_F = true;
                                              stackIn_179_0 = 1;
                                              decompiledRegionSelector0 = 15;
                                              break L0;
                                            }
                                          } else {
                                            this.g(true);
                                            this.field_F = true;
                                            stackIn_176_0 = 1;
                                            decompiledRegionSelector0 = 14;
                                            break L0;
                                          }
                                        }
                                      } else {
                                        var4 = this.field_R.b((byte) 26);
                                        L29: while (true) {
                                          L30: {
                                            L31: {
                                              if (!(var4 instanceof fb)) {
                                                break L31;
                                              } else {
                                                stackOut_157_0 = var4 instanceof kd;
                                                stackIn_168_0 = stackOut_157_0 ? 1 : 0;
                                                stackIn_158_0 = stackOut_157_0;
                                                if (var5 != 0) {
                                                  break L30;
                                                } else {
                                                  L32: {
                                                    if (stackIn_158_0) {
                                                      if (!((kd) ((Object) var4)).p(11312)) {
                                                        ((kd) ((Object) var4)).z(0);
                                                        break L32;
                                                      } else {
                                                        break L32;
                                                      }
                                                    } else {
                                                      break L32;
                                                    }
                                                  }
                                                  var4 = var4.field_b;
                                                  if (var5 == 0) {
                                                    continue L29;
                                                  } else {
                                                    break L31;
                                                  }
                                                }
                                              }
                                            }
                                            this.field_gb.d((byte) -106);
                                            this.field_F = true;
                                            stackIn_168_0 = 1;
                                            break L30;
                                          }
                                          decompiledRegionSelector0 = 12;
                                          break L0;
                                        }
                                      }
                                    }
                                  } else {
                                    L33: {
                                      this.field_F = true;
                                      stackIn_128_0 = this.field_Q;

                                      stackIn_128_1 = 122;

                                      if (bo.field_p[81]) {
                                        stackIn_129_0 = (uh) ((Object) stackIn_128_0);
                                        stackIn_129_1 = stackIn_128_1;
                                        stackIn_129_2 = 9;
                                        break L33;
                                      } else {


                                        stackIn_129_0 = (uh) ((Object) stackIn_128_0);
                                        stackIn_129_1 = stackIn_128_1;
                                        stackIn_129_2 = 0;
                                        break L33;
                                      }
                                    }
                                    ((uh) (Object) stackIn_129_0).a((byte) stackIn_129_1, stackIn_129_2);
                                    stackIn_130_0 = 1;
                                    decompiledRegionSelector0 = 9;
                                    break L0;
                                  }
                                }
                              }
                              L34: {
                                if (!bo.field_p[82]) {
                                  break L34;
                                } else {
                                  if ((param0 ^ -1) == -49) {
                                    this.a(0, this.field_H.field_u, this.field_H.field_p, param2 ^ -29685, 0);
                                    stackIn_206_0 = 1;
                                    decompiledRegionSelector0 = 20;
                                    break L0;
                                  } else {
                                    break L34;
                                  }
                                }
                              }
                              stackIn_208_0 = 0;
                              decompiledRegionSelector0 = 21;
                              break L0;
                            }
                          } else {
                            this.field_Q.a(param2 + 3187702, 6);
                            stackIn_30_0 = 1;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        } else {
                          this.field_Q.a(3158064, 5);
                          stackIn_27_0 = 1;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        this.field_Q.a(3158064, 4);
                        stackIn_24_0 = 1;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  } else {
                    this.field_Q.a(3158064, 2);
                    stackIn_16_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                this.field_Q.a(3158064, 0);
                stackIn_8_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4_ref), "hi.WA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_21_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_24_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_27_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_30_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_35_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_130_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_142_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_153_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_168_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_173_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_176_0 != 0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return stackIn_179_0 != 0;
                                      } else {
                                        if (decompiledRegionSelector0 == 16) {
                                          return stackIn_182_0 != 0;
                                        } else {
                                          if (decompiledRegionSelector0 == 17) {
                                            return stackIn_187_0 != 0;
                                          } else {
                                            if (decompiledRegionSelector0 == 18) {
                                              return stackIn_193_0 != 0;
                                            } else {
                                              if (decompiledRegionSelector0 == 19) {
                                                return stackIn_198_0 != 0;
                                              } else {
                                                if (decompiledRegionSelector0 == 20) {
                                                  return stackIn_206_0 != 0;
                                                } else {
                                                  return stackIn_208_0 != 0;
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

    private final void g(int param0) {
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        le var2 = null;
        RuntimeException var2_ref = null;
        le var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (param0 > 75) {
                break L1;
              } else {
                hi.a((java.applet.Applet) null, -78);
                break L1;
              }
            }
            var2 = this.field_R.b((byte) 26);
            L2: while (true) {
              L3: {
                L4: {
                  if (!(var2 instanceof fb)) {
                    break L4;
                  } else {
                    var3 = var2.field_b;
                    stackIn_29_0 = this.field_ib;

                    if (var5 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_29_0 != -1) {
                          break L5;
                        } else {
                          if (var2 instanceof hk) {
                            ((fb) ((Object) var2)).g(107);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (!(var2 instanceof kd)) {
                          break L6;
                        } else {
                          if (((kd) ((Object) var2)).f(237239984) < 200) {
                            var2.b(-27598);
                            ((nb) ((Object) var2)).c((byte) -10);
                            this.field_i.a(0, new ao(((kd) ((Object) var2)).a(true), 200, fl.field_e, false));
                            var4 = fl.field_e;
                            this.field_g = this.field_g - var4 * this.field_K;
                            this.field_l = this.field_l + var4;
                            this.field_G = this.field_G + var4;
                            this.field_eb = this.field_eb + (var4 << -1663187416);
                            this.h(1);
                            this.field_gb.a(true);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (this.field_gb.field_b >= 50) {
                          this.a(251, 4, (byte) -23);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var2 = var3;
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackIn_29_0 = 0;
                break L3;
              }
              fk.b(stackIn_29_0 != 0);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2_ref), "hi.SA(" + param0 + ')');
        }
    }

    final void e(int param0) {
        vn[] stackIn_25_0 = null;
        vn[] stackIn_27_0 = null;
        vn[] stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        boolean stackIn_120_0 = false;
        boolean stackIn_127_0 = false;
        int stackIn_132_0 = 0;
        int stackIn_132_1 = 0;
        int stackIn_146_0 = 0;
        int stackIn_146_1 = 0;
        int stackIn_148_0 = 0;
        int stackIn_148_1 = 0;
        int stackIn_180_0 = 0;
        int stackIn_180_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        int var2_int = 0;
        le var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ck var4 = null;
        int var4_int = 0;
        tj var4_ref = null;
        int var5_int = 0;
        oi var5 = null;
        int var6_int = 0;
        oi var6 = null;
        int var7_int = 0;
        da var7 = null;
        int var8_int = 0;
        long var8 = 0L;
        int var9 = 0;
        int var10_int = 0;
        long var10 = 0L;
        int var11 = 0;
        int var12 = 0;
        float var13 = 0.0f;
        int var14 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = ZombieDawn.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (this.field_X) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return;
                }
                case 3: {
                    if (0 < this.field_r) {
                        statePc = 6;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var2_int = 16;
                    if (-201 < (this.field_r ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (-this.field_r + 500 < 100) {
                        statePc = 12;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var2_int = (500 + -this.field_r) * 16 / 100;
                    if (var14 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var2_int = 16 * this.field_r / 200;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    this.field_L.h(ge.field_c * (220 * var2_int) / 16 >> 1256166760);
                    if (-1 > (var2_int ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    this.field_S.field_u = this.field_S.field_u + (pb.a(so.field_a, var2_int, param0 + -9843) - var2_int / 2);
                    this.field_S.field_c = this.field_S.field_c + (-(var2_int / 2) + pb.a(so.field_a, var2_int, 1));
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    this.field_H.a(this.field_S, false);
                    if (-1 == this.field_H.field_A.field_c) {
                        statePc = 29;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (0 != (this.field_H.field_A.field_o ^ -1)) {
                        statePc = 24;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var2_int = this.field_S.a(this.field_H.field_A.field_c, (byte) -100);
                    var3 = this.field_S.a(this.field_H.field_A.field_o, 0);
                    stackIn_27_0 = sl.field_c;
                    stackIn_25_0 = stackIn_27_0;
                    if (5 > he.field_c) {
                        statePc = 27;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_28_0 = (vn[]) ((Object) stackIn_25_0);
                    stackIn_28_1 = 4;
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_28_0 = (vn[]) ((Object) stackIn_27_0);
                    stackIn_28_1 = he.field_c;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    ((vn) (Object) stackIn_28_0[stackIn_28_1]).b(var2_int + -44, -44 + var3);
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    var2 = this.field_lb.b((byte) 26);
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (null == var2) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    ((mm) ((Object) var2)).a((byte) 117, this.field_S);
                    var2 = this.field_lb.a(false);
                    if (var14 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var3 = bo.field_i ? 1 : 0;
                    if (var3 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    li.a(-18996, this.field_S);
                    if (var14 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var2 = this.field_d.b((byte) 26);
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (var2 == null) {
                        statePc = 42;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    ((gk) ((Object) var2)).a((byte) -104, this.field_S);
                    var2 = this.field_d.a(false);
                    if (var14 != 0) {
                        statePc = 43;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (var14 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var2 = this.field_e.b((byte) 26);
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (var2 == null) {
                        statePc = 48;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    ((nc) ((Object) var2)).a(this.field_S, true);
                    var2 = this.field_e.a(false);
                    if (var14 != 0) {
                        statePc = 49;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (var14 == 0) {
                        statePc = 43;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var2 = this.field_m.b((byte) 26);
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (null == var2) {
                        statePc = 57;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var4 = (ck) ((Object) var2);
                    stackIn_58_0 = -2;
                    stackIn_51_0 = stackIn_58_0;
                    stackIn_58_1 = var4.field_o ^ -1;
                    stackIn_51_1 = stackIn_58_1;
                    if (var14 != 0) {
                        statePc = 58;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (stackIn_51_0 != stackIn_51_1) {
                        statePc = 56;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var4.a(this.field_S, (byte) 110);
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    var2 = this.field_m.a(false);
                    if (var14 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    stackIn_58_0 = param0;
                    stackIn_58_1 = 9844;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    if (stackIn_58_0 == stackIn_58_1) {
                        statePc = 61;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    this.a((kd) null, false);
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    this.field_H.a(this.field_S, 1, true, false);
                    var2 = this.field_v.b((byte) 26);
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    if (null == var2) {
                        statePc = 67;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    ((mn) ((Object) var2)).a(this.field_S, -516);
                    var2 = this.field_v.a(false);
                    if (var14 != 0) {
                        statePc = 70;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (var14 == 0) {
                        statePc = 62;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if (var3 != 0) {
                        statePc = 70;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var2 = this.field_d.b((byte) 26);
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    if (null == var2) {
                        statePc = 76;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    ((gk) ((Object) var2)).a((byte) -82, this.field_S);
                    var2 = this.field_d.a(false);
                    if (var14 != 0) {
                        statePc = 77;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (var14 == 0) {
                        statePc = 71;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    ap.field_u = 0;
                    wg.field_n = 0;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    if (Math.abs(-on.field_q + this.field_S.field_u) > 40) {
                        statePc = 81;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if (40 >= Math.abs(-qb.field_b + this.field_S.field_c)) {
                        statePc = 84;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    qb.field_b = this.field_S.field_c;
                    ld.field_m = true;
                    on.field_q = this.field_S.field_u;
                    ki.a((byte) -120, hn.field_p);
                    bi.d();
                    pa.a(-21189);
                    if (var14 == 0) {
                        statePc = 86;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    ld.field_m = false;
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    var2 = this.field_R.b((byte) 26);
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    if (var2 == null) {
                        statePc = 92;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    ((fb) ((Object) var2)).a((byte) -101, this.field_S);
                    var2 = this.field_R.a(false);
                    if (var14 != 0) {
                        statePc = 93;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if (var14 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    var2 = this.field_T.b((byte) 26);
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    if (null == var2) {
                        statePc = 98;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    ((gb) ((Object) var2)).a((byte) -86, this.field_S);
                    var2 = this.field_T.a(false);
                    if (var14 != 0) {
                        statePc = 99;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if (var14 == 0) {
                        statePc = 93;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    var2 = this.field_m.b((byte) 26);
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    if (null == var2) {
                        statePc = 107;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    var4 = (ck) ((Object) var2);
                    stackIn_108_0 = var4.field_o;
                    stackIn_101_0 = stackIn_108_0;
                    stackIn_108_1 = 1;
                    stackIn_101_1 = stackIn_108_1;
                    if (var14 != 0) {
                        statePc = 108;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (stackIn_101_0 == stackIn_101_1) {
                        statePc = 106;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    var4.a(this.field_S, (byte) 110);
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    var2 = this.field_m.a(false);
                    if (var14 == 0) {
                        statePc = 99;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    stackIn_108_0 = this.field_q ^ -1;
                    stackIn_108_1 = -6;
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    if (stackIn_108_0 == stackIn_108_1) {
                        statePc = 110;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 110: {
                    hn.field_p.b(-this.field_S.field_u + on.field_q - 40, -this.field_S.field_c + (qb.field_b - 40));
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    this.field_H.a(this.field_S, 2, true, false);
                    if (-7 != (this.field_H.field_A.field_a ^ -1)) {
                        statePc = 117;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    if ((this.field_h ^ -1) == 0) {
                        statePc = 117;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    this.i(1);
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    this.field_H.a(this.field_S, 3, true, false);
                    var2 = this.field_R.b((byte) 26);
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    if (null == var2) {
                        statePc = 126;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    stackIn_127_0 = var2 instanceof kd;
                    stackIn_120_0 = stackIn_127_0;
                    if (var14 != 0) {
                        statePc = 127;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if (stackIn_120_0) {
                        statePc = 124;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 124: {
                    ((kd) ((Object) var2)).a(0, this.field_S);
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    var2 = this.field_R.a(false);
                    if (var14 == 0) {
                        statePc = 118;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    this.field_b.a((byte) 6, this.field_S);
                    stackIn_127_0 = kc.field_Q;
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    if (stackIn_127_0) {
                        statePc = 129;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 129: {
                    var4_int = 0;
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    if ((var4_int ^ -1) <= (this.field_H.field_u ^ -1)) {
                        statePc = 144;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    var5_int = this.field_S.a(var4_int, (byte) -92);
                    stackIn_146_0 = var5_int ^ -1;
                    stackIn_132_0 = stackIn_146_0;
                    stackIn_146_1 = -1;
                    stackIn_132_1 = stackIn_146_1;
                    if (var14 != 0) {
                        statePc = 146;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    if (stackIn_132_0 > stackIn_132_1) {
                        statePc = 143;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    if ((bd.field_e * 2 ^ -1) <= (var5_int ^ -1)) {
                        statePc = 141;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    if (var14 == 0) {
                        statePc = 143;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    bi.e(-1 + var5_int, 0, 2 * nh.field_P, 255);
                    bi.e(var5_int, 0, 2 * nh.field_P, 255);
                    bi.e(var5_int + 1, 0, nh.field_P * 2, 255);
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    var4_int += 128;
                    if (var14 == 0) {
                        statePc = 130;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    var4_int = 0;
                    statePc = 145;
                    continue stateLoop;
                }
                case 145: {
                    stackIn_146_0 = this.field_H.field_p ^ -1;
                    stackIn_146_1 = var4_int ^ -1;
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    if (stackIn_146_0 >= stackIn_146_1) {
                        statePc = 160;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    var5_int = this.field_S.a(var4_int, 0);
                    stackIn_180_0 = var5_int ^ -1;
                    stackIn_148_0 = stackIn_180_0;
                    stackIn_180_1 = -1;
                    stackIn_148_1 = stackIn_180_1;
                    if (var14 != 0) {
                        statePc = 180;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    if (stackIn_148_0 > stackIn_148_1) {
                        statePc = 159;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    if ((var5_int ^ -1) >= (2 * nh.field_P ^ -1)) {
                        statePc = 157;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    if (var14 == 0) {
                        statePc = 159;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    bi.b(0, -1 + var5_int, bd.field_e * 2, 255);
                    bi.b(0, var5_int, 2 * bd.field_e, 255);
                    bi.b(0, 1 + var5_int, bd.field_e * 2, 255);
                    statePc = 159;
                    continue stateLoop;
                }
                case 159: {
                    var4_int += 128;
                    if (var14 == 0) {
                        statePc = 145;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    if (!this.field_p) {
                        statePc = 166;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    if (this.field_w) {
                        statePc = 166;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    lb.field_eb[8].b(-12 + ha.field_b, ei.field_K + -12);
                    statePc = 166;
                    continue stateLoop;
                }
                case 166: {
                    if (!this.field_p) {
                        statePc = 179;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    if (this.field_w) {
                        statePc = 172;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 172: {
                    var6_int = ha.field_b - this.field_B;
                    if (var6_int < 0) {
                        statePc = 174;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    var4_int = this.field_B;
                    if (var14 == 0) {
                        statePc = 175;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    var6_int = -var6_int;
                    var4_int = ha.field_b;
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    var7_int = ei.field_K + -this.field_j;
                    if ((var7_int ^ -1) <= -1) {
                        statePc = 177;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    var7_int = -var7_int;
                    var5_int = ei.field_K;
                    if (var14 == 0) {
                        statePc = 178;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    var5_int = this.field_j;
                    statePc = 178;
                    continue stateLoop;
                }
                case 178: {
                    bi.c(var4_int, var5_int, var6_int, var7_int, 16777215);
                    bi.b(var4_int - -1, 1 + var5_int, var6_int - 2, -2 + var7_int, 10066431, 32);
                    bi.a(2 + var4_int, 2 + var5_int, -4 + var6_int, -4 + var7_int, 3355647, 32);
                    statePc = 179;
                    continue stateLoop;
                }
                case 179: {
                    stackIn_180_0 = -1;
                    stackIn_180_1 = this.field_ib ^ -1;
                    statePc = 180;
                    continue stateLoop;
                }
                case 180: {
                    if (stackIn_180_0 == stackIn_180_1) {
                        statePc = 182;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 182: {
                    this.field_Q.g(param0 + -11137);
                    statePc = 183;
                    continue stateLoop;
                }
                case 183: {
                    f.a((byte) -17, this.field_S);
                    if (this.field_q != 5) {
                        statePc = 186;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    this.d(param0 + -9934);
                    statePc = 186;
                    continue stateLoop;
                }
                case 186: {
                    if (ql.field_j >= 0.0f) {
                        statePc = 189;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 189: {
                    oj.field_f.b(this.field_S.a(ek.field_I, (byte) -124), this.field_S.a(-(int)ql.field_j + el.field_g, param0 ^ 9844));
                    statePc = 190;
                    continue stateLoop;
                }
                case 190: {
                    var2 = this.field_i.b((byte) 26);
                    statePc = 191;
                    continue stateLoop;
                }
                case 191: {
                    if (null == var2) {
                        statePc = 196;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 192: {
                    ((ao) ((Object) var2)).a((byte) -106, this.field_S);
                    var2 = this.field_i.a(false);
                    if (var14 != 0) {
                        statePc = 197;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    if (var14 == 0) {
                        statePc = 191;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    this.field_gb.b(param0 ^ -9762);
                    this.field_Q.b((byte) -55);
                    eg.d(0);
                    statePc = 197;
                    continue stateLoop;
                }
                case 197: {
                    var4_ref = sg.field_jb;
                    var5 = bj.field_q;
                    var6 = pc.field_k;
                    if (bo.field_i) {
                        statePc = 215;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    if (this.field_S.field_d) {
                        statePc = 204;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    if (0.0f >= this.field_S.field_g) {
                        statePc = 215;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    if ((vh.field_b ^ -1) < -151) {
                        statePc = 210;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    if (-151 <= (id.field_M ^ -1)) {
                        statePc = 215;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    var7_int = this.field_S.a(this.field_S.field_v, (byte) -102);
                    var8_int = this.field_S.a(this.field_S.field_f, 0);
                    var9 = var7_int - 320;
                    var10_int = 320 + var7_int;
                    var11 = var8_int + -240;
                    var12 = 240 + var8_int;
                    if (!this.field_S.field_d) {
                        statePc = 213;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 213: {
                    var13 = this.field_S.field_g;
                    var10_int = (int)((float)(bd.field_e + -5) * (1.0f - var13) + var13 * (float)var10_int);
                    var9 = (int)(var13 * (float)var9 + (-var13 + 1.0f) * 5.0f);
                    var11 = (int)(var13 * (float)var11 + 5.0f * (-var13 + 1.0f));
                    var12 = (int)(var13 * (float)var12 + (-var13 + 1.0f) * (float)(nh.field_P + -5));
                    System.out.println("lit area: " + var9 + "," + var11 + "," + (-var9 + var10_int) + "," + (-var11 + var12));
                    statePc = 214;
                    continue stateLoop;
                }
                case 214: {
                    bi.f(5, 5, -5 + bd.field_e, -5 + nh.field_P);
                    bi.b(5, 5, -10 + bd.field_e, var11 + -5, 0);
                    bi.b(5, var12, bd.field_e - 10, nh.field_P + (-5 + -var12), 0);
                    bi.b(5, var11, -5 + var9, -var11 + var12, 0);
                    bi.b(var10_int, var11, -5 + bd.field_e - var10_int, -var11 + var12, 0);
                    statePc = 215;
                    continue stateLoop;
                }
                case 215: {
                    if (this.field_ib == -1) {
                        statePc = 219;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    if ((this.field_N ^ -1) >= -1) {
                        statePc = 226;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    bi.f(-this.field_N + (vh.field_b + 640), 0, bd.field_e, nh.field_P);
                    if (0 == (this.field_h ^ -1)) {
                        statePc = 224;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 224: {
                    var5.a(kb.field_g[this.field_q], bd.field_d, 280, 16777215, 0);
                    statePc = 225;
                    continue stateLoop;
                }
                case 225: {
                    this.field_V.b(-(this.field_V.field_w / 2) + bd.field_d, nh.field_G - this.field_V.field_t);
                    so.a(this.field_t, bd.field_d + (-(this.field_V.field_w / 2) - 6), -6 + (-this.field_V.field_t + nh.field_G));
                    bi.c();
                    statePc = 226;
                    continue stateLoop;
                }
                case 226: {
                    var7 = (da) ((Object) this.field_ob.b((byte) 26));
                    if (var7 == null) {
                        statePc = 239;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    var8_int = 10;
                    var9 = 10;
                    var10_int = var7.field_k;
                    var11 = var5.b(hk.field_J[var10_int]) + 70;
                    var12 = this.field_z;
                    if (32 > var12) {
                        statePc = 233;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 228: {
                    if (303 < var12) {
                        statePc = 233;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 233: {
                    if (var12 > 32) {
                        statePc = 236;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 236: {
                    var12 = -var12 + 335;
                    statePc = 237;
                    continue stateLoop;
                }
                case 237: {
                    var8_int = -310 + var12 * 10;
                    statePc = 238;
                    continue stateLoop;
                }
                case 238: {
                    bi.a(var8_int, var9, var11, 40, 6, 0, 160);
                    bi.e(var8_int, var9, var11, 40, 6, 7829367);
                    ed.field_a[var10_int].g(var8_int + 9, var9 - -5);
                    var5.c(hk.field_J[var10_int], var8_int - -50, var9 + 25, 16777215, 3355443);
                    statePc = 239;
                    continue stateLoop;
                }
                case 239: {
                    of.a(11690);
                    if (al.field_e) {
                        statePc = 242;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 242: {
                    bi.a(0, 22, 80, 105, 0, 128);
                    var6.c(Integer.toString(this.field_c), 5, 40, 16777215, 0);
                    var6.c(Integer.toString(this.field_C), 5, 60, 16777215, 0);
                    var6.c(Integer.toString(this.field_eb), 5, 80, 16777215, 0);
                    var6.c(Integer.toString(this.field_Z), 5, 100, 16777215, 0);
                    var6.c(Integer.toString((this.field_G << -1680430936) - -this.f(param0 ^ -9799)), 5, 120, 16777215, 0);
                    statePc = 243;
                    continue stateLoop;
                }
                case 243: {
                    if (jp.field_m) {
                        statePc = 252;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    if (ac.field_r) {
                        statePc = 252;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 247: {
                    if (nk.field_d) {
                        statePc = 252;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 252: {
                    bi.a(0, 0, 640, 17, 0, 100);
                    statePc = 253;
                    continue stateLoop;
                }
                case 253: {
                    if (!jp.field_m) {
                        statePc = 256;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    pc.field_k.c("cam=(" + this.field_S.field_u + ", " + this.field_S.field_c + ") bk=" + ci.field_d + " k=" + kc.field_R + " mouse=(" + ha.field_b + "," + ei.field_K + ") trees=" + ap.field_u + " tree tiles=" + wg.field_n, 5, 13, 16777215, 0);
                    statePc = 256;
                    continue stateLoop;
                }
                case 256: {
                    if (nk.field_d) {
                        statePc = 259;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 259: {
                    pc.field_k.c("mouseover tile=(" + (-bd.field_d + ha.field_b + this.field_S.field_u) / 24 + ", " + (-nh.field_G + (ei.field_K + this.field_S.field_c)) / 24 + ")  pixel=(" + (ha.field_b + (this.field_S.field_u - bd.field_d)) + "," + (this.field_S.field_c - -ei.field_K + -nh.field_G) + ")", 5, 13, 16777215, 0);
                    statePc = 260;
                    continue stateLoop;
                }
                case 260: {
                    if (!this.field_F) {
                        statePc = 263;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 261: {
                    var5.b("Cheater!", 630, 410, 16776960, 0);
                    statePc = 263;
                    continue stateLoop;
                }
                case 263: {
                    if (!ac.field_r) {
                        statePc = 265;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 264: {
                    var8 = Runtime.getRuntime().totalMemory();
                    var10 = Runtime.getRuntime().freeMemory();
                    pc.field_k.b((var8 - var10) / 1024L + " kB / " + var8 / 1024L + " kB", 636, 13, 16777215, 0);
                    statePc = 265;
                    continue stateLoop;
                }
                case 265: {
                    if (!a.field_c) {
                        statePc = 270;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 266: {
                    var4_ref.c(Integer.toString(mf.field_d), 10, 40, 2, -1);
                    statePc = 270;
                    continue stateLoop;
                }
                case 270: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0, int param1, int param2) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_73_1 = 0;
        int stackIn_79_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        ra var5 = null;
        kd var6_ref_kd = null;
        int var6 = 0;
        qh var7_ref_qh = null;
        int var7 = 0;
        int[][] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        kd var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var18 = ZombieDawn.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_b.a((byte) 75, param1, param0);
                        if (1 >= this.field_W.a(false)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        param1 = fa.e(-126) + (-(param1 % 24) + param1);
                        param0 = fa.e(-127) + param0 + -(param0 % 24);
                        if (var18 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        param0 += 6;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4_int = 1;
                        var5 = new ra();
                        var6_ref_kd = (kd) ((Object) this.field_W.c((byte) 34));
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (null == var6_ref_kd) {
                            statePc = 16;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var7_ref_qh = this.field_H.a(true, var6_ref_kd.a(true), param0, param1, var6_ref_kd.f(237239984));
                        if (var18 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (null != var7_ref_qh) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var6_ref_kd.c((byte) -68);
                        var5.a(var6_ref_kd, (byte) -128);
                        if (var18 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var4_int = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var6_ref_kd = (kd) ((Object) this.field_W.a((byte) 116));
                        if (var18 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var4_int != 0) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.field_b.c(20);
                        if (var18 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        this.field_W = var5;
                        this.field_b.a((byte) 29);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 22: {
                    return;
                }
                case 23: {
                    try {
                        var6 = param1 / 24;
                        var7 = param0 / 24;
                        if (param2 > 114) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        this.field_F = false;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var8 = this.field_H.a(8728);
                        var8[var7][var6] = 1;
                        var9 = 2;
                        var10 = 1;
                        var11 = this.field_W.a(false);
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((var11 ^ -1) > (var9 ^ -1)) {
                            statePc = 62;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var12 = -1;
                        var13_int = -1;
                        stackIn_63_0 = 0;
                        stackIn_29_0 = stackIn_63_0;
                        if (var18 != 0) {
                            statePc = 63;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var14 = stackIn_29_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_31_0 = var8.length;
                        stackIn_31_1 = var14;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 <= stackIn_31_1) {
                            statePc = 40;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_41_0 = 0;
                        stackIn_33_0 = stackIn_41_0;
                        if (var18 != 0) {
                            statePc = 41;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var15 = stackIn_33_0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((var8[0].length ^ -1) >= (var15 ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_31_0 = var8[var14][var15] ^ -1;
                        stackIn_36_0 = stackIn_31_0;
                        stackIn_31_1 = var10 ^ -1;
                        stackIn_36_1 = stackIn_31_1;
                        if (var18 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (stackIn_36_0 != stackIn_36_1) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var12 = var15;
                        var13_int = var14;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var15++;
                        if (var18 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var14++;
                        if (var18 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_41_0 = -1;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (stackIn_41_0 != var12) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var13_int != -1) {
                            statePc = 46;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 45: {
                    return;
                }
                case 46: {
                    try {
                        if (-1 == (hm.a(var12, -1 + var13_int, var8, 2) ^ -1)) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        incrementValue$0 = var9;
                        var9++;
                        var8[-1 + var13_int][var12] = incrementValue$0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (hm.a(1 + var12, var13_int, var8, 2) != 0) {
                            statePc = 53;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        incrementValue$1 = var9;
                        var9++;
                        var8[var13_int][var12 + 1] = incrementValue$1;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (hm.a(var12, var13_int + 1, var8, 2) == 0) {
                            statePc = 56;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        incrementValue$2 = var9;
                        var9++;
                        var8[var13_int + 1][var12] = incrementValue$2;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var10++;
                        if ((hm.a(-1 + var12, var13_int, var8, 2) ^ -1) == -1) {
                            statePc = 60;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        incrementValue$3 = var9;
                        var9++;
                        var8[var13_int][-1 + var12] = incrementValue$3;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var18 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackIn_63_0 = 0;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var12 = stackIn_63_0;
                        var13 = (kd) ((Object) this.field_W.c((byte) 34));
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (null == var13) {
                            statePc = 94;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var12++;
                        var14 = -1;
                        var15 = -1;
                        if (var18 != 0) {
                            statePc = 95;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var16 = 0;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        stackIn_68_0 = var8.length;
                        stackIn_68_1 = var16;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (stackIn_68_0 <= stackIn_68_1) {
                            statePc = 78;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        stackIn_79_0 = 0;
                        stackIn_70_0 = stackIn_79_0;
                        if (var18 != 0) {
                            statePc = 79;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var17 = stackIn_70_0;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if ((var8[0].length ^ -1) >= (var17 ^ -1)) {
                            statePc = 77;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        stackIn_68_0 = var12 ^ -1;
                        stackIn_73_0 = stackIn_68_0;
                        stackIn_68_1 = var8[var16][var17] ^ -1;
                        stackIn_73_1 = stackIn_68_1;
                        if (var18 != 0) {
                            statePc = 68;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (stackIn_73_0 == stackIn_73_1) {
                            statePc = 75;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var14 = var17;
                        var15 = var16;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var17++;
                        if (var18 == 0) {
                            statePc = 71;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var16++;
                        if (var18 == 0) {
                            statePc = 67;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        stackIn_79_0 = var14 ^ -1;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (stackIn_79_0 != 0) {
                            statePc = 84;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (-1 != var15) {
                            statePc = 84;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 83: {
                    return;
                }
                case 84: {
                    try {
                        param1 = 24 * var14 - -fa.e(-128);
                        param0 = fa.e(49) + var15 * 24;
                        var13.a(this.field_H.a(true, var13.a(true), param0, param1, var13.f(237239984)), true);
                        if (7 != this.field_q) {
                            statePc = 93;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (0 != this.field_h) {
                            statePc = 93;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (var13.x(52)) {
                            statePc = 93;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        ck.a(-12, 6836);
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var13 = (kd) ((Object) this.field_W.a((byte) 114));
                        if (var18 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var13 = (kd) ((Object) var5.c((byte) 34));
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (var13 == null) {
                            statePc = 102;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        var13.c((byte) -85);
                        this.field_W.a(var13, (byte) -109);
                        var13 = (kd) ((Object) var5.a((byte) 122));
                        if (var18 != 0) {
                            statePc = 102;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (var18 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 101: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    throw sh.a((Throwable) ((Object) var4), "hi.S(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                case 102: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final on a(int param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        on stackIn_5_0 = null;
        int stackIn_9_0 = 0;
        byte[][] stackIn_9_1 = null;
        int stackIn_10_0 = 0;
        byte[][] stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        on stackIn_11_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((param0 ^ -1) >= -4) {
                break L1;
              } else {
                if (0 < be.field_j) {
                  break L1;
                } else {
                  stackIn_5_0 = this.a(0, (byte) -93, 0);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L2: {
              var4_int = -89 / ((param1 - -2) / 55);
              var5 = this.f(104) - -(28 * this.field_bb);
              this.field_q = param0;
              this.field_bb = this.field_q / 4;
              this.field_h = param2;
              var6 = this.f(82) + this.field_bb * 28;
              this.field_C = this.field_C + (-var5 + var6);
              stackIn_9_0 = 124;

              stackIn_9_1 = cl.field_c[this.field_q];

              if ((this.field_h ^ -1) != 0) {
                stackIn_10_0 = stackIn_9_0;
                stackIn_10_1 = (byte[][]) ((Object) stackIn_9_1);
                stackIn_10_2 = this.field_h;
                break L2;
              } else {
                stackIn_10_0 = stackIn_9_0;
                stackIn_10_1 = (byte[][]) ((Object) stackIn_9_1);
                stackIn_10_2 = 6;
                break L2;
              }
            }
            stackIn_11_0 = ja.a((byte) stackIn_10_0, stackIn_10_1[stackIn_10_2]);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "hi.JA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_11_0;
        }
    }

    private final g a(int param0, boolean param1, byte param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        fb var9 = null;
        g var10 = null;
        int var11 = 0;
        Object stackIn_23_0 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var5_int = this.field_S.a(param3, false);
              var6 = this.field_S.b(param0, true);
              var7 = null;
              var8 = -1;
              if (param2 < -66) {
                break L1;
              } else {
                this.a(112, -70, 11, 40, -44);
                break L1;
              }
            }
            var9 = (fb) ((Object) this.field_R.b((byte) 26));
            L2: while (true) {
              L3: {
                if (null == var9) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      L6: {
                        if (!param1) {
                          break L6;
                        } else {
                          if (var9 instanceof ah) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if (param1) {
                        break L4;
                      } else {
                        if (!(var9 instanceof kd)) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var10 = (g) ((Object) var9);
                    if (!var10.a(76, var5_int, var6)) {
                      break L4;
                    } else {
                      if ((var8 ^ -1) <= (var10.f(237239984) ^ -1)) {
                        break L4;
                      } else {
                        var8 = var10.f(237239984);
                        var7 = var10;
                        break L4;
                      }
                    }
                  }
                  var9 = (fb) ((Object) this.field_R.a(false));
                  if (var11 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_23_0 = var7;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var5), "hi.CA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return (g) ((Object) stackIn_23_0);
    }

    final void a(int param0, ah param1, byte param2, boolean param3, kk param4) {
        int stackIn_55_0 = 0;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        String stackIn_111_2 = null;
        StringBuilder stackIn_114_1 = null;
        StringBuilder stackIn_115_1 = null;
        String stackIn_115_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        kd var8 = null;
        int var9_int = 0;
        fn var9 = null;
        int var10 = 0;
        try {
          L0: {
            L1: {
              if (!fj.a(0, -126)) {
                break L1;
              } else {
                L2: {
                  L3: {
                    if ((param1.field_t ^ -1) == -5) {
                      break L3;
                    } else {
                      if (-2 == (param1.field_t ^ -1)) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  this.field_U = this.field_U + 1;
                  break L2;
                }
                if (-101 != (this.field_U ^ -1)) {
                  break L1;
                } else {
                  this.a(243, 12, (byte) -23);
                  break L1;
                }
              }
            }
            L4: {
              if ((this.field_q ^ -1) != -6) {
                break L4;
              } else {
                if (this.field_h == 3) {
                  if (-24 != (param1.field_t ^ -1)) {
                    break L4;
                  } else {
                    this.field_o = this.field_o + 1;
                    if ((this.field_o ^ -1) == -8) {
                      this.a(238, 17, (byte) -23);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                } else {
                  break L4;
                }
              }
            }
            L5: {
              var6_int = param1.a(true);
              var7 = param1.f(237239984);
              var8 = new kd(var6_int, var7, param1.t(10), param0);
              if (!param1.field_kb) {
                break L5;
              } else {
                var8.b((byte) 124, 1000);
                break L5;
              }
            }
            L6: {
              L7: {
                this.field_R.a(0, var8);
                var8.d((byte) 118);
                so.b(this.field_R);
                if ((param0 ^ -1) != -1) {
                  break L7;
                } else {
                  L8: {
                    if (!param3) {
                      break L8;
                    } else {
                      var8.r(param2 ^ -31320);
                      this.field_W.a(var8, (byte) -126);
                      if (param4 == null) {
                        break L8;
                      } else {
                        var8.a(this.field_H.a(true, var6_int, param4.field_h, param4.field_l, var7), true);
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (!(param1 instanceof we)) {
                      this.field_P = this.field_P + 1;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    param1.field_F = 18;
                    if ((param1.field_t ^ -1) != -29) {
                      break L10;
                    } else {
                      this.field_hb = this.field_hb + 1;
                      break L10;
                    }
                  }
                  L11: {
                    L12: {
                      this.field_gb.d((byte) -106);
                      if (-6 != (this.field_q ^ -1)) {
                        break L12;
                      } else {
                        if ((this.field_h ^ -1) != 0) {
                          break L12;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L13: {
                      if (-1 == this.field_h) {
                        stackIn_55_0 = ga.field_r;
                        break L13;
                      } else {
                        stackIn_55_0 = param1.s(24478);
                        break L13;
                      }
                    }
                    var9_int = stackIn_55_0;
                    if (0 != var9_int) {
                      var10 = var9_int;
                      this.field_C = this.field_C + (var10 << -1157423576);
                      this.field_l = this.field_l + var10;
                      this.field_G = this.field_G + var10;
                      this.field_ab = this.field_ab + var10 * this.field_K;
                      this.h(1);
                      this.field_i.a(param2 ^ 60, new ao(param1.a(true), param1.f(237239984) - 30, var9_int, true));
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L14: {
                    if (param1 instanceof we) {
                      this.a(249, 6, (byte) -23);
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (!param1.field_ib) {
                      break L15;
                    } else {
                      L16: {
                        if (this.field_q != 4) {
                          break L16;
                        } else {
                          if (this.field_h == 5) {
                            this.a(226, 29, (byte) -23);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                      }
                      L17: {
                        if (-6 != (this.field_q ^ -1)) {
                          break L17;
                        } else {
                          if (-6 != (this.field_h ^ -1)) {
                            break L17;
                          } else {
                            if (30 != param1.field_t) {
                              break L17;
                            } else {
                              this.a(225, 30, (byte) -23);
                              break L17;
                            }
                          }
                        }
                      }
                      if (this.field_q != 7) {
                        break L15;
                      } else {
                        if (this.field_h == 3) {
                          this.a(224, 31, (byte) -23);
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                    }
                  }
                  ck.a(-4, 6836);
                  if (ZombieDawn.field_J == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              this.field_gb.d((byte) -106);
              break L6;
            }
            L18: {
              if (this.field_gb.b(true)) {
                break L18;
              } else {
                var8.u(param2 + -165);
                break L18;
              }
            }
            L19: {
              if (param2 == 60) {
                break L19;
              } else {
                this.a(-64, -71, -114, -32, 40);
                break L19;
              }
            }
            L20: {
              if (-5 != (this.field_q ^ -1)) {
                break L20;
              } else {
                if (5 != this.field_h) {
                  break L20;
                } else {
                  if ((k.field_t ^ -1) != -21) {
                    break L20;
                  } else {
                    kh.a(122, false);
                    var9 = kh.a(149, false);
                    var9.h(3 * var9.j() / 2);
                    break L20;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var6 = decompiledCaughtException;
            stackIn_110_0 = (RuntimeException) (var6);

            stackIn_110_1 = new StringBuilder().append("hi.NA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_111_0 = (RuntimeException) ((Object) stackIn_110_0);
              stackIn_111_1 = (StringBuilder) ((Object) stackIn_110_1);
              stackIn_111_2 = "null";
              break L21;
            } else {
              stackIn_111_0 = (RuntimeException) ((Object) stackIn_110_0);
              stackIn_111_1 = (StringBuilder) ((Object) stackIn_110_1);
              stackIn_111_2 = "{...}";
              break L21;
            }
          }
          L22: {


            stackIn_114_1 = ((StringBuilder) (Object) stackIn_111_1).append(stackIn_111_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_111_0 = (RuntimeException) ((Object) stackIn_111_0);
              stackIn_115_1 = (StringBuilder) ((Object) stackIn_114_1);
              stackIn_115_2 = "null";
              break L22;
            } else {
              stackIn_111_0 = (RuntimeException) ((Object) stackIn_111_0);
              stackIn_115_1 = (StringBuilder) ((Object) stackIn_114_1);
              stackIn_115_2 = "{...}";
              break L22;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_111_0), stackIn_115_2 + ')');
        }
    }

    private final void d(int param0, int param1, int param2) {
        int stackIn_50_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object var6_ref = null;
        int var6 = 0;
        int var7 = 0;
        kd var8 = null;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = ZombieDawn.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_Q.d((byte) -83);
                        if (param2 == 31098) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (!this.field_A) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (bo.field_p[81]) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.c((byte) 126);
                        if (var9 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var4_int = this.field_S.a(param0, false);
                        var5 = this.field_S.b(param1, true);
                        if (!this.field_H.a(false, var5, var4_int, true)) {
                            statePc = 60;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!bo.field_p[82]) {
                            statePc = 38;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (-5 != (this.field_q ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (-1 == this.field_h) {
                            statePc = 36;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((this.field_q ^ -1) != -6) {
                            statePc = 27;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((this.field_h ^ -1) != 0) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var6_ref = new ig(var4_int, var5, 3);
                        if (var9 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (5 != this.field_q) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var6_ref = eo.a(52, var4_int, 23, var5);
                        if (var9 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (7 == this.field_q) {
                            statePc = 35;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var6_ref = eo.a(105, var4_int, so.c(9), var5);
                        if (var9 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var6_ref = eo.a(68, var4_int, 28, var5);
                        if (var9 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var6_ref = new me(var4_int, var5, 3);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        this.field_f = this.field_f + 1;
                        this.field_R.a(0, (le) (var6_ref));
                        this.field_gb.d((byte) -106);
                        ((ah) (var6_ref)).d((byte) 124);
                        if (var9 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (!bo.field_p[74]) {
                            statePc = 44;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        this.a(var5, true, 119, var4_int);
                        if (var9 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (bo.field_p[86]) {
                            statePc = 49;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_50_0 = 1;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackIn_50_0 = 100;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var6 = stackIn_50_0;
                        var7 = 0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var7 >= var6) {
                            statePc = 56;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var8 = new kd(var4_int, var5, pb.a(so.field_a, 2, param2 ^ 31099), 0);
                        this.field_R.a(0, var8);
                        var8.d((byte) -1);
                        var7++;
                        if (var9 != 0) {
                            statePc = 57;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var9 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        this.field_gb.d((byte) -106);
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        this.field_F = true;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 59: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    throw sh.a((Throwable) ((Object) var4), "hi.O(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                case 60: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void d(byte param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ZombieDawn.field_J;
        try {
          L0: {
            if (bo.field_i) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (-1 != (this.field_ib ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if (null != this.field_kb) {
                        break L3;
                      } else {
                        if (null != this.field_a) {
                          this.field_a.field_ob = false;
                          this.field_a = null;
                          if (var3 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                    this.field_kb.field_qb = false;
                    this.field_kb.field_cb = false;
                    this.field_kb = null;
                    break L2;
                  }
                  L4: {
                    this.field_a = (ah) ((Object) this.a(ei.field_K, true, (byte) -87, ha.field_b));
                    if (!this.field_Q.a(-112)) {
                      break L4;
                    } else {
                      if (this.field_a != null) {
                        this.field_a.field_ob = true;
                        if (var3 == 0) {
                          break L1;
                        } else {
                          break L4;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  this.field_kb = (kd) ((Object) this.a(ei.field_K, false, (byte) -83, ha.field_b));
                  if (null == this.field_kb) {
                    break L1;
                  } else {
                    L5: {
                      if (this.field_kb.i((byte) -126)) {
                        break L5;
                      } else {
                        this.field_kb = null;
                        if (var3 == 0) {
                          break L1;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (this.field_Q.a((byte) 113)) {
                        break L6;
                      } else {
                        this.field_kb.field_qb = true;
                        if (var3 == 0) {
                          break L1;
                        } else {
                          break L6;
                        }
                      }
                    }
                    this.field_kb.field_cb = true;
                    break L1;
                  }
                }
              }
              L7: {
                if (param0 <= -126) {
                  break L7;
                } else {
                  this.field_m = (vo) null;
                  break L7;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "hi.AA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static int a(int param0, int param1) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            stackIn_1_0 = param0 | param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "hi.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final void f(byte param0) {
        try {
            this.field_r = 500;
            this.field_L = jp.a((byte) 127, 74);
            if (param0 != 9) {
                field_Y = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "hi.KA(" + param0 + ')');
        }
    }

    private final void b(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int stackIn_10_0 = 0;
        le stackIn_19_0 = null;
        le stackIn_29_0 = null;
        boolean stackIn_56_0 = false;
        int stackIn_63_0 = 0;
        boolean stackIn_112_0 = false;
        boolean stackIn_130_0 = false;
        int stackIn_226_0 = 0;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_55_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        le var5_ref_le = null;
        ck var5_ref_ck = null;
        mm var5_ref_mm = null;
        nc var5_ref_nc = null;
        ao var5_ref_ao = null;
        int var5 = 0;
        le var6 = null;
        Object var6_ref = null;
        mn var6_ref2 = null;
        mn var7_ref_mn = null;
        int var7 = 0;
        int[] var7_ref_int__ = null;
        fb var7_ref_fb = null;
        int var8 = 0;
        kd var8_ref_kd = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = ZombieDawn.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 93) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if ((this.field_ib ^ -1) == 0) {
                            statePc = 229;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (this.field_gb.k(16284)) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_10_0 = 1;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_10_0 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var2_int = stackIn_10_0;
                        this.field_gb.c(this.field_G, 0);
                        if (var2_int == 0) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!this.field_gb.k(16284)) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ck.a(-6, 6836);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.field_H.a(false);
                        var3 = 0;
                        var4 = 0;
                        var5_ref_le = this.field_R.b((byte) 26);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (!(var5_ref_le instanceof fb)) {
                            statePc = 28;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var6 = var5_ref_le.field_b;
                        ((fb) ((Object) var5_ref_le)).g(119);
                        stackIn_29_0 = (le) (var5_ref_le);
                        stackIn_19_0 = stackIn_29_0;
                        if (var13 != 0) {
                            statePc = 29;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (!(stackIn_19_0 instanceof kd)) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var3++;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (!(var5_ref_le instanceof we)) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var4++;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var5_ref_le = var6;
                        if (var13 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_29_0 = this.field_m.b((byte) 26);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var5_ref_ck = (ck) ((Object) stackIn_29_0);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (null == var5_ref_ck) {
                            statePc = 35;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var5_ref_ck.a(-11367);
                        var5_ref_ck = (ck) ((Object) this.field_m.a(false));
                        if (var13 != 0) {
                            statePc = 229;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var13 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var5_ref_mm = (mm) ((Object) this.field_lb.b((byte) 26));
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (null == var5_ref_mm) {
                            statePc = 41;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var5_ref_mm.a(-25687);
                        var5_ref_mm = (mm) ((Object) this.field_lb.a(false));
                        if (var13 != 0) {
                            statePc = 229;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var13 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var5_ref_nc = (nc) ((Object) this.field_e.b((byte) 26));
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (null == var5_ref_nc) {
                            statePc = 47;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var5_ref_nc.a(false);
                        var5_ref_nc = (nc) ((Object) this.field_e.a(false));
                        if (var13 != 0) {
                            statePc = 229;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var13 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var5_ref_ao = (ao) ((Object) this.field_i.b((byte) 26));
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (null == var5_ref_ao) {
                            statePc = 53;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var5_ref_ao.g(param0 + 21);
                        var5_ref_ao = (ao) ((Object) this.field_i.a(false));
                        if (var13 != 0) {
                            statePc = 229;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var13 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var5 = 0;
                        var6_ref = null;
                        var7_ref_mn = (mn) ((Object) this.field_v.b((byte) 26));
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (null == var7_ref_mn) {
                            statePc = 62;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var6_ref2 = (mn) ((Object) this.field_v.a(false));
                        stackOut_55_0 = var7_ref_mn.b(true);
                        stackIn_63_0 = stackOut_55_0 ? 1 : 0;
                        stackIn_56_0 = stackOut_55_0;
                        if (var13 != 0) {
                            statePc = 63;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (stackIn_56_0) {
                            statePc = 60;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var5 = 1;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var7_ref_mn = var6_ref2;
                        if (var13 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackIn_63_0 = var5;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (stackIn_63_0 == 0) {
                            statePc = 71;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var7_ref_mn = (mn) ((Object) this.field_v.b((byte) 26));
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (var7_ref_mn == null) {
                            statePc = 70;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var7_ref_mn.c((byte) 76);
                        var7_ref_mn = (mn) ((Object) this.field_v.a(false));
                        if (var13 != 0) {
                            statePc = 71;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var13 == 0) {
                            statePc = 65;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        this.b(true);
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (this.field_h == -1) {
                            statePc = 74;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var7 = this.field_q;
                        if ((var7 ^ -1) == -5) {
                            statePc = 87;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (5 != var7) {
                            statePc = 81;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (var13 == 0) {
                            statePc = 103;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (var7 != 6) {
                            statePc = 129;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (var13 == 0) {
                            statePc = 109;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        fieldTemp$0 = this.field_jb - 1;
                        this.field_jb = this.field_jb - 1;
                        if ((fieldTemp$0 ^ -1) < -1) {
                            statePc = 129;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        this.field_jb = 100;
                        if (-601 < (this.field_gb.field_a ^ -1)) {
                            statePc = 95;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        this.field_jb = 650;
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        var7 = so.c(3);
                        var8 = 240 * var7 + 156;
                        var9 = 0;
                        var8 = -12 + (264 + 288 * var7);
                        var10 = 0;
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (-19 >= (var10 ^ -1)) {
                            statePc = 102;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        var11 = so.c(24) + var8;
                        var12 = so.c(9);
                        this.field_R.a(0, new me(var11, var9, var12));
                        var9 -= 30;
                        var10++;
                        if (var13 != 0) {
                            statePc = 129;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (var13 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (var13 == 0) {
                            statePc = 129;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        fieldTemp$1 = this.field_jb - 1;
                        this.field_jb = this.field_jb - 1;
                        if (-1 <= (fieldTemp$1 ^ -1)) {
                            statePc = 108;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var7_ref_int__ = new int[]{0, 3, 5, 2, 30, 26, 24};
                        var8 = so.c(this.field_k);
                        var9 = this.field_D[var8];
                        var10 = this.field_s[var8];
                        var11 = so.a(var7_ref_int__);
                        var9 = var9 + so.c(48);
                        var10 = var10 + so.c(48);
                        this.field_jb = 25;
                        this.field_R.a(0, new ig(var9, var10, var11));
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        var7_ref_fb = (fb) ((Object) this.field_n.a(0, 0, this.field_n.field_d, 1, true));
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        if (null == var7_ref_fb) {
                            statePc = 129;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        stackIn_130_0 = var7_ref_fb instanceof kd;
                        stackIn_112_0 = stackIn_130_0;
                        if (var13 != 0) {
                            statePc = 130;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if (stackIn_112_0) {
                            statePc = 118;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if (var13 == 0) {
                            statePc = 128;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        var8_ref_kd = (kd) ((Object) var7_ref_fb);
                        if (!var8_ref_kd.i((byte) -126)) {
                            statePc = 128;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if ((var8_ref_kd.f(237239984) ^ -1) <= -289) {
                            statePc = 128;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        var8_ref_kd.field_fb = -1;
                        var8_ref_kd.field_qb = false;
                        var8_ref_kd.field_cb = false;
                        var8_ref_kd.c((byte) -20);
                        var8_ref_kd.q((byte) -114);
                        var8_ref_kd.a(this.field_H.a(true, var8_ref_kd.a(true), 120, this.field_H.field_u + -1, var8_ref_kd.f(237239984)), true);
                        this.field_gb.a(true);
                        if (60 >= this.field_gb.j(-106)) {
                            statePc = 127;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        this.a(233, 22, (byte) -23);
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        var7_ref_fb = (fb) ((Object) this.field_n.b(false));
                        if (var13 == 0) {
                            statePc = 110;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        stackIn_130_0 = this.field_gb.k(16284);
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        if (!stackIn_130_0) {
                            statePc = 168;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        if ((this.field_h ^ -1) != 0) {
                            statePc = 136;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        if ((he.field_c ^ -1) != -1) {
                            statePc = 140;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        he.field_c = 1;
                        if (var13 == 0) {
                            statePc = 168;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        if (-5 != (he.field_c ^ -1)) {
                            statePc = 168;
                        } else {
                            statePc = 141;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        if (ub.field_f >= 0.0f) {
                            statePc = 157;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        if (0.0f <= ql.field_j) {
                            statePc = 157;
                        } else {
                            statePc = 147;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        ql.field_j = -1.0f;
                        ub.field_f = 0.0f;
                        var7 = 0;
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        if ((var7 ^ -1) <= -5) {
                            statePc = 155;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        var8 = -15 + pb.a(so.field_a, 30, param0 + -92);
                        var9 = pb.a(so.field_a, 30, 1) + -15;
                        this.field_R.a(param0 ^ 93, eo.a(123, var8 + this.field_H.field_A.field_c, 19, this.field_H.field_A.field_o - -var9));
                        var7++;
                        if (var13 != 0) {
                            statePc = 156;
                        } else {
                            statePc = 152;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        if (var13 == 0) {
                            statePc = 150;
                        } else {
                            statePc = 153;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        statePc = 155;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        this.b(3, this.field_H.field_A.field_o, true, this.field_H.field_A.field_c);
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        if (var13 == 0) {
                            statePc = 168;
                        } else {
                            statePc = 157;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        if (0 != this.field_E) {
                            statePc = 165;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        if (var3 <= var4) {
                            statePc = 165;
                        } else {
                            statePc = 161;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        ql.field_j = 0.0f;
                        ub.field_f = 6.0f;
                        statePc = 165;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        fieldTemp$2 = this.field_E + 1;
                        this.field_E = this.field_E + 1;
                        if ((fieldTemp$2 ^ -1) >= -401) {
                            statePc = 168;
                        } else {
                            statePc = 166;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        this.field_E = 0;
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        if (0 == (this.field_H.field_A.field_c ^ -1)) {
                            statePc = 190;
                        } else {
                            statePc = 169;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        if (this.field_H.field_A.field_o != -1) {
                            statePc = 174;
                        } else {
                            statePc = 170;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        statePc = 172;
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        statePc = 190;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        if (ql.field_j >= 0.0f) {
                            statePc = 177;
                        } else {
                            statePc = 175;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        ql.field_j = ql.field_j + ub.field_f;
                        ub.field_f = ub.field_f - 0.18000000715255737f;
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        if ((he.field_c ^ -1) >= -1) {
                            statePc = 190;
                        } else {
                            statePc = 179;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        if (-5 >= (he.field_c ^ -1)) {
                            statePc = 190;
                        } else {
                            statePc = 180;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        statePc = 182;
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        fieldTemp$3 = mc.field_h + 1;
                        mc.field_h = mc.field_h + 1;
                        if (-3 > (fieldTemp$3 ^ -1)) {
                            statePc = 187;
                        } else {
                            statePc = 183;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        statePc = 185;
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        statePc = 190;
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        mc.field_h = 0;
                        fieldTemp$4 = he.field_c + 1;
                        he.field_c = he.field_c + 1;
                        if (20 >= fieldTemp$4) {
                            statePc = 190;
                        } else {
                            statePc = 188;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        he.field_c = 0;
                        statePc = 190;
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        var9 = this.field_q;
                        if (-5 == (var9 ^ -1)) {
                            statePc = 197;
                        } else {
                            statePc = 191;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        if (var9 != 5) {
                            statePc = 229;
                        } else {
                            statePc = 192;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        statePc = 194;
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        if (var13 == 0) {
                            statePc = 219;
                        } else {
                            statePc = 195;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        statePc = 197;
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 197: {
                    try {
                        if ((this.field_h ^ -1) == 0) {
                            statePc = 229;
                        } else {
                            statePc = 198;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_197) {
                        caughtException = stateCaught_197;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 198: {
                    try {
                        statePc = 200;
                        continue stateLoop;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        if (this.field_h != 5) {
                            statePc = 208;
                        } else {
                            statePc = 201;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_200) {
                        caughtException = stateCaught_200;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 201: {
                    try {
                        statePc = 203;
                        continue stateLoop;
                    } catch (Throwable stateCaught_201) {
                        caughtException = stateCaught_201;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 203: {
                    try {
                        if ((k.field_t ^ -1) < -41) {
                            statePc = 208;
                        } else {
                            statePc = 204;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_203) {
                        caughtException = stateCaught_203;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 204: {
                    try {
                        statePc = 206;
                        continue stateLoop;
                    } catch (Throwable stateCaught_204) {
                        caughtException = stateCaught_204;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 206: {
                    try {
                        statePc = 229;
                        continue stateLoop;
                    } catch (Throwable stateCaught_206) {
                        caughtException = stateCaught_206;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 208: {
                    try {
                        var9 = 1793;
                        var10 = (int)(tp.field_p % (long)var9);
                        if ((var10 ^ -1) != -1) {
                            statePc = 212;
                        } else {
                            statePc = 209;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_208) {
                        caughtException = stateCaught_208;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 209: {
                    try {
                        kh.a(122, false);
                        if (var13 == 0) {
                            statePc = 218;
                        } else {
                            statePc = 210;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_209) {
                        caughtException = stateCaught_209;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 210: {
                    try {
                        statePc = 212;
                        continue stateLoop;
                    } catch (Throwable stateCaught_210) {
                        caughtException = stateCaught_210;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 212: {
                    try {
                        if (-61 == (var10 ^ -1)) {
                            statePc = 217;
                        } else {
                            statePc = 213;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_212) {
                        caughtException = stateCaught_212;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 213: {
                    try {
                        statePc = 215;
                        continue stateLoop;
                    } catch (Throwable stateCaught_213) {
                        caughtException = stateCaught_213;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 215: {
                    try {
                        statePc = 218;
                        continue stateLoop;
                    } catch (Throwable stateCaught_215) {
                        caughtException = stateCaught_215;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 217: {
                    try {
                        kh.a(so.c(3) + 119, false);
                        statePc = 218;
                        continue stateLoop;
                    } catch (Throwable stateCaught_217) {
                        caughtException = stateCaught_217;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 218: {
                    try {
                        if (var13 == 0) {
                            statePc = 229;
                        } else {
                            statePc = 219;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_218) {
                        caughtException = stateCaught_218;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 219: {
                    try {
                        var7 = 419;
                        var8 = (int)(tp.field_p % (long)var7);
                        if (0 == var8) {
                            statePc = 222;
                        } else {
                            statePc = 220;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_219) {
                        caughtException = stateCaught_219;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 220: {
                    try {
                        statePc = 229;
                        continue stateLoop;
                    } catch (Throwable stateCaught_220) {
                        caughtException = stateCaught_220;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 222: {
                    try {
                        if (tp.field_p % 2L != 0L) {
                            statePc = 225;
                        } else {
                            statePc = 223;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_222) {
                        caughtException = stateCaught_222;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 223: {
                    try {
                        stackIn_226_0 = 137;
                        statePc = 226;
                        continue stateLoop;
                    } catch (Throwable stateCaught_223) {
                        caughtException = stateCaught_223;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 225: {
                    try {
                        stackIn_226_0 = 138;
                        statePc = 226;
                        continue stateLoop;
                    } catch (Throwable stateCaught_225) {
                        caughtException = stateCaught_225;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 226: {
                    try {
                        var9 = stackIn_226_0;
                        kh.a(var9, false);
                        statePc = 229;
                        continue stateLoop;
                    } catch (Throwable stateCaught_226) {
                        caughtException = stateCaught_226;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 228: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw sh.a((Throwable) ((Object) var2), "hi.T(" + param0 + ')');
                }
                case 229: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1, int param2) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var4_int = 109 % ((param0 - -77) / 40);
              if (d.a(param2, false, param1)) {
                break L1;
              } else {
                if (!this.field_Q.a((byte) 118, param2, param1)) {
                  L2: {
                    if (!this.field_Q.a((byte) 126)) {
                      break L2;
                    } else {
                      if (null == this.field_kb) {
                        break L2;
                      } else {
                        this.a(this.field_kb, (byte) -2);
                        this.field_Q.a(67, this.field_kb);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                  L3: {
                    if (!this.field_Q.a(-107)) {
                      break L3;
                    } else {
                      if (null == this.field_a) {
                        break L3;
                      } else {
                        L4: {
                          if (bo.field_p[81]) {
                            break L4;
                          } else {
                            this.c((byte) -114);
                            break L4;
                          }
                        }
                        this.field_Q.a(67, this.field_a);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (this.field_Q.a(true)) {
                        break L6;
                      } else {
                        if (this.field_Q.d(121)) {
                          break L6;
                        } else {
                          L7: {
                            if (null != this.field_kb) {
                              break L7;
                            } else {
                              if (-1 > (this.field_W.a(false) ^ -1)) {
                                this.b(this.field_S.b(param2, true), this.field_S.a(param1, false), 122);
                                if (var5 == 0) {
                                  break L5;
                                } else {
                                  break L7;
                                }
                              } else {
                                break L5;
                              }
                            }
                          }
                          this.a(this.field_kb, (byte) -2);
                          ck.a(-3, 6836);
                          if (var5 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    this.field_Q.b(this.field_S.b(param2, true), this.field_S.a(param1, false), false);
                    if (var5 == 0) {
                      break L5;
                    } else {
                      break L1;
                    }
                  }
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "hi.OA(" + param0 + ',' + param1 + ',' + param2 + ')');
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

    final void a(int param0, boolean param1, int param2, int param3) {
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ZombieDawn.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.field_d.d(-46) > 200) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var5_int = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (-6 >= (var5_int ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.field_d.f(67);
                        var5_int++;
                        if (var6 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var6 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.field_d.a(0, new gk(param3, param0, pb.a(so.field_a, 6, 1), param1));
                        this.field_d.a(0, new gk(param3 - -15, param0, pb.a(so.field_a, 6, 1), param1));
                        this.field_d.a(0, new gk(-15 + param3, param0, pb.a(so.field_a, 6, 1), param1));
                        this.field_d.a(0, new gk(param3, param0 - 15, pb.a(so.field_a, 6, 1), param1));
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param2 >= 109) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.a((kd) null, (byte) -74);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        this.field_d.a(0, new gk(param3, 15 + param0, pb.a(so.field_a, 6, 1), param1));
                        if (this.field_H.a(false, param0 + -24, param3, true)) {
                            statePc = 29;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (this.field_H.a(false, -24 + param0, param3 - -24, true)) {
                            statePc = 29;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (this.field_H.a(false, param0 - 24, -24 + param3, true)) {
                            statePc = 29;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (this.field_H.a(false, param0, param3, true)) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        param0 = param0 - (24 - -(param0 % 24));
                        this.field_R.a(0, new gk(param3, param0, 6 + pb.a(so.field_a, 6, 1), param1));
                        this.field_d.a(0, new gk(param3, 24 + param0, pb.a(so.field_a, 6, 1), param1));
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 28: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    throw sh.a((Throwable) ((Object) var5), "hi.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                case 29: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 9091) {
                break L1;
              } else {
                this.field_e = (vo) null;
                break L1;
              }
            }
            bd.a(this.h(false), true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "hi.MA(" + param0 + ')');
        }
    }

    private final void e(boolean param0) {
        int stackIn_16_0 = 0;
        boolean stackIn_19_0 = false;
        int stackIn_82_0 = 0;
        Object stackIn_89_0 = null;
        ub stackIn_89_1 = null;
        ub stackIn_89_2 = null;
        Object stackIn_91_0 = null;
        ub stackIn_91_1 = null;
        ub stackIn_91_2 = null;
        Object stackIn_92_0 = null;
        ub stackIn_92_1 = null;
        ub stackIn_92_2 = null;
        int stackIn_92_3 = 0;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        int stackIn_95_2 = 0;
        int stackIn_117_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_124_1 = 0;
        int stackIn_138_0 = 0;
        int stackIn_140_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_143_0 = 0;
        int stackIn_143_1 = 0;
        ub stackIn_154_0 = null;
        int stackIn_154_1 = 0;
        ub stackIn_155_0 = null;
        int stackIn_155_1 = 0;
        ub stackIn_157_0 = null;
        int stackIn_157_1 = 0;
        ub stackIn_159_0 = null;
        int stackIn_159_1 = 0;
        ub stackIn_160_0 = null;
        int stackIn_160_1 = 0;
        int stackIn_160_2 = 0;
        ub stackIn_161_0 = null;
        ub stackIn_162_0 = null;
        ub stackIn_164_0 = null;
        ub stackIn_166_0 = null;
        ub stackIn_167_0 = null;
        int stackIn_167_1 = 0;
        ub stackIn_168_0 = null;
        int stackIn_168_1 = 0;
        ub stackIn_169_0 = null;
        int stackIn_169_1 = 0;
        ub stackIn_171_0 = null;
        int stackIn_171_1 = 0;
        ub stackIn_173_0 = null;
        int stackIn_173_1 = 0;
        ub stackIn_174_0 = null;
        int stackIn_174_1 = 0;
        int stackIn_174_2 = 0;
        ub stackIn_175_0 = null;
        int stackIn_175_1 = 0;
        ub stackIn_176_0 = null;
        int stackIn_176_1 = 0;
        ub stackIn_178_0 = null;
        int stackIn_178_1 = 0;
        ub stackIn_179_0 = null;
        int stackIn_179_1 = 0;
        ub stackIn_181_0 = null;
        int stackIn_181_1 = 0;
        ub stackIn_183_0 = null;
        int stackIn_183_1 = 0;
        ub stackIn_184_0 = null;
        int stackIn_184_1 = 0;
        int stackIn_184_2 = 0;
        ub stackIn_185_0 = null;
        ub stackIn_187_0 = null;
        ub stackIn_188_0 = null;
        int stackIn_188_1 = 0;
        int stackIn_251_0 = 0;
        int stackIn_253_0 = 0;
        int stackIn_257_0 = 0;
        int stackIn_259_0 = 0;
        int stackIn_259_1 = 0;
        int stackIn_261_0 = 0;
        int stackIn_264_0 = 0;
        int stackIn_264_1 = 0;
        int stackIn_291_0 = 0;
        int stackIn_291_1 = 0;
        kc stackIn_296_0 = null;
        kc stackIn_298_0 = null;
        kc stackIn_300_0 = null;
        kc stackIn_301_0 = null;
        int stackIn_301_1 = 0;
        int stackIn_304_0 = 0;
        int stackIn_304_1 = 0;
        int stackIn_313_0 = 0;
        int stackIn_313_1 = 0;
        int stackIn_320_0 = 0;
        int stackIn_320_1 = 0;
        int stackIn_323_0 = 0;
        int stackIn_323_1 = 0;
        int stackIn_331_0 = 0;
        int stackIn_331_1 = 0;
        int stackIn_333_0 = 0;
        int stackIn_333_1 = 0;
        int stackIn_340_0 = 0;
        int stackIn_340_1 = 0;
        int stackIn_343_0 = 0;
        int stackIn_343_1 = 0;
        int stackIn_351_0 = 0;
        int stackIn_351_1 = 0;
        int stackIn_353_0 = 0;
        int stackIn_355_0 = 0;
        int stackIn_358_0 = 0;
        int stackIn_358_1 = 0;
        int stackIn_371_0 = 0;
        int stackIn_374_0 = 0;
        int stackIn_374_1 = 0;
        int stackIn_376_0 = 0;
        int stackIn_378_0 = 0;
        int stackIn_378_1 = 0;
        int stackIn_380_0 = 0;
        int stackIn_380_1 = 0;
        int stackIn_384_0 = 0;
        int stackIn_387_0 = 0;
        int stackIn_387_1 = 0;
        int stackIn_393_0 = 0;
        int stackIn_396_0 = 0;
        int stackIn_396_1 = 0;
        int stackIn_415_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        boolean stackOut_18_0;
        int statePc = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        fb var4 = null;
        String var4_ref = null;
        tj var5 = null;
        fn var6_ref_fn = null;
        boolean[][] var6_ref_boolean____ = null;
        int var6 = 0;
        boolean[][] var7_ref_boolean____ = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        kc var9_ref_kc = null;
        kd var9_ref_kd = null;
        int var10_int = 0;
        qh var10 = null;
        int[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var17 = ZombieDawn.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    var2_int = 15 + this.h(false);
                    oj.field_d.a(false, 13);
                    if (this.field_bb != 1) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    oj.field_d.a(false, 14);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    oj.field_d.a(param0, this.field_mb.field_a);
                    oj.field_d.a(param0, var2_int);
                    if (oj.field_d.c((byte) 115)) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                case 6: {
                    this.field_w = true;
                    this.field_M = false;
                    this.field_p = param0;
                    this.field_kb = null;
                    this.field_W = new ra();
                    this.field_b = new qj();
                    this.field_nb = 0;
                    mc.field_h = 0;
                    this.field_E = 0;
                    on.field_q = -1;
                    ld.field_m = true;
                    this.field_hb = 0;
                    this.field_o = 0;
                    he.field_c = 0;
                    this.field_P = 0;
                    qb.field_b = -1;
                    this.field_r = 0;
                    this.field_fb = 0;
                    uc.field_c = 0;
                    this.field_H = new ej(this.field_mb);
                    this.field_u = new int[3];
                    this.field_J = new int[3];
                    mn.a(false);
                    hm.a(9);
                    this.field_n = new mj(1 + (this.field_H.field_u >> 610979847), 1 + (this.field_H.field_p >> 1047195847));
                    this.field_S = new wk(this.field_H.field_u, this.field_H.field_p);
                    this.field_S.a(this.field_mb.field_b[1], this.field_mb.field_b[3], this.field_mb.field_m[2], this.field_mb.field_m[0], this.field_mb.field_b[0], this.field_mb.field_m[1], this.field_mb.field_m[3], this.field_mb.field_b[2], 106);
                    this.field_S.a((byte) -98);
                    this.b(8, this.field_mb.field_a);
                    this.field_mb.a(0, true);
                    this.field_m = new vo();
                    this.field_lb = new vo();
                    this.field_d = new vo();
                    this.field_e = new vo();
                    this.field_v = new vo();
                    this.field_T = new vo();
                    this.field_i = new vo();
                    this.field_R = this.field_mb.b((byte) 106);
                    so.b(this.field_R);
                    this.field_f = 0;
                    this.field_l = 0;
                    cm.field_c = null;
                    if (this.field_q == 4) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if ((this.field_q ^ -1) != -8) {
                        statePc = 15;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (this.field_h != 0) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_16_0 = 1;
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = 0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    var3 = stackIn_16_0;
                    var4 = (fb) ((Object) this.field_R.b((byte) 26));
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (null == var4) {
                        statePc = 81;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackOut_18_0 = var4 instanceof gb;
                    stackIn_82_0 = stackOut_18_0 ? 1 : 0;
                    stackIn_19_0 = stackOut_18_0;
                    if (var17 != 0) {
                        statePc = 82;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (stackIn_19_0) {
                        statePc = 23;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (!var4.field_C) {
                        statePc = 30;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (!vi.field_a) {
                        statePc = 30;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var4.b(-27598);
                    if (var17 == 0) {
                        statePc = 80;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (var4 instanceof ah) {
                        statePc = 35;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (!var4.field_C) {
                        statePc = 42;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (!vi.field_a) {
                        statePc = 41;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var4.b(-27598);
                    if (var17 == 0) {
                        statePc = 80;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (!((ah) ((Object) var4)).field_ib) {
                        statePc = 47;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 47: {
                    this.field_f = this.field_f + 1;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if (var4.field_z > 0) {
                        statePc = 52;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (!(var4 instanceof g)) {
                        statePc = 64;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var4.d((byte) -85);
                    if (!var4.a((byte) 99, 4)) {
                        statePc = 57;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    this.field_u[-1 + var4.field_z] = this.field_u[-1 + var4.field_z] + 1;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    if (!var4.a((byte) 38, 1)) {
                        statePc = 64;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (0 < var4.field_z) {
                        statePc = 63;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 63: {
                    this.field_J[-1 + var4.field_z] = this.field_J[-1 + var4.field_z] + 1;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    if (!(var4 instanceof te)) {
                        statePc = 67;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var4.d((byte) 127);
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    if (var3 == 0) {
                        statePc = 77;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (var4 instanceof kd) {
                        statePc = 73;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 73: {
                    ((kd) ((Object) var4)).v(-23221);
                    if ((this.field_q ^ -1) == -8) {
                        statePc = 76;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 76: {
                    var3 = 0;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    if (!(var4 instanceof kc)) {
                        statePc = 80;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    ((kc) ((Object) var4)).a(this.field_H, false);
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    var4 = (fb) ((Object) this.field_R.a(false));
                    if (var17 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    this.field_db = 0;
                    stackIn_82_0 = 6;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    if (stackIn_82_0 != this.field_q) {
                        statePc = 88;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (3 != this.field_h) {
                        statePc = 88;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    this.field_db = 13;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    this.field_Q = new uh();
                    stackIn_91_0 = this;
                    stackIn_89_0 = stackIn_91_0;
                    stackIn_91_1 = null;
                    stackIn_89_1 = stackIn_91_1;
                    stackIn_91_2 = null;
                    stackIn_89_2 = stackIn_91_2;
                    if (!vi.field_a) {
                        statePc = 91;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    stackIn_92_0 = this;
                    stackIn_92_1 = null;
                    stackIn_92_2 = null;
                    stackIn_92_3 = this.field_mb.field_s - -1;
                    statePc = 92;
                    continue stateLoop;
                }
                case 91: {
                    stackIn_92_0 = this;
                    stackIn_92_1 = null;
                    stackIn_92_2 = null;
                    stackIn_92_3 = 1 + this.field_mb.field_j;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    ((hi) (this)).field_gb = new ub(stackIn_92_3);
                    gg.a(128);
                    nc.a(11800);
                    wh.a((byte) 100);
                    jj.b(param0);
                    stackIn_94_0 = this.field_q;
                    stackIn_93_0 = stackIn_94_0;
                    stackIn_94_1 = this.field_h;
                    stackIn_93_1 = stackIn_94_1;
                    if (param0) {
                        statePc = 94;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    stackIn_95_0 = stackIn_93_0;
                    stackIn_95_1 = stackIn_93_1;
                    stackIn_95_2 = 1;
                    statePc = 95;
                    continue stateLoop;
                }
                case 94: {
                    stackIn_95_0 = stackIn_94_0;
                    stackIn_95_1 = stackIn_94_1;
                    stackIn_95_2 = 0;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    ih.a(stackIn_95_0, stackIn_95_1, stackIn_95_2 != 0);
                    bo.field_i = false;
                    if (-1 == this.field_h) {
                        statePc = 97;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    var4_ref = gj.field_w[this.field_q][this.field_h];
                    statePc = 113;
                    continue stateLoop;
                }
                case 97: {
                    var4_ref = te.field_S;
                    if (this.field_q == 3) {
                        statePc = 103;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (this.field_q == 7) {
                        statePc = 103;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 103: {
                    if (7 == this.field_q) {
                        statePc = 110;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    if (3 != this.field_q) {
                        statePc = 112;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    this.a(248, 7, (byte) -23);
                    if (var17 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    this.a(231, 24, (byte) -23);
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    qm.a(1, this.field_bb);
                    var4_ref = hm.field_M;
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    var5 = sg.field_jb;
                    this.field_V = new vn(var5.b(var4_ref), var5.field_I + var5.field_x);
                    this.field_t = new vn(12 + this.field_V.field_w, 12 + this.field_V.field_t);
                    this.field_V.a();
                    this.field_N = 640;
                    var5.a(var4_ref, this.field_V.field_w / 2, this.field_V.field_t - var5.field_x, 2, -1);
                    this.field_t.a();
                    this.field_V.h(6, 6, 16777215);
                    bi.h(4, 4, 0, 0, bi.field_f, bi.field_a);
                    this.field_V.h(6, 6, 0);
                    cn.field_f.b(96);
                    if (param0) {
                        statePc = 116;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    stackIn_117_0 = 1;
                    statePc = 117;
                    continue stateLoop;
                }
                case 116: {
                    stackIn_117_0 = 0;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    stackIn_123_0 = stackIn_117_0;
                    stackIn_118_0 = stackIn_123_0;
                    if (-1 != (this.field_q ^ -1)) {
                        statePc = 123;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    stackIn_123_0 = stackIn_118_0;
                    stackIn_119_0 = stackIn_123_0;
                    if ((this.field_h ^ -1) != -6) {
                        statePc = 123;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    stackIn_121_0 = stackIn_119_0;
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    stackIn_124_0 = stackIn_121_0;
                    stackIn_124_1 = 1;
                    statePc = 124;
                    continue stateLoop;
                }
                case 123: {
                    stackIn_124_0 = stackIn_123_0;
                    stackIn_124_1 = 0;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    lc.a(stackIn_124_0 != 0, stackIn_124_1 != 0);
                    if (1 != this.field_q) {
                        statePc = 134;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    if ((this.field_h ^ -1) == -2) {
                        statePc = 131;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    if (-5 != (this.field_h ^ -1)) {
                        statePc = 134;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    jp.a((byte) 125, 53);
                    if (var17 == 0) {
                        statePc = 153;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    if (-6 != (this.field_q ^ -1)) {
                        statePc = 150;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    stackIn_142_0 = 127;
                    stackIn_138_0 = stackIn_142_0;
                    if (0 == this.field_h % 2) {
                        statePc = 142;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    stackIn_140_0 = stackIn_138_0;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    stackIn_143_0 = stackIn_140_0;
                    stackIn_143_1 = 148;
                    statePc = 143;
                    continue stateLoop;
                }
                case 142: {
                    stackIn_143_0 = stackIn_142_0;
                    stackIn_143_1 = 147;
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    var6_ref_fn = jp.a((byte) stackIn_143_0, stackIn_143_1);
                    var6_ref_fn.h(2 * var6_ref_fn.j());
                    if (2 == this.field_h) {
                        statePc = 147;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    if (3 != this.field_h) {
                        statePc = 149;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    jp.a((byte) 126, 145);
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    if (var17 == 0) {
                        statePc = 153;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    if (6 != this.field_q) {
                        statePc = 153;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    stackIn_159_0 = this.field_gb;
                    stackIn_154_0 = stackIn_159_0;
                    stackIn_159_1 = 49;
                    stackIn_154_1 = stackIn_159_1;
                    if (7 != this.field_q) {
                        statePc = 159;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    stackIn_159_0 = (ub) ((Object) stackIn_154_0);
                    stackIn_155_0 = stackIn_159_0;
                    stackIn_159_1 = stackIn_154_1;
                    stackIn_155_1 = stackIn_159_1;
                    if (-6 != (this.field_h ^ -1)) {
                        statePc = 159;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    stackIn_157_0 = (ub) ((Object) stackIn_155_0);
                    stackIn_157_1 = stackIn_155_1;
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    stackIn_160_0 = (ub) ((Object) stackIn_157_0);
                    stackIn_160_1 = stackIn_157_1;
                    stackIn_160_2 = 1;
                    statePc = 160;
                    continue stateLoop;
                }
                case 159: {
                    stackIn_160_0 = (ub) ((Object) stackIn_159_0);
                    stackIn_160_1 = stackIn_159_1;
                    stackIn_160_2 = 0;
                    statePc = 160;
                    continue stateLoop;
                }
                case 160: {
                    ((ub) (Object) stackIn_160_0).a(stackIn_160_1, stackIn_160_2 != 0);
                    stackIn_166_0 = this.field_gb;
                    stackIn_161_0 = stackIn_166_0;
                    if (this.field_q != 4) {
                        statePc = 166;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    stackIn_166_0 = (ub) ((Object) stackIn_161_0);
                    stackIn_162_0 = stackIn_166_0;
                    if ((this.field_h ^ -1) != 0) {
                        statePc = 166;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    stackIn_164_0 = (ub) ((Object) stackIn_162_0);
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    stackIn_167_0 = (ub) ((Object) stackIn_164_0);
                    stackIn_167_1 = 1;
                    statePc = 167;
                    continue stateLoop;
                }
                case 166: {
                    stackIn_167_0 = (ub) ((Object) stackIn_166_0);
                    stackIn_167_1 = 0;
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    ((ub) (Object) stackIn_167_0).a(stackIn_167_1 != 0, (byte) -13);
                    stackIn_173_0 = this.field_gb;
                    stackIn_168_0 = stackIn_173_0;
                    stackIn_173_1 = 10;
                    stackIn_168_1 = stackIn_173_1;
                    if (this.field_q != 5) {
                        statePc = 173;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    stackIn_173_0 = (ub) ((Object) stackIn_168_0);
                    stackIn_169_0 = stackIn_173_0;
                    stackIn_173_1 = stackIn_168_1;
                    stackIn_169_1 = stackIn_173_1;
                    if (0 != (this.field_h ^ -1)) {
                        statePc = 173;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    stackIn_171_0 = (ub) ((Object) stackIn_169_0);
                    stackIn_171_1 = stackIn_169_1;
                    statePc = 171;
                    continue stateLoop;
                }
                case 171: {
                    stackIn_174_0 = (ub) ((Object) stackIn_171_0);
                    stackIn_174_1 = stackIn_171_1;
                    stackIn_174_2 = 1;
                    statePc = 174;
                    continue stateLoop;
                }
                case 173: {
                    stackIn_174_0 = (ub) ((Object) stackIn_173_0);
                    stackIn_174_1 = stackIn_173_1;
                    stackIn_174_2 = 0;
                    statePc = 174;
                    continue stateLoop;
                }
                case 174: {
                    ((ub) (Object) stackIn_174_0).b(stackIn_174_1, stackIn_174_2 != 0);
                    stackIn_178_0 = this.field_gb;
                    stackIn_175_0 = stackIn_178_0;
                    stackIn_178_1 = 0;
                    stackIn_175_1 = stackIn_178_1;
                    if (1 == this.field_q) {
                        statePc = 178;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    stackIn_183_0 = (ub) ((Object) stackIn_175_0);
                    stackIn_176_0 = stackIn_183_0;
                    stackIn_183_1 = stackIn_175_1;
                    stackIn_176_1 = stackIn_183_1;
                    if ((this.field_q ^ -1) != -7) {
                        statePc = 183;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    stackIn_178_0 = (ub) ((Object) stackIn_176_0);
                    stackIn_178_1 = stackIn_176_1;
                    statePc = 178;
                    continue stateLoop;
                }
                case 178: {
                    stackIn_183_0 = (ub) ((Object) stackIn_178_0);
                    stackIn_179_0 = stackIn_183_0;
                    stackIn_183_1 = stackIn_178_1;
                    stackIn_179_1 = stackIn_183_1;
                    if (this.field_h != -1) {
                        statePc = 183;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    stackIn_181_0 = (ub) ((Object) stackIn_179_0);
                    stackIn_181_1 = stackIn_179_1;
                    statePc = 181;
                    continue stateLoop;
                }
                case 181: {
                    stackIn_184_0 = (ub) ((Object) stackIn_181_0);
                    stackIn_184_1 = stackIn_181_1;
                    stackIn_184_2 = 1;
                    statePc = 184;
                    continue stateLoop;
                }
                case 183: {
                    stackIn_184_0 = (ub) ((Object) stackIn_183_0);
                    stackIn_184_1 = stackIn_183_1;
                    stackIn_184_2 = 0;
                    statePc = 184;
                    continue stateLoop;
                }
                case 184: {
                    ((ub) (Object) stackIn_184_0).c(stackIn_184_1, stackIn_184_2 != 0);
                    stackIn_187_0 = this.field_gb;
                    stackIn_185_0 = stackIn_187_0;
                    if (param0) {
                        statePc = 187;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    stackIn_188_0 = (ub) ((Object) stackIn_185_0);
                    stackIn_188_1 = 1;
                    statePc = 188;
                    continue stateLoop;
                }
                case 187: {
                    stackIn_188_0 = (ub) ((Object) stackIn_187_0);
                    stackIn_188_1 = 0;
                    statePc = 188;
                    continue stateLoop;
                }
                case 188: {
                    ((ub) (Object) stackIn_188_0).a(stackIn_188_1 != 0, bo.field_i);
                    if (-1 != (this.field_q ^ -1)) {
                        statePc = 192;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    if ((this.field_h ^ -1) != 0) {
                        statePc = 239;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 192: {
                    if (1 != this.field_q) {
                        statePc = 198;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    if (5 == this.field_h) {
                        statePc = 239;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    if (-2 != (this.field_q ^ -1)) {
                        statePc = 204;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    if (this.field_h == -1) {
                        statePc = 239;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    if ((this.field_q ^ -1) != -3) {
                        statePc = 210;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    if (-6 == (this.field_h ^ -1)) {
                        statePc = 239;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    if (this.field_q != 6) {
                        statePc = 216;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    if (this.field_h == 3) {
                        statePc = 239;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    if (this.field_q != 6) {
                        statePc = 222;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    if (4 == this.field_h) {
                        statePc = 239;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    if (-7 != (this.field_q ^ -1)) {
                        statePc = 228;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    if (-6 == (this.field_h ^ -1)) {
                        statePc = 239;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 228: {
                    if (-6 != (this.field_q ^ -1)) {
                        statePc = 234;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    if (this.field_h != -1) {
                        statePc = 239;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    if (7 == this.field_q) {
                        statePc = 239;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 239: {
                    this.field_gb.d(0);
                    this.field_H.field_A.field_c = -1;
                    this.field_H.field_A.field_o = -1;
                    statePc = 240;
                    continue stateLoop;
                }
                case 240: {
                    if (0 == (this.field_h ^ -1)) {
                        statePc = 243;
                    } else {
                        statePc = 370;
                    }
                    continue stateLoop;
                }
                case 243: {
                    this.field_H.field_A.field_o = -1;
                    this.field_H.field_A.field_c = -1;
                    if (5 == this.field_q) {
                        statePc = 310;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    if ((this.field_q ^ -1) == -7) {
                        statePc = 249;
                    } else {
                        statePc = 370;
                    }
                    continue stateLoop;
                }
                case 249: {
                    var6_ref_boolean____ = new boolean[4][6];
                    var7_ref_boolean____ = new boolean[4][6];
                    var8 = 0;
                    statePc = 250;
                    continue stateLoop;
                }
                case 250: {
                    stackIn_251_0 = -4;
                    statePc = 251;
                    continue stateLoop;
                }
                case 251: {
                    if (stackIn_251_0 < (var8 ^ -1)) {
                        statePc = 256;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    stackIn_257_0 = 5;
                    stackIn_253_0 = stackIn_257_0;
                    if (var17 != 0) {
                        statePc = 257;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    if (stackIn_253_0 >= var8) {
                        statePc = 288;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    var8 = 0;
                    stackIn_257_0 = 0;
                    statePc = 257;
                    continue stateLoop;
                }
                case 257: {
                    var9 = stackIn_257_0;
                    var10_int = 0;
                    statePc = 258;
                    continue stateLoop;
                }
                case 258: {
                    stackIn_259_0 = -5;
                    stackIn_259_1 = var10_int ^ -1;
                    statePc = 259;
                    continue stateLoop;
                }
                case 259: {
                    if (stackIn_259_0 >= stackIn_259_1) {
                        statePc = 287;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    var11 = 0;
                    stackIn_251_0 = 0;
                    stackIn_261_0 = stackIn_251_0;
                    if (var17 != 0) {
                        statePc = 251;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 261: {
                    var12 = stackIn_261_0;
                    statePc = 262;
                    continue stateLoop;
                }
                case 262: {
                    if (-7 >= (var12 ^ -1)) {
                        statePc = 286;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 263: {
                    var6_ref_boolean____[var10_int][var12] = true;
                    var7_ref_boolean____[var10_int][var12] = true;
                    stackIn_259_0 = var12;
                    stackIn_264_0 = stackIn_259_0;
                    stackIn_259_1 = 5;
                    stackIn_264_1 = stackIn_259_1;
                    if (var17 != 0) {
                        statePc = 259;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 264: {
                    if (stackIn_264_0 >= stackIn_264_1) {
                        statePc = 271;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 265: {
                    if (var10_int == 0) {
                        statePc = 283;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    if (-101 < (so.c(256) ^ -1)) {
                        statePc = 283;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 271: {
                    var7_ref_boolean____[var10_int][var12] = true;
                    var13 = var12 - so.c(var11 + 1);
                    if ((var10_int ^ -1) != -1) {
                        statePc = 273;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 272: {
                    var9 = var13;
                    if (var17 == 0) {
                        statePc = 282;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 273: {
                    if (var9 > var12) {
                        statePc = 282;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 276: {
                    if ((var9 ^ -1) <= (var12 + -var11 ^ -1)) {
                        statePc = 281;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 281: {
                    var8 = var8 + Math.abs(var9 + -var13);
                    var9 = var13;
                    statePc = 282;
                    continue stateLoop;
                }
                case 282: {
                    var6_ref_boolean____[var10_int][var13] = false;
                    var11 = 0;
                    if (var17 == 0) {
                        statePc = 285;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 283: {
                    var7_ref_boolean____[var10_int][var12] = false;
                    var11++;
                    statePc = 285;
                    continue stateLoop;
                }
                case 285: {
                    var12++;
                    if (var17 == 0) {
                        statePc = 262;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 286: {
                    var10_int++;
                    if (var17 == 0) {
                        statePc = 258;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 287: {
                    if (var17 == 0) {
                        statePc = 250;
                    } else {
                        statePc = 288;
                    }
                    continue stateLoop;
                }
                case 288: {
                    var9_ref_kc = (kc) ((Object) rg.field_J.c((byte) 34));
                    statePc = 289;
                    continue stateLoop;
                }
                case 289: {
                    if (var9_ref_kc == null) {
                        statePc = 303;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 290: {
                    stackIn_304_0 = var9_ref_kc.field_V ^ -1;
                    stackIn_291_0 = stackIn_304_0;
                    stackIn_304_1 = -2;
                    stackIn_291_1 = stackIn_304_1;
                    if (var17 != 0) {
                        statePc = 304;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 291: {
                    if (stackIn_291_0 != stackIn_291_1) {
                        statePc = 295;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 294: {
                    var10_int = (var9_ref_kc.a(true) - 168) / 168;
                    var11 = (var9_ref_kc.f(237239984) + -168) / 168;
                    var9_ref_kc.field_S = var7_ref_boolean____[var11][var10_int];
                    if (var17 == 0) {
                        statePc = 302;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 295: {
                    stackIn_300_0 = (kc) (var9_ref_kc);
                    stackIn_296_0 = stackIn_300_0;
                    if (param0) {
                        statePc = 300;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 296: {
                    stackIn_298_0 = (kc) ((Object) stackIn_296_0);
                    statePc = 298;
                    continue stateLoop;
                }
                case 298: {
                    stackIn_301_0 = (kc) ((Object) stackIn_298_0);
                    stackIn_301_1 = 1;
                    statePc = 301;
                    continue stateLoop;
                }
                case 300: {
                    stackIn_301_0 = (kc) ((Object) stackIn_300_0);
                    stackIn_301_1 = 0;
                    statePc = 301;
                    continue stateLoop;
                }
                case 301: {
                    var10_int = (((kc) (Object) stackIn_301_0).a(stackIn_301_1 != 0) + -24) / 168;
                    var11 = (var9_ref_kc.f(237239984) + -288) / 168;
                    var9_ref_kc.field_S = var6_ref_boolean____[var11][var10_int];
                    statePc = 302;
                    continue stateLoop;
                }
                case 302: {
                    var9_ref_kc = (kc) ((Object) rg.field_J.a((byte) 111));
                    if (var17 == 0) {
                        statePc = 289;
                    } else {
                        statePc = 303;
                    }
                    continue stateLoop;
                }
                case 303: {
                    stackIn_304_0 = this.field_gb.field_k;
                    stackIn_304_1 = 99;
                    statePc = 304;
                    continue stateLoop;
                }
                case 304: {
                    if (stackIn_304_0 >= stackIn_304_1) {
                        statePc = 309;
                    } else {
                        statePc = 305;
                    }
                    continue stateLoop;
                }
                case 305: {
                    var9_ref_kd = this.a(216, (byte) 122, -264 + this.field_H.field_u, 144, 48 + (this.field_H.field_p + 30));
                    var10 = new qh();
                    var10.a(0, new kk(var9_ref_kd.a(true), this.field_H.field_p + -168 - -so.c(96)));
                    var9_ref_kd.a(var10, true);
                    if (var17 != 0) {
                        statePc = 370;
                    } else {
                        statePc = 306;
                    }
                    continue stateLoop;
                }
                case 306: {
                    if (var17 == 0) {
                        statePc = 303;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 309: {
                    if (var17 == 0) {
                        statePc = 370;
                    } else {
                        statePc = 310;
                    }
                    continue stateLoop;
                }
                case 310: {
                    this.field_s = new int[10];
                    this.field_k = 0;
                    this.field_D = new int[10];
                    var6 = 0;
                    var7 = 0;
                    statePc = 311;
                    continue stateLoop;
                }
                case 311: {
                    if ((var7 ^ -1) <= (this.field_mb.field_r ^ -1)) {
                        statePc = 319;
                    } else {
                        statePc = 312;
                    }
                    continue stateLoop;
                }
                case 312: {
                    var8 = this.field_H.c(var7, -34, var6) & 127;
                    stackIn_320_0 = var8 ^ -1;
                    stackIn_313_0 = stackIn_320_0;
                    stackIn_320_1 = -8;
                    stackIn_313_1 = stackIn_320_1;
                    if (var17 != 0) {
                        statePc = 320;
                    } else {
                        statePc = 313;
                    }
                    continue stateLoop;
                }
                case 313: {
                    if (stackIn_313_0 != stackIn_313_1) {
                        statePc = 318;
                    } else {
                        statePc = 316;
                    }
                    continue stateLoop;
                }
                case 316: {
                    this.field_D[this.field_k] = (-2 + var6) * 24;
                    this.field_s[this.field_k] = var7 * 24;
                    this.field_k = this.field_k + 1;
                    this.field_H.field_A.field_f[var7][var6] = eg.a(-128, this.field_H.field_A.field_f[var7][var6]);
                    statePc = 318;
                    continue stateLoop;
                }
                case 318: {
                    var7++;
                    if (var17 == 0) {
                        statePc = 311;
                    } else {
                        statePc = 319;
                    }
                    continue stateLoop;
                }
                case 319: {
                    stackIn_320_0 = this.field_mb.field_k;
                    stackIn_320_1 = 1;
                    statePc = 320;
                    continue stateLoop;
                }
                case 320: {
                    var6 = stackIn_320_0 - stackIn_320_1;
                    var7 = 0;
                    statePc = 321;
                    continue stateLoop;
                }
                case 321: {
                    if ((this.field_mb.field_r ^ -1) >= (var7 ^ -1)) {
                        statePc = 329;
                    } else {
                        statePc = 322;
                    }
                    continue stateLoop;
                }
                case 322: {
                    var8 = 127 & this.field_H.c(var7, 89, var6);
                    stackIn_331_0 = -8;
                    stackIn_323_0 = stackIn_331_0;
                    stackIn_331_1 = var8 ^ -1;
                    stackIn_323_1 = stackIn_331_1;
                    if (var17 != 0) {
                        statePc = 331;
                    } else {
                        statePc = 323;
                    }
                    continue stateLoop;
                }
                case 323: {
                    if (stackIn_323_0 == stackIn_323_1) {
                        statePc = 327;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 327: {
                    this.field_D[this.field_k] = var6 * 24 - -24;
                    this.field_s[this.field_k] = 24 * var7;
                    this.field_k = this.field_k + 1;
                    this.field_H.field_A.field_f[var7][var6] = eg.a(this.field_H.field_A.field_f[var7][var6], -128);
                    statePc = 328;
                    continue stateLoop;
                }
                case 328: {
                    var7++;
                    if (var17 == 0) {
                        statePc = 321;
                    } else {
                        statePc = 329;
                    }
                    continue stateLoop;
                }
                case 329: {
                    var7 = 0;
                    var6 = 0;
                    statePc = 330;
                    continue stateLoop;
                }
                case 330: {
                    stackIn_331_0 = var6;
                    stackIn_331_1 = this.field_mb.field_k;
                    statePc = 331;
                    continue stateLoop;
                }
                case 331: {
                    if (stackIn_331_0 >= stackIn_331_1) {
                        statePc = 339;
                    } else {
                        statePc = 332;
                    }
                    continue stateLoop;
                }
                case 332: {
                    var8 = this.field_H.c(var7, 109, var6) & 127;
                    stackIn_340_0 = var8 ^ -1;
                    stackIn_333_0 = stackIn_340_0;
                    stackIn_340_1 = -8;
                    stackIn_333_1 = stackIn_340_1;
                    if (var17 != 0) {
                        statePc = 340;
                    } else {
                        statePc = 333;
                    }
                    continue stateLoop;
                }
                case 333: {
                    if (stackIn_333_0 == stackIn_333_1) {
                        statePc = 337;
                    } else {
                        statePc = 338;
                    }
                    continue stateLoop;
                }
                case 337: {
                    this.field_D[this.field_k] = 24 * var6 - 12;
                    this.field_s[this.field_k] = 24 * var7 - 48;
                    this.field_k = this.field_k + 1;
                    this.field_H.field_A.field_f[var7][var6] = eg.a(-128, this.field_H.field_A.field_f[var7][var6]);
                    statePc = 338;
                    continue stateLoop;
                }
                case 338: {
                    var6++;
                    if (var17 == 0) {
                        statePc = 330;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 339: {
                    stackIn_340_0 = this.field_mb.field_r;
                    stackIn_340_1 = 1;
                    statePc = 340;
                    continue stateLoop;
                }
                case 340: {
                    var7 = stackIn_340_0 - stackIn_340_1;
                    var6 = 0;
                    statePc = 341;
                    continue stateLoop;
                }
                case 341: {
                    if ((var6 ^ -1) <= (this.field_mb.field_k ^ -1)) {
                        statePc = 349;
                    } else {
                        statePc = 342;
                    }
                    continue stateLoop;
                }
                case 342: {
                    var8 = 127 & this.field_H.c(var7, -63, var6);
                    stackIn_351_0 = var8;
                    stackIn_343_0 = stackIn_351_0;
                    stackIn_351_1 = 7;
                    stackIn_343_1 = stackIn_351_1;
                    if (var17 != 0) {
                        statePc = 351;
                    } else {
                        statePc = 343;
                    }
                    continue stateLoop;
                }
                case 343: {
                    if (stackIn_343_0 == stackIn_343_1) {
                        statePc = 347;
                    } else {
                        statePc = 348;
                    }
                    continue stateLoop;
                }
                case 347: {
                    this.field_D[this.field_k] = (var6 - 1) * 24;
                    this.field_s[this.field_k] = 24 + var7 * 24;
                    this.field_k = this.field_k + 1;
                    this.field_H.field_A.field_f[var7][var6] = eg.a(this.field_H.field_A.field_f[var7][var6], -128);
                    statePc = 348;
                    continue stateLoop;
                }
                case 348: {
                    var6++;
                    if (var17 == 0) {
                        statePc = 341;
                    } else {
                        statePc = 349;
                    }
                    continue stateLoop;
                }
                case 349: {
                    this.field_H.field_A.a(0);
                    var7 = 0;
                    statePc = 350;
                    continue stateLoop;
                }
                case 350: {
                    stackIn_351_0 = var7;
                    stackIn_351_1 = this.field_mb.field_r;
                    statePc = 351;
                    continue stateLoop;
                }
                case 351: {
                    if (stackIn_351_0 >= stackIn_351_1) {
                        statePc = 370;
                    } else {
                        statePc = 352;
                    }
                    continue stateLoop;
                }
                case 352: {
                    stackIn_371_0 = 0;
                    stackIn_353_0 = stackIn_371_0;
                    if (var17 != 0) {
                        statePc = 371;
                    } else {
                        statePc = 353;
                    }
                    continue stateLoop;
                }
                case 353: {
                    stackIn_355_0 = stackIn_353_0;
                    statePc = 355;
                    continue stateLoop;
                }
                case 355: {
                    var6 = stackIn_355_0;
                    statePc = 356;
                    continue stateLoop;
                }
                case 356: {
                    if ((var6 ^ -1) <= (this.field_mb.field_k ^ -1)) {
                        statePc = 369;
                    } else {
                        statePc = 357;
                    }
                    continue stateLoop;
                }
                case 357: {
                    var8 = 127 & this.field_H.field_A.field_h[var7][var6];
                    stackIn_351_0 = var8;
                    stackIn_358_0 = stackIn_351_0;
                    stackIn_351_1 = 14;
                    stackIn_358_1 = stackIn_351_1;
                    if (var17 != 0) {
                        statePc = 351;
                    } else {
                        statePc = 358;
                    }
                    continue stateLoop;
                }
                case 358: {
                    if (stackIn_358_0 == stackIn_358_1) {
                        statePc = 367;
                    } else {
                        statePc = 359;
                    }
                    continue stateLoop;
                }
                case 359: {
                    if ((var8 ^ -1) == -11) {
                        statePc = 367;
                    } else {
                        statePc = 362;
                    }
                    continue stateLoop;
                }
                case 362: {
                    if (2 == var8) {
                        statePc = 367;
                    } else {
                        statePc = 368;
                    }
                    continue stateLoop;
                }
                case 367: {
                    this.field_H.field_A.field_h[var7][var6] = eg.a(this.field_H.field_A.field_h[var7][var6], -128);
                    statePc = 368;
                    continue stateLoop;
                }
                case 368: {
                    var6++;
                    if (var17 == 0) {
                        statePc = 356;
                    } else {
                        statePc = 369;
                    }
                    continue stateLoop;
                }
                case 369: {
                    var7++;
                    if (var17 == 0) {
                        statePc = 350;
                    } else {
                        statePc = 370;
                    }
                    continue stateLoop;
                }
                case 370: {
                    stackIn_371_0 = this.field_mb.field_a ^ -1;
                    statePc = 371;
                    continue stateLoop;
                }
                case 371: {
                    if (stackIn_371_0 != -9) {
                        statePc = 414;
                    } else {
                        statePc = 372;
                    }
                    continue stateLoop;
                }
                case 372: {
                    var6 = 0;
                    statePc = 373;
                    continue stateLoop;
                }
                case 373: {
                    stackIn_374_0 = this.field_mb.field_r;
                    stackIn_374_1 = var6;
                    statePc = 374;
                    continue stateLoop;
                }
                case 374: {
                    if (stackIn_374_0 <= stackIn_374_1) {
                        statePc = 414;
                    } else {
                        statePc = 375;
                    }
                    continue stateLoop;
                }
                case 375: {
                    stackIn_415_0 = 0;
                    stackIn_376_0 = stackIn_415_0;
                    if (var17 != 0) {
                        statePc = 415;
                    } else {
                        statePc = 376;
                    }
                    continue stateLoop;
                }
                case 376: {
                    var7 = stackIn_376_0;
                    statePc = 377;
                    continue stateLoop;
                }
                case 377: {
                    stackIn_378_0 = this.field_mb.field_k;
                    stackIn_378_1 = var7;
                    statePc = 378;
                    continue stateLoop;
                }
                case 378: {
                    if (stackIn_378_0 <= stackIn_378_1) {
                        statePc = 413;
                    } else {
                        statePc = 379;
                    }
                    continue stateLoop;
                }
                case 379: {
                    var8 = this.field_H.field_A.field_h[var6][var7];
                    var9 = 127 & var8;
                    stackIn_374_0 = var9 ^ -1;
                    stackIn_380_0 = stackIn_374_0;
                    stackIn_374_1 = -61;
                    stackIn_380_1 = stackIn_374_1;
                    if (var17 != 0) {
                        statePc = 374;
                    } else {
                        statePc = 380;
                    }
                    continue stateLoop;
                }
                case 380: {
                    if (stackIn_380_0 > stackIn_380_1) {
                        statePc = 412;
                    } else {
                        statePc = 381;
                    }
                    continue stateLoop;
                }
                case 381: {
                    var10_array = new int[8];
                    var10_array[0] = eg.a(this.field_H.field_A.field_h[-1 + var6][var7 + -1], 127);
                    var10_array[1] = eg.a(this.field_H.field_A.field_h[0 + var6][var7 + -1], 127);
                    var10_array[2] = eg.a(127, this.field_H.field_A.field_h[var6 + 1][-1 + var7]);
                    var10_array[3] = eg.a(127, this.field_H.field_A.field_h[-1 + var6][0 + var7]);
                    var10_array[4] = eg.a(127, this.field_H.field_A.field_h[var6 - -1][0 + var7]);
                    var10_array[5] = eg.a(127, this.field_H.field_A.field_h[var6 - 1][1 + var7]);
                    var10_array[6] = eg.a(this.field_H.field_A.field_h[0 + var6][1 + var7], 127);
                    var10_array[7] = eg.a(this.field_H.field_A.field_h[1 + var6][var7 - -1], 127);
                    var11 = 1;
                    statePc = 382;
                    continue stateLoop;
                }
                case 382: {
                    if (var11 == 0) {
                        statePc = 392;
                    } else {
                        statePc = 383;
                    }
                    continue stateLoop;
                }
                case 383: {
                    var11 = 0;
                    stackIn_393_0 = 0;
                    stackIn_384_0 = stackIn_393_0;
                    if (var17 != 0) {
                        statePc = 393;
                    } else {
                        statePc = 384;
                    }
                    continue stateLoop;
                }
                case 384: {
                    var12 = stackIn_384_0;
                    statePc = 385;
                    continue stateLoop;
                }
                case 385: {
                    if (var10_array.length + -1 <= var12) {
                        statePc = 391;
                    } else {
                        statePc = 386;
                    }
                    continue stateLoop;
                }
                case 386: {
                    stackIn_378_0 = var10_array[var12];
                    stackIn_387_0 = stackIn_378_0;
                    stackIn_378_1 = var10_array[1 + var12];
                    stackIn_387_1 = stackIn_378_1;
                    if (var17 != 0) {
                        statePc = 378;
                    } else {
                        statePc = 387;
                    }
                    continue stateLoop;
                }
                case 387: {
                    if (stackIn_387_0 > stackIn_387_1) {
                        statePc = 389;
                    } else {
                        statePc = 390;
                    }
                    continue stateLoop;
                }
                case 389: {
                    var10_array[1 + var12] = rd.b(var10_array[1 + var12], var10_array[var12]);
                    var10_array[var12] = rd.b(var10_array[var12], var10_array[1 + var12]);
                    var10_array[1 + var12] = rd.b(var10_array[1 + var12], var10_array[var12]);
                    var11 = 1;
                    statePc = 390;
                    continue stateLoop;
                }
                case 390: {
                    var12++;
                    if (var17 == 0) {
                        statePc = 385;
                    } else {
                        statePc = 391;
                    }
                    continue stateLoop;
                }
                case 391: {
                    if (var17 == 0) {
                        statePc = 382;
                    } else {
                        statePc = 392;
                    }
                    continue stateLoop;
                }
                case 392: {
                    stackIn_393_0 = 0;
                    statePc = 393;
                    continue stateLoop;
                }
                case 393: {
                    var12 = stackIn_393_0;
                    var13 = 1;
                    var14 = var10_array[0];
                    var15 = 0;
                    var16 = 0;
                    statePc = 394;
                    continue stateLoop;
                }
                case 394: {
                    if (var16 > var10_array.length) {
                        statePc = 411;
                    } else {
                        statePc = 395;
                    }
                    continue stateLoop;
                }
                case 395: {
                    stackIn_378_0 = var16 ^ -1;
                    stackIn_396_0 = stackIn_378_0;
                    stackIn_378_1 = var10_array.length ^ -1;
                    stackIn_396_1 = stackIn_378_1;
                    if (var17 != 0) {
                        statePc = 378;
                    } else {
                        statePc = 396;
                    }
                    continue stateLoop;
                }
                case 396: {
                    if (stackIn_396_0 <= stackIn_396_1) {
                        statePc = 403;
                    } else {
                        statePc = 397;
                    }
                    continue stateLoop;
                }
                case 397: {
                    if ((var14 ^ -1) != (var10_array[var16] ^ -1)) {
                        statePc = 403;
                    } else {
                        statePc = 400;
                    }
                    continue stateLoop;
                }
                case 400: {
                    var15++;
                    if (var17 == 0) {
                        statePc = 410;
                    } else {
                        statePc = 403;
                    }
                    continue stateLoop;
                }
                case 403: {
                    if ((var13 ^ -1) <= (var15 ^ -1)) {
                        statePc = 407;
                    } else {
                        statePc = 406;
                    }
                    continue stateLoop;
                }
                case 406: {
                    var12 = var14;
                    var13 = var15;
                    statePc = 407;
                    continue stateLoop;
                }
                case 407: {
                    if ((var10_array.length ^ -1) >= (var16 ^ -1)) {
                        statePc = 409;
                    } else {
                        statePc = 408;
                    }
                    continue stateLoop;
                }
                case 408: {
                    var14 = var10_array[var16];
                    statePc = 409;
                    continue stateLoop;
                }
                case 409: {
                    var15 = 1;
                    statePc = 410;
                    continue stateLoop;
                }
                case 410: {
                    var16++;
                    if (var17 == 0) {
                        statePc = 394;
                    } else {
                        statePc = 411;
                    }
                    continue stateLoop;
                }
                case 411: {
                    var16 = var12;
                    this.field_H.field_A.field_h[var6][var7] = hi.a(eg.a(-128, var8), var16);
                    statePc = 412;
                    continue stateLoop;
                }
                case 412: {
                    var7++;
                    if (var17 == 0) {
                        statePc = 377;
                    } else {
                        statePc = 413;
                    }
                    continue stateLoop;
                }
                case 413: {
                    var6++;
                    if (var17 == 0) {
                        statePc = 373;
                    } else {
                        statePc = 414;
                    }
                    continue stateLoop;
                }
                case 414: {
                    el.field_g = this.field_H.field_A.field_o;
                    this.field_ib = -1;
                    ql.field_j = -1.0f;
                    ek.field_I = this.field_H.field_A.field_c;
                    this.field_gb.c(this.field_G, 0);
                    stackIn_415_0 = 120;
                    statePc = 415;
                    continue stateLoop;
                }
                case 415: {
                    ha.a((byte) stackIn_415_0);
                    this.c(9091);
                    this.field_X = true;
                    statePc = 418;
                    continue stateLoop;
                }
                case 418: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void f(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_Y = null;
              field_x = null;
              if (param0) {
                break L1;
              } else {
                field_Y = (String) null;
                break L1;
              }
            }
            field_O = null;
            field_pb = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "hi.G(" + param0 + ')');
        }
    }

    final boolean g(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == this.field_H) {
                break L1;
              } else {
                if (null == this.field_H.field_A) {
                  break L1;
                } else {
                  L2: {
                    if ((this.field_q ^ -1) != -4) {
                      break L2;
                    } else {
                      if (0 == (this.field_h ^ -1)) {
                        stackIn_15_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (param0) {
                    L3: {
                      if (7 != this.field_q) {
                        break L3;
                      } else {
                        if (this.field_h != -1) {
                          break L3;
                        } else {
                          stackIn_24_0 = 0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                    if (-6 == (this.field_h ^ -1)) {
                      this.a(this.a(this.field_q, (byte) 101, -1), (byte) -99);
                      stackIn_29_0 = 1;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (0 != (this.field_h ^ -1)) {
                        this.a(this.a(this.field_q, (byte) 62, this.field_h + 1), (byte) -99);
                        stackIn_34_0 = 1;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        this.a(this.a(this.field_q - -1, (byte) 54, 0), (byte) -99);
                        stackIn_32_0 = 1;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  } else {
                    stackIn_18_0 = 1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            }
            this.a(this.a(0, (byte) -124, 0), (byte) -99);
            stackIn_7_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "hi.FA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_24_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_29_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_32_0 != 0;
                  } else {
                    return stackIn_34_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    private final void a(kd param0, byte param1) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if (!param0.i((byte) -126)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (bo.field_p[81]) {
                  break L1;
                } else {
                  this.c((byte) 25);
                  break L1;
                }
              }
              L2: {
                param0.r(param1 + -31338);
                if (param1 == -2) {
                  break L2;
                } else {
                  this.c(-111, -8, -118);
                  break L2;
                }
              }
              this.field_W.a(param0, (byte) -105);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("hi.TA(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void e(byte param0) {
        boolean stackIn_38_0 = false;
        Object stackIn_47_0 = null;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int stackIn_96_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_97_1 = 0;
        boolean stackIn_118_0 = false;
        int stackIn_126_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_37_0;
        boolean stackOut_117_0;
        fb var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3 = 0;
        fb var4 = null;
        kd var5 = null;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            if (bo.field_i) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                L2: {
                  L3: {
                    this.field_C = this.field_C - this.field_Z * ha.field_b;
                    this.field_c = this.field_c - ha.field_b;
                    if (0 != (this.field_ib ^ -1)) {
                      break L3;
                    } else {
                      L4: {
                        if ((ci.field_d ^ -1) == -2) {
                          break L4;
                        } else {
                          if (bo.field_p[83]) {
                            break L4;
                          } else {
                            break L2;
                          }
                        }
                      }
                      this.field_ib = 0;
                      ck.a(-1, 6836);
                      this.field_S.c(-106);
                      this.field_N = 0;
                      if (var6 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if ((this.field_ib ^ -1) != -1) {
                    break L2;
                  } else {
                    L5: {
                      L6: {
                        if ((ci.field_d ^ -1) == -2) {
                          break L6;
                        } else {
                          if (2 != ci.field_d) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (-3 != (ci.field_d ^ -1)) {
                          break L7;
                        } else {
                          if (!this.field_M) {
                            break L7;
                          } else {
                            if (!this.field_p) {
                              break L7;
                            } else {
                              if (!this.field_w) {
                                break L7;
                              } else {
                                var2 = (fb) ((Object) this.field_R.b((byte) 26));
                                L8: while (true) {
                                  if (null == var2) {
                                    break L7;
                                  } else {
                                    stackOut_37_0 = var2 instanceof kd;
                                    stackIn_126_0 = stackOut_37_0 ? 1 : 0;
                                    stackIn_38_0 = stackOut_37_0;
                                    if (var6 != 0) {
                                      break L1;
                                    } else {
                                      L9: {
                                        if (stackIn_38_0) {
                                          ((kd) ((Object) var2)).field_qb = false;
                                          break L9;
                                        } else {
                                          break L9;
                                        }
                                      }
                                      var2 = (fb) ((Object) this.field_R.a(false));
                                      if (var6 == 0) {
                                        continue L8;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      L10: {
                        this.field_M = true;
                        this.field_B = ha.field_b;
                        stackIn_47_0 = this;

                        if (ci.field_d != 1) {
                          stackIn_48_0 = this;
                          stackIn_48_1 = 0;
                          break L10;
                        } else {
                          stackIn_48_0 = this;
                          stackIn_48_1 = 1;
                          break L10;
                        }
                      }
                      ((hi) (this)).field_w = stackIn_48_1 != 0;
                      this.field_j = ei.field_K;
                      this.field_p = false;
                      if (var6 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                    L11: {
                      L12: {
                        if (!this.field_M) {
                          break L12;
                        } else {
                          if ((kc.field_R ^ -1) == -2) {
                            break L11;
                          } else {
                            if (-3 == (kc.field_R ^ -1)) {
                              break L11;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      if (this.field_M) {
                        L13: {
                          L14: {
                            if (this.field_p) {
                              break L14;
                            } else {
                              L15: {
                                if (!this.field_w) {
                                  break L15;
                                } else {
                                  this.a(96, ha.field_b, ei.field_K);
                                  if (var6 == 0) {
                                    break L13;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              this.d(ha.field_b, ei.field_K, 31098);
                              if (var6 == 0) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                          if (this.field_w) {
                            L16: {
                              if (bo.field_p[81]) {
                                break L16;
                              } else {
                                if (!bo.field_p[82]) {
                                  this.c((byte) 112);
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            this.a(this.field_S.b(ei.field_K, true), this.field_S.a(this.field_B, false), this.field_S.b(this.field_j, true), 47, this.field_S.a(ha.field_b, false));
                            if (this.field_W.a(false) > 0) {
                              ck.a(-3, 6836);
                              break L13;
                            } else {
                              break L13;
                            }
                          } else {
                            break L13;
                          }
                        }
                        this.field_p = false;
                        this.field_M = false;
                        if (var6 == 0) {
                          break L2;
                        } else {
                          break L11;
                        }
                      } else {
                        break L2;
                      }
                    }
                    L17: {
                      var2_int = ha.field_b - this.field_B;
                      var3 = ei.field_K - this.field_j;
                      if (!this.field_p) {
                        L18: {
                          stackIn_96_0 = Math.abs(var2_int) + Math.abs(var3);

                          if (!this.field_w) {
                            stackIn_97_0 = stackIn_96_0;
                            stackIn_97_1 = 5;
                            break L18;
                          } else {
                            stackIn_97_0 = stackIn_96_0;
                            stackIn_97_1 = 20;
                            break L18;
                          }
                        }
                        if (stackIn_97_0 <= stackIn_97_1) {
                          break L17;
                        } else {
                          this.field_p = true;
                          break L17;
                        }
                      } else {
                        break L17;
                      }
                    }
                    if (this.field_p) {
                      L19: {
                        if (this.field_w) {
                          break L19;
                        } else {
                          this.field_S.a((byte) -123, var2_int, var3);
                          this.field_B = ha.field_b;
                          this.field_j = ei.field_K;
                          if (var6 == 0) {
                            break L2;
                          } else {
                            break L19;
                          }
                        }
                      }
                      L20: {
                        this.field_Q.d((byte) -83);
                        if (bo.field_p[81]) {
                          break L20;
                        } else {
                          if (bo.field_p[82]) {
                            break L20;
                          } else {
                            this.c((byte) -112);
                            break L20;
                          }
                        }
                      }
                      var4 = (fb) ((Object) this.field_R.b((byte) 26));
                      L21: while (true) {
                        if (var4 == null) {
                          break L2;
                        } else {
                          stackOut_117_0 = var4 instanceof kd;
                          stackIn_126_0 = stackOut_117_0 ? 1 : 0;
                          stackIn_118_0 = stackOut_117_0;
                          if (var6 != 0) {
                            break L1;
                          } else {
                            L22: {
                              if (!stackIn_118_0) {
                                break L22;
                              } else {
                                var5 = (kd) ((Object) var4);
                                if (!var5.i((byte) -126)) {
                                  break L22;
                                } else {
                                  var5.field_qb = var5.a(this.field_S.a(this.field_B, false), this.field_S.a(ha.field_b, false), this.field_S.b(this.field_j, true), this.field_S.b(ei.field_K, true), false);
                                  break L22;
                                }
                              }
                            }
                            var4 = (fb) ((Object) this.field_R.a(false));
                            if (var6 == 0) {
                              continue L21;
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
                }
                stackIn_126_0 = -94 / ((-47 - param0) / 55);
                break L1;
              }
              var2_int = stackIn_126_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2_ref), "hi.V(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(boolean param0) {
        boolean stackIn_4_0 = false;
        ej stackIn_10_0 = null;
        ej stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        g stackIn_17_0 = null;
        g stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        vo stackIn_22_0 = null;
        vo stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        fb var2 = null;
        RuntimeException var2_ref = null;
        g var3 = null;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            dj.field_e.field_H.a(param0, -106);
            var2 = (fb) ((Object) this.field_R.b((byte) 26));
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var2) {
                    break L3;
                  } else {
                    stackOut_3_0 = var2 instanceof g;
                    stackIn_25_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (!stackIn_4_0) {
                          break L4;
                        } else {
                          L5: {
                            var3 = (g) ((Object) var2);
                            stackIn_10_0 = this.field_H;

                            if (param0) {
                              stackIn_11_0 = (ej) ((Object) stackIn_10_0);
                              stackIn_11_1 = 0;
                              break L5;
                            } else {
                              stackIn_11_0 = (ej) ((Object) stackIn_10_0);
                              stackIn_11_1 = 1;
                              break L5;
                            }
                          }
                          if (!((ej) (Object) stackIn_11_0).a(stackIn_11_1 != 0, var3.f(237239984), var3.a(true), false)) {
                            L6: {
                              stackIn_17_0 = (g) (var3);

                              if (var3 instanceof ah) {
                                stackIn_18_0 = (g) ((Object) stackIn_17_0);
                                stackIn_18_1 = 0;
                                break L6;
                              } else {
                                stackIn_18_0 = (g) ((Object) stackIn_17_0);
                                stackIn_18_1 = 4;
                                break L6;
                              }
                            }
                            ((g) (Object) stackIn_18_0).e(stackIn_18_1, -6904);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L7: {
                        stackIn_22_0 = this.field_R;

                        if (param0) {
                          stackIn_23_0 = (vo) ((Object) stackIn_22_0);
                          stackIn_23_1 = 0;
                          break L7;
                        } else {
                          stackIn_23_0 = (vo) ((Object) stackIn_22_0);
                          stackIn_23_1 = 1;
                          break L7;
                        }
                      }
                      var2 = (fb) ((Object) ((vo) (Object) stackIn_23_0).a(stackIn_23_1 != 0));
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackIn_25_0 = 6;
                break L2;
              }
              L8: {
                L9: {
                  L10: {
                    if (stackIn_25_0 != this.field_q) {
                      break L10;
                    } else {
                      if ((this.field_h ^ -1) == -1) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  if ((this.field_q ^ -1) != -8) {
                    break L8;
                  } else {
                    if ((this.field_h ^ -1) != -1) {
                      break L8;
                    } else {
                      if (this.field_H.a(false, 1056, 972, false)) {
                        this.a(232, 23, (byte) -23);
                        if (var4 == 0) {
                          break L8;
                        } else {
                          break L9;
                        }
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                if (0 != this.field_u[1]) {
                  break L8;
                } else {
                  if (-121 > (this.field_gb.j(-95) ^ -1)) {
                    break L8;
                  } else {
                    this.a(236, 19, (byte) -23);
                    break L8;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2_ref), "hi.E(" + param0 + ')');
        }
    }

    final void a(boolean param0, fb param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              this.field_n.a(param1.field_u, -1, param1, param1.field_B);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("hi.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean b(int param0, int param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_m.a(0, new ck(param3, param1, param0));
              if (param2) {
                break L1;
              } else {
                this.field_W = (ra) null;
                break L1;
              }
            }
            stackIn_4_0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var5), "hi.U(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final void c(boolean param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                this.field_p = false;
                break L1;
              }
            }
            L2: {
              if (po.w(13296)) {
                break L2;
              } else {
                if (!this.field_F) {
                  L3: {
                    stackIn_11_0 = 7 * this.field_q;

                    if ((this.field_h ^ -1) == 0) {
                      stackIn_12_0 = stackIn_11_0;
                      stackIn_12_1 = 6;
                      break L3;
                    } else {
                      stackIn_12_0 = stackIn_11_0;
                      stackIn_12_1 = this.field_h;
                      break L3;
                    }
                  }
                  L4: {
                    var2_int = stackIn_12_0 - -stackIn_12_1;
                    if (vi.field_a) {
                      var2_int += 10000;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    L6: {
                      if ((this.field_h ^ -1) == 0) {
                        break L6;
                      } else {
                        if (!this.field_gb.b(true)) {
                          stackIn_23_0 = 0;
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    stackIn_23_0 = 1;
                    break L5;
                  }
                  L7: {
                    var3 = stackIn_23_0;
                    if (var3 != 0) {
                      stackIn_27_0 = 1;
                      break L7;
                    } else {
                      stackIn_27_0 = 0;
                      break L7;
                    }
                  }
                  var4 = stackIn_27_0;
                  ql.a(this.field_gb.j(-106), 16, var4, var2_int);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "hi.VA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void d(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (-1 <= (this.field_G ^ -1)) {
                break L1;
              } else {
                if (this.field_F) {
                  break L1;
                } else {
                  if (null != wi.field_b) {
                    break L1;
                  } else {
                    wi.field_b = nd.a(this.field_I, this.field_K, this.field_bb + 42, new int[]{this.field_G}, 1159192543, 3, this.field_ab, this.field_g, this.field_bb + 42 ^ 65535);
                    break L1;
                  }
                }
              }
            }
            L2: {
              qm.field_b = this.field_bb;
              if (!param0) {
                break L2;
              } else {
                this.field_n = (mj) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "hi.LA(" + param0 + ')');
        }
    }

    hi(int param0, int param1) {
        RuntimeException runtimeException = null;
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ZombieDawn.field_J;
                    this.field_eb = 0;
                    this.field_c = 50340864;
                    this.field_C = -604090368;
                    this.field_F = false;
                    this.field_Z = -12;
                    this.field_ob = new vo();
                    this.field_r = 0;
                    this.field_P = 0;
                    this.field_nb = 0;
                    this.field_G = 0;
                    this.field_hb = 0;
                    this.field_z = 0;
                    this.field_b = new qj();
                    this.field_j = -1;
                    this.field_B = -1;
                    this.field_q = 0;
                    this.field_p = false;
                    this.field_o = 0;
                    this.field_w = true;
                    this.field_u = new int[3];
                    this.field_U = 0;
                    this.field_h = 0;
                    this.field_X = false;
                    this.field_kb = null;
                    this.field_M = false;
                    this.field_bb = 0;
                    this.field_J = new int[3];
                    this.field_cb = 0;
                    this.field_l = 0;
                    this.field_E = 0;
                    this.field_a = null;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        dj.field_e = (hi) (this);
                        this.field_I = 47646;
                        this.field_K = 15731621;
                        stackIn_3_0 = this;
                        stackIn_2_0 = stackIn_3_0;
                        stackIn_3_1 = param0 * 7;
                        stackIn_2_1 = stackIn_3_1;
                        if (-1 != param1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_4_0 = this;
                        stackIn_4_1 = stackIn_2_1;
                        stackIn_4_2 = 6;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = this;
                        stackIn_4_1 = stackIn_3_1;
                        stackIn_4_2 = param1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((hi) (this)).field_y = stackIn_4_1 - -stackIn_4_2;
                        this.field_g = 45364;
                        this.field_ab = 799342592 + this.field_g;
                        var3 = kg.field_g;
                        var4 = var3;
                        var5 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var5 >= 8) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4[var5] = 0;
                        var5++;
                        if (var6 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var6 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_13_0 = this;
                        stackIn_11_0 = stackIn_13_0;
                        if (lo.field_j < 2) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_14_0 = this;
                        stackIn_14_1 = 1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_14_0 = this;
                        stackIn_14_1 = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ((hi) (this)).field_A = stackIn_14_1 != 0;
                        eh.field_y = 3;
                        this.a(this.a(param0, (byte) -106, param1), (byte) -99);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw sh.a((Throwable) ((Object) runtimeException), "hi.<init>(" + param0 + ',' + param1 + ')');
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_pb = "Type your email address again to make sure it's correct";
        field_Y = "Please log in as a subscribing member to access this feature.";
    }
}
