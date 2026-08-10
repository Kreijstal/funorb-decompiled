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
        vh var5;
        int var6;
        vh var7;
        var6 = Pool.field_O;
        if (param0 == this.field_c) {
          return (vh) (this);
        } else {
          if (param1 == 31) {
            if (this.field_T != null) {
              var7 = (vh) ((Object) this.field_T.c((byte) 111));
              L0: while (true) {
                if (var7 != null) {
                  var5 = var7.a(param0, (byte) 31);
                  if (var5 == null) {
                    var7 = (vh) ((Object) this.field_T.f((byte) -5));
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
            return (vh) null;
          }
        }
    }

    final int a(int param0, int param1) {
        vh var4 = null;
        int var5 = 0;
        int var4_int = 0;
        if (param0 >= -54) {
            this.d((byte) 74);
        }
        int var3 = 0;
        if (null != this.field_nb) {
            if (!(this.field_I == null)) {
                var4_int = this.field_I.a(this.field_nb, param1);
                if (!(var4_int <= var3)) {
                    var3 = var4_int;
                }
            }
        }
        if (!(this.field_hb == null)) {
            var4_int = this.field_hb.field_w;
            if (!(var4_int <= var3)) {
                var3 = var4_int;
            }
        }
        if (this.field_T != null) {
            var4 = (vh) ((Object) this.field_T.c((byte) 69));
            while (var4 != null) {
                var5 = var4.field_qb - -var4.field_gb;
                if (!(var3 >= var5)) {
                    var3 = var5;
                }
                var4 = (vh) ((Object) this.field_T.f((byte) -5));
            }
        }
        return var3;
    }

    final void a(byte param0, vh param1) {
        Object stackIn_95_0 = null;
        Object stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
                    this.field_hb = param1.field_hb;
                    break L2;
                  }
                }
                L3: {
                  if (null == param1.field_Y) {
                    break L3;
                  } else {
                    this.field_Y = param1.field_Y;
                    break L3;
                  }
                }
                L4: {
                  if (param1.field_F != null) {
                    this.field_F = param1.field_F;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (null != param1.field_nb) {
                    this.field_nb = param1.field_nb;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (param1.field_ab == null) {
                    break L6;
                  } else {
                    this.field_ab = param1.field_ab;
                    break L6;
                  }
                }
                L7: {
                  if (0 > param1.field_P) {
                    break L7;
                  } else {
                    this.field_P = param1.field_P;
                    break L7;
                  }
                }
                L8: {
                  if (null == param1.field_Gb) {
                    break L8;
                  } else {
                    this.field_Gb = param1.field_Gb;
                    break L8;
                  }
                }
                L9: {
                  if (0 > param1.field_Bb) {
                    break L9;
                  } else {
                    this.field_Bb = param1.field_Bb;
                    break L9;
                  }
                }
                L10: {
                  if (param1.field_tb != 0) {
                    this.field_tb = param1.field_tb;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (param1.field_N != 0) {
                    this.field_N = param1.field_N;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (param1.field_xb != null) {
                    this.field_xb = param1.field_xb;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (!param1.field_Ib) {
                    break L13;
                  } else {
                    this.field_Ib = param1.field_Ib;
                    break L13;
                  }
                }
                L14: {
                  if (param1.field_X == null) {
                    break L14;
                  } else {
                    this.field_X = param1.field_X;
                    break L14;
                  }
                }
                L15: {
                  if (param1.field_pb) {
                    break L15;
                  } else {
                    this.field_pb = param1.field_pb;
                    break L15;
                  }
                }
                L16: {
                  if (param1.field_J) {
                    this.field_J = param1.field_J;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (0 > param1.field_zb) {
                    break L17;
                  } else {
                    this.field_zb = param1.field_zb;
                    break L17;
                  }
                }
                L18: {
                  if (!param1.field_ub) {
                    break L18;
                  } else {
                    this.field_ub = param1.field_ub;
                    break L18;
                  }
                }
                L19: {
                  if (param1.field_I != null) {
                    this.field_I = param1.field_I;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if (-1 != (param1.field_M ^ -1)) {
                    this.field_M = param1.field_M;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (param1.field_yb == null) {
                    break L21;
                  } else {
                    this.field_yb = param1.field_yb;
                    break L21;
                  }
                }
                L22: {
                  if (param1.field_Kb == null) {
                    break L22;
                  } else {
                    this.field_Kb = param1.field_Kb;
                    break L22;
                  }
                }
                L23: {
                  if (null != param1.field_kb) {
                    this.field_kb = param1.field_kb;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (null != param1.field_G) {
                    this.field_G = param1.field_G;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if ((param1.field_Eb ^ -1) != -257) {
                    this.field_Eb = param1.field_Eb;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (param1.field_U) {
                    this.field_U = param1.field_U;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if ((param1.field_K ^ -1) > -1) {
                    break L27;
                  } else {
                    this.field_K = param1.field_K;
                    break L27;
                  }
                }
                L28: {
                  if (param1.field_Fb == 0) {
                    break L28;
                  } else {
                    this.field_Fb = param1.field_Fb;
                    break L28;
                  }
                }
                L29: {
                  if (2147483647 != (param1.field_Z ^ -1)) {
                    this.field_Z = param1.field_Z;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (-2147483648 == param1.field_Q) {
                    break L30;
                  } else {
                    this.field_Q = param1.field_Q;
                    break L30;
                  }
                }
                L31: {
                  if (-1 != (param1.field_cb ^ -1)) {
                    this.field_cb = param1.field_cb;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (2147483647 != (param1.field_H ^ -1)) {
                    this.field_H = param1.field_H;
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L33: {
                  if (!param1.field_Jb) {
                    break L33;
                  } else {
                    this.field_Jb = param1.field_Jb;
                    break L33;
                  }
                }
                L34: {
                  if (0 != param1.field_V) {
                    this.field_V = param1.field_V;
                    break L34;
                  } else {
                    break L34;
                  }
                }
                L35: {
                  if (2147483647 != (param1.field_O ^ -1)) {
                    this.field_O = param1.field_O;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                L36: {
                  if ((param1.field_wb ^ -1) != 2147483647) {
                    this.field_wb = param1.field_wb;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (2147483647 != (param1.field_vb ^ -1)) {
                    this.field_vb = param1.field_vb;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                L38: {
                  L39: {
                    stackIn_95_0 = this;

                    if (!this.field_U) {
                      break L39;
                    } else {
                      stackIn_95_0 = this;

                      if (!param1.field_fb) {
                        break L39;
                      } else {
                        stackIn_96_0 = this;
                        stackIn_96_1 = 1;
                        break L38;
                      }
                    }
                  }
                  stackIn_96_0 = this;
                  stackIn_96_1 = 0;
                  break L38;
                }
                ((vh) (this)).field_fb = stackIn_96_1 != 0;
                if (param1.field_ob != 0) {
                  this.field_ob = param1.field_ob;
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
                this.field_U = false;
                break L40;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L41: {
            var3 = decompiledCaughtException;
            stackIn_104_0 = (RuntimeException) (var3);

            stackIn_104_1 = new StringBuilder().append("vh.RA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_105_0 = (RuntimeException) ((Object) stackIn_104_0);
              stackIn_105_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackIn_105_2 = "null";
              break L41;
            } else {
              stackIn_105_0 = (RuntimeException) ((Object) stackIn_104_0);
              stackIn_105_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackIn_105_2 = "{...}";
              break L41;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_105_0), stackIn_105_2 + ')');
        }
    }

    final void d(byte param0) {
        vh var3 = null;
        if (!(null == this.field_T)) {
            var3 = (vh) ((Object) this.field_T.a((byte) -127));
            while (var3 != null) {
                var3.field_ub = true;
                var3.d((byte) -128);
                var3 = (vh) ((Object) this.field_T.b((byte) -46));
            }
        }
        if (param0 >= -123) {
            this.field_mb = -106;
        }
    }

    final void a(byte param0, boolean param1) {
        this.a(false, 0, (byte) 85, false, false, qh.field_f, 0, qh.field_l, param1, false, true);
        if (param0 != -79) {
            this.field_Cb = 21;
        }
    }

    private final void a(boolean param0, int param1, byte param2, boolean param3, boolean param4, int param5, int param6, int param7, boolean param8, boolean param9, boolean param10) {
        int stackIn_5_0 = 0;
        int var12;
        int var13;
        int var14;
        int var15;
        dd[] var16;
        dd var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23_int;
        String var23;
        vh var23_ref;
        int var24;
        String var25;
        L0: {
          this.field_ib = this.field_eb + param6;
          this.field_sb = this.field_qb + param1;
          var12 = qh.field_b;
          var13 = qh.field_c;
          var14 = qh.field_j;
          var15 = qh.field_g;
          qh.d(this.field_sb, this.field_ib, this.field_gb + this.field_sb, this.field_ib - -this.field_Db);
          if (!this.field_ub) {
            L1: {
              param4 = this.field_W;
              if (-1 == (this.field_jb ^ -1)) {
                stackIn_5_0 = 0;
                break L1;
              } else {
                stackIn_5_0 = 1;
                break L1;
              }
            }
            param0 = stackIn_5_0 != 0;
            param3 = this.field_Ib;
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          param10 = param10 & this.field_pb;
          var16 = this.field_F;
          var17 = this.field_hb;
          var18 = this.field_N;
          var19 = 0;
          var20 = 0;
          if (!param10) {
            L3: {
              if (this.field_Y == null) {
                break L3;
              } else {
                var16 = this.field_Y;
                break L3;
              }
            }
            L4: {
              if (this.field_zb >= 0) {
                var18 = this.field_zb;
                break L4;
              } else {
                break L4;
              }
            }
            if (null == this.field_ab) {
              break L2;
            } else {
              var17 = this.field_ab;
              break L2;
            }
          } else {
            break L2;
          }
        }
        L5: {
          if (param4) {
            L6: {
              if (this.field_Gb == null) {
                break L6;
              } else {
                var16 = this.field_Gb;
                break L6;
              }
            }
            L7: {
              if (this.field_xb == null) {
                break L7;
              } else {
                var17 = this.field_xb;
                break L7;
              }
            }
            L8: {
              if ((this.field_wb ^ -1) == 2147483647) {
                break L8;
              } else {
                var19 = this.field_wb;
                break L8;
              }
            }
            L9: {
              if (this.field_K < 0) {
                break L9;
              } else {
                var18 = this.field_K;
                break L9;
              }
            }
            if ((this.field_vb ^ -1) != 2147483647) {
              var20 = this.field_vb;
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
              if (this.field_H == -2147483648) {
                break L11;
              } else {
                var19 = this.field_H;
                break L11;
              }
            }
            L12: {
              if (-1 < (this.field_P ^ -1)) {
                break L12;
              } else {
                var18 = this.field_P;
                break L12;
              }
            }
            L13: {
              if (this.field_Q == -2147483648) {
                break L13;
              } else {
                var20 = this.field_Q;
                break L13;
              }
            }
            L14: {
              if (null == this.field_G) {
                break L14;
              } else {
                var17 = this.field_G;
                break L14;
              }
            }
            if (this.field_X == null) {
              break L10;
            } else {
              var16 = this.field_X;
              break L10;
            }
          } else {
            break L10;
          }
        }
        L15: {
          if (param3) {
            L16: {
              if (this.field_Kb == null) {
                break L16;
              } else {
                var16 = this.field_Kb;
                break L16;
              }
            }
            L17: {
              if (this.field_yb == null) {
                break L17;
              } else {
                var17 = this.field_yb;
                break L17;
              }
            }
            L18: {
              if (this.field_Bb < 0) {
                break L18;
              } else {
                var18 = this.field_Bb;
                break L18;
              }
            }
            L19: {
              if (this.field_O == -2147483648) {
                break L19;
              } else {
                var20 = this.field_O;
                break L19;
              }
            }
            if ((this.field_Z ^ -1) != 2147483647) {
              var19 = this.field_Z;
              break L15;
            } else {
              break L15;
            }
          } else {
            break L15;
          }
        }
        L20: {
          var21 = var19 + this.field_V;
          if (param2 == 85) {
            break L20;
          } else {
            this.field_V = -109;
            break L20;
          }
        }
        L21: {
          var22 = var20 + this.field_ob;
          if (!this.field_J) {
            nj.a(var16, (byte) -85, this.field_gb, this.field_sb, this.field_ib, this.field_Db);
            break L21;
          } else {
            nj.a(var16, (byte) -107, param7, param1, param6, param5);
            break L21;
          }
        }
        L22: {
          if (var17 == null) {
            break L22;
          } else {
            L23: {
              var23_int = var21 + this.field_sb;
              var24 = this.field_ib + var22;
              if ((this.field_Fb ^ -1) == -2) {
                var23_int = var23_int + (-var17.field_w + this.field_gb) / 2;
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              if ((this.field_Fb ^ -1) == -3) {
                var23_int = var23_int + (-var17.field_w + this.field_gb);
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              if (this.field_cb == 1) {
                var24 = var24 + (this.field_Db - var17.field_y) / 2;
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              if (this.field_cb == 2) {
                var24 = var24 + (-var17.field_y + this.field_Db);
                break L26;
              } else {
                break L26;
              }
            }
            if (this.field_lb >= 256) {
              var17.c(var23_int, var24);
              break L22;
            } else {
              var17.a(var23_int, var24, this.field_lb);
              break L22;
            }
          }
        }
        L27: {
          if (null == this.field_nb) {
            break L27;
          } else {
            if (this.field_I != null) {
              L28: {
                var25 = this.field_nb;
                var23 = var25;
                var23 = var25;
                var23 = var25;
                if (!param8) {
                  break L28;
                } else {
                  if (null != this.field_kb) {
                    var23 = var25 + this.field_kb;
                    break L28;
                  } else {
                    break L28;
                  }
                }
              }
              L29: {
                if (this.field_I.b(var23) > this.field_gb + -(this.field_tb * 2)) {
                  break L29;
                } else {
                  if (var23.indexOf("<br>") >= 0) {
                    break L29;
                  } else {
                    L30: {
                      if (-2 != (this.field_cb ^ -1)) {
                        if (-3 == (this.field_cb ^ -1)) {
                          var22 = var22 + (this.field_Db - (this.field_I.field_w + this.field_I.field_C));
                          break L30;
                        } else {
                          break L30;
                        }
                      } else {
                        var22 = var22 + (this.field_Db - (this.field_I.field_C - -this.field_I.field_w)) / 2;
                        break L30;
                      }
                    }
                    if (0 == this.field_Fb) {
                      this.field_I.b(var23, this.field_tb + (this.field_sb - -var21), this.field_I.field_C + (var22 + this.field_ib), var18, -1, this.field_Eb);
                      break L27;
                    } else {
                      if (this.field_Fb == 1) {
                        this.field_I.a(var23, (-(this.field_tb * 2) + this.field_gb) / 2 + var21 + (this.field_sb + this.field_tb), this.field_I.field_C + var22 + this.field_ib, var18, -1, this.field_Eb);
                        break L27;
                      } else {
                        if (-3 != (this.field_Fb ^ -1)) {
                          this.field_I.a(var23, this.field_tb + (this.field_sb - -var21), this.field_ib - -var22, -(2 * this.field_tb) + this.field_gb, this.field_Db, var18, -1, this.field_Eb, this.field_Fb, this.field_cb, this.field_M);
                          break L27;
                        } else {
                          this.field_I.c(var23, this.field_tb + (this.field_sb + var21 - (-this.field_gb - -(this.field_tb * 2))), this.field_I.field_C + var22 + this.field_ib, var18, -1, this.field_Eb);
                          break L27;
                        }
                      }
                    }
                  }
                }
              }
              this.field_I.a(var23, this.field_tb + this.field_sb + var21, this.field_ib + var22, this.field_gb - this.field_tb * 2, this.field_Db, var18, -1, this.field_Eb, this.field_Fb, this.field_cb, this.field_M);
              break L27;
            } else {
              break L27;
            }
          }
        }
        L31: {
          if (null == this.field_T) {
            break L31;
          } else {
            var23_ref = (vh) ((Object) this.field_T.c((byte) -87));
            L32: while (true) {
              if (var23_ref == null) {
                break L31;
              } else {
                var23_ref.a(param0, this.field_sb - -var19, (byte) 85, param3, param4, this.field_Db, this.field_ib + var20, this.field_gb, param8, this.field_fb, param10);
                var23_ref = (vh) ((Object) this.field_T.f((byte) -5));
                continue L32;
              }
            }
          }
        }
        qh.c(var12, var13, var14, var15);
    }

    final void a(vh param0, int param1, vh param2, int param3) {
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
              if (param3 <= -40) {
                break L1;
              } else {
                this.field_Bb = 69;
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
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("vh.JA(");

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


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ',' + param3 + ')');
        }
    }

    public static void e(byte param0) {
        if (param0 != 8) {
            field_L = -59;
        }
        field_S = null;
        field_Ab = null;
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        vh var10_ref_vh;
        int var10;
        if (param3 != -1) {
          return;
        } else {
          L0: {
            var5 = -this.field_eb;
            var6 = -this.field_E + var5;
            var7 = this.field_Db;
            var8 = this.field_Cb + var7;
            if (param2) {
              break L0;
            } else {
              var9 = 0;
              var10_ref_vh = (vh) ((Object) this.field_T.c((byte) -82));
              L1: while (true) {
                if (var10_ref_vh == null) {
                  var8 = -param0 + var9;
                  break L0;
                } else {
                  var10_ref_vh.field_E = var9 - var10_ref_vh.field_eb;
                  var9 = var9 + (param0 + var10_ref_vh.field_Cb + var10_ref_vh.field_Db);
                  var10_ref_vh = (vh) ((Object) this.field_T.f((byte) -5));
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
          this.field_Db = var7;
          this.field_eb = -var5;
          this.field_E = var5 + -var6;
          this.field_Cb = -var7 + var8;
          return;
        }
    }

    final void a(boolean param0, boolean param1) {
        rc.field_d = !param0 ? true : false;
        if (param1) {
            this.field_hb = (dd) null;
        }
        cl.field_f = !param0 ? true : false;
        this.a(0, true, qh.field_l, qh.field_f, (byte) 107, 0);
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        this.field_E = 0;
        this.field_Cb = 0;
        this.field_bb = 0;
        this.field_eb = param0;
        this.field_rb = 0;
        this.field_Db = param4;
        this.field_gb = param3;
        if (param1 != 2147483647) {
            this.b(23, -24, 46, 74, -74);
        }
        this.field_qb = param2;
    }

    private final void a(int param0, boolean param1, int param2, int param3, byte param4, int param5) {
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        vh var14;
        L0: {
          if ((this.field_rb ^ -1) < -1) {
            var7 = -(-this.field_rb >> 897843266);
            break L0;
          } else {
            var7 = this.field_rb >> -927076830;
            break L0;
          }
        }
        L1: {
          this.field_qb = this.field_qb + var7;
          this.field_rb = this.field_rb - var7;
          if (0 < this.field_E) {
            var7 = -(-this.field_E >> -1388511774);
            break L1;
          } else {
            var7 = this.field_E >> 422053442;
            break L1;
          }
        }
        L2: {
          this.field_eb = this.field_eb + var7;
          this.field_E = this.field_E - var7;
          if (0 < this.field_bb) {
            var7 = -(-this.field_bb >> -129267678);
            break L2;
          } else {
            var7 = this.field_bb >> 1114598658;
            break L2;
          }
        }
        L3: {
          this.field_gb = this.field_gb + var7;
          this.field_bb = this.field_bb - var7;
          if (0 >= this.field_Cb) {
            var7 = this.field_Cb >> 467926914;
            break L3;
          } else {
            var7 = -(-this.field_Cb >> -880480478);
            break L3;
          }
        }
        L4: {
          L5: {
            this.field_sb = this.field_qb + param5;
            param1 = param1 & this.field_pb;
            this.field_ib = param0 - -this.field_eb;
            this.field_Cb = this.field_Cb - var7;
            this.field_Db = this.field_Db + var7;
            var8 = qh.field_b;
            var9 = qh.field_c;
            var11 = 123 % ((28 - param4) / 34);
            var10 = qh.field_j;
            var12 = qh.field_g;
            qh.d(this.field_sb, this.field_ib, this.field_sb - -this.field_gb, this.field_Db + this.field_ib);
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
                          this.field_Hb = ua.field_o + -this.field_ib;
                          var13 = 1;
                          this.field_R = ne.field_s;
                          this.field_mb = lq.field_W - this.field_sb;
                          this.field_jb = ne.field_s;
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
              this.field_jb = 0;
              break L6;
            } else {
              break L6;
            }
          }
          this.field_R = 0;
          break L4;
        }
        L7: {
          if (0 != cd.field_b) {
            break L7;
          } else {
            this.field_jb = 0;
            break L7;
          }
        }
        L8: {
          L9: {
            stackIn_32_0 = this;

            if (cl.field_f) {
              break L9;
            } else {
              stackIn_32_0 = this;

              if (qh.field_b > wn.field_i) {
                break L9;
              } else {
                stackIn_32_0 = this;

                if (wn.field_i >= qh.field_j) {
                  break L9;
                } else {
                  stackIn_32_0 = this;

                  if (gg.field_f < qh.field_c) {
                    break L9;
                  } else {
                    stackIn_32_0 = this;

                    if (qh.field_g <= gg.field_f) {
                      break L9;
                    } else {
                      stackIn_33_0 = this;
                      stackIn_33_1 = 1;
                      break L8;
                    }
                  }
                }
              }
            }
          }
          stackIn_33_0 = this;
          stackIn_33_1 = 0;
          break L8;
        }
        L10: {
          L11: {
            ((vh) (this)).field_db = stackIn_33_1 != 0;
            stackIn_37_0 = this;

            if (!this.field_db) {
              break L11;
            } else {
              stackIn_37_0 = this;

              if (this.field_jb != cd.field_b) {
                break L11;
              } else {
                stackIn_37_0 = this;

                if (!param1) {
                  break L11;
                } else {
                  stackIn_38_0 = this;
                  stackIn_38_1 = 1;
                  break L10;
                }
              }
            }
          }
          stackIn_38_0 = this;
          stackIn_38_1 = 0;
          break L10;
        }
        L12: {
          ((vh) (this)).field_W = stackIn_38_1 != 0;
          if (this.field_T != null) {
            var14 = (vh) ((Object) this.field_T.a((byte) -127));
            L13: while (true) {
              if (var14 == null) {
                break L12;
              } else {
                var14.a(this.field_ib, param1, this.field_gb, this.field_Db, (byte) 63, this.field_sb);
                var14 = (vh) ((Object) this.field_T.b((byte) -46));
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
          if (!this.field_db) {
            break L15;
          } else {
            cl.field_f = true;
            break L15;
          }
        }
        L16: {
          qh.c(var8, var9, var10, var12);
          if (this.field_jb == 0) {
            break L16;
          } else {
            if (this.field_Jb) {
              L17: {
                this.field_qb = -param5 + (wn.field_i + -this.field_mb);
                this.field_eb = -param0 + (gg.field_f + -this.field_Hb);
                if (this.field_qb < 0) {
                  this.field_qb = 0;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (-1 < (this.field_eb ^ -1)) {
                  this.field_eb = 0;
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (param2 + -this.field_gb < this.field_qb) {
                  this.field_qb = param2 + -this.field_gb;
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                this.field_sb = param5 + this.field_qb;
                this.field_rb = 0;
                if (param3 + -this.field_Db < this.field_eb) {
                  this.field_eb = -this.field_Db + param3;
                  break L20;
                } else {
                  break L20;
                }
              }
              this.field_E = 0;
              this.field_ib = this.field_eb + param0;
              break L16;
            } else {
              break L16;
            }
          }
        }
    }

    vh(String param0, vh param1, int param2, int param3, int param4, int param5, String param6) {
        this(qo.a(112, (CharSequence) ((Object) param0)), param1, param2, param3, param4, param5, param6);
    }

    vh(String param0, vh param1) {
        this(qo.a(109, (CharSequence) ((Object) param0)), param1, 0, 0, 0, 0, (String) null);
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
            if (!(this.field_T != null)) {
                this.field_T = new ko();
            }
            this.field_T.b((byte) -83, param1);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "vh.MA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int b(boolean param0) {
        if (!param0) {
            return -108;
        }
        return this.a(-126, 2147483647);
    }

    final static dd a(int param0, di param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        dd stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 < -28) {
                break L1;
              } else {
                field_Ab = (hq) null;
                break L1;
              }
            }
            if (vj.a(param0, param1, param3, (byte) 121)) {
              stackIn_6_0 = aj.f((byte) 89);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("vh.IA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (dd) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    public vh() {
        this.field_H = -2147483648;
        this.field_lb = 256;
        this.field_pb = true;
        this.field_wb = -2147483648;
        this.field_K = -1;
        this.field_O = -2147483648;
        this.field_Bb = -1;
        this.field_vb = -2147483648;
        this.field_zb = -1;
        this.field_U = false;
        this.field_Z = -2147483648;
        this.field_Eb = 256;
        this.field_P = -1;
        this.field_Q = -2147483648;
        this.field_fb = false;
    }

    vh(long param0, vh param1, int param2, int param3, int param4, int param5, String param6) {
        this.field_H = -2147483648;
        this.field_lb = 256;
        this.field_pb = true;
        this.field_wb = -2147483648;
        this.field_K = -1;
        this.field_O = -2147483648;
        this.field_Bb = -1;
        this.field_vb = -2147483648;
        this.field_zb = -1;
        this.field_U = false;
        this.field_Z = -2147483648;
        this.field_Eb = 256;
        this.field_P = -1;
        this.field_Q = -2147483648;
        this.field_fb = false;
        try {
            this.field_c = param0;
            this.field_gb = param4;
            this.field_eb = param3;
            this.field_Db = param5;
            this.field_qb = param2;
            this.a((byte) -87, param1);
            if (param6 != null) {
                this.field_nb = param6;
            }
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "vh.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_S = "From <%0>: ";
    }
}
