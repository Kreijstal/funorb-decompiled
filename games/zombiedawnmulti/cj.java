/*
 * Decompiled by CFR-JS 0.4.0.
 */
class cj extends qo {
    ja field_O;
    int field_Y;
    private int field_hb;
    int field_U;
    static String[] field_C;
    static String field_Eb;
    int field_V;
    private int field_y;
    boolean field_Z;
    private boolean field_bb;
    boolean field_fb;
    int field_N;
    private int field_E;
    int field_x;
    int field_qb;
    ja field_rb;
    boolean field_ib;
    int field_J;
    int field_z;
    int field_Q;
    int field_lb;
    boolean field_pb;
    int field_zb;
    static int[] field_F;
    private int field_A;
    int field_Db;
    String field_wb;
    ja[] field_gb;
    int field_mb;
    fm field_yb;
    static String field_B;
    static String field_db;
    ja[] field_ab;
    ja[] field_Bb;
    ja field_nb;
    private int field_v;
    int field_M;
    static volatile boolean field_ub;
    int field_H;
    private int field_G;
    int field_R;
    int field_P;
    int field_jb;
    String field_vb;
    ja field_cb;
    int field_w;
    int field_ob;
    int field_sb;
    int field_T;
    private int field_D;
    private boolean field_kb;
    private boolean field_W;
    ja[] field_S;
    ja[] field_X;
    ja field_K;
    boolean field_L;
    private int field_tb;
    boolean field_Ab;
    th field_Cb;
    int field_eb;
    int field_I;
    int field_xb;

    final void a(byte param0, cj param1) {
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
              if (null == ((cj) this).field_Cb) {
                ((cj) this).field_Cb = new th();
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((cj) this).field_Cb.a((br) (Object) param1, false);
              if (param0 == 50) {
                break L2;
              } else {
                ((cj) this).field_y = 24;
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
            stackOut_6_1 = new StringBuilder().append("cj.H(").append(param0).append(44);
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
          throw fa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final void c(boolean param0, int param1) {
        if (param1 != -1) {
          return;
        } else {
          this.a(oo.field_b, true, oo.field_l, false, false, false, param0, false, 0, param1 ^ -80, 0);
          return;
        }
    }

    final void a(int param0, boolean param1) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 != -11838) {
          return;
        } else {
          L0: {
            if (param1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          L1: {
            me.field_g = stackIn_4_0 != 0;
            if (param1) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
          }
          bp.field_q = stackIn_7_0 != 0;
          this.a(-100, true, oo.field_l, 0, 0, oo.field_b);
          return;
        }
    }

    final void a(byte param0, int param1, int param2, boolean param3) {
        int var9 = 0;
        cj var10_ref_cj = null;
        int var11 = ZombieDawnMulti.field_E ? 1 : 0;
        int var5 = -((cj) this).field_Q;
        if (param0 <= 35) {
            ((cj) this).f(-65);
        }
        int var6 = -((cj) this).field_mb + var5;
        int var7 = ((cj) this).field_z;
        int var8 = var7 + ((cj) this).field_I;
        if (!(param3)) {
            var9 = 0;
            var10_ref_cj = (cj) (Object) ((cj) this).field_Cb.c(84);
            while (var10_ref_cj != null) {
                var10_ref_cj.field_mb = var9 + -var10_ref_cj.field_Q;
                var9 = var9 + (param2 + (var10_ref_cj.field_z + var10_ref_cj.field_I));
                var10_ref_cj = (cj) (Object) ((cj) this).field_Cb.b(6);
            }
            var8 = -param2 + var9;
        }
        var9 = -param1 + var8;
        if (!(var9 >= var6)) {
            var6 = var9;
        }
        if (!(var6 >= 0)) {
            var6 = 0;
        }
        int var10 = var7 + -param1;
        if (var5 > var10) {
            var5 = var10;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        ((cj) this).field_I = var8 + -var7;
        ((cj) this).field_z = var7;
        ((cj) this).field_mb = var5 - var6;
        ((cj) this).field_Q = -var5;
    }

    final void b(byte param0, cj param1) {
        RuntimeException var3 = null;
        Object stackIn_89_0 = null;
        Object stackIn_90_0 = null;
        Object stackIn_91_0 = null;
        Object stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_103_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_88_0 = null;
        Object stackOut_89_0 = null;
        Object stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        Object stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -32) {
                break L1;
              } else {
                ((cj) this).f(-125);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param1 == null) {
                  break L3;
                } else {
                  L4: {
                    if (null == param1.field_O) {
                      break L4;
                    } else {
                      ((cj) this).field_O = param1.field_O;
                      break L4;
                    }
                  }
                  L5: {
                    if (param1.field_M != 0) {
                      ((cj) this).field_M = param1.field_M;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (param1.field_X == null) {
                      break L6;
                    } else {
                      ((cj) this).field_X = param1.field_X;
                      break L6;
                    }
                  }
                  L7: {
                    if (null == param1.field_vb) {
                      break L7;
                    } else {
                      ((cj) this).field_vb = param1.field_vb;
                      break L7;
                    }
                  }
                  L8: {
                    if (param1.field_ib) {
                      ((cj) this).field_ib = param1.field_ib;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (param1.field_V != 0) {
                      ((cj) this).field_V = param1.field_V;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (param1.field_H >= 0) {
                      ((cj) this).field_H = param1.field_H;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (param1.field_Z) {
                      break L11;
                    } else {
                      ((cj) this).field_Z = param1.field_Z;
                      break L11;
                    }
                  }
                  L12: {
                    if (0 <= param1.field_xb) {
                      ((cj) this).field_xb = param1.field_xb;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (null == param1.field_cb) {
                      break L13;
                    } else {
                      ((cj) this).field_cb = param1.field_cb;
                      break L13;
                    }
                  }
                  L14: {
                    if (param1.field_Y == 256) {
                      break L14;
                    } else {
                      ((cj) this).field_Y = param1.field_Y;
                      break L14;
                    }
                  }
                  L15: {
                    if (null == param1.field_Bb) {
                      break L15;
                    } else {
                      ((cj) this).field_Bb = param1.field_Bb;
                      break L15;
                    }
                  }
                  L16: {
                    if (param1.field_S != null) {
                      ((cj) this).field_S = param1.field_S;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (param1.field_rb == null) {
                      break L17;
                    } else {
                      ((cj) this).field_rb = param1.field_rb;
                      break L17;
                    }
                  }
                  L18: {
                    if (!param1.field_Ab) {
                      break L18;
                    } else {
                      ((cj) this).field_Ab = param1.field_Ab;
                      break L18;
                    }
                  }
                  L19: {
                    if (param1.field_ob < 0) {
                      break L19;
                    } else {
                      ((cj) this).field_ob = param1.field_ob;
                      break L19;
                    }
                  }
                  L20: {
                    if (0 > param1.field_Db) {
                      break L20;
                    } else {
                      ((cj) this).field_Db = param1.field_Db;
                      break L20;
                    }
                  }
                  L21: {
                    if (param1.field_W) {
                      ((cj) this).field_W = param1.field_W;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (null == param1.field_yb) {
                      break L22;
                    } else {
                      ((cj) this).field_yb = param1.field_yb;
                      break L22;
                    }
                  }
                  L23: {
                    if (param1.field_J != 0) {
                      ((cj) this).field_J = param1.field_J;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if (param1.field_ab != null) {
                      ((cj) this).field_ab = param1.field_ab;
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (!param1.field_kb) {
                      break L25;
                    } else {
                      ((cj) this).field_kb = param1.field_kb;
                      break L25;
                    }
                  }
                  L26: {
                    if (null != param1.field_nb) {
                      ((cj) this).field_nb = param1.field_nb;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if (param1.field_wb != null) {
                      ((cj) this).field_wb = param1.field_wb;
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  L28: {
                    if (param1.field_gb != null) {
                      ((cj) this).field_gb = param1.field_gb;
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  L29: {
                    if (null != param1.field_K) {
                      ((cj) this).field_K = param1.field_K;
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  L30: {
                    if (param1.field_N == -2147483648) {
                      break L30;
                    } else {
                      ((cj) this).field_N = param1.field_N;
                      break L30;
                    }
                  }
                  L31: {
                    if (param1.field_E != -2147483648) {
                      ((cj) this).field_E = param1.field_E;
                      break L31;
                    } else {
                      break L31;
                    }
                  }
                  L32: {
                    if (param1.field_P == -2147483648) {
                      break L32;
                    } else {
                      ((cj) this).field_P = param1.field_P;
                      break L32;
                    }
                  }
                  L33: {
                    if (param1.field_D == 0) {
                      break L33;
                    } else {
                      ((cj) this).field_D = param1.field_D;
                      break L33;
                    }
                  }
                  L34: {
                    if (param1.field_sb != -2147483648) {
                      ((cj) this).field_sb = param1.field_sb;
                      break L34;
                    } else {
                      break L34;
                    }
                  }
                  L35: {
                    if (0 != param1.field_R) {
                      ((cj) this).field_R = param1.field_R;
                      break L35;
                    } else {
                      break L35;
                    }
                  }
                  L36: {
                    if (param1.field_tb != -2147483648) {
                      ((cj) this).field_tb = param1.field_tb;
                      break L36;
                    } else {
                      break L36;
                    }
                  }
                  L37: {
                    if (0 == param1.field_v) {
                      break L37;
                    } else {
                      ((cj) this).field_v = param1.field_v;
                      break L37;
                    }
                  }
                  L38: {
                    L39: {
                      stackOut_88_0 = this;
                      stackIn_91_0 = stackOut_88_0;
                      stackIn_89_0 = stackOut_88_0;
                      if (!((cj) this).field_kb) {
                        break L39;
                      } else {
                        stackOut_89_0 = this;
                        stackIn_91_0 = stackOut_89_0;
                        stackIn_90_0 = stackOut_89_0;
                        if (!param1.field_bb) {
                          break L39;
                        } else {
                          stackOut_90_0 = this;
                          stackOut_90_1 = 1;
                          stackIn_92_0 = stackOut_90_0;
                          stackIn_92_1 = stackOut_90_1;
                          break L38;
                        }
                      }
                    }
                    stackOut_91_0 = this;
                    stackOut_91_1 = 0;
                    stackIn_92_0 = stackOut_91_0;
                    stackIn_92_1 = stackOut_91_1;
                    break L38;
                  }
                  L40: {
                    ((cj) this).field_bb = stackIn_92_1 != 0;
                    if (!param1.field_fb) {
                      break L40;
                    } else {
                      ((cj) this).field_fb = param1.field_fb;
                      break L40;
                    }
                  }
                  L41: {
                    if (param1.field_lb == 0) {
                      break L41;
                    } else {
                      ((cj) this).field_lb = param1.field_lb;
                      break L41;
                    }
                  }
                  if (param1.field_eb != -2147483648) {
                    ((cj) this).field_eb = param1.field_eb;
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L42: {
            var3 = decompiledCaughtException;
            stackOut_100_0 = (RuntimeException) var3;
            stackOut_100_1 = new StringBuilder().append("cj.T(").append(param0).append(44);
            stackIn_102_0 = stackOut_100_0;
            stackIn_102_1 = stackOut_100_1;
            stackIn_101_0 = stackOut_100_0;
            stackIn_101_1 = stackOut_100_1;
            if (param1 == null) {
              stackOut_102_0 = (RuntimeException) (Object) stackIn_102_0;
              stackOut_102_1 = (StringBuilder) (Object) stackIn_102_1;
              stackOut_102_2 = "null";
              stackIn_103_0 = stackOut_102_0;
              stackIn_103_1 = stackOut_102_1;
              stackIn_103_2 = stackOut_102_2;
              break L42;
            } else {
              stackOut_101_0 = (RuntimeException) (Object) stackIn_101_0;
              stackOut_101_1 = (StringBuilder) (Object) stackIn_101_1;
              stackOut_101_2 = "{...}";
              stackIn_103_0 = stackOut_101_0;
              stackIn_103_1 = stackOut_101_1;
              stackIn_103_2 = stackOut_101_2;
              break L42;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_103_0, stackIn_103_2 + 41);
        }
    }

    final void a(int param0, cj param1, int param2, cj param3) {
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
              if (param3 != null) {
                param1.field_Q = param0 + param3.field_z + param3.field_Q;
                param1.field_mb = param3.field_I + param3.field_mb;
                break L1;
              } else {
                param1.field_mb = 0;
                param1.field_Q = 0;
                break L1;
              }
            }
            L2: {
              if (param2 == 1300) {
                break L2;
              } else {
                ((cj) this).a(56, true);
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
            stackOut_6_1 = new StringBuilder().append("cj.O(").append(param0).append(44);
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
          throw fa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    private final void a(int param0, boolean param1, int param2, boolean param3, boolean param4, boolean param5, boolean param6, boolean param7, int param8, int param9, int param10) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        ja[] var16 = null;
        ja var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        Object var23 = null;
        int var23_int = 0;
        cj var23_ref = null;
        int var24 = 0;
        int var25 = 0;
        String var26 = null;
        String var27 = null;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var23 = null;
          var25 = ZombieDawnMulti.field_E ? 1 : 0;
          ((cj) this).field_w = ((cj) this).field_x + param10;
          ((cj) this).field_qb = ((cj) this).field_Q + param8;
          var12 = oo.field_f;
          var13 = oo.field_e;
          var14 = oo.field_g;
          var15 = oo.field_d;
          if (param9 >= 73) {
            break L0;
          } else {
            this.a(73, true, 27, false, true, false, false, false, -51, 107, 60);
            break L0;
          }
        }
        L1: {
          oo.e(((cj) this).field_w, ((cj) this).field_qb, ((cj) this).field_zb + ((cj) this).field_w, ((cj) this).field_qb + ((cj) this).field_z);
          if (((cj) this).field_W) {
            break L1;
          } else {
            L2: {
              param5 = ((cj) this).field_Ab;
              param7 = ((cj) this).field_L;
              if (((cj) this).field_jb == 0) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            param4 = stackIn_6_0 != 0;
            break L1;
          }
        }
        L3: {
          param1 = param1 & ((cj) this).field_Z;
          var16 = ((cj) this).field_ab;
          var17 = ((cj) this).field_rb;
          var18 = ((cj) this).field_M;
          var19 = 0;
          var20 = 0;
          if (!param1) {
            L4: {
              if (null == ((cj) this).field_cb) {
                break L4;
              } else {
                var17 = ((cj) this).field_cb;
                break L4;
              }
            }
            L5: {
              if (((cj) this).field_H >= 0) {
                var18 = ((cj) this).field_H;
                break L5;
              } else {
                break L5;
              }
            }
            if (null == ((cj) this).field_Bb) {
              break L3;
            } else {
              var16 = ((cj) this).field_Bb;
              break L3;
            }
          } else {
            break L3;
          }
        }
        L6: {
          if (!param7) {
            break L6;
          } else {
            L7: {
              if (((cj) this).field_X == null) {
                break L7;
              } else {
                var16 = ((cj) this).field_X;
                break L7;
              }
            }
            L8: {
              if (null != ((cj) this).field_K) {
                var17 = ((cj) this).field_K;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (-2147483648 != ((cj) this).field_E) {
                var20 = ((cj) this).field_E;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (((cj) this).field_ob >= 0) {
                var18 = ((cj) this).field_ob;
                break L10;
              } else {
                break L10;
              }
            }
            if (((cj) this).field_tb != -2147483648) {
              var19 = ((cj) this).field_tb;
              break L6;
            } else {
              break L6;
            }
          }
        }
        L11: {
          if (param4) {
            L12: {
              if (((cj) this).field_N != -2147483648) {
                var20 = ((cj) this).field_N;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (((cj) this).field_xb >= 0) {
                var18 = ((cj) this).field_xb;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (((cj) this).field_sb == -2147483648) {
                break L14;
              } else {
                var19 = ((cj) this).field_sb;
                break L14;
              }
            }
            L15: {
              if (null != ((cj) this).field_nb) {
                var17 = ((cj) this).field_nb;
                break L15;
              } else {
                break L15;
              }
            }
            if (null != ((cj) this).field_S) {
              var16 = ((cj) this).field_S;
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
              if (null != ((cj) this).field_gb) {
                var16 = ((cj) this).field_gb;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              if (((cj) this).field_P == -2147483648) {
                break L18;
              } else {
                var20 = ((cj) this).field_P;
                break L18;
              }
            }
            L19: {
              if (((cj) this).field_Db >= 0) {
                var18 = ((cj) this).field_Db;
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              if (null != ((cj) this).field_O) {
                var17 = ((cj) this).field_O;
                break L20;
              } else {
                break L20;
              }
            }
            if (((cj) this).field_eb != -2147483648) {
              var19 = ((cj) this).field_eb;
              break L16;
            } else {
              break L16;
            }
          } else {
            break L16;
          }
        }
        L21: {
          var21 = var19 + ((cj) this).field_D;
          var22 = var20 + ((cj) this).field_v;
          if (!((cj) this).field_ib) {
            s.a(((cj) this).field_qb, 0, var16, ((cj) this).field_w, ((cj) this).field_z, ((cj) this).field_zb);
            break L21;
          } else {
            s.a(param8, 0, var16, param10, param2, param0);
            break L21;
          }
        }
        L22: {
          if (var17 == null) {
            break L22;
          } else {
            L23: {
              var23_int = var21 + ((cj) this).field_w;
              var24 = ((cj) this).field_qb + var22;
              if (((cj) this).field_R == 1) {
                var23_int = var23_int + (((cj) this).field_zb + -var17.field_z) / 2;
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              if (1 != ((cj) this).field_lb) {
                break L24;
              } else {
                var24 = var24 + (((cj) this).field_z - var17.field_u) / 2;
                break L24;
              }
            }
            L25: {
              if (((cj) this).field_R != 2) {
                break L25;
              } else {
                var23_int = var23_int + (((cj) this).field_zb + -var17.field_z);
                break L25;
              }
            }
            L26: {
              if (2 != ((cj) this).field_lb) {
                break L26;
              } else {
                var24 = var24 + (((cj) this).field_z - var17.field_u);
                break L26;
              }
            }
            if (256 > ((cj) this).field_hb) {
              var17.c(var23_int, var24, ((cj) this).field_hb);
              break L22;
            } else {
              var17.g(var23_int, var24);
              break L22;
            }
          }
        }
        L27: {
          if (((cj) this).field_wb == null) {
            break L27;
          } else {
            if (((cj) this).field_yb != null) {
              L28: {
                var26 = ((cj) this).field_wb;
                var27 = var26;
                var27 = var26;
                if (!param6) {
                  break L28;
                } else {
                  if (null == ((cj) this).field_vb) {
                    break L28;
                  } else {
                    var27 = var26 + ((cj) this).field_vb;
                    break L28;
                  }
                }
              }
              L29: {
                if (((cj) this).field_yb.a(var27) > -(2 * ((cj) this).field_V) + ((cj) this).field_zb) {
                  break L29;
                } else {
                  if (var27.indexOf("<br>") < 0) {
                    L30: {
                      if (((cj) this).field_lb != 1) {
                        if (((cj) this).field_lb == 2) {
                          var22 = var22 + (-((cj) this).field_yb.field_r + (((cj) this).field_z - ((cj) this).field_yb.field_C));
                          break L30;
                        } else {
                          break L30;
                        }
                      } else {
                        var22 = var22 + (-((cj) this).field_yb.field_r + (((cj) this).field_z + -((cj) this).field_yb.field_C)) / 2;
                        break L30;
                      }
                    }
                    if (((cj) this).field_R == 0) {
                      ((cj) this).field_yb.b(var27, var21 + (((cj) this).field_w + ((cj) this).field_V), ((cj) this).field_qb + (var22 + ((cj) this).field_yb.field_C), var18, -1, ((cj) this).field_Y);
                      break L27;
                    } else {
                      if (1 == ((cj) this).field_R) {
                        ((cj) this).field_yb.a(var27, (((cj) this).field_zb + -(2 * ((cj) this).field_V)) / 2 + (((cj) this).field_V + (((cj) this).field_w + var21)), ((cj) this).field_yb.field_C + (((cj) this).field_qb + var22), var18, -1, ((cj) this).field_Y);
                        break L27;
                      } else {
                        if (((cj) this).field_R != 2) {
                          int discarded$2 = ((cj) this).field_yb.a(var27, var21 + ((cj) this).field_V + ((cj) this).field_w, ((cj) this).field_qb - -var22, ((cj) this).field_zb - 2 * ((cj) this).field_V, ((cj) this).field_z, var18, -1, ((cj) this).field_Y, ((cj) this).field_R, ((cj) this).field_lb, ((cj) this).field_J);
                          break L27;
                        } else {
                          ((cj) this).field_yb.c(var27, -(((cj) this).field_V * 2) + (((cj) this).field_zb + ((cj) this).field_V + (((cj) this).field_w + var21)), ((cj) this).field_yb.field_C + (((cj) this).field_qb - -var22), var18, -1, ((cj) this).field_Y);
                          break L27;
                        }
                      }
                    }
                  } else {
                    break L29;
                  }
                }
              }
              int discarded$3 = ((cj) this).field_yb.a(var27, ((cj) this).field_w + (((cj) this).field_V + var21), var22 + ((cj) this).field_qb, ((cj) this).field_zb + -(((cj) this).field_V * 2), ((cj) this).field_z, var18, -1, ((cj) this).field_Y, ((cj) this).field_R, ((cj) this).field_lb, ((cj) this).field_J);
              break L27;
            } else {
              break L27;
            }
          }
        }
        L31: {
          if (null == ((cj) this).field_Cb) {
            break L31;
          } else {
            var23_ref = (cj) (Object) ((cj) this).field_Cb.c(39);
            L32: while (true) {
              if (var23_ref == null) {
                break L31;
              } else {
                var23_ref.a(var23_ref.field_zb, param1, var23_ref.field_z, var23_ref.field_bb, param4, param5, param6, param7, var20 + var23_ref.field_qb, 80, var19 + var23_ref.field_w);
                var23_ref = (cj) (Object) var23_ref.field_Cb.b(6);
                continue L32;
              }
            }
          }
        }
        oo.h(var12, var13, var14, var15);
    }

    public static void c(boolean param0) {
        field_C = null;
        field_db = null;
        field_Eb = null;
        field_B = null;
        field_F = null;
    }

    cj(long param0, cj param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    cj(long param0, cj param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ((cj) this).field_Q = param1;
        ((cj) this).field_mb = 0;
        ((cj) this).field_I = 0;
        ((cj) this).field_zb = param2;
        if (param4 != -3344) {
          return;
        } else {
          ((cj) this).field_x = param3;
          ((cj) this).field_z = param0;
          ((cj) this).field_A = 0;
          ((cj) this).field_y = 0;
          return;
        }
    }

    final void f(int param0) {
        cj var4 = null;
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 > -127) {
            ((cj) this).field_z = -78;
        }
        if (null != ((cj) this).field_Cb) {
            var4 = (cj) (Object) ((cj) this).field_Cb.a((byte) -81);
            while (var4 != null) {
                var4.field_W = true;
                var4.f(-128);
                var4 = (cj) (Object) var4.field_Cb.c((byte) 123);
            }
        }
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
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        Object stackOut_27_0 = null;
        Object stackOut_28_0 = null;
        Object stackOut_29_0 = null;
        Object stackOut_30_0 = null;
        Object stackOut_31_0 = null;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        Object stackOut_34_0 = null;
        Object stackOut_35_0 = null;
        Object stackOut_36_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        L0: {
          var13 = null;
          var14 = ZombieDawnMulti.field_E ? 1 : 0;
          if (((cj) this).field_A <= 0) {
            var7 = ((cj) this).field_A >> 2;
            break L0;
          } else {
            var7 = -(-((cj) this).field_A >> 2);
            break L0;
          }
        }
        L1: {
          ((cj) this).field_x = ((cj) this).field_x + var7;
          ((cj) this).field_A = ((cj) this).field_A - var7;
          if (((cj) this).field_mb <= 0) {
            var7 = ((cj) this).field_mb >> 2;
            break L1;
          } else {
            var7 = -(-((cj) this).field_mb >> 2);
            break L1;
          }
        }
        L2: {
          ((cj) this).field_Q = ((cj) this).field_Q + var7;
          ((cj) this).field_mb = ((cj) this).field_mb - var7;
          if (((cj) this).field_y > 0) {
            var7 = -(-((cj) this).field_y >> 2);
            break L2;
          } else {
            var7 = ((cj) this).field_y >> 2;
            break L2;
          }
        }
        L3: {
          ((cj) this).field_zb = ((cj) this).field_zb + var7;
          ((cj) this).field_y = ((cj) this).field_y - var7;
          if (((cj) this).field_I > 0) {
            var7 = -(-((cj) this).field_I >> 2);
            break L3;
          } else {
            var7 = ((cj) this).field_I >> 2;
            break L3;
          }
        }
        L4: {
          L5: {
            ((cj) this).field_w = param3 - -((cj) this).field_x;
            ((cj) this).field_qb = param4 + ((cj) this).field_Q;
            ((cj) this).field_z = ((cj) this).field_z + var7;
            param1 = param1 & ((cj) this).field_Z;
            ((cj) this).field_I = ((cj) this).field_I - var7;
            var8 = oo.field_f;
            var9 = oo.field_e;
            var10 = oo.field_g;
            var11 = oo.field_d;
            oo.e(((cj) this).field_w, ((cj) this).field_qb, ((cj) this).field_zb + ((cj) this).field_w, ((cj) this).field_z + ((cj) this).field_qb);
            var12 = 0;
            if (bp.field_q) {
              break L5;
            } else {
              if (!param1) {
                break L5;
              } else {
                if (kd.field_b == 0) {
                  break L5;
                } else {
                  if (oo.field_f > vb.field_f) {
                    break L5;
                  } else {
                    if (vb.field_f >= oo.field_g) {
                      break L5;
                    } else {
                      if (ka.field_t < oo.field_e) {
                        break L5;
                      } else {
                        if (ka.field_t >= oo.field_d) {
                          break L5;
                        } else {
                          ((cj) this).field_T = kd.field_b;
                          ((cj) this).field_G = -((cj) this).field_qb + ka.field_t;
                          ((cj) this).field_jb = kd.field_b;
                          var12 = 1;
                          ((cj) this).field_U = vb.field_f - ((cj) this).field_w;
                          break L4;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          L6: {
            if (kd.field_b != 0) {
              ((cj) this).field_jb = 0;
              break L6;
            } else {
              break L6;
            }
          }
          ((cj) this).field_T = 0;
          break L4;
        }
        L7: {
          if (pq.field_f == 0) {
            ((cj) this).field_jb = 0;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          L9: {
            stackOut_27_0 = this;
            stackIn_33_0 = stackOut_27_0;
            stackIn_28_0 = stackOut_27_0;
            if (me.field_g) {
              break L9;
            } else {
              stackOut_28_0 = this;
              stackIn_33_0 = stackOut_28_0;
              stackIn_29_0 = stackOut_28_0;
              if (oo.field_f > bd.field_g) {
                break L9;
              } else {
                stackOut_29_0 = this;
                stackIn_33_0 = stackOut_29_0;
                stackIn_30_0 = stackOut_29_0;
                if (bd.field_g >= oo.field_g) {
                  break L9;
                } else {
                  stackOut_30_0 = this;
                  stackIn_33_0 = stackOut_30_0;
                  stackIn_31_0 = stackOut_30_0;
                  if (oo.field_e > bo.field_d) {
                    break L9;
                  } else {
                    stackOut_31_0 = this;
                    stackIn_33_0 = stackOut_31_0;
                    stackIn_32_0 = stackOut_31_0;
                    if (oo.field_d <= bo.field_d) {
                      break L9;
                    } else {
                      stackOut_32_0 = this;
                      stackOut_32_1 = 1;
                      stackIn_34_0 = stackOut_32_0;
                      stackIn_34_1 = stackOut_32_1;
                      break L8;
                    }
                  }
                }
              }
            }
          }
          stackOut_33_0 = this;
          stackOut_33_1 = 0;
          stackIn_34_0 = stackOut_33_0;
          stackIn_34_1 = stackOut_33_1;
          break L8;
        }
        L10: {
          L11: {
            ((cj) this).field_pb = stackIn_34_1 != 0;
            stackOut_34_0 = this;
            stackIn_38_0 = stackOut_34_0;
            stackIn_35_0 = stackOut_34_0;
            if (!((cj) this).field_pb) {
              break L11;
            } else {
              stackOut_35_0 = this;
              stackIn_38_0 = stackOut_35_0;
              stackIn_36_0 = stackOut_35_0;
              if (((cj) this).field_jb != pq.field_f) {
                break L11;
              } else {
                stackOut_36_0 = this;
                stackIn_38_0 = stackOut_36_0;
                stackIn_37_0 = stackOut_36_0;
                if (!param1) {
                  break L11;
                } else {
                  stackOut_37_0 = this;
                  stackOut_37_1 = 1;
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_39_1 = stackOut_37_1;
                  break L10;
                }
              }
            }
          }
          stackOut_38_0 = this;
          stackOut_38_1 = 0;
          stackIn_39_0 = stackOut_38_0;
          stackIn_39_1 = stackOut_38_1;
          break L10;
        }
        L12: {
          ((cj) this).field_L = stackIn_39_1 != 0;
          if (((cj) this).field_Cb != null) {
            var13 = (Object) (Object) (cj) (Object) ((cj) this).field_Cb.a((byte) -44);
            L13: while (true) {
              if (var13 == null) {
                break L12;
              } else {
                ((cj) var13).a(-120, param1, ((cj) var13).field_z, ((cj) var13).field_w, ((cj) var13).field_qb, ((cj) var13).field_zb);
                var13 = (Object) (Object) (cj) (Object) ((cj) var13).field_Cb.c((byte) 109);
                continue L13;
              }
            }
          } else {
            break L12;
          }
        }
        L14: {
          if (((cj) var13).field_pb) {
            me.field_g = true;
            break L14;
          } else {
            break L14;
          }
        }
        L15: {
          if (param0 <= -6) {
            break L15;
          } else {
            ((cj) this).field_wb = null;
            break L15;
          }
        }
        L16: {
          if (var12 == 0) {
            break L16;
          } else {
            bp.field_q = true;
            break L16;
          }
        }
        L17: {
          oo.h(var8, var9, var10, var11);
          if (0 == ((cj) var13).field_jb) {
            break L17;
          } else {
            if (((cj) var13).field_fb) {
              L18: {
                ((cj) this).field_x = -param3 + -((cj) var13).field_U + bd.field_g;
                ((cj) this).field_Q = -((cj) var13).field_G + (bo.field_d + -param4);
                if (((cj) var13).field_x < 0) {
                  ((cj) this).field_x = 0;
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (param5 - ((cj) var13).field_zb >= ((cj) var13).field_x) {
                  break L19;
                } else {
                  ((cj) this).field_x = param5 + -((cj) var13).field_zb;
                  break L19;
                }
              }
              L20: {
                if (((cj) var13).field_Q >= 0) {
                  break L20;
                } else {
                  ((cj) this).field_Q = 0;
                  break L20;
                }
              }
              L21: {
                if (-((cj) var13).field_z + param2 < ((cj) var13).field_Q) {
                  ((cj) this).field_Q = -((cj) var13).field_z + param2;
                  break L21;
                } else {
                  break L21;
                }
              }
              ((cj) this).field_A = 0;
              ((cj) this).field_w = param3 - -((cj) var13).field_x;
              ((cj) this).field_mb = 0;
              ((cj) this).field_qb = param4 + ((cj) var13).field_Q;
              break L17;
            } else {
              break L17;
            }
          }
        }
    }

    final static void d(boolean param0, int param1) {
        if (!df.field_H) {
            return;
        }
        fk.a(hl.field_d[param1], true);
        if (param0) {
            return;
        }
        td.field_b = null;
    }

    final static String g(int param0) {
        if (2 <= fn.field_i) {
          if (null != cp.field_P) {
            if (!cp.field_P.a((byte) -122)) {
              return ud.field_Y;
            } else {
              return nh.field_n;
            }
          } else {
            if (!ra.field_l.a((byte) -110)) {
              return bc.field_a;
            } else {
              if (ra.field_l.a(false, "commonui")) {
                if (fe.field_L.a((byte) -123)) {
                  if (fe.field_L.a(false, "commonui")) {
                    if (!wm.field_V.a((byte) -117)) {
                      return pd.field_a;
                    } else {
                      if (!wm.field_V.a(param0 ^ param0)) {
                        return s.field_h + " - " + wm.field_V.b(param0 + -18006) + "%";
                      } else {
                        return op.field_l;
                      }
                    }
                  } else {
                    return bc.field_b + " - " + fe.field_L.a(0, "commonui") + "%";
                  }
                } else {
                  return sm.field_b;
                }
              } else {
                return ei.field_e + " - " + ra.field_l.a(0, "commonui") + "%";
              }
            }
          }
        } else {
          return lo.field_f;
        }
    }

    final static int a(ka param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = wj.field_g;
              if (param0.field_l == 2) {
                if (!param0.field_k) {
                  L2: {
                    if (0 != param0.field_i) {
                      break L2;
                    } else {
                      if (param0.field_o == 0) {
                        var2_int = pq.field_m[param0.field_l];
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var2_int = wp.field_c[param0.field_l];
                  break L1;
                } else {
                  var2_int = wj.field_g;
                  break L1;
                }
              } else {
                if (param0.field_l == 4) {
                  var2_int = wp.field_c[param0.field_l];
                  break L1;
                } else {
                  if (ie.field_sb != param0.field_a) {
                    var2_int = wp.field_c[param0.field_l];
                    break L1;
                  } else {
                    var2_int = pq.field_m[param0.field_l];
                    break L1;
                  }
                }
              }
            }
            stackOut_14_0 = var2_int;
            stackIn_15_0 = stackOut_14_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var2;
            stackOut_16_1 = new StringBuilder().append("cj.S(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + -63 + 41);
        }
        return stackIn_15_0;
    }

    final int e(int param0) {
        if (param0 != 0) {
            ((cj) this).field_U = 72;
        }
        return ((cj) this).a(param0 + -1, 2147483647);
    }

    final int a(int param0, int param1) {
        int var4_int = 0;
        cj var4 = null;
        int var5 = 0;
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        int var3 = 0;
        if (((cj) this).field_wb != null) {
            if (((cj) this).field_yb != null) {
                var4_int = ((cj) this).field_yb.c(((cj) this).field_wb, param1);
                if (var3 < var4_int) {
                    var3 = var4_int;
                }
            }
        }
        if (((cj) this).field_rb != null) {
            var4_int = ((cj) this).field_rb.field_z;
            if (!(var3 >= var4_int)) {
                var3 = var4_int;
            }
        }
        if (((cj) this).field_Cb != null) {
            var4 = (cj) (Object) ((cj) this).field_Cb.c(param0 + 112);
            while (var4 != null) {
                var5 = var4.field_zb + var4.field_x;
                if (!(var3 >= var5)) {
                    var3 = var5;
                }
                var4 = (cj) (Object) ((cj) this).field_Cb.b(6);
            }
        }
        if (param0 != -1) {
            Object var7 = null;
            ((cj) this).a(-56, (cj) null, 17, (cj) null);
        }
        return var3;
    }

    public cj() {
        ((cj) this).field_hb = 256;
        ((cj) this).field_bb = false;
        ((cj) this).field_N = -2147483648;
        ((cj) this).field_Db = -1;
        ((cj) this).field_H = -1;
        ((cj) this).field_sb = -2147483648;
        ((cj) this).field_kb = false;
        ((cj) this).field_Y = 256;
        ((cj) this).field_E = -2147483648;
        ((cj) this).field_P = -2147483648;
        ((cj) this).field_Z = true;
        ((cj) this).field_tb = -2147483648;
        ((cj) this).field_eb = -2147483648;
        ((cj) this).field_ob = -1;
        ((cj) this).field_xb = -1;
    }

    cj(long param0, cj param1, int param2, int param3, int param4, int param5, String param6) {
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
        ((cj) this).field_hb = 256;
        ((cj) this).field_bb = false;
        ((cj) this).field_N = -2147483648;
        ((cj) this).field_Db = -1;
        ((cj) this).field_H = -1;
        ((cj) this).field_sb = -2147483648;
        ((cj) this).field_kb = false;
        ((cj) this).field_Y = 256;
        ((cj) this).field_E = -2147483648;
        ((cj) this).field_P = -2147483648;
        ((cj) this).field_Z = true;
        ((cj) this).field_tb = -2147483648;
        ((cj) this).field_eb = -2147483648;
        ((cj) this).field_ob = -1;
        ((cj) this).field_xb = -1;
        try {
          L0: {
            L1: {
              ((cj) this).field_zb = param4;
              ((cj) this).field_e = param0;
              ((cj) this).field_z = param5;
              ((cj) this).field_Q = param3;
              ((cj) this).field_x = param2;
              ((cj) this).b((byte) -32, param1);
              if (param6 == null) {
                break L1;
              } else {
                ((cj) this).field_wb = param6;
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
            stackOut_4_1 = new StringBuilder().append("cj.<init>(").append(param0).append(44);
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
          throw fa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Eb = "Connection lost. <%0>";
        field_C = new String[]{"All scores", "My scores", "Best each"};
        field_F = new int[8192];
        field_B = "Hammer";
        field_db = "Use on one of your zombies to make it travel faster than its stench.";
        field_ub = true;
    }
}
