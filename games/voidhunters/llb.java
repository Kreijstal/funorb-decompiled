/*
 * Decompiled by CFR-JS 0.4.0.
 */
class llb extends fgb {
    int field_u;
    int field_o;
    int field_v;
    boolean field_Z;
    int field_B;
    phb field_tb;
    int field_P;
    boolean field_Q;
    int field_L;
    int field_db;
    int field_r;
    int field_t;
    int field_K;
    int field_fb;
    phb field_ob;
    boolean field_S;
    int field_D;
    int field_hb;
    int field_G;
    private boolean field_W;
    phb[] field_nb;
    private int field_bb;
    boolean field_J;
    int field_X;
    phb[] field_gb;
    String field_R;
    int field_ib;
    phb[] field_A;
    phb field_q;
    private int field_sb;
    private int field_n;
    int field_w;
    static String field_V;
    boolean field_O;
    static String field_H;
    int field_E;
    private int field_ab;
    int field_I;
    phb[] field_mb;
    phb[] field_ub;
    phb field_cb;
    no field_eb;
    int field_U;
    int field_jb;
    boolean field_y;
    String field_s;
    private int field_p;
    int field_rb;
    static String field_kb;
    private int field_x;
    int field_C;
    boolean field_T;
    boolean field_pb;
    int field_Y;
    int field_qb;
    ij field_lb;
    int field_F;
    int field_M;
    private boolean field_N;
    phb field_z;

    final void a(llb param0, int param1, llb param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
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
        try {
          L0: {
            L1: {
              var5_int = -5 % ((-59 - param3) / 34);
              if (param0 != null) {
                param2.field_db = param0.field_db - -param0.field_E;
                param2.field_K = param1 + (param0.field_K + param0.field_G);
                break L1;
              } else {
                param2.field_db = 0;
                param2.field_K = 0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5);
            stackOut_4_1 = new StringBuilder().append("llb.U(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_sb = 0;
        this.field_K = param3;
        this.field_E = 0;
        this.field_db = 0;
        this.field_x = 0;
        this.field_hb = param2;
        this.field_G = param4;
        int var6 = -17 / ((param1 - 80) / 36);
        this.field_L = param0;
    }

    llb(long param0, llb param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    final void a(int param0, llb param1) {
        RuntimeException var3 = null;
        Object stackIn_85_0 = null;
        Object stackIn_86_0 = null;
        Object stackIn_87_0 = null;
        Object stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_104_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_84_0 = null;
        Object stackOut_85_0 = null;
        Object stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        Object stackOut_87_0 = null;
        int stackOut_87_1 = 0;
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
            L1: {
              if (param0 == 18445) {
                break L1;
              } else {
                this.a(25, 12, -107, false);
                break L1;
              }
            }
            L2: {
              if (param1 == null) {
                break L2;
              } else {
                L3: {
                  if (null != param1.field_s) {
                    this.field_s = param1.field_s;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param1.field_D == 0) {
                    break L4;
                  } else {
                    this.field_D = param1.field_D;
                    break L4;
                  }
                }
                L5: {
                  if (null == param1.field_A) {
                    break L5;
                  } else {
                    this.field_A = param1.field_A;
                    break L5;
                  }
                }
                L6: {
                  if ((param1.field_I ^ -1) != -257) {
                    this.field_I = param1.field_I;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (!param1.field_J) {
                    break L7;
                  } else {
                    this.field_J = param1.field_J;
                    break L7;
                  }
                }
                L8: {
                  if (!param1.field_N) {
                    break L8;
                  } else {
                    this.field_N = param1.field_N;
                    break L8;
                  }
                }
                L9: {
                  if (param1.field_T) {
                    this.field_T = param1.field_T;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (0 <= param1.field_qb) {
                    this.field_qb = param1.field_qb;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (param1.field_R != null) {
                    this.field_R = param1.field_R;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (null == param1.field_cb) {
                    break L12;
                  } else {
                    this.field_cb = param1.field_cb;
                    break L12;
                  }
                }
                L13: {
                  if (param1.field_y) {
                    break L13;
                  } else {
                    this.field_y = param1.field_y;
                    break L13;
                  }
                }
                L14: {
                  if (param1.field_z != null) {
                    this.field_z = param1.field_z;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (param1.field_w != 0) {
                    this.field_w = param1.field_w;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (param1.field_nb == null) {
                    break L16;
                  } else {
                    this.field_nb = param1.field_nb;
                    break L16;
                  }
                }
                L17: {
                  if ((param1.field_U ^ -1) <= -1) {
                    this.field_U = param1.field_U;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (param1.field_ib < 0) {
                    break L18;
                  } else {
                    this.field_ib = param1.field_ib;
                    break L18;
                  }
                }
                L19: {
                  if (!param1.field_S) {
                    break L19;
                  } else {
                    this.field_S = param1.field_S;
                    break L19;
                  }
                }
                L20: {
                  if (null == param1.field_ob) {
                    break L20;
                  } else {
                    this.field_ob = param1.field_ob;
                    break L20;
                  }
                }
                L21: {
                  if (null == param1.field_mb) {
                    break L21;
                  } else {
                    this.field_mb = param1.field_mb;
                    break L21;
                  }
                }
                L22: {
                  if (null == param1.field_q) {
                    break L22;
                  } else {
                    this.field_q = param1.field_q;
                    break L22;
                  }
                }
                L23: {
                  if (0 != param1.field_Y) {
                    this.field_Y = param1.field_Y;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if ((param1.field_jb ^ -1) <= -1) {
                    this.field_jb = param1.field_jb;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (null == param1.field_ub) {
                    break L25;
                  } else {
                    this.field_ub = param1.field_ub;
                    break L25;
                  }
                }
                L26: {
                  if (param1.field_gb != null) {
                    this.field_gb = param1.field_gb;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (null == param1.field_eb) {
                    break L27;
                  } else {
                    this.field_eb = param1.field_eb;
                    break L27;
                  }
                }
                L28: {
                  if (null == param1.field_tb) {
                    break L28;
                  } else {
                    this.field_tb = param1.field_tb;
                    break L28;
                  }
                }
                L29: {
                  if (param1.field_X == -2147483648) {
                    break L29;
                  } else {
                    this.field_X = param1.field_X;
                    break L29;
                  }
                }
                L30: {
                  if (-1 != (param1.field_B ^ -1)) {
                    this.field_B = param1.field_B;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (param1.field_rb != -2147483648) {
                    this.field_rb = param1.field_rb;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (!param1.field_Z) {
                    break L32;
                  } else {
                    this.field_Z = param1.field_Z;
                    break L32;
                  }
                }
                L33: {
                  if ((param1.field_P ^ -1) != 2147483647) {
                    this.field_P = param1.field_P;
                    break L33;
                  } else {
                    break L33;
                  }
                }
                L34: {
                  if (-1 != (param1.field_F ^ -1)) {
                    this.field_F = param1.field_F;
                    break L34;
                  } else {
                    break L34;
                  }
                }
                L35: {
                  this.field_W = param1.field_W;
                  if (-1 == (param1.field_t ^ -1)) {
                    break L35;
                  } else {
                    this.field_t = param1.field_t;
                    break L35;
                  }
                }
                L36: {
                  L37: {
                    stackOut_84_0 = this;
                    stackIn_87_0 = stackOut_84_0;
                    stackIn_85_0 = stackOut_84_0;
                    if (!this.field_T) {
                      break L37;
                    } else {
                      stackOut_85_0 = this;
                      stackIn_87_0 = stackOut_85_0;
                      stackIn_86_0 = stackOut_85_0;
                      if (!param1.field_pb) {
                        break L37;
                      } else {
                        stackOut_86_0 = this;
                        stackOut_86_1 = 1;
                        stackIn_88_0 = stackOut_86_0;
                        stackIn_88_1 = stackOut_86_1;
                        break L36;
                      }
                    }
                  }
                  stackOut_87_0 = this;
                  stackOut_87_1 = 0;
                  stackIn_88_0 = stackOut_87_0;
                  stackIn_88_1 = stackOut_87_1;
                  break L36;
                }
                L38: {
                  ((llb) (this)).field_pb = stackIn_88_1 != 0;
                  if ((param1.field_fb ^ -1) != 2147483647) {
                    this.field_fb = param1.field_fb;
                    break L38;
                  } else {
                    break L38;
                  }
                }
                L39: {
                  if (param1.field_bb != -2147483648) {
                    this.field_bb = param1.field_bb;
                    break L39;
                  } else {
                    break L39;
                  }
                }
                L40: {
                  if (param1.field_v != 0) {
                    this.field_v = param1.field_v;
                    break L40;
                  } else {
                    break L40;
                  }
                }
                if (-2147483648 != param1.field_p) {
                  this.field_p = param1.field_p;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L41: {
            var3 = decompiledCaughtException;
            stackOut_101_0 = (RuntimeException) (var3);
            stackOut_101_1 = new StringBuilder().append("llb.T(").append(param0).append(',');
            stackIn_103_0 = stackOut_101_0;
            stackIn_103_1 = stackOut_101_1;
            stackIn_102_0 = stackOut_101_0;
            stackIn_102_1 = stackOut_101_1;
            if (param1 == null) {
              stackOut_103_0 = (RuntimeException) ((Object) stackIn_103_0);
              stackOut_103_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackOut_103_2 = "null";
              stackIn_104_0 = stackOut_103_0;
              stackIn_104_1 = stackOut_103_1;
              stackIn_104_2 = stackOut_103_2;
              break L41;
            } else {
              stackOut_102_0 = (RuntimeException) ((Object) stackIn_102_0);
              stackOut_102_1 = (StringBuilder) ((Object) stackIn_102_1);
              stackOut_102_2 = "{...}";
              stackIn_104_0 = stackOut_102_0;
              stackIn_104_1 = stackOut_102_1;
              stackIn_104_2 = stackOut_102_2;
              break L41;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_104_0), stackIn_104_2 + ')');
        }
    }

    final void b(boolean param0, int param1) {
        int var3 = -119 % ((param1 - -29) / 40);
        this.a(false, dma.field_j, false, dma.field_g, true, false, true, param0, false, 0, 0);
    }

    final void g(int param0) {
        int var3 = 0;
        llb var4 = null;
        var3 = VoidHunters.field_G;
        if (param0 < 104) {
          return;
        } else {
          L0: {
            if (null == this.field_lb) {
              break L0;
            } else {
              var4 = (llb) ((Object) this.field_lb.b((byte) 121));
              L1: while (true) {
                if (var4 == null) {
                  break L0;
                } else {
                  var4.field_N = true;
                  var4.g(127);
                  var4 = (llb) ((Object) this.field_lb.a(-1155566844));
                  continue L1;
                }
              }
            }
          }
          return;
        }
    }

    llb(String param0, llb param1, int param2, int param3, int param4, int param5, String param6) {
        this(qua.a((CharSequence) ((Object) param0), true), param1, param2, param3, param4, param5, param6);
    }

    private final void a(boolean param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        llb var13 = null;
        int var14 = 0;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        Object stackOut_28_0 = null;
        Object stackOut_29_0 = null;
        Object stackOut_30_0 = null;
        Object stackOut_31_0 = null;
        Object stackOut_32_0 = null;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        Object stackOut_35_0 = null;
        Object stackOut_36_0 = null;
        Object stackOut_37_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        L0: {
          var14 = VoidHunters.field_G;
          if (-1 > (this.field_sb ^ -1)) {
            var7 = -(-this.field_sb >> 1632698338);
            break L0;
          } else {
            var7 = this.field_sb >> -2069546846;
            break L0;
          }
        }
        L1: {
          this.field_L = this.field_L + var7;
          this.field_sb = this.field_sb - var7;
          if (0 < this.field_db) {
            var7 = -(-this.field_db >> 970707682);
            break L1;
          } else {
            var7 = this.field_db >> 1420747778;
            break L1;
          }
        }
        L2: {
          this.field_db = this.field_db - var7;
          this.field_K = this.field_K + var7;
          if ((this.field_x ^ -1) < -1) {
            var7 = -(-this.field_x >> -1966321662);
            break L2;
          } else {
            var7 = this.field_x >> 1963196802;
            break L2;
          }
        }
        L3: {
          this.field_x = this.field_x - var7;
          this.field_hb = this.field_hb + var7;
          if ((this.field_E ^ -1) < -1) {
            var7 = -(-this.field_E >> -1241342526);
            break L3;
          } else {
            var7 = this.field_E >> 206972706;
            break L3;
          }
        }
        L4: {
          this.field_M = param1 - -this.field_L;
          if (param0) {
            break L4;
          } else {
            this.field_w = -107;
            break L4;
          }
        }
        L5: {
          L6: {
            this.field_G = this.field_G + var7;
            this.field_u = param4 - -this.field_K;
            this.field_E = this.field_E - var7;
            param3 = param3 & this.field_y;
            var8 = dma.field_d;
            var9 = dma.field_c;
            var10 = dma.field_a;
            var11 = dma.field_f;
            dma.g(this.field_M, this.field_u, this.field_hb + this.field_M, this.field_G + this.field_u);
            var12 = 0;
            if (ru.field_o) {
              break L6;
            } else {
              if (!param3) {
                break L6;
              } else {
                if (pba.field_o == 0) {
                  break L6;
                } else {
                  if (oq.field_H < dma.field_d) {
                    break L6;
                  } else {
                    if (oq.field_H >= dma.field_a) {
                      break L6;
                    } else {
                      if (qs.field_a < dma.field_c) {
                        break L6;
                      } else {
                        if (dma.field_f <= qs.field_a) {
                          break L6;
                        } else {
                          this.field_C = pba.field_o;
                          var12 = 1;
                          this.field_r = oq.field_H + -this.field_M;
                          this.field_n = -this.field_u + qs.field_a;
                          this.field_o = pba.field_o;
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
            if (pba.field_o == 0) {
              break L7;
            } else {
              this.field_C = 0;
              break L7;
            }
          }
          this.field_o = 0;
          break L5;
        }
        L8: {
          if (hu.field_b == 0) {
            this.field_C = 0;
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          L10: {
            stackOut_28_0 = this;
            stackIn_34_0 = stackOut_28_0;
            stackIn_29_0 = stackOut_28_0;
            if (dca.field_p) {
              break L10;
            } else {
              stackOut_29_0 = this;
              stackIn_34_0 = stackOut_29_0;
              stackIn_30_0 = stackOut_29_0;
              if (kc.field_b < dma.field_d) {
                break L10;
              } else {
                stackOut_30_0 = this;
                stackIn_34_0 = stackOut_30_0;
                stackIn_31_0 = stackOut_30_0;
                if (kc.field_b >= dma.field_a) {
                  break L10;
                } else {
                  stackOut_31_0 = this;
                  stackIn_34_0 = stackOut_31_0;
                  stackIn_32_0 = stackOut_31_0;
                  if (dma.field_c > uia.field_b) {
                    break L10;
                  } else {
                    stackOut_32_0 = this;
                    stackIn_34_0 = stackOut_32_0;
                    stackIn_33_0 = stackOut_32_0;
                    if (dma.field_f <= uia.field_b) {
                      break L10;
                    } else {
                      stackOut_33_0 = this;
                      stackOut_33_1 = 1;
                      stackIn_35_0 = stackOut_33_0;
                      stackIn_35_1 = stackOut_33_1;
                      break L9;
                    }
                  }
                }
              }
            }
          }
          stackOut_34_0 = this;
          stackOut_34_1 = 0;
          stackIn_35_0 = stackOut_34_0;
          stackIn_35_1 = stackOut_34_1;
          break L9;
        }
        L11: {
          L12: {
            ((llb) (this)).field_Q = stackIn_35_1 != 0;
            stackOut_35_0 = this;
            stackIn_39_0 = stackOut_35_0;
            stackIn_36_0 = stackOut_35_0;
            if (!this.field_Q) {
              break L12;
            } else {
              stackOut_36_0 = this;
              stackIn_39_0 = stackOut_36_0;
              stackIn_37_0 = stackOut_36_0;
              if (this.field_C != hu.field_b) {
                break L12;
              } else {
                stackOut_37_0 = this;
                stackIn_39_0 = stackOut_37_0;
                stackIn_38_0 = stackOut_37_0;
                if (!param3) {
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
          ((llb) (this)).field_O = stackIn_40_1 != 0;
          if (this.field_lb != null) {
            var13 = (llb) ((Object) this.field_lb.b((byte) 119));
            L14: while (true) {
              if (var13 == null) {
                break L13;
              } else {
                var13.a(true, this.field_M, this.field_G, param3, this.field_u, this.field_hb);
                var13 = (llb) ((Object) this.field_lb.a(-1155566844));
                continue L14;
              }
            }
          } else {
            break L13;
          }
        }
        L15: {
          if (!this.field_Q) {
            break L15;
          } else {
            dca.field_p = true;
            break L15;
          }
        }
        L16: {
          if (var12 != 0) {
            ru.field_o = true;
            break L16;
          } else {
            break L16;
          }
        }
        L17: {
          dma.b(var8, var9, var10, var11);
          if (-1 == (this.field_C ^ -1)) {
            break L17;
          } else {
            if (!this.field_Z) {
              break L17;
            } else {
              L18: {
                this.field_K = -this.field_n + uia.field_b - param4;
                this.field_L = -param1 + -this.field_r + kc.field_b;
                if ((this.field_L ^ -1) > -1) {
                  this.field_L = 0;
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (this.field_L > -this.field_hb + param5) {
                  this.field_L = param5 - this.field_hb;
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                if (-1 >= (this.field_K ^ -1)) {
                  break L20;
                } else {
                  this.field_K = 0;
                  break L20;
                }
              }
              L21: {
                if (this.field_K <= -this.field_G + param2) {
                  break L21;
                } else {
                  this.field_K = param2 - this.field_G;
                  break L21;
                }
              }
              this.field_M = this.field_L + param1;
              this.field_sb = 0;
              this.field_db = 0;
              this.field_u = param4 + this.field_K;
              break L17;
            }
          }
        }
    }

    public static void f(int param0) {
        field_kb = null;
        field_H = null;
        field_V = null;
        if (param0 != -2147483648) {
            llb.f(97);
        }
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        llb var10_ref_llb = null;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = VoidHunters.field_G;
          var5 = -this.field_K;
          if (param1 <= -69) {
            break L0;
          } else {
            this.a(50, -50, -75, 81, -93);
            break L0;
          }
        }
        L1: {
          var6 = var5 + -this.field_db;
          var7 = this.field_G;
          var8 = this.field_E + var7;
          if (!param3) {
            var9 = 0;
            var10_ref_llb = (llb) ((Object) this.field_lb.d(0));
            L2: while (true) {
              if (var10_ref_llb == null) {
                var8 = -param0 + var9;
                break L1;
              } else {
                var10_ref_llb.field_db = -var10_ref_llb.field_K + var9;
                var9 = var9 + (param0 + (var10_ref_llb.field_G + var10_ref_llb.field_E));
                var10_ref_llb = (llb) ((Object) this.field_lb.a((byte) 72));
                continue L2;
              }
            }
          } else {
            break L1;
          }
        }
        L3: {
          var9 = -param2 + var8;
          if (var6 > var9) {
            var6 = var9;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (0 <= var6) {
            break L4;
          } else {
            var6 = 0;
            break L4;
          }
        }
        L5: {
          var10 = var7 - param2;
          if (var5 <= var10) {
            break L5;
          } else {
            var5 = var10;
            break L5;
          }
        }
        L6: {
          if ((var5 ^ -1) <= -1) {
            break L6;
          } else {
            var5 = 0;
            break L6;
          }
        }
        this.field_G = var7;
        this.field_E = -var7 + var8;
        this.field_K = -var5;
        this.field_db = -var6 + var5;
    }

    final int a(int param0, byte param1) {
        llb var4 = null;
        int var5 = 0;
        int var4_int = 0;
        int var6 = VoidHunters.field_G;
        int var3 = 0;
        if (null != this.field_R) {
            if (null != this.field_eb) {
                var4_int = this.field_eb.b(this.field_R, param0);
                if (var3 < var4_int) {
                    var3 = var4_int;
                }
            }
        }
        if (null != this.field_tb) {
            var4_int = this.field_tb.field_m;
            if (!(var3 >= var4_int)) {
                var3 = var4_int;
            }
        }
        if (param1 != 114) {
            llb var7 = (llb) null;
            this.b(-75, (llb) null);
        }
        if (null != this.field_lb) {
            var4 = (llb) ((Object) this.field_lb.d(param1 + -114));
            while (var4 != null) {
                var5 = var4.field_hb + var4.field_L;
                if (!(var3 >= var5)) {
                    var3 = var5;
                }
                var4 = (llb) ((Object) this.field_lb.a((byte) 17));
            }
        }
        return var3;
    }

    final void b(int param0, llb param1) {
        try {
            if (param0 != -561) {
                this.field_I = -90;
            }
            if (this.field_lb == null) {
                this.field_lb = new ij();
            }
            this.field_lb.b(-10258, param1);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "llb.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    llb(long param0, llb param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final void a(boolean param0, llb param1) {
        wc var3 = null;
        RuntimeException var3_ref = null;
        llb var4 = null;
        int var5 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (this.field_lb == null) {
                break L1;
              } else {
                var3 = new wc(this.field_lb);
                var4 = (llb) ((Object) var3.c(570));
                L2: while (true) {
                  if (var4 == null) {
                    break L1;
                  } else {
                    var4.a(param0, param1);
                    var4 = (llb) ((Object) var3.a(19072));
                    continue L2;
                  }
                }
              }
            }
            L3: {
              stackOut_5_0 = this;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (param1 != this) {
                stackOut_7_0 = this;
                stackOut_7_1 = 0;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                break L3;
              } else {
                stackOut_6_0 = this;
                stackOut_6_1 = 1;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                break L3;
              }
            }
            L4: {
              ((llb) (this)).field_pb = stackIn_8_1 != 0;
              if (this.field_W) {
                this.field_J = this.field_pb;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (!param0) {
                break L5;
              } else {
                this.field_r = -44;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3_ref);
            stackOut_14_1 = new StringBuilder().append("llb.M(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    final int e(int param0) {
        if (param0 < 4) {
            this.field_x = -24;
        }
        return this.a(2147483647, (byte) 114);
    }

    final void a(boolean param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param1 != 1332) {
          return;
        } else {
          L0: {
            if (param0) {
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
            ru.field_o = stackIn_4_0 != 0;
            if (param0) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
          }
          dca.field_p = stackIn_7_0 != 0;
          this.a(true, 0, dma.field_j, true, 0, dma.field_g);
          return;
        }
    }

    private final void a(boolean param0, int param1, boolean param2, int param3, boolean param4, boolean param5, boolean param6, boolean param7, boolean param8, int param9, int param10) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        phb[] var16 = null;
        phb var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23_int = 0;
        llb var23 = null;
        String var23_ref = null;
        int var24 = 0;
        int var25 = 0;
        String var26 = null;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          var25 = VoidHunters.field_G;
          this.field_u = param10 + this.field_K;
          this.field_M = this.field_L + param9;
          var12 = dma.field_d;
          var13 = dma.field_c;
          var14 = dma.field_a;
          var15 = dma.field_f;
          dma.g(this.field_M, this.field_u, this.field_M - -this.field_hb, this.field_G + this.field_u);
          if (!this.field_N) {
            L1: {
              param0 = this.field_O;
              param2 = this.field_J;
              if (-1 == (this.field_C ^ -1)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            param5 = stackIn_5_0 != 0;
            break L0;
          } else {
            break L0;
          }
        }
        param6 = param6 & this.field_y;
        var16 = this.field_gb;
        if (param4) {
          L2: {
            var17 = this.field_tb;
            var18 = this.field_Y;
            var19 = 0;
            if (param6) {
              break L2;
            } else {
              L3: {
                if (null != this.field_z) {
                  var17 = this.field_z;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (null != this.field_ub) {
                  var16 = this.field_ub;
                  break L4;
                } else {
                  break L4;
                }
              }
              if (0 > this.field_jb) {
                break L2;
              } else {
                var18 = this.field_jb;
                break L2;
              }
            }
          }
          L5: {
            var20 = 0;
            if (!param0) {
              break L5;
            } else {
              L6: {
                if (this.field_cb == null) {
                  break L6;
                } else {
                  var17 = this.field_cb;
                  break L6;
                }
              }
              L7: {
                if (-1 >= (this.field_qb ^ -1)) {
                  var18 = this.field_qb;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (-2147483648 == this.field_bb) {
                  break L8;
                } else {
                  var20 = this.field_bb;
                  break L8;
                }
              }
              L9: {
                if (this.field_mb == null) {
                  break L9;
                } else {
                  var16 = this.field_mb;
                  break L9;
                }
              }
              if (-2147483648 == this.field_p) {
                break L5;
              } else {
                var19 = this.field_p;
                break L5;
              }
            }
          }
          L10: {
            if (!param5) {
              break L10;
            } else {
              L11: {
                if (this.field_A == null) {
                  break L11;
                } else {
                  var16 = this.field_A;
                  break L11;
                }
              }
              L12: {
                if (null != this.field_ob) {
                  var17 = this.field_ob;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (this.field_fb == -2147483648) {
                  break L13;
                } else {
                  var19 = this.field_fb;
                  break L13;
                }
              }
              L14: {
                if (this.field_ib < 0) {
                  break L14;
                } else {
                  var18 = this.field_ib;
                  break L14;
                }
              }
              if (2147483647 == (this.field_rb ^ -1)) {
                break L10;
              } else {
                var20 = this.field_rb;
                break L10;
              }
            }
          }
          L15: {
            if (param2) {
              L16: {
                if (this.field_X == -2147483648) {
                  break L16;
                } else {
                  var19 = this.field_X;
                  break L16;
                }
              }
              L17: {
                if (this.field_U < 0) {
                  break L17;
                } else {
                  var18 = this.field_U;
                  break L17;
                }
              }
              L18: {
                if (-2147483648 != this.field_P) {
                  var20 = this.field_P;
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (null != this.field_q) {
                  var17 = this.field_q;
                  break L19;
                } else {
                  break L19;
                }
              }
              if (null == this.field_nb) {
                break L15;
              } else {
                var16 = this.field_nb;
                break L15;
              }
            } else {
              break L15;
            }
          }
          L20: {
            var21 = var19 + this.field_t;
            var22 = this.field_v + var20;
            if (!this.field_S) {
              abb.a(3, this.field_G, this.field_hb, this.field_u, var16, this.field_M);
              break L20;
            } else {
              abb.a(3, param1, param3, param10, var16, param9);
              break L20;
            }
          }
          L21: {
            if (var17 != null) {
              L22: {
                var23_int = var21 + this.field_M;
                if (1 == this.field_F) {
                  var23_int = var23_int + (this.field_hb - var17.field_m) / 2;
                  break L22;
                } else {
                  break L22;
                }
              }
              L23: {
                var24 = var22 + this.field_u;
                if (2 != this.field_F) {
                  break L23;
                } else {
                  var23_int = var23_int + (-var17.field_m + this.field_hb);
                  break L23;
                }
              }
              L24: {
                if (-2 == (this.field_B ^ -1)) {
                  var24 = var24 + (-var17.field_n + this.field_G) / 2;
                  break L24;
                } else {
                  break L24;
                }
              }
              L25: {
                if ((this.field_B ^ -1) == -3) {
                  var24 = var24 + (-var17.field_n + this.field_G);
                  break L25;
                } else {
                  break L25;
                }
              }
              if (256 > this.field_ab) {
                var17.d(var23_int, var24, this.field_ab);
                break L21;
              } else {
                var17.a(var23_int, var24);
                break L21;
              }
            } else {
              break L21;
            }
          }
          L26: {
            if (null == this.field_R) {
              break L26;
            } else {
              if (null == this.field_eb) {
                break L26;
              } else {
                L27: {
                  var26 = this.field_R;
                  var23_ref = var26;
                  var23_ref = var26;
                  var23_ref = var26;
                  if (!param7) {
                    break L27;
                  } else {
                    if (this.field_s == null) {
                      break L27;
                    } else {
                      var23_ref = var26 + this.field_s;
                      break L27;
                    }
                  }
                }
                L28: {
                  if (this.field_eb.b(var23_ref) > this.field_hb - this.field_w * 2) {
                    break L28;
                  } else {
                    if (var23_ref.indexOf("<br>") >= 0) {
                      break L28;
                    } else {
                      L29: {
                        if (this.field_B != 1) {
                          if (2 != this.field_B) {
                            break L29;
                          } else {
                            var22 = var22 + (-this.field_eb.field_k + (this.field_G - this.field_eb.field_A));
                            break L29;
                          }
                        } else {
                          var22 = var22 + (-this.field_eb.field_A + -this.field_eb.field_k + this.field_G) / 2;
                          break L29;
                        }
                      }
                      if (0 != this.field_F) {
                        if ((this.field_F ^ -1) != -2) {
                          if (2 != this.field_F) {
                            discarded$2 = this.field_eb.a(var23_ref, this.field_M - (-this.field_w + -var21), this.field_u + var22, this.field_hb + -(this.field_w * 2), this.field_G, var18, -1, this.field_I, this.field_F, this.field_B, this.field_D);
                            break L26;
                          } else {
                            this.field_eb.c(var23_ref, this.field_hb - (this.field_w * 2 - this.field_M - this.field_w + -var21), this.field_eb.field_k + this.field_u - -var22, var18, -1, this.field_I);
                            break L26;
                          }
                        } else {
                          this.field_eb.b(var23_ref, var21 + this.field_w + (this.field_M + (-(this.field_w * 2) + this.field_hb) / 2), this.field_u + (var22 + this.field_eb.field_k), var18, -1, this.field_I);
                          break L26;
                        }
                      } else {
                        this.field_eb.a(var23_ref, this.field_M + (this.field_w + var21), var22 + (this.field_u + this.field_eb.field_k), var18, -1, this.field_I);
                        break L26;
                      }
                    }
                  }
                }
                discarded$3 = this.field_eb.a(var23_ref, var21 + (this.field_M + this.field_w), var22 + this.field_u, this.field_hb - 2 * this.field_w, this.field_G, var18, -1, this.field_I, this.field_F, this.field_B, this.field_D);
                break L26;
              }
            }
          }
          L30: {
            if (null != this.field_lb) {
              var23 = (llb) ((Object) this.field_lb.d(0));
              L31: while (true) {
                if (var23 == null) {
                  break L30;
                } else {
                  var23.a(param0, this.field_G, param2, this.field_hb, true, param5, param6, param7, this.field_pb, var19 + this.field_M, this.field_u - -var20);
                  var23 = (llb) ((Object) this.field_lb.a((byte) 109));
                  continue L31;
                }
              }
            } else {
              break L30;
            }
          }
          dma.b(var12, var13, var14, var15);
          return;
        } else {
          return;
        }
    }

    public llb() {
        this.field_W = false;
        this.field_y = true;
        this.field_U = -1;
        this.field_X = -2147483648;
        this.field_P = -2147483648;
        this.field_p = -2147483648;
        this.field_I = 256;
        this.field_fb = -2147483648;
        this.field_T = false;
        this.field_ab = 256;
        this.field_qb = -1;
        this.field_rb = -2147483648;
        this.field_jb = -1;
        this.field_ib = -1;
        this.field_pb = false;
        this.field_bb = -2147483648;
    }

    llb(long param0, llb param1, int param2, int param3, int param4, int param5, String param6) {
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
        this.field_W = false;
        this.field_y = true;
        this.field_U = -1;
        this.field_X = -2147483648;
        this.field_P = -2147483648;
        this.field_p = -2147483648;
        this.field_I = 256;
        this.field_fb = -2147483648;
        this.field_T = false;
        this.field_ab = 256;
        this.field_qb = -1;
        this.field_rb = -2147483648;
        this.field_jb = -1;
        this.field_ib = -1;
        this.field_pb = false;
        this.field_bb = -2147483648;
        try {
          L0: {
            L1: {
              this.field_G = param5;
              this.field_b = param0;
              this.field_K = param3;
              this.field_L = param2;
              this.field_hb = param4;
              this.a(18445, param1);
              if (param6 == null) {
                break L1;
              } else {
                this.field_R = param6;
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
            stackOut_4_1 = new StringBuilder().append("llb.<init>(").append(param0).append(',');
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
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    static {
        field_V = "Quality";
        field_kb = "Toggle repair mode";
        field_H = "<%0> can no longer respawn";
    }
}
