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

    public static void c(byte param0) {
        if (param0 > -15) {
            return;
        }
        field_nb = null;
    }

    final void b(int param0, jea param1) {
        if (null == ((jea) this).field_J) {
            ((jea) this).field_J = new vna();
        }
        if (param0 >= -121) {
            this.a(33, true, 32, -78, -54, -31);
        }
        ((jea) this).field_J.b((byte) -115, (vg) (Object) param1);
    }

    final void a(boolean param0, jea param1) {
        Object var4 = null;
        Object stackIn_88_0 = null;
        Object stackIn_89_0 = null;
        Object stackIn_90_0 = null;
        Object stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        Object stackOut_87_0 = null;
        Object stackOut_88_0 = null;
        Object stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        Object stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        L0: {
          if (param1 == null) {
            break L0;
          } else {
            L1: {
              if (param1.field_lb == null) {
                break L1;
              } else {
                ((jea) this).field_lb = param1.field_lb;
                break L1;
              }
            }
            L2: {
              if (!param1.field_X) {
                ((jea) this).field_X = param1.field_X;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1.field_s == 256) {
                break L3;
              } else {
                ((jea) this).field_s = param1.field_s;
                break L3;
              }
            }
            L4: {
              if (param1.field_ib != 0) {
                ((jea) this).field_ib = param1.field_ib;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (null == param1.field_sb) {
                break L5;
              } else {
                ((jea) this).field_sb = param1.field_sb;
                break L5;
              }
            }
            L6: {
              if (param1.field_db == null) {
                break L6;
              } else {
                ((jea) this).field_db = param1.field_db;
                break L6;
              }
            }
            L7: {
              if (param1.field_Q) {
                ((jea) this).field_Q = param1.field_Q;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (param1.field_P == 0) {
                break L8;
              } else {
                ((jea) this).field_P = param1.field_P;
                break L8;
              }
            }
            L9: {
              if (param1.field_U == null) {
                break L9;
              } else {
                ((jea) this).field_U = param1.field_U;
                break L9;
              }
            }
            L10: {
              if (param1.field_n == null) {
                break L10;
              } else {
                ((jea) this).field_n = param1.field_n;
                break L10;
              }
            }
            L11: {
              if (param1.field_hb > -1) {
                break L11;
              } else {
                ((jea) this).field_hb = param1.field_hb;
                break L11;
              }
            }
            L12: {
              if (-1 <= param1.field_ab) {
                ((jea) this).field_ab = param1.field_ab;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (null != param1.field_R) {
                ((jea) this).field_R = param1.field_R;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (param1.field_r != null) {
                ((jea) this).field_r = param1.field_r;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (null != param1.field_rb) {
                ((jea) this).field_rb = param1.field_rb;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (param1.field_x == 0) {
                break L16;
              } else {
                ((jea) this).field_x = param1.field_x;
                break L16;
              }
            }
            L17: {
              if (param1.field_w != null) {
                ((jea) this).field_w = param1.field_w;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              if (!param1.field_eb) {
                break L18;
              } else {
                ((jea) this).field_eb = param1.field_eb;
                break L18;
              }
            }
            L19: {
              if (-1 < (param1.field_N ^ -1)) {
                break L19;
              } else {
                ((jea) this).field_N = param1.field_N;
                break L19;
              }
            }
            L20: {
              if (param1.field_H != null) {
                ((jea) this).field_H = param1.field_H;
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              if (!param1.field_cb) {
                break L21;
              } else {
                ((jea) this).field_cb = param1.field_cb;
                break L21;
              }
            }
            L22: {
              if (param1.field_Z) {
                ((jea) this).field_Z = param1.field_Z;
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              if (param1.field_M == null) {
                break L23;
              } else {
                ((jea) this).field_M = param1.field_M;
                break L23;
              }
            }
            L24: {
              if (param1.field_C != null) {
                ((jea) this).field_C = param1.field_C;
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              if (null != param1.field_B) {
                ((jea) this).field_B = param1.field_B;
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              if (param1.field_gb < 0) {
                break L26;
              } else {
                ((jea) this).field_gb = param1.field_gb;
                break L26;
              }
            }
            L27: {
              if ((param1.field_fb ^ -1) != 2147483647) {
                ((jea) this).field_fb = param1.field_fb;
                break L27;
              } else {
                break L27;
              }
            }
            L28: {
              if (param1.field_v != -2147483648) {
                ((jea) this).field_v = param1.field_v;
                break L28;
              } else {
                break L28;
              }
            }
            L29: {
              if (param1.field_bb == 0) {
                break L29;
              } else {
                ((jea) this).field_bb = param1.field_bb;
                break L29;
              }
            }
            L30: {
              ((jea) this).field_D = param1.field_D;
              if ((param1.field_W ^ -1) != 2147483647) {
                ((jea) this).field_W = param1.field_W;
                break L30;
              } else {
                break L30;
              }
            }
            L31: {
              if (param1.field_V != 0) {
                ((jea) this).field_V = param1.field_V;
                break L31;
              } else {
                break L31;
              }
            }
            L32: {
              if ((param1.field_jb ^ -1) == 2147483647) {
                break L32;
              } else {
                ((jea) this).field_jb = param1.field_jb;
                break L32;
              }
            }
            L33: {
              if (param1.field_ob != -2147483648) {
                ((jea) this).field_ob = param1.field_ob;
                break L33;
              } else {
                break L33;
              }
            }
            L34: {
              if (-2147483648 != param1.field_u) {
                ((jea) this).field_u = param1.field_u;
                break L34;
              } else {
                break L34;
              }
            }
            L35: {
              L36: {
                stackOut_87_0 = this;
                stackIn_90_0 = stackOut_87_0;
                stackIn_88_0 = stackOut_87_0;
                if (!((jea) this).field_Z) {
                  break L36;
                } else {
                  stackOut_88_0 = this;
                  stackIn_90_0 = stackOut_88_0;
                  stackIn_89_0 = stackOut_88_0;
                  if (!param1.field_L) {
                    break L36;
                  } else {
                    stackOut_89_0 = this;
                    stackOut_89_1 = 1;
                    stackIn_91_0 = stackOut_89_0;
                    stackIn_91_1 = stackOut_89_1;
                    break L35;
                  }
                }
              }
              stackOut_90_0 = this;
              stackOut_90_1 = 0;
              stackIn_91_0 = stackOut_90_0;
              stackIn_91_1 = stackOut_90_1;
              break L35;
            }
            L37: {
              ((jea) this).field_L = stackIn_91_1 != 0;
              if (param1.field_S == 0) {
                break L37;
              } else {
                ((jea) this).field_S = param1.field_S;
                break L37;
              }
            }
            L38: {
              if (0 != param1.field_z) {
                ((jea) this).field_z = param1.field_z;
                break L38;
              } else {
                break L38;
              }
            }
            if (param1.field_F) {
              ((jea) this).field_F = param1.field_F;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L39: {
          if (!param0) {
            break L39;
          } else {
            var4 = null;
            ((jea) this).a(-110, (jea) null);
            break L39;
          }
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
        if ((var7 ^ -1) > -1) {
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
        kh var3 = ql.field_k;
        var3.k(param0, param1 ^ -3719);
        var3.i(param2.field_f, 0);
        var3.f(param1 ^ -1477660827, param2.field_j);
        if (param1 != 1325) {
            Object var4 = null;
            jea.a(-121, 50, (aca) null);
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
        jea var13_ref = null;
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
          if (-1 > (((jea) this).field_Y ^ -1)) {
            var7 = -(-((jea) this).field_Y >> -1483701822);
            break L0;
          } else {
            var7 = ((jea) this).field_Y >> 1901725794;
            break L0;
          }
        }
        L1: {
          ((jea) this).field_qb = ((jea) this).field_qb + var7;
          ((jea) this).field_Y = ((jea) this).field_Y - var7;
          if (param0 <= (((jea) this).field_K ^ -1)) {
            var7 = ((jea) this).field_K >> -973780574;
            break L1;
          } else {
            var7 = -(-((jea) this).field_K >> 308668642);
            break L1;
          }
        }
        L2: {
          ((jea) this).field_T = ((jea) this).field_T + var7;
          ((jea) this).field_K = ((jea) this).field_K - var7;
          if (0 >= ((jea) this).field_mb) {
            var7 = ((jea) this).field_mb >> 79193378;
            break L2;
          } else {
            var7 = -(-((jea) this).field_mb >> -1816758590);
            break L2;
          }
        }
        L3: {
          ((jea) this).field_G = ((jea) this).field_G + var7;
          ((jea) this).field_mb = ((jea) this).field_mb - var7;
          if ((((jea) this).field_O ^ -1) < -1) {
            var7 = -(-((jea) this).field_O >> 209474530);
            break L3;
          } else {
            var7 = ((jea) this).field_O >> 1955188578;
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
            var13_ref = (jea) (Object) ((jea) this).field_J.b(3);
            L13: while (true) {
              if (var13_ref == null) {
                break L12;
              } else {
                var13_ref.a(-1, param1, var13_ref.field_t, var13_ref.field_G, var13_ref.field_q, var13_ref.field_A);
                var13_ref = (jea) (Object) var13_ref.field_J.a(-1);
                continue L13;
              }
            }
          } else {
            break L12;
          }
        }
        L14: {
          if (!var13_ref.field_pb) {
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
          if (0 == var13_ref.field_E) {
            break L16;
          } else {
            if (var13_ref.field_F) {
              L17: {
                ((jea) this).field_qb = -param4 + jba.field_j - var13_ref.field_p;
                ((jea) this).field_T = -param5 + -var13_ref.field_kb + sta.field_B;
                if (-1 < (var13_ref.field_qb ^ -1)) {
                  ((jea) this).field_qb = 0;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (-var13_ref.field_G + param3 < var13_ref.field_qb) {
                  ((jea) this).field_qb = param3 - var13_ref.field_G;
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (0 > var13_ref.field_T) {
                  ((jea) this).field_T = 0;
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                ((jea) this).field_K = 0;
                ((jea) this).field_q = param4 + var13_ref.field_qb;
                if (var13_ref.field_T <= param2 + -var13_ref.field_t) {
                  break L20;
                } else {
                  ((jea) this).field_T = -var13_ref.field_t + param2;
                  break L20;
                }
              }
              ((jea) this).field_Y = 0;
              ((jea) this).field_A = var13_ref.field_T + param5;
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
          var19 = param1;
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
              if (2147483647 != (((jea) this).field_jb ^ -1)) {
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
              if ((((jea) this).field_ab ^ -1) > -1) {
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
              if (2147483647 != (((jea) this).field_W ^ -1)) {
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
              if ((((jea) this).field_gb ^ -1) > -1) {
                break L17;
              } else {
                var18 = ((jea) this).field_gb;
                break L17;
              }
            }
            L18: {
              if ((((jea) this).field_v ^ -1) == 2147483647) {
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
            rsa.a(((jea) this).field_t, var16, ((jea) this).field_A, param1 ^ -120, ((jea) this).field_G, ((jea) this).field_q);
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
              if (-3 == (((jea) this).field_bb ^ -1)) {
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
                  if (-1 < (var27.indexOf("<br>") ^ -1)) {
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
                    if (-1 == (((jea) this).field_z ^ -1)) {
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
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (!param0) {
          return false;
        } else {
          L0: {
            L1: {
              param2 = dfa.a('_', "", param2, 0);
              var3 = hua.a(param2, 0);
              if (param1.indexOf(param2) != -1) {
                break L1;
              } else {
                if ((param1.indexOf(var3) ^ -1) == 0) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        }
    }

    final void a(int param0, jea param1) {
        uja var3 = null;
        jea var4 = null;
        int var5 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          if (null != ((jea) this).field_J) {
            var3 = new uja(((jea) this).field_J);
            var4 = (jea) (Object) var3.a(true);
            L1: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                var4.a(-124, param1);
                var4 = (jea) (Object) var3.a(-1);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        if (param0 > -64) {
          return;
        } else {
          L2: {
            stackOut_6_0 = this;
            stackIn_8_0 = stackOut_6_0;
            stackIn_7_0 = stackOut_6_0;
            if ((Object) (Object) param1 != this) {
              stackOut_8_0 = this;
              stackOut_8_1 = 0;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              break L2;
            } else {
              stackOut_7_0 = this;
              stackOut_7_1 = 1;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              break L2;
            }
          }
          L3: {
            ((jea) this).field_L = stackIn_9_1 != 0;
            if (!((jea) this).field_D) {
              break L3;
            } else {
              ((jea) this).field_cb = ((jea) this).field_L;
              break L3;
            }
          }
          return;
        }
    }

    final void a(int param0, jea param1, jea param2, byte param3) {
        if (param1 == null) {
            param2.field_T = 0;
            param2.field_K = 0;
        } else {
            param2.field_T = param1.field_T - -param1.field_t - -param0;
            param2.field_K = param1.field_K + param1.field_O;
        }
        if (param3 != -122) {
            ((jea) this).a(-65);
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
        ((jea) this).field_qb = param2;
        ((jea) this).field_G = param4;
        ((jea) this).field_d = param0;
        ((jea) this).field_t = param5;
        ((jea) this).field_T = param3;
        ((jea) this).a(false, param1);
        if (param6 != null) {
            ((jea) this).field_r = param6;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_nb = "<%0>'s game";
    }
}
