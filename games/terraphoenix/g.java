/*
 * Decompiled by CFR-JS 0.4.0.
 */
class g extends wa {
    private int field_U;
    ci[] field_eb;
    ci[] field_V;
    int field_pb;
    private ci[] field_sb;
    private int field_J;
    static int field_cb;
    private int field_db;
    private int field_jb;
    private int field_F;
    int field_ib;
    private ci field_fb;
    private boolean field_Z;
    private int field_Cb;
    private String field_K;
    int field_lb;
    static String field_ab;
    private int field_hb;
    private int field_Q;
    private int field_A;
    int field_R;
    private ci field_y;
    private jj field_L;
    private int field_v;
    int field_x;
    private ci field_xb;
    private int field_O;
    int field_W;
    static String field_qb;
    private int field_P;
    boolean field_z;
    ci[] field_X;
    private boolean field_Ab;
    boolean field_zb;
    private int field_wb;
    int field_gb;
    static String field_nb;
    private int field_E;
    private int field_u;
    private String field_B;
    private int field_vb;
    private int field_ub;
    private int field_M;
    private pk field_S;
    private boolean field_T;
    ci field_ob;
    private ci field_w;
    boolean field_kb;
    private int field_H;
    private ci[] field_yb;
    static boolean field_tb;
    private int field_bb;
    private int field_Y;
    private int field_G;
    private boolean field_I;
    private boolean field_mb;
    private int field_rb;
    int field_Bb;
    private int field_C;
    private boolean field_D;
    int field_N;

    final void a(byte param0, boolean param1) {
        if (param0 != -36) {
            ((g) this).field_Bb = -103;
        }
        this.a(l.field_k, 0, false, true, l.field_j, true, param1, false, 0, false, false);
    }

    public static void d() {
        field_ab = null;
        field_nb = null;
        field_qb = null;
    }

    private final void a(int param0, int param1, byte param2, int param3, boolean param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
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
          var14 = Terraphoenix.field_V;
          if (((g) this).field_F > 0) {
            var7 = -(-((g) this).field_F >> 2);
            break L0;
          } else {
            var7 = ((g) this).field_F >> 2;
            break L0;
          }
        }
        L1: {
          ((g) this).field_F = ((g) this).field_F - var7;
          ((g) this).field_R = ((g) this).field_R + var7;
          if (((g) this).field_gb <= 0) {
            var7 = ((g) this).field_gb >> 2;
            break L1;
          } else {
            var7 = -(-((g) this).field_gb >> 2);
            break L1;
          }
        }
        L2: {
          ((g) this).field_gb = ((g) this).field_gb - var7;
          ((g) this).field_ib = ((g) this).field_ib + var7;
          if (((g) this).field_C > 0) {
            var7 = -(-((g) this).field_C >> 2);
            break L2;
          } else {
            var7 = ((g) this).field_C >> 2;
            break L2;
          }
        }
        L3: {
          ((g) this).field_C = ((g) this).field_C - var7;
          ((g) this).field_x = ((g) this).field_x + var7;
          if (0 >= ((g) this).field_W) {
            var7 = ((g) this).field_W >> 2;
            break L3;
          } else {
            var7 = -(-((g) this).field_W >> 2);
            break L3;
          }
        }
        L4: {
          L5: {
            param4 = param4 & ((g) this).field_zb;
            ((g) this).field_Bb = ((g) this).field_ib + param0;
            ((g) this).field_vb = param5 - -((g) this).field_R;
            ((g) this).field_W = ((g) this).field_W - var7;
            ((g) this).field_lb = ((g) this).field_lb + var7;
            var8 = l.field_b;
            var9 = l.field_d;
            var10 = l.field_f;
            var11 = l.field_c;
            l.i(((g) this).field_vb, ((g) this).field_Bb, ((g) this).field_x + ((g) this).field_vb, ((g) this).field_Bb - -((g) this).field_lb);
            var12 = 0;
            if (mm.field_b) {
              break L5;
            } else {
              if (!param4) {
                break L5;
              } else {
                if (ma.field_I == 0) {
                  break L5;
                } else {
                  if (mm.field_c < l.field_b) {
                    break L5;
                  } else {
                    if (mm.field_c >= l.field_f) {
                      break L5;
                    } else {
                      if (l.field_d > lm.field_c) {
                        break L5;
                      } else {
                        if (l.field_c > lm.field_c) {
                          ((g) this).field_pb = ma.field_I;
                          var12 = 1;
                          ((g) this).field_Y = -((g) this).field_Bb + lm.field_c;
                          ((g) this).field_Q = -((g) this).field_vb + mm.field_c;
                          ((g) this).field_N = ma.field_I;
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
          ((g) this).field_pb = 0;
          if (ma.field_I != 0) {
            ((g) this).field_N = 0;
            break L4;
          } else {
            break L4;
          }
        }
        L6: {
          if (oh.field_f != 0) {
            break L6;
          } else {
            ((g) this).field_N = 0;
            break L6;
          }
        }
        L7: {
          L8: {
            stackOut_26_0 = this;
            stackIn_32_0 = stackOut_26_0;
            stackIn_27_0 = stackOut_26_0;
            if (gi.field_w) {
              break L8;
            } else {
              stackOut_27_0 = this;
              stackIn_32_0 = stackOut_27_0;
              stackIn_28_0 = stackOut_27_0;
              if (ef.field_j < l.field_b) {
                break L8;
              } else {
                stackOut_28_0 = this;
                stackIn_32_0 = stackOut_28_0;
                stackIn_29_0 = stackOut_28_0;
                if (l.field_f <= ef.field_j) {
                  break L8;
                } else {
                  stackOut_29_0 = this;
                  stackIn_32_0 = stackOut_29_0;
                  stackIn_30_0 = stackOut_29_0;
                  if (jb.field_b < l.field_d) {
                    break L8;
                  } else {
                    stackOut_30_0 = this;
                    stackIn_32_0 = stackOut_30_0;
                    stackIn_31_0 = stackOut_30_0;
                    if (l.field_c <= jb.field_b) {
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
            ((g) this).field_D = stackIn_33_1 != 0;
            stackOut_33_0 = this;
            stackIn_37_0 = stackOut_33_0;
            stackIn_34_0 = stackOut_33_0;
            if (!((g) this).field_D) {
              break L10;
            } else {
              stackOut_34_0 = this;
              stackIn_37_0 = stackOut_34_0;
              stackIn_35_0 = stackOut_34_0;
              if (((g) this).field_N != oh.field_f) {
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
          ((g) this).field_Z = stackIn_38_1 != 0;
          if (null != ((g) this).field_L) {
            var13 = (Object) (Object) (g) (Object) ((g) this).field_L.c((byte) 127);
            L12: while (true) {
              if (var13 == null) {
                break L11;
              } else {
                ((g) var13).a(((g) var13).field_Bb, ((g) var13).field_lb, (byte) -8, ((g) var13).field_x, param4, ((g) var13).field_vb);
                var13 = (Object) (Object) (g) (Object) ((g) var13).field_L.b(-115);
                continue L12;
              }
            }
          } else {
            break L11;
          }
        }
        L13: {
          if (var12 != 0) {
            mm.field_b = true;
            break L13;
          } else {
            break L13;
          }
        }
        L14: {
          if (((g) var13).field_D) {
            gi.field_w = true;
            break L14;
          } else {
            break L14;
          }
        }
        L15: {
          l.c(var8, var9, var10, var11);
          if (((g) var13).field_N == 0) {
            break L15;
          } else {
            if (!((g) var13).field_kb) {
              break L15;
            } else {
              L16: {
                ((g) this).field_ib = jb.field_b - (((g) var13).field_Y - -param0);
                ((g) this).field_R = -((g) var13).field_Q + (ef.field_j - param5);
                if (-1 < ((g) var13).field_R) {
                  ((g) this).field_R = 0;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (-1 > ((g) var13).field_ib) {
                  ((g) this).field_ib = 0;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (((g) var13).field_R > -((g) var13).field_x + param3) {
                  ((g) this).field_R = param3 - ((g) var13).field_x;
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                ((g) this).field_F = 0;
                if (param1 - ((g) var13).field_lb >= ((g) var13).field_ib) {
                  break L19;
                } else {
                  ((g) this).field_ib = -((g) var13).field_lb + param1;
                  break L19;
                }
              }
              ((g) this).field_gb = 0;
              ((g) this).field_vb = param5 + ((g) var13).field_R;
              ((g) this).field_Bb = param0 - -((g) var13).field_ib;
              break L15;
            }
          }
        }
    }

    final void a(g param0, int param1) {
        try {
            if (((g) this).field_L == null) {
                ((g) this).field_L = new jj();
            }
            if (param1 != -14951) {
                ((g) this).field_w = null;
            }
            ((g) this).field_L.a((uf) (Object) param0, -16611);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "g.R(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(int param0, boolean param1) {
        gi.field_w = !param1 ? true : false;
        mm.field_b = !param1 ? true : false;
        this.a(0, l.field_j, (byte) -8, l.field_k, true, 0);
        if (param0 >= -7) {
            ((g) this).field_ob = null;
        }
    }

    g(long param0, g param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    private final void a(int param0, g param1) {
        RuntimeException var3 = null;
        Object stackIn_79_0 = null;
        Object stackIn_80_0 = null;
        Object stackIn_81_0 = null;
        Object stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_104_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_78_0 = null;
        Object stackOut_79_0 = null;
        Object stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        Object stackOut_81_0 = null;
        int stackOut_81_1 = 0;
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
              if (param1 != null) {
                L2: {
                  if (param1.field_U < 0) {
                    break L2;
                  } else {
                    ((g) this).field_U = param1.field_U;
                    break L2;
                  }
                }
                L3: {
                  if (param1.field_V == null) {
                    break L3;
                  } else {
                    ((g) this).field_V = param1.field_V;
                    break L3;
                  }
                }
                L4: {
                  if (param1.field_M >= 0) {
                    ((g) this).field_M = param1.field_M;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param1.field_Ab) {
                    ((g) this).field_Ab = param1.field_Ab;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (null == param1.field_xb) {
                    break L6;
                  } else {
                    ((g) this).field_xb = param1.field_xb;
                    break L6;
                  }
                }
                L7: {
                  if (null == param1.field_yb) {
                    break L7;
                  } else {
                    ((g) this).field_yb = param1.field_yb;
                    break L7;
                  }
                }
                L8: {
                  if (null != param1.field_B) {
                    ((g) this).field_B = param1.field_B;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (param1.field_X != null) {
                    ((g) this).field_X = param1.field_X;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (!param1.field_mb) {
                    break L10;
                  } else {
                    ((g) this).field_mb = param1.field_mb;
                    break L10;
                  }
                }
                L11: {
                  if (param1.field_y != null) {
                    ((g) this).field_y = param1.field_y;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (256 == param1.field_E) {
                    break L12;
                  } else {
                    ((g) this).field_E = param1.field_E;
                    break L12;
                  }
                }
                L13: {
                  if (null != param1.field_sb) {
                    ((g) this).field_sb = param1.field_sb;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (0 == param1.field_A) {
                    break L14;
                  } else {
                    ((g) this).field_A = param1.field_A;
                    break L14;
                  }
                }
                L15: {
                  if (!param1.field_I) {
                    break L15;
                  } else {
                    ((g) this).field_I = param1.field_I;
                    break L15;
                  }
                }
                L16: {
                  if (param1.field_z) {
                    ((g) this).field_z = param1.field_z;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (param1.field_G >= 0) {
                    ((g) this).field_G = param1.field_G;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (0 <= param1.field_rb) {
                    ((g) this).field_rb = param1.field_rb;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (param1.field_zb) {
                    break L19;
                  } else {
                    ((g) this).field_zb = param1.field_zb;
                    break L19;
                  }
                }
                L20: {
                  if (param1.field_K == null) {
                    break L20;
                  } else {
                    ((g) this).field_K = param1.field_K;
                    break L20;
                  }
                }
                L21: {
                  if (param1.field_v == 0) {
                    break L21;
                  } else {
                    ((g) this).field_v = param1.field_v;
                    break L21;
                  }
                }
                L22: {
                  if (param1.field_w != null) {
                    ((g) this).field_w = param1.field_w;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (param1.field_O == 0) {
                    break L23;
                  } else {
                    ((g) this).field_O = param1.field_O;
                    break L23;
                  }
                }
                L24: {
                  if (null != param1.field_eb) {
                    ((g) this).field_eb = param1.field_eb;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (param1.field_S != null) {
                    ((g) this).field_S = param1.field_S;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (null == param1.field_fb) {
                    break L26;
                  } else {
                    ((g) this).field_fb = param1.field_fb;
                    break L26;
                  }
                }
                L27: {
                  if (param1.field_ob != null) {
                    ((g) this).field_ob = param1.field_ob;
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L28: {
                  if (0 != param1.field_wb) {
                    ((g) this).field_wb = param1.field_wb;
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  if (2147483647 != param1.field_hb) {
                    ((g) this).field_hb = param1.field_hb;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (2147483647 != param1.field_P) {
                    ((g) this).field_P = param1.field_P;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (param1.field_H == 0) {
                    break L31;
                  } else {
                    ((g) this).field_H = param1.field_H;
                    break L31;
                  }
                }
                L32: {
                  L33: {
                    stackOut_78_0 = this;
                    stackIn_81_0 = stackOut_78_0;
                    stackIn_79_0 = stackOut_78_0;
                    if (!((g) this).field_I) {
                      break L33;
                    } else {
                      stackOut_79_0 = this;
                      stackIn_81_0 = stackOut_79_0;
                      stackIn_80_0 = stackOut_79_0;
                      if (!param1.field_T) {
                        break L33;
                      } else {
                        stackOut_80_0 = this;
                        stackOut_80_1 = 1;
                        stackIn_82_0 = stackOut_80_0;
                        stackIn_82_1 = stackOut_80_1;
                        break L32;
                      }
                    }
                  }
                  stackOut_81_0 = this;
                  stackOut_81_1 = 0;
                  stackIn_82_0 = stackOut_81_0;
                  stackIn_82_1 = stackOut_81_1;
                  break L32;
                }
                L34: {
                  ((g) this).field_T = stackIn_82_1 != 0;
                  if (0 == param1.field_ub) {
                    break L34;
                  } else {
                    ((g) this).field_ub = param1.field_ub;
                    break L34;
                  }
                }
                L35: {
                  if (param1.field_bb != 0) {
                    ((g) this).field_bb = param1.field_bb;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                L36: {
                  if (param1.field_db == -2147483648) {
                    break L36;
                  } else {
                    ((g) this).field_db = param1.field_db;
                    break L36;
                  }
                }
                L37: {
                  if (param1.field_kb) {
                    ((g) this).field_kb = param1.field_kb;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                L38: {
                  if (-2147483648 != param1.field_u) {
                    ((g) this).field_u = param1.field_u;
                    break L38;
                  } else {
                    break L38;
                  }
                }
                L39: {
                  if (-2147483648 == param1.field_Cb) {
                    break L39;
                  } else {
                    ((g) this).field_Cb = param1.field_Cb;
                    break L39;
                  }
                }
                if (-2147483648 != param1.field_J) {
                  ((g) this).field_J = param1.field_J;
                  break L1;
                } else {
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
            stackOut_101_0 = (RuntimeException) var3;
            stackOut_101_1 = new StringBuilder().append("g.O(").append(0).append(44);
            stackIn_103_0 = stackOut_101_0;
            stackIn_103_1 = stackOut_101_1;
            stackIn_102_0 = stackOut_101_0;
            stackIn_102_1 = stackOut_101_1;
            if (param1 == null) {
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
          throw qk.a((Throwable) (Object) stackIn_104_0, stackIn_104_2 + 41);
        }
    }

    private final void a(int param0, int param1, boolean param2, boolean param3, int param4, boolean param5, boolean param6, boolean param7, int param8, boolean param9, boolean param10) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        ci[] var16 = null;
        ci var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        Object var23 = null;
        int var23_int = 0;
        g var23_ref = null;
        int var24 = 0;
        int var25 = 0;
        String var26 = null;
        String var27 = null;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          var23 = null;
          var25 = Terraphoenix.field_V;
          ((g) this).field_vb = ((g) this).field_R + param1;
          ((g) this).field_Bb = param8 + ((g) this).field_ib;
          var12 = l.field_b;
          var13 = l.field_d;
          var14 = l.field_f;
          var15 = l.field_c;
          l.i(((g) this).field_vb, ((g) this).field_Bb, ((g) this).field_vb - -((g) this).field_x, ((g) this).field_Bb - -((g) this).field_lb);
          param5 = param5 & ((g) this).field_zb;
          if (!((g) this).field_Ab) {
            L1: {
              param10 = ((g) this).field_Z;
              if (((g) this).field_N == 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            param9 = stackIn_5_0 != 0;
            param7 = ((g) this).field_mb;
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          var16 = ((g) this).field_X;
          var17 = ((g) this).field_ob;
          var18 = ((g) this).field_O;
          var19 = 0;
          if (!param5) {
            L3: {
              if (((g) this).field_xb == null) {
                break L3;
              } else {
                var17 = ((g) this).field_xb;
                break L3;
              }
            }
            L4: {
              if (((g) this).field_U >= 0) {
                var18 = ((g) this).field_U;
                break L4;
              } else {
                break L4;
              }
            }
            if (((g) this).field_sb == null) {
              break L2;
            } else {
              var16 = ((g) this).field_sb;
              break L2;
            }
          } else {
            break L2;
          }
        }
        L5: {
          var20 = 0;
          if (!param10) {
            break L5;
          } else {
            L6: {
              if (((g) this).field_fb != null) {
                var17 = ((g) this).field_fb;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (((g) this).field_V != null) {
                var16 = ((g) this).field_V;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (((g) this).field_Cb != -2147483648) {
                var20 = ((g) this).field_Cb;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (((g) this).field_P != -2147483648) {
                var19 = ((g) this).field_P;
                break L9;
              } else {
                break L9;
              }
            }
            if (0 > ((g) this).field_M) {
              break L5;
            } else {
              var18 = ((g) this).field_M;
              break L5;
            }
          }
        }
        L10: {
          if (param9) {
            L11: {
              if (((g) this).field_J != -2147483648) {
                var19 = ((g) this).field_J;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (-2147483648 == ((g) this).field_hb) {
                break L12;
              } else {
                var20 = ((g) this).field_hb;
                break L12;
              }
            }
            L13: {
              if (0 <= ((g) this).field_rb) {
                var18 = ((g) this).field_rb;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (((g) this).field_eb != null) {
                var16 = ((g) this).field_eb;
                break L14;
              } else {
                break L14;
              }
            }
            if (((g) this).field_y != null) {
              var17 = ((g) this).field_y;
              break L10;
            } else {
              break L10;
            }
          } else {
            break L10;
          }
        }
        L15: {
          if (!param7) {
            break L15;
          } else {
            L16: {
              if (((g) this).field_yb == null) {
                break L16;
              } else {
                var16 = ((g) this).field_yb;
                break L16;
              }
            }
            L17: {
              if (((g) this).field_db != -2147483648) {
                var19 = ((g) this).field_db;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              if (0 > ((g) this).field_G) {
                break L18;
              } else {
                var18 = ((g) this).field_G;
                break L18;
              }
            }
            L19: {
              if (((g) this).field_u == -2147483648) {
                break L19;
              } else {
                var20 = ((g) this).field_u;
                break L19;
              }
            }
            if (null != ((g) this).field_w) {
              var17 = ((g) this).field_w;
              break L15;
            } else {
              break L15;
            }
          }
        }
        L20: {
          var21 = ((g) this).field_wb + var19;
          var22 = var20 + ((g) this).field_bb;
          if (((g) this).field_z) {
            jl.a(var16, param4, param8, param0, (byte) -104, param1);
            break L20;
          } else {
            jl.a(var16, ((g) this).field_lb, ((g) this).field_Bb, ((g) this).field_x, (byte) 91, ((g) this).field_vb);
            break L20;
          }
        }
        L21: {
          if (var17 != null) {
            L22: {
              var23_int = var21 + ((g) this).field_vb;
              if (((g) this).field_ub != 1) {
                break L22;
              } else {
                var23_int = var23_int + (((g) this).field_x + -var17.field_q) / 2;
                break L22;
              }
            }
            L23: {
              var24 = ((g) this).field_Bb + var22;
              if (((g) this).field_ub != 2) {
                break L23;
              } else {
                var23_int = var23_int + (((g) this).field_x - var17.field_q);
                break L23;
              }
            }
            L24: {
              if (((g) this).field_H == 1) {
                var24 = var24 + (-var17.field_u + ((g) this).field_lb) / 2;
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              if (2 != ((g) this).field_H) {
                break L25;
              } else {
                var24 = var24 + (-var17.field_u + ((g) this).field_lb);
                break L25;
              }
            }
            if (((g) this).field_jb >= 256) {
              var17.b(var23_int, var24);
              break L21;
            } else {
              var17.a(var23_int, var24, ((g) this).field_jb);
              break L21;
            }
          } else {
            break L21;
          }
        }
        L26: {
          if (((g) this).field_B == null) {
            break L26;
          } else {
            if (((g) this).field_S != null) {
              L27: {
                var26 = ((g) this).field_B;
                var27 = var26;
                var27 = var26;
                if (!param6) {
                  break L27;
                } else {
                  if (((g) this).field_K != null) {
                    var27 = var26 + ((g) this).field_K;
                    break L27;
                  } else {
                    break L27;
                  }
                }
              }
              L28: {
                if (~((g) this).field_S.b(var27) < ~(-(((g) this).field_v * 2) + ((g) this).field_x)) {
                  break L28;
                } else {
                  if (var27.indexOf("<br>") >= 0) {
                    break L28;
                  } else {
                    L29: {
                      if (1 == ((g) this).field_H) {
                        var22 = var22 + (-((g) this).field_S.field_p + ((g) this).field_lb - ((g) this).field_S.field_s) / 2;
                        break L29;
                      } else {
                        if (2 == ((g) this).field_H) {
                          var22 = var22 + (-((g) this).field_S.field_s + (((g) this).field_lb - ((g) this).field_S.field_p));
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                    }
                    if (0 != ((g) this).field_ub) {
                      if (((g) this).field_ub != 1) {
                        if (((g) this).field_ub != 2) {
                          int discarded$2 = ((g) this).field_S.a(var27, var21 + ((g) this).field_vb + ((g) this).field_v, var22 + ((g) this).field_Bb, ((g) this).field_x + -(((g) this).field_v * 2), ((g) this).field_lb, var18, -1, ((g) this).field_E, ((g) this).field_ub, ((g) this).field_H, ((g) this).field_A);
                          break L26;
                        } else {
                          ((g) this).field_S.c(var27, ((g) this).field_x - (2 * ((g) this).field_v - ((g) this).field_vb + -((g) this).field_v - var21), ((g) this).field_S.field_s + (((g) this).field_Bb - -var22), var18, -1, ((g) this).field_E);
                          break L26;
                        }
                      } else {
                        ((g) this).field_S.b(var27, ((g) this).field_v + ((g) this).field_vb - -var21 + (-(((g) this).field_v * 2) + ((g) this).field_x) / 2, ((g) this).field_S.field_s + var22 + ((g) this).field_Bb, var18, -1, ((g) this).field_E);
                        break L26;
                      }
                    } else {
                      ((g) this).field_S.a(var27, ((g) this).field_v + (((g) this).field_vb + var21), var22 + ((g) this).field_Bb + ((g) this).field_S.field_s, var18, -1, ((g) this).field_E);
                      break L26;
                    }
                  }
                }
              }
              int discarded$3 = ((g) this).field_S.a(var27, ((g) this).field_v + (((g) this).field_vb + var21), var22 + ((g) this).field_Bb, ((g) this).field_x + -(((g) this).field_v * 2), ((g) this).field_lb, var18, -1, ((g) this).field_E, ((g) this).field_ub, ((g) this).field_H, ((g) this).field_A);
              break L26;
            } else {
              break L26;
            }
          }
        }
        L30: {
          if (null != ((g) this).field_L) {
            var23_ref = (g) (Object) ((g) this).field_L.d(9272);
            L31: while (true) {
              if (var23_ref == null) {
                break L30;
              } else {
                var23_ref.a(var23_ref.field_x, var23_ref.field_vb + var19, var23_ref.field_T, true, var23_ref.field_lb, param5, param6, param7, var20 + var23_ref.field_Bb, param9, param10);
                var23_ref = (g) (Object) var23_ref.field_L.e((byte) -119);
                continue L31;
              }
            }
          } else {
            break L30;
          }
        }
        l.c(var12, var13, var14, var15);
    }

    private g(long param0, g param1, int param2, int param3, int param4, int param5, String param6) {
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
        ((g) this).field_J = -2147483648;
        ((g) this).field_Cb = -2147483648;
        ((g) this).field_hb = -2147483648;
        ((g) this).field_P = -2147483648;
        ((g) this).field_db = -2147483648;
        ((g) this).field_zb = true;
        ((g) this).field_T = false;
        ((g) this).field_u = -2147483648;
        ((g) this).field_jb = 256;
        ((g) this).field_U = -1;
        ((g) this).field_rb = -1;
        ((g) this).field_I = false;
        ((g) this).field_G = -1;
        ((g) this).field_M = -1;
        ((g) this).field_E = 256;
        try {
          L0: {
            L1: {
              ((g) this).field_g = param0;
              ((g) this).field_lb = param5;
              ((g) this).field_ib = param3;
              ((g) this).field_R = param2;
              ((g) this).field_x = param4;
              this.a(0, param1);
              if (param6 == null) {
                break L1;
              } else {
                ((g) this).field_B = param6;
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
            stackOut_4_1 = new StringBuilder().append("g.<init>(").append(param0).append(44);
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
          throw qk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ab = "Use this alternative as your account name";
        field_cb = 0;
        field_qb = "Return to Main Menu";
        field_nb = "Email (Login):";
    }
}
