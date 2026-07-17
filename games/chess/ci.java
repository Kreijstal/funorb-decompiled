/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class ci extends ei {
    jc field_I;
    int field_U;
    private boolean field_W;
    int field_bb;
    int field_cb;
    private boolean field_B;
    km field_hb;
    private int field_yb;
    int field_kb;
    km[] field_D;
    int field_G;
    int field_eb;
    km[] field_Q;
    int field_N;
    private int field_C;
    int field_O;
    private boolean field_ob;
    int field_V;
    String field_db;
    int field_z;
    int field_pb;
    private int field_Cb;
    int field_qb;
    static String field_J;
    boolean field_Db;
    private int field_lb;
    km[] field_Ab;
    String field_S;
    int field_P;
    int field_R;
    private int field_E;
    int field_fb;
    km field_nb;
    int field_M;
    int field_L;
    int field_wb;
    km[] field_ab;
    boolean field_rb;
    boolean field_gb;
    int field_vb;
    static ed field_ub;
    km field_jb;
    km field_Bb;
    km field_sb;
    boolean field_tb;
    private int field_X;
    km[] field_Z;
    boolean field_w;
    int field_ib;
    int field_mb;
    private int field_Y;
    static nb field_zb;
    int field_K;
    int field_T;
    boolean field_F;
    int field_y;
    int field_A;
    lh field_xb;
    static String field_x;
    private int field_H;

    final void a(int param0, int param1, boolean param2, int param3) {
        int var9 = 0;
        ci var10_ref_ci = null;
        int var11 = Chess.field_G;
        int var5 = -((ci) this).field_V;
        int var6 = -((ci) this).field_vb + var5;
        int var7 = ((ci) this).field_pb;
        int var8 = var7 - -((ci) this).field_N;
        if (param3 >= -67) {
            ((ci) this).field_P = 127;
        }
        if (!param2) {
            var9 = 0;
            var10_ref_ci = (ci) (Object) ((ci) this).field_I.g(-18110);
            while (var10_ref_ci != null) {
                var10_ref_ci.field_vb = -var10_ref_ci.field_V + var9;
                var9 = var9 + (var10_ref_ci.field_pb - (-var10_ref_ci.field_N + -param0));
                var10_ref_ci = (ci) (Object) ((ci) this).field_I.a((byte) -96);
            }
            var8 = var9 + -param0;
        }
        var9 = var8 - param1;
        if (var9 < var6) {
            var6 = var9;
        }
        if (!(var6 >= 0)) {
            var6 = 0;
        }
        int var10 = -param1 + var7;
        if (!(var5 <= var10)) {
            var5 = var10;
        }
        if (!(var5 >= 0)) {
            var5 = 0;
        }
        ((ci) this).field_vb = var5 - var6;
        ((ci) this).field_V = -var5;
        ((ci) this).field_pb = var7;
        ((ci) this).field_N = var8 + -var7;
    }

    final void a(ci param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_80_0 = null;
        Object stackIn_81_0 = null;
        Object stackIn_82_0 = null;
        Object stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_104_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_79_0 = null;
        Object stackOut_80_0 = null;
        Object stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        Object stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        try {
          L0: {
            if (param1 == -2147483648) {
              L1: {
                if (param0 == null) {
                  break L1;
                } else {
                  L2: {
                    if (param0.field_Q != null) {
                      ((ci) this).field_Q = param0.field_Q;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (0 > param0.field_T) {
                      break L3;
                    } else {
                      ((ci) this).field_T = param0.field_T;
                      break L3;
                    }
                  }
                  L4: {
                    if (!param0.field_w) {
                      break L4;
                    } else {
                      ((ci) this).field_w = param0.field_w;
                      break L4;
                    }
                  }
                  L5: {
                    if (param0.field_K != 0) {
                      ((ci) this).field_K = param0.field_K;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (param0.field_P < 0) {
                      break L6;
                    } else {
                      ((ci) this).field_P = param0.field_P;
                      break L6;
                    }
                  }
                  L7: {
                    if (param0.field_db == null) {
                      break L7;
                    } else {
                      ((ci) this).field_db = param0.field_db;
                      break L7;
                    }
                  }
                  L8: {
                    if (param0.field_z != 0) {
                      ((ci) this).field_z = param0.field_z;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (param0.field_ib != 0) {
                      ((ci) this).field_ib = param0.field_ib;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (param0.field_Bb != null) {
                      ((ci) this).field_Bb = param0.field_Bb;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (null == param0.field_S) {
                      break L11;
                    } else {
                      ((ci) this).field_S = param0.field_S;
                      break L11;
                    }
                  }
                  L12: {
                    if (null != param0.field_hb) {
                      ((ci) this).field_hb = param0.field_hb;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (param0.field_ab == null) {
                      break L13;
                    } else {
                      ((ci) this).field_ab = param0.field_ab;
                      break L13;
                    }
                  }
                  L14: {
                    if (param0.field_W) {
                      ((ci) this).field_W = param0.field_W;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (param0.field_A >= 0) {
                      ((ci) this).field_A = param0.field_A;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (param0.field_O < 0) {
                      break L16;
                    } else {
                      ((ci) this).field_O = param0.field_O;
                      break L16;
                    }
                  }
                  L17: {
                    if (param0.field_jb == null) {
                      break L17;
                    } else {
                      ((ci) this).field_jb = param0.field_jb;
                      break L17;
                    }
                  }
                  L18: {
                    if (null == param0.field_Z) {
                      break L18;
                    } else {
                      ((ci) this).field_Z = param0.field_Z;
                      break L18;
                    }
                  }
                  L19: {
                    if (null != param0.field_nb) {
                      ((ci) this).field_nb = param0.field_nb;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (null == param0.field_xb) {
                      break L20;
                    } else {
                      ((ci) this).field_xb = param0.field_xb;
                      break L20;
                    }
                  }
                  L21: {
                    if (!param0.field_gb) {
                      break L21;
                    } else {
                      ((ci) this).field_gb = param0.field_gb;
                      break L21;
                    }
                  }
                  L22: {
                    if (param0.field_B) {
                      ((ci) this).field_B = param0.field_B;
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  L23: {
                    if (param0.field_eb == 256) {
                      break L23;
                    } else {
                      ((ci) this).field_eb = param0.field_eb;
                      break L23;
                    }
                  }
                  L24: {
                    if (param0.field_Ab != null) {
                      ((ci) this).field_Ab = param0.field_Ab;
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (param0.field_sb == null) {
                      break L25;
                    } else {
                      ((ci) this).field_sb = param0.field_sb;
                      break L25;
                    }
                  }
                  L26: {
                    if (!param0.field_tb) {
                      ((ci) this).field_tb = param0.field_tb;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if (null != param0.field_D) {
                      ((ci) this).field_D = param0.field_D;
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  L28: {
                    if (param0.field_yb != -2147483648) {
                      ((ci) this).field_yb = param0.field_yb;
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  L29: {
                    if (param0.field_y != -2147483648) {
                      ((ci) this).field_y = param0.field_y;
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  L30: {
                    if (0 != param0.field_cb) {
                      ((ci) this).field_cb = param0.field_cb;
                      break L30;
                    } else {
                      break L30;
                    }
                  }
                  L31: {
                    if (param0.field_bb == -2147483648) {
                      break L31;
                    } else {
                      ((ci) this).field_bb = param0.field_bb;
                      break L31;
                    }
                  }
                  L32: {
                    L33: {
                      stackOut_79_0 = this;
                      stackIn_82_0 = stackOut_79_0;
                      stackIn_80_0 = stackOut_79_0;
                      if (!((ci) this).field_B) {
                        break L33;
                      } else {
                        stackOut_80_0 = this;
                        stackIn_82_0 = stackOut_80_0;
                        stackIn_81_0 = stackOut_80_0;
                        if (!param0.field_ob) {
                          break L33;
                        } else {
                          stackOut_81_0 = this;
                          stackOut_81_1 = 1;
                          stackIn_83_0 = stackOut_81_0;
                          stackIn_83_1 = stackOut_81_1;
                          break L32;
                        }
                      }
                    }
                    stackOut_82_0 = this;
                    stackOut_82_1 = 0;
                    stackIn_83_0 = stackOut_82_0;
                    stackIn_83_1 = stackOut_82_1;
                    break L32;
                  }
                  L34: {
                    ((ci) this).field_ob = stackIn_83_1 != 0;
                    if (param0.field_H == 0) {
                      break L34;
                    } else {
                      ((ci) this).field_H = param0.field_H;
                      break L34;
                    }
                  }
                  L35: {
                    if (param0.field_C == 0) {
                      break L35;
                    } else {
                      ((ci) this).field_C = param0.field_C;
                      break L35;
                    }
                  }
                  L36: {
                    if (param0.field_rb) {
                      ((ci) this).field_rb = param0.field_rb;
                      break L36;
                    } else {
                      break L36;
                    }
                  }
                  L37: {
                    if (-2147483648 == param0.field_Y) {
                      break L37;
                    } else {
                      ((ci) this).field_Y = param0.field_Y;
                      break L37;
                    }
                  }
                  L38: {
                    if (param0.field_R == -2147483648) {
                      break L38;
                    } else {
                      ((ci) this).field_R = param0.field_R;
                      break L38;
                    }
                  }
                  L39: {
                    if (param0.field_fb != 0) {
                      ((ci) this).field_fb = param0.field_fb;
                      break L39;
                    } else {
                      break L39;
                    }
                  }
                  if (-2147483648 != param0.field_G) {
                    ((ci) this).field_G = param0.field_G;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L40: {
            var3 = decompiledCaughtException;
            stackOut_101_0 = (RuntimeException) var3;
            stackOut_101_1 = new StringBuilder().append("ci.IA(");
            stackIn_103_0 = stackOut_101_0;
            stackIn_103_1 = stackOut_101_1;
            stackIn_102_0 = stackOut_101_0;
            stackIn_102_1 = stackOut_101_1;
            if (param0 == null) {
              stackOut_103_0 = (RuntimeException) (Object) stackIn_103_0;
              stackOut_103_1 = (StringBuilder) (Object) stackIn_103_1;
              stackOut_103_2 = "null";
              stackIn_104_0 = stackOut_103_0;
              stackIn_104_1 = stackOut_103_1;
              stackIn_104_2 = stackOut_103_2;
              break L40;
            } else {
              stackOut_102_0 = (RuntimeException) (Object) stackIn_102_0;
              stackOut_102_1 = (StringBuilder) (Object) stackIn_102_1;
              stackOut_102_2 = "{...}";
              stackIn_104_0 = stackOut_102_0;
              stackIn_104_1 = stackOut_102_1;
              stackIn_104_2 = stackOut_102_2;
              break L40;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_104_0, stackIn_104_2 + 44 + param1 + 41);
        }
    }

    ci(long param0, ci param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    private final void a(boolean param0, int param1, boolean param2, boolean param3, int param4, boolean param5, byte param6, boolean param7, int param8, boolean param9, int param10) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        km[] var16 = null;
        km var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        Object var23 = null;
        int var23_int = 0;
        ci var23_ref = null;
        int var24 = 0;
        int var25 = 0;
        String var26 = null;
        String var27 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var23 = null;
          var25 = Chess.field_G;
          ((ci) this).field_U = ((ci) this).field_mb + param10;
          ((ci) this).field_wb = param1 - -((ci) this).field_V;
          var12 = wb.field_i;
          var13 = wb.field_a;
          var14 = wb.field_j;
          if (param6 >= 49) {
            break L0;
          } else {
            ((ci) this).field_Ab = null;
            break L0;
          }
        }
        L1: {
          var15 = wb.field_b;
          wb.e(((ci) this).field_U, ((ci) this).field_wb, ((ci) this).field_M + ((ci) this).field_U, ((ci) this).field_pb + ((ci) this).field_wb);
          param9 = param9 & ((ci) this).field_tb;
          if (!((ci) this).field_W) {
            L2: {
              param5 = ((ci) this).field_gb;
              param3 = ((ci) this).field_F;
              if (((ci) this).field_kb == 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            param7 = stackIn_7_0 != 0;
            break L1;
          } else {
            break L1;
          }
        }
        L3: {
          var16 = ((ci) this).field_Ab;
          var17 = ((ci) this).field_jb;
          var18 = ((ci) this).field_ib;
          var19 = 0;
          if (param9) {
            break L3;
          } else {
            L4: {
              if (0 > ((ci) this).field_A) {
                break L4;
              } else {
                var18 = ((ci) this).field_A;
                break L4;
              }
            }
            L5: {
              if (null != ((ci) this).field_D) {
                var16 = ((ci) this).field_D;
                break L5;
              } else {
                break L5;
              }
            }
            if (null == ((ci) this).field_nb) {
              break L3;
            } else {
              var17 = ((ci) this).field_nb;
              break L3;
            }
          }
        }
        L6: {
          var20 = 0;
          if (!param3) {
            break L6;
          } else {
            L7: {
              if (((ci) this).field_yb != -2147483648) {
                var19 = ((ci) this).field_yb;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (((ci) this).field_Y != -2147483648) {
                var20 = ((ci) this).field_Y;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (null == ((ci) this).field_Bb) {
                break L9;
              } else {
                var17 = ((ci) this).field_Bb;
                break L9;
              }
            }
            L10: {
              if (((ci) this).field_Q == null) {
                break L10;
              } else {
                var16 = ((ci) this).field_Q;
                break L10;
              }
            }
            if (((ci) this).field_O < 0) {
              break L6;
            } else {
              var18 = ((ci) this).field_O;
              break L6;
            }
          }
        }
        L11: {
          if (param7) {
            L12: {
              if (0 <= ((ci) this).field_P) {
                var18 = ((ci) this).field_P;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (((ci) this).field_Z == null) {
                break L13;
              } else {
                var16 = ((ci) this).field_Z;
                break L13;
              }
            }
            L14: {
              if (((ci) this).field_G == -2147483648) {
                break L14;
              } else {
                var20 = ((ci) this).field_G;
                break L14;
              }
            }
            L15: {
              if (((ci) this).field_bb != -2147483648) {
                var19 = ((ci) this).field_bb;
                break L15;
              } else {
                break L15;
              }
            }
            if (((ci) this).field_hb != null) {
              var17 = ((ci) this).field_hb;
              break L11;
            } else {
              break L11;
            }
          } else {
            break L11;
          }
        }
        L16: {
          if (param5) {
            L17: {
              if (((ci) this).field_T >= 0) {
                var18 = ((ci) this).field_T;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              if (-2147483648 != ((ci) this).field_R) {
                var20 = ((ci) this).field_R;
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              if (null == ((ci) this).field_ab) {
                break L19;
              } else {
                var16 = ((ci) this).field_ab;
                break L19;
              }
            }
            L20: {
              if (((ci) this).field_sb != null) {
                var17 = ((ci) this).field_sb;
                break L20;
              } else {
                break L20;
              }
            }
            if (((ci) this).field_y != -2147483648) {
              var19 = ((ci) this).field_y;
              break L16;
            } else {
              break L16;
            }
          } else {
            break L16;
          }
        }
        L21: {
          var21 = ((ci) this).field_C + var19;
          var22 = var20 + ((ci) this).field_H;
          if (((ci) this).field_w) {
            em.a(param1, var16, param4, param10, 24599, param8);
            break L21;
          } else {
            em.a(((ci) this).field_wb, var16, ((ci) this).field_M, ((ci) this).field_U, 24599, ((ci) this).field_pb);
            break L21;
          }
        }
        L22: {
          if (var17 != null) {
            L23: {
              var23_int = var21 + ((ci) this).field_U;
              if (((ci) this).field_fb != 1) {
                break L23;
              } else {
                var23_int = var23_int + (-var17.field_v + ((ci) this).field_M) / 2;
                break L23;
              }
            }
            L24: {
              var24 = var22 + ((ci) this).field_wb;
              if (((ci) this).field_cb != 1) {
                break L24;
              } else {
                var24 = var24 + (-var17.field_u + ((ci) this).field_pb) / 2;
                break L24;
              }
            }
            L25: {
              if (((ci) this).field_fb == 2) {
                var23_int = var23_int + (-var17.field_v + ((ci) this).field_M);
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              if (-3 == ((ci) this).field_cb) {
                var24 = var24 + (-var17.field_u + ((ci) this).field_pb);
                break L26;
              } else {
                break L26;
              }
            }
            if (-257 > ((ci) this).field_X) {
              var17.b(var23_int, var24, ((ci) this).field_X);
              break L22;
            } else {
              var17.b(var23_int, var24);
              break L22;
            }
          } else {
            break L22;
          }
        }
        L27: {
          if (((ci) this).field_db == null) {
            break L27;
          } else {
            if (null == ((ci) this).field_xb) {
              break L27;
            } else {
              L28: {
                var26 = ((ci) this).field_db;
                var27 = var26;
                var27 = var26;
                if (!param0) {
                  break L28;
                } else {
                  if (null == ((ci) this).field_S) {
                    break L28;
                  } else {
                    var27 = var26 + ((ci) this).field_S;
                    break L28;
                  }
                }
              }
              L29: {
                if (((ci) this).field_xb.b(var27) > -(((ci) this).field_z * 2) + ((ci) this).field_M) {
                  break L29;
                } else {
                  if (-1 >= var27.indexOf("<br>")) {
                    break L29;
                  } else {
                    L30: {
                      if (((ci) this).field_cb == 1) {
                        var22 = var22 + (-((ci) this).field_xb.field_t + (((ci) this).field_pb - ((ci) this).field_xb.field_C)) / 2;
                        break L30;
                      } else {
                        if (-3 == ((ci) this).field_cb) {
                          var22 = var22 + (((ci) this).field_pb + (-((ci) this).field_xb.field_t - ((ci) this).field_xb.field_C));
                          break L30;
                        } else {
                          break L30;
                        }
                      }
                    }
                    if (0 != ((ci) this).field_fb) {
                      if (((ci) this).field_fb == 1) {
                        ((ci) this).field_xb.b(var27, var21 + (((ci) this).field_z + ((ci) this).field_U) + (((ci) this).field_M - 2 * ((ci) this).field_z) / 2, ((ci) this).field_wb + (var22 - -((ci) this).field_xb.field_C), var18, -1, ((ci) this).field_eb);
                        break L27;
                      } else {
                        if (((ci) this).field_fb != 2) {
                          int discarded$2 = ((ci) this).field_xb.a(var27, var21 + (((ci) this).field_U - -((ci) this).field_z), var22 + ((ci) this).field_wb, -(((ci) this).field_z * 2) + ((ci) this).field_M, ((ci) this).field_pb, var18, -1, ((ci) this).field_eb, ((ci) this).field_fb, ((ci) this).field_cb, ((ci) this).field_K);
                          break L27;
                        } else {
                          ((ci) this).field_xb.c(var27, ((ci) this).field_z + ((ci) this).field_U + (var21 + ((ci) this).field_M - ((ci) this).field_z * 2), ((ci) this).field_wb + var22 + ((ci) this).field_xb.field_C, var18, -1, ((ci) this).field_eb);
                          break L27;
                        }
                      }
                    } else {
                      ((ci) this).field_xb.a(var27, var21 + ((ci) this).field_z + ((ci) this).field_U, ((ci) this).field_xb.field_C + (var22 + ((ci) this).field_wb), var18, -1, ((ci) this).field_eb);
                      break L27;
                    }
                  }
                }
              }
              int discarded$3 = ((ci) this).field_xb.a(var27, var21 + (((ci) this).field_U + ((ci) this).field_z), var22 + ((ci) this).field_wb, -(2 * ((ci) this).field_z) + ((ci) this).field_M, ((ci) this).field_pb, var18, -1, ((ci) this).field_eb, ((ci) this).field_fb, ((ci) this).field_cb, ((ci) this).field_K);
              break L27;
            }
          }
        }
        L31: {
          if (((ci) this).field_I == null) {
            break L31;
          } else {
            var23_ref = (ci) (Object) ((ci) this).field_I.g(-18110);
            L32: while (true) {
              if (var23_ref == null) {
                break L31;
              } else {
                var23_ref.a(param0, var20 + var23_ref.field_wb, var23_ref.field_ob, param3, var23_ref.field_M, param5, (byte) 76, param7, var23_ref.field_pb, param9, var23_ref.field_U - -var19);
                var23_ref = (ci) (Object) var23_ref.field_I.a((byte) -110);
                continue L32;
              }
            }
          }
        }
        wb.b(var12, var13, var14, var15);
    }

    final int a(int param0, int param1) {
        int var4_int = 0;
        ci var4 = null;
        int var5 = 0;
        int var6 = Chess.field_G;
        int var3 = 0;
        if (((ci) this).field_db != null) {
            if (!(null == ((ci) this).field_xb)) {
                var4_int = ((ci) this).field_xb.c(((ci) this).field_db, param0);
                if (var4_int > var3) {
                    var3 = var4_int;
                }
            }
        }
        if (!(null == ((ci) this).field_jb)) {
            var4_int = ((ci) this).field_jb.field_v;
            if (!(var4_int <= var3)) {
                var3 = var4_int;
            }
        }
        if (param1 >= -61) {
            ((ci) this).field_V = -29;
        }
        if (!(((ci) this).field_I == null)) {
            var4 = (ci) (Object) ((ci) this).field_I.g(-18110);
            while (var4 != null) {
                var5 = var4.field_M + var4.field_mb;
                if (var3 < var5) {
                    var3 = var5;
                }
                var4 = (ci) (Object) ((ci) this).field_I.a((byte) -109);
            }
        }
        return var3;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ((ci) this).field_M = param1;
        ((ci) this).field_E = 0;
        ((ci) this).field_vb = 0;
        ((ci) this).field_pb = param3;
        ((ci) this).field_mb = param0;
        ((ci) this).field_Cb = 0;
        ((ci) this).field_V = param4;
        if (param2 != -2147483648) {
            ((ci) this).a(false, true);
        }
        ((ci) this).field_N = 0;
    }

    final void a(byte param0, ci param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (null == ((ci) this).field_I) {
                ((ci) this).field_I = new jc();
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((ci) this).field_I.a((o) (Object) param1, (byte) 87);
              if (param0 >= 122) {
                break L2;
              } else {
                ((ci) this).field_rb = false;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("ci.MA(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    public static void i(int param0) {
        field_zb = null;
        field_J = null;
        field_x = null;
        field_ub = null;
    }

    final int e(byte param0) {
        int var2 = 78 / ((-7 - param0) / 37);
        return ((ci) this).a(2147483647, -66);
    }

    final static boolean g(int param0) {
        fl var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        fl var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_6_0 = 0;
        var3 = Chess.field_G;
        try {
          L0: {
            var4 = (fl) (Object) vj.field_c.g(-18110);
            var1 = var4;
            if (var1 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (param0 == 2147483647) {
                var2 = 0;
                L1: while (true) {
                  if (var2 >= var1.field_l) {
                    stackOut_21_0 = 1;
                    stackIn_22_0 = stackOut_21_0;
                    break L0;
                  } else {
                    L2: {
                      if (null != var4.field_w[var2]) {
                        if (0 == var4.field_w[var2].field_f) {
                          stackOut_14_0 = 0;
                          stackIn_15_0 = stackOut_14_0;
                          return stackIn_15_0 != 0;
                        } else {
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (null == var4.field_u[var2]) {
                        break L3;
                      } else {
                        if (0 != var4.field_u[var2].field_f) {
                          break L3;
                        } else {
                          stackOut_18_0 = 0;
                          stackIn_19_0 = stackOut_18_0;
                          return stackIn_19_0 != 0;
                        }
                      }
                    }
                    var2++;
                    continue L1;
                  }
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var1_ref, "ci.KA(" + param0 + 41);
        }
        return stackIn_22_0 != 0;
    }

    ci(long param0, ci param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final static um a(int param0, int param1, int param2, boolean param3, boolean param4, boolean param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            da var8 = null;
            um stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            um stackOut_14_0 = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  var7 = null;
                  if (null == ol.field_N.field_a) {
                    break L1;
                  } else {
                    kj.field_a = new lc(ol.field_N.field_a, 5200, 0);
                    ol.field_N.field_a = null;
                    var6 = (Object) (Object) new gd(255, kj.field_a, new lc(ol.field_N.field_n, 12000, 0), 2097152);
                    break L1;
                  }
                }
                L2: {
                  if (null == kj.field_a) {
                    break L2;
                  } else {
                    L3: {
                      if (hj.field_n == null) {
                        hj.field_n = new lc[ol.field_N.field_r.length];
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (null != hj.field_n[param1]) {
                        break L4;
                      } else {
                        hj.field_n[param1] = new lc(ol.field_N.field_r[param1], 12000, 0);
                        ol.field_N.field_r[param1] = null;
                        break L4;
                      }
                    }
                    var7 = (Object) (Object) new gd(param1, kj.field_a, hj.field_n[param1], 2097152);
                    break L2;
                  }
                }
                L5: {
                  if (param0 == -17288) {
                    break L5;
                  } else {
                    field_J = null;
                    break L5;
                  }
                }
                L6: {
                  var8 = ge.field_fb.a((byte) 14, param4, param1, (gd) var6, (gd) var7);
                  if (param3) {
                    var8.a((byte) 108);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                stackOut_14_0 = new um((ua) (Object) var8, param5, param2);
                stackIn_15_0 = stackOut_14_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var6).toString());
            }
            return stackIn_15_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void h(int param0) {
        ci var4 = null;
        int var3 = Chess.field_G;
        if (param0 != 0) {
            this.a(true, -11, false, true, -127, false, (byte) -40, true, -4, true, 43);
        }
        if (!(((ci) this).field_I == null)) {
            var4 = (ci) (Object) ((ci) this).field_I.b(28937);
            while (var4 != null) {
                var4.field_W = true;
                var4.h(0);
                var4 = (ci) (Object) var4.field_I.a(true);
            }
        }
    }

    final void a(boolean param0, boolean param1) {
        this.a(param1, 0, false, false, wb.field_h, false, (byte) 125, param0, wb.field_c, true, 0);
    }

    private final void a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        int var14 = 0;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        Object stackOut_25_0 = null;
        Object stackOut_26_0 = null;
        Object stackOut_27_0 = null;
        Object stackOut_28_0 = null;
        Object stackOut_29_0 = null;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        Object stackOut_35_0 = null;
        Object stackOut_36_0 = null;
        Object stackOut_37_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        L0: {
          var13 = null;
          var14 = Chess.field_G;
          if (param5 > 113) {
            break L0;
          } else {
            boolean discarded$1 = ci.g(-55);
            break L0;
          }
        }
        L1: {
          if (((ci) this).field_E > 0) {
            var7 = -(-((ci) this).field_E >> 2);
            break L1;
          } else {
            var7 = ((ci) this).field_E >> 2;
            break L1;
          }
        }
        L2: {
          ((ci) this).field_E = ((ci) this).field_E - var7;
          ((ci) this).field_mb = ((ci) this).field_mb + var7;
          if (((ci) this).field_vb > 0) {
            var7 = -(-((ci) this).field_vb >> 2);
            break L2;
          } else {
            var7 = ((ci) this).field_vb >> 2;
            break L2;
          }
        }
        L3: {
          ((ci) this).field_V = ((ci) this).field_V + var7;
          ((ci) this).field_vb = ((ci) this).field_vb - var7;
          if (0 < ((ci) this).field_Cb) {
            var7 = -(-((ci) this).field_Cb >> 2);
            break L3;
          } else {
            var7 = ((ci) this).field_Cb >> 2;
            break L3;
          }
        }
        L4: {
          ((ci) this).field_Cb = ((ci) this).field_Cb - var7;
          ((ci) this).field_M = ((ci) this).field_M + var7;
          if (((ci) this).field_N <= 0) {
            var7 = ((ci) this).field_N >> 2;
            break L4;
          } else {
            var7 = -(-((ci) this).field_N >> 2);
            break L4;
          }
        }
        L5: {
          L6: {
            ((ci) this).field_pb = ((ci) this).field_pb + var7;
            param1 = param1 & ((ci) this).field_tb;
            ((ci) this).field_U = param0 + ((ci) this).field_mb;
            ((ci) this).field_wb = ((ci) this).field_V + param3;
            ((ci) this).field_N = ((ci) this).field_N - var7;
            var8 = wb.field_i;
            var9 = wb.field_a;
            var10 = wb.field_j;
            var11 = wb.field_b;
            wb.e(((ci) this).field_U, ((ci) this).field_wb, ((ci) this).field_U - -((ci) this).field_M, ((ci) this).field_pb + ((ci) this).field_wb);
            var12 = 0;
            if (fg.field_b) {
              break L6;
            } else {
              if (!param1) {
                break L6;
              } else {
                if (th.field_d == 0) {
                  break L6;
                } else {
                  if (wb.field_i > re.field_m) {
                    break L6;
                  } else {
                    if (re.field_m >= wb.field_j) {
                      break L6;
                    } else {
                      if (ag.field_f < wb.field_a) {
                        break L6;
                      } else {
                        if (wb.field_b <= ag.field_f) {
                          break L6;
                        } else {
                          ((ci) this).field_L = th.field_d;
                          ((ci) this).field_kb = th.field_d;
                          ((ci) this).field_qb = -((ci) this).field_U + re.field_m;
                          ((ci) this).field_lb = ag.field_f + -((ci) this).field_wb;
                          var12 = 1;
                          break L5;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          L7: {
            if (th.field_d == 0) {
              break L7;
            } else {
              ((ci) this).field_kb = 0;
              break L7;
            }
          }
          ((ci) this).field_L = 0;
          break L5;
        }
        L8: {
          L9: {
            stackOut_25_0 = this;
            stackIn_31_0 = stackOut_25_0;
            stackIn_26_0 = stackOut_25_0;
            if (gd.field_e) {
              break L9;
            } else {
              stackOut_26_0 = this;
              stackIn_31_0 = stackOut_26_0;
              stackIn_27_0 = stackOut_26_0;
              if (wb.field_i > hn.field_k) {
                break L9;
              } else {
                stackOut_27_0 = this;
                stackIn_31_0 = stackOut_27_0;
                stackIn_28_0 = stackOut_27_0;
                if (wb.field_j <= hn.field_k) {
                  break L9;
                } else {
                  stackOut_28_0 = this;
                  stackIn_31_0 = stackOut_28_0;
                  stackIn_29_0 = stackOut_28_0;
                  if (rf.field_b < wb.field_a) {
                    break L9;
                  } else {
                    stackOut_29_0 = this;
                    stackIn_31_0 = stackOut_29_0;
                    stackIn_30_0 = stackOut_29_0;
                    if (wb.field_b <= rf.field_b) {
                      break L9;
                    } else {
                      stackOut_30_0 = this;
                      stackOut_30_1 = 1;
                      stackIn_32_0 = stackOut_30_0;
                      stackIn_32_1 = stackOut_30_1;
                      break L8;
                    }
                  }
                }
              }
            }
          }
          stackOut_31_0 = this;
          stackOut_31_1 = 0;
          stackIn_32_0 = stackOut_31_0;
          stackIn_32_1 = stackOut_31_1;
          break L8;
        }
        L10: {
          ((ci) this).field_Db = stackIn_32_1 != 0;
          if (wh.field_f == 0) {
            ((ci) this).field_kb = 0;
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          L12: {
            stackOut_35_0 = this;
            stackIn_39_0 = stackOut_35_0;
            stackIn_36_0 = stackOut_35_0;
            if (!((ci) this).field_Db) {
              break L12;
            } else {
              stackOut_36_0 = this;
              stackIn_39_0 = stackOut_36_0;
              stackIn_37_0 = stackOut_36_0;
              if (((ci) this).field_kb != wh.field_f) {
                break L12;
              } else {
                stackOut_37_0 = this;
                stackIn_39_0 = stackOut_37_0;
                stackIn_38_0 = stackOut_37_0;
                if (!param1) {
                  break L12;
                } else {
                  stackOut_38_0 = this;
                  stackOut_38_1 = 1;
                  stackIn_40_0 = stackOut_38_0;
                  stackIn_40_1 = stackOut_38_1;
                  break L11;
                }
              }
            }
          }
          stackOut_39_0 = this;
          stackOut_39_1 = 0;
          stackIn_40_0 = stackOut_39_0;
          stackIn_40_1 = stackOut_39_1;
          break L11;
        }
        L13: {
          ((ci) this).field_F = stackIn_40_1 != 0;
          if (((ci) this).field_I == null) {
            break L13;
          } else {
            var13 = (Object) (Object) (ci) (Object) ((ci) this).field_I.b(28937);
            L14: while (true) {
              if (var13 == null) {
                break L13;
              } else {
                ((ci) var13).a(((ci) var13).field_U, param1, ((ci) var13).field_M, ((ci) var13).field_wb, ((ci) var13).field_pb, 127);
                var13 = (Object) (Object) (ci) (Object) ((ci) var13).field_I.a(true);
                continue L14;
              }
            }
          }
        }
        L15: {
          if (var12 == 0) {
            break L15;
          } else {
            fg.field_b = true;
            break L15;
          }
        }
        L16: {
          if (((ci) var13).field_Db) {
            gd.field_e = true;
            break L16;
          } else {
            break L16;
          }
        }
        L17: {
          wb.b(var8, var9, var10, var11);
          if (((ci) var13).field_kb == 0) {
            break L17;
          } else {
            if (((ci) var13).field_rb) {
              L18: {
                ((ci) this).field_mb = -((ci) var13).field_qb + hn.field_k - param0;
                ((ci) this).field_V = rf.field_b + (-((ci) var13).field_lb + -param3);
                if (((ci) var13).field_mb >= 0) {
                  break L18;
                } else {
                  ((ci) this).field_mb = 0;
                  break L18;
                }
              }
              L19: {
                if (((ci) var13).field_V >= 0) {
                  break L19;
                } else {
                  ((ci) this).field_V = 0;
                  break L19;
                }
              }
              L20: {
                if (-((ci) var13).field_M + param2 >= ((ci) var13).field_mb) {
                  break L20;
                } else {
                  ((ci) this).field_mb = param2 + -((ci) var13).field_M;
                  break L20;
                }
              }
              L21: {
                ((ci) this).field_E = 0;
                ((ci) this).field_vb = 0;
                ((ci) this).field_U = param0 - -((ci) var13).field_mb;
                if (((ci) var13).field_V <= -((ci) var13).field_pb + param4) {
                  break L21;
                } else {
                  ((ci) this).field_V = param4 + -((ci) var13).field_pb;
                  break L21;
                }
              }
              ((ci) this).field_wb = param3 - -((ci) var13).field_V;
              break L17;
            } else {
              break L17;
            }
          }
        }
    }

    final static int a(int param0, byte[] param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = Chess.field_G;
        try {
          L0: {
            var4_int = -1;
            var5 = param2;
            L1: while (true) {
              if (var5 >= param3) {
                L2: {
                  if (param0 < -31) {
                    break L2;
                  } else {
                    field_J = null;
                    break L2;
                  }
                }
                var4_int = ~var4_int;
                stackOut_6_0 = var4_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var4_int = dn.field_e[(param1[var5] ^ var4_int) & 255] ^ var4_int >>> 8;
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("ci.AA(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_7_0;
    }

    final static void j(int param0) {
        Object var2 = null;
        ld.a(oc.field_o, (String) null, 0);
    }

    final static boolean f(int param0) {
        if (param0 > -10) {
            return false;
        }
        return pd.field_Rb.field_Fb == gb.field_t ? true : false;
    }

    final void a(boolean param0, byte param1) {
        gd.field_e = !param0 ? true : false;
        if (param1 != 88) {
            ((ci) this).field_I = null;
        }
        fg.field_b = !param0 ? true : false;
        this.a(0, true, wb.field_h, 0, wb.field_c, 122);
    }

    protected ci() {
        ((ci) this).field_yb = -2147483648;
        ((ci) this).field_B = false;
        ((ci) this).field_ob = false;
        ((ci) this).field_R = -2147483648;
        ((ci) this).field_P = -1;
        ((ci) this).field_bb = -2147483648;
        ((ci) this).field_eb = 256;
        ((ci) this).field_G = -2147483648;
        ((ci) this).field_T = -1;
        ((ci) this).field_O = -1;
        ((ci) this).field_X = 256;
        ((ci) this).field_y = -2147483648;
        ((ci) this).field_A = -1;
        ((ci) this).field_Y = -2147483648;
        ((ci) this).field_tb = true;
    }

    final void a(boolean param0, ci param1, int param2, ci param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                int discarded$2 = ((ci) this).e((byte) -117);
                break L1;
              }
            }
            L2: {
              if (param1 == null) {
                param3.field_vb = 0;
                param3.field_V = 0;
                break L2;
              } else {
                param3.field_vb = param1.field_vb - -param1.field_N;
                param3.field_V = param1.field_pb + param1.field_V + param2;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("ci.JA(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44).append(param2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    ci(long param0, ci param1, int param2, int param3, int param4, int param5, String param6) {
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
        ((ci) this).field_yb = -2147483648;
        ((ci) this).field_B = false;
        ((ci) this).field_ob = false;
        ((ci) this).field_R = -2147483648;
        ((ci) this).field_P = -1;
        ((ci) this).field_bb = -2147483648;
        ((ci) this).field_eb = 256;
        ((ci) this).field_G = -2147483648;
        ((ci) this).field_T = -1;
        ((ci) this).field_O = -1;
        ((ci) this).field_X = 256;
        ((ci) this).field_y = -2147483648;
        ((ci) this).field_A = -1;
        ((ci) this).field_Y = -2147483648;
        ((ci) this).field_tb = true;
        try {
          L0: {
            L1: {
              ((ci) this).field_mb = param2;
              ((ci) this).field_pb = param5;
              ((ci) this).field_V = param3;
              ((ci) this).field_e = param0;
              ((ci) this).field_M = param4;
              ((ci) this).a(param1, -2147483648);
              if (param6 == null) {
                break L1;
              } else {
                ((ci) this).field_db = param6;
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
            stackOut_4_1 = new StringBuilder().append("ci.<init>(").append(param0).append(44);
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
          throw fk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ub = new ed();
        field_x = "Auto-respond to <%0>";
    }
}
