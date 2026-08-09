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
            je var4 = (je) null;
            this.a((je) null, false, 64, (je) null);
        }
    }

    final static void c(boolean param0, int param1) {
        int var3;
        L0: {
          var3 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param1 <= -101) {
            break L0;
          } else {
            field_K = (int[][]) null;
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
                  if ((rk.field_D ^ -1) < -1) {
                    rk.field_D = rk.field_D - 1;
                    break L3;
                  } else {
                    if (mj.field_c > gk.field_J) {
                      L5: {
                        if (-1 != (gk.field_J ^ -1)) {
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
        Object stackIn_71_0 = null;
        Object stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        String stackIn_102_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1 != null) {
                L2: {
                  if (param1.field_qb != null) {
                    this.field_qb = param1.field_qb;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param1.field_N != 0) {
                    this.field_N = param1.field_N;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (!param1.field_ub) {
                    break L4;
                  } else {
                    this.field_ub = param1.field_ub;
                    break L4;
                  }
                }
                L5: {
                  if (param1.field_sb == null) {
                    break L5;
                  } else {
                    this.field_sb = param1.field_sb;
                    break L5;
                  }
                }
                L6: {
                  if (param1.field_O != 0) {
                    this.field_O = param1.field_O;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (!param1.field_Cb) {
                    break L7;
                  } else {
                    this.field_Cb = param1.field_Cb;
                    break L7;
                  }
                }
                L8: {
                  if (null == param1.field_mb) {
                    break L8;
                  } else {
                    this.field_mb = param1.field_mb;
                    break L8;
                  }
                }
                L9: {
                  if (!param1.field_rb) {
                    break L9;
                  } else {
                    this.field_rb = param1.field_rb;
                    break L9;
                  }
                }
                L10: {
                  if (param1.field_A == null) {
                    break L10;
                  } else {
                    this.field_A = param1.field_A;
                    break L10;
                  }
                }
                L11: {
                  if (param1.field_C == 256) {
                    break L11;
                  } else {
                    this.field_C = param1.field_C;
                    break L11;
                  }
                }
                L12: {
                  if (param1.field_M) {
                    this.field_M = param1.field_M;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (0 == param1.field_pb) {
                    break L13;
                  } else {
                    this.field_pb = param1.field_pb;
                    break L13;
                  }
                }
                L14: {
                  if (null == param1.field_G) {
                    break L14;
                  } else {
                    this.field_G = param1.field_G;
                    break L14;
                  }
                }
                L15: {
                  if (param1.field_I == null) {
                    break L15;
                  } else {
                    this.field_I = param1.field_I;
                    break L15;
                  }
                }
                L16: {
                  if (param1.field_P != null) {
                    this.field_P = param1.field_P;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (null == param1.field_Z) {
                    break L17;
                  } else {
                    this.field_Z = param1.field_Z;
                    break L17;
                  }
                }
                L18: {
                  if (null == param1.field_cb) {
                    break L18;
                  } else {
                    this.field_cb = param1.field_cb;
                    break L18;
                  }
                }
                L19: {
                  if ((param1.field_T ^ -1) > -1) {
                    break L19;
                  } else {
                    this.field_T = param1.field_T;
                    break L19;
                  }
                }
                L20: {
                  if ((param1.field_wb ^ -1) <= -1) {
                    this.field_wb = param1.field_wb;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (!param1.field_xb) {
                    this.field_xb = param1.field_xb;
                    break L21;
                  } else {
                    break L21;
                  }
                }
                L22: {
                  if (null != param1.field_X) {
                    this.field_X = param1.field_X;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (-1 >= (param1.field_W ^ -1)) {
                    this.field_W = param1.field_W;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (0 <= param1.field_L) {
                    this.field_L = param1.field_L;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (param1.field_H == null) {
                    break L25;
                  } else {
                    this.field_H = param1.field_H;
                    break L25;
                  }
                }
                L26: {
                  if (param1.field_U != null) {
                    this.field_U = param1.field_U;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (null != param1.field_vb) {
                    this.field_vb = param1.field_vb;
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L28: {
                  if (-2147483648 == param1.field_B) {
                    break L28;
                  } else {
                    this.field_B = param1.field_B;
                    break L28;
                  }
                }
                L29: {
                  L30: {
                    stackIn_71_0 = this;

                    if (!this.field_M) {
                      break L30;
                    } else {
                      stackIn_71_0 = this;

                      if (!param1.field_Y) {
                        break L30;
                      } else {
                        stackIn_72_0 = this;
                        stackIn_72_1 = 1;
                        break L29;
                      }
                    }
                  }
                  stackIn_72_0 = this;
                  stackIn_72_1 = 0;
                  break L29;
                }
                L31: {
                  ((je) (this)).field_Y = stackIn_72_1 != 0;
                  if (param1.field_R != -2147483648) {
                    this.field_R = param1.field_R;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (param1.field_Gb) {
                    this.field_Gb = param1.field_Gb;
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L33: {
                  if ((param1.field_ib ^ -1) == 2147483647) {
                    break L33;
                  } else {
                    this.field_ib = param1.field_ib;
                    break L33;
                  }
                }
                L34: {
                  this.field_Db = param1.field_Db;
                  if (param1.field_z == 0) {
                    break L34;
                  } else {
                    this.field_z = param1.field_z;
                    break L34;
                  }
                }
                L35: {
                  if (0 == param1.field_Fb) {
                    break L35;
                  } else {
                    this.field_Fb = param1.field_Fb;
                    break L35;
                  }
                }
                L36: {
                  if ((param1.field_E ^ -1) != 2147483647) {
                    this.field_E = param1.field_E;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if ((param1.field_Bb ^ -1) == 2147483647) {
                    break L37;
                  } else {
                    this.field_Bb = param1.field_Bb;
                    break L37;
                  }
                }
                L38: {
                  if (param1.field_Eb != 0) {
                    this.field_Eb = param1.field_Eb;
                    break L38;
                  } else {
                    break L38;
                  }
                }
                L39: {
                  if (2147483647 == (param1.field_tb ^ -1)) {
                    break L39;
                  } else {
                    this.field_tb = param1.field_tb;
                    break L39;
                  }
                }
                if (param1.field_F == 0) {
                  break L1;
                } else {
                  this.field_F = param1.field_F;
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
                this.field_M = true;
                break L40;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L41: {
            var3 = decompiledCaughtException;
            stackIn_101_0 = (RuntimeException) (var3);

            stackIn_101_1 = new StringBuilder().append("je.TA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_102_0 = (RuntimeException) ((Object) stackIn_101_0);
              stackIn_102_1 = (StringBuilder) ((Object) stackIn_101_1);
              stackIn_102_2 = "null";
              break L41;
            } else {
              stackIn_102_0 = (RuntimeException) ((Object) stackIn_101_0);
              stackIn_102_1 = (StringBuilder) ((Object) stackIn_101_1);
              stackIn_102_2 = "{...}";
              break L41;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_102_0), stackIn_102_2 + ')');
        }
    }

    final void a(je param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (null == this.field_fb) {
                this.field_fb = new at();
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_fb.a((byte) -119, (tc) (param0));
              if (param1 >= 36) {
                break L2;
              } else {
                this.field_M = true;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("je.MA(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        je var10_ref_je = null;
        int var9 = 0;
        int var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param3 != -1379) {
            return;
        }
        int var5 = -this.field_ab;
        int var6 = -this.field_db + var5;
        int var7 = this.field_ob;
        int var8 = this.field_nb + var7;
        if (!param0) {
            var9 = 0;
            var10_ref_je = (je) ((Object) this.field_fb.e((byte) 124));
            while (var10_ref_je != null) {
                var10_ref_je.field_db = -var10_ref_je.field_ab + var9;
                var9 = var9 + (param2 + (var10_ref_je.field_nb + var10_ref_je.field_ob));
                var10_ref_je = (je) ((Object) this.field_fb.a((byte) 123));
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
        this.field_ob = var7;
        this.field_db = -var6 + var5;
        this.field_nb = -var7 + var8;
        this.field_ab = -var5;
    }

    je(long param0, je param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    private final void a(boolean param0, boolean param1, int param2, int param3, int param4, int param5) {
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        je var13;
        int var14;
        L0: {
          var14 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (-1 > (this.field_J ^ -1)) {
            var7 = -(-this.field_J >> -1533333150);
            break L0;
          } else {
            var7 = this.field_J >> -642093982;
            break L0;
          }
        }
        L1: {
          this.field_J = this.field_J - var7;
          this.field_S = this.field_S + var7;
          if (0 < this.field_db) {
            var7 = -(-this.field_db >> -1792729950);
            break L1;
          } else {
            var7 = this.field_db >> -1834060126;
            break L1;
          }
        }
        L2: {
          this.field_ab = this.field_ab + var7;
          this.field_db = this.field_db - var7;
          if ((this.field_Hb ^ -1) < -1) {
            var7 = -(-this.field_Hb >> -376076510);
            break L2;
          } else {
            var7 = this.field_Hb >> -65697342;
            break L2;
          }
        }
        L3: {
          this.field_gb = this.field_gb + var7;
          this.field_Hb = this.field_Hb - var7;
          if ((this.field_nb ^ -1) < -1) {
            var7 = -(-this.field_nb >> 39106274);
            break L3;
          } else {
            var7 = this.field_nb >> 1502961090;
            break L3;
          }
        }
        L4: {
          L5: {
            this.field_V = param5 - -this.field_S;
            param0 = param0 & this.field_xb;
            this.field_ob = this.field_ob + var7;
            this.field_nb = this.field_nb - var7;
            this.field_D = this.field_ab + param2;
            var8 = qn.field_j;
            var9 = qn.field_a;
            var10 = qn.field_e;
            var11 = qn.field_f;
            qn.b(this.field_V, this.field_D, this.field_V + this.field_gb, this.field_D + this.field_ob);
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
                          this.field_yb = tr.field_A;
                          this.field_hb = tr.field_A;
                          this.field_bb = -this.field_V + iu.field_t;
                          var12 = 1;
                          this.field_Ab = -this.field_D + ur.field_z;
                          break L4;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          this.field_yb = 0;
          if (tr.field_A != 0) {
            this.field_hb = 0;
            break L4;
          } else {
            break L4;
          }
        }
        L6: {
          L7: {
            stackIn_29_0 = this;

            if (bl.field_f) {
              break L7;
            } else {
              stackIn_29_0 = this;

              if (qn.field_j > sm.field_d) {
                break L7;
              } else {
                stackIn_29_0 = this;

                if (qn.field_e <= sm.field_d) {
                  break L7;
                } else {
                  stackIn_29_0 = this;

                  if (qn.field_a > ko.field_b) {
                    break L7;
                  } else {
                    stackIn_29_0 = this;

                    if (qn.field_f <= ko.field_b) {
                      break L7;
                    } else {
                      stackIn_30_0 = this;
                      stackIn_30_1 = 1;
                      break L6;
                    }
                  }
                }
              }
            }
          }
          stackIn_30_0 = this;
          stackIn_30_1 = 0;
          break L6;
        }
        L8: {
          ((je) (this)).field_jb = stackIn_30_1 != 0;
          if (ro.field_ub == 0) {
            this.field_hb = 0;
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          L10: {
            stackIn_37_0 = this;

            if (!this.field_jb) {
              break L10;
            } else {
              stackIn_37_0 = this;

              if (ro.field_ub != this.field_hb) {
                break L10;
              } else {
                stackIn_37_0 = this;

                if (!param0) {
                  break L10;
                } else {
                  stackIn_38_0 = this;
                  stackIn_38_1 = 1;
                  break L9;
                }
              }
            }
          }
          stackIn_38_0 = this;
          stackIn_38_1 = 0;
          break L9;
        }
        L11: {
          ((je) (this)).field_eb = stackIn_38_1 != 0;
          if (null == this.field_fb) {
            break L11;
          } else {
            var13 = (je) ((Object) this.field_fb.d((byte) -82));
            L12: while (true) {
              if (var13 == null) {
                break L11;
              } else {
                var13.a(param0, param1, this.field_D, this.field_ob, this.field_gb, this.field_V);
                var13 = (je) ((Object) this.field_fb.b((byte) 88));
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
          if (!this.field_jb) {
            break L14;
          } else {
            bl.field_f = true;
            break L14;
          }
        }
        L15: {
          qn.f(var8, var9, var10, var11);
          if (-1 == (this.field_hb ^ -1)) {
            break L15;
          } else {
            if (this.field_Gb) {
              L16: {
                this.field_S = -this.field_bb + sm.field_d - param5;
                this.field_ab = -this.field_Ab + ko.field_b - param2;
                if (0 > this.field_S) {
                  this.field_S = 0;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (this.field_ab < 0) {
                  this.field_ab = 0;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (this.field_S <= param4 - this.field_gb) {
                  break L18;
                } else {
                  this.field_S = -this.field_gb + param4;
                  break L18;
                }
              }
              L19: {
                this.field_db = 0;
                if (this.field_ab <= param3 + -this.field_ob) {
                  break L19;
                } else {
                  this.field_ab = param3 - this.field_ob;
                  break L19;
                }
              }
              this.field_V = this.field_S + param5;
              this.field_J = 0;
              this.field_D = param2 - -this.field_ab;
              break L15;
            } else {
              break L15;
            }
          }
        }
    }

    final void b(int param0, je param1) {
        bb var3 = null;
        je var4 = null;
        int var5 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 3) {
                break L1;
              } else {
                this.a(true, 119, -41, -35);
                break L1;
              }
            }
            L2: {
              if (null != this.field_fb) {
                var3 = new bb(this.field_fb);
                var4 = (je) ((Object) var3.c(param0 + 47));
                L3: while (true) {
                  if (var4 == null) {
                    break L2;
                  } else {
                    var4.b(param0 ^ 0, param1);
                    var4 = (je) ((Object) var3.b(param0 + 47));
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            L4: {
              stackIn_10_0 = this;

              if (param1 != this) {
                stackIn_11_0 = this;
                stackIn_11_1 = 0;
                break L4;
              } else {
                stackIn_11_0 = this;
                stackIn_11_1 = 1;
                break L4;
              }
            }
            L5: {
              ((je) (this)).field_Y = stackIn_11_1 != 0;
              if (!this.field_Db) {
                break L5;
              } else {
                this.field_rb = this.field_Y;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("je.DB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        int stackIn_4_0 = 0;
        je stackIn_6_0;
        int stackIn_6_1;
        int stackIn_6_2;
        int stackIn_6_3;
        je stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_43_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        je var7 = null;
        int var7_int = 0;
        int var8 = 0;
        je var8_ref_je = null;
        nf var9 = null;
        int var9_int = 0;
        int var10 = 0;
        nf var10_ref_nf = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        je var14 = null;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              tq.field_c = qn.field_l;
              bm.field_p = qn.field_g;
              if (param1) {
                stackIn_4_0 = bd.field_r;
                break L1;
              } else {
                stackIn_4_0 = rk.field_D;
                break L1;
              }
            }
            L2: {
              qb.a(stackIn_4_0, -106);
              ij.field_w.a(-40 + lk.field_a.field_ob + -2, (byte) -125, 0, lk.field_a.field_gb, 0);
              gg.field_E.a(jn.field_d, -20500, eb.field_c.field_gb, 0, 0);
              stackIn_6_0 = di.field_l;

              stackIn_6_1 = 18;

              stackIn_6_2 = -20500;

              stackIn_6_3 = eb.field_c.field_gb;

              if (fh.field_c) {
                stackIn_7_0 = (je) ((Object) stackIn_6_0);
                stackIn_7_1 = stackIn_6_1;
                stackIn_7_2 = stackIn_6_2;
                stackIn_7_3 = stackIn_6_3;
                stackIn_7_4 = 2 + jn.field_c - -42;
                break L2;
              } else {
                stackIn_7_0 = (je) ((Object) stackIn_6_0);
                stackIn_7_1 = stackIn_6_1;
                stackIn_7_2 = stackIn_6_2;
                stackIn_7_3 = stackIn_6_3;
                stackIn_7_4 = 0;
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
                if (-31 > (var3 ^ -1)) {
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
              iu.field_d.a(var4, -20500, vc.field_l.field_gb - 5 - 5, 5, 5);
              var5 = 5 + var4 + 2;
              var6 = 0;
              L7: while (true) {
                if (4 + tq.field_b <= var6) {
                  ta.field_R.a(-134 + (qn.field_g + -10), -20500, 360, 10, qn.field_l - 360 >> 891064609);
                  bk.field_f.a(24, -20500, ta.field_R.field_gb, 0, 0);
                  df.field_K.a(-24 + ta.field_R.field_ob, -20500, ta.field_R.field_gb, 24, 0);
                  df.field_K.field_G = tq.a(11579568, false, df.field_K.field_ob, 1, 3, 8421504);
                  nf.field_Kb.a(df.field_K.field_ob + -36, -20500, df.field_K.field_gb - 10, 5, 5);
                  dv.field_m.a(24, -20500, 80, -24 + df.field_K.field_ob + -5, (df.field_K.field_gb + -80) / 2);
                  mj.a((byte) 120);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L8: {
                    L9: {
                      if (-2 != (var6 ^ -1)) {
                        break L9;
                      } else {
                        if (-3 < (lm.field_e.length ^ -1)) {
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
                            if (var8 >= pu.field_k[var6].length) {
                              break L8;
                            } else {
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
                            }
                          }
                        } else {
                          break L11;
                        }
                      }
                    }
                    L13: {
                      if (!param1) {
                        break L13;
                      } else {
                        if (var6 == 0) {
                          var14 = rl.field_z[var6];
                          var7 = var14;
                          rl.field_z[var6].field_ob = 0;
                          var14.field_gb = 0;
                          var8 = 0;
                          L14: while (true) {
                            if (pu.field_k[var6].length <= var8) {
                              break L8;
                            } else {
                              if (null != pu.field_k[var6][var8]) {
                                var9 = pu.field_k[var6][var8];
                                pu.field_k[var6][var8].field_ob = 0;
                                var9.field_gb = 0;
                                var8++;
                                continue L14;
                              } else {
                                var8++;
                                continue L14;
                              }
                            }
                          }
                        } else {
                          break L13;
                        }
                      }
                    }
                    L15: {
                      if (param1) {
                        if (-5 >= (var6 ^ -1)) {
                          if (vb.field_o != null) {
                            if (vb.field_o[var6 + -4]) {
                              stackIn_43_0 = 1;
                              break L15;
                            } else {
                              stackIn_43_0 = 0;
                              break L15;
                            }
                          } else {
                            stackIn_43_0 = 0;
                            break L15;
                          }
                        } else {
                          stackIn_43_0 = 0;
                          break L15;
                        }
                      } else {
                        stackIn_43_0 = 0;
                        break L15;
                      }
                    }
                    var7_int = stackIn_43_0;
                    if (var7_int == 0) {
                      L16: {
                        rl.field_z[var6].a(var3, -20500, 103, var5, 5);
                        var8 = 110;
                        if (param1) {
                          pu.field_k[var6][0].a(var3, 2, -30061, 38, var5, var8, io.field_n);
                          var8 += 40;
                          break L16;
                        } else {
                          if (pu.field_k[var6][0] != null) {
                            var9 = pu.field_k[var6][0];
                            pu.field_k[var6][0].field_ob = 0;
                            var9.field_gb = 0;
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                      }
                      var9_int = -5 + (pd.field_c.field_gb + (-var8 - -2));
                      var10 = pu.field_k[var6].length - 1;
                      var11 = 0;
                      L17: while (true) {
                        if (var10 <= var11) {
                          var5 = var5 + (var3 - -2);
                          break L8;
                        } else {
                          var12 = var11 * var9_int / var10;
                          pu.field_k[var6][var11 - -1].a(var3, 2, -30061, var9_int * (1 + var11) / var10 - 2 + -var12, var5, var8 - -var12, io.field_n);
                          var11++;
                          continue L17;
                        }
                      }
                    } else {
                      var8_ref_je = rl.field_z[var6];
                      rl.field_z[var6].field_ob = 0;
                      var8_ref_je.field_gb = 0;
                      var9_int = 0;
                      L18: while (true) {
                        if (var9_int >= pu.field_k[var6].length) {
                          break L8;
                        } else {
                          L19: {
                            if (pu.field_k[var6][var9_int] != null) {
                              var10_ref_nf = pu.field_k[var6][var9_int];
                              pu.field_k[var6][var9_int].field_ob = 0;
                              var10_ref_nf.field_gb = 0;
                              break L19;
                            } else {
                              break L19;
                            }
                          }
                          var9_int++;
                          continue L18;
                        }
                      }
                    }
                  }
                  var6++;
                  continue L7;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "je.CB(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
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
        if (!(null == this.field_fb)) {
            var4 = (je) ((Object) this.field_fb.d((byte) -112));
            while (var4 != null) {
                var4.field_Cb = true;
                var4.i(-10027);
                var4 = (je) ((Object) this.field_fb.b((byte) -104));
            }
        }
        if (param0 != -10027) {
            this.field_fb = (at) null;
        }
    }

    final void a(je param0, boolean param1, int param2, je param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
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
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("je.PA(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
    }

    private final void a(byte param0, int param1, boolean param2, int param3, int param4, boolean param5, boolean param6, boolean param7, int param8, boolean param9, boolean param10) {
        int stackIn_5_0 = 0;
        int var12;
        int var13;
        int var14;
        int var15;
        wk[] var16;
        wk var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23_int;
        String var23;
        je var23_ref;
        int var24;
        int var25;
        String var26;
        L0: {
          var25 = ArmiesOfGielinor.field_M ? 1 : 0;
          this.field_V = this.field_S + param8;
          this.field_D = this.field_ab + param4;
          var12 = qn.field_j;
          var13 = qn.field_a;
          var14 = qn.field_e;
          var15 = qn.field_f;
          qn.b(this.field_V, this.field_D, this.field_gb + this.field_V, this.field_ob + this.field_D);
          param9 = param9 & this.field_xb;
          if (!this.field_Cb) {
            L1: {
              param7 = this.field_rb;
              param10 = this.field_eb;
              if (0 == this.field_hb) {
                stackIn_5_0 = 0;
                break L1;
              } else {
                stackIn_5_0 = 1;
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
            var16 = this.field_G;
            var17 = this.field_cb;
            var18 = this.field_N;
            var19 = 0;
            if (!param9) {
              L3: {
                if ((this.field_L ^ -1) > -1) {
                  break L3;
                } else {
                  var18 = this.field_L;
                  break L3;
                }
              }
              L4: {
                if (this.field_sb == null) {
                  break L4;
                } else {
                  var17 = this.field_sb;
                  break L4;
                }
              }
              if (null == this.field_A) {
                break L2;
              } else {
                var16 = this.field_A;
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
                if (null == this.field_mb) {
                  break L6;
                } else {
                  var16 = this.field_mb;
                  break L6;
                }
              }
              L7: {
                if (null == this.field_vb) {
                  break L7;
                } else {
                  var17 = this.field_vb;
                  break L7;
                }
              }
              L8: {
                if (-2147483648 != this.field_ib) {
                  var19 = this.field_ib;
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
              if (-1 < (this.field_W ^ -1)) {
                break L5;
              } else {
                var18 = this.field_W;
                break L5;
              }
            } else {
              break L5;
            }
          }
          L10: {
            if (param5) {
              L11: {
                if (null != this.field_qb) {
                  var17 = this.field_qb;
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (this.field_R != -2147483648) {
                  var20 = this.field_R;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (null == this.field_U) {
                  break L13;
                } else {
                  var16 = this.field_U;
                  break L13;
                }
              }
              L14: {
                if ((this.field_Bb ^ -1) != 2147483647) {
                  var19 = this.field_Bb;
                  break L14;
                } else {
                  break L14;
                }
              }
              if ((this.field_T ^ -1) <= -1) {
                var18 = this.field_T;
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
                if (this.field_H == null) {
                  break L16;
                } else {
                  var16 = this.field_H;
                  break L16;
                }
              }
              L17: {
                if (this.field_B == -2147483648) {
                  break L17;
                } else {
                  var19 = this.field_B;
                  break L17;
                }
              }
              L18: {
                if (-2147483648 == this.field_tb) {
                  break L18;
                } else {
                  var20 = this.field_tb;
                  break L18;
                }
              }
              L19: {
                if (null == this.field_P) {
                  break L19;
                } else {
                  var17 = this.field_P;
                  break L19;
                }
              }
              if (-1 < (this.field_wb ^ -1)) {
                break L15;
              } else {
                var18 = this.field_wb;
                break L15;
              }
            } else {
              break L15;
            }
          }
          L20: {
            var21 = this.field_F + var19;
            var22 = var20 + this.field_z;
            if (this.field_ub) {
              i.a(var16, param1, param8, (byte) -47, param4, param3);
              break L20;
            } else {
              i.a(var16, this.field_ob, this.field_V, (byte) -47, this.field_D, this.field_gb);
              break L20;
            }
          }
          L21: {
            if (var17 != null) {
              L22: {
                var23_int = var21 + this.field_V;
                if (1 != this.field_Eb) {
                  break L22;
                } else {
                  var23_int = var23_int + (this.field_gb + -var17.field_A) / 2;
                  break L22;
                }
              }
              L23: {
                var24 = this.field_D + var22;
                if (-2 != (this.field_Fb ^ -1)) {
                  break L23;
                } else {
                  var24 = var24 + (-var17.field_x + this.field_ob) / 2;
                  break L23;
                }
              }
              L24: {
                if (2 != this.field_Eb) {
                  break L24;
                } else {
                  var23_int = var23_int + (this.field_gb - var17.field_A);
                  break L24;
                }
              }
              L25: {
                if (2 == this.field_Fb) {
                  var24 = var24 + (this.field_ob - var17.field_x);
                  break L25;
                } else {
                  break L25;
                }
              }
              if (256 <= this.field_kb) {
                var17.g(var23_int, var24);
                break L21;
              } else {
                var17.e(var23_int, var24, this.field_kb);
                break L21;
              }
            } else {
              break L21;
            }
          }
          L26: {
            if (null == this.field_X) {
              break L26;
            } else {
              if (this.field_Z == null) {
                break L26;
              } else {
                L27: {
                  var26 = this.field_X;
                  var23 = var26;
                  var23 = var26;
                  var23 = var26;
                  if (!param2) {
                    break L27;
                  } else {
                    if (null == this.field_I) {
                      break L27;
                    } else {
                      var23 = var26 + this.field_I;
                      break L27;
                    }
                  }
                }
                L28: {
                  if (this.field_Z.a(var23) > this.field_gb + -(2 * this.field_O)) {
                    break L28;
                  } else {
                    if (-1 >= (var23.indexOf("<br>") ^ -1)) {
                      break L28;
                    } else {
                      L29: {
                        if ((this.field_Fb ^ -1) != -2) {
                          if (-3 != (this.field_Fb ^ -1)) {
                            break L29;
                          } else {
                            var22 = var22 + (-this.field_Z.field_H + (-this.field_Z.field_L + this.field_ob));
                            break L29;
                          }
                        } else {
                          var22 = var22 + (-this.field_Z.field_L + this.field_ob - this.field_Z.field_H) / 2;
                          break L29;
                        }
                      }
                      if (this.field_Eb == 0) {
                        this.field_Z.b(var23, this.field_O + this.field_V + var21, this.field_Z.field_H + (this.field_D - -var22), var18, -1, this.field_C);
                        break L26;
                      } else {
                        if ((this.field_Eb ^ -1) != -2) {
                          if (2 != this.field_Eb) {
                            this.field_Z.a(var23, this.field_V - -this.field_O - -var21, var22 + this.field_D, -(2 * this.field_O) + this.field_gb, this.field_ob, var18, -1, this.field_C, this.field_Eb, this.field_Fb, this.field_pb);
                            break L26;
                          } else {
                            this.field_Z.c(var23, this.field_V + this.field_O - -var21 - (-this.field_gb - -(this.field_O * 2)), var22 + this.field_D + this.field_Z.field_H, var18, -1, this.field_C);
                            break L26;
                          }
                        } else {
                          this.field_Z.a(var23, var21 + (this.field_V - -this.field_O + (this.field_gb - 2 * this.field_O) / 2), var22 + (this.field_D - -this.field_Z.field_H), var18, -1, this.field_C);
                          break L26;
                        }
                      }
                    }
                  }
                }
                this.field_Z.a(var23, this.field_O + this.field_V + var21, var22 + this.field_D, -(2 * this.field_O) + this.field_gb, this.field_ob, var18, -1, this.field_C, this.field_Eb, this.field_Fb, this.field_pb);
                break L26;
              }
            }
          }
          L30: {
            if (this.field_fb != null) {
              var23_ref = (je) ((Object) this.field_fb.e((byte) 118));
              L31: while (true) {
                if (var23_ref == null) {
                  break L30;
                } else {
                  var23_ref.a((byte) -26, this.field_ob, param2, this.field_gb, var20 + this.field_D, param5, this.field_Y, param7, this.field_V - -var19, param9, param10);
                  var23_ref = (je) ((Object) this.field_fb.a((byte) 123));
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
        return this.a(true, 2147483647);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_ab = param3;
        this.field_nb = 0;
        this.field_gb = param2;
        this.field_J = 0;
        if (param1 != -20500) {
            return;
        }
        this.field_db = 0;
        this.field_Hb = 0;
        this.field_S = param4;
        this.field_ob = param0;
    }

    final int a(boolean param0, int param1) {
        je var4 = null;
        int var5 = 0;
        int var4_int = 0;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!param0) {
            this.field_ab = -10;
        }
        int var3 = 0;
        if (null != this.field_X && null != this.field_Z) {
            var4_int = this.field_Z.a(this.field_X, param1);
            if (var3 < var4_int) {
                var3 = var4_int;
            }
        }
        if (!(this.field_cb == null)) {
            var4_int = this.field_cb.field_A;
            if (var3 < var4_int) {
                var3 = var4_int;
            }
        }
        if (!(this.field_fb == null)) {
            var4 = (je) ((Object) this.field_fb.e((byte) 93));
            while (var4 != null) {
                var5 = var4.field_S - -var4.field_gb;
                if (!(var5 <= var3)) {
                    var3 = var5;
                }
                var4 = (je) ((Object) this.field_fb.a((byte) 123));
            }
        }
        return var3;
    }

    public static void h(int param0) {
        field_Q = null;
        int var1 = 52 / ((param0 - -55) / 44);
        field_K = (int[][]) null;
        field_zb = null;
        field_lb = null;
    }

    public je() {
        this.field_L = -1;
        this.field_Db = false;
        this.field_C = 256;
        this.field_ib = -2147483648;
        this.field_W = -1;
        this.field_B = -2147483648;
        this.field_Bb = -2147483648;
        this.field_M = false;
        this.field_T = -1;
        this.field_E = -2147483648;
        this.field_R = -2147483648;
        this.field_xb = true;
        this.field_Y = false;
        this.field_kb = 256;
        this.field_wb = -1;
        this.field_tb = -2147483648;
    }

    je(long param0, je param1, int param2, int param3, int param4, int param5, String param6) {
        this.field_L = -1;
        this.field_Db = false;
        this.field_C = 256;
        this.field_ib = -2147483648;
        this.field_W = -1;
        this.field_B = -2147483648;
        this.field_Bb = -2147483648;
        this.field_M = false;
        this.field_T = -1;
        this.field_E = -2147483648;
        this.field_R = -2147483648;
        this.field_xb = true;
        this.field_Y = false;
        this.field_kb = 256;
        this.field_wb = -1;
        this.field_tb = -2147483648;
        try {
            this.field_ob = param5;
            this.field_S = param2;
            this.field_ab = param3;
            this.field_gb = param4;
            this.field_i = param0;
            this.a(0, param1);
            if (param6 != null) {
                this.field_X = param6;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "je.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_lb = "Wizards and warriors, foul demons and brutal orks, vicious goblins and fearless dwarves: all are yours to summon and command.";
        field_zb = "Private";
        field_K = new int[][]{new int[]{35, 0}, new int[]{42, 42}, new int[]{35, 0}, new int[]{13, 40}, new int[]{33, 48}, new int[]{25, 0}, new int[]{28, 0}, new int[]{50, 41}, new int[]{43, 0}, new int[]{30, 0}, new int[]{50, 0}, new int[]{50, 41}, new int[]{33, 0}, new int[]{32, 0}, new int[]{36, 36}, new int[]{30, 0}, new int[]{24, 39}, new int[]{50, 41}, new int[]{38, 38}, new int[]{35, 0}, new int[]{20, 0}, new int[]{35, 0}, new int[]{50, 41}, new int[]{33, 0}, new int[]{45, 0}, new int[]{25, 38}, new int[]{49, 0}, new int[]{30, 0}, new int[]{24, 0}, new int[]{25, 0}, new int[]{37, 0}, new int[]{58, 0}, new int[]{50, 41}, new int[]{35, 0}, new int[]{35, 0}, new int[]{51, 0}, new int[]{50, 0}, new int[]{11, 11}, new int[]{20, 20}, new int[]{35, 0}, new int[]{38, 0}, new int[]{30, 0}, new int[]{75, 0}, new int[]{24, 0}, new int[]{24, 0}, new int[]{20, 0}, new int[]{58, 0}, new int[]{37, 0}, new int[]{25, 38}, new int[]{37, 0}, new int[]{50, 0}, new int[]{40, 35}, new int[]{31, 0}, new int[]{28, 0}, new int[]{53, 0}, new int[]{53, 0}, new int[]{53, 0}, new int[]{44, 0}, new int[]{53, 0}, new int[]{53, 0}, new int[]{41, 0}, new int[]{53, 0}, new int[]{30, 0}, new int[]{38, 0}, new int[]{47, 0}, new int[]{63, 0}, new int[]{32, 0}, new int[]{22, 0}, new int[]{43, 0}, new int[]{36, 0}, new int[]{25, 0}, new int[]{25, 0}, new int[]{25, 0}, new int[]{50, 41}, new int[]{33, 48}, new int[]{18, 18}, new int[]{1, 0}, new int[]{24, 0}, new int[]{24, 39}, new int[]{25, 38}, new int[]{25, 38}, new int[]{33, 48}, new int[]{50, 41}, new int[]{34, 4}, new int[]{25, 3}, new int[]{35, 21}, new int[]{19, 3}, new int[]{18, 2}, new int[]{25, 6}, new int[]{35, 21}};
    }
}
