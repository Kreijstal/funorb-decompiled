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

    private final void a(int param0, int param1, int param2, boolean param3, boolean param4, boolean param5, boolean param6, boolean param7, boolean param8, int param9) {
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
          var19 = 0;
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
              if (((ok) this).field_wb < 0) {
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
              if (((ok) this).field_Z < 0) {
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
              if (((ok) this).field_H == -2147483648) {
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
            if (((ok) this).field_W == -2147483648) {
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
            sn.a(100, param1, var16, param0, param2, param9);
            break L20;
          }
        }
        L21: {
          if (var17 == null) {
            break L21;
          } else {
            L22: {
              var23_int = ((ok) this).field_zb - -var21;
              if (((ok) this).field_lb != 1) {
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
              if (((ok) this).field_vb == 2) {
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
                  if (var27.indexOf("<br>") < 0) {
                    L29: {
                      if (((ok) this).field_vb != 1) {
                        if (((ok) this).field_vb == 2) {
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
                          int discarded$3 = ((ok) this).field_y.a(var27, var21 + (((ok) this).field_xb + ((ok) this).field_zb), var22 + ((ok) this).field_ub, -(2 * ((ok) this).field_xb) + ((ok) this).field_ob, ((ok) this).field_B, var18, -1, ((ok) this).field_J, ((ok) this).field_lb, ((ok) this).field_vb, ((ok) this).field_Bb);
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
              int discarded$4 = ((ok) this).field_y.a(var27, var21 + ((ok) this).field_zb - -((ok) this).field_xb, var22 + ((ok) this).field_ub, ((ok) this).field_ob - 2 * ((ok) this).field_xb, ((ok) this).field_B, var18, -1, ((ok) this).field_J, ((ok) this).field_lb, ((ok) this).field_vb, ((ok) this).field_Bb);
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
                int discarded$5 = 0;
                var23_ref.a(var23_ref.field_zb - -var19, var23_ref.field_B, var20 + var23_ref.field_ub, param3, param4, param5, param6, param7, var23_ref.field_A, var23_ref.field_ob);
                var23_ref = (ok) (Object) var23_ref.field_F.a(4);
                continue L31;
              }
            }
          }
        }
        gf.e(var12, var13, var14, var15);
    }

    final static void a(int param0, String[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (null == cd.field_f) {
                break L1;
              } else {
                cd.field_f.field_W.a((byte) -104, param1);
                break L1;
              }
            }
            L2: {
              if (null == pj.field_c) {
                break L2;
              } else {
                pj.field_c.field_P.a((byte) -126, param1);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("ok.V(").append(2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    final void b(boolean param0, int param1) {
        if (param1 < 59) {
            ok.f(124);
        }
        int discarded$0 = 0;
        this.a(0, gf.field_c, 0, false, true, false, param0, false, false, gf.field_i);
    }

    private final void a(byte param0, ok param1) {
        RuntimeException var3 = null;
        Object stackIn_75_0 = null;
        Object stackIn_76_0 = null;
        Object stackIn_77_0 = null;
        Object stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_99_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_74_0 = null;
        Object stackOut_75_0 = null;
        Object stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        Object stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        try {
          L0: {
            L1: {
              if (param1 != null) {
                L2: {
                  if (param1.field_Cb) {
                    ((ok) this).field_Cb = param1.field_Cb;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param1.field_fb == 0) {
                    break L3;
                  } else {
                    ((ok) this).field_fb = param1.field_fb;
                    break L3;
                  }
                }
                L4: {
                  if (param1.field_J != 256) {
                    ((ok) this).field_J = param1.field_J;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param1.field_L == null) {
                    break L5;
                  } else {
                    ((ok) this).field_L = param1.field_L;
                    break L5;
                  }
                }
                L6: {
                  if (param1.field_cb != null) {
                    ((ok) this).field_cb = param1.field_cb;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (null == param1.field_K) {
                    break L7;
                  } else {
                    ((ok) this).field_K = param1.field_K;
                    break L7;
                  }
                }
                L8: {
                  if (!param1.field_O) {
                    break L8;
                  } else {
                    ((ok) this).field_O = param1.field_O;
                    break L8;
                  }
                }
                L9: {
                  if (param1.field_Z < 0) {
                    break L9;
                  } else {
                    ((ok) this).field_Z = param1.field_Z;
                    break L9;
                  }
                }
                L10: {
                  if (param1.field_C != null) {
                    ((ok) this).field_C = param1.field_C;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (param1.field_R == null) {
                    break L11;
                  } else {
                    ((ok) this).field_R = param1.field_R;
                    break L11;
                  }
                }
                L12: {
                  if (null == param1.field_Fb) {
                    break L12;
                  } else {
                    ((ok) this).field_Fb = param1.field_Fb;
                    break L12;
                  }
                }
                L13: {
                  if (null == param1.field_P) {
                    break L13;
                  } else {
                    ((ok) this).field_P = param1.field_P;
                    break L13;
                  }
                }
                L14: {
                  if (param1.field_Q != null) {
                    ((ok) this).field_Q = param1.field_Q;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (param1.field_ib) {
                    ((ok) this).field_ib = param1.field_ib;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (param1.field_tb >= 0) {
                    ((ok) this).field_tb = param1.field_tb;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (param1.field_Db >= 0) {
                    ((ok) this).field_Db = param1.field_Db;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (param1.field_ab == null) {
                    break L18;
                  } else {
                    ((ok) this).field_ab = param1.field_ab;
                    break L18;
                  }
                }
                L19: {
                  if (0 == param1.field_xb) {
                    break L19;
                  } else {
                    ((ok) this).field_xb = param1.field_xb;
                    break L19;
                  }
                }
                L20: {
                  if (param1.field_wb >= 0) {
                    ((ok) this).field_wb = param1.field_wb;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (param1.field_qb) {
                    ((ok) this).field_qb = param1.field_qb;
                    break L21;
                  } else {
                    break L21;
                  }
                }
                L22: {
                  if (null == param1.field_y) {
                    break L22;
                  } else {
                    ((ok) this).field_y = param1.field_y;
                    break L22;
                  }
                }
                L23: {
                  if (0 == param1.field_Bb) {
                    break L23;
                  } else {
                    ((ok) this).field_Bb = param1.field_Bb;
                    break L23;
                  }
                }
                L24: {
                  if (param1.field_kb) {
                    break L24;
                  } else {
                    ((ok) this).field_kb = param1.field_kb;
                    break L24;
                  }
                }
                L25: {
                  if (param1.field_rb == null) {
                    break L25;
                  } else {
                    ((ok) this).field_rb = param1.field_rb;
                    break L25;
                  }
                }
                L26: {
                  if (param1.field_E == null) {
                    break L26;
                  } else {
                    ((ok) this).field_E = param1.field_E;
                    break L26;
                  }
                }
                L27: {
                  if (param1.field_U == null) {
                    break L27;
                  } else {
                    ((ok) this).field_U = param1.field_U;
                    break L27;
                  }
                }
                L28: {
                  if (0 == param1.field_lb) {
                    break L28;
                  } else {
                    ((ok) this).field_lb = param1.field_lb;
                    break L28;
                  }
                }
                L29: {
                  if (param1.field_Eb != -2147483648) {
                    ((ok) this).field_Eb = param1.field_Eb;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (0 != param1.field_vb) {
                    ((ok) this).field_vb = param1.field_vb;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (param1.field_eb == -2147483648) {
                    break L31;
                  } else {
                    ((ok) this).field_eb = param1.field_eb;
                    break L31;
                  }
                }
                L32: {
                  L33: {
                    stackOut_74_0 = this;
                    stackIn_77_0 = stackOut_74_0;
                    stackIn_75_0 = stackOut_74_0;
                    if (!((ok) this).field_qb) {
                      break L33;
                    } else {
                      stackOut_75_0 = this;
                      stackIn_77_0 = stackOut_75_0;
                      stackIn_76_0 = stackOut_75_0;
                      if (!param1.field_A) {
                        break L33;
                      } else {
                        stackOut_76_0 = this;
                        stackOut_76_1 = 1;
                        stackIn_78_0 = stackOut_76_0;
                        stackIn_78_1 = stackOut_76_1;
                        break L32;
                      }
                    }
                  }
                  stackOut_77_0 = this;
                  stackOut_77_1 = 0;
                  stackIn_78_0 = stackOut_77_0;
                  stackIn_78_1 = stackOut_77_1;
                  break L32;
                }
                L34: {
                  ((ok) this).field_A = stackIn_78_1 != 0;
                  if (param1.field_nb == -2147483648) {
                    break L34;
                  } else {
                    ((ok) this).field_nb = param1.field_nb;
                    break L34;
                  }
                }
                L35: {
                  if (param1.field_mb == -2147483648) {
                    break L35;
                  } else {
                    ((ok) this).field_mb = param1.field_mb;
                    break L35;
                  }
                }
                L36: {
                  if (param1.field_H == -2147483648) {
                    break L36;
                  } else {
                    ((ok) this).field_H = param1.field_H;
                    break L36;
                  }
                }
                L37: {
                  if (0 != param1.field_yb) {
                    ((ok) this).field_yb = param1.field_yb;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                L38: {
                  if (param1.field_bb) {
                    ((ok) this).field_bb = param1.field_bb;
                    break L38;
                  } else {
                    break L38;
                  }
                }
                L39: {
                  if (param1.field_W != -2147483648) {
                    ((ok) this).field_W = param1.field_W;
                    break L39;
                  } else {
                    break L39;
                  }
                }
                if (param1.field_M == 0) {
                  break L1;
                } else {
                  ((ok) this).field_M = param1.field_M;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L40: {
            var3 = decompiledCaughtException;
            stackOut_96_0 = (RuntimeException) var3;
            stackOut_96_1 = new StringBuilder().append("ok.U(").append(30).append(44);
            stackIn_98_0 = stackOut_96_0;
            stackIn_98_1 = stackOut_96_1;
            stackIn_97_0 = stackOut_96_0;
            stackIn_97_1 = stackOut_96_1;
            if (param1 == null) {
              stackOut_98_0 = (RuntimeException) (Object) stackIn_98_0;
              stackOut_98_1 = (StringBuilder) (Object) stackIn_98_1;
              stackOut_98_2 = "null";
              stackIn_99_0 = stackOut_98_0;
              stackIn_99_1 = stackOut_98_1;
              stackIn_99_2 = stackOut_98_2;
              break L40;
            } else {
              stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
              stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
              stackOut_97_2 = "{...}";
              stackIn_99_0 = stackOut_97_0;
              stackIn_99_1 = stackOut_97_1;
              stackIn_99_2 = stackOut_97_2;
              break L40;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_99_0, stackIn_99_2 + 41);
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
        int var14 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        Object stackOut_24_0 = null;
        Object stackOut_25_0 = null;
        Object stackOut_26_0 = null;
        Object stackOut_27_0 = null;
        Object stackOut_28_0 = null;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_31_0 = null;
        Object stackOut_32_0 = null;
        Object stackOut_33_0 = null;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        L0: {
          var13 = null;
          var14 = DungeonAssault.field_K;
          if (((ok) this).field_sb <= 0) {
            var7 = ((ok) this).field_sb >> 2;
            break L0;
          } else {
            var7 = -(-((ok) this).field_sb >> 2);
            break L0;
          }
        }
        L1: {
          ((ok) this).field_sb = ((ok) this).field_sb - var7;
          ((ok) this).field_gb = ((ok) this).field_gb + var7;
          if (((ok) this).field_pb <= 0) {
            var7 = ((ok) this).field_pb >> 2;
            break L1;
          } else {
            var7 = -(-((ok) this).field_pb >> 2);
            break L1;
          }
        }
        L2: {
          ((ok) this).field_D = ((ok) this).field_D + var7;
          ((ok) this).field_pb = ((ok) this).field_pb - var7;
          if (((ok) this).field_T > 0) {
            var7 = -(-((ok) this).field_T >> 2);
            break L2;
          } else {
            var7 = ((ok) this).field_T >> 2;
            break L2;
          }
        }
        L3: {
          ((ok) this).field_T = ((ok) this).field_T - var7;
          ((ok) this).field_ob = ((ok) this).field_ob + var7;
          if (((ok) this).field_x > 0) {
            var7 = -(-((ok) this).field_x >> 2);
            break L3;
          } else {
            var7 = ((ok) this).field_x >> 2;
            break L3;
          }
        }
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
            stackOut_24_0 = this;
            stackIn_30_0 = stackOut_24_0;
            stackIn_25_0 = stackOut_24_0;
            if (im.field_a) {
              break L8;
            } else {
              stackOut_25_0 = this;
              stackIn_30_0 = stackOut_25_0;
              stackIn_26_0 = stackOut_25_0;
              if (hj.field_S < gf.field_j) {
                break L8;
              } else {
                stackOut_26_0 = this;
                stackIn_30_0 = stackOut_26_0;
                stackIn_27_0 = stackOut_26_0;
                if (gf.field_h <= hj.field_S) {
                  break L8;
                } else {
                  stackOut_27_0 = this;
                  stackIn_30_0 = stackOut_27_0;
                  stackIn_28_0 = stackOut_27_0;
                  if (eh.field_h < gf.field_f) {
                    break L8;
                  } else {
                    stackOut_28_0 = this;
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_29_0 = stackOut_28_0;
                    if (gf.field_e <= eh.field_h) {
                      break L8;
                    } else {
                      stackOut_29_0 = this;
                      stackOut_29_1 = 1;
                      stackIn_31_0 = stackOut_29_0;
                      stackIn_31_1 = stackOut_29_1;
                      break L7;
                    }
                  }
                }
              }
            }
          }
          stackOut_30_0 = this;
          stackOut_30_1 = 0;
          stackIn_31_0 = stackOut_30_0;
          stackIn_31_1 = stackOut_30_1;
          break L7;
        }
        L9: {
          L10: {
            ((ok) this).field_V = stackIn_31_1 != 0;
            stackOut_31_0 = this;
            stackIn_35_0 = stackOut_31_0;
            stackIn_32_0 = stackOut_31_0;
            if (!((ok) this).field_V) {
              break L10;
            } else {
              stackOut_32_0 = this;
              stackIn_35_0 = stackOut_32_0;
              stackIn_33_0 = stackOut_32_0;
              if (la.field_g != ((ok) this).field_I) {
                break L10;
              } else {
                stackOut_33_0 = this;
                stackIn_35_0 = stackOut_33_0;
                stackIn_34_0 = stackOut_33_0;
                if (!param4) {
                  break L10;
                } else {
                  stackOut_34_0 = this;
                  stackOut_34_1 = 1;
                  stackIn_36_0 = stackOut_34_0;
                  stackIn_36_1 = stackOut_34_1;
                  break L9;
                }
              }
            }
          }
          stackOut_35_0 = this;
          stackOut_35_1 = 0;
          stackIn_36_0 = stackOut_35_0;
          stackIn_36_1 = stackOut_35_1;
          break L9;
        }
        L11: {
          ((ok) this).field_hb = stackIn_36_1 != 0;
          if (null != ((ok) this).field_F) {
            var13 = (Object) (Object) (ok) (Object) ((ok) this).field_F.d(-14205);
            L12: while (true) {
              if (var13 == null) {
                break L11;
              } else {
                ((ok) var13).a(((ok) var13).field_B, ((ok) var13).field_zb, 7183, ((ok) var13).field_ub, param4, ((ok) var13).field_ob);
                var13 = (Object) (Object) (ok) (Object) ((ok) var13).field_F.g(20);
                continue L12;
              }
            }
          } else {
            break L11;
          }
        }
        L13: {
          if (((ok) var13).field_V) {
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
          if (((ok) var13).field_I == 0) {
            break L15;
          } else {
            if (!((ok) var13).field_bb) {
              break L15;
            } else {
              L16: {
                ((ok) this).field_gb = -param1 + -((ok) var13).field_db + hj.field_S;
                ((ok) this).field_D = -param3 + (eh.field_h - ((ok) var13).field_N);
                if (0 > ((ok) var13).field_gb) {
                  ((ok) this).field_gb = 0;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (((ok) var13).field_D < 0) {
                  ((ok) this).field_D = 0;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (-((ok) var13).field_ob + param5 < ((ok) var13).field_gb) {
                  ((ok) this).field_gb = -((ok) var13).field_ob + param5;
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (-((ok) var13).field_B + param0 >= ((ok) var13).field_D) {
                  break L19;
                } else {
                  ((ok) this).field_D = param0 - ((ok) var13).field_B;
                  break L19;
                }
              }
              ((ok) this).field_sb = 0;
              ((ok) this).field_pb = 0;
              ((ok) this).field_zb = ((ok) var13).field_gb + param1;
              ((ok) this).field_ub = ((ok) var13).field_D + param3;
              break L15;
            }
          }
        }
    }

    final void a(ok param0, byte param1) {
        try {
            if (param1 != 124) {
                ((ok) this).field_xb = 89;
            }
            if (!(((ok) this).field_F != null)) {
                ((ok) this).field_F = new md();
            }
            ((ok) this).field_F.a((ne) (Object) param0, false);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "ok.S(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    private ok(long param0, ok param1, int param2, int param3, int param4, int param5, String param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
        try {
          L0: {
            L1: {
              ((ok) this).field_D = param3;
              ((ok) this).field_h = param0;
              ((ok) this).field_gb = param2;
              ((ok) this).field_B = param5;
              ((ok) this).field_ob = param4;
              this.a((byte) 30, param1);
              if (param6 == null) {
                break L1;
              } else {
                ((ok) this).field_Q = param6;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("ok.<init>(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param6 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
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
