/*
 * Decompiled by CFR-JS 0.4.0.
 */
class sna extends tf {
    kv[] field_db;
    int field_N;
    kv[] field_eb;
    po field_jb;
    kv[] field_A;
    int field_mb;
    int field_V;
    private boolean field_P;
    int field_L;
    int field_r;
    boolean field_E;
    boolean field_t;
    int field_D;
    int field_cb;
    int field_hb;
    int field_ab;
    kv field_H;
    private int field_O;
    int field_o;
    int field_lb;
    int field_B;
    int field_M;
    int field_p;
    kv field_v;
    int field_ib;
    String field_pb;
    kv field_y;
    private int field_x;
    boolean field_qb;
    int field_I;
    int field_gb;
    int field_w;
    int field_W;
    private boolean field_q;
    kv field_J;
    kv[] field_X;
    int field_rb;
    private int field_bb;
    int field_Y;
    int field_G;
    private int field_S;
    kv field_U;
    int field_kb;
    private int field_Q;
    int field_ob;
    boolean field_u;
    static boolean field_s;
    String field_Z;
    private boolean field_tb;
    int field_sb;
    static gj field_fb;
    static String field_C;
    boolean field_ub;
    int field_nb;
    int field_R;
    kv[] field_K;
    eaa field_z;
    private int field_F;
    boolean field_T;

    public static void e(byte param0) {
        field_C = null;
        field_fb = null;
        if (param0 != -110) {
            sna.e((byte) -44);
        }
    }

    sna(String param0, sna param1, int param2, int param3, int param4, int param5, String param6) {
        this(ew.a((byte) 8, (CharSequence) (Object) param0), param1, param2, param3, param4, param5, param6);
    }

    final void a(boolean param0, sna param1, sna param2, int param3) {
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
              if (!param0) {
                break L1;
              } else {
                ((sna) this).field_W = 109;
                break L1;
              }
            }
            L2: {
              if (param2 != null) {
                param1.field_rb = param2.field_p + (param2.field_rb - -param3);
                param1.field_I = param2.field_I - -param2.field_hb;
                break L2;
              } else {
                param1.field_I = 0;
                param1.field_rb = 0;
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
            stackOut_6_1 = new StringBuilder().append("sna.R(").append(param0).append(44);
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
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param3 + 41);
        }
    }

    final void a(int param0, sna param1) {
        try {
            if (param0 != -1) {
                ((sna) this).field_Q = 109;
            }
            if (!(null != ((sna) this).field_z)) {
                ((sna) this).field_z = new eaa();
            }
            ((sna) this).field_z.a((bw) (Object) param1, true);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "sna.N(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(sna param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_78_0 = null;
        Object stackIn_79_0 = null;
        Object stackIn_80_0 = null;
        Object stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_100_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_77_0 = null;
        Object stackOut_78_0 = null;
        Object stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        Object stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        try {
          L0: {
            if (param1 > 1) {
              L1: {
                L2: {
                  if (param0 == null) {
                    break L2;
                  } else {
                    L3: {
                      if (null == param0.field_J) {
                        break L3;
                      } else {
                        ((sna) this).field_J = param0.field_J;
                        break L3;
                      }
                    }
                    L4: {
                      if (param0.field_L == 0) {
                        break L4;
                      } else {
                        ((sna) this).field_L = param0.field_L;
                        break L4;
                      }
                    }
                    L5: {
                      if (param0.field_G >= 0) {
                        ((sna) this).field_G = param0.field_G;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (param0.field_q) {
                        ((sna) this).field_q = param0.field_q;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (param0.field_A == null) {
                        break L7;
                      } else {
                        ((sna) this).field_A = param0.field_A;
                        break L7;
                      }
                    }
                    L8: {
                      if (param0.field_K == null) {
                        break L8;
                      } else {
                        ((sna) this).field_K = param0.field_K;
                        break L8;
                      }
                    }
                    L9: {
                      if (param0.field_gb == 0) {
                        break L9;
                      } else {
                        ((sna) this).field_gb = param0.field_gb;
                        break L9;
                      }
                    }
                    L10: {
                      if (param0.field_eb != null) {
                        ((sna) this).field_eb = param0.field_eb;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (null == param0.field_db) {
                        break L11;
                      } else {
                        ((sna) this).field_db = param0.field_db;
                        break L11;
                      }
                    }
                    L12: {
                      if (null == param0.field_jb) {
                        break L12;
                      } else {
                        ((sna) this).field_jb = param0.field_jb;
                        break L12;
                      }
                    }
                    L13: {
                      if (null == param0.field_U) {
                        break L13;
                      } else {
                        ((sna) this).field_U = param0.field_U;
                        break L13;
                      }
                    }
                    L14: {
                      if (param0.field_o >= 0) {
                        ((sna) this).field_o = param0.field_o;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if (param0.field_B == 0) {
                        break L15;
                      } else {
                        ((sna) this).field_B = param0.field_B;
                        break L15;
                      }
                    }
                    L16: {
                      if (null == param0.field_X) {
                        break L16;
                      } else {
                        ((sna) this).field_X = param0.field_X;
                        break L16;
                      }
                    }
                    L17: {
                      if (null == param0.field_pb) {
                        break L17;
                      } else {
                        ((sna) this).field_pb = param0.field_pb;
                        break L17;
                      }
                    }
                    L18: {
                      if (param0.field_P) {
                        ((sna) this).field_P = param0.field_P;
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    L19: {
                      if (null == param0.field_y) {
                        break L19;
                      } else {
                        ((sna) this).field_y = param0.field_y;
                        break L19;
                      }
                    }
                    L20: {
                      if (null != param0.field_H) {
                        ((sna) this).field_H = param0.field_H;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    L21: {
                      if (param0.field_w < 0) {
                        break L21;
                      } else {
                        ((sna) this).field_w = param0.field_w;
                        break L21;
                      }
                    }
                    L22: {
                      if (0 > param0.field_ab) {
                        break L22;
                      } else {
                        ((sna) this).field_ab = param0.field_ab;
                        break L22;
                      }
                    }
                    L23: {
                      if (null != param0.field_Z) {
                        ((sna) this).field_Z = param0.field_Z;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    L24: {
                      if (param0.field_cb != 256) {
                        ((sna) this).field_cb = param0.field_cb;
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    L25: {
                      if (!param0.field_qb) {
                        break L25;
                      } else {
                        ((sna) this).field_qb = param0.field_qb;
                        break L25;
                      }
                    }
                    L26: {
                      if (param0.field_u) {
                        break L26;
                      } else {
                        ((sna) this).field_u = param0.field_u;
                        break L26;
                      }
                    }
                    L27: {
                      if (param0.field_t) {
                        ((sna) this).field_t = param0.field_t;
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                    L28: {
                      if (param0.field_v == null) {
                        break L28;
                      } else {
                        ((sna) this).field_v = param0.field_v;
                        break L28;
                      }
                    }
                    L29: {
                      if (param0.field_ub) {
                        ((sna) this).field_ub = param0.field_ub;
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                    L30: {
                      if (param0.field_x != 0) {
                        ((sna) this).field_x = param0.field_x;
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                    L31: {
                      if (0 == param0.field_Y) {
                        break L31;
                      } else {
                        ((sna) this).field_Y = param0.field_Y;
                        break L31;
                      }
                    }
                    L32: {
                      if (param0.field_bb != -2147483648) {
                        ((sna) this).field_bb = param0.field_bb;
                        break L32;
                      } else {
                        break L32;
                      }
                    }
                    L33: {
                      if (param0.field_N == 0) {
                        break L33;
                      } else {
                        ((sna) this).field_N = param0.field_N;
                        break L33;
                      }
                    }
                    L34: {
                      L35: {
                        stackOut_77_0 = this;
                        stackIn_80_0 = stackOut_77_0;
                        stackIn_78_0 = stackOut_77_0;
                        if (!((sna) this).field_P) {
                          break L35;
                        } else {
                          stackOut_78_0 = this;
                          stackIn_80_0 = stackOut_78_0;
                          stackIn_79_0 = stackOut_78_0;
                          if (!param0.field_tb) {
                            break L35;
                          } else {
                            stackOut_79_0 = this;
                            stackOut_79_1 = 1;
                            stackIn_81_0 = stackOut_79_0;
                            stackIn_81_1 = stackOut_79_1;
                            break L34;
                          }
                        }
                      }
                      stackOut_80_0 = this;
                      stackOut_80_1 = 0;
                      stackIn_81_0 = stackOut_80_0;
                      stackIn_81_1 = stackOut_80_1;
                      break L34;
                    }
                    L36: {
                      ((sna) this).field_tb = stackIn_81_1 != 0;
                      if (param0.field_r == -2147483648) {
                        break L36;
                      } else {
                        ((sna) this).field_r = param0.field_r;
                        break L36;
                      }
                    }
                    L37: {
                      if (param0.field_V != -2147483648) {
                        ((sna) this).field_V = param0.field_V;
                        break L37;
                      } else {
                        break L37;
                      }
                    }
                    L38: {
                      if (param0.field_O != 0) {
                        ((sna) this).field_O = param0.field_O;
                        break L38;
                      } else {
                        break L38;
                      }
                    }
                    L39: {
                      if (param0.field_ob != -2147483648) {
                        ((sna) this).field_ob = param0.field_ob;
                        break L39;
                      } else {
                        break L39;
                      }
                    }
                    L40: {
                      if (-2147483648 == param0.field_lb) {
                        break L40;
                      } else {
                        ((sna) this).field_lb = param0.field_lb;
                        break L40;
                      }
                    }
                    if (param0.field_Q == -2147483648) {
                      break L2;
                    } else {
                      ((sna) this).field_Q = param0.field_Q;
                      break L1;
                    }
                  }
                }
                break L1;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L41: {
            var3 = decompiledCaughtException;
            stackOut_97_0 = (RuntimeException) var3;
            stackOut_97_1 = new StringBuilder().append("sna.V(");
            stackIn_99_0 = stackOut_97_0;
            stackIn_99_1 = stackOut_97_1;
            stackIn_98_0 = stackOut_97_0;
            stackIn_98_1 = stackOut_97_1;
            if (param0 == null) {
              stackOut_99_0 = (RuntimeException) (Object) stackIn_99_0;
              stackOut_99_1 = (StringBuilder) (Object) stackIn_99_1;
              stackOut_99_2 = "null";
              stackIn_100_0 = stackOut_99_0;
              stackIn_100_1 = stackOut_99_1;
              stackIn_100_2 = stackOut_99_2;
              break L41;
            } else {
              stackOut_98_0 = (RuntimeException) (Object) stackIn_98_0;
              stackOut_98_1 = (StringBuilder) (Object) stackIn_98_1;
              stackOut_98_2 = "{...}";
              stackIn_100_0 = stackOut_98_0;
              stackIn_100_1 = stackOut_98_1;
              stackIn_100_2 = stackOut_98_2;
              break L41;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_100_0, stackIn_100_2 + 44 + param1 + 41);
        }
    }

    sna(long param0, sna param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    sna(long param0, sna param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ((sna) this).field_W = 0;
        ((sna) this).field_I = 0;
        if (param1 != 31407) {
            ((sna) this).field_lb = -57;
        }
        ((sna) this).field_hb = 0;
        ((sna) this).field_kb = param3;
        ((sna) this).field_mb = 0;
        ((sna) this).field_sb = param2;
        ((sna) this).field_p = param0;
        ((sna) this).field_rb = param4;
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        sna var10_ref_sna = null;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = BachelorFridge.field_y;
          var5 = -((sna) this).field_rb;
          var6 = var5 - ((sna) this).field_I;
          var7 = ((sna) this).field_p;
          var8 = var7 - -((sna) this).field_hb;
          if (!param2) {
            var9 = 0;
            var10_ref_sna = (sna) (Object) ((sna) this).field_z.b((byte) 90);
            L1: while (true) {
              if (var10_ref_sna == null) {
                var8 = -param3 + var9;
                break L0;
              } else {
                var10_ref_sna.field_I = var9 - var10_ref_sna.field_rb;
                var9 = var9 + (param3 + var10_ref_sna.field_p - -var10_ref_sna.field_hb);
                var10_ref_sna = (sna) (Object) ((sna) this).field_z.c(0);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        L2: {
          var9 = -param1 + var8;
          if (var9 < var6) {
            var6 = var9;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (var6 >= 0) {
            break L3;
          } else {
            var6 = 0;
            break L3;
          }
        }
        L4: {
          var10 = -param1 + var7;
          if (var10 < var5) {
            var5 = var10;
            break L4;
          } else {
            break L4;
          }
        }
        if (param0 != -24380) {
          return;
        } else {
          L5: {
            if (var5 < 0) {
              var5 = 0;
              break L5;
            } else {
              break L5;
            }
          }
          ((sna) this).field_I = -var6 + var5;
          ((sna) this).field_p = var7;
          ((sna) this).field_rb = -var5;
          ((sna) this).field_hb = var8 - var7;
          return;
        }
    }

    final void a(boolean param0, int param1) {
        this.a(false, false, 0, false, param1 ^ -2147475846, 0, dg.field_c, param0, dg.field_i, true, false);
        if (param1 != 7802) {
            ((sna) this).field_jb = null;
        }
    }

    final void a(int param0, boolean param1) {
        if (param0 != 19842) {
            int discarded$0 = ((sna) this).b(68, -125);
        }
        mu.field_k = !param1 ? true : false;
        on.field_x = !param1 ? true : false;
        this.a(true, 0, false, dg.field_i, dg.field_c, 0);
    }

    final int e(int param0) {
        if (param0 != -1) {
            int discarded$0 = ((sna) this).b(54, -31);
        }
        return ((sna) this).b(2147483647, param0 + -37);
    }

    final void d(byte param0) {
        sna var4 = null;
        int var3 = BachelorFridge.field_y;
        if (param0 < 115) {
            sna.e((byte) -89);
        }
        if (((sna) this).field_z != null) {
            var4 = (sna) (Object) ((sna) this).field_z.a(6);
            while (var4 != null) {
                var4.field_q = true;
                var4.d((byte) 118);
                var4 = (sna) (Object) var4.field_z.c((byte) 116);
            }
        }
    }

    private final void a(boolean param0, boolean param1, int param2, boolean param3, int param4, int param5, int param6, boolean param7, int param8, boolean param9, boolean param10) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        kv[] var16 = null;
        kv var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        Object var23 = null;
        int var23_int = 0;
        sna var23_ref = null;
        int var24 = 0;
        int var25 = 0;
        String var26 = null;
        String var27 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var23 = null;
          var25 = BachelorFridge.field_y;
          ((sna) this).field_D = ((sna) this).field_kb + param5;
          ((sna) this).field_M = param2 + ((sna) this).field_rb;
          var12 = dg.field_f;
          var13 = dg.field_j;
          var14 = dg.field_h;
          if (param4 == -2147483648) {
            break L0;
          } else {
            ((sna) this).field_E = true;
            break L0;
          }
        }
        L1: {
          var15 = dg.field_k;
          dg.c(((sna) this).field_D, ((sna) this).field_M, ((sna) this).field_D - -((sna) this).field_sb, ((sna) this).field_p + ((sna) this).field_M);
          if (!((sna) this).field_q) {
            L2: {
              param0 = ((sna) this).field_T;
              if (((sna) this).field_ib == 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            param10 = stackIn_7_0 != 0;
            param3 = ((sna) this).field_t;
            break L1;
          } else {
            break L1;
          }
        }
        L3: {
          param9 = param9 & ((sna) this).field_u;
          var16 = ((sna) this).field_eb;
          var17 = ((sna) this).field_v;
          var18 = ((sna) this).field_gb;
          var19 = 0;
          var20 = 0;
          if (!param9) {
            L4: {
              if (null == ((sna) this).field_H) {
                break L4;
              } else {
                var17 = ((sna) this).field_H;
                break L4;
              }
            }
            L5: {
              if (null != ((sna) this).field_X) {
                var16 = ((sna) this).field_X;
                break L5;
              } else {
                break L5;
              }
            }
            if (0 > ((sna) this).field_o) {
              break L3;
            } else {
              var18 = ((sna) this).field_o;
              break L3;
            }
          } else {
            break L3;
          }
        }
        L6: {
          if (param0) {
            L7: {
              if (0 <= ((sna) this).field_ab) {
                var18 = ((sna) this).field_ab;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (null != ((sna) this).field_A) {
                var16 = ((sna) this).field_A;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (((sna) this).field_bb != -2147483648) {
                var20 = ((sna) this).field_bb;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (((sna) this).field_Q == -2147483648) {
                break L10;
              } else {
                var19 = ((sna) this).field_Q;
                break L10;
              }
            }
            if (((sna) this).field_U == null) {
              break L6;
            } else {
              var17 = ((sna) this).field_U;
              break L6;
            }
          } else {
            break L6;
          }
        }
        L11: {
          if (!param10) {
            break L11;
          } else {
            L12: {
              if (0 > ((sna) this).field_G) {
                break L12;
              } else {
                var18 = ((sna) this).field_G;
                break L12;
              }
            }
            L13: {
              if (((sna) this).field_db == null) {
                break L13;
              } else {
                var16 = ((sna) this).field_db;
                break L13;
              }
            }
            L14: {
              if (null == ((sna) this).field_y) {
                break L14;
              } else {
                var17 = ((sna) this).field_y;
                break L14;
              }
            }
            L15: {
              if (((sna) this).field_V != -2147483648) {
                var20 = ((sna) this).field_V;
                break L15;
              } else {
                break L15;
              }
            }
            if (-2147483648 == ((sna) this).field_lb) {
              break L11;
            } else {
              var19 = ((sna) this).field_lb;
              break L11;
            }
          }
        }
        L16: {
          if (!param3) {
            break L16;
          } else {
            L17: {
              if (((sna) this).field_r != -2147483648) {
                var19 = ((sna) this).field_r;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              if (((sna) this).field_ob == -2147483648) {
                break L18;
              } else {
                var20 = ((sna) this).field_ob;
                break L18;
              }
            }
            L19: {
              if (((sna) this).field_w < 0) {
                break L19;
              } else {
                var18 = ((sna) this).field_w;
                break L19;
              }
            }
            L20: {
              if (((sna) this).field_K != null) {
                var16 = ((sna) this).field_K;
                break L20;
              } else {
                break L20;
              }
            }
            if (((sna) this).field_J == null) {
              break L16;
            } else {
              var17 = ((sna) this).field_J;
              break L16;
            }
          }
        }
        L21: {
          var21 = ((sna) this).field_x - -var19;
          var22 = ((sna) this).field_O - -var20;
          if (!((sna) this).field_qb) {
            hp.a(((sna) this).field_sb, ((sna) this).field_D, (byte) -121, ((sna) this).field_p, var16, ((sna) this).field_M);
            break L21;
          } else {
            hp.a(param8, param5, (byte) -89, param6, var16, param2);
            break L21;
          }
        }
        L22: {
          if (var17 == null) {
            break L22;
          } else {
            L23: {
              var23_int = var21 + ((sna) this).field_D;
              if (1 != ((sna) this).field_N) {
                break L23;
              } else {
                var23_int = var23_int + (((sna) this).field_sb + -var17.field_n) / 2;
                break L23;
              }
            }
            L24: {
              var24 = ((sna) this).field_M - -var22;
              if (((sna) this).field_N != 2) {
                break L24;
              } else {
                var23_int = var23_int + (((sna) this).field_sb - var17.field_n);
                break L24;
              }
            }
            L25: {
              if (((sna) this).field_Y != 1) {
                break L25;
              } else {
                var24 = var24 + (-var17.field_o + ((sna) this).field_p) / 2;
                break L25;
              }
            }
            L26: {
              if (2 != ((sna) this).field_Y) {
                break L26;
              } else {
                var24 = var24 + (((sna) this).field_p - var17.field_o);
                break L26;
              }
            }
            if (((sna) this).field_F >= 256) {
              var17.e(var23_int, var24);
              break L22;
            } else {
              var17.a(var23_int, var24, ((sna) this).field_F);
              break L22;
            }
          }
        }
        L27: {
          if (null == ((sna) this).field_Z) {
            break L27;
          } else {
            if (null == ((sna) this).field_jb) {
              break L27;
            } else {
              L28: {
                var26 = ((sna) this).field_Z;
                var27 = var26;
                var27 = var26;
                if (!param7) {
                  break L28;
                } else {
                  if (((sna) this).field_pb != null) {
                    var27 = var26 + ((sna) this).field_pb;
                    break L28;
                  } else {
                    break L28;
                  }
                }
              }
              L29: {
                if (((sna) this).field_jb.a(var27) > -(2 * ((sna) this).field_L) + ((sna) this).field_sb) {
                  break L29;
                } else {
                  if (var27.indexOf("<br>") >= 0) {
                    break L29;
                  } else {
                    L30: {
                      if (1 == ((sna) this).field_Y) {
                        var22 = var22 + (-((sna) this).field_jb.field_B + ((sna) this).field_p + -((sna) this).field_jb.field_u) / 2;
                        break L30;
                      } else {
                        if (2 != ((sna) this).field_Y) {
                          break L30;
                        } else {
                          var22 = var22 + (((sna) this).field_p + (-((sna) this).field_jb.field_B + -((sna) this).field_jb.field_u));
                          break L30;
                        }
                      }
                    }
                    if (0 != ((sna) this).field_N) {
                      if (((sna) this).field_N != 1) {
                        if (((sna) this).field_N != 2) {
                          int discarded$2 = ((sna) this).field_jb.a(var27, ((sna) this).field_D + ((sna) this).field_L - -var21, ((sna) this).field_M - -var22, -(2 * ((sna) this).field_L) + ((sna) this).field_sb, ((sna) this).field_p, var18, -1, ((sna) this).field_cb, ((sna) this).field_N, ((sna) this).field_Y, ((sna) this).field_B);
                          break L27;
                        } else {
                          ((sna) this).field_jb.c(var27, ((sna) this).field_D - (-((sna) this).field_L - var21 + (-((sna) this).field_sb + ((sna) this).field_L * 2)), ((sna) this).field_jb.field_u + (((sna) this).field_M - -var22), var18, -1, ((sna) this).field_cb);
                          break L27;
                        }
                      } else {
                        ((sna) this).field_jb.a(var27, var21 + ((sna) this).field_D + ((sna) this).field_L + (((sna) this).field_sb - ((sna) this).field_L * 2) / 2, ((sna) this).field_jb.field_u + (((sna) this).field_M + var22), var18, -1, ((sna) this).field_cb);
                        break L27;
                      }
                    } else {
                      ((sna) this).field_jb.b(var27, var21 + ((sna) this).field_D + ((sna) this).field_L, var22 + ((sna) this).field_M + ((sna) this).field_jb.field_u, var18, -1, ((sna) this).field_cb);
                      break L27;
                    }
                  }
                }
              }
              int discarded$3 = ((sna) this).field_jb.a(var27, var21 + (((sna) this).field_L + ((sna) this).field_D), var22 + ((sna) this).field_M, ((sna) this).field_sb - 2 * ((sna) this).field_L, ((sna) this).field_p, var18, -1, ((sna) this).field_cb, ((sna) this).field_N, ((sna) this).field_Y, ((sna) this).field_B);
              break L27;
            }
          }
        }
        L31: {
          if (null == ((sna) this).field_z) {
            break L31;
          } else {
            var23_ref = (sna) (Object) ((sna) this).field_z.b((byte) 90);
            L32: while (true) {
              if (var23_ref == null) {
                break L31;
              } else {
                var23_ref.a(param0, var23_ref.field_tb, var20 + var23_ref.field_M, param3, -2147483648, var23_ref.field_D + var19, var23_ref.field_p, param7, var23_ref.field_sb, param9, param10);
                var23_ref = (sna) (Object) var23_ref.field_z.c(0);
                continue L32;
              }
            }
          }
        }
        dg.a(var12, var13, var14, var15);
    }

    final int b(int param0, int param1) {
        int var5_int = 0;
        sna var5 = null;
        int var6 = 0;
        int var7 = BachelorFridge.field_y;
        int var4 = -17 / ((65 - param1) / 59);
        int var3 = 0;
        if (((sna) this).field_Z != null) {
            if (((sna) this).field_jb != null) {
                var5_int = ((sna) this).field_jb.c(((sna) this).field_Z, param0);
                if (var5_int > var3) {
                    var3 = var5_int;
                }
            }
        }
        if (!(((sna) this).field_v == null)) {
            var5_int = ((sna) this).field_v.field_n;
            if (var3 < var5_int) {
                var3 = var5_int;
            }
        }
        if (!(((sna) this).field_z == null)) {
            var5 = (sna) (Object) ((sna) this).field_z.b((byte) 90);
            while (var5 != null) {
                var6 = var5.field_sb + var5.field_kb;
                if (var3 < var6) {
                    var3 = var6;
                }
                var5 = (sna) (Object) ((sna) this).field_z.c(0);
            }
        }
        return var3;
    }

    private final void a(boolean param0, int param1, boolean param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        int var14 = 0;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        Object stackOut_23_0 = null;
        Object stackOut_24_0 = null;
        Object stackOut_25_0 = null;
        Object stackOut_26_0 = null;
        Object stackOut_27_0 = null;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_33_0 = null;
        Object stackOut_34_0 = null;
        Object stackOut_35_0 = null;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        L0: {
          var13 = null;
          var14 = BachelorFridge.field_y;
          if (((sna) this).field_mb > 0) {
            var7 = -(-((sna) this).field_mb >> 2);
            break L0;
          } else {
            var7 = ((sna) this).field_mb >> 2;
            break L0;
          }
        }
        L1: {
          ((sna) this).field_mb = ((sna) this).field_mb - var7;
          ((sna) this).field_kb = ((sna) this).field_kb + var7;
          if (((sna) this).field_I <= 0) {
            var7 = ((sna) this).field_I >> 2;
            break L1;
          } else {
            var7 = -(-((sna) this).field_I >> 2);
            break L1;
          }
        }
        L2: {
          ((sna) this).field_rb = ((sna) this).field_rb + var7;
          ((sna) this).field_I = ((sna) this).field_I - var7;
          if (((sna) this).field_W > 0) {
            var7 = -(-((sna) this).field_W >> 2);
            break L2;
          } else {
            var7 = ((sna) this).field_W >> 2;
            break L2;
          }
        }
        L3: {
          ((sna) this).field_W = ((sna) this).field_W - var7;
          ((sna) this).field_sb = ((sna) this).field_sb + var7;
          if (((sna) this).field_hb <= 0) {
            var7 = ((sna) this).field_hb >> 2;
            break L3;
          } else {
            var7 = -(-((sna) this).field_hb >> 2);
            break L3;
          }
        }
        L4: {
          L5: {
            ((sna) this).field_D = ((sna) this).field_kb + param1;
            ((sna) this).field_M = ((sna) this).field_rb + param5;
            param0 = param0 & ((sna) this).field_u;
            ((sna) this).field_hb = ((sna) this).field_hb - var7;
            ((sna) this).field_p = ((sna) this).field_p + var7;
            var8 = dg.field_f;
            var9 = dg.field_j;
            var10 = dg.field_h;
            var11 = dg.field_k;
            dg.c(((sna) this).field_D, ((sna) this).field_M, ((sna) this).field_sb + ((sna) this).field_D, ((sna) this).field_M - -((sna) this).field_p);
            var12 = 0;
            if (mu.field_k) {
              break L5;
            } else {
              if (!param0) {
                break L5;
              } else {
                if (lf.field_c == 0) {
                  break L5;
                } else {
                  if (dg.field_f > nfa.field_a) {
                    break L5;
                  } else {
                    if (dg.field_h <= nfa.field_a) {
                      break L5;
                    } else {
                      if (jc.field_r < dg.field_j) {
                        break L5;
                      } else {
                        if (jc.field_r < dg.field_k) {
                          var12 = 1;
                          ((sna) this).field_ib = lf.field_c;
                          ((sna) this).field_R = lf.field_c;
                          ((sna) this).field_S = -((sna) this).field_M + jc.field_r;
                          ((sna) this).field_nb = nfa.field_a - ((sna) this).field_D;
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
          }
          ((sna) this).field_R = 0;
          if (lf.field_c == 0) {
            break L4;
          } else {
            ((sna) this).field_ib = 0;
            break L4;
          }
        }
        L6: {
          L7: {
            stackOut_23_0 = this;
            stackIn_29_0 = stackOut_23_0;
            stackIn_24_0 = stackOut_23_0;
            if (on.field_x) {
              break L7;
            } else {
              stackOut_24_0 = this;
              stackIn_29_0 = stackOut_24_0;
              stackIn_25_0 = stackOut_24_0;
              if (dg.field_f > mk.field_p) {
                break L7;
              } else {
                stackOut_25_0 = this;
                stackIn_29_0 = stackOut_25_0;
                stackIn_26_0 = stackOut_25_0;
                if (dg.field_h <= mk.field_p) {
                  break L7;
                } else {
                  stackOut_26_0 = this;
                  stackIn_29_0 = stackOut_26_0;
                  stackIn_27_0 = stackOut_26_0;
                  if (dg.field_j > gd.field_m) {
                    break L7;
                  } else {
                    stackOut_27_0 = this;
                    stackIn_29_0 = stackOut_27_0;
                    stackIn_28_0 = stackOut_27_0;
                    if (gd.field_m >= dg.field_k) {
                      break L7;
                    } else {
                      stackOut_28_0 = this;
                      stackOut_28_1 = 1;
                      stackIn_30_0 = stackOut_28_0;
                      stackIn_30_1 = stackOut_28_1;
                      break L6;
                    }
                  }
                }
              }
            }
          }
          stackOut_29_0 = this;
          stackOut_29_1 = 0;
          stackIn_30_0 = stackOut_29_0;
          stackIn_30_1 = stackOut_29_1;
          break L6;
        }
        L8: {
          ((sna) this).field_E = stackIn_30_1 != 0;
          if (fia.field_t == 0) {
            ((sna) this).field_ib = 0;
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          L10: {
            stackOut_33_0 = this;
            stackIn_37_0 = stackOut_33_0;
            stackIn_34_0 = stackOut_33_0;
            if (!((sna) this).field_E) {
              break L10;
            } else {
              stackOut_34_0 = this;
              stackIn_37_0 = stackOut_34_0;
              stackIn_35_0 = stackOut_34_0;
              if (((sna) this).field_ib != fia.field_t) {
                break L10;
              } else {
                stackOut_35_0 = this;
                stackIn_37_0 = stackOut_35_0;
                stackIn_36_0 = stackOut_35_0;
                if (!param0) {
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
          ((sna) this).field_T = stackIn_38_1 != 0;
          if (null != ((sna) this).field_z) {
            var13 = (Object) (Object) (sna) (Object) ((sna) this).field_z.a(6);
            L12: while (true) {
              if (var13 == null) {
                break L11;
              } else {
                ((sna) var13).a(param0, ((sna) var13).field_D, false, ((sna) var13).field_sb, ((sna) var13).field_p, ((sna) var13).field_M);
                var13 = (Object) (Object) (sna) (Object) ((sna) var13).field_z.c((byte) 116);
                continue L12;
              }
            }
          } else {
            break L11;
          }
        }
        L13: {
          if (var12 == 0) {
            break L13;
          } else {
            mu.field_k = true;
            break L13;
          }
        }
        L14: {
          if (((sna) var13).field_E) {
            on.field_x = true;
            break L14;
          } else {
            break L14;
          }
        }
        L15: {
          dg.a(var8, var9, var10, var11);
          if (((sna) var13).field_ib == 0) {
            break L15;
          } else {
            if (!((sna) var13).field_ub) {
              break L15;
            } else {
              L16: {
                ((sna) this).field_rb = -param5 + (-((sna) var13).field_S + gd.field_m);
                ((sna) this).field_kb = -param1 + mk.field_p - ((sna) var13).field_nb;
                if (((sna) var13).field_kb >= 0) {
                  break L16;
                } else {
                  ((sna) this).field_kb = 0;
                  break L16;
                }
              }
              L17: {
                if (0 > ((sna) var13).field_rb) {
                  ((sna) this).field_rb = 0;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (param3 + -((sna) var13).field_sb >= ((sna) var13).field_kb) {
                  break L18;
                } else {
                  ((sna) this).field_kb = param3 + -((sna) var13).field_sb;
                  break L18;
                }
              }
              L19: {
                ((sna) this).field_mb = 0;
                ((sna) this).field_I = 0;
                ((sna) this).field_D = ((sna) var13).field_kb + param1;
                if (param4 - ((sna) var13).field_p >= ((sna) var13).field_rb) {
                  break L19;
                } else {
                  ((sna) this).field_rb = -((sna) var13).field_p + param4;
                  break L19;
                }
              }
              ((sna) this).field_M = ((sna) var13).field_rb + param5;
              break L15;
            }
          }
        }
    }

    public sna() {
        ((sna) this).field_lb = -2147483648;
        ((sna) this).field_G = -1;
        ((sna) this).field_ab = -1;
        ((sna) this).field_bb = -2147483648;
        ((sna) this).field_V = -2147483648;
        ((sna) this).field_o = -1;
        ((sna) this).field_ob = -2147483648;
        ((sna) this).field_P = false;
        ((sna) this).field_Q = -2147483648;
        ((sna) this).field_cb = 256;
        ((sna) this).field_u = true;
        ((sna) this).field_tb = false;
        ((sna) this).field_w = -1;
        ((sna) this).field_r = -2147483648;
        ((sna) this).field_F = 256;
    }

    sna(long param0, sna param1, int param2, int param3, int param4, int param5, String param6) {
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
        ((sna) this).field_lb = -2147483648;
        ((sna) this).field_G = -1;
        ((sna) this).field_ab = -1;
        ((sna) this).field_bb = -2147483648;
        ((sna) this).field_V = -2147483648;
        ((sna) this).field_o = -1;
        ((sna) this).field_ob = -2147483648;
        ((sna) this).field_P = false;
        ((sna) this).field_Q = -2147483648;
        ((sna) this).field_cb = 256;
        ((sna) this).field_u = true;
        ((sna) this).field_tb = false;
        ((sna) this).field_w = -1;
        ((sna) this).field_r = -2147483648;
        ((sna) this).field_F = 256;
        try {
          L0: {
            L1: {
              ((sna) this).field_sb = param4;
              ((sna) this).field_rb = param3;
              ((sna) this).field_kb = param2;
              ((sna) this).field_p = param5;
              ((sna) this).field_c = param0;
              ((sna) this).a(param1, 56);
              if (param6 == null) {
                break L1;
              } else {
                ((sna) this).field_Z = param6;
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
            stackOut_4_1 = new StringBuilder().append("sna.<init>(").append(param0).append(44);
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
          throw pe.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = false;
        field_C = "<%0> must play 1 more rated game before playing with the current options.";
    }
}
