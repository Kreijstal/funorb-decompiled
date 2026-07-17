/*
 * Decompiled by CFR-JS 0.4.0.
 */
class cr extends fh {
    int field_K;
    private int field_zb;
    int field_ab;
    int field_H;
    private int field_hb;
    private int field_rb;
    int field_C;
    boolean field_jb;
    int field_kb;
    private int field_fb;
    er field_W;
    String field_J;
    boolean field_pb;
    int field_O;
    boolean field_X;
    er field_mb;
    int field_qb;
    int field_tb;
    private boolean field_nb;
    String field_S;
    private boolean field_sb;
    int field_R;
    int field_xb;
    int field_B;
    static int[] field_P;
    boolean field_G;
    int field_wb;
    int field_U;
    er[] field_Bb;
    static boolean[] field_eb;
    int field_bb;
    nj field_M;
    static String field_Z;
    int field_ob;
    boolean field_V;
    int field_Cb;
    static er field_E;
    int field_db;
    er[] field_T;
    er[] field_Q;
    int field_N;
    int field_Fb;
    int field_L;
    private int field_F;
    boolean field_lb;
    private int field_vb;
    int field_A;
    er[] field_gb;
    er[] field_cb;
    er field_I;
    er field_Ab;
    private boolean field_ib;
    cc field_z;
    int field_Gb;
    er field_Db;
    private int field_Eb;
    int field_D;
    private int field_yb;
    int field_Y;
    int field_ub;

    final void a(byte param0, cr param1, cr param2, int param3) {
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
              if (param0 > 2) {
                break L1;
              } else {
                ((cr) this).a(22, -78, 66, true);
                break L1;
              }
            }
            L2: {
              if (param1 == null) {
                param2.field_N = 0;
                param2.field_L = 0;
                break L2;
              } else {
                param2.field_N = param3 + (param1.field_db + param1.field_N);
                param2.field_L = param1.field_kb + param1.field_L;
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
            stackOut_6_1 = new StringBuilder().append("cr.AA(").append(param0).append(44);
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
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
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
          throw wn.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param3 + 41);
        }
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        int var9 = 0;
        cr var10_ref_cr = null;
        int var11 = Vertigo2.field_L ? 1 : 0;
        int var5 = -((cr) this).field_N;
        int var6 = var5 + -((cr) this).field_L;
        int var7 = ((cr) this).field_db;
        int var8 = var7 - -((cr) this).field_kb;
        if (!param3) {
            var9 = 0;
            var10_ref_cr = (cr) (Object) ((cr) this).field_M.a((byte) 100);
            while (var10_ref_cr != null) {
                var10_ref_cr.field_L = -var10_ref_cr.field_N + var9;
                var9 = var9 + (param2 + var10_ref_cr.field_kb + var10_ref_cr.field_db);
                var10_ref_cr = (cr) (Object) ((cr) this).field_M.b(126);
            }
            var8 = var9 + -param2;
        }
        var9 = -param0 + var8;
        if (var6 > var9) {
            var6 = var9;
        }
        if (!(var6 >= 0)) {
            var6 = 0;
        }
        int var10 = -param0 + var7;
        if (!(var5 <= var10)) {
            var5 = var10;
        }
        if (param1 > var5) {
            var5 = 0;
        }
        ((cr) this).field_db = var7;
        ((cr) this).field_L = -var6 + var5;
        ((cr) this).field_kb = -var7 + var8;
        ((cr) this).field_N = -var5;
    }

    final void a(cr param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_98_0 = null;
        Object stackIn_99_0 = null;
        Object stackIn_100_0 = null;
        Object stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        String stackIn_108_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_97_0 = null;
        Object stackOut_98_0 = null;
        Object stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        Object stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        RuntimeException stackOut_105_0 = null;
        StringBuilder stackOut_105_1 = null;
        RuntimeException stackOut_107_0 = null;
        StringBuilder stackOut_107_1 = null;
        String stackOut_107_2 = null;
        RuntimeException stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        String stackOut_106_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                L2: {
                  if (param0.field_R != 0) {
                    ((cr) this).field_R = param0.field_R;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param0.field_Bb != null) {
                    ((cr) this).field_Bb = param0.field_Bb;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param0.field_A == 0) {
                    break L4;
                  } else {
                    ((cr) this).field_A = param0.field_A;
                    break L4;
                  }
                }
                L5: {
                  if (!param0.field_lb) {
                    ((cr) this).field_lb = param0.field_lb;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (null == param0.field_z) {
                    break L6;
                  } else {
                    ((cr) this).field_z = param0.field_z;
                    break L6;
                  }
                }
                L7: {
                  if (null == param0.field_Q) {
                    break L7;
                  } else {
                    ((cr) this).field_Q = param0.field_Q;
                    break L7;
                  }
                }
                L8: {
                  if (!param0.field_jb) {
                    break L8;
                  } else {
                    ((cr) this).field_jb = param0.field_jb;
                    break L8;
                  }
                }
                L9: {
                  if (0 > param0.field_D) {
                    break L9;
                  } else {
                    ((cr) this).field_D = param0.field_D;
                    break L9;
                  }
                }
                L10: {
                  if (param0.field_ib) {
                    ((cr) this).field_ib = param0.field_ib;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (null == param0.field_I) {
                    break L11;
                  } else {
                    ((cr) this).field_I = param0.field_I;
                    break L11;
                  }
                }
                L12: {
                  if (!param0.field_sb) {
                    break L12;
                  } else {
                    ((cr) this).field_sb = param0.field_sb;
                    break L12;
                  }
                }
                L13: {
                  if (param0.field_V) {
                    ((cr) this).field_V = param0.field_V;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (0 > param0.field_H) {
                    break L14;
                  } else {
                    ((cr) this).field_H = param0.field_H;
                    break L14;
                  }
                }
                L15: {
                  if (param0.field_mb == null) {
                    break L15;
                  } else {
                    ((cr) this).field_mb = param0.field_mb;
                    break L15;
                  }
                }
                L16: {
                  if (param0.field_cb != null) {
                    ((cr) this).field_cb = param0.field_cb;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (param0.field_gb == null) {
                    break L17;
                  } else {
                    ((cr) this).field_gb = param0.field_gb;
                    break L17;
                  }
                }
                L18: {
                  if (param0.field_Ab != null) {
                    ((cr) this).field_Ab = param0.field_Ab;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (param0.field_U == 256) {
                    break L19;
                  } else {
                    ((cr) this).field_U = param0.field_U;
                    break L19;
                  }
                }
                L20: {
                  if (null != param0.field_W) {
                    ((cr) this).field_W = param0.field_W;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (null != param0.field_Db) {
                    ((cr) this).field_Db = param0.field_Db;
                    break L21;
                  } else {
                    break L21;
                  }
                }
                L22: {
                  if (null != param0.field_S) {
                    ((cr) this).field_S = param0.field_S;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (null != param0.field_T) {
                    ((cr) this).field_T = param0.field_T;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (param0.field_K >= 0) {
                    ((cr) this).field_K = param0.field_K;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (param0.field_qb != 0) {
                    ((cr) this).field_qb = param0.field_qb;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (null != param0.field_J) {
                    ((cr) this).field_J = param0.field_J;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (param0.field_B < 0) {
                    break L27;
                  } else {
                    ((cr) this).field_B = param0.field_B;
                    break L27;
                  }
                }
                L28: {
                  if (param0.field_X) {
                    ((cr) this).field_X = param0.field_X;
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  if (param0.field_hb != 0) {
                    ((cr) this).field_hb = param0.field_hb;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (param0.field_ab == 0) {
                    break L30;
                  } else {
                    ((cr) this).field_ab = param0.field_ab;
                    break L30;
                  }
                }
                L31: {
                  if (param0.field_rb != 0) {
                    ((cr) this).field_rb = param0.field_rb;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (param0.field_Cb != -2147483648) {
                    ((cr) this).field_Cb = param0.field_Cb;
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L33: {
                  if (param0.field_O != 0) {
                    ((cr) this).field_O = param0.field_O;
                    break L33;
                  } else {
                    break L33;
                  }
                }
                L34: {
                  if (param0.field_yb != -2147483648) {
                    ((cr) this).field_yb = param0.field_yb;
                    break L34;
                  } else {
                    break L34;
                  }
                }
                L35: {
                  if (param0.field_Gb != -2147483648) {
                    ((cr) this).field_Gb = param0.field_Gb;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                L36: {
                  if (param0.field_F != -2147483648) {
                    ((cr) this).field_F = param0.field_F;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (param0.field_Y == -2147483648) {
                    break L37;
                  } else {
                    ((cr) this).field_Y = param0.field_Y;
                    break L37;
                  }
                }
                L38: {
                  if (param0.field_bb == -2147483648) {
                    break L38;
                  } else {
                    ((cr) this).field_bb = param0.field_bb;
                    break L38;
                  }
                }
                L39: {
                  L40: {
                    stackOut_97_0 = this;
                    stackIn_100_0 = stackOut_97_0;
                    stackIn_98_0 = stackOut_97_0;
                    if (!((cr) this).field_sb) {
                      break L40;
                    } else {
                      stackOut_98_0 = this;
                      stackIn_100_0 = stackOut_98_0;
                      stackIn_99_0 = stackOut_98_0;
                      if (!param0.field_nb) {
                        break L40;
                      } else {
                        stackOut_99_0 = this;
                        stackOut_99_1 = 1;
                        stackIn_101_0 = stackOut_99_0;
                        stackIn_101_1 = stackOut_99_1;
                        break L39;
                      }
                    }
                  }
                  stackOut_100_0 = this;
                  stackOut_100_1 = 0;
                  stackIn_101_0 = stackOut_100_0;
                  stackIn_101_1 = stackOut_100_1;
                  break L39;
                }
                ((cr) this).field_nb = stackIn_101_1 != 0;
                break L1;
              }
            }
            L41: {
              if (param1 <= -4) {
                break L41;
              } else {
                ((cr) this).field_Fb = 105;
                break L41;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L42: {
            var3 = decompiledCaughtException;
            stackOut_105_0 = (RuntimeException) var3;
            stackOut_105_1 = new StringBuilder().append("cr.Q(");
            stackIn_107_0 = stackOut_105_0;
            stackIn_107_1 = stackOut_105_1;
            stackIn_106_0 = stackOut_105_0;
            stackIn_106_1 = stackOut_105_1;
            if (param0 == null) {
              stackOut_107_0 = (RuntimeException) (Object) stackIn_107_0;
              stackOut_107_1 = (StringBuilder) (Object) stackIn_107_1;
              stackOut_107_2 = "null";
              stackIn_108_0 = stackOut_107_0;
              stackIn_108_1 = stackOut_107_1;
              stackIn_108_2 = stackOut_107_2;
              break L42;
            } else {
              stackOut_106_0 = (RuntimeException) (Object) stackIn_106_0;
              stackOut_106_1 = (StringBuilder) (Object) stackIn_106_1;
              stackOut_106_2 = "{...}";
              stackIn_108_0 = stackOut_106_0;
              stackIn_108_1 = stackOut_106_1;
              stackIn_108_2 = stackOut_106_2;
              break L42;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_108_0, stackIn_108_2 + 44 + param1 + 41);
        }
    }

    private final void a(boolean param0, int param1, boolean param2, int param3, int param4, boolean param5, int param6, boolean param7, boolean param8, int param9, boolean param10) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        er[] var16 = null;
        er var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        Object var24 = null;
        int var24_int = 0;
        cr var24_ref = null;
        int var25 = 0;
        int var26 = 0;
        String var27 = null;
        String var28 = null;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        L0: {
          var24 = null;
          var26 = Vertigo2.field_L ? 1 : 0;
          ((cr) this).field_ob = ((cr) this).field_wb + param4;
          ((cr) this).field_C = ((cr) this).field_N + param3;
          var12 = bi.field_d;
          var13 = bi.field_f;
          var14 = bi.field_i;
          var15 = bi.field_c;
          bi.c(((cr) this).field_ob, ((cr) this).field_C, ((cr) this).field_Fb + ((cr) this).field_ob, ((cr) this).field_C - -((cr) this).field_db);
          param2 = param2 & ((cr) this).field_lb;
          if (((cr) this).field_ib) {
            break L0;
          } else {
            L1: {
              param0 = ((cr) this).field_pb;
              param7 = ((cr) this).field_V;
              if (((cr) this).field_xb == 0) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            param10 = stackIn_4_0 != 0;
            break L0;
          }
        }
        L2: {
          var16 = ((cr) this).field_Bb;
          var17 = ((cr) this).field_Db;
          var18 = ((cr) this).field_A;
          var19 = 0;
          var20 = 0;
          if (!param2) {
            L3: {
              if (0 <= ((cr) this).field_D) {
                var18 = ((cr) this).field_D;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (((cr) this).field_I == null) {
                break L4;
              } else {
                var17 = ((cr) this).field_I;
                break L4;
              }
            }
            if (((cr) this).field_gb != null) {
              var16 = ((cr) this).field_gb;
              break L2;
            } else {
              break L2;
            }
          } else {
            break L2;
          }
        }
        L5: {
          var21 = -98 % ((param6 - -17) / 32);
          if (param0) {
            L6: {
              if (((cr) this).field_W != null) {
                var17 = ((cr) this).field_W;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (-2147483648 != ((cr) this).field_yb) {
                var20 = ((cr) this).field_yb;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (((cr) this).field_F != -2147483648) {
                var19 = ((cr) this).field_F;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (((cr) this).field_B < 0) {
                break L9;
              } else {
                var18 = ((cr) this).field_B;
                break L9;
              }
            }
            if (((cr) this).field_Q != null) {
              var16 = ((cr) this).field_Q;
              break L5;
            } else {
              break L5;
            }
          } else {
            break L5;
          }
        }
        L10: {
          if (!param10) {
            break L10;
          } else {
            L11: {
              if (((cr) this).field_cb != null) {
                var16 = ((cr) this).field_cb;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (((cr) this).field_Ab == null) {
                break L12;
              } else {
                var17 = ((cr) this).field_Ab;
                break L12;
              }
            }
            L13: {
              if (0 <= ((cr) this).field_H) {
                var18 = ((cr) this).field_H;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (-2147483648 != ((cr) this).field_Gb) {
                var19 = ((cr) this).field_Gb;
                break L14;
              } else {
                break L14;
              }
            }
            if (-2147483648 == ((cr) this).field_bb) {
              break L10;
            } else {
              var20 = ((cr) this).field_bb;
              break L10;
            }
          }
        }
        L15: {
          if (!param7) {
            break L15;
          } else {
            L16: {
              if (((cr) this).field_Cb != -2147483648) {
                var19 = ((cr) this).field_Cb;
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              if (-2147483648 != ((cr) this).field_Y) {
                var20 = ((cr) this).field_Y;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              if (0 <= ((cr) this).field_K) {
                var18 = ((cr) this).field_K;
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              if (null == ((cr) this).field_T) {
                break L19;
              } else {
                var16 = ((cr) this).field_T;
                break L19;
              }
            }
            if (((cr) this).field_mb == null) {
              break L15;
            } else {
              var17 = ((cr) this).field_mb;
              break L15;
            }
          }
        }
        L20: {
          var22 = var19 + ((cr) this).field_hb;
          var23 = ((cr) this).field_rb - -var20;
          if (((cr) this).field_jb) {
            bc.a(param9, param3, (byte) 102, var16, param1, param4);
            break L20;
          } else {
            bc.a(((cr) this).field_db, ((cr) this).field_C, (byte) 82, var16, ((cr) this).field_Fb, ((cr) this).field_ob);
            break L20;
          }
        }
        L21: {
          if (var17 != null) {
            L22: {
              var24_int = ((cr) this).field_ob - -var22;
              var25 = ((cr) this).field_C + var23;
              if (((cr) this).field_O != 1) {
                break L22;
              } else {
                var24_int = var24_int + (-var17.field_x + ((cr) this).field_Fb) / 2;
                break L22;
              }
            }
            L23: {
              if (((cr) this).field_ab != 1) {
                break L23;
              } else {
                var25 = var25 + (((cr) this).field_db + -var17.field_B) / 2;
                break L23;
              }
            }
            L24: {
              if (((cr) this).field_O == 2) {
                var24_int = var24_int + (((cr) this).field_Fb + -var17.field_x);
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              if (((cr) this).field_ab == 2) {
                var25 = var25 + (((cr) this).field_db - var17.field_B);
                break L25;
              } else {
                break L25;
              }
            }
            if (((cr) this).field_vb < 256) {
              var17.c(var24_int, var25, ((cr) this).field_vb);
              break L21;
            } else {
              var17.e(var24_int, var25);
              break L21;
            }
          } else {
            break L21;
          }
        }
        L26: {
          if (null == ((cr) this).field_S) {
            break L26;
          } else {
            if (null != ((cr) this).field_z) {
              L27: {
                var27 = ((cr) this).field_S;
                var28 = var27;
                var28 = var27;
                if (!param5) {
                  break L27;
                } else {
                  if (((cr) this).field_J != null) {
                    var28 = var27 + ((cr) this).field_J;
                    break L27;
                  } else {
                    break L27;
                  }
                }
              }
              L28: {
                if (((cr) this).field_z.c(var28) > ((cr) this).field_Fb + -(2 * ((cr) this).field_R)) {
                  break L28;
                } else {
                  if (var28.indexOf("<br>") >= 0) {
                    break L28;
                  } else {
                    L29: {
                      if (((cr) this).field_ab != 1) {
                        if (((cr) this).field_ab == 2) {
                          var23 = var23 + (((cr) this).field_db + -((cr) this).field_z.field_M - ((cr) this).field_z.field_z);
                          break L29;
                        } else {
                          break L29;
                        }
                      } else {
                        var23 = var23 + (-((cr) this).field_z.field_M + (((cr) this).field_db - ((cr) this).field_z.field_z)) / 2;
                        break L29;
                      }
                    }
                    if (((cr) this).field_O == 0) {
                      ((cr) this).field_z.a(var28, ((cr) this).field_R + (((cr) this).field_ob + var22), var23 + (((cr) this).field_C + ((cr) this).field_z.field_z), var18, -1, ((cr) this).field_U);
                      break L26;
                    } else {
                      if (1 == ((cr) this).field_O) {
                        ((cr) this).field_z.b(var28, var22 + ((cr) this).field_ob - (-((cr) this).field_R - (-(2 * ((cr) this).field_R) + ((cr) this).field_Fb) / 2), ((cr) this).field_z.field_z + var23 + ((cr) this).field_C, var18, -1, ((cr) this).field_U);
                        break L26;
                      } else {
                        if (2 != ((cr) this).field_O) {
                          int discarded$2 = ((cr) this).field_z.a(var28, var22 + ((cr) this).field_ob + ((cr) this).field_R, var23 + ((cr) this).field_C, -(2 * ((cr) this).field_R) + ((cr) this).field_Fb, ((cr) this).field_db, var18, -1, ((cr) this).field_U, ((cr) this).field_O, ((cr) this).field_ab, ((cr) this).field_qb);
                          break L26;
                        } else {
                          ((cr) this).field_z.c(var28, -(((cr) this).field_R * 2) - -((cr) this).field_Fb + (((cr) this).field_ob - -((cr) this).field_R) + var22, ((cr) this).field_z.field_z + ((cr) this).field_C - -var23, var18, -1, ((cr) this).field_U);
                          break L26;
                        }
                      }
                    }
                  }
                }
              }
              int discarded$3 = ((cr) this).field_z.a(var28, ((cr) this).field_R + (((cr) this).field_ob - -var22), ((cr) this).field_C - -var23, -(2 * ((cr) this).field_R) + ((cr) this).field_Fb, ((cr) this).field_db, var18, -1, ((cr) this).field_U, ((cr) this).field_O, ((cr) this).field_ab, ((cr) this).field_qb);
              break L26;
            } else {
              break L26;
            }
          }
        }
        L30: {
          if (null != ((cr) this).field_M) {
            var24_ref = (cr) (Object) ((cr) this).field_M.a((byte) 100);
            L31: while (true) {
              if (var24_ref == null) {
                break L30;
              } else {
                var24_ref.a(param0, var24_ref.field_Fb, param2, var20 + var24_ref.field_C, var19 + var24_ref.field_ob, param5, -102, param7, var24_ref.field_nb, var24_ref.field_db, param10);
                var24_ref = (cr) (Object) var24_ref.field_M.b(83);
                continue L31;
              }
            }
          } else {
            break L30;
          }
        }
        bi.g(var12, var13, var14, var15);
    }

    cr(long param0, cr param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final void b(boolean param0, int param1) {
        this.a(false, bi.field_e, true, param1, 0, param0, 41, false, false, bi.field_j, false);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 <= 71) {
            cr.b(-45, 118, -102, 29, 12);
        }
        ((cr) this).field_L = 0;
        ((cr) this).field_db = param2;
        ((cr) this).field_wb = param4;
        ((cr) this).field_kb = 0;
        ((cr) this).field_N = param3;
        ((cr) this).field_Eb = 0;
        ((cr) this).field_Fb = param1;
        ((cr) this).field_zb = 0;
    }

    cr(long param0, cr param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != -1) {
            Object var6 = null;
            wp discarded$0 = cr.b((String) null, 22);
        }
        if (param3 >= ap.field_e) {
            if (ib.field_a >= param3) {
                param0 = pk.a((byte) -14, cj.field_D, param0, ua.field_e);
                param1 = pk.a((byte) -14, cj.field_D, param1, ua.field_e);
                ce.a(param3, (byte) -76, param0, param4, param1);
            }
        }
    }

    public static void a(boolean param0) {
        field_eb = null;
        field_E = null;
        field_Z = null;
        field_P = null;
    }

    final void a(int param0, boolean param1) {
        gi.field_o = !param1 ? true : false;
        sj.field_e = !param1 ? true : false;
        this.a(param0 ^ 1074455266, param0, 0, bi.field_j, true, bi.field_e);
    }

    final int b(int param0, int param1) {
        int var4_int = 0;
        cr var4 = null;
        int var5 = 0;
        int var6 = Vertigo2.field_L ? 1 : 0;
        if (param0 != 2) {
            Object var7 = null;
            ((cr) this).a((byte) -126, (cr) null, (cr) null, 126);
        }
        int var3 = 0;
        if (((cr) this).field_S != null) {
            if (null != ((cr) this).field_z) {
                var4_int = ((cr) this).field_z.a(((cr) this).field_S, param1);
                if (var4_int > var3) {
                    var3 = var4_int;
                }
            }
        }
        if (!(((cr) this).field_Db == null)) {
            var4_int = ((cr) this).field_Db.field_x;
            if (!(var3 >= var4_int)) {
                var3 = var4_int;
            }
        }
        if (!(((cr) this).field_M == null)) {
            var4 = (cr) (Object) ((cr) this).field_M.a((byte) 100);
            while (var4 != null) {
                var5 = var4.field_Fb + var4.field_wb;
                if (var3 < var5) {
                    var3 = var5;
                }
                var4 = (cr) (Object) ((cr) this).field_M.b(param0 + 120);
            }
        }
        return var3;
    }

    final int j(int param0) {
        if (param0 != -21391) {
            Object var3 = null;
            ((cr) this).a((cr) null, 10);
        }
        return ((cr) this).b(param0 + 21393, 2147483647);
    }

    final static wp b(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_7_0 = null;
        wp stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        wp stackOut_9_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = param1;
            L1: while (true) {
              if (var2_int <= var3) {
                stackOut_9_0 = bp.field_A;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                var4 = param0.charAt(var3);
                if (var4 >= 48) {
                  if (var4 <= 57) {
                    var3++;
                    continue L1;
                  } else {
                    stackOut_6_0 = null;
                    stackIn_7_0 = stackOut_6_0;
                    return (wp) (Object) stackIn_7_0;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("cr.M(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
        return stackIn_10_0;
    }

    final void b(cr param0, int param1) {
        try {
            if (null == ((cr) this).field_M) {
                ((cr) this).field_M = new nj();
            }
            if (param1 < 117) {
                ((cr) this).field_lb = false;
            }
            ((cr) this).field_M.a((li) (Object) param0, false);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "cr.N(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, boolean param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
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
          var13 = null;
          var14 = Vertigo2.field_L ? 1 : 0;
          if (((cr) this).field_zb <= 0) {
            var7 = ((cr) this).field_zb >> 2;
            break L0;
          } else {
            var7 = -(-((cr) this).field_zb >> 2);
            break L0;
          }
        }
        L1: {
          ((cr) this).field_zb = ((cr) this).field_zb - var7;
          ((cr) this).field_wb = ((cr) this).field_wb + var7;
          if (0 >= ((cr) this).field_L) {
            var7 = ((cr) this).field_L >> 2;
            break L1;
          } else {
            var7 = -(-((cr) this).field_L >> 2);
            break L1;
          }
        }
        L2: {
          ((cr) this).field_N = ((cr) this).field_N + var7;
          ((cr) this).field_L = ((cr) this).field_L - var7;
          if (((cr) this).field_Eb > 0) {
            var7 = -(-((cr) this).field_Eb >> 2);
            break L2;
          } else {
            var7 = ((cr) this).field_Eb >> 2;
            break L2;
          }
        }
        L3: {
          ((cr) this).field_Eb = ((cr) this).field_Eb - var7;
          if (param0 == 1074455266) {
            break L3;
          } else {
            ((cr) this).a(58, -12, 77, false);
            break L3;
          }
        }
        L4: {
          ((cr) this).field_Fb = ((cr) this).field_Fb + var7;
          if (((cr) this).field_kb <= 0) {
            var7 = ((cr) this).field_kb >> 2;
            break L4;
          } else {
            var7 = -(-((cr) this).field_kb >> 2);
            break L4;
          }
        }
        L5: {
          L6: {
            ((cr) this).field_kb = ((cr) this).field_kb - var7;
            ((cr) this).field_ob = ((cr) this).field_wb + param2;
            ((cr) this).field_db = ((cr) this).field_db + var7;
            ((cr) this).field_C = ((cr) this).field_N + param1;
            param4 = param4 & ((cr) this).field_lb;
            var8 = bi.field_d;
            var9 = bi.field_f;
            var10 = bi.field_i;
            var11 = bi.field_c;
            bi.c(((cr) this).field_ob, ((cr) this).field_C, ((cr) this).field_Fb + ((cr) this).field_ob, ((cr) this).field_C + ((cr) this).field_db);
            var12 = 0;
            if (sj.field_e) {
              break L6;
            } else {
              if (!param4) {
                break L6;
              } else {
                if (kf.field_c == 0) {
                  break L6;
                } else {
                  if (sd.field_N < bi.field_d) {
                    break L6;
                  } else {
                    if (sd.field_N >= bi.field_i) {
                      break L6;
                    } else {
                      if (no.field_e < bi.field_f) {
                        break L6;
                      } else {
                        if (no.field_e < bi.field_c) {
                          ((cr) this).field_tb = kf.field_c;
                          ((cr) this).field_ub = -((cr) this).field_ob + sd.field_N;
                          var12 = 1;
                          ((cr) this).field_xb = kf.field_c;
                          ((cr) this).field_fb = -((cr) this).field_C + no.field_e;
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          ((cr) this).field_tb = 0;
          if (kf.field_c != 0) {
            ((cr) this).field_xb = 0;
            break L5;
          } else {
            break L5;
          }
        }
        L7: {
          if (q.field_v != 0) {
            break L7;
          } else {
            ((cr) this).field_xb = 0;
            break L7;
          }
        }
        L8: {
          L9: {
            stackOut_28_0 = this;
            stackIn_34_0 = stackOut_28_0;
            stackIn_29_0 = stackOut_28_0;
            if (gi.field_o) {
              break L9;
            } else {
              stackOut_29_0 = this;
              stackIn_34_0 = stackOut_29_0;
              stackIn_30_0 = stackOut_29_0;
              if (bi.field_d > ed.field_n) {
                break L9;
              } else {
                stackOut_30_0 = this;
                stackIn_34_0 = stackOut_30_0;
                stackIn_31_0 = stackOut_30_0;
                if (ed.field_n >= bi.field_i) {
                  break L9;
                } else {
                  stackOut_31_0 = this;
                  stackIn_34_0 = stackOut_31_0;
                  stackIn_32_0 = stackOut_31_0;
                  if (gb.field_d < bi.field_f) {
                    break L9;
                  } else {
                    stackOut_32_0 = this;
                    stackIn_34_0 = stackOut_32_0;
                    stackIn_33_0 = stackOut_32_0;
                    if (bi.field_c <= gb.field_d) {
                      break L9;
                    } else {
                      stackOut_33_0 = this;
                      stackOut_33_1 = 1;
                      stackIn_35_0 = stackOut_33_0;
                      stackIn_35_1 = stackOut_33_1;
                      break L8;
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
          break L8;
        }
        L10: {
          L11: {
            ((cr) this).field_G = stackIn_35_1 != 0;
            stackOut_35_0 = this;
            stackIn_39_0 = stackOut_35_0;
            stackIn_36_0 = stackOut_35_0;
            if (!((cr) this).field_G) {
              break L11;
            } else {
              stackOut_36_0 = this;
              stackIn_39_0 = stackOut_36_0;
              stackIn_37_0 = stackOut_36_0;
              if (q.field_v != ((cr) this).field_xb) {
                break L11;
              } else {
                stackOut_37_0 = this;
                stackIn_39_0 = stackOut_37_0;
                stackIn_38_0 = stackOut_37_0;
                if (!param4) {
                  break L11;
                } else {
                  stackOut_38_0 = this;
                  stackOut_38_1 = 1;
                  stackIn_40_0 = stackOut_38_0;
                  stackIn_40_1 = stackOut_38_1;
                  break L10;
                }
              }
            }
          }
          stackOut_39_0 = this;
          stackOut_39_1 = 0;
          stackIn_40_0 = stackOut_39_0;
          stackIn_40_1 = stackOut_39_1;
          break L10;
        }
        L12: {
          ((cr) this).field_pb = stackIn_40_1 != 0;
          if (((cr) this).field_M == null) {
            break L12;
          } else {
            var13 = (Object) (Object) (cr) (Object) ((cr) this).field_M.c((byte) -12);
            L13: while (true) {
              if (var13 == null) {
                break L12;
              } else {
                ((cr) var13).a(1074455266, ((cr) var13).field_C, ((cr) var13).field_ob, ((cr) var13).field_db, param4, ((cr) var13).field_Fb);
                var13 = (Object) (Object) (cr) (Object) ((cr) var13).field_M.b(false);
                continue L13;
              }
            }
          }
        }
        L14: {
          if (var12 != 0) {
            sj.field_e = true;
            break L14;
          } else {
            break L14;
          }
        }
        L15: {
          if (((cr) var13).field_G) {
            gi.field_o = true;
            break L15;
          } else {
            break L15;
          }
        }
        L16: {
          bi.g(var8, var9, var10, var11);
          if (((cr) var13).field_xb == 0) {
            break L16;
          } else {
            if (((cr) var13).field_X) {
              L17: {
                ((cr) this).field_N = gb.field_d - ((cr) var13).field_fb + -param1;
                ((cr) this).field_wb = -((cr) var13).field_ub + (ed.field_n - param2);
                if (((cr) var13).field_wb < 0) {
                  ((cr) this).field_wb = 0;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (((cr) var13).field_wb <= param5 + -((cr) var13).field_Fb) {
                  break L18;
                } else {
                  ((cr) this).field_wb = param5 + -((cr) var13).field_Fb;
                  break L18;
                }
              }
              L19: {
                if (0 > ((cr) var13).field_N) {
                  ((cr) this).field_N = 0;
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                if (param3 + -((cr) var13).field_db >= ((cr) var13).field_N) {
                  break L20;
                } else {
                  ((cr) this).field_N = -((cr) var13).field_db + param3;
                  break L20;
                }
              }
              ((cr) this).field_L = 0;
              ((cr) this).field_zb = 0;
              ((cr) this).field_ob = param2 + ((cr) var13).field_wb;
              ((cr) this).field_C = ((cr) var13).field_N + param1;
              break L16;
            } else {
              break L16;
            }
          }
        }
    }

    final void i(int param0) {
        cr var4 = null;
        int var3 = Vertigo2.field_L ? 1 : 0;
        if (null != ((cr) this).field_M) {
            var4 = (cr) (Object) ((cr) this).field_M.c((byte) -99);
            while (var4 != null) {
                var4.field_ib = true;
                var4.i(-2147483648);
                var4 = (cr) (Object) var4.field_M.b(false);
            }
        }
        if (param0 != -2147483648) {
            field_P = null;
        }
    }

    final static er a(int param0, r param1, byte param2, int param3) {
        RuntimeException var4 = null;
        Object var5 = null;
        Object stackIn_4_0 = null;
        er stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        er stackOut_5_0 = null;
        Object stackOut_3_0 = null;
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
              if (param2 <= -85) {
                break L1;
              } else {
                var5 = null;
                er discarded$2 = cr.a(0, (r) null, (byte) 109, 59);
                break L1;
              }
            }
            if (hq.a(124, param3, param0, param1)) {
              stackOut_5_0 = ej.a((byte) 89);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (er) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("cr.CA(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_6_0;
    }

    protected cr() {
        ((cr) this).field_H = -1;
        ((cr) this).field_B = -1;
        ((cr) this).field_sb = false;
        ((cr) this).field_U = 256;
        ((cr) this).field_Cb = -2147483648;
        ((cr) this).field_bb = -2147483648;
        ((cr) this).field_lb = true;
        ((cr) this).field_F = -2147483648;
        ((cr) this).field_nb = false;
        ((cr) this).field_Gb = -2147483648;
        ((cr) this).field_vb = 256;
        ((cr) this).field_K = -1;
        ((cr) this).field_D = -1;
        ((cr) this).field_yb = -2147483648;
        ((cr) this).field_Y = -2147483648;
    }

    cr(long param0, cr param1, int param2, int param3, int param4, int param5, String param6) {
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
        ((cr) this).field_H = -1;
        ((cr) this).field_B = -1;
        ((cr) this).field_sb = false;
        ((cr) this).field_U = 256;
        ((cr) this).field_Cb = -2147483648;
        ((cr) this).field_bb = -2147483648;
        ((cr) this).field_lb = true;
        ((cr) this).field_F = -2147483648;
        ((cr) this).field_nb = false;
        ((cr) this).field_Gb = -2147483648;
        ((cr) this).field_vb = 256;
        ((cr) this).field_K = -1;
        ((cr) this).field_D = -1;
        ((cr) this).field_yb = -2147483648;
        ((cr) this).field_Y = -2147483648;
        try {
          L0: {
            L1: {
              ((cr) this).field_wb = param2;
              ((cr) this).field_k = param0;
              ((cr) this).field_N = param3;
              ((cr) this).field_Fb = param4;
              ((cr) this).field_db = param5;
              ((cr) this).a(param1, -44);
              if (param6 == null) {
                break L1;
              } else {
                ((cr) this).field_S = param6;
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
            stackOut_4_1 = new StringBuilder().append("cr.<init>(").append(param0).append(44);
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
          throw wn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Z = "Not yet achieved";
        field_eb = new boolean[112];
    }
}
