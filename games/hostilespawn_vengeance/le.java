/*
 * Decompiled by CFR-JS 0.4.0.
 */
class le extends cf {
    private boolean field_C;
    String field_fb;
    int field_W;
    boolean field_B;
    static int field_D;
    int field_G;
    private int field_M;
    int field_sb;
    static bd field_xb;
    static ac field_ub;
    static int field_gb;
    private int field_O;
    int field_N;
    private bd[] field_V;
    private int field_U;
    private int field_ob;
    private int field_x;
    private bd field_P;
    int field_J;
    private bd field_cb;
    int field_L;
    int field_Q;
    bd field_pb;
    private int field_hb;
    vm field_ab;
    private bd[] field_Ab;
    static int field_eb;
    static int field_bb;
    private int field_w;
    int field_z;
    int field_zb;
    boolean field_S;
    private int field_E;
    boolean field_jb;
    private int field_wb;
    private String field_F;
    private int field_Z;
    private int field_kb;
    int field_X;
    bd[] field_Bb;
    boolean field_Db;
    int field_mb;
    vl field_I;
    boolean field_Eb;
    private boolean field_y;
    private int field_rb;
    private int field_db;
    private bd field_vb;
    private bd[] field_yb;
    private boolean field_Cb;
    private int field_H;
    private int field_A;
    bd[] field_nb;
    int field_R;
    int field_K;
    int field_qb;
    int field_ib;
    int field_T;
    int field_v;
    bd field_Y;
    private boolean field_lb;
    int field_tb;

    final void a(int param0, boolean param1) {
        int var3 = 44 / ((29 - param0) / 41);
        this.a(false, 0, param1, (byte) 82, true, si.field_e, false, 0, false, false, si.field_k);
    }

    final static void c(byte param0) {
        if (!(null == ag.field_t)) {
            ag.field_t.a(-98);
            ag.field_t = null;
        }
        if (param0 < 38) {
            field_ub = (ac) null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_X = 0;
        this.field_z = 0;
        int var6 = -67 / ((50 - param3) / 45);
        this.field_ib = 0;
        this.field_tb = param4;
        this.field_qb = param1;
        this.field_N = 0;
        this.field_zb = param0;
        this.field_sb = param2;
    }

    private final void a(int param0, int param1, int param2, boolean param3, byte param4, int param5) {
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        Object stackIn_40_0 = null;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        le var13;
        int var14;
        le var15;
        L0: {
          var14 = HostileSpawn.field_I ? 1 : 0;
          if (this.field_ib > 0) {
            var7 = -(-this.field_ib >> -862971454);
            break L0;
          } else {
            var7 = this.field_ib >> 718157282;
            break L0;
          }
        }
        L1: {
          this.field_ib = this.field_ib - var7;
          this.field_tb = this.field_tb + var7;
          if (0 < this.field_z) {
            var7 = -(-this.field_z >> 246720034);
            break L1;
          } else {
            var7 = this.field_z >> 275754498;
            break L1;
          }
        }
        L2: {
          this.field_z = this.field_z - var7;
          this.field_zb = this.field_zb + var7;
          if (this.field_X <= 0) {
            var7 = this.field_X >> -1417812030;
            break L2;
          } else {
            var7 = -(-this.field_X >> 1905627266);
            break L2;
          }
        }
        L3: {
          this.field_qb = this.field_qb + var7;
          this.field_X = this.field_X - var7;
          if (param4 == 48) {
            break L3;
          } else {
            var15 = (le) null;
            this.a((le) null, 87);
            break L3;
          }
        }
        L4: {
          if (-1 > (this.field_N ^ -1)) {
            var7 = -(-this.field_N >> 2124894978);
            break L4;
          } else {
            var7 = this.field_N >> 2099082242;
            break L4;
          }
        }
        L5: {
          L6: {
            this.field_mb = this.field_zb + param2;
            param3 = param3 & this.field_jb;
            this.field_K = this.field_tb + param0;
            this.field_sb = this.field_sb + var7;
            this.field_N = this.field_N - var7;
            var8 = si.field_b;
            var9 = si.field_j;
            var10 = si.field_l;
            var11 = si.field_a;
            si.f(this.field_K, this.field_mb, this.field_qb + this.field_K, this.field_sb + this.field_mb);
            var12 = 0;
            if (ob.field_n) {
              break L6;
            } else {
              if (!param3) {
                break L6;
              } else {
                if (pf.field_o == 0) {
                  break L6;
                } else {
                  if (si.field_b > ec.field_a) {
                    break L6;
                  } else {
                    if (si.field_l <= ec.field_a) {
                      break L6;
                    } else {
                      if (si.field_j > rc.field_b) {
                        break L6;
                      } else {
                        if (rc.field_b < si.field_a) {
                          var12 = 1;
                          this.field_E = -this.field_mb + rc.field_b;
                          this.field_wb = ec.field_a - this.field_K;
                          this.field_W = pf.field_o;
                          this.field_Q = pf.field_o;
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
          this.field_Q = 0;
          if (-1 != (pf.field_o ^ -1)) {
            this.field_W = 0;
            break L5;
          } else {
            break L5;
          }
        }
        L7: {
          if (0 == ig.field_L) {
            this.field_W = 0;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          L9: {
            stackIn_35_0 = this;

            if (wc.field_u) {
              break L9;
            } else {
              stackIn_35_0 = this;

              if (j.field_c < si.field_b) {
                break L9;
              } else {
                stackIn_35_0 = this;

                if (si.field_l <= j.field_c) {
                  break L9;
                } else {
                  stackIn_35_0 = this;

                  if (si.field_j > rb.field_m) {
                    break L9;
                  } else {
                    stackIn_35_0 = this;

                    if (rb.field_m >= si.field_a) {
                      break L9;
                    } else {
                      stackIn_36_0 = this;
                      stackIn_36_1 = 1;
                      break L8;
                    }
                  }
                }
              }
            }
          }
          stackIn_36_0 = this;
          stackIn_36_1 = 0;
          break L8;
        }
        L10: {
          L11: {
            ((le) (this)).field_Eb = stackIn_36_1 != 0;
            stackIn_40_0 = this;

            if (!this.field_Eb) {
              break L11;
            } else {
              stackIn_40_0 = this;

              if (ig.field_L != this.field_W) {
                break L11;
              } else {
                stackIn_40_0 = this;

                if (!param3) {
                  break L11;
                } else {
                  stackIn_41_0 = this;
                  stackIn_41_1 = 1;
                  break L10;
                }
              }
            }
          }
          stackIn_41_0 = this;
          stackIn_41_1 = 0;
          break L10;
        }
        L12: {
          ((le) (this)).field_S = stackIn_41_1 != 0;
          if (this.field_I != null) {
            var13 = (le) ((Object) this.field_I.b((byte) 117));
            L13: while (true) {
              if (var13 == null) {
                break L12;
              } else {
                var13.a(this.field_K, this.field_sb, this.field_mb, param3, (byte) 48, this.field_qb);
                var13 = (le) ((Object) this.field_I.a((byte) 110));
                continue L13;
              }
            }
          } else {
            break L12;
          }
        }
        L14: {
          if (!this.field_Eb) {
            break L14;
          } else {
            wc.field_u = true;
            break L14;
          }
        }
        L15: {
          if (var12 == 0) {
            break L15;
          } else {
            ob.field_n = true;
            break L15;
          }
        }
        L16: {
          si.d(var8, var9, var10, var11);
          if (this.field_W == 0) {
            break L16;
          } else {
            if (!this.field_Db) {
              break L16;
            } else {
              L17: {
                this.field_zb = -param2 + -this.field_E + rb.field_m;
                this.field_tb = j.field_c + (-this.field_wb + -param0);
                if ((this.field_tb ^ -1) > -1) {
                  this.field_tb = 0;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if ((this.field_zb ^ -1) <= -1) {
                  break L18;
                } else {
                  this.field_zb = 0;
                  break L18;
                }
              }
              L19: {
                if (this.field_tb <= -this.field_qb + param5) {
                  break L19;
                } else {
                  this.field_tb = -this.field_qb + param5;
                  break L19;
                }
              }
              L20: {
                this.field_K = param0 + this.field_tb;
                this.field_z = 0;
                this.field_ib = 0;
                if (this.field_zb <= -this.field_sb + param1) {
                  break L20;
                } else {
                  this.field_zb = param1 - this.field_sb;
                  break L20;
                }
              }
              this.field_mb = this.field_zb + param2;
              break L16;
            }
          }
        }
    }

    private final void a(boolean param0, int param1, boolean param2, byte param3, boolean param4, int param5, boolean param6, int param7, boolean param8, boolean param9, int param10) {
        int stackIn_4_0 = 0;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        bd[] var17;
        bd var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24_int;
        String var24;
        le var24_ref;
        int var25;
        int var26;
        String var27;
        L0: {
          var26 = HostileSpawn.field_I ? 1 : 0;
          this.field_mb = param1 + this.field_zb;
          this.field_K = param7 - -this.field_tb;
          var14 = -49 % ((param3 - -26) / 60);
          var12 = si.field_b;
          var13 = si.field_j;
          var15 = si.field_l;
          var16 = si.field_a;
          si.f(this.field_K, this.field_mb, this.field_K + this.field_qb, this.field_mb - -this.field_sb);
          if (this.field_y) {
            break L0;
          } else {
            L1: {
              param0 = this.field_S;
              if (this.field_W == 0) {
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L1;
              }
            }
            param9 = stackIn_4_0 != 0;
            param8 = this.field_Cb;
            break L0;
          }
        }
        L2: {
          param4 = param4 & this.field_jb;
          var17 = this.field_nb;
          var18 = this.field_Y;
          var19 = this.field_T;
          var20 = 0;
          var21 = 0;
          if (param4) {
            break L2;
          } else {
            L3: {
              if (null != this.field_yb) {
                var17 = this.field_yb;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (null == this.field_vb) {
                break L4;
              } else {
                var18 = this.field_vb;
                break L4;
              }
            }
            if (0 > this.field_H) {
              break L2;
            } else {
              var19 = this.field_H;
              break L2;
            }
          }
        }
        L5: {
          if (param0) {
            L6: {
              if (2147483647 != (this.field_O ^ -1)) {
                var20 = this.field_O;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (this.field_Z != -2147483648) {
                var21 = this.field_Z;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (this.field_pb == null) {
                break L8;
              } else {
                var18 = this.field_pb;
                break L8;
              }
            }
            L9: {
              if (null == this.field_Bb) {
                break L9;
              } else {
                var17 = this.field_Bb;
                break L9;
              }
            }
            if ((this.field_v ^ -1) <= -1) {
              var19 = this.field_v;
              break L5;
            } else {
              break L5;
            }
          } else {
            break L5;
          }
        }
        L10: {
          if (param9) {
            L11: {
              if (2147483647 == (this.field_x ^ -1)) {
                break L11;
              } else {
                var21 = this.field_x;
                break L11;
              }
            }
            L12: {
              if (-1 >= (this.field_A ^ -1)) {
                var19 = this.field_A;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (2147483647 != (this.field_kb ^ -1)) {
                var20 = this.field_kb;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (null != this.field_cb) {
                var18 = this.field_cb;
                break L14;
              } else {
                break L14;
              }
            }
            if (this.field_Ab != null) {
              var17 = this.field_Ab;
              break L10;
            } else {
              break L10;
            }
          } else {
            break L10;
          }
        }
        L15: {
          if (param8) {
            L16: {
              if (this.field_V == null) {
                break L16;
              } else {
                var17 = this.field_V;
                break L16;
              }
            }
            L17: {
              if (null != this.field_P) {
                var18 = this.field_P;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              if (2147483647 == (this.field_hb ^ -1)) {
                break L18;
              } else {
                var20 = this.field_hb;
                break L18;
              }
            }
            L19: {
              if (this.field_M != -2147483648) {
                var21 = this.field_M;
                break L19;
              } else {
                break L19;
              }
            }
            if (this.field_w >= 0) {
              var19 = this.field_w;
              break L15;
            } else {
              break L15;
            }
          } else {
            break L15;
          }
        }
        L20: {
          var22 = var20 + this.field_J;
          var23 = var21 + this.field_ob;
          if (!this.field_B) {
            hm.a(this.field_qb, var17, false, this.field_sb, this.field_mb, this.field_K);
            break L20;
          } else {
            hm.a(param5, var17, false, param10, param1, param7);
            break L20;
          }
        }
        L21: {
          if (var18 == null) {
            break L21;
          } else {
            L22: {
              var24_int = var22 + this.field_K;
              if (this.field_U == 1) {
                var24_int = var24_int + (this.field_qb - var18.field_u) / 2;
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              var25 = var23 + this.field_mb;
              if (-2 != (this.field_G ^ -1)) {
                break L23;
              } else {
                var25 = var25 + (this.field_sb + -var18.field_r) / 2;
                break L23;
              }
            }
            L24: {
              if (this.field_U == 2) {
                var24_int = var24_int + (this.field_qb + -var18.field_u);
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              if (this.field_G != 2) {
                break L25;
              } else {
                var25 = var25 + (-var18.field_r + this.field_sb);
                break L25;
              }
            }
            if (-257 < (this.field_db ^ -1)) {
              var18.b(var24_int, var25, this.field_db);
              break L21;
            } else {
              var18.e(var24_int, var25);
              break L21;
            }
          }
        }
        L26: {
          if (this.field_fb == null) {
            break L26;
          } else {
            if (this.field_ab == null) {
              break L26;
            } else {
              L27: {
                var27 = this.field_fb;
                var24 = var27;
                var24 = var27;
                var24 = var27;
                if (!param2) {
                  break L27;
                } else {
                  if (this.field_F == null) {
                    break L27;
                  } else {
                    var24 = var27 + this.field_F;
                    break L27;
                  }
                }
              }
              L28: {
                if (this.field_ab.a(var24) > -(2 * this.field_L) + this.field_qb) {
                  break L28;
                } else {
                  if (0 <= var24.indexOf("<br>")) {
                    break L28;
                  } else {
                    L29: {
                      if (-2 == (this.field_G ^ -1)) {
                        var23 = var23 + (-this.field_ab.field_y + (this.field_sb - this.field_ab.field_F)) / 2;
                        break L29;
                      } else {
                        if (-3 == (this.field_G ^ -1)) {
                          var23 = var23 + (-this.field_ab.field_y + this.field_sb - this.field_ab.field_F);
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                    }
                    if (0 != this.field_U) {
                      if ((this.field_U ^ -1) == -2) {
                        this.field_ab.a(var24, (this.field_qb + -(this.field_L * 2)) / 2 + var22 + (this.field_K - -this.field_L), var23 + this.field_mb + this.field_ab.field_y, var19, -1, this.field_rb);
                        break L26;
                      } else {
                        if (-3 == (this.field_U ^ -1)) {
                          this.field_ab.c(var24, this.field_K - (-this.field_L - var22 - -(this.field_L * 2)) + this.field_qb, this.field_mb + (var23 + this.field_ab.field_y), var19, -1, this.field_rb);
                          break L26;
                        } else {
                          this.field_ab.a(var24, var22 + (this.field_L + this.field_K), var23 + this.field_mb, this.field_qb + -(this.field_L * 2), this.field_sb, var19, -1, this.field_rb, this.field_U, this.field_G, this.field_R);
                          break L26;
                        }
                      }
                    } else {
                      this.field_ab.b(var24, var22 + this.field_K + this.field_L, this.field_ab.field_y + this.field_mb - -var23, var19, -1, this.field_rb);
                      break L26;
                    }
                  }
                }
              }
              this.field_ab.a(var24, this.field_K - -this.field_L - -var22, this.field_mb - -var23, this.field_qb - 2 * this.field_L, this.field_sb, var19, -1, this.field_rb, this.field_U, this.field_G, this.field_R);
              break L26;
            }
          }
        }
        L30: {
          if (this.field_I == null) {
            break L30;
          } else {
            var24_ref = (le) ((Object) this.field_I.g(-24));
            L31: while (true) {
              if (var24_ref == null) {
                break L30;
              } else {
                var24_ref.a(param0, var21 + this.field_mb, param2, (byte) -88, param4, this.field_qb, this.field_lb, this.field_K - -var20, param8, param9, this.field_sb);
                var24_ref = (le) ((Object) this.field_I.a(12684));
                continue L31;
              }
            }
          }
        }
        si.d(var12, var13, var15, var16);
    }

    public static void e(int param0) {
        field_xb = null;
        field_ub = null;
        if (param0 != -3354) {
            field_gb = 4;
        }
    }

    final void a(boolean param0, le param1) {
        try {
            if (this.field_I == null) {
                this.field_I = new vl();
            }
            if (param0) {
                this.a(true, false);
            }
            this.field_I.a(param1, 92);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "le.KA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(le param0, int param1) {
        Object stackIn_67_0 = null;
        Object stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        le var4 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                L2: {
                  if (null == param0.field_fb) {
                    break L2;
                  } else {
                    this.field_fb = param0.field_fb;
                    break L2;
                  }
                }
                L3: {
                  if (param0.field_yb == null) {
                    break L3;
                  } else {
                    this.field_yb = param0.field_yb;
                    break L3;
                  }
                }
                L4: {
                  if (param0.field_B) {
                    this.field_B = param0.field_B;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (null != param0.field_cb) {
                    this.field_cb = param0.field_cb;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (null == param0.field_Ab) {
                    break L6;
                  } else {
                    this.field_Ab = param0.field_Ab;
                    break L6;
                  }
                }
                L7: {
                  if (param0.field_H < 0) {
                    break L7;
                  } else {
                    this.field_H = param0.field_H;
                    break L7;
                  }
                }
                L8: {
                  if (-1 == (param0.field_L ^ -1)) {
                    break L8;
                  } else {
                    this.field_L = param0.field_L;
                    break L8;
                  }
                }
                L9: {
                  if (null == param0.field_ab) {
                    break L9;
                  } else {
                    this.field_ab = param0.field_ab;
                    break L9;
                  }
                }
                L10: {
                  if (null != param0.field_pb) {
                    this.field_pb = param0.field_pb;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (param0.field_F == null) {
                    break L11;
                  } else {
                    this.field_F = param0.field_F;
                    break L11;
                  }
                }
                L12: {
                  if (-1 < (param0.field_A ^ -1)) {
                    break L12;
                  } else {
                    this.field_A = param0.field_A;
                    break L12;
                  }
                }
                L13: {
                  if (null != param0.field_nb) {
                    this.field_nb = param0.field_nb;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (param0.field_V != null) {
                    this.field_V = param0.field_V;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (!param0.field_C) {
                    break L15;
                  } else {
                    this.field_C = param0.field_C;
                    break L15;
                  }
                }
                L16: {
                  if (param0.field_Cb) {
                    this.field_Cb = param0.field_Cb;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (null == param0.field_Bb) {
                    break L17;
                  } else {
                    this.field_Bb = param0.field_Bb;
                    break L17;
                  }
                }
                L18: {
                  if (null == param0.field_vb) {
                    break L18;
                  } else {
                    this.field_vb = param0.field_vb;
                    break L18;
                  }
                }
                L19: {
                  if (-1 != (param0.field_T ^ -1)) {
                    this.field_T = param0.field_T;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if (param0.field_R != 0) {
                    this.field_R = param0.field_R;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (0 > param0.field_w) {
                    break L21;
                  } else {
                    this.field_w = param0.field_w;
                    break L21;
                  }
                }
                L22: {
                  if (!param0.field_y) {
                    break L22;
                  } else {
                    this.field_y = param0.field_y;
                    break L22;
                  }
                }
                L23: {
                  if (param0.field_jb) {
                    break L23;
                  } else {
                    this.field_jb = param0.field_jb;
                    break L23;
                  }
                }
                L24: {
                  if (param0.field_P == null) {
                    break L24;
                  } else {
                    this.field_P = param0.field_P;
                    break L24;
                  }
                }
                L25: {
                  if (256 == param0.field_rb) {
                    break L25;
                  } else {
                    this.field_rb = param0.field_rb;
                    break L25;
                  }
                }
                L26: {
                  if ((param0.field_v ^ -1) > -1) {
                    break L26;
                  } else {
                    this.field_v = param0.field_v;
                    break L26;
                  }
                }
                L27: {
                  if (param0.field_Y != null) {
                    this.field_Y = param0.field_Y;
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L28: {
                  if (param0.field_O == -2147483648) {
                    break L28;
                  } else {
                    this.field_O = param0.field_O;
                    break L28;
                  }
                }
                L29: {
                  L30: {
                    stackIn_67_0 = this;

                    if (!this.field_C) {
                      break L30;
                    } else {
                      stackIn_67_0 = this;

                      if (!param0.field_lb) {
                        break L30;
                      } else {
                        stackIn_68_0 = this;
                        stackIn_68_1 = 1;
                        break L29;
                      }
                    }
                  }
                  stackIn_68_0 = this;
                  stackIn_68_1 = 0;
                  break L29;
                }
                L31: {
                  ((le) (this)).field_lb = stackIn_68_1 != 0;
                  if (0 != param0.field_ob) {
                    this.field_ob = param0.field_ob;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (0 != param0.field_G) {
                    this.field_G = param0.field_G;
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L33: {
                  if ((param0.field_kb ^ -1) != 2147483647) {
                    this.field_kb = param0.field_kb;
                    break L33;
                  } else {
                    break L33;
                  }
                }
                L34: {
                  if (0 != param0.field_U) {
                    this.field_U = param0.field_U;
                    break L34;
                  } else {
                    break L34;
                  }
                }
                L35: {
                  if (-2147483648 != param0.field_M) {
                    this.field_M = param0.field_M;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                L36: {
                  if (2147483647 == (param0.field_x ^ -1)) {
                    break L36;
                  } else {
                    this.field_x = param0.field_x;
                    break L36;
                  }
                }
                L37: {
                  if ((param0.field_Z ^ -1) == 2147483647) {
                    break L37;
                  } else {
                    this.field_Z = param0.field_Z;
                    break L37;
                  }
                }
                L38: {
                  if (param0.field_J != 0) {
                    this.field_J = param0.field_J;
                    break L38;
                  } else {
                    break L38;
                  }
                }
                L39: {
                  if (2147483647 != (param0.field_hb ^ -1)) {
                    this.field_hb = param0.field_hb;
                    break L39;
                  } else {
                    break L39;
                  }
                }
                if (!param0.field_Db) {
                  break L1;
                } else {
                  this.field_Db = param0.field_Db;
                  break L1;
                }
              }
            }
            L40: {
              if (param1 == 7957) {
                break L40;
              } else {
                var4 = (le) null;
                this.a(false, (le) null);
                break L40;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L41: {
            var3 = decompiledCaughtException;
            stackIn_100_0 = (RuntimeException) (var3);

            stackIn_100_1 = new StringBuilder().append("le.JA(");

            if (param0 == null) {
              stackIn_101_0 = (RuntimeException) ((Object) stackIn_100_0);
              stackIn_101_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackIn_101_2 = "null";
              break L41;
            } else {
              stackIn_101_0 = (RuntimeException) ((Object) stackIn_100_0);
              stackIn_101_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackIn_101_2 = "{...}";
              break L41;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_101_0), stackIn_101_2 + ',' + param1 + ')');
        }
    }

    le(long param0, le param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final void a(boolean param0, boolean param1) {
        wc.field_u = !param0 ? true : false;
        ob.field_n = !param0 ? true : false;
        this.a(0, si.field_k, 0, param1, (byte) 48, si.field_e);
    }

    private le(long param0, le param1, int param2, int param3, int param4, int param5, String param6) {
        this.field_M = -2147483648;
        this.field_hb = -2147483648;
        this.field_x = -2147483648;
        this.field_Z = -2147483648;
        this.field_jb = true;
        this.field_w = -1;
        this.field_kb = -2147483648;
        this.field_rb = 256;
        this.field_A = -1;
        this.field_C = false;
        this.field_O = -2147483648;
        this.field_db = 256;
        this.field_lb = false;
        this.field_H = -1;
        this.field_v = -1;
        try {
            this.field_tb = param2;
            this.field_sb = param5;
            this.field_zb = param3;
            this.field_qb = param4;
            this.field_c = param0;
            this.a(param1, 7957);
            if (param6 != null) {
                this.field_fb = param6;
            }
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "le.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_gb = 0;
    }
}
