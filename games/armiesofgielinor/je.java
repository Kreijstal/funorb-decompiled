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

    final static void c(boolean param0, int param1) {
        int var3 = 0;
        L0: {
          var3 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param1 <= -101) {
            break L0;
          } else {
            field_K = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param0) {
              break L2;
            } else {
              if (null != vu.field_M) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          vk.field_f = false;
          break L1;
        }
        L3: {
          if (!param0) {
            if (null != vu.field_M) {
              if (gk.field_J <= 0) {
                if (bd.field_r <= 0) {
                  if (mj.field_c > rk.field_D) {
                    L4: {
                      if (-1 == (rk.field_D ^ -1)) {
                        ub.a(false, false);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    rk.field_D = rk.field_D + 1;
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  bd.field_r = bd.field_r - 1;
                  break L3;
                }
              } else {
                gk.field_J = gk.field_J - 1;
                break L3;
              }
            } else {
              if (null == no.field_K) {
                vk.field_f = false;
                if (bd.field_r > 0) {
                  bd.field_r = bd.field_r - 1;
                  break L3;
                } else {
                  if (rk.field_D < -1) {
                    rk.field_D = rk.field_D - 1;
                    break L3;
                  } else {
                    if (mj.field_c > gk.field_J) {
                      L5: {
                        if (-1 != gk.field_J) {
                          break L5;
                        } else {
                          tr.h(14570);
                          break L5;
                        }
                      }
                      gk.field_J = gk.field_J + 1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
              } else {
                if ((gk.field_J ^ -1) < -1) {
                  gk.field_J = gk.field_J - 1;
                  break L3;
                } else {
                  if ((rk.field_D ^ -1) >= -1) {
                    if (mj.field_c <= bd.field_r) {
                      break L3;
                    } else {
                      L6: {
                        if (0 == bd.field_r) {
                          ub.a(false, true);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      bd.field_r = bd.field_r + 1;
                      break L3;
                    }
                  } else {
                    rk.field_D = rk.field_D - 1;
                    break L3;
                  }
                }
              }
            }
          } else {
            if (0 < gk.field_J) {
              gk.field_J = gk.field_J - 1;
              break L3;
            } else {
              if ((bd.field_r ^ -1) >= -1) {
                if (0 < rk.field_D) {
                  rk.field_D = rk.field_D - 1;
                  break L3;
                } else {
                  break L3;
                }
              } else {
                bd.field_r = bd.field_r - 1;
                break L3;
              }
            }
          }
        }
    }

    final void a(int param0, je param1) {
        Object stackIn_69_0 = null;
        Object stackIn_70_0 = null;
        Object stackIn_71_0 = null;
        Object stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        Object stackOut_68_0 = null;
        Object stackOut_69_0 = null;
        Object stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        Object stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        L0: {
          if (param1 != null) {
            L1: {
              if (param1.field_qb != null) {
                ((je) this).field_qb = param1.field_qb;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1.field_N != 0) {
                ((je) this).field_N = param1.field_N;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!param1.field_ub) {
                break L3;
              } else {
                ((je) this).field_ub = param1.field_ub;
                break L3;
              }
            }
            L4: {
              if (param1.field_sb == null) {
                break L4;
              } else {
                ((je) this).field_sb = param1.field_sb;
                break L4;
              }
            }
            L5: {
              if (param1.field_O != 0) {
                ((je) this).field_O = param1.field_O;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (!param1.field_Cb) {
                break L6;
              } else {
                ((je) this).field_Cb = param1.field_Cb;
                break L6;
              }
            }
            L7: {
              if (null == param1.field_mb) {
                break L7;
              } else {
                ((je) this).field_mb = param1.field_mb;
                break L7;
              }
            }
            L8: {
              if (!param1.field_rb) {
                break L8;
              } else {
                ((je) this).field_rb = param1.field_rb;
                break L8;
              }
            }
            L9: {
              if (param1.field_A == null) {
                break L9;
              } else {
                ((je) this).field_A = param1.field_A;
                break L9;
              }
            }
            L10: {
              if (param1.field_C == 256) {
                break L10;
              } else {
                ((je) this).field_C = param1.field_C;
                break L10;
              }
            }
            L11: {
              if (param1.field_M) {
                ((je) this).field_M = param1.field_M;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (0 == param1.field_pb) {
                break L12;
              } else {
                ((je) this).field_pb = param1.field_pb;
                break L12;
              }
            }
            L13: {
              if (null == param1.field_G) {
                break L13;
              } else {
                ((je) this).field_G = param1.field_G;
                break L13;
              }
            }
            L14: {
              if (param1.field_I == null) {
                break L14;
              } else {
                ((je) this).field_I = param1.field_I;
                break L14;
              }
            }
            L15: {
              if (param1.field_P != null) {
                ((je) this).field_P = param1.field_P;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (null == param1.field_Z) {
                break L16;
              } else {
                ((je) this).field_Z = param1.field_Z;
                break L16;
              }
            }
            L17: {
              if (null == param1.field_cb) {
                break L17;
              } else {
                ((je) this).field_cb = param1.field_cb;
                break L17;
              }
            }
            L18: {
              if ((param1.field_T ^ -1) > -1) {
                break L18;
              } else {
                ((je) this).field_T = param1.field_T;
                break L18;
              }
            }
            L19: {
              if ((param1.field_wb ^ -1) <= -1) {
                ((je) this).field_wb = param1.field_wb;
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              if (!param1.field_xb) {
                ((je) this).field_xb = param1.field_xb;
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              if (null != param1.field_X) {
                ((je) this).field_X = param1.field_X;
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              if (-1 >= (param1.field_W ^ -1)) {
                ((je) this).field_W = param1.field_W;
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              if (0 <= param1.field_L) {
                ((je) this).field_L = param1.field_L;
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              if (param1.field_H == null) {
                break L24;
              } else {
                ((je) this).field_H = param1.field_H;
                break L24;
              }
            }
            L25: {
              if (param1.field_U != null) {
                ((je) this).field_U = param1.field_U;
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              if (null != param1.field_vb) {
                ((je) this).field_vb = param1.field_vb;
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              if (-2147483648 == param1.field_B) {
                break L27;
              } else {
                ((je) this).field_B = param1.field_B;
                break L27;
              }
            }
            L28: {
              L29: {
                stackOut_68_0 = this;
                stackIn_71_0 = stackOut_68_0;
                stackIn_69_0 = stackOut_68_0;
                if (!((je) this).field_M) {
                  break L29;
                } else {
                  stackOut_69_0 = this;
                  stackIn_71_0 = stackOut_69_0;
                  stackIn_70_0 = stackOut_69_0;
                  if (!param1.field_Y) {
                    break L29;
                  } else {
                    stackOut_70_0 = this;
                    stackOut_70_1 = 1;
                    stackIn_72_0 = stackOut_70_0;
                    stackIn_72_1 = stackOut_70_1;
                    break L28;
                  }
                }
              }
              stackOut_71_0 = this;
              stackOut_71_1 = 0;
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              break L28;
            }
            L30: {
              ((je) this).field_Y = stackIn_72_1 != 0;
              if (param1.field_R != -2147483648) {
                ((je) this).field_R = param1.field_R;
                break L30;
              } else {
                break L30;
              }
            }
            L31: {
              if (param1.field_Gb) {
                ((je) this).field_Gb = param1.field_Gb;
                break L31;
              } else {
                break L31;
              }
            }
            L32: {
              if ((param1.field_ib ^ -1) == 2147483647) {
                break L32;
              } else {
                ((je) this).field_ib = param1.field_ib;
                break L32;
              }
            }
            L33: {
              ((je) this).field_Db = param1.field_Db;
              if (param1.field_z == 0) {
                break L33;
              } else {
                ((je) this).field_z = param1.field_z;
                break L33;
              }
            }
            L34: {
              if (0 == param1.field_Fb) {
                break L34;
              } else {
                ((je) this).field_Fb = param1.field_Fb;
                break L34;
              }
            }
            L35: {
              if ((param1.field_E ^ -1) != 2147483647) {
                ((je) this).field_E = param1.field_E;
                break L35;
              } else {
                break L35;
              }
            }
            L36: {
              if ((param1.field_Bb ^ -1) == 2147483647) {
                break L36;
              } else {
                ((je) this).field_Bb = param1.field_Bb;
                break L36;
              }
            }
            L37: {
              if (param1.field_Eb != 0) {
                ((je) this).field_Eb = param1.field_Eb;
                break L37;
              } else {
                break L37;
              }
            }
            L38: {
              if (2147483647 == (param1.field_tb ^ -1)) {
                break L38;
              } else {
                ((je) this).field_tb = param1.field_tb;
                break L38;
              }
            }
            if (param1.field_F == 0) {
              break L0;
            } else {
              ((je) this).field_F = param1.field_F;
              break L0;
            }
          } else {
            break L0;
          }
        }
        L39: {
          if (param0 == 0) {
            break L39;
          } else {
            ((je) this).field_M = true;
            break L39;
          }
        }
    }

    final void a(je param0, int param1) {
        if (!(null != ((je) this).field_fb)) {
            ((je) this).field_fb = new at();
        }
        ((je) this).field_fb.a((byte) -119, (tc) (Object) param0);
        if (param1 < 36) {
            ((je) this).field_M = true;
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
        if ((var6 ^ -1) > -1) {
            var6 = 0;
        }
        int var10 = var7 + -param1;
        if (!(var10 >= var5)) {
            var5 = var10;
        }
        if (!((var5 ^ -1) <= -1)) {
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
        je var13_ref = null;
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
          if (-1 > (((je) this).field_J ^ -1)) {
            var7 = -(-((je) this).field_J >> -1533333150);
            break L0;
          } else {
            var7 = ((je) this).field_J >> -642093982;
            break L0;
          }
        }
        L1: {
          ((je) this).field_J = ((je) this).field_J - var7;
          ((je) this).field_S = ((je) this).field_S + var7;
          if (0 < ((je) this).field_db) {
            var7 = -(-((je) this).field_db >> -1792729950);
            break L1;
          } else {
            var7 = ((je) this).field_db >> -1834060126;
            break L1;
          }
        }
        L2: {
          ((je) this).field_ab = ((je) this).field_ab + var7;
          ((je) this).field_db = ((je) this).field_db - var7;
          if ((((je) this).field_Hb ^ -1) < -1) {
            var7 = -(-((je) this).field_Hb >> -376076510);
            break L2;
          } else {
            var7 = ((je) this).field_Hb >> -65697342;
            break L2;
          }
        }
        L3: {
          ((je) this).field_gb = ((je) this).field_gb + var7;
          ((je) this).field_Hb = ((je) this).field_Hb - var7;
          if ((((je) this).field_nb ^ -1) < -1) {
            var7 = -(-((je) this).field_nb >> 39106274);
            break L3;
          } else {
            var7 = ((je) this).field_nb >> 1502961090;
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
                if (-1 == (tr.field_A ^ -1)) {
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
            var13_ref = (je) (Object) ((je) this).field_fb.d((byte) -82);
            L12: while (true) {
              if (var13_ref == null) {
                break L11;
              } else {
                var13_ref.a(param0, param1, var13_ref.field_D, var13_ref.field_ob, var13_ref.field_gb, var13_ref.field_V);
                var13_ref = (je) (Object) var13_ref.field_fb.b((byte) 88);
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
          if (!var13_ref.field_jb) {
            break L14;
          } else {
            bl.field_f = true;
            break L14;
          }
        }
        L15: {
          qn.f(var8, var9, var10, var11);
          if (-1 == (var13_ref.field_hb ^ -1)) {
            break L15;
          } else {
            if (var13_ref.field_Gb) {
              L16: {
                ((je) this).field_S = -var13_ref.field_bb + sm.field_d - param5;
                ((je) this).field_ab = -var13_ref.field_Ab + ko.field_b - param2;
                if (0 > var13_ref.field_S) {
                  ((je) this).field_S = 0;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (var13_ref.field_ab < 0) {
                  ((je) this).field_ab = 0;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (var13_ref.field_S <= param4 - var13_ref.field_gb) {
                  break L18;
                } else {
                  ((je) this).field_S = -var13_ref.field_gb + param4;
                  break L18;
                }
              }
              L19: {
                ((je) this).field_db = 0;
                if (var13_ref.field_ab <= param3 + -var13_ref.field_ob) {
                  break L19;
                } else {
                  ((je) this).field_ab = param3 - var13_ref.field_ob;
                  break L19;
                }
              }
              ((je) this).field_V = var13_ref.field_S + param5;
              ((je) this).field_J = 0;
              ((je) this).field_D = param2 - -var13_ref.field_ab;
              break L15;
            } else {
              break L15;
            }
          }
        }
    }

    final void b(int param0, je param1) {
        bb var3 = null;
        je var4_ref = null;
        Object var4 = null;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 != 3) {
            ((je) this).a(true, 119, -41, -35);
        }
        if (!(null == ((je) this).field_fb)) {
            var3 = new bb(((je) this).field_fb);
            var4_ref = (je) (Object) var3.c(param0 + 47);
            while (var4_ref != null) {
                var4_ref.b(param0 ^ 0, param1);
                var4_ref = (je) (Object) var3.b(param0 + 47);
            }
        }
        ((je) this).field_Y = (Object) (Object) param1 == this ? true : false;
        if (var4_ref.field_Db) {
            ((je) this).field_rb = var4_ref.field_Y;
        }
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        je var7 = null;
        je var7_ref = null;
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
        int stackIn_3_0 = 0;
        je stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        je stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        je stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        int stackIn_44_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        je stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        je stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        je stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_35_0 = 0;
        L0: {
          var13 = ArmiesOfGielinor.field_M ? 1 : 0;
          tq.field_c = qn.field_l;
          bm.field_p = qn.field_g;
          if (param1) {
            stackOut_2_0 = bd.field_r;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = rk.field_D;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          qb.a(stackIn_3_0, -106);
          ij.field_w.a(-40 + lk.field_a.field_ob + -2, (byte) -125, 0, lk.field_a.field_gb, 0);
          gg.field_E.a(jn.field_d, -20500, eb.field_c.field_gb, 0, 0);
          stackOut_3_0 = di.field_l;
          stackOut_3_1 = 18;
          stackOut_3_2 = -20500;
          stackOut_3_3 = eb.field_c.field_gb;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          stackIn_5_2 = stackOut_3_2;
          stackIn_5_3 = stackOut_3_3;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          stackIn_4_2 = stackOut_3_2;
          stackIn_4_3 = stackOut_3_3;
          if (fh.field_c) {
            stackOut_5_0 = (je) (Object) stackIn_5_0;
            stackOut_5_1 = stackIn_5_1;
            stackOut_5_2 = stackIn_5_2;
            stackOut_5_3 = stackIn_5_3;
            stackOut_5_4 = 2 + jn.field_c - -42;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            stackIn_6_3 = stackOut_5_3;
            stackIn_6_4 = stackOut_5_4;
            break L1;
          } else {
            stackOut_4_0 = (je) (Object) stackIn_4_0;
            stackOut_4_1 = stackIn_4_1;
            stackOut_4_2 = stackIn_4_2;
            stackOut_4_3 = stackIn_4_3;
            stackOut_4_4 = 0;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            stackIn_6_3 = stackOut_4_3;
            stackIn_6_4 = stackOut_4_4;
            break L1;
          }
        }
        ((je) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2, stackIn_6_3 - stackIn_6_4, 2 + jn.field_d, 0);
        pj.field_D.a(18, -20500, 42 + jn.field_c, 2 + jn.field_d, -40 + (eb.field_c.field_gb + -jn.field_c - 2));
        bu.field_a.a(0, false, eb.field_c.field_gb, 2, jn.field_c, 20 + (2 + jn.field_d), -20 + (-2 + (-jn.field_d + eb.field_c.field_ob)));
        mp.field_Lb.a(40, -20500, lk.field_a.field_gb, lk.field_a.field_ob - 40, 0);
        kd.field_F.a(30, -20500, pd.field_c.field_gb, 0, 0);
        if (param0 >= 13) {
          L2: {
            vc.field_l.a(-2 + pd.field_c.field_ob - 70, -20500, pd.field_c.field_gb, 30, 0);
            var2 = 3 + tq.field_b;
            if (2 > lm.field_e.length) {
              var2--;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (!param1) {
              break L3;
            } else {
              var2--;
              break L3;
            }
          }
          L4: {
            var3 = -2 + (-15 + (-5 + vc.field_l.field_ob + (2 + (1 + var2) / 2))) / (var2 - -1);
            if (-31 > (var3 ^ -1)) {
              var3 = 30;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            var4 = -5 + (vc.field_l.field_ob - (5 - -((var3 + 2) * var2)));
            if (var4 <= 40) {
              break L5;
            } else {
              var4 = 40;
              break L5;
            }
          }
          iu.field_d.a(var4, -20500, vc.field_l.field_gb - 5 - 5, 5, 5);
          var5 = 5 + var4 + 2;
          var6 = 0;
          L6: while (true) {
            if (4 + tq.field_b <= var6) {
              ta.field_R.a(-134 + (qn.field_g + -10), -20500, 360, 10, qn.field_l - 360 >> 891064609);
              bk.field_f.a(24, -20500, ta.field_R.field_gb, 0, 0);
              df.field_K.a(-24 + ta.field_R.field_ob, -20500, ta.field_R.field_gb, 24, 0);
              df.field_K.field_G = tq.a(11579568, false, df.field_K.field_ob, 1, 3, 8421504);
              nf.field_Kb.a(df.field_K.field_ob + -36, -20500, df.field_K.field_gb - 10, 5, 5);
              dv.field_m.a(24, -20500, 80, -24 + df.field_K.field_ob + -5, (df.field_K.field_gb + -80) / 2);
              mj.a((byte) 120);
              return;
            } else {
              L7: {
                if (-2 != var6) {
                  break L7;
                } else {
                  if (-3 <= lm.field_e.length) {
                    break L7;
                  } else {
                    var6++;
                    continue L6;
                  }
                }
              }
              L8: {
                if (3 != var6) {
                  break L8;
                } else {
                  if (1 < ei.field_h) {
                    break L8;
                  } else {
                    var6++;
                    continue L6;
                  }
                }
              }
              L9: {
                if (param1) {
                  break L9;
                } else {
                  if (var6 == 3) {
                    var7 = rl.field_z[var6];
                    rl.field_z[var6].field_ob = 0;
                    var7.field_gb = 0;
                    var8 = 0;
                    L10: while (true) {
                      if (var8 < pu.field_k[var6].length) {
                        if (null != pu.field_k[var6][var8]) {
                          var9 = pu.field_k[var6][var8];
                          pu.field_k[var6][var8].field_ob = 0;
                          var9.field_gb = 0;
                          var8++;
                          continue L10;
                        } else {
                          var8++;
                          continue L10;
                        }
                      } else {
                        var6++;
                        continue L6;
                      }
                    }
                  } else {
                    break L9;
                  }
                }
              }
              L11: {
                if (!param1) {
                  break L11;
                } else {
                  if (var6 == 0) {
                    var14 = rl.field_z[var6];
                    var7_ref = var14;
                    rl.field_z[var6].field_ob = 0;
                    var14.field_gb = 0;
                    var8 = 0;
                    L12: while (true) {
                      if (pu.field_k[var6].length > var8) {
                        if (null != pu.field_k[var6][var8]) {
                          var9 = pu.field_k[var6][var8];
                          pu.field_k[var6][var8].field_ob = 0;
                          var9.field_gb = 0;
                          var8++;
                          continue L12;
                        } else {
                          var8++;
                          continue L12;
                        }
                      } else {
                        var6++;
                        continue L6;
                      }
                    }
                  } else {
                    break L11;
                  }
                }
              }
              L13: {
                if (param1) {
                  if (-5 >= (var6 ^ -1)) {
                    if (vb.field_o != null) {
                      if (vb.field_o[var6 + -4]) {
                        stackOut_42_0 = 1;
                        stackIn_44_0 = stackOut_42_0;
                        break L13;
                      } else {
                        stackOut_41_0 = 0;
                        stackIn_44_0 = stackOut_41_0;
                        break L13;
                      }
                    } else {
                      stackOut_39_0 = 0;
                      stackIn_44_0 = stackOut_39_0;
                      break L13;
                    }
                  } else {
                    stackOut_37_0 = 0;
                    stackIn_44_0 = stackOut_37_0;
                    break L13;
                  }
                } else {
                  stackOut_35_0 = 0;
                  stackIn_44_0 = stackOut_35_0;
                  break L13;
                }
              }
              var7_int = stackIn_44_0;
              if (var7_int == 0) {
                L14: {
                  rl.field_z[var6].a(var3, -20500, 103, var5, 5);
                  var8 = 110;
                  if (param1) {
                    pu.field_k[var6][0].a(var3, 2, -30061, 38, var5, var8, io.field_n);
                    var8 += 40;
                    break L14;
                  } else {
                    if (pu.field_k[var6][0] != null) {
                      var9 = pu.field_k[var6][0];
                      pu.field_k[var6][0].field_ob = 0;
                      var9.field_gb = 0;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                }
                var9_int = -5 + (pd.field_c.field_gb + (-var8 - -2));
                var10 = pu.field_k[var6].length - 1;
                var11 = 0;
                L15: while (true) {
                  if (var10 <= var11) {
                    var5 = var5 + (var3 - -2);
                    var6++;
                    continue L6;
                  } else {
                    var12 = var11 * var9_int / var10;
                    pu.field_k[var6][var11 - -1].a(var3, 2, -30061, var9_int * (1 + var11) / var10 - 2 + -var12, var5, var8 - -var12, io.field_n);
                    var11++;
                    continue L15;
                  }
                }
              } else {
                var8_ref_je = rl.field_z[var6];
                rl.field_z[var6].field_ob = 0;
                var8_ref_je.field_gb = 0;
                var9_int = 0;
                L16: while (true) {
                  if (var9_int < pu.field_k[var6].length) {
                    if (pu.field_k[var6][var9_int] != null) {
                      var10_ref_nf = pu.field_k[var6][var9_int];
                      pu.field_k[var6][var9_int].field_ob = 0;
                      var10_ref_nf.field_gb = 0;
                      var9_int++;
                      continue L16;
                    } else {
                      var9_int++;
                      continue L16;
                    }
                  } else {
                    var6++;
                    continue L6;
                  }
                }
              }
            }
          }
        } else {
          return;
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
        if (!param1) {
            je.a(-53, false);
        }
        if (param3 != null) {
            param0.field_db = param3.field_nb + param3.field_db;
            param0.field_ab = param3.field_ab - (-param3.field_ob - param2);
        } else {
            param0.field_db = 0;
            param0.field_ab = 0;
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
        if (param0 == -26) {
          L2: {
            var16 = ((je) this).field_G;
            var17 = ((je) this).field_cb;
            var18 = ((je) this).field_N;
            var19 = 0;
            if (!param9) {
              L3: {
                if ((((je) this).field_L ^ -1) > -1) {
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
              if (-1 < (((je) this).field_W ^ -1)) {
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
                if ((((je) this).field_Bb ^ -1) != 2147483647) {
                  var19 = ((je) this).field_Bb;
                  break L14;
                } else {
                  break L14;
                }
              }
              if ((((je) this).field_T ^ -1) <= -1) {
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
              if (-1 < (((je) this).field_wb ^ -1)) {
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
                if (-2 != (((je) this).field_Fb ^ -1)) {
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
                    if (-1 >= (var27.indexOf("<br>") ^ -1)) {
                      break L28;
                    } else {
                      L29: {
                        if ((((je) this).field_Fb ^ -1) != -2) {
                          if (-3 != (((je) this).field_Fb ^ -1)) {
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
                        if ((((je) this).field_Eb ^ -1) != -2) {
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
          return;
        } else {
          return;
        }
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
        int var1 = 52 / ((param0 - -55) / 44);
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
        ((je) this).field_ob = param5;
        ((je) this).field_S = param2;
        ((je) this).field_ab = param3;
        ((je) this).field_gb = param4;
        ((je) this).field_i = param0;
        ((je) this).a(0, param1);
        if (param6 != null) {
            ((je) this).field_X = param6;
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
