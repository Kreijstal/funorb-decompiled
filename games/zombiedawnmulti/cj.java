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
              if (null == this.field_Cb) {
                this.field_Cb = new th();
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_Cb.a(param1, false);
              if (param0 == 50) {
                break L2;
              } else {
                this.field_y = 24;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("cj.H(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final void c(boolean param0, int param1) {
        if (param1 != -1) {
            return;
        }
        this.a(oo.field_b, true, oo.field_l, false, false, false, param0, false, 0, param1 ^ -80, 0);
    }

    final void a(int param0, boolean param1) {
        if (param0 != -11838) {
            return;
        }
        me.field_g = !param1 ? true : false;
        bp.field_q = !param1 ? true : false;
        this.a(-100, true, oo.field_l, 0, 0, oo.field_b);
    }

    final void a(byte param0, int param1, int param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        cj var10_ref_cj = null;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = ZombieDawnMulti.field_E ? 1 : 0;
          var5 = -this.field_Q;
          if (param0 > 35) {
            break L0;
          } else {
            this.f(-65);
            break L0;
          }
        }
        L1: {
          L2: {
            var6 = -this.field_mb + var5;
            var7 = this.field_z;
            var8 = var7 + this.field_I;
            if (!param3) {
              var9 = 0;
              var10_ref_cj = (cj) ((Object) this.field_Cb.c(84));
              L3: while (true) {
                L4: {
                  if (var10_ref_cj == null) {
                    break L4;
                  } else {
                    var10_ref_cj.field_mb = var9 + -var10_ref_cj.field_Q;
                    var9 = var9 + (param2 + (var10_ref_cj.field_z + var10_ref_cj.field_I));
                    var10_ref_cj = (cj) ((Object) this.field_Cb.b(6));
                    if (var11 != 0) {
                      break L1;
                    } else {
                      if (var11 == 0) {
                        continue L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var8 = -param2 + var9;
                break L2;
              }
            } else {
              break L2;
            }
          }
          var9 = -param1 + var8;
          break L1;
        }
        L5: {
          if ((var9 ^ -1) > (var6 ^ -1)) {
            var6 = var9;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (var6 < 0) {
            var6 = 0;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          var10 = var7 + -param1;
          if (var5 <= var10) {
            break L7;
          } else {
            var5 = var10;
            break L7;
          }
        }
        L8: {
          if ((var5 ^ -1) <= -1) {
            break L8;
          } else {
            var5 = 0;
            break L8;
          }
        }
        this.field_I = var8 + -var7;
        this.field_z = var7;
        this.field_mb = var5 - var6;
        this.field_Q = -var5;
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
                this.f(-125);
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
                      this.field_O = param1.field_O;
                      break L4;
                    }
                  }
                  L5: {
                    if (-1 != (param1.field_M ^ -1)) {
                      this.field_M = param1.field_M;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (param1.field_X == null) {
                      break L6;
                    } else {
                      this.field_X = param1.field_X;
                      break L6;
                    }
                  }
                  L7: {
                    if (null == param1.field_vb) {
                      break L7;
                    } else {
                      this.field_vb = param1.field_vb;
                      break L7;
                    }
                  }
                  L8: {
                    if (param1.field_ib) {
                      this.field_ib = param1.field_ib;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (-1 != (param1.field_V ^ -1)) {
                      this.field_V = param1.field_V;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if ((param1.field_H ^ -1) <= -1) {
                      this.field_H = param1.field_H;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (param1.field_Z) {
                      break L11;
                    } else {
                      this.field_Z = param1.field_Z;
                      break L11;
                    }
                  }
                  L12: {
                    if (0 <= param1.field_xb) {
                      this.field_xb = param1.field_xb;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (null == param1.field_cb) {
                      break L13;
                    } else {
                      this.field_cb = param1.field_cb;
                      break L13;
                    }
                  }
                  L14: {
                    if (param1.field_Y == 256) {
                      break L14;
                    } else {
                      this.field_Y = param1.field_Y;
                      break L14;
                    }
                  }
                  L15: {
                    if (null == param1.field_Bb) {
                      break L15;
                    } else {
                      this.field_Bb = param1.field_Bb;
                      break L15;
                    }
                  }
                  L16: {
                    if (param1.field_S != null) {
                      this.field_S = param1.field_S;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (param1.field_rb == null) {
                      break L17;
                    } else {
                      this.field_rb = param1.field_rb;
                      break L17;
                    }
                  }
                  L18: {
                    if (!param1.field_Ab) {
                      break L18;
                    } else {
                      this.field_Ab = param1.field_Ab;
                      break L18;
                    }
                  }
                  L19: {
                    if (param1.field_ob < 0) {
                      break L19;
                    } else {
                      this.field_ob = param1.field_ob;
                      break L19;
                    }
                  }
                  L20: {
                    if (0 > param1.field_Db) {
                      break L20;
                    } else {
                      this.field_Db = param1.field_Db;
                      break L20;
                    }
                  }
                  L21: {
                    if (param1.field_W) {
                      this.field_W = param1.field_W;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (null == param1.field_yb) {
                      break L22;
                    } else {
                      this.field_yb = param1.field_yb;
                      break L22;
                    }
                  }
                  L23: {
                    if (-1 != (param1.field_J ^ -1)) {
                      this.field_J = param1.field_J;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if (param1.field_ab != null) {
                      this.field_ab = param1.field_ab;
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (!param1.field_kb) {
                      break L25;
                    } else {
                      this.field_kb = param1.field_kb;
                      break L25;
                    }
                  }
                  L26: {
                    if (null != param1.field_nb) {
                      this.field_nb = param1.field_nb;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if (param1.field_wb != null) {
                      this.field_wb = param1.field_wb;
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  L28: {
                    if (param1.field_gb != null) {
                      this.field_gb = param1.field_gb;
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  L29: {
                    if (null != param1.field_K) {
                      this.field_K = param1.field_K;
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  L30: {
                    if ((param1.field_N ^ -1) == 2147483647) {
                      break L30;
                    } else {
                      this.field_N = param1.field_N;
                      break L30;
                    }
                  }
                  L31: {
                    if (2147483647 != (param1.field_E ^ -1)) {
                      this.field_E = param1.field_E;
                      break L31;
                    } else {
                      break L31;
                    }
                  }
                  L32: {
                    if (param1.field_P == -2147483648) {
                      break L32;
                    } else {
                      this.field_P = param1.field_P;
                      break L32;
                    }
                  }
                  L33: {
                    if (param1.field_D == 0) {
                      break L33;
                    } else {
                      this.field_D = param1.field_D;
                      break L33;
                    }
                  }
                  L34: {
                    if (param1.field_sb != -2147483648) {
                      this.field_sb = param1.field_sb;
                      break L34;
                    } else {
                      break L34;
                    }
                  }
                  L35: {
                    if (0 != param1.field_R) {
                      this.field_R = param1.field_R;
                      break L35;
                    } else {
                      break L35;
                    }
                  }
                  L36: {
                    if ((param1.field_tb ^ -1) != 2147483647) {
                      this.field_tb = param1.field_tb;
                      break L36;
                    } else {
                      break L36;
                    }
                  }
                  L37: {
                    if (0 == param1.field_v) {
                      break L37;
                    } else {
                      this.field_v = param1.field_v;
                      break L37;
                    }
                  }
                  L38: {
                    L39: {
                      stackOut_88_0 = this;
                      stackIn_91_0 = stackOut_88_0;
                      stackIn_89_0 = stackOut_88_0;
                      if (!this.field_kb) {
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
                    ((cj) (this)).field_bb = stackIn_92_1 != 0;
                    if (!param1.field_fb) {
                      break L40;
                    } else {
                      this.field_fb = param1.field_fb;
                      break L40;
                    }
                  }
                  L41: {
                    if (param1.field_lb == 0) {
                      break L41;
                    } else {
                      this.field_lb = param1.field_lb;
                      break L41;
                    }
                  }
                  if ((param1.field_eb ^ -1) != 2147483647) {
                    this.field_eb = param1.field_eb;
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
            stackOut_100_0 = (RuntimeException) (var3);
            stackOut_100_1 = new StringBuilder().append("cj.T(").append(param0).append(',');
            stackIn_102_0 = stackOut_100_0;
            stackIn_102_1 = stackOut_100_1;
            stackIn_101_0 = stackOut_100_0;
            stackIn_101_1 = stackOut_100_1;
            if (param1 == null) {
              stackOut_102_0 = (RuntimeException) ((Object) stackIn_102_0);
              stackOut_102_1 = (StringBuilder) ((Object) stackIn_102_1);
              stackOut_102_2 = "null";
              stackIn_103_0 = stackOut_102_0;
              stackIn_103_1 = stackOut_102_1;
              stackIn_103_2 = stackOut_102_2;
              break L42;
            } else {
              stackOut_101_0 = (RuntimeException) ((Object) stackIn_101_0);
              stackOut_101_1 = (StringBuilder) ((Object) stackIn_101_1);
              stackOut_101_2 = "{...}";
              stackIn_103_0 = stackOut_101_0;
              stackIn_103_1 = stackOut_101_1;
              stackIn_103_2 = stackOut_101_2;
              break L42;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_103_0), stackIn_103_2 + ')');
        }
    }

    final void a(int param0, cj param1, int param2, cj param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (param3 != null) {
                  break L2;
                } else {
                  param1.field_mb = 0;
                  param1.field_Q = 0;
                  if (!ZombieDawnMulti.field_E) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              param1.field_Q = param0 + param3.field_z + param3.field_Q;
              param1.field_mb = param3.field_I + param3.field_mb;
              break L1;
            }
            L3: {
              if (param2 == 1300) {
                break L3;
              } else {
                this.a(56, true);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("cj.O(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          L5: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    private final void a(int param0, boolean param1, int param2, boolean param3, boolean param4, boolean param5, boolean param6, boolean param7, int param8, int param9, int param10) {
        int discarded$2 = 0;
        int discarded$3 = 0;
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
        int var23_int = 0;
        cj var23 = null;
        String var23_ref = null;
        int var24 = 0;
        int var25 = 0;
        String var26 = null;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var25 = ZombieDawnMulti.field_E ? 1 : 0;
          this.field_w = this.field_x + param10;
          this.field_qb = this.field_Q + param8;
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
          oo.e(this.field_w, this.field_qb, this.field_zb + this.field_w, this.field_qb + this.field_z);
          if (this.field_W) {
            break L1;
          } else {
            L2: {
              param5 = this.field_Ab;
              param7 = this.field_L;
              if (-1 == (this.field_jb ^ -1)) {
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
          param1 = param1 & this.field_Z;
          var16 = this.field_ab;
          var17 = this.field_rb;
          var18 = this.field_M;
          var19 = 0;
          var20 = 0;
          if (!param1) {
            L4: {
              if (null == this.field_cb) {
                break L4;
              } else {
                var17 = this.field_cb;
                break L4;
              }
            }
            L5: {
              if ((this.field_H ^ -1) <= -1) {
                var18 = this.field_H;
                break L5;
              } else {
                break L5;
              }
            }
            if (null == this.field_Bb) {
              break L3;
            } else {
              var16 = this.field_Bb;
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
              if (this.field_X == null) {
                break L7;
              } else {
                var16 = this.field_X;
                break L7;
              }
            }
            L8: {
              if (null != this.field_K) {
                var17 = this.field_K;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (-2147483648 != this.field_E) {
                var20 = this.field_E;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (-1 >= (this.field_ob ^ -1)) {
                var18 = this.field_ob;
                break L10;
              } else {
                break L10;
              }
            }
            if (2147483647 != (this.field_tb ^ -1)) {
              var19 = this.field_tb;
              break L6;
            } else {
              break L6;
            }
          }
        }
        L11: {
          if (param4) {
            L12: {
              if ((this.field_N ^ -1) != 2147483647) {
                var20 = this.field_N;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (-1 >= (this.field_xb ^ -1)) {
                var18 = this.field_xb;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if ((this.field_sb ^ -1) == 2147483647) {
                break L14;
              } else {
                var19 = this.field_sb;
                break L14;
              }
            }
            L15: {
              if (null != this.field_nb) {
                var17 = this.field_nb;
                break L15;
              } else {
                break L15;
              }
            }
            if (null != this.field_S) {
              var16 = this.field_S;
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
              if (null != this.field_gb) {
                var16 = this.field_gb;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              if ((this.field_P ^ -1) == 2147483647) {
                break L18;
              } else {
                var20 = this.field_P;
                break L18;
              }
            }
            L19: {
              if (-1 >= (this.field_Db ^ -1)) {
                var18 = this.field_Db;
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              if (null != this.field_O) {
                var17 = this.field_O;
                break L20;
              } else {
                break L20;
              }
            }
            if (2147483647 != (this.field_eb ^ -1)) {
              var19 = this.field_eb;
              break L16;
            } else {
              break L16;
            }
          } else {
            break L16;
          }
        }
        L21: {
          L22: {
            var21 = var19 + this.field_D;
            var22 = var20 + this.field_v;
            if (!this.field_ib) {
              break L22;
            } else {
              s.a(param8, 0, var16, param10, param2, param0);
              if (var25 == 0) {
                break L21;
              } else {
                break L22;
              }
            }
          }
          s.a(this.field_qb, 0, var16, this.field_w, this.field_z, this.field_zb);
          break L21;
        }
        L23: {
          if (var17 == null) {
            break L23;
          } else {
            L24: {
              var23_int = var21 + this.field_w;
              var24 = this.field_qb + var22;
              if (this.field_R == 1) {
                var23_int = var23_int + (this.field_zb + -var17.field_z) / 2;
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              if (1 != this.field_lb) {
                break L25;
              } else {
                var24 = var24 + (this.field_z - var17.field_u) / 2;
                break L25;
              }
            }
            L26: {
              if (-3 != (this.field_R ^ -1)) {
                break L26;
              } else {
                var23_int = var23_int + (this.field_zb + -var17.field_z);
                break L26;
              }
            }
            L27: {
              if (2 != this.field_lb) {
                break L27;
              } else {
                var24 = var24 + (this.field_z - var17.field_u);
                break L27;
              }
            }
            L28: {
              if (256 > this.field_hb) {
                break L28;
              } else {
                var17.g(var23_int, var24);
                if (var25 == 0) {
                  break L23;
                } else {
                  break L28;
                }
              }
            }
            var17.c(var23_int, var24, this.field_hb);
            break L23;
          }
        }
        L29: {
          if (this.field_wb == null) {
            break L29;
          } else {
            if (this.field_yb != null) {
              L30: {
                var26 = this.field_wb;
                var23_ref = var26;
                var23_ref = var26;
                var23_ref = var26;
                if (!param6) {
                  break L30;
                } else {
                  if (null == this.field_vb) {
                    break L30;
                  } else {
                    var23_ref = var26 + this.field_vb;
                    break L30;
                  }
                }
              }
              L31: {
                L32: {
                  if (this.field_yb.a(var23_ref) > -(2 * this.field_V) + this.field_zb) {
                    break L32;
                  } else {
                    if (var23_ref.indexOf("<br>") < 0) {
                      break L31;
                    } else {
                      break L32;
                    }
                  }
                }
                discarded$2 = this.field_yb.a(var23_ref, this.field_w + (this.field_V + var21), var22 + this.field_qb, this.field_zb + -(this.field_V * 2), this.field_z, var18, -1, this.field_Y, this.field_R, this.field_lb, this.field_J);
                if (var25 == 0) {
                  break L29;
                } else {
                  break L31;
                }
              }
              L33: {
                L34: {
                  if (-2 != (this.field_lb ^ -1)) {
                    break L34;
                  } else {
                    var22 = var22 + (-this.field_yb.field_r + (this.field_z + -this.field_yb.field_C)) / 2;
                    if (var25 == 0) {
                      break L33;
                    } else {
                      break L34;
                    }
                  }
                }
                if (this.field_lb == 2) {
                  var22 = var22 + (-this.field_yb.field_r + (this.field_z - this.field_yb.field_C));
                  break L33;
                } else {
                  break L33;
                }
              }
              L35: {
                if ((this.field_R ^ -1) == -1) {
                  break L35;
                } else {
                  L36: {
                    if (1 == this.field_R) {
                      break L36;
                    } else {
                      L37: {
                        if (-3 != (this.field_R ^ -1)) {
                          break L37;
                        } else {
                          this.field_yb.c(var23_ref, -(this.field_V * 2) + (this.field_zb + this.field_V + (this.field_w + var21)), this.field_yb.field_C + (this.field_qb - -var22), var18, -1, this.field_Y);
                          if (var25 == 0) {
                            break L29;
                          } else {
                            break L37;
                          }
                        }
                      }
                      discarded$3 = this.field_yb.a(var23_ref, var21 + this.field_V + this.field_w, this.field_qb - -var22, this.field_zb - 2 * this.field_V, this.field_z, var18, -1, this.field_Y, this.field_R, this.field_lb, this.field_J);
                      if (var25 == 0) {
                        break L29;
                      } else {
                        break L36;
                      }
                    }
                  }
                  this.field_yb.a(var23_ref, (this.field_zb + -(2 * this.field_V)) / 2 + (this.field_V + (this.field_w + var21)), this.field_yb.field_C + (this.field_qb + var22), var18, -1, this.field_Y);
                  if (var25 == 0) {
                    break L29;
                  } else {
                    break L35;
                  }
                }
              }
              this.field_yb.b(var23_ref, var21 + (this.field_w + this.field_V), this.field_qb + (var22 + this.field_yb.field_C), var18, -1, this.field_Y);
              break L29;
            } else {
              break L29;
            }
          }
        }
        L38: {
          L39: {
            if (null == this.field_Cb) {
              break L39;
            } else {
              var23 = (cj) ((Object) this.field_Cb.c(39));
              L40: while (true) {
                if (var23 == null) {
                  break L39;
                } else {
                  var23.a(this.field_zb, param1, this.field_z, this.field_bb, param4, param5, param6, param7, var20 + this.field_qb, 80, var19 + this.field_w);
                  var23 = (cj) ((Object) this.field_Cb.b(6));
                  if (var25 != 0) {
                    break L38;
                  } else {
                    if (var25 == 0) {
                      continue L40;
                    } else {
                      break L39;
                    }
                  }
                }
              }
            }
          }
          oo.h(var12, var13, var14, var15);
          break L38;
        }
    }

    public static void c(boolean param0) {
        String discarded$0 = null;
        field_C = null;
        field_db = null;
        if (param0) {
            discarded$0 = cj.g(-31);
        }
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
        this.field_Q = param1;
        this.field_mb = 0;
        this.field_I = 0;
        this.field_zb = param2;
        if (param4 != -3344) {
            return;
        }
        this.field_x = param3;
        this.field_z = param0;
        this.field_A = 0;
        this.field_y = 0;
    }

    final void f(int param0) {
        int var3 = 0;
        cj var4 = null;
        L0: {
          var3 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 <= -127) {
            break L0;
          } else {
            this.field_z = -78;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_Cb) {
              break L2;
            } else {
              var4 = (cj) ((Object) this.field_Cb.a((byte) -81));
              L3: while (true) {
                if (var4 == null) {
                  break L2;
                } else {
                  var4.field_W = true;
                  var4.f(-128);
                  var4 = (cj) ((Object) this.field_Cb.c((byte) 123));
                  if (var3 != 0) {
                    break L1;
                  } else {
                    if (var3 == 0) {
                      continue L3;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          break L1;
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        cj var13 = null;
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
          L1: {
            var14 = ZombieDawnMulti.field_E ? 1 : 0;
            if (-1 <= (this.field_A ^ -1)) {
              break L1;
            } else {
              var7 = -(-this.field_A >> 578906530);
              if (var14 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var7 = this.field_A >> 523450626;
          break L0;
        }
        L2: {
          L3: {
            this.field_x = this.field_x + var7;
            this.field_A = this.field_A - var7;
            if ((this.field_mb ^ -1) >= -1) {
              break L3;
            } else {
              var7 = -(-this.field_mb >> -2017272894);
              if (var14 == 0) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          var7 = this.field_mb >> -1254585278;
          break L2;
        }
        L4: {
          L5: {
            this.field_Q = this.field_Q + var7;
            this.field_mb = this.field_mb - var7;
            if ((this.field_y ^ -1) < -1) {
              break L5;
            } else {
              var7 = this.field_y >> -165831070;
              if (var14 == 0) {
                break L4;
              } else {
                break L5;
              }
            }
          }
          var7 = -(-this.field_y >> 1112352130);
          break L4;
        }
        L6: {
          L7: {
            this.field_zb = this.field_zb + var7;
            this.field_y = this.field_y - var7;
            if (this.field_I > 0) {
              break L7;
            } else {
              var7 = this.field_I >> -1985839646;
              if (var14 == 0) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          var7 = -(-this.field_I >> -1514803294);
          break L6;
        }
        L8: {
          L9: {
            this.field_w = param3 - -this.field_x;
            this.field_qb = param4 + this.field_Q;
            this.field_z = this.field_z + var7;
            param1 = param1 & this.field_Z;
            this.field_I = this.field_I - var7;
            var8 = oo.field_f;
            var9 = oo.field_e;
            var10 = oo.field_g;
            var11 = oo.field_d;
            oo.e(this.field_w, this.field_qb, this.field_zb + this.field_w, this.field_z + this.field_qb);
            var12 = 0;
            if (bp.field_q) {
              break L9;
            } else {
              if (!param1) {
                break L9;
              } else {
                if (-1 == (kd.field_b ^ -1)) {
                  break L9;
                } else {
                  if ((oo.field_f ^ -1) < (vb.field_f ^ -1)) {
                    break L9;
                  } else {
                    if ((vb.field_f ^ -1) <= (oo.field_g ^ -1)) {
                      break L9;
                    } else {
                      if (ka.field_t < oo.field_e) {
                        break L9;
                      } else {
                        if (ka.field_t >= oo.field_d) {
                          break L9;
                        } else {
                          this.field_T = kd.field_b;
                          this.field_G = -this.field_qb + ka.field_t;
                          this.field_jb = kd.field_b;
                          var12 = 1;
                          this.field_U = vb.field_f - this.field_w;
                          if (var14 == 0) {
                            break L8;
                          } else {
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
          L10: {
            if (-1 != (kd.field_b ^ -1)) {
              this.field_jb = 0;
              break L10;
            } else {
              break L10;
            }
          }
          this.field_T = 0;
          break L8;
        }
        L11: {
          if ((pq.field_f ^ -1) == -1) {
            this.field_jb = 0;
            break L11;
          } else {
            break L11;
          }
        }
        L12: {
          L13: {
            stackOut_27_0 = this;
            stackIn_33_0 = stackOut_27_0;
            stackIn_28_0 = stackOut_27_0;
            if (me.field_g) {
              break L13;
            } else {
              stackOut_28_0 = this;
              stackIn_33_0 = stackOut_28_0;
              stackIn_29_0 = stackOut_28_0;
              if (oo.field_f > bd.field_g) {
                break L13;
              } else {
                stackOut_29_0 = this;
                stackIn_33_0 = stackOut_29_0;
                stackIn_30_0 = stackOut_29_0;
                if (bd.field_g >= oo.field_g) {
                  break L13;
                } else {
                  stackOut_30_0 = this;
                  stackIn_33_0 = stackOut_30_0;
                  stackIn_31_0 = stackOut_30_0;
                  if (oo.field_e > bo.field_d) {
                    break L13;
                  } else {
                    stackOut_31_0 = this;
                    stackIn_33_0 = stackOut_31_0;
                    stackIn_32_0 = stackOut_31_0;
                    if (oo.field_d <= bo.field_d) {
                      break L13;
                    } else {
                      stackOut_32_0 = this;
                      stackOut_32_1 = 1;
                      stackIn_34_0 = stackOut_32_0;
                      stackIn_34_1 = stackOut_32_1;
                      break L12;
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
          break L12;
        }
        L14: {
          L15: {
            ((cj) (this)).field_pb = stackIn_34_1 != 0;
            stackOut_34_0 = this;
            stackIn_38_0 = stackOut_34_0;
            stackIn_35_0 = stackOut_34_0;
            if (!this.field_pb) {
              break L15;
            } else {
              stackOut_35_0 = this;
              stackIn_38_0 = stackOut_35_0;
              stackIn_36_0 = stackOut_35_0;
              if (this.field_jb != pq.field_f) {
                break L15;
              } else {
                stackOut_36_0 = this;
                stackIn_38_0 = stackOut_36_0;
                stackIn_37_0 = stackOut_36_0;
                if (!param1) {
                  break L15;
                } else {
                  stackOut_37_0 = this;
                  stackOut_37_1 = 1;
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_39_1 = stackOut_37_1;
                  break L14;
                }
              }
            }
          }
          stackOut_38_0 = this;
          stackOut_38_1 = 0;
          stackIn_39_0 = stackOut_38_0;
          stackIn_39_1 = stackOut_38_1;
          break L14;
        }
        L16: {
          L17: {
            L18: {
              ((cj) (this)).field_L = stackIn_39_1 != 0;
              if (this.field_Cb != null) {
                var13 = (cj) ((Object) this.field_Cb.a((byte) -44));
                L19: while (true) {
                  if (var13 == null) {
                    break L18;
                  } else {
                    var13.a(-120, param1, this.field_z, this.field_w, this.field_qb, this.field_zb);
                    var13 = (cj) ((Object) this.field_Cb.c((byte) 109));
                    if (var14 != 0) {
                      break L17;
                    } else {
                      if (var14 == 0) {
                        continue L19;
                      } else {
                        break L18;
                      }
                    }
                  }
                }
              } else {
                break L18;
              }
            }
            if (this.field_pb) {
              break L17;
            } else {
              break L16;
            }
          }
          me.field_g = true;
          break L16;
        }
        L20: {
          if (param0 <= -6) {
            break L20;
          } else {
            this.field_wb = (String) null;
            break L20;
          }
        }
        L21: {
          if (var12 == 0) {
            break L21;
          } else {
            bp.field_q = true;
            break L21;
          }
        }
        L22: {
          oo.h(var8, var9, var10, var11);
          if (0 == this.field_jb) {
            break L22;
          } else {
            if (this.field_fb) {
              L23: {
                this.field_x = -param3 + -this.field_U + bd.field_g;
                this.field_Q = -this.field_G + (bo.field_d + -param4);
                if ((this.field_x ^ -1) > -1) {
                  this.field_x = 0;
                  break L23;
                } else {
                  break L23;
                }
              }
              L24: {
                if ((param5 - this.field_zb ^ -1) <= (this.field_x ^ -1)) {
                  break L24;
                } else {
                  this.field_x = param5 + -this.field_zb;
                  break L24;
                }
              }
              L25: {
                if ((this.field_Q ^ -1) <= -1) {
                  break L25;
                } else {
                  this.field_Q = 0;
                  break L25;
                }
              }
              L26: {
                if (-this.field_z + param2 < this.field_Q) {
                  this.field_Q = -this.field_z + param2;
                  break L26;
                } else {
                  break L26;
                }
              }
              this.field_A = 0;
              this.field_w = param3 - -this.field_x;
              this.field_mb = 0;
              this.field_qb = param4 + this.field_Q;
              break L22;
            } else {
              break L22;
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
        if (2 > fn.field_i) {
            return lo.field_f;
        }
        if (!(null == cp.field_P)) {
            if (!cp.field_P.a((byte) -122)) {
                return ud.field_Y;
            }
            return nh.field_n;
        }
        if (!(ra.field_l.a((byte) -110))) {
            return bc.field_a;
        }
        if (!ra.field_l.a(false, "commonui")) {
            return ei.field_e + " - " + ra.field_l.a(0, "commonui") + "%";
        }
        if (!fe.field_L.a((byte) -123)) {
            return sm.field_b;
        }
        if (!fe.field_L.a(false, "commonui")) {
            return bc.field_b + " - " + fe.field_L.a(0, "commonui") + "%";
        }
        if (!(wm.field_V.a((byte) -117))) {
            return pd.field_a;
        }
        if (!wm.field_V.a(param0 ^ param0)) {
            return s.field_h + " - " + wm.field_V.b(param0 + -18006) + "%";
        }
        return op.field_l;
    }

    final static int a(ka param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = wj.field_g;
              if (param1 < -45) {
                break L1;
              } else {
                cj.c(false);
                break L1;
              }
            }
            L2: {
              L3: {
                if ((param0.field_l ^ -1) == -3) {
                  break L3;
                } else {
                  L4: {
                    if ((param0.field_l ^ -1) == -5) {
                      break L4;
                    } else {
                      L5: {
                        if (ie.field_sb != param0.field_a) {
                          break L5;
                        } else {
                          var2_int = pq.field_m[param0.field_l];
                          if (var3 == 0) {
                            break L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var2_int = wp.field_c[param0.field_l];
                      if (var3 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var2_int = wp.field_c[param0.field_l];
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L6: {
                if (!param0.field_k) {
                  break L6;
                } else {
                  var2_int = wj.field_g;
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                L8: {
                  if (0 != param0.field_i) {
                    break L8;
                  } else {
                    if ((param0.field_o ^ -1) == -1) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                var2_int = wp.field_c[param0.field_l];
                if (var3 == 0) {
                  break L2;
                } else {
                  break L7;
                }
              }
              var2_int = pq.field_m[param0.field_l];
              break L2;
            }
            stackOut_16_0 = var2_int;
            stackIn_17_0 = stackOut_16_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var2);
            stackOut_18_1 = new StringBuilder().append("cj.S(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L9;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L9;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        return stackIn_17_0;
    }

    final int e(int param0) {
        if (param0 != 0) {
            this.field_U = 72;
        }
        return this.a(param0 + -1, 2147483647);
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4_int = 0;
        cj var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        L0: {
          var6 = ZombieDawnMulti.field_E ? 1 : 0;
          var3 = 0;
          if (this.field_wb == null) {
            break L0;
          } else {
            if (this.field_yb == null) {
              break L0;
            } else {
              var4_int = this.field_yb.c(this.field_wb, param1);
              if ((var3 ^ -1) <= (var4_int ^ -1)) {
                break L0;
              } else {
                var3 = var4_int;
                break L0;
              }
            }
          }
        }
        L1: {
          if (this.field_rb == null) {
            break L1;
          } else {
            var4_int = this.field_rb.field_z;
            if ((var3 ^ -1) > (var4_int ^ -1)) {
              var3 = var4_int;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          L3: {
            if (this.field_Cb == null) {
              break L3;
            } else {
              var4 = (cj) ((Object) this.field_Cb.c(param0 + 112));
              L4: while (true) {
                if (var4 == null) {
                  break L3;
                } else {
                  var5 = var4.field_zb + var4.field_x;
                  stackOut_11_0 = var3;
                  stackOut_11_1 = var5;
                  stackIn_17_0 = stackOut_11_0;
                  stackIn_17_1 = stackOut_11_1;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  if (var6 != 0) {
                    break L2;
                  } else {
                    L5: {
                      if (stackIn_12_0 < stackIn_12_1) {
                        var3 = var5;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var4 = (cj) ((Object) this.field_Cb.b(6));
                    if (var6 == 0) {
                      continue L4;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
          }
          stackOut_16_0 = param0;
          stackOut_16_1 = -1;
          stackIn_17_0 = stackOut_16_0;
          stackIn_17_1 = stackOut_16_1;
          break L2;
        }
        L6: {
          if (stackIn_17_0 == stackIn_17_1) {
            break L6;
          } else {
            this.a(-56, (cj) null, 17, (cj) null);
            break L6;
          }
        }
        return var3;
    }

    public cj() {
        this.field_hb = 256;
        this.field_bb = false;
        this.field_N = -2147483648;
        this.field_Db = -1;
        this.field_H = -1;
        this.field_sb = -2147483648;
        this.field_kb = false;
        this.field_Y = 256;
        this.field_E = -2147483648;
        this.field_P = -2147483648;
        this.field_Z = true;
        this.field_tb = -2147483648;
        this.field_eb = -2147483648;
        this.field_ob = -1;
        this.field_xb = -1;
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
        this.field_hb = 256;
        this.field_bb = false;
        this.field_N = -2147483648;
        this.field_Db = -1;
        this.field_H = -1;
        this.field_sb = -2147483648;
        this.field_kb = false;
        this.field_Y = 256;
        this.field_E = -2147483648;
        this.field_P = -2147483648;
        this.field_Z = true;
        this.field_tb = -2147483648;
        this.field_eb = -2147483648;
        this.field_ob = -1;
        this.field_xb = -1;
        try {
          L0: {
            L1: {
              this.field_zb = param4;
              this.field_e = param0;
              this.field_z = param5;
              this.field_Q = param3;
              this.field_x = param2;
              this.b((byte) -32, param1);
              if (param6 == null) {
                break L1;
              } else {
                this.field_wb = param6;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (runtimeException);
            stackOut_4_1 = new StringBuilder().append("cj.<init>(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param6 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    static {
        field_Eb = "Connection lost. <%0>";
        field_C = new String[]{"All scores", "My scores", "Best each"};
        field_F = new int[8192];
        field_B = "Hammer";
        field_db = "Use on one of your zombies to make it travel faster than its stench.";
        field_ub = true;
    }
}
