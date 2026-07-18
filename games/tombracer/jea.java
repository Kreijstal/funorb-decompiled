/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jea extends um {
    int field_t;
    int field_ab;
    iu field_R;
    iu[] field_C;
    boolean field_eb;
    int field_P;
    boolean field_L;
    vna field_J;
    iu field_B;
    int field_hb;
    il field_H;
    boolean field_cb;
    int field_p;
    boolean field_o;
    boolean field_pb;
    private boolean field_Q;
    boolean field_F;
    int field_ob;
    iu field_rb;
    int field_N;
    iu field_lb;
    int field_ib;
    iu[] field_n;
    iu[] field_db;
    int field_A;
    int field_z;
    int field_x;
    String field_sb;
    int field_bb;
    int field_E;
    int field_W;
    int field_O;
    int field_q;
    int field_V;
    iu[] field_w;
    int field_qb;
    int field_K;
    int field_gb;
    int field_v;
    int field_G;
    private int field_I;
    private boolean field_D;
    String field_r;
    int field_fb;
    int field_s;
    int field_S;
    iu field_U;
    boolean field_X;
    private int field_Y;
    boolean field_Z;
    private int field_u;
    int field_y;
    private int field_jb;
    int field_T;
    iu[] field_M;
    static String field_nb;
    private int field_kb;
    private int field_mb;

    public static void c() {
        field_nb = null;
    }

    final void b(int param0, jea param1) {
        try {
            if (null == ((jea) this).field_J) {
                ((jea) this).field_J = new vna();
            }
            if (param0 >= -121) {
                this.a(33, true, 32, -78, -54, -31);
            }
            ((jea) this).field_J.b((byte) -115, (vg) (Object) param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "jea.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, jea param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        Object stackIn_88_0 = null;
        Object stackIn_89_0 = null;
        Object stackIn_90_0 = null;
        Object stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_87_0 = null;
        Object stackOut_88_0 = null;
        Object stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        Object stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                L2: {
                  if (param1.field_lb == null) {
                    break L2;
                  } else {
                    ((jea) this).field_lb = param1.field_lb;
                    break L2;
                  }
                }
                L3: {
                  if (!param1.field_X) {
                    ((jea) this).field_X = param1.field_X;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param1.field_s == 256) {
                    break L4;
                  } else {
                    ((jea) this).field_s = param1.field_s;
                    break L4;
                  }
                }
                L5: {
                  if (param1.field_ib != 0) {
                    ((jea) this).field_ib = param1.field_ib;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (null == param1.field_sb) {
                    break L6;
                  } else {
                    ((jea) this).field_sb = param1.field_sb;
                    break L6;
                  }
                }
                L7: {
                  if (param1.field_db == null) {
                    break L7;
                  } else {
                    ((jea) this).field_db = param1.field_db;
                    break L7;
                  }
                }
                L8: {
                  if (param1.field_Q) {
                    ((jea) this).field_Q = param1.field_Q;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (param1.field_P == 0) {
                    break L9;
                  } else {
                    ((jea) this).field_P = param1.field_P;
                    break L9;
                  }
                }
                L10: {
                  if (param1.field_U == null) {
                    break L10;
                  } else {
                    ((jea) this).field_U = param1.field_U;
                    break L10;
                  }
                }
                L11: {
                  if (param1.field_n == null) {
                    break L11;
                  } else {
                    ((jea) this).field_n = param1.field_n;
                    break L11;
                  }
                }
                L12: {
                  if (param1.field_hb < 0) {
                    break L12;
                  } else {
                    ((jea) this).field_hb = param1.field_hb;
                    break L12;
                  }
                }
                L13: {
                  if (param1.field_ab >= 0) {
                    ((jea) this).field_ab = param1.field_ab;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (null != param1.field_R) {
                    ((jea) this).field_R = param1.field_R;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (param1.field_r != null) {
                    ((jea) this).field_r = param1.field_r;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (null != param1.field_rb) {
                    ((jea) this).field_rb = param1.field_rb;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (param1.field_x == 0) {
                    break L17;
                  } else {
                    ((jea) this).field_x = param1.field_x;
                    break L17;
                  }
                }
                L18: {
                  if (param1.field_w != null) {
                    ((jea) this).field_w = param1.field_w;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (!param1.field_eb) {
                    break L19;
                  } else {
                    ((jea) this).field_eb = param1.field_eb;
                    break L19;
                  }
                }
                L20: {
                  if (param1.field_N < 0) {
                    break L20;
                  } else {
                    ((jea) this).field_N = param1.field_N;
                    break L20;
                  }
                }
                L21: {
                  if (param1.field_H != null) {
                    ((jea) this).field_H = param1.field_H;
                    break L21;
                  } else {
                    break L21;
                  }
                }
                L22: {
                  if (!param1.field_cb) {
                    break L22;
                  } else {
                    ((jea) this).field_cb = param1.field_cb;
                    break L22;
                  }
                }
                L23: {
                  if (param1.field_Z) {
                    ((jea) this).field_Z = param1.field_Z;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (param1.field_M == null) {
                    break L24;
                  } else {
                    ((jea) this).field_M = param1.field_M;
                    break L24;
                  }
                }
                L25: {
                  if (param1.field_C != null) {
                    ((jea) this).field_C = param1.field_C;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (null != param1.field_B) {
                    ((jea) this).field_B = param1.field_B;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (param1.field_gb < 0) {
                    break L27;
                  } else {
                    ((jea) this).field_gb = param1.field_gb;
                    break L27;
                  }
                }
                L28: {
                  if (param1.field_fb != -2147483648) {
                    ((jea) this).field_fb = param1.field_fb;
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  if (param1.field_v != -2147483648) {
                    ((jea) this).field_v = param1.field_v;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (param1.field_bb == 0) {
                    break L30;
                  } else {
                    ((jea) this).field_bb = param1.field_bb;
                    break L30;
                  }
                }
                L31: {
                  ((jea) this).field_D = param1.field_D;
                  if (param1.field_W != -2147483648) {
                    ((jea) this).field_W = param1.field_W;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (param1.field_V != 0) {
                    ((jea) this).field_V = param1.field_V;
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L33: {
                  if (param1.field_jb == -2147483648) {
                    break L33;
                  } else {
                    ((jea) this).field_jb = param1.field_jb;
                    break L33;
                  }
                }
                L34: {
                  if (param1.field_ob != -2147483648) {
                    ((jea) this).field_ob = param1.field_ob;
                    break L34;
                  } else {
                    break L34;
                  }
                }
                L35: {
                  if (-2147483648 != param1.field_u) {
                    ((jea) this).field_u = param1.field_u;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                L36: {
                  L37: {
                    stackOut_87_0 = this;
                    stackIn_90_0 = stackOut_87_0;
                    stackIn_88_0 = stackOut_87_0;
                    if (!((jea) this).field_Z) {
                      break L37;
                    } else {
                      stackOut_88_0 = this;
                      stackIn_90_0 = stackOut_88_0;
                      stackIn_89_0 = stackOut_88_0;
                      if (!param1.field_L) {
                        break L37;
                      } else {
                        stackOut_89_0 = this;
                        stackOut_89_1 = 1;
                        stackIn_91_0 = stackOut_89_0;
                        stackIn_91_1 = stackOut_89_1;
                        break L36;
                      }
                    }
                  }
                  stackOut_90_0 = this;
                  stackOut_90_1 = 0;
                  stackIn_91_0 = stackOut_90_0;
                  stackIn_91_1 = stackOut_90_1;
                  break L36;
                }
                L38: {
                  ((jea) this).field_L = stackIn_91_1 != 0;
                  if (param1.field_S == 0) {
                    break L38;
                  } else {
                    ((jea) this).field_S = param1.field_S;
                    break L38;
                  }
                }
                L39: {
                  if (0 != param1.field_z) {
                    ((jea) this).field_z = param1.field_z;
                    break L39;
                  } else {
                    break L39;
                  }
                }
                if (param1.field_F) {
                  ((jea) this).field_F = param1.field_F;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L40: {
              if (!param0) {
                break L40;
              } else {
                var4 = null;
                ((jea) this).a(-110, (jea) null);
                break L40;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L41: {
            var3 = decompiledCaughtException;
            stackOut_102_0 = (RuntimeException) var3;
            stackOut_102_1 = new StringBuilder().append("jea.S(").append(param0).append(',');
            stackIn_104_0 = stackOut_102_0;
            stackIn_104_1 = stackOut_102_1;
            stackIn_103_0 = stackOut_102_0;
            stackIn_103_1 = stackOut_102_1;
            if (param1 == null) {
              stackOut_104_0 = (RuntimeException) (Object) stackIn_104_0;
              stackOut_104_1 = (StringBuilder) (Object) stackIn_104_1;
              stackOut_104_2 = "null";
              stackIn_105_0 = stackOut_104_0;
              stackIn_105_1 = stackOut_104_1;
              stackIn_105_2 = stackOut_104_2;
              break L41;
            } else {
              stackOut_103_0 = (RuntimeException) (Object) stackIn_103_0;
              stackOut_103_1 = (StringBuilder) (Object) stackIn_103_1;
              stackOut_103_2 = "{...}";
              stackIn_105_0 = stackOut_103_0;
              stackIn_105_1 = stackOut_103_1;
              stackIn_105_2 = stackOut_103_2;
              break L41;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_105_0, stackIn_105_2 + ')');
        }
    }

    final int a(int param0, boolean param1) {
        int var4_int = 0;
        jea var4 = null;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (param1) {
            Object var7 = null;
            ((jea) this).b(-22, (jea) null);
        }
        int var3 = 0;
        if (null != ((jea) this).field_r) {
            if (null != ((jea) this).field_H) {
                var4_int = ((jea) this).field_H.c(((jea) this).field_r, param0);
                if (!(var3 >= var4_int)) {
                    var3 = var4_int;
                }
            }
        }
        if (!(null == ((jea) this).field_R)) {
            var4_int = ((jea) this).field_R.field_n;
            if (!(var3 >= var4_int)) {
                var3 = var4_int;
            }
        }
        if (((jea) this).field_J != null) {
            var4 = (jea) (Object) ((jea) this).field_J.f(-80);
            while (var4 != null) {
                var5 = var4.field_G + var4.field_qb;
                if (var5 > var3) {
                    var3 = var5;
                }
                var4 = (jea) (Object) ((jea) this).field_J.e(115);
            }
        }
        return var3;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int var10 = 0;
        jea var11_ref_jea = null;
        int var12 = TombRacer.field_G ? 1 : 0;
        int var5 = -87 / ((1 - param2) / 57);
        int var6 = -((jea) this).field_T;
        int var7 = -((jea) this).field_K + var6;
        int var8 = ((jea) this).field_t;
        int var9 = var8 + ((jea) this).field_O;
        if (!(param0)) {
            var10 = 0;
            var11_ref_jea = (jea) (Object) ((jea) this).field_J.f(-80);
            while (var11_ref_jea != null) {
                var11_ref_jea.field_K = -var11_ref_jea.field_T + var10;
                var10 = var10 + (param1 + (var11_ref_jea.field_O + var11_ref_jea.field_t));
                var11_ref_jea = (jea) (Object) ((jea) this).field_J.e(127);
            }
            var9 = var10 - param1;
        }
        var10 = var9 + -param3;
        if (var7 > var10) {
            var7 = var10;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var11 = -param3 + var8;
        if (var6 > var11) {
            var6 = var11;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        ((jea) this).field_O = var9 + -var8;
        ((jea) this).field_K = -var7 + var6;
        ((jea) this).field_T = -var6;
        ((jea) this).field_t = var8;
    }

    final void c(int param0, boolean param1) {
        ula.field_w = !param1 ? true : false;
        int var3 = -103 / ((-16 - param0) / 34);
        ow.field_s = !param1 ? true : false;
        this.a(-1, true, bea.field_a, bea.field_g, 0, 0);
    }

    final void a(int param0) {
        jea var4 = null;
        int var3 = TombRacer.field_G ? 1 : 0;
        if (!(((jea) this).field_J == null)) {
            var4 = (jea) (Object) ((jea) this).field_J.b(param0 ^ -10967);
            while (var4 != null) {
                var4.field_Q = true;
                var4.a(-10966);
                var4 = (jea) (Object) var4.field_J.a(-1);
            }
        }
        if (param0 != -10966) {
            ((jea) this).field_mb = 18;
        }
    }

    final static void a(int param0, int param1, aca param2) {
        kh var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              var3 = ql.field_k;
              var3.k(param0, param1 ^ -3719);
              var3.i(param2.field_f, 0);
              var3.f(param1 ^ -1477660827, param2.field_j);
              if (param1 == 1325) {
                break L1;
              } else {
                var4 = null;
                jea.a(-121, 50, (aca) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3_ref;
            stackOut_3_1 = new StringBuilder().append("jea.Q(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    jea(long param0, jea param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
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
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        Object stackOut_24_0 = null;
        Object stackOut_25_0 = null;
        Object stackOut_26_0 = null;
        Object stackOut_27_0 = null;
        Object stackOut_28_0 = null;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_33_0 = null;
        Object stackOut_34_0 = null;
        Object stackOut_35_0 = null;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        L0: {
          var13 = null;
          var14 = TombRacer.field_G ? 1 : 0;
          if (((jea) this).field_Y > 0) {
            var7 = -(-((jea) this).field_Y >> 2);
            break L0;
          } else {
            var7 = ((jea) this).field_Y >> 2;
            break L0;
          }
        }
        L1: {
          ((jea) this).field_qb = ((jea) this).field_qb + var7;
          ((jea) this).field_Y = ((jea) this).field_Y - var7;
          if (param0 <= ~((jea) this).field_K) {
            var7 = ((jea) this).field_K >> 2;
            break L1;
          } else {
            var7 = -(-((jea) this).field_K >> 2);
            break L1;
          }
        }
        L2: {
          ((jea) this).field_T = ((jea) this).field_T + var7;
          ((jea) this).field_K = ((jea) this).field_K - var7;
          if (0 >= ((jea) this).field_mb) {
            var7 = ((jea) this).field_mb >> 2;
            break L2;
          } else {
            var7 = -(-((jea) this).field_mb >> 2);
            break L2;
          }
        }
        L3: {
          ((jea) this).field_G = ((jea) this).field_G + var7;
          ((jea) this).field_mb = ((jea) this).field_mb - var7;
          if (((jea) this).field_O > 0) {
            var7 = -(-((jea) this).field_O >> 2);
            break L3;
          } else {
            var7 = ((jea) this).field_O >> 2;
            break L3;
          }
        }
        L4: {
          L5: {
            param1 = param1 & ((jea) this).field_X;
            ((jea) this).field_O = ((jea) this).field_O - var7;
            ((jea) this).field_t = ((jea) this).field_t + var7;
            ((jea) this).field_q = ((jea) this).field_qb + param4;
            ((jea) this).field_A = param5 - -((jea) this).field_T;
            var8 = bea.field_b;
            var9 = bea.field_h;
            var10 = bea.field_d;
            var11 = bea.field_k;
            bea.g(((jea) this).field_q, ((jea) this).field_A, ((jea) this).field_G + ((jea) this).field_q, ((jea) this).field_t + ((jea) this).field_A);
            var12 = 0;
            if (ow.field_s) {
              break L5;
            } else {
              if (!param1) {
                break L5;
              } else {
                if (0 == hf.field_b) {
                  break L5;
                } else {
                  if (jm.field_m < bea.field_b) {
                    break L5;
                  } else {
                    if (jm.field_m >= bea.field_d) {
                      break L5;
                    } else {
                      if (bea.field_h > lba.field_p) {
                        break L5;
                      } else {
                        if (bea.field_k > lba.field_p) {
                          ((jea) this).field_E = hf.field_b;
                          ((jea) this).field_kb = -((jea) this).field_A + lba.field_p;
                          var12 = 1;
                          ((jea) this).field_p = jm.field_m + -((jea) this).field_q;
                          ((jea) this).field_y = hf.field_b;
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
          L6: {
            if (0 == hf.field_b) {
              break L6;
            } else {
              ((jea) this).field_E = 0;
              break L6;
            }
          }
          ((jea) this).field_y = 0;
          break L4;
        }
        L7: {
          L8: {
            stackOut_24_0 = this;
            stackIn_30_0 = stackOut_24_0;
            stackIn_25_0 = stackOut_24_0;
            if (ula.field_w) {
              break L8;
            } else {
              stackOut_25_0 = this;
              stackIn_30_0 = stackOut_25_0;
              stackIn_26_0 = stackOut_25_0;
              if (jba.field_j < bea.field_b) {
                break L8;
              } else {
                stackOut_26_0 = this;
                stackIn_30_0 = stackOut_26_0;
                stackIn_27_0 = stackOut_26_0;
                if (jba.field_j >= bea.field_d) {
                  break L8;
                } else {
                  stackOut_27_0 = this;
                  stackIn_30_0 = stackOut_27_0;
                  stackIn_28_0 = stackOut_27_0;
                  if (sta.field_B < bea.field_h) {
                    break L8;
                  } else {
                    stackOut_28_0 = this;
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_29_0 = stackOut_28_0;
                    if (bea.field_k <= sta.field_B) {
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
          ((jea) this).field_pb = stackIn_31_1 != 0;
          if (ksa.field_p != 0) {
            break L9;
          } else {
            ((jea) this).field_E = 0;
            break L9;
          }
        }
        L10: {
          L11: {
            stackOut_33_0 = this;
            stackIn_37_0 = stackOut_33_0;
            stackIn_34_0 = stackOut_33_0;
            if (!((jea) this).field_pb) {
              break L11;
            } else {
              stackOut_34_0 = this;
              stackIn_37_0 = stackOut_34_0;
              stackIn_35_0 = stackOut_34_0;
              if (((jea) this).field_E != ksa.field_p) {
                break L11;
              } else {
                stackOut_35_0 = this;
                stackIn_37_0 = stackOut_35_0;
                stackIn_36_0 = stackOut_35_0;
                if (!param1) {
                  break L11;
                } else {
                  stackOut_36_0 = this;
                  stackOut_36_1 = 1;
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  break L10;
                }
              }
            }
          }
          stackOut_37_0 = this;
          stackOut_37_1 = 0;
          stackIn_38_0 = stackOut_37_0;
          stackIn_38_1 = stackOut_37_1;
          break L10;
        }
        L12: {
          ((jea) this).field_o = stackIn_38_1 != 0;
          if (((jea) this).field_J != null) {
            var13 = (Object) (Object) (jea) (Object) ((jea) this).field_J.b(3);
            L13: while (true) {
              if (var13 == null) {
                break L12;
              } else {
                ((jea) var13).a(-1, param1, ((jea) var13).field_t, ((jea) var13).field_G, ((jea) var13).field_q, ((jea) var13).field_A);
                var13 = (Object) (Object) (jea) (Object) ((jea) var13).field_J.a(-1);
                continue L13;
              }
            }
          } else {
            break L12;
          }
        }
        L14: {
          if (!((jea) var13).field_pb) {
            break L14;
          } else {
            ula.field_w = true;
            break L14;
          }
        }
        L15: {
          if (var12 != 0) {
            ow.field_s = true;
            break L15;
          } else {
            break L15;
          }
        }
        L16: {
          bea.b(var8, var9, var10, var11);
          if (0 == ((jea) var13).field_E) {
            break L16;
          } else {
            if (((jea) var13).field_F) {
              L17: {
                ((jea) this).field_qb = -param4 + jba.field_j - ((jea) var13).field_p;
                ((jea) this).field_T = -param5 + -((jea) var13).field_kb + sta.field_B;
                if (((jea) var13).field_qb < 0) {
                  ((jea) this).field_qb = 0;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (-((jea) var13).field_G + param3 < ((jea) var13).field_qb) {
                  ((jea) this).field_qb = param3 - ((jea) var13).field_G;
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (0 > ((jea) var13).field_T) {
                  ((jea) this).field_T = 0;
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                ((jea) this).field_K = 0;
                ((jea) this).field_q = param4 + ((jea) var13).field_qb;
                if (((jea) var13).field_T <= param2 + -((jea) var13).field_t) {
                  break L20;
                } else {
                  ((jea) this).field_T = -((jea) var13).field_t + param2;
                  break L20;
                }
              }
              ((jea) this).field_Y = 0;
              ((jea) this).field_A = ((jea) var13).field_T + param5;
              break L16;
            } else {
              break L16;
            }
          }
        }
    }

    final int b(byte param0) {
        if (param0 != 69) {
            return 93;
        }
        return ((jea) this).a(2147483647, false);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ((jea) this).field_T = param3;
        ((jea) this).field_K = 0;
        if (param2 != -23776) {
          return;
        } else {
          ((jea) this).field_G = param0;
          ((jea) this).field_Y = 0;
          ((jea) this).field_mb = 0;
          ((jea) this).field_O = 0;
          ((jea) this).field_qb = param4;
          ((jea) this).field_t = param1;
          return;
        }
    }

    private final void a(boolean param0, int param1, int param2, boolean param3, boolean param4, boolean param5, boolean param6, int param7, int param8, boolean param9, int param10) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        iu[] var16 = null;
        iu var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        Object var23 = null;
        int var23_int = 0;
        jea var23_ref = null;
        int var24 = 0;
        int var25 = 0;
        String var26 = null;
        String var27 = null;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          var23 = null;
          var25 = TombRacer.field_G ? 1 : 0;
          ((jea) this).field_q = param7 - -((jea) this).field_qb;
          ((jea) this).field_A = param8 + ((jea) this).field_T;
          var12 = bea.field_b;
          var13 = bea.field_h;
          var14 = bea.field_d;
          var15 = bea.field_k;
          bea.g(((jea) this).field_q, ((jea) this).field_A, ((jea) this).field_G + ((jea) this).field_q, ((jea) this).field_A + ((jea) this).field_t);
          if (!((jea) this).field_Q) {
            L1: {
              param0 = ((jea) this).field_o;
              if (0 == ((jea) this).field_E) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            param4 = stackIn_5_0 != 0;
            param6 = ((jea) this).field_cb;
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          param5 = param5 & ((jea) this).field_X;
          var16 = ((jea) this).field_w;
          var17 = ((jea) this).field_R;
          var18 = ((jea) this).field_ib;
          var19 = 0;
          if (param5) {
            break L2;
          } else {
            L3: {
              if (null != ((jea) this).field_B) {
                var17 = ((jea) this).field_B;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (null == ((jea) this).field_M) {
                break L4;
              } else {
                var16 = ((jea) this).field_M;
                break L4;
              }
            }
            if (((jea) this).field_hb >= 0) {
              var18 = ((jea) this).field_hb;
              break L2;
            } else {
              break L2;
            }
          }
        }
        L5: {
          var20 = 0;
          if (param0) {
            L6: {
              if (((jea) this).field_jb != -2147483648) {
                var20 = ((jea) this).field_jb;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (((jea) this).field_C != null) {
                var16 = ((jea) this).field_C;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (((jea) this).field_u != -2147483648) {
                var19 = ((jea) this).field_u;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (((jea) this).field_ab < 0) {
                break L9;
              } else {
                var18 = ((jea) this).field_ab;
                break L9;
              }
            }
            if (null != ((jea) this).field_rb) {
              var17 = ((jea) this).field_rb;
              break L5;
            } else {
              break L5;
            }
          } else {
            break L5;
          }
        }
        L10: {
          if (param4) {
            L11: {
              if (null != ((jea) this).field_U) {
                var17 = ((jea) this).field_U;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (-2147483648 != ((jea) this).field_ob) {
                var20 = ((jea) this).field_ob;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (((jea) this).field_db == null) {
                break L13;
              } else {
                var16 = ((jea) this).field_db;
                break L13;
              }
            }
            L14: {
              if (((jea) this).field_W != -2147483648) {
                var19 = ((jea) this).field_W;
                break L14;
              } else {
                break L14;
              }
            }
            if (0 <= ((jea) this).field_N) {
              var18 = ((jea) this).field_N;
              break L10;
            } else {
              break L10;
            }
          } else {
            break L10;
          }
        }
        L15: {
          if (param6) {
            L16: {
              if (((jea) this).field_n == null) {
                break L16;
              } else {
                var16 = ((jea) this).field_n;
                break L16;
              }
            }
            L17: {
              if (((jea) this).field_gb < 0) {
                break L17;
              } else {
                var18 = ((jea) this).field_gb;
                break L17;
              }
            }
            L18: {
              if (((jea) this).field_v == -2147483648) {
                break L18;
              } else {
                var20 = ((jea) this).field_v;
                break L18;
              }
            }
            L19: {
              if (((jea) this).field_fb != -2147483648) {
                var19 = ((jea) this).field_fb;
                break L19;
              } else {
                break L19;
              }
            }
            if (null != ((jea) this).field_lb) {
              var17 = ((jea) this).field_lb;
              break L15;
            } else {
              break L15;
            }
          } else {
            break L15;
          }
        }
        L20: {
          var21 = var19 + ((jea) this).field_S;
          var22 = var20 + ((jea) this).field_V;
          if (((jea) this).field_eb) {
            rsa.a(param2, var16, param8, -117, param10, param7);
            break L20;
          } else {
            rsa.a(((jea) this).field_t, var16, ((jea) this).field_A, -120, ((jea) this).field_G, ((jea) this).field_q);
            break L20;
          }
        }
        L21: {
          if (var17 != null) {
            L22: {
              var23_int = ((jea) this).field_q - -var21;
              var24 = ((jea) this).field_A + var22;
              if (((jea) this).field_z != 1) {
                break L22;
              } else {
                var23_int = var23_int + (((jea) this).field_G + -var17.field_n) / 2;
                break L22;
              }
            }
            L23: {
              if (2 == ((jea) this).field_z) {
                var23_int = var23_int + (-var17.field_n + ((jea) this).field_G);
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              if (((jea) this).field_bb != 1) {
                break L24;
              } else {
                var24 = var24 + (-var17.field_k + ((jea) this).field_t) / 2;
                break L24;
              }
            }
            L25: {
              if (((jea) this).field_bb == 2) {
                var24 = var24 + (-var17.field_k + ((jea) this).field_t);
                break L25;
              } else {
                break L25;
              }
            }
            if (256 <= ((jea) this).field_I) {
              var17.b(var23_int, var24);
              break L21;
            } else {
              var17.c(var23_int, var24, ((jea) this).field_I);
              break L21;
            }
          } else {
            break L21;
          }
        }
        L26: {
          if (null == ((jea) this).field_r) {
            break L26;
          } else {
            if (((jea) this).field_H != null) {
              L27: {
                var26 = ((jea) this).field_r;
                var27 = var26;
                var27 = var26;
                if (!param3) {
                  break L27;
                } else {
                  if (((jea) this).field_sb != null) {
                    var27 = var26 + ((jea) this).field_sb;
                    break L27;
                  } else {
                    break L27;
                  }
                }
              }
              L28: {
                if (((jea) this).field_H.b(var27) > -(2 * ((jea) this).field_x) + ((jea) this).field_G) {
                  break L28;
                } else {
                  if (var27.indexOf("<br>") < 0) {
                    L29: {
                      if (((jea) this).field_bb != 1) {
                        if (2 != ((jea) this).field_bb) {
                          break L29;
                        } else {
                          var22 = var22 + (-((jea) this).field_H.field_w + -((jea) this).field_H.field_k + ((jea) this).field_t);
                          break L29;
                        }
                      } else {
                        var22 = var22 + (-((jea) this).field_H.field_k + -((jea) this).field_H.field_w + ((jea) this).field_t) / 2;
                        break L29;
                      }
                    }
                    if (((jea) this).field_z == 0) {
                      ((jea) this).field_H.b(var27, var21 + ((jea) this).field_x + ((jea) this).field_q, var22 + (((jea) this).field_A - -((jea) this).field_H.field_w), var18, -1, ((jea) this).field_s);
                      break L26;
                    } else {
                      if (((jea) this).field_z != 1) {
                        if (2 != ((jea) this).field_z) {
                          int discarded$2 = ((jea) this).field_H.a(var27, var21 + ((jea) this).field_q + ((jea) this).field_x, var22 + ((jea) this).field_A, -(2 * ((jea) this).field_x) + ((jea) this).field_G, ((jea) this).field_t, var18, -1, ((jea) this).field_s, ((jea) this).field_z, ((jea) this).field_bb, ((jea) this).field_P);
                          break L26;
                        } else {
                          ((jea) this).field_H.a(var27, var21 + (((jea) this).field_q + ((jea) this).field_x - -((jea) this).field_G - ((jea) this).field_x * 2), ((jea) this).field_A + (var22 + ((jea) this).field_H.field_w), var18, -1, ((jea) this).field_s);
                          break L26;
                        }
                      } else {
                        ((jea) this).field_H.c(var27, (-(((jea) this).field_x * 2) + ((jea) this).field_G) / 2 + ((jea) this).field_q + ((jea) this).field_x - -var21, ((jea) this).field_A + var22 + ((jea) this).field_H.field_w, var18, -1, ((jea) this).field_s);
                        break L26;
                      }
                    }
                  } else {
                    break L28;
                  }
                }
              }
              int discarded$3 = ((jea) this).field_H.a(var27, var21 + (((jea) this).field_x + ((jea) this).field_q), var22 + ((jea) this).field_A, ((jea) this).field_G + -(2 * ((jea) this).field_x), ((jea) this).field_t, var18, -1, ((jea) this).field_s, ((jea) this).field_z, ((jea) this).field_bb, ((jea) this).field_P);
              break L26;
            } else {
              break L26;
            }
          }
        }
        L30: {
          if (((jea) this).field_J != null) {
            var23_ref = (jea) (Object) ((jea) this).field_J.f(-80);
            L31: while (true) {
              if (var23_ref == null) {
                break L30;
              } else {
                var23_ref.a(param0, 0, var23_ref.field_t, param3, param4, param5, param6, var19 + var23_ref.field_q, var23_ref.field_A - -var20, var23_ref.field_L, var23_ref.field_G);
                var23_ref = (jea) (Object) var23_ref.field_J.e(108);
                continue L31;
              }
            }
          } else {
            break L30;
          }
        }
        bea.b(var12, var13, var14, var15);
    }

    jea(long param0, jea param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    final void b(int param0, boolean param1) {
        this.a(false, 0, bea.field_a, param1, false, true, false, 0, 0, false, bea.field_g);
        if (param0 <= 34) {
            ((jea) this).field_v = -101;
        }
    }

    final static boolean a(boolean param0, String param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                param2 = dfa.a('_', "", param2, 0);
                int discarded$2 = 0;
                var3 = hua.a(param2);
                if (param1.indexOf(param2) != -1) {
                  break L2;
                } else {
                  if (param1.indexOf(var3) == -1) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("jea.W(").append(true).append(',');
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
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final void a(int param0, jea param1) {
        uja var3 = null;
        RuntimeException var3_ref = null;
        jea var4 = null;
        int var5 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null != ((jea) this).field_J) {
                var3 = new uja(((jea) this).field_J);
                var4 = (jea) (Object) var3.a(true);
                L2: while (true) {
                  if (var4 == null) {
                    break L1;
                  } else {
                    var4.a(-124, param1);
                    var4 = (jea) (Object) var3.a(-1);
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            if (param0 <= -64) {
              L3: {
                stackOut_8_0 = this;
                stackIn_10_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if ((Object) (Object) param1 != this) {
                  stackOut_10_0 = this;
                  stackOut_10_1 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  break L3;
                } else {
                  stackOut_9_0 = this;
                  stackOut_9_1 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  break L3;
                }
              }
              L4: {
                ((jea) this).field_L = stackIn_11_1 != 0;
                if (!((jea) this).field_D) {
                  break L4;
                } else {
                  ((jea) this).field_cb = ((jea) this).field_L;
                  break L4;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("jea.AA(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    final void a(int param0, jea param1, jea param2, byte param3) {
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
              if (param1 != null) {
                param2.field_T = param1.field_T - -param1.field_t - -param0;
                param2.field_K = param1.field_K + param1.field_O;
                break L1;
              } else {
                param2.field_T = 0;
                param2.field_K = 0;
                break L1;
              }
            }
            L2: {
              if (param3 == -122) {
                break L2;
              } else {
                ((jea) this).a(-65);
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
            stackOut_6_1 = new StringBuilder().append("jea.T(").append(param0).append(',');
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
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
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
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param3 + ')');
        }
    }

    public jea() {
        ((jea) this).field_ab = -1;
        ((jea) this).field_L = false;
        ((jea) this).field_N = -1;
        ((jea) this).field_ob = -2147483648;
        ((jea) this).field_s = 256;
        ((jea) this).field_X = true;
        ((jea) this).field_Z = false;
        ((jea) this).field_gb = -1;
        ((jea) this).field_D = false;
        ((jea) this).field_jb = -2147483648;
        ((jea) this).field_u = -2147483648;
        ((jea) this).field_v = -2147483648;
        ((jea) this).field_fb = -2147483648;
        ((jea) this).field_I = 256;
        ((jea) this).field_hb = -1;
        ((jea) this).field_W = -2147483648;
    }

    jea(long param0, jea param1, int param2, int param3, int param4, int param5, String param6) {
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
        ((jea) this).field_ab = -1;
        ((jea) this).field_L = false;
        ((jea) this).field_N = -1;
        ((jea) this).field_ob = -2147483648;
        ((jea) this).field_s = 256;
        ((jea) this).field_X = true;
        ((jea) this).field_Z = false;
        ((jea) this).field_gb = -1;
        ((jea) this).field_D = false;
        ((jea) this).field_jb = -2147483648;
        ((jea) this).field_u = -2147483648;
        ((jea) this).field_v = -2147483648;
        ((jea) this).field_fb = -2147483648;
        ((jea) this).field_I = 256;
        ((jea) this).field_hb = -1;
        ((jea) this).field_W = -2147483648;
        try {
          L0: {
            L1: {
              ((jea) this).field_qb = param2;
              ((jea) this).field_G = param4;
              ((jea) this).field_d = param0;
              ((jea) this).field_t = param5;
              ((jea) this).field_T = param3;
              ((jea) this).a(false, param1);
              if (param6 == null) {
                break L1;
              } else {
                ((jea) this).field_r = param6;
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
            stackOut_4_1 = new StringBuilder().append("jea.<init>(").append(param0).append(',');
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
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
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_nb = "<%0>'s game";
    }
}
