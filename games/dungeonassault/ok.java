/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ok extends ko {
    int field_G;
    private boolean field_Cb;
    private cn field_C;
    private int field_Z;
    private md field_F;
    private int field_xb;
    static int[] field_S;
    private int field_vb;
    int field_lb;
    private int field_Eb;
    private int field_ub;
    static String field_jb;
    private boolean field_bb;
    cn field_L;
    private int field_H;
    int field_B;
    private int field_db;
    private boolean field_qb;
    private String field_K;
    private int field_Db;
    private int field_M;
    private int field_eb;
    boolean field_hb;
    private cn[] field_rb;
    private int field_W;
    static tf field_Y;
    private cn[] field_Fb;
    private boolean field_ib;
    private int field_nb;
    private int field_x;
    private int field_tb;
    private int field_pb;
    private boolean field_kb;
    private int field_Ab;
    se field_y;
    int field_fb;
    int field_ob;
    private int field_yb;
    private int field_I;
    private boolean field_A;
    private cn[] field_U;
    private String field_Q;
    private cn field_ab;
    static int[] field_X;
    private int field_sb;
    private boolean field_V;
    private cn[] field_R;
    private int field_Bb;
    private int field_T;
    private int field_N;
    private int field_mb;
    private boolean field_O;
    private cn field_P;
    private cn[] field_E;
    int field_D;
    private int field_zb;
    private int field_wb;
    private cn field_cb;
    int field_gb;
    private int field_J;
    static int field_z;

    final void a(int param0, boolean param1) {
        im.field_a = !param1 ? true : false;
        ti.field_i = !param1 ? true : false;
        this.a(gf.field_c, 0, 7183, 0, true, gf.field_i);
        if (param0 != -2) {
            ((ok) this).field_sb = 49;
        }
    }

    final void e(int param0) {
        int var3 = 0;
        ok var4 = null;
        var3 = DungeonAssault.field_K;
        if (param0 != 30509) {
          return;
        } else {
          L0: {
            if (null != ((ok) this).field_F) {
              var4 = (ok) (Object) ((ok) this).field_F.d(-14205);
              L1: while (true) {
                if (var4 == null) {
                  break L0;
                } else {
                  var4.field_O = true;
                  var4.e(30509);
                  var4 = (ok) (Object) var4.field_F.g(20);
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
          return;
        }
    }

    ok(long param0, ok param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    ok(long param0, ok param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    private final void a(int param0, int param1, int param2, boolean param3, boolean param4, boolean param5, boolean param6, boolean param7, boolean param8, int param9, int param10) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        cn[] var16 = null;
        cn var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        Object var23 = null;
        int var23_int = 0;
        ok var23_ref = null;
        int var24 = 0;
        int var25 = 0;
        String var26 = null;
        String var27 = null;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        L0: {
          var23 = null;
          var25 = DungeonAssault.field_K;
          ((ok) this).field_ub = param2 + ((ok) this).field_D;
          ((ok) this).field_zb = param0 + ((ok) this).field_gb;
          var12 = gf.field_j;
          var13 = gf.field_f;
          var14 = gf.field_h;
          var15 = gf.field_e;
          gf.a(((ok) this).field_zb, ((ok) this).field_ub, ((ok) this).field_ob + ((ok) this).field_zb, ((ok) this).field_ub - -((ok) this).field_B);
          if (((ok) this).field_O) {
            break L0;
          } else {
            L1: {
              param5 = ((ok) this).field_Cb;
              param7 = ((ok) this).field_hb;
              if (0 == ((ok) this).field_I) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            param3 = stackIn_4_0 != 0;
            break L0;
          }
        }
        L2: {
          param4 = param4 & ((ok) this).field_kb;
          var16 = ((ok) this).field_U;
          var17 = ((ok) this).field_L;
          var18 = ((ok) this).field_fb;
          var19 = param10;
          if (param4) {
            break L2;
          } else {
            L3: {
              if (null != ((ok) this).field_C) {
                var17 = ((ok) this).field_C;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if ((((ok) this).field_wb ^ -1) > -1) {
                break L4;
              } else {
                var18 = ((ok) this).field_wb;
                break L4;
              }
            }
            if (((ok) this).field_Fb != null) {
              var16 = ((ok) this).field_Fb;
              break L2;
            } else {
              break L2;
            }
          }
        }
        L5: {
          var20 = 0;
          if (param7) {
            L6: {
              if (((ok) this).field_Eb == -2147483648) {
                break L6;
              } else {
                var20 = ((ok) this).field_Eb;
                break L6;
              }
            }
            L7: {
              if (((ok) this).field_ab == null) {
                break L7;
              } else {
                var17 = ((ok) this).field_ab;
                break L7;
              }
            }
            L8: {
              if (-1 < (((ok) this).field_Z ^ -1)) {
                break L8;
              } else {
                var18 = ((ok) this).field_Z;
                break L8;
              }
            }
            L9: {
              if (((ok) this).field_mb == -2147483648) {
                break L9;
              } else {
                var19 = ((ok) this).field_mb;
                break L9;
              }
            }
            if (null == ((ok) this).field_rb) {
              break L5;
            } else {
              var16 = ((ok) this).field_rb;
              break L5;
            }
          } else {
            break L5;
          }
        }
        L10: {
          if (!param3) {
            break L10;
          } else {
            L11: {
              if (((ok) this).field_R == null) {
                break L11;
              } else {
                var16 = ((ok) this).field_R;
                break L11;
              }
            }
            L12: {
              if (-2147483648 != ((ok) this).field_eb) {
                var20 = ((ok) this).field_eb;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (0 > ((ok) this).field_Db) {
                break L13;
              } else {
                var18 = ((ok) this).field_Db;
                break L13;
              }
            }
            L14: {
              if (-2147483648 != ((ok) this).field_nb) {
                var19 = ((ok) this).field_nb;
                break L14;
              } else {
                break L14;
              }
            }
            if (null == ((ok) this).field_P) {
              break L10;
            } else {
              var17 = ((ok) this).field_P;
              break L10;
            }
          }
        }
        L15: {
          if (!param5) {
            break L15;
          } else {
            L16: {
              if ((((ok) this).field_H ^ -1) == 2147483647) {
                break L16;
              } else {
                var20 = ((ok) this).field_H;
                break L16;
              }
            }
            L17: {
              if (((ok) this).field_tb >= 0) {
                var18 = ((ok) this).field_tb;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              if (null != ((ok) this).field_cb) {
                var17 = ((ok) this).field_cb;
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              if (((ok) this).field_E != null) {
                var16 = ((ok) this).field_E;
                break L19;
              } else {
                break L19;
              }
            }
            if (2147483647 == (((ok) this).field_W ^ -1)) {
              break L15;
            } else {
              var19 = ((ok) this).field_W;
              break L15;
            }
          }
        }
        L20: {
          var21 = var19 + ((ok) this).field_M;
          var22 = ((ok) this).field_yb + var20;
          if (!((ok) this).field_ib) {
            sn.a(-33, ((ok) this).field_B, var16, ((ok) this).field_zb, ((ok) this).field_ub, ((ok) this).field_ob);
            break L20;
          } else {
            sn.a(param10 + 100, param1, var16, param0, param2, param9);
            break L20;
          }
        }
        L21: {
          if (var17 == null) {
            break L21;
          } else {
            L22: {
              var23_int = ((ok) this).field_zb - -var21;
              if ((((ok) this).field_lb ^ -1) != -2) {
                break L22;
              } else {
                var23_int = var23_int + (((ok) this).field_ob + -var17.field_E) / 2;
                break L22;
              }
            }
            L23: {
              var24 = ((ok) this).field_ub + var22;
              if (2 != ((ok) this).field_lb) {
                break L23;
              } else {
                var23_int = var23_int + (-var17.field_E + ((ok) this).field_ob);
                break L23;
              }
            }
            L24: {
              if (((ok) this).field_vb != 1) {
                break L24;
              } else {
                var24 = var24 + (((ok) this).field_B + -var17.field_G) / 2;
                break L24;
              }
            }
            L25: {
              if ((((ok) this).field_vb ^ -1) == -3) {
                var24 = var24 + (-var17.field_G + ((ok) this).field_B);
                break L25;
              } else {
                break L25;
              }
            }
            if (256 > ((ok) this).field_Ab) {
              var17.d(var23_int, var24, ((ok) this).field_Ab);
              break L21;
            } else {
              var17.h(var23_int, var24);
              break L21;
            }
          }
        }
        L26: {
          if (null == ((ok) this).field_Q) {
            break L26;
          } else {
            if (null == ((ok) this).field_y) {
              break L26;
            } else {
              L27: {
                var26 = ((ok) this).field_Q;
                var27 = var26;
                var27 = var26;
                if (!param6) {
                  break L27;
                } else {
                  if (null == ((ok) this).field_K) {
                    break L27;
                  } else {
                    var27 = var26 + ((ok) this).field_K;
                    break L27;
                  }
                }
              }
              L28: {
                if (((ok) this).field_y.b(var27) > -(2 * ((ok) this).field_xb) + ((ok) this).field_ob) {
                  break L28;
                } else {
                  if (-1 < (var27.indexOf("<br>") ^ -1)) {
                    L29: {
                      if (-2 != (((ok) this).field_vb ^ -1)) {
                        if ((((ok) this).field_vb ^ -1) == -3) {
                          var22 = var22 + (((ok) this).field_B + -((ok) this).field_y.field_E - ((ok) this).field_y.field_H);
                          break L29;
                        } else {
                          break L29;
                        }
                      } else {
                        var22 = var22 + (-((ok) this).field_y.field_E + (-((ok) this).field_y.field_H + ((ok) this).field_B)) / 2;
                        break L29;
                      }
                    }
                    if (0 != ((ok) this).field_lb) {
                      if (((ok) this).field_lb != 1) {
                        if (2 != ((ok) this).field_lb) {
                          int discarded$2 = ((ok) this).field_y.a(var27, var21 + (((ok) this).field_xb + ((ok) this).field_zb), var22 + ((ok) this).field_ub, -(2 * ((ok) this).field_xb) + ((ok) this).field_ob, ((ok) this).field_B, var18, -1, ((ok) this).field_J, ((ok) this).field_lb, ((ok) this).field_vb, ((ok) this).field_Bb);
                          break L26;
                        } else {
                          ((ok) this).field_y.c(var27, -(2 * ((ok) this).field_xb) + (((ok) this).field_ob + (var21 + ((ok) this).field_xb)) + ((ok) this).field_zb, ((ok) this).field_y.field_H + (((ok) this).field_ub + var22), var18, -1, ((ok) this).field_J);
                          break L26;
                        }
                      } else {
                        ((ok) this).field_y.b(var27, var21 + (((ok) this).field_xb + ((ok) this).field_zb + (-(2 * ((ok) this).field_xb) + ((ok) this).field_ob) / 2), ((ok) this).field_y.field_H + var22 + ((ok) this).field_ub, var18, -1, ((ok) this).field_J);
                        break L26;
                      }
                    } else {
                      ((ok) this).field_y.a(var27, var21 + (((ok) this).field_xb + ((ok) this).field_zb), ((ok) this).field_y.field_H + (((ok) this).field_ub - -var22), var18, -1, ((ok) this).field_J);
                      break L26;
                    }
                  } else {
                    break L28;
                  }
                }
              }
              int discarded$3 = ((ok) this).field_y.a(var27, var21 + ((ok) this).field_zb - -((ok) this).field_xb, var22 + ((ok) this).field_ub, ((ok) this).field_ob - 2 * ((ok) this).field_xb, ((ok) this).field_B, var18, -1, ((ok) this).field_J, ((ok) this).field_lb, ((ok) this).field_vb, ((ok) this).field_Bb);
              break L26;
            }
          }
        }
        L30: {
          if (null == ((ok) this).field_F) {
            break L30;
          } else {
            var23_ref = (ok) (Object) ((ok) this).field_F.e(-24172);
            L31: while (true) {
              if (var23_ref == null) {
                break L30;
              } else {
                var23_ref.a(var23_ref.field_zb - -var19, var23_ref.field_B, var20 + var23_ref.field_ub, param3, param4, param5, param6, param7, var23_ref.field_A, var23_ref.field_ob, 0);
                var23_ref = (ok) (Object) var23_ref.field_F.a(4);
                continue L31;
              }
            }
          }
        }
        gf.e(var12, var13, var14, var15);
    }

    final static void a(int param0, String[] param1) {
        if (null != cd.field_f) {
            cd.field_f.field_W.a((byte) -104, param1);
        }
        if (param0 != 2) {
            field_Y = null;
        }
        if (null != pj.field_c) {
            pj.field_c.field_P.a((byte) -126, param1);
        }
    }

    final void b(boolean param0, int param1) {
        if (param1 < 59) {
            ok.f(124);
        }
        this.a(0, gf.field_c, 0, false, true, false, param0, false, false, gf.field_i, 0);
    }

    private final void a(byte param0, ok param1) {
        Object stackIn_75_0 = null;
        Object stackIn_76_0 = null;
        Object stackIn_77_0 = null;
        Object stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        Object stackOut_74_0 = null;
        Object stackOut_75_0 = null;
        Object stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        Object stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        L0: {
          if (param1 != null) {
            L1: {
              if (param1.field_Cb) {
                ((ok) this).field_Cb = param1.field_Cb;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1.field_fb == 0) {
                break L2;
              } else {
                ((ok) this).field_fb = param1.field_fb;
                break L2;
              }
            }
            L3: {
              if (-257 != (param1.field_J ^ -1)) {
                ((ok) this).field_J = param1.field_J;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param1.field_L == null) {
                break L4;
              } else {
                ((ok) this).field_L = param1.field_L;
                break L4;
              }
            }
            L5: {
              if (param1.field_cb != null) {
                ((ok) this).field_cb = param1.field_cb;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (null == param1.field_K) {
                break L6;
              } else {
                ((ok) this).field_K = param1.field_K;
                break L6;
              }
            }
            L7: {
              if (!param1.field_O) {
                break L7;
              } else {
                ((ok) this).field_O = param1.field_O;
                break L7;
              }
            }
            L8: {
              if (param1.field_Z < 0) {
                break L8;
              } else {
                ((ok) this).field_Z = param1.field_Z;
                break L8;
              }
            }
            L9: {
              if (param1.field_C != null) {
                ((ok) this).field_C = param1.field_C;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (param1.field_R == null) {
                break L10;
              } else {
                ((ok) this).field_R = param1.field_R;
                break L10;
              }
            }
            L11: {
              if (null == param1.field_Fb) {
                break L11;
              } else {
                ((ok) this).field_Fb = param1.field_Fb;
                break L11;
              }
            }
            L12: {
              if (null == param1.field_P) {
                break L12;
              } else {
                ((ok) this).field_P = param1.field_P;
                break L12;
              }
            }
            L13: {
              if (param1.field_Q != null) {
                ((ok) this).field_Q = param1.field_Q;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (param1.field_ib) {
                ((ok) this).field_ib = param1.field_ib;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (-1 >= (param1.field_tb ^ -1)) {
                ((ok) this).field_tb = param1.field_tb;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (param1.field_Db >= 0) {
                ((ok) this).field_Db = param1.field_Db;
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              if (param1.field_ab == null) {
                break L17;
              } else {
                ((ok) this).field_ab = param1.field_ab;
                break L17;
              }
            }
            L18: {
              if (0 == param1.field_xb) {
                break L18;
              } else {
                ((ok) this).field_xb = param1.field_xb;
                break L18;
              }
            }
            L19: {
              if (param1.field_wb >= 0) {
                ((ok) this).field_wb = param1.field_wb;
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              if (param1.field_qb) {
                ((ok) this).field_qb = param1.field_qb;
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              if (null == param1.field_y) {
                break L21;
              } else {
                ((ok) this).field_y = param1.field_y;
                break L21;
              }
            }
            L22: {
              if (0 == param1.field_Bb) {
                break L22;
              } else {
                ((ok) this).field_Bb = param1.field_Bb;
                break L22;
              }
            }
            L23: {
              if (param1.field_kb) {
                break L23;
              } else {
                ((ok) this).field_kb = param1.field_kb;
                break L23;
              }
            }
            L24: {
              if (param1.field_rb == null) {
                break L24;
              } else {
                ((ok) this).field_rb = param1.field_rb;
                break L24;
              }
            }
            L25: {
              if (param1.field_E == null) {
                break L25;
              } else {
                ((ok) this).field_E = param1.field_E;
                break L25;
              }
            }
            L26: {
              if (param1.field_U == null) {
                break L26;
              } else {
                ((ok) this).field_U = param1.field_U;
                break L26;
              }
            }
            L27: {
              if (0 == param1.field_lb) {
                break L27;
              } else {
                ((ok) this).field_lb = param1.field_lb;
                break L27;
              }
            }
            L28: {
              if ((param1.field_Eb ^ -1) != 2147483647) {
                ((ok) this).field_Eb = param1.field_Eb;
                break L28;
              } else {
                break L28;
              }
            }
            L29: {
              if (0 != param1.field_vb) {
                ((ok) this).field_vb = param1.field_vb;
                break L29;
              } else {
                break L29;
              }
            }
            L30: {
              if ((param1.field_eb ^ -1) == 2147483647) {
                break L30;
              } else {
                ((ok) this).field_eb = param1.field_eb;
                break L30;
              }
            }
            L31: {
              L32: {
                stackOut_74_0 = this;
                stackIn_77_0 = stackOut_74_0;
                stackIn_75_0 = stackOut_74_0;
                if (!((ok) this).field_qb) {
                  break L32;
                } else {
                  stackOut_75_0 = this;
                  stackIn_77_0 = stackOut_75_0;
                  stackIn_76_0 = stackOut_75_0;
                  if (!param1.field_A) {
                    break L32;
                  } else {
                    stackOut_76_0 = this;
                    stackOut_76_1 = 1;
                    stackIn_78_0 = stackOut_76_0;
                    stackIn_78_1 = stackOut_76_1;
                    break L31;
                  }
                }
              }
              stackOut_77_0 = this;
              stackOut_77_1 = 0;
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              break L31;
            }
            L33: {
              ((ok) this).field_A = stackIn_78_1 != 0;
              if (2147483647 == (param1.field_nb ^ -1)) {
                break L33;
              } else {
                ((ok) this).field_nb = param1.field_nb;
                break L33;
              }
            }
            L34: {
              if (param1.field_mb == 2147483647) {
                break L34;
              } else {
                ((ok) this).field_mb = param1.field_mb;
                break L34;
              }
            }
            L35: {
              if (2147483647 == param1.field_H) {
                break L35;
              } else {
                ((ok) this).field_H = param1.field_H;
                break L35;
              }
            }
            L36: {
              if (0 != param1.field_yb) {
                ((ok) this).field_yb = param1.field_yb;
                break L36;
              } else {
                break L36;
              }
            }
            L37: {
              if (param1.field_bb) {
                ((ok) this).field_bb = param1.field_bb;
                break L37;
              } else {
                break L37;
              }
            }
            L38: {
              if (2147483647 != (param1.field_W ^ -1)) {
                ((ok) this).field_W = param1.field_W;
                break L38;
              } else {
                break L38;
              }
            }
            if (param1.field_M == 0) {
              break L0;
            } else {
              ((ok) this).field_M = param1.field_M;
              break L0;
            }
          } else {
            break L0;
          }
        }
        L39: {
          if (param0 >= 27) {
            break L39;
          } else {
            field_Y = null;
            break L39;
          }
        }
    }

    public static void f(int param0) {
        if (param0 != -16218) {
            return;
        }
        field_jb = null;
        field_S = null;
        field_Y = null;
        field_X = null;
    }

    private final void a(int param0, int param1, int param2, int param3, boolean param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        ok var13_ref = null;
        int var14 = 0;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        Object stackOut_26_0 = null;
        Object stackOut_27_0 = null;
        Object stackOut_28_0 = null;
        Object stackOut_29_0 = null;
        Object stackOut_30_0 = null;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_33_0 = null;
        Object stackOut_34_0 = null;
        Object stackOut_35_0 = null;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        L0: {
          var13 = null;
          var14 = DungeonAssault.field_K;
          if ((((ok) this).field_sb ^ -1) >= -1) {
            var7 = ((ok) this).field_sb >> 49875266;
            break L0;
          } else {
            var7 = -(-((ok) this).field_sb >> 476414146);
            break L0;
          }
        }
        L1: {
          ((ok) this).field_sb = ((ok) this).field_sb - var7;
          ((ok) this).field_gb = ((ok) this).field_gb + var7;
          if (((ok) this).field_pb <= 0) {
            var7 = ((ok) this).field_pb >> -148763742;
            break L1;
          } else {
            var7 = -(-((ok) this).field_pb >> 150063234);
            break L1;
          }
        }
        L2: {
          ((ok) this).field_D = ((ok) this).field_D + var7;
          ((ok) this).field_pb = ((ok) this).field_pb - var7;
          if (-1 > (((ok) this).field_T ^ -1)) {
            var7 = -(-((ok) this).field_T >> -866005118);
            break L2;
          } else {
            var7 = ((ok) this).field_T >> 1473086658;
            break L2;
          }
        }
        L3: {
          ((ok) this).field_T = ((ok) this).field_T - var7;
          ((ok) this).field_ob = ((ok) this).field_ob + var7;
          if ((((ok) this).field_x ^ -1) < -1) {
            var7 = -(-((ok) this).field_x >> 1605884418);
            break L3;
          } else {
            var7 = ((ok) this).field_x >> -1449403198;
            break L3;
          }
        }
        if (param2 == 7183) {
          L4: {
            L5: {
              param4 = param4 & ((ok) this).field_kb;
              ((ok) this).field_ub = ((ok) this).field_D + param3;
              ((ok) this).field_x = ((ok) this).field_x - var7;
              ((ok) this).field_zb = ((ok) this).field_gb + param1;
              ((ok) this).field_B = ((ok) this).field_B + var7;
              var8 = gf.field_j;
              var9 = gf.field_f;
              var10 = gf.field_h;
              var11 = gf.field_e;
              gf.a(((ok) this).field_zb, ((ok) this).field_ub, ((ok) this).field_ob + ((ok) this).field_zb, ((ok) this).field_B + ((ok) this).field_ub);
              var12 = 0;
              if (ti.field_i) {
                break L5;
              } else {
                if (!param4) {
                  break L5;
                } else {
                  if (no.field_d == 0) {
                    break L5;
                  } else {
                    if (gf.field_j > lc.field_c) {
                      break L5;
                    } else {
                      if (lc.field_c >= gf.field_h) {
                        break L5;
                      } else {
                        if (hm.field_k < gf.field_f) {
                          break L5;
                        } else {
                          if (gf.field_e <= hm.field_k) {
                            break L5;
                          } else {
                            var12 = 1;
                            ((ok) this).field_db = lc.field_c + -((ok) this).field_zb;
                            ((ok) this).field_I = no.field_d;
                            ((ok) this).field_G = no.field_d;
                            ((ok) this).field_N = -((ok) this).field_ub + hm.field_k;
                            break L4;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            ((ok) this).field_G = 0;
            if (0 == no.field_d) {
              break L4;
            } else {
              ((ok) this).field_I = 0;
              break L4;
            }
          }
          L6: {
            if (la.field_g != 0) {
              break L6;
            } else {
              ((ok) this).field_I = 0;
              break L6;
            }
          }
          L7: {
            L8: {
              stackOut_26_0 = this;
              stackIn_32_0 = stackOut_26_0;
              stackIn_27_0 = stackOut_26_0;
              if (im.field_a) {
                break L8;
              } else {
                stackOut_27_0 = this;
                stackIn_32_0 = stackOut_27_0;
                stackIn_28_0 = stackOut_27_0;
                if (hj.field_S < gf.field_j) {
                  break L8;
                } else {
                  stackOut_28_0 = this;
                  stackIn_32_0 = stackOut_28_0;
                  stackIn_29_0 = stackOut_28_0;
                  if (gf.field_h <= hj.field_S) {
                    break L8;
                  } else {
                    stackOut_29_0 = this;
                    stackIn_32_0 = stackOut_29_0;
                    stackIn_30_0 = stackOut_29_0;
                    if (eh.field_h < gf.field_f) {
                      break L8;
                    } else {
                      stackOut_30_0 = this;
                      stackIn_32_0 = stackOut_30_0;
                      stackIn_31_0 = stackOut_30_0;
                      if (gf.field_e <= eh.field_h) {
                        break L8;
                      } else {
                        stackOut_31_0 = this;
                        stackOut_31_1 = 1;
                        stackIn_33_0 = stackOut_31_0;
                        stackIn_33_1 = stackOut_31_1;
                        break L7;
                      }
                    }
                  }
                }
              }
            }
            stackOut_32_0 = this;
            stackOut_32_1 = 0;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            break L7;
          }
          L9: {
            L10: {
              ((ok) this).field_V = stackIn_33_1 != 0;
              stackOut_33_0 = this;
              stackIn_37_0 = stackOut_33_0;
              stackIn_34_0 = stackOut_33_0;
              if (!((ok) this).field_V) {
                break L10;
              } else {
                stackOut_34_0 = this;
                stackIn_37_0 = stackOut_34_0;
                stackIn_35_0 = stackOut_34_0;
                if (la.field_g != ((ok) this).field_I) {
                  break L10;
                } else {
                  stackOut_35_0 = this;
                  stackIn_37_0 = stackOut_35_0;
                  stackIn_36_0 = stackOut_35_0;
                  if (!param4) {
                    break L10;
                  } else {
                    stackOut_36_0 = this;
                    stackOut_36_1 = 1;
                    stackIn_38_0 = stackOut_36_0;
                    stackIn_38_1 = stackOut_36_1;
                    break L9;
                  }
                }
              }
            }
            stackOut_37_0 = this;
            stackOut_37_1 = 0;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            break L9;
          }
          L11: {
            ((ok) this).field_hb = stackIn_38_1 != 0;
            if (null != ((ok) this).field_F) {
              var13_ref = (ok) (Object) ((ok) this).field_F.d(-14205);
              L12: while (true) {
                if (var13_ref == null) {
                  break L11;
                } else {
                  var13_ref.a(var13_ref.field_B, var13_ref.field_zb, 7183, var13_ref.field_ub, param4, var13_ref.field_ob);
                  var13_ref = (ok) (Object) var13_ref.field_F.g(20);
                  continue L12;
                }
              }
            } else {
              break L11;
            }
          }
          L13: {
            if (var13_ref.field_V) {
              im.field_a = true;
              break L13;
            } else {
              break L13;
            }
          }
          L14: {
            if (var12 == 0) {
              break L14;
            } else {
              ti.field_i = true;
              break L14;
            }
          }
          L15: {
            gf.e(var8, var9, var10, var11);
            if (-1 == (var13_ref.field_I ^ -1)) {
              break L15;
            } else {
              if (!var13_ref.field_bb) {
                break L15;
              } else {
                L16: {
                  ((ok) this).field_gb = -param1 + -var13_ref.field_db + hj.field_S;
                  ((ok) this).field_D = -param3 + (eh.field_h - var13_ref.field_N);
                  if (0 > var13_ref.field_gb) {
                    ((ok) this).field_gb = 0;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if ((var13_ref.field_D ^ -1) > -1) {
                    ((ok) this).field_D = 0;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (-var13_ref.field_ob + param5 < var13_ref.field_gb) {
                    ((ok) this).field_gb = -var13_ref.field_ob + param5;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (-var13_ref.field_B + param0 >= var13_ref.field_D) {
                    break L19;
                  } else {
                    ((ok) this).field_D = param0 - var13_ref.field_B;
                    break L19;
                  }
                }
                ((ok) this).field_sb = 0;
                ((ok) this).field_pb = 0;
                ((ok) this).field_zb = var13_ref.field_gb + param1;
                ((ok) this).field_ub = var13_ref.field_D + param3;
                break L15;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(ok param0, byte param1) {
        if (param1 != 124) {
            ((ok) this).field_xb = 89;
        }
        if (!(((ok) this).field_F != null)) {
            ((ok) this).field_F = new md();
        }
        ((ok) this).field_F.a((ne) (Object) param0, false);
    }

    private ok(long param0, ok param1, int param2, int param3, int param4, int param5, String param6) {
        ((ok) this).field_Eb = -2147483648;
        ((ok) this).field_eb = -2147483648;
        ((ok) this).field_H = -2147483648;
        ((ok) this).field_qb = false;
        ((ok) this).field_Db = -1;
        ((ok) this).field_Z = -1;
        ((ok) this).field_Ab = 256;
        ((ok) this).field_A = false;
        ((ok) this).field_mb = -2147483648;
        ((ok) this).field_tb = -1;
        ((ok) this).field_W = -2147483648;
        ((ok) this).field_nb = -2147483648;
        ((ok) this).field_kb = true;
        ((ok) this).field_wb = -1;
        ((ok) this).field_J = 256;
        ((ok) this).field_D = param3;
        ((ok) this).field_h = param0;
        ((ok) this).field_gb = param2;
        ((ok) this).field_B = param5;
        ((ok) this).field_ob = param4;
        this.a((byte) 30, param1);
        if (param6 != null) {
            ((ok) this).field_Q = param6;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_jb = "Enchantress";
        field_S = new int[8192];
        field_X = new int[]{0, 16777164, 16776960, 16763904, 16737792, 16720384, 16711680, 12255232, 4456448, 0};
        field_z = 48;
    }
}
