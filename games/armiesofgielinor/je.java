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
        int var3 = 0;
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
          L4: {
            if (!param0) {
              break L4;
            } else {
              L5: {
                if (0 < gk.field_J) {
                  break L5;
                } else {
                  L6: {
                    if ((bd.field_r ^ -1) >= -1) {
                      break L6;
                    } else {
                      bd.field_r = bd.field_r - 1;
                      if (var3 == 0) {
                        break L3;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if (0 < rk.field_D) {
                    rk.field_D = rk.field_D - 1;
                    if (var3 == 0) {
                      break L3;
                    } else {
                      break L5;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              gk.field_J = gk.field_J - 1;
              if (var3 == 0) {
                break L3;
              } else {
                break L4;
              }
            }
          }
          L7: {
            if (null != vu.field_M) {
              break L7;
            } else {
              L8: {
                if (null == no.field_K) {
                  break L8;
                } else {
                  L9: {
                    if ((gk.field_J ^ -1) < -1) {
                      break L9;
                    } else {
                      L10: {
                        if ((rk.field_D ^ -1) >= -1) {
                          break L10;
                        } else {
                          rk.field_D = rk.field_D - 1;
                          if (var3 == 0) {
                            break L3;
                          } else {
                            break L10;
                          }
                        }
                      }
                      if (mj.field_c <= bd.field_r) {
                        break L3;
                      } else {
                        L11: {
                          if (0 == bd.field_r) {
                            ub.a(false, true);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        bd.field_r = bd.field_r + 1;
                        if (var3 == 0) {
                          break L3;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  gk.field_J = gk.field_J - 1;
                  if (var3 == 0) {
                    break L3;
                  } else {
                    break L8;
                  }
                }
              }
              L12: {
                vk.field_f = false;
                if (bd.field_r > 0) {
                  break L12;
                } else {
                  L13: {
                    if ((rk.field_D ^ -1) < -1) {
                      break L13;
                    } else {
                      if (mj.field_c > gk.field_J) {
                        L14: {
                          if (-1 != (gk.field_J ^ -1)) {
                            break L14;
                          } else {
                            tr.h(14570);
                            break L14;
                          }
                        }
                        gk.field_J = gk.field_J + 1;
                        if (var3 == 0) {
                          break L3;
                        } else {
                          break L13;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  rk.field_D = rk.field_D - 1;
                  if (var3 == 0) {
                    break L3;
                  } else {
                    break L12;
                  }
                }
              }
              bd.field_r = bd.field_r - 1;
              if (var3 == 0) {
                break L3;
              } else {
                break L7;
              }
            }
          }
          L15: {
            if (gk.field_J <= 0) {
              break L15;
            } else {
              gk.field_J = gk.field_J - 1;
              if (var3 == 0) {
                break L3;
              } else {
                break L15;
              }
            }
          }
          L16: {
            if (bd.field_r <= 0) {
              break L16;
            } else {
              bd.field_r = bd.field_r - 1;
              if (var3 == 0) {
                break L3;
              } else {
                break L16;
              }
            }
          }
          if (mj.field_c > rk.field_D) {
            L17: {
              if (-1 == (rk.field_D ^ -1)) {
                ub.a(false, false);
                break L17;
              } else {
                break L17;
              }
            }
            rk.field_D = rk.field_D + 1;
            break L3;
          } else {
            break L3;
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
                    stackOut_68_0 = this;
                    stackIn_71_0 = stackOut_68_0;
                    stackIn_69_0 = stackOut_68_0;
                    if (!this.field_M) {
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
            stackOut_99_0 = (RuntimeException) (var3);
            stackOut_99_1 = new StringBuilder().append("je.TA(").append(param0).append(',');
            stackIn_101_0 = stackOut_99_0;
            stackIn_101_1 = stackOut_99_1;
            stackIn_100_0 = stackOut_99_0;
            stackIn_100_1 = stackOut_99_1;
            if (param1 == null) {
              stackOut_101_0 = (RuntimeException) ((Object) stackIn_101_0);
              stackOut_101_1 = (StringBuilder) ((Object) stackIn_101_1);
              stackOut_101_2 = "null";
              stackIn_102_0 = stackOut_101_0;
              stackIn_102_1 = stackOut_101_1;
              stackIn_102_2 = stackOut_101_2;
              break L41;
            } else {
              stackOut_100_0 = (RuntimeException) ((Object) stackIn_100_0);
              stackOut_100_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackOut_100_2 = "{...}";
              stackIn_102_0 = stackOut_100_0;
              stackIn_102_1 = stackOut_100_1;
              stackIn_102_2 = stackOut_100_2;
              break L41;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_102_0), stackIn_102_2 + ')');
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
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("je.MA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        je var10_ref_je = null;
        int var10 = 0;
        int var11 = 0;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param3 != -1379) {
          return;
        } else {
          L0: {
            L1: {
              var5 = -this.field_ab;
              var6 = -this.field_db + var5;
              var7 = this.field_ob;
              var8 = this.field_nb + var7;
              if (param0) {
                break L1;
              } else {
                var9 = 0;
                var10_ref_je = (je) ((Object) this.field_fb.e((byte) 124));
                L2: while (true) {
                  L3: {
                    if (var10_ref_je == null) {
                      break L3;
                    } else {
                      var10_ref_je.field_db = -var10_ref_je.field_ab + var9;
                      var9 = var9 + (param2 + (var10_ref_je.field_nb + var10_ref_je.field_ob));
                      var10_ref_je = (je) ((Object) this.field_fb.a((byte) 123));
                      if (var11 != 0) {
                        break L0;
                      } else {
                        if (var11 == 0) {
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var8 = var9 - param2;
                  break L1;
                }
              }
            }
            var9 = -param1 + var8;
            break L0;
          }
          L4: {
            if (var9 < var6) {
              var6 = var9;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if ((var6 ^ -1) <= -1) {
              break L5;
            } else {
              var6 = 0;
              break L5;
            }
          }
          L6: {
            var10 = var7 + -param1;
            if (var10 < var5) {
              var5 = var10;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if ((var5 ^ -1) > -1) {
              var5 = 0;
              break L7;
            } else {
              break L7;
            }
          }
          this.field_ob = var7;
          this.field_db = -var6 + var5;
          this.field_nb = -var7 + var8;
          this.field_ab = -var5;
          return;
        }
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
        je var13 = null;
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
          L1: {
            var14 = ArmiesOfGielinor.field_M ? 1 : 0;
            if (-1 > (this.field_J ^ -1)) {
              break L1;
            } else {
              var7 = this.field_J >> -642093982;
              if (var14 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var7 = -(-this.field_J >> -1533333150);
          break L0;
        }
        L2: {
          L3: {
            this.field_J = this.field_J - var7;
            this.field_S = this.field_S + var7;
            if (0 < this.field_db) {
              break L3;
            } else {
              var7 = this.field_db >> -1834060126;
              if (var14 == 0) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          var7 = -(-this.field_db >> -1792729950);
          break L2;
        }
        L4: {
          L5: {
            this.field_ab = this.field_ab + var7;
            this.field_db = this.field_db - var7;
            if ((this.field_Hb ^ -1) < -1) {
              break L5;
            } else {
              var7 = this.field_Hb >> -65697342;
              if (var14 == 0) {
                break L4;
              } else {
                break L5;
              }
            }
          }
          var7 = -(-this.field_Hb >> -376076510);
          break L4;
        }
        L6: {
          L7: {
            this.field_gb = this.field_gb + var7;
            this.field_Hb = this.field_Hb - var7;
            if ((this.field_nb ^ -1) < -1) {
              break L7;
            } else {
              var7 = this.field_nb >> 1502961090;
              if (var14 == 0) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          var7 = -(-this.field_nb >> 39106274);
          break L6;
        }
        L8: {
          L9: {
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
              break L9;
            } else {
              if (!param0) {
                break L9;
              } else {
                if (-1 == (tr.field_A ^ -1)) {
                  break L9;
                } else {
                  if (qn.field_j > iu.field_t) {
                    break L9;
                  } else {
                    if (iu.field_t >= qn.field_e) {
                      break L9;
                    } else {
                      if (ur.field_z < qn.field_a) {
                        break L9;
                      } else {
                        if (ur.field_z >= qn.field_f) {
                          break L9;
                        } else {
                          this.field_yb = tr.field_A;
                          this.field_hb = tr.field_A;
                          this.field_bb = -this.field_V + iu.field_t;
                          var12 = 1;
                          this.field_Ab = -this.field_D + ur.field_z;
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
          this.field_yb = 0;
          if (tr.field_A != 0) {
            this.field_hb = 0;
            break L8;
          } else {
            break L8;
          }
        }
        L10: {
          L11: {
            stackOut_23_0 = this;
            stackIn_29_0 = stackOut_23_0;
            stackIn_24_0 = stackOut_23_0;
            if (bl.field_f) {
              break L11;
            } else {
              stackOut_24_0 = this;
              stackIn_29_0 = stackOut_24_0;
              stackIn_25_0 = stackOut_24_0;
              if (qn.field_j > sm.field_d) {
                break L11;
              } else {
                stackOut_25_0 = this;
                stackIn_29_0 = stackOut_25_0;
                stackIn_26_0 = stackOut_25_0;
                if (qn.field_e <= sm.field_d) {
                  break L11;
                } else {
                  stackOut_26_0 = this;
                  stackIn_29_0 = stackOut_26_0;
                  stackIn_27_0 = stackOut_26_0;
                  if (qn.field_a > ko.field_b) {
                    break L11;
                  } else {
                    stackOut_27_0 = this;
                    stackIn_29_0 = stackOut_27_0;
                    stackIn_28_0 = stackOut_27_0;
                    if (qn.field_f <= ko.field_b) {
                      break L11;
                    } else {
                      stackOut_28_0 = this;
                      stackOut_28_1 = 1;
                      stackIn_30_0 = stackOut_28_0;
                      stackIn_30_1 = stackOut_28_1;
                      break L10;
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
          break L10;
        }
        L12: {
          ((je) (this)).field_jb = stackIn_30_1 != 0;
          if (ro.field_ub == 0) {
            this.field_hb = 0;
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          L14: {
            stackOut_33_0 = this;
            stackIn_37_0 = stackOut_33_0;
            stackIn_34_0 = stackOut_33_0;
            if (!this.field_jb) {
              break L14;
            } else {
              stackOut_34_0 = this;
              stackIn_37_0 = stackOut_34_0;
              stackIn_35_0 = stackOut_34_0;
              if (ro.field_ub != this.field_hb) {
                break L14;
              } else {
                stackOut_35_0 = this;
                stackIn_37_0 = stackOut_35_0;
                stackIn_36_0 = stackOut_35_0;
                if (!param0) {
                  break L14;
                } else {
                  stackOut_36_0 = this;
                  stackOut_36_1 = 1;
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  break L13;
                }
              }
            }
          }
          stackOut_37_0 = this;
          stackOut_37_1 = 0;
          stackIn_38_0 = stackOut_37_0;
          stackIn_38_1 = stackOut_37_1;
          break L13;
        }
        L15: {
          L16: {
            ((je) (this)).field_eb = stackIn_38_1 != 0;
            if (null == this.field_fb) {
              break L16;
            } else {
              var13 = (je) ((Object) this.field_fb.d((byte) -82));
              L17: while (true) {
                if (var13 == null) {
                  break L16;
                } else {
                  var13.a(param0, param1, this.field_D, this.field_ob, this.field_gb, this.field_V);
                  var13 = (je) ((Object) this.field_fb.b((byte) 88));
                  if (var14 != 0) {
                    break L15;
                  } else {
                    if (var14 == 0) {
                      continue L17;
                    } else {
                      break L16;
                    }
                  }
                }
              }
            }
          }
          if (var12 == 0) {
            break L15;
          } else {
            bc.field_e = true;
            break L15;
          }
        }
        L18: {
          if (!this.field_jb) {
            break L18;
          } else {
            bl.field_f = true;
            break L18;
          }
        }
        L19: {
          qn.f(var8, var9, var10, var11);
          if (-1 == (this.field_hb ^ -1)) {
            break L19;
          } else {
            if (this.field_Gb) {
              L20: {
                this.field_S = -this.field_bb + sm.field_d - param5;
                this.field_ab = -this.field_Ab + ko.field_b - param2;
                if (0 > this.field_S) {
                  this.field_S = 0;
                  break L20;
                } else {
                  break L20;
                }
              }
              L21: {
                if (this.field_ab < 0) {
                  this.field_ab = 0;
                  break L21;
                } else {
                  break L21;
                }
              }
              L22: {
                if (this.field_S <= param4 - this.field_gb) {
                  break L22;
                } else {
                  this.field_S = -this.field_gb + param4;
                  break L22;
                }
              }
              L23: {
                this.field_db = 0;
                if (this.field_ab <= param3 + -this.field_ob) {
                  break L23;
                } else {
                  this.field_ab = param3 - this.field_ob;
                  break L23;
                }
              }
              this.field_V = this.field_S + param5;
              this.field_J = 0;
              this.field_D = param2 - -this.field_ab;
              break L19;
            } else {
              break L19;
            }
          }
        }
    }

    final void b(int param0, je param1) {
        bb var3 = null;
        RuntimeException var3_ref = null;
        je var4 = null;
        int var5 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
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
              L3: {
                if (null != this.field_fb) {
                  var3 = new bb(this.field_fb);
                  var4 = (je) ((Object) var3.c(param0 + 47));
                  L4: while (true) {
                    if (var4 == null) {
                      break L3;
                    } else {
                      var4.b(param0 ^ 0, param1);
                      var4 = (je) ((Object) var3.b(param0 + 47));
                      if (var5 != 0) {
                        break L2;
                      } else {
                        if (var5 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              L5: {
                stackOut_10_0 = this;
                stackIn_12_0 = stackOut_10_0;
                stackIn_11_0 = stackOut_10_0;
                if (param1 != this) {
                  stackOut_12_0 = this;
                  stackOut_12_1 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L5;
                } else {
                  stackOut_11_0 = this;
                  stackOut_11_1 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  break L5;
                }
              }
              ((je) (this)).field_Y = stackIn_13_1 != 0;
              break L2;
            }
            L6: {
              if (!this.field_Db) {
                break L6;
              } else {
                this.field_rb = this.field_Y;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3_ref);
            stackOut_17_1 = new StringBuilder().append("je.DB(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
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
        int stackIn_22_0 = 0;
        int stackIn_44_0 = 0;
        nf stackIn_48_0 = null;
        Object stackIn_68_0 = null;
        nf stackIn_68_1 = null;
        Object stackIn_69_0 = null;
        nf stackIn_69_1 = null;
        Object stackIn_76_0 = null;
        nf stackIn_76_1 = null;
        Object stackIn_81_0 = null;
        int stackIn_82_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        je stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        je stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        je stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_21_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_42_0 = 0;
        nf stackOut_47_0 = null;
        Object stackOut_67_0 = null;
        nf stackOut_67_1 = null;
        Object stackOut_68_0 = null;
        nf stackOut_68_1 = null;
        Object stackOut_75_0 = null;
        nf stackOut_75_1 = null;
        je stackOut_80_0 = null;
        int stackOut_81_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = ArmiesOfGielinor.field_M ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        tq.field_c = qn.field_l;
                        bm.field_p = qn.field_g;
                        if (param1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = rk.field_D;
                        stackIn_4_0 = stackOut_2_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = bd.field_r;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
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
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = (je) ((Object) stackIn_5_0);
                        stackOut_5_1 = stackIn_5_1;
                        stackOut_5_2 = stackIn_5_2;
                        stackOut_5_3 = stackIn_5_3;
                        stackOut_5_4 = 0;
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_7_1 = stackOut_5_1;
                        stackIn_7_2 = stackOut_5_2;
                        stackIn_7_3 = stackOut_5_3;
                        stackIn_7_4 = stackOut_5_4;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = (je) ((Object) stackIn_6_0);
                        stackOut_6_1 = stackIn_6_1;
                        stackOut_6_2 = stackIn_6_2;
                        stackOut_6_3 = stackIn_6_3;
                        stackOut_6_4 = 2 + jn.field_c - -42;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        stackIn_7_2 = stackOut_6_2;
                        stackIn_7_3 = stackOut_6_3;
                        stackIn_7_4 = stackOut_6_4;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((je) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, stackIn_7_3 - stackIn_7_4, 2 + jn.field_d, 0);
                        pj.field_D.a(18, -20500, 42 + jn.field_c, 2 + jn.field_d, -40 + (eb.field_c.field_gb + -jn.field_c - 2));
                        bu.field_a.a(0, false, eb.field_c.field_gb, 2, jn.field_c, 20 + (2 + jn.field_d), -20 + (-2 + (-jn.field_d + eb.field_c.field_ob)));
                        mp.field_Lb.a(40, -20500, lk.field_a.field_gb, lk.field_a.field_ob - 40, 0);
                        kd.field_F.a(30, -20500, pd.field_c.field_gb, 0, 0);
                        if (param0 >= 13) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        vc.field_l.a(-2 + pd.field_c.field_ob - 70, -20500, pd.field_c.field_gb, 30, 0);
                        var2_int = 3 + tq.field_b;
                        if (2 > lm.field_e.length) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var2_int--;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (!param1) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var2_int--;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var3 = -2 + (-15 + (-5 + vc.field_l.field_ob + (2 + (1 + var2_int) / 2))) / (var2_int - -1);
                        if (-31 > (var3 ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var3 = 30;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var4 = -5 + (vc.field_l.field_ob - (5 - -((var3 + 2) * var2_int)));
                        if (var4 <= 40) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var4 = 40;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        iu.field_d.a(var4, -20500, vc.field_l.field_gb - 5 - 5, 5, 5);
                        var5 = 5 + var4 + 2;
                        var6 = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (4 + tq.field_b <= var6) {
                            statePc = 80;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = -2;
                        stackIn_82_0 = stackOut_21_0;
                        stackIn_22_0 = stackOut_21_0;
                        if (var13 != 0) {
                            statePc = 82;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (stackIn_22_0 != (var6 ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (-3 < (lm.field_e.length ^ -1)) {
                            statePc = 79;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (3 != var6) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (1 >= ei.field_h) {
                            statePc = 79;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (param1) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var6 == 3) {
                            statePc = 73;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (!param1) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var6 == 0) {
                            statePc = 65;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (param1) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackOut_35_0 = 0;
                        stackIn_44_0 = stackOut_35_0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (-5 >= (var6 ^ -1)) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackOut_37_0 = 0;
                        stackIn_44_0 = stackOut_37_0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (vb.field_o != null) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackOut_39_0 = 0;
                        stackIn_44_0 = stackOut_39_0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (vb.field_o[var6 + -4]) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackOut_41_0 = 0;
                        stackIn_44_0 = stackOut_41_0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackOut_42_0 = 1;
                        stackIn_44_0 = stackOut_42_0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var7_int = stackIn_44_0;
                        if (var7_int == 0) {
                            statePc = 53;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var8_ref_je = rl.field_z[var6];
                        rl.field_z[var6].field_ob = 0;
                        var8_ref_je.field_gb = 0;
                        var9_int = 0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var9_int >= pu.field_k[var6].length) {
                            statePc = 52;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackOut_47_0 = pu.field_k[var6][var9_int];
                        stackIn_81_0 = stackOut_47_0;
                        stackIn_48_0 = stackOut_47_0;
                        if (var13 != 0) {
                            statePc = 81;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (stackIn_48_0 != null) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var10_ref_nf = pu.field_k[var6][var9_int];
                        pu.field_k[var6][var9_int].field_ob = 0;
                        var10_ref_nf.field_gb = 0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var9_int++;
                        if (var13 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var13 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        rl.field_z[var6].a(var3, -20500, 103, var5, 5);
                        var8 = 110;
                        if (param1) {
                            statePc = 57;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (pu.field_k[var6][0] != null) {
                            statePc = 56;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var9 = pu.field_k[var6][0];
                        pu.field_k[var6][0].field_ob = 0;
                        var9.field_gb = 0;
                        if (var13 == 0) {
                            statePc = 58;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        pu.field_k[var6][0].a(var3, 2, -30061, 38, var5, var8, io.field_n);
                        var8 += 40;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var9_int = -5 + (pd.field_c.field_gb + (-var8 - -2));
                        var10 = pu.field_k[var6].length - 1;
                        var11 = 0;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var10 <= var11) {
                            statePc = 63;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var12 = var11 * var9_int / var10;
                        pu.field_k[var6][var11 - -1].a(var3, 2, -30061, var9_int * (1 + var11) / var10 - 2 + -var12, var5, var8 - -var12, io.field_n);
                        var11++;
                        if (var13 != 0) {
                            statePc = 64;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var5 = var5 + (var3 - -2);
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var13 == 0) {
                            statePc = 79;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var14 = rl.field_z[var6];
                        var7 = var14;
                        rl.field_z[var6].field_ob = 0;
                        var14.field_gb = 0;
                        var8 = 0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (pu.field_k[var6].length <= var8) {
                            statePc = 72;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        stackOut_67_0 = null;
                        stackOut_67_1 = pu.field_k[var6][var8];
                        stackIn_68_0 = stackOut_67_0;
                        stackIn_68_1 = stackOut_67_1;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        stackOut_68_0 = stackIn_68_0;
                        stackOut_68_1 = (nf) ((Object) stackIn_68_1);
                        stackIn_76_0 = stackOut_68_0;
                        stackIn_76_1 = stackOut_68_1;
                        stackIn_69_0 = stackOut_68_0;
                        stackIn_69_1 = stackOut_68_1;
                        if (var13 != 0) {
                            statePc = 76;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (stackIn_69_0 == stackIn_69_1) {
                            statePc = 71;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var9 = pu.field_k[var6][var8];
                        pu.field_k[var6][var8].field_ob = 0;
                        var9.field_gb = 0;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var8++;
                        if (var13 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (var13 == 0) {
                            statePc = 79;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var7 = rl.field_z[var6];
                        rl.field_z[var6].field_ob = 0;
                        var7.field_gb = 0;
                        var8 = 0;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (var8 >= pu.field_k[var6].length) {
                            statePc = 79;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        stackOut_75_0 = null;
                        stackOut_75_1 = pu.field_k[var6][var8];
                        stackIn_68_0 = stackOut_75_0;
                        stackIn_68_1 = stackOut_75_1;
                        stackIn_76_0 = stackOut_75_0;
                        stackIn_76_1 = stackOut_75_1;
                        if (var13 != 0) {
                            statePc = 68;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (stackIn_76_0 == stackIn_76_1) {
                            statePc = 78;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var9 = pu.field_k[var6][var8];
                        pu.field_k[var6][var8].field_ob = 0;
                        var9.field_gb = 0;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var8++;
                        if (var13 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var6++;
                        if (var13 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        ta.field_R.a(-134 + (qn.field_g + -10), -20500, 360, 10, qn.field_l - 360 >> 891064609);
                        bk.field_f.a(24, -20500, ta.field_R.field_gb, 0, 0);
                        df.field_K.a(-24 + ta.field_R.field_ob, -20500, ta.field_R.field_gb, 24, 0);
                        df.field_K.field_G = tq.a(11579568, false, df.field_K.field_ob, 1, 3, 8421504);
                        nf.field_Kb.a(df.field_K.field_ob + -36, -20500, df.field_K.field_gb - 10, 5, 5);
                        stackOut_80_0 = dv.field_m;
                        stackIn_81_0 = stackOut_80_0;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        ((je) (Object) stackIn_81_0).a(24, -20500, 80, -24 + df.field_K.field_ob + -5, (df.field_K.field_gb + -80) / 2);
                        stackOut_81_0 = 120;
                        stackIn_82_0 = stackOut_81_0;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        mj.a((byte) stackIn_82_0);
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 84: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw ig.a((Throwable) ((Object) var2), "je.CB(" + param0 + ',' + param1 + ')');
                }
                case 85: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
        int var3 = 0;
        je var4 = null;
        L0: {
          L1: {
            var3 = ArmiesOfGielinor.field_M ? 1 : 0;
            if (null != this.field_fb) {
              var4 = (je) ((Object) this.field_fb.d((byte) -112));
              L2: while (true) {
                if (var4 == null) {
                  break L1;
                } else {
                  var4.field_Cb = true;
                  var4.i(-10027);
                  var4 = (je) ((Object) this.field_fb.b((byte) -104));
                  if (var3 != 0) {
                    break L0;
                  } else {
                    if (var3 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            } else {
              break L1;
            }
          }
          if (param0 == -10027) {
            break L0;
          } else {
            this.field_fb = (at) null;
            break L0;
          }
        }
    }

    final void a(je param0, boolean param1, int param2, je param3) {
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
              if (param1) {
                break L1;
              } else {
                je.a(-53, false);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param3 == null) {
                  break L3;
                } else {
                  param0.field_db = param3.field_nb + param3.field_db;
                  param0.field_ab = param3.field_ab - (-param3.field_ob - param2);
                  if (!ArmiesOfGielinor.field_M) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              param0.field_db = 0;
              param0.field_ab = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("je.PA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
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
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    private final void a(byte param0, int param1, boolean param2, int param3, int param4, boolean param5, boolean param6, boolean param7, int param8, boolean param9, boolean param10) {
        int discarded$2 = 0;
        int discarded$3 = 0;
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
        int var23_int = 0;
        je var23 = null;
        String var23_ref = null;
        int var24 = 0;
        int var25 = 0;
        String var26 = null;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
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
            L21: {
              var21 = this.field_F + var19;
              var22 = var20 + this.field_z;
              if (this.field_ub) {
                break L21;
              } else {
                i.a(var16, this.field_ob, this.field_V, (byte) -47, this.field_D, this.field_gb);
                if (var25 == 0) {
                  break L20;
                } else {
                  break L21;
                }
              }
            }
            i.a(var16, param1, param8, (byte) -47, param4, param3);
            break L20;
          }
          L22: {
            if (var17 != null) {
              L23: {
                var23_int = var21 + this.field_V;
                if (1 != this.field_Eb) {
                  break L23;
                } else {
                  var23_int = var23_int + (this.field_gb + -var17.field_A) / 2;
                  break L23;
                }
              }
              L24: {
                var24 = this.field_D + var22;
                if (-2 != (this.field_Fb ^ -1)) {
                  break L24;
                } else {
                  var24 = var24 + (-var17.field_x + this.field_ob) / 2;
                  break L24;
                }
              }
              L25: {
                if (2 != this.field_Eb) {
                  break L25;
                } else {
                  var23_int = var23_int + (this.field_gb - var17.field_A);
                  break L25;
                }
              }
              L26: {
                if (2 == this.field_Fb) {
                  var24 = var24 + (this.field_ob - var17.field_x);
                  break L26;
                } else {
                  break L26;
                }
              }
              if (256 > this.field_kb) {
                var17.e(var23_int, var24, this.field_kb);
                if (var25 == 0) {
                  break L22;
                } else {
                  var17.g(var23_int, var24);
                  break L22;
                }
              } else {
                var17.g(var23_int, var24);
                break L22;
              }
            } else {
              break L22;
            }
          }
          L27: {
            if (null == this.field_X) {
              break L27;
            } else {
              if (this.field_Z == null) {
                break L27;
              } else {
                L28: {
                  var26 = this.field_X;
                  var23_ref = var26;
                  var23_ref = var26;
                  var23_ref = var26;
                  if (!param2) {
                    break L28;
                  } else {
                    if (null == this.field_I) {
                      break L28;
                    } else {
                      var23_ref = var26 + this.field_I;
                      break L28;
                    }
                  }
                }
                L29: {
                  if (this.field_Z.a(var23_ref) > this.field_gb + -(2 * this.field_O)) {
                    break L29;
                  } else {
                    if (-1 >= (var23_ref.indexOf("<br>") ^ -1)) {
                      break L29;
                    } else {
                      L30: {
                        L31: {
                          if ((this.field_Fb ^ -1) != -2) {
                            break L31;
                          } else {
                            var22 = var22 + (-this.field_Z.field_L + this.field_ob - this.field_Z.field_H) / 2;
                            if (var25 == 0) {
                              break L30;
                            } else {
                              break L31;
                            }
                          }
                        }
                        if (-3 != (this.field_Fb ^ -1)) {
                          break L30;
                        } else {
                          var22 = var22 + (-this.field_Z.field_H + (-this.field_Z.field_L + this.field_ob));
                          break L30;
                        }
                      }
                      L32: {
                        if (this.field_Eb == 0) {
                          break L32;
                        } else {
                          L33: {
                            if ((this.field_Eb ^ -1) != -2) {
                              break L33;
                            } else {
                              this.field_Z.a(var23_ref, var21 + (this.field_V - -this.field_O + (this.field_gb - 2 * this.field_O) / 2), var22 + (this.field_D - -this.field_Z.field_H), var18, -1, this.field_C);
                              if (var25 == 0) {
                                break L27;
                              } else {
                                break L33;
                              }
                            }
                          }
                          L34: {
                            if (2 != this.field_Eb) {
                              break L34;
                            } else {
                              this.field_Z.c(var23_ref, this.field_V + this.field_O - -var21 - (-this.field_gb - -(this.field_O * 2)), var22 + this.field_D + this.field_Z.field_H, var18, -1, this.field_C);
                              if (var25 == 0) {
                                break L27;
                              } else {
                                break L34;
                              }
                            }
                          }
                          discarded$2 = this.field_Z.a(var23_ref, this.field_V - -this.field_O - -var21, var22 + this.field_D, -(2 * this.field_O) + this.field_gb, this.field_ob, var18, -1, this.field_C, this.field_Eb, this.field_Fb, this.field_pb);
                          if (var25 == 0) {
                            break L27;
                          } else {
                            break L32;
                          }
                        }
                      }
                      this.field_Z.b(var23_ref, this.field_O + this.field_V + var21, this.field_Z.field_H + (this.field_D - -var22), var18, -1, this.field_C);
                      if (var25 == 0) {
                        break L27;
                      } else {
                        break L29;
                      }
                    }
                  }
                }
                discarded$3 = this.field_Z.a(var23_ref, this.field_O + this.field_V + var21, var22 + this.field_D, -(2 * this.field_O) + this.field_gb, this.field_ob, var18, -1, this.field_C, this.field_Eb, this.field_Fb, this.field_pb);
                break L27;
              }
            }
          }
          L35: {
            L36: {
              if (this.field_fb != null) {
                var23 = (je) ((Object) this.field_fb.e((byte) 118));
                L37: while (true) {
                  if (var23 == null) {
                    break L36;
                  } else {
                    var23.a((byte) -26, this.field_ob, param2, this.field_gb, var20 + this.field_D, param5, this.field_Y, param7, this.field_V - -var19, param9, param10);
                    var23 = (je) ((Object) this.field_fb.a((byte) 123));
                    if (var25 != 0) {
                      break L35;
                    } else {
                      if (var25 == 0) {
                        continue L37;
                      } else {
                        break L36;
                      }
                    }
                  }
                }
              } else {
                break L36;
              }
            }
            qn.f(var12, var13, var14, var15);
            break L35;
          }
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
        } else {
          this.field_db = 0;
          this.field_Hb = 0;
          this.field_S = param4;
          this.field_ob = param0;
          return;
        }
    }

    final int a(boolean param0, int param1) {
        int var3 = 0;
        int var4_int = 0;
        je var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_19_0 = 0;
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0) {
            break L0;
          } else {
            this.field_ab = -10;
            break L0;
          }
        }
        L1: {
          var3 = 0;
          if (null == this.field_X) {
            break L1;
          } else {
            if (null == this.field_Z) {
              break L1;
            } else {
              var4_int = this.field_Z.a(this.field_X, param1);
              if (var3 >= var4_int) {
                break L1;
              } else {
                var3 = var4_int;
                break L1;
              }
            }
          }
        }
        L2: {
          if (this.field_cb != null) {
            var4_int = this.field_cb.field_A;
            if (var3 >= var4_int) {
              break L2;
            } else {
              var3 = var4_int;
              break L2;
            }
          } else {
            break L2;
          }
        }
        L3: {
          L4: {
            if (this.field_fb != null) {
              var4 = (je) ((Object) this.field_fb.e((byte) 93));
              L5: while (true) {
                if (var4 == null) {
                  break L4;
                } else {
                  var5 = var4.field_S - -var4.field_gb;
                  stackOut_14_0 = var5;
                  stackIn_20_0 = stackOut_14_0;
                  stackIn_15_0 = stackOut_14_0;
                  if (var6 != 0) {
                    break L3;
                  } else {
                    L6: {
                      if (stackIn_15_0 > var3) {
                        var3 = var5;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var4 = (je) ((Object) this.field_fb.a((byte) 123));
                    if (var6 == 0) {
                      continue L5;
                    } else {
                      break L4;
                    }
                  }
                }
              }
            } else {
              break L4;
            }
          }
          stackOut_19_0 = var3;
          stackIn_20_0 = stackOut_19_0;
          break L3;
        }
        return stackIn_20_0;
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
          L0: {
            L1: {
              this.field_ob = param5;
              this.field_S = param2;
              this.field_ab = param3;
              this.field_gb = param4;
              this.field_i = param0;
              this.a(0, param1);
              if (param6 == null) {
                break L1;
              } else {
                this.field_X = param6;
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
            stackOut_4_1 = new StringBuilder().append("je.<init>(").append(param0).append(',');
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
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    static {
        field_lb = "Wizards and warriors, foul demons and brutal orks, vicious goblins and fearless dwarves: all are yours to summon and command.";
        field_zb = "Private";
        field_K = new int[][]{new int[]{35, 0}, new int[]{42, 42}, new int[]{35, 0}, new int[]{13, 40}, new int[]{33, 48}, new int[]{25, 0}, new int[]{28, 0}, new int[]{50, 41}, new int[]{43, 0}, new int[]{30, 0}, new int[]{50, 0}, new int[]{50, 41}, new int[]{33, 0}, new int[]{32, 0}, new int[]{36, 36}, new int[]{30, 0}, new int[]{24, 39}, new int[]{50, 41}, new int[]{38, 38}, new int[]{35, 0}, new int[]{20, 0}, new int[]{35, 0}, new int[]{50, 41}, new int[]{33, 0}, new int[]{45, 0}, new int[]{25, 38}, new int[]{49, 0}, new int[]{30, 0}, new int[]{24, 0}, new int[]{25, 0}, new int[]{37, 0}, new int[]{58, 0}, new int[]{50, 41}, new int[]{35, 0}, new int[]{35, 0}, new int[]{51, 0}, new int[]{50, 0}, new int[]{11, 11}, new int[]{20, 20}, new int[]{35, 0}, new int[]{38, 0}, new int[]{30, 0}, new int[]{75, 0}, new int[]{24, 0}, new int[]{24, 0}, new int[]{20, 0}, new int[]{58, 0}, new int[]{37, 0}, new int[]{25, 38}, new int[]{37, 0}, new int[]{50, 0}, new int[]{40, 35}, new int[]{31, 0}, new int[]{28, 0}, new int[]{53, 0}, new int[]{53, 0}, new int[]{53, 0}, new int[]{44, 0}, new int[]{53, 0}, new int[]{53, 0}, new int[]{41, 0}, new int[]{53, 0}, new int[]{30, 0}, new int[]{38, 0}, new int[]{47, 0}, new int[]{63, 0}, new int[]{32, 0}, new int[]{22, 0}, new int[]{43, 0}, new int[]{36, 0}, new int[]{25, 0}, new int[]{25, 0}, new int[]{25, 0}, new int[]{50, 41}, new int[]{33, 48}, new int[]{18, 18}, new int[]{1, 0}, new int[]{24, 0}, new int[]{24, 39}, new int[]{25, 38}, new int[]{25, 38}, new int[]{33, 48}, new int[]{50, 41}, new int[]{34, 4}, new int[]{25, 3}, new int[]{35, 21}, new int[]{19, 3}, new int[]{18, 2}, new int[]{25, 6}, new int[]{35, 21}};
    }
}
