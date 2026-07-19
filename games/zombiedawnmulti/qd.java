/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qd {
    static int field_N;
    static String field_K;
    static String field_v;
    static int field_e;
    static ja field_s;
    static String field_r;
    static String field_E;
    static String field_V;
    private th field_hb;
    private boolean field_ab;
    static boolean field_bb;
    private int field_h;
    private int field_Z;
    private int field_R;
    fh field_u;
    ko field_I;
    private qe field_G;
    int field_j;
    private uf field_J;
    nm field_k;
    int field_Y;
    private int field_p;
    private long field_a;
    int field_M;
    private th field_X;
    private th field_kb;
    private th field_cb;
    private int field_q;
    private th field_O;
    private ja field_L;
    lq field_Q;
    private gm field_x;
    private boolean field_lb;
    private int field_d;
    private boolean field_db;
    private wb field_mb;
    private int field_F;
    private ja field_y;
    th field_H;
    private ea field_S;
    private int field_fb;
    private th field_T;
    private lq field_c;
    private ja field_B;
    private th field_C;
    private boolean field_eb;
    private boolean field_w;
    private boolean field_f;
    private int field_n;
    private h field_o;
    private int field_l;
    private int field_ib;
    private boolean field_z;
    private int field_gb;
    private float field_D;
    private int field_A;
    private int field_jb;
    private int field_m;
    private int field_U;
    private jj field_b;
    long field_t;
    int field_W;
    private int field_g;
    private int[] field_i;

    private final void e(int param0) {
        boolean discarded$1 = false;
        int var2 = 0;
        float var3_float = 0.0f;
        int var3 = 0;
        id var3_ref_id = null;
        int var4 = 0;
        h var5 = null;
        id var5_ref = null;
        int var6_int = 0;
        wb var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        wb var11 = null;
        h var12 = null;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        boolean stackIn_41_0 = false;
        boolean stackIn_49_0 = false;
        int stackIn_54_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        boolean stackIn_69_0 = false;
        Object stackIn_76_0 = null;
        Object stackIn_77_0 = null;
        Object stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        int stackIn_86_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        boolean stackIn_104_0 = false;
        int stackIn_137_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        boolean stackOut_40_0 = false;
        boolean stackOut_48_0 = false;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        boolean stackOut_68_0 = false;
        Object stackOut_75_0 = null;
        Object stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        Object stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        int stackOut_85_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_87_1 = 0;
        int stackOut_86_0 = 0;
        int stackOut_86_1 = 0;
        boolean stackOut_103_0 = false;
        int stackOut_136_0 = 0;
        L0: {
          var10 = ZombieDawnMulti.field_E ? 1 : 0;
          var2 = 0;
          if (!this.field_z) {
            var2 = t.field_d;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          L2: {
            if (!iq.field_f) {
              break L2;
            } else {
              if (!sq.field_N) {
                break L2;
              } else {
                if (re.field_b) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          L3: {
            L4: {
              if (lc.field_m[26]) {
                break L4;
              } else {
                if (!lc.field_m[88]) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            var2++;
            break L3;
          }
          L5: {
            if (lc.field_m[27]) {
              break L5;
            } else {
              if (lc.field_m[87]) {
                break L5;
              } else {
                break L1;
              }
            }
          }
          var2--;
          break L1;
        }
        L6: {
          bk.field_g = false;
          if (0 != var2) {
            L7: {
              var3_float = (1.0f + (float)var2 * 0.03999999910593033f) * this.field_k.field_d;
              if (var3_float > 2.0f) {
                var3_float = 2.0f;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (1.0f <= var3_float) {
                break L8;
              } else {
                var3_float = 1.0f;
                break L8;
              }
            }
            if (var3_float == this.field_k.field_d) {
              break L6;
            } else {
              if ((float)this.field_u.field_r < 640.0f * var3_float) {
                break L6;
              } else {
                if (var3_float * 480.0f > (float)this.field_u.field_c) {
                  break L6;
                } else {
                  this.field_k.field_d = var3_float;
                  break L6;
                }
              }
            }
          } else {
            break L6;
          }
        }
        L9: {
          L10: {
            if (!this.c((byte) 124)) {
              break L10;
            } else {
              if (!gf.field_h) {
                var3 = this.field_k.a(bd.field_g, 2);
                var4 = this.field_k.a(true, bo.field_d);
                bk.field_g = true;
                var5 = (h) ((Object) this.field_c.c((byte) 97));
                L11: while (true) {
                  L12: {
                    if (var5 == null) {
                      break L12;
                    } else {
                      stackOut_31_0 = var5.field_I ^ -1;
                      stackOut_31_1 = this.field_M ^ -1;
                      stackIn_56_0 = stackOut_31_0;
                      stackIn_56_1 = stackOut_31_1;
                      stackIn_32_0 = stackOut_31_0;
                      stackIn_32_1 = stackOut_31_1;
                      if (var10 != 0) {
                        break L9;
                      } else {
                        L13: {
                          if (stackIn_32_0 == stackIn_32_1) {
                            break L13;
                          } else {
                            var6_int = var5.g(-73) - var3;
                            var7 = var5.h(126) - var4;
                            var8 = 350;
                            if (var7 * var7 + var6_int * var6_int < var8 * var8) {
                              bk.field_g = false;
                              if (var10 == 0) {
                                break L12;
                              } else {
                                break L13;
                              }
                            } else {
                              break L13;
                            }
                          }
                        }
                        var5 = (h) ((Object) this.field_c.b((byte) 102));
                        if (var10 == 0) {
                          continue L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                  }
                  if (!bk.field_g) {
                    break L10;
                  } else {
                    bk.field_g = false;
                    var5_ref = (id) ((Object) this.field_H.c(112));
                    L14: while (true) {
                      L15: {
                        L16: {
                          if (var5_ref == null) {
                            break L16;
                          } else {
                            stackOut_40_0 = var5_ref instanceof wb;
                            stackIn_49_0 = stackOut_40_0;
                            stackIn_41_0 = stackOut_40_0;
                            if (var10 != 0) {
                              break L15;
                            } else {
                              L17: {
                                if (!stackIn_41_0) {
                                  break L17;
                                } else {
                                  var11 = (wb) ((Object) var5_ref);
                                  if (var11.i((byte) -43)) {
                                    var7 = var11.g(88) - var3;
                                    var8 = -var4 + var11.h(120);
                                    var9 = var11.l(-113);
                                    if (var7 * var7 - -(var8 * var8) < var9 * var9) {
                                      bk.field_g = true;
                                      if (var10 == 0) {
                                        break L16;
                                      } else {
                                        break L17;
                                      }
                                    } else {
                                      break L17;
                                    }
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                              var5_ref = (id) ((Object) this.field_H.b(6));
                              if (var10 == 0) {
                                continue L14;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                        stackOut_48_0 = bk.field_g;
                        stackIn_49_0 = stackOut_48_0;
                        break L15;
                      }
                      if (!stackIn_49_0) {
                        L18: {
                          var12 = this.field_o;
                          var6_int = -var3 + var12.g(88);
                          var7 = -var4 + var12.h(123);
                          var8 = 350;
                          if ((var8 * var8 ^ -1) >= (var6_int * var6_int - -(var7 * var7) ^ -1)) {
                            stackOut_53_0 = 0;
                            stackIn_54_0 = stackOut_53_0;
                            break L18;
                          } else {
                            stackOut_52_0 = 1;
                            stackIn_54_0 = stackOut_52_0;
                            break L18;
                          }
                        }
                        bk.field_g = stackIn_54_0 != 0;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
              } else {
                break L10;
              }
            }
          }
          stackOut_55_0 = kd.field_b;
          stackOut_55_1 = 1;
          stackIn_56_0 = stackOut_55_0;
          stackIn_56_1 = stackOut_55_1;
          break L9;
        }
        L19: {
          L20: {
            L21: {
              L22: {
                if (stackIn_56_0 == stackIn_56_1) {
                  break L22;
                } else {
                  if (kd.field_b != 2) {
                    break L21;
                  } else {
                    break L22;
                  }
                }
              }
              if (!this.field_z) {
                L23: {
                  if ((kd.field_b ^ -1) != -3) {
                    break L23;
                  } else {
                    if (!this.field_db) {
                      break L23;
                    } else {
                      if (!this.field_eb) {
                        break L23;
                      } else {
                        if (this.field_w) {
                          var3_ref_id = (id) ((Object) this.field_H.c(83));
                          L24: while (true) {
                            if (var3_ref_id == null) {
                              break L23;
                            } else {
                              stackOut_68_0 = var3_ref_id instanceof wb;
                              stackIn_137_0 = stackOut_68_0 ? 1 : 0;
                              stackIn_69_0 = stackOut_68_0;
                              if (var10 != 0) {
                                break L19;
                              } else {
                                L25: {
                                  if (!stackIn_69_0) {
                                    break L25;
                                  } else {
                                    L26: {
                                      if (((wb) ((Object) var3_ref_id)).field_Lb == this.field_M) {
                                        break L26;
                                      } else {
                                        if (var10 == 0) {
                                          break L25;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                    ((wb) ((Object) var3_ref_id)).field_eb = false;
                                    break L25;
                                  }
                                }
                                var3_ref_id = (id) ((Object) this.field_H.b(6));
                                if (var10 == 0) {
                                  continue L24;
                                } else {
                                  break L23;
                                }
                              }
                            }
                          }
                        } else {
                          break L23;
                        }
                      }
                    }
                  }
                }
                L27: {
                  this.field_eb = false;
                  stackOut_75_0 = this;
                  stackIn_77_0 = stackOut_75_0;
                  stackIn_76_0 = stackOut_75_0;
                  if (1 != kd.field_b) {
                    stackOut_77_0 = this;
                    stackOut_77_1 = 0;
                    stackIn_78_0 = stackOut_77_0;
                    stackIn_78_1 = stackOut_77_1;
                    break L27;
                  } else {
                    stackOut_76_0 = this;
                    stackOut_76_1 = 1;
                    stackIn_78_0 = stackOut_76_0;
                    stackIn_78_1 = stackOut_76_1;
                    break L27;
                  }
                }
                ((qd) (this)).field_w = stackIn_78_1 != 0;
                this.field_p = bo.field_d;
                this.field_F = bd.field_g;
                this.field_db = true;
                if (var10 == 0) {
                  break L20;
                } else {
                  break L21;
                }
              } else {
                break L20;
              }
            }
            L28: {
              if (!this.field_db) {
                break L28;
              } else {
                L29: {
                  if ((pq.field_f ^ -1) == -2) {
                    break L29;
                  } else {
                    if (-3 != (pq.field_f ^ -1)) {
                      break L28;
                    } else {
                      break L29;
                    }
                  }
                }
                L30: {
                  var3 = bd.field_g + -this.field_F;
                  var4 = -this.field_p + bo.field_d;
                  if (!this.field_eb) {
                    L31: {
                      stackOut_85_0 = Math.abs(var3) - -Math.abs(var4) ^ -1;
                      stackIn_87_0 = stackOut_85_0;
                      stackIn_86_0 = stackOut_85_0;
                      if (this.field_w) {
                        stackOut_87_0 = stackIn_87_0;
                        stackOut_87_1 = 20;
                        stackIn_88_0 = stackOut_87_0;
                        stackIn_88_1 = stackOut_87_1;
                        break L31;
                      } else {
                        stackOut_86_0 = stackIn_86_0;
                        stackOut_86_1 = 5;
                        stackIn_88_0 = stackOut_86_0;
                        stackIn_88_1 = stackOut_86_1;
                        break L31;
                      }
                    }
                    if (stackIn_88_0 >= (stackIn_88_1 ^ -1)) {
                      break L30;
                    } else {
                      L32: {
                        if (!this.c((byte) 106)) {
                          break L32;
                        } else {
                          if (!this.field_w) {
                            break L32;
                          } else {
                            if (gf.field_h) {
                              break L32;
                            } else {
                              discarded$1 = this.field_I.h(1);
                              if (lc.field_m[81]) {
                                break L32;
                              } else {
                                if (!lc.field_m[82]) {
                                  this.b(-57);
                                  break L32;
                                } else {
                                  break L32;
                                }
                              }
                            }
                          }
                        }
                      }
                      this.field_eb = true;
                      break L30;
                    }
                  } else {
                    break L30;
                  }
                }
                L33: {
                  if (!this.field_eb) {
                    break L33;
                  } else {
                    L34: {
                      if (!this.c((byte) 101)) {
                        break L34;
                      } else {
                        if (!this.field_w) {
                          break L34;
                        } else {
                          if (gf.field_h) {
                            break L34;
                          } else {
                            var5_ref = (id) ((Object) this.field_H.c(69));
                            L35: while (true) {
                              L36: {
                                if (var5_ref == null) {
                                  break L36;
                                } else {
                                  stackOut_103_0 = var5_ref instanceof wb;
                                  stackIn_137_0 = stackOut_103_0 ? 1 : 0;
                                  stackIn_104_0 = stackOut_103_0;
                                  if (var10 != 0) {
                                    break L19;
                                  } else {
                                    L37: {
                                      if (!stackIn_104_0) {
                                        break L37;
                                      } else {
                                        L38: {
                                          var6 = (wb) ((Object) var5_ref);
                                          if (this.field_M == var6.field_Lb) {
                                            break L38;
                                          } else {
                                            if (var10 == 0) {
                                              break L37;
                                            } else {
                                              break L38;
                                            }
                                          }
                                        }
                                        var6.field_eb = var6.a(this.field_k.a(bd.field_g, 2), this.field_k.a(true, this.field_p), this.field_k.a(true, bo.field_d), 48, this.field_k.a(this.field_F, 2));
                                        break L37;
                                      }
                                    }
                                    var5_ref = (id) ((Object) this.field_H.b(6));
                                    if (var10 == 0) {
                                      continue L35;
                                    } else {
                                      break L36;
                                    }
                                  }
                                }
                              }
                              if (var10 == 0) {
                                break L33;
                              } else {
                                break L34;
                              }
                            }
                          }
                        }
                      }
                    }
                    L39: {
                      if (-1 != this.field_q) {
                        break L39;
                      } else {
                        this.field_q = this.field_F;
                        break L39;
                      }
                    }
                    this.field_k.a(var3, var4, 25992);
                    this.field_p = bo.field_d;
                    this.field_F = bd.field_g;
                    break L33;
                  }
                }
                if (var10 == 0) {
                  break L20;
                } else {
                  break L28;
                }
              }
            }
            if (this.field_db) {
              L40: {
                if (this.c((byte) 113)) {
                  L41: {
                    if (!this.field_eb) {
                      break L41;
                    } else {
                      if (this.field_w) {
                        L42: {
                          if (lc.field_m[81]) {
                            break L42;
                          } else {
                            if (!lc.field_m[82]) {
                              this.b(-75);
                              break L42;
                            } else {
                              break L42;
                            }
                          }
                        }
                        this.a(this.field_k.a(this.field_F, 2), this.field_k.a(true, this.field_p), this.field_k.a(true, bo.field_d), this.field_k.a(bd.field_g, 2), (byte) 5);
                        if (this.field_Q.a((byte) 98) > 0) {
                          iq.a(-3, (byte) 99);
                          if (var10 == 0) {
                            break L40;
                          } else {
                            break L41;
                          }
                        } else {
                          break L40;
                        }
                      } else {
                        break L40;
                      }
                    }
                  }
                  if (!gf.field_h) {
                    L43: {
                      if (this.field_w) {
                        break L43;
                      } else {
                        this.a(true, bo.field_d, bd.field_g);
                        if (var10 == 0) {
                          break L40;
                        } else {
                          break L43;
                        }
                      }
                    }
                    this.a(bo.field_d, (byte) -112, bd.field_g);
                    break L40;
                  } else {
                    break L40;
                  }
                } else {
                  break L40;
                }
              }
              this.field_eb = false;
              this.field_db = false;
              break L20;
            } else {
              break L20;
            }
          }
          stackOut_136_0 = pq.field_f ^ -1;
          stackIn_137_0 = stackOut_136_0;
          break L19;
        }
        L44: {
          if (stackIn_137_0 == -3) {
            break L44;
          } else {
            this.field_q = -1;
            break L44;
          }
        }
        var3 = -105 % ((-52 - param0) / 52);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        wb var8 = null;
        Exception var8_ref = null;
        wb var9 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var8 = op.field_m.a(param3, false);
              var9 = op.field_m.a(param1, false);
              if (var8 == null) {
                break L1;
              } else {
                if (var9 == null) {
                  break L1;
                } else {
                  var8.field_V = param4 << -1103276912;
                  var8.field_L = param2 << 89326544;
                  var9.field_L = param6 << 2037832816;
                  var9.field_V = param0 << 267078256;
                  var8.a(param5, var9);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = (Exception) (Object) decompiledCaughtException;
          return;
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int a(int param0, byte param1) {
        if (param1 < 107) {
            return 126;
        }
        return op.field_m.a(tg.field_e.field_f[param0], tg.field_e.field_d[param0], this.field_M, false);
    }

    final void a(byte param0, boolean param1) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        boolean discarded$6 = false;
        boolean discarded$7 = false;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_37_0 = 0;
        nm stackIn_50_0 = null;
        nm stackIn_51_0 = null;
        nm stackIn_52_0 = null;
        nm stackIn_53_0 = null;
        nm stackIn_54_0 = null;
        nm stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        nm stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        boolean stackIn_56_2 = false;
        nm stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        boolean stackIn_57_2 = false;
        nm stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        boolean stackIn_58_2 = false;
        nm stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        boolean stackIn_59_2 = false;
        nm stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        boolean stackIn_60_2 = false;
        int stackIn_60_3 = 0;
        nm stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        boolean stackIn_61_2 = false;
        int stackIn_61_3 = 0;
        nm stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        boolean stackIn_62_2 = false;
        int stackIn_62_3 = 0;
        nm stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        boolean stackIn_63_2 = false;
        int stackIn_63_3 = 0;
        nm stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        boolean stackIn_64_2 = false;
        int stackIn_64_3 = 0;
        nm stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        boolean stackIn_65_2 = false;
        int stackIn_65_3 = 0;
        int stackIn_65_4 = 0;
        nm stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        boolean stackIn_66_2 = false;
        int stackIn_66_3 = 0;
        int stackIn_66_4 = 0;
        int stackIn_66_5 = 0;
        nm stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        boolean stackIn_67_2 = false;
        int stackIn_67_3 = 0;
        int stackIn_67_4 = 0;
        int stackIn_67_5 = 0;
        nm stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        boolean stackIn_68_2 = false;
        int stackIn_68_3 = 0;
        int stackIn_68_4 = 0;
        int stackIn_68_5 = 0;
        nm stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        boolean stackIn_69_2 = false;
        int stackIn_69_3 = 0;
        int stackIn_69_4 = 0;
        int stackIn_69_5 = 0;
        nm stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        boolean stackIn_70_2 = false;
        int stackIn_70_3 = 0;
        int stackIn_70_4 = 0;
        int stackIn_70_5 = 0;
        int stackIn_70_6 = 0;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_36_0 = 0;
        nm stackOut_49_0 = null;
        nm stackOut_50_0 = null;
        nm stackOut_51_0 = null;
        nm stackOut_52_0 = null;
        nm stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        nm stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        nm stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        boolean stackOut_55_2 = false;
        nm stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        boolean stackOut_56_2 = false;
        nm stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        boolean stackOut_57_2 = false;
        nm stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        boolean stackOut_58_2 = false;
        int stackOut_58_3 = 0;
        nm stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        boolean stackOut_59_2 = false;
        int stackOut_59_3 = 0;
        nm stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        boolean stackOut_60_2 = false;
        int stackOut_60_3 = 0;
        nm stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        boolean stackOut_61_2 = false;
        int stackOut_61_3 = 0;
        nm stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        boolean stackOut_62_2 = false;
        int stackOut_62_3 = 0;
        nm stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        boolean stackOut_63_2 = false;
        int stackOut_63_3 = 0;
        int stackOut_63_4 = 0;
        nm stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        boolean stackOut_64_2 = false;
        int stackOut_64_3 = 0;
        int stackOut_64_4 = 0;
        nm stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        boolean stackOut_65_2 = false;
        int stackOut_65_3 = 0;
        int stackOut_65_4 = 0;
        int stackOut_65_5 = 0;
        nm stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        boolean stackOut_66_2 = false;
        int stackOut_66_3 = 0;
        int stackOut_66_4 = 0;
        int stackOut_66_5 = 0;
        nm stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        boolean stackOut_67_2 = false;
        int stackOut_67_3 = 0;
        int stackOut_67_4 = 0;
        int stackOut_67_5 = 0;
        nm stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        boolean stackOut_68_2 = false;
        int stackOut_68_3 = 0;
        int stackOut_68_4 = 0;
        int stackOut_68_5 = 0;
        int stackOut_68_6 = 0;
        nm stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        boolean stackOut_69_2 = false;
        int stackOut_69_3 = 0;
        int stackOut_69_4 = 0;
        int stackOut_69_5 = 0;
        int stackOut_69_6 = 0;
        int stackOut_102_0 = 0;
        int stackOut_102_1 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = ZombieDawnMulti.field_E ? 1 : 0;
                    var3 = 0;
                    var4 = this.field_k.field_k;
                    var5 = this.field_k.field_g;
                    var6 = this.field_k.field_d;
                    var7 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var7 >= op.field_m.field_a.length) {
                        statePc = 8;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackOut_2_0 = op.field_m.field_a[var7];
                    stackIn_9_0 = stackOut_2_0;
                    stackIn_3_0 = stackOut_2_0;
                    if (var14 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (stackIn_3_0 <= 0) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    op.field_m.field_a[var7] = op.field_m.field_a[var7] - 1;
                    if (var14 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    op.field_m.field_a[var7] = 0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    var7++;
                    if (var14 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var7 = stackIn_9_0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (op.field_m.field_z.length <= var7) {
                        statePc = 17;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackOut_11_0 = 0;
                    stackOut_11_1 = op.field_m.field_z[var7];
                    stackIn_18_0 = stackOut_11_0;
                    stackIn_18_1 = stackOut_11_1;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    if (var14 != 0) {
                        statePc = 18;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (stackIn_12_0 >= stackIn_12_1) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    op.field_m.field_z[var7] = op.field_m.field_z[var7] - 1;
                    if (var14 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    op.field_m.field_z[var7] = 0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    var7++;
                    if (var14 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackOut_17_0 = 2;
                    stackOut_17_1 = ll.field_k.field_k;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (stackIn_18_0 != stackIn_18_1) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackOut_19_0 = 1;
                    stackIn_21_0 = stackOut_19_0;
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    stackOut_20_0 = 16;
                    stackIn_21_0 = stackOut_20_0;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    ke.field_b = stackIn_21_0;
                    if (!gf.field_h) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    this.e(-106);
                    if (var14 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (!this.c((byte) 104)) {
                        statePc = 28;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (!param1) {
                        statePc = 30;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    this.d(15);
                    this.e(107);
                    if (var14 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (op.field_m.field_l != 0) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    this.e(-121);
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    this.field_J.a(-29987);
                    if (!this.field_eb) {
                        statePc = 33;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    this.field_I.a(-1, -1, (byte) 101);
                    if (var14 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    this.field_I.a(bo.field_d, bd.field_g, (byte) 113);
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (!er.a(-802)) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    stackOut_35_0 = 1;
                    stackIn_37_0 = stackOut_35_0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 36: {
                    stackOut_36_0 = 0;
                    stackIn_37_0 = stackOut_36_0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    var3 = stackIn_37_0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    var7 = this.field_k.field_k;
                    var8 = this.field_k.field_g;
                    if (this.field_k.field_f) {
                        statePc = 42;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (!this.field_f) {
                        statePc = 41;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 41: {
                    this.field_k.a(this.field_h, (byte) -86, this.field_R);
                    this.field_f = true;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (param0 > 113) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    return;
                }
                case 44: {
                    if (!param1) {
                        statePc = 73;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (!iq.field_f) {
                        statePc = 49;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (!sq.field_N) {
                        statePc = 49;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (re.field_b) {
                        statePc = 71;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    stackOut_49_0 = this.field_k;
                    stackIn_53_0 = stackOut_49_0;
                    stackIn_50_0 = stackOut_49_0;
                    if (lc.field_m[96]) {
                        statePc = 53;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    stackOut_50_0 = (nm) ((Object) stackIn_50_0);
                    stackIn_54_0 = stackOut_50_0;
                    stackIn_51_0 = stackOut_50_0;
                    if (!lc.field_m[field_e]) {
                        statePc = 54;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    stackOut_51_0 = (nm) ((Object) stackIn_51_0);
                    stackIn_54_0 = stackOut_51_0;
                    stackIn_52_0 = stackOut_51_0;
                    if (lc.field_m[82]) {
                        statePc = 54;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    stackOut_52_0 = (nm) ((Object) stackIn_52_0);
                    stackIn_53_0 = stackOut_52_0;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    stackOut_53_0 = (nm) ((Object) stackIn_53_0);
                    stackOut_53_1 = 1;
                    stackIn_55_0 = stackOut_53_0;
                    stackIn_55_1 = stackOut_53_1;
                    statePc = 55;
                    continue stateLoop;
                }
                case 54: {
                    stackOut_54_0 = (nm) ((Object) stackIn_54_0);
                    stackOut_54_1 = 0;
                    stackIn_55_0 = stackOut_54_0;
                    stackIn_55_1 = stackOut_54_1;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    stackOut_55_0 = (nm) ((Object) stackIn_55_0);
                    stackOut_55_1 = stackIn_55_1;
                    stackOut_55_2 = lc.field_m[81];
                    stackIn_58_0 = stackOut_55_0;
                    stackIn_58_1 = stackOut_55_1;
                    stackIn_58_2 = stackOut_55_2;
                    stackIn_56_0 = stackOut_55_0;
                    stackIn_56_1 = stackOut_55_1;
                    stackIn_56_2 = stackOut_55_2;
                    if (lc.field_m[98]) {
                        statePc = 58;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    stackOut_56_0 = (nm) ((Object) stackIn_56_0);
                    stackOut_56_1 = stackIn_56_1;
                    stackOut_56_2 = stackIn_56_2;
                    stackIn_59_0 = stackOut_56_0;
                    stackIn_59_1 = stackOut_56_1;
                    stackIn_59_2 = stackOut_56_2;
                    stackIn_57_0 = stackOut_56_0;
                    stackIn_57_1 = stackOut_56_1;
                    stackIn_57_2 = stackOut_56_2;
                    if (!lc.field_m[rp.field_d]) {
                        statePc = 59;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    stackOut_57_0 = (nm) ((Object) stackIn_57_0);
                    stackOut_57_1 = stackIn_57_1;
                    stackOut_57_2 = stackIn_57_2;
                    stackIn_58_0 = stackOut_57_0;
                    stackIn_58_1 = stackOut_57_1;
                    stackIn_58_2 = stackOut_57_2;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    stackOut_58_0 = (nm) ((Object) stackIn_58_0);
                    stackOut_58_1 = stackIn_58_1;
                    stackOut_58_2 = stackIn_58_2;
                    stackOut_58_3 = 1;
                    stackIn_60_0 = stackOut_58_0;
                    stackIn_60_1 = stackOut_58_1;
                    stackIn_60_2 = stackOut_58_2;
                    stackIn_60_3 = stackOut_58_3;
                    statePc = 60;
                    continue stateLoop;
                }
                case 59: {
                    stackOut_59_0 = (nm) ((Object) stackIn_59_0);
                    stackOut_59_1 = stackIn_59_1;
                    stackOut_59_2 = stackIn_59_2;
                    stackOut_59_3 = 0;
                    stackIn_60_0 = stackOut_59_0;
                    stackIn_60_1 = stackOut_59_1;
                    stackIn_60_2 = stackOut_59_2;
                    stackIn_60_3 = stackOut_59_3;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    stackOut_60_0 = (nm) ((Object) stackIn_60_0);
                    stackOut_60_1 = stackIn_60_1;
                    stackOut_60_2 = stackIn_60_2;
                    stackOut_60_3 = stackIn_60_3;
                    stackIn_63_0 = stackOut_60_0;
                    stackIn_63_1 = stackOut_60_1;
                    stackIn_63_2 = stackOut_60_2;
                    stackIn_63_3 = stackOut_60_3;
                    stackIn_61_0 = stackOut_60_0;
                    stackIn_61_1 = stackOut_60_1;
                    stackIn_61_2 = stackOut_60_2;
                    stackIn_61_3 = stackOut_60_3;
                    if (lc.field_m[97]) {
                        statePc = 63;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    stackOut_61_0 = (nm) ((Object) stackIn_61_0);
                    stackOut_61_1 = stackIn_61_1;
                    stackOut_61_2 = stackIn_61_2;
                    stackOut_61_3 = stackIn_61_3;
                    stackIn_64_0 = stackOut_61_0;
                    stackIn_64_1 = stackOut_61_1;
                    stackIn_64_2 = stackOut_61_2;
                    stackIn_64_3 = stackOut_61_3;
                    stackIn_62_0 = stackOut_61_0;
                    stackIn_62_1 = stackOut_61_1;
                    stackIn_62_2 = stackOut_61_2;
                    stackIn_62_3 = stackOut_61_3;
                    if (!lc.field_m[bd.field_d]) {
                        statePc = 64;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    stackOut_62_0 = (nm) ((Object) stackIn_62_0);
                    stackOut_62_1 = stackIn_62_1;
                    stackOut_62_2 = stackIn_62_2;
                    stackOut_62_3 = stackIn_62_3;
                    stackIn_63_0 = stackOut_62_0;
                    stackIn_63_1 = stackOut_62_1;
                    stackIn_63_2 = stackOut_62_2;
                    stackIn_63_3 = stackOut_62_3;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    stackOut_63_0 = (nm) ((Object) stackIn_63_0);
                    stackOut_63_1 = stackIn_63_1;
                    stackOut_63_2 = stackIn_63_2;
                    stackOut_63_3 = stackIn_63_3;
                    stackOut_63_4 = 1;
                    stackIn_65_0 = stackOut_63_0;
                    stackIn_65_1 = stackOut_63_1;
                    stackIn_65_2 = stackOut_63_2;
                    stackIn_65_3 = stackOut_63_3;
                    stackIn_65_4 = stackOut_63_4;
                    statePc = 65;
                    continue stateLoop;
                }
                case 64: {
                    stackOut_64_0 = (nm) ((Object) stackIn_64_0);
                    stackOut_64_1 = stackIn_64_1;
                    stackOut_64_2 = stackIn_64_2;
                    stackOut_64_3 = stackIn_64_3;
                    stackOut_64_4 = 0;
                    stackIn_65_0 = stackOut_64_0;
                    stackIn_65_1 = stackOut_64_1;
                    stackIn_65_2 = stackOut_64_2;
                    stackIn_65_3 = stackOut_64_3;
                    stackIn_65_4 = stackOut_64_4;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    stackOut_65_0 = (nm) ((Object) stackIn_65_0);
                    stackOut_65_1 = stackIn_65_1;
                    stackOut_65_2 = stackIn_65_2;
                    stackOut_65_3 = stackIn_65_3;
                    stackOut_65_4 = stackIn_65_4;
                    stackOut_65_5 = -91;
                    stackIn_68_0 = stackOut_65_0;
                    stackIn_68_1 = stackOut_65_1;
                    stackIn_68_2 = stackOut_65_2;
                    stackIn_68_3 = stackOut_65_3;
                    stackIn_68_4 = stackOut_65_4;
                    stackIn_68_5 = stackOut_65_5;
                    stackIn_66_0 = stackOut_65_0;
                    stackIn_66_1 = stackOut_65_1;
                    stackIn_66_2 = stackOut_65_2;
                    stackIn_66_3 = stackOut_65_3;
                    stackIn_66_4 = stackOut_65_4;
                    stackIn_66_5 = stackOut_65_5;
                    if (lc.field_m[99]) {
                        statePc = 68;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    stackOut_66_0 = (nm) ((Object) stackIn_66_0);
                    stackOut_66_1 = stackIn_66_1;
                    stackOut_66_2 = stackIn_66_2;
                    stackOut_66_3 = stackIn_66_3;
                    stackOut_66_4 = stackIn_66_4;
                    stackOut_66_5 = stackIn_66_5;
                    stackIn_69_0 = stackOut_66_0;
                    stackIn_69_1 = stackOut_66_1;
                    stackIn_69_2 = stackOut_66_2;
                    stackIn_69_3 = stackOut_66_3;
                    stackIn_69_4 = stackOut_66_4;
                    stackIn_69_5 = stackOut_66_5;
                    stackIn_67_0 = stackOut_66_0;
                    stackIn_67_1 = stackOut_66_1;
                    stackIn_67_2 = stackOut_66_2;
                    stackIn_67_3 = stackOut_66_3;
                    stackIn_67_4 = stackOut_66_4;
                    stackIn_67_5 = stackOut_66_5;
                    if (!lc.field_m[uq.field_g]) {
                        statePc = 69;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    stackOut_67_0 = (nm) ((Object) stackIn_67_0);
                    stackOut_67_1 = stackIn_67_1;
                    stackOut_67_2 = stackIn_67_2;
                    stackOut_67_3 = stackIn_67_3;
                    stackOut_67_4 = stackIn_67_4;
                    stackOut_67_5 = stackIn_67_5;
                    stackIn_68_0 = stackOut_67_0;
                    stackIn_68_1 = stackOut_67_1;
                    stackIn_68_2 = stackOut_67_2;
                    stackIn_68_3 = stackOut_67_3;
                    stackIn_68_4 = stackOut_67_4;
                    stackIn_68_5 = stackOut_67_5;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    stackOut_68_0 = (nm) ((Object) stackIn_68_0);
                    stackOut_68_1 = stackIn_68_1;
                    stackOut_68_2 = stackIn_68_2;
                    stackOut_68_3 = stackIn_68_3;
                    stackOut_68_4 = stackIn_68_4;
                    stackOut_68_5 = stackIn_68_5;
                    stackOut_68_6 = 1;
                    stackIn_70_0 = stackOut_68_0;
                    stackIn_70_1 = stackOut_68_1;
                    stackIn_70_2 = stackOut_68_2;
                    stackIn_70_3 = stackOut_68_3;
                    stackIn_70_4 = stackOut_68_4;
                    stackIn_70_5 = stackOut_68_5;
                    stackIn_70_6 = stackOut_68_6;
                    statePc = 70;
                    continue stateLoop;
                }
                case 69: {
                    stackOut_69_0 = (nm) ((Object) stackIn_69_0);
                    stackOut_69_1 = stackIn_69_1;
                    stackOut_69_2 = stackIn_69_2;
                    stackOut_69_3 = stackIn_69_3;
                    stackOut_69_4 = stackIn_69_4;
                    stackOut_69_5 = stackIn_69_5;
                    stackOut_69_6 = 0;
                    stackIn_70_0 = stackOut_69_0;
                    stackIn_70_1 = stackOut_69_1;
                    stackIn_70_2 = stackOut_69_2;
                    stackIn_70_3 = stackOut_69_3;
                    stackIn_70_4 = stackOut_69_4;
                    stackIn_70_5 = stackOut_69_5;
                    stackIn_70_6 = stackOut_69_6;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    ((nm) (Object) stackIn_70_0).a(stackIn_70_1 != 0, stackIn_70_2, stackIn_70_3 != 0, stackIn_70_4 != 0, (byte) stackIn_70_5, stackIn_70_6 != 0);
                    if (var14 == 0) {
                        statePc = 74;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    this.field_k.a(lc.field_m[96], lc.field_m[81], lc.field_m[98], lc.field_m[97], (byte) -91, lc.field_m[99]);
                    if (var14 == 0) {
                        statePc = 74;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    this.field_k.a(false, false, false, false, (byte) -91, false);
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if (0 >= this.field_l) {
                        statePc = 81;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (this.field_l < 640) {
                        statePc = 80;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if ((op.field_m.field_l ^ -1) != -1) {
                        statePc = 80;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if (-1 != (op.field_m.field_l ^ -1)) {
                        statePc = 81;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if (0.95 >= (double)this.field_k.field_t) {
                        statePc = 81;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    this.field_l = this.field_l - 15;
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    if (!gf.field_h) {
                        statePc = 83;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (!this.field_eb) {
                        statePc = 89;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (1 == pq.field_f) {
                        statePc = 86;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 86: {
                    this.field_p = this.field_p - (this.field_k.field_g - var8);
                    this.field_F = this.field_F - (this.field_k.field_k + -var7);
                    if (-1 == this.field_F) {
                        statePc = 88;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 88: {
                    this.field_F = this.field_F - 1;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    if (var3 != 0) {
                        statePc = 113;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    var9 = bl.a((byte) 87);
                    if (-1L != (this.field_a ^ -1L)) {
                        statePc = 92;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    this.field_a = var9 - 20L;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    var11 = this.field_W - -(int)((-this.field_t + var9) / 20L);
                    if (!df.field_I) {
                        statePc = 94;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    var11 = op.field_m.field_H;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    var12 = var11 + -op.field_m.field_H;
                    var13 = 0;
                    if (-1 >= (var12 ^ -1)) {
                        statePc = 100;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    fieldTemp$4 = this.field_U - 1;
                    this.field_U = this.field_U - 1;
                    if (fieldTemp$4 < 0) {
                        statePc = 98;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    this.field_a = this.field_a + 20L;
                    vd.a(false, 20L);
                    if (var14 == 0) {
                        statePc = 109;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    this.a((byte) -91);
                    this.field_U = -var12 / 8 + 1;
                    this.field_a = this.field_a + 20L;
                    if (var14 == 0) {
                        statePc = 109;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    if (-21L < (var9 - this.field_a ^ -1L)) {
                        statePc = 102;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (var11 == op.field_m.field_H) {
                        statePc = 104;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    stackOut_102_0 = var11;
                    stackOut_102_1 = op.field_m.field_H;
                    stackIn_103_0 = stackOut_102_0;
                    stackIn_103_1 = stackOut_102_1;
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    if (stackIn_103_0 <= stackIn_103_1) {
                        statePc = 107;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    var13++;
                    this.a((byte) 51);
                    this.field_a = this.field_a + 20L;
                    fieldTemp$5 = this.field_gb - 1;
                    this.field_gb = this.field_gb - 1;
                    if (-1 < (fieldTemp$5 ^ -1)) {
                        statePc = 100;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    stackOut_105_0 = this.field_g;
                    stackOut_105_1 = var13;
                    stackIn_103_0 = stackOut_105_0;
                    stackIn_103_1 = stackOut_105_1;
                    stackIn_106_0 = stackOut_105_0;
                    stackIn_106_1 = stackOut_105_1;
                    if (var14 != 0) {
                        statePc = 103;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    if (stackIn_106_0 >= stackIn_106_1) {
                        statePc = 100;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (-2 <= (var13 ^ -1)) {
                        statePc = 109;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    this.field_gb = this.field_m;
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    if (!this.c((byte) 120)) {
                        statePc = 112;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    this.field_G.b((byte) 105, -op.field_m.field_H + op.field_m.field_C);
                    if (var14 == 0) {
                        statePc = 113;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    this.field_G.c(0);
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    if (!pp.field_n) {
                        statePc = 120;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    if (!this.field_k.field_f) {
                        statePc = 116;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    this.b(true);
                    g.a(this.field_H);
                    discarded$6 = this.a(param1, 15978);
                    statePc = 121;
                    continue stateLoop;
                }
                case 116: {
                    this.field_A = this.field_A + Math.abs(-var4 + this.field_k.field_k);
                    this.field_jb = this.field_jb + Math.abs(this.field_k.field_g + -var5);
                    this.field_D = this.field_D + Math.abs(-var6 + this.field_k.field_d);
                    if (-1101 <= (this.field_A - -this.field_jb ^ -1)) {
                        statePc = 118;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    iq.a(-8, (byte) 99);
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    if (this.field_D <= 2.200000047683716f) {
                        statePc = 120;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    iq.a(-7, (byte) 99);
                    statePc = 120;
                    continue stateLoop;
                }
                case 120: {
                    this.b(true);
                    g.a(this.field_H);
                    discarded$7 = this.a(param1, 15978);
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(byte param0, int param1, int param2) {
        int[][] dupTemp$5 = null;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int var4 = 0;
        lq var5 = null;
        wb var6 = null;
        int var6_int = 0;
        th var7_ref_th = null;
        int var7 = 0;
        int[][] var8 = null;
        wb var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15_int = 0;
        wb var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int[][] var21 = null;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_73_0 = 0;
        int stackIn_92_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        int stackOut_63_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
        int stackOut_72_0 = 0;
        int stackOut_91_0 = 0;
        L0: {
          L1: {
            var20 = ZombieDawnMulti.field_E ? 1 : 0;
            this.field_J.a(0, param2, param1);
            if (-2 <= (this.field_Q.a((byte) 98) ^ -1)) {
              break L1;
            } else {
              param2 = po.d(12949) + -(param2 % 24) + param2;
              param1 = po.d(12949) + (-(param1 % 24) + param1);
              if (var20 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param1 += 6;
          break L0;
        }
        var4 = 1;
        var5 = new lq();
        var6 = (wb) ((Object) this.field_Q.c((byte) 121));
        L2: while (true) {
          L3: {
            L4: {
              if (var6 == null) {
                break L4;
              } else {
                var7_ref_th = this.field_u.b(var6.g(124), param1, var6.h(119), param2, 8760);
                if (var20 != 0) {
                  break L3;
                } else {
                  L5: {
                    L6: {
                      if (var7_ref_th != null) {
                        break L6;
                      } else {
                        var6.a(-4564);
                        var5.a(29664, var6);
                        if (var20 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var4 = 0;
                    break L5;
                  }
                  var6 = (wb) ((Object) this.field_Q.b((byte) 100));
                  if (var20 == 0) {
                    continue L2;
                  } else {
                    break L4;
                  }
                }
              }
            }
            if (var4 == 0) {
              this.field_J.b(true);
              break L3;
            } else {
              this.field_Q = var5;
              this.field_J.a(true);
              return;
            }
          }
          L7: {
            L8: {
              if (!this.field_o.a(param1, param2, (byte) -69)) {
                var6_int = param2 / 24;
                var7 = param1 / 24;
                dupTemp$5 = this.field_u.d(114);
                var21 = dupTemp$5;
                var8 = dupTemp$5;
                var21[var7][var6_int] = 1;
                var9 = 2;
                var10 = 1;
                var11 = this.field_Q.a((byte) 98);
                var12 = -1;
                var13 = -1;
                L9: while (true) {
                  L10: {
                    L11: {
                      if (var11 < var9) {
                        break L11;
                      } else {
                        var14 = -1;
                        var15_int = -1;
                        stackOut_26_0 = 0;
                        stackIn_57_0 = stackOut_26_0;
                        stackIn_27_0 = stackOut_26_0;
                        if (var20 != 0) {
                          break L10;
                        } else {
                          var16 = stackIn_27_0;
                          L12: while (true) {
                            stackOut_28_0 = var21.length ^ -1;
                            stackOut_28_1 = var16 ^ -1;
                            stackIn_29_0 = stackOut_28_0;
                            stackIn_29_1 = stackOut_28_1;
                            L13: while (true) {
                              L14: {
                                L15: {
                                  if (stackIn_29_0 >= stackIn_29_1) {
                                    break L15;
                                  } else {
                                    stackOut_30_0 = 0;
                                    stackIn_40_0 = stackOut_30_0;
                                    stackIn_31_0 = stackOut_30_0;
                                    if (var20 != 0) {
                                      break L14;
                                    } else {
                                      var17 = stackIn_31_0;
                                      L16: while (true) {
                                        L17: {
                                          if (var21[0].length <= var17) {
                                            break L17;
                                          } else {
                                            stackOut_33_0 = var10 ^ -1;
                                            stackOut_33_1 = var21[var16][var17] ^ -1;
                                            stackIn_29_0 = stackOut_33_0;
                                            stackIn_29_1 = stackOut_33_1;
                                            stackIn_34_0 = stackOut_33_0;
                                            stackIn_34_1 = stackOut_33_1;
                                            if (var20 != 0) {
                                              continue L13;
                                            } else {
                                              L18: {
                                                if (stackIn_34_0 == stackIn_34_1) {
                                                  var14 = var17;
                                                  var15_int = var16;
                                                  break L18;
                                                } else {
                                                  break L18;
                                                }
                                              }
                                              var17++;
                                              if (var20 == 0) {
                                                continue L16;
                                              } else {
                                                break L17;
                                              }
                                            }
                                          }
                                        }
                                        var16++;
                                        if (var20 == 0) {
                                          continue L12;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_39_0 = var14;
                                stackIn_40_0 = stackOut_39_0;
                                break L14;
                              }
                              L19: {
                                if (stackIn_40_0 != -1) {
                                  break L19;
                                } else {
                                  if (0 != (var15_int ^ -1)) {
                                    break L19;
                                  } else {
                                    this.field_J.a(true);
                                    return;
                                  }
                                }
                              }
                              L20: {
                                if ((jk.a((byte) 123, var14, var21, var15_int - 1) ^ -1) != -1) {
                                  break L20;
                                } else {
                                  incrementValue$6 = var9;
                                  var9++;
                                  var21[var15_int - 1][var14] = incrementValue$6;
                                  break L20;
                                }
                              }
                              L21: {
                                if (jk.a((byte) -82, var14 - -1, var21, var15_int) == 0) {
                                  incrementValue$7 = var9;
                                  var9++;
                                  var21[var15_int][var14 + 1] = incrementValue$7;
                                  break L21;
                                } else {
                                  break L21;
                                }
                              }
                              L22: {
                                if (-1 != (jk.a((byte) -97, var14, var21, 1 + var15_int) ^ -1)) {
                                  break L22;
                                } else {
                                  incrementValue$8 = var9;
                                  var9++;
                                  var21[1 + var15_int][var14] = incrementValue$8;
                                  break L22;
                                }
                              }
                              L23: {
                                if (jk.a((byte) 25, var14 + -1, var21, var15_int) != 0) {
                                  break L23;
                                } else {
                                  incrementValue$9 = var9;
                                  var9++;
                                  var21[var15_int][var14 + -1] = incrementValue$9;
                                  break L23;
                                }
                              }
                              L24: {
                                var10++;
                                if (!this.field_o.b(var14, var15_int, 19024)) {
                                  break L24;
                                } else {
                                  var13 = var15_int;
                                  var12 = var14;
                                  if (var20 == 0) {
                                    break L11;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                              if (var20 == 0) {
                                continue L9;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_56_0 = 0;
                    stackIn_57_0 = stackOut_56_0;
                    break L10;
                  }
                  var14 = stackIn_57_0;
                  var15 = (wb) ((Object) this.field_Q.c((byte) 109));
                  L25: while (true) {
                    L26: {
                      L27: {
                        if (var15 == null) {
                          break L27;
                        } else {
                          var14++;
                          var16 = -1;
                          var17 = -1;
                          stackOut_59_0 = 0;
                          stackIn_92_0 = stackOut_59_0;
                          stackIn_60_0 = stackOut_59_0;
                          if (var20 != 0) {
                            break L26;
                          } else {
                            var18 = stackIn_60_0;
                            L28: while (true) {
                              stackOut_61_0 = var21.length;
                              stackOut_61_1 = var18;
                              stackIn_62_0 = stackOut_61_0;
                              stackIn_62_1 = stackOut_61_1;
                              L29: while (true) {
                                L30: {
                                  L31: {
                                    if (stackIn_62_0 <= stackIn_62_1) {
                                      break L31;
                                    } else {
                                      stackOut_63_0 = 0;
                                      stackIn_73_0 = stackOut_63_0;
                                      stackIn_64_0 = stackOut_63_0;
                                      if (var20 != 0) {
                                        break L30;
                                      } else {
                                        var19 = stackIn_64_0;
                                        L32: while (true) {
                                          L33: {
                                            if ((var19 ^ -1) <= (var21[0].length ^ -1)) {
                                              break L33;
                                            } else {
                                              stackOut_66_0 = var14;
                                              stackOut_66_1 = var21[var18][var19];
                                              stackIn_62_0 = stackOut_66_0;
                                              stackIn_62_1 = stackOut_66_1;
                                              stackIn_67_0 = stackOut_66_0;
                                              stackIn_67_1 = stackOut_66_1;
                                              if (var20 != 0) {
                                                continue L29;
                                              } else {
                                                L34: {
                                                  if (stackIn_67_0 == stackIn_67_1) {
                                                    var17 = var18;
                                                    var16 = var19;
                                                    break L34;
                                                  } else {
                                                    break L34;
                                                  }
                                                }
                                                var19++;
                                                if (var20 == 0) {
                                                  continue L32;
                                                } else {
                                                  break L33;
                                                }
                                              }
                                            }
                                          }
                                          var18++;
                                          if (var20 == 0) {
                                            continue L28;
                                          } else {
                                            break L31;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_72_0 = 0;
                                  stackIn_73_0 = stackOut_72_0;
                                  break L30;
                                }
                                L35: {
                                  if (stackIn_73_0 != (var16 ^ -1)) {
                                    break L35;
                                  } else {
                                    if (var17 != -1) {
                                      break L35;
                                    } else {
                                      var16 = var12;
                                      var17 = var13;
                                      break L35;
                                    }
                                  }
                                }
                                if (-1 != var16) {
                                  var18 = po.d(12949) + 24 * var16;
                                  var19 = 24 * var17 + po.d(12949);
                                  var15.a((byte) 95, 100 + op.field_m.field_H, var18, var19);
                                  wd.a(var15.field_y, op.field_m.field_H, ma.field_a, var18, 61, var19);
                                  var15 = (wb) ((Object) this.field_Q.b((byte) 108));
                                  if (var20 == 0) {
                                    continue L25;
                                  } else {
                                    break L27;
                                  }
                                } else {
                                  if (-1 == var17) {
                                    return;
                                  } else {
                                    var18 = po.d(12949) + 24 * var16;
                                    var19 = 24 * var17 + po.d(12949);
                                    var15.a((byte) 95, 100 + op.field_m.field_H, var18, var19);
                                    wd.a(var15.field_y, op.field_m.field_H, ma.field_a, var18, 61, var19);
                                    var15 = (wb) ((Object) this.field_Q.b((byte) 108));
                                    if (var20 == 0) {
                                      continue L25;
                                    } else {
                                      L36: {
                                        if (0 < var14) {
                                          iq.a(-13, (byte) 99);
                                          break L36;
                                        } else {
                                          break L36;
                                        }
                                      }
                                      L37: {
                                        if (param0 > 14) {
                                          break L37;
                                        } else {
                                          this.b(false, -51, -45, 16);
                                          break L37;
                                        }
                                      }
                                      var6 = (wb) ((Object) var5.c((byte) 98));
                                      L38: while (true) {
                                        if (var6 == null) {
                                          break L7;
                                        } else {
                                          var6.a(-4564);
                                          this.field_Q.a(29664, var6);
                                          var6 = (wb) ((Object) var5.b((byte) 126));
                                          if (var20 != 0) {
                                            break L7;
                                          } else {
                                            if (var20 == 0) {
                                              continue L38;
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
                          }
                        }
                      }
                      stackOut_91_0 = 0;
                      stackIn_92_0 = stackOut_91_0;
                      break L26;
                    }
                    if (stackIn_92_0 < var14) {
                      iq.a(-13, (byte) 99);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
              } else {
                L39: {
                  param2 = -6 + this.field_o.g(-115);
                  param1 = this.field_o.h(-110) - -15;
                  var6_int = 8192;
                  if ((this.field_Q.a((byte) 98) ^ -1) >= -1) {
                    break L39;
                  } else {
                    var6_int = var6_int / this.field_Q.a((byte) 98);
                    break L39;
                  }
                }
                L40: {
                  if ((var6_int ^ -1) != -1) {
                    break L40;
                  } else {
                    var6_int = 1;
                    break L40;
                  }
                }
                var7 = 0;
                var8_ref = (wb) ((Object) this.field_Q.c((byte) 88));
                L41: while (true) {
                  if (var8_ref == null) {
                    break L8;
                  } else {
                    var9 = param2 - -(wn.a(-128, var7) * 48 >> 470081360);
                    var10 = (on.a(var7, -18924) * 48 >> 1661881648) + param1;
                    var7 = var7 + var6_int;
                    var8_ref.a((byte) 68, op.field_m.field_H - -100, var9, var10);
                    wd.a(var8_ref.field_y, op.field_m.field_H, ma.field_a, param2, 65, param1);
                    var8_ref = (wb) ((Object) this.field_Q.b((byte) 117));
                    if (var20 != 0) {
                      break L8;
                    } else {
                      if (var20 == 0) {
                        continue L41;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
              }
            }
            L42: {
              if (param0 > 14) {
                break L42;
              } else {
                this.b(false, -51, -45, 16);
                break L42;
              }
            }
            var6 = (wb) ((Object) var5.c((byte) 98));
            L43: while (true) {
              if (var6 == null) {
                break L7;
              } else {
                var6.a(-4564);
                this.field_Q.a(29664, var6);
                var6 = (wb) ((Object) var5.b((byte) 126));
                if (var20 != 0) {
                  break L7;
                } else {
                  if (var20 == 0) {
                    continue L43;
                  } else {
                    break L7;
                  }
                }
              }
            }
          }
          return;
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 >= -103) {
            this.a((byte) -73, false);
        }
        op.field_m.a(param4, param2 != 9 ? 0 : 1, 118, param1, param3, this.field_u);
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0) {
          L0: {
            L1: {
              if (he.field_a) {
                break L1;
              } else {
                oo.h(0, 40, 640, 440);
                if (var4 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            oo.c();
            break L0;
          }
          L2: {
            L3: {
              if (1.0f != this.field_k.field_d) {
                break L3;
              } else {
                ki.field_k.c(0, 0);
                if (var4 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              var2 = (int)(1280.0f / this.field_k.field_d);
              var3 = (int)(960.0f / this.field_k.field_d);
              ki.field_k.f(0, 0, var2, var3);
              if (1.2999999523162842f < this.field_k.field_d) {
                break L4;
              } else {
                break L4;
              }
            }
            break L2;
          }
          return;
        } else {
          return;
        }
    }

    private final void e(int param0, int param1, int param2) {
        int var4 = (-this.field_k.field_k + param2) / 4;
        int var5 = (-this.field_k.field_g + param0) / 4;
        this.field_k.a(var5 + this.field_k.field_g, -var4 + param2, param2, this.field_k.field_k, this.field_k.field_g, param0, 0, param0 - var5, this.field_k.field_k - -var4);
        this.field_k.a((byte) 47);
        this.field_k.field_i = this.field_k.field_i * 6.0f;
        if (param1 >= -36) {
            field_N = 59;
        }
    }

    final static void a(fm param0, int param1, String param2, int param3, td param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
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
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = -1;
            var7 = 1;
            if (param3 > 82) {
              L1: while (true) {
                L2: {
                  if ((param2.length() ^ -1) >= (var7 ^ -1)) {
                    break L2;
                  } else {
                    var8 = param2.charAt(var7);
                    if (var9 != 0) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L3: {
                        if (60 == var8) {
                          var6 = param4.field_e[0] + ((var5_int >> 1012378856) - -param0.a(param2.substring(0, var7)));
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        L5: {
                          if (-1 == var6) {
                            break L5;
                          } else {
                            param4.field_e[var7] = var6;
                            if (var9 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (var8 == 32) {
                            var5_int = var5_int + param1;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        param4.field_e[var7] = param4.field_e[0] + (var5_int >> -539974776) + (param0.a(param2.substring(0, 1 + var7)) - param0.a((char) var8));
                        break L4;
                      }
                      L7: {
                        if (62 == var8) {
                          var6 = -1;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var7++;
                      if (var9 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
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
          L8: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var5);
            stackOut_20_1 = new StringBuilder().append("qd.KB(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          L9: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param1).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          L10: {
            stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param3).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param4 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L10;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L10;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
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

    private final void d(int param0, int param1) {
        int var4 = 0;
        L0: {
          var4 = ZombieDawnMulti.field_E ? 1 : 0;
          pq.b(false);
          if (param1 == 3) {
            break L0;
          } else {
            this.field_kb = (th) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (-1 == (param0 ^ -1)) {
              break L2;
            } else {
              L3: {
                if (param0 != 1) {
                  break L3;
                } else {
                  h.b(param1 + -113, 1);
                  ck.a(77, -23838);
                  ck.a(110, -23838);
                  ck.a(111, -23838);
                  ck.a(173, -23838);
                  ck.a(174, -23838);
                  ck.a(175, param1 ^ -23839);
                  sj.a(189, 173, (byte) -66);
                  sj.a(190, 174, (byte) -66);
                  sj.a(191, 175, (byte) -66);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                L5: {
                  if (param0 != 2) {
                    break L5;
                  } else {
                    h.b(-101, 2);
                    ck.a(132, -23838);
                    ck.a(133, -23838);
                    ck.a(70, -23838);
                    ck.a(264, -23838);
                    ck.a(265, -23838);
                    ck.a(266, -23838);
                    ck.a(267, -23838);
                    sj.a(132, 133, (byte) -66);
                    sj.a(268, 264, (byte) -66);
                    sj.a(269, 265, (byte) -66);
                    sj.a(270, 266, (byte) -66);
                    sj.a(271, 267, (byte) -66);
                    if (var4 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if ((param0 ^ -1) != -4) {
                    break L6;
                  } else {
                    h.b(-74, 3);
                    ck.a(163, -23838);
                    ck.a(164, -23838);
                    ck.a(165, -23838);
                    ck.a(213, -23838);
                    ck.a(214, -23838);
                    ck.a(215, param1 ^ -23839);
                    sj.a(213, 163, (byte) -66);
                    sj.a(214, 164, (byte) -66);
                    sj.a(215, 165, (byte) -66);
                    ck.a(230, -23838);
                    ck.a(246, -23838);
                    sj.a(246, 230, (byte) -66);
                    ck.a(247, -23838);
                    ck.a(263, -23838);
                    sj.a(263, 247, (byte) -66);
                    if (var4 == 0) {
                      break L4;
                    } else {
                      break L6;
                    }
                  }
                }
                if (param0 != 4) {
                  break L4;
                } else {
                  h.b(param1 ^ -89, 4);
                  if (var4 == 0) {
                    break L4;
                  } else {
                    break L2;
                  }
                }
              }
              break L1;
            }
          }
          pj.a(0, 16, -16384, 22, 21, (byte) -27, 3);
          pj.a(0, 21, 16384, 23, 16, (byte) 122, 3);
          ge.s(9);
          ck.a(59, -23838);
          ck.a(60, -23838);
          ck.a(61, -23838);
          ck.a(71, param1 + -23841);
          ck.a(70, -23838);
          ck.a(110, -23838);
          ck.a(111, param1 ^ -23839);
          ck.a(120, -23838);
          ck.a(121, -23838);
          ck.a(122, -23838);
          ck.a(156, param1 ^ -23839);
          ck.a(157, -23838);
          ck.a(158, -23838);
          ck.a(276, -23838);
          ck.a(277, -23838);
          ck.a(278, -23838);
          sj.a(276, 120, (byte) -66);
          sj.a(277, 121, (byte) -66);
          sj.a(278, 122, (byte) -66);
          h.b(-70, 0);
          break L1;
        }
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_14_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_117_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_115_0 = 0;
        L0: {
          var4 = ZombieDawnMulti.field_E ? 1 : 0;
          if (-14 != (param1 ^ -1)) {
            if (gf.field_h) {
              break L0;
            } else {
              if (!this.c((byte) 124)) {
                return;
              } else {
                L1: {
                  L2: {
                    if (df.field_I) {
                      break L2;
                    } else {
                      L3: {
                        if ((param1 ^ -1) != -85) {
                          break L3;
                        } else {
                          L4: {
                            if (iq.field_f) {
                              stackOut_13_0 = 0;
                              stackIn_14_0 = stackOut_13_0;
                              break L4;
                            } else {
                              stackOut_12_0 = 1;
                              stackIn_14_0 = stackOut_12_0;
                              break L4;
                            }
                          }
                          iq.field_f = stackIn_14_0 != 0;
                          break L3;
                        }
                      }
                      if ((param1 ^ -1) != -81) {
                        break L1;
                      } else {
                        if (iq.field_f) {
                          break L1;
                        } else {
                          sq.field_N = true;
                          iq.field_f = true;
                          if (var4 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  L5: {
                    if (83 == param1) {
                      break L5;
                    } else {
                      if (-85 != (param1 ^ -1)) {
                        break L1;
                      } else {
                        break L5;
                      }
                    }
                  }
                  iq.a(-14, (byte) 99);
                  break L1;
                }
                L6: {
                  if (this.field_ab) {
                    L7: {
                      if ((param1 ^ -1) != -42) {
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (40 == param1) {
                        L9: {
                          if (po.field_p) {
                            stackOut_30_0 = 0;
                            stackIn_31_0 = stackOut_30_0;
                            break L9;
                          } else {
                            stackOut_29_0 = 1;
                            stackIn_31_0 = stackOut_29_0;
                            break L9;
                          }
                        }
                        po.field_p = stackIn_31_0 != 0;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L10: {
                      if (32 != param1) {
                        break L10;
                      } else {
                        L11: {
                          if (wh.field_c) {
                            stackOut_35_0 = 0;
                            stackIn_36_0 = stackOut_35_0;
                            break L11;
                          } else {
                            stackOut_34_0 = 1;
                            stackIn_36_0 = stackOut_34_0;
                            break L11;
                          }
                        }
                        wh.field_c = stackIn_36_0 != 0;
                        break L10;
                      }
                    }
                    L12: {
                      if (param1 != 85) {
                        break L12;
                      } else {
                        L13: {
                          if (vk.field_E) {
                            stackOut_40_0 = 0;
                            stackIn_41_0 = stackOut_40_0;
                            break L13;
                          } else {
                            stackOut_39_0 = 1;
                            stackIn_41_0 = stackOut_39_0;
                            break L13;
                          }
                        }
                        vk.field_E = stackIn_41_0 != 0;
                        break L12;
                      }
                    }
                    L14: {
                      if (lc.field_m[86]) {
                        L15: {
                          if (lc.field_m[81]) {
                            break L15;
                          } else {
                            L16: {
                              if (-17 != (param1 ^ -1)) {
                                break L16;
                              } else {
                                this.field_g = 1;
                                break L16;
                              }
                            }
                            L17: {
                              if ((param1 ^ -1) != -18) {
                                break L17;
                              } else {
                                this.field_g = 2;
                                break L17;
                              }
                            }
                            L18: {
                              if (param1 == 18) {
                                this.field_g = 4;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            L19: {
                              if (-20 == (param1 ^ -1)) {
                                this.field_g = 8;
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                            L20: {
                              if ((param1 ^ -1) != -21) {
                                break L20;
                              } else {
                                this.field_g = 16;
                                break L20;
                              }
                            }
                            L21: {
                              if (21 == param1) {
                                this.field_g = 32;
                                break L21;
                              } else {
                                break L21;
                              }
                            }
                            L22: {
                              if (22 == param1) {
                                this.field_g = 64;
                                break L22;
                              } else {
                                break L22;
                              }
                            }
                            L23: {
                              if ((param1 ^ -1) != -24) {
                                break L23;
                              } else {
                                this.field_g = 128;
                                break L23;
                              }
                            }
                            L24: {
                              if (param1 == 24) {
                                this.field_g = 256;
                                break L24;
                              } else {
                                break L24;
                              }
                            }
                            if (25 != param1) {
                              break L14;
                            } else {
                              this.field_g = 0;
                              if (var4 == 0) {
                                break L14;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                        L25: {
                          if (-17 == (param1 ^ -1)) {
                            this.field_m = 1;
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                        L26: {
                          if ((param1 ^ -1) != -18) {
                            break L26;
                          } else {
                            this.field_m = 2;
                            break L26;
                          }
                        }
                        L27: {
                          if ((param1 ^ -1) != -19) {
                            break L27;
                          } else {
                            this.field_m = 4;
                            break L27;
                          }
                        }
                        L28: {
                          if (19 == param1) {
                            this.field_m = 8;
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                        L29: {
                          if ((param1 ^ -1) == -21) {
                            this.field_m = 16;
                            break L29;
                          } else {
                            break L29;
                          }
                        }
                        L30: {
                          if (21 != param1) {
                            break L30;
                          } else {
                            this.field_m = 32;
                            break L30;
                          }
                        }
                        L31: {
                          if (param1 != 22) {
                            break L31;
                          } else {
                            this.field_m = 64;
                            break L31;
                          }
                        }
                        L32: {
                          if (-24 != (param1 ^ -1)) {
                            break L32;
                          } else {
                            this.field_m = 128;
                            break L32;
                          }
                        }
                        L33: {
                          if (24 == param1) {
                            this.field_m = 256;
                            break L33;
                          } else {
                            break L33;
                          }
                        }
                        if (25 == param1) {
                          this.field_m = 0;
                          break L14;
                        } else {
                          break L14;
                        }
                      } else {
                        break L14;
                      }
                    }
                    L34: {
                      if (-38 != (param1 ^ -1)) {
                        break L34;
                      } else {
                        L35: {
                          if (wj.field_n) {
                            stackOut_99_0 = 0;
                            stackIn_100_0 = stackOut_99_0;
                            break L35;
                          } else {
                            stackOut_98_0 = 1;
                            stackIn_100_0 = stackOut_98_0;
                            break L35;
                          }
                        }
                        wj.field_n = stackIn_100_0 != 0;
                        break L34;
                      }
                    }
                    L36: {
                      if ((param1 ^ -1) == -35) {
                        L37: {
                          if (qq.field_h) {
                            stackOut_105_0 = 0;
                            stackIn_106_0 = stackOut_105_0;
                            break L37;
                          } else {
                            stackOut_104_0 = 1;
                            stackIn_106_0 = stackOut_104_0;
                            break L37;
                          }
                        }
                        qq.field_h = stackIn_106_0 != 0;
                        break L36;
                      } else {
                        break L36;
                      }
                    }
                    L38: {
                      if ((param1 ^ -1) != -39) {
                        break L38;
                      } else {
                        L39: {
                          if (n.field_g) {
                            stackOut_110_0 = 0;
                            stackIn_111_0 = stackOut_110_0;
                            break L39;
                          } else {
                            stackOut_109_0 = 1;
                            stackIn_111_0 = stackOut_109_0;
                            break L39;
                          }
                        }
                        n.field_g = stackIn_111_0 != 0;
                        break L38;
                      }
                    }
                    L40: {
                      if (-37 == (param1 ^ -1)) {
                        L41: {
                          if (sc.field_a) {
                            stackOut_116_0 = 0;
                            stackIn_117_0 = stackOut_116_0;
                            break L41;
                          } else {
                            stackOut_115_0 = 1;
                            stackIn_117_0 = stackOut_115_0;
                            break L41;
                          }
                        }
                        sc.field_a = stackIn_117_0 != 0;
                        break L40;
                      } else {
                        break L40;
                      }
                    }
                    L42: {
                      if (-42 != (param1 ^ -1)) {
                        break L42;
                      } else {
                        tl.a(2, (byte) -11, ma.field_a, 0, this.field_M, 0);
                        if (gf.field_h) {
                          break L42;
                        } else {
                          this.field_I.b(113);
                          break L42;
                        }
                      }
                    }
                    L43: {
                      if (2 == param1) {
                        tl.a(0, (byte) -11, ma.field_a, this.field_k.a(true, bo.field_d), 0, this.field_k.a(bd.field_g, 2));
                        break L43;
                      } else {
                        break L43;
                      }
                    }
                    L44: {
                      if (param1 != 4) {
                        break L44;
                      } else {
                        tl.a(1, (byte) -11, ma.field_a, 0, this.field_M, 0);
                        break L44;
                      }
                    }
                    L45: {
                      if (5 != param1) {
                        break L45;
                      } else {
                        tl.a(1, (byte) -11, ma.field_a, 0, (this.field_M + 1) % op.field_m.field_t, 0);
                        break L45;
                      }
                    }
                    L46: {
                      if (6 == param1) {
                        nk.a(120, la.field_n, 120, 0, si.field_C);
                        break L46;
                      } else {
                        break L46;
                      }
                    }
                    L47: {
                      if (7 == param1) {
                        nk.a(1500, la.field_n, 1500, 0, si.field_C);
                        break L47;
                      } else {
                        break L47;
                      }
                    }
                    if (-9 != (param1 ^ -1)) {
                      break L6;
                    } else {
                      tl.a(3, (byte) -11, ma.field_a, 0, 0, 2);
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                L48: {
                  var3 = -34 % ((param0 - 63) / 56);
                  if (!lc.field_m[82]) {
                    break L48;
                  } else {
                    if ((param1 ^ -1) != -49) {
                      break L48;
                    } else {
                      this.a(this.field_u.field_r, this.field_u.field_c, 0, 0, (byte) 5);
                      break L48;
                    }
                  }
                }
                L49: {
                  if ((eg.field_C ^ -1) == (param1 ^ -1)) {
                    this.field_I.a(0, -1);
                    break L49;
                  } else {
                    break L49;
                  }
                }
                L50: {
                  if ((param1 ^ -1) != (tl.field_v ^ -1)) {
                    break L50;
                  } else {
                    this.field_I.a(1, -1);
                    break L50;
                  }
                }
                L51: {
                  if (tp.field_s == param1) {
                    this.field_I.a(2, -1);
                    break L51;
                  } else {
                    break L51;
                  }
                }
                L52: {
                  if ((param1 ^ -1) != (pd.field_c ^ -1)) {
                    break L52;
                  } else {
                    this.field_I.a(3, -1);
                    break L52;
                  }
                }
                L53: {
                  if (mg.field_F != param1) {
                    break L53;
                  } else {
                    this.field_I.a(4, -1);
                    break L53;
                  }
                }
                L54: {
                  if (op.field_m.b((byte) -67, 51, this.field_M)) {
                    L55: {
                      if (-36 == (param1 ^ -1)) {
                        this.a(this.field_k.a(640, 2), this.field_k.a(true, 480), this.field_k.a(true, 0), this.field_k.a(0, 2), (byte) 5);
                        break L55;
                      } else {
                        break L55;
                      }
                    }
                    L56: {
                      L57: {
                        if (!lc.field_m[82]) {
                          break L57;
                        } else {
                          L58: {
                            if (param1 == 16) {
                              break L58;
                            } else {
                              L59: {
                                if ((param1 ^ -1) == -18) {
                                  break L59;
                                } else {
                                  if (param1 != 18) {
                                    break L56;
                                  } else {
                                    this.a((byte) 44, 3);
                                    if (var4 == 0) {
                                      break L56;
                                    } else {
                                      break L59;
                                    }
                                  }
                                }
                              }
                              this.a((byte) 84, 2);
                              if (var4 == 0) {
                                break L56;
                              } else {
                                break L58;
                              }
                            }
                          }
                          this.a((byte) 114, 1);
                          if (var4 == 0) {
                            break L56;
                          } else {
                            break L57;
                          }
                        }
                      }
                      L60: {
                        if ((param1 ^ -1) != -17) {
                          break L60;
                        } else {
                          this.a(1, 1782, lc.field_m[81]);
                          if (var4 == 0) {
                            break L56;
                          } else {
                            break L60;
                          }
                        }
                      }
                      L61: {
                        if (17 == param1) {
                          break L61;
                        } else {
                          if (-19 != (param1 ^ -1)) {
                            break L56;
                          } else {
                            this.a(3, 1782, lc.field_m[81]);
                            if (var4 == 0) {
                              break L56;
                            } else {
                              break L61;
                            }
                          }
                        }
                      }
                      this.a(2, 1782, lc.field_m[81]);
                      break L56;
                    }
                    if (-54 != (param1 ^ -1)) {
                      break L54;
                    } else {
                      this.e(this.field_o.h(-85), -108, this.field_o.g(63));
                      break L54;
                    }
                  } else {
                    break L54;
                  }
                }
                return;
              }
            }
          } else {
            L62: {
              if (iq.field_f) {
                break L62;
              } else {
                bm.a(false, 2, 126, sp.field_g);
                if (var4 == 0) {
                  break L0;
                } else {
                  break L62;
                }
              }
            }
            iq.field_f = false;
            return;
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, byte param4) {
        br var6 = null;
        wb var7 = null;
        int var8 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_12_0 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_11_0 = 0;
        L0: {
          var8 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param4 == 5) {
            break L0;
          } else {
            this.a((byte) -83, -17, -19, -39, -124);
            break L0;
          }
        }
        var6 = this.field_H.c(param4 ^ 120);
        L1: while (true) {
          L2: {
            L3: {
              if (!(var6 instanceof id)) {
                break L3;
              } else {
                stackOut_4_0 = var6 instanceof wb;
                stackIn_12_0 = stackOut_4_0 ? 1 : 0;
                stackIn_5_0 = stackOut_4_0;
                if (var8 != 0) {
                  break L2;
                } else {
                  L4: {
                    if (!stackIn_5_0) {
                      break L4;
                    } else {
                      var7 = (wb) ((Object) var6);
                      if (this.field_M != var7.field_Lb) {
                        break L4;
                      } else {
                        var7.field_eb = false;
                        if (var7.a(param3, param1, param2, 48, param0)) {
                          this.field_Q.a(29664, var7);
                          var7.r(0);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var6 = var6.field_d;
                  if (var8 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            stackOut_11_0 = this.field_Q.a((byte) 98);
            stackIn_12_0 = stackOut_11_0;
            break L2;
          }
          L5: {
            if (stackIn_12_0 > 1) {
              iq.a(-5, (byte) 99);
              break L5;
            } else {
              break L5;
            }
          }
          return;
        }
    }

    final void b(boolean param0, int param1, int param2, int param3) {
        if (param1 != 0) {
            return;
        }
        this.field_O.a(new lj(param3, param2, param0), false);
    }

    final boolean b(int param0, int param1, int param2, int param3) {
        Object var5 = null;
        br var5_ref = null;
        cg var6_ref_cg = null;
        int var6 = 0;
        br var6_ref_br = null;
        int var7 = 0;
        jj var7_ref_jj = null;
        int var8 = 0;
        int var9 = 0;
        pq var10 = null;
        ce var11 = null;
        cg stackIn_3_0 = null;
        Object stackIn_8_0 = null;
        boolean stackIn_11_0 = false;
        boolean stackIn_17_0 = false;
        boolean stackIn_24_0 = false;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        cg stackOut_2_0 = null;
        br stackOut_7_0 = null;
        boolean stackOut_10_0 = false;
        boolean stackOut_16_0 = false;
        boolean stackOut_23_0 = false;
        int stackOut_29_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_52_0 = 0;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        var5 = null;
        var6_ref_cg = (cg) ((Object) op.field_m.field_A.c(49));
        L0: while (true) {
          L1: {
            L2: {
              if (var6_ref_cg == null) {
                break L2;
              } else {
                stackOut_2_0 = (cg) (var6_ref_cg);
                stackIn_8_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var9 != 0) {
                  break L1;
                } else {
                  if (((cg) (Object) stackIn_3_0).a((byte) 60, param2, param0)) {
                    var6_ref_cg.a(-1);
                    return true;
                  } else {
                    var6_ref_cg = (cg) ((Object) op.field_m.field_A.b(6));
                    if (var9 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackOut_7_0 = op.field_m.field_G.c(98);
            stackIn_8_0 = stackOut_7_0;
            break L1;
          }
          var10 = (pq) ((Object) stackIn_8_0);
          L3: while (true) {
            L4: {
              L5: {
                if (var10 == null) {
                  break L5;
                } else {
                  var5_ref = op.field_m.field_G.b(6);
                  stackOut_10_0 = var10.a(param0, false, param2);
                  stackIn_30_0 = stackOut_10_0 ? 1 : 0;
                  stackIn_11_0 = stackOut_10_0;
                  if (var9 != 0) {
                    break L4;
                  } else {
                    if (!stackIn_11_0) {
                      var10 = (pq) ((Object) var5_ref);
                      if (var9 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    } else {
                      var10.c(-24421);
                      var10.a(true);
                      return true;
                    }
                  }
                }
              }
              var11 = (ce) ((Object) op.field_m.field_s.c(39));
              L6: while (true) {
                L7: {
                  if (var11 == null) {
                    break L7;
                  } else {
                    var5_ref = op.field_m.field_s.b(6);
                    stackOut_16_0 = var11.a(param0, param2, -1);
                    stackIn_30_0 = stackOut_16_0 ? 1 : 0;
                    stackIn_17_0 = stackOut_16_0;
                    if (var9 != 0) {
                      break L4;
                    } else {
                      L8: {
                        if (stackIn_17_0) {
                          var11.c(-28188);
                          if (var9 == 0) {
                            break L7;
                          } else {
                            break L8;
                          }
                        } else {
                          break L8;
                        }
                      }
                      var11 = (ce) ((Object) var5_ref);
                      if (var9 == 0) {
                        continue L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                var6_ref_br = op.field_m.field_K.c(125);
                L9: while (true) {
                  L10: {
                    if (var6_ref_br == null) {
                      break L10;
                    } else {
                      stackOut_23_0 = var6_ref_br instanceof jj;
                      stackIn_30_0 = stackOut_23_0 ? 1 : 0;
                      stackIn_24_0 = stackOut_23_0;
                      if (var9 != 0) {
                        break L4;
                      } else {
                        L11: {
                          if (!stackIn_24_0) {
                            break L11;
                          } else {
                            var7_ref_jj = (jj) ((Object) var6_ref_br);
                            if (var7_ref_jj.a(7, param0, param2)) {
                              var7_ref_jj.field_P = 1;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                        }
                        var6_ref_br = op.field_m.field_K.b(6);
                        if (var9 == 0) {
                          continue L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  stackOut_29_0 = 0;
                  stackIn_30_0 = stackOut_29_0;
                  break L4;
                }
              }
            }
            var6 = stackIn_30_0;
            var7 = 0;
            L12: while (true) {
              L13: {
                L14: {
                  if (op.field_m.field_a.length <= var7) {
                    break L14;
                  } else {
                    stackOut_32_0 = var6;
                    stackIn_40_0 = stackOut_32_0;
                    stackIn_33_0 = stackOut_32_0;
                    if (var9 != 0) {
                      break L13;
                    } else {
                      L15: {
                        L16: {
                          if (stackIn_33_0 != 0) {
                            break L16;
                          } else {
                            if ((op.field_m.field_a[var7] ^ -1) >= -1) {
                              stackOut_37_0 = 0;
                              stackIn_38_0 = stackOut_37_0;
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        stackOut_36_0 = 1;
                        stackIn_38_0 = stackOut_36_0;
                        break L15;
                      }
                      var6 = stackIn_38_0;
                      op.field_m.field_a[var7] = 0;
                      var7++;
                      if (var9 == 0) {
                        continue L12;
                      } else {
                        break L14;
                      }
                    }
                  }
                }
                stackOut_39_0 = var6;
                stackIn_40_0 = stackOut_39_0;
                break L13;
              }
              if (stackIn_40_0 != 0) {
                return true;
              } else {
                var7 = 0;
                var8 = 0;
                L17: while (true) {
                  L18: {
                    L19: {
                      if (op.field_m.field_z.length <= var8) {
                        break L19;
                      } else {
                        stackOut_45_0 = var7;
                        stackIn_53_0 = stackOut_45_0;
                        stackIn_46_0 = stackOut_45_0;
                        if (var9 != 0) {
                          break L18;
                        } else {
                          L20: {
                            L21: {
                              if (stackIn_46_0 != 0) {
                                break L21;
                              } else {
                                if (op.field_m.field_z[var8] <= 0) {
                                  stackOut_50_0 = 0;
                                  stackIn_51_0 = stackOut_50_0;
                                  break L20;
                                } else {
                                  break L21;
                                }
                              }
                            }
                            stackOut_49_0 = 1;
                            stackIn_51_0 = stackOut_49_0;
                            break L20;
                          }
                          var7 = stackIn_51_0;
                          op.field_m.field_z[var8] = 0;
                          var8++;
                          if (var9 == 0) {
                            continue L17;
                          } else {
                            break L19;
                          }
                        }
                      }
                    }
                    stackOut_52_0 = param1;
                    stackIn_53_0 = stackOut_52_0;
                    break L18;
                  }
                  L22: {
                    if (stackIn_53_0 <= -100) {
                      break L22;
                    } else {
                      this.field_T = (th) null;
                      break L22;
                    }
                  }
                  if (var7 == 0) {
                    return false;
                  } else {
                    return true;
                  }
                }
              }
            }
          }
        }
    }

    private final void a(byte param0, int param1) {
        br var3 = null;
        int var4 = 0;
        wb var5 = null;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var3 = op.field_m.field_K.c(40);
        var4 = -123 % ((-35 - param0) / 45);
        L0: while (true) {
          L1: {
            if (var3 == null) {
              break L1;
            } else {
              if (var6 != 0) {
                break L1;
              } else {
                L2: {
                  if (!(var3 instanceof wb)) {
                    break L2;
                  } else {
                    L3: {
                      var5 = (wb) ((Object) var3);
                      if (!var5.field_Bb) {
                        break L3;
                      } else {
                        var5.field_Kb = param1;
                        if (var6 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (param1 == var5.field_Kb) {
                      var5.field_Kb = 0;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                var3 = op.field_m.field_K.b(6);
                if (var6 == 0) {
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

    final void b(int param0, byte param1, int param2) {
        uj discarded$4 = null;
        uj discarded$5 = null;
        uj discarded$6 = null;
        uj discarded$7 = null;
        int var5 = 0;
        int var6 = 0;
        ti var7 = null;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param1 == 127) {
          L0: {
            var7 = (ti) ((Object) op.field_m.a(param2, (byte) 33));
            if (var7 == null) {
              System.out.println("*** character oid " + param2 + "is null!");
              break L0;
            } else {
              break L0;
            }
          }
          if (21 != var7.field_K) {
            L1: {
              L2: {
                if (!(var7 instanceof gm)) {
                  break L2;
                } else {
                  L3: {
                    op.field_m.field_J[param0] = op.field_m.field_J[param0] + 1;
                    var5 = 10;
                    this.f(27);
                    if (!op.field_m.b((byte) -88, 60, param0)) {
                      break L3;
                    } else {
                      var5 = var5 + var5 / 2;
                      break L3;
                    }
                  }
                  L4: {
                    if (this.field_M == param0) {
                      break L4;
                    } else {
                      discarded$4 = pb.a((byte) 62, 79);
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    stackOut_13_0 = 62;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_14_0 = stackOut_13_0;
                    if (((gm) ((Object) var7)).m(param1 + 15557)) {
                      stackOut_15_0 = stackIn_15_0;
                      stackOut_15_1 = 77;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      break L5;
                    } else {
                      stackOut_14_0 = stackIn_14_0;
                      stackOut_14_1 = 76;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      break L5;
                    }
                  }
                  discarded$5 = pb.a((byte) stackIn_16_0, stackIn_16_1);
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L6: {
                var5 = 4;
                if (!op.field_m.b((byte) -124, 53, param0)) {
                  break L6;
                } else {
                  var5 = var5 + var5 / 2;
                  break L6;
                }
              }
              L7: {
                if ((this.field_M ^ -1) != (param0 ^ -1)) {
                  break L7;
                } else {
                  discarded$6 = qq.b(1481485697, 78);
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L7;
                  }
                }
              }
              discarded$7 = qq.b(1481485697, 79);
              break L1;
            }
            this.field_T.a(new wc(var7.g(-78), -30 + var7.h(-66), var5, true), false);
            var7.b(21, -27655);
            op.field_m.field_d[param0] = op.field_m.field_d[param0] + var5;
            iq.a(-9, (byte) 99);
            return;
          } else {
            System.out.println("*** tried to enter portal twice!");
            return;
          }
        } else {
          return;
        }
    }

    final void c(byte param0, int param1, int param2) {
        id var4 = op.field_m.a(param2, (byte) 33);
        if (var4 == null) {
            return;
        }
        if (param0 != 118) {
            this.field_lb = false;
        }
        if (!(var4 instanceof wb)) {
            return;
        }
        id var5 = op.field_m.a(param1, (byte) 33);
        if (var4 == null) {
            return;
        }
        gm var6 = (gm) ((Object) var5);
        wb var7 = (wb) ((Object) var4);
        var7.field_Eb = var6;
        var7.b(7, param0 ^ -27761);
    }

    final wb a(int param0, wb param1, gm param2, boolean param3, qk param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        wb var8 = null;
        int var9 = 0;
        wb stackIn_1_0 = null;
        wb stackIn_1_1 = null;
        int stackIn_1_2 = 0;
        int stackIn_1_3 = 0;
        wb stackIn_2_0 = null;
        wb stackIn_2_1 = null;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        wb stackIn_3_0 = null;
        wb stackIn_3_1 = null;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        int stackIn_10_0 = 0;
        wb stackIn_12_0 = null;
        wb stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        wb stackOut_0_0 = null;
        wb stackOut_0_1 = null;
        int stackOut_0_2 = 0;
        int stackOut_0_3 = 0;
        wb stackOut_2_0 = null;
        wb stackOut_2_1 = null;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        wb stackOut_1_0 = null;
        wb stackOut_1_1 = null;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        boolean stackOut_1_4 = false;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        wb stackOut_22_0 = null;
        wb stackOut_11_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            L1: {
              var6_int = param4.field_g >> -544405104;
              var7 = param4.field_h >> 746949808;
              stackOut_0_0 = null;
              stackOut_0_1 = null;
              stackOut_0_2 = var6_int;
              stackOut_0_3 = var7;
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_2_2 = stackOut_0_2;
              stackIn_2_3 = stackOut_0_3;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              stackIn_1_2 = stackOut_0_2;
              stackIn_1_3 = stackOut_0_3;
              if (param2 == null) {
                stackOut_2_0 = null;
                stackOut_2_1 = null;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = stackIn_2_3;
                stackOut_2_4 = 1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                stackIn_3_3 = stackOut_2_3;
                stackIn_3_4 = stackOut_2_4;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackOut_1_1 = null;
                stackOut_1_2 = stackIn_1_2;
                stackOut_1_3 = stackIn_1_3;
                stackOut_1_4 = param2.m(15684);
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                stackIn_3_3 = stackOut_1_3;
                stackIn_3_4 = stackOut_1_4 ? 1 : 0;
                break L1;
              }
            }
            L2: {
              var8 = new wb(stackIn_3_2, stackIn_3_3, stackIn_3_4 != 0);
              var8.field_Lb = param0;
              this.a(1, var6_int, var7);
              this.field_H.a(var8, false);
              g.a(this.field_H);
              if (param1 == null) {
                break L2;
              } else {
                L3: {
                  if (!param1.field_Bb) {
                    break L3;
                  } else {
                    var8.r(0);
                    this.field_Q.a(29664, var8);
                    break L3;
                  }
                }
                var8.field_Kb = param1.field_Kb;
                break L2;
              }
            }
            L4: {
              if (param2 == null) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L4;
              } else {
                stackOut_8_0 = param2.q(-5183);
                stackIn_10_0 = stackOut_8_0;
                break L4;
              }
            }
            var9 = stackIn_10_0;
            if (param3) {
              L5: {
                op.field_m.field_d[param0] = op.field_m.field_d[param0] + var9;
                if (0 == var9) {
                  break L5;
                } else {
                  if (this.field_M != param0) {
                    break L5;
                  } else {
                    this.field_T.a(new wc(param2.g(104), param2.h(86) - 30, var9, true), false);
                    break L5;
                  }
                }
              }
              L6: {
                if (!this.field_G.b((byte) 31)) {
                  var8.p(72);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                iq.a(-4, (byte) 99);
                if (param2 != null) {
                  param2.b(false);
                  break L7;
                } else {
                  break L7;
                }
              }
              stackOut_22_0 = (wb) (var8);
              stackIn_23_0 = stackOut_22_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_11_0 = (wb) null;
              stackIn_12_0 = stackOut_11_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var6);
            stackOut_24_1 = new StringBuilder().append("qd.LB(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          L9: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          L10: {
            stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param3).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param4 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L10;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0;
        } else {
          return stackIn_23_0;
        }
    }

    final void f(int param0) {
        op.field_m.c(-122);
        this.field_G.h(2);
        if ((op.field_m.field_l ^ -1) == -2) {
            this.field_G.field_n = 2.0f;
        }
        int var2 = 66 % ((param0 - 78) / 48);
    }

    private final ti a(boolean param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        id var9 = null;
        jj var10 = null;
        int var11 = 0;
        ti var12 = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        var5 = this.field_k.a(param3, 2);
        var6 = this.field_k.a(true, param2);
        if (param1 > 35) {
          var7 = null;
          var8 = -1;
          var9 = (id) ((Object) this.field_H.c(48));
          L0: while (true) {
            L1: {
              if (var9 == null) {
                break L1;
              } else {
                L2: {
                  L3: {
                    L4: {
                      if (!param0) {
                        break L4;
                      } else {
                        if (var9 instanceof gm) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (param0) {
                      break L2;
                    } else {
                      if (!(var9 instanceof wb)) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var12 = (ti) ((Object) var9);
                  if (!var12.a(var5, true, var6)) {
                    break L2;
                  } else {
                    if ((var8 ^ -1) > (var12.h(-90) ^ -1)) {
                      var8 = var12.h(124);
                      var7 = var12;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L5: {
                  if (param0) {
                    break L5;
                  } else {
                    if (var9 instanceof jj) {
                      var10 = (jj) ((Object) var9);
                      if ((var10.field_Q ^ -1) == (this.field_M ^ -1)) {
                        break L5;
                      } else {
                        if (!var10.a(7, var5, var6)) {
                          break L5;
                        } else {
                          this.field_b = var10;
                          break L5;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                var9 = (id) ((Object) this.field_H.b(6));
                if (var11 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            return (ti) (var7);
          }
        } else {
          return (ti) null;
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        ja var6 = null;
        L0: {
          var6 = am.a(0, op.field_m.field_D[param3][1], 0, 1, op.field_m.field_D[param3][0]);
          og.h((byte) 116);
          oo.h(320 - this.field_l / 2, 0, 320 - -(this.field_l / 2), 480);
          if (param1 == -99) {
            break L0;
          } else {
            this.b(95, (byte) 85, -97);
            break L0;
          }
        }
        L1: {
          L2: {
            if (320 <= param0) {
              break L2;
            } else {
              var6.g(param0 - 24, param2);
              ah.field_e.c(op.field_m.field_b[param3], param0 - -24, 48 + param2, 0, 0);
              if (!ZombieDawnMulti.field_E) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          var6.b(param0 - 24, param2);
          ah.field_e.a(op.field_m.field_b[param3], param0 - 24, 48 + param2, 0, 0);
          break L1;
        }
    }

    final void b(int param0, int param1) {
        wb var3 = op.field_m.a(param0, false);
        if (!(var3 == null)) {
            var3.e(false);
        }
        if (param1 != 10) {
            this.c((byte) -13, 20, 111);
        }
    }

    final void a(boolean param0, ae param1) {
        ae var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!(param1 instanceof fq)) {
                break L1;
              } else {
                this.d(((fq) ((Object) param1)).field_l, param1.field_f, -30305);
                break L1;
              }
            }
            if (!this.field_hb.f(28113)) {
              if (!param0) {
                var3 = (ae) ((Object) this.field_hb.a((byte) -84));
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var3 == null) {
                        break L4;
                      } else {
                        if (var4 != 0) {
                          break L3;
                        } else {
                          if ((param1.field_f ^ -1) >= (var3.field_f ^ -1)) {
                            var3 = (ae) ((Object) this.field_hb.c((byte) 97));
                            if (var4 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          } else {
                            qc.a(param1, var3, 0);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        }
                      }
                    }
                    this.field_hb.a(-25612, param1);
                    break L3;
                  }
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              this.field_hb.a(-25612, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3_ref);
            stackOut_17_1 = new StringBuilder().append("qd.U(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
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

    final void a(boolean param0, wb param1) {
        try {
            param1.c((byte) -70);
            param1.a(-4564);
            param1.a(param0);
            if (!param0) {
                this.a(112, true, -72, (byte) -98, 26);
            }
            this.field_G.h(2);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "qd.OA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        lc var5 = (lc) ((Object) this.field_X.g(106));
        if (!(var5 != null)) {
            var5 = new lc();
        }
        var5.a(param1, param3, op.field_m.a(param2, (byte) 33), (byte) 108);
        this.field_C.a(-25612, var5);
        g.a(this.field_C);
        int var6 = -116 / ((param0 - -36) / 61);
    }

    final void c(boolean param0, int param1) {
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        int var3_int = 0;
        br var3 = null;
        int var5 = 0;
        wb var6 = null;
        gm var7 = null;
        L0: {
          var5 = ZombieDawnMulti.field_E ? 1 : 0;
          wd.field_G = null;
          if (param0) {
            break L0;
          } else {
            this.a((byte) 76, false);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              L4: {
                L5: {
                  var3_int = param1;
                  if (-10 != (var3_int ^ -1)) {
                    break L5;
                  } else {
                    if (var5 == 0) {
                      L6: {
                        if (this.field_I.b(17, 0)) {
                          break L6;
                        } else {
                          discarded$2 = this.field_I.a(81, 0, 255);
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L6;
                          }
                        }
                      }
                      discarded$3 = this.field_I.b(17, 0);
                      if (var5 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                if (3 == var3_int) {
                  break L4;
                } else {
                  L7: {
                    L8: {
                      L9: {
                        if ((var3_int ^ -1) != -1) {
                          break L9;
                        } else {
                          if (var5 == 0) {
                            this.e(gk.field_c, -81, hc.field_c);
                            if (var5 == 0) {
                              break L3;
                            } else {
                              break L8;
                            }
                          } else {
                            break L9;
                          }
                        }
                      }
                      if (-9 == (var3_int ^ -1)) {
                        break L8;
                      } else {
                        L10: {
                          if (5 != var3_int) {
                            break L10;
                          } else {
                            if (var5 == 0) {
                              break L7;
                            } else {
                              break L10;
                            }
                          }
                        }
                        if (11 == var3_int) {
                          we.field_g[7] = se.field_D;
                          break L3;
                        } else {
                          break L1;
                        }
                      }
                    }
                    this.e(this.field_o.h(-102), -92, this.field_o.g(61));
                    wd.field_G = (id) ((Object) this.field_o);
                    if (var5 == 0) {
                      break L3;
                    } else {
                      break L7;
                    }
                  }
                  var3 = op.field_m.field_K.c(89);
                  L11: while (true) {
                    if (var3 == null) {
                      break L2;
                    } else {
                      if (var5 != 0) {
                        break L3;
                      } else {
                        L12: {
                          L13: {
                            if (!(var3 instanceof gm)) {
                              break L13;
                            } else {
                              var7 = (gm) ((Object) var3);
                              if ((var7.field_C ^ -1) == -5) {
                                this.e(var7.h(-96), -49, var7.g(63));
                                wd.field_G = (id) ((Object) var7);
                                if (var5 == 0) {
                                  break L12;
                                } else {
                                  break L13;
                                }
                              } else {
                                break L13;
                              }
                            }
                          }
                          var3 = op.field_m.field_K.b(6);
                          if (var5 == 0) {
                            continue L11;
                          } else {
                            break L12;
                          }
                        }
                        break L1;
                      }
                    }
                  }
                }
              }
              var3 = op.field_m.field_K.c(47);
              L14: while (true) {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var5 != 0) {
                    break L3;
                  } else {
                    L15: {
                      L16: {
                        if (var3 instanceof wb) {
                          var6 = (wb) ((Object) var3);
                          if (var6.field_Lb == this.field_M) {
                            this.e(var6.h(87), -61, var6.g(73));
                            wd.field_G = (id) ((Object) var6);
                            if (var5 == 0) {
                              break L15;
                            } else {
                              break L16;
                            }
                          } else {
                            break L16;
                          }
                        } else {
                          break L16;
                        }
                      }
                      var3 = op.field_m.field_K.b(6);
                      if (var5 == 0) {
                        continue L14;
                      } else {
                        break L15;
                      }
                    }
                    break L1;
                  }
                }
              }
            }
            break L1;
          }
          break L1;
        }
    }

    private final void a(int param0, fc param1) {
        boolean discarded$1 = false;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        th var7 = null;
        id var8 = null;
        String var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        h var15 = null;
        Object var16 = null;
        wb var16_ref = null;
        Object var17 = null;
        Object var18 = null;
        Object var19 = null;
        h var19_ref = null;
        wb var20 = null;
        rp var21 = null;
        sl var22 = null;
        String var23 = null;
        cg var24 = null;
        ce var25 = null;
        boolean stackIn_24_0 = false;
        boolean stackIn_71_0 = false;
        boolean stackIn_81_0 = false;
        int stackIn_85_0 = 0;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        RuntimeException stackIn_121_0 = null;
        StringBuilder stackIn_121_1 = null;
        String stackIn_121_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_23_0 = false;
        boolean stackOut_70_0 = false;
        boolean stackOut_80_0 = false;
        int stackOut_84_0 = 0;
        RuntimeException stackOut_118_0 = null;
        StringBuilder stackOut_118_1 = null;
        RuntimeException stackOut_120_0 = null;
        StringBuilder stackOut_120_1 = null;
        String stackOut_120_2 = null;
        RuntimeException stackOut_119_0 = null;
        StringBuilder stackOut_119_1 = null;
        String stackOut_119_2 = null;
        var19 = null;
        var16 = null;
        var17 = null;
        var18 = null;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              iq.field_f = false;
              this.field_f = false;
              this.field_Q.d(-1);
              this.field_jb = 0;
              this.field_A = 0;
              on.j((byte) 113);
              if (df.field_I) {
                L2: {
                  L3: {
                    if (pp.field_n) {
                      break L3;
                    } else {
                      L4: {
                        if (op.field_m.b((byte) -128, 45, this.field_M)) {
                          break L4;
                        } else {
                          ah.a((byte) -86, 19);
                          if (var14 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                      ah.a((byte) -86, 20);
                      if (var14 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  ah.a((byte) -86, 21);
                  break L2;
                }
                iq.a(-1, (byte) 99);
                break L1;
              } else {
                break L1;
              }
            }
            L5: {
              L6: {
                this.field_w = true;
                this.field_mb = null;
                if (pp.field_n) {
                  break L6;
                } else {
                  L7: {
                    if (df.field_I) {
                      break L7;
                    } else {
                      L8: {
                        if (!gf.field_h) {
                          break L8;
                        } else {
                          we.field_g[7] = pi.field_b;
                          if (var14 == 0) {
                            break L5;
                          } else {
                            break L8;
                          }
                        }
                      }
                      we.field_g[7] = kb.field_B;
                      if (var14 == 0) {
                        break L5;
                      } else {
                        break L7;
                      }
                    }
                  }
                  we.field_g[7] = se.field_D;
                  if (var14 == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              we.field_g[7] = e.field_b;
              break L5;
            }
            this.field_eb = false;
            this.field_db = false;
            this.field_J = new uf();
            this.field_Y = 0;
            this.field_u = new fh(param1);
            ip.b((byte) 111);
            gj.a(param0 + 6956);
            this.field_k = new nm(this.field_u.field_r, this.field_u.field_c);
            this.field_k.field_f = false;
            this.d(param1.field_j, 3);
            this.field_fb = op.field_m.field_r;
            this.field_ib = 1;
            this.field_O = new th();
            this.field_cb = new th();
            this.field_kb = new th();
            this.field_T = new th();
            this.field_hb = new th();
            this.field_C = new th();
            this.field_X = new th();
            this.field_c = new lq();
            var3_int = -2147483647;
            var4 = -2147483647;
            var5 = 2147483647;
            var6 = 2147483647;
            var7 = param1.a(-120);
            var8 = (id) ((Object) var7.c(param0 + 38));
            L9: while (true) {
              L10: {
                L11: {
                  if (var8 == null) {
                    break L11;
                  } else {
                    stackOut_23_0 = var8 instanceof h;
                    stackIn_71_0 = stackOut_23_0;
                    stackIn_24_0 = stackOut_23_0;
                    if (var14 != 0) {
                      break L10;
                    } else {
                      L12: {
                        L13: {
                          if (!stackIn_24_0) {
                            break L13;
                          } else {
                            L14: {
                              var15 = (h) ((Object) var8);
                              var19_ref = var15;
                              if (op.field_m.field_t <= var19_ref.field_I) {
                                break L14;
                              } else {
                                var15.field_I = op.field_m.field_y[var15.field_I];
                                this.field_H.a(var8, false);
                                this.field_c.a(29664, var8);
                                if (var19_ref.field_I != this.field_M) {
                                  break L14;
                                } else {
                                  L15: {
                                    L16: {
                                      var10 = var8.g(param0 + 83);
                                      var11 = var8.h(74);
                                      this.field_o = var19_ref;
                                      var12 = var10 - (var5 + var3_int) / 2;
                                      var13 = -((var6 + var4) / 2) + var11;
                                      if ((var3_int ^ -1) == -2147483648) {
                                        break L16;
                                      } else {
                                        if (-641 >= (Math.abs(var12) ^ -1)) {
                                          break L15;
                                        } else {
                                          if ((Math.abs(var13) ^ -1) <= -481) {
                                            break L15;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                    }
                                    L17: {
                                      if (var11 < var6) {
                                        var6 = var11;
                                        break L17;
                                      } else {
                                        break L17;
                                      }
                                    }
                                    L18: {
                                      if ((var11 ^ -1) >= (var4 ^ -1)) {
                                        break L18;
                                      } else {
                                        var4 = var11;
                                        break L18;
                                      }
                                    }
                                    L19: {
                                      if ((var10 ^ -1) > (var5 ^ -1)) {
                                        var5 = var10;
                                        break L19;
                                      } else {
                                        break L19;
                                      }
                                    }
                                    if ((var10 ^ -1) < (var3_int ^ -1)) {
                                      var3_int = var10;
                                      if (var14 == 0) {
                                        break L14;
                                      } else {
                                        break L15;
                                      }
                                    } else {
                                      break L14;
                                    }
                                  }
                                  var5 = var10;
                                  var3_int = var10;
                                  var6 = var11;
                                  var4 = var11;
                                  break L14;
                                }
                              }
                            }
                            if (var14 == 0) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        L20: {
                          if (var8 instanceof wb) {
                            break L20;
                          } else {
                            if (var8 instanceof fd) {
                              this.field_H.a(var8, false);
                              if (var14 == 0) {
                                break L12;
                              } else {
                                break L20;
                              }
                            } else {
                              break L12;
                            }
                          }
                        }
                        var16_ref = (wb) ((Object) var8);
                        var20 = var16_ref;
                        if ((op.field_m.field_t ^ -1) < (var20.field_Lb ^ -1)) {
                          if (op.field_m.field_y[var16_ref.field_Lb] == this.field_M) {
                            L21: {
                              L22: {
                                var10 = var8.g(param0 ^ -37);
                                var11 = var8.h(-56);
                                var12 = var10 + -((var3_int + var5) / 2);
                                var13 = -((var4 + var6) / 2) + var11;
                                if (-2147483648 == (var3_int ^ -1)) {
                                  break L22;
                                } else {
                                  if (-641 >= (Math.abs(var12) ^ -1)) {
                                    break L21;
                                  } else {
                                    if (Math.abs(var13) < 480) {
                                      break L22;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                              }
                              L23: {
                                if ((var5 ^ -1) < (var10 ^ -1)) {
                                  var5 = var10;
                                  break L23;
                                } else {
                                  break L23;
                                }
                              }
                              L24: {
                                if (var11 <= var4) {
                                  break L24;
                                } else {
                                  var4 = var11;
                                  break L24;
                                }
                              }
                              L25: {
                                if (var3_int >= var10) {
                                  break L25;
                                } else {
                                  var3_int = var10;
                                  break L25;
                                }
                              }
                              if (var6 > var11) {
                                var6 = var11;
                                break L21;
                              } else {
                                break L21;
                              }
                            }
                            if (df.field_I) {
                              gk.field_c = var11;
                              hc.field_c = var10;
                              break L12;
                            } else {
                              break L12;
                            }
                          } else {
                            break L12;
                          }
                        } else {
                          break L12;
                        }
                      }
                      var8 = (id) ((Object) var7.b(6));
                      if (var14 == 0) {
                        continue L9;
                      } else {
                        break L11;
                      }
                    }
                  }
                }
                this.field_h = (var6 - -var4) / 2;
                this.field_R = (var5 + var3_int) / 2;
                stackOut_70_0 = gf.field_h;
                stackIn_71_0 = stackOut_70_0;
                break L10;
              }
              L26: {
                L27: {
                  if (stackIn_71_0) {
                    break L27;
                  } else {
                    if (!df.field_I) {
                      break L26;
                    } else {
                      break L27;
                    }
                  }
                }
                this.field_h = this.field_u.field_c / 2;
                this.field_R = this.field_u.field_r / 2;
                break L26;
              }
              L28: {
                this.field_k.a(this.field_h, (byte) -69, this.field_R);
                if (gf.field_h) {
                  this.field_k.a(false);
                  break L28;
                } else {
                  break L28;
                }
              }
              g.a(this.field_H);
              this.field_j = 0;
              var8 = (id) ((Object) this.field_H.c(46));
              L29: while (true) {
                L30: {
                  L31: {
                    if (var8 == null) {
                      break L31;
                    } else {
                      stackOut_80_0 = var8 instanceof gm;
                      stackIn_85_0 = stackOut_80_0 ? 1 : 0;
                      stackIn_81_0 = stackOut_80_0;
                      if (var14 != 0) {
                        break L30;
                      } else {
                        L32: {
                          if (!stackIn_81_0) {
                            break L32;
                          } else {
                            this.field_j = this.field_j + 1;
                            break L32;
                          }
                        }
                        var8 = (id) ((Object) this.field_H.b(6));
                        if (var14 == 0) {
                          continue L29;
                        } else {
                          break L31;
                        }
                      }
                    }
                  }
                  stackOut_84_0 = -125;
                  stackIn_85_0 = stackOut_84_0;
                  break L30;
                }
                ho.a((byte) stackIn_85_0, this.field_u);
                var24 = (cg) ((Object) op.field_m.field_A.c(108));
                L33: while (true) {
                  L34: {
                    L35: {
                      if (var24 == null) {
                        break L35;
                      } else {
                        var24.a((byte) -85);
                        var24 = (cg) ((Object) op.field_m.field_A.b(6));
                        if (var14 != 0) {
                          break L34;
                        } else {
                          if (var14 == 0) {
                            continue L33;
                          } else {
                            break L35;
                          }
                        }
                      }
                    }
                    na.a((byte) 127, this.field_u);
                    ih.a(256);
                    break L34;
                  }
                  var25 = (ce) ((Object) op.field_m.field_s.c(72));
                  L36: while (true) {
                    L37: {
                      L38: {
                        if (var25 == null) {
                          break L38;
                        } else {
                          var25.a(this.field_u, -54);
                          var25 = (ce) ((Object) op.field_m.field_s.b(6));
                          if (var14 != 0) {
                            break L37;
                          } else {
                            if (var14 == 0) {
                              continue L36;
                            } else {
                              break L38;
                            }
                          }
                        }
                      }
                      L39: {
                        if (gf.field_h) {
                          break L39;
                        } else {
                          this.field_I = new ko();
                          if (pp.field_n) {
                            break L39;
                          } else {
                            var21 = ll.field_k;
                            var9 = var21.g((byte) -116);
                            var10 = 0;
                            L40: while (true) {
                              if (var9 <= var10) {
                                break L39;
                              } else {
                                discarded$1 = this.field_I.a(87, tg.field_e.field_d[var10], tg.field_e.field_f[var10]);
                                var10++;
                                if (var14 != 0) {
                                  break L37;
                                } else {
                                  if (var14 == 0) {
                                    continue L40;
                                  } else {
                                    break L39;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      this.field_G = new qe();
                      break L37;
                    }
                    L41: {
                      var23 = gm.field_pb[hp.a((byte) -90, g.field_a, gm.field_pb.length)];
                      var8_ref = var23;
                      var22 = ah.field_e;
                      this.field_y = new ja(var22.a(var23), var22.field_C + var22.field_r);
                      this.field_L = new ja(12 + this.field_y.field_x, this.field_y.field_w - -12);
                      g.c(this.field_y);
                      this.field_l = 640;
                      var22.b(var8_ref, this.field_y.field_x / 2, this.field_y.field_w + -var22.field_r, 2, -1);
                      this.field_L.a();
                      oo.b(0, 0, this.field_L.field_x, this.field_L.field_w, 12, 8421504, 80);
                      this.field_y.f(6, param0, 16777215);
                      oo.i(4, 4, 0, 0, oo.field_b, oo.field_l);
                      this.field_y.f(6, 6, 0);
                      g.d();
                      if (-2 == (op.field_m.field_t ^ -1)) {
                        this.field_l = 0;
                        break L41;
                      } else {
                        break L41;
                      }
                    }
                    L42: {
                      L43: {
                        this.field_G.c(0);
                        if (df.field_I) {
                          break L43;
                        } else {
                          L44: {
                            L45: {
                              if (!gf.field_h) {
                                break L45;
                              } else {
                                if (-1 == (op.field_m.field_l ^ -1)) {
                                  break L44;
                                } else {
                                  break L45;
                                }
                              }
                            }
                            this.a((byte) -110, op.field_m.field_l, op.field_m.field_C);
                            if (var14 == 0) {
                              break L42;
                            } else {
                              break L44;
                            }
                          }
                          this.a((byte) -36, 1, 0);
                          if (var14 == 0) {
                            break L42;
                          } else {
                            break L43;
                          }
                        }
                      }
                      this.field_k.field_f = false;
                      op.field_m.field_l = 1;
                      break L42;
                    }
                    this.field_W = op.field_m.field_H - 50;
                    this.field_t = bl.a((byte) 43);
                    this.field_G.a(this.field_Z, false);
                    this.a(21);
                    op.field_m.field_D = new int[4][2];
                    op.field_m.field_D[0][0] = 9089042;
                    op.field_m.field_D[0][1] = 2473480;
                    op.field_m.field_D[1][0] = 11498997;
                    op.field_m.field_D[1][1] = 8165621;
                    op.field_m.field_D[2][0] = 13542477;
                    op.field_m.field_D[2][1] = 13843485;
                    op.field_m.field_D[3][1] = 16054670;
                    op.field_m.field_D[3][0] = 9796207;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L46: {
            var3 = decompiledCaughtException;
            stackOut_118_0 = (RuntimeException) (var3);
            stackOut_118_1 = new StringBuilder().append("qd.FB(").append(param0).append(',');
            stackIn_120_0 = stackOut_118_0;
            stackIn_120_1 = stackOut_118_1;
            stackIn_119_0 = stackOut_118_0;
            stackIn_119_1 = stackOut_118_1;
            if (param1 == null) {
              stackOut_120_0 = (RuntimeException) ((Object) stackIn_120_0);
              stackOut_120_1 = (StringBuilder) ((Object) stackIn_120_1);
              stackOut_120_2 = "null";
              stackIn_121_0 = stackOut_120_0;
              stackIn_121_1 = stackOut_120_1;
              stackIn_121_2 = stackOut_120_2;
              break L46;
            } else {
              stackOut_119_0 = (RuntimeException) ((Object) stackIn_119_0);
              stackOut_119_1 = (StringBuilder) ((Object) stackIn_119_1);
              stackOut_119_2 = "{...}";
              stackIn_121_0 = stackOut_119_0;
              stackIn_121_1 = stackOut_119_1;
              stackIn_121_2 = stackOut_119_2;
              break L46;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_121_0), stackIn_121_2 + ')');
        }
    }

    private final void a(int param0) {
        int var2 = -11 % ((param0 - -61) / 43);
        if (!(df.field_I)) {
            lb.a(this.field_ib, false, this.field_fb);
        }
    }

    final void a(int param0, int param1, byte param2, int[] param3) {
        si var5 = null;
        try {
            if (param2 < 116) {
                this.e(95, -38, -6);
            }
            this.field_lb = true;
            op.field_m.field_c = true;
            this.a((byte) -57, 3, 0);
            this.field_d = 450;
            var5 = (si) ((Object) gk.a(2, 10));
            var5.a(param1, 0, param0, param3, op.field_m);
            ih.a(false, 256, hl.field_d[(param0 ^ -1) != (this.field_M ^ -1) ? 14 : 13]);
            td.field_b = hl.field_d[11];
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "qd.S(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(int param0) {
        int var3 = 0;
        int[] var4 = null;
        wb var5 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (-1 != (this.field_Q.a((byte) 98) ^ -1)) {
          var5 = (wb) ((Object) this.field_Q.c((byte) 112));
          L0: while (true) {
            L1: {
              L2: {
                if (var5 == null) {
                  break L2;
                } else {
                  var5.t(16);
                  var5 = (wb) ((Object) this.field_Q.b((byte) 88));
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
              L3: {
                if (param0 <= -50) {
                  break L3;
                } else {
                  var4 = (int[]) null;
                  this.a((int[]) null, false);
                  break L3;
                }
              }
              this.field_Q.d(-1);
              iq.a(-6, (byte) 99);
              break L1;
            }
            return;
          }
        } else {
          return;
        }
    }

    final void c(int param0, int param1, int param2) {
        op.field_m.field_a[param0] = param1;
        if (param2 != -2) {
            this.field_O = (th) null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        wb var6 = null;
        gm var7 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var6 = op.field_m.a(param2, false);
              var7 = op.field_m.a(param4, -81);
              if (var6 == null) {
                break L1;
              } else {
                if (var7 != null) {
                  L2: {
                    if (param0 == -1181) {
                      break L2;
                    } else {
                      field_r = (String) null;
                      break L2;
                    }
                  }
                  var6.field_z = param3 << 132771312;
                  var6.field_Eb = var7;
                  var6.field_E = param1 << 602554864;
                  var7.n(20);
                  var6.b(8, param0 ^ 26778);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          return;
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void b(boolean param0) {
        int fieldTemp$1 = 0;
        wb var2 = null;
        int var3 = 0;
        wb var4 = null;
        wb var5 = null;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0) {
          L0: {
            L1: {
              if (op.field_m.field_l != 0) {
                break L1;
              } else {
                if ((this.field_W ^ -1) <= -401) {
                  this.a((byte) -25, 1, op.field_m.field_C);
                  if (var3 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                } else {
                  break L0;
                }
              }
            }
            L2: {
              L3: {
                if (op.field_m.field_l == 3) {
                  break L3;
                } else {
                  if (op.field_m.field_c) {
                    break L3;
                  } else {
                    L4: {
                      if (-3 != (op.field_m.field_l ^ -1)) {
                        break L4;
                      } else {
                        if ((op.field_m.field_C - 1550 ^ -1) < (op.field_m.field_H ^ -1)) {
                          break L2;
                        } else {
                          L5: {
                            if (param0) {
                              stackOut_12_0 = 0;
                              stackIn_13_0 = stackOut_12_0;
                              break L5;
                            } else {
                              stackOut_11_0 = 1;
                              stackIn_13_0 = stackOut_11_0;
                              break L5;
                            }
                          }
                          cj.d(stackIn_13_0 != 0, 12);
                          if (var3 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (!df.field_I) {
                      break L2;
                    } else {
                      if (0 == op.field_m.field_m[this.field_M]) {
                        L6: {
                          if (!pp.field_n) {
                            break L6;
                          } else {
                            if (hg.field_rb == 11) {
                              break L6;
                            } else {
                              var4 = new wb(hc.field_c, gk.field_c, 0);
                              var2 = var4;
                              var2.field_Lb = this.field_M;
                              var2.field_y = op.field_m.a(-16777216);
                              op.field_m.field_K.a(-25612, var4);
                              op.field_m.field_m[this.field_M] = op.field_m.field_m[this.field_M] + 1;
                              var5 = new wb(hc.field_c, gk.field_c + -30, 1);
                              var2 = var5;
                              var2.field_Lb = this.field_M;
                              var2.field_y = op.field_m.a(-16777216);
                              op.field_m.field_K.a(-25612, var5);
                              op.field_m.field_m[this.field_M] = op.field_m.field_m[this.field_M] + 1;
                              iq.a(-12, (byte) 99);
                              if (var3 == 0) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        L7: {
                          L8: {
                            L9: {
                              if (-22 != (ai.field_b ^ -1)) {
                                break L9;
                              } else {
                                if ((hg.field_rb ^ -1) == -12) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            ec.field_c = false;
                            if (var3 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                          ud.field_S = true;
                          ec.field_c = true;
                          break L7;
                        }
                        wb.l((byte) 123);
                        bm.a(false, 15, 126, sp.field_g);
                        return;
                      } else {
                        break L0;
                      }
                    }
                  }
                }
              }
              this.field_eb = false;
              fieldTemp$1 = this.field_d;
              this.field_d = this.field_d - 1;
              if (0 == fieldTemp$1) {
                bm.a(false, 10, 126, sp.field_g);
                break L2;
              } else {
                break L0;
              }
            }
            break L0;
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        wb var10 = null;
        var10 = op.field_m.a(param0, false);
        if (var10 == null) {
          return;
        } else {
          L0: {
            L1: {
              if (23 == param7) {
                break L1;
              } else {
                if ((param7 ^ -1) == -29) {
                  break L1;
                } else {
                  if (param7 == 15) {
                    break L1;
                  } else {
                    if (27 == param7) {
                      break L1;
                    } else {
                      if (17 == param7) {
                        break L1;
                      } else {
                        if (25 == param7) {
                          break L1;
                        } else {
                          if (-14 == (param7 ^ -1)) {
                            break L1;
                          } else {
                            if (29 == param7) {
                              break L1;
                            } else {
                              if ((param7 ^ -1) == -34) {
                                break L1;
                              } else {
                                L2: {
                                  if (var10.field_K != 5) {
                                    break L2;
                                  } else {
                                    if (-5 == (param7 ^ -1)) {
                                      return;
                                    } else {
                                      break L2;
                                    }
                                  }
                                }
                                L3: {
                                  if ((param7 ^ -1) != (var10.field_K ^ -1)) {
                                    var10.b(param7, -27655);
                                    break L3;
                                  } else {
                                    break L3;
                                  }
                                }
                                var10.field_E = param6;
                                var10.field_z = param1;
                                var10.a(this.field_u.b(var10.g(-116), param4, var10.h(param2 + -65), param5, 8760), 88);
                                var10.d(6, param3);
                                if (!ZombieDawnMulti.field_E) {
                                  break L0;
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
                }
              }
            }
            var10.b(param7, -27655);
            break L0;
          }
          L4: {
            if (param2 == -34) {
              break L4;
            } else {
              this.c(false, -121);
              break L4;
            }
          }
          return;
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            L2: {
              L3: {
                var5 = ZombieDawnMulti.field_E ? 1 : 0;
                en.a(-1, 0);
                var4 = this.field_n;
                if (var4 != 0) {
                  break L3;
                } else {
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (-2 != (var4 ^ -1)) {
                break L0;
              } else {
                if (var5 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (this.field_I.h(1)) {
              return;
            } else {
              this.b(-93);
              if (var5 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (!this.field_I.h(1)) {
            if (0 >= this.field_Q.a((byte) 98)) {
              break L0;
            } else {
              if (40 >= param1) {
                break L0;
              } else {
                if (param1 >= 440) {
                  break L0;
                } else {
                  this.b((byte) 104, this.field_k.a(true, param1), this.field_k.a(param2, 2));
                  break L0;
                }
              }
            }
          } else {
            return;
          }
        }
        L4: {
          if (param0) {
            break L4;
          } else {
            this.field_i = (int[]) null;
            break L4;
          }
        }
    }

    final int g(int param0) {
        int var2 = 25 / ((-72 - param0) / 49);
        return wq.field_a;
    }

    private final void d(int param0, int param1, int param2) {
        int var4 = 0;
        if (param2 == -30305) {
          L0: {
            L1: {
              var4 = param0;
              if (1 == var4) {
                break L1;
              } else {
                if (-3 != (var4 ^ -1)) {
                  break L0;
                } else {
                  if (!ZombieDawnMulti.field_E) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            op.field_m.field_H = param1;
            break L0;
          }
          return;
        } else {
          return;
        }
    }

    private final boolean c(byte param0) {
        int var2 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = -104 % ((param0 - 59) / 39);
            if ((op.field_m.field_l ^ -1) == -2) {
              break L1;
            } else {
              if (-3 != (op.field_m.field_l ^ -1)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = 1;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    final static cj a(int param0, fm param1, int param2, int param3, int param4, int param5, int param6, byte param7, int param8, int param9, int param10, int param11, int param12) {
        cj var13 = null;
        RuntimeException var13_ref = null;
        int var14 = 0;
        cj stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        cj stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var13 = new cj(0L, (cj) null);
            var14 = -121 % ((param7 - 81) / 36);
            var13.field_ab = bk.a(param3, param6, (byte) 28);
            var13.field_X = bk.a(param4, param11, (byte) 28);
            var13.field_S = bk.a(param9, param0, (byte) 28);
            var13.field_gb = bk.a(param12, param5, (byte) 28);
            var13.field_Bb = bk.a(param2, param10, (byte) 28);
            var13.field_yb = param1;
            var13.field_M = param8;
            stackOut_0_0 = (cj) (var13);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var13_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var13_ref);
            stackOut_2_1 = new StringBuilder().append("qd.N(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
        return stackIn_1_0;
    }

    final void b(byte param0) {
        this.field_n = ll.field_k.b((byte) -1);
        int var2 = -91 % ((param0 - -12) / 44);
    }

    final void a(int param0, boolean param1, int param2, byte param3, int param4) {
        int[] var7 = null;
        int var8 = 0;
        br var9_ref_br = null;
        int var9 = 0;
        ti var10 = null;
        int var11 = 0;
        int var12 = 0;
        wb var13 = null;
        int var14 = 0;
        ti[] var15 = null;
        Object var16 = null;
        ti var16_ref = null;
        int[] var17 = null;
        ti var18 = null;
        ti[] var19 = null;
        int[] var20 = null;
        boolean stackIn_5_0 = false;
        int stackIn_19_0 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_18_0 = 0;
        var16 = null;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        g.field_a.setSeed((long)(param4 + ((param2 << 1155952741) + param0)));
        if (param3 == -40) {
          var15 = new ti[this.field_H.a(0)];
          var19 = var15;
          var20 = new int[this.field_H.a(0)];
          var17 = var20;
          var7 = var17;
          d.a(var7, 0, var20.length, 32767);
          var8 = 0;
          var9_ref_br = this.field_H.c(94);
          L0: while (true) {
            L1: {
              L2: {
                if (!(var9_ref_br instanceof id)) {
                  break L2;
                } else {
                  stackOut_4_0 = var9_ref_br instanceof ti;
                  stackIn_19_0 = stackOut_4_0 ? 1 : 0;
                  stackIn_5_0 = stackOut_4_0;
                  if (var14 != 0) {
                    break L1;
                  } else {
                    L3: {
                      L4: {
                        if (stackIn_5_0) {
                          break L4;
                        } else {
                          if (var14 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var16_ref = (ti) ((Object) var9_ref_br);
                      var18 = var16_ref;
                      var11 = var18.g(108) + -param0;
                      var12 = -param2 + var18.h(-102);
                      if (14400 < var12 * var12 + var11 * var11) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            if (!param1) {
                              break L6;
                            } else {
                              if (var18 instanceof wb) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          if (var18 instanceof gm) {
                            var15[var8] = var16_ref;
                            var7[var8] = var16_ref.field_y;
                            var8++;
                            if (var14 == 0) {
                              break L3;
                            } else {
                              break L5;
                            }
                          } else {
                            break L3;
                          }
                        }
                        var13 = (wb) ((Object) var18);
                        if ((var13.field_Lb ^ -1) == (param4 ^ -1)) {
                          break L3;
                        } else {
                          var15[var8] = (ti) ((Object) var13);
                          var7[var8] = var13.field_y;
                          var8++;
                          break L3;
                        }
                      }
                    }
                    var9_ref_br = this.field_H.b(6);
                    if (var14 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              vh.a(-7255, var20, var19);
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              break L1;
            }
            var9 = stackIn_19_0;
            L7: while (true) {
              L8: {
                if (var8 <= var9) {
                  break L8;
                } else {
                  var10 = var15[var9];
                  if (var14 != 0) {
                    break L8;
                  } else {
                    L9: {
                      L10: {
                        if (!(var10 instanceof wb)) {
                          break L10;
                        } else {
                          if (op.field_m.b(param3 ^ -40, ((wb) ((Object) var10)).field_Lb)) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      var15[var9].e(param4, 2);
                      break L9;
                    }
                    var9++;
                    if (var14 == 0) {
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
        } else {
          return;
        }
    }

    final static void c(int param0) {
        cj discarded$0 = null;
        ki.field_e = new no(wa.field_a, kc.field_c, jf.field_a, vo.field_m, jk.field_h, cm.field_b);
        if (param0 != 4024) {
            discarded$0 = qd.a(-96, (fm) null, 119, -9, -35, -122, 29, (byte) 90, -18, -112, -60, -50, 117);
        }
    }

    final void a(boolean param0, int param1, boolean param2) {
        gj.a(param1 + -17333);
        if (!(!this.field_lb)) {
            return;
        }
        this.field_lb = true;
        if (param1 != 24295) {
            this.d(27, 73);
        }
        bm.a(false, 10, 126, sp.field_g);
    }

    private final void a(int param0, byte param1, int param2) {
        int var5 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!na.b(param2, 20, param0)) {
          L0: {
            L1: {
              if (iq.field_f) {
                break L1;
              } else {
                if (this.field_I.b(param0, 0, param2)) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (!this.field_I.a(20)) {
                  break L3;
                } else {
                  if (this.field_mb == null) {
                    break L3;
                  } else {
                    if (!this.field_mb.i((byte) -15)) {
                      this.field_I.a(this.field_k.a(true, param0), this.field_mb, this.field_k.a(param2, 2), 122);
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L0;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L4: {
                if (!this.field_I.a(20)) {
                  break L4;
                } else {
                  if (this.field_b == null) {
                    break L4;
                  } else {
                    this.field_I.a(this.field_k.a(true, param0), this.field_b, this.field_k.a(param2, 2), 123);
                    if (var5 == 0) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              L5: {
                if (!this.field_I.a(true)) {
                  break L5;
                } else {
                  if (this.field_mb == null) {
                    break L5;
                  } else {
                    if (this.field_mb.i((byte) -58)) {
                      L6: {
                        if (this.field_I.a((byte) -126)) {
                          break L6;
                        } else {
                          this.b(-70);
                          break L6;
                        }
                      }
                      L7: {
                        this.field_Q.a(29664, this.field_mb);
                        if (!this.field_I.a((byte) -115)) {
                          this.field_mb.r(0);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      this.field_I.a(this.field_k.a(true, param0), this.field_mb, this.field_k.a(param2, 2), 122);
                      return;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              L8: {
                L9: {
                  if (!this.field_I.g(13)) {
                    break L9;
                  } else {
                    if (this.field_x != null) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                if (!this.field_I.f(0)) {
                  L10: {
                    if (this.field_mb == null) {
                      break L10;
                    } else {
                      if (!this.field_mb.i((byte) -86)) {
                        break L10;
                      } else {
                        L11: {
                          if (lc.field_m[81]) {
                            break L11;
                          } else {
                            this.b(-51);
                            break L11;
                          }
                        }
                        this.field_mb.r(0);
                        this.field_Q.a(29664, this.field_mb);
                        iq.a(-3, (byte) 99);
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  L12: {
                    L13: {
                      if ((this.field_n ^ -1) != -1) {
                        break L13;
                      } else {
                        if (-1 > (this.field_Q.a((byte) 98) ^ -1)) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    if (this.field_n == 1) {
                      this.b(-128);
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L12;
                      }
                    } else {
                      break L2;
                    }
                  }
                  if (this.field_I.a((byte) -127)) {
                    break L2;
                  } else {
                    if (-41 <= (param0 ^ -1)) {
                      break L2;
                    } else {
                      if (440 <= param0) {
                        break L2;
                      } else {
                        this.b((byte) 57, this.field_k.a(true, param0), this.field_k.a(param2, 2));
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                } else {
                  if (bk.field_g) {
                    this.field_I.a(this.field_k.a(true, param0), this.field_x, this.field_k.a(param2, 2), 127);
                    return;
                  } else {
                    return;
                  }
                }
              }
              this.b(-56);
              this.field_I.a(this.field_k.a(true, param0), this.field_x, this.field_k.a(param2, 2), 117);
              return;
            }
            L14: {
              if (param1 <= -97) {
                break L14;
              } else {
                this.field_I = (ko) null;
                break L14;
              }
            }
            return;
          }
          en.a(-1, 1);
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        boolean discarded$0 = false;
        op.field_m.field_A.a(new cg(param3, param1, param2), false);
        if (param0 < 79) {
            discarded$0 = this.c((byte) -123);
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4_int = 0;
        id var4 = null;
        br var4_ref = null;
        wb var5 = null;
        int var6 = 0;
        L0: {
          var6 = ZombieDawnMulti.field_E ? 1 : 0;
          op.field_m.field_l = param1;
          if (param0 <= -8) {
            break L0;
          } else {
            this.b((byte) -48);
            break L0;
          }
        }
        L1: {
          var4_int = op.field_m.field_l;
          if (var4_int == 0) {
            break L1;
          } else {
            L2: {
              L3: {
                if (2 == var4_int) {
                  break L3;
                } else {
                  if (var4_int == 1) {
                    break L2;
                  } else {
                    if (3 != var4_int) {
                      break L2;
                    } else {
                      if (var6 == 0) {
                        we.field_g[7] = pi.field_b;
                        var4_ref = op.field_m.field_K.c(86);
                        L4: while (true) {
                          if (var4_ref == null) {
                            break L2;
                          } else {
                            if (var6 != 0) {
                              break L1;
                            } else {
                              L5: {
                                if (!(var4_ref instanceof wb)) {
                                  break L5;
                                } else {
                                  var5 = (wb) ((Object) var4_ref);
                                  if (var5.field_K == 21) {
                                    break L5;
                                  } else {
                                    var5.b(4, -27655);
                                    break L5;
                                  }
                                }
                              }
                              var4_ref = op.field_m.field_K.b(6);
                              if (var6 == 0) {
                                continue L4;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              if (df.field_I) {
                wb.l((byte) -68);
                bm.a(false, 15, 125, sp.field_g);
                return;
              } else {
                var4 = (id) ((Object) this.field_c.c((byte) 91));
                L6: while (true) {
                  L7: {
                    if (var4 == null) {
                      break L7;
                    } else {
                      ((h) ((Object) var4)).c(2, 49951);
                      var4 = (id) ((Object) this.field_c.b((byte) 117));
                      if (var6 != 0) {
                        break L2;
                      } else {
                        if (var6 == 0) {
                          continue L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  op.field_m.field_C = param2;
                  break L1;
                }
              }
            }
            break L1;
          }
        }
    }

    final void b(boolean param0, int param1) {
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        int var7 = 0;
        int var8_int = 0;
        sl var8 = null;
        int var9_int = 0;
        int[] var9 = null;
        ae var9_ref = null;
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
        int[] var21 = null;
        Object var22 = null;
        lc var22_ref = null;
        Object var23 = null;
        wb var23_ref = null;
        Object var24 = null;
        wb var24_ref = null;
        h var25 = null;
        Object var26 = null;
        h var26_ref = null;
        String var27 = null;
        boolean stackIn_61_0 = false;
        boolean stackIn_65_0 = false;
        int stackIn_71_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        int stackIn_85_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_90_2 = 0;
        int stackIn_90_3 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        int stackIn_91_2 = 0;
        int stackIn_91_3 = 0;
        int stackIn_92_0 = 0;
        int stackIn_92_1 = 0;
        int stackIn_92_2 = 0;
        int stackIn_92_3 = 0;
        int stackIn_92_4 = 0;
        int stackIn_96_0 = 0;
        int stackIn_99_0 = 0;
        boolean stackIn_126_0 = false;
        int stackIn_132_0 = 0;
        boolean stackIn_154_0 = false;
        int stackIn_180_0 = 0;
        int stackIn_184_0 = 0;
        int stackIn_184_1 = 0;
        int stackIn_196_0 = 0;
        int stackIn_197_0 = 0;
        int stackIn_197_1 = 0;
        int stackIn_247_0 = 0;
        int stackIn_248_0 = 0;
        int stackIn_248_1 = 0;
        int stackIn_249_0 = 0;
        int stackIn_249_1 = 0;
        int stackIn_250_0 = 0;
        int stackIn_250_1 = 0;
        int stackIn_250_2 = 0;
        boolean stackOut_60_0 = false;
        boolean stackOut_64_0 = false;
        int stackOut_70_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_82_1 = 0;
        int stackOut_84_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_87_1 = 0;
        int stackOut_89_0 = 0;
        int stackOut_89_1 = 0;
        int stackOut_89_2 = 0;
        int stackOut_89_3 = 0;
        int stackOut_91_0 = 0;
        int stackOut_91_1 = 0;
        int stackOut_91_2 = 0;
        int stackOut_91_3 = 0;
        int stackOut_91_4 = 0;
        int stackOut_90_0 = 0;
        int stackOut_90_1 = 0;
        int stackOut_90_2 = 0;
        int stackOut_90_3 = 0;
        int stackOut_90_4 = 0;
        int stackOut_95_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_97_0 = 0;
        boolean stackOut_125_0 = false;
        int stackOut_131_0 = 0;
        int stackOut_130_0 = 0;
        boolean stackOut_153_0 = false;
        int stackOut_179_0 = 0;
        int stackOut_183_0 = 0;
        int stackOut_183_1 = 0;
        int stackOut_195_0 = 0;
        int stackOut_196_0 = 0;
        int stackOut_196_1 = 0;
        int stackOut_246_0 = 0;
        int stackOut_245_0 = 0;
        int stackOut_247_0 = 0;
        int stackOut_247_1 = 0;
        int stackOut_249_0 = 0;
        int stackOut_249_1 = 0;
        int stackOut_249_2 = 0;
        int stackOut_248_0 = 0;
        int stackOut_248_1 = 0;
        int stackOut_248_2 = 0;
        L0: {
          L1: {
            var22 = null;
            var23 = null;
            var24 = null;
            var26 = null;
            var20 = ZombieDawnMulti.field_E ? 1 : 0;
            g.c(ki.field_k);
            if (he.field_a) {
              break L1;
            } else {
              oo.h(0, 40, (int)(640.0f * this.field_k.field_d), (int)(480.0f * this.field_k.field_d) + -40);
              if (var20 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          oo.c();
          break L0;
        }
        L2: {
          L3: {
            var3 = 0;
            var4 = 0;
            var5 = oa.a((byte) 71);
            if ((var5 ^ -1) < -1) {
              break L3;
            } else {
              var3 = this.field_k.field_k;
              var4 = this.field_k.field_g;
              if (null == lp.field_k) {
                break L2;
              } else {
                aa.a(true, lp.field_k);
                lp.field_k = null;
                if (var20 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
          }
          L4: {
            if (null != lp.field_k) {
              break L4;
            } else {
              lp.field_k = wc.b(-1, 89);
              break L4;
            }
          }
          lp.field_k.h(20 * var5 * db.field_c / 256);
          var3 = -(var5 / 2) + (this.field_k.field_k + hp.a((byte) -123, qf.field_a, var5));
          var4 = -(var5 / 2) + (this.field_k.field_g + hp.a((byte) 36, qf.field_a, var5));
          this.field_k.field_g = var4;
          this.field_k.field_k = var3;
          break L2;
        }
        this.field_u.a((byte) 111, this.field_k);
        var6 = op.field_m.field_A.c(98);
        L5: while (true) {
          L6: {
            L7: {
              if (var6 == null) {
                break L7;
              } else {
                ((cg) (var6)).a(this.field_k, param1 + 58);
                var6 = op.field_m.field_A.b(6);
                if (var20 != 0) {
                  break L6;
                } else {
                  if (var20 == 0) {
                    continue L5;
                  } else {
                    break L7;
                  }
                }
              }
            }
            var6 = this.field_cb.c(122);
            break L6;
          }
          L8: while (true) {
            L9: {
              L10: {
                if (var6 == null) {
                  break L10;
                } else {
                  ((rj) (var6)).a(-10136, this.field_k);
                  var6 = this.field_cb.b(6);
                  if (var20 != 0) {
                    break L9;
                  } else {
                    if (var20 == 0) {
                      continue L8;
                    } else {
                      break L10;
                    }
                  }
                }
              }
              var6 = this.field_c.c((byte) 104);
              L11: while (true) {
                L12: {
                  if (var6 == null) {
                    break L12;
                  } else {
                    ((h) (var6)).a(this.field_k, 13542477);
                    var6 = this.field_c.b((byte) 101);
                    if (var20 != 0) {
                      break L9;
                    } else {
                      if (var20 == 0) {
                        continue L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                }
                var6 = op.field_m.field_G.c(113);
                break L9;
              }
            }
            L13: while (true) {
              L14: {
                L15: {
                  if (var6 == null) {
                    break L15;
                  } else {
                    ((pq) (var6)).a(255, this.field_k);
                    var6 = op.field_m.field_G.b(param1 ^ 7);
                    if (var20 != 0) {
                      break L14;
                    } else {
                      if (var20 == 0) {
                        continue L13;
                      } else {
                        break L15;
                      }
                    }
                  }
                }
                this.field_u.a(param1, false, this.field_k, -1);
                break L14;
              }
              var6 = op.field_m.field_s.c(param1 ^ 116);
              L16: while (true) {
                L17: {
                  L18: {
                    if (var6 == null) {
                      break L18;
                    } else {
                      ((ce) (var6)).a((byte) 19, this.field_k);
                      var6 = op.field_m.field_s.b(param1 ^ 7);
                      if (var20 != 0) {
                        break L17;
                      } else {
                        if (var20 == 0) {
                          continue L16;
                        } else {
                          break L18;
                        }
                      }
                    }
                  }
                  var6 = this.field_H.c(48);
                  break L17;
                }
                L19: while (true) {
                  L20: {
                    L21: {
                      if (var6 == null) {
                        break L21;
                      } else {
                        ((id) (var6)).a(-10136, this.field_k);
                        var6 = this.field_H.b(param1 ^ 7);
                        if (var20 != 0) {
                          break L20;
                        } else {
                          if (var20 == 0) {
                            continue L19;
                          } else {
                            break L21;
                          }
                        }
                      }
                    }
                    var6 = this.field_kb.c(103);
                    break L20;
                  }
                  L22: while (true) {
                    L23: {
                      L24: {
                        if (var6 == null) {
                          break L24;
                        } else {
                          ((mg) (var6)).a(-10136, this.field_k);
                          var6 = this.field_kb.b(6);
                          if (var20 != 0) {
                            break L23;
                          } else {
                            if (var20 == 0) {
                              continue L22;
                            } else {
                              break L24;
                            }
                          }
                        }
                      }
                      var6 = this.field_O.c(88);
                      break L23;
                    }
                    L25: while (true) {
                      L26: {
                        L27: {
                          if (var6 == null) {
                            break L27;
                          } else {
                            ((lj) (var6)).a((byte) 103, this.field_k);
                            var6 = this.field_O.b(6);
                            if (var20 != 0) {
                              break L26;
                            } else {
                              if (var20 == 0) {
                                continue L25;
                              } else {
                                break L27;
                              }
                            }
                          }
                        }
                        this.field_u.a(2, false, this.field_k, -1);
                        this.field_u.a(3, false, this.field_k, -1);
                        break L26;
                      }
                      var6 = this.field_C.c(param1 + 107);
                      L28: while (true) {
                        L29: {
                          L30: {
                            if (var6 == null) {
                              break L30;
                            } else {
                              var22_ref = (lc) (var6);
                              stackOut_60_0 = var22_ref.a(16711680, this.field_k);
                              stackIn_65_0 = stackOut_60_0;
                              stackIn_61_0 = stackOut_60_0;
                              if (var20 != 0) {
                                break L29;
                              } else {
                                L31: {
                                  if (stackIn_61_0) {
                                    break L31;
                                  } else {
                                    var22_ref.a(true);
                                    this.field_X.a(var22_ref, false);
                                    break L31;
                                  }
                                }
                                var6 = this.field_C.b(6);
                                if (var20 == 0) {
                                  continue L28;
                                } else {
                                  break L30;
                                }
                              }
                            }
                          }
                          stackOut_64_0 = gf.field_h;
                          stackIn_65_0 = stackOut_64_0;
                          break L29;
                        }
                        L32: {
                          if (stackIn_65_0) {
                            break L32;
                          } else {
                            L33: {
                              L34: {
                                var7 = this.field_I.b(false);
                                if (-1 <= (var7 ^ -1)) {
                                  break L34;
                                } else {
                                  if (6 == wf.field_t) {
                                    break L34;
                                  } else {
                                    L35: {
                                      if ((this.field_I.e(-1) ^ -1) != -10) {
                                        stackOut_70_0 = 0;
                                        stackIn_71_0 = stackOut_70_0;
                                        break L35;
                                      } else {
                                        stackOut_69_0 = 1;
                                        stackIn_71_0 = stackOut_69_0;
                                        break L35;
                                      }
                                    }
                                    L36: {
                                      var8_int = stackIn_71_0;
                                      var9_int = this.field_k.a(-(int)((float)(24 * var7) / this.field_k.field_d) + bd.field_g, 2);
                                      var10 = this.field_k.a(true, bo.field_d - (int)((float)(var7 * 24) / this.field_k.field_d));
                                      var11 = var9_int / 24;
                                      var12 = var10 / 24;
                                      var13 = var12 - -(2 * var7);
                                      var14 = var11 - -(2 * var7);
                                      if (var13 > this.field_u.field_i.field_e) {
                                        var13 = this.field_u.field_i.field_e;
                                        break L36;
                                      } else {
                                        break L36;
                                      }
                                    }
                                    L37: {
                                      if (-1 >= (var12 ^ -1)) {
                                        break L37;
                                      } else {
                                        var12 = 0;
                                        break L37;
                                      }
                                    }
                                    L38: {
                                      if (0 > var11) {
                                        var11 = 0;
                                        break L38;
                                      } else {
                                        break L38;
                                      }
                                    }
                                    L39: {
                                      if ((this.field_u.field_i.field_d ^ -1) <= (var14 ^ -1)) {
                                        break L39;
                                      } else {
                                        var14 = this.field_u.field_i.field_d;
                                        break L39;
                                      }
                                    }
                                    var15 = var12;
                                    L40: while (true) {
                                      stackOut_82_0 = var15 ^ -1;
                                      stackOut_82_1 = var13 ^ -1;
                                      stackIn_83_0 = stackOut_82_0;
                                      stackIn_83_1 = stackOut_82_1;
                                      L41: while (true) {
                                        if (stackIn_83_0 <= stackIn_83_1) {
                                          break L34;
                                        } else {
                                          stackOut_84_0 = var11;
                                          stackIn_96_0 = stackOut_84_0;
                                          stackIn_85_0 = stackOut_84_0;
                                          if (var20 != 0) {
                                            break L33;
                                          } else {
                                            var16 = stackIn_85_0;
                                            L42: while (true) {
                                              L43: {
                                                if ((var14 ^ -1) >= (var16 ^ -1)) {
                                                  break L43;
                                                } else {
                                                  var17 = this.field_u.a(var16, var15, (byte) -116);
                                                  stackOut_87_0 = 0;
                                                  stackOut_87_1 = -2147483648 & var17;
                                                  stackIn_83_0 = stackOut_87_0;
                                                  stackIn_83_1 = stackOut_87_1;
                                                  stackIn_88_0 = stackOut_87_0;
                                                  stackIn_88_1 = stackOut_87_1;
                                                  if (var20 != 0) {
                                                    continue L41;
                                                  } else {
                                                    L44: {
                                                      if (stackIn_88_0 != stackIn_88_1) {
                                                        break L44;
                                                      } else {
                                                        L45: {
                                                          var18 = this.field_k.c(24 * var16, -20126);
                                                          var19 = this.field_k.d(24 * var15, param1 + 107);
                                                          stackOut_89_0 = var18;
                                                          stackOut_89_1 = var19;
                                                          stackOut_89_2 = 24;
                                                          stackOut_89_3 = 24;
                                                          stackIn_91_0 = stackOut_89_0;
                                                          stackIn_91_1 = stackOut_89_1;
                                                          stackIn_91_2 = stackOut_89_2;
                                                          stackIn_91_3 = stackOut_89_3;
                                                          stackIn_90_0 = stackOut_89_0;
                                                          stackIn_90_1 = stackOut_89_1;
                                                          stackIn_90_2 = stackOut_89_2;
                                                          stackIn_90_3 = stackOut_89_3;
                                                          if (var8_int != 0) {
                                                            stackOut_91_0 = stackIn_91_0;
                                                            stackOut_91_1 = stackIn_91_1;
                                                            stackOut_91_2 = stackIn_91_2;
                                                            stackOut_91_3 = stackIn_91_3;
                                                            stackOut_91_4 = 12272691;
                                                            stackIn_92_0 = stackOut_91_0;
                                                            stackIn_92_1 = stackOut_91_1;
                                                            stackIn_92_2 = stackOut_91_2;
                                                            stackIn_92_3 = stackOut_91_3;
                                                            stackIn_92_4 = stackOut_91_4;
                                                            break L45;
                                                          } else {
                                                            stackOut_90_0 = stackIn_90_0;
                                                            stackOut_90_1 = stackIn_90_1;
                                                            stackOut_90_2 = stackIn_90_2;
                                                            stackOut_90_3 = stackIn_90_3;
                                                            stackOut_90_4 = 3390259;
                                                            stackIn_92_0 = stackOut_90_0;
                                                            stackIn_92_1 = stackOut_90_1;
                                                            stackIn_92_2 = stackOut_90_2;
                                                            stackIn_92_3 = stackOut_90_3;
                                                            stackIn_92_4 = stackOut_90_4;
                                                            break L45;
                                                          }
                                                        }
                                                        oo.f(stackIn_92_0, stackIn_92_1, stackIn_92_2, stackIn_92_3, stackIn_92_4, 128);
                                                        break L44;
                                                      }
                                                    }
                                                    var16++;
                                                    if (var20 == 0) {
                                                      continue L42;
                                                    } else {
                                                      break L43;
                                                    }
                                                  }
                                                }
                                              }
                                              var15++;
                                              if (var20 == 0) {
                                                continue L40;
                                              } else {
                                                break L34;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_95_0 = 15;
                              stackIn_96_0 = stackOut_95_0;
                              break L33;
                            }
                            L46: {
                              if (stackIn_96_0 != this.field_I.e(-1)) {
                                stackOut_98_0 = 0;
                                stackIn_99_0 = stackOut_98_0;
                                break L46;
                              } else {
                                stackOut_97_0 = 1;
                                stackIn_99_0 = stackOut_97_0;
                                break L46;
                              }
                            }
                            var8_int = stackIn_99_0;
                            if (var8_int == 0) {
                              break L32;
                            } else {
                              L47: {
                                var9_int = this.field_k.a(bd.field_g + -(int)((float)(var7 * 24) / this.field_k.field_d), 2);
                                var10 = this.field_k.a(true, bo.field_d - (int)((float)(24 * var7) / this.field_k.field_d));
                                var11 = var9_int / 24;
                                var12 = var10 / 24;
                                var13 = var7 * 2 + var12;
                                if ((var13 ^ -1) < (this.field_u.field_i.field_e ^ -1)) {
                                  var13 = this.field_u.field_i.field_e;
                                  break L47;
                                } else {
                                  break L47;
                                }
                              }
                              L48: {
                                var14 = 2 * var7 + var11;
                                if (0 <= var12) {
                                  break L48;
                                } else {
                                  var12 = 0;
                                  break L48;
                                }
                              }
                              L49: {
                                if (var11 >= 0) {
                                  break L49;
                                } else {
                                  var11 = 0;
                                  break L49;
                                }
                              }
                              L50: {
                                if ((this.field_u.field_i.field_d ^ -1) > (var14 ^ -1)) {
                                  var14 = this.field_u.field_i.field_d;
                                  break L50;
                                } else {
                                  break L50;
                                }
                              }
                              var15 = var14 + var11 >> 651265057;
                              var16 = var12 - -var13 >> -2065404287;
                              var17 = this.field_k.c(24 * var15, -20126);
                              var18 = this.field_k.d(var16 * 24, 126);
                              oo.d(var17, var18, 120, 0, 128);
                              break L32;
                            }
                          }
                        }
                        L51: {
                          if ((1280 / ke.field_b ^ -1) == (so.field_l.field_x ^ -1)) {
                            break L51;
                          } else {
                            L52: {
                              if (-3 >= (kj.field_q ^ -1)) {
                                System.out.println("realloc influence buffer, detail " + ke.field_b);
                                break L52;
                              } else {
                                break L52;
                              }
                            }
                            so.field_l = new ja(1280 / ke.field_b, 960 / ke.field_b);
                            break L51;
                          }
                        }
                        L53: {
                          L54: {
                            L55: {
                              L56: {
                                if (!gf.field_h) {
                                  break L56;
                                } else {
                                  var7 = 0;
                                  L57: while (true) {
                                    L58: {
                                      L59: {
                                        if ((op.field_m.field_m.length ^ -1) >= (var7 ^ -1)) {
                                          break L59;
                                        } else {
                                          op.field_m.field_m[var7] = 0;
                                          var7++;
                                          if (var20 != 0) {
                                            break L58;
                                          } else {
                                            if (var20 == 0) {
                                              continue L57;
                                            } else {
                                              break L59;
                                            }
                                          }
                                        }
                                      }
                                      var6 = this.field_H.c(123);
                                      break L58;
                                    }
                                    L60: while (true) {
                                      if (var6 == null) {
                                        break L55;
                                      } else {
                                        stackOut_125_0 = var6 instanceof wb;
                                        stackIn_196_0 = stackOut_125_0 ? 1 : 0;
                                        stackIn_126_0 = stackOut_125_0;
                                        if (var20 != 0) {
                                          break L54;
                                        } else {
                                          L61: {
                                            if (!stackIn_126_0) {
                                              break L61;
                                            } else {
                                              var23_ref = (wb) (var6);
                                              op.field_m.field_m[var23_ref.field_Lb] = op.field_m.field_m[var23_ref.field_Lb] + 1;
                                              break L61;
                                            }
                                          }
                                          var6 = this.field_H.b(6);
                                          if (var20 == 0) {
                                            continue L60;
                                          } else {
                                            break L56;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L62: {
                                var7 = 4210753;
                                if (-2 == (ll.field_k.field_k ^ -1)) {
                                  stackOut_131_0 = 0;
                                  stackIn_132_0 = stackOut_131_0;
                                  break L62;
                                } else {
                                  stackOut_130_0 = 1;
                                  stackIn_132_0 = stackOut_130_0;
                                  break L62;
                                }
                              }
                              L63: {
                                var8_int = stackIn_132_0;
                                if (var8_int != 0) {
                                  var21 = so.field_l.field_B;
                                  var9 = var21;
                                  var10 = 0;
                                  var11 = so.field_l.field_x * so.field_l.field_w - 7;
                                  L64: while (true) {
                                    L65: {
                                      L66: {
                                        if (var10 >= var11) {
                                          break L66;
                                        } else {
                                          incrementValue$9 = var10;
                                          var10++;
                                          var21[incrementValue$9] = var7;
                                          incrementValue$10 = var10;
                                          var10++;
                                          var21[incrementValue$10] = var7;
                                          incrementValue$11 = var10;
                                          var10++;
                                          var21[incrementValue$11] = var7;
                                          incrementValue$12 = var10;
                                          var10++;
                                          var21[incrementValue$12] = var7;
                                          incrementValue$13 = var10;
                                          var10++;
                                          var21[incrementValue$13] = var7;
                                          incrementValue$14 = var10;
                                          var10++;
                                          var21[incrementValue$14] = var7;
                                          incrementValue$15 = var10;
                                          var10++;
                                          var21[incrementValue$15] = var7;
                                          incrementValue$16 = var10;
                                          var10++;
                                          var21[incrementValue$16] = var7;
                                          if (var20 != 0) {
                                            break L65;
                                          } else {
                                            if (var20 == 0) {
                                              continue L64;
                                            } else {
                                              break L66;
                                            }
                                          }
                                        }
                                      }
                                      var11 += 7;
                                      break L65;
                                    }
                                    L67: while (true) {
                                      if (var10 >= var11) {
                                        break L63;
                                      } else {
                                        incrementValue$17 = var10;
                                        var10++;
                                        var21[incrementValue$17] = var7;
                                        if (var20 != 0) {
                                          break L55;
                                        } else {
                                          if (var20 == 0) {
                                            continue L67;
                                          } else {
                                            break L63;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L63;
                                }
                              }
                              var9_int = 0;
                              L68: while (true) {
                                L69: {
                                  L70: {
                                    if ((op.field_m.field_m.length ^ -1) >= (var9_int ^ -1)) {
                                      break L70;
                                    } else {
                                      op.field_m.field_m[var9_int] = 0;
                                      var9_int++;
                                      if (var20 != 0) {
                                        break L69;
                                      } else {
                                        if (var20 == 0) {
                                          continue L68;
                                        } else {
                                          break L70;
                                        }
                                      }
                                    }
                                  }
                                  var9_int = 350;
                                  var9_int = var9_int / ke.field_b;
                                  break L69;
                                }
                                var6 = this.field_H.c(param1 + 113);
                                L71: while (true) {
                                  L72: {
                                    L73: {
                                      if (var6 == null) {
                                        break L73;
                                      } else {
                                        stackOut_153_0 = var6 instanceof wb;
                                        stackIn_180_0 = stackOut_153_0 ? 1 : 0;
                                        stackIn_154_0 = stackOut_153_0;
                                        if (var20 != 0) {
                                          break L72;
                                        } else {
                                          L74: {
                                            if (!stackIn_154_0) {
                                              break L74;
                                            } else {
                                              L75: {
                                                L76: {
                                                  var24_ref = (wb) (var6);
                                                  var11 = this.field_k.c(var24_ref.g(-79), -20126);
                                                  var12 = this.field_k.d(var24_ref.h(-71), 114);
                                                  op.field_m.field_m[var24_ref.field_Lb] = op.field_m.field_m[var24_ref.field_Lb] + 1;
                                                  if (var24_ref.field_K == 4) {
                                                    break L76;
                                                  } else {
                                                    if (-6 == (var24_ref.field_K ^ -1)) {
                                                      break L76;
                                                    } else {
                                                      if (22 == var24_ref.field_K) {
                                                        break L76;
                                                      } else {
                                                        if ((var24_ref.field_Ib ^ -1) >= (op.field_m.field_H ^ -1)) {
                                                          break L75;
                                                        } else {
                                                          break L76;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                var24_ref.a(true, this.field_k);
                                                if (-1 != ((var24_ref.field_Ib + var24_ref.field_y) % 7 ^ -1)) {
                                                  break L75;
                                                } else {
                                                  if ((var24_ref.field_K ^ -1) != -6) {
                                                    break L75;
                                                  } else {
                                                    if ((var24_ref.field_Ib ^ -1) >= (op.field_m.field_H ^ -1)) {
                                                      break L75;
                                                    } else {
                                                      L77: {
                                                        L78: {
                                                          L79: {
                                                            var13 = (3 + var24_ref.field_y) * var24_ref.field_Ib % he.field_b.length;
                                                            if (0 != var13) {
                                                              break L79;
                                                            } else {
                                                              if (!q.field_b) {
                                                                break L78;
                                                              } else {
                                                                break L79;
                                                              }
                                                            }
                                                          }
                                                          if ((var13 ^ -1) != -2) {
                                                            break L77;
                                                          } else {
                                                            if (!q.field_b) {
                                                              break L77;
                                                            } else {
                                                              var13 = 0;
                                                              if (var20 == 0) {
                                                                break L77;
                                                              } else {
                                                                break L78;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var13 = 1;
                                                        break L77;
                                                      }
                                                      pb.field_e.a(he.field_b[var13], var11, -48 + var12, 14540253, 0, 253);
                                                      break L75;
                                                    }
                                                  }
                                                }
                                              }
                                              if (var8_int != 0) {
                                                if (var24_ref.field_K == 9) {
                                                  break L74;
                                                } else {
                                                  if (var24_ref.field_K == 21) {
                                                    break L74;
                                                  } else {
                                                    if (var24_ref.i((byte) 0)) {
                                                      g.c(so.field_l);
                                                      oo.d(var11 / ke.field_b, var12 / ke.field_b, var9_int, 0);
                                                      g.d();
                                                      break L74;
                                                    } else {
                                                      break L74;
                                                    }
                                                  }
                                                }
                                              } else {
                                                break L74;
                                              }
                                            }
                                          }
                                          var6 = this.field_H.b(6);
                                          if (var20 == 0) {
                                            continue L71;
                                          } else {
                                            break L73;
                                          }
                                        }
                                      }
                                    }
                                    stackOut_179_0 = var8_int;
                                    stackIn_180_0 = stackOut_179_0;
                                    break L72;
                                  }
                                  L80: {
                                    if (stackIn_180_0 == 0) {
                                      break L80;
                                    } else {
                                      g.c(so.field_l);
                                      var25 = this.field_o;
                                      var11 = this.field_k.c(var25.g(param1 + -97), param1 + -20127);
                                      var12 = this.field_k.d(var25.h(-51), 108);
                                      oo.d(var11 / ke.field_b, var12 / ke.field_b, var9_int, 0);
                                      var6 = this.field_c.c((byte) 127);
                                      L81: while (true) {
                                        L82: {
                                          if (var6 == null) {
                                            break L82;
                                          } else {
                                            var26_ref = (h) (var6);
                                            stackOut_183_0 = var26_ref.field_I ^ -1;
                                            stackOut_183_1 = this.field_M ^ -1;
                                            stackIn_197_0 = stackOut_183_0;
                                            stackIn_197_1 = stackOut_183_1;
                                            stackIn_184_0 = stackOut_183_0;
                                            stackIn_184_1 = stackOut_183_1;
                                            if (var20 != 0) {
                                              break L53;
                                            } else {
                                              L83: {
                                                if (stackIn_184_0 == stackIn_184_1) {
                                                  break L83;
                                                } else {
                                                  var11 = this.field_k.c(var26_ref.g(param1 ^ -82), -20126);
                                                  var12 = this.field_k.d(var26_ref.h(103), 121);
                                                  oo.d(var11 / ke.field_b, var12 / ke.field_b, var9_int, var7);
                                                  break L83;
                                                }
                                              }
                                              var6 = this.field_c.b((byte) 96);
                                              if (var20 == 0) {
                                                continue L81;
                                              } else {
                                                break L82;
                                              }
                                            }
                                          }
                                        }
                                        g.d();
                                        so.field_l.a(0, 0, 1280, 960, 104);
                                        break L80;
                                      }
                                    }
                                  }
                                  this.field_J.a(this.field_k, (byte) 36);
                                  break L55;
                                }
                              }
                            }
                            var6 = this.field_T.c(104);
                            L84: while (true) {
                              L85: {
                                L86: {
                                  if (var6 == null) {
                                    break L86;
                                  } else {
                                    ((wc) (var6)).a(-10136, this.field_k);
                                    var6 = this.field_T.b(6);
                                    if (var20 != 0) {
                                      break L85;
                                    } else {
                                      if (var20 == 0) {
                                        continue L84;
                                      } else {
                                        break L86;
                                      }
                                    }
                                  }
                                }
                                g.d();
                                g.c();
                                this.a(true);
                                g.b();
                                break L85;
                              }
                              stackOut_195_0 = ub.p(-91);
                              stackIn_196_0 = stackOut_195_0;
                              break L54;
                            }
                          }
                          var7 = stackIn_196_0;
                          stackOut_196_0 = -1;
                          stackOut_196_1 = var7 ^ -1;
                          stackIn_197_0 = stackOut_196_0;
                          stackIn_197_1 = stackOut_196_1;
                          break L53;
                        }
                        L87: {
                          if (stackIn_197_0 <= stackIn_197_1) {
                            break L87;
                          } else {
                            L88: {
                              if (this.field_S == null) {
                                g.c(this.field_B);
                                this.field_S = new ea();
                                g.d();
                                this.field_i = nk.a(16777215, param1 + 455739623, 8401072);
                                break L88;
                              } else {
                                break L88;
                              }
                            }
                            L89: {
                              if (0 == (wf.field_m & 1)) {
                                g.c(this.field_B);
                                this.field_i = nk.a(2154560, 455739624, 16724223);
                                oo.b();
                                oo.e(0, 0, oo.field_b, oo.field_l, 1);
                                this.field_S.a(1, (double)wf.field_m / 6.25, this.field_i);
                                g.d();
                                break L89;
                              } else {
                                break L89;
                              }
                            }
                            L90: {
                              var8_int = 132;
                              if ((var8_int ^ -1) >= (var7 * 3 ^ -1)) {
                                break L90;
                              } else {
                                var8_int = var7 * 3;
                                break L90;
                              }
                            }
                            this.field_B.a(5, 40, 630, 400, 32 - -var8_int);
                            break L87;
                          }
                        }
                        L91: {
                          if (!this.field_eb) {
                            break L91;
                          } else {
                            if (this.field_w) {
                              break L91;
                            } else {
                              pp.field_q[8].a(bd.field_g - 12, -12 + bo.field_d);
                              break L91;
                            }
                          }
                        }
                        L92: {
                          if (!this.field_eb) {
                            break L92;
                          } else {
                            if (!this.field_w) {
                              break L92;
                            } else {
                              L93: {
                                L94: {
                                  var10 = bd.field_g - this.field_F;
                                  var11 = -this.field_p + bo.field_d;
                                  if (-1 >= (var10 ^ -1)) {
                                    break L94;
                                  } else {
                                    var10 = -var10;
                                    var8_int = bd.field_g;
                                    if (var20 == 0) {
                                      break L93;
                                    } else {
                                      break L94;
                                    }
                                  }
                                }
                                var8_int = this.field_F;
                                break L93;
                              }
                              L95: {
                                L96: {
                                  if (-1 >= (var11 ^ -1)) {
                                    break L96;
                                  } else {
                                    var11 = -var11;
                                    var9_int = bo.field_d;
                                    if (var20 == 0) {
                                      break L95;
                                    } else {
                                      break L96;
                                    }
                                  }
                                }
                                var9_int = this.field_p;
                                break L95;
                              }
                              oo.a(var8_int, var9_int, var10, var11, 16777215);
                              oo.h(var8_int + 1, 1 + var9_int, -2 + var10, var11 - 2, 10066431, 32);
                              oo.f(2 + var8_int, var9_int - -2, -4 + var10, -4 + var11, 3355647, 32);
                              break L92;
                            }
                          }
                        }
                        L97: {
                          L98: {
                            var8 = ah.field_e;
                            if (0 == op.field_m.field_l) {
                              break L98;
                            } else {
                              L99: {
                                if (3 != op.field_m.field_l) {
                                  break L99;
                                } else {
                                  if (-226 < (this.field_d ^ -1)) {
                                    var8.b(tm.field_g, 320, 240, 2, -1);
                                    if (var20 == 0) {
                                      break L97;
                                    } else {
                                      break L99;
                                    }
                                  } else {
                                    break L97;
                                  }
                                }
                              }
                              L100: {
                                if (gf.field_h) {
                                  break L100;
                                } else {
                                  if ((op.field_m.field_l ^ -1) != -2) {
                                    break L100;
                                  } else {
                                    if (op.field_m.field_H >= 500) {
                                      break L100;
                                    } else {
                                      var8.b(up.field_c, 320, 240, 0, -1);
                                      this.field_k.field_f = false;
                                      if (var20 == 0) {
                                        break L97;
                                      } else {
                                        break L100;
                                      }
                                    }
                                  }
                                }
                              }
                              if ((op.field_m.field_l ^ -1) != -3) {
                                break L97;
                              } else {
                                L101: {
                                  L102: {
                                    var9_int = op.field_m.field_C + -op.field_m.field_H;
                                    if (-1551 >= (var9_int ^ -1)) {
                                      break L102;
                                    } else {
                                      L103: {
                                        if (!gf.field_h) {
                                          break L103;
                                        } else {
                                          var8.b(gn.field_E, 320, 120, 0, -1);
                                          if (var20 == 0) {
                                            break L101;
                                          } else {
                                            break L103;
                                          }
                                        }
                                      }
                                      var8.b(sm.field_f, 320, 120, 0, -1);
                                      if (var20 == 0) {
                                        break L101;
                                      } else {
                                        break L102;
                                      }
                                    }
                                  }
                                  if (-2751 <= (var9_int ^ -1)) {
                                    break L101;
                                  } else {
                                    if (var9_int >= 2950) {
                                      break L101;
                                    } else {
                                      if (!gf.field_h) {
                                        var8.b(ng.field_c, 320, 120, 0, -1);
                                        break L101;
                                      } else {
                                        break L101;
                                      }
                                    }
                                  }
                                }
                                if (var20 == 0) {
                                  break L97;
                                } else {
                                  break L98;
                                }
                              }
                            }
                          }
                          L104: {
                            if (this.field_l > 0) {
                              break L104;
                            } else {
                              var27 = pj.field_J;
                              ah.field_e.b(var27, 320, 240, 0, -1);
                              if (var20 == 0) {
                                break L97;
                              } else {
                                break L104;
                              }
                            }
                          }
                          L105: {
                            var9_int = -(this.field_l / 2) + 320;
                            var10 = 320 + this.field_l / 2;
                            oo.h(var9_int, 0, var10, 480);
                            var11 = 140;
                            oo.b(var11, 80, 640 - 2 * var11, 260, 1, 3355443, 120);
                            if ((-5 + var11 ^ -1) < (var9_int ^ -1)) {
                              stackOut_246_0 = -5 + var11;
                              stackIn_247_0 = stackOut_246_0;
                              break L105;
                            } else {
                              stackOut_245_0 = var9_int;
                              stackIn_247_0 = stackOut_245_0;
                              break L105;
                            }
                          }
                          L106: {
                            stackOut_247_0 = stackIn_247_0;
                            stackOut_247_1 = 75;
                            stackIn_249_0 = stackOut_247_0;
                            stackIn_249_1 = stackOut_247_1;
                            stackIn_248_0 = stackOut_247_0;
                            stackIn_248_1 = stackOut_247_1;
                            if (var10 > 640 - var11) {
                              stackOut_249_0 = stackIn_249_0;
                              stackOut_249_1 = stackIn_249_1;
                              stackOut_249_2 = -var11 + 640;
                              stackIn_250_0 = stackOut_249_0;
                              stackIn_250_1 = stackOut_249_1;
                              stackIn_250_2 = stackOut_249_2;
                              break L106;
                            } else {
                              stackOut_248_0 = stackIn_248_0;
                              stackOut_248_1 = stackIn_248_1;
                              stackOut_248_2 = var10;
                              stackIn_250_0 = stackOut_248_0;
                              stackIn_250_1 = stackOut_248_1;
                              stackIn_250_2 = stackOut_248_2;
                              break L106;
                            }
                          }
                          L107: {
                            oo.h(stackIn_250_0, stackIn_250_1, stackIn_250_2, 345);
                            sj.field_j.c(var11 + -5, 75);
                            sj.field_j.a(-5 + var11, 340);
                            lm.field_fb.c(var11 - 5, 75);
                            lm.field_fb.b(-5 + -var11 + 640, 75);
                            rp.field_r[0].c(var11 - 5, 75);
                            rp.field_r[1].c(635 - var11, 75);
                            rp.field_r[2].c(var11 - 5, 340);
                            rp.field_r[3].c(635 + -var11, 340);
                            var12 = 0;
                            var13 = 160;
                            var14 = 90;
                            this.a(var13, (byte) -99, var14, var12);
                            if (-2 <= (op.field_m.field_t ^ -1)) {
                              break L107;
                            } else {
                              var12++;
                              var14 = 270;
                              var13 = 640 + -var13;
                              this.a(var13, (byte) -99, var14, var12);
                              if (2 >= op.field_m.field_t) {
                                break L107;
                              } else {
                                var13 = 640 + -var13;
                                var14 = 230;
                                var12++;
                                this.a(var13, (byte) -99, var14, var12);
                                if (3 >= op.field_m.field_t) {
                                  break L107;
                                } else {
                                  var12++;
                                  var13 = 640 - var13;
                                  var14 = 130;
                                  this.a(var13, (byte) -99, var14, var12);
                                  break L107;
                                }
                              }
                            }
                          }
                          this.field_y.g(-(this.field_y.field_x / 2) + 320, 235 + -this.field_y.field_w);
                          g.a(this.field_L, -(this.field_y.field_x / 2) + 320 + -6, 235 + (-this.field_y.field_w + -6));
                          oo.c();
                          break L97;
                        }
                        L108: {
                          if (!param0) {
                            break L108;
                          } else {
                            this.field_G.g(-27635);
                            if (!gf.field_h) {
                              this.field_I.c(-118);
                              rq.a(9);
                              break L108;
                            } else {
                              break L108;
                            }
                          }
                        }
                        L109: {
                          L110: {
                            jq.field_e.e(0, 0);
                            if (sc.field_a) {
                              break L110;
                            } else {
                              if (wj.field_n) {
                                break L110;
                              } else {
                                if (n.field_g) {
                                  break L110;
                                } else {
                                  break L109;
                                }
                              }
                            }
                          }
                          oo.f(0, 0, 640, 17, 0, 100);
                          break L109;
                        }
                        L111: {
                          if (!sc.field_a) {
                            break L111;
                          } else {
                            qp.field_w.c("cam=(" + this.field_k.field_k + ", " + this.field_k.field_g + ") bk=" + kd.field_b + " k=" + pq.field_f + " mouse=(" + bd.field_g + "," + bo.field_d + ")", 5, 13, 16777215, 0);
                            break L111;
                          }
                        }
                        L112: {
                          if (vk.field_E) {
                            var8.c(Integer.toString(ji.field_b), 10, 40, 2, -1);
                            var8.c(Integer.toString(ei.field_b), 10, 40, 2, -1);
                            var8.c(Integer.toString(op.field_m.field_H), 10, 80, 2, -1);
                            var9_ref = (ae) ((Object) this.field_hb.c(106));
                            L113: while (true) {
                              if (var9_ref == null) {
                                break L112;
                              } else {
                                var9_ref.a(-240 + this.field_k.field_g, true, -320 + this.field_k.field_k, op.field_m.field_H);
                                var9_ref = (ae) ((Object) this.field_hb.b(6));
                                if (var20 != 0) {
                                  break L112;
                                } else {
                                  if (var20 == 0) {
                                    continue L113;
                                  } else {
                                    break L112;
                                  }
                                }
                              }
                            }
                          } else {
                            break L112;
                          }
                        }
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

    final void b(int param0, int param1, int param2, int param3, int param4) {
        lc var6 = (lc) ((Object) this.field_X.g(55));
        if (!(var6 != null)) {
            var6 = new lc();
        }
        var6.a(param3, param2, param1, param0, (byte) 114);
        this.field_C.a(-25612, var6);
        g.a(this.field_C);
        int var7 = 74 % ((11 - param4) / 34);
    }

    private final void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        wb var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        br var12 = null;
        wb var13 = null;
        int var14 = 0;
        wb var15 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_12_0 = false;
        int stackIn_34_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        boolean stackOut_11_0 = false;
        int stackOut_33_0 = 0;
        L0: {
          var14 = ZombieDawnMulti.field_E ? 1 : 0;
          var4 = 0;
          var15 = (wb) ((Object) this.field_Q.c((byte) 92));
          var5 = var15;
          if (var15 == null) {
            break L0;
          } else {
            L1: {
              if ((param0 ^ -1) != (var15.field_Kb ^ -1)) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            var4 = stackIn_4_0;
            break L0;
          }
        }
        L2: {
          if (param2) {
            break L2;
          } else {
            this.b(-60);
            break L2;
          }
        }
        if (param1 == 1782) {
          var6 = this.field_u.field_r << 913213104;
          var7 = 0;
          var8 = this.field_u.field_c << 1649482672;
          var9 = 0;
          var10 = 41943040;
          var11 = 31457280;
          var12 = op.field_m.field_K.c(78);
          L3: while (true) {
            L4: {
              L5: {
                L6: {
                  if (var12 == null) {
                    break L6;
                  } else {
                    stackOut_11_0 = var12 instanceof wb;
                    stackIn_34_0 = stackOut_11_0 ? 1 : 0;
                    stackIn_12_0 = stackOut_11_0;
                    if (var14 != 0) {
                      break L5;
                    } else {
                      L7: {
                        if (stackIn_12_0) {
                          var13 = (wb) ((Object) var12);
                          if ((param0 ^ -1) == (var13.field_Kb ^ -1)) {
                            L8: {
                              var5 = var13;
                              var13.r(0);
                              this.field_Q.a(29664, var13);
                              if (var7 >= var13.field_z) {
                                break L8;
                              } else {
                                if (-var6 + var13.field_z < var10) {
                                  var7 = var13.field_z;
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            L9: {
                              if (var6 <= var13.field_z) {
                                break L9;
                              } else {
                                if ((var10 ^ -1) < (var7 + -var13.field_z ^ -1)) {
                                  var6 = var13.field_z;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            L10: {
                              if (var9 >= var13.field_E) {
                                break L10;
                              } else {
                                if ((var11 ^ -1) >= (var13.field_E - var8 ^ -1)) {
                                  break L10;
                                } else {
                                  var9 = var13.field_E;
                                  break L10;
                                }
                              }
                            }
                            if (var8 <= var13.field_E) {
                              break L7;
                            } else {
                              if ((var9 + -var13.field_E ^ -1) > (var11 ^ -1)) {
                                var8 = var13.field_E;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                          } else {
                            break L7;
                          }
                        } else {
                          break L7;
                        }
                      }
                      var12 = op.field_m.field_K.b(6);
                      if (var14 == 0) {
                        continue L3;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                if (var5 == null) {
                  break L4;
                } else {
                  stackOut_33_0 = var4;
                  stackIn_34_0 = stackOut_33_0;
                  break L5;
                }
              }
              if (stackIn_34_0 == 0) {
                break L4;
              } else {
                this.e(var8 + var9 >> 89717457, -108, var6 + var7 >> -954055311);
                break L4;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final void c(int param0, int param1) {
        wb var3 = null;
        id var4 = op.field_m.a(param0, (byte) 33);
        if (!(var4 instanceof ti)) {
            return;
        }
        if (var4 == null) {
            return;
        }
        int var6 = 83 % ((param1 - -73) / 51);
        ti var5 = (ti) ((Object) var4);
        var5.j(0);
        if (!(!(var5 instanceof wb))) {
            var3 = (wb) ((Object) var5);
            var3.j((byte) -13);
            var3.d(false);
            if (-30 == (var3.field_K ^ -1)) {
                var3.b(4, -27655);
            }
        }
    }

    private final void d(int param0) {
        int var3 = 0;
        td var4 = null;
        L0: {
          var3 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 == 15) {
            break L0;
          } else {
            var4 = (td) null;
            qd.a((fm) null, 30, (String) null, 93, (td) null);
            break L0;
          }
        }
        L1: {
          if (!this.c((byte) 106)) {
            break L1;
          } else {
            L2: {
              if (this.field_b == null) {
                break L2;
              } else {
                this.field_b.field_O = false;
                this.field_b = null;
                break L2;
              }
            }
            L3: {
              L4: {
                if (null != this.field_mb) {
                  break L4;
                } else {
                  if (this.field_x == null) {
                    break L3;
                  } else {
                    this.field_x.field_jb = false;
                    this.field_x = null;
                    if (var3 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              this.field_mb.field_zb = false;
              this.field_mb.field_eb = false;
              this.field_mb = null;
              break L3;
            }
            L5: {
              if (!this.field_I.a((byte) -119)) {
                en.a(-1, 0);
                break L5;
              } else {
                L6: {
                  if (!bk.field_g) {
                    break L6;
                  } else {
                    en.a(param0 + -16, 1);
                    if (var3 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                en.a(-1, 6);
                return;
              }
            }
            L7: {
              if (!this.field_I.g(param0 ^ 2)) {
                break L7;
              } else {
                this.field_x = (gm) ((Object) this.a(true, 54, bo.field_d, bd.field_g));
                if (this.field_x == null) {
                  break L7;
                } else {
                  this.field_x.field_jb = true;
                  break L7;
                }
              }
            }
            L8: {
              this.field_mb = (wb) ((Object) this.a(false, 124, bo.field_d, bd.field_g));
              if (null != this.field_mb) {
                L9: {
                  L10: {
                    if (!this.field_I.a(true)) {
                      break L10;
                    } else {
                      if (this.field_mb.i((byte) 116)) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if (!this.field_I.a(param0 + 5)) {
                      break L11;
                    } else {
                      if (!this.field_mb.i((byte) -59)) {
                        break L9;
                      } else {
                        break L11;
                      }
                    }
                  }
                  if (this.field_mb.i((byte) -36)) {
                    this.field_mb.field_eb = true;
                    if (var3 == 0) {
                      break L8;
                    } else {
                      break L9;
                    }
                  } else {
                    break L8;
                  }
                }
                L12: {
                  if (!bk.field_g) {
                    break L12;
                  } else {
                    this.field_mb.field_zb = true;
                    if (var3 == 0) {
                      break L8;
                    } else {
                      break L12;
                    }
                  }
                }
                this.field_mb = null;
                break L8;
              } else {
                break L8;
              }
            }
            L13: {
              if (!this.field_I.a(20)) {
                break L13;
              } else {
                if (null == this.field_b) {
                  break L13;
                } else {
                  this.field_b.field_O = true;
                  break L1;
                }
              }
            }
            break L1;
          }
        }
    }

    final boolean a(boolean param0, int param1) {
        int var3 = 0;
        int var4_int = 0;
        ja[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        ja[] stackIn_31_0 = null;
        int stackIn_43_0 = 0;
        Object stackIn_49_0 = null;
        boolean stackIn_49_1 = false;
        Object stackIn_50_0 = null;
        boolean stackIn_50_1 = false;
        Object stackIn_51_0 = null;
        boolean stackIn_51_1 = false;
        int stackIn_51_2 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        ja[] stackOut_30_0 = null;
        ja[] stackOut_29_0 = null;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        Object stackOut_48_0 = null;
        boolean stackOut_48_1 = false;
        Object stackOut_50_0 = null;
        boolean stackOut_50_1 = false;
        int stackOut_50_2 = 0;
        Object stackOut_49_0 = null;
        boolean stackOut_49_1 = false;
        int stackOut_49_2 = 0;
        L0: {
          var6 = ZombieDawnMulti.field_E ? 1 : 0;
          this.field_z = false;
          if (-11 != (pl.field_I ^ -1)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var3 = stackIn_3_0;
          if (!df.field_I) {
            L2: {
              L3: {
                pb.field_i = id.field_x;
                if (!iq.field_f) {
                  break L3;
                } else {
                  if (var3 == 0) {
                    break L2;
                  } else {
                    pb.field_i = be.field_m;
                    if (var6 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L4: {
                if (-2 <= (id.field_D ^ -1)) {
                  break L4;
                } else {
                  pb.field_i = vl.a(rq.field_q, new String[]{Integer.toString(id.field_D)}, 2);
                  if (var6 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (-2 == (id.field_D ^ -1)) {
                  break L5;
                } else {
                  pb.field_i = ll.field_d;
                  if (var6 == 0) {
                    break L2;
                  } else {
                    break L5;
                  }
                }
              }
              pb.field_i = ma.field_c;
              break L2;
            }
            var4_int = qp.field_w.a(pb.field_i);
            nf.field_d = (int)((float)nf.field_d + (float)(var4_int + -nf.field_d) * 0.05000000074505806f);
            if ((nf.field_d ^ -1) != (var4_int ^ -1)) {
              L6: {
                stackOut_18_0 = nf.field_d;
                stackIn_20_0 = stackOut_18_0;
                stackIn_19_0 = stackOut_18_0;
                if (var4_int > nf.field_d) {
                  stackOut_20_0 = stackIn_20_0;
                  stackOut_20_1 = 1;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  break L6;
                } else {
                  stackOut_19_0 = stackIn_19_0;
                  stackOut_19_1 = -1;
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  break L6;
                }
              }
              nf.field_d = stackIn_21_0 + stackIn_21_1;
              break L1;
            } else {
              break L1;
            }
          } else {
            break L1;
          }
        }
        L7: {
          L8: {
            if (df.field_I) {
              break L8;
            } else {
              if (!param0) {
                break L8;
              } else {
                L9: {
                  if (!re.field_b) {
                    break L9;
                  } else {
                    if (!sq.field_N) {
                      break L9;
                    } else {
                      if (!gf.field_h) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                L10: {
                  if (!tj.field_f) {
                    stackOut_30_0 = oi.field_h;
                    stackIn_31_0 = stackOut_30_0;
                    break L10;
                  } else {
                    stackOut_29_0 = rl.field_a;
                    stackIn_31_0 = stackOut_29_0;
                    break L10;
                  }
                }
                L11: {
                  var4 = stackIn_31_0;
                  tj.field_f = false;
                  var5 = var4[0].field_w - (-var4[6].field_w + -qp.field_w.field_C);
                  if ((bd.field_g ^ -1) > (635 + -nf.field_d ^ -1)) {
                    break L11;
                  } else {
                    if (640 <= bd.field_g) {
                      break L11;
                    } else {
                      if (-var5 + dq.field_k.field_qb > bo.field_d) {
                        break L11;
                      } else {
                        if ((dq.field_k.field_qb ^ -1) < (bo.field_d ^ -1)) {
                          this.field_z = true;
                          tj.field_f = true;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                }
                L12: {
                  if (kd.field_b != 1) {
                    break L12;
                  } else {
                    if (tj.field_f) {
                      L13: {
                        if (iq.field_f) {
                          stackOut_42_0 = 0;
                          stackIn_43_0 = stackOut_42_0;
                          break L13;
                        } else {
                          stackOut_41_0 = 1;
                          stackIn_43_0 = stackOut_41_0;
                          break L13;
                        }
                      }
                      iq.field_f = stackIn_43_0 != 0;
                      if (!iq.field_f) {
                        break L12;
                      } else {
                        id.field_D = 0;
                        break L12;
                      }
                    } else {
                      break L12;
                    }
                  }
                }
                if (var6 == 0) {
                  break L7;
                } else {
                  break L8;
                }
              }
            }
          }
          tj.field_f = false;
          break L7;
        }
        L14: {
          if (!iq.field_f) {
            break L14;
          } else {
            L15: {
              stackOut_48_0 = this;
              stackOut_48_1 = this.field_z;
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              if ((dq.field_k.field_qb ^ -1) < (bo.field_d ^ -1)) {
                stackOut_50_0 = this;
                stackOut_50_1 = stackIn_50_1;
                stackOut_50_2 = 0;
                stackIn_51_0 = stackOut_50_0;
                stackIn_51_1 = stackOut_50_1;
                stackIn_51_2 = stackOut_50_2;
                break L15;
              } else {
                stackOut_49_0 = this;
                stackOut_49_1 = stackIn_49_1;
                stackOut_49_2 = 1;
                stackIn_51_0 = stackOut_49_0;
                stackIn_51_1 = stackOut_49_1;
                stackIn_51_2 = stackOut_49_2;
                break L15;
              }
            }
            ((qd) (this)).field_z = stackIn_51_1 | stackIn_51_2 != 0;
            if (!sq.field_N) {
              break L14;
            } else {
              if (!re.field_b) {
                break L14;
              } else {
                this.field_z = true;
                break L14;
              }
            }
          }
        }
        this.field_z = this.field_z | tj.field_f;
        if (param1 == 15978) {
          return this.field_z;
        } else {
          return true;
        }
    }

    public static void h(int param0) {
        field_v = null;
        field_E = null;
        field_s = null;
        field_r = null;
        field_V = null;
        if (param0 != 256) {
            field_E = (String) null;
        }
        field_K = null;
    }

    private final void a(byte param0) {
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        Object var2 = null;
        ae var3_ref_ae = null;
        int var3 = 0;
        br var3_ref_br = null;
        lj var3_ref_lj = null;
        cg var3_ref_cg = null;
        pq var3_ref_pq = null;
        wc var3_ref_wc = null;
        lc var3_ref_lc = null;
        Object var4 = null;
        ae var4_ref = null;
        br var4_ref2 = null;
        ce var4_ref3 = null;
        Exception var5 = null;
        ce var5_ref = null;
        int var6 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        br stackIn_25_0 = null;
        br stackIn_27_0 = null;
        lj stackIn_30_0 = null;
        Object stackIn_32_0 = null;
        cg stackIn_35_0 = null;
        Object stackIn_37_0 = null;
        pq stackIn_40_0 = null;
        Object stackIn_42_0 = null;
        wc stackIn_45_0 = null;
        Object stackIn_47_0 = null;
        boolean stackIn_50_0 = false;
        int stackIn_55_0 = 0;
        boolean stackIn_58_0 = false;
        int stackIn_63_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        br stackOut_24_0 = null;
        br stackOut_26_0 = null;
        lj stackOut_29_0 = null;
        br stackOut_31_0 = null;
        cg stackOut_34_0 = null;
        br stackOut_36_0 = null;
        pq stackOut_39_0 = null;
        br stackOut_41_0 = null;
        wc stackOut_44_0 = null;
        br stackOut_46_0 = null;
        boolean stackOut_49_0 = false;
        int stackOut_54_0 = 0;
        boolean stackOut_57_0 = false;
        int stackOut_62_0 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        op.field_m.field_H = op.field_m.field_H + 1;
        var2 = null;
        var3_ref_ae = (ae) ((Object) this.field_hb.c(50));
        L0: while (true) {
          L1: {
            if (var3_ref_ae == null) {
              break L1;
            } else {
              L2: {
                if (var2 == null) {
                  break L2;
                } else {
                  if (((ae) (var2)).field_f <= var3_ref_ae.field_f) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              var2 = var3_ref_ae;
              var3_ref_ae = (ae) ((Object) this.field_hb.b(6));
              if (var6 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var3 = 10 % ((-25 - param0) / 61);
          var4_ref = (ae) ((Object) this.field_hb.c(114));
          L3: while (true) {
            L4: {
              L5: {
                if (var4_ref == null) {
                  break L5;
                } else {
                  stackOut_8_0 = op.field_m.field_H;
                  stackOut_8_1 = var4_ref.field_f;
                  stackIn_17_0 = stackOut_8_0;
                  stackIn_17_1 = stackOut_8_1;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  if (var6 != 0) {
                    break L4;
                  } else {
                    L6: {
                      if (stackIn_9_0 >= stackIn_9_1) {
                        break L6;
                      } else {
                        if (var6 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    try {
                      L7: {
                        var4_ref.a((byte) -84);
                        var4_ref.a(0, (qd) (this));
                        break L7;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L8: {
                        var5 = (Exception) (Object) decompiledCaughtException;
                        bd.a(op.field_m.field_H + ": error executing message of tick " + var4_ref.field_f + ": " + var5.getMessage(), (Throwable) ((Object) var5), false);
                        break L8;
                      }
                    }
                    var4_ref = (ae) ((Object) this.field_hb.c(78));
                    if (var6 == 0) {
                      continue L3;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              stackOut_16_0 = op.field_m.field_l ^ -1;
              stackOut_16_1 = -1;
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              break L4;
            }
            L9: {
              if (stackIn_17_0 != stackIn_17_1) {
                L10: {
                  discarded$2 = this.field_G.a(-21991);
                  if ((op.field_m.field_l ^ -1) != -4) {
                    this.field_G.a(this.field_Z, false);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                var3_ref_br = this.field_H.c(61);
                L11: while (true) {
                  L12: {
                    L13: {
                      if (!(var3_ref_br instanceof id)) {
                        break L13;
                      } else {
                        var4_ref2 = var3_ref_br.field_d;
                        ((id) ((Object) var3_ref_br)).f((byte) -117);
                        stackOut_24_0 = (br) (var4_ref2);
                        stackIn_27_0 = stackOut_24_0;
                        stackIn_25_0 = stackOut_24_0;
                        if (var6 != 0) {
                          break L12;
                        } else {
                          var3_ref_br = stackIn_25_0;
                          if (var6 == 0) {
                            continue L11;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    stackOut_26_0 = this.field_O.c(127);
                    stackIn_27_0 = stackOut_26_0;
                    break L12;
                  }
                  var3_ref_lj = (lj) ((Object) stackIn_27_0);
                  L14: while (true) {
                    L15: {
                      L16: {
                        if (var3_ref_lj == null) {
                          break L16;
                        } else {
                          var3_ref_lj.a(-20587);
                          stackOut_29_0 = (lj) ((Object) this.field_O.b(6));
                          stackIn_32_0 = stackOut_29_0;
                          stackIn_30_0 = stackOut_29_0;
                          if (var6 != 0) {
                            break L15;
                          } else {
                            var3_ref_lj = stackIn_30_0;
                            if (var6 == 0) {
                              continue L14;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                      stackOut_31_0 = op.field_m.field_A.c(81);
                      stackIn_32_0 = stackOut_31_0;
                      break L15;
                    }
                    var3_ref_cg = (cg) ((Object) stackIn_32_0);
                    L17: while (true) {
                      L18: {
                        L19: {
                          if (var3_ref_cg == null) {
                            break L19;
                          } else {
                            var3_ref_cg.b(false);
                            stackOut_34_0 = (cg) ((Object) op.field_m.field_A.b(6));
                            stackIn_37_0 = stackOut_34_0;
                            stackIn_35_0 = stackOut_34_0;
                            if (var6 != 0) {
                              break L18;
                            } else {
                              var3_ref_cg = stackIn_35_0;
                              if (var6 == 0) {
                                continue L17;
                              } else {
                                break L19;
                              }
                            }
                          }
                        }
                        stackOut_36_0 = op.field_m.field_G.c(42);
                        stackIn_37_0 = stackOut_36_0;
                        break L18;
                      }
                      var3_ref_pq = (pq) ((Object) stackIn_37_0);
                      L20: while (true) {
                        L21: {
                          L22: {
                            if (var3_ref_pq == null) {
                              break L22;
                            } else {
                              var3_ref_pq.a(100);
                              stackOut_39_0 = (pq) ((Object) op.field_m.field_G.b(6));
                              stackIn_42_0 = stackOut_39_0;
                              stackIn_40_0 = stackOut_39_0;
                              if (var6 != 0) {
                                break L21;
                              } else {
                                var3_ref_pq = stackIn_40_0;
                                if (var6 == 0) {
                                  continue L20;
                                } else {
                                  break L22;
                                }
                              }
                            }
                          }
                          stackOut_41_0 = this.field_T.c(61);
                          stackIn_42_0 = stackOut_41_0;
                          break L21;
                        }
                        var3_ref_wc = (wc) ((Object) stackIn_42_0);
                        L23: while (true) {
                          L24: {
                            L25: {
                              if (var3_ref_wc == null) {
                                break L25;
                              } else {
                                var3_ref_wc.f((byte) -122);
                                stackOut_44_0 = (wc) ((Object) this.field_T.b(6));
                                stackIn_47_0 = stackOut_44_0;
                                stackIn_45_0 = stackOut_44_0;
                                if (var6 != 0) {
                                  break L24;
                                } else {
                                  var3_ref_wc = stackIn_45_0;
                                  if (var6 == 0) {
                                    continue L23;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                            }
                            stackOut_46_0 = this.field_C.c(57);
                            stackIn_47_0 = stackOut_46_0;
                            break L24;
                          }
                          var3_ref_lc = (lc) ((Object) stackIn_47_0);
                          L26: while (true) {
                            L27: {
                              L28: {
                                if (var3_ref_lc == null) {
                                  break L28;
                                } else {
                                  discarded$3 = var3_ref_lc.d((byte) 76);
                                  stackOut_49_0 = var3_ref_lc.field_q;
                                  stackIn_55_0 = stackOut_49_0 ? 1 : 0;
                                  stackIn_50_0 = stackOut_49_0;
                                  if (var6 != 0) {
                                    break L27;
                                  } else {
                                    L29: {
                                      if (stackIn_50_0) {
                                        var3_ref_lc.a(true);
                                        this.field_X.a(var3_ref_lc, false);
                                        break L29;
                                      } else {
                                        break L29;
                                      }
                                    }
                                    var3_ref_lc = (lc) ((Object) this.field_C.b(6));
                                    if (var6 == 0) {
                                      continue L26;
                                    } else {
                                      break L28;
                                    }
                                  }
                                }
                              }
                              g.a(this.field_C);
                              stackOut_54_0 = 0;
                              stackIn_55_0 = stackOut_54_0;
                              break L27;
                            }
                            var3 = stackIn_55_0;
                            var4_ref2 = null;
                            var5_ref = (ce) ((Object) op.field_m.field_s.c(63));
                            L30: while (true) {
                              L31: {
                                L32: {
                                  if (var5_ref == null) {
                                    break L32;
                                  } else {
                                    var4_ref3 = (ce) ((Object) op.field_m.field_s.b(6));
                                    stackOut_57_0 = var5_ref.d(-20232);
                                    stackIn_63_0 = stackOut_57_0 ? 1 : 0;
                                    stackIn_58_0 = stackOut_57_0;
                                    if (var6 != 0) {
                                      break L31;
                                    } else {
                                      L33: {
                                        if (stackIn_58_0) {
                                          var3 = 1;
                                          break L33;
                                        } else {
                                          break L33;
                                        }
                                      }
                                      var5_ref = var4_ref3;
                                      if (var6 == 0) {
                                        continue L30;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                }
                                stackOut_62_0 = var3;
                                stackIn_63_0 = stackOut_62_0;
                                break L31;
                              }
                              if (stackIn_63_0 == 0) {
                                break L9;
                              } else {
                                var5_ref = (ce) ((Object) op.field_m.field_s.c(85));
                                L34: while (true) {
                                  L35: {
                                    L36: {
                                      if (var5_ref == null) {
                                        break L36;
                                      } else {
                                        var5_ref.a((byte) -60);
                                        var5_ref = (ce) ((Object) op.field_m.field_s.b(6));
                                        if (var6 != 0) {
                                          break L35;
                                        } else {
                                          if (var6 == 0) {
                                            continue L34;
                                          } else {
                                            break L36;
                                          }
                                        }
                                      }
                                    }
                                    this.field_u.a(48);
                                    break L35;
                                  }
                                  break L9;
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
                break L9;
              }
            }
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        br discarded$1 = null;
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            var5 = ZombieDawnMulti.field_E ? 1 : 0;
            if (this.field_cb.a(param0 + -1) <= 200) {
              break L1;
            } else {
              var4 = 0;
              L2: while (true) {
                if (-6 >= (var4 ^ -1)) {
                  break L1;
                } else {
                  discarded$1 = this.field_cb.g(80);
                  var4++;
                  if (var5 != 0) {
                    break L0;
                  } else {
                    if (var5 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          this.field_cb.a(new rj(param1, param2, hp.a((byte) -98, g.field_a, 6)), false);
          this.field_cb.a(new rj(param1 + 15, param2, hp.a((byte) 99, g.field_a, 6)), false);
          this.field_cb.a(new rj(param1 - 15, param2, hp.a((byte) 126, g.field_a, 6)), false);
          break L0;
        }
        L3: {
          if (param0 == 1) {
            break L3;
          } else {
            this.field_o = (h) null;
            break L3;
          }
        }
        L4: {
          this.field_cb.a(new rj(param1, param2 - 15, hp.a((byte) 9, g.field_a, 6)), false);
          this.field_cb.a(new rj(param1, param2 - -15, hp.a((byte) -86, g.field_a, 6)), false);
          if (this.field_u.a(param1, true, true, param2 + -24)) {
            break L4;
          } else {
            L5: {
              if (this.field_u.a(param1 + 24, true, true, -24 + param2)) {
                break L5;
              } else {
                if (this.field_u.a(param1 + -24, true, true, -24 + param2)) {
                  break L5;
                } else {
                  if (this.field_u.a(param1, true, true, param2)) {
                    param2 = param2 - (param2 % 24 + 24);
                    this.field_H.a(new rj(param1, param2, hp.a((byte) -100, g.field_a, 6) + 6), false);
                    this.field_cb.a(new rj(param1, 24 + param2, hp.a((byte) -93, g.field_a, 6)), false);
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
            }
            break L4;
          }
        }
    }

    final void a(int[] param0, boolean param1) {
        try {
            if (param1) {
                this.field_A = 96;
            }
            d.a(param0, 0, op.field_m.field_d, 0, param0.length);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "qd.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6, int param7) {
        id var9 = null;
        ti var10 = null;
        if (!param2) {
          var9 = op.field_m.a(param0, (byte) 33);
          if (var9 == null) {
            return;
          } else {
            if (var9 instanceof ti) {
              L0: {
                L1: {
                  var10 = (ti) ((Object) var9);
                  if (23 == param6) {
                    break L1;
                  } else {
                    if (-29 == (param6 ^ -1)) {
                      break L1;
                    } else {
                      if (-16 == (param6 ^ -1)) {
                        break L1;
                      } else {
                        if ((param6 ^ -1) == -28) {
                          break L1;
                        } else {
                          if (param6 == 17) {
                            break L1;
                          } else {
                            if (25 == param6) {
                              break L1;
                            } else {
                              if (13 == param6) {
                                break L1;
                              } else {
                                if (29 == param6) {
                                  break L1;
                                } else {
                                  if (31 == param6) {
                                    break L1;
                                  } else {
                                    if (param6 == 33) {
                                      break L1;
                                    } else {
                                      L2: {
                                        if (-6 != (var10.field_K ^ -1)) {
                                          break L2;
                                        } else {
                                          if (param6 != 4) {
                                            break L2;
                                          } else {
                                            return;
                                          }
                                        }
                                      }
                                      L3: {
                                        if ((var10.field_K ^ -1) == (param6 ^ -1)) {
                                          break L3;
                                        } else {
                                          var10.b(param6, -27655);
                                          break L3;
                                        }
                                      }
                                      var10.a(param1, param5, param3, (byte) 109, param4, param7);
                                      if (!ZombieDawnMulti.field_E) {
                                        break L0;
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
                      }
                    }
                  }
                }
                var10.b(param6, -27655);
                break L0;
              }
              return;
            } else {
              throw new IllegalArgumentException("oid " + param0 + " is not a character");
            }
          }
        } else {
          return;
        }
    }

    final void b(int param0, int param1, int param2) {
        if (param1 != 0) {
            this.a(118, (byte) -12, -22);
        }
        op.field_m.field_z[param0] = param2;
    }

    qd(kb param0, hk param1, int param2) {
        RuntimeException var4 = null;
        int[] var4_array = null;
        int var5_int = 0;
        int[] var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var21 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        th discarded$1 = new th();
        this.field_Z = 0;
        this.field_Y = 0;
        this.field_J = new uf();
        this.field_q = -1;
        this.field_x = null;
        this.field_p = -1;
        this.field_mb = null;
        this.field_fb = 0;
        this.field_d = 0;
        this.field_eb = false;
        this.field_n = 0;
        this.field_w = true;
        this.field_F = -1;
        this.field_db = false;
        this.field_ib = 0;
        this.field_B = new ja(157, 100);
        this.field_z = false;
        this.field_m = 2;
        this.field_i = new int[256];
        this.field_g = 1;
        try {
          L0: {
            L1: {
              fb.field_e = (qd) (this);
              mj.field_Hb[2].field_g.field_d = 0;
              if ((param2 ^ -1) <= -1) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              gf.field_h = stackIn_4_0 != 0;
              tg.field_e = param1;
              if ((((int)(bl.a((byte) 124) / 86400000L) + -11745) % 7 ^ -1) != -6) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              q.field_b = stackIn_7_0 != 0;
              op.field_m = param0;
              this.field_M = param2;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (kj.field_q < 2) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            ((qd) (this)).field_ab = stackIn_10_1 != 0;
            this.b((byte) 72);
            this.field_Q = new lq();
            this.field_W = -50 + param0.field_H;
            var16 = fc.field_m;
            var12 = var16;
            var10 = var12;
            var4_array = var10;
            var5_int = 0;
            L4: while (true) {
              L5: {
                L6: {
                  if (var5_int >= 8) {
                    break L6;
                  } else {
                    var16[var5_int] = 0;
                    var5_int++;
                    if (var9 != 0) {
                      break L5;
                    } else {
                      if (var9 == 0) {
                        continue L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                this.field_H = param0.a((byte) 114);
                this.a(6, param0.field_h);
                break L5;
              }
              L7: {
                if (null != so.field_l) {
                  break L7;
                } else {
                  L8: {
                    if (-3 == (ll.field_k.field_k ^ -1)) {
                      stackOut_18_0 = 1;
                      stackIn_19_0 = stackOut_18_0;
                      break L8;
                    } else {
                      stackOut_17_0 = 16;
                      stackIn_19_0 = stackOut_17_0;
                      break L8;
                    }
                  }
                  ke.field_b = stackIn_19_0;
                  so.field_l = new ja(1280 / ke.field_b, 960 / ke.field_b);
                  break L7;
                }
              }
              L9: {
                if (gf.field_h) {
                  break L9;
                } else {
                  var19 = new int[param0.field_t - -3];
                  var15 = var19;
                  var11 = var15;
                  var4_array = var11;
                  var18 = new int[3 + param0.field_t];
                  var14 = var18;
                  var5 = var14;
                  var21 = new int[param0.field_t + 2];
                  var7 = 0;
                  var8 = 0;
                  L10: while (true) {
                    L11: {
                      L12: {
                        if ((var21.length ^ -1) >= (var8 ^ -1)) {
                          break L12;
                        } else {
                          var5[var8] = param0.field_D[var7][1];
                          var11[var8] = param0.field_D[var7][0];
                          var21[var8] = 25;
                          if (var9 != 0) {
                            break L11;
                          } else {
                            L13: {
                              if ((var7 ^ -1) != (fb.field_e.field_M ^ -1)) {
                                break L13;
                              } else {
                                var8++;
                                var5[var8] = param0.field_D[var7][1];
                                var11[var8] = param0.field_D[var7][0];
                                var21[var8] = 75;
                                var8++;
                                var5[var8] = param0.field_D[var7][1];
                                var11[var8] = param0.field_D[var7][0];
                                var21[var8] = 25;
                                break L13;
                              }
                            }
                            var7++;
                            var8++;
                            if (var9 == 0) {
                              continue L10;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      var5[var18.length - 1] = var18[0];
                      var11[var18.length + -1] = var19[0];
                      ej.field_p = ao.a(var5, -837539512, var21);
                      break L11;
                    }
                    fb.field_d = ao.a(var11, -837539512, var21);
                    break L9;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var4 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var4);
            stackOut_30_1 = new StringBuilder().append("qd.<init>(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L14;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L14;
            }
          }
          L15: {
            stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');
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
              break L15;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L15;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param2 + ')');
        }
    }

    static {
        field_e = 48;
        field_r = "Name";
        field_E = "No spectators";
        field_v = "Press F10 to open Quick Chat.";
        field_K = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_V = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
    }
}
