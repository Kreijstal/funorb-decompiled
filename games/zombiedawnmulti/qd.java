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
        int stackIn_51_0 = 0;
        Object stackIn_71_0 = null;
        Object stackIn_72_0 = null;
        Object stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int stackIn_81_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_82_1 = 0;
        int stackOut_81_0 = 0;
        int stackOut_81_1 = 0;
        Object stackOut_70_0 = null;
        Object stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        Object stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        L0: {
          var10 = ZombieDawnMulti.field_E ? 1 : 0;
          var2 = 0;
          if (!((qd) this).field_z) {
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
              var3_float = (1.0f + (float)var2 * 0.03999999910593033f) * ((qd) this).field_k.field_d;
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
            if (var3_float == ((qd) this).field_k.field_d) {
              break L6;
            } else {
              if ((float)((qd) this).field_u.field_r < 640.0f * var3_float) {
                break L6;
              } else {
                if (var3_float * 480.0f > (float)((qd) this).field_u.field_c) {
                  break L6;
                } else {
                  ((qd) this).field_k.field_d = var3_float;
                  break L6;
                }
              }
            }
          } else {
            break L6;
          }
        }
        L9: {
          if (!this.c((byte) 124)) {
            break L9;
          } else {
            if (!gf.field_h) {
              var3 = ((qd) this).field_k.a(bd.field_g, 2);
              var4 = ((qd) this).field_k.a(true, bo.field_d);
              bk.field_g = true;
              var5 = (h) (Object) ((qd) this).field_c.c((byte) 97);
              L10: while (true) {
                L11: {
                  if (var5 == null) {
                    break L11;
                  } else {
                    L12: {
                      if (~var5.field_I == ~((qd) this).field_M) {
                        break L12;
                      } else {
                        var6_int = var5.g(-73) - var3;
                        var7 = var5.h(126) - var4;
                        var8 = 350;
                        if (var7 * var7 + var6_int * var6_int < var8 * var8) {
                          bk.field_g = false;
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    var5 = (h) (Object) ((qd) this).field_c.b((byte) 102);
                    continue L10;
                  }
                }
                if (!bk.field_g) {
                  break L9;
                } else {
                  bk.field_g = false;
                  var5_ref = (id) (Object) ((qd) this).field_H.c(112);
                  L13: while (true) {
                    L14: {
                      if (var5_ref == null) {
                        break L14;
                      } else {
                        L15: {
                          if (!(var5_ref instanceof wb)) {
                            break L15;
                          } else {
                            var11 = (wb) (Object) var5_ref;
                            if (var11.i((byte) -43)) {
                              var7 = var11.g(88) - var3;
                              var8 = -var4 + var11.h(120);
                              var9 = var11.l(-113);
                              if (var7 * var7 - -(var8 * var8) < var9 * var9) {
                                bk.field_g = true;
                                break L14;
                              } else {
                                break L15;
                              }
                            } else {
                              break L15;
                            }
                          }
                        }
                        var5_ref = (id) (Object) ((qd) this).field_H.b(6);
                        continue L13;
                      }
                    }
                    if (!bk.field_g) {
                      L16: {
                        var12 = ((qd) this).field_o;
                        var6_int = -var3 + var12.g(88);
                        var7 = -var4 + var12.h(123);
                        var8 = 350;
                        if (~(var8 * var8) >= ~(var6_int * var6_int - -(var7 * var7))) {
                          stackOut_50_0 = 0;
                          stackIn_51_0 = stackOut_50_0;
                          break L16;
                        } else {
                          stackOut_49_0 = 1;
                          stackIn_51_0 = stackOut_49_0;
                          break L16;
                        }
                      }
                      bk.field_g = stackIn_51_0 != 0;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
              }
            } else {
              break L9;
            }
          }
        }
        L17: {
          L18: {
            if (kd.field_b == 1) {
              break L18;
            } else {
              if (kd.field_b != 2) {
                L19: {
                  if (!((qd) this).field_db) {
                    break L19;
                  } else {
                    L20: {
                      if (pq.field_f == 1) {
                        break L20;
                      } else {
                        if (pq.field_f != 2) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                    L21: {
                      var3 = bd.field_g + -((qd) this).field_F;
                      var4 = -((qd) this).field_p + bo.field_d;
                      if (!((qd) this).field_eb) {
                        L22: {
                          stackOut_80_0 = ~(Math.abs(var3) - -Math.abs(var4));
                          stackIn_82_0 = stackOut_80_0;
                          stackIn_81_0 = stackOut_80_0;
                          if (((qd) this).field_w) {
                            stackOut_82_0 = stackIn_82_0;
                            stackOut_82_1 = 20;
                            stackIn_83_0 = stackOut_82_0;
                            stackIn_83_1 = stackOut_82_1;
                            break L22;
                          } else {
                            stackOut_81_0 = stackIn_81_0;
                            stackOut_81_1 = 5;
                            stackIn_83_0 = stackOut_81_0;
                            stackIn_83_1 = stackOut_81_1;
                            break L22;
                          }
                        }
                        if (stackIn_83_0 >= ~stackIn_83_1) {
                          break L21;
                        } else {
                          L23: {
                            if (!this.c((byte) 106)) {
                              break L23;
                            } else {
                              if (!((qd) this).field_w) {
                                break L23;
                              } else {
                                if (gf.field_h) {
                                  break L23;
                                } else {
                                  boolean discarded$1 = ((qd) this).field_I.h(1);
                                  if (lc.field_m[81]) {
                                    break L23;
                                  } else {
                                    if (!lc.field_m[82]) {
                                      this.b(-57);
                                      break L23;
                                    } else {
                                      break L23;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          ((qd) this).field_eb = true;
                          break L21;
                        }
                      } else {
                        break L21;
                      }
                    }
                    L24: {
                      if (!((qd) this).field_eb) {
                        break L24;
                      } else {
                        L25: {
                          if (!this.c((byte) 101)) {
                            break L25;
                          } else {
                            if (!((qd) this).field_w) {
                              break L25;
                            } else {
                              if (gf.field_h) {
                                break L25;
                              } else {
                                var5_ref = (id) (Object) ((qd) this).field_H.c(69);
                                L26: while (true) {
                                  if (var5_ref == null) {
                                    break L24;
                                  } else {
                                    L27: {
                                      if (!(var5_ref instanceof wb)) {
                                        break L27;
                                      } else {
                                        var6 = (wb) (Object) var5_ref;
                                        if (((qd) this).field_M == var6.field_Lb) {
                                          var6.field_eb = var6.a(((qd) this).field_k.a(bd.field_g, 2), ((qd) this).field_k.a(true, ((qd) this).field_p), ((qd) this).field_k.a(true, bo.field_d), 48, ((qd) this).field_k.a(((qd) this).field_F, 2));
                                          break L27;
                                        } else {
                                          break L27;
                                        }
                                      }
                                    }
                                    var5_ref = (id) (Object) ((qd) this).field_H.b(6);
                                    continue L26;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L28: {
                          if (-1 != ((qd) this).field_q) {
                            break L28;
                          } else {
                            ((qd) this).field_q = ((qd) this).field_F;
                            break L28;
                          }
                        }
                        ((qd) this).field_k.a(var3, var4, 25992);
                        ((qd) this).field_p = bo.field_d;
                        ((qd) this).field_F = bd.field_g;
                        break L24;
                      }
                    }
                    break L17;
                  }
                }
                if (((qd) this).field_db) {
                  L29: {
                    if (this.c((byte) 113)) {
                      if (!((qd) this).field_eb) {
                        if (!gf.field_h) {
                          if (((qd) this).field_w) {
                            this.a(bo.field_d, (byte) -112, bd.field_g);
                            break L29;
                          } else {
                            this.a(true, bo.field_d, bd.field_g);
                            break L29;
                          }
                        } else {
                          break L29;
                        }
                      } else {
                        if (((qd) this).field_w) {
                          L30: {
                            if (lc.field_m[81]) {
                              break L30;
                            } else {
                              if (!lc.field_m[82]) {
                                this.b(-75);
                                break L30;
                              } else {
                                break L30;
                              }
                            }
                          }
                          this.a(((qd) this).field_k.a(((qd) this).field_F, 2), ((qd) this).field_k.a(true, ((qd) this).field_p), ((qd) this).field_k.a(true, bo.field_d), ((qd) this).field_k.a(bd.field_g, 2), (byte) 5);
                          if (((qd) this).field_Q.a((byte) 98) > 0) {
                            iq.a(-3, (byte) 99);
                            break L29;
                          } else {
                            break L29;
                          }
                        } else {
                          break L29;
                        }
                      }
                    } else {
                      break L29;
                    }
                  }
                  ((qd) this).field_eb = false;
                  ((qd) this).field_db = false;
                  break L17;
                } else {
                  break L17;
                }
              } else {
                break L18;
              }
            }
          }
          if (!((qd) this).field_z) {
            L31: {
              if (kd.field_b != 2) {
                break L31;
              } else {
                if (!((qd) this).field_db) {
                  break L31;
                } else {
                  if (!((qd) this).field_eb) {
                    break L31;
                  } else {
                    if (((qd) this).field_w) {
                      var3_ref_id = (id) (Object) ((qd) this).field_H.c(83);
                      L32: while (true) {
                        if (var3_ref_id == null) {
                          break L31;
                        } else {
                          L33: {
                            if (!(var3_ref_id instanceof wb)) {
                              break L33;
                            } else {
                              if (((wb) (Object) var3_ref_id).field_Lb == ((qd) this).field_M) {
                                ((wb) (Object) var3_ref_id).field_eb = false;
                                break L33;
                              } else {
                                break L33;
                              }
                            }
                          }
                          var3_ref_id = (id) (Object) ((qd) this).field_H.b(6);
                          continue L32;
                        }
                      }
                    } else {
                      break L31;
                    }
                  }
                }
              }
            }
            L34: {
              ((qd) this).field_eb = false;
              stackOut_70_0 = this;
              stackIn_72_0 = stackOut_70_0;
              stackIn_71_0 = stackOut_70_0;
              if (1 != kd.field_b) {
                stackOut_72_0 = this;
                stackOut_72_1 = 0;
                stackIn_73_0 = stackOut_72_0;
                stackIn_73_1 = stackOut_72_1;
                break L34;
              } else {
                stackOut_71_0 = this;
                stackOut_71_1 = 1;
                stackIn_73_0 = stackOut_71_0;
                stackIn_73_1 = stackOut_71_1;
                break L34;
              }
            }
            ((qd) this).field_w = stackIn_73_1 != 0;
            ((qd) this).field_p = bo.field_d;
            ((qd) this).field_F = bd.field_g;
            ((qd) this).field_db = true;
            break L17;
          } else {
            break L17;
          }
        }
        L35: {
          if (pq.field_f == 2) {
            break L35;
          } else {
            ((qd) this).field_q = -1;
            break L35;
          }
        }
        var3 = -105 % ((-52 - param0) / 52);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        wb var8 = null;
        Exception var8_ref = null;
        wb var9 = null;
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
                  var8.field_V = param4 << 16;
                  var8.field_L = param2 << 16;
                  var9.field_L = param6 << 16;
                  var9.field_V = param0 << 16;
                  var8.a(param5, var9);
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = (Exception) (Object) decompiledCaughtException;
          return;
        }
    }

    final int a(int param0, byte param1) {
        if (param1 >= 107) {
          return op.field_m.a(tg.field_e.field_f[param0], tg.field_e.field_d[param0], ((qd) this).field_M, false);
        } else {
          return 126;
        }
    }

    final void a(byte param0, boolean param1) {
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
        int stackIn_17_0 = 0;
        int stackIn_33_0 = 0;
        nm stackIn_46_0 = null;
        nm stackIn_47_0 = null;
        nm stackIn_48_0 = null;
        nm stackIn_49_0 = null;
        nm stackIn_50_0 = null;
        nm stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        nm stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        boolean stackIn_52_2 = false;
        nm stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        boolean stackIn_53_2 = false;
        nm stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        boolean stackIn_54_2 = false;
        nm stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        boolean stackIn_55_2 = false;
        nm stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        boolean stackIn_56_2 = false;
        int stackIn_56_3 = 0;
        nm stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        boolean stackIn_57_2 = false;
        int stackIn_57_3 = 0;
        nm stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        boolean stackIn_58_2 = false;
        int stackIn_58_3 = 0;
        nm stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        boolean stackIn_59_2 = false;
        int stackIn_59_3 = 0;
        nm stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        boolean stackIn_60_2 = false;
        int stackIn_60_3 = 0;
        nm stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        boolean stackIn_61_2 = false;
        int stackIn_61_3 = 0;
        int stackIn_61_4 = 0;
        nm stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        boolean stackIn_62_2 = false;
        int stackIn_62_3 = 0;
        int stackIn_62_4 = 0;
        int stackIn_62_5 = 0;
        nm stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        boolean stackIn_63_2 = false;
        int stackIn_63_3 = 0;
        int stackIn_63_4 = 0;
        int stackIn_63_5 = 0;
        nm stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        boolean stackIn_64_2 = false;
        int stackIn_64_3 = 0;
        int stackIn_64_4 = 0;
        int stackIn_64_5 = 0;
        nm stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        boolean stackIn_65_2 = false;
        int stackIn_65_3 = 0;
        int stackIn_65_4 = 0;
        int stackIn_65_5 = 0;
        nm stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        boolean stackIn_66_2 = false;
        int stackIn_66_3 = 0;
        int stackIn_66_4 = 0;
        int stackIn_66_5 = 0;
        int stackIn_66_6 = 0;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        nm stackOut_45_0 = null;
        nm stackOut_46_0 = null;
        nm stackOut_47_0 = null;
        nm stackOut_48_0 = null;
        nm stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        nm stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        nm stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        boolean stackOut_51_2 = false;
        nm stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        boolean stackOut_52_2 = false;
        nm stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        boolean stackOut_55_2 = false;
        int stackOut_55_3 = 0;
        nm stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        boolean stackOut_53_2 = false;
        nm stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        boolean stackOut_54_2 = false;
        int stackOut_54_3 = 0;
        nm stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        boolean stackOut_56_2 = false;
        int stackOut_56_3 = 0;
        nm stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        boolean stackOut_57_2 = false;
        int stackOut_57_3 = 0;
        nm stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        boolean stackOut_60_2 = false;
        int stackOut_60_3 = 0;
        int stackOut_60_4 = 0;
        nm stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        boolean stackOut_58_2 = false;
        int stackOut_58_3 = 0;
        nm stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        boolean stackOut_59_2 = false;
        int stackOut_59_3 = 0;
        int stackOut_59_4 = 0;
        nm stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        boolean stackOut_61_2 = false;
        int stackOut_61_3 = 0;
        int stackOut_61_4 = 0;
        int stackOut_61_5 = 0;
        nm stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        boolean stackOut_62_2 = false;
        int stackOut_62_3 = 0;
        int stackOut_62_4 = 0;
        int stackOut_62_5 = 0;
        nm stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        boolean stackOut_65_2 = false;
        int stackOut_65_3 = 0;
        int stackOut_65_4 = 0;
        int stackOut_65_5 = 0;
        int stackOut_65_6 = 0;
        nm stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        boolean stackOut_63_2 = false;
        int stackOut_63_3 = 0;
        int stackOut_63_4 = 0;
        int stackOut_63_5 = 0;
        nm stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        boolean stackOut_64_2 = false;
        int stackOut_64_3 = 0;
        int stackOut_64_4 = 0;
        int stackOut_64_5 = 0;
        int stackOut_64_6 = 0;
        int stackOut_100_0 = 0;
        int stackOut_100_1 = 0;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        var3 = 0;
        var4 = ((qd) this).field_k.field_k;
        var5 = ((qd) this).field_k.field_g;
        var6 = ((qd) this).field_k.field_d;
        var7 = 0;
        L0: while (true) {
          if (var7 >= op.field_m.field_a.length) {
            var7 = 0;
            L1: while (true) {
              if (op.field_m.field_z.length <= var7) {
                L2: {
                  if (2 != ll.field_k.field_k) {
                    stackOut_16_0 = 16;
                    stackIn_17_0 = stackOut_16_0;
                    break L2;
                  } else {
                    stackOut_15_0 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    break L2;
                  }
                }
                L3: {
                  ke.field_b = stackIn_17_0;
                  if (!gf.field_h) {
                    L4: {
                      if (!this.c((byte) 104)) {
                        if (op.field_m.field_l != 0) {
                          break L4;
                        } else {
                          this.e(-121);
                          break L4;
                        }
                      } else {
                        if (!param1) {
                          break L4;
                        } else {
                          int discarded$8 = 15;
                          this.d();
                          this.e(107);
                          break L4;
                        }
                      }
                    }
                    L5: {
                      ((qd) this).field_J.a(-29987);
                      if (!((qd) this).field_eb) {
                        ((qd) this).field_I.a(bo.field_d, bd.field_g, (byte) 113);
                        break L5;
                      } else {
                        ((qd) this).field_I.a(-1, -1, (byte) 101);
                        break L5;
                      }
                    }
                    L6: {
                      int discarded$9 = -802;
                      if (!er.a()) {
                        stackOut_32_0 = 0;
                        stackIn_33_0 = stackOut_32_0;
                        break L6;
                      } else {
                        stackOut_31_0 = 1;
                        stackIn_33_0 = stackOut_31_0;
                        break L6;
                      }
                    }
                    var3 = stackIn_33_0;
                    break L3;
                  } else {
                    this.e(-106);
                    break L3;
                  }
                }
                L7: {
                  var7 = ((qd) this).field_k.field_k;
                  var8 = ((qd) this).field_k.field_g;
                  if (((qd) this).field_k.field_f) {
                    break L7;
                  } else {
                    if (!((qd) this).field_f) {
                      ((qd) this).field_k.a(((qd) this).field_h, (byte) -86, ((qd) this).field_R);
                      ((qd) this).field_f = true;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                if (param0 > 113) {
                  L8: {
                    if (!param1) {
                      ((qd) this).field_k.a(false, false, false, false, (byte) -91, false);
                      break L8;
                    } else {
                      L9: {
                        if (!iq.field_f) {
                          break L9;
                        } else {
                          if (!sq.field_N) {
                            break L9;
                          } else {
                            if (re.field_b) {
                              ((qd) this).field_k.a(lc.field_m[96], lc.field_m[81], lc.field_m[98], lc.field_m[97], (byte) -91, lc.field_m[99]);
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      L10: {
                        L11: {
                          stackOut_45_0 = ((qd) this).field_k;
                          stackIn_49_0 = stackOut_45_0;
                          stackIn_46_0 = stackOut_45_0;
                          if (lc.field_m[96]) {
                            break L11;
                          } else {
                            L12: {
                              stackOut_46_0 = (nm) (Object) stackIn_46_0;
                              stackIn_50_0 = stackOut_46_0;
                              stackIn_47_0 = stackOut_46_0;
                              if (!lc.field_m[field_e]) {
                                break L12;
                              } else {
                                stackOut_47_0 = (nm) (Object) stackIn_47_0;
                                stackIn_50_0 = stackOut_47_0;
                                stackIn_48_0 = stackOut_47_0;
                                if (lc.field_m[82]) {
                                  break L12;
                                } else {
                                  stackOut_48_0 = (nm) (Object) stackIn_48_0;
                                  stackIn_49_0 = stackOut_48_0;
                                  break L11;
                                }
                              }
                            }
                            stackOut_50_0 = (nm) (Object) stackIn_50_0;
                            stackOut_50_1 = 0;
                            stackIn_51_0 = stackOut_50_0;
                            stackIn_51_1 = stackOut_50_1;
                            break L10;
                          }
                        }
                        stackOut_49_0 = (nm) (Object) stackIn_49_0;
                        stackOut_49_1 = 1;
                        stackIn_51_0 = stackOut_49_0;
                        stackIn_51_1 = stackOut_49_1;
                        break L10;
                      }
                      L13: {
                        L14: {
                          stackOut_51_0 = (nm) (Object) stackIn_51_0;
                          stackOut_51_1 = stackIn_51_1;
                          stackOut_51_2 = lc.field_m[81];
                          stackIn_54_0 = stackOut_51_0;
                          stackIn_54_1 = stackOut_51_1;
                          stackIn_54_2 = stackOut_51_2;
                          stackIn_52_0 = stackOut_51_0;
                          stackIn_52_1 = stackOut_51_1;
                          stackIn_52_2 = stackOut_51_2;
                          if (lc.field_m[98]) {
                            break L14;
                          } else {
                            stackOut_52_0 = (nm) (Object) stackIn_52_0;
                            stackOut_52_1 = stackIn_52_1;
                            stackOut_52_2 = stackIn_52_2;
                            stackIn_55_0 = stackOut_52_0;
                            stackIn_55_1 = stackOut_52_1;
                            stackIn_55_2 = stackOut_52_2;
                            stackIn_53_0 = stackOut_52_0;
                            stackIn_53_1 = stackOut_52_1;
                            stackIn_53_2 = stackOut_52_2;
                            if (!lc.field_m[rp.field_d]) {
                              stackOut_55_0 = (nm) (Object) stackIn_55_0;
                              stackOut_55_1 = stackIn_55_1;
                              stackOut_55_2 = stackIn_55_2;
                              stackOut_55_3 = 0;
                              stackIn_56_0 = stackOut_55_0;
                              stackIn_56_1 = stackOut_55_1;
                              stackIn_56_2 = stackOut_55_2;
                              stackIn_56_3 = stackOut_55_3;
                              break L13;
                            } else {
                              stackOut_53_0 = (nm) (Object) stackIn_53_0;
                              stackOut_53_1 = stackIn_53_1;
                              stackOut_53_2 = stackIn_53_2;
                              stackIn_54_0 = stackOut_53_0;
                              stackIn_54_1 = stackOut_53_1;
                              stackIn_54_2 = stackOut_53_2;
                              break L14;
                            }
                          }
                        }
                        stackOut_54_0 = (nm) (Object) stackIn_54_0;
                        stackOut_54_1 = stackIn_54_1;
                        stackOut_54_2 = stackIn_54_2;
                        stackOut_54_3 = 1;
                        stackIn_56_0 = stackOut_54_0;
                        stackIn_56_1 = stackOut_54_1;
                        stackIn_56_2 = stackOut_54_2;
                        stackIn_56_3 = stackOut_54_3;
                        break L13;
                      }
                      L15: {
                        L16: {
                          stackOut_56_0 = (nm) (Object) stackIn_56_0;
                          stackOut_56_1 = stackIn_56_1;
                          stackOut_56_2 = stackIn_56_2;
                          stackOut_56_3 = stackIn_56_3;
                          stackIn_59_0 = stackOut_56_0;
                          stackIn_59_1 = stackOut_56_1;
                          stackIn_59_2 = stackOut_56_2;
                          stackIn_59_3 = stackOut_56_3;
                          stackIn_57_0 = stackOut_56_0;
                          stackIn_57_1 = stackOut_56_1;
                          stackIn_57_2 = stackOut_56_2;
                          stackIn_57_3 = stackOut_56_3;
                          if (lc.field_m[97]) {
                            break L16;
                          } else {
                            stackOut_57_0 = (nm) (Object) stackIn_57_0;
                            stackOut_57_1 = stackIn_57_1;
                            stackOut_57_2 = stackIn_57_2;
                            stackOut_57_3 = stackIn_57_3;
                            stackIn_60_0 = stackOut_57_0;
                            stackIn_60_1 = stackOut_57_1;
                            stackIn_60_2 = stackOut_57_2;
                            stackIn_60_3 = stackOut_57_3;
                            stackIn_58_0 = stackOut_57_0;
                            stackIn_58_1 = stackOut_57_1;
                            stackIn_58_2 = stackOut_57_2;
                            stackIn_58_3 = stackOut_57_3;
                            if (!lc.field_m[bd.field_d]) {
                              stackOut_60_0 = (nm) (Object) stackIn_60_0;
                              stackOut_60_1 = stackIn_60_1;
                              stackOut_60_2 = stackIn_60_2;
                              stackOut_60_3 = stackIn_60_3;
                              stackOut_60_4 = 0;
                              stackIn_61_0 = stackOut_60_0;
                              stackIn_61_1 = stackOut_60_1;
                              stackIn_61_2 = stackOut_60_2;
                              stackIn_61_3 = stackOut_60_3;
                              stackIn_61_4 = stackOut_60_4;
                              break L15;
                            } else {
                              stackOut_58_0 = (nm) (Object) stackIn_58_0;
                              stackOut_58_1 = stackIn_58_1;
                              stackOut_58_2 = stackIn_58_2;
                              stackOut_58_3 = stackIn_58_3;
                              stackIn_59_0 = stackOut_58_0;
                              stackIn_59_1 = stackOut_58_1;
                              stackIn_59_2 = stackOut_58_2;
                              stackIn_59_3 = stackOut_58_3;
                              break L16;
                            }
                          }
                        }
                        stackOut_59_0 = (nm) (Object) stackIn_59_0;
                        stackOut_59_1 = stackIn_59_1;
                        stackOut_59_2 = stackIn_59_2;
                        stackOut_59_3 = stackIn_59_3;
                        stackOut_59_4 = 1;
                        stackIn_61_0 = stackOut_59_0;
                        stackIn_61_1 = stackOut_59_1;
                        stackIn_61_2 = stackOut_59_2;
                        stackIn_61_3 = stackOut_59_3;
                        stackIn_61_4 = stackOut_59_4;
                        break L15;
                      }
                      L17: {
                        L18: {
                          stackOut_61_0 = (nm) (Object) stackIn_61_0;
                          stackOut_61_1 = stackIn_61_1;
                          stackOut_61_2 = stackIn_61_2;
                          stackOut_61_3 = stackIn_61_3;
                          stackOut_61_4 = stackIn_61_4;
                          stackOut_61_5 = -91;
                          stackIn_64_0 = stackOut_61_0;
                          stackIn_64_1 = stackOut_61_1;
                          stackIn_64_2 = stackOut_61_2;
                          stackIn_64_3 = stackOut_61_3;
                          stackIn_64_4 = stackOut_61_4;
                          stackIn_64_5 = stackOut_61_5;
                          stackIn_62_0 = stackOut_61_0;
                          stackIn_62_1 = stackOut_61_1;
                          stackIn_62_2 = stackOut_61_2;
                          stackIn_62_3 = stackOut_61_3;
                          stackIn_62_4 = stackOut_61_4;
                          stackIn_62_5 = stackOut_61_5;
                          if (lc.field_m[99]) {
                            break L18;
                          } else {
                            stackOut_62_0 = (nm) (Object) stackIn_62_0;
                            stackOut_62_1 = stackIn_62_1;
                            stackOut_62_2 = stackIn_62_2;
                            stackOut_62_3 = stackIn_62_3;
                            stackOut_62_4 = stackIn_62_4;
                            stackOut_62_5 = stackIn_62_5;
                            stackIn_65_0 = stackOut_62_0;
                            stackIn_65_1 = stackOut_62_1;
                            stackIn_65_2 = stackOut_62_2;
                            stackIn_65_3 = stackOut_62_3;
                            stackIn_65_4 = stackOut_62_4;
                            stackIn_65_5 = stackOut_62_5;
                            stackIn_63_0 = stackOut_62_0;
                            stackIn_63_1 = stackOut_62_1;
                            stackIn_63_2 = stackOut_62_2;
                            stackIn_63_3 = stackOut_62_3;
                            stackIn_63_4 = stackOut_62_4;
                            stackIn_63_5 = stackOut_62_5;
                            if (!lc.field_m[uq.field_g]) {
                              stackOut_65_0 = (nm) (Object) stackIn_65_0;
                              stackOut_65_1 = stackIn_65_1;
                              stackOut_65_2 = stackIn_65_2;
                              stackOut_65_3 = stackIn_65_3;
                              stackOut_65_4 = stackIn_65_4;
                              stackOut_65_5 = stackIn_65_5;
                              stackOut_65_6 = 0;
                              stackIn_66_0 = stackOut_65_0;
                              stackIn_66_1 = stackOut_65_1;
                              stackIn_66_2 = stackOut_65_2;
                              stackIn_66_3 = stackOut_65_3;
                              stackIn_66_4 = stackOut_65_4;
                              stackIn_66_5 = stackOut_65_5;
                              stackIn_66_6 = stackOut_65_6;
                              break L17;
                            } else {
                              stackOut_63_0 = (nm) (Object) stackIn_63_0;
                              stackOut_63_1 = stackIn_63_1;
                              stackOut_63_2 = stackIn_63_2;
                              stackOut_63_3 = stackIn_63_3;
                              stackOut_63_4 = stackIn_63_4;
                              stackOut_63_5 = stackIn_63_5;
                              stackIn_64_0 = stackOut_63_0;
                              stackIn_64_1 = stackOut_63_1;
                              stackIn_64_2 = stackOut_63_2;
                              stackIn_64_3 = stackOut_63_3;
                              stackIn_64_4 = stackOut_63_4;
                              stackIn_64_5 = stackOut_63_5;
                              break L18;
                            }
                          }
                        }
                        stackOut_64_0 = (nm) (Object) stackIn_64_0;
                        stackOut_64_1 = stackIn_64_1;
                        stackOut_64_2 = stackIn_64_2;
                        stackOut_64_3 = stackIn_64_3;
                        stackOut_64_4 = stackIn_64_4;
                        stackOut_64_5 = stackIn_64_5;
                        stackOut_64_6 = 1;
                        stackIn_66_0 = stackOut_64_0;
                        stackIn_66_1 = stackOut_64_1;
                        stackIn_66_2 = stackOut_64_2;
                        stackIn_66_3 = stackOut_64_3;
                        stackIn_66_4 = stackOut_64_4;
                        stackIn_66_5 = stackOut_64_5;
                        stackIn_66_6 = stackOut_64_6;
                        break L17;
                      }
                      ((nm) (Object) stackIn_66_0).a(stackIn_66_1 != 0, stackIn_66_2, stackIn_66_3 != 0, stackIn_66_4 != 0, (byte) stackIn_66_5, stackIn_66_6 != 0);
                      break L8;
                    }
                  }
                  L19: {
                    if (0 >= ((qd) this).field_l) {
                      break L19;
                    } else {
                      L20: {
                        if (((qd) this).field_l < 640) {
                          break L20;
                        } else {
                          if (op.field_m.field_l != 0) {
                            break L20;
                          } else {
                            if (op.field_m.field_l != 0) {
                              break L19;
                            } else {
                              if (0.95 >= (double)((qd) this).field_k.field_t) {
                                break L19;
                              } else {
                                break L20;
                              }
                            }
                          }
                        }
                      }
                      ((qd) this).field_l = ((qd) this).field_l - 15;
                      break L19;
                    }
                  }
                  L21: {
                    if (!gf.field_h) {
                      if (!((qd) this).field_eb) {
                        break L21;
                      } else {
                        if (1 == pq.field_f) {
                          ((qd) this).field_p = ((qd) this).field_p - (((qd) this).field_k.field_g - var8);
                          ((qd) this).field_F = ((qd) this).field_F - (((qd) this).field_k.field_k + -var7);
                          if (-1 == ((qd) this).field_F) {
                            ((qd) this).field_F = ((qd) this).field_F - 1;
                            break L21;
                          } else {
                            break L21;
                          }
                        } else {
                          break L21;
                        }
                      }
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (var3 != 0) {
                      break L22;
                    } else {
                      L23: {
                        var9 = bl.a((byte) 87);
                        if (((qd) this).field_a != 0L) {
                          break L23;
                        } else {
                          ((qd) this).field_a = var9 - 20L;
                          break L23;
                        }
                      }
                      L24: {
                        var11 = ((qd) this).field_W - -(int)((-((qd) this).field_t + var9) / 20L);
                        if (!df.field_I) {
                          break L24;
                        } else {
                          var11 = op.field_m.field_H;
                          break L24;
                        }
                      }
                      L25: {
                        var12 = var11 + -op.field_m.field_H;
                        var13 = 0;
                        if (var12 >= 0) {
                          L26: while (true) {
                            L27: {
                              L28: {
                                L29: {
                                  if (var9 - ((qd) this).field_a < 20L) {
                                    break L29;
                                  } else {
                                    if (var11 == op.field_m.field_H) {
                                      break L28;
                                    } else {
                                      break L29;
                                    }
                                  }
                                }
                                stackOut_100_0 = var11;
                                stackOut_100_1 = op.field_m.field_H;
                                stackIn_101_0 = stackOut_100_0;
                                stackIn_101_1 = stackOut_100_1;
                                if (stackIn_101_0 <= stackIn_101_1) {
                                  break L27;
                                } else {
                                  break L28;
                                }
                              }
                              var13++;
                              this.a((byte) 51);
                              ((qd) this).field_a = ((qd) this).field_a + 20L;
                              int fieldTemp$10 = ((qd) this).field_gb - 1;
                              ((qd) this).field_gb = ((qd) this).field_gb - 1;
                              if (fieldTemp$10 < 0) {
                                continue L26;
                              } else {
                                if (((qd) this).field_g >= var13) {
                                  continue L26;
                                } else {
                                  break L27;
                                }
                              }
                            }
                            if (var13 <= 1) {
                              break L25;
                            } else {
                              ((qd) this).field_gb = ((qd) this).field_m;
                              break L25;
                            }
                          }
                        } else {
                          int fieldTemp$11 = ((qd) this).field_U - 1;
                          ((qd) this).field_U = ((qd) this).field_U - 1;
                          if (fieldTemp$11 < 0) {
                            this.a((byte) -91);
                            ((qd) this).field_U = -var12 / 8 + 1;
                            ((qd) this).field_a = ((qd) this).field_a + 20L;
                            break L25;
                          } else {
                            ((qd) this).field_a = ((qd) this).field_a + 20L;
                            vd.a(false, 20L);
                            break L25;
                          }
                        }
                      }
                      if (!this.c((byte) 120)) {
                        ((qd) this).field_G.c(0);
                        break L22;
                      } else {
                        ((qd) this).field_G.b((byte) 105, -op.field_m.field_H + op.field_m.field_C);
                        break L22;
                      }
                    }
                  }
                  L30: {
                    L31: {
                      if (!pp.field_n) {
                        break L31;
                      } else {
                        if (!((qd) this).field_k.field_f) {
                          L32: {
                            ((qd) this).field_A = ((qd) this).field_A + Math.abs(-var4 + ((qd) this).field_k.field_k);
                            ((qd) this).field_jb = ((qd) this).field_jb + Math.abs(((qd) this).field_k.field_g + -var5);
                            ((qd) this).field_D = ((qd) this).field_D + Math.abs(-var6 + ((qd) this).field_k.field_d);
                            if (((qd) this).field_A - -((qd) this).field_jb <= 1100) {
                              break L32;
                            } else {
                              iq.a(-8, (byte) 99);
                              break L32;
                            }
                          }
                          if (((qd) this).field_D <= 2.200000047683716f) {
                            break L31;
                          } else {
                            iq.a(-7, (byte) 99);
                            break L31;
                          }
                        } else {
                          int discarded$12 = 1;
                          this.b();
                          g.a(((qd) this).field_H);
                          boolean discarded$13 = ((qd) this).a(param1, 15978);
                          break L30;
                        }
                      }
                    }
                    int discarded$14 = 1;
                    this.b();
                    g.a(((qd) this).field_H);
                    boolean discarded$15 = ((qd) this).a(param1, 15978);
                    break L30;
                  }
                  return;
                } else {
                  return;
                }
              } else {
                L33: {
                  if (0 >= op.field_m.field_z[var7]) {
                    op.field_m.field_z[var7] = 0;
                    break L33;
                  } else {
                    op.field_m.field_z[var7] = op.field_m.field_z[var7] - 1;
                    break L33;
                  }
                }
                var7++;
                continue L1;
              }
            }
          } else {
            L34: {
              if (op.field_m.field_a[var7] <= 0) {
                op.field_m.field_a[var7] = 0;
                break L34;
              } else {
                op.field_m.field_a[var7] = op.field_m.field_a[var7] - 1;
                break L34;
              }
            }
            var7++;
            continue L0;
          }
        }
    }

    private final void b(byte param0, int param1, int param2) {
        int var4 = 0;
        lq var5 = null;
        wb var6 = null;
        int var6_int = 0;
        th var7_ref_th = null;
        int var7 = 0;
        wb var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        wb var15 = null;
        int var15_int = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int[][] var21 = null;
        int[][] var22 = null;
        int[][] var24 = null;
        int[][] var26 = null;
        int[][] var28 = null;
        int[][] var29 = null;
        L0: {
          var20 = ZombieDawnMulti.field_E ? 1 : 0;
          ((qd) this).field_J.a(0, param2, param1);
          if (((qd) this).field_Q.a((byte) 98) <= 1) {
            param1 += 6;
            break L0;
          } else {
            int discarded$8 = 12949;
            param2 = po.d() + -(param2 % 24) + param2;
            int discarded$9 = 12949;
            param1 = po.d() + (-(param1 % 24) + param1);
            break L0;
          }
        }
        var4 = 1;
        var5 = new lq();
        var6 = (wb) (Object) ((qd) this).field_Q.c((byte) 121);
        L1: while (true) {
          if (var6 == null) {
            if (var4 == 0) {
              L2: {
                ((qd) this).field_J.b(true);
                if (!((qd) this).field_o.a(param1, param2, (byte) -69)) {
                  var6_int = param2 / 24;
                  var7 = param1 / 24;
                  var28 = ((qd) this).field_u.d(114);
                  var26 = var28;
                  var24 = var26;
                  var22 = var24;
                  var21 = var22;
                  var29 = var21;
                  var28[var7][var6_int] = 1;
                  var9 = 2;
                  var10 = 1;
                  var11 = ((qd) this).field_Q.a((byte) 98);
                  var12 = -1;
                  var13 = -1;
                  L3: while (true) {
                    L4: {
                      if (var11 < var9) {
                        break L4;
                      } else {
                        var14 = -1;
                        var15_int = -1;
                        var16 = 0;
                        L5: while (true) {
                          if (var28.length <= var16) {
                            L6: {
                              if (var14 != -1) {
                                break L6;
                              } else {
                                if (var15_int != -1) {
                                  break L6;
                                } else {
                                  ((qd) this).field_J.a(true);
                                  return;
                                }
                              }
                            }
                            L7: {
                              if (jk.a((byte) 123, var14, var28, var15_int - 1) != 0) {
                                break L7;
                              } else {
                                int incrementValue$10 = var9;
                                var9++;
                                var21[var15_int - 1][var14] = incrementValue$10;
                                break L7;
                              }
                            }
                            L8: {
                              if (jk.a((byte) -82, var14 - -1, var28, var15_int) == 0) {
                                int incrementValue$11 = var9;
                                var9++;
                                var28[var15_int][var14 + 1] = incrementValue$11;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            L9: {
                              if (jk.a((byte) -97, var14, var28, 1 + var15_int) != 0) {
                                break L9;
                              } else {
                                int incrementValue$12 = var9;
                                var9++;
                                var21[1 + var15_int][var14] = incrementValue$12;
                                break L9;
                              }
                            }
                            L10: {
                              if (jk.a((byte) 25, var14 + -1, var28, var15_int) != 0) {
                                break L10;
                              } else {
                                int incrementValue$13 = var9;
                                var9++;
                                var28[var15_int][var14 + -1] = incrementValue$13;
                                break L10;
                              }
                            }
                            var10++;
                            if (!((qd) this).field_o.b(var14, var15_int, 19024)) {
                              continue L3;
                            } else {
                              var13 = var15_int;
                              var12 = var14;
                              break L4;
                            }
                          } else {
                            var17 = 0;
                            L11: while (true) {
                              if (var28[0].length <= var17) {
                                var16++;
                                continue L5;
                              } else {
                                if (var10 == var28[var16][var17]) {
                                  var14 = var17;
                                  var15_int = var16;
                                  var17++;
                                  continue L11;
                                } else {
                                  var17++;
                                  continue L11;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    var14 = 0;
                    var15 = (wb) (Object) ((qd) this).field_Q.c((byte) 109);
                    L12: while (true) {
                      if (var15 == null) {
                        if (0 < var14) {
                          iq.a(-13, (byte) 99);
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        var14++;
                        var16 = -1;
                        var17 = -1;
                        var18 = 0;
                        L13: while (true) {
                          if (var29.length <= var18) {
                            L14: {
                              if (var16 != -1) {
                                break L14;
                              } else {
                                if (var17 != -1) {
                                  break L14;
                                } else {
                                  var16 = var12;
                                  var17 = var13;
                                  break L14;
                                }
                              }
                            }
                            L15: {
                              if (-1 != var16) {
                                break L15;
                              } else {
                                if (-1 == var17) {
                                  return;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            int discarded$14 = 12949;
                            var18 = po.d() + 24 * var16;
                            int discarded$15 = 12949;
                            var19 = 24 * var17 + po.d();
                            var15.a((byte) 95, 100 + op.field_m.field_H, var18, var19);
                            wd.a(var15.field_y, op.field_m.field_H, ma.field_a, var18, 61, var19);
                            var15 = (wb) (Object) ((qd) this).field_Q.b((byte) 108);
                            continue L12;
                          } else {
                            var19 = 0;
                            L16: while (true) {
                              if (var19 >= var29[0].length) {
                                var18++;
                                continue L13;
                              } else {
                                if (var14 == var29[var18][var19]) {
                                  var17 = var18;
                                  var16 = var19;
                                  var19++;
                                  continue L16;
                                } else {
                                  var19++;
                                  continue L16;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  L17: {
                    param2 = -6 + ((qd) this).field_o.g(-115);
                    param1 = ((qd) this).field_o.h(-110) - -15;
                    var6_int = 8192;
                    if (((qd) this).field_Q.a((byte) 98) <= 0) {
                      break L17;
                    } else {
                      var6_int = var6_int / ((qd) this).field_Q.a((byte) 98);
                      break L17;
                    }
                  }
                  L18: {
                    if (var6_int != 0) {
                      break L18;
                    } else {
                      var6_int = 1;
                      break L18;
                    }
                  }
                  var7 = 0;
                  var8 = (wb) (Object) ((qd) this).field_Q.c((byte) 88);
                  L19: while (true) {
                    if (var8 == null) {
                      break L2;
                    } else {
                      var9 = param2 - -(wn.a(-128, var7) * 48 >> 16);
                      var10 = (on.a(var7, -18924) * 48 >> 16) + param1;
                      var7 = var7 + var6_int;
                      var8.a((byte) 68, op.field_m.field_H - -100, var9, var10);
                      wd.a(var8.field_y, op.field_m.field_H, ma.field_a, param2, 65, param1);
                      var8 = (wb) (Object) ((qd) this).field_Q.b((byte) 117);
                      continue L19;
                    }
                  }
                }
              }
              L20: {
                if (param0 > 14) {
                  break L20;
                } else {
                  ((qd) this).b(false, -51, -45, 16);
                  break L20;
                }
              }
              var6 = (wb) (Object) var5.c((byte) 98);
              L21: while (true) {
                if (var6 == null) {
                  return;
                } else {
                  var6.a(-4564);
                  ((qd) this).field_Q.a(29664, (qa) (Object) var6);
                  var6 = (wb) (Object) var5.b((byte) 126);
                  continue L21;
                }
              }
            } else {
              ((qd) this).field_Q = var5;
              ((qd) this).field_J.a(true);
              return;
            }
          } else {
            L22: {
              var7_ref_th = ((qd) this).field_u.b(var6.g(124), param1, var6.h(119), param2, 8760);
              if (var7_ref_th != null) {
                var4 = 0;
                break L22;
              } else {
                var6.a(-4564);
                var5.a(29664, (qa) (Object) var6);
                break L22;
              }
            }
            var6 = (wb) (Object) ((qd) this).field_Q.b((byte) 100);
            continue L1;
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 >= -103) {
            ((qd) this).a((byte) -73, false);
        }
        op.field_m.a(param4, param2 != 9 ? 0 : 1, 118, param1, param3, ((qd) this).field_u);
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        L0: {
          if (he.field_a) {
            oo.c();
            break L0;
          } else {
            oo.h(0, 40, 640, 440);
            break L0;
          }
        }
        L1: {
          if (1.0f != ((qd) this).field_k.field_d) {
            var2 = (int)(1280.0f / ((qd) this).field_k.field_d);
            var3 = (int)(960.0f / ((qd) this).field_k.field_d);
            ki.field_k.f(0, 0, var2, var3);
            if (1.2999999523162842f < ((qd) this).field_k.field_d) {
              break L1;
            } else {
              break L1;
            }
          } else {
            ki.field_k.c(0, 0);
            break L1;
          }
        }
    }

    private final void e(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var4 = (-((qd) this).field_k.field_k + param2) / 4;
          var5 = (-((qd) this).field_k.field_g + param0) / 4;
          ((qd) this).field_k.a(var5 + ((qd) this).field_k.field_g, -var4 + param2, param2, ((qd) this).field_k.field_k, ((qd) this).field_k.field_g, param0, 0, param0 - var5, ((qd) this).field_k.field_k - -var4);
          ((qd) this).field_k.a((byte) 47);
          ((qd) this).field_k.field_i = ((qd) this).field_k.field_i * 6.0f;
          if (param1 < -36) {
            break L0;
          } else {
            field_N = 59;
            break L0;
          }
        }
    }

    final static void a(fm param0, int param1, String param2, int param3, td param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String stackIn_5_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
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
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = -1;
            var7 = 1;
            if (param3 > 82) {
              stackOut_3_0 = (String) param2;
              stackIn_5_0 = stackOut_3_0;
              L1: while (true) {
                if (((String) (Object) stackIn_5_0).length() <= var7) {
                  break L0;
                } else {
                  L2: {
                    var8 = param2.charAt(var7);
                    if (60 == var8) {
                      var6 = param4.field_e[0] + ((var5_int >> 8) - -param0.a(param2.substring(0, var7)));
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (-1 == var6) {
                      L4: {
                        if (var8 == 32) {
                          var5_int = var5_int + param1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      param4.field_e[var7] = param4.field_e[0] + (var5_int >> 8) + (param0.a(param2.substring(0, 1 + var7)) - param0.a((char) var8));
                      break L3;
                    } else {
                      param4.field_e[var7] = var6;
                      break L3;
                    }
                  }
                  L5: {
                    if (62 == var8) {
                      var6 = -1;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var7++;
                  stackOut_4_0 = (String) param2;
                  stackIn_5_0 = stackOut_4_0;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("qd.KB(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          L7: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44).append(param1).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          L8: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44).append(param3).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param4 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 41);
        }
    }

    private final void d(int param0, int param1) {
        int var4 = 0;
        L0: {
          var4 = ZombieDawnMulti.field_E ? 1 : 0;
          int discarded$3 = 0;
          pq.b();
          if (param1 == 3) {
            break L0;
          } else {
            ((qd) this).field_kb = null;
            break L0;
          }
        }
        L1: {
          if (param0 == 0) {
            int discarded$4 = 3;
            pj.a(0, 16, -16384, 22, 21, (byte) -27);
            int discarded$5 = 3;
            pj.a(0, 21, 16384, 23, 16, (byte) 122);
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
          } else {
            if (param0 != 1) {
              if (param0 != 2) {
                if (param0 != 3) {
                  if (param0 != 4) {
                    break L1;
                  } else {
                    h.b(param1 ^ -89, 4);
                    break L1;
                  }
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
                  break L1;
                }
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
                break L1;
              }
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
              break L1;
            }
          }
        }
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_15_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_118_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_116_0 = 0;
        L0: {
          var4 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param1 != 13) {
            if (gf.field_h) {
              break L0;
            } else {
              if (!this.c((byte) 124)) {
                return;
              } else {
                L1: {
                  if (df.field_I) {
                    L2: {
                      if (83 == param1) {
                        break L2;
                      } else {
                        if (param1 != 84) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    iq.a(-14, (byte) 99);
                    break L1;
                  } else {
                    L3: {
                      if (param1 != 84) {
                        break L3;
                      } else {
                        L4: {
                          if (iq.field_f) {
                            stackOut_14_0 = 0;
                            stackIn_15_0 = stackOut_14_0;
                            break L4;
                          } else {
                            stackOut_13_0 = 1;
                            stackIn_15_0 = stackOut_13_0;
                            break L4;
                          }
                        }
                        iq.field_f = stackIn_15_0 != 0;
                        break L3;
                      }
                    }
                    if (param1 != 80) {
                      break L1;
                    } else {
                      if (iq.field_f) {
                        break L1;
                      } else {
                        sq.field_N = true;
                        iq.field_f = true;
                        break L1;
                      }
                    }
                  }
                }
                L5: {
                  if (((qd) this).field_ab) {
                    L6: {
                      if (param1 != 41) {
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (40 == param1) {
                        L8: {
                          if (po.field_p) {
                            stackOut_31_0 = 0;
                            stackIn_32_0 = stackOut_31_0;
                            break L8;
                          } else {
                            stackOut_30_0 = 1;
                            stackIn_32_0 = stackOut_30_0;
                            break L8;
                          }
                        }
                        po.field_p = stackIn_32_0 != 0;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L9: {
                      if (32 != param1) {
                        break L9;
                      } else {
                        L10: {
                          if (wh.field_c) {
                            stackOut_36_0 = 0;
                            stackIn_37_0 = stackOut_36_0;
                            break L10;
                          } else {
                            stackOut_35_0 = 1;
                            stackIn_37_0 = stackOut_35_0;
                            break L10;
                          }
                        }
                        wh.field_c = stackIn_37_0 != 0;
                        break L9;
                      }
                    }
                    L11: {
                      if (param1 != 85) {
                        break L11;
                      } else {
                        L12: {
                          if (vk.field_E) {
                            stackOut_41_0 = 0;
                            stackIn_42_0 = stackOut_41_0;
                            break L12;
                          } else {
                            stackOut_40_0 = 1;
                            stackIn_42_0 = stackOut_40_0;
                            break L12;
                          }
                        }
                        vk.field_E = stackIn_42_0 != 0;
                        break L11;
                      }
                    }
                    L13: {
                      if (lc.field_m[86]) {
                        if (lc.field_m[81]) {
                          L14: {
                            if (param1 == 16) {
                              ((qd) this).field_m = 1;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          L15: {
                            if (param1 != 17) {
                              break L15;
                            } else {
                              ((qd) this).field_m = 2;
                              break L15;
                            }
                          }
                          L16: {
                            if (param1 != 18) {
                              break L16;
                            } else {
                              ((qd) this).field_m = 4;
                              break L16;
                            }
                          }
                          L17: {
                            if (19 == param1) {
                              ((qd) this).field_m = 8;
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          L18: {
                            if (param1 == 20) {
                              ((qd) this).field_m = 16;
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                          L19: {
                            if (21 != param1) {
                              break L19;
                            } else {
                              ((qd) this).field_m = 32;
                              break L19;
                            }
                          }
                          L20: {
                            if (param1 != 22) {
                              break L20;
                            } else {
                              ((qd) this).field_m = 64;
                              break L20;
                            }
                          }
                          L21: {
                            if (param1 != 23) {
                              break L21;
                            } else {
                              ((qd) this).field_m = 128;
                              break L21;
                            }
                          }
                          L22: {
                            if (24 == param1) {
                              ((qd) this).field_m = 256;
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          if (25 == param1) {
                            ((qd) this).field_m = 0;
                            break L13;
                          } else {
                            break L13;
                          }
                        } else {
                          L23: {
                            if (param1 != 16) {
                              break L23;
                            } else {
                              ((qd) this).field_g = 1;
                              break L23;
                            }
                          }
                          L24: {
                            if (param1 != 17) {
                              break L24;
                            } else {
                              ((qd) this).field_g = 2;
                              break L24;
                            }
                          }
                          L25: {
                            if (param1 == 18) {
                              ((qd) this).field_g = 4;
                              break L25;
                            } else {
                              break L25;
                            }
                          }
                          L26: {
                            if (param1 == 19) {
                              ((qd) this).field_g = 8;
                              break L26;
                            } else {
                              break L26;
                            }
                          }
                          L27: {
                            if (param1 != 20) {
                              break L27;
                            } else {
                              ((qd) this).field_g = 16;
                              break L27;
                            }
                          }
                          L28: {
                            if (21 == param1) {
                              ((qd) this).field_g = 32;
                              break L28;
                            } else {
                              break L28;
                            }
                          }
                          L29: {
                            if (22 == param1) {
                              ((qd) this).field_g = 64;
                              break L29;
                            } else {
                              break L29;
                            }
                          }
                          L30: {
                            if (param1 != 23) {
                              break L30;
                            } else {
                              ((qd) this).field_g = 128;
                              break L30;
                            }
                          }
                          L31: {
                            if (param1 == 24) {
                              ((qd) this).field_g = 256;
                              break L31;
                            } else {
                              break L31;
                            }
                          }
                          if (25 != param1) {
                            break L13;
                          } else {
                            ((qd) this).field_g = 0;
                            break L13;
                          }
                        }
                      } else {
                        break L13;
                      }
                    }
                    L32: {
                      if (param1 != 37) {
                        break L32;
                      } else {
                        L33: {
                          if (wj.field_n) {
                            stackOut_100_0 = 0;
                            stackIn_101_0 = stackOut_100_0;
                            break L33;
                          } else {
                            stackOut_99_0 = 1;
                            stackIn_101_0 = stackOut_99_0;
                            break L33;
                          }
                        }
                        wj.field_n = stackIn_101_0 != 0;
                        break L32;
                      }
                    }
                    L34: {
                      if (param1 == 34) {
                        L35: {
                          if (qq.field_h) {
                            stackOut_106_0 = 0;
                            stackIn_107_0 = stackOut_106_0;
                            break L35;
                          } else {
                            stackOut_105_0 = 1;
                            stackIn_107_0 = stackOut_105_0;
                            break L35;
                          }
                        }
                        qq.field_h = stackIn_107_0 != 0;
                        break L34;
                      } else {
                        break L34;
                      }
                    }
                    L36: {
                      if (param1 != 38) {
                        break L36;
                      } else {
                        L37: {
                          if (n.field_g) {
                            stackOut_111_0 = 0;
                            stackIn_112_0 = stackOut_111_0;
                            break L37;
                          } else {
                            stackOut_110_0 = 1;
                            stackIn_112_0 = stackOut_110_0;
                            break L37;
                          }
                        }
                        n.field_g = stackIn_112_0 != 0;
                        break L36;
                      }
                    }
                    L38: {
                      if (param1 == 36) {
                        L39: {
                          if (sc.field_a) {
                            stackOut_117_0 = 0;
                            stackIn_118_0 = stackOut_117_0;
                            break L39;
                          } else {
                            stackOut_116_0 = 1;
                            stackIn_118_0 = stackOut_116_0;
                            break L39;
                          }
                        }
                        sc.field_a = stackIn_118_0 != 0;
                        break L38;
                      } else {
                        break L38;
                      }
                    }
                    L40: {
                      if (param1 != 41) {
                        break L40;
                      } else {
                        tl.a(2, (byte) -11, ma.field_a, 0, ((qd) this).field_M, 0);
                        if (gf.field_h) {
                          break L40;
                        } else {
                          ((qd) this).field_I.b(113);
                          break L40;
                        }
                      }
                    }
                    L41: {
                      if (2 == param1) {
                        tl.a(0, (byte) -11, ma.field_a, ((qd) this).field_k.a(true, bo.field_d), 0, ((qd) this).field_k.a(bd.field_g, 2));
                        break L41;
                      } else {
                        break L41;
                      }
                    }
                    L42: {
                      if (param1 != 4) {
                        break L42;
                      } else {
                        tl.a(1, (byte) -11, ma.field_a, 0, ((qd) this).field_M, 0);
                        break L42;
                      }
                    }
                    L43: {
                      if (5 != param1) {
                        break L43;
                      } else {
                        tl.a(1, (byte) -11, ma.field_a, 0, (((qd) this).field_M + 1) % op.field_m.field_t, 0);
                        break L43;
                      }
                    }
                    L44: {
                      if (6 == param1) {
                        nk.a(120, la.field_n, 120, 0, si.field_C);
                        break L44;
                      } else {
                        break L44;
                      }
                    }
                    L45: {
                      if (7 == param1) {
                        nk.a(1500, la.field_n, 1500, 0, si.field_C);
                        break L45;
                      } else {
                        break L45;
                      }
                    }
                    if (param1 != 8) {
                      break L5;
                    } else {
                      tl.a(3, (byte) -11, ma.field_a, 0, 0, 2);
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                L46: {
                  var3 = -34 % ((param0 - 63) / 56);
                  if (!lc.field_m[82]) {
                    break L46;
                  } else {
                    if (param1 != 48) {
                      break L46;
                    } else {
                      this.a(((qd) this).field_u.field_r, ((qd) this).field_u.field_c, 0, 0, (byte) 5);
                      break L46;
                    }
                  }
                }
                L47: {
                  if (~eg.field_C == ~param1) {
                    ((qd) this).field_I.a(0, -1);
                    break L47;
                  } else {
                    break L47;
                  }
                }
                L48: {
                  if (~param1 != ~tl.field_v) {
                    break L48;
                  } else {
                    ((qd) this).field_I.a(1, -1);
                    break L48;
                  }
                }
                L49: {
                  if (tp.field_s == param1) {
                    ((qd) this).field_I.a(2, -1);
                    break L49;
                  } else {
                    break L49;
                  }
                }
                L50: {
                  if (~param1 != ~pd.field_c) {
                    break L50;
                  } else {
                    ((qd) this).field_I.a(3, -1);
                    break L50;
                  }
                }
                L51: {
                  if (mg.field_F != param1) {
                    break L51;
                  } else {
                    ((qd) this).field_I.a(4, -1);
                    break L51;
                  }
                }
                L52: {
                  L53: {
                    if (op.field_m.b((byte) -67, 51, ((qd) this).field_M)) {
                      L54: {
                        if (param1 == 35) {
                          this.a(((qd) this).field_k.a(640, 2), ((qd) this).field_k.a(true, 480), ((qd) this).field_k.a(true, 0), ((qd) this).field_k.a(0, 2), (byte) 5);
                          break L54;
                        } else {
                          break L54;
                        }
                      }
                      L55: {
                        if (!lc.field_m[82]) {
                          if (param1 != 16) {
                            if (17 == param1) {
                              this.a(2, 1782, lc.field_m[81]);
                              break L55;
                            } else {
                              if (param1 != 18) {
                                break L55;
                              } else {
                                this.a(3, 1782, lc.field_m[81]);
                                break L55;
                              }
                            }
                          } else {
                            this.a(1, 1782, lc.field_m[81]);
                            break L55;
                          }
                        } else {
                          if (param1 == 16) {
                            this.a((byte) 114, 1);
                            break L55;
                          } else {
                            if (param1 == 17) {
                              this.a((byte) 84, 2);
                              break L55;
                            } else {
                              if (param1 != 18) {
                                break L55;
                              } else {
                                this.a((byte) 44, 3);
                                break L55;
                              }
                            }
                          }
                        }
                      }
                      if (param1 != 53) {
                        break L52;
                      } else {
                        this.e(((qd) this).field_o.h(-85), -108, ((qd) this).field_o.g(63));
                        break L53;
                      }
                    } else {
                      break L53;
                    }
                  }
                  break L52;
                }
                return;
              }
            }
          } else {
            if (iq.field_f) {
              iq.field_f = false;
              return;
            } else {
              bm.a(false, 2, 126, sp.field_g);
              break L0;
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, byte param4) {
        wb var7 = null;
        int var8 = ZombieDawnMulti.field_E ? 1 : 0;
        br var6 = ((qd) this).field_H.c(125);
        while (var6 instanceof id) {
            if (var6 instanceof wb) {
                var7 = (wb) (Object) var6;
                if (((qd) this).field_M == var7.field_Lb) {
                    var7.field_eb = false;
                    if (!(!var7.a(param3, param1, param2, 48, param0))) {
                        ((qd) this).field_Q.a(29664, (qa) (Object) var7);
                        var7.r(0);
                    }
                }
            }
            var6 = var6.field_d;
        }
        if (!(((qd) this).field_Q.a((byte) 98) <= 1)) {
            iq.a(-5, (byte) 99);
        }
    }

    final void b(boolean param0, int param1, int param2, int param3) {
        if (param1 != 0) {
            return;
        }
        ((qd) this).field_O.a((br) (Object) new lj(param3, param2, param0), false);
    }

    final boolean b(int param0, int param1, int param2, int param3) {
        Object var5 = null;
        br var5_ref = null;
        br var6_ref_br = null;
        int var6 = 0;
        int var7 = 0;
        jj var7_ref_jj = null;
        int var8 = 0;
        int var9 = 0;
        cg var10 = null;
        pq var11 = null;
        ce var12 = null;
        int stackIn_32_0 = 0;
        int stackIn_44_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_27_0 = 0;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        var5 = null;
        var10 = (cg) (Object) op.field_m.field_A.c(49);
        L0: while (true) {
          if (var10 == null) {
            var11 = (pq) (Object) op.field_m.field_G.c(98);
            L1: while (true) {
              if (var11 == null) {
                var12 = (ce) (Object) op.field_m.field_s.c(39);
                L2: while (true) {
                  L3: {
                    if (var12 == null) {
                      break L3;
                    } else {
                      var5_ref = op.field_m.field_s.b(6);
                      if (var12.a(param0, param2, -1)) {
                        var12.c(-28188);
                        break L3;
                      } else {
                        var12 = (ce) (Object) var5_ref;
                        continue L2;
                      }
                    }
                  }
                  var6_ref_br = op.field_m.field_K.c(125);
                  L4: while (true) {
                    if (var6_ref_br == null) {
                      var6 = 0;
                      var7 = 0;
                      L5: while (true) {
                        if (op.field_m.field_a.length <= var7) {
                          if (var6 != 0) {
                            return true;
                          } else {
                            var7 = 0;
                            var8 = 0;
                            L6: while (true) {
                              if (op.field_m.field_z.length <= var8) {
                                L7: {
                                  if (param1 <= -100) {
                                    break L7;
                                  } else {
                                    ((qd) this).field_T = null;
                                    break L7;
                                  }
                                }
                                if (var7 == 0) {
                                  return false;
                                } else {
                                  return true;
                                }
                              } else {
                                L8: {
                                  if (var7 == 0) {
                                    if (op.field_m.field_z[var8] > 0) {
                                      stackOut_42_0 = 1;
                                      stackIn_44_0 = stackOut_42_0;
                                      break L8;
                                    } else {
                                      stackOut_41_0 = 0;
                                      stackIn_44_0 = stackOut_41_0;
                                      break L8;
                                    }
                                  } else {
                                    stackOut_39_0 = 1;
                                    stackIn_44_0 = stackOut_39_0;
                                    break L8;
                                  }
                                }
                                var7 = stackIn_44_0;
                                op.field_m.field_z[var8] = 0;
                                var8++;
                                continue L6;
                              }
                            }
                          }
                        } else {
                          L9: {
                            if (var6 == 0) {
                              if (op.field_m.field_a[var7] > 0) {
                                stackOut_30_0 = 1;
                                stackIn_32_0 = stackOut_30_0;
                                break L9;
                              } else {
                                stackOut_29_0 = 0;
                                stackIn_32_0 = stackOut_29_0;
                                break L9;
                              }
                            } else {
                              stackOut_27_0 = 1;
                              stackIn_32_0 = stackOut_27_0;
                              break L9;
                            }
                          }
                          var6 = stackIn_32_0;
                          op.field_m.field_a[var7] = 0;
                          var7++;
                          continue L5;
                        }
                      }
                    } else {
                      L10: {
                        if (!(var6_ref_br instanceof jj)) {
                          break L10;
                        } else {
                          var7_ref_jj = (jj) (Object) var6_ref_br;
                          if (var7_ref_jj.a(7, param0, param2)) {
                            var7_ref_jj.field_P = 1;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                      var6_ref_br = op.field_m.field_K.b(6);
                      continue L4;
                    }
                  }
                }
              } else {
                var5_ref = op.field_m.field_G.b(6);
                if (!var11.a(param0, false, param2)) {
                  var11 = (pq) (Object) var5_ref;
                  continue L1;
                } else {
                  var11.c(-24421);
                  var11.a(true);
                  return true;
                }
              }
            }
          } else {
            if (var10.a((byte) 60, param2, param0)) {
              var10.a(-1);
              return true;
            } else {
              var10 = (cg) (Object) op.field_m.field_A.b(6);
              continue L0;
            }
          }
        }
    }

    private final void a(byte param0, int param1) {
        br var3 = null;
        int var4 = 0;
        Object var5 = null;
        wb var5_ref = null;
        int var6 = 0;
        var5 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var3 = op.field_m.field_K.c(40);
        var4 = -123 % ((-35 - param0) / 45);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              if (!(var3 instanceof wb)) {
                break L1;
              } else {
                var5_ref = (wb) (Object) var3;
                if (!var5_ref.field_Bb) {
                  if (param1 == var5_ref.field_Kb) {
                    var5_ref.field_Kb = 0;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  var5_ref.field_Kb = param1;
                  break L1;
                }
              }
            }
            var3 = op.field_m.field_K.b(6);
            continue L0;
          }
        }
    }

    final void b(int param0, byte param1, int param2) {
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
            var7 = (ti) (Object) op.field_m.a(param2, (byte) 33);
            if (var7 == null) {
              System.out.println("*** character oid " + param2 + "is null!");
              break L0;
            } else {
              break L0;
            }
          }
          if (21 != var7.field_K) {
            L1: {
              if (!(var7 instanceof gm)) {
                L2: {
                  var5 = 4;
                  if (!op.field_m.b((byte) -124, 53, param0)) {
                    break L2;
                  } else {
                    var5 = var5 + var5 / 2;
                    break L2;
                  }
                }
                if (((qd) this).field_M != param0) {
                  uj discarded$4 = qq.b(1481485697, 79);
                  break L1;
                } else {
                  uj discarded$5 = qq.b(1481485697, 78);
                  break L1;
                }
              } else {
                L3: {
                  op.field_m.field_J[param0] = op.field_m.field_J[param0] + 1;
                  var5 = 10;
                  ((qd) this).f(27);
                  if (!op.field_m.b((byte) -88, 60, param0)) {
                    break L3;
                  } else {
                    var5 = var5 + var5 / 2;
                    break L3;
                  }
                }
                if (((qd) this).field_M == param0) {
                  L4: {
                    stackOut_13_0 = 62;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_14_0 = stackOut_13_0;
                    if (((gm) (Object) var7).m(param1 + 15557)) {
                      stackOut_15_0 = stackIn_15_0;
                      stackOut_15_1 = 77;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      break L4;
                    } else {
                      stackOut_14_0 = stackIn_14_0;
                      stackOut_14_1 = 76;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      break L4;
                    }
                  }
                  uj discarded$6 = pb.a((byte) stackIn_16_0, stackIn_16_1);
                  break L1;
                } else {
                  uj discarded$7 = pb.a((byte) 62, 79);
                  break L1;
                }
              }
            }
            ((qd) this).field_T.a((br) (Object) new wc(var7.g(-78), -30 + var7.h(-66), var5, true), false);
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
            ((qd) this).field_lb = false;
        }
        if (!(var4 instanceof wb)) {
            return;
        }
        id var5 = op.field_m.a(param1, (byte) 33);
        if (var4 == null) {
            return;
        }
        gm var6 = (gm) (Object) var5;
        wb var7 = (wb) (Object) var4;
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
        Object stackIn_12_0 = null;
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
        Object stackOut_11_0 = null;
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
              var6_int = param4.field_g >> 16;
              var7 = param4.field_h >> 16;
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
              ((qd) this).a(1, var6_int, var7);
              ((qd) this).field_H.a((br) (Object) var8, false);
              g.a(((qd) this).field_H);
              if (param1 == null) {
                break L2;
              } else {
                L3: {
                  if (!param1.field_Bb) {
                    break L3;
                  } else {
                    var8.r(0);
                    ((qd) this).field_Q.a(29664, (qa) (Object) var8);
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
                  if (((qd) this).field_M != param0) {
                    break L5;
                  } else {
                    ((qd) this).field_T.a((br) (Object) new wc(param2.g(104), param2.h(86) - 30, var9, true), false);
                    break L5;
                  }
                }
              }
              L6: {
                if (!((qd) this).field_G.b((byte) 31)) {
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
              stackOut_22_0 = (wb) var8;
              stackIn_23_0 = stackOut_22_0;
              break L0;
            } else {
              stackOut_11_0 = null;
              stackIn_12_0 = stackOut_11_0;
              return (wb) (Object) stackIn_12_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var6;
            stackOut_24_1 = new StringBuilder().append("qd.LB(").append(param0).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          L9: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          L10: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(44).append(param3).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param4 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L10;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 41);
        }
        return stackIn_23_0;
    }

    final void f(int param0) {
        op.field_m.c(-122);
        ((qd) this).field_G.h(2);
        if (op.field_m.field_l == 1) {
            ((qd) this).field_G.field_n = 2.0f;
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
        var5 = ((qd) this).field_k.a(param3, 2);
        var6 = ((qd) this).field_k.a(true, param2);
        if (param1 > 35) {
          var7 = null;
          var8 = -1;
          var9 = (id) (Object) ((qd) this).field_H.c(48);
          L0: while (true) {
            if (var9 == null) {
              return (ti) var7;
            } else {
              L1: {
                L2: {
                  L3: {
                    if (!param0) {
                      break L3;
                    } else {
                      if (var9 instanceof gm) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (param0) {
                    break L1;
                  } else {
                    if (!(var9 instanceof wb)) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var12 = (ti) (Object) var9;
                if (!var12.a(var5, true, var6)) {
                  break L1;
                } else {
                  if (var8 < var12.h(-90)) {
                    var8 = var12.h(124);
                    var7 = (Object) (Object) var12;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L4: {
                if (param0) {
                  break L4;
                } else {
                  if (var9 instanceof jj) {
                    var10 = (jj) (Object) var9;
                    if (var10.field_Q == ((qd) this).field_M) {
                      break L4;
                    } else {
                      if (!var10.a(7, var5, var6)) {
                        break L4;
                      } else {
                        ((qd) this).field_b = var10;
                        break L4;
                      }
                    }
                  } else {
                    var9 = (id) (Object) ((qd) this).field_H.b(6);
                    continue L0;
                  }
                }
              }
              var9 = (id) (Object) ((qd) this).field_H.b(6);
              continue L0;
            }
          }
        } else {
          return null;
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        ja var6 = null;
        L0: {
          var6 = am.a(0, op.field_m.field_D[param3][1], 0, 1, op.field_m.field_D[param3][0]);
          og.h((byte) 116);
          oo.h(320 - ((qd) this).field_l / 2, 0, 320 - -(((qd) this).field_l / 2), 480);
          if (320 <= param0) {
            var6.b(param0 - 24, param2);
            ah.field_e.a(op.field_m.field_b[param3], param0 - 24, 48 + param2, 0, 0);
            break L0;
          } else {
            var6.g(param0 - 24, param2);
            ah.field_e.c(op.field_m.field_b[param3], param0 - -24, 48 + param2, 0, 0);
            break L0;
          }
        }
    }

    final void b(int param0, int param1) {
        wb var3 = null;
        L0: {
          var3 = op.field_m.a(param0, false);
          if (var3 != null) {
            var3.e(false);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param1 == 10) {
            break L1;
          } else {
            ((qd) this).c((byte) -13, 20, 111);
            break L1;
          }
        }
    }

    final void a(boolean param0, ae param1) {
        ae var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!(param1 instanceof fq)) {
                break L1;
              } else {
                this.d(((fq) (Object) param1).field_l, param1.field_f, -30305);
                break L1;
              }
            }
            if (!((qd) this).field_hb.f(28113)) {
              if (!param0) {
                var3 = (ae) (Object) ((qd) this).field_hb.a((byte) -84);
                L2: while (true) {
                  if (var3 == null) {
                    ((qd) this).field_hb.a(-25612, (br) (Object) param1);
                    break L0;
                  } else {
                    if (param1.field_f <= var3.field_f) {
                      var3 = (ae) (Object) ((qd) this).field_hb.c((byte) 97);
                      continue L2;
                    } else {
                      int discarded$2 = 0;
                      qc.a((br) (Object) param1, (br) (Object) var3);
                      return;
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              ((qd) this).field_hb.a(-25612, (br) (Object) param1);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("qd.U(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    final void a(boolean param0, wb param1) {
        try {
            param1.c((byte) -70);
            param1.a(-4564);
            param1.a(param0);
            if (!param0) {
                ((qd) this).a(112, true, -72, (byte) -98, 26);
            }
            ((qd) this).field_G.h(2);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "qd.OA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        lc var5 = (lc) (Object) ((qd) this).field_X.g(106);
        if (!(var5 != null)) {
            var5 = new lc();
        }
        var5.a(param1, param3, op.field_m.a(param2, (byte) 33), (byte) 108);
        ((qd) this).field_C.a(-25612, (br) (Object) var5);
        g.a(((qd) this).field_C);
        int var6 = -116 / ((param0 - -36) / 61);
    }

    final void c(boolean param0, int param1) {
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
            ((qd) this).a((byte) 76, false);
            break L0;
          }
        }
        L1: {
          L2: {
            var3_int = param1;
            if (var3_int != 9) {
              L3: {
                if (3 == var3_int) {
                  var3 = op.field_m.field_K.c(47);
                  L4: while (true) {
                    if (var3 == null) {
                      break L3;
                    } else {
                      L5: {
                        if (var3 instanceof wb) {
                          var6 = (wb) (Object) var3;
                          if (var6.field_Lb == ((qd) this).field_M) {
                            this.e(var6.h(87), -61, var6.g(73));
                            wd.field_G = (id) (Object) var6;
                            break L2;
                          } else {
                            break L5;
                          }
                        } else {
                          break L5;
                        }
                      }
                      var3 = op.field_m.field_K.b(6);
                      continue L4;
                    }
                  }
                } else {
                  if (var3_int != 0) {
                    if (var3_int == 8) {
                      this.e(((qd) this).field_o.h(-102), -92, ((qd) this).field_o.g(61));
                      wd.field_G = (id) (Object) ((qd) this).field_o;
                      break L2;
                    } else {
                      if (5 != var3_int) {
                        if (11 == var3_int) {
                          we.field_g[7] = se.field_D;
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        var3 = op.field_m.field_K.c(89);
                        L6: while (true) {
                          if (var3 == null) {
                            break L3;
                          } else {
                            L7: {
                              if (!(var3 instanceof gm)) {
                                break L7;
                              } else {
                                var7 = (gm) (Object) var3;
                                if (var7.field_C == 4) {
                                  this.e(var7.h(-96), -49, var7.g(63));
                                  wd.field_G = (id) (Object) var7;
                                  break L2;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var3 = op.field_m.field_K.b(6);
                            continue L6;
                          }
                        }
                      }
                    }
                  } else {
                    this.e(gk.field_c, -81, hc.field_c);
                    break L2;
                  }
                }
              }
              break L2;
            } else {
              if (((qd) this).field_I.b(17, 0)) {
                boolean discarded$2 = ((qd) this).field_I.b(17, 0);
                break L2;
              } else {
                boolean discarded$3 = ((qd) this).field_I.a(81, 0, 255);
                break L1;
              }
            }
          }
          break L1;
        }
    }

    private final void a(int param0, fc param1) {
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
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        String stackIn_112_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_109_0 = null;
        StringBuilder stackOut_109_1 = null;
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        String stackOut_111_2 = null;
        RuntimeException stackOut_110_0 = null;
        StringBuilder stackOut_110_1 = null;
        String stackOut_110_2 = null;
        var19 = null;
        var16 = null;
        var17 = null;
        var18 = null;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              iq.field_f = false;
              ((qd) this).field_f = false;
              ((qd) this).field_Q.d(-1);
              ((qd) this).field_jb = 0;
              ((qd) this).field_A = 0;
              int discarded$4 = 113;
              on.j();
              if (df.field_I) {
                L2: {
                  if (pp.field_n) {
                    ah.a((byte) -86, 21);
                    break L2;
                  } else {
                    if (op.field_m.b((byte) -128, 45, ((qd) this).field_M)) {
                      ah.a((byte) -86, 20);
                      break L2;
                    } else {
                      ah.a((byte) -86, 19);
                      break L2;
                    }
                  }
                }
                iq.a(-1, (byte) 99);
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              ((qd) this).field_w = true;
              ((qd) this).field_mb = null;
              if (pp.field_n) {
                we.field_g[7] = e.field_b;
                break L3;
              } else {
                if (df.field_I) {
                  we.field_g[7] = se.field_D;
                  break L3;
                } else {
                  if (!gf.field_h) {
                    we.field_g[7] = kb.field_B;
                    break L3;
                  } else {
                    we.field_g[7] = pi.field_b;
                    break L3;
                  }
                }
              }
            }
            ((qd) this).field_eb = false;
            ((qd) this).field_db = false;
            ((qd) this).field_J = new uf();
            ((qd) this).field_Y = 0;
            ((qd) this).field_u = new fh(param1);
            ip.b((byte) 111);
            gj.a(6962);
            ((qd) this).field_k = new nm(((qd) this).field_u.field_r, ((qd) this).field_u.field_c);
            ((qd) this).field_k.field_f = false;
            this.d(param1.field_j, 3);
            ((qd) this).field_fb = op.field_m.field_r;
            ((qd) this).field_ib = 1;
            ((qd) this).field_O = new th();
            ((qd) this).field_cb = new th();
            ((qd) this).field_kb = new th();
            ((qd) this).field_T = new th();
            ((qd) this).field_hb = new th();
            ((qd) this).field_C = new th();
            ((qd) this).field_X = new th();
            ((qd) this).field_c = new lq();
            var3_int = -2147483647;
            var4 = -2147483647;
            var5 = 2147483647;
            var6 = 2147483647;
            var7 = param1.a(-120);
            var8 = (id) (Object) var7.c(44);
            L4: while (true) {
              if (var8 == null) {
                L5: {
                  L6: {
                    ((qd) this).field_h = (var6 - -var4) / 2;
                    ((qd) this).field_R = (var5 + var3_int) / 2;
                    if (gf.field_h) {
                      break L6;
                    } else {
                      if (!df.field_I) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  ((qd) this).field_h = ((qd) this).field_u.field_c / 2;
                  ((qd) this).field_R = ((qd) this).field_u.field_r / 2;
                  break L5;
                }
                L7: {
                  ((qd) this).field_k.a(((qd) this).field_h, (byte) -69, ((qd) this).field_R);
                  if (gf.field_h) {
                    ((qd) this).field_k.a(false);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                g.a(((qd) this).field_H);
                ((qd) this).field_j = 0;
                var8 = (id) (Object) ((qd) this).field_H.c(46);
                L8: while (true) {
                  if (var8 == null) {
                    ho.a((byte) -125, ((qd) this).field_u);
                    var24 = (cg) (Object) op.field_m.field_A.c(108);
                    L9: while (true) {
                      if (var24 == null) {
                        na.a((byte) 127, ((qd) this).field_u);
                        int discarded$5 = 256;
                        ih.a();
                        var25 = (ce) (Object) op.field_m.field_s.c(72);
                        L10: while (true) {
                          if (var25 == null) {
                            L11: {
                              if (gf.field_h) {
                                break L11;
                              } else {
                                ((qd) this).field_I = new ko();
                                if (pp.field_n) {
                                  break L11;
                                } else {
                                  var21 = ll.field_k;
                                  var9 = var21.g((byte) -116);
                                  var10 = 0;
                                  L12: while (true) {
                                    if (var9 <= var10) {
                                      break L11;
                                    } else {
                                      boolean discarded$6 = ((qd) this).field_I.a(87, tg.field_e.field_d[var10], tg.field_e.field_f[var10]);
                                      var10++;
                                      continue L12;
                                    }
                                  }
                                }
                              }
                            }
                            L13: {
                              ((qd) this).field_G = new qe();
                              var23 = gm.field_pb[hp.a((byte) -90, g.field_a, gm.field_pb.length)];
                              var8_ref = var23;
                              var22 = ah.field_e;
                              ((qd) this).field_y = new ja(var22.a(var23), var22.field_C + var22.field_r);
                              ((qd) this).field_L = new ja(12 + ((qd) this).field_y.field_x, ((qd) this).field_y.field_w - -12);
                              g.c(((qd) this).field_y);
                              ((qd) this).field_l = 640;
                              var22.b(var8_ref, ((qd) this).field_y.field_x / 2, ((qd) this).field_y.field_w + -var22.field_r, 2, -1);
                              ((qd) this).field_L.a();
                              oo.b(0, 0, ((qd) this).field_L.field_x, ((qd) this).field_L.field_w, 12, 8421504, 80);
                              ((qd) this).field_y.f(6, 6, 16777215);
                              oo.i(4, 4, 0, 0, oo.field_b, oo.field_l);
                              ((qd) this).field_y.f(6, 6, 0);
                              g.d();
                              if (op.field_m.field_t == 1) {
                                ((qd) this).field_l = 0;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            L14: {
                              ((qd) this).field_G.c(0);
                              if (df.field_I) {
                                ((qd) this).field_k.field_f = false;
                                op.field_m.field_l = 1;
                                break L14;
                              } else {
                                L15: {
                                  if (!gf.field_h) {
                                    break L15;
                                  } else {
                                    if (op.field_m.field_l == 0) {
                                      ((qd) this).a((byte) -36, 1, 0);
                                      break L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                ((qd) this).a((byte) -110, op.field_m.field_l, op.field_m.field_C);
                                break L14;
                              }
                            }
                            ((qd) this).field_W = op.field_m.field_H - 50;
                            ((qd) this).field_t = bl.a((byte) 43);
                            ((qd) this).field_G.a(((qd) this).field_Z, false);
                            int discarded$7 = 21;
                            this.a();
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
                          } else {
                            var25.a(((qd) this).field_u, -54);
                            var25 = (ce) (Object) op.field_m.field_s.b(6);
                            continue L10;
                          }
                        }
                      } else {
                        var24.a((byte) -85);
                        var24 = (cg) (Object) op.field_m.field_A.b(6);
                        continue L9;
                      }
                    }
                  } else {
                    L16: {
                      if (!(var8 instanceof gm)) {
                        break L16;
                      } else {
                        ((qd) this).field_j = ((qd) this).field_j + 1;
                        break L16;
                      }
                    }
                    var8 = (id) (Object) ((qd) this).field_H.b(6);
                    continue L8;
                  }
                }
              } else {
                L17: {
                  if (!(var8 instanceof h)) {
                    if (var8 instanceof wb) {
                      var16_ref = (wb) (Object) var8;
                      var20 = var16_ref;
                      if (~op.field_m.field_t < ~var20.field_Lb) {
                        if (op.field_m.field_y[var16_ref.field_Lb] == ((qd) this).field_M) {
                          L18: {
                            L19: {
                              var10 = var8.g(-35);
                              var11 = var8.h(-56);
                              var12 = var10 + -((var3_int + var5) / 2);
                              var13 = -((var4 + var6) / 2) + var11;
                              if (var3_int == 2147483647) {
                                break L19;
                              } else {
                                if (Math.abs(var12) >= 640) {
                                  break L18;
                                } else {
                                  if (Math.abs(var13) < 480) {
                                    break L19;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                            }
                            L20: {
                              if (~var5 < ~var10) {
                                var5 = var10;
                                break L20;
                              } else {
                                break L20;
                              }
                            }
                            L21: {
                              if (var11 <= var4) {
                                break L21;
                              } else {
                                var4 = var11;
                                break L21;
                              }
                            }
                            L22: {
                              if (var3_int >= var10) {
                                break L22;
                              } else {
                                var3_int = var10;
                                break L22;
                              }
                            }
                            if (var6 > var11) {
                              var6 = var11;
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                          if (df.field_I) {
                            gk.field_c = var11;
                            hc.field_c = var10;
                            break L17;
                          } else {
                            break L17;
                          }
                        } else {
                          var8 = (id) (Object) var7.b(6);
                          continue L4;
                        }
                      } else {
                        break L17;
                      }
                    } else {
                      if (var8 instanceof fd) {
                        ((qd) this).field_H.a((br) (Object) var8, false);
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                  } else {
                    L23: {
                      var15 = (h) (Object) var8;
                      var19_ref = var15;
                      if (op.field_m.field_t <= var19_ref.field_I) {
                        break L23;
                      } else {
                        var15.field_I = op.field_m.field_y[var15.field_I];
                        ((qd) this).field_H.a((br) (Object) var8, false);
                        ((qd) this).field_c.a(29664, (qa) (Object) var8);
                        if (var19_ref.field_I != ((qd) this).field_M) {
                          break L23;
                        } else {
                          L24: {
                            var10 = var8.g(89);
                            var11 = var8.h(74);
                            ((qd) this).field_o = var19_ref;
                            var12 = var10 - (var5 + var3_int) / 2;
                            var13 = -((var6 + var4) / 2) + var11;
                            if (var3_int == 2147483647) {
                              break L24;
                            } else {
                              L25: {
                                if (Math.abs(var12) >= 640) {
                                  break L25;
                                } else {
                                  if (Math.abs(var13) >= 480) {
                                    break L25;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                              var5 = var10;
                              var3_int = var10;
                              var6 = var11;
                              var4 = var11;
                              break L23;
                            }
                          }
                          L26: {
                            if (var11 < var6) {
                              var6 = var11;
                              break L26;
                            } else {
                              break L26;
                            }
                          }
                          L27: {
                            if (~var11 >= ~var4) {
                              break L27;
                            } else {
                              var4 = var11;
                              break L27;
                            }
                          }
                          L28: {
                            if (~var10 > ~var5) {
                              var5 = var10;
                              break L28;
                            } else {
                              break L28;
                            }
                          }
                          if (~var10 < ~var3_int) {
                            var3_int = var10;
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                      }
                    }
                    break L17;
                  }
                }
                var8 = (id) (Object) var7.b(6);
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L29: {
            var3 = decompiledCaughtException;
            stackOut_109_0 = (RuntimeException) var3;
            stackOut_109_1 = new StringBuilder().append("qd.FB(").append(6).append(44);
            stackIn_111_0 = stackOut_109_0;
            stackIn_111_1 = stackOut_109_1;
            stackIn_110_0 = stackOut_109_0;
            stackIn_110_1 = stackOut_109_1;
            if (param1 == null) {
              stackOut_111_0 = (RuntimeException) (Object) stackIn_111_0;
              stackOut_111_1 = (StringBuilder) (Object) stackIn_111_1;
              stackOut_111_2 = "null";
              stackIn_112_0 = stackOut_111_0;
              stackIn_112_1 = stackOut_111_1;
              stackIn_112_2 = stackOut_111_2;
              break L29;
            } else {
              stackOut_110_0 = (RuntimeException) (Object) stackIn_110_0;
              stackOut_110_1 = (StringBuilder) (Object) stackIn_110_1;
              stackOut_110_2 = "{...}";
              stackIn_112_0 = stackOut_110_0;
              stackIn_112_1 = stackOut_110_1;
              stackIn_112_2 = stackOut_110_2;
              break L29;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_112_0, stackIn_112_2 + 41);
        }
    }

    private final void a() {
        int var2 = 0;
        if (!(df.field_I)) {
            lb.a(((qd) this).field_ib, false, ((qd) this).field_fb);
        }
    }

    final void a(int param0, int param1, byte param2, int[] param3) {
        si var5 = null;
        try {
            if (param2 < 116) {
                this.e(95, -38, -6);
            }
            ((qd) this).field_lb = true;
            op.field_m.field_c = true;
            ((qd) this).a((byte) -57, 3, 0);
            ((qd) this).field_d = 450;
            var5 = (si) (Object) gk.a(2, 10);
            var5.a(param1, 0, param0, param3, op.field_m);
            ih.a(false, 256, hl.field_d[param0 != ((qd) this).field_M ? 14 : 13]);
            td.field_b = hl.field_d[11];
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "qd.S(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    private final void b(int param0) {
        int var3 = 0;
        Object var4 = null;
        wb var5 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((qd) this).field_Q.a((byte) 98) != 0) {
          var5 = (wb) (Object) ((qd) this).field_Q.c((byte) 112);
          L0: while (true) {
            if (var5 == null) {
              L1: {
                if (param0 <= -50) {
                  break L1;
                } else {
                  var4 = null;
                  ((qd) this).a((int[]) null, false);
                  break L1;
                }
              }
              ((qd) this).field_Q.d(-1);
              iq.a(-6, (byte) 99);
              return;
            } else {
              var5.t(16);
              var5 = (wb) (Object) ((qd) this).field_Q.b((byte) 88);
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final void c(int param0, int param1, int param2) {
        L0: {
          op.field_m.field_a[param0] = param1;
          if (param2 == -2) {
            break L0;
          } else {
            ((qd) this).field_O = null;
            break L0;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        wb var6 = null;
        gm var7 = null;
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
                      field_r = null;
                      break L2;
                    }
                  }
                  var6.field_z = param3 << 16;
                  var6.field_Eb = var7;
                  var6.field_E = param1 << 16;
                  var7.n(20);
                  var6.b(8, param0 ^ 26778);
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          return;
        }
    }

    private final void b() {
        wb var2 = null;
        int var3 = 0;
        wb var4 = null;
        wb var5 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        L0: {
          if (op.field_m.field_l != 0) {
            L1: {
              if (op.field_m.field_l == 3) {
                break L1;
              } else {
                if (op.field_m.field_c) {
                  break L1;
                } else {
                  if (op.field_m.field_l != 2) {
                    if (!df.field_I) {
                      break L0;
                    } else {
                      if (0 == op.field_m.field_m[((qd) this).field_M]) {
                        L2: {
                          if (!pp.field_n) {
                            break L2;
                          } else {
                            if (hg.field_rb == 11) {
                              break L2;
                            } else {
                              var4 = new wb(hc.field_c, gk.field_c, 0);
                              var2 = var4;
                              var2.field_Lb = ((qd) this).field_M;
                              var2.field_y = op.field_m.a(-16777216);
                              op.field_m.field_K.a(-25612, (br) (Object) var4);
                              op.field_m.field_m[((qd) this).field_M] = op.field_m.field_m[((qd) this).field_M] + 1;
                              var5 = new wb(hc.field_c, gk.field_c + -30, 1);
                              var2 = var5;
                              var2.field_Lb = ((qd) this).field_M;
                              var2.field_y = op.field_m.a(-16777216);
                              op.field_m.field_K.a(-25612, (br) (Object) var5);
                              op.field_m.field_m[((qd) this).field_M] = op.field_m.field_m[((qd) this).field_M] + 1;
                              iq.a(-12, (byte) 99);
                              break L0;
                            }
                          }
                        }
                        L3: {
                          L4: {
                            if (ai.field_b != 21) {
                              break L4;
                            } else {
                              if (hg.field_rb == 11) {
                                ud.field_S = true;
                                ec.field_c = true;
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          ec.field_c = false;
                          break L3;
                        }
                        wb.l((byte) 123);
                        bm.a(false, 15, 126, sp.field_g);
                        return;
                      } else {
                        break L0;
                      }
                    }
                  } else {
                    if (op.field_m.field_C - 1550 > op.field_m.field_H) {
                      break L0;
                    } else {
                      cj.d(true, 12);
                      break L0;
                    }
                  }
                }
              }
            }
            ((qd) this).field_eb = false;
            int fieldTemp$1 = ((qd) this).field_d;
            ((qd) this).field_d = ((qd) this).field_d - 1;
            if (0 == fieldTemp$1) {
              bm.a(false, 10, 126, sp.field_g);
              break L0;
            } else {
              break L0;
            }
          } else {
            if (((qd) this).field_W >= 400) {
              ((qd) this).a((byte) -25, 1, op.field_m.field_C);
              break L0;
            } else {
              break L0;
            }
          }
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
                if (param7 == 28) {
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
                          if (param7 == 13) {
                            break L1;
                          } else {
                            if (29 == param7) {
                              break L1;
                            } else {
                              if (param7 == 33) {
                                break L1;
                              } else {
                                L2: {
                                  if (var10.field_K != 5) {
                                    break L2;
                                  } else {
                                    if (param7 == 4) {
                                      return;
                                    } else {
                                      break L2;
                                    }
                                  }
                                }
                                L3: {
                                  if (~param7 != ~var10.field_K) {
                                    var10.b(param7, -27655);
                                    break L3;
                                  } else {
                                    break L3;
                                  }
                                }
                                var10.field_E = param6;
                                var10.field_z = param1;
                                var10.a(((qd) this).field_u.b(var10.g(-116), param4, var10.h(param2 + -65), param5, 8760), 88);
                                var10.d(6, param3);
                                break L0;
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
              ((qd) this).c(false, -121);
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
          var5 = ZombieDawnMulti.field_E ? 1 : 0;
          en.a(-1, 0);
          var4 = ((qd) this).field_n;
          if (var4 != 0) {
            if (var4 != 1) {
              break L0;
            } else {
              if (!((qd) this).field_I.h(1)) {
                if (0 >= ((qd) this).field_Q.a((byte) 98)) {
                  break L0;
                } else {
                  if (40 >= param1) {
                    break L0;
                  } else {
                    if (param1 >= 440) {
                      break L0;
                    } else {
                      this.b((byte) 104, ((qd) this).field_k.a(true, param1), ((qd) this).field_k.a(param2, 2));
                      break L0;
                    }
                  }
                }
              } else {
                return;
              }
            }
          } else {
            if (((qd) this).field_I.h(1)) {
              return;
            } else {
              this.b(-93);
              break L0;
            }
          }
        }
    }

    final int g(int param0) {
        int var2 = 25 / ((-72 - param0) / 49);
        return wq.field_a;
    }

    private final void d(int param0, int param1, int param2) {
        int var4 = 0;
        L0: {
          var4 = param0;
          if (1 == var4) {
            op.field_m.field_H = param1;
            break L0;
          } else {
            if (var4 != 2) {
              break L0;
            } else {
              break L0;
            }
          }
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
            if (op.field_m.field_l == 1) {
              break L1;
            } else {
              if (op.field_m.field_l != 2) {
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
            stackOut_0_0 = (cj) var13;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var13_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var13_ref;
            stackOut_2_1 = new StringBuilder().append("qd.N(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 44 + param10 + 44 + param11 + 44 + param12 + 41);
        }
        return stackIn_1_0;
    }

    final void b(byte param0) {
        ((qd) this).field_n = ll.field_k.b((byte) -1);
        int var2 = -91 % ((param0 - -12) / 44);
    }

    final void a(int param0, boolean param1, int param2, byte param3, int param4) {
        ti[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        br var9_ref_br = null;
        int var9 = 0;
        ti var10 = null;
        int var11 = 0;
        int var12 = 0;
        wb var13 = null;
        int var14 = 0;
        ti var15 = null;
        int[] var16 = null;
        ti var17 = null;
        ti[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        g.field_a.setSeed((long)(param4 + ((param2 << 5) + param0)));
        if (param3 == -40) {
          var18 = new ti[((qd) this).field_H.a(0)];
          var6 = var18;
          var21 = new int[((qd) this).field_H.a(0)];
          var20 = var21;
          var19 = var20;
          var16 = var19;
          var7 = var16;
          d.a(var7, 0, var21.length, 32767);
          var8 = 0;
          var9_ref_br = ((qd) this).field_H.c(94);
          L0: while (true) {
            if (!(var9_ref_br instanceof id)) {
              vh.a(-7255, var21, (Object[]) (Object) var18);
              var9 = 0;
              L1: while (true) {
                if (var8 <= var9) {
                  return;
                } else {
                  L2: {
                    var10 = var18[var9];
                    if (!(var10 instanceof wb)) {
                      break L2;
                    } else {
                      if (!op.field_m.b(param3 ^ -40, ((wb) (Object) var10).field_Lb)) {
                        break L2;
                      } else {
                        var9++;
                        continue L1;
                      }
                    }
                  }
                  var18[var9].e(param4, 2);
                  var9++;
                  continue L1;
                }
              }
            } else {
              L3: {
                if (var9_ref_br instanceof ti) {
                  var15 = (ti) (Object) var9_ref_br;
                  var17 = var15;
                  var11 = var17.g(108) + -param0;
                  var12 = -param2 + var17.h(-102);
                  if (14400 < var12 * var12 + var11 * var11) {
                    break L3;
                  } else {
                    L4: {
                      if (!param1) {
                        break L4;
                      } else {
                        if (var17 instanceof wb) {
                          var13 = (wb) (Object) var17;
                          if (var13.field_Lb == param4) {
                            break L3;
                          } else {
                            var6[var8] = (ti) (Object) var13;
                            var7[var8] = var13.field_y;
                            var8++;
                            break L3;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var17 instanceof gm) {
                      var15 = var17;
                      var6[var8] = var15;
                      var7[var8] = var15.field_y;
                      var8++;
                      break L3;
                    } else {
                      var9_ref_br = ((qd) this).field_H.b(6);
                      continue L0;
                    }
                  }
                } else {
                  break L3;
                }
              }
              var9_ref_br = ((qd) this).field_H.b(6);
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final static void c() {
        ki.field_e = new no(wa.field_a, kc.field_c, jf.field_a, vo.field_m, (cj) (Object) jk.field_h, cm.field_b);
    }

    final void a(boolean param0, int param1, boolean param2) {
        gj.a(param1 + -17333);
        if (!(!((qd) this).field_lb)) {
            return;
        }
        ((qd) this).field_lb = true;
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
            if (iq.field_f) {
              break L0;
            } else {
              if (((qd) this).field_I.b(param0, 0, param2)) {
                en.a(-1, 1);
                return;
              } else {
                break L0;
              }
            }
          }
          L1: {
            L2: {
              if (!((qd) this).field_I.a(20)) {
                break L2;
              } else {
                if (((qd) this).field_mb == null) {
                  break L2;
                } else {
                  if (!((qd) this).field_mb.i((byte) -15)) {
                    ((qd) this).field_I.a(((qd) this).field_k.a(true, param0), (id) (Object) ((qd) this).field_mb, ((qd) this).field_k.a(param2, 2), 122);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
            L3: {
              if (!((qd) this).field_I.a(20)) {
                break L3;
              } else {
                if (((qd) this).field_b == null) {
                  break L3;
                } else {
                  ((qd) this).field_I.a(((qd) this).field_k.a(true, param0), (id) (Object) ((qd) this).field_b, ((qd) this).field_k.a(param2, 2), 123);
                  break L1;
                }
              }
            }
            L4: {
              if (!((qd) this).field_I.a(true)) {
                break L4;
              } else {
                if (((qd) this).field_mb == null) {
                  break L4;
                } else {
                  if (((qd) this).field_mb.i((byte) -58)) {
                    L5: {
                      if (((qd) this).field_I.a((byte) -126)) {
                        break L5;
                      } else {
                        this.b(-70);
                        break L5;
                      }
                    }
                    L6: {
                      ((qd) this).field_Q.a(29664, (qa) (Object) ((qd) this).field_mb);
                      if (!((qd) this).field_I.a((byte) -115)) {
                        ((qd) this).field_mb.r(0);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    ((qd) this).field_I.a(((qd) this).field_k.a(true, param0), (id) (Object) ((qd) this).field_mb, ((qd) this).field_k.a(param2, 2), 122);
                    return;
                  } else {
                    break L4;
                  }
                }
              }
            }
            L7: {
              if (!((qd) this).field_I.g(13)) {
                break L7;
              } else {
                if (((qd) this).field_x != null) {
                  this.b(-56);
                  ((qd) this).field_I.a(((qd) this).field_k.a(true, param0), (id) (Object) ((qd) this).field_x, ((qd) this).field_k.a(param2, 2), 117);
                  return;
                } else {
                  break L7;
                }
              }
            }
            if (!((qd) this).field_I.f(0)) {
              L8: {
                if (((qd) this).field_mb == null) {
                  break L8;
                } else {
                  if (!((qd) this).field_mb.i((byte) -86)) {
                    break L8;
                  } else {
                    L9: {
                      if (lc.field_m[81]) {
                        break L9;
                      } else {
                        this.b(-51);
                        break L9;
                      }
                    }
                    ((qd) this).field_mb.r(0);
                    ((qd) this).field_Q.a(29664, (qa) (Object) ((qd) this).field_mb);
                    iq.a(-3, (byte) 99);
                    break L1;
                  }
                }
              }
              L10: {
                if (((qd) this).field_n != 0) {
                  break L10;
                } else {
                  if (((qd) this).field_Q.a((byte) 98) > 0) {
                    if (((qd) this).field_I.a((byte) -127)) {
                      break L1;
                    } else {
                      if (param0 <= 40) {
                        break L1;
                      } else {
                        if (440 <= param0) {
                          break L1;
                        } else {
                          this.b((byte) 57, ((qd) this).field_k.a(true, param0), ((qd) this).field_k.a(param2, 2));
                          break L1;
                        }
                      }
                    }
                  } else {
                    break L10;
                  }
                }
              }
              if (((qd) this).field_n == 1) {
                this.b(-128);
                break L1;
              } else {
                break L1;
              }
            } else {
              if (bk.field_g) {
                ((qd) this).field_I.a(((qd) this).field_k.a(true, param0), (id) (Object) ((qd) this).field_x, ((qd) this).field_k.a(param2, 2), 127);
                return;
              } else {
                return;
              }
            }
          }
          L11: {
            if (param1 <= -97) {
              break L11;
            } else {
              ((qd) this).field_I = null;
              break L11;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        L0: {
          op.field_m.field_A.a((br) (Object) new cg(param3, param1, param2), false);
          if (param0 >= 79) {
            break L0;
          } else {
            boolean discarded$2 = this.c((byte) -123);
            break L0;
          }
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
            ((qd) this).b((byte) -48);
            break L0;
          }
        }
        L1: {
          var4_int = op.field_m.field_l;
          if (var4_int == 0) {
            break L1;
          } else {
            if (2 == var4_int) {
              if (df.field_I) {
                wb.l((byte) -68);
                bm.a(false, 15, 125, sp.field_g);
                return;
              } else {
                var4 = (id) (Object) ((qd) this).field_c.c((byte) 91);
                L2: while (true) {
                  if (var4 == null) {
                    op.field_m.field_C = param2;
                    break L1;
                  } else {
                    ((h) (Object) var4).c(2, 49951);
                    var4 = (id) (Object) ((qd) this).field_c.b((byte) 117);
                    continue L2;
                  }
                }
              }
            } else {
              if (var4_int == 1) {
                break L1;
              } else {
                if (3 != var4_int) {
                  break L1;
                } else {
                  we.field_g[7] = pi.field_b;
                  var4_ref = op.field_m.field_K.c(86);
                  L3: while (true) {
                    if (var4_ref == null) {
                      break L1;
                    } else {
                      L4: {
                        if (!(var4_ref instanceof wb)) {
                          break L4;
                        } else {
                          var5 = (wb) (Object) var4_ref;
                          if (var5.field_K == 21) {
                            break L4;
                          } else {
                            var5.b(4, -27655);
                            break L4;
                          }
                        }
                      }
                      var4_ref = op.field_m.field_K.b(6);
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void b(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        br var6 = null;
        qa var6_ref = null;
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
        int stackIn_55_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_71_2 = 0;
        int stackIn_71_3 = 0;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        int stackIn_72_3 = 0;
        int stackIn_73_0 = 0;
        int stackIn_73_1 = 0;
        int stackIn_73_2 = 0;
        int stackIn_73_3 = 0;
        int stackIn_73_4 = 0;
        int stackIn_79_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_212_0 = 0;
        int stackIn_213_0 = 0;
        int stackIn_213_1 = 0;
        int stackIn_214_0 = 0;
        int stackIn_214_1 = 0;
        int stackIn_215_0 = 0;
        int stackIn_215_1 = 0;
        int stackIn_215_2 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_70_2 = 0;
        int stackOut_70_3 = 0;
        int stackOut_72_0 = 0;
        int stackOut_72_1 = 0;
        int stackOut_72_2 = 0;
        int stackOut_72_3 = 0;
        int stackOut_72_4 = 0;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        int stackOut_71_3 = 0;
        int stackOut_71_4 = 0;
        int stackOut_78_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_211_0 = 0;
        int stackOut_210_0 = 0;
        int stackOut_212_0 = 0;
        int stackOut_212_1 = 0;
        int stackOut_214_0 = 0;
        int stackOut_214_1 = 0;
        int stackOut_214_2 = 0;
        int stackOut_213_0 = 0;
        int stackOut_213_1 = 0;
        int stackOut_213_2 = 0;
        L0: {
          var22 = null;
          var23 = null;
          var24 = null;
          var26 = null;
          var20 = ZombieDawnMulti.field_E ? 1 : 0;
          g.c(ki.field_k);
          if (he.field_a) {
            oo.c();
            break L0;
          } else {
            oo.h(0, 40, (int)(640.0f * ((qd) this).field_k.field_d), (int)(480.0f * ((qd) this).field_k.field_d) + -40);
            break L0;
          }
        }
        L1: {
          var3 = 0;
          var4 = 0;
          int discarded$11 = 71;
          var5 = oa.a();
          if (var5 > 0) {
            L2: {
              if (null != lp.field_k) {
                break L2;
              } else {
                lp.field_k = wc.b(-1, 89);
                break L2;
              }
            }
            lp.field_k.h(20 * var5 * db.field_c / 256);
            var3 = -(var5 / 2) + (((qd) this).field_k.field_k + hp.a((byte) -123, qf.field_a, var5));
            var4 = -(var5 / 2) + (((qd) this).field_k.field_g + hp.a((byte) 36, qf.field_a, var5));
            ((qd) this).field_k.field_g = var4;
            ((qd) this).field_k.field_k = var3;
            break L1;
          } else {
            var3 = ((qd) this).field_k.field_k;
            var4 = ((qd) this).field_k.field_g;
            if (null == lp.field_k) {
              break L1;
            } else {
              aa.a(true, lp.field_k);
              lp.field_k = null;
              break L1;
            }
          }
        }
        ((qd) this).field_u.a((byte) 111, ((qd) this).field_k);
        var6 = op.field_m.field_A.c(98);
        L3: while (true) {
          if (var6 == null) {
            var6 = ((qd) this).field_cb.c(122);
            L4: while (true) {
              if (var6 == null) {
                var6_ref = ((qd) this).field_c.c((byte) 104);
                L5: while (true) {
                  if (var6_ref == null) {
                    var6 = op.field_m.field_G.c(113);
                    L6: while (true) {
                      if (var6 == null) {
                        ((qd) this).field_u.a(param1, false, ((qd) this).field_k, -1);
                        var6 = op.field_m.field_s.c(param1 ^ 116);
                        L7: while (true) {
                          if (var6 == null) {
                            var6 = ((qd) this).field_H.c(48);
                            L8: while (true) {
                              if (var6 == null) {
                                var6 = ((qd) this).field_kb.c(103);
                                L9: while (true) {
                                  if (var6 == null) {
                                    var6 = ((qd) this).field_O.c(88);
                                    L10: while (true) {
                                      if (var6 == null) {
                                        ((qd) this).field_u.a(2, false, ((qd) this).field_k, -1);
                                        ((qd) this).field_u.a(3, false, ((qd) this).field_k, -1);
                                        var6 = ((qd) this).field_C.c(param1 + 107);
                                        L11: while (true) {
                                          if (var6 == null) {
                                            L12: {
                                              if (gf.field_h) {
                                                break L12;
                                              } else {
                                                L13: {
                                                  var7 = ((qd) this).field_I.b(false);
                                                  if (var7 <= 0) {
                                                    break L13;
                                                  } else {
                                                    if (6 == wf.field_t) {
                                                      break L13;
                                                    } else {
                                                      L14: {
                                                        if (((qd) this).field_I.e(-1) != 9) {
                                                          stackOut_54_0 = 0;
                                                          stackIn_55_0 = stackOut_54_0;
                                                          break L14;
                                                        } else {
                                                          stackOut_53_0 = 1;
                                                          stackIn_55_0 = stackOut_53_0;
                                                          break L14;
                                                        }
                                                      }
                                                      L15: {
                                                        var8_int = stackIn_55_0;
                                                        var9_int = ((qd) this).field_k.a(-(int)((float)(24 * var7) / ((qd) this).field_k.field_d) + bd.field_g, 2);
                                                        var10 = ((qd) this).field_k.a(true, bo.field_d - (int)((float)(var7 * 24) / ((qd) this).field_k.field_d));
                                                        var11 = var9_int / 24;
                                                        var12 = var10 / 24;
                                                        var13 = var12 - -(2 * var7);
                                                        var14 = var11 - -(2 * var7);
                                                        if (var13 > ((qd) this).field_u.field_i.field_e) {
                                                          var13 = ((qd) this).field_u.field_i.field_e;
                                                          break L15;
                                                        } else {
                                                          break L15;
                                                        }
                                                      }
                                                      L16: {
                                                        if (var12 >= 0) {
                                                          break L16;
                                                        } else {
                                                          var12 = 0;
                                                          break L16;
                                                        }
                                                      }
                                                      L17: {
                                                        if (0 > var11) {
                                                          var11 = 0;
                                                          break L17;
                                                        } else {
                                                          break L17;
                                                        }
                                                      }
                                                      L18: {
                                                        if (~((qd) this).field_u.field_i.field_d <= ~var14) {
                                                          break L18;
                                                        } else {
                                                          var14 = ((qd) this).field_u.field_i.field_d;
                                                          break L18;
                                                        }
                                                      }
                                                      var15 = var12;
                                                      L19: while (true) {
                                                        if (~var15 <= ~var13) {
                                                          break L13;
                                                        } else {
                                                          var16 = var11;
                                                          L20: while (true) {
                                                            if (~var14 >= ~var16) {
                                                              var15++;
                                                              continue L19;
                                                            } else {
                                                              L21: {
                                                                var17 = ((qd) this).field_u.a(var16, var15, (byte) -116);
                                                                if (0 != (-2147483648 & var17)) {
                                                                  break L21;
                                                                } else {
                                                                  L22: {
                                                                    var18 = ((qd) this).field_k.c(24 * var16, -20126);
                                                                    var19 = ((qd) this).field_k.d(24 * var15, param1 + 107);
                                                                    stackOut_70_0 = var18;
                                                                    stackOut_70_1 = var19;
                                                                    stackOut_70_2 = 24;
                                                                    stackOut_70_3 = 24;
                                                                    stackIn_72_0 = stackOut_70_0;
                                                                    stackIn_72_1 = stackOut_70_1;
                                                                    stackIn_72_2 = stackOut_70_2;
                                                                    stackIn_72_3 = stackOut_70_3;
                                                                    stackIn_71_0 = stackOut_70_0;
                                                                    stackIn_71_1 = stackOut_70_1;
                                                                    stackIn_71_2 = stackOut_70_2;
                                                                    stackIn_71_3 = stackOut_70_3;
                                                                    if (var8_int != 0) {
                                                                      stackOut_72_0 = stackIn_72_0;
                                                                      stackOut_72_1 = stackIn_72_1;
                                                                      stackOut_72_2 = stackIn_72_2;
                                                                      stackOut_72_3 = stackIn_72_3;
                                                                      stackOut_72_4 = 12272691;
                                                                      stackIn_73_0 = stackOut_72_0;
                                                                      stackIn_73_1 = stackOut_72_1;
                                                                      stackIn_73_2 = stackOut_72_2;
                                                                      stackIn_73_3 = stackOut_72_3;
                                                                      stackIn_73_4 = stackOut_72_4;
                                                                      break L22;
                                                                    } else {
                                                                      stackOut_71_0 = stackIn_71_0;
                                                                      stackOut_71_1 = stackIn_71_1;
                                                                      stackOut_71_2 = stackIn_71_2;
                                                                      stackOut_71_3 = stackIn_71_3;
                                                                      stackOut_71_4 = 3390259;
                                                                      stackIn_73_0 = stackOut_71_0;
                                                                      stackIn_73_1 = stackOut_71_1;
                                                                      stackIn_73_2 = stackOut_71_2;
                                                                      stackIn_73_3 = stackOut_71_3;
                                                                      stackIn_73_4 = stackOut_71_4;
                                                                      break L22;
                                                                    }
                                                                  }
                                                                  oo.f(stackIn_73_0, stackIn_73_1, stackIn_73_2, stackIn_73_3, stackIn_73_4, 128);
                                                                  break L21;
                                                                }
                                                              }
                                                              var16++;
                                                              continue L20;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                L23: {
                                                  if (15 != ((qd) this).field_I.e(-1)) {
                                                    stackOut_78_0 = 0;
                                                    stackIn_79_0 = stackOut_78_0;
                                                    break L23;
                                                  } else {
                                                    stackOut_77_0 = 1;
                                                    stackIn_79_0 = stackOut_77_0;
                                                    break L23;
                                                  }
                                                }
                                                var8_int = stackIn_79_0;
                                                if (var8_int == 0) {
                                                  break L12;
                                                } else {
                                                  L24: {
                                                    var9_int = ((qd) this).field_k.a(bd.field_g + -(int)((float)(var7 * 24) / ((qd) this).field_k.field_d), 2);
                                                    var10 = ((qd) this).field_k.a(true, bo.field_d - (int)((float)(24 * var7) / ((qd) this).field_k.field_d));
                                                    var11 = var9_int / 24;
                                                    var12 = var10 / 24;
                                                    var13 = var7 * 2 + var12;
                                                    if (~var13 < ~((qd) this).field_u.field_i.field_e) {
                                                      var13 = ((qd) this).field_u.field_i.field_e;
                                                      break L24;
                                                    } else {
                                                      break L24;
                                                    }
                                                  }
                                                  L25: {
                                                    var14 = 2 * var7 + var11;
                                                    if (0 <= var12) {
                                                      break L25;
                                                    } else {
                                                      var12 = 0;
                                                      break L25;
                                                    }
                                                  }
                                                  L26: {
                                                    if (var11 >= 0) {
                                                      break L26;
                                                    } else {
                                                      var11 = 0;
                                                      break L26;
                                                    }
                                                  }
                                                  L27: {
                                                    if (~((qd) this).field_u.field_i.field_d > ~var14) {
                                                      var14 = ((qd) this).field_u.field_i.field_d;
                                                      break L27;
                                                    } else {
                                                      break L27;
                                                    }
                                                  }
                                                  var15 = var14 + var11 >> 1;
                                                  var16 = var12 - -var13 >> 1;
                                                  var17 = ((qd) this).field_k.c(24 * var15, -20126);
                                                  var18 = ((qd) this).field_k.d(var16 * 24, 126);
                                                  oo.d(var17, var18, 120, 0, 128);
                                                  break L12;
                                                }
                                              }
                                            }
                                            L28: {
                                              if (~(1280 / ke.field_b) == ~so.field_l.field_x) {
                                                break L28;
                                              } else {
                                                L29: {
                                                  if (kj.field_q >= 2) {
                                                    System.out.println("realloc influence buffer, detail " + ke.field_b);
                                                    break L29;
                                                  } else {
                                                    break L29;
                                                  }
                                                }
                                                so.field_l = new ja(1280 / ke.field_b, 960 / ke.field_b);
                                                break L28;
                                              }
                                            }
                                            L30: {
                                              if (!gf.field_h) {
                                                L31: {
                                                  var7 = 4210753;
                                                  if (ll.field_k.field_k == 1) {
                                                    stackOut_108_0 = 0;
                                                    stackIn_109_0 = stackOut_108_0;
                                                    break L31;
                                                  } else {
                                                    stackOut_107_0 = 1;
                                                    stackIn_109_0 = stackOut_107_0;
                                                    break L31;
                                                  }
                                                }
                                                L32: {
                                                  var8_int = stackIn_109_0;
                                                  if (var8_int != 0) {
                                                    var21 = so.field_l.field_B;
                                                    var9 = var21;
                                                    var10 = 0;
                                                    var11 = so.field_l.field_x * so.field_l.field_w - 7;
                                                    L33: while (true) {
                                                      if (var10 >= var11) {
                                                        var11 += 7;
                                                        L34: while (true) {
                                                          if (var10 >= var11) {
                                                            break L32;
                                                          } else {
                                                            int incrementValue$12 = var10;
                                                            var10++;
                                                            var9[incrementValue$12] = var7;
                                                            continue L34;
                                                          }
                                                        }
                                                      } else {
                                                        int incrementValue$13 = var10;
                                                        var10++;
                                                        var21[incrementValue$13] = var7;
                                                        int incrementValue$14 = var10;
                                                        var10++;
                                                        var21[incrementValue$14] = var7;
                                                        int incrementValue$15 = var10;
                                                        var10++;
                                                        var21[incrementValue$15] = var7;
                                                        int incrementValue$16 = var10;
                                                        var10++;
                                                        var21[incrementValue$16] = var7;
                                                        int incrementValue$17 = var10;
                                                        var10++;
                                                        var21[incrementValue$17] = var7;
                                                        int incrementValue$18 = var10;
                                                        var10++;
                                                        var21[incrementValue$18] = var7;
                                                        int incrementValue$19 = var10;
                                                        var10++;
                                                        var21[incrementValue$19] = var7;
                                                        int incrementValue$20 = var10;
                                                        var10++;
                                                        var21[incrementValue$20] = var7;
                                                        continue L33;
                                                      }
                                                    }
                                                  } else {
                                                    break L32;
                                                  }
                                                }
                                                var9_int = 0;
                                                L35: while (true) {
                                                  if (~op.field_m.field_m.length >= ~var9_int) {
                                                    var9_int = 350;
                                                    var9_int = var9_int / ke.field_b;
                                                    var6 = ((qd) this).field_H.c(param1 + 113);
                                                    L36: while (true) {
                                                      if (var6 == null) {
                                                        L37: {
                                                          if (var8_int == 0) {
                                                            break L37;
                                                          } else {
                                                            g.c(so.field_l);
                                                            var25 = ((qd) this).field_o;
                                                            var11 = ((qd) this).field_k.c(var25.g(param1 + -97), param1 + -20127);
                                                            var12 = ((qd) this).field_k.d(var25.h(-51), 108);
                                                            oo.d(var11 / ke.field_b, var12 / ke.field_b, var9_int, 0);
                                                            var6_ref = ((qd) this).field_c.c((byte) 127);
                                                            L38: while (true) {
                                                              if (var6_ref == null) {
                                                                g.d();
                                                                so.field_l.a(0, 0, 1280, 960, 104);
                                                                break L37;
                                                              } else {
                                                                L39: {
                                                                  var26_ref = (h) (Object) var6_ref;
                                                                  if (~var26_ref.field_I == ~((qd) this).field_M) {
                                                                    break L39;
                                                                  } else {
                                                                    var11 = ((qd) this).field_k.c(var26_ref.g(param1 ^ -82), -20126);
                                                                    var12 = ((qd) this).field_k.d(var26_ref.h(103), 121);
                                                                    oo.d(var11 / ke.field_b, var12 / ke.field_b, var9_int, var7);
                                                                    break L39;
                                                                  }
                                                                }
                                                                var6_ref = ((qd) this).field_c.b((byte) 96);
                                                                continue L38;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        ((qd) this).field_J.a(((qd) this).field_k, (byte) 36);
                                                        break L30;
                                                      } else {
                                                        L40: {
                                                          if (!(var6 instanceof wb)) {
                                                            break L40;
                                                          } else {
                                                            L41: {
                                                              L42: {
                                                                var24_ref = (wb) (Object) var6;
                                                                var11 = ((qd) this).field_k.c(var24_ref.g(-79), -20126);
                                                                var12 = ((qd) this).field_k.d(var24_ref.h(-71), 114);
                                                                op.field_m.field_m[var24_ref.field_Lb] = op.field_m.field_m[var24_ref.field_Lb] + 1;
                                                                if (var24_ref.field_K == 4) {
                                                                  break L42;
                                                                } else {
                                                                  if (var24_ref.field_K == 5) {
                                                                    break L42;
                                                                  } else {
                                                                    if (22 == var24_ref.field_K) {
                                                                      break L42;
                                                                    } else {
                                                                      if (~var24_ref.field_Ib >= ~op.field_m.field_H) {
                                                                        break L41;
                                                                      } else {
                                                                        break L42;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              var24_ref.a(true, ((qd) this).field_k);
                                                              if ((var24_ref.field_Ib + var24_ref.field_y) % 7 != 0) {
                                                                break L41;
                                                              } else {
                                                                if (var24_ref.field_K != 5) {
                                                                  break L41;
                                                                } else {
                                                                  if (~var24_ref.field_Ib >= ~op.field_m.field_H) {
                                                                    break L41;
                                                                  } else {
                                                                    L43: {
                                                                      L44: {
                                                                        var13 = (3 + var24_ref.field_y) * var24_ref.field_Ib % he.field_b.length;
                                                                        if (0 != var13) {
                                                                          break L44;
                                                                        } else {
                                                                          if (!q.field_b) {
                                                                            var13 = 1;
                                                                            break L43;
                                                                          } else {
                                                                            break L44;
                                                                          }
                                                                        }
                                                                      }
                                                                      if (var13 != 1) {
                                                                        break L43;
                                                                      } else {
                                                                        if (!q.field_b) {
                                                                          break L43;
                                                                        } else {
                                                                          var13 = 0;
                                                                          break L43;
                                                                        }
                                                                      }
                                                                    }
                                                                    pb.field_e.a(he.field_b[var13], var11, -48 + var12, 14540253, 0, 253);
                                                                    break L41;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            if (var8_int != 0) {
                                                              if (var24_ref.field_K == 9) {
                                                                break L40;
                                                              } else {
                                                                if (var24_ref.field_K == 21) {
                                                                  break L40;
                                                                } else {
                                                                  if (var24_ref.i((byte) 0)) {
                                                                    g.c(so.field_l);
                                                                    oo.d(var11 / ke.field_b, var12 / ke.field_b, var9_int, 0);
                                                                    g.d();
                                                                    break L40;
                                                                  } else {
                                                                    break L40;
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              var6 = ((qd) this).field_H.b(6);
                                                              continue L36;
                                                            }
                                                          }
                                                        }
                                                        var6 = ((qd) this).field_H.b(6);
                                                        continue L36;
                                                      }
                                                    }
                                                  } else {
                                                    op.field_m.field_m[var9_int] = 0;
                                                    var9_int++;
                                                    continue L35;
                                                  }
                                                }
                                              } else {
                                                var7 = 0;
                                                L45: while (true) {
                                                  if (~op.field_m.field_m.length >= ~var7) {
                                                    var6 = ((qd) this).field_H.c(123);
                                                    L46: while (true) {
                                                      if (var6 == null) {
                                                        break L30;
                                                      } else {
                                                        L47: {
                                                          if (!(var6 instanceof wb)) {
                                                            break L47;
                                                          } else {
                                                            var23_ref = (wb) (Object) var6;
                                                            op.field_m.field_m[var23_ref.field_Lb] = op.field_m.field_m[var23_ref.field_Lb] + 1;
                                                            break L47;
                                                          }
                                                        }
                                                        var6 = ((qd) this).field_H.b(6);
                                                        continue L46;
                                                      }
                                                    }
                                                  } else {
                                                    op.field_m.field_m[var7] = 0;
                                                    var7++;
                                                    continue L45;
                                                  }
                                                }
                                              }
                                            }
                                            var6 = ((qd) this).field_T.c(104);
                                            L48: while (true) {
                                              if (var6 == null) {
                                                L49: {
                                                  g.d();
                                                  g.c();
                                                  this.a(true);
                                                  g.b();
                                                  var7 = ub.p(-91);
                                                  if (var7 <= 0) {
                                                    break L49;
                                                  } else {
                                                    L50: {
                                                      if (((qd) this).field_S == null) {
                                                        g.c(((qd) this).field_B);
                                                        ((qd) this).field_S = new ea();
                                                        g.d();
                                                        ((qd) this).field_i = nk.a(16777215, param1 + 455739623, 8401072);
                                                        break L50;
                                                      } else {
                                                        break L50;
                                                      }
                                                    }
                                                    L51: {
                                                      if (0 == (wf.field_m & 1)) {
                                                        g.c(((qd) this).field_B);
                                                        ((qd) this).field_i = nk.a(2154560, 455739624, 16724223);
                                                        oo.b();
                                                        oo.e(0, 0, oo.field_b, oo.field_l, 1);
                                                        ((qd) this).field_S.a(1, (double)wf.field_m / 6.25, ((qd) this).field_i);
                                                        g.d();
                                                        break L51;
                                                      } else {
                                                        break L51;
                                                      }
                                                    }
                                                    L52: {
                                                      var8_int = 132;
                                                      if (~var8_int >= ~(var7 * 3)) {
                                                        break L52;
                                                      } else {
                                                        var8_int = var7 * 3;
                                                        break L52;
                                                      }
                                                    }
                                                    ((qd) this).field_B.a(5, 40, 630, 400, 32 - -var8_int);
                                                    break L49;
                                                  }
                                                }
                                                L53: {
                                                  if (!((qd) this).field_eb) {
                                                    break L53;
                                                  } else {
                                                    if (((qd) this).field_w) {
                                                      break L53;
                                                    } else {
                                                      pp.field_q[8].a(bd.field_g - 12, -12 + bo.field_d);
                                                      break L53;
                                                    }
                                                  }
                                                }
                                                L54: {
                                                  if (!((qd) this).field_eb) {
                                                    break L54;
                                                  } else {
                                                    if (!((qd) this).field_w) {
                                                      break L54;
                                                    } else {
                                                      L55: {
                                                        var10 = bd.field_g - ((qd) this).field_F;
                                                        var11 = -((qd) this).field_p + bo.field_d;
                                                        if (var10 >= 0) {
                                                          var8_int = ((qd) this).field_F;
                                                          break L55;
                                                        } else {
                                                          var10 = -var10;
                                                          var8_int = bd.field_g;
                                                          break L55;
                                                        }
                                                      }
                                                      L56: {
                                                        if (var11 >= 0) {
                                                          var9_int = ((qd) this).field_p;
                                                          break L56;
                                                        } else {
                                                          var11 = -var11;
                                                          var9_int = bo.field_d;
                                                          break L56;
                                                        }
                                                      }
                                                      oo.a(var8_int, var9_int, var10, var11, 16777215);
                                                      oo.h(var8_int + 1, 1 + var9_int, -2 + var10, var11 - 2, 10066431, 32);
                                                      oo.f(2 + var8_int, var9_int - -2, -4 + var10, -4 + var11, 3355647, 32);
                                                      break L54;
                                                    }
                                                  }
                                                }
                                                L57: {
                                                  var8 = ah.field_e;
                                                  if (0 == op.field_m.field_l) {
                                                    if (((qd) this).field_l > 0) {
                                                      L58: {
                                                        var9_int = -(((qd) this).field_l / 2) + 320;
                                                        var10 = 320 + ((qd) this).field_l / 2;
                                                        oo.h(var9_int, 0, var10, 480);
                                                        var11 = 140;
                                                        oo.b(var11, 80, 640 - 2 * var11, 260, 1, 3355443, 120);
                                                        if (~(-5 + var11) < ~var9_int) {
                                                          stackOut_211_0 = -5 + var11;
                                                          stackIn_212_0 = stackOut_211_0;
                                                          break L58;
                                                        } else {
                                                          stackOut_210_0 = var9_int;
                                                          stackIn_212_0 = stackOut_210_0;
                                                          break L58;
                                                        }
                                                      }
                                                      L59: {
                                                        stackOut_212_0 = stackIn_212_0;
                                                        stackOut_212_1 = 75;
                                                        stackIn_214_0 = stackOut_212_0;
                                                        stackIn_214_1 = stackOut_212_1;
                                                        stackIn_213_0 = stackOut_212_0;
                                                        stackIn_213_1 = stackOut_212_1;
                                                        if (var10 > 640 - var11) {
                                                          stackOut_214_0 = stackIn_214_0;
                                                          stackOut_214_1 = stackIn_214_1;
                                                          stackOut_214_2 = -var11 + 640;
                                                          stackIn_215_0 = stackOut_214_0;
                                                          stackIn_215_1 = stackOut_214_1;
                                                          stackIn_215_2 = stackOut_214_2;
                                                          break L59;
                                                        } else {
                                                          stackOut_213_0 = stackIn_213_0;
                                                          stackOut_213_1 = stackIn_213_1;
                                                          stackOut_213_2 = var10;
                                                          stackIn_215_0 = stackOut_213_0;
                                                          stackIn_215_1 = stackOut_213_1;
                                                          stackIn_215_2 = stackOut_213_2;
                                                          break L59;
                                                        }
                                                      }
                                                      L60: {
                                                        oo.h(stackIn_215_0, stackIn_215_1, stackIn_215_2, 345);
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
                                                        if (op.field_m.field_t <= 1) {
                                                          break L60;
                                                        } else {
                                                          var12++;
                                                          var14 = 270;
                                                          var13 = 640 + -var13;
                                                          this.a(var13, (byte) -99, var14, var12);
                                                          if (2 >= op.field_m.field_t) {
                                                            break L60;
                                                          } else {
                                                            var13 = 640 + -var13;
                                                            var14 = 230;
                                                            var12++;
                                                            this.a(var13, (byte) -99, var14, var12);
                                                            if (3 >= op.field_m.field_t) {
                                                              break L60;
                                                            } else {
                                                              var12++;
                                                              var13 = 640 - var13;
                                                              var14 = 130;
                                                              this.a(var13, (byte) -99, var14, var12);
                                                              break L60;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      ((qd) this).field_y.g(-(((qd) this).field_y.field_x / 2) + 320, 235 + -((qd) this).field_y.field_w);
                                                      g.a(((qd) this).field_L, -(((qd) this).field_y.field_x / 2) + 314, 235 + (-((qd) this).field_y.field_w + -6));
                                                      oo.c();
                                                      break L57;
                                                    } else {
                                                      var27 = pj.field_J;
                                                      ah.field_e.b(var27, 320, 240, 0, -1);
                                                      break L57;
                                                    }
                                                  } else {
                                                    if (3 != op.field_m.field_l) {
                                                      L61: {
                                                        if (gf.field_h) {
                                                          break L61;
                                                        } else {
                                                          if (op.field_m.field_l != 1) {
                                                            break L61;
                                                          } else {
                                                            if (op.field_m.field_H >= 500) {
                                                              break L61;
                                                            } else {
                                                              var8.b(up.field_c, 320, 240, 0, -1);
                                                              ((qd) this).field_k.field_f = false;
                                                              break L57;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      if (op.field_m.field_l != 2) {
                                                        break L57;
                                                      } else {
                                                        L62: {
                                                          var9_int = op.field_m.field_C + -op.field_m.field_H;
                                                          if (var9_int >= 1550) {
                                                            if (var9_int <= 2750) {
                                                              break L62;
                                                            } else {
                                                              if (var9_int >= 2950) {
                                                                break L62;
                                                              } else {
                                                                if (!gf.field_h) {
                                                                  var8.b(ng.field_c, 320, 120, 0, -1);
                                                                  break L62;
                                                                } else {
                                                                  break L62;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            if (!gf.field_h) {
                                                              var8.b(sm.field_f, 320, 120, 0, -1);
                                                              break L62;
                                                            } else {
                                                              var8.b(gn.field_E, 320, 120, 0, -1);
                                                              break L62;
                                                            }
                                                          }
                                                        }
                                                        break L57;
                                                      }
                                                    } else {
                                                      if (((qd) this).field_d < 225) {
                                                        var8.b(tm.field_g, 320, 240, 2, -1);
                                                        break L57;
                                                      } else {
                                                        break L57;
                                                      }
                                                    }
                                                  }
                                                }
                                                L63: {
                                                  if (!param0) {
                                                    break L63;
                                                  } else {
                                                    ((qd) this).field_G.g(-27635);
                                                    if (!gf.field_h) {
                                                      ((qd) this).field_I.c(-118);
                                                      int discarded$21 = 9;
                                                      rq.a();
                                                      break L63;
                                                    } else {
                                                      break L63;
                                                    }
                                                  }
                                                }
                                                L64: {
                                                  L65: {
                                                    jq.field_e.e(0, 0);
                                                    if (sc.field_a) {
                                                      break L65;
                                                    } else {
                                                      if (wj.field_n) {
                                                        break L65;
                                                      } else {
                                                        if (n.field_g) {
                                                          break L65;
                                                        } else {
                                                          break L64;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  oo.f(0, 0, 640, 17, 0, 100);
                                                  break L64;
                                                }
                                                L66: {
                                                  if (!sc.field_a) {
                                                    break L66;
                                                  } else {
                                                    qp.field_w.c("cam=(" + ((qd) this).field_k.field_k + ", " + ((qd) this).field_k.field_g + ") bk=" + kd.field_b + " k=" + pq.field_f + " mouse=(" + bd.field_g + "," + bo.field_d + ")", 5, 13, 16777215, 0);
                                                    break L66;
                                                  }
                                                }
                                                L67: {
                                                  if (vk.field_E) {
                                                    var8.c(Integer.toString(ji.field_b), 10, 40, 2, -1);
                                                    var8.c(Integer.toString(ei.field_b), 10, 40, 2, -1);
                                                    var8.c(Integer.toString(op.field_m.field_H), 10, 80, 2, -1);
                                                    var9_ref = (ae) (Object) ((qd) this).field_hb.c(106);
                                                    L68: while (true) {
                                                      if (var9_ref == null) {
                                                        break L67;
                                                      } else {
                                                        var9_ref.a(-240 + ((qd) this).field_k.field_g, true, -320 + ((qd) this).field_k.field_k, op.field_m.field_H);
                                                        var9_ref = (ae) (Object) ((qd) this).field_hb.b(6);
                                                        continue L68;
                                                      }
                                                    }
                                                  } else {
                                                    break L67;
                                                  }
                                                }
                                                return;
                                              } else {
                                                ((wc) (Object) var6).a(-10136, ((qd) this).field_k);
                                                var6 = ((qd) this).field_T.b(6);
                                                continue L48;
                                              }
                                            }
                                          } else {
                                            L69: {
                                              var22_ref = (lc) (Object) var6;
                                              if (var22_ref.a(16711680, ((qd) this).field_k)) {
                                                break L69;
                                              } else {
                                                var22_ref.a(true);
                                                ((qd) this).field_X.a((br) (Object) var22_ref, false);
                                                break L69;
                                              }
                                            }
                                            var6 = ((qd) this).field_C.b(6);
                                            continue L11;
                                          }
                                        }
                                      } else {
                                        ((lj) (Object) var6).a((byte) 103, ((qd) this).field_k);
                                        var6 = ((qd) this).field_O.b(6);
                                        continue L10;
                                      }
                                    }
                                  } else {
                                    ((mg) (Object) var6).a(-10136, ((qd) this).field_k);
                                    var6 = ((qd) this).field_kb.b(6);
                                    continue L9;
                                  }
                                }
                              } else {
                                ((id) (Object) var6).a(-10136, ((qd) this).field_k);
                                var6 = ((qd) this).field_H.b(param1 ^ 7);
                                continue L8;
                              }
                            }
                          } else {
                            ((ce) (Object) var6).a((byte) 19, ((qd) this).field_k);
                            var6 = op.field_m.field_s.b(param1 ^ 7);
                            continue L7;
                          }
                        }
                      } else {
                        ((pq) (Object) var6).a(255, ((qd) this).field_k);
                        var6 = op.field_m.field_G.b(param1 ^ 7);
                        continue L6;
                      }
                    }
                  } else {
                    ((h) (Object) var6_ref).a(((qd) this).field_k, 13542477);
                    var6_ref = ((qd) this).field_c.b((byte) 101);
                    continue L5;
                  }
                }
              } else {
                ((rj) (Object) var6).a(-10136, ((qd) this).field_k);
                var6 = ((qd) this).field_cb.b(6);
                continue L4;
              }
            }
          } else {
            ((cg) (Object) var6).a(((qd) this).field_k, param1 + 58);
            var6 = op.field_m.field_A.b(6);
            continue L3;
          }
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        lc var6 = (lc) (Object) ((qd) this).field_X.g(55);
        if (!(var6 != null)) {
            var6 = new lc();
        }
        var6.a(param3, param2, param1, param0, (byte) 114);
        ((qd) this).field_C.a(-25612, (br) (Object) var6);
        g.a(((qd) this).field_C);
        int var7 = 74 % ((11 - param4) / 34);
    }

    private final void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var14 = 0;
        wb var15 = null;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        L0: {
          var14 = ZombieDawnMulti.field_E ? 1 : 0;
          var4 = 0;
          var15 = (wb) (Object) ((qd) this).field_Q.c((byte) 92);
          if (var15 == null) {
            break L0;
          } else {
            L1: {
              if (param0 != var15.field_Kb) {
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
        if (param2) {
          return;
        } else {
          this.b(-60);
          return;
        }
    }

    final void c(int param0, int param1) {
        wb var3 = null;
        id var4 = null;
        ti var5 = null;
        int var6 = 0;
        var4 = op.field_m.a(param0, (byte) 33);
        if (var4 instanceof ti) {
          if (var4 != null) {
            L0: {
              var6 = 83 % ((param1 - -73) / 51);
              var5 = (ti) (Object) var4;
              var5.j(0);
              if (var5 instanceof wb) {
                var3 = (wb) (Object) var5;
                var3.j((byte) -13);
                var3.d(false);
                if (var3.field_K != 29) {
                  break L0;
                } else {
                  var3.b(4, -27655);
                  break L0;
                }
              } else {
                break L0;
              }
            }
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final void d() {
        int var3 = 0;
        L0: {
          var3 = ZombieDawnMulti.field_E ? 1 : 0;
          if (!this.c((byte) 106)) {
            break L0;
          } else {
            L1: {
              if (((qd) this).field_b == null) {
                break L1;
              } else {
                ((qd) this).field_b.field_O = false;
                ((qd) this).field_b = null;
                break L1;
              }
            }
            L2: {
              if (null != ((qd) this).field_mb) {
                ((qd) this).field_mb.field_zb = false;
                ((qd) this).field_mb.field_eb = false;
                ((qd) this).field_mb = null;
                break L2;
              } else {
                if (((qd) this).field_x == null) {
                  break L2;
                } else {
                  ((qd) this).field_x.field_jb = false;
                  ((qd) this).field_x = null;
                  break L2;
                }
              }
            }
            L3: {
              if (!((qd) this).field_I.a((byte) -119)) {
                en.a(-1, 0);
                break L3;
              } else {
                if (!bk.field_g) {
                  en.a(-1, 6);
                  return;
                } else {
                  en.a(-1, 1);
                  break L3;
                }
              }
            }
            L4: {
              if (!((qd) this).field_I.g(13)) {
                break L4;
              } else {
                ((qd) this).field_x = (gm) (Object) this.a(true, 54, bo.field_d, bd.field_g);
                if (((qd) this).field_x == null) {
                  break L4;
                } else {
                  ((qd) this).field_x.field_jb = true;
                  break L4;
                }
              }
            }
            L5: {
              ((qd) this).field_mb = (wb) (Object) this.a(false, 124, bo.field_d, bd.field_g);
              if (null != ((qd) this).field_mb) {
                L6: {
                  L7: {
                    if (!((qd) this).field_I.a(true)) {
                      break L7;
                    } else {
                      if (((qd) this).field_mb.i((byte) 116)) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (!((qd) this).field_I.a(20)) {
                      break L8;
                    } else {
                      if (!((qd) this).field_mb.i((byte) -59)) {
                        break L6;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (((qd) this).field_mb.i((byte) -36)) {
                    ((qd) this).field_mb.field_eb = true;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (!bk.field_g) {
                  ((qd) this).field_mb = null;
                  break L5;
                } else {
                  ((qd) this).field_mb.field_zb = true;
                  break L5;
                }
              } else {
                break L5;
              }
            }
            if (!((qd) this).field_I.a(20)) {
              break L0;
            } else {
              if (null == ((qd) this).field_b) {
                break L0;
              } else {
                ((qd) this).field_b.field_O = true;
                break L0;
              }
            }
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
          ((qd) this).field_z = false;
          if (pl.field_I != 10) {
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
              pb.field_i = id.field_x;
              if (!iq.field_f) {
                if (id.field_D <= 1) {
                  if (id.field_D == 1) {
                    pb.field_i = ma.field_c;
                    break L2;
                  } else {
                    pb.field_i = ll.field_d;
                    break L2;
                  }
                } else {
                  pb.field_i = vl.a(rq.field_q, new String[1], 2);
                  break L2;
                }
              } else {
                if (var3 == 0) {
                  break L2;
                } else {
                  pb.field_i = be.field_m;
                  break L2;
                }
              }
            }
            var4_int = qp.field_w.a(pb.field_i);
            nf.field_d = (int)((float)nf.field_d + (float)(var4_int + -nf.field_d) * 0.05000000074505806f);
            if (~nf.field_d != ~var4_int) {
              L3: {
                stackOut_18_0 = nf.field_d;
                stackIn_20_0 = stackOut_18_0;
                stackIn_19_0 = stackOut_18_0;
                if (var4_int > nf.field_d) {
                  stackOut_20_0 = stackIn_20_0;
                  stackOut_20_1 = 1;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  break L3;
                } else {
                  stackOut_19_0 = stackIn_19_0;
                  stackOut_19_1 = -1;
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  break L3;
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
        L4: {
          L5: {
            if (df.field_I) {
              break L5;
            } else {
              if (!param0) {
                break L5;
              } else {
                L6: {
                  if (!re.field_b) {
                    break L6;
                  } else {
                    if (!sq.field_N) {
                      break L6;
                    } else {
                      if (!gf.field_h) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                L7: {
                  if (!tj.field_f) {
                    stackOut_30_0 = oi.field_h;
                    stackIn_31_0 = stackOut_30_0;
                    break L7;
                  } else {
                    stackOut_29_0 = rl.field_a;
                    stackIn_31_0 = stackOut_29_0;
                    break L7;
                  }
                }
                L8: {
                  var4 = stackIn_31_0;
                  tj.field_f = false;
                  var5 = var4[0].field_w - (-var4[6].field_w + -qp.field_w.field_C);
                  if (~bd.field_g > ~(635 + -nf.field_d)) {
                    break L8;
                  } else {
                    if (640 <= bd.field_g) {
                      break L8;
                    } else {
                      if (-var5 + dq.field_k.field_qb > bo.field_d) {
                        break L8;
                      } else {
                        if (~dq.field_k.field_qb < ~bo.field_d) {
                          ((qd) this).field_z = true;
                          tj.field_f = true;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                }
                L9: {
                  if (kd.field_b != 1) {
                    break L9;
                  } else {
                    if (tj.field_f) {
                      L10: {
                        if (iq.field_f) {
                          stackOut_42_0 = 0;
                          stackIn_43_0 = stackOut_42_0;
                          break L10;
                        } else {
                          stackOut_41_0 = 1;
                          stackIn_43_0 = stackOut_41_0;
                          break L10;
                        }
                      }
                      iq.field_f = stackIn_43_0 != 0;
                      if (!iq.field_f) {
                        break L9;
                      } else {
                        id.field_D = 0;
                        break L9;
                      }
                    } else {
                      break L9;
                    }
                  }
                }
                break L4;
              }
            }
          }
          tj.field_f = false;
          break L4;
        }
        L11: {
          if (!iq.field_f) {
            break L11;
          } else {
            L12: {
              stackOut_48_0 = this;
              stackOut_48_1 = ((qd) this).field_z;
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              if (~dq.field_k.field_qb < ~bo.field_d) {
                stackOut_50_0 = this;
                stackOut_50_1 = stackIn_50_1;
                stackOut_50_2 = 0;
                stackIn_51_0 = stackOut_50_0;
                stackIn_51_1 = stackOut_50_1;
                stackIn_51_2 = stackOut_50_2;
                break L12;
              } else {
                stackOut_49_0 = this;
                stackOut_49_1 = stackIn_49_1;
                stackOut_49_2 = 1;
                stackIn_51_0 = stackOut_49_0;
                stackIn_51_1 = stackOut_49_1;
                stackIn_51_2 = stackOut_49_2;
                break L12;
              }
            }
            ((qd) this).field_z = stackIn_51_1 | stackIn_51_2 != 0;
            if (!sq.field_N) {
              break L11;
            } else {
              if (!re.field_b) {
                break L11;
              } else {
                ((qd) this).field_z = true;
                break L11;
              }
            }
          }
        }
        ((qd) this).field_z = ((qd) this).field_z | tj.field_f;
        if (param1 == 15978) {
          return ((qd) this).field_z;
        } else {
          return true;
        }
    }

    public static void h() {
        field_v = null;
        field_E = null;
        field_s = null;
        field_r = null;
        field_V = null;
        field_K = null;
    }

    private final void a(byte param0) {
        Object var2 = null;
        ae var3_ref_ae = null;
        int var3 = 0;
        br var3_ref_br = null;
        lc var3_ref_lc = null;
        Object var4 = null;
        ae var4_ref = null;
        br var4_ref2 = null;
        ce var4_ref3 = null;
        Exception var5 = null;
        ce var5_ref = null;
        int var6 = 0;
        lj var7 = null;
        cg var8 = null;
        pq var9 = null;
        wc var10 = null;
        Throwable decompiledCaughtException = null;
        var4 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        op.field_m.field_H = op.field_m.field_H + 1;
        var2 = null;
        var3_ref_ae = (ae) (Object) ((qd) this).field_hb.c(50);
        L0: while (true) {
          if (var3_ref_ae == null) {
            var3 = 10 % ((-25 - param0) / 61);
            var4_ref = (ae) (Object) ((qd) this).field_hb.c(114);
            L1: while (true) {
              L2: {
                if (var4_ref == null) {
                  break L2;
                } else {
                  if (op.field_m.field_H >= var4_ref.field_f) {
                    try {
                      L3: {
                        var4_ref.a((byte) -84);
                        var4_ref.a(0, (qd) this);
                        break L3;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L4: {
                        var5 = (Exception) (Object) decompiledCaughtException;
                        int discarded$3 = 0;
                        bd.a(op.field_m.field_H + ": error executing message of tick " + var4_ref.field_f + ": " + var5.getMessage(), (Throwable) (Object) var5);
                        break L4;
                      }
                    }
                    var4_ref = (ae) (Object) ((qd) this).field_hb.c(78);
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              L5: {
                if (op.field_m.field_l != 0) {
                  L6: {
                    boolean discarded$4 = ((qd) this).field_G.a(-21991);
                    if (op.field_m.field_l != 3) {
                      ((qd) this).field_G.a(((qd) this).field_Z, false);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var3_ref_br = ((qd) this).field_H.c(61);
                  L7: while (true) {
                    if (!(var3_ref_br instanceof id)) {
                      var7 = (lj) (Object) ((qd) this).field_O.c(127);
                      L8: while (true) {
                        if (var7 == null) {
                          var8 = (cg) (Object) op.field_m.field_A.c(81);
                          L9: while (true) {
                            if (var8 == null) {
                              var9 = (pq) (Object) op.field_m.field_G.c(42);
                              L10: while (true) {
                                if (var9 == null) {
                                  var10 = (wc) (Object) ((qd) this).field_T.c(61);
                                  L11: while (true) {
                                    if (var10 == null) {
                                      var3_ref_lc = (lc) (Object) ((qd) this).field_C.c(57);
                                      L12: while (true) {
                                        if (var3_ref_lc == null) {
                                          g.a(((qd) this).field_C);
                                          var3 = 0;
                                          var4_ref = null;
                                          var5_ref = (ce) (Object) op.field_m.field_s.c(63);
                                          L13: while (true) {
                                            if (var5_ref == null) {
                                              if (var3 == 0) {
                                                break L5;
                                              } else {
                                                var5_ref = (ce) (Object) op.field_m.field_s.c(85);
                                                L14: while (true) {
                                                  if (var5_ref == null) {
                                                    ((qd) this).field_u.a(48);
                                                    break L5;
                                                  } else {
                                                    var5_ref.a((byte) -60);
                                                    var5_ref = (ce) (Object) op.field_m.field_s.b(6);
                                                    continue L14;
                                                  }
                                                }
                                              }
                                            } else {
                                              L15: {
                                                var4_ref3 = (ce) (Object) op.field_m.field_s.b(6);
                                                if (var5_ref.d(-20232)) {
                                                  var3 = 1;
                                                  break L15;
                                                } else {
                                                  break L15;
                                                }
                                              }
                                              var5_ref = var4_ref3;
                                              continue L13;
                                            }
                                          }
                                        } else {
                                          L16: {
                                            boolean discarded$5 = var3_ref_lc.d((byte) 76);
                                            if (var3_ref_lc.field_q) {
                                              var3_ref_lc.a(true);
                                              ((qd) this).field_X.a((br) (Object) var3_ref_lc, false);
                                              break L16;
                                            } else {
                                              break L16;
                                            }
                                          }
                                          var3_ref_lc = (lc) (Object) ((qd) this).field_C.b(6);
                                          continue L12;
                                        }
                                      }
                                    } else {
                                      var10.f((byte) -122);
                                      var10 = (wc) (Object) ((qd) this).field_T.b(6);
                                      continue L11;
                                    }
                                  }
                                } else {
                                  var9.a(100);
                                  var9 = (pq) (Object) op.field_m.field_G.b(6);
                                  continue L10;
                                }
                              }
                            } else {
                              var8.b(false);
                              var8 = (cg) (Object) op.field_m.field_A.b(6);
                              continue L9;
                            }
                          }
                        } else {
                          var7.a(-20587);
                          var7 = (lj) (Object) ((qd) this).field_O.b(6);
                          continue L8;
                        }
                      }
                    } else {
                      var4_ref2 = var3_ref_br.field_d;
                      ((id) (Object) var3_ref_br).f((byte) -117);
                      var3_ref_br = var4_ref2;
                      continue L7;
                    }
                  }
                } else {
                  break L5;
                }
              }
              return;
            }
          } else {
            L17: {
              if (var2 == null) {
                break L17;
              } else {
                if (((ae) var2).field_f <= var3_ref_ae.field_f) {
                  break L17;
                } else {
                  break L17;
                }
              }
            }
            var2 = (Object) (Object) var3_ref_ae;
            var3_ref_ae = (ae) (Object) ((qd) this).field_hb.b(6);
            continue L0;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = ZombieDawnMulti.field_E ? 1 : 0;
          if (((qd) this).field_cb.a(param0 + -1) <= 200) {
            break L0;
          } else {
            var4 = 0;
            L1: while (true) {
              if (var4 >= 5) {
                break L0;
              } else {
                br discarded$1 = ((qd) this).field_cb.g(80);
                var4++;
                continue L1;
              }
            }
          }
        }
        L2: {
          ((qd) this).field_cb.a((br) (Object) new rj(param1, param2, hp.a((byte) -98, g.field_a, 6)), false);
          ((qd) this).field_cb.a((br) (Object) new rj(param1 + 15, param2, hp.a((byte) 99, g.field_a, 6)), false);
          ((qd) this).field_cb.a((br) (Object) new rj(param1 - 15, param2, hp.a((byte) 126, g.field_a, 6)), false);
          if (param0 == 1) {
            break L2;
          } else {
            ((qd) this).field_o = null;
            break L2;
          }
        }
        L3: {
          ((qd) this).field_cb.a((br) (Object) new rj(param1, param2 - 15, hp.a((byte) 9, g.field_a, 6)), false);
          ((qd) this).field_cb.a((br) (Object) new rj(param1, param2 - -15, hp.a((byte) -86, g.field_a, 6)), false);
          if (((qd) this).field_u.a(param1, true, true, param2 + -24)) {
            break L3;
          } else {
            if (((qd) this).field_u.a(param1 + 24, true, true, -24 + param2)) {
              break L3;
            } else {
              if (((qd) this).field_u.a(param1 + -24, true, true, -24 + param2)) {
                break L3;
              } else {
                if (((qd) this).field_u.a(param1, true, true, param2)) {
                  param2 = param2 - (param2 % 24 + 24);
                  ((qd) this).field_H.a((br) (Object) new rj(param1, param2, hp.a((byte) -100, g.field_a, 6) + 6), false);
                  ((qd) this).field_cb.a((br) (Object) new rj(param1, 24 + param2, hp.a((byte) -93, g.field_a, 6)), false);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
          }
        }
    }

    final void a(int[] param0, boolean param1) {
        try {
            if (param1) {
                ((qd) this).field_A = 96;
            }
            d.a(param0, 0, op.field_m.field_d, 0, param0.length);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "qd.I(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
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
                var10 = (ti) (Object) var9;
                if (23 != param6) {
                  if (-29 != param6) {
                    if (-16 != param6) {
                      if (param6 != 27) {
                        if (param6 != 17) {
                          if (25 != param6) {
                            if (13 != param6) {
                              if (29 != param6) {
                                if (31 != param6) {
                                  if (param6 == 33) {
                                    var10.b(param6, -27655);
                                    break L0;
                                  } else {
                                    L1: {
                                      if (var10.field_K != 5) {
                                        break L1;
                                      } else {
                                        if (param6 != 4) {
                                          break L1;
                                        } else {
                                          return;
                                        }
                                      }
                                    }
                                    L2: {
                                      if (var10.field_K == param6) {
                                        break L2;
                                      } else {
                                        var10.b(param6, -27655);
                                        break L2;
                                      }
                                    }
                                    var10.a(param1, param5, param3, (byte) 109, param4, param7);
                                    break L0;
                                  }
                                } else {
                                  var10.b(param6, -27655);
                                  break L0;
                                }
                              } else {
                                var10.b(param6, -27655);
                                break L0;
                              }
                            } else {
                              var10.b(param6, -27655);
                              break L0;
                            }
                          } else {
                            var10.b(param6, -27655);
                            break L0;
                          }
                        } else {
                          var10.b(param6, -27655);
                          break L0;
                        }
                      } else {
                        var10.b(param6, -27655);
                        break L0;
                      }
                    } else {
                      var10.b(param6, -27655);
                      break L0;
                    }
                  } else {
                    var10.b(param6, -27655);
                    break L0;
                  }
                } else {
                  var10.b(param6, -27655);
                  break L0;
                }
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
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
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
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        th discarded$1 = new th();
        ((qd) this).field_Z = 0;
        ((qd) this).field_Y = 0;
        ((qd) this).field_J = new uf();
        ((qd) this).field_q = -1;
        ((qd) this).field_x = null;
        ((qd) this).field_p = -1;
        ((qd) this).field_mb = null;
        ((qd) this).field_fb = 0;
        ((qd) this).field_d = 0;
        ((qd) this).field_eb = false;
        ((qd) this).field_n = 0;
        ((qd) this).field_w = true;
        ((qd) this).field_F = -1;
        ((qd) this).field_db = false;
        ((qd) this).field_ib = 0;
        ((qd) this).field_B = new ja(157, 100);
        ((qd) this).field_z = false;
        ((qd) this).field_m = 2;
        ((qd) this).field_i = new int[256];
        ((qd) this).field_g = 1;
        try {
          L0: {
            L1: {
              fb.field_e = (qd) this;
              mj.field_Hb[2].field_g.field_d = 0;
              if (param2 >= 0) {
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
              if (((int)(bl.a((byte) 124) / 86400000L) + -11745) % 7 != 5) {
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
              ((qd) this).field_M = param2;
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
            ((qd) this).field_ab = stackIn_10_1 != 0;
            ((qd) this).b((byte) 72);
            ((qd) this).field_Q = new lq();
            ((qd) this).field_W = -50 + param0.field_H;
            var24 = fc.field_m;
            var20 = var24;
            var16 = var20;
            var12 = var16;
            var10 = var12;
            var4_array = var10;
            var5_int = 0;
            L4: while (true) {
              if (var5_int >= 8) {
                L5: {
                  ((qd) this).field_H = param0.a((byte) 114);
                  this.a(6, param0.field_h);
                  if (null != so.field_l) {
                    break L5;
                  } else {
                    L6: {
                      if (ll.field_k.field_k == 2) {
                        stackOut_16_0 = 1;
                        stackIn_17_0 = stackOut_16_0;
                        break L6;
                      } else {
                        stackOut_15_0 = 16;
                        stackIn_17_0 = stackOut_15_0;
                        break L6;
                      }
                    }
                    ke.field_b = stackIn_17_0;
                    so.field_l = new ja(1280 / ke.field_b, 960 / ke.field_b);
                    break L5;
                  }
                }
                L7: {
                  if (gf.field_h) {
                    break L7;
                  } else {
                    var27 = new int[param0.field_t - -3];
                    var23 = var27;
                    var19 = var23;
                    var15 = var19;
                    var11 = var15;
                    var4_array = var11;
                    var26 = new int[3 + param0.field_t];
                    var22 = var26;
                    var18 = var22;
                    var14 = var18;
                    var5 = var14;
                    var25 = new int[param0.field_t + 2];
                    var7 = 0;
                    var8 = 0;
                    L8: while (true) {
                      if (var25.length <= var8) {
                        var5[var26.length - 1] = var26[0];
                        var11[var26.length + -1] = var27[0];
                        ej.field_p = ao.a(var5, -837539512, var25);
                        fb.field_d = ao.a(var11, -837539512, var25);
                        break L7;
                      } else {
                        L9: {
                          var5[var8] = param0.field_D[var7][1];
                          var11[var8] = param0.field_D[var7][0];
                          var25[var8] = 25;
                          if (var7 != fb.field_e.field_M) {
                            break L9;
                          } else {
                            var8++;
                            var5[var8] = param0.field_D[var7][1];
                            var11[var8] = param0.field_D[var7][0];
                            var25[var8] = 75;
                            var8++;
                            var5[var8] = param0.field_D[var7][1];
                            var11[var8] = param0.field_D[var7][0];
                            var25[var8] = 25;
                            break L9;
                          }
                        }
                        var7++;
                        var8++;
                        continue L8;
                      }
                    }
                  }
                }
                break L0;
              } else {
                var24[var5_int] = 0;
                var5_int++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var4;
            stackOut_26_1 = new StringBuilder().append("qd.<init>(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L10;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L10;
            }
          }
          L11: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L11;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L11;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 48;
        field_r = "Name";
        field_E = "No spectators";
        field_v = "Press F10 to open Quick Chat.";
        field_K = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_V = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
    }
}
