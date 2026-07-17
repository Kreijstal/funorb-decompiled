/*
 * Decompiled by CFR-JS 0.4.0.
 */
class je extends im {
    private boolean field_Db;
    int field_gb;
    int field_L;
    private int field_ib;
    static je field_Q;
    boolean field_ub;
    wk[] field_A;
    at field_fb;
    wk[] field_mb;
    int field_R;
    int field_N;
    boolean field_M;
    int field_hb;
    wk[] field_G;
    boolean field_eb;
    int field_O;
    int field_W;
    private int field_E;
    private boolean field_Cb;
    String field_X;
    wk field_cb;
    int field_tb;
    static String field_zb;
    String field_I;
    int field_V;
    int field_Eb;
    boolean field_Gb;
    int field_Bb;
    int field_pb;
    wk[] field_H;
    int field_nb;
    int field_F;
    private int field_J;
    int field_C;
    boolean field_xb;
    boolean field_rb;
    int field_bb;
    int field_B;
    int field_T;
    int field_yb;
    int field_S;
    int field_ob;
    wk field_P;
    int field_z;
    int field_db;
    static String field_lb;
    private int field_Hb;
    int field_D;
    boolean field_jb;
    int field_wb;
    boolean field_Y;
    int field_Fb;
    private int field_Ab;
    wk[] field_U;
    static int[][] field_K;
    wk field_sb;
    private int field_kb;
    wk field_vb;
    int field_ab;
    wk field_qb;
    ka field_Z;

    final void b(boolean param0, int param1) {
        this.a((byte) -26, qn.field_g, param0, qn.field_l, 0, false, false, false, 0, true, false);
        if (param1 != 20) {
            Object var4 = null;
            ((je) this).a((je) null, false, 64, (je) null);
        }
    }

    final static void c(boolean param0) {
        int var3 = 0;
        L0: {
          L1: {
            var3 = ArmiesOfGielinor.field_M ? 1 : 0;
            if (param0) {
              break L1;
            } else {
              if (null != vu.field_M) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          vk.field_f = false;
          break L0;
        }
        L2: {
          if (!param0) {
            if (null != vu.field_M) {
              if (gk.field_J <= 0) {
                if (bd.field_r <= 0) {
                  if (~mj.field_c < ~rk.field_D) {
                    L3: {
                      if (rk.field_D == 0) {
                        ub.a(false, false);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    rk.field_D = rk.field_D + 1;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  bd.field_r = bd.field_r - 1;
                  break L2;
                }
              } else {
                gk.field_J = gk.field_J - 1;
                break L2;
              }
            } else {
              if (null == no.field_K) {
                vk.field_f = false;
                if (bd.field_r > 0) {
                  bd.field_r = bd.field_r - 1;
                  break L2;
                } else {
                  if (rk.field_D > 0) {
                    rk.field_D = rk.field_D - 1;
                    break L2;
                  } else {
                    if (~mj.field_c < ~gk.field_J) {
                      L4: {
                        if (gk.field_J != 0) {
                          break L4;
                        } else {
                          int discarded$1 = 14570;
                          tr.h();
                          break L4;
                        }
                      }
                      gk.field_J = gk.field_J + 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              } else {
                if (gk.field_J > 0) {
                  gk.field_J = gk.field_J - 1;
                  break L2;
                } else {
                  if (rk.field_D <= 0) {
                    if (~mj.field_c >= ~bd.field_r) {
                      break L2;
                    } else {
                      L5: {
                        if (0 == bd.field_r) {
                          ub.a(false, true);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      bd.field_r = bd.field_r + 1;
                      break L2;
                    }
                  } else {
                    rk.field_D = rk.field_D - 1;
                    break L2;
                  }
                }
              }
            }
          } else {
            if (0 < gk.field_J) {
              gk.field_J = gk.field_J - 1;
              break L2;
            } else {
              if (bd.field_r <= 0) {
                if (0 < rk.field_D) {
                  rk.field_D = rk.field_D - 1;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                bd.field_r = bd.field_r - 1;
                break L2;
              }
            }
          }
        }
    }

    final void a(int param0, je param1) {
        RuntimeException var3 = null;
        Object stackIn_69_0 = null;
        Object stackIn_70_0 = null;
        Object stackIn_71_0 = null;
        Object stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        String stackIn_102_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_68_0 = null;
        Object stackOut_69_0 = null;
        Object stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        Object stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        try {
          L0: {
            L1: {
              if (param1 != null) {
                L2: {
                  if (param1.field_qb != null) {
                    ((je) this).field_qb = param1.field_qb;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param1.field_N != 0) {
                    ((je) this).field_N = param1.field_N;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (!param1.field_ub) {
                    break L4;
                  } else {
                    ((je) this).field_ub = param1.field_ub;
                    break L4;
                  }
                }
                L5: {
                  if (param1.field_sb == null) {
                    break L5;
                  } else {
                    ((je) this).field_sb = param1.field_sb;
                    break L5;
                  }
                }
                L6: {
                  if (param1.field_O != 0) {
                    ((je) this).field_O = param1.field_O;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (!param1.field_Cb) {
                    break L7;
                  } else {
                    ((je) this).field_Cb = param1.field_Cb;
                    break L7;
                  }
                }
                L8: {
                  if (null == param1.field_mb) {
                    break L8;
                  } else {
                    ((je) this).field_mb = param1.field_mb;
                    break L8;
                  }
                }
                L9: {
                  if (!param1.field_rb) {
                    break L9;
                  } else {
                    ((je) this).field_rb = param1.field_rb;
                    break L9;
                  }
                }
                L10: {
                  if (param1.field_A == null) {
                    break L10;
                  } else {
                    ((je) this).field_A = param1.field_A;
                    break L10;
                  }
                }
                L11: {
                  if (param1.field_C == 256) {
                    break L11;
                  } else {
                    ((je) this).field_C = param1.field_C;
                    break L11;
                  }
                }
                L12: {
                  if (param1.field_M) {
                    ((je) this).field_M = param1.field_M;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (0 == param1.field_pb) {
                    break L13;
                  } else {
                    ((je) this).field_pb = param1.field_pb;
                    break L13;
                  }
                }
                L14: {
                  if (null == param1.field_G) {
                    break L14;
                  } else {
                    ((je) this).field_G = param1.field_G;
                    break L14;
                  }
                }
                L15: {
                  if (param1.field_I == null) {
                    break L15;
                  } else {
                    ((je) this).field_I = param1.field_I;
                    break L15;
                  }
                }
                L16: {
                  if (param1.field_P != null) {
                    ((je) this).field_P = param1.field_P;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (null == param1.field_Z) {
                    break L17;
                  } else {
                    ((je) this).field_Z = param1.field_Z;
                    break L17;
                  }
                }
                L18: {
                  if (null == param1.field_cb) {
                    break L18;
                  } else {
                    ((je) this).field_cb = param1.field_cb;
                    break L18;
                  }
                }
                L19: {
                  if (param1.field_T < 0) {
                    break L19;
                  } else {
                    ((je) this).field_T = param1.field_T;
                    break L19;
                  }
                }
                L20: {
                  if (param1.field_wb >= 0) {
                    ((je) this).field_wb = param1.field_wb;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (!param1.field_xb) {
                    ((je) this).field_xb = param1.field_xb;
                    break L21;
                  } else {
                    break L21;
                  }
                }
                L22: {
                  if (null != param1.field_X) {
                    ((je) this).field_X = param1.field_X;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (param1.field_W >= 0) {
                    ((je) this).field_W = param1.field_W;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (0 <= param1.field_L) {
                    ((je) this).field_L = param1.field_L;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (param1.field_H == null) {
                    break L25;
                  } else {
                    ((je) this).field_H = param1.field_H;
                    break L25;
                  }
                }
                L26: {
                  if (param1.field_U != null) {
                    ((je) this).field_U = param1.field_U;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (null != param1.field_vb) {
                    ((je) this).field_vb = param1.field_vb;
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L28: {
                  if (-2147483648 == param1.field_B) {
                    break L28;
                  } else {
                    ((je) this).field_B = param1.field_B;
                    break L28;
                  }
                }
                L29: {
                  L30: {
                    stackOut_68_0 = this;
                    stackIn_71_0 = stackOut_68_0;
                    stackIn_69_0 = stackOut_68_0;
                    if (!((je) this).field_M) {
                      break L30;
                    } else {
                      stackOut_69_0 = this;
                      stackIn_71_0 = stackOut_69_0;
                      stackIn_70_0 = stackOut_69_0;
                      if (!param1.field_Y) {
                        break L30;
                      } else {
                        stackOut_70_0 = this;
                        stackOut_70_1 = 1;
                        stackIn_72_0 = stackOut_70_0;
                        stackIn_72_1 = stackOut_70_1;
                        break L29;
                      }
                    }
                  }
                  stackOut_71_0 = this;
                  stackOut_71_1 = 0;
                  stackIn_72_0 = stackOut_71_0;
                  stackIn_72_1 = stackOut_71_1;
                  break L29;
                }
                L31: {
                  ((je) this).field_Y = stackIn_72_1 != 0;
                  if (param1.field_R != -2147483648) {
                    ((je) this).field_R = param1.field_R;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (param1.field_Gb) {
                    ((je) this).field_Gb = param1.field_Gb;
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L33: {
                  if (param1.field_ib == -2147483648) {
                    break L33;
                  } else {
                    ((je) this).field_ib = param1.field_ib;
                    break L33;
                  }
                }
                L34: {
                  ((je) this).field_Db = param1.field_Db;
                  if (param1.field_z == 0) {
                    break L34;
                  } else {
                    ((je) this).field_z = param1.field_z;
                    break L34;
                  }
                }
                L35: {
                  if (0 == param1.field_Fb) {
                    break L35;
                  } else {
                    ((je) this).field_Fb = param1.field_Fb;
                    break L35;
                  }
                }
                L36: {
                  if (param1.field_E != -2147483648) {
                    ((je) this).field_E = param1.field_E;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (param1.field_Bb == -2147483648) {
                    break L37;
                  } else {
                    ((je) this).field_Bb = param1.field_Bb;
                    break L37;
                  }
                }
                L38: {
                  if (param1.field_Eb != 0) {
                    ((je) this).field_Eb = param1.field_Eb;
                    break L38;
                  } else {
                    break L38;
                  }
                }
                L39: {
                  if (param1.field_tb == -2147483648) {
                    break L39;
                  } else {
                    ((je) this).field_tb = param1.field_tb;
                    break L39;
                  }
                }
                if (param1.field_F == 0) {
                  break L1;
                } else {
                  ((je) this).field_F = param1.field_F;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L40: {
              if (param0 == 0) {
                break L40;
              } else {
                ((je) this).field_M = true;
                break L40;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L41: {
            var3 = decompiledCaughtException;
            stackOut_99_0 = (RuntimeException) var3;
            stackOut_99_1 = new StringBuilder().append("je.TA(").append(param0).append(44);
            stackIn_101_0 = stackOut_99_0;
            stackIn_101_1 = stackOut_99_1;
            stackIn_100_0 = stackOut_99_0;
            stackIn_100_1 = stackOut_99_1;
            if (param1 == null) {
              stackOut_101_0 = (RuntimeException) (Object) stackIn_101_0;
              stackOut_101_1 = (StringBuilder) (Object) stackIn_101_1;
              stackOut_101_2 = "null";
              stackIn_102_0 = stackOut_101_0;
              stackIn_102_1 = stackOut_101_1;
              stackIn_102_2 = stackOut_101_2;
              break L41;
            } else {
              stackOut_100_0 = (RuntimeException) (Object) stackIn_100_0;
              stackOut_100_1 = (StringBuilder) (Object) stackIn_100_1;
              stackOut_100_2 = "{...}";
              stackIn_102_0 = stackOut_100_0;
              stackIn_102_1 = stackOut_100_1;
              stackIn_102_2 = stackOut_100_2;
              break L41;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_102_0, stackIn_102_2 + 41);
        }
    }

    final void a(je param0, int param1) {
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
              if (null == ((je) this).field_fb) {
                ((je) this).field_fb = new at();
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((je) this).field_fb.a((byte) -119, (tc) (Object) param0);
              if (param1 >= 36) {
                break L2;
              } else {
                ((je) this).field_M = true;
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
            stackOut_6_1 = new StringBuilder().append("je.MA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int var9 = 0;
        je var10_ref_je = null;
        int var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param3 != -1379) {
            return;
        }
        int var5 = -((je) this).field_ab;
        int var6 = -((je) this).field_db + var5;
        int var7 = ((je) this).field_ob;
        int var8 = ((je) this).field_nb + var7;
        if (!param0) {
            var9 = 0;
            var10_ref_je = (je) (Object) ((je) this).field_fb.e((byte) 124);
            while (var10_ref_je != null) {
                var10_ref_je.field_db = -var10_ref_je.field_ab + var9;
                var9 = var9 + (param2 + (var10_ref_je.field_nb + var10_ref_je.field_ob));
                var10_ref_je = (je) (Object) ((je) this).field_fb.a((byte) 123);
            }
            var8 = var9 - param2;
        }
        var9 = -param1 + var8;
        if (!(var9 >= var6)) {
            var6 = var9;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var10 = var7 + -param1;
        if (!(var10 >= var5)) {
            var5 = var10;
        }
        if (!(var5 >= 0)) {
            var5 = 0;
        }
        ((je) this).field_ob = var7;
        ((je) this).field_db = -var6 + var5;
        ((je) this).field_nb = -var7 + var8;
        ((je) this).field_ab = -var5;
    }

    je(long param0, je param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    private final void a(boolean param0, boolean param1, int param2, int param3, int param4, int param5) {
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
          var14 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (((je) this).field_J > 0) {
            var7 = -(-((je) this).field_J >> 2);
            break L0;
          } else {
            var7 = ((je) this).field_J >> 2;
            break L0;
          }
        }
        L1: {
          ((je) this).field_J = ((je) this).field_J - var7;
          ((je) this).field_S = ((je) this).field_S + var7;
          if (0 < ((je) this).field_db) {
            var7 = -(-((je) this).field_db >> 2);
            break L1;
          } else {
            var7 = ((je) this).field_db >> 2;
            break L1;
          }
        }
        L2: {
          ((je) this).field_ab = ((je) this).field_ab + var7;
          ((je) this).field_db = ((je) this).field_db - var7;
          if (((je) this).field_Hb > 0) {
            var7 = -(-((je) this).field_Hb >> 2);
            break L2;
          } else {
            var7 = ((je) this).field_Hb >> 2;
            break L2;
          }
        }
        L3: {
          ((je) this).field_gb = ((je) this).field_gb + var7;
          ((je) this).field_Hb = ((je) this).field_Hb - var7;
          if (((je) this).field_nb > 0) {
            var7 = -(-((je) this).field_nb >> 2);
            break L3;
          } else {
            var7 = ((je) this).field_nb >> 2;
            break L3;
          }
        }
        L4: {
          L5: {
            ((je) this).field_V = param5 - -((je) this).field_S;
            param0 = param0 & ((je) this).field_xb;
            ((je) this).field_ob = ((je) this).field_ob + var7;
            ((je) this).field_nb = ((je) this).field_nb - var7;
            ((je) this).field_D = ((je) this).field_ab + param2;
            var8 = qn.field_j;
            var9 = qn.field_a;
            var10 = qn.field_e;
            var11 = qn.field_f;
            qn.b(((je) this).field_V, ((je) this).field_D, ((je) this).field_V + ((je) this).field_gb, ((je) this).field_D + ((je) this).field_ob);
            var12 = param1 ? 1 : 0;
            if (bc.field_e) {
              break L5;
            } else {
              if (!param0) {
                break L5;
              } else {
                if (tr.field_A == 0) {
                  break L5;
                } else {
                  if (qn.field_j > iu.field_t) {
                    break L5;
                  } else {
                    if (iu.field_t >= qn.field_e) {
                      break L5;
                    } else {
                      if (ur.field_z < qn.field_a) {
                        break L5;
                      } else {
                        if (ur.field_z >= qn.field_f) {
                          break L5;
                        } else {
                          ((je) this).field_yb = tr.field_A;
                          ((je) this).field_hb = tr.field_A;
                          ((je) this).field_bb = -((je) this).field_V + iu.field_t;
                          var12 = 1;
                          ((je) this).field_Ab = -((je) this).field_D + ur.field_z;
                          break L4;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          ((je) this).field_yb = 0;
          if (tr.field_A != 0) {
            ((je) this).field_hb = 0;
            break L4;
          } else {
            break L4;
          }
        }
        L6: {
          L7: {
            stackOut_23_0 = this;
            stackIn_29_0 = stackOut_23_0;
            stackIn_24_0 = stackOut_23_0;
            if (bl.field_f) {
              break L7;
            } else {
              stackOut_24_0 = this;
              stackIn_29_0 = stackOut_24_0;
              stackIn_25_0 = stackOut_24_0;
              if (qn.field_j > sm.field_d) {
                break L7;
              } else {
                stackOut_25_0 = this;
                stackIn_29_0 = stackOut_25_0;
                stackIn_26_0 = stackOut_25_0;
                if (qn.field_e <= sm.field_d) {
                  break L7;
                } else {
                  stackOut_26_0 = this;
                  stackIn_29_0 = stackOut_26_0;
                  stackIn_27_0 = stackOut_26_0;
                  if (qn.field_a > ko.field_b) {
                    break L7;
                  } else {
                    stackOut_27_0 = this;
                    stackIn_29_0 = stackOut_27_0;
                    stackIn_28_0 = stackOut_27_0;
                    if (qn.field_f <= ko.field_b) {
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
          ((je) this).field_jb = stackIn_30_1 != 0;
          if (ro.field_ub == 0) {
            ((je) this).field_hb = 0;
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
            if (!((je) this).field_jb) {
              break L10;
            } else {
              stackOut_34_0 = this;
              stackIn_37_0 = stackOut_34_0;
              stackIn_35_0 = stackOut_34_0;
              if (ro.field_ub != ((je) this).field_hb) {
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
          ((je) this).field_eb = stackIn_38_1 != 0;
          if (null == ((je) this).field_fb) {
            break L11;
          } else {
            var13 = (Object) (Object) (je) (Object) ((je) this).field_fb.d((byte) -82);
            L12: while (true) {
              if (var13 == null) {
                break L11;
              } else {
                ((je) var13).a(param0, param1, ((je) var13).field_D, ((je) var13).field_ob, ((je) var13).field_gb, ((je) var13).field_V);
                var13 = (Object) (Object) (je) (Object) ((je) var13).field_fb.b((byte) 88);
                continue L12;
              }
            }
          }
        }
        L13: {
          if (var12 == 0) {
            break L13;
          } else {
            bc.field_e = true;
            break L13;
          }
        }
        L14: {
          if (!((je) var13).field_jb) {
            break L14;
          } else {
            bl.field_f = true;
            break L14;
          }
        }
        L15: {
          qn.f(var8, var9, var10, var11);
          if (((je) var13).field_hb == 0) {
            break L15;
          } else {
            if (((je) var13).field_Gb) {
              L16: {
                ((je) this).field_S = -((je) var13).field_bb + sm.field_d - param5;
                ((je) this).field_ab = -((je) var13).field_Ab + ko.field_b - param2;
                if (0 > ((je) var13).field_S) {
                  ((je) this).field_S = 0;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (((je) var13).field_ab < 0) {
                  ((je) this).field_ab = 0;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (((je) var13).field_S <= param4 - ((je) var13).field_gb) {
                  break L18;
                } else {
                  ((je) this).field_S = -((je) var13).field_gb + param4;
                  break L18;
                }
              }
              L19: {
                ((je) this).field_db = 0;
                if (((je) var13).field_ab <= param3 + -((je) var13).field_ob) {
                  break L19;
                } else {
                  ((je) this).field_ab = param3 - ((je) var13).field_ob;
                  break L19;
                }
              }
              ((je) this).field_V = ((je) var13).field_S + param5;
              ((je) this).field_J = 0;
              ((je) this).field_D = param2 - -((je) var13).field_ab;
              break L15;
            } else {
              break L15;
            }
          }
        }
    }

    final void b(int param0, je param1) {
        bb var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
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
        var4 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 3) {
                break L1;
              } else {
                ((je) this).a(true, 119, -41, -35);
                break L1;
              }
            }
            L2: {
              if (null != ((je) this).field_fb) {
                var3 = new bb(((je) this).field_fb);
                var4 = (Object) (Object) (je) (Object) var3.c(param0 + 47);
                L3: while (true) {
                  if (var4 == null) {
                    break L2;
                  } else {
                    ((je) var4).b(param0, param1);
                    var4 = (Object) (Object) (je) (Object) var3.b(param0 + 47);
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            L4: {
              stackOut_8_0 = this;
              stackIn_10_0 = stackOut_8_0;
              stackIn_9_0 = stackOut_8_0;
              if ((Object) (Object) param1 != this) {
                stackOut_10_0 = this;
                stackOut_10_1 = 0;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                break L4;
              } else {
                stackOut_9_0 = this;
                stackOut_9_1 = 1;
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                break L4;
              }
            }
            L5: {
              ((je) this).field_Y = stackIn_11_1 != 0;
              if (!((je) var4).field_Db) {
                break L5;
              } else {
                ((je) this).field_rb = ((je) var4).field_Y;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("je.DB(").append(param0).append(44);
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
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    final static void a(int param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        je var7 = null;
        int var7_int = 0;
        int var8 = 0;
        je var8_ref_je = null;
        int var9_int = 0;
        nf var9 = null;
        int var10 = 0;
        nf var10_ref_nf = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        je var14 = null;
        int stackIn_4_0 = 0;
        je stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        je stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        je stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_39_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        je stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        je stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        je stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        int stackOut_37_0 = 0;
        int stackOut_38_0 = 0;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              tq.field_c = qn.field_l;
              bm.field_p = qn.field_g;
              if (param1) {
                stackOut_3_0 = bd.field_r;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = rk.field_D;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              qb.a(stackIn_4_0, -106);
              ij.field_w.a(-40 + lk.field_a.field_ob + -2, (byte) -125, 0, lk.field_a.field_gb, 0);
              gg.field_E.a(jn.field_d, -20500, eb.field_c.field_gb, 0, 0);
              stackOut_4_0 = di.field_l;
              stackOut_4_1 = 18;
              stackOut_4_2 = -20500;
              stackOut_4_3 = eb.field_c.field_gb;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              stackIn_6_3 = stackOut_4_3;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              stackIn_5_3 = stackOut_4_3;
              if (fh.field_c) {
                stackOut_6_0 = (je) (Object) stackIn_6_0;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = stackIn_6_2;
                stackOut_6_3 = stackIn_6_3;
                stackOut_6_4 = 2 + jn.field_c - -42;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                stackIn_7_3 = stackOut_6_3;
                stackIn_7_4 = stackOut_6_4;
                break L2;
              } else {
                stackOut_5_0 = (je) (Object) stackIn_5_0;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = stackIn_5_3;
                stackOut_5_4 = 0;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                stackIn_7_3 = stackOut_5_3;
                stackIn_7_4 = stackOut_5_4;
                break L2;
              }
            }
            ((je) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, stackIn_7_3 - stackIn_7_4, 2 + jn.field_d, 0);
            pj.field_D.a(18, -20500, 42 + jn.field_c, 2 + jn.field_d, -40 + (eb.field_c.field_gb + -jn.field_c - 2));
            bu.field_a.a(0, false, eb.field_c.field_gb, 2, jn.field_c, 20 + (2 + jn.field_d), -20 + (-2 + (-jn.field_d + eb.field_c.field_ob)));
            mp.field_Lb.a(40, -20500, lk.field_a.field_gb, lk.field_a.field_ob - 40, 0);
            kd.field_F.a(30, -20500, pd.field_c.field_gb, 0, 0);
            if (param0 >= 13) {
              L3: {
                vc.field_l.a(-2 + pd.field_c.field_ob - 70, -20500, pd.field_c.field_gb, 30, 0);
                var2_int = 3 + tq.field_b;
                if (2 > lm.field_e.length) {
                  var2_int--;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (!param1) {
                  break L4;
                } else {
                  var2_int--;
                  break L4;
                }
              }
              L5: {
                var3 = -2 + (-15 + (-5 + vc.field_l.field_ob + (2 + (1 + var2_int) / 2))) / (var2_int - -1);
                if (var3 > 30) {
                  var3 = 30;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                var4 = -5 + (vc.field_l.field_ob - (5 - -((var3 + 2) * var2_int)));
                if (var4 <= 40) {
                  break L6;
                } else {
                  var4 = 40;
                  break L6;
                }
              }
              iu.field_d.a(var4, -20500, vc.field_l.field_gb - 10, 5, 5);
              var5 = 5 + var4 + 2;
              var6 = 0;
              L7: while (true) {
                if (4 + tq.field_b <= var6) {
                  ta.field_R.a(-134 + (qn.field_g + -10), -20500, 360, 10, qn.field_l - 360 >> 1);
                  bk.field_f.a(24, -20500, ta.field_R.field_gb, 0, 0);
                  df.field_K.a(-24 + ta.field_R.field_ob, -20500, ta.field_R.field_gb, 24, 0);
                  df.field_K.field_G = tq.a(11579568, false, df.field_K.field_ob, 1, 3, 8421504);
                  nf.field_Kb.a(df.field_K.field_ob + -36, -20500, df.field_K.field_gb - 10, 5, 5);
                  dv.field_m.a(24, -20500, 80, -24 + df.field_K.field_ob + -5, (df.field_K.field_gb + -80) / 2);
                  mj.a((byte) 120);
                  break L0;
                } else {
                  L8: {
                    L9: {
                      if (var6 != 1) {
                        break L9;
                      } else {
                        if (lm.field_e.length < 2) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (3 != var6) {
                        break L10;
                      } else {
                        if (1 >= ei.field_h) {
                          break L8;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (param1) {
                        break L11;
                      } else {
                        if (var6 == 3) {
                          var7 = rl.field_z[var6];
                          rl.field_z[var6].field_ob = 0;
                          var7.field_gb = 0;
                          var8 = 0;
                          L12: while (true) {
                            if (~var8 <= ~pu.field_k[var6].length) {
                              break L8;
                            } else {
                              L13: {
                                if (null == pu.field_k[var6][var8]) {
                                  break L13;
                                } else {
                                  var9 = pu.field_k[var6][var8];
                                  pu.field_k[var6][var8].field_ob = 0;
                                  var9.field_gb = 0;
                                  break L13;
                                }
                              }
                              var8++;
                              continue L12;
                            }
                          }
                        } else {
                          break L11;
                        }
                      }
                    }
                    L14: {
                      if (!param1) {
                        break L14;
                      } else {
                        if (var6 == 0) {
                          var14 = rl.field_z[var6];
                          var7 = var14;
                          rl.field_z[var6].field_ob = 0;
                          var14.field_gb = 0;
                          var8 = 0;
                          L15: while (true) {
                            if (pu.field_k[var6].length <= var8) {
                              break L8;
                            } else {
                              L16: {
                                if (null == pu.field_k[var6][var8]) {
                                  break L16;
                                } else {
                                  var9 = pu.field_k[var6][var8];
                                  pu.field_k[var6][var8].field_ob = 0;
                                  var9.field_gb = 0;
                                  break L16;
                                }
                              }
                              var8++;
                              continue L15;
                            }
                          }
                        } else {
                          break L14;
                        }
                      }
                    }
                    L17: {
                      L18: {
                        if (!param1) {
                          break L18;
                        } else {
                          if (var6 < 4) {
                            break L18;
                          } else {
                            if (vb.field_o == null) {
                              break L18;
                            } else {
                              if (!vb.field_o[var6 + -4]) {
                                break L18;
                              } else {
                                stackOut_37_0 = 1;
                                stackIn_39_0 = stackOut_37_0;
                                break L17;
                              }
                            }
                          }
                        }
                      }
                      stackOut_38_0 = 0;
                      stackIn_39_0 = stackOut_38_0;
                      break L17;
                    }
                    L19: {
                      var7_int = stackIn_39_0;
                      if (var7_int == 0) {
                        L20: {
                          rl.field_z[var6].a(var3, -20500, 103, var5, 5);
                          var8 = 110;
                          if (param1) {
                            pu.field_k[var6][0].a(var3, 2, -30061, 38, var5, var8, io.field_n);
                            var8 += 40;
                            break L20;
                          } else {
                            if (pu.field_k[var6][0] != null) {
                              var9 = pu.field_k[var6][0];
                              pu.field_k[var6][0].field_ob = 0;
                              var9.field_gb = 0;
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                        }
                        var9_int = -5 + (pd.field_c.field_gb + (-var8 - -2));
                        var10 = pu.field_k[var6].length - 1;
                        var11 = 0;
                        L21: while (true) {
                          if (var10 <= var11) {
                            var5 = var5 + (var3 - -2);
                            break L19;
                          } else {
                            var12 = var11 * var9_int / var10;
                            pu.field_k[var6][var11 - -1].a(var3, 2, -30061, var9_int * (1 + var11) / var10 - 2 + -var12, var5, var8 - -var12, io.field_n);
                            var11++;
                            continue L21;
                          }
                        }
                      } else {
                        var8_ref_je = rl.field_z[var6];
                        rl.field_z[var6].field_ob = 0;
                        var8_ref_je.field_gb = 0;
                        var9_int = 0;
                        L22: while (true) {
                          if (~var9_int <= ~pu.field_k[var6].length) {
                            break L19;
                          } else {
                            L23: {
                              if (pu.field_k[var6][var9_int] != null) {
                                var10_ref_nf = pu.field_k[var6][var9_int];
                                pu.field_k[var6][var9_int].field_ob = 0;
                                var10_ref_nf.field_gb = 0;
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                            var9_int++;
                            continue L22;
                          }
                        }
                      }
                    }
                    break L8;
                  }
                  var6++;
                  continue L7;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "je.CB(" + param0 + 44 + param1 + 41);
        }
    }

    final void a(boolean param0, boolean param1) {
        bc.field_e = !param1 ? true : false;
        bl.field_f = !param1 ? true : false;
        this.a(param0, false, 0, qn.field_g, qn.field_l, 0);
    }

    je(long param0, je param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    final void i(int param0) {
        je var4 = null;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!(null == ((je) this).field_fb)) {
            var4 = (je) (Object) ((je) this).field_fb.d((byte) -112);
            while (var4 != null) {
                var4.field_Cb = true;
                var4.i(-10027);
                var4 = (je) (Object) var4.field_fb.b((byte) -104);
            }
        }
        if (param0 != -10027) {
            ((je) this).field_fb = null;
        }
    }

    final void a(je param0, boolean param1, int param2, je param3) {
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
              if (param1) {
                break L1;
              } else {
                je.a(-53, false);
                break L1;
              }
            }
            L2: {
              if (param3 == null) {
                param0.field_db = 0;
                param0.field_ab = 0;
                break L2;
              } else {
                param0.field_db = param3.field_nb + param3.field_db;
                param0.field_ab = param3.field_ab - (-param3.field_ob - param2);
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
            stackOut_6_1 = new StringBuilder().append("je.PA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44).append(param1).append(44).append(param2).append(44);
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
          throw ig.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    private final void a(byte param0, int param1, boolean param2, int param3, int param4, boolean param5, boolean param6, boolean param7, int param8, boolean param9, boolean param10) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        wk[] var16 = null;
        wk var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        Object var23 = null;
        int var23_int = 0;
        je var23_ref = null;
        int var24 = 0;
        int var25 = 0;
        String var26 = null;
        String var27 = null;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          var23 = null;
          var25 = ArmiesOfGielinor.field_M ? 1 : 0;
          ((je) this).field_V = ((je) this).field_S + param8;
          ((je) this).field_D = ((je) this).field_ab + param4;
          var12 = qn.field_j;
          var13 = qn.field_a;
          var14 = qn.field_e;
          var15 = qn.field_f;
          qn.b(((je) this).field_V, ((je) this).field_D, ((je) this).field_gb + ((je) this).field_V, ((je) this).field_ob + ((je) this).field_D);
          param9 = param9 & ((je) this).field_xb;
          if (!((je) this).field_Cb) {
            L1: {
              param7 = ((je) this).field_rb;
              param10 = ((je) this).field_eb;
              if (0 == ((je) this).field_hb) {
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
        L2: {
          var16 = ((je) this).field_G;
          var17 = ((je) this).field_cb;
          var18 = ((je) this).field_N;
          var19 = 0;
          if (!param9) {
            L3: {
              if (((je) this).field_L < 0) {
                break L3;
              } else {
                var18 = ((je) this).field_L;
                break L3;
              }
            }
            L4: {
              if (((je) this).field_sb == null) {
                break L4;
              } else {
                var17 = ((je) this).field_sb;
                break L4;
              }
            }
            if (null == ((je) this).field_A) {
              break L2;
            } else {
              var16 = ((je) this).field_A;
              break L2;
            }
          } else {
            break L2;
          }
        }
        L5: {
          var20 = 0;
          if (param10) {
            L6: {
              if (null == ((je) this).field_mb) {
                break L6;
              } else {
                var16 = ((je) this).field_mb;
                break L6;
              }
            }
            L7: {
              if (null == ((je) this).field_vb) {
                break L7;
              } else {
                var17 = ((je) this).field_vb;
                break L7;
              }
            }
            L8: {
              if (-2147483648 != ((je) this).field_ib) {
                var19 = ((je) this).field_ib;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (-2147483648 != ((je) this).field_E) {
                var20 = ((je) this).field_E;
                break L9;
              } else {
                break L9;
              }
            }
            if (((je) this).field_W < 0) {
              break L5;
            } else {
              var18 = ((je) this).field_W;
              break L5;
            }
          } else {
            break L5;
          }
        }
        L10: {
          if (param5) {
            L11: {
              if (null != ((je) this).field_qb) {
                var17 = ((je) this).field_qb;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (((je) this).field_R != -2147483648) {
                var20 = ((je) this).field_R;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (null == ((je) this).field_U) {
                break L13;
              } else {
                var16 = ((je) this).field_U;
                break L13;
              }
            }
            L14: {
              if (((je) this).field_Bb != -2147483648) {
                var19 = ((je) this).field_Bb;
                break L14;
              } else {
                break L14;
              }
            }
            if (((je) this).field_T >= 0) {
              var18 = ((je) this).field_T;
              break L10;
            } else {
              break L10;
            }
          } else {
            break L10;
          }
        }
        L15: {
          if (param7) {
            L16: {
              if (((je) this).field_H == null) {
                break L16;
              } else {
                var16 = ((je) this).field_H;
                break L16;
              }
            }
            L17: {
              if (((je) this).field_B == -2147483648) {
                break L17;
              } else {
                var19 = ((je) this).field_B;
                break L17;
              }
            }
            L18: {
              if (-2147483648 == ((je) this).field_tb) {
                break L18;
              } else {
                var20 = ((je) this).field_tb;
                break L18;
              }
            }
            L19: {
              if (null == ((je) this).field_P) {
                break L19;
              } else {
                var17 = ((je) this).field_P;
                break L19;
              }
            }
            if (((je) this).field_wb < 0) {
              break L15;
            } else {
              var18 = ((je) this).field_wb;
              break L15;
            }
          } else {
            break L15;
          }
        }
        L20: {
          var21 = ((je) this).field_F + var19;
          var22 = var20 + ((je) this).field_z;
          if (((je) this).field_ub) {
            i.a(var16, param1, param8, (byte) -47, param4, param3);
            break L20;
          } else {
            i.a(var16, ((je) this).field_ob, ((je) this).field_V, (byte) -47, ((je) this).field_D, ((je) this).field_gb);
            break L20;
          }
        }
        L21: {
          if (var17 != null) {
            L22: {
              var23_int = var21 + ((je) this).field_V;
              if (1 != ((je) this).field_Eb) {
                break L22;
              } else {
                var23_int = var23_int + (((je) this).field_gb + -var17.field_A) / 2;
                break L22;
              }
            }
            L23: {
              var24 = ((je) this).field_D + var22;
              if (((je) this).field_Fb != 1) {
                break L23;
              } else {
                var24 = var24 + (-var17.field_x + ((je) this).field_ob) / 2;
                break L23;
              }
            }
            L24: {
              if (2 != ((je) this).field_Eb) {
                break L24;
              } else {
                var23_int = var23_int + (((je) this).field_gb - var17.field_A);
                break L24;
              }
            }
            L25: {
              if (2 == ((je) this).field_Fb) {
                var24 = var24 + (((je) this).field_ob - var17.field_x);
                break L25;
              } else {
                break L25;
              }
            }
            if (256 <= ((je) this).field_kb) {
              var17.g(var23_int, var24);
              break L21;
            } else {
              var17.e(var23_int, var24, ((je) this).field_kb);
              break L21;
            }
          } else {
            break L21;
          }
        }
        L26: {
          if (null == ((je) this).field_X) {
            break L26;
          } else {
            if (((je) this).field_Z == null) {
              break L26;
            } else {
              L27: {
                var26 = ((je) this).field_X;
                var27 = var26;
                var27 = var26;
                if (!param2) {
                  break L27;
                } else {
                  if (null == ((je) this).field_I) {
                    break L27;
                  } else {
                    var27 = var26 + ((je) this).field_I;
                    break L27;
                  }
                }
              }
              L28: {
                if (((je) this).field_Z.a(var27) > ((je) this).field_gb + -(2 * ((je) this).field_O)) {
                  break L28;
                } else {
                  if (var27.indexOf("<br>") >= 0) {
                    break L28;
                  } else {
                    L29: {
                      if (((je) this).field_Fb != 1) {
                        if (((je) this).field_Fb != 2) {
                          break L29;
                        } else {
                          var22 = var22 + (-((je) this).field_Z.field_H + (-((je) this).field_Z.field_L + ((je) this).field_ob));
                          break L29;
                        }
                      } else {
                        var22 = var22 + (-((je) this).field_Z.field_L + ((je) this).field_ob - ((je) this).field_Z.field_H) / 2;
                        break L29;
                      }
                    }
                    if (((je) this).field_Eb == 0) {
                      ((je) this).field_Z.b(var27, ((je) this).field_O + ((je) this).field_V + var21, ((je) this).field_Z.field_H + (((je) this).field_D - -var22), var18, -1, ((je) this).field_C);
                      break L26;
                    } else {
                      if (((je) this).field_Eb != 1) {
                        if (2 != ((je) this).field_Eb) {
                          int discarded$2 = ((je) this).field_Z.a(var27, ((je) this).field_V - -((je) this).field_O - -var21, var22 + ((je) this).field_D, -(2 * ((je) this).field_O) + ((je) this).field_gb, ((je) this).field_ob, var18, -1, ((je) this).field_C, ((je) this).field_Eb, ((je) this).field_Fb, ((je) this).field_pb);
                          break L26;
                        } else {
                          ((je) this).field_Z.c(var27, ((je) this).field_V + ((je) this).field_O - -var21 - (-((je) this).field_gb - -(((je) this).field_O * 2)), var22 + ((je) this).field_D + ((je) this).field_Z.field_H, var18, -1, ((je) this).field_C);
                          break L26;
                        }
                      } else {
                        ((je) this).field_Z.a(var27, var21 + (((je) this).field_V - -((je) this).field_O + (((je) this).field_gb - 2 * ((je) this).field_O) / 2), var22 + (((je) this).field_D - -((je) this).field_Z.field_H), var18, -1, ((je) this).field_C);
                        break L26;
                      }
                    }
                  }
                }
              }
              int discarded$3 = ((je) this).field_Z.a(var27, ((je) this).field_O + ((je) this).field_V + var21, var22 + ((je) this).field_D, -(2 * ((je) this).field_O) + ((je) this).field_gb, ((je) this).field_ob, var18, -1, ((je) this).field_C, ((je) this).field_Eb, ((je) this).field_Fb, ((je) this).field_pb);
              break L26;
            }
          }
        }
        L30: {
          if (((je) this).field_fb != null) {
            var23_ref = (je) (Object) ((je) this).field_fb.e((byte) 118);
            L31: while (true) {
              if (var23_ref == null) {
                break L30;
              } else {
                var23_ref.a((byte) -26, var23_ref.field_ob, param2, var23_ref.field_gb, var20 + var23_ref.field_D, param5, var23_ref.field_Y, param7, var23_ref.field_V - -var19, param9, param10);
                var23_ref = (je) (Object) var23_ref.field_fb.a((byte) 123);
                continue L31;
              }
            }
          } else {
            break L30;
          }
        }
        qn.f(var12, var13, var14, var15);
    }

    final int j(int param0) {
        int var2 = -17 % ((30 - param0) / 58);
        return ((je) this).a(true, 2147483647);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ((je) this).field_ab = param3;
        ((je) this).field_nb = 0;
        ((je) this).field_gb = param2;
        ((je) this).field_J = 0;
        if (param1 != -20500) {
            return;
        }
        ((je) this).field_db = 0;
        ((je) this).field_Hb = 0;
        ((je) this).field_S = param4;
        ((je) this).field_ob = param0;
    }

    final int a(boolean param0, int param1) {
        int var4_int = 0;
        je var4 = null;
        int var5 = 0;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!param0) {
            ((je) this).field_ab = -10;
        }
        int var3 = 0;
        if (null != ((je) this).field_X) {
            if (null != ((je) this).field_Z) {
                var4_int = ((je) this).field_Z.a(((je) this).field_X, param1);
                if (var3 < var4_int) {
                    var3 = var4_int;
                }
            }
        }
        if (!(((je) this).field_cb == null)) {
            var4_int = ((je) this).field_cb.field_A;
            if (var3 < var4_int) {
                var3 = var4_int;
            }
        }
        if (!(((je) this).field_fb == null)) {
            var4 = (je) (Object) ((je) this).field_fb.e((byte) 93);
            while (var4 != null) {
                var5 = var4.field_S - -var4.field_gb;
                if (!(var5 <= var3)) {
                    var3 = var5;
                }
                var4 = (je) (Object) ((je) this).field_fb.a((byte) 123);
            }
        }
        return var3;
    }

    public static void h(int param0) {
        field_Q = null;
        int var1 = -52;
        field_K = null;
        field_zb = null;
        field_lb = null;
    }

    public je() {
        ((je) this).field_L = -1;
        ((je) this).field_Db = false;
        ((je) this).field_C = 256;
        ((je) this).field_ib = -2147483648;
        ((je) this).field_W = -1;
        ((je) this).field_B = -2147483648;
        ((je) this).field_Bb = -2147483648;
        ((je) this).field_M = false;
        ((je) this).field_T = -1;
        ((je) this).field_E = -2147483648;
        ((je) this).field_R = -2147483648;
        ((je) this).field_xb = true;
        ((je) this).field_Y = false;
        ((je) this).field_kb = 256;
        ((je) this).field_wb = -1;
        ((je) this).field_tb = -2147483648;
    }

    je(long param0, je param1, int param2, int param3, int param4, int param5, String param6) {
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
        ((je) this).field_L = -1;
        ((je) this).field_Db = false;
        ((je) this).field_C = 256;
        ((je) this).field_ib = -2147483648;
        ((je) this).field_W = -1;
        ((je) this).field_B = -2147483648;
        ((je) this).field_Bb = -2147483648;
        ((je) this).field_M = false;
        ((je) this).field_T = -1;
        ((je) this).field_E = -2147483648;
        ((je) this).field_R = -2147483648;
        ((je) this).field_xb = true;
        ((je) this).field_Y = false;
        ((je) this).field_kb = 256;
        ((je) this).field_wb = -1;
        ((je) this).field_tb = -2147483648;
        try {
          L0: {
            L1: {
              ((je) this).field_ob = param5;
              ((je) this).field_S = param2;
              ((je) this).field_ab = param3;
              ((je) this).field_gb = param4;
              ((je) this).field_i = param0;
              ((je) this).a(0, param1);
              if (param6 == null) {
                break L1;
              } else {
                ((je) this).field_X = param6;
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
            stackOut_4_1 = new StringBuilder().append("je.<init>(").append(param0).append(44);
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
          throw ig.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_lb = "Wizards and warriors, foul demons and brutal orks, vicious goblins and fearless dwarves: all are yours to summon and command.";
        field_zb = "Private";
        field_K = new int[][]{new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2]};
    }
}
