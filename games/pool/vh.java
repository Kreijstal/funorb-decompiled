/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vh extends o {
    int field_zb;
    int field_O;
    static int field_L;
    int field_M;
    int field_mb;
    int field_N;
    private int field_bb;
    int field_V;
    private boolean field_U;
    dd field_hb;
    private boolean field_ub;
    private int field_wb;
    private int field_rb;
    boolean field_pb;
    static String field_S;
    boolean field_Jb;
    dd[] field_Y;
    dd field_ab;
    boolean field_db;
    int field_ib;
    dd[] field_X;
    dd[] field_Gb;
    private int field_lb;
    int field_H;
    int field_eb;
    int field_Eb;
    boolean field_J;
    static hq field_Ab;
    private int field_vb;
    dd field_xb;
    String field_kb;
    int field_Cb;
    int field_K;
    lr field_I;
    int field_Bb;
    int field_Z;
    int field_sb;
    String field_nb;
    ko field_T;
    dd field_yb;
    int field_Fb;
    int field_tb;
    boolean field_W;
    dd[] field_Kb;
    int field_R;
    dd field_G;
    private boolean field_fb;
    dd[] field_F;
    int field_Db;
    int field_qb;
    int field_P;
    int field_jb;
    boolean field_Ib;
    private int field_Hb;
    int field_Q;
    int field_cb;
    int field_E;
    int field_gb;
    int field_ob;

    final vh a(long param0, byte param1) {
        vh var5 = null;
        int var6 = 0;
        vh var7 = null;
        var6 = Pool.field_O;
        if (param0 == ((vh) this).field_c) {
          return (vh) this;
        } else {
          if (param1 == 31) {
            if (((vh) this).field_T != null) {
              var7 = (vh) (Object) ((vh) this).field_T.c((byte) 111);
              L0: while (true) {
                if (var7 != null) {
                  var5 = var7.a(param0, (byte) 31);
                  if (var5 == null) {
                    var7 = (vh) (Object) ((vh) this).field_T.f((byte) -5);
                    continue L0;
                  } else {
                    return var5;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        }
    }

    final int a(int param0, int param1) {
        int var4_int = 0;
        vh var4 = null;
        int var5 = 0;
        if (param0 >= -54) {
            ((vh) this).d((byte) 74);
        }
        int var3 = 0;
        if (null != ((vh) this).field_nb) {
            if (!(((vh) this).field_I == null)) {
                var4_int = ((vh) this).field_I.a(((vh) this).field_nb, param1);
                if (!(var4_int <= var3)) {
                    var3 = var4_int;
                }
            }
        }
        if (!(((vh) this).field_hb == null)) {
            var4_int = ((vh) this).field_hb.field_w;
            if (!(var4_int <= var3)) {
                var3 = var4_int;
            }
        }
        if (((vh) this).field_T != null) {
            var4 = (vh) (Object) ((vh) this).field_T.c((byte) 69);
            while (var4 != null) {
                var5 = var4.field_qb - -var4.field_gb;
                if (!(var3 >= var5)) {
                    var3 = var5;
                }
                var4 = (vh) (Object) ((vh) this).field_T.f((byte) -5);
            }
        }
        return var3;
    }

    final void a(byte param0, vh param1) {
        RuntimeException var3 = null;
        Object stackIn_93_0 = null;
        Object stackIn_94_0 = null;
        Object stackIn_95_0 = null;
        Object stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_92_0 = null;
        Object stackOut_93_0 = null;
        Object stackOut_94_0 = null;
        int stackOut_94_1 = 0;
        Object stackOut_95_0 = null;
        int stackOut_95_1 = 0;
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
                  if (param1.field_hb == null) {
                    break L2;
                  } else {
                    ((vh) this).field_hb = param1.field_hb;
                    break L2;
                  }
                }
                L3: {
                  if (null == param1.field_Y) {
                    break L3;
                  } else {
                    ((vh) this).field_Y = param1.field_Y;
                    break L3;
                  }
                }
                L4: {
                  if (param1.field_F != null) {
                    ((vh) this).field_F = param1.field_F;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (null != param1.field_nb) {
                    ((vh) this).field_nb = param1.field_nb;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (param1.field_ab == null) {
                    break L6;
                  } else {
                    ((vh) this).field_ab = param1.field_ab;
                    break L6;
                  }
                }
                L7: {
                  if (0 > param1.field_P) {
                    break L7;
                  } else {
                    ((vh) this).field_P = param1.field_P;
                    break L7;
                  }
                }
                L8: {
                  if (null == param1.field_Gb) {
                    break L8;
                  } else {
                    ((vh) this).field_Gb = param1.field_Gb;
                    break L8;
                  }
                }
                L9: {
                  if (0 > param1.field_Bb) {
                    break L9;
                  } else {
                    ((vh) this).field_Bb = param1.field_Bb;
                    break L9;
                  }
                }
                L10: {
                  if (param1.field_tb != 0) {
                    ((vh) this).field_tb = param1.field_tb;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (param1.field_N != 0) {
                    ((vh) this).field_N = param1.field_N;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (param1.field_xb != null) {
                    ((vh) this).field_xb = param1.field_xb;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (!param1.field_Ib) {
                    break L13;
                  } else {
                    ((vh) this).field_Ib = param1.field_Ib;
                    break L13;
                  }
                }
                L14: {
                  if (param1.field_X == null) {
                    break L14;
                  } else {
                    ((vh) this).field_X = param1.field_X;
                    break L14;
                  }
                }
                L15: {
                  if (param1.field_pb) {
                    break L15;
                  } else {
                    ((vh) this).field_pb = param1.field_pb;
                    break L15;
                  }
                }
                L16: {
                  if (param1.field_J) {
                    ((vh) this).field_J = param1.field_J;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (0 > param1.field_zb) {
                    break L17;
                  } else {
                    ((vh) this).field_zb = param1.field_zb;
                    break L17;
                  }
                }
                L18: {
                  if (!param1.field_ub) {
                    break L18;
                  } else {
                    ((vh) this).field_ub = param1.field_ub;
                    break L18;
                  }
                }
                L19: {
                  if (param1.field_I != null) {
                    ((vh) this).field_I = param1.field_I;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if (param1.field_M != 0) {
                    ((vh) this).field_M = param1.field_M;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (param1.field_yb == null) {
                    break L21;
                  } else {
                    ((vh) this).field_yb = param1.field_yb;
                    break L21;
                  }
                }
                L22: {
                  if (param1.field_Kb == null) {
                    break L22;
                  } else {
                    ((vh) this).field_Kb = param1.field_Kb;
                    break L22;
                  }
                }
                L23: {
                  if (null != param1.field_kb) {
                    ((vh) this).field_kb = param1.field_kb;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (null != param1.field_G) {
                    ((vh) this).field_G = param1.field_G;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (param1.field_Eb != 256) {
                    ((vh) this).field_Eb = param1.field_Eb;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (param1.field_U) {
                    ((vh) this).field_U = param1.field_U;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (param1.field_K < 0) {
                    break L27;
                  } else {
                    ((vh) this).field_K = param1.field_K;
                    break L27;
                  }
                }
                L28: {
                  if (param1.field_Fb == 0) {
                    break L28;
                  } else {
                    ((vh) this).field_Fb = param1.field_Fb;
                    break L28;
                  }
                }
                L29: {
                  if (param1.field_Z != -2147483648) {
                    ((vh) this).field_Z = param1.field_Z;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (-2147483648 == param1.field_Q) {
                    break L30;
                  } else {
                    ((vh) this).field_Q = param1.field_Q;
                    break L30;
                  }
                }
                L31: {
                  if (param1.field_cb != 0) {
                    ((vh) this).field_cb = param1.field_cb;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (param1.field_H != -2147483648) {
                    ((vh) this).field_H = param1.field_H;
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L33: {
                  if (!param1.field_Jb) {
                    break L33;
                  } else {
                    ((vh) this).field_Jb = param1.field_Jb;
                    break L33;
                  }
                }
                L34: {
                  if (0 != param1.field_V) {
                    ((vh) this).field_V = param1.field_V;
                    break L34;
                  } else {
                    break L34;
                  }
                }
                L35: {
                  if (param1.field_O != -2147483648) {
                    ((vh) this).field_O = param1.field_O;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                L36: {
                  if (param1.field_wb != -2147483648) {
                    ((vh) this).field_wb = param1.field_wb;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (param1.field_vb != -2147483648) {
                    ((vh) this).field_vb = param1.field_vb;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                L38: {
                  L39: {
                    stackOut_92_0 = this;
                    stackIn_95_0 = stackOut_92_0;
                    stackIn_93_0 = stackOut_92_0;
                    if (!((vh) this).field_U) {
                      break L39;
                    } else {
                      stackOut_93_0 = this;
                      stackIn_95_0 = stackOut_93_0;
                      stackIn_94_0 = stackOut_93_0;
                      if (!param1.field_fb) {
                        break L39;
                      } else {
                        stackOut_94_0 = this;
                        stackOut_94_1 = 1;
                        stackIn_96_0 = stackOut_94_0;
                        stackIn_96_1 = stackOut_94_1;
                        break L38;
                      }
                    }
                  }
                  stackOut_95_0 = this;
                  stackOut_95_1 = 0;
                  stackIn_96_0 = stackOut_95_0;
                  stackIn_96_1 = stackOut_95_1;
                  break L38;
                }
                ((vh) this).field_fb = stackIn_96_1 != 0;
                if (param1.field_ob != 0) {
                  ((vh) this).field_ob = param1.field_ob;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L40: {
              if (param0 == -87) {
                break L40;
              } else {
                ((vh) this).field_U = false;
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
            stackOut_102_1 = new StringBuilder().append("vh.RA(").append(param0).append(44);
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
          throw wm.a((Throwable) (Object) stackIn_105_0, stackIn_105_2 + 41);
        }
    }

    final void d(byte param0) {
        vh var3 = null;
        if (!(null == ((vh) this).field_T)) {
            var3 = (vh) (Object) ((vh) this).field_T.a((byte) -127);
            while (var3 != null) {
                var3.field_ub = true;
                var3.d((byte) -128);
                var3 = (vh) (Object) var3.field_T.b((byte) -46);
            }
        }
        if (param0 >= -123) {
            ((vh) this).field_mb = -106;
        }
    }

    final void a(byte param0, boolean param1) {
        this.a(false, 0, (byte) 85, false, false, qh.field_f, 0, qh.field_l, param1, false, true);
        if (param0 != -79) {
            ((vh) this).field_Cb = 21;
        }
    }

    private final void a(boolean param0, int param1, byte param2, boolean param3, boolean param4, int param5, int param6, int param7, boolean param8, boolean param9, boolean param10) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        dd[] var16 = null;
        dd var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        Object var23 = null;
        int var23_int = 0;
        vh var23_ref = null;
        int var24 = 0;
        String var25 = null;
        String var26 = null;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          var23 = null;
          ((vh) this).field_ib = ((vh) this).field_eb + param6;
          ((vh) this).field_sb = ((vh) this).field_qb + param1;
          var12 = qh.field_b;
          var13 = qh.field_c;
          var14 = qh.field_j;
          var15 = qh.field_g;
          qh.d(((vh) this).field_sb, ((vh) this).field_ib, ((vh) this).field_gb + ((vh) this).field_sb, ((vh) this).field_ib - -((vh) this).field_Db);
          if (!((vh) this).field_ub) {
            L1: {
              param4 = ((vh) this).field_W;
              if (((vh) this).field_jb == 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            param0 = stackIn_5_0 != 0;
            param3 = ((vh) this).field_Ib;
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          param10 = param10 & ((vh) this).field_pb;
          var16 = ((vh) this).field_F;
          var17 = ((vh) this).field_hb;
          var18 = ((vh) this).field_N;
          var19 = 0;
          var20 = 0;
          if (!param10) {
            L3: {
              if (((vh) this).field_Y == null) {
                break L3;
              } else {
                var16 = ((vh) this).field_Y;
                break L3;
              }
            }
            L4: {
              if (((vh) this).field_zb >= 0) {
                var18 = ((vh) this).field_zb;
                break L4;
              } else {
                break L4;
              }
            }
            if (null == ((vh) this).field_ab) {
              break L2;
            } else {
              var17 = ((vh) this).field_ab;
              break L2;
            }
          } else {
            break L2;
          }
        }
        L5: {
          if (param4) {
            L6: {
              if (((vh) this).field_Gb == null) {
                break L6;
              } else {
                var16 = ((vh) this).field_Gb;
                break L6;
              }
            }
            L7: {
              if (((vh) this).field_xb == null) {
                break L7;
              } else {
                var17 = ((vh) this).field_xb;
                break L7;
              }
            }
            L8: {
              if (((vh) this).field_wb == -2147483648) {
                break L8;
              } else {
                var19 = ((vh) this).field_wb;
                break L8;
              }
            }
            L9: {
              if (((vh) this).field_K < 0) {
                break L9;
              } else {
                var18 = ((vh) this).field_K;
                break L9;
              }
            }
            if (((vh) this).field_vb != -2147483648) {
              var20 = ((vh) this).field_vb;
              break L5;
            } else {
              break L5;
            }
          } else {
            break L5;
          }
        }
        L10: {
          if (param0) {
            L11: {
              if (((vh) this).field_H == -2147483648) {
                break L11;
              } else {
                var19 = ((vh) this).field_H;
                break L11;
              }
            }
            L12: {
              if (((vh) this).field_P < 0) {
                break L12;
              } else {
                var18 = ((vh) this).field_P;
                break L12;
              }
            }
            L13: {
              if (((vh) this).field_Q == -2147483648) {
                break L13;
              } else {
                var20 = ((vh) this).field_Q;
                break L13;
              }
            }
            L14: {
              if (null == ((vh) this).field_G) {
                break L14;
              } else {
                var17 = ((vh) this).field_G;
                break L14;
              }
            }
            if (((vh) this).field_X == null) {
              break L10;
            } else {
              var16 = ((vh) this).field_X;
              break L10;
            }
          } else {
            break L10;
          }
        }
        L15: {
          if (param3) {
            L16: {
              if (((vh) this).field_Kb == null) {
                break L16;
              } else {
                var16 = ((vh) this).field_Kb;
                break L16;
              }
            }
            L17: {
              if (((vh) this).field_yb == null) {
                break L17;
              } else {
                var17 = ((vh) this).field_yb;
                break L17;
              }
            }
            L18: {
              if (((vh) this).field_Bb < 0) {
                break L18;
              } else {
                var18 = ((vh) this).field_Bb;
                break L18;
              }
            }
            L19: {
              if (((vh) this).field_O == -2147483648) {
                break L19;
              } else {
                var20 = ((vh) this).field_O;
                break L19;
              }
            }
            if (((vh) this).field_Z != -2147483648) {
              var19 = ((vh) this).field_Z;
              break L15;
            } else {
              break L15;
            }
          } else {
            break L15;
          }
        }
        L20: {
          var21 = var19 + ((vh) this).field_V;
          var22 = var20 + ((vh) this).field_ob;
          if (!((vh) this).field_J) {
            nj.a(var16, (byte) -85, ((vh) this).field_gb, ((vh) this).field_sb, ((vh) this).field_ib, ((vh) this).field_Db);
            break L20;
          } else {
            nj.a(var16, (byte) -107, param7, param1, param6, param5);
            break L20;
          }
        }
        L21: {
          if (var17 == null) {
            break L21;
          } else {
            L22: {
              var23_int = var21 + ((vh) this).field_sb;
              var24 = ((vh) this).field_ib + var22;
              if (((vh) this).field_Fb == 1) {
                var23_int = var23_int + (-var17.field_w + ((vh) this).field_gb) / 2;
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              if (((vh) this).field_Fb == 2) {
                var23_int = var23_int + (-var17.field_w + ((vh) this).field_gb);
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              if (((vh) this).field_cb == 1) {
                var24 = var24 + (((vh) this).field_Db - var17.field_y) / 2;
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              if (((vh) this).field_cb == 2) {
                var24 = var24 + (-var17.field_y + ((vh) this).field_Db);
                break L25;
              } else {
                break L25;
              }
            }
            if (((vh) this).field_lb >= 256) {
              var17.c(var23_int, var24);
              break L21;
            } else {
              var17.a(var23_int, var24, ((vh) this).field_lb);
              break L21;
            }
          }
        }
        L26: {
          if (null == ((vh) this).field_nb) {
            break L26;
          } else {
            if (((vh) this).field_I != null) {
              L27: {
                var25 = ((vh) this).field_nb;
                var26 = var25;
                var26 = var25;
                if (!param8) {
                  break L27;
                } else {
                  if (null != ((vh) this).field_kb) {
                    var26 = var25 + ((vh) this).field_kb;
                    break L27;
                  } else {
                    break L27;
                  }
                }
              }
              L28: {
                if (((vh) this).field_I.b(var26) > ((vh) this).field_gb + -(((vh) this).field_tb * 2)) {
                  break L28;
                } else {
                  if (var26.indexOf("<br>") >= 0) {
                    break L28;
                  } else {
                    L29: {
                      if (((vh) this).field_cb != 1) {
                        if (((vh) this).field_cb == 2) {
                          var22 = var22 + (((vh) this).field_Db - (((vh) this).field_I.field_w + ((vh) this).field_I.field_C));
                          break L29;
                        } else {
                          break L29;
                        }
                      } else {
                        var22 = var22 + (((vh) this).field_Db - (((vh) this).field_I.field_C - -((vh) this).field_I.field_w)) / 2;
                        break L29;
                      }
                    }
                    if (0 == ((vh) this).field_Fb) {
                      ((vh) this).field_I.b(var26, ((vh) this).field_tb + (((vh) this).field_sb - -var21), ((vh) this).field_I.field_C + (var22 + ((vh) this).field_ib), var18, -1, ((vh) this).field_Eb);
                      break L26;
                    } else {
                      if (((vh) this).field_Fb == 1) {
                        ((vh) this).field_I.a(var26, (-(((vh) this).field_tb * 2) + ((vh) this).field_gb) / 2 + var21 + (((vh) this).field_sb + ((vh) this).field_tb), ((vh) this).field_I.field_C + var22 + ((vh) this).field_ib, var18, -1, ((vh) this).field_Eb);
                        break L26;
                      } else {
                        if (((vh) this).field_Fb != 2) {
                          int discarded$2 = ((vh) this).field_I.a(var26, ((vh) this).field_tb + (((vh) this).field_sb - -var21), ((vh) this).field_ib - -var22, -(2 * ((vh) this).field_tb) + ((vh) this).field_gb, ((vh) this).field_Db, var18, -1, ((vh) this).field_Eb, ((vh) this).field_Fb, ((vh) this).field_cb, ((vh) this).field_M);
                          break L26;
                        } else {
                          ((vh) this).field_I.c(var26, ((vh) this).field_tb + (((vh) this).field_sb + var21 - (-((vh) this).field_gb - -(((vh) this).field_tb * 2))), ((vh) this).field_I.field_C + var22 + ((vh) this).field_ib, var18, -1, ((vh) this).field_Eb);
                          break L26;
                        }
                      }
                    }
                  }
                }
              }
              int discarded$3 = ((vh) this).field_I.a(var26, ((vh) this).field_tb + ((vh) this).field_sb + var21, ((vh) this).field_ib + var22, ((vh) this).field_gb - ((vh) this).field_tb * 2, ((vh) this).field_Db, var18, -1, ((vh) this).field_Eb, ((vh) this).field_Fb, ((vh) this).field_cb, ((vh) this).field_M);
              break L26;
            } else {
              break L26;
            }
          }
        }
        L30: {
          if (null == ((vh) this).field_T) {
            break L30;
          } else {
            var23_ref = (vh) (Object) ((vh) this).field_T.c((byte) -87);
            L31: while (true) {
              if (var23_ref == null) {
                break L30;
              } else {
                var23_ref.a(param0, var23_ref.field_sb - -var19, (byte) 85, param3, param4, var23_ref.field_Db, var23_ref.field_ib + var20, var23_ref.field_gb, param8, var23_ref.field_fb, param10);
                var23_ref = (vh) (Object) var23_ref.field_T.f((byte) -5);
                continue L31;
              }
            }
          }
        }
        qh.c(var12, var13, var14, var15);
    }

    final void a(vh param0, int param1, vh param2, int param3) {
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
              if (param3 <= -40) {
                break L1;
              } else {
                ((vh) this).field_Bb = 69;
                break L1;
              }
            }
            L2: {
              if (param0 == null) {
                param2.field_eb = 0;
                param2.field_E = 0;
                break L2;
              } else {
                param2.field_E = param0.field_E + param0.field_Cb;
                param2.field_eb = param0.field_eb + (param0.field_Db + param1);
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
            stackOut_6_1 = new StringBuilder().append("vh.JA(");
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
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44).append(param1).append(44);
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
          throw wm.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param3 + 41);
        }
    }

    public static void e() {
        field_S = null;
        field_Ab = null;
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        vh var10_ref_vh = null;
        int var10 = 0;
        if (param3 != -1) {
          return;
        } else {
          L0: {
            var5 = -((vh) this).field_eb;
            var6 = -((vh) this).field_E + var5;
            var7 = ((vh) this).field_Db;
            var8 = ((vh) this).field_Cb + var7;
            if (param2) {
              break L0;
            } else {
              var9 = 0;
              var10_ref_vh = (vh) (Object) ((vh) this).field_T.c((byte) -82);
              L1: while (true) {
                if (var10_ref_vh == null) {
                  var8 = -param0 + var9;
                  break L0;
                } else {
                  var10_ref_vh.field_E = var9 - var10_ref_vh.field_eb;
                  var9 = var9 + (param0 + var10_ref_vh.field_Cb + var10_ref_vh.field_Db);
                  var10_ref_vh = (vh) (Object) ((vh) this).field_T.f((byte) -5);
                  continue L1;
                }
              }
            }
          }
          L2: {
            var9 = var8 + -param1;
            if (var6 > var9) {
              var6 = var9;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (var6 >= 0) {
              break L3;
            } else {
              var6 = 0;
              break L3;
            }
          }
          L4: {
            var10 = -param1 + var7;
            if (var5 > var10) {
              var5 = var10;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (var5 >= 0) {
              break L5;
            } else {
              var5 = 0;
              break L5;
            }
          }
          ((vh) this).field_Db = var7;
          ((vh) this).field_eb = -var5;
          ((vh) this).field_E = var5 + -var6;
          ((vh) this).field_Cb = -var7 + var8;
          return;
        }
    }

    final void a(boolean param0, boolean param1) {
        rc.field_d = !param0 ? true : false;
        if (param1) {
            ((vh) this).field_hb = null;
        }
        cl.field_f = !param0 ? true : false;
        this.a(0, true, qh.field_l, qh.field_f, (byte) 107, 0);
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        ((vh) this).field_E = 0;
        ((vh) this).field_Cb = 0;
        ((vh) this).field_bb = 0;
        ((vh) this).field_eb = param0;
        ((vh) this).field_rb = 0;
        ((vh) this).field_Db = param4;
        ((vh) this).field_gb = param3;
        if (param1 != 2147483647) {
            ((vh) this).b(23, -24, 46, 74, -74);
        }
        ((vh) this).field_qb = param2;
    }

    private final void a(int param0, boolean param1, int param2, int param3, byte param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
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
          var14 = null;
          if (((vh) this).field_rb > 0) {
            var7 = -(-((vh) this).field_rb >> 2);
            break L0;
          } else {
            var7 = ((vh) this).field_rb >> 2;
            break L0;
          }
        }
        L1: {
          ((vh) this).field_qb = ((vh) this).field_qb + var7;
          ((vh) this).field_rb = ((vh) this).field_rb - var7;
          if (0 < ((vh) this).field_E) {
            var7 = -(-((vh) this).field_E >> 2);
            break L1;
          } else {
            var7 = ((vh) this).field_E >> 2;
            break L1;
          }
        }
        L2: {
          ((vh) this).field_eb = ((vh) this).field_eb + var7;
          ((vh) this).field_E = ((vh) this).field_E - var7;
          if (0 < ((vh) this).field_bb) {
            var7 = -(-((vh) this).field_bb >> 2);
            break L2;
          } else {
            var7 = ((vh) this).field_bb >> 2;
            break L2;
          }
        }
        L3: {
          ((vh) this).field_gb = ((vh) this).field_gb + var7;
          ((vh) this).field_bb = ((vh) this).field_bb - var7;
          if (0 >= ((vh) this).field_Cb) {
            var7 = ((vh) this).field_Cb >> 2;
            break L3;
          } else {
            var7 = -(-((vh) this).field_Cb >> 2);
            break L3;
          }
        }
        L4: {
          L5: {
            ((vh) this).field_sb = ((vh) this).field_qb + param5;
            param1 = param1 & ((vh) this).field_pb;
            ((vh) this).field_ib = param0 - -((vh) this).field_eb;
            ((vh) this).field_Cb = ((vh) this).field_Cb - var7;
            ((vh) this).field_Db = ((vh) this).field_Db + var7;
            var8 = qh.field_b;
            var9 = qh.field_c;
            var11 = 123 % ((28 - param4) / 34);
            var10 = qh.field_j;
            var12 = qh.field_g;
            qh.d(((vh) this).field_sb, ((vh) this).field_ib, ((vh) this).field_sb - -((vh) this).field_gb, ((vh) this).field_Db + ((vh) this).field_ib);
            var13 = 0;
            if (rc.field_d) {
              break L5;
            } else {
              if (!param1) {
                break L5;
              } else {
                if (0 == ne.field_s) {
                  break L5;
                } else {
                  if (qh.field_b > lq.field_W) {
                    break L5;
                  } else {
                    if (lq.field_W >= qh.field_j) {
                      break L5;
                    } else {
                      if (qh.field_c > ua.field_o) {
                        break L5;
                      } else {
                        if (qh.field_g <= ua.field_o) {
                          break L5;
                        } else {
                          ((vh) this).field_Hb = ua.field_o + -((vh) this).field_ib;
                          var13 = 1;
                          ((vh) this).field_R = ne.field_s;
                          ((vh) this).field_mb = lq.field_W - ((vh) this).field_sb;
                          ((vh) this).field_jb = ne.field_s;
                          break L4;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          L6: {
            if (0 != ne.field_s) {
              ((vh) this).field_jb = 0;
              break L6;
            } else {
              break L6;
            }
          }
          ((vh) this).field_R = 0;
          break L4;
        }
        L7: {
          if (0 != cd.field_b) {
            break L7;
          } else {
            ((vh) this).field_jb = 0;
            break L7;
          }
        }
        L8: {
          L9: {
            stackOut_26_0 = this;
            stackIn_32_0 = stackOut_26_0;
            stackIn_27_0 = stackOut_26_0;
            if (cl.field_f) {
              break L9;
            } else {
              stackOut_27_0 = this;
              stackIn_32_0 = stackOut_27_0;
              stackIn_28_0 = stackOut_27_0;
              if (qh.field_b > wn.field_i) {
                break L9;
              } else {
                stackOut_28_0 = this;
                stackIn_32_0 = stackOut_28_0;
                stackIn_29_0 = stackOut_28_0;
                if (wn.field_i >= qh.field_j) {
                  break L9;
                } else {
                  stackOut_29_0 = this;
                  stackIn_32_0 = stackOut_29_0;
                  stackIn_30_0 = stackOut_29_0;
                  if (gg.field_f < qh.field_c) {
                    break L9;
                  } else {
                    stackOut_30_0 = this;
                    stackIn_32_0 = stackOut_30_0;
                    stackIn_31_0 = stackOut_30_0;
                    if (qh.field_g <= gg.field_f) {
                      break L9;
                    } else {
                      stackOut_31_0 = this;
                      stackOut_31_1 = 1;
                      stackIn_33_0 = stackOut_31_0;
                      stackIn_33_1 = stackOut_31_1;
                      break L8;
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
          break L8;
        }
        L10: {
          L11: {
            ((vh) this).field_db = stackIn_33_1 != 0;
            stackOut_33_0 = this;
            stackIn_37_0 = stackOut_33_0;
            stackIn_34_0 = stackOut_33_0;
            if (!((vh) this).field_db) {
              break L11;
            } else {
              stackOut_34_0 = this;
              stackIn_37_0 = stackOut_34_0;
              stackIn_35_0 = stackOut_34_0;
              if (((vh) this).field_jb != cd.field_b) {
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
          ((vh) this).field_W = stackIn_38_1 != 0;
          if (((vh) this).field_T != null) {
            var14 = (Object) (Object) (vh) (Object) ((vh) this).field_T.a((byte) -127);
            L13: while (true) {
              if (var14 == null) {
                break L12;
              } else {
                ((vh) var14).a(((vh) var14).field_ib, param1, ((vh) var14).field_gb, ((vh) var14).field_Db, (byte) 63, ((vh) var14).field_sb);
                var14 = (Object) (Object) (vh) (Object) ((vh) var14).field_T.b((byte) -46);
                continue L13;
              }
            }
          } else {
            break L12;
          }
        }
        L14: {
          if (var13 != 0) {
            rc.field_d = true;
            break L14;
          } else {
            break L14;
          }
        }
        L15: {
          if (!((vh) var14).field_db) {
            break L15;
          } else {
            cl.field_f = true;
            break L15;
          }
        }
        L16: {
          qh.c(var8, var9, var10, var12);
          if (((vh) var14).field_jb == 0) {
            break L16;
          } else {
            if (((vh) var14).field_Jb) {
              L17: {
                ((vh) this).field_qb = -param5 + (wn.field_i + -((vh) var14).field_mb);
                ((vh) this).field_eb = -param0 + (gg.field_f + -((vh) var14).field_Hb);
                if (((vh) var14).field_qb < 0) {
                  ((vh) this).field_qb = 0;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (((vh) var14).field_eb < 0) {
                  ((vh) this).field_eb = 0;
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (param2 + -((vh) var14).field_gb < ((vh) var14).field_qb) {
                  ((vh) this).field_qb = param2 + -((vh) var14).field_gb;
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                ((vh) this).field_sb = param5 + ((vh) var14).field_qb;
                ((vh) this).field_rb = 0;
                if (param3 + -((vh) var14).field_Db < ((vh) var14).field_eb) {
                  ((vh) this).field_eb = -((vh) var14).field_Db + param3;
                  break L20;
                } else {
                  break L20;
                }
              }
              ((vh) this).field_E = 0;
              ((vh) this).field_ib = ((vh) var14).field_eb + param0;
              break L16;
            } else {
              break L16;
            }
          }
        }
    }

    vh(String param0, vh param1, int param2, int param3, int param4, int param5, String param6) {
        this(qo.a(112, (CharSequence) (Object) param0), param1, param2, param3, param4, param5, param6);
    }

    vh(String param0, vh param1) {
        this(qo.a(109, (CharSequence) (Object) param0), param1, 0, 0, 0, 0, (String) null);
    }

    vh(long param0, vh param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    vh(long param0, vh param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final void a(int param0, vh param1) {
        try {
            int var3_int = 118 / ((param0 - -50) / 43);
            if (!(((vh) this).field_T != null)) {
                ((vh) this).field_T = new ko();
            }
            ((vh) this).field_T.b((byte) -83, (ma) (Object) param1);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "vh.MA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final int b(boolean param0) {
        if (!param0) {
            return -108;
        }
        return ((vh) this).a(-126, 2147483647);
    }

    final static dd a(int param0, di param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        dd stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        dd stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (vj.a(param0, param1, param3, (byte) 121)) {
              stackOut_3_0 = aj.f((byte) 89);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (dd) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("vh.IA(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + -55 + 44 + param3 + 41);
        }
        return stackIn_4_0;
    }

    public vh() {
        ((vh) this).field_H = -2147483648;
        ((vh) this).field_lb = 256;
        ((vh) this).field_pb = true;
        ((vh) this).field_wb = -2147483648;
        ((vh) this).field_K = -1;
        ((vh) this).field_O = -2147483648;
        ((vh) this).field_Bb = -1;
        ((vh) this).field_vb = -2147483648;
        ((vh) this).field_zb = -1;
        ((vh) this).field_U = false;
        ((vh) this).field_Z = -2147483648;
        ((vh) this).field_Eb = 256;
        ((vh) this).field_P = -1;
        ((vh) this).field_Q = -2147483648;
        ((vh) this).field_fb = false;
    }

    vh(long param0, vh param1, int param2, int param3, int param4, int param5, String param6) {
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
        ((vh) this).field_H = -2147483648;
        ((vh) this).field_lb = 256;
        ((vh) this).field_pb = true;
        ((vh) this).field_wb = -2147483648;
        ((vh) this).field_K = -1;
        ((vh) this).field_O = -2147483648;
        ((vh) this).field_Bb = -1;
        ((vh) this).field_vb = -2147483648;
        ((vh) this).field_zb = -1;
        ((vh) this).field_U = false;
        ((vh) this).field_Z = -2147483648;
        ((vh) this).field_Eb = 256;
        ((vh) this).field_P = -1;
        ((vh) this).field_Q = -2147483648;
        ((vh) this).field_fb = false;
        try {
          L0: {
            L1: {
              ((vh) this).field_c = param0;
              ((vh) this).field_gb = param4;
              ((vh) this).field_eb = param3;
              ((vh) this).field_Db = param5;
              ((vh) this).field_qb = param2;
              ((vh) this).a((byte) -87, param1);
              if (param6 == null) {
                break L1;
              } else {
                ((vh) this).field_nb = param6;
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
            stackOut_4_1 = new StringBuilder().append("vh.<init>(").append(param0).append(44);
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
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = "From <%0>: ";
    }
}
